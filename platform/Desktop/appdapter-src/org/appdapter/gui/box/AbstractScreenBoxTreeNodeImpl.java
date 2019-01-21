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

import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;


import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayContextProvider;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.ScreenBoxTreeNode;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.trigger.PopupAdder;
import org.appdapter.gui.trigger.TriggerAdder;
import org.appdapter.gui.trigger.TriggerPopupMenu;
import org.appdapter.gui.util.Annotations.UIProvider;

/**
 * @author Stu B. <www.texpedient.com>
 */
@SuppressWarnings("serial")
abstract public class AbstractScreenBoxTreeNodeImpl extends DefaultMutableTreeNode implements GetSetObject, UIProvider, PopupAdder, DisplayContextProvider, DisplayContext {

	@Override
	abstract public String toString();

	protected DisplayContext myDisplayContext;
	protected BoxPanelSwitchableView bsv;
	protected NamedObjectCollection thisNamedObjectCollection;

	public BrowserPanelGUI getLocalTreeAPI() {
		return (BrowserPanelGUI) Utility.getCurrentContext();
	}

	final public DisplayContext getDisplayContext() {
		DisplayContext foundDC = myDisplayContext;
		if (foundDC == null) {

			ScreenBoxTreeNode parentNode = getScreenBoxTreeParent();
			if (parentNode != null) {
				foundDC = parentNode.getDisplayContext();
			}
			if (foundDC == null && bsv != null) {
				//foundDC = Utility. bsv.getDisplayContext();
			}
		}
		return foundDC;
	}

	/* (non-Javadoc)
	 * @see org.appdapter.gui.box.DisplayNode#getBox()
	 */
	final public Box getBox() {
		return (Box) super.getUserObject();
	}

	public abstract Iterable<BT> getTreeRepresentedChildren();

	public abstract Iterable<Object> getCollectionUnboxed();

	public abstract Object getTreeRepresentedObject();

	/* (non-Javadoc)
	 * @see org.appdapter.gui.box.DisplayNode#findDescendantNodeForBox(org.appdapter.api.trigger.Box)
	 */
	final public AbstractScreenBoxTreeNodeImpl findTreeNodeDisplayContext(Box b) {

		Object userObject = getBox();
		if (Utility.boxesRepresentSame(b, userObject)) {
			return this;
		} else {
			int childCount = getChildCount();
			for (int i = 0; i < childCount; i++) {
				AbstractScreenBoxTreeNodeImpl childNode = (AbstractScreenBoxTreeNodeImpl) getChildAt(i);
				AbstractScreenBoxTreeNodeImpl matchNode = childNode.findTreeNodeDisplayContext(b);
				if (matchNode != null) {
					return matchNode;
				}
			}
		}
		if (b instanceof AbstractScreenBoxTreeNodeImpl) {
			return (AbstractScreenBoxTreeNodeImpl) b;
		}
		return null;
	}

	/**
	 * Returns the child at the specified index in this node's child array.
	 *
	 * @param	index	an index into this node's child array
	 * @exception	ArrayIndexOutOfBoundsException	if <code>index</code>
	 *						is out of bounds
	 * @return	the TreeNode in this node's child array at  the specified index
	 */
	@Override
	public TreeNode getChildAt(int index) {
		if (children == null) {
			throw new ArrayIndexOutOfBoundsException("node has no children");
		}
		try {
			return (TreeNode) children.elementAt(index);
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			return null;
		}
	}

	final @Override public void add(MutableTreeNode childNode) {
		super.add((MutableTreeNode) childNode);

	}

	final public void add(Object childNode) throws Exception {
		super.add((MutableTreeNode) childNode);

	}

	final public ScreenBoxTreeNodeImpl getScreenBoxTreeParent() {
		Object parent = getParent();
		if (parent == null || parent instanceof ScreenBoxTreeNode)
			return (ScreenBoxTreeNodeImpl) parent;
		return null;
	}

	final public void setDisplayContext(DisplayContext dc) {
		myDisplayContext = dc;
	}

