package com.ics.four.hotelserver.controller;

import com.ics.four.hotelserver.domain.Employee;
import com.ics.four.hotelserver.domain.Hotel;
import com.ics.four.hotelserver.service.HotelService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {

        this.hotelService = hotelService;
    }

    @PostMapping
    public Hotel createHotel(
            @Validated(Hotel.ValidateHotel.class)
            @RequestBody Hotel hotel){
        return hotelService.createHotel(hotel);
    }

    @GetMapping
    public List<Hotel> getAllHotels(){
        return hotelService.findAll();
    }

    @GetMapping(value = "{id}")
    public List<Hotel> getHotelByGroup(@PathVariable Long id){

        return hotelService.findByGroupId(id);
    }

    @PostMapping(value = "{id}/employees")
    public Hotel createHotel(@PathVariable Long id,
                             @RequestBody Employee employee){
        return hotelService.createEmployee(id, employee);
    }



}
