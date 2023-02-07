package hh.sof3as3.BookstoreBgx151.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookstoreController {

	@GetMapping("/index")
	public String BookstoreIndex() {
		return "index";
	}
}