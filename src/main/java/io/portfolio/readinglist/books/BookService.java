package io.portfolio.readinglist.books;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    Book updateBook(Book book);
    List<Book> getAllBooks();
    Book getBookByID(long bookId);
    void deleteBook(long id);
}
