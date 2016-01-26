import tomparable.*;
import java.util.*;
public class Driver {
	
	public static void main(String[] args) {
		Book e = new Book(2, "dewcwe");
		Book x = new Book(6, "wedfw");
		Book y = new Book(7, "fwdw");
		SortedArray z = new SortedArray();
		z.add(e);
		z.add(y);
		z.add(x);
		System.out.println(z); //should print 2 6 7
		
	}
	
}
