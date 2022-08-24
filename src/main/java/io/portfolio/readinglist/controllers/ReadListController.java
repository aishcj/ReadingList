package io.portfolio.readinglist.controllers;

import io.portfolio.readinglist.models.ReadList;
import io.portfolio.readinglist.services.ReadListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReadListController {
    @Autowired
    private ReadListService readListService;

    @GetMapping("/readBooks")
    public ResponseEntity<List<ReadList>> getAllReadBooks() {
        return ResponseEntity.ok().body(readListService.getAllReadBooks());
    }

    @GetMapping("/readBooks/{id}")
    public ResponseEntity<ReadList> getReadBookByID(@PathVariable long id) {
        return ResponseEntity.ok().body(readListService.getReadBookByID(id));
    }

    @PostMapping("/readBooks")
    public ResponseEntity<ReadList> createReadList(@RequestBody ReadList readBook) {
        return ResponseEntity.ok().body(this.readListService.createReadList(readBook));
    }

    @PutMapping("/readBooks/{id}")
    public ResponseEntity<ReadList> updateReadList(@PathVariable long id, @RequestBody ReadList readBook) {
        readBook.setReadListId(id);
        return ResponseEntity.ok().body(this.readListService.updateReadList(readBook));
    }

    @DeleteMapping("/readBooks/{id}")
    public HttpStatus deleteReadBook(@PathVariable long id){
        this.readListService.deleteReadBook(id);
        return HttpStatus.OK;
    }
}
