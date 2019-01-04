package org.appdapter.gui.trigger;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPopupMenu;

public class MouseAdapterWithAppendablePopup extends MouseAdapter implements MouseListener {
	public MouseEvent lastEvent;
	private JPopupMenu popup;

	/**
	 * @return the popup
	 */
	public JPopupMenu getPopup() {
		if (popup == null) {
			popup = new JPopupMenu();
		}
		return popup;
	}

	/**
	 * @param popup the popup to set
	 */
	public void setPopup(JPopupMenu popup) {
		this.popup = popup;
	}
}
