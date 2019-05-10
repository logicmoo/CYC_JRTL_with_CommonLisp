

package org.appdapter.gui.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JWindow;


/**
  A floating splash window, i.e. a frameless window
  that displays an icon.  If the closeOnClick = true then
  the window will close when the user clicks on it.

  
  @version 1
*/
public class ImageDisplayField extends JWindow {
  private IconView iconView = new IconView();
  boolean closeOnClick;

  public ImageDisplayField() {
    this(null, false);
  }

  public ImageDisplayField(Icon icon) {
    this(icon, false);
  }

  public ImageDisplayField(Icon icon, boolean closeOnClick) {
    super();
    getContentPane().add(iconView);
    setIcon(icon);
    setCloseOnClick(closeOnClick);
    iconView.addMouseListener(new Adapter());
  }

  public void setIcon(Icon icon) {
    iconView.setIcon(icon);
    pack();
    org.appdapter.gui.browse.Utility.centerWindow(this);
  }

  public Icon getIcon() {
    return iconView.getIcon();
  }

  public void setCloseOnClick(boolean b) {
    closeOnClick = b;
  }

  public boolean getCloseOnClick() {
    return closeOnClick;
  }

  class Adapter extends MouseAdapter {
    @Override
	public void mouseClicked(MouseEvent e) {
      if (closeOnClick)
        dispose();
    }
  }
}