package org.appdapter.gui.table;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.event.EventListenerList;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.TableModelListener;

import org.appdapter.gui.swing.SmallObjectView;

/**
 *  A TableModel that better supports the processing of rows of data. That
 *  is, the data is treated more like a row than an individual cell. Hopefully
 *  this class can be used as a parent class instead of extending the
 *  AbstractTableModel when you need custom models that contain row related
 *  data.
 *
 *  A few methods have also been added to make it easier to customize
 *  properties of the model, such as the column class and column editability.
 *
 *  Any class that extends this class must make sure to invoke the
 *  setRowClass() and setDataAndColumnNames() methods either directly,
 *  by using the various constructors, or indirectly.
 *
 */
abstract public class RowTableModel<T> extends DefaultTableModel2 implements ListModel {
	protected List<T> modelData;
	//protected Vector<String> columnIdentifiers;
	protected Class[] columnClasses;
	protected Boolean[] isColumnEditable;
	private Class rowClass = Object.class;
	private boolean isModelEditable = true;
	protected JTable myTable;

	@Override public int getSize() {
		return getRowCount();
	}

	@Override public Object getElementAt(int row) {
		return getRow(row);
	}

	/**
	 *  Constructs a <code>RowTableModel</code> with the row class.
	 *
	 *  This value is used by the getRowsAsArray() method.
	 *
	 *  Sub classes creating a model using this constructor must make sure
	 *  to invoke the setDataAndColumnNames() method.
	 *
	 * @param rowClass  the class of row data to be added to the model
	 */
	protected RowTableModel(Class rowClass) {
		//	setRowDefaults();
		setRowClass(rowClass);
	}

	/**
	 *  Constructs a <code>RowTableModel</code> with column names.
	 *
	 *  Each column's name will be taken from the <code>columnNames</code>
	 *  List and the number of colums is determined by thenumber of items
	 *  in the <code>columnNames</code> List.
	 *
	 *  Sub classes creating a model using this constructor must make sure
	 *  to invoke the setRowClass() method.
	 *
	 * @param columnNames	   <code>List</code> containing the names
	 *							of the new columns
	 */
	protected RowTableModel(Vector<String> columnNames) {
		this(new ArrayList<T>(), columnNames);
	}

	/**
	 *  Constructs a <code>RowTableModel</code> with initial data and
	 *  customized column names.
	 *
	 *  Each item in the <code>modelData</code> List must also be a List Object
	 *  containing items for each column of the row.
	 *
	 *  Each column's name will be taken from the <code>columnNames</code>
	 *  List and the number of colums is determined by thenumber of items
	 *  in the <code>columnNames</code> List.
	 *
	 *  Sub classes creating a model using this constructor must make sure
	 *  to invoke the setRowClass() method.
	 *
	 * @param modelData		 the data of the table
	 * @param columnNames	   <code>List</code> containing the names
	 *							of the new columns
	 */
	protected RowTableModel(List<T> modelData, Vector<String> columnNames) {
		setDataAndColumnNames(modelData, columnNames);
	}

	/**
	 *  Full Constructor for creating a <code>RowTableModel</code>.
	 *
	 *  Each item in the <code>modelData</code> List must also be a List Object
	 *  containing items for each column of the row.
	 *
	 *  Each column's name will be taken from the <code>columnNames</code>
	 *  List and the number of colums is determined by thenumber of items
	 *  in the <code>columnNames</code> List.
	 *
	 *  @param modelData	the data of the table
	 *  @param columnNames	<code>List</code> containing the names
	 *						of the new columns
	 *  @param rowClass     the class of row data to be added to the model
	 */
	protected RowTableModel(List<T> modelData, Vector<String> columnNames, Class rowClass) {
		setDataAndColumnNames(modelData, columnNames);
		setRowClass(rowClass);
	}

	public RowTableModel(Object[][] data, Object[] columnNs) {
		setDataAndColumnNames(data, columnNs);
	}

