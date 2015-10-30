package kareltherobot;

public class PlsWrk implements Directions
{
    public static void main (String[] args)
    {
        World.reset();
	World.readWorld("/home/ben/Documents/PacMan/ap-computer-science-2015/labs/KarelJRobot", "stairworld.kwld");
        World.setTrace(true);
        World.setVisible(true);
        Robot karel = new Robot(1, 1, East, 3); 
	karel.turnLeft();
	karel.move();
	karel.turnLeft();  // TODO: implement right turn
	karel.turnLeft();
	karel.turnLeft();
	karel.move();
	karel.turnLeft();
	karel.move();
	karel.turnLeft(); 
	karel.turnLeft();
	karel.turnLeft();
	karel.move();
	karel.turnLeft();
	karel.move();
	karel.turnLeft(); 
	karel.turnLeft();
	karel.turnLeft();
	karel.move();
	karel.turnLeft();
	karel.pickBeeper();
    }
}
