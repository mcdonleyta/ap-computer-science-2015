package library;

import sort.*;

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
	
	public int compareTo(Book C)
	{
		return getName().compareTo(((Book) C).getName());
	}
	
}

