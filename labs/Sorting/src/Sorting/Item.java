package Sorting;

/**
 * Created by jsdsp on 1/21/16.
 */
public abstract class Item implements Tomparable {
    public boolean lessThan(Tomparable t) {
        return getValue() < t.getValue();
    }
    public boolean greaterThan(Tomparable t) {
        return getValue() > t.getValue();
    }
    public boolean equalTo(Tomparable t) {
        return getValue() == t.getValue();
    }
}
