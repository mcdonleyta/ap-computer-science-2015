import java.util.Arrays;
public class Activity3QuestionMethods {

	public static void main(String[] args) {
		for(int i=0;i<12;i++)
			System.out.println(flipWeightedCoin());
		int[] ar1 = {3,4,2,1};
		int[] ar2 = {4,3,2,1};
		System.out.println(arePermutations(ar1,ar2));
	}
	
	public static String flipWeightedCoin(){
		
		double chance = Math.random();
		if(chance >= 0.3333333)
			return "heads";
		else return "tails";
	}
	
	public static boolean arePermutations(int[] ar1, int[] ar2){
	
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		if(Arrays.equals(ar1,ar2))
			return true;
		else return false;
	
	}
}
