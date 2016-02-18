package brainfreak;
import brainfreak.*;
public class BrainFreakInterpret {
	public TapeMachine tape;
	public void run(String code) {
		for(int i= tape.getHead();i<code.length();i++) {
			if(code.charAt(i) == '>') {
				tape.moveRight();
				System.out.print("Moved Right");
			}
			if(code.charAt(i) == '<') {
				tape.moveLeft();
				System.out.print("Moved Left!");
			}
			if(code.charAt(i) == '+') {
				System.out.print("Incremented!");
				tape.increment();
			}
			if(code.charAt(i) == '-') {
				System.out.print("Decremented!");
				tape.decrement();
			}
			if(code.charAt(i) == '['){
				int findEndPoint = findBraket(code,i);
				int length = code.substring(i+1,findEndPoint).length();
				do {
					run(code.substring(i+1,findEndPoint)); //recursion yay
					length--;
					System.out.print("looped");
				}
				while(length >1);
				i = findEndPoint;
			}

			if (code.charAt(i) == '.') {
				System.out.println(tape.get(tape.getHead()));
			}
	}
}
	public int findBraket(String inThis, int start) {
		return inThis.indexOf(']');
	}
	
		
	public BrainFreakInterpret() {
		tape = new TapeMachine();
	}
	
	
}
