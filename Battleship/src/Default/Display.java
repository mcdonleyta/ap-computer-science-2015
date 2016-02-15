package Default;

import Default.Obj.Board;
import Default.Obj.GridSpace;

import java.util.Scanner;

public class Display {

    private Scanner inInt;
    private Scanner inString;

    public GridSpace playerMove(Boolean isFail, String playerName) {
        int x, y;
        if(isFail) {
            System.out.println("Invalid move, please try again");
        }
        System.out.println(playerName + "'s turn");
        System.out.print("X: ");
        x = inInt.nextInt();
        System.out.print("\nY: ");
        y = inInt.nextInt();
        return new GridSpace(x, y);
    }

    //Returns a String made of the starting x and y position and the Direction ex: 36South
    public String playerAddBoat(Boolean isFail, String boatName) {
        int startX, startY;
        String Direction;
        String d = "";
        if(isFail)
            System.out.println("Invalid Boat, try again");
        else
            System.out.println("Please make a new " + boatName);
        System.out.print("Starting X position: ");
        startX = inInt.nextInt() - 1;
        System.out.print("\nStarting Y position: ");
        startY = inInt.nextInt() - 1;
        System.out.print("\nDirection based on the W, A, S, and D keys: ");
        d = inString.nextLine();
        switch(d) {
            case "w":
                Direction = "North";
                break;
            case "a":
                Direction = "West";
                break;
            case "s":
                Direction = "South";
                break;
            case "d":
                Direction = "East";
                break;
            default:
                Direction = "None";
                break;
        }
        return Integer.toString(startX) + Integer.toString(startY) + Direction;
    }

    public void printBoard(Board b) {
        for(int i = 9; i >= 0; i--) {
            System.out.print(i + 1 + "  ");
            if(i < 9)
                System.out.print(" ");
            for(int j = 0; j < 10; j++) {
                System.out.print(b.get(j, i).getIcon() + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("    ");
        for(int k = 0; k < 10; k++) {
            System.out.print(k + 1 + " ");
        }
        System.out.println("\n");
    }

    public String input(String q) {
        System.out.print(q + ": ");
        String ret = inString.nextLine();
        System.out.println();
        return ret;
    }

    public Display() {
        inInt = new Scanner(System.in);
        inString = new Scanner(System.in);
    }

}
