package com.StudentService.services.impl;

import com.StudentService.entities.Student;
import com.StudentService.repositories.StudentRepository;
import com.StudentService.services.StudentService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student create(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> get() {
		return studentRepository.findAll();
	}

	@Override
	public Student getOne(Long id) {
		try {
			return studentRepository.findById(id).orElseThrow(()-> new Exception("No data found.") );
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Student> findStudentOfSchool(Long schoolId) {
		return studentRepository.findBySchoolId(schoolId);
	}

}
