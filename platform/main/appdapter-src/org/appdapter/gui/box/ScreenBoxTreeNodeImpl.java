package org.appdapter.gui.box;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.TreeNode;

import org.appdapter.api.trigger.AnyOper.HasIdent;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.Ident;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.ScreenBoxTreeNode;
import org.appdapter.gui.api.WrapperValue;
import org.appdapter.gui.browse.Utility;

public class ScreenBoxTreeNodeImpl extends AbstractScreenBoxTreeNodeImpl implements ScreenBoxTreeNode, TreeNode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final private boolean localNames = false;

	public ScreenBoxTreeNodeImpl(BoxPanelSwitchableView bsv, Box box, boolean allowsChildrn, NamedObjectCollection noc) {
		this.bsv = bsv;
		super.userObject = box;
		if (!(box instanceof BT)) {
			getUserObject();
		}
		this.allowsChildren = allowsChildrn;
		if (localNames) {
			if (allowsChildrn && noc == null) {
				noc = new BoxedCollectionImpl("Object chilens for " + box, this);
			}
			this.thisNamedObjectCollection = noc;
		}
	}

	@Override
	public Object getUserObject() {
		Object userObject = super.getUserObject();
		if (userObject instanceof WrapperValue) {
			Object userObject2 = ((WrapperValue) userObject).reallyGetValue();
			if (userObject2 != null) {
				if (userObject2 instanceof MutableBox) {
					userObject = userObject2;
				}
			}
		}
		return userObject;
	}

	@Override public String toString() {
		String w = wasToString();
		if (w.contains("default")) {
			w = wasToString();
		}
		return w;
	}

	public String wasToString() {
		String toStr = null;
		Object value = super.getUserObject();
		if (value instanceof WrapperValue) {
			Object rv = ((WrapperValue) value).reallyGetValue();
			if (rv != null)
				value = rv;
		}
		if (value instanceof HasIdent) {
			HasIdent kc = (HasIdent) value;
			Ident id = kc.getIdent();
			if (id != null) {
				toStr = id.getLocalName();
				if (toStr != null)
					return toStr;

			}
		}
		if (value instanceof KnownComponent) {
			KnownComponent kc = (KnownComponent) value;
			toStr = kc.getShortLabel();
			if (toStr != null)
				return toStr;
		}
		Object realUserObject = super.getUserObject();
		if (realUserObject instanceof KnownComponent) {
			KnownComponent kc = (KnownComponent) realUserObject;
			toStr = kc.getShortLabel();
			if (toStr != null)
				return toStr;
		}
		if (toStr == null) {
			return "<default ScreenBoxTreeNodeImpl null>";
		}
		return toStr;
	}

	@Override public BoxPanelSwitchableView getBoxPanelTabPane() {
		if (bsv != null)
			return bsv;
		DisplayContext mDctx = getDisplayContext();
		if (mDctx != null) {
			bsv = mDctx.getBoxPanelTabPane();
			if (bsv != null)
				return bsv;
		}
		ScreenBoxTreeNodeImpl sbp = getScreenBoxTreeParent();
		if (sbp != null)
			return sbp.getBoxPanelTabPane();
		return Utility.getBoxPanelTabPane();
	}

	@Override
	final public DisplayContext findDisplayContext(Box b) {
		return super.findTreeNodeDisplayContext(b);
	}

	@Override public ScreenBoxTreeNode findDescendantNodeForBox(Box b) {
		return super.findDescendantNodeForBox(b);
	}

	@Override public Object getValue() {
		return getBox().getValue();
	}

	@Override public void setObject(Object obj) throws InvocationTargetException {
		if (obj instanceof Box) {
			setBox((Box) obj);
			return;
		}
		setNonBox(obj);
	}

	private void setNonBox(Object obj) {
		throw Debuggable.warn("setNonBox", obj);
	}

	private void setBox(Box box) {
		setUserObject(box);
	}

	@Override
	public Iterable<BT> getTreeChildren() {
		List<BT> results = new ArrayList<BT>();
		ScreenBoxTreeNode parentNode = (ScreenBoxTreeNode) this;
		Enumeration childNodeEnum = parentNode.children();
		while (childNodeEnum.hasMoreElements()) {
			ScreenBoxTreeNode btn = (ScreenBoxTreeNode) childNodeEnum.nextElement();
			results.add((BT) btn.getBox());
		}
		return results;
	}

	@Override public Iterable<BT> getTreeRepresentedChildren() {
		return getTreeChildren();
	}

	@Override public Iterable<Object> getCollectionUnboxed() {
		return Utility.unboxObjects(getTreeChildren());
	}

	@Override public Object getTreeRepresentedObject() {
		return this;
	}
}
