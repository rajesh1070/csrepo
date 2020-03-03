package com.csrepo.spring.dao;

import java.util.List;

import com.csrepo.spring.model.Book;

public interface BookDao {

	//Save the record
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
