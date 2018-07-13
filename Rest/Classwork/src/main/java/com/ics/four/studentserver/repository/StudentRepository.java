package com.ics.four.studentserver.repository;

import com.ics.four.studentserver.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
     List<Student> findByFirstNameContainingIgnoreCase(String searchString);
}
