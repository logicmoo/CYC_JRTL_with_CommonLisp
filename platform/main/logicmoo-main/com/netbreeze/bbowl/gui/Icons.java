package com.netbreeze.bbowl.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.apache.log4j.Category;

public class Icons {
  static Category cat = Category.getInstance(Icon.class);

  static Icon saveBowl = new DummyIcon();
  static Icon saveBowlAs = new DummyIcon();
  static Icon newBowl = new DummyIcon();
  static Icon openBowl = new DummyIcon();
  static Icon recentFile = new DummyIcon();
  static Icon about = new DummyIcon();

  static Icon addToBowl = new DummyIcon();
  static Icon removeFromBowl = new DummyIcon();
  static Icon viewBean = new DummyIcon();
  static Icon properties = new DummyIcon();

  static Icon mainFrame = new DummyIcon();

  private Icons() {
  }

  static {
    saveBowl = loadIcon("saveBowl.gif");
    saveBowlAs = loadIcon("saveBowlAs.gif");
    newBowl = loadIcon("newBowl.gif");
    openBowl = loadIcon("openBowl.gif");
    recentFile = loadIcon("recentFile.gif");
    about = loadIcon("about.gif");
    addToBowl = loadIcon("addToBowl.gif");
    removeFromBowl = loadIcon("removeFromBowl.gif");
    viewBean = loadIcon("viewBean.gif");
    properties = loadIcon("properties.gif");
    mainFrame = loadIcon("mainFrame.gif");
  }

  static Image loadImage(String filename) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Image i = null;
    try {
      i = tk.getImage(Icons.class.getResource("icons/" + filename));
    } catch (Exception err) {
      cat.warn("Warning - icon '" + filename + "' could not be loaded: " + err, err);
    }
    return i;
  }

  static Icon loadIcon(String filename) {
    try {
      return new ImageIcon(Icons.class.getResource("icons/" + filename));
    } catch (Exception err) {
      cat.warn("Warning - icon '" + filename + "' could not be loaded: " + err, err);
      return new DummyIcon();
    }
  }

  static class DummyIcon implements Icon, java.io.Serializable {
    @Override
	public int getIconWidth() {
      return 16;
    }

    @Override
	public int getIconHeight() {
      return 16;
    }

    @Override
	public void paintIcon(Component c,
                                Graphics g,
                                int x,
                                int y) {
      g.setColor(Color.blue);
      g.setFont(new Font("serif", Font.BOLD, 12));
      g.drawString("?", x, y + 12);
    }
  }

}