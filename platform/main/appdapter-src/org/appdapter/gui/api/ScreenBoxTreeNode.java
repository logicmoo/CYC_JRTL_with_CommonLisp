package org.appdapter.gui.api;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import org.appdapter.api.trigger.Box;

public interface ScreenBoxTreeNode extends TreeNode {

	public abstract void setDisplayContext(DisplayContext dc);

	public abstract DisplayContext getDisplayContext();

	public abstract Box getBox();

	public abstract Iterable<BT> getTreeChildren();

	public abstract Object getTreeRepresentedObject();

	public abstract ScreenBoxTreeNode getScreenBoxTreeParent();

	public abstract ScreenBoxTreeNode findDescendantNodeForBox(Box b);

	public abstract void add(MutableTreeNode childNode);

}
