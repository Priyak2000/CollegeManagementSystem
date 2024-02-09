package com.college.repository;

import java.util.List;

import com.college.dto.response.Studentdto;
import com.college.model.student;

public interface StudentRepository {

	List<student> getStudentData();

	List<student> findStudentById(int student_id);

	void addData(int student_id, String student_name, int department_id, int year, int percentage);

	


	
	

	

	
	

}
