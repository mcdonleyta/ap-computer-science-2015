package brainFreakInterpreter;

import java.util.*;

public class TapeMachine implements TuringInterface{
	
	private List<Integer> tape = new ArrayList<Integer>();
	private List<Integer> labels = new ArrayList<Integer>();
	private int head;
	
	public TapeMachine()
	{
		head = 0;
		tape.add(0);
	}
	
	public void moveLeft(){
		if(head>0)
			head--;
		else System.out.println("ERR: out of bounds");
	}
	public void moveRight(){
		if(head+1<tape.size() && head+1>0)
		{
			head++;
		}else
		if(head+1>=tape.size())
		{
			tape.add(0);
			head++;
		}
	}
	public void inc(){
		tape.set(head,(tape.get(head)+1));
	}
	public void dec(){
		tape.set(head,(tape.get(head))-1);
	}
	public int getValue(){
		return tape.get(head);
	}
	public int getHeadPos(){
		return head;
	}
	public void addLabel(int x){
		labels.add(x);
	}
	public int getMostRecentLabel(){
		return labels.get(labels.size()-1);
	}
	public void output(){
		
		for(Integer i : tape)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	public void popLabel()
	{
		labels.remove(labels.size()-1);
	}
	
}
