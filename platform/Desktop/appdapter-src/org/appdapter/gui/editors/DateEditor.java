package org.appdapter.gui.editors;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Type;
import java.util.Date;

import javax.swing.JLabel;

import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.DateField;

public class DateEditor extends GoodPropertyEditorSupport implements PropertyChangeListener {
	DateField field = null;

	public DateEditor() {
	}

	public static Type[] EDITTYPE = new Type[] { Date.class };

	/*public void setAsText(String text) throws IllegalArgumentException {
	  setValue(Integer.valueOf(text));
	} */

	@Override public void setValue(Object newValue) {
		if (!Utility.isEqual(newValue, getValue())) {
			Date date;
			try {
				date = (Date) newValue;
				super.setValue(date);
				if (field != null) {
					field.setDate(date);
				}
			} catch (Exception err) {
				date = new Date();
				try {
					field.setDate(date);
				} catch (Exception err2) {
				}
				super.setValue(date);
			}
		}
	}

	@Override public Component getCustomEditor() {
		if (field == null) {
			try {
				field = new DateField();
				field.setDate((Date) getValue());
				field.addPropertyChangeListener(this);
				setValue(field.getDate());
			} catch (Exception err) {
				field = null;
				setValue(new Date());
				return new JLabel("Error! " + err.toString());
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