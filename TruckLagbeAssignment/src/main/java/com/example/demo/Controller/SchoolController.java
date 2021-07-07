package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.TeacherRepository;
import com.example.demo.Service.ServiceImplementation;
import com.google.gson.Gson;

@RestController
public class SchoolController {
	//@Autowired
	//Teacher teacher;
	//@Autowired
	//Student student;
	@Autowired
	 ServiceImplementation si;
	@Autowired
	StudentRepository sp;
	@Autowired
	TeacherRepository tp;
	
	@PostMapping("/save")
	public void add(@RequestBody Student student ) {
		System.out.println("hello");
		//Gson gson = new Gson();
		//if(type.equals("Student")) {
			//student = gson.fromJson(json, Student.class);
			si.save(student);
		//}//else if(type.equals("Teacher")) {
			//teacher = gson.fromJson(json, Teacher.class);
			//tp.save(teacher);
		//}
		
	}
	
	@GetMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		si.deleteStudent(id);
	}
	
	@GetMapping("/update/{id}")
	public void updateStudent(@PathVariable("id") int id,Model model) {
	     Student student = si.getStudentById(id);
	     model.addAttribute(student);
	}
	
	//@GetMapping("/retrieveStudentAndTeacherofClass")
	//public void getAllStudentAndTeacher(@PathVariable("id") int id) {
	//	List<Student> studentList = sp.getStudent(id);
		//List<Teacher> teacherList = tp.getTeacher(id);
	//}
	
	
	
}
