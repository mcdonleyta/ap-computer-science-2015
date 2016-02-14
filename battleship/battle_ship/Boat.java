package battle_ship;
import java.util.*;
public abstract class Boat {
	private int row, col;
	private String directionVector;
	protected int length; //honestly ive never used protected so i wanted to see how it works
	protected String type = "";
	protected int id=0;
	protected int life; 
	
	public Boat (int starting_row_i, int starting_col_i, String directionVector_i) {
		row = starting_row_i;
		col=starting_col_i;
		directionVector=directionVector_i;
	}
	public int getRow () {
		
		return row;
	}
	public int getCol() {
		return col;
	}
	public int getLength() {
	return length;
}
	public String getDirection() {
		return directionVector;
	}
	public String getType() {
		return type;
	}
	public void setRow(int r) {
		row = r;
	}
	public void setCol(int c) {
		col = c;
	}
	public int getID() {
		return id;
	}
	public void decrementLife() {
	life--;	
	}
	public String toString() {
		return type;
	}
	public int getLife() {
		return life;
	}

}
