package Aims_Project;

public class Cart {

	private int qtyOrdered;
	
	public static final int max_number_orders = 20;
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
	
	//Remove items
	public void removeDigitalVideoDisk(DigitalVideoDisk disk) {
		int index = -1;
		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.itemOrders[i].equals(disk)) {
				index = i;
			}
		}
		
		if (index == -1) {
			System.out.println("No disk found!");
		};
		
		for (int i = index; i < this.qtyOrdered; i++) {
			itemOrders[i] = itemOrders[i+1];
		};
		
		itemOrders[this.qtyOrdered] = null;
	}
	
	// Tinh total cost
	public float totalCost(DigitalVideoDisk list) {
		float totalCost = 0;
		for (int i = 0; i < this.qtyOrdered; i++) {
			totalCost += list.getCost();
		}
		
		return totalCost;
	}
	
	
	
}
	
	
		
		
		
		
