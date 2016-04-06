package pack;
import java.util.List;
import java.util.ArrayList;

public class TapeMachine implements TuringInterface
{
	private ArrayList <Integer> tape;
	private int index;
	private int multiple;

	public TapeMachine()
	{
		tape = new ArrayList();
		index = 0;
		addZeroes();
	}

	public void addZeroes()
	{
		for(int a = 0; a < 50; a++)
		{
			tape.add(0);
		}
	}

	public void checkZeroes()
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.print(tape.get(i));
		}
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
		tape.set(index, tape.get(index) + 1);
	}
	public void decrement()
	{
		tape.set(index, tape.get(index) - 1);
	}
	public int getValue()
	{
		return tape.get(index);
	}

	public void setMultiple()
	{
		multiple = tape.get(0);
	}

	public int getMultiple()
	{
		return multiple;
	}
}