package org.appdapter.gui.swing;

import java.awt.AWTKeyStroke;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeListener;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.ObjectPanel;
import org.appdapter.gui.trigger.TriggerMenuFactory;

import com.jidesoft.swing.JideTabbedPane;

public class ObjectTabsForTabbedView implements BoxPanelSwitchableView {

	final JTabbedPane tabs;
	//final JideTabbedPane jtabs;
	final Object lock;
	final Object rootValue;

	private static void setupTabTraversalKeys(JTabbedPane tabbedPane) {
		KeyStroke ctrlTab = KeyStroke.getKeyStroke("ctrl TAB");
		KeyStroke ctrlShiftTab = KeyStroke.getKeyStroke("ctrl shift TAB");

		// Remove ctrl-tab from normal focus traversal
		Set<AWTKeyStroke> forwardKeys = new HashSet<AWTKeyStroke>(tabbedPane.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
		forwardKeys.remove(ctrlTab);
		tabbedPane.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardKeys);

		// Remove ctrl-shift-tab from normal focus traversal
		Set<AWTKeyStroke> backwardKeys = new HashSet<AWTKeyStroke>(tabbedPane.getFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
		backwardKeys.remove(ctrlShiftTab);
		tabbedPane.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, backwardKeys);

		// Add keys to the tab's input map
		InputMap inputMap = tabbedPane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		inputMap.put(ctrlTab, "navigateNext");
		inputMap.put(ctrlShiftTab, "navigatePrevious");
	}

	public ObjectTabsForTabbedView(JTabbedPane tbs, boolean closableTabs, Object rootValue) {
		this.rootValue = rootValue;
		lock = tbs;
		tabs = tbs;
		tabs.setInheritsPopupMenu(true);
		setupTabTraversalKeys(tbs);
		synchronized (lock) {
			if (tbs instanceof JideTabbedPane) {
				JideTabbedPane myBoxPanelTabPane = (JideTabbedPane) tbs;
				myBoxPanelTabPane.setBoldActiveTab(true);
				myBoxPanelTabPane.setAutoRequestFocus(true);
				myBoxPanelTabPane.setShowCloseButtonOnMouseOver(false);
				myBoxPanelTabPane.setScrollSelectedTabOnWheel(true);
				myBoxPanelTabPane.setTabEditingAllowed(false);

				myBoxPanelTabPane.setShowCloseButton(closableTabs);
				myBoxPanelTabPane.setUseDefaultShowCloseButtonOnTab(closableTabs);
				myBoxPanelTabPane.setCloseTabOnMouseMiddleButton(closableTabs);
				myBoxPanelTabPane.setShowCloseButtonOnTab(closableTabs);
			}
		}
	}

	@Override public boolean clearChildren() {
		synchronized (lock) {
			tabs.removeAll();
			return true;
		}
	}

	@Override public boolean removeTab(String title, Component view) {
		synchronized (lock) {

			int index = indexOf(title, view);

			int catb = -1;
			if (view != null) {
				catb = tabs.indexOfTabComponent(view);
			}
			int removedTimes = 0;
			int tat = -1;
			if (title != null) {
				tat = tabs.indexOfTab(title);
				if (tat != -1) {
					removedTimes++;
					tabs.remove(tat);
				}
			}
			int cat = -1;
			if (view != null) {
				cat = tabs.indexOfTabComponent(view);
				if (cat != -1) {
					tabs.remove(cat);
					removedTimes++;
				}
			}

			return removedTimes > 0;
		}
	}

	@Override public int indexOf(String title, Component view) {
		synchronized (lock) {
			int index = unverifiedIndex(title, view);
			if (index == -1)
				return -1;
			Component comp = tabs.getTabComponentAt(index);

			boolean wrongComponet = false;
			if (view != null && comp != null && comp != view) {
				wrongComponet = true;
				// already have a tab like that
			}
			String title2 = tabs.getTitleAt(index);
			if (title != null && (title2 == null || !title2.equals(title))) {
				if (wrongComponet) {
					return -1;
				} // wrong title!

			}
			if (wrongComponet) {
				index = tabs.indexOfTabComponent(view);
				if (index != -1) {
					Debuggable.warn("weird tabs for ", tabs, title, view);
				}
				return -1;
			}
			return index;
		}
	}

