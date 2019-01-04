package org.appdapter.gui.table;

import java.awt.Component;

import javax.swing.ComboBoxEditor;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;

import org.appdapter.gui.swing.IsReference;

public interface CellEditorComponent extends IsReference {
	public TableCellEditor getCellEditor();

	public TreeCellEditor getTreeCellEditor();

	public Component getCustomEditor();
}
