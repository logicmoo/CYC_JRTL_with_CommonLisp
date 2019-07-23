/* For LarKC */
package com.cyc.tool.subl.util;

import java.util.ArrayList;

public abstract class ObjectPool {
	public ObjectPool() {
		this(64);
	}

	public ObjectPool(int initialSize) {
		pool = new ArrayList<Object>();
		isInitialized = false;
		pool = new ArrayList<Object>(initialSize);
		currentCapacity = initialSize;
	}

	private ArrayList<Object> pool;
	private int currentCapacity;
	private boolean isInitialized;
	private static int DEFAULT_POOL_SIZE = 64;

	public Object acquire() {
		init();
		int size = pool.size();
		if (size == 0) {
			int previousCapacity = currentCapacity;
			currentCapacity = currentCapacity * 3 / 2 + 1;
			pool.ensureCapacity(currentCapacity);
			for (int i = 0, curSize = currentCapacity - previousCapacity; i < curSize; ++i) {
				Object obj = makePoolItem();
				pool.add(obj);
			}
			size = pool.size();
		}
		Object result = pool.remove(size - 1);
		return result;
	}

	public ObjectPool init() {
		if (!isInitialized) {
			for (int i = 0; i < currentCapacity; ++i) {
				Object obj = makePoolItem();
				pool.add(obj);
			}
			isInitialized = true;
		}
		return this;
	}

	public abstract Object makePoolItem();

	public void release(Object item) {
		resetPoolItem(item);
		pool.add(item);
	}

	public abstract void resetPoolItem(Object p0);
}
