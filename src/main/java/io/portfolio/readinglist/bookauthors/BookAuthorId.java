package io.portfolio.readinglist.bookauthors;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BookAuthorId implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId;

    public BookAuthorId(long bookId, long authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }
    public BookAuthorId() {
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthorId that = (BookAuthorId) o;
        return bookId == that.bookId && authorId == that.authorId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, authorId);
    }
}
