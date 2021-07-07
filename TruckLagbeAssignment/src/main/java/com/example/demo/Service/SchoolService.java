package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;

@Service
public interface SchoolService {
	 void save(Student student);
	 void save(Teacher teacher);
	 void deleteStudent(int id);
	 Student getStudentById(int id);
}
