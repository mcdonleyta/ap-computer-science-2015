import CipherContents.*;
import java.util.Scanner;

public class Cipher{
		public static void main(String []args)
		{
			int i = 0;
			String TemporaryString;
			String[] UserInput;
			Encoder myEncoder = new Encoder();
			UserInput = new String[30];
			Scanner myScan = new Scanner(System.in);
			while(myScan.hasNext() == true){
				UserInput[i]=myScan.next();
				i++;
				TemporaryString = UserInput[i];
				TemporaryString = Encoder.Encode(TemporaryString);
			}
			
		}
}
