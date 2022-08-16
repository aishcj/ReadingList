package io.portfolio.readinglist.publishers;

import io.portfolio.readinglist.publishers.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
