package battle_ship;
public class BattleShip extends Boat{
public BattleShip(int row_1, int col_i, String directionVector_i) {
	super(row_i,col_i,directionVector_i);
	super.length = 4;
	super.type = "battleship";
}


}
