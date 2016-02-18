import brainFreakInterpreter.*;

import java.util.*;
import java.util.Scanner;

public class Driver
{
	
	public static void main(String[] args)
	{
		BrainFreakInterpret interpreter = new BrainFreakInterpret();
		Scanner scan = new Scanner(System.in);
		interpreter.run(scan.nextLine());
	}
}
