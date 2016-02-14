package battle_ship;
public class Submarine extends Boat {
	public Submarine(int row_i, int col_i, String directionVector_i) {
		super(row_i,col_i,directionVector_i);
		super.length = 3;
		super.type = "submarine";
		super.id = 3;
		super.life = 3;
	}
}
