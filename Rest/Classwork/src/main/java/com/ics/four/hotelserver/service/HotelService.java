package com.ics.four.hotelserver.service;

import com.ics.four.hotelserver.domain.Employee;
import com.ics.four.hotelserver.domain.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    Hotel createHotel(Hotel hotel);

    List<Hotel> findAll();

    List<Hotel> findByGroupId(Long id);

    Hotel createEmployee(Long id, Employee employee);
}
