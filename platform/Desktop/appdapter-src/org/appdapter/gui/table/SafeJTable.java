/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 * ModelMatrixPanel.java
 *
 * Created on Oct 25, 2010, 8:12:03 PM
 */

package org.appdapter.gui.table;

import static org.appdapter.core.log.Debuggable.printStackTrace;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;

import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.browse.SearchableDemo;
import org.appdapter.gui.browse.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jidesoft.swing.SearchableUtils;
import com.jidesoft.swing.TableSearchable;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class SafeJTable extends JTable implements GetSetObject {

	static Logger theLogger = LoggerFactory.getLogger(SafeJTable.class);

	static final Object WAS_NULL = "<null>";

	private boolean isSelectAllForActionEvent = false;
	private boolean isSelectAllForKeyEvent = false;
	private boolean isSelectAllForMouseEvent = false;

	protected javax.swing.JTable myTable = this;

	CellConversions listFromH;
	Class matrixClass;
	Class rowClass;
	String[] colNamesPredef;
	protected Object objectValue;
	protected List listOfRows;

	/** Creates new form ModelMatrixPanel */
	public SafeJTable() {
		this(null);
	}

	public SafeJTable(TableModel model) {
		super(model);
		myTable = this;
		Utility.makeTablePopupHandler(this);
	}

	public void addRowObject(Object obj) {
		List list = getList();
		list.add(obj);
		invalidate();
	}

	public List getList() {
		if (listOfRows == null) {
			Object val = getValue();
			if (listFromH == null) {
				return (List) val;
			}
			listOfRows = listFromH.listFromHolder(val);
		}
		return listOfRows;
	}

	public Object getRowObject(int rowIndex) {
		if (rowIndex < 0)
			return getModel().getValueAt(rowIndex, -1);
		List list = getList();
		return list.get(rowIndex);
	}

	protected TableModel createDefaultDataModel() {
		return new CustomTableModel(listFromH, rowClass, rowClass, getList(), colNamesPredef);
	}

	//
	//  Overridden methods
	//
	/*
	 *  Override to provide Select All editing functionality
	 */
	public boolean editCellAt(int row, int column, EventObject e) {
		boolean result = super.editCellAt(row, column, e);

		if (isSelectAllForMouseEvent || isSelectAllForActionEvent || isSelectAllForKeyEvent) {
			selectAll(e);
		}

		return result;
	}

	public TableCellEditor getCellEditor(int row, int column) {
		TableCellEditor render = null;//super.getCellEditor(row, column);
		if (render == null) {
			Class cclz = getColumnClass(column);

			render = new CustomCellEditor(this, column, cclz, "getCellEditor row=" + row, listFromH);
		}
		if (render instanceof CustomCellEditor) {
			((CustomCellEditor) render).setEditRowCol(row, column);
		}
		return render;
	}

	public TableCellRenderer getCellRenderer(int row, int column) {
		TableCellRenderer render = super.getCellRenderer(row, column);
		if (render == null) {
			Class cclz = getColumnClass(column);
			render = new CustomCellRenderer(this, column, cclz, "GetCellRenderer row=" + row, listFromH);
		}
		return render;
	}

	@Override public Class<?> getColumnClass(int column) {
		return super.getColumnClass(column);
	}

	public TableCellRenderer getColumnRenderer(int i, TableColumn column) {
		TableCellRenderer tcr = column.getCellRenderer();
		if (tcr == null) {
			Class cc = getColumnClass(i);
			if (cc != null) {
				tcr = getDefaultRenderer(cc);
			}
			if (tcr == null) {
				tcr = new CustomCellRenderer(this, i, cc, column, listFromH);
			}
			column.setCellRenderer(tcr);
		}
		return tcr;

	}

	public TableCellEditor getDefaultEditor(Class<?> columnClass) {
		TableCellEditor tcr = super.getDefaultEditor(columnClass);
		if (tcr == null) {
			if (columnClass != null) {
				if (!columnClass.isInterface()) {
					for (Class ifc : columnClass.getInterfaces()) {
						tcr = super.getDefaultEditor(columnClass);
						if (tcr != null)
							return tcr;
					}
				}
			}
			return new CustomCellEditor(this, -1, columnClass, "Editor", listFromH);
		}
		return tcr;
	}

	public TableCellRenderer getDefaultRenderer(Class<?> columnClass) {
		TableCellRenderer tcr = super.getDefaultRenderer(columnClass);
		if (tcr == null) {
			if (columnClass != null) {
				if (!columnClass.isInterface()) {
					for (Class ifc : columnClass.getInterfaces()) {
						tcr = super.getDefaultRenderer(columnClass);
						if (tcr != null)
							return tcr;
					}
				}
			}
			return new CustomCellRenderer(this, -1, columnClass, "getDefaultRenderer", listFromH);
		}
		return tcr;
	}

	public String getTextName(Object value, int edit_row, int edit_col) {
		Object str = listFromH.getCellConverter(getColumnClass(edit_col)).toKey(value);
		return "" + str;
	}

	@Override public TableUI getUI() {
		return super.getUI();
	}

	public Object getValue() {
		return objectValue;
	}

	// means we render per cell instead
	public boolean isRenderPerRow() {
		return false;
	}

	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		Object value = getValueAt(row, column);

		boolean isSelected = false;
		boolean hasFocus = false;

		// Only indicate the selection and focused cell if not printing
		if (!isPaintingForPrint()) {
			isSelected = isCellSelected(row, column);

			boolean rowIsLead = (selectionModel.getLeadSelectionIndex() == row);
			boolean colIsLead = (columnModel.getSelectionModel().getLeadSelectionIndex() == column);

			hasFocus = (rowIsLead && colIsLead) && isFocusOwner();
		}
		if (renderer == null) {
			Class cclz = getColumnClass(column);
			renderer = new CustomCellRenderer(this, column, cclz, columnModel.getColumn(column), listFromH);
		}
		return renderer.getTableCellRendererComponent(this, value, isSelected, hasFocus, row, column);
	}

	//
	//  Static, convenience methods
	//
	/**
	 *  Convenience method to order the table columns of a table. The columns
	 *  are ordered based on the column names specified in the array. If the
	 *  column name is not found then no column is moved. This means you can
	 *  specify a null value to preserve the current order of a given column.
	 *
	 *  @param table        the table containing the columns to be sorted
	 *  @param columnNames  an array containing the column names in the
	 *                      order they should be displayed
	 */
	public void reorderColumns(JTable table, Object... columnNames) {
		TableColumnModel model = table.getColumnModel();

		for (int newIndex = 0; newIndex < columnNames.length; newIndex++) {
			try {
				Object columnName = columnNames[newIndex];
				int index = model.getColumnIndex(columnName);
				model.moveColumn(index, newIndex);
			} catch (IllegalArgumentException e) {
			}
		}
	}

	/*
	 * Select the text when editing on a text related cell is started
	 */
	private void selectAll(EventObject e) {
		final Component editor = getEditorComponent();

		if (editor == null || !(editor instanceof JTextComponent))
			return;

		if (e == null) {
			((JTextComponent) editor).selectAll();
			return;
		}

		//  Typing in the cell was used to activate the editor

		if (e instanceof KeyEvent && isSelectAllForKeyEvent) {
			((JTextComponent) editor).selectAll();
			return;
		}

		//  F2 was used to activate the editor

		if (e instanceof ActionEvent && isSelectAllForActionEvent) {
			((JTextComponent) editor).selectAll();
			return;
		}

		//  A mouse click was used to activate the editor.
		//  Generally this is a double click and the second mouse click is
		//  passed to the editor which would remove the text selection unless
		//  we use the invokeLater()

		if (e instanceof MouseEvent && isSelectAllForMouseEvent) {
			Utility.invokeLater(new Runnable() {
				public void run() {
					((JTextComponent) editor).selectAll();
				}
			});
		}
	}

	@Override public void setModel(TableModel dataModel) {

		if (dataModel == null)
			dataModel = createDefaultDataModel();

		if (dataModel != null) {
			super.setModel(dataModel);
			try {
				setComponentRenderers(this, dataModel);
			} catch (Throwable t) {
				printStackTrace(t);
			}
		}
	}

	public void setModelClasses(Class matrixClass, Class rowClass, CellConversions getList, String[] colNames) {
		this.matrixClass = matrixClass;
		this.listFromH = getList;
		this.rowClass = rowClass;
		this.colNamesPredef = colNames;
		if (this.objectValue != null) {
			try {
				setObject(objectValue);
			} catch (Exception e) {
				printStackTrace(e);
			}
		}
	}

	@Override public void setObject(Object obj) throws InvocationTargetException, NoSuchConversionException {
		Object newj = Utility.recast(obj, matrixClass);
		if (newj != objectValue) {
			listOfRows = null;
			this.objectValue = newj;
			CustomTableModel tm = new CustomTableModel(listFromH, rowClass, rowClass, getList(), colNamesPredef);
			setModel(tm);
		}
		invalidate();
		int rc = getRowCount();
	}

	/*
	 *  Set the Select All property when editing is invoked by the "F2" key
	 */
	public void setSelectAllForActionEvent(boolean isSelectAllForActionEvent) {
		this.isSelectAllForActionEvent = isSelectAllForActionEvent;
	}

	/*
	 *  Sets the Select All property for for all event types
	 */
	public void setSelectAllForEdit(boolean isSelectAllForEdit) {
		setSelectAllForMouseEvent(isSelectAllForEdit);
		setSelectAllForActionEvent(isSelectAllForEdit);
		setSelectAllForKeyEvent(isSelectAllForEdit);
	}

	/*
	 *  Set the Select All property when editing is invoked by
	 *  typing directly into the cell
	 */
	public void setSelectAllForKeyEvent(boolean isSelectAllForKeyEvent) {
		this.isSelectAllForKeyEvent = isSelectAllForKeyEvent;
	}

	/*
	 *  Set the Select All property when editing is invoked by the mouse
	 */
	public void setSelectAllForMouseEvent(boolean isSelectAllForMouseEvent) {
		this.isSelectAllForMouseEvent = isSelectAllForMouseEvent;
	}

	@Override public void updateUI() {
		try {
			super.updateUI();
		} catch (Throwable t) {
			printStackTrace(t);
		}
	}

	public static LinkedList<Object> setComponentRenderers = new LinkedList<Object>();

	public static void setComponentRenderers(JTable table, TableModel tm) {
		Container jc = table.getParent();
		if (jc == null) {
			return;
		}
		if (setComponentRenderers.contains(tm)) {
			return;
		}
		try {
			setComponentRenderers.add(tm);
			setComponentRenderers0(table, tm);
		} finally {
			setComponentRenderers.remove(tm);
		}
		setComponentRenderers.add(tm);
	}

	public static int MIN_TEXT_HEIGHT = 24;

	static void setComponentRenderers0(JTable table, TableModel tm) {

		table.setSelectionBackground(table.getForeground());
		table.setSelectionForeground(table.getBackground());

		SearchableDemo.installSearchable(table);

		int mwidth = tm.getColumnCount();
		int twidth = table.getColumnCount();
		TableModel prev = table.getModel();
		TableColumnModel tcm = table.getColumnModel();
		if (prev != tm) {
			table.setModel(tm);
		}
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		if (tcm != null) {
			while (table.getColumnCount() > 0) {
				tcm.removeColumn(tcm.getColumn(0));
			}
			tcm = null;
		}
		JTableHeader header = table.getTableHeader();
		Dimension colmin = new Dimension(52, MIN_TEXT_HEIGHT);
		if (header != null) {
			Dimension ps = header.getMinimumSize();
			if (ps == null) {
				ps = new Dimension(10, MIN_TEXT_HEIGHT);
			} else {
				ps = new Dimension((int) Math.max(ps.getWidth(), 10), (int) Math.max(ps.getHeight(), MIN_TEXT_HEIGHT));
			}
			header.setMinimumSize(ps);
			TableCellRenderer hr = header.getDefaultRenderer();
			if (hr == null) {
				DefaultTableCellRenderer dr = new DefaultTableCellRenderer();
				dr.setMinimumSize(colmin);
				header.setDefaultRenderer(dr);
			}

		}/*
		 JScrollPane scroll = new JScrollPane(table);
		 ;*/
		if (tcm == null) {
			twidth = table.getColumnCount();
			tcm = new DefaultTableColumnModel();
			table.setColumnModel(tcm);
			for (int i = 0; i < mwidth; i++) {
				TableColumn jvp = new TableColumn(i);
				tcm.addColumn(jvp);
			}
		}
		for (int i = 0; i < mwidth; i++) {
			TableColumn column = tcm.getColumn(i);
			Class cclz = tm.getColumnClass(i);
			setupRenderAndEditors(table, i, cclz, column, null);
		}
		Container jc = table.getParent();
		boolean wantScrollPane = false;
		if (jc != null) {
			JScrollPane sp = null;
			if (!(jc instanceof JScrollPane)) {
				if (wantScrollPane) {
					jc.remove(table);
					sp = new JScrollPane(table);
					jc.add(sp);
				} else {
					sp = null;
				}
			} else {
				sp = (JScrollPane) jc;
				if (!wantScrollPane) {
					jc = sp.getParent();
					if (jc == null) {
						jc = sp;
						// ouch
					} else {
						sp.remove(table);
						jc.remove(sp);
						jc.add(table);
					}
					sp = null;
				}

			}
			boolean wantSearchArea = true;
			if (wantSearchArea && sp != null) {
				Container spParent = sp.getParent();
				spParent.remove(sp);
				spParent.add(SearchableDemo.createTitledPanel("searchable", 'S', sp));
			}
			table.setBounds(25, 50, 950, 600);
			table.setRowHeight((int) colmin.getHeight());
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			if (false && sp != null) {
				JViewport jvp = sp.getColumnHeader();
				if (jvp != null) {
					jvp.setMinimumSize(colmin);
					jvp.setPreferredSize(colmin);
				}
				if (false) {
					sp.setBackground(Color.yellow);
					sp.setColumnHeader(new JViewport() {
						@Override public Dimension getPreferredSize() {
							Dimension d = super.getPreferredSize();
							d.height = 32;
							return d;
						}
					});
				}
			}
		}

	}

	static public void setupRenderAndEditors(JTable table, int i, Class clz, TableColumn objColumn, CellConversions conv) {
		TableCellRenderer renderer = objColumn.getCellRenderer();

		CustomCellRenderer r = new CustomCellRenderer(table, i, clz, objColumn, conv);
		if (!(renderer instanceof CustomCellRenderer))
			objColumn.setCellRenderer(r);

		objColumn.setCellEditor(r.getEditor());
		TableCellRenderer hr = objColumn.getHeaderRenderer();
		if (hr == null) {
			DefaultTableCellRenderer dr = new DefaultTableCellRenderer();
			dr.setMinimumSize(new Dimension(10, MIN_TEXT_HEIGHT));
			objColumn.setHeaderRenderer(dr);
		}
		//Set up tool tips for the obj cells.
		renderer = objColumn.getCellRenderer();
		((JComponent) renderer).setToolTipText("Click for edit of " + clz);
		objColumn.setCellRenderer(renderer);
	}
}
