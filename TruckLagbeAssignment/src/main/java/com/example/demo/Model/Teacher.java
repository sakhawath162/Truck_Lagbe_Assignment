package com.example.demo.Model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;


@Entity
public class Teacher {
	@Id
	private int t_id;
	@NotNull
	private String t_name;
	
	
	
	public Teacher(int t_id, String t_name, List<Class> classes) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.classes = classes;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<Class> classes;
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	
	
	
}
