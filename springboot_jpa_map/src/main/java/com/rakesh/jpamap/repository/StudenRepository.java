package com.rakesh.jpamap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rakesh.jpamap.entity.Student;

@Repository
public interface StudenRepository extends JpaRepository<Student, Integer> {
//	@Query(value = "select * from student where name=:name", nativeQuery = true)
//	Student getByName(@Param("name") String name);

	@Query(value = "select * from student", nativeQuery = true)
	List<Student> getAllStudent();
}
