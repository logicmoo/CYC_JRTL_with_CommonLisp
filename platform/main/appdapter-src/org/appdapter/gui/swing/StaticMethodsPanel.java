package org.appdapter.gui.swing;

import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionListener;

/**
 * A GUI component showing all the static methods of a given class and controls
 * for providing parameters, executing the methods, and manipulating the result
 *
 * 
 */
public class StaticMethodsPanel extends MethodsPanel implements ActionListener, ListSelectionListener {

	public StaticMethodsPanel(Class cls) throws Exception {
		super(cls, true);
	}
}