	void setDataAndColumnNames(Object[][] data, Object[] columnNs) {
		if (columnNs != null) {
			int getColumnCount = columnNs.length;
			columnIdentifiers = new Vector(getColumnCount);
			columnIdentifiers.setSize(getColumnCount);
			columnClasses = new Class[getColumnCount];
			isColumnEditable = new Boolean[getColumnCount];
			int index = 0;
			for (Object cn : columnNs) {
				setColumnInfo(index, cn);
				index++;
			}
			if (data != null) {
				this.modelData = new ArrayList();
				for (Object[] fs : data) {
					addRowFields(fs);
				}
			}
			fireTableStructureChanged();
		}
	}

	private void setColumnInfo(int index, Object cn) {
		if (cn == null)
			return;
		if (cn instanceof Boolean) {
			setColumnEditable(index, (Boolean) cn);
			return;
		}
		if (cn instanceof Object[]) {
			for (Object c : (Object[]) cn) {
				setColumnInfo(index, c);
			}
			return;
		}
		if (cn instanceof Class) {
			setColumnClass(index, (Class) cn);
			return;
		}
		setColumnName(index, "" + cn);
	}

	public void setColumnName(int index, String string) {
		columnIdentifiers.set(index, string);
	}

	public void setRowDefaults() {
		Object[] def = new Object[] {//
		new Object[] { "x", Boolean.class },//
				new Object[] { "this", SmallObjectView.class },//
				new Object[] { "toString", String.class },//
		};
		setDataAndColumnNames((Object[][]) null, def);
	}

	private void addRowFields(Object[] fs) {
		if (fs == null)
			return;
		for (Object c : fs) {
			if (rowClass != Object.class) {
				if (rowClass.isInstance(c)) {
					addRow((T) c);
					return;
				}
			}
		}
		addRow((T) fs);
	}

	/**
	 *  Reset the data and column names of the model.
	 *
	 *	A fireTableStructureChanged event will be generated.
	 *
	 * @param modelData		 the data of the table
	 * @param columnNames	   <code>List</code> containing the names
	 *							of the new columns
	 */
	protected void setDataAndColumnNames(List<T> modelData, Vector<String> columnNames) {
		this.modelData = modelData;
		if(this.columnIdentifiers!=null) this.columnIdentifiers.clear();
		columnIdentifiers = (columnNames);
		columnClasses = new Class[getColumnCount()];
		isColumnEditable = new Boolean[getColumnCount()];
		fireTableStructureChanged();
	}

	/**
	 *  The class of the Row being stored in the TableModel
	 *
	 *  This is required for the getRowsAsArray() method to return the
	 *  proper class of row.
	 *
	 * @param rowClas		 the class of the row
	 */
	protected void setRowClass(Class rowClass) {
		this.rowClass = rowClass;
	}

	//
	//  Implement the TableModel interface
	//
	/**
	 *  Returns the Class of the queried <code>column</code>.

	 *  First it will check to see if a Class has been specified for the
	 *  <code>column</code> by using the <code>setColumnClass</code> method.
	 *  If not, then the superclass value is returned.
	 *
	 *  @param column  the column being queried
	 *  @return the Class of the column being queried
	*/
	public Class getColumnClass(int column) {
		Class columnClass = null;

		//  Get the class, if set, for the specified column

		if (columnClasses != null && column < columnClasses.length)
			columnClass = columnClasses[column];

		//  Get the default class
		if (columnClass == null) {
			columnClass = super.getColumnClass(column);
		}
		if ((columnClass == null || columnClass == Object.class) && getRowCount() > 0) {
			Object val = getValueAt(0, column);
			if (val != null && val != SafeJTable.WAS_NULL) {
				return val.getClass();
			}
		}
		return columnClass;
	}

	/**
	 * Returns the number of columns in this table model.
	 *
	 * @return the number of columns in the model
	 */
	public int getColumnCount() {
		return columnIdentifiers.size();
	}

