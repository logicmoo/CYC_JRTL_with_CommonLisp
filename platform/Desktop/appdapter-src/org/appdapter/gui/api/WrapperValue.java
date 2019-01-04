package org.appdapter.gui.api;


public interface WrapperValue {

	/**
	 * Returns the object that this value wrapper represents
	 */
	abstract public Object reallyGetValue();

	/**
	 * Returns the Type that this value wrapper represents
	 */
	abstract public Class getObjectClass();

	abstract public void reallySetValue(Object newObject) throws UnsupportedOperationException, ClassCastException;
}
