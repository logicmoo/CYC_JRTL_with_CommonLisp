package jasko.tim.lisp.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TopLevelItemSort {
	public enum Sort {
		Position,
		Alpha,
		Type
	}

	private class TypeComparator implements Comparator<TopLevelItem> {
		public int compare(TopLevelItem arg0, TopLevelItem arg1) {
			return arg0.type.toLowerCase().compareTo(arg1.type.toLowerCase());
		}
	}
	
	private class PositionComparator implements Comparator<TopLevelItem> {
 		public int compare(TopLevelItem arg0, TopLevelItem arg1) {
 			return arg0.offset - arg1.offset;
 		}
 	}
	
	public void sortItems(List<TopLevelItem> items, Sort type){
		if (type == Sort.Alpha) {
			Collections.<TopLevelItem>sort(items);
		} else if (type == Sort.Type) {
			Collections.<TopLevelItem>sort(items, new TypeComparator());
		} else if (type == Sort.Position) {
			Collections.<TopLevelItem>sort(items, new PositionComparator());
		} else { // Really shouldn't ever happen
			Collections.<TopLevelItem>sort(items);
		}
	}	
}
