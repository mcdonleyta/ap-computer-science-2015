import pack.*;
import java.util.Scanner;

public class Driver
{
	public static void main(String args[])
	{
		TapeMachine tape = new TapeMachine();
		tape.run("+++");
	}
}