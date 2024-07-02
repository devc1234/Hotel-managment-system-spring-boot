package com.example.demo.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;
import com.example.demo.repo.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}
	
	public Optional<Hotel> getHotelById(Long id) {
		return hotelRepository.findById(id);
	}
	
	public List<Hotel> getHotelsByCity(String city) {
		return hotelRepository.getHotelsByCity(city);
	}
	
	public void saveOrUpdateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
    	hotelRepository.deleteById(id);
    }

}