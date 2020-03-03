package com.csrepo.spring.service;	

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csrepo.spring.dao.BookDao;
import com.csrepo.spring.model.Book;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	@Transactional
	public long save(Book book) {
			return bookDao.save(book);
	}

	@Override
	@Transactional
	public Book get(long id) {
		
		return bookDao.get(id);
	}

	@Override
	@Transactional
	public List<Book> list() {
		
		return bookDao.list();
	}

	@Override
	@Transactional
	public void update(long id, Book book) {
		bookDao.update(id, book);

	}

	@Override
	@Transactional
	public void delete(long id) {
		bookDao.delete(id);

	}

}
