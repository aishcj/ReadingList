package io.portfolio.readinglist.bookauthors;


import io.portfolio.readinglist.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<Author,Long> {
}
