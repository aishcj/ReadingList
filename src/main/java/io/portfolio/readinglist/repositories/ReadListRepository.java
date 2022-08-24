package io.portfolio.readinglist.repositories;

import io.portfolio.readinglist.models.ReadList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadListRepository extends JpaRepository<ReadList,Long> {
}
