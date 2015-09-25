package pacman;

public class Dot extends Item {
    
    @Override
    public String action() {
        return "subtractDot";
    }
    
    Dot() {
        setDisplayChar('.');
    }
}