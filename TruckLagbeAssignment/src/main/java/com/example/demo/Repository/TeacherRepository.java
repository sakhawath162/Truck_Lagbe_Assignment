package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
	
	@Query("Select t from Teacher t join t.classes c where c.class_id =:id")
	public List<Teacher> getTeacher(@Param("id") int id);

}
