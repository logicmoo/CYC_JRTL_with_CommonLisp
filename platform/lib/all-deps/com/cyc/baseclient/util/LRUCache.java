/* $Id: LRUCache.java 150787 2014-04-26 01:55:03Z nwinant $
 *
 * LRU (Least Recently Used) Cache implementation.
 *
 * @author Tony Brusseau
 */

package com.cyc.baseclient.util;

//// Internal Imports

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//// External Imports

/**
 * <P>
 * LRUCache is designed to...
 * 
 * <P>
 * Copyright (c) 2008 Cycorp, Inc. All rights reserved. <BR>
 * This software is the proprietary information of Cycorp, Inc.
 * <P>
 * Use is subject to license terms.
 * 
 * Created on : Feb 28, 2010, 3:27:51 PM Author : tbrussea
 * 
 * @version $Id: LRUCache.java 150787 2014-04-26 01:55:03Z nwinant $
 */
public class LRUCache<K, V> implements Map<K, V> {

	// // Constructors

	/** Creates a new synchronized instance of LRUCache. */
	public LRUCache(int defaultSize, int maxSize) {
		this(defaultSize, maxSize, true);
	}

	/** Creates a new instance of LRUCache. */
	public LRUCache(int defaultSize, int maxSize, boolean isSynchronized) {
		this(defaultSize, maxSize, isSynchronized, .75f);
	}

	/** Creates a new instance of LRUCache. */
	public LRUCache(int defaultSize, final int maxSize, boolean isSynchronized,
			float loadFactor) {
		this.maxSize = maxSize;
		this.cache = new LinkedHashMap<K, V>(defaultSize, loadFactor, true) {
			private static final long serialVersionUID = 7046745637375687927L;

			@SuppressWarnings("rawtypes")
			@Override
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				V val = eldest.getValue();
				if (val instanceof CachedValue) {
					if (((CachedValue) val).isExpired()) {
						return true;
					}
				}
				return size() > maxSize;
			}
		};
		if (isSynchronized) {
			this.cache = Collections.synchronizedMap(cache);
		}
	}

	// // Public Area
	public void clear() {
		cache.clear();
	}

	public boolean containsKey(Object key) {
		return cache.containsKey((K) key);
	}

	public boolean containsValue(Object value) {
		return cache.containsValue((V) value);
	}

	public Set<Map.Entry<K, V>> entrySet() {
		return cache.entrySet();
	}

	public V get(Object key) {
		return cache.get((K) key);
	}

	public boolean isEmpty() {
		return cache.isEmpty();
	}

	public Set<K> keySet() {
		return cache.keySet();
	}

	public V put(K key, V value) {
		return cache.put(key, value);
	}

	public void putAll(Map<? extends K, ? extends V> m) {
		cache.putAll(m);
	}

	public V remove(Object key) {
		return cache.remove((K) key);
	}

	public int size() {
		return cache.size();
	}

	public Collection<V> values() {
		return cache.values();
	}

	// // Protected Area

	// // Private Area

	// // Internal Rep

	private int maxSize;
	private Map<K, V> cache;

	// // Main

}
