package com.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.model.student;
import com.college.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<student> getSudentDetailsData(){
		return studentRepository.getStudentData();
	}
	@Override
	public List<student> findbyId(int student_id){
		return studentRepository.findStudentById(student_id);
	}
	@Override
	public void addStudentData(int student_id, String student_name, int department_id, int year, int percentage) {
		studentRepository.addData(student_id, student_name, department_id, year, percentage);
	}
	

	
	
	

}
