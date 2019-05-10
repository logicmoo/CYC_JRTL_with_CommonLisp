package org.appdapter.core.debug;

import org.apache.log4j.helpers.ThreadLocalMap;

public class NoLeakThreadLocal<T> {

	public static boolean useRealTLDefault = false;
	final ThreadLocal<T> realTL;
	boolean isSet = false;
	T valueSet = null;
	Object valueSync = new Object();

	public NoLeakThreadLocal() {
		this(useRealTLDefault, false);
	}

	public NoLeakThreadLocal(boolean inherritable) {
		this(useRealTLDefault, inherritable);
	}

	public NoLeakThreadLocal(boolean useReal, boolean inherritable) {
		if (useReal) {
			if (inherritable) {
				realTL = new ThreadLocal<T>() {
					@Override protected T initialValue() {
						return NoLeakThreadLocal.this.initialValue();
					}
				};
			} else {
				realTL = new InheritableThreadLocal<T>() {
					@Override protected T initialValue() {
						return NoLeakThreadLocal.this.initialValue();
					}
				};
			}
		} else {
			realTL = null;
		}
	}

	public T get() {
		if (realTL != null) {
			return realTL.get();
		}
		synchronized (valueSync) {
			if (!isSet) {
				isSet = true;
				valueSet = initialValue();
			}
			return valueSet;
		}
	}

	protected T initialValue() {
		return null;
	}

	public void set(T val) {
		if (realTL != null) {
			realTL.set(val);
			return;
		}
		synchronized (valueSync) {
			isSet = true;
			valueSet = val;
		}

	}
}
