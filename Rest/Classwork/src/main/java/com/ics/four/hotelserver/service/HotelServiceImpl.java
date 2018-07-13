package com.ics.four.hotelserver.service;

import com.ics.four.hotelserver.domain.Employee;
import com.ics.four.hotelserver.domain.Group;
import com.ics.four.hotelserver.domain.Hotel;
import com.ics.four.hotelserver.repository.EmployeeRepository;
import com.ics.four.hotelserver.repository.GroupRepository;
import com.ics.four.hotelserver.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    private final EmployeeRepository employeeRepository;
    private final GroupRepository groupRepository;

    public HotelServiceImpl(HotelRepository hotelRepository, EmployeeRepository employeeRepository,
                            GroupRepository groupRepository) {
        this.hotelRepository = hotelRepository;
        this.employeeRepository = employeeRepository;
        this.groupRepository = groupRepository;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        Group group = createGroup(hotel.getGroup());
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> findByGroupId(Long id) {
        return hotelRepository.findByGroupId(id);
    }

    @Override
    public Hotel createEmployee(Long id, Employee employee) {
        Employee employees = createEmployees(employee);
        Hotel hotel = hotelRepository.findById(id).get();
        if(hotel!=null)
            hotel.addEmployee(employee);
        return hotelRepository.save(hotel);
    }

    private Employee createEmployees(Employee employees){
        return employeeRepository.save(employees);
    }

    private Group createGroup(Group group){
        return groupRepository.save(group);
    }
}
