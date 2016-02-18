package brainfreak;
import java.util.*;

public class TapeMachine implements TuringInterface {

	private List<Integer> tape;
	private int head;

	public void moveLeft() { head--; }
	public void moveRight() { head++; }
	public void inc() { tape.set(head, tape.get(head) + 1); }
	public void dec() { tape.set(head, tape.get(head) - 1); }
	public void getValue() { System.out.print(tape.get(head)); }

	public TapeMachine() {
		tape = new ArrayList<Integer>(0);
	}

}
