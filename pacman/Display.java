package pacman;

import pacman.*;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Display {

	private int screenHeight = 33;
	private int screenWidth = 31;

	private List< List<Entity> > DisplayEntities = new ArrayList<List<Entity>>();

	public FileReader fileIn;
	public BufferedReader textIn;

	public void setList() throws IOException{

		System.out.println("Running");
		
		fileIn = new FileReader(new File(getClass().getResource("board.txt").getPath()));
		textIn = new BufferedReader(fileIn);
		char[] currentChars = new char[screenWidth];
		String str;
		List<Entity> curList = new ArrayList<Entity>();
		Entity curEntity = new Entity();

		for(int row = 0; row < screenHeight; row++) {
			curList = new ArrayList<Entity>();
			str = textIn.readLine();
			currentChars = str.toCharArray();
			for(int col = 0; col < screenWidth; col++) {
				curEntity = new Entity();
				if(currentChars[col] == '#') {
					curEntity.setActive(false);
					curEntity.setDisplayEntity(124);
				}
				else if(currentChars[col] == '.') {
					curEntity.setActive(true);
					curEntity.setDisplayEntity(46);
				}
				else {
					curEntity.setActive(true);
					curEntity.setDisplayEntity(32);
				}
				curList.add(curEntity);

			}
			DisplayEntities.add(curList);
		}

	}

	public String processMove(int playerX, int playerY) {
		String retString = " ";

		if(DisplayEntities.get(playerY).get(playerX).getActive() == false) {
			retString = "!Block";
		}
		return retString;
	}

	public String outList(int playerX, int playerY, char playerEntity) {
		String retString = " ";
		for(int outRow = 0; outRow < screenHeight; outRow++) {
			for(int outCol = 0; outCol < screenWidth; outCol++) {
				if(outRow == playerY && outCol == playerX && DisplayEntities.get(outRow).get(outCol).getDisplayEntity() == '.') {
					System.out.printf("%s ", playerEntity);
					DisplayEntities.get(outRow).get(outCol).setDisplayEntity(' ');
					retString = "plus_1";
				}
				else if(outRow == playerY && outCol == playerX) {
					System.out.printf("%s ", playerEntity);
				}
				else{
					System.out.printf("%s ", DisplayEntities.get(outRow).get(outCol).getDisplayEntity());
				}
			}
			System.out.println();
		}
		return retString;
	}

}
