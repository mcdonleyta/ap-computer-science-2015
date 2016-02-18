import pack.*;
import java.util.Scanner;

public class Driver
{
	public static void main(String args[])
	{
		TapeMachine tape = new TapeMachine();
		tape.run("+++");
		for(int i = 0; i < tape.getLength() + 1; i++)
		{
			tape.print();

			if(tape.getChars(i) == '+')
			{
				tape.increment();
			}else
			if(tape.getChars(i) == '-')
			{
				tape.decrement();
			}else
			if(tape.getChars(i) == '>')
			{
				tape.move_right();
			}else
			if(tape.getChars(i) == '<')
			{
				tape.move_left();
			}

			tape.removePrevious();
			System.out.println(tape.getValue());
		}

		tape.print();
		System.out.println(tape.getValue());
	}
}