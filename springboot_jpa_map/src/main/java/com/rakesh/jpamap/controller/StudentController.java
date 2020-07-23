package com.rakesh.jpamap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.jpamap.dto.Response;
import com.rakesh.jpamap.entity.Student;
import com.rakesh.jpamap.service.StudentService;

@RestController
@RequestMapping(value = "/student/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "saveStudent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@RequestMapping(value = "getAllStudent", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAllStudent() {
		Response response = studentService.getAllStudent();
		return response;
	}
}
