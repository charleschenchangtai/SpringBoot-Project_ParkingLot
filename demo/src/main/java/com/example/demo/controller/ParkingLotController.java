package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MyIntroduction;
import com.example.demo.model.VehicleDTO;
import com.example.demo.service.ParkingService;

 

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	//In Spring Boot,we don't really generate a object like we do in Java 
	@Autowired
	ParkingService parkingService;
	
	/*
	 * @GetMapping("/aboutme") public MyIntroduction aboutme() { return
	 * MyIntroduction.builder().name("ChangTai").age(41).
	 * skills("Java and Spring Boot").build(); }
	 * 
	 * @PostMapping("/infoAboutSomeOne") public MyIntroduction
	 * infoAboutSomeOne(String name,int age,String skills) { return
	 * MyIntroduction.builder().name(name).age(age).skills(skills).build(); }
	 */
	
	@GetMapping("/parkingInfo")
	public List<VehicleDTO> getAllVehicleDTOs(){
		return parkingService.getAllVehicles();		
	}
	@PostMapping("/park")
	public String park(VehicleDTO vehicleDTO) {
		return parkingService.park(vehicleDTO);		
	}
	@DeleteMapping("/unpark")
	public String unpark(Long id) {
		return parkingService.unpark(id);
	}
}
