package Items;

public class Book extends LibraryItem
{
	private String author;
	private String title;
	private int pages;
	private Book()
	{
		
	}
	public Book(String a, String t, int p)
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
	public int compareTo(Book a, int which) //choose which is needed
	{
		final double Precision = 1.0e-15;
		if(which == 0)
		{
		if(getTitle().charAt(0) > a.getTitle().charAt(0)) //MR. M: use "return getTitle().comparTo(a.getTitle());"
		{
			return 1;
		}
		else if(getTitle().equals(a.getTitle()))
		{
			return 0;
		}
		else
		{
			return -1;
		}
		}
		else{
			double simple = getValue() - a.getValue();
		if(Math.abs(simple) <= Precision * Math.abs(getValue()))
		{
			return 0;
		}
		else if(simple < 0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		}
	}
}
