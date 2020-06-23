package com.heapsteep.controller;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heapsteep.model.Book;
import com.heapsteep.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllNotes() {
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    public Book createNote(@Validated @RequestBody Book book) {
        return bookRepository.save(book);
    }


}