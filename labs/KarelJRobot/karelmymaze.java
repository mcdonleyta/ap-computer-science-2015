package kareltherobot;

public class karelmymaze implements Directions
{
	public static void turnRight(Robot karel)
	{
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
	}

	public static void main(String[] args)
	{
		World.reset();
		World.readWorld("mymaze.kwld");
		World.setTrace(true);
		World.setVisible(true);
		Robot karel = new Robot(1, 1, East, 10);
		for(int a = 0; a < 7; a++)
		{
			karel.move();
		}

		karel.turnLeft();

		for(int b = 0; b < 5; b++)
		{
			karel.move();
		}

		karel.turnLeft();

		for(int b = 0; b < 5; b++)
		{
			karel.move();
		}

		turnRight(karel);

		for(int c = 0; c < 3; c++)
		{
			karel.move();
		}

		turnRight(karel);

		for(int d = 0; d < 6; d++)
		{
			karel.move();
		}

		turnRight(karel);

		for(int d = 0; d < 6; d++)
		{
			karel.move();
		}

		karel.turnLeft();
		karel.turnLeft();

	}
}