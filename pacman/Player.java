package pacman;
import pacman.*;
import java.util.*;

public class Player extends Character {

	int oldX, oldY, score = 0;
	Scanner getIn = new Scanner(System.in);

	public void Input() {
		int changeX = 0, changeY = 0;
		String placeHold = getIn.nextLine();

		switch(placeHold) {
			case "w":
				changeY = -1;
				break;

			case "s":
				changeY = 1;
				break;

			case "a":
				changeX = -1;
				break;

			case "d":
				changeX = 1;
				break;

			case "quit":
				System.exit(0);
				break;
		}
		oldX = cordX;
		oldY = cordY;
		cordX = cordX + changeX;
		cordY = cordY + changeY;
	}

	public void processErr(String error) {
		if(error == "!Block") {
			cordX = oldX;
			cordY = oldY;
		}
	}

	public void addScore(String flag) {
		if(flag == "plus_1") {
			score++;
		}
		System.out.printf("Score: %d%n", score);
	}

	public Player() {
		setDisplayEntity('C');
		setActive(true);
		cordX = 1;
		cordY = 1;
	}

}