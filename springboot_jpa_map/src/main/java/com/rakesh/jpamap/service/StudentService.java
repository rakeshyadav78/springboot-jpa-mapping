package com.rakesh.jpamap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.jpamap.dto.Request;
import com.rakesh.jpamap.dto.Response;
import com.rakesh.jpamap.entity.Student;
import com.rakesh.jpamap.repository.StudenRepository;

@Service
public class StudentService {

	@Autowired
	private StudenRepository studenRepository;

	/**
	 * @return
	 * Fetches list of all student exists in student table along with associated entity.
	 */
	public Response getAllStudent() {
		Response response = new Response();
		List<Student> students = studenRepository.findAll();
		response.setStudents(students);
		return response;
	}

	public Student saveStudent(Student student) {
		return studenRepository.save(student);
	}
}
