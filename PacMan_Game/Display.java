package PacMan_Game;

import PacMan_Game.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Display{
	private int screenHeight = 31;
	private int screenWidth = 28;
	private List<List<Entity> > map = new ArrayList<List<Entity>>();
	private List< List<Entity> > buffer = new ArrayList< List<Entity>>();
	public int playerposx = 14;
	public int playerposy = 16;
	
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
		int xcordcheck;
		int ycordcheck;
		for(int row = 0; row <screenHeight; row++)
		{
			for(int col = 0; col < screenWidth; col++)
			{
				
				List<List<Entity> > buffer = map;
				if(col == playerposx && row == playerposy)
				{
					System.out.print(buffer.get(row).get(col).getCharacterEntity());
				}
				else
				{
				System.out.print(buffer.get(row).get(col).getDisplayEntity());
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
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