	public ScreenBoxTreeNode findDescendantNodeForBox(Box b) {
		return (ScreenBoxTreeNode) findTreeNodeDisplayContext(b);
	}

	/*
		@Override public Component getComponent() {
			DisplayContext displayContext = getDisplayContextNoLoop();
			return null;//displayContext.getComponent();
		}*/

	@Override public NamedObjectCollection getLocalBoxedChildren() {
		if (thisNamedObjectCollection != null)
			return thisNamedObjectCollection;
		DisplayContext dc = getDisplayContext();
		if (dc != this && dc != null)
			return dc.getLocalBoxedChildren();
		return Utility.getTreeBoxCollection();
	}

	@Override public Collection getTriggersFromUI(Object object) {
		DisplayContext displayContext = getDisplayContext();
		return displayContext.getTriggersFromUI(object);
	}

	/*
		@Override public UserResult showScreenBox(Object child) throws Exception {
			DisplayContext displayContext = getDisplayContextNoLoop();
			return displayContext.showScreenBox(child);
		}

		@Override public UserResult showError(String msg, Throwable error) {
			DisplayContext displayContext = getDisplayContextNoLoop();
			return displayContext.showError(msg, error);
		}

		@Override public UserResult showMessage(String msg) {
			DisplayContext displayContext = getDisplayContextNoLoop();
			return displayContext.showMessage(msg);

		}
	*/
	@Override public UserResult addObject(String title, Object value, boolean showASAP) throws Exception {
		return Utility.asUserResult(attachChildObject(title, value));
	}

	public AbstractScreenBoxTreeNodeImpl detachChildObect(String title, Object value) {
		AbstractScreenBoxTreeNodeImpl before = findChildObject(title, value);
		if (before != null) {
			remove(before);
		}
		return before;
	}

	protected ScreenBoxTreeNode attachChildBoxNode(ScreenBoxTreeNodeImpl parentNode, Box childBox) {
		//  childBox should already have context(==this) and displayContext.
		ScreenBoxTreeNodeImpl prev = (ScreenBoxTreeNodeImpl) parentNode.findTreeNodeDisplayContext/*findNodeForBox*/(childBox);
		if (prev != null)
			return prev;
		ScreenBoxTreeNodeImpl childNode = new ScreenBoxTreeNodeImpl(parentNode.bsv, childBox, true, null);
		String childName = childBox.toString();
		parentNode.add(childNode);

		if (parentNode instanceof TreeNode) {
			DefaultTreeModel myTreeModel = findTreeModel();
			if (myTreeModel != null) {
				myTreeModel.reload((TreeNode) parentNode);
			}
		}

		return childNode;
	}

	public DefaultTreeModel findTreeModel() {
		Box box = getBox();
		BoxContext myBoxCtx = box.getBoxContext();
		if (myBoxCtx == null) {
			return (DefaultTreeModel) Utility.browserPanel.myTreeModel;
		}
		DefaultTreeModel tm = (DefaultTreeModel) ((ScreenBoxContextImpl) myBoxCtx).getTreeModel();
		if (tm != null)
			return tm;
		return null;
	}

	@Override
	public void insert(MutableTreeNode newChild, int childIndex) {
		super.insert(newChild, childIndex);
		Collections.sort(this.children, nodeComparator);
	}

	//It also looks better if you're ignoring case sensitivity:
	protected static Comparator nodeComparator = new Comparator() {
		@Override
		public int compare(Object o1, Object o2) {
			return o1.toString().compareToIgnoreCase(o2.toString());
		}

		@Override
		public boolean equals(Object obj) {
			return false;
		}
	};

	public AbstractScreenBoxTreeNodeImpl attachChildObject(String title, Object value) {
		AbstractScreenBoxTreeNodeImpl before = findChildObject(title, value);
		if (before != null)
			return before;
		NamedObjectCollection col = getLocalBoxedChildren();
		BT b;
		try {
			b = col.findOrCreateBox(title, value);
			return (AbstractScreenBoxTreeNodeImpl) attachChildBoxNode((ScreenBoxTreeNodeImpl) this, Utility.asBoxed(b));

		} catch (Exception e) {
			throw Debuggable.reThrowable(e);
		}
	}

