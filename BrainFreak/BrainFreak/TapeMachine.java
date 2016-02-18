package BrainFreak;
import java.util.*;

public class TapeMachine implements TuringInterface
{
	public ArrayList<Integer> Tape = new ArrayList<Integer>();
	int head = 0;
	public TapeMachine()
	{
		Tape.add(0);
	}
	public void moveRight()
	{
		if(Tape.size() - 1 == head)
		{
			Tape.add(0);	
		}
		head++;
	}
	public void moveLeft()
	{
		head--;
	}
	public void inc()
	{
		Tape.set(head, Tape.get(head) +1);
	}
	public void dec()
	{
		Tape.set(head, Tape.get(head) -1);
	}
	public void getValue()
	{
		System.out.println(Tape.get(head));
	}
}
