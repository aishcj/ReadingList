package io.portfolio.readinglist.controllers;

import io.portfolio.readinglist.models.WishList;
import io.portfolio.readinglist.services.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WishListController {
    @Autowired
    private WishListService wishListService;

    @GetMapping("/wishBooks")
    public ResponseEntity<List<WishList>> getAllWishBooks() {
        return ResponseEntity.ok().body(wishListService.getAllWishBooks());
    }

    @GetMapping("/wishBooks/{id}")
    public ResponseEntity<WishList> getWishBookByID(@PathVariable long id) {
        return ResponseEntity.ok().body(wishListService.getWishBookByID(id));
    }

    @PostMapping("/wishBooks")
    public ResponseEntity<WishList> createWishList(@RequestBody WishList wishBook) {
        return ResponseEntity.ok().body(this.wishListService.createWishList(wishBook));
    }

    @PutMapping("/wishBooks/{id}")
    public ResponseEntity<WishList> updateWishList(@PathVariable long id, @RequestBody WishList wishBook) {
        wishBook.setWishId(id);
        return ResponseEntity.ok().body(this.wishListService.updateWishList(wishBook));
    }

    @DeleteMapping("/wishBooks/{id}")
    public HttpStatus deleteReadBook(@PathVariable long id){
        this.wishListService.deleteWishBook(id);
        return HttpStatus.OK;
    }
}
