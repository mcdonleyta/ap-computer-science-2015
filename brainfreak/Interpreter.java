package brainfreak;
import java.util.*;

public class Interpreter {

	List<char> codes;
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
		codes = new ArrayList<char>(0);
		tapes = new TapeMachine();
	}
	
}
