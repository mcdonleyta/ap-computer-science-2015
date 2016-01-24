package Items;

public class Book extends LibraryItem
{
	private String author;
	private String title;
	private int pages;
	Book()
	{
		
	}
	Book(String a, String t, int p)
	{
		author = a;
		title = t;
		pages = p;
	}
	public double getValue()
	{
		return pages;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{
		return title;
	}
}
