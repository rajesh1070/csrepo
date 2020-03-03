package com.csrepo.spring.service;

import java.util.List;

import com.csrepo.spring.model.Book;

public interface BookService {

	long save(Book book);

	//Get a single record
	Book get(long id);
	
	//Get all the records
	List<Book> list();
	
	//Update the record
	void update(long id, Book book);
	
	
	//delete a record
	void delete(long id);
	
}
