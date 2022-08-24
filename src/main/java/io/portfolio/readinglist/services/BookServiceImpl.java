package io.portfolio.readinglist.services;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.models.Book;
import io.portfolio.readinglist.repositories.BookRepository;
import io.portfolio.readinglist.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        Optional<Book> bookDB = this.bookRepository.findByBookId(book.getBookId());

        if(bookDB.isPresent()){
            Book bookUpdate = bookDB.get();
            bookUpdate.setBookId(book.getBookId());
            bookUpdate.setBookTitle(book.getBookTitle());
            bookUpdate.setPrice(book.getPrice());
            bookUpdate.setPublisherId(book.getPublisherId());
            bookRepository.save(bookUpdate);
            return bookUpdate;
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + book.getBookId() + " not found!");
        }

    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book getBookByID(long bookId) {
        Optional<Book> bookDB = this.bookRepository.findById(bookId);

        if(bookDB.isPresent()){
            return bookDB.get();
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + bookId + " not found!");
        }
    }

    @Override
    public void deleteBook(long bookId) {
        Optional<Book> bookDB = this.bookRepository.findById(bookId);

        if(bookDB.isPresent()){
            bookRepository.delete(bookDB.get());
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + bookId + " not found!");
        }

    }
}
