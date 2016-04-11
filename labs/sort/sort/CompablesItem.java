package sort;

public abstract class CompablesItem implements Compables
{
	public abstract double getValue();
	
	private String name;
	
	public abstract String getName();
	
	public int compareTo(Compables C)
	{
		if(getValue() == C.getValue())
			return 0;
		else if(getValue() > C.getValue())
			return 1;
		else
			return -1;
	}

	
}


