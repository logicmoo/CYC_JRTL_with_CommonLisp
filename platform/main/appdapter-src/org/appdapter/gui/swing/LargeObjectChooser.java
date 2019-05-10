package org.appdapter.gui.swing;

import java.util.Collection;

import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.Utility;

/**
 * A GUI component showing the list of objects in the collection
 */
public class LargeObjectChooser extends CollectionContentsPanel implements POJOCollectionListener {

	public static Class EDITTYPE = POJOCollection.class;

	public static boolean editsClass(Class c) {
		return EDITTYPE.isAssignableFrom(c);
	}

	public LargeObjectChooser() {
		super();
	}

	@Override public void setObject(Object bean) {
        if (bean instanceof Class) {
        	setFilter((Class)bean);
        	return;
        }
		super.setObject(bean);
	}

	//public BaseCollectionContentsPanel(DisplayContext context, String titleStr, Class filterc, NamedObjectCollection noc, BoxPanelSwitchableView tabs, boolean valueIsNotCollection)
	public LargeObjectChooser(Class filterc, NamedObjectCollection noc) {
		super(null, noc.getName(), noc, noc.getLiveCollection(), filterc, null, true);
		noc.addListener(this, true);
	}

	@Override public void pojoAdded(Object obj, BT box, Object senderCollection) {
		if (!meetsFilter(obj))
			return;
		reloadContents();
	}

	@Override public void pojoRemoved(Object obj, BT box, Object senderCollection) {
		if (!meetsFilter(obj))
			return;
		reloadContents();
	}

	@Override protected boolean reloadObjectGUI(Object obj) throws Throwable {
		this.objectValue = Utility.recast(obj, EDITTYPE);
		reloadContents();
		return true;
	}

	@Override public Collection getCollection() {
		if ((filter == null || filter == objectValue) && objectValue instanceof Class) {
			filter = (Class) objectValue;
			objectValue = null;
		}
		if (objectValue == null)
			return null;
		return ((POJOCollection) objectValue).findObjectsByType(filter);
	}

	@Override public Class getClassOfBox() {
		return EDITTYPE;
	}
}