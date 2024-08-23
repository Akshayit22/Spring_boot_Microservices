package com.StudentService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentService.entities.Student;
import java.util.List;




public interface StudentRepository extends JpaRepository<Student,Long> {
	
	List<Student> findBySchoolId(Long schoolId);
}
