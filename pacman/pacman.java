import Pacman.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class pacman
{
	public static void main(String[] args)
	{
		String player_input = new Scanner(System.in);
		Entity entity = new Entity();
		Display display = new Display();
		Buffer buffer = new Buffer();
		Move_Entities movement = new Move_Entities();
		//System.out.println("Hello world");
		display.draw();
	}
}