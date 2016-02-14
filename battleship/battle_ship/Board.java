package battle_ship;
import battle_ship.*;
import java.util.*;
public class Board implements Display {
	private ArrayList<ArrayList<GridSpace>> board = new ArrayList<ArrayList<GridSpace>>();
	private BattleShip bs;
	private Carrier harry; 
	private Cruiser ted; // i am very proud of this pun.
	private Submarine U_Boat; //this boat is german
	private /* Star */Destroyer executor; //hint: star wars 
	private ArrayList<Boat> chklist = new ArrayList<Boat>();

		
	/* IVE CURRENTLY DECIDED TO AUTOGENERATE THE MAP; USER INPUT HAS TOO MANY CORNER CASES FOR NOW. WILL IMPLEMENT AFTER CORE FUNCTIONALITY */
	public void makeShipsPlayer1() {
		ArrayList<Boat> blist = new ArrayList<Boat>();
		blist.add(bs=new BattleShip(0,0,"down"));
		blist.add(harry = new Carrier(2,3,"right")); //y,x
		blist.add(ted = new Cruiser(5,5,"down"));
		blist.add(U_Boat= new Submarine(9,2,"right"));
		blist.add(executor = new Destroyer(6,3,"down"));
		chklist.add(bs);
		chklist.add(harry);
		chklist.add(ted);
		chklist.add(U_Boat);
		chklist.add(executor);
		for(Boat ship:blist) {
		int y = ship.getRow();z
		int x = ship.getCol();
		int length = ship.getLength();
		String direction = ship.getDirection();
		String type = ship.getType(); 	
		if (direction.equals("down")){
			for(int i=0;i<length;i++){
				board.get(y).set(x,new GridSpace(ship));
				y++;
			}
		}
		
		else if(direction.equals("up")) {

			for(int i = 0; i<length;i++) {
				board.get(y).set(x,new GridSpace(ship));
				y--;
			}
		}
		else if(direction.equals("right")) { //left is currently not needed because right is just left with a shifted starting point
			for(int i = 0; i<length;i++) {
				board.get(y).set(x,new GridSpace(ship));
				x++;
			}
		}
		
	}
	}
	public void shotsFired(int xCoord, int yCoord) {
		if( board.get(yCoord).get(xCoord).getType() != null) {
		String type = board.get(yCoord).get(xCoord).getType().toString();
		if(type.equals("battleship")) {
			bs.decrementLife();
		}
		else if(type.equals("carrier")){
			harry.decrementLife();
		}
		else if(type.equals("cruiser")) {
			ted.decrementLife();
		}
		else if(type.equals("submarine")) {
			U_Boat.decrementLife();
		}
		else if(type.equals("destroyer")) {
			executor.decrementLife();
		}
		board.get(yCoord).get(xCoord).setType(null);
		System.out.println("Hit!");
	}
	else
		System.out.println("Miss");
	}
	public void makeShipsPlayer2() {
		ArrayList<Boat> blist = new ArrayList<Boat>();
		blist.add(bs=new BattleShip(4,1,"down"));
		blist.add(harry = new Carrier(0,0,"right")); //y,x
		blist.add(ted = new Cruiser(5,9,"down"));
		blist.add(U_Boat= new Submarine(9,2,"right"));
		blist.add(executor = new Destroyer(8,7,"down")); 		
		chklist.add(bs);
		chklist.add(harry);
		chklist.add(ted);
		chklist.add(U_Boat);
		chklist.add(executor);
		for(Boat ship:blist) {
		int y = ship.getRow();
		int x = ship.getCol();
		int length = ship.getLength();
		String direction = ship.getDirection();
		String type = ship.getType(); 	
		if (direction.equals("down")){
			for(int i=0;i<length;i++){
				board.get(y).set(x,new GridSpace(ship));
				y++;
			}
		}
		
		else if(direction.equals("up")) {

			for(int i = 0; i<length;i++) {
				board.get(y).set(x,new GridSpace(ship));
				y--;
			}
		}
		else if(direction.equals("right")) {
			for(int i = 0; i<length;i++) {
				board.get(y).set(x,new GridSpace(ship));
				x++;
			}
		}
		
	}
	
	
	}
	public Boat checkLife() {

		for(int i =0; i<chklist.size()-1; i++) {
			if(chklist.get(i).getLife() <= 0) {
				Boat temp = chklist.get(i);
				chklist.remove(chklist.get(i));
				return temp;
			}
		}
		return null;		
	}
	public boolean areBoatsKill() {
		if(bs.getLife() <=0 && harry.getLife() <= 0 && ted.getLife() <= 0 && U_Boat.getLife() <= 0 && executor.getLife() <=0) {
			return true;
		}
		else
			return false;
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
				else if(board.get(i).get(k).type !=null) {
					System.out.print("x");
				}							
				
		}
		System.out.println();
	}
	}
	public Board () {
		this.populateBoard();		
	}
}
