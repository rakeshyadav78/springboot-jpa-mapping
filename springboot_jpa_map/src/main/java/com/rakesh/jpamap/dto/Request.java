package com.rakesh.jpamap.dto;

import java.util.List;

import javax.persistence.EnumType;

import com.rakesh.jpamap.entity.Employee;
import com.rakesh.jpamap.entity.Student;

public class Request {

	private String name;
	private List<Student> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setGender(Gender.Female);
		String gender=employee.getGender().toString();
		System.out.println(gender);
	}
}