	/**
	 * Returns the column name.
	 *
	 * @return a name for this column using the string value of the
	 * appropriate member in <code>columnNames</code>. If
	 * <code>columnNames</code> does not have an entry for this index
	 * then the default name provided by the superclass is returned
	 */
	public String getColumnName(int column) {
		Object columnName = null;

		if (columnIdentifiers != null && column < columnIdentifiers.size()) {
			columnName = columnIdentifiers.get(column);
		}

		return (columnName == null) ? super.getColumnName(column) : columnName.toString();
	}

	/**
	 * Returns the number of rows in this table model.
	 *
	 * @return the number of rows in the model
	 */
	public int getRowCount() {
		if (modelData == null)
			return 0;
		return modelData.size();
	}

	/**
	 * Returns true regardless of parameter values.
	 *
	 * @param   row		   the row whose value is to be queried
	 * @param   column		the column whose value is to be queried
	 * @return				  true
	 */
	public boolean isCellEditable(int row, int column) {
		Boolean isEditable = null;

		//  Check is column editability has been set

		if (isColumnEditable != null && column < isColumnEditable.length)
			isEditable = isColumnEditable[column];

		return (isEditable == null) ? isModelEditable : isEditable.booleanValue();
	}

	//
	//  Implement custom methods
	//

	public List<T> getRows() {
		return modelData;
	}

	/**
	 *  Adds a row of data to the end of the model.
	 *  Notification of the row being added will be generated.
	 *
	 * @param   rowData		 data of the row being added
	 */
	public void addRow(T rowData) {
		insertRow(getRowCount(), rowData);
	}

	/**
	 * Returns the Object of the requested <code>row</code>.
	 *
	 * @return the Object of the requested row.
	 */
	public T getRow(int row) {
		return modelData.get(row);
	}

	/**
	 * Returns an array of Objects for the requested <code>rows</code>.
	 *
	 * @return an array of Objects for the requested rows.
	 */
	@SuppressWarnings("unchecked") public T[] getRowsAsArray(int... rows) {
		List<T> rowData = getRowsAsList(rows);
		T[] array = (T[]) Array.newInstance(rowClass, rowData.size());
		return (T[]) rowData.toArray(array);
	}

	/**
	 * Returns a List of Objects for the requested <code>rows</code>.
	 *
	 * @return a List of Objects for the requested rows.
	 */
	public List<T> getRowsAsList(int... rows) {
		ArrayList<T> rowData = new ArrayList<T>(rows.length);

		for (int i = 0; i < rows.length; i++) {
			rowData.add(getRow(rows[i]));
		}

		return rowData;
	}

	/**
	 *  Insert a row of data at the <code>row</code> location in the model.
	 *  Notification of the row being added will be generated.
	 *
	 *  @param   row	  row in the model where the data will be inserted
	 *  @param   rowData  data of the row being added
	 */
	public void insertRow(int row, T rowData) {
		modelData.add(row, rowData);
		fireTableRowsInserted(row, row);
	}

	/**
	 *  Insert multiple rows of data at the <code>row</code> location in the model.
	 *  Notification of the row being added will be generated.
	 *
	 * @param   row	  row in the model where the data will be inserted
	 * @param   rowList  each item in the list is a separate row of data
	 */
	public void insertRows(int row, List<T> rowList) {
		modelData.addAll(row, rowList);
		fireTableRowsInserted(row, row + rowList.size() - 1);
	}

	/**
	 *  Insert multiple rows of data at the <code>row</code> location in the model.
	 *  Notification of the row being added will be generated.
	 *
	 * @param   row	  row in the model where the data will be inserted
	 * @param   rowArray  each item in the Array is a separate row of data
	 */
	public void insertRows(int row, T[] rowArray) {
		List<T> rowList = new ArrayList<T>(rowArray.length);

		for (int i = 0; i < rowArray.length; i++) {
			rowList.add(rowArray[i]);
		}

		insertRows(row, rowList);
	}

