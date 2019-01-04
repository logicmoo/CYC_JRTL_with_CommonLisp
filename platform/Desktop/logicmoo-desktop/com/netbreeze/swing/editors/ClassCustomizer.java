package com.netbreeze.swing.editors;

import com.netbreeze.swing.*;
import java.awt.*;
import javax.swing.*;
import com.netbreeze.util.Utility;
import java.beans.*;

/**
 * A panel containing a complete GUI for a class, including properties, methods,
 * static methods, and constructors
 * <p>
 *
 * @author Henrik Kniberg
 */
public class ClassCustomizer extends LargeBeanView {
	protected void initGUI() {
		super.initGUI();

		try {
			ClassConstructorsPanel constructors = new ClassConstructorsPanel((Class) getBean());
			tabs.insertTab("Constructors", null, constructors, null, 0);
		} catch (Exception err) {
			tabs.insertTab("Constructors", null, new ErrorPanel("Could not show constructors", err), null, 0);
		}

		try {
			Class cls = (Class) getBean();
			StaticMethodsPanel statics = new StaticMethodsPanel(cls);
			tabs.insertTab("Static methods", null, statics, null, 1);
		} catch (Exception err) {
			tabs.insertTab("Static methods", null, new ErrorPanel("Could not show static methods", err), null, 1);
		}
	}
}