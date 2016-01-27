package tomparable;
public abstract interface Tomparable {
public abstract int getValue();
public abstract int compareTo(TomparableItem e, int flag); 
public abstract int compareTo(TomparableItem e, double flag);
public abstract int compareTo(TomparableItem e, String flag);
}
