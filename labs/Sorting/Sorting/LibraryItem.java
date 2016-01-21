package Sorting;

/**
 * Created by jsdsp on 1/20/16.
 */
public class LibraryItem extends Item {

    private static int IDCounter = 0;
    private int itemID;

    public LibraryItem() {
        itemID = IDCounter;
        IDCounter++;
    }

    public float getValue() {
        return itemID;
    }

    @Override
    public String toString() {
        return Integer.toString(itemID);
    }


}
