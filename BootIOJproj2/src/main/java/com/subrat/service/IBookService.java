package com.subrat.service;

import java.util.List;

import com.subrat.sbeans.BookBean;

public interface IBookService {
	String addBook(BookBean book) throws Exception;
	List<BookBean> retrieveAllBooks()throws Exception;
	String deleteBook(int bookId)throws Exception;
	String updateBook(BookBean book)throws Exception;
}
