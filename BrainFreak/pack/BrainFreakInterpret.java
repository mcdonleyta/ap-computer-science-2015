package pack;
import java.util.List;
import java.util.ArrayList;

public class BrainFreakInterpret 
{
	List <Character> chars = new ArrayList <Character>();
	TapeMachine tape;

	public void run(String code)
	{
		for(int i = 0; i < code.length(); i++)
		{
			chars.add(code.charAt(i));
		}

		System.out.println("Now interpretting the code...");
		System.out.println();

		for(int j = 0; j < chars.size(); j++)
		{
			if(chars.get(j) == '+')
			{
				System.out.println("Increment");
				tape.increment();
			}else
			if(chars.get(j) == '-')
			{
				System.out.println("Decrement");
				tape.decrement();
			}else
			if(chars.get(j) == '>')
			{
				tape.setMultiple();
				System.out.println("Moved right");
				tape.move_right();
			}else
			if(chars.get(j) == '<')
			{
				System.out.println("Moved left");
				tape.move_left();
			}else
			if(chars.get(j) == '[')
			{
				System.out.println("Start Loop");
			}else
			if(chars.get(j) == ']')
			{
				if(tape.getMultiple() == 0)
				{
					for(int i = 0; i < chars.size(); i++)
					{
						if(chars.get(i) == '.')
						{
							j = i - 2;
						}
					}

					System.out.println("End Loop");
				}else
				{
					for(int i = 0; i < chars.size(); i++)
					{
						if(chars.get(i) == '[')
						{
							j = i - 1;
						}
					}
					System.out.println("End Loop");
				}
			}else
			if(chars.get(j) == '.')
			{
				System.out.println(tape.getValue());
			}
		}
	}

	public void print_characters()
	{
		for(int i = 0; i < chars.size(); i++)
		{
			System.out.println(chars.get(i));
		}
	}

	public void check()
	{
		tape.checkZeroes();
	}

	public int ssize()
	{
		return chars.size();
	}

	public BrainFreakInterpret()
	{
		tape = new TapeMachine();
	}
}