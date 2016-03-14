package Pacman;
java.util.Scanner;

public class Move_Entities
{
	public int x = 15;
	public int y = 14;

	public void move_right()
	{
		x = x + 1;
	}
	public void move_left()
	{
		x = x - 1;
	}
	public void move_up()
	{
		y = y + 1;
	}
	public void move_down()
	{
		y = y - 1;
	}

	public Move_Entities()
	{

	}
	
	public Move_Entities(String input)
	{
		if (input == 'right' || input == 'd') 
		{
			move_right();
		}else
		if(input == 'left' input == 'a')
		{
			move_left();
		}else
		if(input == 'up' input == 'w')
		{
			move_up();
		}else
		if(input == 'down' input == 's')
		{
			move_down();
		}
	}
}