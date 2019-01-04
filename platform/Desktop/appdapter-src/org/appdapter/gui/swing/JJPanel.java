package org.appdapter.gui.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.browse.Utility;
import org.armedbear.lisp.Lisp;

public class JJPanel extends JPanel implements UISwingReplacement, IsReference, WindowConstants {
	public JJPanel() {
		this(new FlowLayout());
	}

	@Override
	public String toString() {
		return getName() + " "+ Lisp.getDotName(getClass());

	}

	public JJPanel(boolean predecorate) {
		this(new FlowLayout());
	}

	public JJPanel(LayoutManager layout) {
		super(layout);
	}

	@Override public String getName() {
		boolean was = Debuggable.isNotShowingExceptions();
		Debuggable.setDoNotShowExceptions(true);
		try {
			String sgn = super.getName();
			if (sgn != null)
				return sgn;
			try {
				Object val = getValue();
				if (val != null) {
					return Utility.getUniqueNameForKey(val);
				}
			} catch (Throwable t) {

			}
			return sgn;
		} finally {
			Debuggable.setDoNotShowExceptions(was);
		}

	}

	@Override public Object getValue() {
		if (getClass() != JJPanel.class && !Debuggable.isNotShowingExceptions())
			Debuggable.warn("getValue not Implemented (returning null)");
		return null;
	}

	@Override public void updateUI() {
		try {
			super.updateUI();
		} catch (Throwable t) {

		}
	}

	public Container getContentPane() {
		return this;
	}

	// these methods are so one can use JFrame code in  a JJPanel
	public void setJMenuBar(JMenuBar mBar) {
		synchronized (mBar) {
			int mc = mBar.getMenuCount();
			for (int i = 0; i < mc; i++) {
				Utility.getMenuBar().add(mBar.getMenu(i));
			}
		}
	}

	public void setTitle(String string) {
		if (getParent() instanceof JTabbedPane) {

		}
	}

	public void setDefaultCloseOperation(int doNothingOnClose) {
		// TODO Auto-generated method stub

	}

	public boolean contains(Container cont) {
		if (cont == this)
			return true;
		if (cont instanceof Component) {
			return getParent() == this;
		}
		return false;
	}

}
