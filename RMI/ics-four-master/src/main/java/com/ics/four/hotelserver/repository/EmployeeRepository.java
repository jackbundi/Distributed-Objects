package com.ics.four.hotelserver.repository;

import com.ics.four.hotelserver.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
