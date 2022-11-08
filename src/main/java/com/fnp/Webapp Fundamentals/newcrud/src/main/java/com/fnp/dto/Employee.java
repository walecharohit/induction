package com.fnp.dto;

/**
 * The Employee Bean with getters and setters. 
 * @author Saransh vijay
 *
 */
public class Employee {

	private int id;
	private String name;
	private long phone;
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + phone + ", dept=" + dept + "]";
	}
}
