/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.util;

import java.util.ArrayList;

public abstract class ObjectPool {

	//// Constructors

	private static int DEFAULT_POOL_SIZE = 64;

	private ArrayList<Object> pool = new ArrayList<Object>();

	//// Public Area

	private int currentCapacity;

	private boolean isInitialized = false;

	// @todo add background task for shrinking pools -APB

	public ObjectPool() {
		this(ObjectPool.DEFAULT_POOL_SIZE);
	}

	public ObjectPool(int initialSize) {
		this.pool = new ArrayList<Object>(initialSize);
		this.currentCapacity = initialSize;
	}

	public Object acquire() {
		this.init();
		int size = this.pool.size();
		if (size == 0) {
			int previousCapacity = this.currentCapacity;
			this.currentCapacity = this.currentCapacity * 3 / 2 + 1;
			this.pool.ensureCapacity(this.currentCapacity);
			for (int i = 0, curSize = this.currentCapacity - previousCapacity; i < curSize; i++) {
				Object obj = this.makePoolItem();
				this.pool.add(obj);
			}
			size = this.pool.size();
		}
		Object result = this.pool.remove(size - 1);
		return result;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public ObjectPool init() {
		if (!this.isInitialized) {
			for (int i = 0; i < this.currentCapacity; i++) {
				Object obj = this.makePoolItem();
				this.pool.add(obj);
			}
			this.isInitialized = true;
		}
		return this;
	}

	public abstract Object makePoolItem();

	public void release(Object item) {
		this.resetPoolItem(item);
		this.pool.add(item);
	}

	public abstract void resetPoolItem(Object item);

	//// Main

}
