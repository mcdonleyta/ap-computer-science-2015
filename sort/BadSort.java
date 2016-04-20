import java.util.*;
import java.lang.*;
import badsort.*;
public class BadSort {
	public static void main(String[] args) { //THE WORLDS WORST SORT
		BadSortHelp machine = new BadSortHelp();
		int startArr[] = {6,3,1,5,9,7,3,2}; //bout as many numbers as it can do "quickly"
		machine.printArr(startArr); 
		int endArr[] = machine.randSort(startArr);
		System.out.println();
		machine.printArr(endArr);
	}
		}
	

