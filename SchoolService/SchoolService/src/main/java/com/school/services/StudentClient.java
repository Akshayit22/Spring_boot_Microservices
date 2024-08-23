package com.school.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.school.entities.Student;

import java.util.List;


//@FeignClient(url = "http://localhost:8082",value = "Student-Client")
@FeignClient(name = "STUDENT-SERVICE")
public interface StudentClient {

    @GetMapping("/student/school/{SchoolId}")
    List<Student> getStudentOfSchool(@PathVariable Long SchoolId);
}
