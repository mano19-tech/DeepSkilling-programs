package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String librarianName;

    // Constructor for constructor injection
    public BookService(String librarianName) {
        this.librarianName = librarianName;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Librarian: " + librarianName);
        System.out.println("Book: " + bookRepository.getBookName());
    }
}
