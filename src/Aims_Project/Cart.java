package Aims_Project;

public class Cart {

	private int qtyOrdered;

	//Constructor
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	//GETTER + SETTER
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public Cart(int qtyOrdered) {
		super();
		this.qtyOrdered = qtyOrdered;
	}

}
