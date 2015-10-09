//decide to just keep everything in one file and might split it into classes later. - 8:00 PM
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class S_Cipher
{
	public static void main(String[] args)
	{
		List<Character> words = new ArrayList<Character>();
		List<Character> alpha = new ArrayList<Character>();
		System.out.println("Please enter a word, phrase or string below: ");
		Scanner scan = new Scanner(System.in);
		String input_user = scan.nextLine();
		String input = input_user.toUpperCase();
		int length = input.length();
		int Asize = alpha.size();
		int Wsize = words.size();
		int l;
		int Csize = 0;
		
		for(int j = 0; j < length; j++)
		{
			//System.out.println(input.charAt(j));
			words.add(input.charAt(j));
		}
		for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++)
		{
			alpha.add(alphabet);
		}
		
		Asize = alpha.size();
		Wsize = words.size();
		//System.out.println(Wsize + " " + Asize);
		
		while(Csize <= Wsize)
		{
			for(int k = 0; k < Wsize; k++)
			{
				for(l = 0; l < Asize; l++)
				{
					/*if()
					{
						System.out.print(words.get(k));
					}else
					if()
					{*/
						if(words.get(k) == alpha.get(l))
						{
							if(alpha.get(l) == 'X')
							{
								System.out.print("A");
							}else
							if(alpha.get(l) == 'Y')
							{
								System.out.print("B");
							}else
							if(alpha.get(l) == 'Z')
							{
								System.out.print("C");
							}else
							{
								System.out.print(alpha.get(l + 3));
							}
						}
					//}
				}
				Csize++;
				//l = 0;
			}
		}	
	}
}
