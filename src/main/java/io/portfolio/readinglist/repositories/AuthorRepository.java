package io.portfolio.readinglist.repositories;

import io.portfolio.readinglist.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
