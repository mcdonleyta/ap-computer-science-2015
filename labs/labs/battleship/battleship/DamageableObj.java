//Mr. M: This is a great use of an interface. Nice job!

package battleship;

import java.util.*;

public interface DamageableObj{
	
	boolean ifHit=false;
	
	boolean checkIfHit()
	{
		return ifHit;
	}
	
	void takeHit()
	{
		ifHit=true;
	}
	
}
