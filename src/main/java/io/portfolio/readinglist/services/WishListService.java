package io.portfolio.readinglist.services;

import io.portfolio.readinglist.models.WishList;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WishListService {
    WishList createWishList(WishList readBook);
    WishList updateWishList(WishList readBook);
    List<WishList> getAllWishBooks();
    WishList getWishBookByID(long wishBookId);
    void deleteWishBook(long wishBookId);
}
