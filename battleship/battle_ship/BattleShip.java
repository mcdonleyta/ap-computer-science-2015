package battle_ship;
public class BattleShip extends Boat{
public BattleShip(int row_i, int col_i, String directionVector_i) {
	super(row_i,col_i,directionVector_i);
	super.length = 4;
	super.type = "battleship";
	super.id = 0;
	super.life = 4;


}
}
