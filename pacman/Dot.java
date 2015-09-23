package pacman;

public class Dot extends Item {
    
    @Override
    public void action() {
        Pacman.map.decrementNumberOfDots();
    }
    
    Dot() {
        setDisplayChar('.');
    }
}