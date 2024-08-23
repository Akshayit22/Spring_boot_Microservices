package com.StudentService.controllers;

import com.StudentService.entities.Student;
import com.StudentService.services.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class StudentController {

    private StudentService studentService;
    
    public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
    
    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student ) {
    	System.out.println(student.toString());
    	return student.toString();
    }

    //    create
    @PostMapping("/student")
    public Student create(@RequestBody Student student) {
    	System.out.println(student.toString());
        return studentService.create(student);
    }

    //    get all
    @GetMapping("/student")
    public List<Student> getAll() {
        return studentService.get();
    }

    @GetMapping("/student/{studentId}")
    public Student getAll(@PathVariable Long studentId) {
        return studentService.getOne(studentId);
    }
    
    @GetMapping("/student/school/{SchoolId}")
    List<Student> getStudentOfSchool(@PathVariable Long SchoolId){
    	return studentService.findStudentOfSchool(SchoolId);
    }
    
    @GetMapping("/")
    public String healthcheck() {
    	return "Health-check : OK";
    }


}
