package battle_ship;
import java.util.*;
public class Board implements Display {
	private ArrayList<ArrayList<GridSpace>> board = new ArrayList<ArrayList<GridSpace>>();
	public static final int NUM_ROWS =10;
	public static final int NUM_COLS = 10;
	private BattleShip bs;
	private Carrier harry;
	private Cruiser ted;
	private Submarine U_Boat;
	private /* Star */Destroyer executor;
	
	public void makeShips() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Where would you like to place your battleship?");
		System.out.print("X: ");
		int x = sc.nextInt();
		System.out.print(" Y: ");
		int y = sc.nextInt();
		System.out.println();	
		System.out.print("down, up, left, right? ");
		String dir = sc.nextLine();
		bs=new BattleShip(x,y,dir);
		this.set_ships(bs);		
		
	}
	public void set_ships(Boat ship) {
		int y = ship.getRow();
		int x = ship.getCol();
		int length = ship.getLength();
		String direction = ship.getDirection();
		String type = ship.getType();
		if (direction.equals("down"){
			for(int i=0;i<length-1;i++){
				board.get(y).set(x+1, //TODO TODO TODO 
			}
		
	}
	public void populateBoard() {
		for(int i = 0; i <= 9; i++) {
			ArrayList<GridSpace> row = new ArrayList<GridSpace>();
			for(int k = 0; k <= 9; k++) {
				row.add(new GridSpace());	
			}
				board.add(row);
		}
	}
	public void display (){
		for(int i = 0; i <= 9;i++) {
			for(int k=0; k <=9;k++) {
				if(board.get(i).get(k).type == null) {
					System.out.print("o");
				}
			}
			System.out.println();
		}
	}
	public Board () {
		this.populateBoard();		
	}
}
