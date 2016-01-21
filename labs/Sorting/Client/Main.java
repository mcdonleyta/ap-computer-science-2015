package Client;

import Sorting.*;

/**
 * Created by jsdsp on 1/21/16.
 */
public class Main {
    public static void main(String[] args) {
        SortedArray myArr = new SortedArray();
        myArr.add(new Book("How To Steal A Mockingbird", "Scout", 352));
        myArr.add(new Periodical("Insider Insider", "Getting Inside Injection Molding", 98));
        myArr.add(new Video("Star Wars: Return of the Clones", "LL Abrams", 102));
        System.out.println(myArr.size());

        for(int a = 0; a < myArr.size(); a++) {
            System.out.println(myArr.get(a).toString());
        }
    }
}
