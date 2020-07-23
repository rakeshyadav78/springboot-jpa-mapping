package com.rakesh.jpamap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rakesh.jpamap.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query(value = "select * from book", nativeQuery = true)
	List<Book> getAllBook();
}
