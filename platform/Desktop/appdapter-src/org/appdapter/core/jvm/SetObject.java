package org.appdapter.core.jvm;

import java.lang.reflect.InvocationTargetException;

public interface SetObject<T> {

	void setObject(T object) throws InvocationTargetException;
}
