package Sorting;

/**
 * Created by jsdsp on 1/20/16.
 */
public interface Tomparable {
    boolean lessThan(Tomparable t);
    boolean greaterThan(Tomparable t);
    boolean equalTo(Tomparable t);
    float getValue();
}
