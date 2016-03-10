package brainfreak;

import java.util.*;

public class Interpreter {

	TapeMachine tapes;

	public int run(String _code) {
		String code = _code;
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
					String ncode = code.substring(i + 1);
					int ret = 0;
					while(ret ==0)
						ret = run(ncode);
					code = code.substring(0, i - 1) + code.substring(ret);
					break;
				case ']':
					if(tapes.getValue() == 0)
						return i;
					return 0;
			}
		}
		return 0;
	}

	public Interpreter() {
		tapes = new TapeMachine();
	}
	
}
