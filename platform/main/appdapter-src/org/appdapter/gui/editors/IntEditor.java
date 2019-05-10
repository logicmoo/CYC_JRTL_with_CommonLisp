package org.appdapter.gui.editors;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Type;

import javax.swing.JLabel;

import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.NumberField;

public class IntEditor extends GoodPropertyEditorSupport implements PropertyChangeListener {
	NumberField field = null;

	public IntEditor() {
	}

	public static Type[] EDITTYPE = new Type[] { int.class, Integer.class };

	@Override public void setAsText(String text) throws IllegalArgumentException {
		setValue(Integer.valueOf(text));
	}

	@Override public void setValue(Object value) {
		if (value != null) {
			Object oldValue = getValue();
			if (oldValue != null) {
				if (value.equals(oldValue)) {
					return;
				}
			}
			Integer intValue;
			try {
				intValue = (Integer) value;
				super.setValue(intValue);
				if (field != null)
					field.setValue(intValue);
			} catch (Exception err) {
				Utility.showError(null, null, err);
				intValue = new Integer(0);
				try {
					field.setValue(intValue);
				} catch (Exception err2) {
				}
				super.setValue(intValue);
			}
		}
	}

	public void setIntValue(int value) {
		setValue(new Integer(value));
	}

	public int getIntValue() {
		try {
			return ((Integer) getValue()).intValue();
		} catch (Exception err) {
			return 0;
		}
	}

	@Override public Component getCustomEditor() {
		if (field == null) {
			try {
				field = new NumberField(Integer.class, new Integer(0), true);
				field.setValue((Number) getValue());
				field.addPropertyChangeListener(this);
				setValue(field.getValue());
			} catch (Exception err) {
				field = null;
				setValue(new Integer(0));
				return new JLabel("Error!");
			}
		}
		return field;
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	@Override public void propertyChange(PropertyChangeEvent evt) {
		super.setValue(evt.getNewValue());
	}
}