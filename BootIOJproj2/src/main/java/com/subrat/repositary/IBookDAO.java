package com.subrat.repositary;


import java.util.List;

import com.subrat.sbeans.BookBean;

public interface IBookDAO {
	
	int insertBook(BookBean book) throws Exception;

	List<BookBean> getAllBooks() throws Exception;

	int deleteBook(int bookId)throws Exception;

	int updateBook(BookBean book)throws Exception;
}
