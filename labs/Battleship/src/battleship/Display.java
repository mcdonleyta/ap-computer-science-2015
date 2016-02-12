package battleship;

import java.util.Scanner;

/**
 * Created by jsdsp on 2/11/16.
 */
class Display {

    static void clearScreen() {
        for(int a = 0; a < 30; a++)
            System.out.println();
    }

    static void printBoard(Player p) {
        clearScreen();
        System.out.println(p.getName() + ":");
        System.out.println(" 0123456789");
        for(int a = 0; a < Board.size.x; a++) {
            System.out.print(a);
            for(int b = 0; b < Board.size.y; b++) {
                String dispChar = "~";
                for(Boat boat : p.board.boats) {
                    for (Pos space : boat.getOccupiedSpaces())
                        if(space.y == a && space.x == b)
                            dispChar = "#";
                    for(Pos space : boat.getDestroyedSpaces()) {
                        if(space.y == a && space.x == b)
                            dispChar = "X";
                    }
                }
                System.out.print(dispChar);
            }
            System.out.println();
        }
    }

    static void printEnemyShipsRemaining(Player p) {
        System.out.println("Enemy ships remaining: " + p.board.boats.size());
    }

    static Pos getShot() {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter x coord");
        int x = s.nextInt();
        System.out.println("Enter y coord");
        int y = s.nextInt();
        return new Pos(x, y);
    }

    static void showHitStatus(boolean hit) {
        System.out.println();
        if(hit)
            System.out.println("Hit!");
        else
            System.out.println("Miss!");
    }

    static void invalidInput() {
        System.out.println();
        System.out.println("Invalid Input");
    }

    static void winner(Player p) {
        System.out.println();
        System.out.println(p.getName() + " wins!");
    }

}
