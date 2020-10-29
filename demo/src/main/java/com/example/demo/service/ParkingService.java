package com.example.demo.service;

import java.util.List;

import com.example.demo.model.VehicleDTO;

//Providing the functions of this parking lot
public interface ParkingService {
	List<VehicleDTO> getAllVehicles();
	String park(VehicleDTO vehicledto);
	String unpark(Long id);
}
