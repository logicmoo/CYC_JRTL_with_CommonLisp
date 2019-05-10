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

package org.appdapter.gui.demo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.beans.PropertyVetoException;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayContextProvider;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.api.ScreenBoxTreeNode;
import org.appdapter.gui.box.ScreenBoxContextImpl;
import org.appdapter.gui.box.ScreenBoxTreeNodeImpl;
import org.appdapter.gui.browse.BrowsePanel;
import org.appdapter.gui.browse.Utility;

/**
 * @author Stu B. <www.texpedient.com>
 */
abstract public class BaseDemoNavigatorCtrl implements BrowserPanelGUI, org.appdapter.demo.DemoBrowserCtrl {


	public BrowserPanelGUI getLocalTreeAPI() {
		return this;
	}

	private TreeModel myTM;
	private BoxContext myBoxCtx;
	private ScreenBoxTreeNodeImpl myRootBTN;
	private DisplayContextProvider myDCP;
	private BrowsePanel myBP;
	private JFrame myJFrame;

	public DisplayContext getDisplayContext() {
		if (myBP != null)
			return myBP.getDisplayContext();
		return this;
	}

	public BrowsePanel getBrowsePanel() {
		return myBP;
	}

	public BoxContext getBoxContext() {
		return myBoxCtx;
	}

	public BaseDemoNavigatorCtrl() {
		Utility.addSingleton(this);
		myRootBTN = new ScreenBoxTreeNodeImpl(null, null, true, null);
		myBoxCtx = new ScreenBoxContextImpl(myRootBTN);
		myTM = ((ScreenBoxContextImpl) myBoxCtx).ensureTreeModel();
		myDCP = myRootBTN;
		setupBrowsePanel();
	}

	public BaseDemoNavigatorCtrl(BoxContext bc, TreeModel tm, ScreenBoxTreeNode rootBTN, DisplayContextProvider dcp) {
		Utility.addSingleton(this);
		myRootBTN = (ScreenBoxTreeNodeImpl) rootBTN;
		myBoxCtx = bc;
		myTM = tm;
		myDCP = dcp;
		setupBrowsePanel();
	}

	private void setupBrowsePanel() {
		Utility.initGUIInThread();
		myBP = new BrowsePanel(myTM, myBoxCtx);
		DisplayContext dc = myBP.getDisplayContext();
		myRootBTN.setDisplayContext(dc);
		myBP.addTreeMouseAdapter();
	}

	public void launchFrameBlocking(final String title) {
		Utility.invokeAndWait(new Runnable() {
			@Override public void run() {
				launchFrameBlockingInSwing(title);

			}
		});
	}

	public void launchFrameBlockingInSwing(String title) {
		myJFrame = Utility.appFrame;
		boolean firstTime = false;
		if (myJFrame == null) {
			Utility.appFrame = myJFrame = new JFrame();
			///if (title == null) title = getClass().getCanonicalName();
			firstTime = true;
		} else {
			//was: throw new RuntimeException("Frame already launched!");
		}

		if (title != null)
			myJFrame.setTitle(title);

		if (firstTime) {
			// we dont need to "myJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);" do this.. main methods can
			myJFrame.getContentPane().add(myBP, BorderLayout.CENTER);
			myBP.checkParent();
			  com.netbreeze.util.Utility.centerWindow(myJFrame);
			myJFrame.pack();
		}

		show();
	}

	public void addBoxToRoot(MutableBox childBox, boolean reload) {
		Box rootBox = myBoxCtx.getRootBox();
		myBoxCtx.contextualizeAndAttachChildBox(rootBox, childBox);
		if (reload) {
			try {
				Utility.invokeLater(new Runnable() {
					@Override public void run() {
						((DefaultTreeModel) myTM).reload();
					}
				});
			} catch (Throwable e) {
			}
		}
	}

	@Override public UserResult showScreenBox(Object anyObject) {
		return showScreenBox(null, anyObject);
	}

	@Override public UserResult showScreenBox(String title, Object anyObject) {
		try {
			return myBP.showScreenBox(title, anyObject);
		} catch (Exception e) {
			return myBP.showError(e.getMessage(), e);
		}
	}

	@Override
	public JFrame getFrame() {
		return myJFrame;
	}

	public UserResult addObject(String title, Object object, DisplayType displayType) throws UnsatisfiedLinkError {
		return addObject(title, object, displayType, true);
	}

	public Component getComponent() {
		return myBP;
	}

	@Override public NamedObjectCollection getLocalBoxedChildren() {
		return getNOC();
	}

	@Override public UserResult showMessage(String message, Class extraInfo) {
		return myBP.showMessage(message, extraInfo);
	}

	@Override public BoxPanelSwitchableView getBoxPanelTabPane() {
		return myBP.getBoxPanelTabPane();
	}

	public UserResult addObject(String title, Object child, DisplayType attachType, boolean showASAP) throws UnsatisfiedLinkError {
		return myBP.addObject(title, child, attachType, showASAP, false);

	}

	public void addRepo(String title, Object anyObject) {
		addObject(title, anyObject, DisplayType.TREE, true);
	}

	@Override public Collection getTriggersFromUI(Object object) {
		return myBP.getTriggersFromUI(object);
	}

	@Override public UserResult showError(String msg, Throwable error) {
		return myBP.showError(msg, error);
	}

	@Override public UserResult addObject(String title, Object anyObject, boolean showASAP) {
		return myBP.addObject(title, anyObject, DisplayType.ANY, showASAP, false);
	}

	@Override public UserResult addObject(String title, Object anyObject, boolean showASAP, boolean expandChildren) {

		return myBP.addObject(title, anyObject, DisplayType.ANY, showASAP, expandChildren);
	}

	private NamedObjectCollection getNOC() {
		return myBP.getTreeBoxCollection();
	}

	@Override public String getTitleOf(Object anyObject) {
		return getNOC().getTitleOf(anyObject);
	}

	public void addListener(POJOCollectionListener objectChoice, boolean catchup) {
		getNOC().addListener(objectChoice, catchup);
	}

	@Override public Iterator<Object> getObjects() {
		return getNOC().getObjects();
	}

	@Override public Object findObjectByName(String title) {
		return getNOC().findObjectByName(title);
	}

	public Collection findObjectsByType(Class type) {
		return getNOC().findObjectsByType(type);
	}

	public BT findOrCreateBox(Object newObject) {
		return getNOC().findOrCreateBox(newObject);
	}

	@Override public void renameObject(String oldName, String newName) throws PropertyVetoException {
		getNOC().renameObject(oldName, newName);
	}

	@Override public void initialize(String[] args) {
		launchFrameBlocking(null);
	}

}
