//had working code that disappeared
import java.util.*;

class Ciphering {

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private String altChars = "5@*bM)!J':L#;$%QBVC&9Y-_+}";

	public int getIntPlace(char letterIn) {
		char[] charAlphabet = alphabet.toCharArray();
		for(int i = 0; i < charAlphabet.length; i++) {
			if(letterIn == charAlphabet[i]) {
				return i;
			}
		}
		return 0;
	}

	public String convert(String stringIn) {
		String stringOut = "";
		char[] lettersIn = stringIn.toCharArray();
		int place = 0;
		for(int j = 0; j < lettersIn.length; j++) {
			if(lettersIn[j] != ' ') {
				place = getIntPlace(lettersIn[j]);
			}	
			if(lettersIn[j] == alphabet.toCharArray()[place]) {
				stringOut += Character.toString(altChars.toCharArray()[place]);
			}
			else if(lettersIn[j] == ' ') {
				stringOut += " ";
			}
		}
		return stringOut;
	}

}

class cipher {

	public static void main(String[] args) {
		Ciphering cypher = new Ciphering();
		Scanner getString  = new Scanner(System.in);
		System.out.println("Enter some text, no caps");
		String input = getString.nextLine();
		String output = cypher.convert(input);
		System.out.println(output);
	}

}