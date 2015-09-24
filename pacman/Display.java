package pacman;

import pacman.*;
import java.util.*;

public class Display {

	private int screenHeight = 33;
	private int screenWidth = 30;

	private List< List<Entity> > DisplayEntities = new ArrayList<List<Entity>>();

	public void setList() {
		for(int row = 0; row < screenHeight; row++) {
			List<Entity> myBoardRow = new ArrayList<Entity>();
			for(int col = 0; col < screenWidth; col++) {
				Entity myEntity = new Entity();
				if(col == 0 || col == 29 || row == 0 || row == 32) {
					myEntity.setDisplayEntity('#');
					myEntity.setActive(false);
				}
				else {
					myEntity.setDisplayEntity('.');
					myEntity.setActive(true);
				}
				myBoardRow.add(myEntity);
			}
			DisplayEntities.add(myBoardRow);
		}
	}

	public String processMove(int playerX, int playerY) {
		String retString = " ";

		if(DisplayEntities.get(playerY).get(playerX).getActive() == false) {
			retString = "!Block";
		}
		return retString;
	}

	public void outList(int playerX, int playerY, char playerEntity) {
		for(int outRow = 0; outRow < screenHeight; outRow++) {
			for(int outCol = 0; outCol < screenWidth; outCol++) {
				if(outRow == playerY && outCol == playerX) {
					System.out.printf("%s ", playerEntity);
					DisplayEntities.get(outRow).get(outCol).setDisplayEntity('0');
				}
				else{
					System.out.printf("%s ", DisplayEntities.get(outRow).get(outCol).getDisplayEntity());
				}
			}
			System.out.println();
		}
	}

}
