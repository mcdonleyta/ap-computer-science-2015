package brainfreak;

import java.util.*;

//Mr M: Looks good. Add support for a single loop (no nested loops) to recieve the remaining 15 points.

public class Interpreter {

	List<Character> codes;
	TapeMachine tapes;

	public void decompose(String code) {
		for(char x: code.toCharArray())
			codes.add(x);
	}

	public void pushLabel(int headPos) {

	}

	public void popLabel() {
	
	}

	public void run(String code) {
		decompose(code);
		for(char x: codes) {
			switch(x) {
				case '>':
					tapes.moveRight();
					break;
				case '<':
					tapes.moveLeft();
					break;
				case '+':
					tapes.inc();
					break;
				case '-':
					tapes.dec();
					break;
				case '.':
					tapes.getValue();
					break;
			}
		}
	}

	public Interpreter() {
		codes = new ArrayList<Character>();
		tapes = new TapeMachine();
	}
	
}
