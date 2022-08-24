package io.portfolio.readinglist.services;

import io.portfolio.readinglist.models.Publisher;

import java.util.List;

public interface PublisherService {
    Publisher createPublisher(Publisher publisher);
    Publisher updatePublisher(Publisher publisher);
    List<Publisher> getAllPublishers();
    Publisher getPublisherByID(long publisherId);
    void deletePublisher(long publisherId);
}
