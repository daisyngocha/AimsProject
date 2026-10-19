package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

	// So phan tu toi da cua 1 Cart
	public static final int MAX_NUMBERS_ORDERED = 20;

	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	// ===== ADD =====

	// Them 1 DVD
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the cart.");
		} else {
			System.out.println("The cart is full.");
		}
	}

	// LAB3 - 2.1: Them danh sach DVD.
	// Dung varargs: goi duoc ca addDigitalVideoDisc(dvdArray) lan addDigitalVideoDisc(d1, d2, d3, ...)
	// Luu y: KHONG the de dong thoi ban DigitalVideoDisc[] va ban varargs vi trung signature.
	// Ban mang (da thay bang varargs):
	// public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) { ... }
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
			for (DigitalVideoDisc d : dvdList) {
				itemsOrdered[qtyOrdered] = d;
				qtyOrdered++;
			}
			System.out.println(dvdList.length + " discs have been added to the cart.");
		} else {
			System.out.println("The cart does not have enough space for " + dvdList.length + " discs.");
		}
	}

	// LAB3 - Them qua ArrayList (giu lai tu ban cu)
	public void addDigitalVideoDisc(ArrayList<DigitalVideoDisc> dvdList) {
		addDigitalVideoDisc(dvdList.toArray(new DigitalVideoDisc[0]));
	}

	// LAB3 - 2.2: Them 2 DVD
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = dvd1;
			itemsOrdered[qtyOrdered++] = dvd2;
			System.out.println("2 discs have been added to the cart.");
		} else {
			System.out.println("The cart does not have enough space for 2 discs.");
		}
	}

	// ===== REMOVE =====
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = -1;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("No disc found!");
			return;
		}

		// Don cac phan tu phia sau len 1 vi tri
		for (int i = index; i < qtyOrdered - 1; i++) {
			itemsOrdered[i] = itemsOrdered[i + 1];
		}
		qtyOrdered--;
		itemsOrdered[qtyOrdered] = null;
		System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the cart.");
	}

	// ===== TOTAL COST =====
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	// ===== LAB3 - 6: PRINT =====
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + String.format("%.2f", totalCost()) + " $");
		System.out.println("***************************************************");
	}

	// ===== LAB3 - 6: SEARCH =====
	public void searchById(int id) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("Found: " + itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("No disc found with id = " + id);
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("Found: " + itemsOrdered[i].toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No disc found with title \"" + title + "\"");
		}
	}
}
