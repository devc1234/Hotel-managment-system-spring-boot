package com.example.demo.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Room;
import com.example.demo.repo.RoomRepository;

@Service
public class RoomService {

	@Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
    	return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Long id) {
    	return roomRepository.findById(id);
    }
    
    public Optional<Room> getRoomByRoomNumber(int roomNumber) {
    	return roomRepository.getRoomByRoomNumber(roomNumber);
    }

    public List<Room> getRoomsByHotelId(Long hotelId) {
        return roomRepository.findByHotelId(hotelId);
    }
    
    public void saveOrUpdateRoom(Room room) {
        roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
	
}