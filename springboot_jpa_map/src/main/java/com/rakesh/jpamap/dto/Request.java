package com.rakesh.jpamap.dto;

import java.util.List;

import com.rakesh.jpamap.entity.Customer;
import com.rakesh.jpamap.entity.Student;

public class Request {

	private String name;
	private List<Student> students;
	private Customer customer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
