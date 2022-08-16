package io.portfolio.readinglist.books;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByBookId(BookAuthorId bookId);
    List<Book> findByIdBookId(String name);

    List<Book> findByIdAuthorID(String author);
}
