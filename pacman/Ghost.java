package pacman;

public class Ghost extends Lurker {
    
    public void exitFromBox() {
        Pacman.map.entities.get(pos.y).set(pos.x, new Entity());
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
    }
}