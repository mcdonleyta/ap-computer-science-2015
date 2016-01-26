package tomparable;
public abstract class TomparableItem implements Tomparable {
	private String name;
	public int compareTo(TomparableItem e) {
	if(this.getValue() == e.getValue()) {
		//ret = 0;
		return 0;
	}
	else if(this.getValue() > e.getValue()){
		//ret = 1;
		return 1;
	}
	else //if ( this.getValue() < e.getValue()) {
		//ret = -1;
		return -1;
	}
	//return ret;
	
public String getName() {
	return name;
	
}
public abstract int getValue();


}
