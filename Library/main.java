import Items.*;
import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		SortArrayList myList = new SortArrayList();
		myList.add(new Book("Noah", "Test", 256));
		myList.add(new Book("Ben", "Test", 100));
		myList.add(new Book("Sandip","Test", 160));
		
		for(int i = 0; i < myList.size(); i++)
		{
			System.out.println(myList.get(i).getValue());
		}
		
	}
}
