package org.opencyc.util;

import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> implements Map<K, V>
{
    private int maxSize;
    private Map<K, V> cache;
    
    public LRUCache(final int defaultSize, final int maxSize) {
        this(defaultSize, maxSize, true);
    }
    
    public LRUCache(final int defaultSize, final int maxSize, final boolean isSynchronized) {
        this(defaultSize, maxSize, isSynchronized, 0.75f);
    }
    
    public LRUCache(final int defaultSize, final int maxSize, final boolean isSynchronized, final float loadFactor) {
        this.maxSize = maxSize;
        this.cache = new LinkedHashMap<K, V>(defaultSize, loadFactor, true) {
            private static final long serialVersionUID = 7046745637375687927L;
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                final V val = eldest.getValue();
                return (val instanceof CachedValue && ((CachedValue)val).isExpired()) || this.size() > maxSize;
            }
        };
        if (isSynchronized) {
            this.cache = Collections.synchronizedMap(this.cache);
        }
    }
    
    @Override
    public void clear() {
        this.cache.clear();
    }
    
    @Override
    public boolean containsKey(final Object key) {
        return this.cache.containsKey(key);
    }
    
    @Override
    public boolean containsValue(final Object value) {
        return this.cache.containsValue(value);
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        return this.cache.entrySet();
    }
    
    @Override
    public V get(final Object key) {
        return this.cache.get(key);
    }
    
    @Override
    public boolean isEmpty() {
        return this.cache.isEmpty();
    }
    
    @Override
    public Set<K> keySet() {
        return this.cache.keySet();
    }
    
    @Override
    public V put(final K key, final V value) {
        return this.cache.put(key, value);
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> m) {
        this.cache.putAll(m);
    }
    
    @Override
    public V remove(final Object key) {
        return this.cache.remove(key);
    }
    
    @Override
    public int size() {
        return this.cache.size();
    }
    
    @Override
    public Collection<V> values() {
        return this.cache.values();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 62 ms
	
	Decompiled with Procyon 0.5.32.
*/