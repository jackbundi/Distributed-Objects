package com.ics.four.hotelserver;

//import com.ics.four.client.TestService;

import com.ics.four.hotelserver.domain.Employee;
import com.ics.four.hotelserver.domain.Group;
import com.ics.four.hotelserver.domain.Hotel;
import com.ics.four.hotelserver.repository.EmployeeRepository;
import com.ics.four.hotelserver.service.HotelService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DummyDataHotel implements CommandLineRunner {
private final HotelService hotelService;
private final EmployeeRepository employeeRepository;

    public DummyDataHotel( HotelService hotelService, EmployeeRepository employeeRepository) {
        this.hotelService = hotelService;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        hotelService.createHotel(new Hotel("Sankara Hotel",
                employeeRepository.saveAll(Arrays.asList(new Employee("Elphas"), new Employee("Monica"))),
                new Group("Kifaru")
        ));
    }
}
