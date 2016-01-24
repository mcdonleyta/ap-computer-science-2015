package tomparable;
public abstract class LibraryItem extends TomparableItem{
	public abstract int getValue();
	
	public int compareTo (TomparableItem e) {
	if(this.getValue() == e.getValue()) {
		return 0;
	}
	else if(this.getValue() > e.getValue()){
		return 1;
	}
	else if ( this.getValue() < e.getValue()) {
		
	}
}
	
}
