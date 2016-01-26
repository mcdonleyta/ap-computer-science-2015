package tomparable;
import java.util.*;
public class SortedArray {
public ArrayList<TomparableItem> tomparableItemList = new ArrayList<TomparableItem>();

public void add(TomparableItem e) {
	if(tomparableItemList.size() == 0) {
		tomparableItemList.add(e);
	} 
	else {
		for(int i = 0; i < tomparableItemList.size()-1; i++) {
			//System.out.print(e.compareTo(tomparableItemList.get(i)));
			if( e.compareTo(tomparableItemList.get(i)) == 1 || e.compareTo(tomparableItemList.get(i)) == 0) {
				//tomparableItemList.get(i).compareTo(e)
				System.out.print(i);
				tomparableItemList.add(i+1,e);
			}
			
		}
	}

}
public int size() {
	return tomparableItemList.size();	
}
public TomparableItem get(int index) {
	return tomparableItemList.get(index);
}
public String toString() {
	String ret = "";
	for(TomparableItem e : tomparableItemList) {
		ret+= e.getValue();
		ret+= " ";
		}
	return ret;
	}
}
