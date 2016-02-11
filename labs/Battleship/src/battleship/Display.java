package battleship;

import java.util.Scanner;

/**
 * Created by jsdsp on 2/11/16.
 */
public class Display {

    public static void printBoard(Player p) {
        for(int a = 0; a < Board.size.x; a++) {
            for(int b = 0; b < Board.size.y; b++) {
                String dispChar = "~";
                for(Boat boat : p.board.boats)
                    for(Pos space : boat.getOccupiedSpaces())
                        if(space.x == a && space.y == b)
                            dispChar = "#";
                System.out.print(dispChar);
            }
            System.out.println();
        }
    }

    public static Pos getShot() {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter x coord");
        int x = s.nextInt();
        System.out.println("Enter y coord");
        int y = s.nextInt();
        return new Pos(x, y);
    }

    public static void showHitStatus(boolean hit) {
        System.out.println();
        if(hit)
            System.out.println("Hit!");
        else
            System.out.println("Miss!");
    }

    public static void invalidInput() {
        System.out.println();
        System.out.println("Invalid Input");
    }

}
