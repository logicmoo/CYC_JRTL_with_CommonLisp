package org.appdapter.gui.trigger;

import java.beans.PropertyVetoException;
import java.util.concurrent.Callable;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.CallableWithParameters;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.EditableTrigger;
import org.appdapter.gui.browse.Utility;

public class EditableTriggerImpl extends TriggerImpl implements EditableTrigger, CallableWithParameters<Box, Object>, TriggerForClass {

	Trigger trigger;
	CallableWithParameters<Box, Object> callableWithParameters;

	CallableWithParameters<Box, Boolean> predicateWithParameters;
	Object objectValue;

	String menuPath = null;

	public EditableTriggerImpl(String shortLabel, Trigger t) {
		trigger = t;
		setMenuPath(shortLabel);
	}

	public EditableTriggerImpl(Class cls, String shortLabel, Trigger t) {
		setRequireClass(cls);
		trigger = t;
		setMenuPath(shortLabel);
	}

	public EditableTriggerImpl(final Class cls, String shortLabel, CallableWithParameters t) {
		setRequireClass(cls);
		callableWithParameters = t;
		setMenuPath(shortLabel);
	}

	public EditableTriggerImpl(CallableWithParameters<Box, Boolean> predicate, String menuLabel, CallableWithParameters function) {
		callableWithParameters = function;
		predicateWithParameters = predicate;
		setMenuPath(menuLabel);
	}

	public EditableTriggerImpl(CallableWithParameters<Box, Boolean> predicate, String menuLabel, Trigger t) {
		predicateWithParameters = predicate;
		trigger = t;
		setMenuPath(menuLabel);
	}

	public EditableTriggerImpl(EditableTriggerImpl editableTriggerImpl, String menuFmt, Object poj) {
		if (menuFmt == null) {
			menuFmt = editableTriggerImpl.getMenuPath();
		}
		objectValue = poj;
		trigger = editableTriggerImpl.trigger;
		predicateWithParameters = editableTriggerImpl.predicateWithParameters;
		callableWithParameters = editableTriggerImpl.callableWithParameters;
		setShortLabel(editableTriggerImpl.getShortLabel());
		setDescription(editableTriggerImpl.getDescription());
		setIdent(editableTriggerImpl.getIdent());
		setMenuPath(menuFmt);
	}

	protected void setMenuPath(String menuFmt) {
		menuFmt = checkMenuPath(menuFmt);
		menuPath = menuFmt;
		setShortLabel(menuFmt);
		String desc = getDescription();
		if (desc == null) {
			desc = Debuggable.toInfoStringF(this);
			setDescription(desc);
		}
	}

	protected String checkMenuPath(String menuFmt) {
		if (menuFmt == null || menuFmt.length() == 0) {
			menuFmt = null;
			getLogger().warn("Bad menu path: " + this);
		}
		return menuFmt;
	}

	public String getMenuPath() {
		return checkMenuPath(menuPath);
	}

	public void setRequireClass(final Class cls) {
		predicateWithParameters = new CallableWithParameters<Box, Boolean>() {
			@Override public Boolean call(Box box, Object... classAndObjAndParams) {
				Object v = Utility.dref(box);
				if (v != null) {
					return cls.isInstance(v);
				}
				if (classAndObjAndParams == null || classAndObjAndParams.length == 0)
					return false;

				Object other = classAndObjAndParams[0];
				return other instanceof Class && cls.isAssignableFrom((Class) other);
			}
		};
	}

	@Override public void fire(Box targetBox) {
		if (trigger != null) {
			trigger.fire(targetBox);
			return;
		}

		if (callableWithParameters != null) {
			Object result = call(targetBox);
			try {
				Utility.addSubResult(this, targetBox, null, result, null);
			} catch (PropertyVetoException e) {
				Debuggable.printStackTrace(e);
			}
			return;
		}

		getLogger().warn("No trigger impl for " + this);
	}

	protected Object getValue(Box targetBox) {
		if (objectValue != null)
			return objectValue;
		return targetBox.getValue();
	}

	@Override public Object call(Box box, Object... params) {
		Object use = objectValue;
		if (box instanceof Box) {
			use = getValue(box);
		}
		if (callableWithParameters != null) {
			if (use != null) {
				box = asBoxed(use);
			}
			try {
				return callableWithParameters.call(box, params);
			} catch (ClassCastException cce) {
				if (trigger != null) {
					trigger.fire(box);
					return null;
				}
				cce.printStackTrace();
				return null;
			}
		}
		fire(asBoxed(use));
		return null;
	}

	public Box asBoxed(Object use) {
		if (use == null)
			return null;
		return Utility.asBoxed(use);
	}

	@Override public Object getIdentityObject() {
		return this;
	}

	@Override public boolean appliesTarget(Class cls, Object example) {
		if (predicateWithParameters != null) {
			return predicateWithParameters.call(null, cls, example) == Boolean.TRUE;
		}
		if (objectValue != null)
			return example == objectValue;

		return true;
	}

	@Override public EditableTriggerImpl createTrigger(String menuFmt, DisplayContext ctx, Object poj) {
		return new EditableTriggerImpl(this, menuFmt, poj);
	}

	@Override public boolean isFavorited() {
		return true;
	}

	@Override public boolean isSideEffectSafe() {
		return false;
	}

	@Override public Object call() throws Exception {
		return call(null);
	}
}
