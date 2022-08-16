package io.portfolio.readinglist.authors;

import io.portfolio.readinglist.authors.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
