package com.StudentService.services;

import java.util.List;

import com.StudentService.entities.Student;



public interface StudentService {

    Student create(Student student);
    List<Student> get();
    Student getOne(Long id);
	List<Student> findStudentOfSchool(Long schoolId);

}