	/**
	 *  Moves one or more rows from the inlcusive range <code>start</code> to
	 *  <code>end</code> to the <code>to</code> position in the model.
	 *  After the move, the row that was at index <code>start</code>
	 *  will be at index <code>to</code>.
	 *  This method will send a <code>tableRowsUpdated</code> notification
	 *  message to all the listeners. <p>
	 *
	 *  <pre>
	 *  Examples of moves:
	 *  <p>
	 *  1. moveRow(1,3,5);
	 *		  a|B|C|D|e|f|g|h|i|j|k   - before
	 *		  a|e|f|g|h|B|C|D|i|j|k   - after
	 *  <p>
	 *  2. moveRow(6,7,1);
	 *		  a|b|c|d|e|f|G|H|i|j|k   - before
	 *		  a|G|H|b|c|d|e|f|i|j|k   - after
	 *  <p>
	 *  </pre>
	 *
	 * @param   start	   the starting row index to be moved
	 * @param   end		 the ending row index to be moved
	 * @param   to		  the destination of the rows to be moved
	 * @exception  IllegalArgumentException
	 *					  if any of the elements would be moved out
	 *					  of the table's range
	 */
	public void moveRow(int start, int end, int to) {
		if (start < 0) {
			String message = "Start index must be positive: " + start;
			throw new IllegalArgumentException(message);
		}

		if (end > getRowCount() - 1) {
			String message = "End index must be less than total rows: " + end;
			throw new IllegalArgumentException(message);
		}

		if (start > end) {
			String message = "Start index cannot be greater than end index";
			throw new IllegalArgumentException(message);
		}

		int rowsMoved = end - start + 1;

		if (to < 0 || to > getRowCount() - rowsMoved) {
			String message = "New destination row (" + to + ") is invalid";
			throw new IllegalArgumentException(message);
		}

		//  Save references to the rows that are about to be moved

		ArrayList<T> temp = new ArrayList<T>(rowsMoved);

		for (int i = start; i < end + 1; i++) {
			temp.add(modelData.get(i));
		}

		//  Remove the rows from the current location and add them back
		//  at the specified new location

		modelData.subList(start, end + 1).clear();
		modelData.addAll(to, temp);

		//  Determine the rows that need to be repainted to reflect the move

		int first;
		int last;

		if (to < start) {
			first = to;
			last = end;
		} else {
			first = start;
			last = to + end - start;
		}

		fireTableRowsUpdated(first, last);
	}

	/**
	 *  Remove the specified rows from the model. Rows between the starting
	 *  and ending indexes, inclusively, will be removed.
	 *  Notification of the rows being removed will be generated.
	 *
	 * @param   start		 starting row index
	 * @param   end		   ending row index
	 * @exception  ArrayIndexOutOfBoundsException
	 *								if any row index is invalid
	 */
	public void removeRowRange(int start, int end) {
		modelData.subList(start, end + 1).clear();
		fireTableRowsDeleted(start, end);
	}

	/**
	 *  Remove the specified rows from the model. The row indexes in the
	 *  array must be in increasing order.
	 *  Notification of the rows being removed will be generated.
	 *
	 * @param   rows  array containing indexes of rows to be removed
	 * @exception  ArrayIndexOutOfBoundsException
	 *				  if any row index is invalid
	 */
	public void removeRows(int... rows) {
		for (int i = rows.length - 1; i >= 0; i--) {
			int row = rows[i];
			modelData.remove(row);
			fireTableRowsDeleted(row, row);
		}
	}

	/**
	 *  Replace a row of data at the <code>row</code> location in the model.
	 *  Notification of the row being replaced will be generated.
	 *
	 * @param   row	  row in the model where the data will be replaced
	 * @param   rowData  data of the row to replace the existing data
	 * @exception  IllegalArgumentException  when the Class of the row data
	 *			 does not match the row Class of the model.
	 */
	public void replaceRow(int row, T rowData) {
		modelData.set(row, rowData);
		fireTableRowsUpdated(row, row);
	}

