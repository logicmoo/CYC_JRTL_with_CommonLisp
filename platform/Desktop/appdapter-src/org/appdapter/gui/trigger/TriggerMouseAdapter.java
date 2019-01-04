package org.appdapter.gui.trigger;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.accessibility.Accessible;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.CellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import org.appdapter.core.jvm.CallableWithParameters;
import org.appdapter.core.jvm.GetObject;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.ObjectView;
import org.appdapter.gui.swing.SmallObjectView;

import com.jidesoft.swing.JideTabbedPane;
//import com.sun.java.swing.plaf.windows.WindowsComboBoxUI;

public class TriggerMouseAdapter extends MouseAdapter implements PopupMenuListener {
	static boolean alreadyInstalled = false;

	static Map<Component, TriggerMouseAdapter> comp2adapter = new HashMap();

	static ImageIcon icon = null;

	static Object installKBListenerLock = new Object();

	static boolean lookedOnce = true;

	public static boolean onlyTextComponents = true;

	static {
		installMouseListeners();
	}

	public static void addCopyText(JPopupMenu popup, final String txt) {
		if (txt == null || txt.length() < 1)
			return;
		String str = "\"" + txt + "\"";
		if (txt.length() > 30) {
			int ind = txt.indexOf(' ', 29);
			if (ind == -1) {
				ind = txt.length();
			} else {
				str = "All \"" + txt.substring(0, ind) + "...\"";
			}
		}
		JMenuItem item = new JMenuItem(new AbstractAction("Copy " + str) {
			@Override public void actionPerformed(ActionEvent e) {
				StringSelection stringSelection = new StringSelection(txt);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
			}
		});
		item.setEnabled(true);
		Action act = item.getAction();
		KeyStroke keyStroke1 = KeyStroke.getKeyStroke(KeyEvent.VK_C, 21);
		KeyStroke keyStroke = KeyStroke.getKeyStroke("shift ctrl c");
		act.putValue(Action.ACCELERATOR_KEY, keyStroke1);
		popup.add(item);

		if (!Utility.isAppReady()) {
			return;
		}
		Collection boxes = Utility.getTreeBoxCollection().findObjectsByName(txt, Object.class);
		if (boxes != null) {
			for (Object o : boxes)
				TriggerMenuFactory.addTriggersToPopup(o, popup);
		}
	}

	public static void addCutPaste(final JTextComponent component, final JPopupMenu menu) {
		JMenuItem item;
		item = new JMenuItem(new DefaultEditorKit.CopyAction());
		item.setText("Copy");
		item.setEnabled(component.getSelectionStart() != component.getSelectionEnd());
		item.getAction().putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl C"));
		menu.add(item);
		item = new JMenuItem(new DefaultEditorKit.CutAction());
		item.setText("Cut");
		item.setEnabled(component.isEditable() && component.getSelectionStart() != component.getSelectionEnd());
		item.getAction().putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl X"));
		menu.add(item);
		item = new JMenuItem(new DefaultEditorKit.PasteAction());
		item.setText("Paste");
		item.setEnabled(component.isEditable());
		item.getAction().putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl V"));
		menu.add(item);
		menu.addSeparator();
		menu.add(new AbstractAction("Select All") {
			{
				putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl A"));
			}

			public void actionPerformed(ActionEvent e) {
				component.selectAll();
			}

			public boolean isEnabled() {
				return component.isEnabled() && component.getText().length() > 0;
			}
		});
		Action[] acts = component.getActions();
		if (acts != null && acts.length > 0) {
			menu.addSeparator();
			for (Action act : acts) {
				if (act instanceof TextAction)
					continue;
				menu.add(act);
			}
			menu.addSeparator();
		}
	}

	public static Component addAdditionalTextItems(MouseEvent e, JPopupMenu popup) {
		Component c = null;
		if (c == null) {
			c = e.getComponent();
		}
		if (c instanceof JTextComponent) {
			addCutPaste((JTextComponent) c, popup);
		}
		final String txt = getTextValue(e, c, true);
		if (txt != null && txt.length() > 0) {
			addCopyText(popup, txt);
			final String word = getTextValue(e, c, false);
			if (word != null && word.length() > 0 && !word.equals(txt)) {
				addCopyText(popup, word);
			}
		}
		return c;
	}

