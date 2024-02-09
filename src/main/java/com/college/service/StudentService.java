package com.college.service;

import java.util.List;


import com.college.model.student;

public interface StudentService {

	List<student> getSudentDetailsData();

	

	List<student> findbyId(int student_id);



	void addStudentData(int student_id, String student_name, int department_id, int year, int percentage);



	
	

}
