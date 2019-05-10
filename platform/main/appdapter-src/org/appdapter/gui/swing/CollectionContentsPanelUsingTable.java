package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.OverlayLayout;
import javax.swing.event.ChangeListener;

import org.appdapter.api.trigger.Box;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.Chooser;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.ValueChangeListener;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.table.BeanTableModel;
import org.appdapter.gui.table.SafeJTable;
import static org.appdapter.core.convert.ReflectUtils.*;

/**
 * A GUI component that shows what a Collection contains,
 * and lets you add and remove elements.
 *
 *
 */
public class CollectionContentsPanelUsingTable<BoxType extends Box>

extends CollectionContentsPanel<BoxType> implements ValueChangeListener, DropTargetListener, Chooser<Object>

, ChangeListener {

	BeanTableModel tableModel;

	public CollectionContentsPanelUsingTable() {
		super();
	}

	public CollectionContentsPanelUsingTable(DisplayContext context, String titleStr, Collection collection, BoxPanelSwitchableView tabs) {
		super(context, titleStr, null, collection, null, tabs, false);
	}

	@Override protected void initSubclassGUI() throws Throwable {
		tableModel = new BeanTableModel(Map.Entry.class);
		panel = new SafeJTable(tableModel);
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
	public void reloadContents00() {

		final Collection collection = getCollection();
		panel.removeAll();
		for (Object value : copyOf(collection)) {
			addRow(value);
		}
		reloaded();
	}

	private void addRow(final Object value) {

		if (!meetsFilter(value)) {
			Utility.bug("Add Row doesn not meet filter: " + value);
			return;
		}

		final SmallObjectView view = new SmallObjectView(context, nameMaker, value) {

			@Override public boolean isRemovable(Object value) {
				return !isRemoved;
			}
		};
		if (true) {
			tableModel.addRow(new Map.Entry() {

				@Override public String getKey() {
					return nameMaker.getTitleOf(value);
				}

				@Override public Object getValue() {
					return view;
				}

				@Override public Object setValue(Object value) {
					view.setObject(value);
					return view;
				}
			});
		}
		view.addChangeListener(this);
	}

	@Override
	public void completeSubClassGUI() {
		setTitle(getName());
		reloadContents();
	}

	@Override public Class<?> getClassOfBox() {
		if (false && objectValue != null)
			return objectValue.getClass();
		return EDITTYPE;
	}

}