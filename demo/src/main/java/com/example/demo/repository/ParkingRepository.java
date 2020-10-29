package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.VehicleDTO;

//The annotation below identifying the class as a Bean, and encapsulate the data access exception thrown in the marked class as Spring's data access exception type.
@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO,Long>{

}
