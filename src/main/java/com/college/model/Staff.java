package com.college.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Staff {
	
	@Id
	private int staff_id;
	private String staff_name;
	private int department_id;
	private int experience;
	private int salary;
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", staff_name=" + staff_name + ", department_id=" + department_id
				+ ", experience=" + experience + ", salary=" + salary + "]";
	}
	public Staff(int staff_id, String staff_name, int department_id, int experience, int salary) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.department_id = department_id;
		this.experience = experience;
		this.salary = salary;
	}
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
