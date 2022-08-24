package io.portfolio.readinglist.services;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.models.Author;
import io.portfolio.readinglist.repositories.AuthorRepository;
import io.portfolio.readinglist.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        Optional<Author> authorDB = this.authorRepository.findById(author.getAuthorId());

        if(authorDB.isPresent()){
            Author authorUpdate = authorDB.get();
            authorUpdate.setAuthorId(author.getAuthorId());
            authorUpdate.setFirstName(author.getFirstName());
            authorUpdate.setLastName(author.getLastName());
            authorRepository.save(authorUpdate);
            return authorUpdate;
        }
        else {
            throw new ResourceNotFoundException("Record with the author ID:" + author.getAuthorId() + " not found!");
        }

    }

    @Override
    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author getAuthorByID(long authorId) {
        Optional<Author> authorDB = this.authorRepository.findById(authorId);

        if(authorDB.isPresent()){
            return authorDB.get();
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + authorId + " not found!");
        }
    }

    @Override
    public void deleteAuthor(long authorId) {
        Optional<Author> authorDB = this.authorRepository.findById(authorId);

        if(authorDB.isPresent()){
            authorRepository.delete(authorDB.get());
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + authorId + " not found!");
        }

    }
}
