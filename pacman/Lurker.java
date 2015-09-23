package pacman;

public class Lurker extends Entity{

    Pos pos;
    Pos initialPos;
    
    private void moveUp() {
        Pacman.map.entities.get(pos.y-1).get(pos.x).action();
        pos.y--;
        Pacman.map.entities.get(pos.y).set(pos.x, new Entity());
    }
        
    private void moveDown() {
        Pacman.map.entities.get(pos.y+1).get(pos.x).action();
        pos.y++;
        Pacman.map.entities.get(pos.y).set(pos.x, new Entity());
    }
        
    private void moveLeft() {
        Pacman.map.entities.get(pos.y).get(pos.x-1).action();
        pos.x--;
        Pacman.map.entities.get(pos.y).set(pos.x, new Entity());
    }
        
    private void moveRight() {
        Pacman.map.entities.get(pos.y).get(pos.x+1).action();
        pos.x++;
        Pacman.map.entities.get(pos.y).set(pos.x, new Entity());
    }
    
    public void doMove(String direction) {
        if(direction.equals("up") && pos.y > 0 && Pacman.map.entities.get(pos.y-1).get(pos.x).getDisplayChar() != '▯' && Pacman.map.entities.get(pos.y-1).get(pos.x).getDisplayChar() != '-') {
                moveUp();
            } else if(direction.equals("down") && pos.y < Pacman.map.entities.size()-1 && Pacman.map.entities.get(pos.y+1).get(pos.x).getDisplayChar() != '▯' && Pacman.map.entities.get(pos.y+1).get(pos.x).getDisplayChar() != '-') {
                moveDown();
            } else if(direction.equals("left") && pos.x > 0 && Pacman.map.entities.get(pos.y).get(pos.x-1).getDisplayChar() != '▯' && Pacman.map.entities.get(pos.y).get(pos.x-1).getDisplayChar() != '-') {
                moveLeft();
            } else if(direction.equals("right") && pos.x < Pacman.map.entities.get(pos.y).size()-1 && Pacman.map.entities.get(pos.y).get(pos.x+1).getDisplayChar() != '▯' && pos.x < Pacman.map.entities.get(pos.y).size()-1 && Pacman.map.entities.get(pos.y).get(pos.x+1).getDisplayChar() != '-') {
                moveRight();
            }
    }
    
    public void kill() {
        Pacman.map.entities.get(pos.y).set(pos.x, new Entity());
        pos.x = initialPos.x;
        pos.y = initialPos.y;
    }
    
    Lurker() {
        pos = new Pos();
        
    }
    
}
