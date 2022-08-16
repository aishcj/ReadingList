package io.portfolio.readinglist.publishers;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.publishers.Publisher;
import io.portfolio.readinglist.publishers.PublisherRepository;
import io.portfolio.readinglist.publishers.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public Publisher createPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        Optional<Publisher> publisherDB = this.publisherRepository.findById(publisher.getPublisherId());

        if(publisherDB.isPresent()){
            Publisher publisherUpdate = publisherDB.get();
            publisherUpdate.setPublisherId(publisher.getPublisherId());
            publisherUpdate.setPublisherName(publisher.getPublisherName());
            publisherRepository.save(publisherUpdate);
            return publisherUpdate;
        }
        else {
            throw new ResourceNotFoundException("Record with the publisher ID:" + publisher.getPublisherId() + " not found!");
        }

    }

    @Override
    public List<Publisher> getAllPublishers() {
        return this.publisherRepository.findAll();
    }

    @Override
    public Publisher getPublisherByID(long publisherId) {
        Optional<Publisher> publisherDB = this.publisherRepository.findById(publisherId);

        if(publisherDB.isPresent()){
            return publisherDB.get();
        }
        else {
            throw new ResourceNotFoundException("Record with the publisher ID:" + publisherId + " not found!");
        }
    }

    @Override
    public void deletePublisher(long publisherId) {
        Optional<Publisher> publisherDB = this.publisherRepository.findById(publisherId);
        if(publisherDB.isPresent()){
            publisherRepository.delete(publisherDB.get());
        }
        else {
            throw new ResourceNotFoundException("Record with the publisher ID:" + publisherId + " not found!");
        }

    }
}
