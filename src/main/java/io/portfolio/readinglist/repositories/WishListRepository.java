package io.portfolio.readinglist.repositories;

import io.portfolio.readinglist.models.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WishListRepository extends JpaRepository<WishList,Long> {
}
