package com.school.entities;

import java.util.List;

public class SchoolStudentResp {
    
    private String name;
    
    private String email;
    
    List<Student> studentList;

	public SchoolStudentResp() {
		
	}

	public SchoolStudentResp(String name, String email, List<Student> studentList) {
		super();
		this.name = name;
		this.email = email;
		this.studentList = studentList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
    
	
    
	
}
