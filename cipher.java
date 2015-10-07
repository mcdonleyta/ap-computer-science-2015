//had working code that dissapeared
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
		char[] lettersIn = stringIn.tocharArray();
		for(int j = 0; j < lettersIn.length; j++) {
			if()
		}
	}

}