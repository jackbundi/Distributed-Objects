package com.ics.four.client;

import com.ics.four.studentserver.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "test" ,url = "GOOGLE.COM")
public interface TestService {
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    List<Student> testClient();

    @RequestMapping(value = "students", method = RequestMethod.POST)
    Student createStudent(@RequestBody  Student student);
}
