package com.College.StudentManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
	private long stuId;
	private String stuName;
	private String stuEmailId;
	private String stuMobile;
	private String stuDepartment;
	private String stuCity;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long stuId, String stuName, String stuEmailId, String stuMobile, String stuDepartment,
			String stuCity) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuEmailId = stuEmailId;
		this.stuMobile = stuMobile;
		this.stuDepartment = stuDepartment;
		this.stuCity = stuCity;
	}

	public long getStuId() {
		return stuId;
	}

	public void setStuId(long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuEmailId() {
		return stuEmailId;
	}

	public void setStuEmailId(String stuEmailId) {
		this.stuEmailId = stuEmailId;
	}

	public String getStuMobile() {
		return stuMobile;
	}

	public void setStuMobile(String stuMobile) {
		this.stuMobile = stuMobile;
	}

	public String getStuDepartment() {
		return stuDepartment;
	}

	public void setStuDepartment(String stuDepartment) {
		this.stuDepartment = stuDepartment;
	}

	public String getStuCity() {
		return stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

}
