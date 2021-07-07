package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.TeacherRepository;

@Service
public class ServiceImplementation implements SchoolService {
	@Autowired
	private StudentRepository sp;
	private TeacherRepository tp;

	@Override
	public void save(Student student) {
		sp.save(student);
		
	}

	@Override
	public void save(Teacher teacher) {
		tp.save(teacher);
		
	}

	@Override
	public void deleteStudent(int id) {
		sp.deleteById(id);
		
	}

	@Override
	public Student getStudentById(int id) {
		return sp.getById(id);
	}
	
	

}
