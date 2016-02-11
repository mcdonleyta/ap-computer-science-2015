package PacMan_Game;

import PacMan_Game.*;
import java.util.*;
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
=======
>>>>>>> 1cb32f618aaf2da5dd4c14642e17849f9121bb50

public class Display{
	private int screenHeight = 31;
	private int screenWidth = 28;
	private List<List<Entity> > map = new ArrayList<List<Entity>>();
	private List< List<Entity> > buffer = new ArrayList<List<Entity>>();
<<<<<<< HEAD
	public int playerposx = 14;
	public int playerposy = 16;
=======
>>>>>>> 1cb32f618aaf2da5dd4c14642e17849f9121bb50
	
	public Display()
	{
		for(int i = 0; i<screenHeight; i++)
		{
			List<Entity> map_row = new ArrayList<Entity>();
			for(int j = 0; j<screenWidth; j++)
			{
				map_row.add(new Entity());
			}
			map.add(map_row);
		}
		for(int i = 0; i<screenHeight; i++)
		{
			List<Entity> buffer_row = new ArrayList<Entity>();
			buffer.add(buffer_row);
		}
	}
	public void DisplayPrint()
	{
		char printer;
<<<<<<< HEAD
		int xcordcheck;
		int ycordcheck;
=======
>>>>>>> 1cb32f618aaf2da5dd4c14642e17849f9121bb50
		for(int row = 0; row <screenHeight; row++)
		{
			for(int col = 0; col < screenWidth; col++)
			{
<<<<<<< HEAD
				
				List<List<Entity> > buffer = map;
				if(col == playerposx && row == playerposy)
				{
					System.out.print(buffer.get(row).get(col).getCharacterEntity());
				}
				else
				{
				System.out.print(buffer.get(row).get(col).getDisplayEntity());
				}
=======
				printer=map.get(row).get(col).getDisplayEntity();
				List<List<Entity> > buffer = map;
				System.out.print(buffer.get(row).get(col).getDisplayEntity());
>>>>>>> 1cb32f618aaf2da5dd4c14642e17849f9121bb50
				System.out.print(" ");
			}
			System.out.println();
		}
	}
<<<<<<< HEAD
	public void Move(String input)
	{
		switch (input) {
			case "w": playerposy = playerposy-1;
			if(playerposy == -1)
			{
				playerposy = playerposy+1;
			}
			break;
			case "a": playerposx = playerposx-1;
			if(playerposx == -1)
			{
				playerposx = playerposx+1;
			}
			break;
			case "s": playerposy = playerposy+1;
			if(playerposy == 31)
			{
				playerposy = playerposy-1;
			}
			break;
			case "d": playerposx = playerposx+1;
			if(playerposx == 28)
			{
				playerposx = playerposx-1;
			}
			break;
			default:
			break;
		}
	}
	/*public void BufferReader()
	{
		BufferedReader br = new BufferedReader(new FileReader(new File(getClass().getResource("test.txt").getPath())));
		String line;
		while((line = br.readline())!=null)
		{
			//do
		}
		}catch(Exception e){
		e.printStackTrace();
		}
		
		}*/
	}
=======
}
>>>>>>> 1cb32f618aaf2da5dd4c14642e17849f9121bb50
