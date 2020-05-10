package com.lopezmiguelangel.springboot.basics.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@Autowired
	private BookJpaRepository bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(
				new Book(1l, "Java", "Deitel"));
	}

	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable long id){
		return new Book(id, "Java", "Deitel");
	}

	@GetMapping("/jpa/book/{id}")
	public Book getJpaBook(@PathVariable long id){
		return bookService.findById(id).get();
	}

	@GetMapping("/jpa/books")
	public List<Book> getJpaBooks(){
		return bookService.findAll();
	}

	@GetMapping("/jpa/book/author/{name}")
	public List<Book> getJpaBooksByAuthor(@PathVariable String name){
		return bookService.findByAuthor(name);
	}
}
