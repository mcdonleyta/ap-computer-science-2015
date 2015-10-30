package kareltherobot;

public class noahDirections implements Directions {

	public static void turnRight(Robot karel) {
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
	}

	public static void main(String[] args) {
		World.reset();
		World.readWorld("/home/noah/ap-computer-science-2015/labs/KarelJRobot/", "maze.kwld");
		World.repaint();
        World.setTrace(true);
        World.setVisible(true);
        Robot karel = new Robot(1, 1, North, 3);
        for(int i = 0; i < 9; i++) {
        	karel.move();
        }
        turnRight(karel);
        karel.move();
        karel.move();
        turnRight(karel);
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        for(int i = 0; i < 3; i++) {
        	karel.move();
        }
        turnRight(karel);
        for(int i = 0; i < 4; i++) {
        	karel.move();
        }
        turnRight(karel);
        for(int i = 0; i < 9; i++) {
        	karel.move();
        }
        turnRight(karel);
        for(int i = 0; i < 8; i++) {
        	karel.move();
        }
        karel.putBeeper();
	}

}