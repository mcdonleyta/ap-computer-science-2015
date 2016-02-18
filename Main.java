import brainfreak.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Interpreter pret = new Interpreter();
		Scanner in = new Scanner(System.in);
		System.out.println("Please input some 'BrainFreak' code");
		pret.run(in.nextLine());	
	}

}
