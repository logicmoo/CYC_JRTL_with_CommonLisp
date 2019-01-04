package org.appdapter.gui.swing;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.browse.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A panel showing the output of a method execution.
 * Used by MethodsPanel.
 *
 *
 */
class MethodResultPanel extends JJPanel {
	static Logger theLogger = LoggerFactory.getLogger(MethodResultPanel.class);

	@Override
	public Object getValue() {
		return value;
	}

	JLabel label;
	SmallObjectView value = null;
	Class expectedType = null;
	DisplayContext context;
	boolean isVoid = false;

	public MethodResultPanel(DisplayContext context) {
		this.context = context;
		label = new JLabel("Return value:  ");
		//value = new PropertyValueControl(false);
		setLayout(new BorderLayout());
		add("West", label);
		//add("Center", value);
	}

	public MethodResultPanel() {
		this(Utility.getCurrentContext());
	}

	/**
	 * Designates the type of return value
	 */
	public void setResultType(Class type) {
		expectedType = type;
		if (type == Void.TYPE) {
			label.setText("(no return value)");
			isVoid = true;
		} else {
			String name = Utility.getShortClassName(type);
			label.setText("Return value (" + name + "):  ");
			//value.setFixedType(type);
			isVoid = false;
		}
		invalidate();
		validate();
	}

	/**
	 * Sets the actual return value to be displayed.
	 */
	public void setResultValue(Object object) {
		try {
			if (!(isVoid && object == null)) {
				if (value != null) {
					remove(value);
				}
				value = new SmallObjectView(context, null, object) {
					@Override
					public boolean isRemovable(Object value) {
						return false;
					};
				};

				add("Center", value);
				invalidate();
				validate();
				Utility.addSubResult(null, null, null, object, expectedType);
			}
		} catch (Exception err) {
			theLogger.error("An error occurred", err);
		}
	}
}
