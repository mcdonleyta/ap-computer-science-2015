import battleship.*;

import java.util.*;
import java.util.Scanner;

public class Driver
{
	
	public static void main(String[] args)
	{
		boolean good;
		Game BS = new Game();
		do{
			good = Game.playRound();          //the final method of a round determines if someone won. If someone wins,
		}while(good);						  //Game.playRound() returns "false", and the game ends.
	}
}