	static boolean addWorkarrounds(JComboBox combo) {
		if (lookedOnce && icon == null)
			return true;

        /*
         * When tryig to run an osgi app outside of maven, I get:
         * java.lang.NoClassDefFoundError: com/sun/java/swing/plaf/windows/WindowsComboBoxUI
         * Commenting out the code below to temporarily fix this.
         * -- Matt 2013-10-25
         */
//		if (combo.getUI() instanceof WindowsComboBoxUI) {
//			combo.setUI(new WindowsComboBoxUI() {
//
//				@Override protected JButton createArrowButton() {
//
//					if (icon == null && !lookedOnce) {
//						lookedOnce = true;
//						try {
//							icon = new ImageIcon(getClass().getResource("14x14.png"));
//						} catch (Exception e) {
//
//						}
//					}
//					JButton button = new JButton(icon) {
//						@Override public Dimension getPreferredSize() {
//							return new Dimension(14, 14);
//						}
//					};
//					button.setRolloverIcon(makeRolloverIcon(icon));
//					button.setFocusPainted(false);
//					button.setContentAreaFilled(false);
//					return button;
//				}
//			});
//		} else {
			combo.setUI(new BasicComboBoxUI() {
				@Override protected JButton createArrowButton() {
					JButton button = super.createArrowButton();
					((BasicArrowButton) button).setDirection(SwingConstants.EAST);
					return button;
				}
			});
//		}
		return true;
	}

	public static String getTextValue(MouseEvent e, Component c, boolean useAllText) {
		String allText = null;
		if (c instanceof JTree) {
			JTree tree = (JTree) c;
			TreePath path = tree.getPathForLocation(e.getX(), e.getY());
			if (path != null) {
				DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) path.getLastPathComponent();
				if (treeNode != null) {
					allText = "" + treeNode;
				}
			}
		}
		if (c instanceof JTable) {
			JTable theTable = (JTable) c;
			int row = theTable.rowAtPoint(e.getPoint());
			int col = theTable.columnAtPoint(e.getPoint());
			CellEditor ce = theTable.getCellEditor(row, col);
			Object val = null;
			if (ce != null) {
				val = ce.getCellEditorValue();
			}
			if (val == null)
				val = theTable.getValueAt(row, col);
			if (val == null) {
				return null;
			}
			allText = "" + val;

		}
		if (allText == null)
			allText = TriggerMenuFactory.getComponentLabelNoParent(c, 0);

