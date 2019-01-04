package org.appdapter.gui.trigger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JComponent;


import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.GetObject;
import org.appdapter.api.trigger.MutableTrigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;

import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.core.debug.UIAnnotations.AskIfEqual;

import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.Ident;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.GetDisplayContext;
import org.appdapter.gui.api.UIAware;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.IsReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract public class TriggerForInstance<BoxType extends Box<? extends MutableTrigger<BoxType>>> extends TriggerImpl implements

ButtonFactory, AskIfEqual, UIAware, Action, ActionListener, KMCTrigger, GetDisplayContext {

	static protected Logger theLogger = LoggerFactory.getLogger(TriggerForInstance.class);
	/**
	 *  the Class that this menu item is placed on (using the Box)
	 */
	Class arg0Clazz;
	/**
	 *  the object that this menu item is placed on (using the Box)
	 */
	Object _object;
	DisplayContext displayContext;
	AbstractButton jmi;
	Object retvalCache;

	abstract public Class getDeclaringClass();

	//abstract protected void fireIT(Box b, ActionEvent e) throws InvocationTargetException;

	public void fireIT(Object targetBox, ActionEvent actevt) throws InvocationTargetException {
		getLogger().debug(this.toString() + " firing on " + targetBox.toString());
		Object obj = valueOf(targetBox, actevt, true, true);
		try {
			useCount++;
			Utility.addSubResult(this, targetBox, actevt, obj, getReturnType());
		} catch (PropertyVetoException e) {
			Debuggable.printStackTrace(e);
		}

	}

	abstract public boolean isSideEffectSafe();

	public abstract Object valueOf(Object targetBox, ActionEvent actevt, boolean wantSideEffect, boolean isPaste) throws InvocationTargetException;

	private Action actionImpl = new AbstractAction() {

		{
			setEnabled(true);
		}

		@Override public void actionPerformed(ActionEvent e) {
			useCount++;
			TriggerForInstance.this.actionPerformed(e);
		}

		public String toString() {
			return getShortLabel();
		}

	};
	protected String menuPath_cache;
	protected ActionEvent lastEvent;
	public MouseEvent lastMEvent;
	public int useCount;
	public TriggerForClass creator;

	final @Override public void actionPerformed(final ActionEvent e) {
		try {
			if (lastEvent == e) {
				return;
			}
			lastEvent = e;
			final String threadName = "Clicked on ... " + getMenuPath();
			Utility.actionThreadStart(new Runnable() {
				@Override public void run() {
					try {
						fireIT(findBox(e.getSource()), e);
					} catch (InvocationTargetException e1) {
						Debuggable.printStackTrace(e1);
						throw Debuggable.reThrowable(e1);
					} catch (Throwable e1) {
						Debuggable.printStackTrace(e1);
					}
					theLogger.info("Ended worker thread " + threadName);
				}
			}, threadName);
		} finally {
			lastEvent = e;
		}
	}

	private Box findBox(Object source) {
		if (source instanceof Box)
			return (Box) source;
		int fuel = 10;
		while (source instanceof IsReference) {
			Object s2 = ((IsReference) source).getValue();
			if (s2 == null || s2 == source)
				break;
			source = s2;
			if (source instanceof Box)
				return (Box) source;
			fuel--;
			if (fuel < 0) {
				return null;
			}
		}
		fuel = 10;
		while (source instanceof GetObject) {
			Object s2 = ((GetObject) source).getValue();
			if (s2 == null || s2 == source)
				break;
			source = s2;
			if (source instanceof Box)
				return (Box) source;
			if (fuel < 0) {
				return null;
			}
		}
		return null;
	}

	@Override public void addPropertyChangeListener(PropertyChangeListener listener) {
		actionImpl.addPropertyChangeListener(listener);
	}

	final @Override public String getShortLabel() {
		return getMenuPath();
	}

	@Override public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		return same(obj);
	}

	@Override public void fire(Box targetBox) {
		try {
			fireIT(targetBox, null);
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	public DisplayContext getDisplayContext() {
		if (displayContext != null)
			return displayContext;
		return Utility.getCurrentContext();
	}

	@Override public Ident getIdent() {
		return super.getIdent();
	}

	public abstract Object getIdentityObject();

	final public String getMenuName() {
		String path = getMenuPath().trim();
		while (path.endsWith("|"))
			path = path.substring(0, path.length() - 1);
		String nym = path.substring(path.lastIndexOf('|') + 1);
		if (nym.trim().length() == 0)
			return path;
		return nym;
	}

	public String getMenuPath() {
		boolean was = Debuggable.isNotShowingExceptions();
		Debuggable.setDoNotShowExceptions(true);
		try {
			if (this.menuPath_cache == null) {
				menuPath_cache = makeMenuPath();
			}
			return this.menuPath_cache;
		} finally {
			Debuggable.setDoNotShowExceptions(was);
		}
	}

	abstract public String makeMenuPath();

	@Override public Object getValue(String key) {
		return actionImpl.getValue(key);
	}

	public Object getValueOr(Object targetBox) {
		if (_object != null) {
			return Utility.dref(_object, true);
		}
		return Utility.dref(targetBox);
	}

	final public int hashCode() {
		return getIdentityObject().hashCode();
	}

	@Override public boolean isEnabled() {
		return actionImpl.isEnabled();
	}

	abstract public Class getReturnType();

	@Override public void putValue(String key, Object value) {
		actionImpl.putValue(key, value);

	}

	@Override public void removePropertyChangeListener(PropertyChangeListener listener) {
		actionImpl.addPropertyChangeListener(listener);
	}

	@Override public boolean same(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof TriggerForType))
			return false;
		if (true)
			return getIdentityObject() == ((TriggerForType) obj).getIdentityObject();
		return toString().equals(obj.toString());
	}

	@Override public void setDescription(String description) {
		if (getValue(Action.NAME) == null)
			putValue(Action.NAME, description);
		super.setDescription(description);
	}

	@Override public void setEnabled(boolean b) {
		actionImpl.setEnabled(b);
	}

	abstract void setMenuInfo();

	@Override public void setShortLabel(String title) {
		putValue(Action.NAME, title);
		super.setShortLabel(title);
	}

	@Override public String toString() {
		String s = getDescription();
		if (s != null)
			return s;
		return getShortLabel();
	}

	@Override public JComponent visitComponent(JComponent comp) {
		retvalCache = null;
		if (comp instanceof AbstractButton) {
			jmi = (AbstractButton) comp;
			String str = getMenuName();
			if (str.trim().length() == 0) {
				jmi.setText(str);
			}
			jmi.setText(str);
			setMenuInfo();
		}
		MouseListener myMouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 3)
					return;
				onMouseEvent(e);
			}

			public void mouseReleased(MouseEvent e) {
				onMouseEvent(e);
			}

			public void mousePressed(MouseEvent e) {
				//onMouseEvent(e);
			}
		};
		comp.removeMouseListener(myMouseListener);
		comp.addMouseListener(myMouseListener);
		comp.setName(getShortLabel());
		comp.setToolTipText(getDescription());
		if (jmi != null)
			return jmi;
		return comp;
	}

	abstract public void onMouseEvent(MouseEvent event);

	abstract public void applySalience(UISalient isSalient);

	public boolean isFavorited() {
		if (useCount > 0)
			return true;
		if (creator != null)
			return creator.isFavorited();
		return false;
	}

}
