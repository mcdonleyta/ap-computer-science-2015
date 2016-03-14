package pack;
import java.util.List;
import java.util.ArrayList;

public class TapeMachine implements TuringInterface
{
	private ArrayList <Integer> tape;
	private int x;
	private int index;

	public TapeMachine()
	{
		tape = new ArrayList();
		x = 0;
		tape.add(0);
	}

	public void move_left()
	{
		index--;
	}
	public void move_right()
	{
		index++;
	}
	public void increment()
	{
		tape.set(index, tape.get(index + 1));
	}
	public void decrement()
	{
		tape.set(index, tape.get(index + 1));
	}
	public int getValue()
	{
		return tape.get(index);
	}
}