		if (useAllText)
			return allText;
		if (allText != null) {
			int caret = -1;
			if (c instanceof JTextArea) {
				JTextArea textArea = (JTextArea) c;
				textArea.setCaretPosition(textArea.viewToModel(e.getPoint()));
				caret = textArea.getCaretPosition();
			}
			if (c instanceof JTextComponent) {
				JTextComponent textArea = (JTextComponent) c;
				String str = textArea.getSelectedText();
				if (str == null || str.length() == 0) {
					caret = textArea.viewToModel(e.getPoint());
					textArea.setCaretPosition(caret);
					caret = textArea.getCaretPosition();
				} else {
					caret = textArea.getSelectionStart();
				}
			}
			return wordAt(caret, allText);
		}
		return null;
	}

	static public void installContextMenu(Component c) {
		synchronized (comp2adapter) {
			if (comp2adapter.containsKey(c))
				return;
		}
		if (c instanceof JComponent) {
			installMouseAdapter(c);
		}
		if (c instanceof Container) {
			for (Component c1 : ((Container) c).getComponents()) {
				installContextMenu(c1);
			}
		}

	}

	public static TriggerMouseAdapter installMouseAdapter(Component goc) {
		synchronized (comp2adapter) {
			Component comp = (Component) goc;
			TriggerMouseAdapter ma = comp2adapter.get(comp);
			if (ma == null) {
				ma = new TriggerMouseAdapter(comp);
			}
			return ma;
		}
	}

	public static TriggerMouseAdapter installMouseAdapter(Component comp, Object represented) {
		TriggerMouseAdapter ma = installMouseAdapter(comp);
		ma.setObject(represented);
		return ma;
	}

	public static void installMouseListeners() {
		if (alreadyInstalled)
			return;
		synchronized (installKBListenerLock) {
			if (alreadyInstalled)
				return;
			alreadyInstalled = true;
		}
		KeyboardFocusManager focusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		focusManager.addPropertyChangeListener("permanentFocusOwner", new PropertyChangeListener() {
			@Override public void propertyChange(PropertyChangeEvent evt) {
				TriggerMouseAdapter.noticeComponent(evt.getNewValue());
			}
		});
		focusManager.addPropertyChangeListener("activeWindow", new PropertyChangeListener() {
			@Override public void propertyChange(PropertyChangeEvent evt) {
				TriggerMouseAdapter.noticeComponent(evt.getNewValue());
				TriggerMouseAdapter.noticeComponent(evt.getOldValue());
			}
		});
	}

	public static ImageIcon makeRolloverIcon(ImageIcon srcIcon) {
		RescaleOp op = new RescaleOp(new float[] { 1.2f, 1.2f, 1.2f, 1.0f }, new float[] { 0f, 0f, 0f, 0f }, null);
		BufferedImage img = new BufferedImage(srcIcon.getIconWidth(), srcIcon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		//g.drawImage(srcIcon.getImage(), 0, 0, null);
		srcIcon.paintIcon(null, g, 0, 0);
		g.dispose();
		return new ImageIcon(op.filter(img, null));
	}

	public static Collection<Object> extractTargets(MouseEvent e, JTable source) {
		int row = source.rowAtPoint(e.getPoint());
		int column = source.columnAtPoint(e.getPoint());

		if (!source.isRowSelected(row)) {
			source.changeSelection(row, column, false, false);
		}

		int columns = source.getColumnCount();
		Object cellSubBox = source.getValueAt(row, column);
		Object rowObject = null;
		TableModel tm = source.getModel();
		if (tm instanceof ListModel) {
			ListModel lm = (ListModel) tm;
			rowObject = lm.getElementAt(row);
		}

		if (e.isShiftDown() || columns < 2) {
			rowObject = Utility.dref(cellSubBox);
		}
		return Arrays.asList(cellSubBox, rowObject);

	}

	public Collection<Object> extractTargets(MouseEvent e, JTree tree) {
		int x = e.getX();
		int y = e.getY();
		TreePath path = tree.getPathForLocation(x, y);
		if (path == null) {
			return Collections.emptyList();
		}
		tree.setSelectionPath(path);

		DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) path.getLastPathComponent();
		Object uo = treeNode.getUserObject();
		return Arrays.asList(uo, treeNode);
	}

	public static boolean isDoubleClick(MouseEvent e) {
		return !e.isPopupTrigger() && e.getClickCount() > 1;
	}

	public static void noticeComponent(Object newValue) {
		if (newValue instanceof Component) {
			Component comp = (Component) newValue;
			installContextMenu(comp);
		}
	}

	public static void updateComponentTreeUI(Component c, boolean getChildren, int depth, CallableWithParameters<Component, Component> defaults) {
		boolean getMenu = false;

		if (c instanceof SmallObjectView && depth > 0)
			return;
		try {
			if (c instanceof JideTabbedPane) {
				c = defaults.call(c);
			} else {
				c = defaults.call(c);
			}
			if (getMenu) {
				if (c instanceof JComponent) {
					JComponent jc = (JComponent) c;
					JPopupMenu jpm = jc.getComponentPopupMenu();
					if (jpm != null /*&& jpm.isVisible() && jpm.getInvoker() == jc*/) {
						updateComponentTreeUI(jpm, getChildren, depth + 1, defaults);
					}
				}
			}
		} catch (Throwable t) {

		}

		Component[] children = null;
		if (c instanceof JMenu) {
			children = ((JMenu) c).getMenuComponents();
		} else if (c instanceof Container) {
			children = ((Container) c).getComponents();
		}
		if (children != null && getChildren) {
			for (int i = 0; i < children.length; i++) {
				updateComponentTreeUI(children[i], getChildren, depth + 1, defaults);
			}
		}
	}

	public static String wordAt(int fromIndex, String allText) {
		allText = " " + allText.replace("\n", " ") + " ";
		allText = allText.replace("\r", " ");
		allText = allText.replace("\t", " ");
		allText = allText.replace(".", " ");
		if (fromIndex < 0) {
			fromIndex = allText.indexOf(':');
			if (fromIndex < 0) {
				fromIndex = allText.indexOf(' ');
			}
		}
		while (allText.charAt(fromIndex) == ' ') {
			fromIndex++;
		}

		int firstSpace = allText.lastIndexOf(' ', fromIndex) + 1;
		int nextSpace = allText.indexOf(' ', fromIndex);

		if (nextSpace == -1) {
			nextSpace = allText.length();
		}
		return allText.substring(firstSpace, nextSpace);
	}

	public Object attachedTo;

	public Object attachedToComponent;

	//public static final ImageIcon icon =
	public CallableWithParameters doubleClickCall;

	public TriggerMouseAdapter(Component comp) {
		attachedToComponent = comp;
		synchronized (comp2adapter) {
			comp2adapter.put(comp, this);
		}
		comp.addMouseListener(this);
		addWorkarrounds(comp);
	}

	public void addToComponent(JideTabbedPane c, boolean andChildren) {
		final MouseAdapter ma = this;
		updateComponentTreeUI(c, andChildren, 0, new CallableWithParameters<Component, Component>() {
			@Override public Component call(Component box, Object... params) {
				box.removeMouseListener(ma);
				box.addMouseListener(ma);
				return box;
			}
		});
	}

	boolean addWorkarrounds(Component comp) {
		if (comp instanceof JComboBox) {
			JComboBox combo = (JComboBox) comp;
			addWorkarrounds(combo);
			return true;
		}
		return false;
	}

	public MouseListener alreadyHandler(MouseEvent e) {
		Component c = e.getComponent();
		MouseListener[] listeners = c.getMouseListeners();
		int ll = listeners.length - 1;
		MouseListener ml = listeners[ll];
		if (listeners[ll] != this) {
			c.removeMouseListener(this);
			c.addMouseListener(this);
			return ml;
		}
		if (ll > 1) {
			for (int i = 0; i < ll; i++) {
				MouseListener m = listeners[i];
				if (m == null)
					continue;
				Class lc = m.getClass();
				if (lc.getName().startsWith("java"))
					continue;
				if (m instanceof MouseAdapterWithAppendablePopup) {
					return m;
				}
				if (m instanceof MouseAdapter) {
					TriggerMenuFactory.theLogger.warn("handled " + m.getClass() + " " + m + "\n-" + e);
					return m;
				}
			}
		}
		return null;
	}

	public Object getComponent() {
		return attachedToComponent;
	}

	public Object getObject() {
		Object source = attachedTo;
		if (!(source instanceof Component)) {
			Object source2 = getComponent();
			if (source2 != null)
				source = source2;
		}
		if (!(source instanceof Component)) {
			source = attachedTo;
		}
		if (source instanceof Component) {
			ObjectView host = (ObjectView) SwingUtilities.getAncestorOfClass(ObjectView.class, (Component) source);
			if (host != null) {
				Object source2 = host.getValue();
				if (source2 != null)
					source = source2;
			}
		}
		return source;
	}

	public void mouseClicked(MouseEvent e) {
		mouseEvent(e);
	}

	public void mouseEvent(MouseEvent e) {
		if (e.isConsumed())
			return;
		synchronized (this) {
			// so popup menu events wont overlap
			mouseEvent0(e);
		}
	}

	public void mouseEvent(MouseEvent e, JTextComponent c) {

		if (!e.isConsumed() && e.isPopupTrigger()) {
			MouseListener ml = alreadyHandler(e);
			if (ml != this && ml != null && !(ml instanceof MouseAdapterWithAppendablePopup)) {
				return;
			}
			e.consume();
			final JTextComponent component = (JTextComponent) e.getComponent();
			final JPopupMenu menu = existingPopup(ml);
			addAdditionalTextItems(e, menu);
			menu.show(c, e.getX(), e.getY());
		}
	}

	public static JPopupMenu existingPopup(MouseListener ml) {
		JPopupMenu popup = null;
		if (ml instanceof MouseAdapterWithAppendablePopup) {
			popup = ((MouseAdapterWithAppendablePopup) ml).getPopup();
			if (popup == null) {
				popup = new JPopupMenu();
				((MouseAdapterWithAppendablePopup) ml).setPopup(popup);
			}
		}
		if (popup == null) {
			popup = new JPopupMenu();
		}
		return popup;
	}

	public void mouseEvent0(MouseEvent e) {
		if (e.isConsumed()) {
			return;
		}
		MouseListener ml = alreadyHandler(e);
		if (ml != this && ml != null && !(ml instanceof MouseAdapterWithAppendablePopup)) {
			return;
		}
		final Component c = e.getComponent();
		Collection<Object> targets = new ArrayList<Object>();
		if (c instanceof JTable) {
			targets.addAll(extractTargets(e, (JTable) c));
		} else if (c instanceof JTree) {
			targets.addAll(extractTargets(e, (JTree) c));
		}
		collectAnscestor(c, GetObject.class, targets);

		collectAnscestor(c, ObjectView.class, targets);

		Object attachedTo = this.attachedTo;

		if (attachedTo == attachedToComponent) {
			attachedTo = null;
		}
		if (attachedTo == null) {
			attachedTo = getObject();
		}
		if (attachedTo == attachedToComponent) {
			attachedTo = null;
		}
		if (attachedTo != null) {
			targets.add(attachedTo);
		}
		boolean targetsPresent = targets.size() > 0;
		if (attachedTo == null && targetsPresent) {
			attachedTo = targets.iterator().next();
		}
		if (e.isPopupTrigger()) {
			if (!targetsPresent) {
				if (onlyTextComponents) {
					if ((!(c instanceof JTextComponent)) && (!(c instanceof JLabel))) {
						TriggerMenuFactory.theLogger.warn("notevent " + c.getClass() + " " + c.getName() + "\n-" + e);
						return;
					}
				}
				TriggerMenuFactory.theLogger.warn("isDefaultPopupTrigger " + c + " src=" + c + "\n-" + e);
			} else {
				String cn = Utility.getUniqueNamePretty(attachedTo);
				TriggerMenuFactory.theLogger.warn("isPopupTrigger " + c + " attachedTo=" + attachedTo + "\n-" + e);
			}
			JPopupMenu popup = null;
			if (Utility.isAppReady()) {
				popup = TriggerMenuFactory.buildPopupMenuAndShowC(e, false, targets);
			} else {
				popup = existingPopup(ml);
			}
			addAdditionalTextItems(e, popup);
			popup.show(e.getComponent(), e.getX(), e.getY());
			//e.consume();
		} else {
			c.setVisible(true);
			Component cp = c.getParent();
			if (cp instanceof JTabbedPane) {
				JTabbedPane jtp = (JTabbedPane) cp;
				if (c != null) {
					jtp.setSelectedComponent(c);
				}
			}
			if (isDoubleClick(e) && doubleClickCall != null) {
				if (c != null) {
					if(targets.size()>0) {
					doubleClickCall.call(targets.iterator().next());
					String cn = Utility.getUniqueNamePretty(c);
					TriggerMenuFactory.theLogger.trace("DOUBLE-Click " + cn + "\n-" + e);
					}
					return;
				}
			}
			TriggerMenuFactory.theLogger.trace("Click " + c + "\n-" + e);
		}

	}

	private void collectAnscestor(final Component c, Class cls, Collection<Object> targets) {
		GetObject host = (GetObject) SwingUtilities.getAncestorOfClass(cls, (Component) c);
		if (host != null) {
			Object source2 = host.getValue();
			if (source2 != null && source2 != host) {
				if (!targets.contains(source2))
					targets.add(source2);
			}
		}
	}

	public void mousePressed(MouseEvent e) {
		mouseEvent(e);
	}

	public void mouseReleased(MouseEvent e) {
		mouseEvent(e);
	}

	@Override public void popupMenuCanceled(PopupMenuEvent e) {
	}

	@Override public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
	}

	@Override public void popupMenuWillBecomeVisible(final PopupMenuEvent e) {
		EventQueue.invokeLater(new Runnable() {
			@Override public void run() {
				JComboBox combo = (JComboBox) e.getSource();
				Accessible a = combo.getAccessibleContext().getAccessibleChild(0);
				//Or Accessible a = combo.getUI().getAccessibleChild(combo, 0);
				if (a instanceof BasicComboPopup) {
					BasicComboPopup pop = (BasicComboPopup) a;
					Point p = new Point(combo.getSize().width, 0);
					SwingUtilities.convertPointToScreen(p, combo);
					pop.setLocation(p);
				}
			}
		});
	}

	public void setDoubleClick(String string, CallableWithParameters o) {
		this.doubleClickCall = o;

	}

	public void setObject(Object represented) {
		if (attachedTo == represented)
			return;
		if (!(attachedToComponent instanceof Component)) {
			Utility.bug(this, "attachedToComponent", attachedTo);
		}
		attachedTo = represented;
	}

}