	public int unverifiedIndex(String title, Component view) {
		synchronized (lock) {

			int catb = -1;
			if (view != null) {
				catb = tabs.indexOfTabComponent(view);
			}
			int tat = -1;
			if (title != null) {
				tat = tabs.indexOfTab(title);
				if (tat != -1) {
					return tat;
				}
			}
			return catb;
		}
	}

	@Override public boolean bringToFront(String title, Component view) {
		synchronized (lock) {
			int index = indexOf(title, view);
			if (index != -1) {
				tabs.setSelectedIndex(index);
				return true;
			}
			return false;
		}
	}

	@Override public boolean sendToBack(String title, Component view) {
		synchronized (lock) {
			int index = indexOf(title, view);
			if (index == -1) {
				return false;
			}
			int sel = tabs.getSelectedIndex();
			if (sel != index) {
				// already to back;
				return true;
			}
			if (index != -1 && childCount() > 1) {
				if (index == 0) {
					tabs.setSelectedIndex(childCount() - 1);
					return true;
				} else {
					tabs.setSelectedIndex(index - 1);
					return true;
				}
			}
			return false;
		}
	}

	@Override public Container getContainer() {
		synchronized (lock) {
			return tabs;
		}
	}

	@Override public int childCount() {
		synchronized (lock) {
			return tabs.getComponentCount();
		}
	}

	@Override public boolean addTab(String title, Component view) {
		synchronized (lock) {
			int index = indexOf(title, view);
			title = titleCheck(title, view);
			if (index == -1) {
				tabs.addTab(title, view);
				if (view instanceof ObjectPanel) {
					ObjectPanel objpanel = (ObjectPanel) view;
					objpanel.setTabHost(this);
				}
				return true;
			} else {

			}
			Component comp = tabs.getTabComponentAt(index);
			if (comp == view)
				return true;
			if (comp == null) {
				tabs.remove(index);
				tabs.addTab(title, view);
				return true;
			}
			boolean wrongComponet = false;
			if (view != null && comp != null && comp != view) {
				wrongComponet = true;
				// already have a tab like that
			}
			String title2 = tabs.getTitleAt(index);
			if (title != null && (title2 == null || !title2.equals(title))) {
				if (!wrongComponet) {
					tabs.setTitleAt(index, title);
					return true;
				}

			}
			return false;

		}
	}

	private String titleCheck(String title, Component view) {
		synchronized (lock) {
			if (title != null && title.length() > 2) {
				return title;
			}
			title = view.getName();
			if (title != null && title.length() > 2) {
				return title;
			}
			title = TriggerMenuFactory.getLabel(view, 0);
			if (title != null && title.length() > 2) {
				return title;
			}
			title = view.toString();
			if (title == null) {
				return "???";
			}
			if (title.length() <= 0)
				return "???0";
			return Utility.getSpecialClassName(view.getClass());
		}
	}

	@Override public void insertTab(String title, Icon icon, Component component, String tip, int index) {
		synchronized (lock) {
			tabs.insertTab(title, icon, component, tip, index);

		}
	}

	@Override public void addChangeListener(ChangeListener cc) {
		synchronized (lock) {
			tabs.addChangeListener(cc);

		}
	}

	@Override public int indexOfComponent(Component view) {
		synchronized (lock) {
			return tabs.indexOfComponent(view);
		}
	}

	@Override public int getSelectedIndex() {
		synchronized (lock) {
			return tabs.getSelectedIndex();
		}
	}

	@Override public Dimension getPreferredChildSize() {
		synchronized (lock) {
			return tabs.getPreferredSize();
		}
	}

	@Override public void addComponent(String title, Component view, DisplayType panel) {
		synchronized (lock) {
			addTab(title, view);
		}
	}

	@Override public boolean containsComponent(Component view) {
		synchronized (lock) {
			return tabs.indexOfComponent(view) != -1;
		}
	}

	@Override public void setSelectedComponent(Component view) {
		synchronized (lock) {
			try {
				tabs.setSelectedComponent(view);
			} catch (Exception e) {
				synchronized (lock) {
					Debuggable.printStackTrace(e);
				}
			}
		}
	}

	@Override public Dimension getSize(DisplayType frame) {
		synchronized (lock) {
			return tabs.getPreferredSize();
		}
	}

	@Override public List<Component> containsComponentOfClass(Class comp) {
		List<Component> list = new ArrayList<Component>();
		synchronized (lock) {

			for (Component c : tabs.getComponents()) {
				if (comp.isInstance(c))
					list.add(c);
			}
		}
		return list;
	}

	@Override public Object getRootValue() {
		return this.rootValue;
	}
}