	/**
	 * Sets the Class for the specified column.
	 *
	 * @param  column	   the column whose Class is being changed
	 * @param  columnClass  the new Class of the column
	 * @exception  ArrayIndexOutOfBoundsException
	 *						if an invalid column was given
	 */
	public void setColumnClass(int column, Class columnClass) {
		columnClasses[column] = columnClass;
		fireTableRowsUpdated(0, getRowCount() - 1);
	}

	/**
	 * Sets the editability for the specified column.
	 *
	 * @param  column	   the column whose Class is being changed
	 * @param  isEditable   indicates if the column is editable or not
	 * @exception  ArrayIndexOutOfBoundsException
	 *						if an invalid column was given
	 */
	public void setColumnEditable(int column, boolean isEditable) {
		isColumnEditable[column] = isEditable ? Boolean.TRUE : Boolean.FALSE;
	}

	/**
	 *  Set the ability to edit cell data for the entire model
	 *
	 *  Note: values set by the setColumnEditable(...) method will have
	 *  prioritiy over this value.
	 *
	 * @param isModelEditable  true/false
	 */
	public void setModelEditable(boolean isModelEditable) {
		this.isModelEditable = isModelEditable;
	}

	/*
	 *  Convert an unformatted column name to a formatted column name. That is:
	 *
	 *  - insert a space when a new uppercase character is found, insert
	 *    multiple upper case characters are grouped together.
	 *  - replace any "_" with a space
	 *
	 *  @param columnName  unformatted column name
	 *  @return the formatted column name
	 */
	public static String formatColumnName(String columnName) {
		if (columnName.length() < 3)
			return columnName;

		StringBuffer buffer = new StringBuffer(columnName);
		boolean isPreviousLowerCase = false;

		for (int i = 1; i < buffer.length(); i++) {
			boolean isCurrentUpperCase = Character.isUpperCase(buffer.charAt(i));

			if (isCurrentUpperCase && isPreviousLowerCase) {
				buffer.insert(i, " ");
				i++;
			}

			isPreviousLowerCase = !isCurrentUpperCase;
		}

		return buffer.toString().replaceAll("_", " ");
	}

	@Override public void addTableModelListener(TableModelListener l) {
		if (l instanceof JTable) {
			if (myTable == null) {
				this.myTable = (JTable) l;
				SafeJTable.setComponentRenderers(myTable, this);
			}
		}
		super.addTableModelListener(l);
	}

	protected EventListenerList listenerList = new EventListenerList();

	/**
	 * Adds a listener to the list that's notified each time a change
	 * to the data model occurs.
	 *
	 * @param l the <code>ListDataListener</code> to be added
	 */
	public void addListDataListener(ListDataListener l) {
		listenerList.add(ListDataListener.class, l);
	}

	/**
	 * Removes a listener from the list that's notified each time a
	 * change to the data model occurs.
	 *
	 * @param l the <code>ListDataListener</code> to be removed
	 */
	public void removeListDataListener(ListDataListener l) {
		listenerList.remove(ListDataListener.class, l);
	}

	/**
	 * Returns an array of all the list data listeners
	 * registered on this <code>AbstractListModel</code>.
	 *
	 * @return all of this model's <code>ListDataListener</code>s,
	 *         or an empty array if no list data listeners
	 *         are currently registered
	 *
	 * @see #addListDataListener
	 * @see #removeListDataListener
	 *
	 * @since 1.4
	 */
	public ListDataListener[] getListDataListeners() {
		return (ListDataListener[]) listenerList.getListeners(ListDataListener.class);
	}

