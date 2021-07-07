package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

@Entity
public class Student {
	@Id
	private int s_id;
	
	private String s_name;

	private Date admission_date;
	
	@ManyToOne()
	private Class classes;
	
	public Student() {
	
	}
	public Student(int s_id, String s_name, Date admission_date, Class classes) {
		
		this.s_id = s_id;
		this.s_name = s_name;
		this.admission_date = admission_date;
		this.classes = classes;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Date getAdmission_date() {
		return admission_date;
	}
	public void setAdmission_date(Date admission_date) {
		this.admission_date = admission_date;
	}
	public Class getClasses() {
		return classes;
	}
	public void setClasses(Class classes) {
		this.classes = classes;
	}
	
	

}
