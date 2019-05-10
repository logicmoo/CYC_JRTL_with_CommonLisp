/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/*
 * BrowsePanel.java
 *
 * Created on Oct 25, 2010, 1:18:06 PM
 */

package org.appdapter.gui.browse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ToolTipManager;
import javax.swing.tree.TreeModel;

import org.appdapter.core.debug.UIAnnotations.UIHidden;
import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.core.jvm.CallableWithParameters;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.IShowObjectMessageAndErrors;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.box.AbstractScreenBoxTreeNodeImpl;
import org.appdapter.gui.editors.DnDTabbedPane;
import org.appdapter.gui.swing.CollectionEditorUtil;
import org.appdapter.gui.swing.DisplayContextUIImpl;
import org.appdapter.gui.swing.JTabbedPaneWithCloseIcons;
import org.appdapter.gui.swing.LookAndFeelMenuItems;
import org.appdapter.gui.swing.ObjectTabsForTabbedView;
import org.appdapter.gui.swing.SafeJMenu;
import org.appdapter.gui.trigger.TriggerMouseAdapter;

import com.jidesoft.swing.JideTabbedPane;
import com.jidesoft.tree.StyledTreeCellRenderer;

/**
 * @author Stu B. <www.texpedient.com>
 */
@UIHidden
public class BrowsePanel extends javax.swing.JPanel implements IShowObjectMessageAndErrors {

	private static int instanceNumber;

	static {
		TriggerMouseAdapter.installMouseListeners();
	}
	public TreeModel myTreeModel;
	public DisplayContextUIImpl app;
	public AddToTreeListener addToTreeListener;
	public BoxContext myBoxContext;

	@UISalient
	boolean OnTreeFocusShowObject = false;
	private ObjectTabsForTabbedView myBoxPanelSwitchableViewImpl;

	public BoxContext getBoxContext() {
		return myBoxContext;
	}

	public static void main(String[] args) {
		Utility.ensureRunning();
	}

	/** Creates new form BrowsePanel */
	public BrowsePanel(TreeModel tm, BoxContext bctx0) {
		Utility.addSingleton(this);
		synchronized (Utility.featureQueueLock) {
			init(tm, bctx0, Utility.uiObjects, Utility.getClipboard());
		}
	}

	public void init(TreeModel tm, BoxContext bctx0, NamedObjectCollection ctx, NamedObjectCollection clipboard) {
		Utility.browserPanel = this;
		myTreeModel = tm;
		initComponents();
		JTree tree = myTree;
		Utility.theBoxPanelDisplayContext = this.myBoxPanelSwitchableViewImpl = new ObjectTabsForTabbedView(myBoxPanelTabPane, true, null);
		setTabbedPaneOptions();
		Utility.controlApp = app = new DisplayContextUIImpl(myBoxPanelSwitchableViewImpl, this, ctx);
		Utility.setup();
		Utility.clipBoardUtil = new CollectionEditorUtil(clipboard.getName(), app, clipboard);
		myBoxPanelTabPane.add("Clipboard", Utility.clipBoardUtil.getGUIPanel());
		myBoxPanelTabPane.setBackground(Color.LIGHT_GRAY);
		//UIManager.put("nimbusBase", new ColorUIResource(128, 128, 128));
		myBoxContext = bctx0;
		hookTree();
		this.addToTreeListener = new AddToTreeListener(myTree, ctx, bctx0, (MutableBox) bctx0.getRootBox(), true);
		//addClipboard(clipboard);
		Utility.setSingletonValue(getClass(), this);
		invalidate();
	}

	public void setDividerLocation(double proportionalLocation) {
		myBrowserSplitPane.setDividerLocation(Math.max((int) ((double) (myBrowserSplitPane.getWidth() - myBrowserSplitPane.getDividerSize()) * proportionalLocation), 100));
		invalidate();
	}

	public void selectInTree(Object anyObject) {
		addToTreeListener.selectInTree(anyObject);
	}

	private void setTabbedPaneOptions() {
		if (!(myBoxPanelTabPane instanceof JideTabbedPane))
			return;
		/** JIDESOFT */
		boolean closableTabs = true;
		JideTabbedPane jide = (JideTabbedPane) myBoxPanelTabPane;
		jide.setBoldActiveTab(true);
		jide.setShowCloseButtonOnMouseOver(false);
		jide.setScrollSelectedTabOnWheel(true);
		jide.setTabEditingAllowed(false);

		jide.setShowCloseButton(closableTabs);
		jide.setUseDefaultShowCloseButtonOnTab(closableTabs);
		jide.setCloseTabOnMouseMiddleButton(closableTabs);
		jide.setShowCloseButtonOnTab(closableTabs);
	}

