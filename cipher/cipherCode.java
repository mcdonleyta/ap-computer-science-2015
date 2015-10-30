package cipher;
import java.util.Scanner;
import java.lang.Integer; 
import java.util.ArrayList;
import java.lang.Object;
import java.util.*;

public class cipherCode
{
	public void codeString()
	{
		Scanner scan = new Scanner(System.in);
		String code = scan.nextLine();
		char arrayCode[] = code.toCharArray();
		char alphabet[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char modAlphabet[] = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
		List<Character> modCode = new ArrayList<Character>();
		for(int i = 0; i <= code.length()-1; i++)
		{
			char x = arrayCode[i];
			for(int j = 0; j <= 50; j++)
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
		
	public cipherCode() {
		codeString();
	}
	
}
