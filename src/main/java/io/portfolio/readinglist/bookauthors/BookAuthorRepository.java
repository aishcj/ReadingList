package io.portfolio.readinglist.bookauthors;

import io.portfolio.readinglist.authors.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<Author,Long> {
}
