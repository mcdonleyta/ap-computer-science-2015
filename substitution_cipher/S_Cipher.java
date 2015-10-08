import java.util.Scanner;
import Substitution_Cipher_Classes.*;
import java.util.ArrayList;
import java.util.List;

public class S_Cipher
{
	public static void main(String[] args)
	{
		List<Character> words = new ArrayList<Character>();
		//Cipher class_cipher = new Cipher();
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
		
		for(int it = 0; it < length; it++)
		{
			words.add(input.charAt(it)); //can't get this to work, can't find variable for some reason
		}
		
		int Asize = words.size();
		
	}
}
