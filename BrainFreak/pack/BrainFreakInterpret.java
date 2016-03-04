package pack;
import java.util.ArrayList;

public class BrainFreakInterpret implements TuringInterface
{
	ArrayList <Character> chars = new ArrayList <Character> ();
	ArrayList <Integer> t = new ArrayList <Integer> ();

	public void run(String code)
	{
		for(int i = 0; i < code.length; i++)
		{
			chars.add(code.charAt(i));
		}

		
	}

	public BrainFreakInterpret()
	{

	}

	public int getLength()
	{
		return chars.size();
	}

	public void removePrevious()
	{
		chars.remove(0);
	}

	public char getChars(int i)
	{
		return chars.get(i);
	}

	public void decrement()
	{
		//decreases the number at the index
		t.set(x, t.get(x) - 1);
	}
	public void increment() 
	{
		//increases the number at the index
		t.set(x, t.get(x) + 1);
	}
	public void move_right()
	{
		//goes to the next index
		x++;
	}
	public void move_left()
	{
		//goes to the previous index
		x--;
	}
	public int getValue()
	{
		return t.get(t.size() - 1);
	}

	public void print()
	{
		for(int j = 0; j < chars.size(); j++)
		{
			System.out.print(chars.get(j));
		}

		System.out.println("");
	}

	public void addTo(int a)
	{
		t.add(a);
	}
}