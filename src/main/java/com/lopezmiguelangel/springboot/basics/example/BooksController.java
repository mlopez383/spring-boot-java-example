package com.lopezmiguelangel.springboot.basics.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(
				new Book(1l, "Java", "Deitel"));
	}

	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable long id){
		return new Book(id, "Java", "Deitel");
	}
}
