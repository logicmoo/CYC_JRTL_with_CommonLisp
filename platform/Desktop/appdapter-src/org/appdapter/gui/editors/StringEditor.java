package org.appdapter.gui.editors;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.Type;

import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.PropertyValueControl;

public class StringEditor extends GoodPropertyEditorSupport {
	public StringEditor() {

	}

	@Override public Component getCustomEditor() {
		return new PropertyValueControl.TextBasedInputComponent(this, String.class, null, getValue());
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	public void setValue(Object value) {
		if (value instanceof String || value == null) {
			super.setValue(value);
			return;
		}
		Utility.bug(this, "si for strings not ", value);
	}

	public static Type[] EDITTYPE = new Type[] { String.class };

	@Override public void setAsText(String s) {
		setValue(s);
	}

	@Override public String getAsText() {
		Object val = getValue();
		if (val instanceof String || val == null)
			return (String) val;
		Utility.bug(this, "si for strings not ", val);
		return "" + val;
	}
}