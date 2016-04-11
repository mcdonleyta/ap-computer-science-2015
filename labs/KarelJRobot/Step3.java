package kareltherobot;

public class Step3 implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setTrace(true);
        World.readWorld("stairworld.kwld");
        World.setVisible(true);
        Robot karel = new Robot(1, 1, North, 3);  
        karel.move();
        karel.putBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();  
        karel.turnLeft();
        karel.move();       
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move(); 
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();  
        karel.move();       
        karel.turnLeft();
    }
}
