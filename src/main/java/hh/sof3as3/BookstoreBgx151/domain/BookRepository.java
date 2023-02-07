package hh.sof3as3.BookstoreBgx151.domain;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

	// peritään findAll(), findById(), save(), deleteById()
}