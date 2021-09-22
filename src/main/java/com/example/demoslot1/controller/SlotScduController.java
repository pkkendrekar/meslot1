package com.example.demoslot1.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoslot1.entity.SlotScdu;
import com.example.demoslot1.repository.HospitalRepository;
import com.example.demoslot1.repository.SlotScduRepository;

@RestController//req
@RequestMapping("/slotscdu")
public class SlotScduController {
	@Autowired//depen
	private SlotScduRepository slotScduRepository;
	@Autowired
	private HospitalRepository hospitalrepository;
	
	@PostMapping 
	public ResponseEntity<?> create(@RequestBody SlotScdu slot){
		slot.setHospital(hospitalrepository.getById(slot.getHospital().getId()));
		return ResponseEntity.ok().body( slotScduRepository.save(slot));
	}
	
}
