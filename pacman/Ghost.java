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
    
    public String determineMove(Pos playerPos, ArrayList<Pos> ghostPoss, ArrayList<ArrayList<Entity>> map) {
        String direction = "none";
        if(playerPos.x >= pos.x && playerPos.y >= pos.y) {
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y) && isRightValid(ghostPoss, map)) {
                direction = "right";
            } else if(isDownValid(ghostPoss, map)) {
                direction = "down";
            } else if(isRightValid(ghostPoss, map)){
                direction = "right";
            }
        } else if(playerPos.x >= pos.x && playerPos.y <= pos.y) {
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y) && isRightValid(ghostPoss, map)) {
                direction = "right";
            } else if(isUpValid(ghostPoss, map)) {
                direction = "up";
            } else if(isRightValid(ghostPoss, map)){
                direction = "right";
            }
        } else if(playerPos.x <= pos.x && playerPos.y >= pos.y) {
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y) && isLeftValid(ghostPoss, map)) {
                direction = "left";
            } else if(isDownValid(ghostPoss, map)) {
                direction = "down";
            } else if(isLeftValid(ghostPoss, map)){
                direction = "left";
            }
        } else {
            if(Math.abs(playerPos.x-pos.x) > Math.abs(playerPos.y-pos.y) && isLeftValid(ghostPoss, map)) {
                direction = "left";
            } else if(isUpValid(ghostPoss, map)) {
                direction = "up";
            } else if(isLeftValid(ghostPoss, map)){
                direction = "left";
            }
        }
        
        
        return direction;
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
    }
}