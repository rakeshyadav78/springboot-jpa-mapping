package com.rakesh.jpamap.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.rakesh.jpamap.entity.Book;
import com.rakesh.jpamap.entity.Student;

@JsonInclude(Include.NON_NULL)
public class Response {
	private List<Student> students;
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
