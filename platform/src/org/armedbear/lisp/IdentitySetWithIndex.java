package org.armedbear.lisp;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Spliterator;

public class IdentitySetWithIndex extends AbstractSet implements Set, RandomAccess {
	ArrayList indexesGiven = new ArrayList();
	Set set = java.util.Collections.newSetFromMap(new IdentityHashMap());
	//public IdentityHashMap indexesGiven = new IdentityHashMap();

	static class IdentityWrapper {
		Object obj;

		IdentityWrapper(Object obj) {
			this.obj = obj;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof IdentitySetWithIndex.IdentityWrapper) {
				return ((IdentitySetWithIndex.IdentityWrapper) obj).obj == this.obj;
			}
			if (this.obj == obj)
				return true;
			if (this == obj)
				return true;
			return false;
		}

		@Override
		public int hashCode() {
			return System.identityHashCode(obj);
		}

		@Override
		public String toString() {
			return "WRAP" + obj.getClass() + "@" + System.identityHashCode(obj);
		}
	}

	@Override
	public boolean add(Object e) {
		if (set.add(e)) {
			//return order.add(new IdentityWrapper(e));
		}
		return false;
	}

	@Override
	public boolean remove(Object e) {
		final IdentityWrapper o = new IdentityWrapper(e);
		if (set.remove(o)) {
			return indexesGiven.remove(o);
		}
		return false;
	}

	@Override
	public boolean contains(Object e) {
		return set.contains(e);// order.indexOf(new IdentityWrapper(e)) >= 0;
	}

	@Override
	public Iterator iterator() {
		return set.iterator();//.iterator();
	}

	@Override
	public int size() {
		return set.size();
	}

	public int indexOf(Object e, boolean mayCreate) {
		int index = indexesGiven.indexOf(e);
		if (index < 0 && mayCreate) {
			if (set.contains(e)) {
				index = indexesGiven.size();
				indexesGiven.add(e);
			}
		}
		return index;
	}

	public Object get(int index) {
		return indexesGiven.get(index);
	}
	//
	//	@Override
	//	public Spliterator spliterator() {
	//		return indexesGiven.spliterator();
	//	}
}