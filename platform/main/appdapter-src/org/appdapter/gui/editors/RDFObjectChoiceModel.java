package org.appdapter.gui.editors;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.JComponent;

import org.appdapter.bind.rdf.jena.model.JenaLiteralUtils;
import org.appdapter.bind.rdf.jena.model.JenaModelUtils;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.SortedComboBoxModel;

import com.hp.hpl.jena.rdf.model.Resource;

public class RDFObjectChoiceModel extends SortedComboBoxModel implements ComboBoxModel, POJOCollectionListener {
	//Vector listeners = new Vector();

	public static boolean isInstance(Object o, Object c) {
	    return true;
	}
	java.util.List<Object> objectValues;
	Object selectedObject;
	boolean selectedObjectEver = false;

	final String rdfRestriction;
	final String propName;
	final NamedObjectCollection context;
	final Class jenaType;
	private ToFromKeyConverter<Object, String> converter;

	final JComponent refeshComponet;
	final public boolean useStringProxies;
	final PropertyChangeSupport propSupport;

	@Override public String toString() {
		return Debuggable.toInfoStringF(this);
	}

	@SuppressWarnings("unchecked")//
	public RDFObjectChoiceModel(Class jt, NamedObjectCollection noc, final String rdfRestrict, final String title, ToFromKeyConverter<Object, String> convert, JComponent comp, PropertyChangeSupport ps) {
		propName = title;
		context = noc;
		rdfRestriction = rdfRestrict;
		this.jenaType = jt;
		this.converter = convert;
		useStringProxies = convert != null && jt != String.class;
		refeshComponet = comp;
		propSupport = ps;
		selectedObject = new Object() {
			@Override public String toString() {
				return "No selected object for " + title + " of type " + rdfRestrict + " / " + jenaType;
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
		return propName + "  " + rdfRestriction + " " + Utility.makeTooltipText(selectedObject);
	}

	public String objectToString(Object anItem) {
		return converter.toKey(anItem);
	}

	public Object stringToObject(String title) {
		return converter.fromKey(title, jenaType);
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
		if (rdfRestriction == null) //in super constructor
			return 0;
		ensureObjectValues();
		if (objectValues == null)
			return 0;
		return objectValues.size();
	}

	private void ensureObjectValues() {
		if (objectValues == null) {
			objectValues = reloadFromType(propName, rdfRestriction);
		}
	}

	private List<Object> reloadFromType(String propName2, String resource) {
		ArrayList al = new ArrayList(context.findObjectsByType(Resource.class));
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
		if (!isInstance(rdfRestriction, obj))
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
		if (!isInstance(rdfRestriction, obj))
			return;
		ensureObjectValues();
		if (objectValues != null)
			objectValues.remove(obj);

	}
}