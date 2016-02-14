package battle_ship;
public class Destroyer extends Boat {
	public Destroyer(int row_i, int col_i, String directionVector_i) {
		super(row_i,col_i,directionVector_i);
		super.length = 2;
		super.type = "destroyer";
		super.id = 4;
		super.life = 2;
	}
}
