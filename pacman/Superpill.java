package pacman;

public class Superpill extends Item {
        
    @Override
    public void action() {
        Pacman.map.decrementNumberOfDots();
    }
    
    Superpill() {
        setDisplayChar('@');
    }
}