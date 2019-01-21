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

package org.appdapter.gui.box;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.BoxContextImpl;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayContextProvider;
import org.appdapter.gui.api.ScreenBox;
import org.appdapter.gui.api.ScreenBoxTreeNode;
import org.appdapter.gui.browse.Utility;

/**
 * @author Stu B. <www.texpedient.com>
 *
 * This class operates on raw box types.
 */
public class ScreenBoxContextImpl extends BoxContextImpl implements DisplayContextProvider {
	private ScreenBoxTreeNodeImpl myRootNode;
	private DefaultTreeModel myTreeModel;
	private BoxPanelSwitchableView myAppCtxt;

	//private TableModel myTableModel;

	private ScreenBoxContextImpl() {
	}

	public ScreenBoxContextImpl(MutableBox rootBox) {
		contextualizeAndAttachRootBox(rootBox);
	}

	public ScreenBoxContextImpl(ScreenBoxTreeNodeImpl rootNode) {
		setRootNode(rootNode);
	}

	private void setRootNode(ScreenBoxTreeNodeImpl rootNode) {
		myRootNode = rootNode;
	}

	@Override
	public Box getRootBox() {
		Box result = null;
		if (myRootNode != null) {
			result = myRootNode.getBox();
		}
		return result;
	}

	public ScreenBoxTreeNodeImpl findNodeForBox(Box b) {
		return (ScreenBoxTreeNodeImpl) myRootNode.findTreeNodeDisplayContext(b);
	}

	@Override
	public Box getParentBox(Box child) {
		ScreenBoxTreeNode childNode = findNodeForBox(child);
		Object parent = childNode.getParent();
		if (parent instanceof Box)
			return ((Box) parent);
		if (parent instanceof ScreenBoxTreeNode)
			return ((ScreenBoxTreeNode) parent).getBox();

		return ((ScreenBoxTreeNode) childNode.getParent()).getBox();
	}

	// TODO:  Pass in the class parent of the expected children
	@Override
	public List<Box> getOpenChildBoxes(Box parent) {
		List<Box> results = new ArrayList<Box>();
		ScreenBoxTreeNode parentNode = (ScreenBoxTreeNode) findNodeForBox(parent);
		Enumeration childNodeEnum = parentNode.children();
		while (childNodeEnum.hasMoreElements()) {
			ScreenBoxTreeNode btn = (ScreenBoxTreeNode) childNodeEnum.nextElement();
			Box childBox = btn.getBox();
			results.add(childBox);
		}
		return results;
	}

	@Override
	public DisplayContext findDisplayContext(Box viewable) {
		ScreenBoxTreeNode btn = findNodeForBox(viewable);
		if(btn==null)  {
			Utility.warn("cant find box Node");
			return null;
		}
		return btn.getDisplayContext();
	}

	public void contextualizeAndAttachRootBox(MutableBox rootBox) {

		ScreenBoxTreeNodeImpl rootNode = new ScreenBoxTreeNodeImpl(null, rootBox, true, null);
		setRootNode(rootNode);
		rootBox.setContext(this);
		((ScreenBox) rootBox).setDisplayContextProvider(this);
	}

	protected ScreenBoxTreeNode attachChildBoxNode(ScreenBoxTreeNodeImpl parentNode, Box childBox) {
		//  childBox should already have context(==this) and displayContext.
		if (childBox.getBoxContext() != this) {
			throw new RuntimeException("Refusing to attach a childBox[" + childBox + "] which is not in this context [" + this + "]");
		}
		ScreenBoxTreeNodeImpl prev = (ScreenBoxTreeNodeImpl) parentNode.findTreeNodeDisplayContext/*findNodeForBox*/(childBox);
		if (prev != null)
			return prev;
		ScreenBoxTreeNodeImpl childNode = new ScreenBoxTreeNodeImpl(parentNode.bsv, childBox, true, null);
		String childName = childBox.toString();
		parentNode.add(childNode);
		if (myTreeModel != null) {
			if (parentNode instanceof TreeNode)
				reloadNode(parentNode);
		}
		return childNode;
	}

	protected ScreenBoxTreeNode detatchChildBoxNode(ScreenBoxTreeNodeImpl parentNode, Box childBox) {
		//  childBox should already have context(==this) and displayContext.
		BoxContext cbxt = childBox.getBoxContext();
		if (cbxt != null && cbxt != this) {
			Debuggable.warn("deattach a childBox[" + childBox + "] which is not in this context [" + this + "]");
		}
		ScreenBoxTreeNodeImpl prev = (ScreenBoxTreeNodeImpl) parentNode.findTreeNodeDisplayContext(childBox);
		if (prev != null) {
			parentNode.remove(prev);
			if (myTreeModel != null) {
				if (parentNode instanceof TreeNode)
					reloadNode(parentNode);
			}
			return prev;
		}
		return null;
	}

	@Override
	public ScreenBoxTreeNodeImpl findNodeForBox(Box parentBox, Box childBox) {
		ScreenBoxTreeNodeImpl parentNode = findNodeForBox(parentBox);
		if (parentNode == null) {
			throw new RuntimeException("Can't find node for parentBox: " + parentBox);
		}
		return (ScreenBoxTreeNodeImpl) parentNode.findDescendantNodeForBox(childBox);
	}

	@Override
	public void contextualizeAndAttachChildBox(Box parentBox, MutableBox childBox) {
		ScreenBoxTreeNodeImpl parentNode = findNodeForBox(parentBox);
		if (parentNode == null) {
			throw new RuntimeException("Can't find node for parentBox: " + parentBox);
		}
		childBox.setContext(this);

		ScreenBoxTreeNode childNode = attachChildBoxNode(parentNode, childBox);
		((ScreenBox) childBox).setDisplayContextProvider(this);
	}

	@Override
	public void contextualizeAndDetachChildBox(Box parentBox, MutableBox childBox) {
		ScreenBoxTreeNodeImpl parentNode = findNodeForBox(parentBox);
		if (parentNode == null) {
			throw new RuntimeException("Can't find node for parentBox: " + parentBox);
		}
		childBox.setContext(null);

		ScreenBoxTreeNode childNode = detatchChildBoxNode(parentNode, childBox);
		((ScreenBox) childBox).setDisplayContextProvider(null);
	}

	public TreeModel ensureTreeModel() {
		if (myTreeModel == null) {
			myTreeModel = new DefaultTreeModel(myRootNode);
		}
		return myTreeModel;
	}

	public TreeModel getTreeModel() {
		return myTreeModel;
	}

	public void ensureAndReloadTreeModel() {
		TreeModel tm = ensureTreeModel();
		final DefaultTreeModel dtm = (DefaultTreeModel) tm;
		Utility.invokeLater(new Runnable() {
			@Override public void run() {
				dtm.reload();
			}
		});

	}

	private void reloadNode(final ScreenBoxTreeNodeImpl parentNode) {
		Utility.invokeLater(new Runnable() {
			@Override public void run() {
				myTreeModel.reload((TreeNode) parentNode);
			}
		});
	}

}
