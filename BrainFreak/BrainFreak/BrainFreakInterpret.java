package BrainFreak;
import java.util.*;

public class BrainFreakInterpret
{
	TapeMachine Tape;
	int loopx;
	boolean check = false;
	public BrainFreakInterpret()
	{
		TapeMachine Tape = new TapeMachine();
	}
	/*public void pushLabel(int headpos)
	{
		
	}
	public int popLabel()
	{
		
	}*/
	public void run(String input)
	{
		for(int x = 0; x < input.length(); x++)
		{
			if(input.charAt(x) == '+')
			{
				Tape.inc();
			}
			else if(input.charAt(x) == '-')
			{
				Tape.dec();
			}
			else if(input.charAt(x) == '>')
			{
				Tape.moveRight();
			}
			else if(input.charAt(x) == '<')
			{
				Tape.moveLeft();
			}
			else if(input.charAt(x) == '.')
			{
				Tape.getValue();
			}
			else if(input.charAt(x) == '[')
			{
				loopx = x;
			}
			else if(input.charAt(x) == ']' && check == false)
			{
				check = true;
				x = loopx;
			}
		}
	}
}
