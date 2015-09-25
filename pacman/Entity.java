package pacman;

public class Entity {
        
    public String action() {
        return "none";
    }
        
    private char displayChar = ' ';
        
    public char getDisplayChar() {
        return displayChar;
    }
        
    protected void setDisplayChar(char _displayChar) {
        displayChar = _displayChar;
    }
        
        
}