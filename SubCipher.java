import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.util.*;

public class SubCipher
{
	public static void main(String[] args)
	{
		String input;
		List<Integer> units = new ArrayList<Integer>();
		int[] intUnits;
		
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		
		intUnits = new int[input.length()];
		for(int i=0; i<input.length(); i++)
		{
			intUnits[i] = input.charAt(i)+1;
		}
		for(int i=0; i<input.length(); i++)
		{
			char unit = (char) intUnits[i];
			System.out.print(unit);
		}
		
	}
}
