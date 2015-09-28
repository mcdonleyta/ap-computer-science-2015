package pacman;

import pacman.*;
import java.util.*;

public class Display
{
	private List<List<Entity>> board = new ArrayList< List<Entity> >();
	private List<List<Character>> buffer = new ArrayList<List<Character>>();
	private List<MoveableEntity> moveableEntityList = new ArrayList<MoveableEntity>();
	private int screenHeight = 31;
	private int screenWidth = 28;
	public Display()
	{
		MoveableEntity pman = new MoveableEntity();
		moveableEntityList.add(pman);
		for(int row=0; row<screenHeight; row++)    //init buffer
		{
			List<Character> bufferRow = new ArrayList<Character>();
			for(int col=0; col<screenWidth; col++)
			{
				bufferRow.add('*');
			}//row is done
			buffer.add(bufferRow);
		}
		
		for(int row=0; row<screenHeight; row++)    //init board
		{
			List<Entity> boardRow = new ArrayList<Entity>();
			for(int col=0; col<screenWidth; col++)
			{
				if(col==0 || row==0 || col==27 || row==30)
				{
					boardRow.add(new Entity('#',0));
				}else
				{
					boardRow.add(new Entity());
				}
			}//row is done
			board.add(boardRow);
		}

	}
	public void draw()
	{
		for(int row=0; row<screenHeight; row++)
		{
			for(int col=0; col<screenWidth; col++)
			{
				buffer.get(row).set(col,board.get(row).get(col).getEntityChar());
			}
		}
		for(MoveableEntity me : moveableEntityList)
		{
			buffer.get(me.getXpos()).set(me.getYpos(),me.getMoveableEntityChar());
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
