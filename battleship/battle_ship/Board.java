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

		
	/* IVE CURRENTLY DECIDED TO AUTOGENERATE THE MAP; USER INPUT HAS TOO MANY CORNER CASES FOR NOW. WILL IMPLEMENT AFTER CORE FUNCTIONALITY
	public void makeShips(int i) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		String dir;
		System.out.println("Your ships will be placed in the order of: Battleship,Carrier, Cruiser, Submarine, Destroyer");
		while(i<5) {
		System.out.print("Where would you like to place your ship? " );
		System.out.print("X: ");	
		x = sc.nextInt();
		System.out.print("Y: ");
		y = sc.nextInt();
		System.out.println();	
		System.out.print("down, up, left, right? ");
		dir = sc.next();
			if(i==0) {
			bs=new BattleShip(y,x,dir);
			this.set_ships(bs);	
		}
			else if(i==1) {
			harry=new Carrier(y,x,dir);
			this.set_ships(harry);
		}
			else if(i==2) {
				ted= new Cruiser(y,x,dir);
				this.set_ships(ted);
		}
			else if(i==3) {
				U_Boat=new Submarine(y,x,dir);
				this.set_ships(U_Boat);
		}
			else {
				executor= new Destroyer(y,x,dir);
				this.set_ships(executor);
		}
		i++;
		this.display();				
			}
			
	}
		
	private Boat fixShips(Boat ship) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("Where would you like to place your ship? " );
		System.out.print("X: ");	
		x = sc.nextInt();
		System.out.print("Y: ");
		y = sc.nextInt();
		ship.setRow(y);
		ship.setCol(x);	
		return ship;
	}	
	private void set_ships(Boat ship) {
		int y = ship.getRow();
		int x = ship.getCol();
		int length = ship.getLength();
		String direction = ship.getDirection();
		String type = ship.getType();			
		if (direction.equals("down")){
			if(y+length > 10) {
				//DO SOMETHING HERE TO HANDLE ERROR
				}
			for(int i=0;i<length;i++){
				board.get(y).set(x,new GridSpace(ship));
				y++;
			}
		}
		
		else if(direction.equals("up")) {
			if(y-length <0) {
				//DO SOMETHING TO HANDLE ERROR	
			}
			for(int i = 0; i<length-1;i++) {
				board.get(y).set(x,new GridSpace(ship));
				y--;
			}
		}
		else if(direction.equals("left")) {
			if(x-length <0){
				//TODO				
			}
			for
			
			
		}
		
	}
	*/
	public void makeShipsPlayer1() {
		ArrayList<Boat> blist = new ArrayList<Boat>();
		blist.add(bs=new BattleShip(0,0,"down"));
		blist.add(harry = new Carrier(2,3,"right")); //y,x
		blist.add(ted = new Cruiser(5,5,"down"));
		blist.add(U_Boat= new Submarine(9,2,"right"));
		blist.add(executor = new Destroyer(6,3,"down"));
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
		ArrayList<Boat> blist = new ArrayList<Boat>();
		blist.add(bs);
		blist.add(harry);
		blist.add(ted);
		blist.add(U_Boat);
		blist.add(executor);
		for(int i =0; i<blist.size()-1; i++) {
			if(blist.get(i).getLife() <= 0) {
				Boat temp = blist.get(i);
				blist.remove(blist.get(i));
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
