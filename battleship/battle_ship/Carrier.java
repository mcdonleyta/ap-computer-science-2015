package battle_ship;
import battle_ship.*;
public class Carrier extends Boat {
	public Carrier(int row_i, int col_i, String directionVector_i) {
		super(row_i,col_i,directionVector_i);
		super.length = 5;
		super.type = "carrier";
		super.id = 1;
		super.life = 5;
	}
}
