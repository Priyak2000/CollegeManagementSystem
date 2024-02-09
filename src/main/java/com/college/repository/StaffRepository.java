package com.college.repository;

import java.util.List;

import com.college.model.Staff;

public interface StaffRepository {

	

	List<Staff> findStaffById(int staff_id);

	void deleteStaffById(int staff_id);

	void updateStaffSalary(int staff_id, int salary);


	

	

	

}
