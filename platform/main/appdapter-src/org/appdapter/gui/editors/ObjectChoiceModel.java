package org.appdapter.gui.editors;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComponent;

import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.SortedComboBoxModel;
import org.appdapter.gui.util.PairTable;

public class ObjectChoiceModel extends SortedComboBoxModel implements ComboBoxModel, POJOCollectionListener {
	//Vector listeners = new Vector();

	final NamedObjectCollection context;
	private ToFromKeyConverter<Object, String> converter;

	Vector names = null;
	PairTable table = new PairTable();
	boolean selectedObjectEver = false;
	final String propName;
	final PropertyChangeSupport propSupport;
	final JComponent refeshComponet;

	Object selected = null;

	final Class type;
	final public boolean useStringProxies;
	public boolean lockSelection;

	@SuppressWarnings("unchecked")//
	public ObjectChoiceModel(NamedObjectCollection noc, final Class cls, final String title, ToFromKeyConverter<Object, String> convert, JComponent comp, PropertyChangeSupport ps, Object valueToStart) {
		this(new Vector(), noc, cls, title, convert, comp, ps, valueToStart);
	}

	public ObjectChoiceModel(Vector vect, NamedObjectCollection noc, final Class cls, final String title, ToFromKeyConverter<Object, String> convert, JComponent comp, PropertyChangeSupport ps, Object valueToStart) {
		super(vect);
		names = vect;
		propName = title;
		context = noc;
		type = cls;
		this.converter = convert;
		useStringProxies = convert != null && type != String.class;
		refeshComponet = comp;
		propSupport = ps;
		selected = valueToStart;/*new Object() {
								@Override public String toString() {
								return "No selected object for " + title + " of type " + type;
								}
								};*/
		ensureObjectValues();
	}

	public void setupComboModel(Collection values) {
		try {
			int len = 0;
			for (Object v : values) {
				if (addItem(null, v, false))
					len++;
			}
			addItem((String) ObjectChoiceComboPanel.NULLOBJECT, null, false);
		} catch (Throwable e) {
			Debuggable.printStackTrace(e);
		} // NOI18N

	}

	boolean addItem(String n, Object v, boolean checkExisting) {
		if (v == null) {
			if (names.contains(ObjectChoiceComboPanel.NULLOBJECT))
				return false;
			n = (String) ObjectChoiceComboPanel.NULLOBJECT;
		}
		if (checkExisting) {
			if (v != null) {
				if (table.findBrother(v) != null)
					return false;
			}
		}
		if (n == null)
			n = objectToString(v);
		table.add(v, n);
		names.addElement(n);
		return true;
	}

	private void ensureObjectValues() {
		setupComboModel(reloadFromType(propName, type));
		context.addListener(this, false);
	}

	private List<Object> reloadFromType(String propName2, Class type2) {
		NamedObjectCollection noc = context;
		if (noc == null) {
			noc = Utility.getTreeBoxCollection(type);
		}
		ArrayList al = new ArrayList(noc.findObjectsByType(type2));
		return al;
	}

	@Override public Object getElementAt(int index) {
		try {
			return names.elementAt(index);
		} catch (Exception err) {
			return null;
		}
	}

	public Object getObject(String name) {
		return (Object) table.findBrother(name);
	}

	public String getObjectName(Object enumc) {
		return (String) table.findBrother(enumc);
	}

	@Override public Object getSelectedItem() {
		return selected;
	}

	@Override public int getSize() {
		if (names == null)
			return 0;
		return names.size();
	}

	public String[] getTags() {
		return (String[]) names.toArray(new String[0]);
	}

	private String getToolTipText() {
		return propName + "  " + type + " " + Utility.makeTooltipText(selected);
	}

	public String objectToString(Object anItem) {
		if (anItem == null) {
			return (String) ObjectChoiceComboPanel.NULLOBJECT;
		}
		if (anItem == null || anItem instanceof String)
			return (String) null;
		Object o = table.findBrother(anItem);
		if (o instanceof String)
			return (String) o;
		return converter.toKey(anItem);
	}

	public Object stringToObject(String title) {
		if (title == null || type.isInstance(title))
			return title;
		if (title.toLowerCase().equals("<null>"))
			return null;
		Object o = table.findBrother(title);
		if (type.isInstance(o))
			return o;
		return converter.fromKey(title, type);
	}

	@Override public void pojoAdded(Object obj, BT box, Object senderCollection) {
		if (senderCollection == this || !acceptsObject(obj))
			return;
		if (addItem(null, obj, true)) {
			if (refeshComponet != null && false)
				refeshComponet.invalidate();
		}
	}

	@Override public void pojoRemoved(Object obj, BT box, Object senderCollection) {
		if (senderCollection == this || !acceptsObject(obj))
			return;
		ensureObjectValues();
	}

	private boolean acceptsObject(Object obj) {
		return type.isInstance(obj);
	}

	public synchronized void reload() {
		Object selected = getSelectedItem();
		names.clear();
		table.clear();
		ensureObjectValues();
		setSelectedItem(selected);
	}

	@Override public synchronized void setSelectedItem(Object anItem) {
		if (lockSelection)
			return;
		Object old = selected;
		if (anItem == null) {
			selected = null;
		} else if (type.isInstance(anItem)) {
			selected = anItem;
		} else {
			if (anItem instanceof String) {
				if (useStringProxies) {
					if (anItem.equals("")) {
						Utility.bug("Cant set to ''");
						return;
					}
				}
				anItem = this.stringToObject((String) anItem);
			} else {
				anItem = Utility.recastCC(anItem, type);
			}
			if (anItem != null) {
				selected = anItem;
			}
		}
		if (Utility.isEqual(selected, old)) {
			return;
		}

		boolean firePropChange = true;

		if (!selectedObjectEver) {
			selectedObjectEver = true;
			firePropChange = false;
		}

		if (!Debuggable.isRelease()) {
			String title = this.objectToString(anItem);
			Object obj = stringToObject(title);
			if (obj != anItem) {
				Utility.bug("Not round tripping " + anItem);
				String title2 = this.objectToString(anItem);
				Object obj2 = stringToObject(title2);
			}
		}

		if (refeshComponet != null)
			refeshComponet.setToolTipText(getToolTipText());

		if (firePropChange) {
			fireContentsChanged(this, -1, -1);
			if (propSupport != null)
				propSupport.firePropertyChange("selection", old, anItem);
		}

	}

	@Override public String toString() {
		return Debuggable.toInfoStringF(this);
	}
}