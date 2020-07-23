package com.rakesh.jpamap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.jpamap.dto.Response;
import com.rakesh.jpamap.entity.Book;
import com.rakesh.jpamap.entity.Student;
import com.rakesh.jpamap.service.BookService;

@RestController
@RequestMapping(value = "/book/")
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "saveBook", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Book saveBook(@RequestBody Book book) {
		Student student = book.getStudent();
		book.setStudent(student);
		return bookService.saveBook(book);
	}

	@RequestMapping(value = "getAllBook", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAllBook() {
		Response response = bookService.getAllBook();
		return response;
	}
}
