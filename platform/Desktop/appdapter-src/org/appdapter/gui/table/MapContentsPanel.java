package org.appdapter.gui.table;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Customizer;
import java.beans.PropertyVetoException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.OverlayLayout;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.Chooser;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.api.ValueChangeListener;
import org.appdapter.gui.api.AddTabFrames.SetTabTo;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.LargeObjectView.TabPanelMaker;
import org.appdapter.gui.swing.BaseCollectionContentsPanel;
import org.appdapter.gui.swing.CantankerousJob;
import org.appdapter.gui.swing.ErrorDialog;
import org.appdapter.gui.swing.ErrorPanel;
import org.appdapter.gui.swing.JJPanel;
import org.appdapter.gui.swing.ScreenBoxPanel;
import org.appdapter.gui.swing.SmallObjectView;
import org.appdapter.gui.swing.VerticalLayout;

/**
 * A GUI component that shows what a Map contains,
 * and lets you add and remove elements.
 *
 *
 */
public class MapContentsPanel extends BaseCollectionContentsPanel implements ValueChangeListener, DropTargetListener, Customizer {

	public Map getValue() {
		return getMap();
	}

	public Map getMap() {
		return Utility.recastCC(super.getValue(), Map.class);
	}

	public static Class EDITTYPE = Map.class;

	public static class MapContentsPanelTabFramer extends TabPanelMaker {
		@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmds) {
			if (objClass == null)
				objClass = object.getClass();
			if (Map.class.isAssignableFrom(objClass)) {
				return;
			}
			if (cmds != SetTabTo.ADD)
				return;
			try {
				MapContentsPanel constructors = new MapContentsPanel((Map) object);
				tabs.insertTab("Map Contents", null, constructors, null, 0);
			} catch (Exception err) {
				tabs.insertTab("Map Contents", null, new ErrorPanel("Could not show MapContentsPanel", err), null, 0);
			}

		}
	}

	public MapContentsPanel() {
		this(new HashMap());
	}

	public MapContentsPanel(BrowserPanelGUI context0, Map array) {
		super();
		if (context0 != null) {
			this.context = context0;
		}
		this.objectValue = array;
		reloadContents();
	}

	public MapContentsPanel(Map array) {
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
		final Map map = getMap();
		if (map != null) {

			for (Object e : map.entrySet()) {
				final Entry value = (Entry) e;
				if (!meetsFilter(value.getValue()) && !meetsFilter(value)) {
					continue;
				}
				final Object v = value.getValue();
				SmallObjectView view = new SmallObjectView(context, nameMaker, v, Utility.getUniqueName(v, nameMaker, false, true, true), true, true, true, true) {
					@Override public void valueChanged(Object sender, Object oldValue, Object newValue) {
						map.put(value.getKey(), newValue);
					}

					@Override public boolean isRemovable(Object value) {
						return map.containsValue(value);
					}
				};
				view.addChangeListener(this);
				panel.add(view);

			}
		}
		reloaded();

	}

	@Override public Class getClassOfBox() {
		if (objectValue != null)
			return objectValue.getClass();
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