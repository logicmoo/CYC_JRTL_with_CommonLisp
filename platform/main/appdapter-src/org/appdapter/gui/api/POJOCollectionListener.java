package org.appdapter.gui.api;


import org.appdapter.gui.util.Annotations.UIProvider;

public interface POJOCollectionListener extends UIProvider {
	public void pojoAdded(Object obj, BT box, Object senderCollection);

	public void pojoRemoved(Object obj, BT box, Object senderCollection);
}