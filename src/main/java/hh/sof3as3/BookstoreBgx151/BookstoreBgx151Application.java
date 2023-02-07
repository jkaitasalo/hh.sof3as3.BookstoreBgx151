package hh.sof3as3.BookstoreBgx151;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof3as3.BookstoreBgx151.domain.Book;
import hh.sof3as3.BookstoreBgx151.domain.BookRepository;

@SpringBootApplication
public class BookstoreBgx151Application {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBgx151Application.class, args);
	}

	@Bean
	public CommandLineRunner bookstoreData(BookRepository bookRepository) {
		return (args) -> {
			Book book1 = new Book("Jounin päiväkirja", "Jouni K.", "2022", "0-8471-3177-7", 999999.95);
			Book book2 = new Book("Jounin kokkikirja", "Jouni K.", "2023", "0-4310-0295-9", 39.95);
			bookRepository.save(book1);
			bookRepository.save(book2);
			
			List<Book> books = (List<Book>)bookRepository.findAll();
			for (Book book : books) {
				System.out.println(book.toString());
			}
		};
	}

}