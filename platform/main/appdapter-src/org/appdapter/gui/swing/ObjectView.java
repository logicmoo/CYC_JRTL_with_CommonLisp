package org.appdapter.gui.swing;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.spi.LoggerFactory;
import org.appdapter.api.trigger.Box;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.GetSetObject;
import org.slf4j.Logger;

/**
 * A GUI component used to render a Box in a user interface. The standard
 * implementations are ScreenBoxedPOJORef (an icon-like implementation) and
 * ScreenBoxedPOJOWithProperties (a complete window with all the details about
 * the POJO).
 */
abstract public class ObjectView<BoxType extends Box>

extends JJPanel implements GetSetObject {

	protected static Logger theLogger = org.slf4j.LoggerFactory.getLogger(ObjectView.class);

	protected static Type collectionOf(final Class c) {
		return makeParameterizedType(Collection.class, c);
	}

	protected static Type makeParameterizedType(final Class raw, final Type... pts) {
		return ReflectUtils.makeParameterizedType(raw, pts);
	}

	protected static Type mapOf(final Type k, final Type v) {
		return makeParameterizedType(Map.class, k, v);
	}

	abstract public void focusOnBox(BoxType b);

	public Object valueLock = new Object();

	public ObjectView(boolean initForTabbedHosting) {
		super(initForTabbedHosting);
	}

	protected abstract boolean initGUI() throws Throwable;

	/**
	 * Return the live object in which we think we are updating
	 * 
	 * This can be 'this' object
	 * 
	 */
	@Override abstract public Object getValue();

	public Object objectValue;

	@Override public void setObject(Object newpojObject) {
		synchronized (valueLock) {
			Object oldpojObject = objectValue;
			if (oldpojObject != newpojObject) {
				objectChanged(oldpojObject, newpojObject);
				try {
					initGUI();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Called whenever the pojo is switched. Caused the GUI to update to render
	 * the new pojObject instead.
	 */
	final protected void objectChanged(Object oldValue, Object newValue) {
		synchronized (valueLock) {
			Object pobjectValue = objectValue;
			objectValueChanged(oldValue, newValue);
			if (pobjectValue == objectValue) {

			}
			if (objectValue != newValue) {
				objectValue = newValue;
				super.firePropertyChange("value", oldValue, newValue);
			}
		}
	}

	public abstract void objectValueChanged(Object oldValue, Object newValue);

	abstract protected void reallySetValue(Object bean);
}