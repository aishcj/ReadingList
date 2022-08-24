package io.portfolio.readinglist.controllers;

import io.portfolio.readinglist.models.Publisher;
import io.portfolio.readinglist.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publishers")
    public ResponseEntity<List<Publisher>> getAllPublishers() {
        return ResponseEntity.ok().body(publisherService.getAllPublishers());
    }

    @GetMapping("/publishers/{id}")
    public ResponseEntity<Publisher> getPublisherByID(@PathVariable long id) {
        return ResponseEntity.ok().body(publisherService.getPublisherByID(id));
    }

    @PostMapping("/publishers")
    public ResponseEntity<Publisher> createPublisher(@RequestBody Publisher genre) {
        return ResponseEntity.ok().body(this.publisherService.createPublisher(genre));
    }

    @PutMapping("/publishers/{id}")
    public ResponseEntity<Publisher> updatePublisher(@PathVariable long id, @RequestBody Publisher publisher) {
        publisher.setPublisherId(id);
        return ResponseEntity.ok().body(this.publisherService.updatePublisher(publisher));
    }

    @DeleteMapping("/publishers/{id}")
    public HttpStatus deletePublisher(@PathVariable long id){
        this.publisherService.deletePublisher(id);
        return HttpStatus.OK;
    }
}
