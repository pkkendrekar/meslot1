package com.example.demoslot1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookedslot")
public class Bookedslot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;//bid
	//  @Many bs ---->user bcoz instance variable we are mapping with user
	// many bs one user
	//userid is fk
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
    //bs---->slot scdu 
	//slotid fk
	@ManyToOne
	@JoinColumn(name="slot_id")
	private SlotScdu slotId;

}
