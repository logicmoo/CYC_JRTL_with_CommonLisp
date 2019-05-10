package org.appdapter.gui.swing;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.SwingConstants;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.trigger.TriggerMenuFactory;
import org.appdapter.gui.trigger.TriggerMenuFactory.JMenuWithPath;

public class SafeJMenu extends JMenu implements UISwingReplacement, GetSetObject, IsReference {

	//It also looks better if you're ignoring case sensitivity:
	final protected static Comparator nodeComparator = new TriggerMenuFactory.TriggerSorter() {
		@Override
		public int compare(Object o1, Object o2) {
			return super.compare(o1, o2);
		}
	};

	ArrayList<Component> mcomps = new ArrayList<Component>();

	@UISalient
	public Object userObject;

	private SafeJMenu moreMenu;

	public SafeJMenu(boolean iamObject, String text, Object target) {
		super(text);
		userObject = target;
	}

	/**
	 * Creates a new menu item attached to the specified
	 * <code>Action</code> object and appends it to the end of this menu.
	 *
	 * @param a the <code>Action</code> for the menu item to be added
	 * @see Action
	 */
	@Override
	final public JMenuItem add(Action a) {
		JMenuItem mi = createActionComponent(a);
		mi.setAction(a);
		add(mi);
		return mi;
	}

	final @Override public Component add(Component c) {
		ensureUnequelyNamed(c);
		Component r = null;
		if (c instanceof MenuElement) {
			r = addSorted((MenuElement) c, -1);
		} else {
			warn("C not c" + c);
			r = super.add(c);
		}
		ensureFoundNamed(c);
		return r;
	}

	/**
	 * Adds the specified component to this container at the given
	 * position. If <code>index</code> equals -1, the component will
	 * be appended to the end.
	 * @param     c   the <code>Component</code> to add
	 * @param     index    the position at which to insert the component
	 * @return    the <code>Component</code> added
	 * @see	  #remove
	 * @see java.awt.Container#add(Component, int)
	 */
	@Override
	final public Component add(Component c, int index) {
		ensureUnequelyNamed(c);
		Component r = null;
		if (c instanceof MenuElement) {
			r = addSorted((MenuElement) c, index);
		} else {
			warn("C not c" + c);
			r = super.add(c, index);
		}
		ensureFoundNamed(c);
		return r;
	}

	/**
	 * Appends a menu item to the end of this menu.
	 * Returns the menu item added.
	 *
	 * @param menuItem the <code>JMenuitem</code> to be added
	 * @return the <code>JMenuItem</code> added
	 */
	@Override public JMenuItem add(JMenuItem c) {
		ensureUnequelyNamed(c);
		JMenuItem r = addSorted(c, -1);
		ensureFoundNamed(c);
		return r;
	}

	/**
	 * Creates a new menu item with the specified text and appends
	 * it to the end of this menu.
	 *
	 * @param s the string for the menu item to be added
	 */
	@Override
	final public JMenuItem add(String s) {
		return add(new SafeJMenuItem(this, true, s));
	}

	@Override
	protected void addImpl(Component comp, Object constraints, int index) {
		warn("calling addImpl");
		mcomps.add(index, comp);
		super.addImpl(comp, constraints, index);
	}

	@Override public void addSeparator() {
		ensureSafePopupMenuCreated();
		try {
			//super.addSeparator();
		} catch (Throwable t) {
		}
	}

	final public <T> T addSorted(MenuElement newChild, int childIndex) {
		int last = getMenuComponentCount();
		Component c = newChild.getComponent();
		if (last > 20 && (!(c instanceof JMenuWithPath))) {
			// make a submenu
			return (T) getMoreMenu().add(newChild.getComponent());
		}
		if (childIndex <= 0) {
			int newchildIndex = findBestLocation(newChild, childIndex);
			if (newchildIndex < last) {
				childIndex = newchildIndex;
			}
		} else {
		}

		return (T) addSuper(newChild, childIndex);
	}

	private SafeJMenu getMoreMenu() {
		if (moreMenu == null) {
			moreMenu = new SafeJMenu(true, "More... ", userObject);
		}
		addSuper(moreMenu, 0);
		return this.moreMenu;
	}

	private int findBestLocation(Object mi, int suggested) {
		if (!isSortedLocally()) {
			return suggested;
		}
		Component[] comps = getMenuComponents();
		int max = comps.length;
		if (max == 0)
			return 0;

		int newchildIndex = 0;
		for (Component c : comps) {
			int res = nodeComparator.compare(mi, c);
			if (res == 0) {
				if (mi.equals(c)) {
					Utility.bug("mi.equals(c) -> ", c);
				}
			}
			if (res > 1) {
				if (res > 1) {
					break;
				}
				break;
			}
			newchildIndex++;

		}
		if (newchildIndex < max) {
			return newchildIndex;
		}
		return newchildIndex;
	}

