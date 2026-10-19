package Aims_Project;

public class Aims {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Create a new Cart
		Cart anOrder = new Cart();
		
		//Create new dvd objects and add them to the Cart
		DigitalVideoDisk dvd1 = new DigitalVideoDisk("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisk dvd2 = new DigitalVideoDisk("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisk dvd3 = new DigitalVideoDisk("Aladin", "Animation", "Roger Allers", 87, 18.99f);
		
		anOrder.addDigitalVideoDisk(dvd1);
		anOrder.addDigitalVideoDisk(dvd2);
		anOrder.addDigitalVideoDisk(dvd3);
		
		System.out.println("The Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}
}
