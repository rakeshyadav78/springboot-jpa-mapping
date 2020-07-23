package com.rakesh.jpamap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.jpamap.dto.Response;
import com.rakesh.jpamap.entity.Book;
import com.rakesh.jpamap.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	/**
	 * Fetches list of all Books from book table aloong with its parent entity.
	 */
	public Response getAllBook() {

		Response response = new Response();
		List<Book> books = bookRepository.getAllBook();
		response.setBooks(books);
		return response;
	}
}
