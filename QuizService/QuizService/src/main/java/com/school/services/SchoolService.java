package com.school.services;

import java.util.List;

import com.school.entities.School;
import com.school.entities.SchoolStudentResp;

public interface SchoolService {

	School add(School school);

    List<School> get();

    School get(Long id);

	SchoolStudentResp findSchoolWithStudent(Long schoolId);

}