	public Component addSuper(MenuElement me, int index) {
		int size = mcomps.size();
		if (index > size) {
			index = -1;
		}
		Component c = me.getComponent();
		ensureUnequelyNamed(c);
		if (c instanceof MenuElement) {

		} else {
			warn("C not MenuElement" + me);

		}
		int atIndex = index;
		if (isSortedLocally() && false) {
			atIndex = size - index - 1;
			if (atIndex != 0) {
				int cc = atIndex;
			}

		}
		if (atIndex == size)
			atIndex = -1;
		Component comp = super.add(c, atIndex);
		ensureFoundNamed(c);
		int mcompsNS = mcomps.size();
		if (mcompsNS == size) {
			// nothing added
			index = atIndex;
			if (index < 0)
				index = size - 1;
			if (index < 0)
				index = 0;
			mcomps.add(index, comp);
		}
		return comp;
	}

	private boolean isSortedLocally() {
		return true;
	}

	private void warn(String c) {
		Utility.warn(c);

	}

	@Override
	public JMenuItem insert(JMenuItem mi, int pos) {
		int last = getMenuComponentCount();
		int newchildIndex = findBestLocation(mi, pos);
		if (newchildIndex < last) {
			pos = newchildIndex;
		}
		return super.insert(mi, pos);
	}

	/**
	 * Appends a component to the end of this menu.
	 * Returns the component added.
	 *
	 * @param c the <code>Component</code> to add
	 * @return the <code>Component</code> added
	 */

	@Override
	protected JMenuItem createActionComponent(Action a) {
		JMenuItem mi = new SafeJMenuItem(userObject, true) {
			@Override
			protected PropertyChangeListener createActionPropertyChangeListener(Action a) {
				PropertyChangeListener pcl = createActionChangeListener(this);
				if (pcl == null) {
					pcl = super.createActionPropertyChangeListener(a);
				}
				return pcl;
			}
		};
		mi.setHorizontalTextPosition(SwingConstants.TRAILING);
		mi.setVerticalTextPosition(SwingConstants.CENTER);
		return mi;
	}

	/**
	 * Creates a window-closing listener for the popup.
	 *
	 * @param p the <code>JPopupMenu</code>
	 * @return the new window-closing listener
	 *
	 * @see WinListener
	 */
	@Override
	protected WinListener createWinListener(JPopupMenu p) {
		if (!(p instanceof UISwingReplacement)) {
			// complain complain
		}
		return new WinListener(p);
	}

	public void ensureFoundNamed(Component c) {
		if (moreMenu != null)
			return;
		String fnd = TriggerMenuFactory.getLabel(c, 1);
		Component found = TriggerMenuFactory.findChildNamed(this, true, fnd);
		if (found != null) {
			return;
		}
		warn("found=" + found + " for " + fnd);
		found = TriggerMenuFactory.findChildNamed(this, true, fnd);
	}

	private void ensureSafePopupMenuCreated() {
		try {
			Field f = JMenu.class.getDeclaredField("popupMenu");
			f.setAccessible(true);
			JPopupMenu popupMenu = (JPopupMenu) f.get(this);
			if (!(popupMenu instanceof UISwingReplacement)) {
				SafeJPopupMenu safe;
				popupMenu = safe = new SafeJPopupMenu();
				safe.userObject = this;//.userObject our user object may not be populated yet
				f.set(this, popupMenu);
				popupMenu.setInvoker(this);
				popupListener = createWinListener(popupMenu);
			}
		} catch (NoSuchFieldException t) {
			Debuggable.warn("Fields = " + Debuggable.toInfoStringA(JMenu.class.getDeclaredFields(), ",", 3));
		} catch (Throwable t) {
			throw Debuggable.reThrowable(t);
		}

	}

	public void ensureUnequelyNamed(Component c) {
		if (moreMenu != null)
			return;
		String fnd = TriggerMenuFactory.getLabel(c, 1);
		Component found = TriggerMenuFactory.findChildNamed(this, true, fnd);
		if (found == null) {
			Component p = getParent();
			return;
		}
		found = TriggerMenuFactory.findChildNamed(this, true, fnd);
		//warn("found=" + found + " for " + fnd);
	}

	@Override
	protected void fireActionPerformed(ActionEvent event) {
		super.fireActionPerformed(event);
	}

	@Override public String getText() {
		return super.getText();
	}

	@Override
	public Object getValue() {
		return userObject;
	}

	/**
	 * Initializes the menu item with the specified text and icon.
	 *
	 * @param text the text of the <code>JMenuItem</code>
	 * @param icon the icon of the <code>JMenuItem</code>
	 */
	@Override
	protected void init(String text, Icon icon) {
		ensureSafePopupMenuCreated();
		super.init(text, icon);
	}

	@Override public boolean isPopupMenuVisible() {
		return super.isPopupMenuVisible();
	}

	@Override public void removeAll() {
		mcomps.clear();
		super.removeAll();
	}

	@Override
	public void setObject(Object object) {
		userObject = object;
	}

	@Override public void setPopupMenuVisible(boolean b) {
		super.setPopupMenuVisible(b);
	}

	@Override public String toString() {
		Component p = getParent();//.toString();
		if (p != null) {
			return "" + TriggerMenuFactory.getLabel(p, 1) + "->" + TriggerMenuFactory.getLabel(this, 1);
		}
		return TriggerMenuFactory.getLabel(this, 1);
	}

	/**
	 * Resets the UI property with a value from the current look and feel.
	 *
	 * @see JComponent#updateUI
	 */
	@Override
	public void updateUI() {
		ensureSafePopupMenuCreated();
		try {
			super.updateUI();
		} catch (Throwable t) {

		}
	}
}
