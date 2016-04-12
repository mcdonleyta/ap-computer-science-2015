package pacman;
import java.util.ArrayList;

public class Lurker extends Entity{

    Pos pos;
    Pos initialPos;
    
    private void moveUp(ArrayList<ArrayList<Entity>> map) {
        pos.y--;
    }
        
    private void moveDown(ArrayList<ArrayList<Entity>> map) {
        pos.y++;
    }
        
    private void moveLeft(ArrayList<ArrayList<Entity>> map) {
        pos.x--;
    }
        
    private void moveRight(ArrayList<ArrayList<Entity>> map) {
        pos.x++;
    }
    
    public String doMove(String direction, ArrayList<ArrayList<Entity>> map) {
        if(direction.equals("up") && pos.y > 0 && map.get(pos.y-1).get(pos.x).getDisplayChar() != '▯' && map.get(pos.y-1).get(pos.x).getDisplayChar() != '-') {
                moveUp(map);
            } else if(direction.equals("down") && pos.y < map.size()-1 && map.get(pos.y+1).get(pos.x).getDisplayChar() != '▯' && map.get(pos.y+1).get(pos.x).getDisplayChar() != '-') {
                moveDown(map);
            } else if(direction.equals("left") && pos.x > 0 && map.get(pos.y).get(pos.x-1).getDisplayChar() != '▯' && map.get(pos.y).get(pos.x-1).getDisplayChar() != '-') {
                moveLeft(map);
            } else if(direction.equals("right") && pos.x < map.get(pos.y).size()-1 && map.get(pos.y).get(pos.x+1).getDisplayChar() != '▯' && pos.x < map.get(pos.y).size()-1 && map.get(pos.y).get(pos.x+1).getDisplayChar() != '-') {
                moveRight(map);
            } else if(direction.equals("right") && pos.x == 27 && pos.y == 14) { //wrap around
                pos.x = 0;
                map.get(pos.y).set(pos.x, new Entity());
            } else if(direction.equals("left") && pos.x == 0 && pos.y == 14) { //wrap around
                pos.x = 27;
                map.get(pos.y).set(pos.x, new Entity());
            }
        return "none"; // only returns action if object is player; handled in player class.
    }
    
    public void kill(ArrayList<ArrayList<Entity>> map) {
        map.get(pos.y).set(pos.x, new Entity());
        pos.x = initialPos.x;
        pos.y = initialPos.y;
    }
    
    Lurker() {
        pos = new Pos();
        
    }
    
}