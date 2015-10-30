package kareltherobot;
public class mazeFinisher implements Directions {
	public static void main(String[] args) {
		World.reset();
		World.readWorld("/home/ben/Documents/PacMan/ap-computer-science-2015/labs/KarelJRobot","MyMap.kwld");
		World.setTrace(true);
		World.setVisible(true);
		Robot karel = new Robot (1,1,East,3);
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		turnRight(karel);
		karel.move();
		karel.move();
		turnRight(karel);
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();	
		karel.move();
		turnRight(karel);
		karel.move();
		karel.move();
		karel.move();
		turnRight(karel);
		karel.move();
		karel.move();
		turnRight(karel);
		karel.move();

	}
    public static void turnRight(Robot karel) {
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
}
	
}
		