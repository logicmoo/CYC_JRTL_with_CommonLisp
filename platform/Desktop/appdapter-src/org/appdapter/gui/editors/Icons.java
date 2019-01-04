package org.appdapter.gui.editors;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.DisplayContextUIImpl.UnknownIcon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Icons {
	private static Logger theLogger = LoggerFactory.getLogger(Icon.class);

	public static Icon saveCollection = new DummyIcon();
	public static Icon saveCollectionAs = new DummyIcon();
	public static Icon newCollection = new DummyIcon();
	public static Icon openCollection = new DummyIcon();
	public static Icon recentFile = new DummyIcon();
	public static Icon search = new DummyIcon();

	public static Icon addToCollection = new DummyIcon();
	public static Icon removeFromCollection = new DummyIcon();
	public static Icon viewObject = new DummyIcon();
	public static Icon properties = new DummyIcon();

	public static Icon mainFrame = new DummyIcon();

	private Icons() {
	}

	static {
		saveCollection = loadIcon("saveCollection.gif");
		saveCollectionAs = loadIcon("saveCollectionAs.gif");
		newCollection = loadIcon("newCollection.gif");
		openCollection = loadIcon("openCollection.gif");
		recentFile = loadIcon("recentFile.gif");
		search = loadIcon("search.gif");
		addToCollection = loadIcon("addToCollection.gif");
		removeFromCollection = loadIcon("removeFromCollection.gif");
		viewObject = loadIcon("viewObject.gif");
		properties = loadIcon("properties.gif");
		mainFrame = loadIcon("mainFrame.gif");
	}

	public static Image loadImage(String filename) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image i = null;
		try {
			i = tk.getImage(Utility.getResource(filename));
		} catch (Exception err) {
			theLogger.warn("Warning - icon '" + filename + "' could not be loaded: " + err, err);
		}
		return i;
	}

	public static Icon loadIcon(String filename) {
		try {
			java.net.URL url = Utility.getResource(filename);
			if (url==null) return new UnknownIcon();
			return new ImageIcon();
		} catch (Exception err) {
			theLogger.warn("Warning - icon '" + filename + "' could not be loaded: " + err, err);
			return new DummyIcon();
		}
	}

	static class DummyIcon implements Icon, java.io.Serializable {
		public int getIconWidth() {
			return 16;
		}

		public int getIconHeight() {
			return 16;
		}

		public void paintIcon(Component c, Graphics g, int x, int y) {
			g.setColor(Color.blue);
			g.setFont(new Font("serif", Font.BOLD, 12));
			g.drawString("?", x, y + 12);
		}
	}

}