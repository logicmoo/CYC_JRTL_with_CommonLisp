/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.logicmoo.translate.spoon;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Set that compares object by identity rather than equality. Wraps around a
 * <code>IdentityHashMap</code>
 *
 */
public class IdentitySet<E> implements Set<E> {
	final private Map<E, Object> map;
	final private Object CONTAINS = new Object();

	public IdentitySet() {
		this(10);
	}

	public IdentitySet(int size) {
		this.map = new IdentityHashMap<E, Object>(size);
	}

	public IdentitySet(Collection<E> size) {
		this.map = new IdentityHashMap<E, Object>(size.size());
		addAll(size);
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return map.containsKey(o);
	}

	@Override
	public Iterator<E> iterator() {
		return map.keySet().iterator();
	}

	@Override
	public Object[] toArray() {
		return map.keySet().toArray();
	}

	@Override
	public boolean add(E o) {
		return map.put(o, CONTAINS) == null;
	}

	@Override
	public boolean remove(Object o) {
		return map.remove(o) == CONTAINS;
	}

	@Override
	public boolean addAll(Collection c) {
		boolean doThing = false;
		for (Object o : c) {
			doThing = doThing || add((E) o);
		}
		return doThing;
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean removeAll(Collection c) {
		boolean remove = false;
		for (Object o : c) {
			remove = remove || remove(o);
		}
		return remove;
	}

	@Override
	public boolean retainAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection c) {
		for (Object o : c) {
			if (!contains(o)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return map.keySet().toArray(a);
	}

	@Override
	public String toString() {
		return "IdentitySet{" + "map=" + map + '}';
	}

}