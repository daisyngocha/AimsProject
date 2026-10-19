package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		// swap theo de bai: KHONG doi duoc
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());

		// swap dung
		System.out.println("\n--- Correct swap ---");
		DigitalVideoDisc a = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc b = new DigitalVideoDisc("Cinderella");
		correctSwap(a, b);
		System.out.println("a title: " + a.getTitle());
		System.out.println("b title: " + b.getTitle());
	}

	// Chi hoan doi ban sao cua reference trong method -> bien o main khong doi
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

	// Java pass-by-value nen khong the doi reference cua bien ben ngoai.
	// Cach dung: hoan doi NOI DUNG (cac thuoc tinh) cua 2 object qua setter.
	public static void correctSwap(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		String title = d1.getTitle();
		String category = d1.getCategory();
		String director = d1.getDirector();
		int length = d1.getLength();
		float cost = d1.getCost();

		d1.setTitle(d2.getTitle());
		d1.setCategory(d2.getCategory());
		d1.setDirector(d2.getDirector());
		d1.setLength(d2.getLength());
		d1.setCost(d2.getCost());

		d2.setTitle(title);
		d2.setCategory(category);
		d2.setDirector(director);
		d2.setLength(length);
		d2.setCost(cost);
	}
}
