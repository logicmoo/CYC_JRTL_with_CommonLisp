package org.appdapter.core.convert;

public interface ToFromKeyConverter<V, K> {

	public V fromKey(K title, Class type);

	public K toKey(V object);

}
