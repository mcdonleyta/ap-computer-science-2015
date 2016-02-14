package battle_ship;
public class Cruiser extends Boat {
	public Cruiser(int row_i, int col_i, String directionVector_i) {
		super(row_i,col_i,directionVector_i);
		super.length = 3;
		super.type = "cruiser";
		super.id =2;
		super.life = 3;
	}
}
