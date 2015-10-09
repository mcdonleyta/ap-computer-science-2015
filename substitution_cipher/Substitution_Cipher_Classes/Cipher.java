package substitution_cipher;
import java.util.ArrayList;
import java.util.List;

public class Cipher
{
	public void alphabet_cipher() 
	{
		List<Character> alpha = new ArrayList<Character>();
		for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++)
		{
			alpha.add(alphabet);
		}
	}	
	
	public Cipher()
	{
		
	}
}
