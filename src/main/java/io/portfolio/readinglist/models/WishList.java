package io.portfolio.readinglist.models;

import io.portfolio.readinglist.models.Book;


import javax.persistence.*;

@Entity
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
