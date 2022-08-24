package io.portfolio.readinglist.services;

import io.portfolio.readinglist.models.Author;

import java.util.List;

public interface AuthorService  {
    Author createAuthor(Author author);
    Author updateAuthor(Author author);
    List<Author> getAllAuthors();
    Author getAuthorByID(long authorId);
    void deleteAuthor(long authorId);
}
