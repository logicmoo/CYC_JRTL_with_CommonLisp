package org.appdapter.gui.demo;

import java.awt.Container;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.tree.TreeModel;

import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayContextProvider;
import org.appdapter.gui.api.ScreenBoxTreeNode;
import org.appdapter.gui.browse.BrowsePanel;
import org.appdapter.gui.browse.Utility;
import org.logicmoo.bb.BeansContextListener;

public class DemoNavigatorCtrl extends BaseDemoNavigatorCtrl implements DisplayContext, org.appdapter.demo.DemoBrowserCtrl, BeansContextListener {

	public DemoNavigatorCtrl() {
		super();
	}

	public DemoNavigatorCtrl(BoxContext bc, TreeModel tm, ScreenBoxTreeNode rootBTN, DisplayContextProvider dcp) {
		super(bc, tm, rootBTN, dcp);
	}

	@Override public void launchFrame(final String title) {
		try {
			new Thread(new Runnable() {
				@Override public void run() {
					DemoNavigatorCtrl.super.launchFrameBlocking(title);
				}
			}, "Launching frame slowly").start();
		} catch (Throwable e) {
			Debuggable.showFrame(e);
		}
	}

	public void addBoxToRoot(MutableBox childBox, boolean reload) {
		super.addBoxToRoot(childBox, reload);
	}

	@Override public void addRepo(String title, Object anyObject) {
		super.addRepo(title, anyObject);
	}

	public UserResult addObject(String title, Object anyObject, boolean showASAP) {
		return super.addObject(title, anyObject, showASAP);
	}

	@Override public UserResult addObject(String title, Object anyObject, boolean showASAP, boolean expandChildren) {
		return super.addObject(title, anyObject, showASAP, expandChildren);
	}

	public void addObject(String title, Object anyObject) {
		addObject(title, anyObject, false);
	}

	public JFrame getFrame() {
		return super.getFrame();
	}

	@Override public void show() {
		Container myJFrame0 = Utility.appFrame;
		if (myJFrame0 == null) {
			launchFrameBlocking(null);
		}
		boolean doCenter = false;
		BrowsePanel myBP = getBrowsePanel();
		Container myJFrame = myBP.getTopLevelAncestor();
		// we were started as a dwarf and maybe offscreen
		if (myJFrame.getSize().width < 10 || myJFrame.getSize().height < 10) {
			myJFrame.setSize(myJFrame.getPreferredSize());
			doCenter = true;
		}
		if (myJFrame.getSize().width < 10 || myJFrame.getSize().height < 10) {
			myJFrame.setSize(800, 600);
			doCenter = true;
		}
		if (doCenter) {
			if (myJFrame instanceof Window) {
				Utility.centerWindow((Window) myJFrame);
			}
		}
		myBP.setVisible(true);
		myJFrame.setVisible(true);
	}

	//@Override
	public void beanAdded(String named, Object anyObject) {
		addObject(named, anyObject);
	}

	//@Override
	public void beanRemoved(String named, Object obj) {
		//removeObject(obj);

	}
}