	public AbstractScreenBoxTreeNodeImpl findChildObject(String title, Object value) {
		NamedObjectCollection col = getLocalBoxedChildren();
		BT b1 = null, b2 = null;
		if (title != null) {
			b1 = col.findBoxByName(title);
		}
		if (value != null) {
			b2 = col.findBoxByObject(value);
		}
		if (b1 == null && b2 == null)
			return null;
		if (b2 == null) {
			b2 = b1;
		}
		Box box = Utility.asBoxed(b2);
		AbstractScreenBoxTreeNodeImpl before = findTreeNodeDisplayContext(box);
		return before;
	}

	@Override public String getTitleOf(Object value) {
		return getLocalBoxedChildren().getTitleOf(value);
	}

	@Override
	public void addLocalContributions(JPopupMenu popup) {
		if (children != null && children.size() > 0) {
			popup.add(new AbstractAction("Prune children") {

				@Override public void actionPerformed(ActionEvent e) {
					removeAllChildren();
				}
			});
		}
		Box thizBox = getBox();
		Object userObject = thizBox;
		Object value = userObject;
		if (userObject instanceof BT) {
			value = ((BT) userObject).getValue();
			if (value == null)
				value = userObject;
			Class beanClass = value.getClass();
			if (beanClass.isArray()) {
				beanClass = beanClass.getComponentType();
				if (Utility.isToStringType(beanClass) && beanClass != Class.class)
					return;
				popup.add(new ArrayValuesAsChildren(value));
				return;
			}
			if (value instanceof Collection) {
				popup.add(new CollectionValuesAsChildren((Collection) value));
				return;
			}
			if (value instanceof Map) {
				popup.add(new MapValuesAsChildren("Map entries", (Map) value, this));
				return;
			}
			if (!Utility.instanceOfAny(value, Class.class, Collection.class, Object[].class, Utility.Stringable)) {
				Map map = Utility.propertyDescriptors(value, true, true);
				popup.add(new MapValuesAsChildren("Member values", map, this));
			}
		}
		return;
	}

	public class MapValuesAsChildren extends AbstractAction {
		private Map<Object, Object> map;

		public MapValuesAsChildren(String what, Map ofobj, AbstractScreenBoxTreeNodeImpl impl) {
			super(what + " as children... " + ofobj.size());
			this.map = ofobj;
		}

		@Override public Object getValue(String key) {
			if (key != null && key.equalsIgnoreCase("tooltip")) {
				return "map key "+key;
			}
			return super.getValue(key);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			removeAllChildren();
			NamedObjectCollection localBoxedChildren = getLocalBoxedChildren();
			for (Map.Entry ent : map.entrySet()) {

				Object key = ent.getKey();
				Object value = ent.getValue();
				String uniqueName;
				if(key instanceof String) {
					uniqueName = (String)key;
				} else {
					uniqueName = Utility.getUniqueName(key, localBoxedChildren, true, false, false);
				}
				attachChildObject(uniqueName, value);
			}
		}
	}

	public class CollectionValuesAsChildren extends AbstractAction {
		private Collection object;

		CollectionValuesAsChildren(Collection ofobj) {
			super("Collection values as children... (" + ofobj.size() + ")");
			this.object = ofobj;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			removeAllChildren();
			for (Object o : object) {
				try {
					attachChildObject(null, o);
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}
	}

	public class ArrayValuesAsChildren extends AbstractAction {
		private Object object;

		ArrayValuesAsChildren(Object ofobj) {
			super("Array values as children... (" + Array.getLength(ofobj) + ")");
			this.object = ofobj;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			AbstractScreenBoxTreeNodeImpl.this.removeAllChildren();
			int arrayLen = Array.getLength(object);
			for (int i = 0; i < arrayLen; i++) {
				try {
					attachChildObject("item_" + i, Array.get(object, i));
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}
	}

}