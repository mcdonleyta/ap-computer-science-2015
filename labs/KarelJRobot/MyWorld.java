package kareltherobot;

public class MyWorld implements Directions {
	public static void main(String[] args) {
		World.reset();
		World.readWorld("/home/ben/Documents/PacMan/ap-computer-science-2015/labs/KarelJRobot", "stairworld.kwld");
		World.setTrace(true);
		World.setVisible(true);
		Robot karel = new Robot(1,2,East,3);
	}
}