package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CharHashMap<T> {

	final static int CACHE_SIZE = 256;
	final public T[] constants;
	final public T NULL;
	final HashMap<Character, T> backing;

	@SuppressWarnings("unchecked")
	public CharHashMap(Class componentType, T def) {
		this.NULL = def;
		this.constants = (T[]) Array.newInstance(componentType, CharHashMap.CACHE_SIZE);
		Arrays.fill(this.constants, this.NULL);
		this.backing = new HashMap<Character, T>();
	}

	public void clear() {
		Arrays.fill(this.constants, this.NULL);
		this.backing.clear();
	}

	public Object clone() {
		CharHashMap<T> n = new CharHashMap<T>(this.constants.getClass().getComponentType(), this.NULL);
		System.arraycopy(this.constants, 0, n.constants, 0, CharHashMap.CACHE_SIZE);
		n.backing.putAll(this.backing);
		return n;
	}

	public T get(char key) {
		if (key < CharHashMap.CACHE_SIZE)
			return this.constants[key];
		T value = this.backing.get(key);
		return value == null ? this.NULL : value;
	}

	public Iterator<Character> getCharIterator() {
		return new Iterator<Character>() {
			final Iterator<Character> carIt = CharHashMap.this.backing.keySet().iterator();
			int charNum = -1;

			public boolean hasNext() {
				if (this.charNum < CharHashMap.CACHE_SIZE)
					return true;
				return this.carIt.hasNext();
			}

			public Character next() {
				if (this.charNum < CharHashMap.CACHE_SIZE)
					return (char) ++this.charNum;
				return this.carIt.next();
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

		};
	}

	public T put(char key, T value) {
		if (key < CharHashMap.CACHE_SIZE) {
			T old = this.constants[key];
			this.constants[key] = value;
			return old;
		} else
			return this.backing.put(key, value);
	}
}
