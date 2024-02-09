package com.college.service;

import java.util.List;

import com.college.model.Staff;

public interface StaffService {

	List<Staff> getStaffById(int staff_id);

	

	void deleteStaffDataById(int staff_id);



	



	void UpdateStaffSalaryById(int staff_id, int salary);

}
