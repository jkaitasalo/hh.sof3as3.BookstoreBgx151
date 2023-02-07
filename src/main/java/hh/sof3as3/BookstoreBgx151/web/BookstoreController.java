package hh.sof3as3.BookstoreBgx151.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof3as3.BookstoreBgx151.domain.Book;
import hh.sof3as3.BookstoreBgx151.domain.BookRepository;

@Controller
public class BookstoreController {
	
	@Autowired
	BookRepository bookRepository;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getBooks(Model model) {
		List<Book> books = (List<Book>) bookRepository.findAll();
		model.addAttribute("books", books);
		return "booklist";
	}
	
	@RequestMapping(value="/newbook", method = RequestMethod.GET)
	public String getNewBookForm(Model model) {
		model.addAttribute("book", new Book());
		return "addbook";
	}
	
	@RequestMapping(value="/savebook", method = RequestMethod.GET)
	public String saveBook(@ModelAttribute Book book, Model model) {
		bookRepository.save(book);
		return "redirect:/books";
	}
}