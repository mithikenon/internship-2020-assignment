package com.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Long>{

	@Query (value = "Select t from Teacher t where t.name like concat('%',concat(?1,'%'))"
			+ "and  t.phone like concat('%',concat(?2,'%'))"
			+ "and t.address like concat('%',concat(?3,'%'))")
	List<Teacher> searchTeacher(String name,String phone,String address);

}
