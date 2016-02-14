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
			boardP2.display();
			i++;
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
			boolean valid = true;
			int x=0;
			int y=0;
			while(valid) {
			System.out.println("Where would you like to fire? x,y with 0,0 in the upper left corner");
			x = sc.nextInt();
			y = sc.nextInt();
			if (x>=10 || y>= 10) {
				System.out.println("Please enter a valid input value from 0-9");
				valid = true;
			}
			else
				valid = false;	
		}
			boardP2.shotsFired(x,y);
			Boat e = boardP2.checkLife();
			if(e!=null) 
				System.out.println("You sank my " + e);			
			if(boardP2.areBoatsKill()) {
				System.out.print("PLAYER 1 WINS!!!!!111!!11!1!!1!!!!");
				wins = true;
				break;
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
			boolean isValid = true;
			int x=0;
			int y = 0;
			while(isValid) {
			System.out.println("Where would you like to fire? x,y with 0,0 in the upper left corner");
			x = sc.nextInt();
			y = sc.nextInt();
			if(x>= 10 || y>= 10) {
				System.out.println("Please enter a valid input value from 0-9");
				isValid = true; //actually false lol bad name
			}
			else
				isValid =false;
		}
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
