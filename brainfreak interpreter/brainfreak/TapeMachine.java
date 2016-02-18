package brainfreak;
import java.util.*;
public class TapeMachine implements TuringInterface {
	private ArrayList<Integer> tape = new ArrayList<Integer>();
	private int head=0;
	private int label=0;
	
	public TapeMachine() {
		for(int i = 0;i<100;i++) {
			tape.add(0);

		}
	}
	public void moveLeft() {
		head -=1;
	}
	public void moveRight() {
		head+=1;
	}
	public void increment() {
		int num = tape.get(head);
		tape.set(head,num+1);
	}
	public void decrement() {
		int num = tape.get(head);
		tape.set(head,num-1);
	}
	public int getHead() {
		return head;
	}
	public void setHead(int _head) {
		head= _head;
	}
	public void setLabel(int _label) {
		label = _label;
	}
	public int getLabel() {
		return label;
	}
	public int get (int i) {
		return tape.get(i);
	}	
}
