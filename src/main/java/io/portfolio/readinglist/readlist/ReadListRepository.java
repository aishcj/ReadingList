package io.portfolio.readinglist.readlist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadListRepository extends JpaRepository<ReadList,Long> {
}
