package com.example.demoslot1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hospital")
public class Hospital {
	@Id  //pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto generated
	private Integer id;
	@Column
	private String name;
	@Column
	private boolean paid;   
	// one hospital  can have many slotscdu
	@OneToMany (fetch=FetchType.LAZY,mappedBy = "hospital")
//	@JoinColumn (name="slot_id")
	private List<SlotScdu> slots;
	//slot is fk
	//@ManyToMany
	//many  hospital can have many user???
	// one hospital can have many user
	//private User userid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public List<SlotScdu> getSlots() {
		return slots;
	}
	public void setSlots(List<SlotScdu> slots) {
		this.slots = slots;
	}
	
}
