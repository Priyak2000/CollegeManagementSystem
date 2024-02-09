package com.college.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.college.dto.response.Studentdto;
import com.college.model.student;


@Repository
public class StudentRepositoryImp implements StudentRepository  {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<student> getStudentData() {
		String sqlQuery = "SELECT * FROM student";
		List<student> response = jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper(student.class));
		return response;

}
	@Override
	public List<student> findStudentById(int student_id) {
	    String sqlQuery = "SELECT * FROM student WHERE student_id=?";
	    List<student> responseById = jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper<>(student.class), student_id);
	    return responseById;
	}
	
	@Override
	public void addData(int student_id, String student_name, int department_id, int year, int percentage) {
        String sqlQuery = "INSERT INTO student (student_id, student_name, department_id, year, percentage) VALUES (?, ?, ?, ?, ?)";
        
        jdbcTemplate.update(sqlQuery, student_id, student_name, department_id, year, percentage);
    }

	}

	
	


