package io.portfolio.readinglist.services;

import io.portfolio.readinglist.models.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    Book updateBook(Book book);
    List<Book> getAllBooks();
    Book getBookByID(long bookId);
    void deleteBook(long id);
}
