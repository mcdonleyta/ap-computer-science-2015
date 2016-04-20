import java.util.*;
import java.lang.*;
import badsort.*;
public class BadSort {
	public static final int RANGE = 20;
	public static void main(String[] args) { //THE WORLDS WORST SORT
		BadSortHelp machine = new BadSortHelp();
		int startArr[] = new int[10];
		long loops=0;
		long comps=0;
		for(int i =0;i<50;i++) {
			for(int j=0; j<startArr.length;j++) {
				int rand = (int) (Math.random() * RANGE);
				startArr[j] = rand;
			}
		machine.printArr(startArr); 
		int endArr[] = machine.randSort(startArr);
		System.out.println();
		machine.printArr(endArr);
		System.out.println();
		loops+=machine.loopsLooped;
		comps+=machine.comparisons;
	}
		System.out.println("Number of loops " + loops );
		System.out.println("Number of comparisons "+ comps);
	}
		}
	

