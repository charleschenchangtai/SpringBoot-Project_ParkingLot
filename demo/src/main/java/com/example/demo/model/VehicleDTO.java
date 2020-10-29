package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
//The annotation below is for generating table in the database
@Entity
public class VehicleDTO {
	//The annotation below is providing an identifier in database
	@Id
	private Long id;
	private String vehicleNumber;
	private String ownername;
}
