import pack.*;
import java.util.Scanner;

public class Driver
{
	public static void main(String args[])
	{
		int i;
		char a;
		TapeMachine tape = new TapeMachine();
		tape.run("++++");

		for(i = 0; i < tape.getLength() + 1; i++)
		{
			a = tape.getChars(i);
			switch (a)
			{
				case '+':
					tape.increment();
					i = 0;
					break;
				case '-':
					i = 0;
					tape.decrement();
					break;
				default:
					break;
			}

			tape.removePrevious();
			System.out.println(tape.getValue());
		}

		tape.print();
		System.out.println(tape.getValue());
	}
}