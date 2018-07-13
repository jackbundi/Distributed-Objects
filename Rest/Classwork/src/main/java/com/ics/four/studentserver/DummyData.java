package com.ics.four.studentserver;

//import com.ics.four.client.TestService;
import com.ics.four.hotelserver.domain.Employee;
import com.ics.four.hotelserver.domain.Group;
import com.ics.four.hotelserver.domain.Hotel;
import com.ics.four.studentserver.domain.Student;
import com.ics.four.hotelserver.service.HotelService;
import com.ics.four.studentserver.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DummyData implements CommandLineRunner {
    private  final StudentRepository studentRepository;

    public DummyData(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student("John", "Snow"));
        studentRepository.save(new Student("Calvin", "Claim"));
        studentRepository.save(new Student("Wasike", "Noah"));

//        testService.testClient();
    }
}
