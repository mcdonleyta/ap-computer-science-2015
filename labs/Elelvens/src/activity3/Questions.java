package activity3;

import java.util.ArrayList;

/**
 * Created by jsdsp on 3/9/16.
 */
public class Questions {
    public static void main(String[] args) {
        int[] a = {1,1,3,4,5,6,7,8};
        int[] b = {8,7,6,5,4,3,1,1};
        int[] c = {1,1,1,1,7,7,7,5};
        System.out.println(arePermutations(a, b));
        System.out.println(arePermutations(a, c));
    }

    public static String flip() {
        if(Math.random() < 0.67)
            return "heads";
        else
            return "tails";
    }

    public static boolean arePermutations(int[] arr1, int[] arr2) {
        ArrayList<Integer> accountedIndecies = new ArrayList<>();
        for(int a : arr1) {
            boolean found = false;
            for(int b = 0; b < arr2.length; b++)
                if(a == arr2[b] && !accountedIndecies.contains(b)) {
                    found = true;
                    accountedIndecies.add(b);
                    break;
                }
            if(!found)
                return false;
        }
        return true;
    }
}
