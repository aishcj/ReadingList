package io.portfolio.readinglist.models;

import javax.persistence.*;

@Entity
public class ReadList {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long bookId;

    @Column(name = "Title")
    private String bookTitle;

    @Column(name = "Pages")
    private int totalPages;

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

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
