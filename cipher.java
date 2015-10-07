import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;
import java.lang.Object;
import java.util.*;

class cipher {
	public static void main(String[] args)
	{
		String code = "helloworld";
		char arrayCode[] = "helloworld".toCharArray();
		char alphabet[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char modAlphabet[] = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
		List<Character> modCode = new ArrayList<Character>();
		for(int i = 0; i <= code.length()-1; i++)
		{
			char x = arrayCode[i];
			for(int j = 0; j <= 25; j++)
				{
				char y = alphabet[j];
					if( x ==y) {
						char c = modAlphabet[j];
						modCode.add(c);
					}
				}
		}
		System.out.print(modCode);
		
		
	}
}
