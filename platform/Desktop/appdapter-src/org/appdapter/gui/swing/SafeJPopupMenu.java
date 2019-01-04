package org.appdapter.gui.swing;

import java.awt.Graphics;

import javax.swing.JPopupMenu;

public class SafeJPopupMenu extends JPopupMenu implements UISwingReplacement, IsReference {

	@Override public void addSeparator() {
		try {
			super.addSeparator();
		} catch (Throwable t) {
		}
	}

	@Override public void paint(Graphics g) {
		try {
			super.paint(g);
		} catch (Throwable t) {
		}
	}

	@Override public Object getValue() {
		if (userObject == null)
			return this;
		return userObject;
	}

	@UISalient
	public Object userObject;

	@Override public void updateUI() {
		try {
			super.updateUI();
		} catch (Throwable t) {
		}
	}
}
