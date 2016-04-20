package badsort;
public class BadSortHelp {
	public int[] randSort(int[] input) {
		while(!isSorted(input)) {
			int randOne; 
			randOne = (int)(Math.random()*(input.length));
			int randTwo;
			randTwo = (int)(Math.random()*(input.length));
			while(randOne == randTwo) {
			 randTwo = (int)(Math.random()*(input.length));
		 }
		 swap(input,randOne,randTwo); // yes i am swapping one by one #yolo 
									  //(honestly i could live several lives in the time it takes to run)
		}
		return input;
	}
	public boolean isSorted(int [] input) {
	for (int i = 0; i < input.length - 1; i++) {
        if (input[i] > input[i + 1]) 
            return false; 
    }
    return true;
		}
	public void swap(int[] input, int indexOne, int indexTwo) {
		int tmp = input[indexOne];
		input[indexOne] = input[indexTwo];
		input[indexTwo] = tmp;			
	}
	public void printArr(int[] input) {
		for(int i = 0; i<input.length;i++)
			System.out.print( input[i] + ", ");
		}
	public BadSortHelp() {
	}
}
