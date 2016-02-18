package brainFreakInterpreter;

public class BrainFreakInterpret{
	
	TapeMachine vroom = new TapeMachine();
	
	public void run(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			switch(input.charAt(i)){
				case '>':	vroom.moveRight(); 
							break;
				case '<':	vroom.moveLeft();
							break;
				case '+':	vroom.inc();
							break;
				case '-':	vroom.dec();
							break;
				case '[':	vroom.addLabel(i);
							break;
				case ']':	if(vroom.getValue()>0){
								i = (vroom.getMostRecentLabel());
							}else vroom.popLabel();
							break;
				case '.':	System.out.println("Head: " + vroom.getHeadPos() + "    /  Value: " + vroom.getValue());
							break;
			}
		}
		
		
	}
	
	
}
