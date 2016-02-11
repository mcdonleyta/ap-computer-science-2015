package battle_ship;
public class Carrier extends Boat {
	public Carrier(int row_1, int col_i, String directionVector_i) {
		super(row_i,col_i,directionVector_i);
		super.length = 5;
		super.type = "carrier";
	}
}
