package Aims_Project;

import java.util.ArrayList;

public class Cart {

	private int qtyOrdered;
	
	//Khai bao SL phan tu toi da cua 1 Cart
	public static final int max_number_orders = 20;
	
	//Khai bao mang chua danh sach items trong 1 cart + gioi han SL phan tu cua Cart
	private DigitalVideoDisk itemOrders[] = new DigitalVideoDisk[max_number_orders];
	

	//GETTER + SETTER
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	//Constructor
	public Cart(int qtyOrdered) {
		this.qtyOrdered = 0;
	}
	
	public Cart() {};
	
	//Add  items to the list
	public void addDigitalVideoDisk(DigitalVideoDisk disk) {
		if (qtyOrdered < max_number_orders) {
			itemOrders[qtyOrdered] = disk;
			qtyOrdered++;
			System.out.println("This disk has been added to the cart.");
		}else {
			System.out.println("The cart is full.");
		}
	}
	
	//LAB3 - Add items via array
	public void addDigitalVideoDisk (DigitalVideoDisk[] dvdList) {
		if (qtyOrdered <= max_number_orders - dvdList.length) {
			for (int i = 0; i < dvdList.length; i++) {
				itemOrders[qtyOrdered + i] = dvdList[i];
			}
			qtyOrdered = qtyOrdered + dvdList.length;
			System.out.println("The dvdList has been added to the cart.");
		} else {
			System.out.println("The cart is full.");
		}
	}
	
	//LAB3 - Add items via ArrayList (import java.util.ArrayList)
	public void addDigitalVideoDisk (ArrayList<DigitalVideoDisk> dvdList) {
		if (qtyOrdered <= max_number_orders - dvdList.size()) {
			for (DigitalVideoDisk d : dvdList) {
				itemOrders[qtyOrdered] = d;
				qtyOrdered++;
			}
			System.out.println("The dvdList has been added to the cart.");
		} else {
			System.out.println("The cart is full.");
		}
		
	}
	
	//LAB3 - Add 2 dvd
	public void addDigitalVideoDisk(DigitalVideoDisk d1, DigitalVideoDisk d2) {
		if (qtyOrdered <= max_number_orders - 2) {
			itemOrders[qtyOrdered] = d1;
			itemOrders[qtyOrdered + 1] = d2;
			System.out.println("The dvdList has been added to the cart.");
		} else {
			System.out.println("The cart is full.");
		}
	}
	
	//Remove items
	public void removeDigitalVideoDisk(DigitalVideoDisk disk) {
		int index = -1;
		for (int i = 0; i < this.qtyOrdered - 1; i++) {
			if (this.itemOrders[i].equals(disk)) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			System.out.println("No disk found!");
			return;
		};
		
		for (int i = index; i < this.qtyOrdered; i++) {
			itemOrders[i] = itemOrders[i+1];
		};
		qtyOrdered--;
		itemOrders[this.qtyOrdered] = null;
	}
	
	// Tinh total cost
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			totalCost += itemOrders[i].getCost();
		}
		
		return totalCost;
	}
	
}
	
	
		
		
		
		
