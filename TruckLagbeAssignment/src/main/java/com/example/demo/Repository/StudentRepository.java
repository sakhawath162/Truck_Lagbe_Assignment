package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;
import com.example.demo.Model.Teacher;



@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	@Query( "from Student s join s.classes c where c.class_id =:id")
	public List<Student> getStudent(@Param("id") int id);

}
