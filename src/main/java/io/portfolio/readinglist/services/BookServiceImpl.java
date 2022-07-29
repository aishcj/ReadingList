package io.portfolio.readinglist.services;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.models.Book;
import io.portfolio.readinglist.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        Optional<Book> bookDB = this.bookRepository.findById(book.getBookId());

        if(bookDB.isPresent()){
            Book bookUpdate = bookDB.get();
            bookUpdate.setBookId(book.getBookId());
            bookUpdate.setBookTitle(book.getBookTitle());
            bookUpdate.setGenre(book.getGenre());
            bookUpdate.setPrice(book.getPrice());
            bookUpdate.setPublisherId(book.getPublisherId());
            bookUpdate.setTotalPages(book.getTotalPages());
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
