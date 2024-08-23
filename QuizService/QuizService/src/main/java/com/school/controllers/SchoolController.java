package com.school.controllers;

import com.school.entities.School;
import com.school.entities.SchoolStudentResp;
import com.school.services.SchoolService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
		this.schoolService = schoolService;
	}

    @PostMapping
    public School create(@RequestBody School school) {
        return schoolService.add(school);
    }


    @GetMapping
    public List<School> get() {
        return schoolService.get();
    }

    @GetMapping("/{id}")
    public School getOne(@PathVariable Long id) {
        return schoolService.get(id);
    }

    @GetMapping("/students/{schoolId}")
    public SchoolStudentResp getSchoolWithStudent(@PathVariable Long schoolId){
    	return schoolService.findSchoolWithStudent(schoolId);
    }
    

}
