package org.appdapter.gui.swing;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComponent;

import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.Utility;

public class ObjectChoiceModel extends SortedComboBoxModel implements ComboBoxModel, POJOCollectionListener {
	//Vector listeners = new Vector();

	java.util.List<Object> objectValues;
	Object selectedObject;
	boolean selectedObjectEver = false;

	final Class type;
	final String propName;
	final NamedObjectCollection context;
	private ToFromKeyConverter<Object, String> converter;

	final JComponent refeshComponet;
	final public boolean useStringProxies;
	final PropertyChangeSupport propSupport;

	@Override public String toString() {
		return Debuggable.toInfoStringF(this);
	}

	@SuppressWarnings("unchecked")//
	public ObjectChoiceModel(NamedObjectCollection noc, final Class cls, final String title, ToFromKeyConverter<Object, String> convert, JComponent comp, PropertyChangeSupport ps) {
		propName = title;
		context = noc;
		type = cls;
		this.converter = convert;
		useStringProxies = convert != null && type != String.class;
		refeshComponet = comp;
		propSupport = ps;
		selectedObject = new Object() {
			@Override
			public String toString() {
				return "No selected object for " + title + " of type " + type;
			}
		};
		context.addListener(this, false);
	}

	@Override public synchronized void setSelectedItem(Object anItem) {
		boolean firePropChange = true;
		if (anItem instanceof String) {
			if (useStringProxies) {
				if (anItem.equals("")) {
					Utility.bug("Cant set to ''");
					return;
				}
				anItem = this.stringToObject((String) anItem);
			}
		}
		if (!selectedObjectEver) {
			selectedObjectEver = true;
			firePropChange = false;
		}
		if (!Debuggable.isRelease()) {
			String title = this.objectToString(anItem);
			Object obj = stringToObject(title);
			if (obj != anItem) {
				Utility.bug("Not round tripping " + anItem);
			}
		}
		if (selectedObject != anItem) {
			Object oldValue = selectedObject;
			selectedObject = anItem;
			if (refeshComponet != null)
				refeshComponet.setToolTipText(getToolTipText());
			if (firePropChange && propSupport != null)
				propSupport.firePropertyChange("selection", oldValue, anItem);
		}
	}

	private String getToolTipText() {
		return propName + "  " + type + " " + Utility.makeTooltipText(selectedObject);
	}

	public String objectToString(Object anItem) {
		return converter.toKey(anItem);
	}

	public Object stringToObject(String title) {
		return converter.fromKey(title, type);
	}

	@Override public Object getSelectedItem() {
		if (!selectedObjectEver) {
			Utility.bug("!selectedObjectEver");
		}
		return selectedObject;
	}

	public Object getSelectedBean() {
		if (!selectedObjectEver) {
			Utility.bug("!selectedObjectEver");
		}
		return selectedObject;
	}

	@Override public int getSize() {
		if (type == null) //in super constructor
			return 0;
		ensureObjectValues();
		if (objectValues == null)
			return 0;
		return objectValues.size();
	}

	private void ensureObjectValues() {
		if (objectValues == null) {
			objectValues = reloadFromType(propName, type);
		}
	}

	private List<Object> reloadFromType(String propName2, Class type2) {
		ArrayList al = new ArrayList(context.findObjectsByType(type2));
		if (!selectedObjectEver) {
			Utility.bug("!selectedObjectEver");
		}

		al.add(ObjectChoiceComboPanel.NULLOBJECT);
		if (selectedObject != null) {
			al.remove(selectedObject);
			al.add(0, selectedObject);
		}
		return al;
	}

	@Override public Object getElementAt(int index) {

		ensureObjectValues();
		try {
			return objectValues.get(index);
		} catch (Exception err) {
			return null;
		}
	}

	public synchronized void reload() {
		Object selected = getSelectedBean();
		ensureObjectValues();
		setSelectedItem(selected);
	}

	@Override public void pojoAdded(Object obj, BT box, Object senderCollection) {
		if (!type.isInstance(obj))
			return;
		ensureObjectValues();
		if (objectValues != null && !objectValues.contains(obj)) {
			objectValues.add(obj);
			if (refeshComponet != null && false)
				refeshComponet.invalidate();
		}
	}

	@Override public void pojoRemoved(Object obj, BT box, Object senderCollection) {
		if (senderCollection == this)
			return;
		if (!type.isInstance(obj))
			return;
		ensureObjectValues();
		if (objectValues != null)
			objectValues.remove(obj);

	}
}