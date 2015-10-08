package Substitution_Cipher;
import java.util.ArrayList;
import java.util.List;

public class Cipher
{
	public void alphabet_cipher() 
	{
		List<Character> alpha = ArrayList<Character>();
		for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++)
		{
			alpha.add(alphabet);
		}
	}	
	
	public Cipher()
	{
		alphabet_cipher();
	}
}
