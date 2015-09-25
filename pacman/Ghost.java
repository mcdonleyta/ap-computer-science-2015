package pacman;

import java.util.ArrayList;
import java.lang.Math;

public class Ghost extends Lurker {
    
    private boolean exitedBox;
    
    public void exitFromBox(ArrayList<ArrayList<Entity>> map) {
        map.get(pos.y).set(pos.x, new Entity());
        pos.x = 13;
        pos.y = 11;
        exitedBox = true;
    }
    
    public boolean isOutOfBox() {
        return exitedBox;
    }
    
    private boolean isUpValid(ArrayList<Pos> ghostPoss, ArrayList<ArrayList<Entity>> map) {
        boolean ghostInWay = false;
        for(Pos ghostPos : ghostPoss) {
            if(ghostPos.x == pos.x && ghostPos.y == pos.y-1) {
                ghostInWay = true;
            }
        }
        return !ghostInWay && pos.y > 0 && map.get(pos.y-1).get(pos.x).getDisplayChar() != '▯' && map.get(pos.y-1).get(pos.x).getDisplayChar() != '-';
    }
    
    private boolean isDownValid(ArrayList<Pos> ghostPoss, ArrayList<ArrayList<Entity>> map) {
        boolean ghostInWay = false;
        for(Pos ghostPos : ghostPoss) {
            if(ghostPos.x == pos.x && ghostPos.y == pos.y+1) {
                ghostInWay = true;
            }
        }
        return !ghostInWay && pos.y < map.size()-1 && map.get(pos.y+1).get(pos.x).getDisplayChar() != '▯' && map.get(pos.y+1).get(pos.x).getDisplayChar() != '-';
    }
    
    private boolean isLeftValid(ArrayList<Pos> ghostPoss, ArrayList<ArrayList<Entity>> map) {
        boolean ghostInWay = false;
        for(Pos ghostPos : ghostPoss) {
            if(ghostPos.x == pos.x-1 && ghostPos.y == pos.y) {
                ghostInWay = true;
            }
        }
        return !ghostInWay && pos.x > 0 && map.get(pos.y).get(pos.x-1).getDisplayChar() != '▯' && map.get(pos.y).get(pos.x-1).getDisplayChar() != '-';
    }
    
    private boolean isRightValid(ArrayList<Pos> ghostPoss, ArrayList<ArrayList<Entity>> map) {
        boolean ghostInWay = false;
        for(Pos ghostPos : ghostPoss) {
            if(ghostPos.x == pos.x+1 && ghostPos.y == pos.y) {
                ghostInWay = true;
            }
        }
        return !ghostInWay && pos.x < map.get(pos.y).size()-1 && map.get(pos.y).get(pos.x+1).getDisplayChar() != '▯' && pos.x < map.get(pos.y).size()-1 && map.get(pos.y).get(pos.x+1).getDisplayChar() != '-';
    }
    
    String deferring; //if deferring, ghost is taking indirect path (because wall is in way, in direction of deferrence)
    
    public String determineMove(Pos playerPos, ArrayList<Pos> ghostPoss, boolean isSuper, ArrayList<ArrayList<Entity>> map) {
        String direction = "none";
        
        if(isSuper && (Math.abs(playerPos.x-pos.x) < 3 || Math.abs(playerPos.y-pos.y) < 3)) { //should flee from super player
            if(playerPos.x-pos.x < 3 && playerPos.x-pos.x > 0) {
                if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                } else if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                } else if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                }
            } else if(pos.x-playerPos.x < 3 && pos.x-playerPos.x > 0) {
                if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                } else if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                } else if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                }
            } else if(playerPos.y-pos.y < 3 && playerPos.y-pos.y > 0) {
                if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                } else if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                } else if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                }
            } else if(pos.y-playerPos.y < 3 && pos.y-playerPos.y > 0) {
                if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                } else if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                } else if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                }
            } //begin non-super-related choices
        } else if(playerPos.x >= pos.x && playerPos.y >= pos.y) { //down right
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y)) {
                if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                    deferring = "none";
                } else if(isDownValid(ghostPoss, map) && !deferring.equals("down")) {
                    direction = "down";
                } else if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                    deferring = "down";
                } else if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                    deferring = "down";
                }
            } else {
                if(isDownValid(ghostPoss, map)) { // begins chain if down distance is farther than right distance
                    direction = "down";
                    deferring = "none";
                } else if(isRightValid(ghostPoss, map) && !deferring.equals("right")){
                    direction = "right";
                } else if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                    deferring = "right";
                } else if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                    deferring = "right";
                }
            }
        } else if(playerPos.x >= pos.x && playerPos.y <= pos.y) { //up right
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y)) {
                if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                    deferring = "none";
                } else if(isUpValid(ghostPoss, map)  && !deferring.equals("up")) {
                    direction = "up";
                } else if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                    deferring = "up";
                } else if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                    deferring = "up";
                }
            } else {
                if(isUpValid(ghostPoss, map)) { // begins chain if up distance is farther than right distance
                    direction = "up";
                    deferring = "none";
                } else if(isRightValid(ghostPoss, map) && !deferring.equals("right")){
                    direction = "right";
                } else if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                    deferring = "right";
                } else if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                    deferring = "right";
                }
            }
        } else if(playerPos.x <= pos.x && playerPos.y >= pos.y) { //down left
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y)) {
                if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                    deferring = "none";
                } else if(isDownValid(ghostPoss, map) && !deferring.equals("down")) {
                    direction = "down";
                } else if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                    deferring = "down";
                } else if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                    deferring = "down";
                }
            } else {
                if(isDownValid(ghostPoss, map)) { // begins chain if down distance is farther than left distance
                    direction = "down";
                    deferring = "none";
                } else if(isLeftValid(ghostPoss, map) && !deferring.equals("left")){
                    direction = "left";
                } else if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                    deferring = "left";
                } else if(isUpValid(ghostPoss, map)) {
                    direction = "up";
                    deferring = "left";
                }
            }
        } else { //up left
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y)) {
                if(isLeftValid(ghostPoss, map)) {
                    direction = "left";
                    deferring = "none";
                } else if(isUpValid(ghostPoss, map) && !deferring.equals("up")) {
                    direction = "up";
                } else if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                    deferring = "up";
                } else if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                    deferring = "up";
                }
            } else {
                if(isUpValid(ghostPoss, map)) { // begins chain if up distance is farther than left distance
                    direction = "up";
                    deferring = "none";
                } else if(isLeftValid(ghostPoss, map) && !deferring.equals("left")){
                    direction = "left";
                } else if(isRightValid(ghostPoss, map)) {
                    direction = "right";
                    deferring = "left";
                } else if(isDownValid(ghostPoss, map)) {
                    direction = "down";
                    deferring = "left";
                }
            }
        }
        
        return direction;
    }
    
    @Override
    public void kill(ArrayList<ArrayList<Entity>> map) {
        map.get(pos.y).set(pos.x, new Entity());
        pos.x = 13;
        pos.y = 11;
    }
    
    
    Ghost(int _initialx, int _initialy) {
        setDisplayChar('?');
        pos = new Pos();
        
        initialPos = new Pos();
        
        initialPos.x = _initialx;
        initialPos.y = _initialy;
        pos.x = initialPos.x;
        pos.y = initialPos.y;
        
        exitedBox = false;
        deferring = "none";
    }
}