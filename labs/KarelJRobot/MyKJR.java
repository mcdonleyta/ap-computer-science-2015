package kareltherobot;

public class MyKJR implements Directions
{
	private static void turnRight(Robot r) {
		r.turnLeft();
		r.turnLeft();
		r.turnLeft();
	}
	
    public static void main(String[] args) {
        World.reset();
        World.readWorld("mazeworld.kwld");
        World.setTrace(true);
        World.setVisible(true);
        Robot rob = new Robot(1, 1, North, 3);  
        rob.move();
        rob.move();
        rob.move();
        rob.move();
        rob.move();
        turnRight(rob);
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.move();
        
    }
}
