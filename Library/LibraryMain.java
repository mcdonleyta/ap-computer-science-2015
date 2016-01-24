package Library;
import Items.*;

public class LibraryMain
{
	public static void LibraryMain(String[] args)
	{
		SortArrayList myList = new SortArrayList();
		MyList.add(new Book(Noah, Test, 256));
		MyList.add(new Book(Ben, Test, 100));
		
		for(int i = 0; i < MyList.size(); i++)
		{
			println(MyList.get(i).getValue());
		}
		
	}
}
