package kareltherobot;

public class ownMapMaze implements Directions
{
	private static void turnRight(Robot femaleRobot)
	{
        femaleRobot.turnLeft();
        femaleRobot.turnLeft();
        femaleRobot.turnLeft();
	}
	private static void moveMultiple(int k, Robot femaleRobot)
	{
		for(int i=0; i<k; i++)
		{
			femaleRobot.move();
		}
	}
    public static void main(String[] args)
    {
        World.reset();
        World.setTrace(true);
        World.readWorld("myWorld.kwld");
        World.setVisible(true);
        Robot Carol = new Robot(1, 1, North, 4);  
        turnRight(Carol);
        Carol.putBeeper();
        moveMultiple(3,Carol);
        Carol.turnLeft();
        moveMultiple(4,Carol);
        turnRight(Carol);
        Carol.putBeeper();
        moveMultiple(5,Carol);
        Carol.turnLeft();
        moveMultiple(2,Carol);
        Carol.turnLeft();
        moveMultiple(8,Carol);
        turnRight(Carol);
        Carol.putBeeper();
        moveMultiple(2,Carol);
        turnRight(Carol);
        Carol.putBeeper();
        moveMultiple(8,Carol);
        Carol.turnLeft();
    }
}

