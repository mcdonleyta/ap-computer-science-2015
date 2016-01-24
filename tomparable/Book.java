package tomparable;
import java.util.*;
public class Book extends LibraryItem implements Tomparable{
	private int ISBN;
	public Book(int isbn) { //all library books have an isbn
		ISBN=isbn;
	}
	public int getValue(){
		return ISBN;
	}
	public ArrayList<Book> sort (ArrayList<Book> x) {
		ArrayList<Book> e = x;
		for(int i = 0; i< e.size()-1; i++) {
			if(e.get(i).compareTo(e.get(i+1)) == 1) {
				Book temp = e.get(i+1);
				e.set(i+1,e.get(i));
				e.set(i,temp);
			}
			else if(e.get(i).compareTo(e.get(i-1)) == -1) {
				Book temp = e.get(i-1);
				e.set(i-1,e.get(i));
				e.set(i,temp);
			}
	}
	return e;
}
}
