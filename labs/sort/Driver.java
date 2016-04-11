import sort.*;
import library.*;

import java.util.*;

public class Driver
{
		public static void main(String[] args)
		{
			SortArrayList inventory = new SortArrayList();
			inventory.add(new Book("Bronte", "Wuthering Heights", 300));
			inventory.add(new Book("Ishiguro", "The Remains of the Day", 150));
			inventory.add(new Book("Attie", "Collapse", 230));
			inventory.add(new Book("Schnitzler", "Lt. Gustl", 422));
			inventory.add(new Book("Davis","The Tyrant of the Past and Slave of the Future",45));
			inventory.add(new Book("Vonnegut","Cat's Cradle",287));
			inventory.output();
			
		}
}
