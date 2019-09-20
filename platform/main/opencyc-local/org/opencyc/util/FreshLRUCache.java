package org.opencyc.util;

import java.util.Collection;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class FreshLRUCache<K, V> implements Map<K, V> {
	private long defaultKeepAliveMsecs;
	private LRUCache<K, CachedValue<V>> cache;

	public FreshLRUCache(final long defaultKeepAliveMsecs, final int defaultSize, final int maxSize) {
		this(defaultKeepAliveMsecs, defaultSize, maxSize, false);
	}

	public FreshLRUCache(final long defaultKeepAliveMsecs, final int defaultSize, final int maxSize, final boolean isSynchronized) {
		this(defaultKeepAliveMsecs, defaultSize, maxSize, isSynchronized, 0.75f);
	}

	public FreshLRUCache(final long defaultKeepAliveMsecs, final int defaultSize, final int maxSize, final boolean isSynchronized, final float loadFactor) {
		this.defaultKeepAliveMsecs = defaultKeepAliveMsecs;
		this.cache = (org.opencyc.util.LRUCache<K, org.opencyc.util.CachedValue<V>>) new LRUCache(defaultSize, maxSize, isSynchronized, loadFactor);
	}

	public void clearStaleEntries() {
		final List<K> expiredKeys = new ArrayList<K>(128);
		final Set<Entry<K, CachedValue<V>>> entrySet = (Set<Entry<K, CachedValue<V>>>) this.cache.entrySet();
		for (final Entry<K, CachedValue<V>> entry : entrySet) {
			final CachedValue<V> cachedVal = entry.getValue();
			if (cachedVal.isExpired()) {
				expiredKeys.add(entry.getKey());
			}
		}
		for (final K key : expiredKeys) {
			this.remove(key);
		}
	}

	@Override
	public void clear() {
		this.cache.clear();
	}

	@Override
	public boolean containsKey(final Object key) {
		final V val = this.get(key);
		return val != null;
	}

	@Override
	public boolean containsValue(final Object value) {
		return this.cache.containsValue(value);
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		final Set<Entry<K, CachedValue<V>>> entrySet = (Set<Entry<K, CachedValue<V>>>) this.cache.entrySet();
		final List<K> expiredKeys = new ArrayList<K>(128);
		final Set<Entry<K, V>> result = new HashSet<Entry<K, V>>(entrySet.size());
		for (final Entry<K, CachedValue<V>> entry : entrySet) {
			final CachedValue<V> cachedVal = entry.getValue();
			if (cachedVal.isExpired()) {
				expiredKeys.add(entry.getKey());
			} else {
				result.add((Entry) new AbstractMap.SimpleEntry<K, Object>(entry.getKey(), cachedVal.get()));
			}
		}
		for (final K key : expiredKeys) {
			this.remove(key);
		}
		return result;
	}

	@Override
	public V get(final Object key) {
		final CachedValue<V> val = (CachedValue<V>) this.cache.get(key);
		if (val == null) {
			return null;
		}
		if (val.isExpired()) {
			this.cache.remove(key);
			return null;
		}
		return (V) val.get();
	}

	@Override
	public boolean isEmpty() {
		return this.cache.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		this.clearStaleEntries();
		return (Set<K>) this.cache.keySet();
	}

	@Override
	public V put(final K key, final V value) {
		return this.put(key, value, this.defaultKeepAliveMsecs);
	}

	public V put(final K key, final V value, final long timeoutMsecs) {
		final CachedValue<V> newVal = (CachedValue<V>) new CachedValue((Object) value, timeoutMsecs);
		final CachedValue<V> oldVal = (CachedValue<V>) this.cache.put(key, newVal);
		return (V) ((oldVal == null) ? null : oldVal.get());
	}

	@Override
	public void putAll(final Map<? extends K, ? extends V> m) {
		for (final Entry<? extends K, ? extends V> entry : m.entrySet()) {
			this.put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public V remove(final Object key) {
		final CachedValue<V> oldVal = (CachedValue<V>) this.cache.remove(key);
		return (V) ((oldVal == null) ? null : oldVal.get());
	}

	@Override
	public int size() {
		return this.cache.size();
	}

	@Override
	public Collection<V> values() {
		final Set<Entry<K, CachedValue<V>>> entrySet = (Set<Entry<K, CachedValue<V>>>) this.cache.entrySet();
		final List<K> expiredKeys = new ArrayList<K>(128);
		final Collection<V> result = new ArrayList<V>(entrySet.size());
		for (final Entry<K, CachedValue<V>> entry : entrySet) {
			final CachedValue<V> cachedVal = entry.getValue();
			if (cachedVal.isExpired()) {
				expiredKeys.add(entry.getKey());
			} else {
				result.add((V) cachedVal.get());
			}
		}
		for (final K key : expiredKeys) {
			this.remove(key);
		}
		return result;
	}

	public static void main(final String[] args) {
		System.out.println("Starting.");
		System.out.flush();
		try {
			final FreshLRUCache cache1 = new FreshLRUCache(0L, 3, 6);
			cache1.put(1, 2);
			try {
				Thread.sleep(10L);
			} catch (InterruptedException ex) {
			}
			cache1.clearStaleEntries();
			if (cache1.size() != 1) {
				System.out.println("Cached entry was inapprorpriately cleared.");
				System.out.flush();
			} else {
				System.out.println("Cached entry was approrpriately not-cleared.");
				System.out.flush();
			}
			final FreshLRUCache cache2 = new FreshLRUCache(5L, 3, 6);
			cache2.put(1, 2);
			try {
				Thread.sleep(10L);
			} catch (InterruptedException ex2) {
			}
			cache2.clearStaleEntries();
			if (cache2.size() != 0) {
				System.out.println("Cached entry was inapprorpriately not-cleared.");
				System.out.flush();
			} else {
				System.out.println("Cached entry was approrpriately cleared.");
				System.out.flush();
			}
			cache2.put(2, 3);
			cache2.put(3, 4);
			cache2.put(4, 3);
			cache2.put(6, 4);
			cache2.put(7, 4);
			cache2.put(8, 4);
			if (cache2.size() > 6) {
				System.out.println("Cache grew inappropriately large.");
				System.out.flush();
			} else {
				System.out.println("Cache is approrpriate size.");
				System.out.flush();
			}
			final FreshLRUCache cache3 = new FreshLRUCache(5L, 3, 6);
			cache3.put(3, 2);
			try {
				Thread.sleep(10L);
			} catch (InterruptedException ex3) {
			}
			cache3.put(4, 5);
			if (cache3.size() != 1) {
				System.out.println("Cached entry was inapprorpriately not-cleared.");
				System.out.flush();
			} else {
				System.out.println("Cached entry was approrpriately cleared.");
				System.out.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.flush();
		} finally {
			System.out.println("Finished.");
			System.out.flush();
			System.exit(0);
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 100 ms
	
	Decompiled with Procyon 0.5.32.
*/