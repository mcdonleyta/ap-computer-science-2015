package pack;
import java.util.ArrayList;

public class BrainFreakInterpret
{
	ArrayList <Character> chars = new ArrayList <Character> ();

	public void run(String code)
	{
		for(int i = 0; i < code.length(); i++)
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

	public void print()
	{
		for(int j = 0; j < chars.size(); j++)
		{
			System.out.print(chars.get(j));
		}

		System.out.println("");
	}
}