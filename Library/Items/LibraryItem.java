package Items;


public class LibraryItem extends MyparableItem
{
	public static int TotalItems;
	public int ID;
	LibraryItem()
	{
		ID = ++TotalItems;
	}
	public double getValue()
	{
		return ID;
	}
}
