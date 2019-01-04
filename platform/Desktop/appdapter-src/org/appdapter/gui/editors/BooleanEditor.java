package org.appdapter.gui.editors;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

import javax.swing.JCheckBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
* JavaBeansCollection PropertyEditor implementation for boolean values.
* Basically a checkbox...
*/
public class BooleanEditor extends GoodPropertyEditorSupport {
	GUI gui = null;

	public BooleanEditor() {
	}

	@Override public void setAsText(String text) throws IllegalArgumentException {
		setValue(Boolean.valueOf(text));
	}

	@Override public String getAsText() {
		return "" + getValue();
	}

	@Override public void setValue(Object value) {
		if (value instanceof Boolean) {
			super.setValue(value);
			if (gui != null)
				gui.setState(getBooleanValue());
		}
	}

	public boolean getBooleanValue() {
		try {
			Object o = getValue();
			if (o == null)
				return false;
			return ((Boolean) o).booleanValue();
		} catch (Exception err) {
			//	err.printStackTrace();
			return false;
		}
	}

	@Override public Component getCustomEditor() {
		if (gui == null) {
			gui = new GUI();
		}
		return gui;
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	class GUI extends JCheckBox implements ChangeListener {
		public GUI() {
			super();
			setText(getAsText());
			getModel().setSelected(getBooleanValue());
			addChangeListener(this);
		}

		@Override public void stateChanged(ChangeEvent e) {
			boolean state = getState();
			if (state != getBooleanValue())
				setValue(new Boolean(getState()));
		}

		public void setState(boolean b) {
			setText(getAsText());
			if (b != getState())
				;
			getModel().setSelected(b);
		}

		public boolean getState() {
			return getModel().isSelected();
		}

	}
}
