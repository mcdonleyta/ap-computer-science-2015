package pacman;

public class Superpill extends Item {
        
    @Override
    public String action() {
        return "super";
    }
    
    Superpill() {
        setDisplayChar('@');
    }
}