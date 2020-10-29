package com.example.demo.serviceImpl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VehicleDTO;
import com.example.demo.repository.ParkingRepository;
import com.example.demo.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService{
	
	//This annotation looks like generate a object in Java 
	@Autowired
	ParkingRepository parkingRepository;
	@Override
	public List<VehicleDTO> getAllVehicles() {
		return parkingRepository.findAll();
	}

	@Override
	public String park(VehicleDTO vehicleDTO) {
		if(vehicleDTO.getId()>0 && vehicleDTO.getId()<=10) {
			//List all vehicles in parking lot
			List<VehicleDTO> vehicles=parkingRepository.findAll();
			for(VehicleDTO vehicle:vehicles) {
				//if the new entered car is not belong to one of parked car
				if(vehicle.getId()!=vehicleDTO.getId()) {
					//save it in the H2 database
					parkingRepository.save(vehicle);
				}
			}
		}
		else {
			throw new RuntimeException("Kindly provide a id between 1 to 10");
		}
		return "Parked";
	}

	@Override
	public String unpark(Long id) {
		 if(id>0&&id<=10) {
			 //Delete the ID in H2 database
			 parkingRepository.deleteById(id);
		 }
		 else {
			 throw new RuntimeException("Kindly provide a id between 1 to 10");
		 }
		return "Unpacked vehicle at slot number"+id;
	}
	
}
