package org.appdapter.core.convert;

public interface Convertable {

	<T> T convertTo(Class<T> c) throws ClassCastException;

	<T> boolean canConvert(Class<T> c);
}
