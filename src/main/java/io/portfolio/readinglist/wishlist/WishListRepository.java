package io.portfolio.readinglist.wishlist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList,Long> {
}
