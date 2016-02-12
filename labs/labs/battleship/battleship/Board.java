package battleship;

import java.util.*;

public class Board{
	
	private List<List<GridSpace>> board = new ArrayList< List<GridSpace> >();
	private List<List<Character>> buffer = new ArrayList< List<Character> >();
	private List<Boat> boatList = new ArrayList<Boat>();
	private int screenHeight = 11;
	private int screenWidth = 11;
	private int shipsAfloat;
	
	public Board()
	{
		for(int row=0; row<screenHeight; row++)    //init buffer
		{
			List<Character> bufferRow = new ArrayList<Character>();
			for(int col=0; col<screenWidth; col++)
			{
				if(col==0)
					bufferRow.add(Integer.toString(row).charAt(0));
				else bufferRow.add('~');
			}						//row is done
			buffer.add(bufferRow);
		}
		
		List<Character> bufferRow = new ArrayList<Character>();
		bufferRow.add('+');
		for(int i=0; i<screenWidth; i++)
		{
			bufferRow.add(Integer.toString(screenWidth).charAt(0));
		}
		buffer.add(bufferRow);       //last row is a row of index numbers
	}
	
	public void addAndPlaceBoats()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ships in order: battleship, cruiser, frigate, destroyer, submarine.");
		for(int i=0;i<5;i++)
		{
			System.out.print("Starting x-position: ");
			String s_xpos = scan.nextLine();
			System.out.print("Starting y-position: ");
			String s_ypos = scan.nextLine();
			System.out.print("Direction (\"1\" for vertical, \"2\" for horizontal: ");
			String s_dir = scan.nextLine();
			int dir = Integer.parseInt(s_dir);
			int xpos = Integer.parseInt(s_xpos);
			int ypos = Integer.parseInt(s_ypos);
			
			if(i==0)
			{
				if(checkIfPlaceable(xpos,ypos,dir)){
					boatList.add(new Battleship(xpos,ypos,dir));
				}else System.out.println("That's not a valid input. Please try again"); i--;
			}else
			if(i==1)
			{
				if(checkIfPlaceable(xpos,ypos,dir)){
					boatList.add(new Cruiser(xpos,ypos,dir));
				}else System.out.println("That's not a valid input. Please try again"); i--;
				
			}else
			if(i==2)
			{
				if(checkIfPlaceable(xpos,ypos,dir)){
					boatList.add(new Frigate(xpos,ypos,dir));
				}else System.out.println("That's not a valid input. Please try again"); i--;			
			}else
			if(i==3)
			{
				if(checkIfPlaceable(xpos,ypos,dir)){
					boatList.add(new Destroyer(xpos,ypos,dir));
				}else System.out.println("That's not a valid input. Please try again");	i--;	
			}else
			if(i==4)
			{
				if(checkIfPlaceable(xpos,ypos,dir)){
					boatList.add(new Submarine(xpos,ypos,dir));
				}else System.out.println("That's not a valid input. Please try again");	i--;		
			}
		}
	}
	
	private boolean checkIfPlaceable(int x, int y, int direction)
	{
		return true;
	}
	
	public void checkShipsAfloat()
	{
		for(Boat b : boatList)
		{
			if(b.isSunk())
				shipsAfloat--;
		}
	}
	
	public boolean isBoatAt(int x, int y)
	{
		for(Boat b : boatList)
		{
			if(b.getDir() == 1)
			{
				if(b.getPos().getYpos() <= y && b.getPos().getYpos() + b.getLength() > y)
				{
					return true;
				}				
			}else
			if(b.getDir() == 2)
			{
				if(b.getPos().getXpos() <= x && b.getPos().getXpos() + b.getLength() > x)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public int getShipsAfloat()
	{
		return shipsAfloat;
	}
	
	public void draw()
	{
		for(int row=0; row<screenHeight; row++)
		{
			for(int col=0; col<screenWidth; col++)
			{
				buffer.get(row).set(col,board.get(row).get(col).getIcon());
			}
		}
		for(Boat b : boatList)
		{
			if(b.getPos().getDir() == 1)
			{
				for(int i=0;i<b.getLength();i++)
				{
					buffer.get(b.getPos().getXpos()).set(b.getPos().getYpos()+i,b.getIcon(i));
				}
			}else
			if(b.getPos().getDir() == 2)
			{
				for(int i=0;i<b.getLength();i++)
				{
					buffer.get(b.getPos().getXpos()+i).set(b.getPos().getYpos(),b.getIcon(i));
				}
			}
		}
		for(int row=0; row<screenHeight; row++)
		{
			for(int col=0; col<screenWidth; col++)
			{
				System.out.print(buffer.get(row).get(col));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
		
