import java.util.Scanner;
import Substitution_Cipher_Classes.*;
import java.util.ArrayList;
import java.util.List;

public class S_Cipher
{
	public static void main(String[] args)
	{
		List<String> words = new ArrayList<String>();
		System.out.println("Please enter a word, phrase or string below: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int length = input.length();
		
		/*System.out.println("This is your input: " + input); used to see what input was appearing
		System.out.println("Length of string: " + length); used to check and see what length of string is appearing
		for(int i = 0; i < length; i++)
		{
			System.out.println(input.charAt(i));
		}*/
		
		for(int j = 0; j < length; j++);
		{
			words.add(input.charAt(j));
		}
		
		int Asize = words.size();
		System.out.println(Asize);
		
	}
}
