package com.csrepo.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csrepo.spring.model.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Book book) {
		sessionFactory.getCurrentSession().save(book);
		return book.getId();
	}

	@Override
	public Book get(long id) {
		Book book = sessionFactory.getCurrentSession().get(Book.class, id);
		return book;
	}

	@Override
	public List<Book> list() {
		List<Book> listBooks = sessionFactory.getCurrentSession().createQuery("from Book").list();
		return listBooks;
	}

	@Override
	public void update(long id, Book book) {
		Session session = sessionFactory.getCurrentSession();
		Book oldbook = session.byId(Book.class).load(id);
		oldbook.setTitle(book.getTitle());
		oldbook.setAuthor(book.getAuthor());
		session.flush();
	}

	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = session.byId(Book.class).load(id);
		session.delete(book);

	}

}
