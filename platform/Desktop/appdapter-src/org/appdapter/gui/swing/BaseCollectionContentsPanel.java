package org.appdapter.gui.swing;

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
import java.beans.PropertyVetoException;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.OverlayLayout;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.Chooser;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.ValueChangeListener;
import org.appdapter.gui.browse.Utility;
import org.armedbear.lisp.Lisp;

abstract public class BaseCollectionContentsPanel<BoxType extends Box>

extends ScreenBoxPanel<BoxType> implements ValueChangeListener, DropTargetListener, Chooser<Object>

, ChangeListener {

	public boolean meetsFilter(Object value) {
		if (filter != null) {
			if (!filter.isInstance(value))
				return false;
		}
		return true;
	}

	public BaseCollectionContentsPanel(DisplayContext context, String titleStr, NamedObjectCollection noc, Class filterc, BoxPanelSwitchableView tabs, boolean valueIsNotCollection) {
		this.nameMaker = noc;
		this.titleString = titleStr;
		this.valueIsOneSelectedItem = valueIsNotCollection;
		if (context == null)
			context = Utility.getDisplayContext();
		this.context = context;
		this.filter = filterc;
		this.parentTabs = tabs;
		if (noc == null)
			noc = Utility.getTreeBoxCollection();


		 reloadConts = new CantankerousJob("reloadContents", this, true) {
				@Override public void run() {

						reloadContents00();
				}
			};
	}

	public BaseCollectionContentsPanel() {
		this(null, null, null, null, null, false);
	}

	@Override
	public void valueChanged(Object context2, Object oldValue, Object newValue) {
		if (context2 == this)
			return;
		if (oldValue != null && newValue != null) {
			replaceValue(oldValue, newValue);
		}

		if (oldValue != null) {
			removeObject(oldValue, -1);
		}

		if (newValue != null) {
			addObject(newValue, -1);
		}
		reloadContents();
	}

	public void addObjects(Collection from, int i) {
		for (Object o : from) {
			addObject(o, i);
			if (i >= 0)
				i++;
		}
		reloadContents();
	}

	@Override protected boolean reloadObjectGUI(Object obj) throws Throwable {
		try {
			this.objectValue = Utility.recast(obj, getClassOfBox());
			reloadContents();
		} catch (Throwable t) {
			Debuggable.printStackTrace(t);
			Debuggable.warn(" " + t);
		}
		return true;

	}

	abstract protected void replaceValue(Object oldValue, Object newValue);

	abstract protected void removeObject(Object oldValue, int index);

	abstract protected void addObject(Object oldValue, int index);

	@Override public Dimension getPreferredSize() {
		return new Dimension(130, 200);
		// return Utility.getMaxDimension(new Dimension(250, 200),
		// super.getPreferredSize());
	}

	@Override public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	CantankerousJob reloadConts;

	private Object selectedObject;

	final public void reloadContents() {
		if(reloadConts==null) {
			reloadContents00();
			return;
		}
		reloadConts.attempt();
	}

	@Override
	public String toString() {
		return getName() + " "+ Lisp.getDotName(getClass());

	}

	abstract protected void reloadContents00();

	public void reloaded() {
		invalidate();
		validate();
		repaint();
	}

	public Object getSelectedObject() {
		return this.selectedObject;
	}

	public void setSelectedObject(Object object) throws PropertyVetoException {
		this.selectedObject = (object);
	}

	@Override public void stateChanged(ChangeEvent evt) {
		boolean isSelected = parentTabs.getSelectedIndex() == parentTabs.indexOfComponent(this);
		if (wasSelected != isSelected) {
			if (isSelected) {
				this.reloadContents();
			}
		}
		wasSelected = isSelected;
	}

	protected boolean wasSelected = false;

	//Collection collection;
	protected DisplayContext context;
	protected JComponent panel;
	protected JScrollPane scroll;
	protected Border defaultScrollBorder;
	protected JButton reloadButton;

	DropTarget dropTarget;

	//An invisible panel in front of the list of contents, which
	//captures drag/drop operations
	JPanel dropGlass;
	protected final NamedObjectCollection nameMaker;
	protected Class filter;
	protected boolean valueIsOneSelectedItem = false;
	protected String titleString;

	@Override public String getName() {
		if (titleString != null)
			return titleString;
		String named = super.getName();
		if( nameMaker!=null) {
			 named = nameMaker.toString();
		}
		if (filter != null) {
			named = Utility.getShortClassName(filter) + " of " + named;
		}
		return named;
	}

	public void setTitle(String title) {
		titleString = title;
		//defaultScrollBorder = new Defa
		//	scroll.setBorder(new TitledBorder(defaultScrollBorder, title));
	}

	@Override protected void initSubclassGUI() throws Throwable {
		panel = new JJPanel();
		panel.setLayout(new VerticalLayout());

		dropGlass = new JJPanel();
		dropGlass.setOpaque(false);
		dropTarget = new DropTarget(dropGlass, this);
		scroll = new JScrollPane(panel);
		defaultScrollBorder = scroll.getBorder();
		JPanel buttonPanel = new JJPanel(new FlowLayout(FlowLayout.LEFT));
		reloadButton = new JButton("Update");
		buttonPanel.add(reloadButton);
		buttonPanel.add(new JLabel("To add objects just drag them into the panel below."));
		reloadButton.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent event) {
				reloadContents();
			}
		});

		JJPanel stack = new JJPanel();
		stack.setLayout(new OverlayLayout(stack));
		stack.add(dropGlass);
		stack.add(scroll);

		//setBorder(new TitledBorder(new , "XYZ"));
		setLayout(new BorderLayout());
		add("North", buttonPanel);
		add("Center", stack);
	}

	@Override
	public void completeSubClassGUI() {
		setTitle(getName());
		reloadContents();
	}

	//======= Drag/Drop methods ====================================0

	@Override public void dragEnter(DropTargetDragEvent event) {
		event.acceptDrag(DnDConstants.ACTION_MOVE);
	}

	@Override public void dragExit(DropTargetEvent dtde) {
	}

	@Override public void dragOver(DropTargetDragEvent dtde) {
	}

	@Override public void drop(DropTargetDropEvent event) {
		Transferable t = event.getTransferable();
		try {
			Object o = t.getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType));
			addObjects(Collections.singleton(o), -1);
		} catch (Exception err) {
			new ErrorDialog("An error occurred while handling a drop operation", err).show();
		}
	}

	@Override public void dropActionChanged(DropTargetDragEvent dtde) {
	}

}
