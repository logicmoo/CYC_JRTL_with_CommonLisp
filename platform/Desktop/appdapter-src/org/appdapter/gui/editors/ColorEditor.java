package org.appdapter.gui.editors;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.Type;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import org.appdapter.gui.util.PairTable;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Statement;

/**
* JavaBeansCollection PropertyEditor implementation for boolean values.
* Basically a checkbox...
*/

import javax.swing.AbstractCellEditor;
import javax.swing.table.TableCellEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorEditor extends GoodPropertyEditorSupport {
	GUI gui = null;
	ComboModel model;

	public static Type[] EDITTYPE = new Type[] { Color.class };

	public ColorEditor() {
		model = new ComboModel();
	}

	@Override public void setAsText(String text) throws IllegalArgumentException {
		setValue(model.getColor(text));
	}

	@Override public String getAsText() {
		return model.getColorName(model.getSelectedColor());
	}

	@Override public void setValue(Object value) {
		if (value instanceof Color) {
			super.setValue(value);
			if (gui != null)
				gui.setSelectedItem(getColorValue());
		}
	}

	public Color getColorValue() {
		try {
			return (Color) getValue();
		} catch (Exception err) {
			return null;
		}
	}

	@Override public Component getCustomEditor() {
		if (gui == null) {
			gui = new GUI(model);
		}
		return gui;
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	class GUI extends JComboBox {
		public GUI(ComboModel model0) {
			super(model0);
		}
	}

	static public class ColorCellEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
		Color currentColor;
		JButton button;
		JColorChooser colorChooser;
		JDialog dialog;
		protected static final String EDIT = "edit";

		public ColorCellEditor() {
			//Set up the editor (from the table's point of view),
			//which is a button.
			//This button brings up the color chooser dialog,
			//which is the editor from the user's point of view.
			button = new JButton();
			button.setActionCommand(EDIT);
			button.addActionListener(this);
			button.setBorderPainted(false);

			//Set up the dialog that the button brings up.
			colorChooser = new JColorChooser();
			dialog = JColorChooser.createDialog(button, "Pick a Color", true, //modal
					colorChooser, this, //OK button handler
					null); //no CANCEL button handler
		}

		/**
		* Handles events from the editor button and from
		* the dialog's OK button.
		*/
		public void actionPerformed(ActionEvent e) {
			if (EDIT.equals(e.getActionCommand())) {
				//The user has clicked the cell, so
				//bring up the dialog.
				button.setBackground(currentColor);
				colorChooser.setColor(currentColor);
				dialog.setVisible(true);

				//Make the renderer reappear.
				fireEditingStopped();

			} else { //User pressed dialog's "OK" button.
				currentColor = colorChooser.getColor();
			}
		}

		//Implement the one CellEditor method that AbstractCellEditor doesn't.
		public Object getCellEditorValue() {
			return currentColor;
		}

		//Implement the one method defined by TableCellEditor.
		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
			currentColor = (Color) value;
			return button;
		}
	}

	class ComboModel extends AbstractListModel implements ComboBoxModel {
		Color selected = null;
		PairTable table = new PairTable();
		Vector names = new Vector();

		public ComboModel() {
			table.add(Color.black, "Black");
			names.addElement("Black");
			table.add(Color.blue, "Blue");
			names.addElement("Blue");
			table.add(Color.cyan, "Cyan");
			names.addElement("Cyan");
			table.add(Color.darkGray, "Dark Gray");
			names.addElement("Dark Gray");
			table.add(Color.gray, "Gray");
			names.addElement("Gray");
			table.add(Color.green, "Green");
			names.addElement("Green");
			table.add(Color.lightGray, "Light Gray");
			names.addElement("Light Gray");
			table.add(Color.magenta, "Magenta");
			names.addElement("Magenta");
			table.add(Color.orange, "Orange");
			names.addElement("Orange");
			table.add(Color.pink, "Pink");
			names.addElement("Pink");
			table.add(Color.red, "Red");
			names.addElement("Red");
			table.add(Color.white, "White");
			names.addElement("White");
			table.add(Color.yellow, "Yellow");
			names.addElement("Yellow");

		}

		@Override public synchronized void setSelectedItem(Object anItem) {
			Color old = selected;
			if (anItem == null) {
				selected = null;
			} else if (anItem instanceof Color) {
				selected = (Color) anItem;
			} else if (anItem instanceof String) {
				selected = (Color) table.findBrother(anItem);
			}

			fireContentsChanged(this, -1, -1);
			if (selected != old) {
				setValue(selected);
			}
		}

		@Override public Object getSelectedItem() {
			return table.findBrother(selected);
		}

		public Color getSelectedColor() {
			return selected;
		}

		public Color getColor(String name) {
			return (Color) table.findBrother(name);
		}

		public String getColorName(Color color) {
			return (String) table.findBrother(color);
		}

		@Override public int getSize() {
			return names.size();
		}

		@Override public Object getElementAt(int index) {
			try {
				return names.elementAt(index);
			} catch (Exception err) {
				return null;
			}
		}
	}
}
