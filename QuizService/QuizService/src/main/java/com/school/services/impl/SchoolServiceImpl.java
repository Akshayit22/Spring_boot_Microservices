package com.school.services.impl;

import com.school.entities.School;
import com.school.entities.SchoolStudentResp;
import com.school.entities.Student;
import com.school.repositories.SchoolRepository;
import com.school.services.SchoolService;
import com.school.services.StudentClient;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	private SchoolRepository schoolRepository;
	
	private StudentClient studentClient;

	public SchoolServiceImpl(SchoolRepository schoolRepository, StudentClient studentClient) {
		super();
		this.schoolRepository = schoolRepository;
		this.studentClient = studentClient;
	}

	@Override
	public School add(School school) {
		return schoolRepository.save(school);
	}

	@Override
	public List<School> get() {
		return schoolRepository.findAll();
	}

	@Override
	public School get(Long id) {
		try {
			return schoolRepository.findById(id).orElseThrow(()-> new Exception("Not found.."));
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public SchoolStudentResp findSchoolWithStudent(Long schoolId) {
		System.out.println("findSchoolWithStudent...");
		List<Student> studentList = studentClient.getStudentOfSchool(schoolId);
		
		SchoolStudentResp schoolStudentResp = new SchoolStudentResp();
		schoolStudentResp.setName(this.get(schoolId).getName());
		schoolStudentResp.setEmail(this.get(schoolId).getEmail());
		schoolStudentResp.setStudentList(studentList);
		
		return schoolStudentResp;
	}

	


    
}
