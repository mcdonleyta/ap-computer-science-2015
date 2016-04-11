package library;

import sort.*;

public class LibraryItem extends CompablesItem
{
	private static int counter=0;
	
	private int IDnum;
	private String name;
	
	private LibraryItem()
	{
	}
	
	public LibraryItem(String n)
	{
		name = n;
		IDnum = ++counter;
	}
	
	public double getValue()
	{
		return IDnum;
	}
	
	public String getName()
	{
		return name;
	}
	
}
