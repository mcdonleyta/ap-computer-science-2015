package Sorting;


import java.util.ArrayList;

public class SortedArray {

    private ArrayList<Tomparable> items;

    public  SortedArray() {
        items = new ArrayList();
    }

    public void add(Tomparable t) {
        if (items.isEmpty() || t.compareTo(items.get(0)) < 0) //MR. M: The || condition isn't needed. It is taken care of below
            items.add(0, t);
        else {
            int size = items.size();
            for (int a = 0; a < size; a++) {
                if (t.compareTo(items.get(a)) < 0 || t.compareTo(items.get(a)) == 0) {
                    items.add(a, t);
                    return;
                }
            }
            items.add(t);
        }
    }

    public Tomparable get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

}
