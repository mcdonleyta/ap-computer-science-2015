package pack;
import java.util.ArrayList;

public class TapeMachine extends BrainFreakInterpret implements TuringInterface
{

	private int x;
	ArrayList <Integer> t = new ArrayList <Integer> ();
	ArrayList <Integer> buffer = new ArrayList <Integer> ();

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

	public TapeMachine()
	{
		t.add(0);
		x = 0;
	}
}