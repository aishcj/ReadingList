package io.portfolio.readinglist.bookauthors;

import io.portfolio.readinglist.authors.Author;

import java.util.List;

public interface BookAuthorService {
    Author createAuthor(Author author);
    Author updateAuthor(Author author);
    List<Author> getAllAuthors();
    Author getAuthorByID(long authorId);
    void deleteAuthor(long authorId);
}
