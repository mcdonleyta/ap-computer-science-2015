package kareltherobot;

public class Example01 implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setTrace(true);
        World.setVisible(true);
        Robot karel = new Robot(1, 2, East, 3);  
        karel.move();
        karel.putBeeper();
        karel.move();  
        karel.move();  
        karel.move();       
        karel.turnLeft(); 
        karel.putBeeper();
        karel.move();  
        karel.move();  
        karel.move();       
        karel.putBeeper();
        karel.move();  
        karel.move();
    }
}
