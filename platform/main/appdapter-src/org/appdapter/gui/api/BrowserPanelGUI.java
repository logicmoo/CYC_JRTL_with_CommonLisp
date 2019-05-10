package org.appdapter.gui.api;

import java.beans.PropertyVetoException;
import java.util.Iterator;

import org.appdapter.gui.util.Annotations.UIProvider;

public interface BrowserPanelGUI extends DisplayContext, IShowObjectMessageAndErrors, UIProvider {

	void renameObject(String oldName, String newName) throws PropertyVetoException;

	Object findObjectByName(String title);

	Iterator<Object> getObjects();

}
