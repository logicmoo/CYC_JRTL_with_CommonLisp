package org.appdapter.gui.table;

import java.awt.dnd.DropTargetListener;
import java.beans.Customizer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.ValueChangeListener;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.LargeObjectView;
import org.appdapter.gui.editors.LargeObjectView.TabPanelMaker;
import org.appdapter.gui.swing.BaseCollectionContentsPanel;
import org.appdapter.gui.swing.ErrorPanel;
import org.appdapter.gui.swing.SmallObjectView;

/**
 * A GUI component that shows what an array contains,
 * and lets you add and remove elements.
 *
 *
 */
public class ArrayContentsPanel extends BaseCollectionContentsPanel implements ValueChangeListener, DropTargetListener, Customizer {

	public static class ArrayContentsPanelTabFramer extends TabPanelMaker {
		@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmds) {
			if (objClass == null)
				objClass = object.getClass();
			if (!(objClass.isArray())) {
				return;
			}
			if (cmds != SetTabTo.ADD)
				return;
			try {
				ArrayContentsPanel constructors = new ArrayContentsPanel(object);
				tabs.insertTab("Array Contents", null, constructors, null, 0);
			} catch (Exception err) {
				tabs.insertTab("Array Contents", null, new ErrorPanel("Could not show ArrayContentsPanel", err), null, 0);
			}

		}
	}

	public static boolean editsClass(Class c) {
		return c != null & c.isArray();
	}

	public ArrayContentsPanel() {
		this(new Object[0]);
	}

	public ArrayContentsPanel(BrowserPanelGUI context0, Object array) {
		super();
		if (context0 != null) {
			this.context = context0;
		}
		this.objectValue = array;
		reloadContents();
	}

	public ArrayContentsPanel(Object array) {
		this(Utility.getCurrentContext(), array);
	}

	public void addObject(Object o, int index) {
		Class componentType = objectValue.getClass().getComponentType();
		final int len = Array.getLength(objectValue);
		if (index == -1) {
			index = len;
		}
		int lenAfterIndex = len - index;
		Object newArray = Array.newInstance(componentType, len + 1);
		System.arraycopy(objectValue, 0, newArray, 0, index);
		if (lenAfterIndex > 0)
			System.arraycopy(objectValue, index, newArray, index + 1, lenAfterIndex);
		Array.set(newArray, len, o);
		setObject(newArray);
	}

	public void reloadContents00() {
		panel.removeAll();
		if (objectValue != null) {
			final int len = Array.getLength(objectValue);
			for (int i = 0; i < len; i++) {
				final int index = i;
				final Object value = Array.get(objectValue, index);
				if (!meetsFilter(value)) {
					continue;
				}
				SmallObjectView view = new SmallObjectView(context, nameMaker, value) {
					@Override public void valueChanged(Object sender, Object oldValue, Object newValue) {
						Array.set(ArrayContentsPanel.this.objectValue, index, newValue);
						//super.valueChanged(sender, oldValue, newValue);
					}

					@Override public boolean isRemovable(Object value) {
						return !isRemoved;
					}
				};
				view.addChangeListener(this);
				panel.add(view);

			}
		}
		reloaded();

	}

	@Override public Class<Object[]> getClassOfBox() {
		if (objectValue != null)
			return (Class<Object[]>) objectValue.getClass();
		return Object[].class;
	}

	@Override protected void replaceValue(Object oldValue, Object newValue) {
		Array.set(objectValue, getIndexOf(oldValue, 0), newValue);

	}

	private int getIndexOf(Object oldValue, int startingAt) {
		final int len = Array.getLength(objectValue);
		for (int i = startingAt; i < len; i++) {
			final Object value = Array.get(objectValue, i);
			if (value == oldValue)
				return i;
		}
		return -1;
	}

	@Override protected void removeObject(Object oldValue, int startingAt) {
		int index = getIndexOf(oldValue, startingAt);
		Class componentType = objectValue.getClass().getComponentType();
		final int len = Array.getLength(objectValue);
		Object newArray = Array.newInstance(componentType, len - 1);
		int lenAfterIndex = len - index - 1;
		if (index > 1)
			System.arraycopy(objectValue, 0, newArray, 0, index - 1);
		if (lenAfterIndex > 0)
			System.arraycopy(objectValue, index, newArray, index + 1, lenAfterIndex);
		setObject(newArray);
	}
}