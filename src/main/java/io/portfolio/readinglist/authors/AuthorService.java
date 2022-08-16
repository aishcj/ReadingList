package io.portfolio.readinglist.authors;

import io.portfolio.readinglist.authors.Author;

import java.util.List;

public interface AuthorService  {
    Author createAuthor(Author author);
    Author updateAuthor(Author author);
    List<Author> getAllAuthors();
    Author getAuthorByID(long authorId);
    void deleteAuthor(long authorId);
}
