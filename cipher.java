import java.util.*;
import java.io.*;

class Ciphering {

	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ      abcdefghijklmnopqrstuvwxyz";
	private String altChars = "u?`~tnqrlos(ghezjkwad|ybcp      5@*IM)!J':L#;$%QBVC&9Y-_+}";

	public String convert(String stringIn) throws IllegalArgumentException{
		String stringOut = "";
		char[] lettersIn = stringIn.toCharArray();
		int place;
		for(int j = 0; j < lettersIn.length; j++) {
			if((int)lettersIn[j] >= 65 && (int)lettersIn[j] <= 122 || lettersIn[j] == ' ') {
				place = (int)lettersIn[j] - 65;
				if(lettersIn[j] != ' ' && lettersIn[j] == alphabet.charAt(place))
					stringOut += Character.toString(altChars.charAt(place));
				else if(lettersIn[j] == ' ')
					stringOut += " ";
			}
			else 
				throw new IllegalArgumentException("Non-Acceptable Character");
		}
		return stringOut;
	}

}

class cipher {

	public static void main(String[] args) {
		Ciphering cypher = new Ciphering();
		Scanner getString  = new Scanner(System.in);
		System.out.println("Enter some text");
		String input = getString.nextLine();
		try {
			String output = cypher.convert(input);
			System.out.println(output);
		}
		catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

}