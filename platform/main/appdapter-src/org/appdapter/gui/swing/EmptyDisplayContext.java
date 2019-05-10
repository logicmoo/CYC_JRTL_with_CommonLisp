package org.appdapter.gui.swing;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import org.appdapter.api.trigger.Trigger;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.box.BoxedCollectionImpl;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.appdapter.gui.browse.Utility;

public class EmptyDisplayContext extends BoxedCollectionImpl implements BrowserPanelGUI, NamedObjectCollection {
	/**
	 * Adds a new value, if it wasn't already there
	 *
	 * @returns true if the value was added, false if the value was already there
	 */
	public BT addObject(Object value) {
		return null;
	}

	/**
	 * Removes a value, if it is there
	 *
	 * @returns true if the value was removed, false if that value wasn't in this context
	 */
	@Override
	public boolean removeObject(Object value) {
		return false;
	}

	@Override
	public Collection findObjectsByType(Class type) {
		return new Vector();
	}

	@Override
	public boolean containsObject(Object value) {
		return false;
	}

	public void addListener(POJOCollectionListener o) {
	}

	@Override
	public void removeListener(POJOCollectionListener o) {
	}

	public Collection getTriggersFromUI(BT box, Object value) {
		return new Vector();
	}

	public Object findObject(String name) {
		return null;
	}

	@Override
	public String getTitleOf(Object value) {
		return "" + value;
	}

	@Override
	public UserResult showError(String msg, Throwable e) {
		return Utility.showError(null, msg, e);
	}

	@Override public void renameObject(String oldName, String newName) throws PropertyVetoException {
		BT value = findOrCreateBox(newName, findObjectByName(oldName));
		value.setUniqueName(newName);
	}

	@Override
	public BT findOrCreateBox(String newName, Object obj) throws PropertyVetoException {
		throw new PropertyVetoException("Cant create objects in " + this, new PropertyChangeEvent(this, "objects", null, obj));
	}

	@Override public DisplayContext getDisplayContext() {
		return Utility.getDisplayContext();
	}

	@Override public ScreenBoxImpl findOrCreateBox(Object value) {
		Debuggable.notImplemented();
		return null;
	}

	@Override public Iterator<Object> getObjects() {
		Debuggable.notImplemented();
		return null;
	}

	@Override public Object findObjectByName(String n) {
		Debuggable.notImplemented();
		return null;
	}

	@Override public NamedObjectCollection getLocalBoxedChildren() {
		Debuggable.notImplemented();
		return this;
	}

	@Override public BoxPanelSwitchableView getBoxPanelTabPane() {
		return getDisplayContext().getBoxPanelTabPane();
	}

	@Override public UserResult showScreenBox(String title, Object value) throws Exception {
		return super.getCurrentContext().showScreenBox(title, value);
	}

	@Override public UserResult showScreenBox(Object anyObject) throws Exception {
		return showScreenBox(null, anyObject);
	}

	@Override public UserResult showMessage(String string, Class extraInfo) {
		return getCurrentContext().showMessage(string, extraInfo);
	}

	public BoxPanelSwitchableView getLocalCollectionUI() {
		Debuggable.notImplemented();
		return null;
	}

	@Override
	public UserResult addObject(String title, Object value, boolean showASAP) throws Exception {
		return Utility.browserPanel.addObject(title, value, showASAP, false);
	}

	@Override public UserResult addObject(String title, Object value, boolean showASAP, boolean expandChildren) {
		return Utility.browserPanel.addObject(title, value, showASAP, expandChildren);
	}

	@Override public Collection<Trigger> getTriggersFromUI(Object object) {
		// TODO Auto-generated method stub
		return Utility.browserPanel.getTriggersFromUI(object);
	}

}