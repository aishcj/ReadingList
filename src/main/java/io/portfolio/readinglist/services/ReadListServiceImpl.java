package io.portfolio.readinglist.services;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.models.ReadList;
import io.portfolio.readinglist.repositories.ReadListRepository;
import io.portfolio.readinglist.services.ReadListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ReadListServiceImpl implements ReadListService {
    @Autowired
    private ReadListRepository readListRepository;

    @Override
    public ReadList createReadList(ReadList readList) {
        return readListRepository.save(readList);
    }

    @Override
    public ReadList updateReadList(ReadList readList) {
        Optional<ReadList> readListDB = this.readListRepository.findById(readList.getReadListId());

        if(readListDB.isPresent()){
            ReadList readListUpdate = readListDB.get();
            readListUpdate.setReadListId(readList.getReadListId());
            readListUpdate.setBook(readList.getBook());
            readListRepository.save(readListUpdate);
            return readListUpdate;
        }
        else {
            throw new ResourceNotFoundException("Record with the Book ID:" + readList.getReadListId() + " not found!");
        }

    }

    @Override
    public List<ReadList> getAllReadBooks() {
        return this.readListRepository.findAll();
    }

    @Override
    public ReadList getReadBookByID(long readId) {
        Optional<ReadList> readListDB = this.readListRepository.findById(readId);

        if(readListDB.isPresent()){
            return readListDB.get();
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + readId + " not found!");
        }
    }

    @Override
    public void deleteReadBook(long bookId) {
        Optional<ReadList> readListDB = this.readListRepository.findById(bookId);
        if(readListDB.isPresent()){
            readListRepository.delete(readListDB.get());
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + bookId + " not found!");
        }

    }
}
