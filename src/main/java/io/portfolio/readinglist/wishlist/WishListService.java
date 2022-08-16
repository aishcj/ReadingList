package io.portfolio.readinglist.wishlist;

import io.portfolio.readinglist.wishlist.WishList;

import java.util.List;

public interface WishListService {
    WishList createWishList(WishList readBook);
    WishList updateWishList(WishList readBook);
    List<WishList> getAllWishBooks();
    WishList getWishBookByID(long wishBookId);
    void deleteWishBook(long wishBookId);
}
