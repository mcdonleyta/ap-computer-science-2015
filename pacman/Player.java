package pacman;

import java.util.ArrayList;

public class Player extends Lurker {
        
    private String moveUp(ArrayList<ArrayList<Entity>> map) {
        String action;
        action = map.get(pos.y-1).get(pos.x).action();
        pos.y--;
        map.get(pos.y).set(pos.x, new Entity());
        return action;
    }
        
    private String moveDown(ArrayList<ArrayList<Entity>> map) {
        String action;
        action = map.get(pos.y+1).get(pos.x).action();
        pos.y++;
        map.get(pos.y).set(pos.x, new Entity());
        return action;
    }
        
    private String moveLeft(ArrayList<ArrayList<Entity>> map) {
        String action;
        action = map.get(pos.y).get(pos.x-1).action();
        pos.x--;
        map.get(pos.y).set(pos.x, new Entity());
        return action;
    }
        
    private String moveRight(ArrayList<ArrayList<Entity>> map) {
        String action;
        action = map.get(pos.y).get(pos.x+1).action();
        pos.x++;
        map.get(pos.y).set(pos.x, new Entity());
        return action;
    }
    
    @Override
    public String doMove(String direction, ArrayList<ArrayList<Entity>> map) {
        String action = "none";
        if(direction.equals("up") && pos.y > 0 && map.get(pos.y-1).get(pos.x).getDisplayChar() != '▯' && map.get(pos.y-1).get(pos.x).getDisplayChar() != '-') {
                action = moveUp(map);
            } else if(direction.equals("down") && pos.y < map.size()-1 && map.get(pos.y+1).get(pos.x).getDisplayChar() != '▯' && map.get(pos.y+1).get(pos.x).getDisplayChar() != '-') {
                action = moveDown(map);
            } else if(direction.equals("left") && pos.x > 0 && map.get(pos.y).get(pos.x-1).getDisplayChar() != '▯' && map.get(pos.y).get(pos.x-1).getDisplayChar() != '-') {
                action = moveLeft(map);
            } else if(direction.equals("right") && pos.x < map.get(pos.y).size()-1 && map.get(pos.y).get(pos.x+1).getDisplayChar() != '▯' && pos.x < map.get(pos.y).size()-1 && map.get(pos.y).get(pos.x+1).getDisplayChar() != '-') {
                action = moveRight(map);
            } else if(direction.equals("right") && pos.x == 27 && pos.y == 14) { //wrap around
                action = map.get(14).get(27).action();
                pos.x = 0;
                map.get(pos.y).set(pos.x, new Entity());
            } else if(direction.equals("left") && pos.x == 0 && pos.y == 14) { //wrap around
                action = map.get(14).get(0).action();
                pos.x = 27;
                map.get(pos.y).set(pos.x, new Entity());
            }
        return action;
    }
    
    
    Player(int _initialx, int _initialy) {
        setDisplayChar('c');
        pos = new Pos();
        initialPos = new Pos();
        
        initialPos.x = _initialx;
        initialPos.y = _initialy;
        pos.x = initialPos.x;
        pos.y = initialPos.y;
    }
        
}