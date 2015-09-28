import pacman.*;
import java.io.*;

public class pacman {
	
	public static void main(String[] args) {
		Display myDisplay = new Display();
		Player newPlayer = new Player();
		String error, flag;
		int playerX, playerY;
		char characterDisplay = newPlayer.getDisplayEntity();
		newPlayer.setActive(true);
		try {
			myDisplay.setList();
		}
		catch(IOException e) {

		}
		for(int i = 0; i < i + 1; i++) {
			newPlayer.Input();
			playerX = newPlayer.getX();
			playerY = newPlayer.getY();
			error = myDisplay.processMove(playerX , playerY);
			newPlayer.processErr(error);
			playerX = newPlayer.getX();
			playerY = newPlayer.getY();
			flag = myDisplay.outList(playerX, playerY, characterDisplay);
			newPlayer.addScore(flag);
		}
	}

}