package org.appdapter.gui.api;

import java.beans.PropertyVetoException;
import java.util.Collection;
import java.util.Iterator;



import org.appdapter.gui.box.ScreenBoxImpl;

import org.appdapter.gui.util.Annotations.UIProvider;

public interface POJOCollection extends UIProvider {

	/**
	 * Adds a POJOCollectionListener to this context. The listener will
	 * find out when objects are added or removed.
	 */
	public void addListener(POJOCollectionListener o, boolean catchup);

	public DisplayContext getDisplayContext();

	public Iterator<Object> getObjects();

	public Object findObjectByName(String n);

	public Collection findObjectsByType(Class type);

	public ScreenBoxImpl findOrCreateBox(Object newObject);

	public void renameObject(String oldName, String newName) throws PropertyVetoException;

	public Collection getLiveCollection();

}
