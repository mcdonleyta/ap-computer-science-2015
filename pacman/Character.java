package pacman;
import pacman.*;

public class Character extends Entity {

	int cordX, cordY;

	public void setX(int newX) {
		cordX = newX;
	}

	public void setY(int newY) {
		cordY = newY;
	}

	public int getX() {
		return cordX;
	}

	public int getY() {
		return cordY;
	}
}