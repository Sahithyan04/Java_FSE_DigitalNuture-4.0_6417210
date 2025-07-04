package com.kutty.librarydi.service;

import com.kutty.librarydi.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("[DI Success] BookRepository injected into BookService");
    }

    public void displayBook() {
        System.out.println("[BookService] Book Name: " + bookRepository.getBookName());
    }
}
