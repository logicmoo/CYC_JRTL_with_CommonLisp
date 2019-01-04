package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import org.appdapter.api.trigger.Box;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.FocusOnBox;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.Utility;

public class NamedItemChooserPanel extends JJPanel implements GetSetObject, FocusOnBox<Box> {

	/**
	 * @deprecated As of JDK version 1.1,
	 * replaced by <code>getPreferredSize()</code>.
	 */
	@Override
	@Deprecated public Dimension preferredSize() {
		Dimension dim = getSize();
		if (dim != null) {
			return new Dimension(dim);
		} else {
			return dim;
		}
	}

	//JLayeredPane desk;
	//JSplitPane split;
	ClassChooserPanel classChooserPanel;
	//LargeObjectChooser

	CollectionContentsPanel namedObjectListPanel;
	NamedObjectCollection namedObjects;
	DisplayContext context;

	public NamedItemChooserPanel(DisplayContext context0, NamedObjectCollection named) {
		super(true);
		this.context = context0;
		namedObjects = named;
		Utility.setup();
		initGUI();
	}

	void initGUI() {
		removeAll();
		adjustSize();
		//namedObjects = context.getLocalBoxedChildren();
		namedObjectListPanel = new LargeObjectChooser(null, namedObjects);
		//new LargeObjectChooser(null, namedObjects);
		setLayout(new BorderLayout());
		namedObjectListPanel.setBorder(new TitledBorder(namedObjects.getName()));
		classChooserPanel = new ClassChooserPanel();
		add("North", classChooserPanel);
		add("Center", namedObjectListPanel);
		namedObjects.addListener(classChooserPanel, true);

	}

	private void adjustSize() {
		Container p = getParent();
		if (p != null) {
			setSize(p.getSize());
		}
	}

	@Override public void focusOnBox(Box b) {

	}

	@Override public Object getValue() {
		if(namedObjectListPanel==null) return null;
		return namedObjectListPanel.getSelectedObject();
	}

	@Override public void setObject(Object object) throws InvocationTargetException {
		try {
			namedObjectListPanel.setSelectedObject(object);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
			throw new InvocationTargetException(e);
		}

	}

	@Override public Class<Box> getClassOfBox() {
		return Box.class;
	}

	public Object getSelectedObject() {
		if(namedObjectListPanel==null) return null;
		return namedObjectListPanel.getSelectedObject();
	}
}
