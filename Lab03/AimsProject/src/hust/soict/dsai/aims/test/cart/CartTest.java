package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        Book book = new Book(1, "Harry Potter", "Fantasy", 29.95f);
        CompactDisc cd = new CompactDisc(2, "Thriller", "Pop", "Michael Jackson", "Quincy Jones", 15.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(book);
        cart.addMedia(cd);

        cart.printCart();

        cart.removeMedia(dvd1);
        cart.printCart();
    }
}
