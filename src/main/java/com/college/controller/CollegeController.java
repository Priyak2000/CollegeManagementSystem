package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Staff;
import com.college.model.student;
import com.college.service.StaffService;
import com.college.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class CollegeController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private StaffService staffService;
	
	//get all the student details
	@GetMapping("/studentDetails")
	public List<student> studentResponse(){
		return studentService.getSudentDetailsData();
	}
	
	
	//Get the Student by Id
	@GetMapping("/findbyId/{Id}")
	public List<student> getStudentById(@PathVariable("Id") int student_id){
	    return studentService.findbyId(student_id);
	}
	
	
	//Post the data into student table
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody student st) {
		studentService.addStudentData(st.getStudent_id(), st.getStudent_name(), st.getDepartment_id(), st.getYear(), st.getPercentage());
	}
	
	//Get staff details by Id
	
	@GetMapping("/staff/{Id}")
	public List<Staff> GetStaffById(@PathVariable("Id") int staff_id){
		return staffService.getStaffById(staff_id);
	}
	
	//Delete staff details by Id
	
	@DeleteMapping("/staff/deleteById/{Id}")
	public void DeleteStaffById(@PathVariable("Id") int staff_id) {
		staffService.deleteStaffDataById(staff_id);
	}
	
	// Update Staffs salary
	@PutMapping("/staff/UpdateStaff/{id}")
	public void updateSalary(@PathVariable("id") int staffId, @RequestParam("salary") int staffSalary) {
	    staffService.UpdateStaffSalaryById(staffId, staffSalary);
	}
	
	

}
