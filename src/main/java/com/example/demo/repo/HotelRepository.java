package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
	List<Hotel> getHotelsByCity(String city);

}