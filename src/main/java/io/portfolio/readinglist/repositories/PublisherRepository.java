package io.portfolio.readinglist.repositories;

import io.portfolio.readinglist.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
