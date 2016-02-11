package battle_ship;
import java.util.*;
public abstract class Boat {
	private int row, col;
	private String directionVector;
	protected int length;
	protected String type = "";
	
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

}
