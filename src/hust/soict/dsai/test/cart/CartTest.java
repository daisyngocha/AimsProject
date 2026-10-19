package hust.soict.dsai.test.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();

		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		// Test the print method
		cart.print();

		// Test overloading: 2 DVD
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 21.5f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 29.9f);
		cart.addDigitalVideoDisc(dvd4, dvd5);

		// Test overloading: mang / varargs
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 15.0f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Up", "Animation", "Pete Docter", 96, 12.5f);
		DigitalVideoDisc[] dvdArray = { dvd6, dvd7 };
		cart.addDigitalVideoDisc(dvdArray);

		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Coco");
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Cars");
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Moana");
		cart.addDigitalVideoDisc(dvd8, dvd9, dvd10);

		// Test overloading: ArrayList
		ArrayList<DigitalVideoDisc> list = new ArrayList<>();
		list.add(new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 22.0f));
		cart.addDigitalVideoDisc(list);

		cart.print();

		// Test search by id
		System.out.println("\n--- Search by id ---");
		cart.searchById(2);
		cart.searchById(999);

		// Test search by title
		System.out.println("\n--- Search by title ---");
		cart.searchByTitle("star");
		cart.searchByTitle("Harry Potter");

		// Test remove
		System.out.println("\n--- Remove ---");
		cart.removeDigitalVideoDisc(dvd2);
		cart.removeDigitalVideoDisc(dvd2);
		cart.print();
	}
}
