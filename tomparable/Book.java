package tomparable;
import java.util.*;
public class Book extends LibraryItem{
	private int ISBN;
	public Book(int isbn) { //all library books have an isbn
		ISBN=isbn;
	}

	public int getValue(){
		return ISBN;
	}

}
