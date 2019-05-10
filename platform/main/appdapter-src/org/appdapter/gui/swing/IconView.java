package org.appdapter.gui.swing;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Icon;

/**
  A canvas that simply displays an Icon

  
  @version 1
*/
public class IconView extends Canvas {
	Icon icon;

	public IconView() {
		this(null);
	}

	public IconView(Icon icon) {
		setIcon(icon);
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
		setVisible(icon != null);
		invalidate();
		validate();
	}

	public Icon getIcon() {
		return icon;
	}

	@Override public Dimension getPreferredSize() {
		if (icon == null)
			return new Dimension(0, 0);
		else
			return new Dimension(icon.getIconWidth(), icon.getIconHeight());
	}

	@Override public void paint(Graphics g) {
		if (icon != null)
			icon.paintIcon(this, g, 0, 0);
	}
}