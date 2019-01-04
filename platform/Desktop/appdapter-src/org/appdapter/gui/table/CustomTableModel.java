package org.appdapter.gui.table;

import static org.appdapter.core.log.Debuggable.printStackTrace;

import java.util.List;

import javax.swing.JComponent;
import javax.swing.table.TableModel;

import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.browse.Utility;

public class CustomTableModel extends BeanTableModel implements TableModel {

	private static final String THIS = "this";

	public CustomTableModel() {
		this(Object.class);
	}

	public CustomTableModel(Class rowClass) {
		this(null, rowClass, rowClass, null, null);
	}

	public CustomTableModel(Object[][] data, Object[] columnNames) {
		super(data, columnNames);
	}

	public CustomTableModel(CellConversions conversions, Class rowClass, Class ancestorClass, List modelData, String[] colNames) {
		super(rowClass, ancestorClass, modelData, colNames);
		// TODO Auto-generated constructor stub
	}

	@Override public Class<?> getColumnClass(int columnIndex) {
		Class columnClass = null;
		if (columnClasses != null && columnIndex < columnClasses.length) {
			columnClass = columnClasses[columnIndex];
			if (columnClass != null)
				return columnClass;
		}
		//  Get the default class
		if (columnClass == null) {
			columnClass = super.getColumnClass(columnIndex);
		}
		if ((columnClass == null || columnClass == Object.class) && getRowCount() > 0) {
			Object val = getValueAt(0, columnIndex);
			if (val != null && val != SafeJTable.WAS_NULL) {
				return val.getClass();
			}
		}
		return columnClass;
	}

	@Override public int getColumnCount() {
		if (columnIdentifiers == null)
			return 0;
		int size = columnIdentifiers.size();
		if (size == 0) {
			return 0;
		}
		return size;
	}

	@Override public String getColumnName(int columnIndex) {
		if (columnIndex < 0)
			return THIS;
		Object columnName = null;

		if (columnIdentifiers != null && columnIndex < columnIdentifiers.size()) {
			columnName = columnIdentifiers.get(columnIndex);
		}

		return (columnName == null) ? super.getColumnName(columnIndex) : columnName.toString();
	}

	protected Object getNamedValue(Object statement, String namedProp) throws NoSuchConversionException, SecurityException, NoSuchFieldException, Throwable {
		if (namedProp == THIS)
			return statement;
		String localName = ".*" + namedProp.toUpperCase() + ".*";
		try {
			Object r = ReflectUtils.getObjectPropertyValue(statement, statement.getClass(), localName, null, false);
			if (r == null)
				return SafeJTable.WAS_NULL;
			return r;
		} catch (Throwable e) {
			throw e;
		}
	}

	@Override public int getRowCount() {
		if (isEmpty())
			return 0;
		List list = getRows();
		return list.size();
	}

	public Object getRowObject(int rowIndex) {
		if (rowIndex < 0) {
			return null;
		}
		int rc = getRowCount();
		if (rowIndex >= rc)
			return null;
		return getRows().get(rowIndex);
	}

	@Override public Object getValueAt(int rowIndex, int columnIndex) {
		if (isEmpty())
			return SafeJTable.WAS_NULL;
		Object statement = getRowObject(rowIndex);
		try {
			String cn = getColumnName(columnIndex);
			if (cn == null) {
				return super.getValueAt(columnIndex, columnIndex);
			}
			Object ele = getNamedValue(statement, cn);
			/*if (ele instanceof JComponent) {
				ele = Utility.dref(ele);
			}*/
			return ele;
		} catch (Throwable e) {
			printStackTrace(e);
			return super.getValueAt(columnIndex, columnIndex);
		}
	}

	@Override public boolean isCellEditable(int rowIndex, int columnIndex) {
		return super.isCellEditable(rowIndex, columnIndex);
	}

	private boolean isEmpty() {
		List list = getRows();
		return (list == null || list.size() == 0);
	}

	protected void setNamedValue(Object statement, String named, Object recast) throws NoSuchConversionException, NoSuchFieldException {
		String localName = ".*" + named.toUpperCase() + ".*";
		ReflectUtils.setObjectPropertyValue(statement, statement.getClass(), localName, null, false, recast);
	}

	@Override public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if (isEmpty())
			return;
		try {
			Object statement = getRowObject(rowIndex);
			String namedProp = getColumnName(columnIndex);
			Object was = getNamedValue(statement, namedProp);
			if (was != null && aValue != null && was.equals(aValue)) {
				return;
			}
			Class objNeedsToBe = getColumnClass(columnIndex);
			if (!objNeedsToBe.isInstance(was)) {
				was = null;
			}

			setNamedValue(statement, namedProp, aValue);
		} catch (Throwable e) {
			printStackTrace(e);
		}
	}

}