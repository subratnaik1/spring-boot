package com.subrat;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subrat.controller.BookController;
import com.subrat.sbeans.BookBean;

@SpringBootApplication
public class BootIoJproj2Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIoJproj2Application.class, args);
		IO.println("enter your choice");
		IO.println("1>add book");
		IO.println("2>retrive books");
		IO.println("3>delete books");
		IO.println("4>update book");
		int choice = Integer.parseInt(IO.readln());
		BookController controller = ctx.getBean(BookController.class);
		switch (choice) {
		case 1 -> {
			int bookid = Integer.parseInt(IO.readln("enter book id"));
			String title = IO.readln("enter book title");
			String author = IO.readln("enter book author");
			double price = Double.parseDouble(IO.readln("enter price of book"));

			BookBean book = new BookBean();
			book.setBookID(bookid);
			book.setTitle(title);
			book.setAuthor(author);
			book.setPrice(price);

			IO.println(controller.addBook(book));
		}
		case 2 -> {
			List<BookBean> allBooks = controller.retrieveAllBooks();
			allBooks.forEach(b -> {
				IO.println(b.getBookID() + " " + b.getTitle() + " " + b.getAuthor() + " " + b.getPrice());
			});
		}
		case 3 -> {
			int bookid = Integer.parseInt(IO.readln("enter book id"));
			IO.println(controller.deleteBook(bookid));

		}
		case 4 -> {
			int bookid = Integer.parseInt(IO.readln("enter new book id"));
			String title = IO.readln("enter new  book title");
			String author = IO.readln("enter new book author");
			double price = Double.parseDouble(IO.readln("enter new price of book"));
			
			BookBean book = new BookBean();
			book.setBookID(bookid);
			book.setTitle(title);
			book.setAuthor(author);
			book.setPrice(price);
			
			IO.println(controller.updateBook(book));
		}
		}
	}

}
