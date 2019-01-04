package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.browse.Utility;

/**
 * A GUI component showing the parameters of a method.
 * The parameter values can be retrieved using getValues().
 * The current method can be changed any time, causing
 * the GUI to update itself for the new method.
 *
 * 
 */
public class MethodParametersPanel extends JJPanel {
	DisplayContext context;
	Member currentMethod = null;
	//Constructor currentConstructor = null;
	PropertyValueControl[] paramViews = null;
	JPanel childPanel;


	@Override
	public Object getValue() {
		//if (currentConstructor != null)
		//	return currentConstructor;
		return currentMethod;
	}

	public static final Class[] TYPE = Utility.ChoiceOf(Method.class, Constructor.class);

	public MethodParametersPanel() {
		this(Utility.getCurrentContext());
	}

	public MethodParametersPanel(DisplayContext context) {
		this.context = context;
		setLayout(new BorderLayout());
	}

	public MethodParametersPanel(DisplayContext context, Constructor c) {
		this(context);
		setMethod(c);
	}

	public MethodParametersPanel(DisplayContext context, Method m) {
		this(context);
		setMethod(m);
	}

	/**
	 * Returns the current values set in the method parameters
	 */
	public Object[] getValues() {
		Object[] params = new Object[paramViews.length];
		for (int i = 0; i < paramViews.length; ++i) {
			params[i] = paramViews[i].getValue();
		}
		return params;
	}

	public Member getMethod() {
		return currentMethod;
	}

	public void setParameters(Class[] params) {
		paramViews = new PropertyValueControl[params.length];
		for (int i = 0; i < params.length; ++i) {
			JPanel row = new JPanel();
			row.setLayout(new BorderLayout());
			Class type = params[i];
			int paramNum1 = i + 1;
			String shortName = Utility.getShortClassName(type) + paramNum1;
			row.add("West", new JLabel(shortName + ":  "));
			PropertyValueControl field = new PropertyValueControl(context, shortName, type, true);
			paramViews[i] = field;
			row.add("Center", field);
			childPanel.add(row);
		}
	}

	public synchronized void setMethod(Member method) {
		if (currentMethod != method) {
			if (childPanel != null) {
				childPanel.removeAll();
			}
			childPanel = new JPanel();
			childPanel.setLayout(new VerticalLayout(VerticalLayout.LEFT, true));

			currentMethod = method;
			if (method != null) {
				Class[] params = ReflectUtils.getParameterTypes(method);
				setParameters(params);
			}
			removeAll();
			add("Center", childPanel);
			invalidate();
			validate();
			repaint();
		}

	}

}