package io.portfolio.readinglist.wishlist;

import io.portfolio.readinglist.books.Book;


import javax.persistence.*;

public class WishList {
    @Id
    private long wishId;

    @OneToOne
    @JoinColumn(name="bookId")
    private Book book;

    public WishList() {
    }
    public WishList(long wishId, Book book) {
        this.wishId = wishId;
        this.book = book;
    }

    public long getWishId() {
        return wishId;
    }

    public void setWishId(long wishId) {
        this.wishId = wishId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