	/**
	 * <code>AbstractListModel</code> subclasses must call this method
	 * <b>after</b>
	 * one or more elements of the list change.  The changed elements
	 * are specified by the closed interval index0, index1 -- the endpoints
	 * are included.  Note that
	 * index0 need not be less than or equal to index1.
	 *
	 * @param source the <code>ListModel</code> that changed, typically "this"
	 * @param index0 one end of the new interval
	 * @param index1 the other end of the new interval
	 * @see EventListenerList
	 * @see DefaultListModel
	 */
	protected void fireContentsChanged(Object source, int index0, int index1) {
		Object[] listeners = listenerList.getListenerList();
		ListDataEvent e = null;

		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ListDataListener.class) {
				if (e == null) {
					e = new ListDataEvent(source, ListDataEvent.CONTENTS_CHANGED, index0, index1);
				}
				((ListDataListener) listeners[i + 1]).contentsChanged(e);
			}
		}
	}

	/**
	 * <code>AbstractListModel</code> subclasses must call this method
	 * <b>after</b>
	 * one or more elements are added to the model.  The new elements
	 * are specified by a closed interval index0, index1 -- the enpoints
	 * are included.  Note that
	 * index0 need not be less than or equal to index1.
	 *
	 * @param source the <code>ListModel</code> that changed, typically "this"
	 * @param index0 one end of the new interval
	 * @param index1 the other end of the new interval
	 * @see EventListenerList
	 * @see DefaultListModel
	 */
	protected void fireIntervalAdded(Object source, int index0, int index1) {
		Object[] listeners = listenerList.getListenerList();
		ListDataEvent e = null;

		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ListDataListener.class) {
				if (e == null) {
					e = new ListDataEvent(source, ListDataEvent.INTERVAL_ADDED, index0, index1);
				}
				((ListDataListener) listeners[i + 1]).intervalAdded(e);
			}
		}
	}

	/**
	 * <code>AbstractListModel</code> subclasses must call this method
	 * <b>after</b> one or more elements are removed from the model.
	 * <code>index0</code> and <code>index1</code> are the end points
	 * of the interval that's been removed.  Note that <code>index0</code>
	 * need not be less than or equal to <code>index1</code>.
	 *
	 * @param source the <code>ListModel</code> that changed, typically "this"
	 * @param index0 one end of the removed interval,
	 *               including <code>index0</code>
	 * @param index1 the other end of the removed interval,
	 *               including <code>index1</code>
	 * @see EventListenerList
	 * @see DefaultListModel
	 */
	protected void fireIntervalRemoved(Object source, int index0, int index1) {
		Object[] listeners = listenerList.getListenerList();
		ListDataEvent e = null;

		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ListDataListener.class) {
				if (e == null) {
					e = new ListDataEvent(source, ListDataEvent.INTERVAL_REMOVED, index0, index1);
				}
				((ListDataListener) listeners[i + 1]).intervalRemoved(e);
			}
		}
	}

	/**
	 * Returns an array of all the objects currently registered as
	 * <code><em>Foo</em>Listener</code>s
	 * upon this model.
	 * <code><em>Foo</em>Listener</code>s
	 * are registered using the <code>add<em>Foo</em>Listener</code> method.
	 * <p>
	 * You can specify the <code>listenerType</code> argument
	 * with a class literal, such as <code><em>Foo</em>Listener.class</code>.
	 * For example, you can query a list model
	 * <code>m</code>
	 * for its list data listeners
	 * with the following code:
	 *
	 * <pre>ListDataListener[] ldls = (ListDataListener[])(m.getListeners(ListDataListener.class));</pre>
	 *
	 * If no such listeners exist,
	 * this method returns an empty array.
	 *
	 * @param listenerType  the type of listeners requested;
	 *          this parameter should specify an interface
	 *          that descends from <code>java.util.EventListener</code>
	 * @return an array of all objects registered as
	 *          <code><em>Foo</em>Listener</code>s
	 *          on this model,
	 *          or an empty array if no such
	 *          listeners have been added
	 * @exception ClassCastException if <code>listenerType</code> doesn't
	 *          specify a class or interface that implements
	 *          <code>java.util.EventListener</code>
	 *
	 * @see #getListDataListeners
	 *
	 * @since 1.3
	 */
	public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
		return (T[]) listenerList.getListeners(listenerType);
	}
}