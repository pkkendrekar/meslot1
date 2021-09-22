package com.example.demoslot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoslot1.entity.Bookedslot;

@Repository
public interface BookedslotRepository extends JpaRepository<Bookedslot, Integer> {

}
