package brainfreak;
import brainfreak.*;
public class BrainFreakInterpret {
	public TapeMachine tape;
	public void run(String code) {
		boolean stop = true;
		for(int i= 0;i<code.length();i++) {
			if(code.charAt(i) == '>') {
				tape.moveRight();
			}
			if(code.charAt(i) == '<')
				tape.moveLeft();
			if(code.charAt(i) == '+') {
				//System.out.print("Incremented!");
				tape.increment();
			}
			if(code.charAt(i) == '-')
				tape.decrement();
			if(code.charAt(i) == '['){
				System.out.print("setLabel!");
				tape.setLabel(i+1);
			}
			if(code.charAt(i) == ']') {
				if(tape.getHead() >0) {
					System.out.print("looped back!");
					tape.setHead(tape.getLabel());
					i = tape.getHead();
				}
			}
			if (code.charAt(i) == '.') {
				System.out.print(tape.get(tape.getHead()));
				stop = false;
			}
	}
}
	public BrainFreakInterpret() {
		tape = new TapeMachine();
	}
	
	
}
