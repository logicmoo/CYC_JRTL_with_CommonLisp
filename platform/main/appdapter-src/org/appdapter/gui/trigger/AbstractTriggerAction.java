package org.appdapter.gui.trigger;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.MenuName;
import org.appdapter.api.trigger.MutableTrigger;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.Ident;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.util.CollectionSetUtils;

public abstract class AbstractTriggerAction extends AbstractAction implements KMCTrigger, MutableTrigger, KnownComponent, MenuName {

	//private Object value;
	protected NamedObjectCollection currentCollection;

	@Override public Object getIdentityObject() {
		String s = getMenuPath();
		if (s == null || s.contains("%"))
			return this;
		return s.intern();
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return getValue("UserObject");
	}

	@Override public String toString() {
		return Debuggable.toInfoStringF(this);
	}

	@Override public boolean equals(Object obj) {
		if (!(obj instanceof TriggerForType))
			return false;
		return getIdentityObject() == ((TriggerForType) obj).getIdentityObject();
	}

	@Override public int hashCode() {
		return getIdentityObject().hashCode();
	}

	public NamedObjectCollection getCurrentCollection() {
		return currentCollection;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		putValue("UserObject", value);
		String tooltipText = Utility.makeTooltipText(value);
		if (tooltipText != null) {
			setToolTipText(tooltipText);
		}
	}

	public void setToolTipText(String tooltipText) {
		putValue(LONG_DESCRIPTION, tooltipText);
	}

	public AbstractTriggerAction(String name, Icon icon) {
		super(name, icon);
	}

	@Override public void putValue(String key, Object newValue) {
		super.putValue(key, newValue);
	}

	public <T> T getTValue(String key) {
		return (T) getValue(key);
	}

	public <T> T getValue(String key, Class<T> cls) {
		Object val = getValue(key);
		if (val == null)
			return null;
		if (cls != null)
			if (cls.isInstance(val))
				return (T) val;
		return Utility.recastCC(val, cls);
	}

	@Override public Object getValue(String key) {
		Object o = super.getValue(key);
		if (o instanceof String) {
			String sr = (String) o;
			if (sr.contains("%")) {
				sr = replaceWildcards(sr);
			}
			return sr;
		}
		return o;
	}

	protected String replaceWildcards(String sr) {
		if (sr.contains("%n")) {
			NamedObjectCollection v = getCurrentCollection();
			if (v != null) {
				sr = sr.replace("%n", v.getName());
			}
		}
		if (sr.contains("%o")) {
			Object v = getValue("UserObject");
			if (v != null) {
				try {
					sr = sr.replace("%o", Utility.getUniqueNamePretty(v));
				} catch (Exception e) {
					Utility.bug("replaceWildcards", e);
				}
			}
		}
		return sr;
	}

	public AbstractTriggerAction(String name) {
		super(name);
	}

	public AbstractTriggerAction(String... str) {
		super(CollectionSetUtils.join("|", str));
	}

	@Override public void fire(Box targetBox) {
		actionPerformed(null);
	}

	@Override public Ident getIdent() {
		return getValue("Ident", Ident.class);
	}

	@Override public String getDescription() {
		return getValue(LONG_DESCRIPTION, String.class);
	}

	@Override public String getShortLabel() {
		return getValue(SHORT_DESCRIPTION, String.class);
	}

	@Override public String getMenuPath() {
		return getValue(Action.NAME, String.class);
	}

	@Override
	abstract public void actionPerformed(ActionEvent e);
}
