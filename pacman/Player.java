package pacman;

public class Player extends Lurker {
        
    
    
    
    Player(int _initialx, int _initialy) {
        setDisplayChar('C');
        pos = new Pos();
        initialPos = new Pos();
        
        initialPos.x = _initialx;
        initialPos.y = _initialy;
        pos.x = initialPos.x;
        pos.y = initialPos.y;
    }
        
}