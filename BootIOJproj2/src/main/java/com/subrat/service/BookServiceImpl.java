package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.repositary.IBookDAO;
import com.subrat.sbeans.BookBean;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookDAO IBookDAO;

	@Override
	public String addBook(BookBean book) throws Exception {

		int rowCount = IBookDAO.insertBook(book);
		return rowCount != 0 ? "SUCCESS: Book " + book.getTitle() + " Inserted" : " ERROR:NOT INSERTED ";

	}

	@Override
	public List<BookBean> retrieveAllBooks() throws Exception {

		return IBookDAO.getAllBooks();
	}

	@Override
	public String deleteBook(int bookId) throws Exception {
		int rowCount = IBookDAO.deleteBook(bookId);
		return rowCount != 0 ? "SUCCESS: Book  " + bookId + " deleted" : " ERROR:NOT deleted ";

	}

	@Override
	public String updateBook(BookBean book) throws Exception {
    int rowCount =IBookDAO.updateBook(book);
	return rowCount != 0 ? "SUCCESS: Book  " + book.getBookID() + " updated" : " ERROR:NOT updated";

	}

}
