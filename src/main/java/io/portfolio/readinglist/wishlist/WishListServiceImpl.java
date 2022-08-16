package io.portfolio.readinglist.wishlist;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.wishlist.WishList;
import io.portfolio.readinglist.wishlist.WishListRepository;
import io.portfolio.readinglist.wishlist.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class WishListServiceImpl implements WishListService {
    @Autowired
    private WishListRepository wishListRepository;

    @Override
    public WishList createWishList(WishList wishList) {
        return wishListRepository.save(wishList);
    }

    @Override
    public WishList updateWishList(WishList wishList) {
        Optional<WishList> wishListDB = this.wishListRepository.findById(wishList.getWishId());

        if(wishListDB.isPresent()){
            WishList wishListUpdate = wishListDB.get();
            wishListUpdate.setWishId(wishList.getWishId());
            wishListRepository.save(wishListUpdate);
            return wishListUpdate;
        }
        else {
            throw new ResourceNotFoundException("Record with the Book ID:" + wishList.getWishId() + " not found!");
        }

    }

    @Override
    public List<WishList> getAllWishBooks() {
        return this.wishListRepository.findAll();
    }

    @Override
    public WishList getWishBookByID(long bookId) {
        Optional<WishList> wishListDB = this.wishListRepository.findById(bookId);

        if(wishListDB.isPresent()){
            return wishListDB.get();
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + bookId + " not found!");
        }
    }

    @Override
    public void deleteWishBook(long bookId) {
        Optional<WishList> wishListDB = this.wishListRepository.findById(bookId);
        if(wishListDB.isPresent()){
            wishListRepository.delete(wishListDB.get());
        }
        else {
            throw new ResourceNotFoundException("Record with the book ID:" + bookId + " not found!");
        }

    }
}
