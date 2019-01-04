package org.appdapter.gui.editors;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.ScreenBoxPanel;

public class UseEditor<BoxType extends Box> extends ScreenBoxPanel<BoxType> implements Customizer, ObjectPanel {

	private PropertyEditor ec;
	private Component custEditor;

	public UseEditor() {

	}

	public UseEditor(PropertyEditor editor, GetSetObject getSetObject) {
		box = getSetObject;
		ec = editor;
		setObject(box.getValue());
	}

	/**
	 * Register a listener for the PropertyChange event.  The customizer
	 * should fire a PropertyChange event whenever it changes the target
	 * bean in a way that might require the displayed properties to be
	 * refreshed.
	 *
	 * @param listener  An object to be invoked when a PropertyChange
	 *		event is fired.
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		super.addPropertyChangeListener(listener);
	}

	/**
	 * Remove a listener for the PropertyChange event.
	 *
	 * @param listener  The PropertyChange listener to be removed.
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		super.removePropertyChangeListener(listener);
	}

	@Override protected void completeSubClassGUI() throws Throwable {
		removeAll();
		setLayout(new BorderLayout());
		tryCreatePropertyEditor();
		if (ec == null) {
			add(new JLabel("Unable to Find UI Editor for " + objClass));
			return;
		}
		try {
			if (this.custEditor == null) {
				this.custEditor = ec.getCustomEditor();
			}
			if (this.custEditor == null) {
				add(new JLabel("Unable to Get Custom UI Editor from " + ec.getClass()));
				return;
			}
			add("North", this.custEditor);
		} catch (Exception e) {

		}
	}

	@Override protected boolean reloadObjectGUI(Object object) {
		if (object != null) {
			if (box != null) {
				try {
					box.setObject(object);
				} catch (Throwable e) {
					Debuggable.printStackTrace(e);
				}
			}
			objClass = object.getClass();
			tryCreatePropertyEditor();
		}
		return false;
	}

	private void tryCreatePropertyEditor() {
		if (objClass == null) {
			Object val = getValue();
			if (val != null && val != box) {
				objClass = val.getClass();
			}
		}
		if (ec == null && objClass != null) {
			ec = Utility.findEditor(objClass, true, true, true);
			theLogger.warn("using editor " + ec + " for " + objClass);
		}
	}

	@Override protected void initSubclassGUI() throws Throwable {
		tryCreatePropertyEditor();
	}

	@Override public Class<? extends Object> getClassOfBox() {
		if (objClass != null)
			return objClass;
		return Object.class;
	}

}
