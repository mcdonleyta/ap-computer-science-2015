package Sorting;

/**
 * Created by jsdsp on 1/20/16.
 */
public abstract class LibraryItem extends Item {

    private static int IDCounter = 0;
    private int itemID;

    public LibraryItem() {
        itemID = IDCounter;
        IDCounter++;
    }

    public int getID() {
        return itemID;
    }

    public abstract String getSortName();

    public double compareTo(Tomparable t) {
        return itemID - ((LibraryItem)t).getID();
    }

    @Override
    public String toString() {
        return Integer.toString(itemID);
    }


}
