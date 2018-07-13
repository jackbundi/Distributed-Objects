package com.ics.four.hotelserver.service;

import com.ics.four.hotelserver.domain.Employee;
import com.ics.four.hotelserver.domain.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);

    List<Hotel> findAll();

    List<Hotel> findByGroupId(Long id);

    Hotel createEmployee(Long id, Employee employee);
}
