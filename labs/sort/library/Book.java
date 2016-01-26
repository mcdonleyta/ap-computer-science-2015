package library;

public class Book extends LibraryItem
{
	private String author;
	private String title;
	private int pages;
	
	public Book(String writer, String name, int manyPages)
	{
		super(name);
		author = writer;
		pages = manyPages;
	}
	
	public double getValue()
	{
		return pages;
	}
	
}

