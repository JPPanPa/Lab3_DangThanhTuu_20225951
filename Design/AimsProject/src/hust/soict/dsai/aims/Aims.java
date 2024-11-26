package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args){
		// Create a new cart
		Cart thanhtuu = new Cart();
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("ONEPIECE", "Animation", "Roger Allers", 87, 19.95f);
		thanhtuu.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("ANHYEUEM", "Science Fiction", "George Lucas", 87, 24.95f);
		thanhtuu.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("haythe", "Animation",18.99f);
		thanhtuu.addDigitalVideoDisc(dvd3);
		thanhtuu.removeDigitalVideoDisc(dvd2);
		thanhtuu.printCart();
		thanhtuu.searchById(3);
		// Print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(thanhtuu.totalCost());
		 System.out.println("dvd1 id: " + dvd1.getId());
	}
}