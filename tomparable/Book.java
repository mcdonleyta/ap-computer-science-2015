package tomparable;
import java.util.*;
public class Book extends LibraryItem{
	private int ISBN;
	private String name;
	public Book(int isbn, String setName) { //all library books have an isbn
		ISBN=isbn;
		name = setName;
	}
	public int compareTo(TomparableItem e) {
		if(this.getName().equals(e.getName())) {
			return 0;
		}
		else if (this.getName().charAt(0) > e.getName().charAt(0)) { //compares first letter
			return 1;
		}
		else
			return -1;
		
	}
	public int getValue(){
		return ISBN;
	}
	public String getName() {
		return name;
	}

}
