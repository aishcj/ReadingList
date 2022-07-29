package io.portfolio.readinglist.repository;

import io.portfolio.readinglist.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
