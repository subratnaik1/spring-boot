package com.subrat.repositary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subrat.sbeans.BookBean;

@Repository("repo")
public class BookDAOImpl implements IBookDAO {
	public static final String insertBook = "insert into book values(?,?,?,?)";
	public static final String retriveBook = "select * from book";
	public static final String deleteBook = "delete from book where bookid=?";
	public static final String updateBook = "update book set title=?,author=?,price=? where bookid=?";
	@Autowired
	private DataSource ds;

	@Override
	public int insertBook(BookBean book) throws Exception {
		int rowCount = 0;
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(insertBook);
			pstmt.setInt(1, book.getBookID());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getBookID());

			rowCount = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return rowCount;
	}

	@Override
	public List<BookBean> getAllBooks() throws Exception {
		List<BookBean> list = new ArrayList<>();
		BookBean b = new BookBean();
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(retriveBook);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				b.setBookID(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setAuthor(rs.getString(3));
				b.setPrice(rs.getDouble(4));

				list.add(b);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteBook(int bookId) throws SQLException {
		int rowCount = 0;
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(deleteBook);
			pstmt.setInt(1, bookId);

			rowCount = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	@Override
	public int updateBook(BookBean book) throws SQLException {
		int rowCount = 0;
		
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(updateBook);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getBookID());
			pstmt.setInt(4, book.getBookID());
			
			rowCount = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}

}