	private void hookTree() {
		ToolTipManager.sharedInstance().registerComponent(myTree);
		/** JIDESOFT */
		SearchableDemo.installSearchable(myTree);
		myTree.setCellRenderer(new StyledTreeCellRenderer() {

			@Override
			protected void customizeStyledLabel(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hazFocus) {
				try {
					if (value instanceof AbstractScreenBoxTreeNodeImpl) {
						Box box = ((AbstractScreenBoxTreeNodeImpl) value).getBox();
						if (box != null)
							value = box;
					}
					String valueStr = Utility.getUniqueNamePretty(value);
					super.customizeStyledLabel(tree, valueStr, sel, expanded, leaf, row, hazFocus);
					setText(valueStr);
					if (OnTreeFocusShowObject && hazFocus && sel) {
						Object deref = Utility.dref(value);
						if (deref != null && deref != value) {
							try {
								String text = getText();
								showScreenBox(text, deref);
							} catch (Exception e) {
								e.printStackTrace();
								throw Debuggable.reThrowable(e);
							}
						}
					}
				} catch (Throwable t) {
					Debuggable.printStackTrace(t);
				}
				// here is the code to customize the StyledLabel for each tree node
			}

			@Override
			public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hazFocus) {

				Component c = super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hazFocus);
				setToolTipText(Utility.makeTooltipText(value));
				if (c != this) {
					return c;
				}
				return this;
			}

		});

	}

	@Override
	public void setVisible(final boolean aFlag) {
		Utility.invokeAndWait(new Runnable() {
			@Override public void run() {
				checkParent();
				BrowsePanel.super.setVisible(aFlag);
				Utility.updateToolsMenu();
				Utility.updateLastResultsMenu();
			}
		});
	}

	@Override
	public void addNotify() {
		super.addNotify();
		checkParent();
	}

	@Override
	public void show() {
		checkParent();
		super.show();
	}

	Container hookedParent = null;
	private JMenuBar oldJMenuBar;
	boolean checkingParent = false;

	public synchronized void checkParent() {
		if (checkingParent)
			return;
		Container p = getTopLevelAncestor();
		if (p == null) {
			return;
		}
		checkingParent = true;
		if (p == hookedParent)
			return;
		unHookFrom(hookedParent);
		hookTo(p);
		Utility.invokeAfterLoader(new Runnable() {
			@Override public void run() {
				setDividerLocation(0.33);
			}

			@Override public String toString() {
				return "setDividerLocation(0.33);";
			}
		});
	}

	private void unHookFrom(Container p) {
		if (p == null)
			return;
		if (p instanceof JFrame) {
			JFrame jf = (JFrame) p;
			if (jf.getJMenuBar() == myTopFrameMenu) {
				jf.setJMenuBar(oldJMenuBar);
			}
		}
	}

	private void hookTo(Container p) {
		if (p == null)
			return;
		if (p instanceof JFrame) {
			JFrame jf = (JFrame) p;
			JMenuBar nowMenuBar = jf.getJMenuBar();
			if (nowMenuBar != oldJMenuBar) {
				oldJMenuBar = nowMenuBar;
			}
			if (myTopFrameMenu == null) {

			}
			resetMenu();
			jf.setJMenuBar(myTopFrameMenu);
			myTopFrameMenu.setVisible(true);

			jf.setLayout(new BorderLayout());
			jf.add(this);
			return;
		}
	}

	private static void createLookAndFeelMenu() {
		try {
			JMenuBar menuBar = Utility.getMenuBar();
			menuBar.add(new LookAndFeelMenuItems("Look and Feel"));
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void resetMenu() {

		JMenuBar menuBar;
		JMenu menu, submenu;
		menuBar = myTopFrameMenu = Utility.getMenuBar();

		myTopFrameMenu.removeAll();

		menuBar.add(Utility.clipBoardUtil.getFileMenu());

		menu = Utility.toolsMenu = new SafeJMenu(false, "Tools", this);
		menu.setMnemonic(KeyEvent.VK_T);
		menu.getAccessibleContext().setAccessibleDescription("Tool menu items");
		menuBar.add(menu);

		menu = Utility.lastResultsMenu = new SafeJMenu(false, "Results", this);
		menu.setMnemonic(KeyEvent.VK_R);
		menu.getAccessibleContext().setAccessibleDescription("Last returns");
		menuBar.add(menu);

		if (Utility.isLAFSafe())
			createLookAndFeelMenu();

		if (oldJMenuBar != null && oldJMenuBar != menuBar)
			menuBar.add(oldJMenuBar);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		myTopFrameMenu = new javax.swing.JMenuBar();
		myBrowserSplitPane = new javax.swing.JSplitPane();
		myTreeScrollPane = new javax.swing.JScrollPane();
		myTree = new javax.swing.JTree();
		myContentPanel = new javax.swing.JPanel();
		myBoxPanelStatus = new javax.swing.JTextField();
		myBoxPanelTabPane = new JTabbedPaneWithCloseIcons(JTabbedPane.TOP);
		myHomeBoxPanel = new javax.swing.JPanel();
		myLowerPanel = new javax.swing.JPanel();
		myCmdInputTextField = new javax.swing.JTextField();
		myLogScrollPane = new javax.swing.JScrollPane();
		myLogTextArea = new javax.swing.JTextArea();

		setLayout(new java.awt.BorderLayout());

		myTree.setModel(myTreeModel);
		myTreeScrollPane.setViewportView(myTree);

		myBrowserSplitPane.add(myTreeScrollPane, JSplitPane.LEFT);

		myContentPanel.setBackground(Color.LIGHT_GRAY);
		myContentPanel.setLayout(new java.awt.BorderLayout());

		myBoxPanelStatus.setText("Extra text field - used for status display and special console input .   This screen shows a box navigation system.");
		myBoxPanelStatus.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				myBoxPanelStatusActionPerformed(evt);
			}
		});
		myContentPanel.add(myBoxPanelStatus, java.awt.BorderLayout.NORTH);

		myBoxPanelTabPane.setAutoscrolls(true);
		myBoxPanelTabPane.setBackground(Color.LIGHT_GRAY);
		if (myBoxPanelTabPane instanceof JideTabbedPane) {
			JideTabbedPane jide = (JideTabbedPane) myBoxPanelTabPane;
			jide.setBoldActiveTab(true);
		}

		myHomeBoxPanel.setInheritsPopupMenu(true);

		javax.swing.GroupLayout myHomeBoxPanelLayout = new javax.swing.GroupLayout(myHomeBoxPanel);
		myHomeBoxPanel.setLayout(myHomeBoxPanelLayout);
		myHomeBoxPanelLayout.setHorizontalGroup(myHomeBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 956, Short.MAX_VALUE));
		myHomeBoxPanelLayout.setVerticalGroup(myHomeBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 519, Short.MAX_VALUE));

		myBoxPanelTabPane.addTab("Home", myHomeBoxPanel);

		myLowerPanel.setLayout(new java.awt.BorderLayout());

		myCmdInputTextField.setText("console input - type/paste commands/uris/urls here, and see output in resizable pane below.   NOTE:  The tabs at upper right can hold any Swing GUI components");
		myCmdInputTextField.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				myCmdInputTextFieldActionPerformed(evt);
			}
		});
		myLowerPanel.add(myCmdInputTextField, java.awt.BorderLayout.NORTH);

		myLogTextArea.setColumns(20);
		myLogTextArea.setEditable(false);
		myLogTextArea.setRows(5);
		//myLogTextArea.setText("one\ntwo\nthree\nfour\nfive\nsix\nseven\neight\nnine\nten");
		//ClassLoader.getSystemResources("/bsh/command")
		myLogScrollPane.setViewportView(myLogTextArea);

		myLowerPanel.add(myLogScrollPane, java.awt.BorderLayout.CENTER);

		myBoxPanelTabPane.addTab("Bsh Command", myLowerPanel);

		myContentPanel.add(myBoxPanelTabPane, java.awt.BorderLayout.CENTER);

		myBrowserSplitPane.add(myContentPanel, JSplitPane.RIGHT);
		setDividerLocation(0.33);

		add(myBrowserSplitPane, java.awt.BorderLayout.CENTER);
	}// </editor-fold>
		//GEN-END:initComponents

	private void myCmdInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCmdInputTextFieldActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_myCmdInputTextFieldActionPerformed

	private void myBoxPanelStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBoxPanelStatusActionPerformed
		// TODO add your handling code here:

	}//GEN-LAST:event_myBoxPanelStatusActionPerformed

	public void addTreeMouseAdapter() {
		TriggerMouseAdapter ma = TriggerMouseAdapter.installMouseAdapter(myTree);
		ma.setDoubleClick("Properties", new CallableWithParameters() {
			@Override public Object call(Object box, Object... params) {
				Utility.showProperties(box);
				return box;
			}
		});
		addMouseListener(ma);
	}

	public JTextField getBoxPanelStatus() {
		return myBoxPanelStatus;
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField myBoxPanelStatus;
	private JTabbedPane myBoxPanelTabPane;
	private javax.swing.JSplitPane myBrowserSplitPane;
	private javax.swing.JTextField myCmdInputTextField;
	private javax.swing.JPanel myContentPanel;
	private javax.swing.JPanel myHomeBoxPanel;
	private javax.swing.JScrollPane myLogScrollPane;
	private javax.swing.JTextArea myLogTextArea;
	private javax.swing.JPanel myLowerPanel;
	private javax.swing.JMenuBar myTopFrameMenu;
	private javax.swing.JTree myTree;
	private javax.swing.JScrollPane myTreeScrollPane;
	// End of variables declaration//GEN-END:variables
	Class myBoxPanelStatusType = null;

	public NamedObjectCollection getTreeBoxCollection() {
		return Utility.getTreeBoxCollection();
	}

	@Override
	public UserResult showMessage(String message, Class expected) {
		myBoxPanelStatus.setText(message);
		myBoxPanelStatusType = expected;
		Object was = null;
		if (expected != null && expected != String.class) {
			try {
				was = Utility.fromString(message, expected);
			} catch (NoSuchConversionException e) {
			}
			if (expected.isInstance(was)) {
				JPanel pnl = Utility.getPropertiesPanel(was);
				return showScreenBox(message, pnl);
			}
		}

		return UserResult.SUCCESS;
	}

	public String getMessage() {
		return myBoxPanelStatus.getText();
	}

	@Override
	public UserResult showScreenBox(String title, Object anyObject) {

		try {
			if (anyObject == null)
				return Utility.asUserResult(null);
			return addObject(title, anyObject, Utility.getDisplayType(anyObject.getClass()), true, false);
		} catch (Exception e) {
			throw Debuggable.UnhandledException(e);
		}
	}

	@Override public UserResult showScreenBox(Object anyObject) throws Exception {
		return showScreenBox(null, anyObject);
	}

	public UserResult addObject(final String title, final Object anyObject, final DisplayType attachType, final boolean showASAP, final boolean expandChildren) {
		final UserResult[] res = new UserResult[1];
		try {
			Utility.invokeAfterLoader(new Runnable() {

				@Override public void run() {
					res[0] = addObjectWorker(title, anyObject, attachType, showASAP, expandChildren);
				}

				@Override public String toString() {
					// TODO Auto-generated method stub
					return "addObjectWorker " + title + " " + anyObject;
				}

			});
		} catch (Throwable e) {
		}
		return new UserResult() {
			@Override public JPanel getPropertiesPanel() {
				UserResult soup = res[0];
				if (soup == null)
					return SUCCESS.getPropertiesPanel();
				return soup.getPropertiesPanel();
			}
		};
	}

	LinkedList<Object> workingOnShowingObject = new LinkedList<Object>();

	public UserResult addObjectWorker(String title, Object anyObject, DisplayType attachType, boolean showASAP, boolean expandChildren) {
		synchronized (workingOnShowingObject) {
			if (workingOnShowingObject.contains(anyObject))
				return UserResult.SUCCESS;
			workingOnShowingObject.add(anyObject);
		}
		try {

			if (attachType == DisplayType.TOSTRING) {
				return app.showScreenBox(title, anyObject);
			} else {

				BT impl = getTreeBoxCollection().findOrCreateBox(title, anyObject);
				if (showASAP) {
					return app.showScreenBox(title, impl);
				}
				if (expandChildren) {
					treeExpand(anyObject);
				}
			}
			return UserResult.SUCCESS;
		} catch (Exception e) {
			//throw Debuggable.UnhandledException(e);
			return UserResult.SUCCESS;
		} finally {
			synchronized (workingOnShowingObject) {
				workingOnShowingObject.remove(anyObject);
			}
		}
	}

	public void treeExpand(Object anyObject) {
		addToTreeListener.treeExpand(anyObject, 1);
	}

	public UserResult showScreenBox(String title, Object anyObject, DisplayType attachType) {
		return addObject(title, anyObject, attachType, true, false);
	}

	public BoxPanelSwitchableView getBoxPanelTabPane() {
		if (myBoxPanelSwitchableViewImpl == null) {
			myBoxPanelSwitchableViewImpl = (ObjectTabsForTabbedView) Utility.getBoxPanelTabPane();
		}
		return myBoxPanelSwitchableViewImpl;
	}

	public Component getComponent() {
		return this;
	}

	public JTree getTree() {
		return myTree;
	}

	public JTabbedPane getTabbedPane() {
		return myBoxPanelTabPane;
	}

	public Container getGenericContainer() {
		return myBoxPanelTabPane;
	}

	public JDesktopPane getDesktopPane() {
		// for now we do not want to use desktop panes
		return null;//myDesktopPane;
	}

	public Collection getTriggersFromUI(Object object) {
		return app.getTriggersFromUI(object);
	}

	@Override
	public UserResult showError(String msg, Throwable error) {
		return app.showError(msg, error);
	}

	public DisplayContextUIImpl getDisplayContext() {
		return app;
	}

	public void addTab(String title, JComponent thing) {
		myBoxPanelTabPane.add(title, thing);

	}

	@Override public UserResult addObject(String title, Object anyObject, boolean showASAP, boolean expandChildren) {
		UserResult res = addObject(title, anyObject, DisplayType.TREE, showASAP, expandChildren);
		return res;
	}

}
