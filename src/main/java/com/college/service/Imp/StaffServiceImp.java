package com.college.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.model.Staff;
import com.college.repository.StaffRepository;
import com.college.service.StaffService;

@Service
public class StaffServiceImp implements StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public List<Staff> getStaffById(int staff_id){
		return staffRepository.findStaffById(staff_id);
	}
	
	@Override
	public void deleteStaffDataById(int staff_id) {
		staffRepository.deleteStaffById(staff_id);
	}
	
	@Override
	public void UpdateStaffSalaryById(int staff_id, int salary) {
		staffRepository.updateStaffSalary(staff_id, salary);
	}

}
