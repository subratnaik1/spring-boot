package com.subrat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subrat.sbeans.BookBean;
import com.subrat.service.IBookService;

@Controller("controller")
public class BookController {
	@Autowired
	private IBookService iBookService;

	public String addBook(BookBean book) throws Exception {
		
		return iBookService.addBook(book);
	}
	public List<BookBean> retrieveAllBooks() throws Exception{
		return iBookService.retrieveAllBooks();
	}
	public String deleteBook(int bookId) throws Exception {
		
		return iBookService.deleteBook(bookId);
	}

	public String updateBook(BookBean book) throws Exception {
		return iBookService.updateBook(book);
	}
}
