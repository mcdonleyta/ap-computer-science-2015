package BrainFreak;
import java.util.*;

public class BrainFreakInterpret
{
	TapeMachine Tape;
	int loopx;
	boolean check = false;
	public BrainFreakInterpret()
	{
		//Mr M: Your runtime error is because of this line
		Tape = new TapeMachine();
		//Mr M: We are creating a new variable named "Tape" which is instantiated but then lost when we leave the constructor
		//     this is due to the back that you have "TapeMachine Tape" which declares a new variable
	}
	
	//Mr. M: Please complete the label functions to recieve the last 15points
	
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
