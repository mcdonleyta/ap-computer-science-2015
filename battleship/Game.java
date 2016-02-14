import battle_ship.*;
import java.util.*;
public class Game {
	public static void main(String[] args) { //the size of this main brings me back to my early programming days with 500+ line mains lol
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a battleship game");
		Board boardP1 = new Board();
		boardP1.makeShipsPlayer1();
		Board boardP2 = new Board();
		boardP2.makeShipsPlayer2();
		System.out.println("Please Pass to Player 1");
		System.out.println("Are you Player 1? y/n");
		int i=0;
		while(i==0) {
		String confirm = sc.next();
		if(confirm.contains("y")) { 
			System.out.println("This is your board");
			boardP1.display();
			i++;
		}
		else 
			System.out.println("Please input y/n");
		}
		try {
		System.in.read(); //where was this my whole life this is very useful
		}
		catch(Exception e) {
		}
		for(int k= 0; k<50;k++) {
			System.out.println();
		}
		System.out.println("Please Pass to Player 2");
		System.out.println("Are you Player 2? y/n");
		i=0;
		while(i==0) {
		String confirm = sc.next();
		if(confirm.contains("y")) {
			System.out.println("This is your board");
			boardP1.display();
			i++;
		}
		else 
			System.out.println("Please input y/n");
		}
		try {
		System.in.read(); //where was this my whole life this is very useful
		}
		catch(Exception e) {
		}
		for(int k= 0; k<50;k++) {
			System.out.println();
		}
		System.out.println("Lets begin");		
		boolean wins = false;
		while(!wins) {
		System.out.println("Please pass to Player 1"); 
		System.out.println("Are you Player 1? y/n");
		int j=0;
		while(j==0) {
		String confirm = sc.next();
		if(confirm.contains("y")) { 
			boardP1.display();
			System.out.print("Where would you like to fire? x,y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			boardP2.shotsFired(x,y);
			Boat e = boardP2.checkLife();
			if(e!=null) 
				System.out.println("You sank my " + e);			
		
			if(boardP2.areBoatsKill()) {
				System.out.print("PLAYER 1 WINS!!!!!111!!11!1!!1!!!!");
				wins = true;
			}
			j++;
		}
		else 
			System.out.println("Please input y/n");
		}
		try {
		System.in.read();
		}
		catch(Exception e) {
		}
		for(int k= 0; k<50;k++) {
			System.out.println();
		}
		System.out.println("Please pass to Player 2");
		System.out.println("Are you Player 2? y/n");
		j=0;
		while(j==0) {
		String confirm = sc.next();
		if(confirm.contains("y")) { 
			boardP2.display();
			System.out.print("Where would you like to fire? x,y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			boardP1.shotsFired(x,y);
			Boat e = boardP1.checkLife();
			if(e!=null) 
				System.out.println("You sank my" + e);			
		
			if(boardP1.areBoatsKill()) {
				System.out.print("PLAYER 2 WINS!!!!!111!!11!1!!1!!!!");
				wins = true;
			}
			j++;
		}
		else 
			System.out.println("Please input y/n");
		}
		try {
		System.in.read();
		}
		catch(Exception e) {
		}
		for(int k= 0; k<50;k++) {
			System.out.println();
		}
		
	}
	}



}
