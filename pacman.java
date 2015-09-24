import pacman.*;

public class pacman {
	
	public static void main(String[] args) {
		Display myDisplay = new Display();
		Player newPlayer = new Player();
		String error;
		int playerX, playerY;
		char characterDisplay = newPlayer.getDisplayEntity();
		newPlayer.setActive(true);
		myDisplay.setList();
		for(int i = 0; i < i + 1; i++) {
			newPlayer.Input();
			playerX = newPlayer.getX();
			playerY = newPlayer.getY();
			error = myDisplay.processMove(playerX , playerY);
			newPlayer.processErr(error);
			playerX = newPlayer.getX();
			playerY = newPlayer.getY();
			myDisplay.outList(playerX, playerY, characterDisplay);
		}
	}

}