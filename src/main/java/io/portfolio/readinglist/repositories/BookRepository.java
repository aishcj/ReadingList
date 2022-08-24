package io.portfolio.readinglist.repositories;

import io.portfolio.readinglist.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface BookRepository extends JpaRepository<Book,Long> {


    Optional<Book> findByBookId(long bookId);
}
