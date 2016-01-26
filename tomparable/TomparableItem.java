package tomparable;
public abstract class TomparableItem implements Tomparable {

	public int compareTo(TomparableItem e) {
		int ret = -1;
	if(this.getValue() == e.getValue()) {
		ret = 0;
	}
	else if(this.getValue() > e.getValue()){
		ret = 1;
	}
	else if ( this.getValue() < e.getValue()) {
		ret = -1;
	}
	return ret;
}
public abstract int getValue();


}
