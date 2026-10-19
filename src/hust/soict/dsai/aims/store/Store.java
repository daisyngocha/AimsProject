package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {

	public static final int MAX_NUMBERS_IN_STORE = 100;

	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
	private int qtyInStore = 0;

	public int getQtyInStore() {
		return qtyInStore;
	}

	public void addDVD(DigitalVideoDisc dvd) {
		if (qtyInStore < MAX_NUMBERS_IN_STORE) {
			itemsInStore[qtyInStore] = dvd;
			qtyInStore++;
			System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
		} else {
			System.out.println("The store is full.");
		}
	}

	public void removeDVD(DigitalVideoDisc dvd) {
		int index = -1;
		for (int i = 0; i < qtyInStore; i++) {
			if (itemsInStore[i].equals(dvd)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("The DVD \"" + dvd.getTitle() + "\" is not in the store.");
			return;
		}

		for (int i = index; i < qtyInStore - 1; i++) {
			itemsInStore[i] = itemsInStore[i + 1];
		}
		qtyInStore--;
		itemsInStore[qtyInStore] = null;
		System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
	}

	public void print() {
		System.out.println("***********************STORE***********************");
		for (int i = 0; i < qtyInStore; i++) {
			System.out.println((i + 1) + ". " + itemsInStore[i].toString());
		}
		System.out.println("***************************************************");
	}
}
