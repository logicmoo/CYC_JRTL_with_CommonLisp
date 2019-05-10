package org.appdapter.gui.table;

import java.awt.Component;
import java.util.EventObject;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.tree.TreeCellEditor;

import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.gui.swing.PropertyValueControl;

public class CustomCellEditor extends CustomCellRenderer implements TableCellEditor, TreeCellEditor {

	int edit_col, edit_row;

	PropertyValueControl propertyValueControl;

	protected CellConversions listFromH;

	public CustomCellEditor(JTable table, int columnNum, Class<?> columnCl, Object toS, CellConversions conv) {
		super(table, columnNum, columnCl, toS, conv);
	}

	@Override public void addCellEditorListener(CellEditorListener l) {
		getCellEditor().addCellEditorListener(l);

	}

	@Override public void cancelCellEditing() {
		getCellEditor().cancelCellEditing();

	}

	public TableCellEditor getCellEditor() {
		return getCellEditorComponent().getCellEditor();
	}

	public CellEditorComponent getCellEditorComponent() {
		return getPropertyValueControl();
	}

	@Override public Object getCellEditorValue() {
		return getCellEditor().getCellEditorValue();
	}

	private PropertyValueControl getPropertyValueControl() {
		if (propertyValueControl == null) {
			Class clz = getColumnClass();
			ToFromKeyConverter toFrom = null;
			propertyValueControl = new PropertyValueControl(null, getTitle(), clz, true, toFrom);
		}
		return propertyValueControl;
	}

	@Override public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		return getCellEditor().getTableCellEditorComponent(table, value, isSelected, row, column);
	}

	public TreeCellEditor getTreeCellEditor() {
		return getPropertyValueControl().getTreeCellEditor();
	}

	@Override public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
		return getTreeCellEditor().getTreeCellEditorComponent(tree, value, isSelected, expanded, leaf, row);
	}

	@Override public boolean isCellEditable(EventObject anEvent) {
		return myTable.isCellEditable(0, columnNumber);
	}

	@Override public void removeCellEditorListener(CellEditorListener l) {
		getCellEditor().removeCellEditorListener(l);

	}

	public void setEditRowCol(int row, int column) {
		propertyValueControl = null;
		edit_col = column;
		edit_row = row;
	}

	@Override
	public void setValue(Object value) {
		//String str = getTextName(value, edit_row, edit_col);
		super.setValue(value);
		//label.setText(str);
	}

	@Override public boolean shouldSelectCell(EventObject anEvent) {
		return getCellEditor().shouldSelectCell(anEvent);
	}

	@Override public boolean stopCellEditing() {
		return getCellEditor().stopCellEditing();
	}

}