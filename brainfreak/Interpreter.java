package brainfreak;

import java.util.*;

public class Interpreter {

	TapeMachine tapes;

	public void run(String _code) {
		String code = _code;
		int marker = 0;
		for(int i = 0; i < code.length(); i++) {
			switch(code.charAt(i)) {
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
					System.out.println(tapes.getValue());
					break;
				case '[':
					marker = i;
					break;
				case ']':
					if(tapes.getValue() != 0)
						run(code.substring(marker + 1, i - 1));
			}
		}
	}

	public Interpreter() {
		tapes = new TapeMachine();
	}
	
}
