package tomparable;
import java.util.*;
public class Book extends LibraryItem{
	private int ISBN;
	private String name;
	private double price;

	public Book(int isbn, String setName, double purchasePrice) { //all library books have an isbn
		ISBN=isbn;
		name = setName;
		price = purchasePrice;
	}
	//MR. M: This is the starting point of a great solution. I like the flag idea but it's not automatic and makes the calling code a little ambiguous.
	//       It would be neat to use a "helper" method without the flag, that looks inside the object for the flag and then calls the code here.
	//       This way each object can opt-in to how they want to be sorted. Nice job.
	public int compareTo(TomparableItem e, String flag) { //terrible solution lol
		if(this.getName().equals(e.getName())) {
			return 0;
		}
		else if (this.getName().charAt(0) > e.getName().charAt(0)) { //compares first letter
			return 1;
		}
		else
			return -1;
		
	}
	public int compareTo(TomparableItem e, int flag) {
	if(this.getValue() == e.getValue()) {
		//ret = 0;
		return 0;
	}
	else if(this.getValue() > e.getValue()){
		//ret = 1;
		return 1;
	}
	else //if ( this.getValue() < e.getValue()) {
		//ret = -1;
		return -1;
	}
	//return ret;
	
	public int compareTo(TomparableItem e, double flag) { 
		final double EPSILON = 1.0e-15;
		double diffrence = this.getPrice() - e.getPrice();
		if(Math.abs(diffrence) <= EPSILON * Math.abs(this.getPrice())) {
			return 0;			
		}
		else if( this.getPrice() >e.getPrice()) {
			return 1;
		}
		else
			return -1;
		
		
	}
	public int getValue(){
		return ISBN;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

}
