package pacman;

public class Pacman {
    
    public static Map map;
    
    public static void main(String[] args) {

        map = new Map();
        while(!map.didWin()) {
            map.display();
            map.doTurn();
        }
        
        
    }
}