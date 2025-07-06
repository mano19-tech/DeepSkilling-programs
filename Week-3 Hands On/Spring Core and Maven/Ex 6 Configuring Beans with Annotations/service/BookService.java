package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // Marks this class as a Spring service bean
public class BookService {

    @Autowired  // Tells Spring to inject the BookRepository bean
    private BookRepository bookRepository;

    public void displayBook() {
        System.out.println("Book: " + bookRepository.getBookName());
    }
}
