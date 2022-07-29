package io.portfolio.readinglist.models;

import javax.persistence.*;


@Entity
@Table(name="Books")
public class Book {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long bookId;

    @Column(name = "Title")
    private String bookTitle;

    @Column(name = "Genre")
    private String genre;

    @Column(name = "Publisher ID")
    private long publisherId;

    @Column(name = "Price")
    private long price;

    @Column(name = "Pages")
    private long totalPages;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

}
