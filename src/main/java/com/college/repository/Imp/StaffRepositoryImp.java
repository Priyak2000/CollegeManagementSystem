package com.college.repository.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.college.model.Staff;
import com.college.repository.StaffRepository;

@Repository
public class StaffRepositoryImp implements StaffRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Staff> findStaffById(int staff_id){
		String sqlQuery= "Select * from staff where staff_id=?";
		return jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper<>(Staff.class), staff_id);
		
	}
	
	   @Override
	    public void deleteStaffById(int staff_id) {
	        String sqlQuery = "DELETE FROM staff WHERE staff_id = ?";
	        jdbcTemplate.update(sqlQuery, staff_id);
	    }
	   @Override
	   public void updateStaffSalary(int staff_id, int newStaffSalary) {
	       String sqlQuery = "UPDATE staff SET salary = ? WHERE staff_id = ?";
	       jdbcTemplate.update(sqlQuery, newStaffSalary, staff_id);
	   }


	

}
