package tomparable;
import java.util.*;
public class SortedArray {
public ArrayList<TomparableItem> tomparableItemList = new ArrayList<TomparableItem>();

public void add(TomparableItem e) {
	if(tomparableItemList.size() == 0 || tomparableItemList.get(tomparableItemList.size()-1).compareTo(e.getValue()) == -1) {
		tomparableItemList.add(e);
	} 
	else {
		for(int i = 0; i < tomparableItemList.size()-1; i++) {
			if(tomparableItemList.get(i).getValue().compareTo(e.getValue()) == -1)
			{
				tomparableItemList.add(e,i);
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
	}
	return ret;
	}
}
