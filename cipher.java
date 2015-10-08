//had working code that disappeared
import java.util.*;

class Ciphering {

	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ      abcdefghijklmnopqrstuvwxyz";
	private String altChars = "u?`~tnqrlos(ghezjkwad|ybcp      5@*IM)!J':L#;$%QBVC&9Y-_+}";

	public String convert(String stringIn) {
		String stringOut = "";
		char[] lettersIn = stringIn.toCharArray();
		int place = 0;
		for(int j = 0; j < lettersIn.length; j++) {
			place = ((int)lettersIn[j]) - 65;
			if(lettersIn[j] != ' ' && lettersIn[j] == alphabet.charAt(place)) {
				stringOut += Character.toString(altChars.charAt(place));
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