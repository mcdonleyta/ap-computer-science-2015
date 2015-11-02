package kareltherobot;

public class karelclimbsstairs implements Directions
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
		World.readWorld("stairworld.kwld");
		World.setTrace(true);
		World.setVisible(true);
		Robot karel = new Robot(1, 1, North, 5);
		karel.move();
        turnRight(karel);
		karel.move();
		karel.turnLeft();
		karel.move();
		turnRight(karel);
		karel.move();
		karel.turnLeft();
		karel.move();
		turnRight(karel);
		karel.move();
		karel.turnLeft();
	}
}
