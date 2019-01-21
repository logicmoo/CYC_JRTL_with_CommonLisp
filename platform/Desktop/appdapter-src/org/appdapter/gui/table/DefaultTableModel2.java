package org.appdapter.gui.table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DefaultTableModel2 extends DefaultTableModel implements TableModel, Serializable {

	//
	// Instance Variables
	//

	/**
	 * The <code>Vector</code> of <code>Vectors</code> of 
	 * <code>Object</code> values.
	 */
	//protected Vector dataVector;

	/** The <code>Vector</code> of column identifiers. */
	//protected Vector columnIdentifiers;

	//
	// Constructors
	//

	/**
	 *  Constructs a default <code>DefaultTableModel</code> 
	 *  which is a table of zero columns and zero rows.
	 */
	public DefaultTableModel2() {
		this(0, 0);
	}

	private static Vector newVector(int size) {
		Vector v = new Vector(size);
		v.setSize(size);
		return v;
	}

	/**
	 *  Constructs a <code>DefaultTableModel</code> with
	 *  <code>rowCount</code> and <code>columnCount</code> of
	 *  <code>null</code> object values.
	 *
	 * @param rowCount           the number of rows the table holds
	 * @param columnCount        the number of columns the table holds
	 *
	 * @see #setValueAt
	 */
	public DefaultTableModel2(int rowCount, int columnCount) {
		this(newVector(columnCount), rowCount);
	}

	/**
	 *  Constructs a <code>DefaultTableModel</code> with as many columns
	 *  as there are elements in <code>columnNames</code>
	 *  and <code>rowCount</code> of <code>null</code>
	 *  object values.  Each column's name will be taken from
	 *  the <code>columnNames</code> vector.
	 *
	 * @param columnNames       <code>vector</code> containing the names
	 *				of the new columns; if this is 
	 *                          <code>null</code> then the model has no columns
	 * @param rowCount           the number of rows the table holds
	 * @see #setDataVector
	 * @see #setValueAt
	 */
	public DefaultTableModel2(Vector columnNames, int rowCount) {
		setDataVectorV(newVector(rowCount), columnNames);
	}

	/**
	 *  Constructs a <code>DefaultTableModel</code> with as many
	 *  columns as there are elements in <code>columnNames</code>
	 *  and <code>rowCount</code> of <code>null</code>
	 *  object values.  Each column's name will be taken from
	 *  the <code>columnNames</code> array.
	 *
	 * @param columnNames       <code>array</code> containing the names
	 *				of the new columns; if this is
	 *                          <code>null</code> then the model has no columns
	 * @param rowCount           the number of rows the table holds
	 * @see #setDataVector
	 * @see #setValueAt
	 */
	public DefaultTableModel2(Object[] columnNames, int rowCount) {
		this(convertToVector(columnNames), rowCount);
	}

	/**
	 *  Constructs a <code>DefaultTableModel</code> and initializes the table
	 *  by passing <code>data</code> and <code>columnNames</code>
	 *  to the <code>setDataVector</code> method.
	 *
	 * @param data              the data of the table, a <code>Vector</code>
	 *                          of <code>Vector</code>s of <code>Object</code>
	 *                          values
	 * @param columnNames       <code>vector</code> containing the names
	 *				of the new columns
	 * @see #getDataVector
	 * @see #setDataVector
	 */
	public DefaultTableModel2(Vector data, Vector columnNames) {
		setDataVectorV((Vector)data, columnNames);
	}

	/**
	 *  Constructs a <code>DefaultTableModel</code> and initializes the table
	 *  by passing <code>data</code> and <code>columnNames</code>
	 *  to the <code>setDataVector</code>
	 *  method. The first index in the <code>Object[][]</code> array is
	 *  the row index and the second is the column index.
	 *
	 * @param data              the data of the table
	 * @param columnNames       the names of the columns
	 * @see #getDataVector
	 * @see #setDataVector
	 */
	public DefaultTableModel2(Object[][] data, Object[] columnNames) {
		setDataVector(data, columnNames);
	}

	/**
	 *  Returns the <code>Vector</code> of <code>Vectors</code>
	 *  that contains the table's
	 *  data values.  The vectors contained in the outer vector are
	 *  each a single row of values.  In other words, to get to the cell
	 *  at row 1, column 5: <p>
	 *
	 *  <code>((Vector)getDataVector().elementAt(1)).elementAt(5);</code><p>
	 *
	 * @return  the vector of vectors containing the tables data values
	 *
	 * @see #newDataAvailable
	 * @see #newRowsAdded
	 * @see #setDataVector
	 */
	@Override
	public Vector getDataVector() {

		return (Vector) dataVector;
	}

	private static Vector nonNullVector(Vector v) {
		return (v != null) ? v : new Vector();
	}

	/**
	 *  Replaces the current <code>dataVector</code> instance variable 
	 *  with the new <code>Vector</code> of rows, <code>dataVector</code>.
	 *  Each row is represented in <code>dataVector</code> as a
	 *  <code>Vector</code> of <code>Object</code> values.
	 *  <code>columnIdentifiers</code> are the names of the new 
	 *  columns.  The first name in <code>columnIdentifiers</code> is
	 *  mapped to column 0 in <code>dataVector</code>. Each row in
	 *  <code>dataVector</code> is adjusted to match the number of 
	 *  columns in <code>columnIdentifiers</code>
	 *  either by truncating the <code>Vector</code> if it is too long,
	 *  or adding <code>null</code> values if it is too short.
	 *  <p>Note that passing in a <code>null</code> value for
	 *  <code>dataVector</code> results in unspecified behavior,
	 *  an possibly an exception.
	 *
	 * @param   dataVector         the new data vector
	 * @param   columnIdentifiers     the names of the columns
	 * @see #getDataVector
	 */
	public void setDataVector(Vector dataVector, Vector columnIdentifiers) {
		this.dataVector = nonNullVector(dataVector);
		this.columnIdentifiers = nonNullVector(columnIdentifiers);
		justifyRows(0, getRowCount());
		fireTableStructureChanged();
	}
	public void setDataVectorV(Vector dataVector, Vector columnIdentifiers) {
		this.dataVector = nonNullVector(dataVector);
		this.columnIdentifiers = nonNullVector(columnIdentifiers);
		justifyRows(0, getRowCount());
		fireTableStructureChanged();
	}

	/**
	 *  Replaces the value in the <code>dataVector</code> instance 
	 *  variable with the values in the array <code>dataVector</code>.
	 *  The first index in the <code>Object[][]</code>
	 *  array is the row index and the second is the column index.
	 *  <code>columnIdentifiers</code> are the names of the new columns.
	 *
	 * @param dataVector		the new data vector
	 * @param columnIdentifiers	the names of the columns
	 * @see #setDataVector(Vector, Vector)
	 */
	@Override
	public void setDataVector(Object[][] dataVector, Object[] columnIdentifiers) {
		setDataVectorV((Vector)convertToVector(dataVector), convertToVector(columnIdentifiers));
	}

	/**
	 *  Equivalent to <code>fireTableChanged</code>.
	 *
	 * @param event  the change event 
	 *
	 */
	@Override
	public void newDataAvailable(TableModelEvent event) {
		fireTableChanged(event);
	}

	//
	// Manipulating rows
	// 

	private void justifyRows(int from, int to) {
		// Sometimes the DefaultTableModel is subclassed 
		// instead of the AbstractTableModel by mistake. 
		// Set the number of rows for the case when getRowCount 
		// is overridden. 
		dataVector.setSize(getRowCount());

		for (int i = from; i < to; i++) {
			if (dataVector.elementAt(i) == null) {
				dataVector.setElementAt(new Vector(), i);
			}
			((Vector) dataVector.elementAt(i)).setSize(getColumnCount());
		}
	}

	/**
	 *  Ensures that the new rows have the correct number of columns.
	 *  This is accomplished by  using the <code>setSize</code> method in
	 *  <code>Vector</code> which truncates vectors
	 *  which are too long, and appends <code>null</code>s if they
	 *  are too short.
	 *  This method also sends out a <code>tableChanged</code>
	 *  notification message to all the listeners.
	 *
	 * @param e         this <code>TableModelEvent</code> describes 
	 *                           where the rows were added. 
	 *				 If <code>null</code> it assumes
	 *                           all the rows were newly added
	 * @see #getDataVector
	 */
	@Override
	public void newRowsAdded(TableModelEvent e) {
		justifyRows(e.getFirstRow(), e.getLastRow() + 1);
		fireTableChanged(e);
	}

	/**
	 *  Equivalent to <code>fireTableChanged</code>.
	 *
	 *  @param event the change event
	 *
	 */
	@Override
	public void rowsRemoved(TableModelEvent event) {
		fireTableChanged(event);
	}

	/**
	 * Obsolete as of Java 2 platform v1.3.  Please use <code>setRowCount</code> instead.
	 */
	/*
	 *  Sets the number of rows in the model.  If the new size is greater
	 *  than the current size, new rows are added to the end of the model
	 *  If the new size is less than the current size, all
	 *  rows at index <code>rowCount</code> and greater are discarded. <p>
	 *
	 * @param   rowCount   the new number of rows
	 * @see #setRowCount
	 */
	@Override
	public void setNumRows(int rowCount) {
		int old = getRowCount();
		if (old == rowCount) {
			return;
		}
		dataVector.setSize(rowCount);
		if (rowCount <= old) {
			fireTableRowsDeleted(rowCount, old - 1);
		} else {
			justifyRows(old, rowCount);
			fireTableRowsInserted(old, rowCount - 1);
		}
	}

	/**
	 *  Sets the number of rows in the model.  If the new size is greater
	 *  than the current size, new rows are added to the end of the model
	 *  If the new size is less than the current size, all
	 *  rows at index <code>rowCount</code> and greater are discarded. <p>
	 *
	 *  @see #setColumnCount
	 * @since 1.3
	 */
	@Override
	public void setRowCount(int rowCount) {
		setNumRows(rowCount);
	}

	/**
	 *  Adds a row to the end of the model.  The new row will contain
	 *  <code>null</code> values unless <code>rowData</code> is specified.
	 *  Notification of the row being added will be generated.
	 *
	 * @param   rowData          optional data of the row being added
	 */
	public void addRow(Vector rowData) {
		insertRow(getRowCount(), rowData);
	}

	/**
	 *  Adds a row to the end of the model.  The new row will contain
	 *  <code>null</code> values unless <code>rowData</code> is specified.
	 *  Notification of the row being added will be generated.
	 *
	 * @param   rowData          optional data of the row being added
	 */
	@Override
	public void addRow(Object[] rowData) {
		addRow(convertToVector(rowData));
	}

	/**
	 *  Inserts a row at <code>row</code> in the model.  The new row
	 *  will contain <code>null</code> values unless <code>rowData</code>
	 *  is specified.  Notification of the row being added will be generated.
	 *
	 * @param   row             the row index of the row to be inserted
	 * @param   rowData         optional data of the row being added
	 * @exception  ArrayIndexOutOfBoundsException  if the row was invalid
	 */
	public void insertRow(int row, Vector rowData) {
		dataVector.insertElementAt(rowData, row);
		justifyRows(row, row + 1);
		fireTableRowsInserted(row, row);
	}

	/**
	 *  Inserts a row at <code>row</code> in the model.  The new row
	 *  will contain <code>null</code> values unless <code>rowData</code>
	 *  is specified.  Notification of the row being added will be generated.
	 *
	 * @param   row      the row index of the row to be inserted
	 * @param   rowData          optional data of the row being added
	 * @exception  ArrayIndexOutOfBoundsException  if the row was invalid
	 */
	@Override
	public void insertRow(int row, Object[] rowData) {
		insertRow(row, convertToVector(rowData));
	}

	private static int gcd(int i, int j) {
		return (j == 0) ? i : gcd(j, i % j);
	}

	private static void rotate(Vector v, int a, int b, int shift) {
		int size = b - a;
		int r = size - shift;
		int g = gcd(size, r);
		for (int i = 0; i < g; i++) {
			int to = i;
			Object tmp = v.elementAt(a + to);
			for (int from = (to + r) % size; from != i; from = (to + r) % size) {
				v.setElementAt(v.elementAt(a + from), a + to);
				to = from;
			}
			v.setElementAt(tmp, a + to);
		}
	}

	/**
	 *  Moves one or more rows from the inclusive range <code>start</code> to 
	 *  <code>end</code> to the <code>to</code> position in the model. 
	 *  After the move, the row that was at index <code>start</code> 
	 *  will be at index <code>to</code>. 
	 *  This method will send a <code>tableChanged</code> notification
	 *  message to all the listeners. <p>
	 *
	 *  <pre>
	 *  Examples of moves:
	 *  <p>
	 *  1. moveRow(1,3,5);
	 *          a|B|C|D|e|f|g|h|i|j|k   - before
	 *          a|e|f|g|h|B|C|D|i|j|k   - after
	 *  <p>
	 *  2. moveRow(6,7,1);
	 *          a|b|c|d|e|f|G|H|i|j|k   - before
	 *          a|G|H|b|c|d|e|f|i|j|k   - after
	 *  <p> 
	 *  </pre>
	 *
	 * @param   start       the starting row index to be moved
	 * @param   end         the ending row index to be moved
	 * @param   to          the destination of the rows to be moved
	 * @exception  ArrayIndexOutOfBoundsException  if any of the elements 
	 * would be moved out of the table's range 
	 * 
	 */
	@Override
	public void moveRow(int start, int end, int to) {
		int shift = to - start;
		int first, last;
		if (shift < 0) {
			first = to;
			last = end;
		} else {
			first = start;
			last = to + end - start;
		}
		rotate(getDataVector(), first, last + 1, shift);

		fireTableRowsUpdated(first, last);
	}

	/**
	 *  Removes the row at <code>row</code> from the model.  Notification
	 *  of the row being removed will be sent to all the listeners.
	 *
	 * @param   row      the row index of the row to be removed
	 * @exception  ArrayIndexOutOfBoundsException  if the row was invalid
	 */
	@Override
	public void removeRow(int row) {
		dataVector.removeElementAt(row);
		fireTableRowsDeleted(row, row);
	}

	//
	// Manipulating columns
	// 

	/**
	 * Replaces the column identifiers in the model.  If the number of
	 * <code>newIdentifier</code>s is greater than the current number
	 * of columns, new columns are added to the end of each row in the model.
	 * If the number of <code>newIdentifier</code>s is less than the current
	 * number of columns, all the extra columns at the end of a row are
	 * discarded. <p>
	 *
	 * @param   columnIdentifiers  vector of column identifiers.  If
	 *				<code>null</code>, set the model
	 *                          to zero columns
	 * @see #setNumRows
	 */
	public void setColumnIdentifiers(Vector columnIdentifiers) {
		setDataVector(dataVector, columnIdentifiers);
	}

	/**
	 * Replaces the column identifiers in the model.  If the number of
	 * <code>newIdentifier</code>s is greater than the current number
	 * of columns, new columns are added to the end of each row in the model.
	 * If the number of <code>newIdentifier</code>s is less than the current
	 * number of columns, all the extra columns at the end of a row are
	 * discarded. <p>
	 *
	 * @param   newIdentifiers  array of column identifiers. 
	 *				If <code>null</code>, set
	 *                          the model to zero columns
	 * @see #setNumRows
	 */
	@Override
	public void setColumnIdentifiers(Object[] newIdentifiers) {
		setColumnIdentifiers(convertToVector(newIdentifiers));
	}

	/**
	 *  Sets the number of columns in the model.  If the new size is greater
	 *  than the current size, new columns are added to the end of the model 
	 *  with <code>null</code> cell values.
	 *  If the new size is less than the current size, all columns at index
	 *  <code>columnCount</code> and greater are discarded. 
	 *
	 *  @param columnCount  the new number of columns in the model
	 *
	 *  @see #setColumnCount
	 * @since 1.3
	 */
	@Override
	public void setColumnCount(int columnCount) {
		columnIdentifiers.setSize(columnCount);
		justifyRows(0, getRowCount());
		fireTableStructureChanged();
	}

	/**
	 *  Adds a column to the model.  The new column will have the
	 *  identifier <code>columnName</code>, which may be null.  This method
	 *  will send a
	 *  <code>tableChanged</code> notification message to all the listeners.
	 *  This method is a cover for <code>addColumn(Object, Vector)</code> which
	 *  uses <code>null</code> as the data vector.
	 *
	 * @param   columnName the identifier of the column being added
	 */
	@Override
	public void addColumn(Object columnName) {
		addColumn(columnName, (Vector) null);
	}

	/**
	 *  Adds a column to the model.  The new column will have the
	 *  identifier <code>columnName</code>, which may be null.
	 *  <code>columnData</code> is the
	 *  optional vector of data for the column.  If it is <code>null</code>
	 *  the column is filled with <code>null</code> values.  Otherwise,
	 *  the new data will be added to model starting with the first
	 *  element going to row 0, etc.  This method will send a
	 *  <code>tableChanged</code> notification message to all the listeners.
	 *
	 * @param   columnName the identifier of the column being added
	 * @param   columnData       optional data of the column being added
	 */
	public void addColumn(Object columnName, Vector columnData) {
		columnIdentifiers.addElement(columnName);
		if (columnData != null) {
			int columnSize = columnData.size();
			if (columnSize > getRowCount()) {
				dataVector.setSize(columnSize);
			}
			justifyRows(0, getRowCount());
			int newColumn = getColumnCount() - 1;
			for (int i = 0; i < columnSize; i++) {
				Vector row = (Vector) dataVector.elementAt(i);
				row.setElementAt(columnData.elementAt(i), newColumn);
			}
		} else {
			justifyRows(0, getRowCount());
		}

		fireTableStructureChanged();
	}

	/**
	 *  Adds a column to the model.  The new column will have the
	 *  identifier <code>columnName</code>.  <code>columnData</code> is the
	 *  optional array of data for the column.  If it is <code>null</code>
	 *  the column is filled with <code>null</code> values.  Otherwise,
	 *  the new data will be added to model starting with the first
	 *  element going to row 0, etc.  This method will send a
	 *  <code>tableChanged</code> notification message to all the listeners.
	 *
	 * @see #addColumn(Object, Vector)
	 */
	@Override
	public void addColumn(Object columnName, Object[] columnData) {
		addColumn(columnName, convertToVector(columnData));
	}

	//
	// Implementing the TableModel interface
	//

	/**
	 * Returns the number of rows in this data table.
	 * @return the number of rows in the model
	 */
	@Override
	public int getRowCount() {
		return dataVector.size();
	}

	/**
	 * Returns the number of columns in this data table.
	 * @return the number of columns in the model
	 */
	@Override
	public int getColumnCount() {
		return columnIdentifiers.size();
	}

	/**
	 * Returns the column name.
	 *
	 * @return a name for this column using the string value of the
	 * appropriate member in <code>columnIdentifiers</code>.
	 * If <code>columnIdentifiers</code> does not have an entry 
	 * for this index, returns the default
	 * name provided by the superclass.
	 */
	@Override
	public String getColumnName(int column) {
		Object id = null;
		// This test is to cover the case when 
		// getColumnCount has been subclassed by mistake ... 
		if (column < columnIdentifiers.size() && (column >= 0)) {
			id = columnIdentifiers.elementAt(column);
		}
		return (id == null) ? super.getColumnName(column) : id.toString();
	}

	/**
	 * Returns true regardless of parameter values.
	 *
	 * @param   row             the row whose value is to be queried
	 * @param   column          the column whose value is to be queried
	 * @return                  true
	 * @see #setValueAt
	 */
	@Override
	public boolean isCellEditable(int row, int column) {
		return true;
	}

	/**
	 * Returns an attribute value for the cell at <code>row</code>
	 * and <code>column</code>.
	 *
	 * @param   row             the row whose value is to be queried
	 * @param   column          the column whose value is to be queried
	 * @return                  the value Object at the specified cell
	 * @exception  ArrayIndexOutOfBoundsException  if an invalid row or
	 *               column was given
	 */
	@Override
	public Object getValueAt(int row, int column) {
		Vector rowVector = (Vector) dataVector.elementAt(row);
		return rowVector.elementAt(column);
	}

	/**
	 * Sets the object value for the cell at <code>column</code> and
	 * <code>row</code>.  <code>aValue</code> is the new value.  This method
	 * will generate a <code>tableChanged</code> notification.
	 *
	 * @param   aValue          the new value; this can be null
	 * @param   row             the row whose value is to be changed
	 * @param   column          the column whose value is to be changed
	 * @exception  ArrayIndexOutOfBoundsException  if an invalid row or
	 *               column was given
	 */
	@Override
	public void setValueAt(Object aValue, int row, int column) {
		Vector rowVector = (Vector) dataVector.elementAt(row);
		rowVector.setElementAt(aValue, column);
		fireTableCellUpdated(row, column);
	}

	//
	// Protected Methods
	//

	/** 
	 * Returns a vector that contains the same objects as the array.
	 * @param anArray  the array to be converted
	 * @return  the new vector; if <code>anArray</code> is <code>null</code>,
	 *				returns <code>null</code>
	 */
	protected static Vector convertToVector(Object[] anArray) {
		if (anArray == null) {
			return null;
		}
		Vector v = new Vector(anArray.length);
		for (int i = 0; i < anArray.length; i++) {
			v.addElement(anArray[i]);
		}
		return v;
	}

	/** 
	 * Returns a vector of vectors that contains the same objects as the array.
	 * @param anArray  the double array to be converted
	 * @return the new vector of vectors; if <code>anArray</code> is
	 *				<code>null</code>, returns <code>null</code>
	 */
	protected static Vector convertToVector(Object[][] anArray) {
		if (anArray == null) {
			return null;
		}
		Vector v = new Vector(anArray.length);
		for (int i = 0; i < anArray.length; i++) {
			v.addElement(convertToVector(anArray[i]));
		}
		return v;
	}

	static class Vector<E> extends java.util.Vector<E> implements List<E> {
		/**
		 * The array buffer into which the components of the vector are
		 * stored. The capacity of the vector is the length of this array buffer,
		 * and is at least large enough to contain all the vector's elements.
		 *
		 * <p>Any array elements following the last element in the Vector are null.
		 *
		 * @serial
		 */
		protected List<E> elementData;

		/**
		 * The number of valid components in this {@code Vector} object.
		 * Components {@code elementData[0]} through
		 * {@code elementData[elementCount-1]} are the actual items.
		 *
		 * @serial
		 */
		//protected String elementCount;

		/**
		 * The amount by which the capacity of the vector is automatically
		 * incremented when its size becomes greater than its capacity.  If
		 * the capacity increment is less than or equal to zero, the capacity
		 * of the vector is doubled each time it needs to grow.
		 *
		 * @serial
		 */
		//protected int capacityIncrement;

		/** use serialVersionUID from JDK 1.0.2 for interoperability */
		//private static final long serialVersionUID = -2767605614048989439L;

		/**
		 * Constructs an empty vector with the specified initial capacity and
		 * capacity increment.
		 *
		 * @param   initialCapacity     the initial capacity of the vector
		 * @param   capacityIncrement   the amount by which the capacity is
		 *                              increased when the vector overflows
		 * @throws IllegalArgumentException if the specified initial capacity
		 *         is negative
		 */
		public Vector(int initialCapacity, int capacityIncrement) {
			if (initialCapacity < 0)
				throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
			this.elementData = new ArrayList<E>(initialCapacity);
			this.capacityIncrement = capacityIncrement;
		}

		/**
		 * Constructs an empty vector with the specified initial capacity and
		 * with its capacity increment equal to zero.
		 *
		 * @param   initialCapacity   the initial capacity of the vector
		 * @throws IllegalArgumentException if the specified initial capacity
		 *         is negative
		 */
		public Vector(int initialCapacity) {
			this(initialCapacity, 0);
		}

		/**
		 * Constructs an empty vector so that its internal data array
		 * has size {@code 10} and its standard capacity increment is
		 * zero.
		 */
		public Vector() {
			this(10);
		}

		/**
		 * Constructs a vector containing the elements of the specified
		 * collection, in the order they are returned by the collection's
		 * iterator.
		 *
		 * @param c the collection whose elements are to be placed into this
		 *       vector
		 * @throws NullPointerException if the specified collection is null
		 * @since   1.2
		 */
		public Vector(Collection<? extends E> c) {
			elementData = new ArrayList<E>(c);
			elementCount = size();
		}

		public Vector(List<E> c) {
			elementData = c;
			elementCount = size();
		}

		/**
		 * Copies the components of this vector into the specified array.
		 * The item at index {@code k} in this vector is copied into
		 * component {@code k} of {@code anArray}.
		 *
		 * @param  anArray the array into which the components get copied
		 * @throws NullPointerException if the given array is null
		 * @throws IndexOutOfBoundsException if the specified array is not
		 *         large enough to hold all the components of this vector
		 * @throws ArrayStoreException if a component of this vector is not of
		 *         a runtime type that can be stored in the specified array
		 * @see #toArray(Object[])
		 */
		@Override
		public synchronized void copyInto(Object[] anArray) {
			elementCount = size();
			System.arraycopy(elementData.toArray(), 0, anArray, 0, elementCount);
		}

		/**
		 * Trims the capacity of this vector to be the vector's current
		 * size. If the capacity of this vector is larger than its current
		 * size, then the capacity is changed to equal the size by replacing
		 * its internal data array, kept in the field {@code elementData},
		 * with a smaller one. An application can use this operation to
		 * minimize the storage of a vector.
		 */
		@Override
		public synchronized void trimToSize() {
		}

		/**
		 * Increases the capacity of this vector, if necessary, to ensure
		 * that it can hold at least the number of components specified by
		 * the minimum capacity argument.
		 *
		 * <p>If the current capacity of this vector is less than
		 * {@code minCapacity}, then its capacity is increased by replacing its
		 * internal data array, kept in the field {@code elementData}, with a
		 * larger one.  The size of the new data array will be the old size plus
		 * {@code capacityIncrement}, unless the value of
		 * {@code capacityIncrement} is less than or equal to zero, in which case
		 * the new capacity will be twice the old capacity; but if this new size
		 * is still smaller than {@code minCapacity}, then the new capacity will
		 * be {@code minCapacity}.
		 *
		 * @param minCapacity the desired minimum capacity
		 */
		@Override
		public synchronized void ensureCapacity(int minCapacity) {
			modCount++;
			ensureCapacityHelper(minCapacity);
		}

		/**
		 * This implements the unsynchronized semantics of ensureCapacity.
		 * Synchronized methods in this class can internally call this
		 * method for ensuring capacity without incurring the cost of an
		 * extra synchronization.
		 *
		 * @see #ensureCapacity(int)
		 */
		private void ensureCapacityHelper(int minCapacity) {
		}

		/**
		 * Sets the size of this vector. If the new size is greater than the
		 * current size, new {@code null} items are added to the end of
		 * the vector. If the new size is less than the current size, all
		 * components at index {@code newSize} and greater are discarded.
		 *
		 * @param  newSize   the new size of this vector
		 * @throws ArrayIndexOutOfBoundsException if the new size is negative
		 */
		@Override
		public synchronized void setSize(int newSize) {
			modCount++;
			elementCount = size();
			if (newSize > elementCount) {
				ensureCapacityHelper(newSize);
			} else {
				for (int i = newSize; i < elementCount; i++) {
					elementData.set(i, null);
				}
			}
			elementCount = newSize;
		}

		/**
		 * Returns the current capacity of this vector.
		 *
		 * @return  the current capacity (the length of its internal
		 *          data array, kept in the field {@code elementData}
		 *          of this vector)
		 */
		@Override
		public synchronized int capacity() {
			return elementData.size();
		}

		/**
		 * Returns the number of components in this vector.
		 *
		 * @return  the number of components in this vector
		 */
		@Override
		public synchronized int size() {
			return elementData.size();
		}

		/**
		 * Tests if this vector has no components.
		 *
		 * @return  {@code true} if and only if this vector has
		 *          no components, that is, its size is zero;
		 *          {@code false} otherwise.
		 */
		@Override
		public synchronized boolean isEmpty() {
			return elementData.isEmpty();
		}

		/**
		 * Returns an enumeration of the components of this vector. The
		 * returned {@code Enumeration} object will generate all items in
		 * this vector. The first item generated is the item at index {@code 0},
		 * then the item at index {@code 1}, and so on.
		 *
		 * @return  an enumeration of the components of this vector
		 * @see     Iterator
		 */
		@Override
		public Enumeration<E> elements() {
			synchronized (Vector.this) {
				return new Enumeration<E>() {
					Object[] elementData = Vector.this.elementData.toArray();
					int elementCount = elementData.length;
					int count = 0;

					@Override
					public boolean hasMoreElements() {
						return count < elementCount;
					}

					@Override
					public E nextElement() {
						synchronized (Vector.this) {
							if (count < elementCount) {
								return (E) elementData[count++];
							}
						}
						throw new NoSuchElementException("Vector Enumeration");
					}
				};
			}
		}

		@Override
		public Iterator<E> iterator() {
			Iterator<E> i = elementData.iterator();
			return i;
		}

		@Override public ListIterator<E> listIterator() {
			return elementData.listIterator();
		}

		/**
		 * Returns {@code true} if this vector contains the specified element.
		 * More formally, returns {@code true} if and only if this vector
		 * contains at least one element {@code e} such that
		 * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
		 *
		 * @param o element whose presence in this vector is to be tested
		 * @return {@code true} if this vector contains the specified element
		 */
		@Override
		public boolean contains(Object o) {
			return indexOf(o, 0) >= 0;
		}

		/**
		 * Returns the index of the first occurrence of the specified element
		 * in this vector, or -1 if this vector does not contain the element.
		 * More formally, returns the lowest index {@code i} such that
		 * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
		 * or -1 if there is no such index.
		 *
		 * @param o element to search for
		 * @return the index of the first occurrence of the specified element in
		 *         this vector, or -1 if this vector does not contain the element
		 */
		@Override
		public int indexOf(Object o) {
			return indexOf(o, 0);
		}

		/**
		 * Returns the index of the first occurrence of the specified element in
		 * this vector, searching forwards from {@code index}, or returns -1 if
		 * the element is not found.
		 * More formally, returns the lowest index {@code i} such that
		 * <tt>(i&nbsp;&gt;=&nbsp;index&nbsp;&amp;&amp;&nbsp;(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i))))</tt>,
		 * or -1 if there is no such index.
		 *
		 * @param o element to search for
		 * @param index index to start searching from
		 * @return the index of the first occurrence of the element in
		 *         this vector at position {@code index} or later in the vector;
		 *         {@code -1} if the element is not found.
		 * @throws IndexOutOfBoundsException if the specified index is negative
		 * @see     Object#equals(Object)
		 */
		@Override
		public synchronized int indexOf(Object o, int index) {
			elementCount = size();
			if (o == null) {
				for (int i = index; i < elementCount; i++)
					if (elementData.get(i) == null)
						return i;
			} else {
				for (int i = index; i < elementCount; i++)
					if (o.equals(elementData.get(i)))
						return i;
			}
			return -1;
		}

		/**
		 * Returns the index of the last occurrence of the specified element
		 * in this vector, or -1 if this vector does not contain the element.
		 * More formally, returns the highest index {@code i} such that
		 * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
		 * or -1 if there is no such index.
		 *
		 * @param o element to search for
		 * @return the index of the last occurrence of the specified element in
		 *         this vector, or -1 if this vector does not contain the element
		 */
		@Override
		public synchronized int lastIndexOf(Object o) {
			elementCount = size();
			return lastIndexOf(o, elementCount - 1);
		}

		/**
		 * Returns the index of the last occurrence of the specified element in
		 * this vector, searching backwards from {@code index}, or returns -1 if
		 * the element is not found.
		 * More formally, returns the highest index {@code i} such that
		 * <tt>(i&nbsp;&lt;=&nbsp;index&nbsp;&amp;&amp;&nbsp;(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i))))</tt>,
		 * or -1 if there is no such index.
		 *
		 * @param o element to search for
		 * @param index index to start searching backwards from
		 * @return the index of the last occurrence of the element at position
		 *         less than or equal to {@code index} in this vector;
		 *         -1 if the element is not found.
		 * @throws IndexOutOfBoundsException if the specified index is greater
		 *         than or equal to the current size of this vector
		 */
		@Override
		public synchronized int lastIndexOf(Object o, int index) {
			elementCount = size();
			if (index >= elementCount)
				throw new IndexOutOfBoundsException(index + " >= " + elementCount);

			if (o == null) {
				for (int i = index; i >= 0; i--)
					if (elementData.get(i) == null)
						return i;
			} else {
				for (int i = index; i >= 0; i--)
					if (o.equals(elementData.get(i)))
						return i;
			}
			return -1;
		}

		/**
		 * Returns the component at the specified index.
		 *
		 * <p>This method is identical in functionality to the {@link #get(int)}
		 * method (which is part of the {@link List} interface).
		 *
		 * @param      index   an index into this vector
		 * @return     the component at the specified index
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *	       ({@code index < 0 || index >= size()})
		 */
		@Override
		public synchronized E elementAt(int index) {
			elementCount = size();
			if (index >= elementCount) {
				throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
			}

			return (E) elementData.get(index);
		}

		/**
		 * Returns the first component (the item at index {@code 0}) of
		 * this vector.
		 *
		 * @return     the first component of this vector
		 * @throws NoSuchElementException if this vector has no components
		 */
		@Override
		public synchronized E firstElement() {
			elementCount = size();
			if (elementCount == 0) {
				throw new NoSuchElementException();
			}
			return (E) elementData.get(0);
		}

		/**
		 * Returns the last component of the vector.
		 *
		 * @return  the last component of the vector, i.e., the component at index
		 *          <code>size()&nbsp;-&nbsp;1</code>.
		 * @throws NoSuchElementException if this vector is empty
		 */
		@Override
		public synchronized E lastElement() {
			elementCount = size();
			if (elementCount == 0) {
				throw new NoSuchElementException();
			}
			return (E) elementData.get(elementCount - 1);
		}

		/**
		 * Sets the component at the specified {@code index} of this
		 * vector to be the specified object. The previous component at that
		 * position is discarded.
		 *
		 * <p>The index must be a value greater than or equal to {@code 0}
		 * and less than the current size of the vector.
		 *
		 * <p>This method is identical in functionality to the
		 * {@link #set(int, Object) set(int, E)}
		 * method (which is part of the {@link List} interface). Note that the
		 * {@code set} method reverses the order of the parameters, to more closely
		 * match array usage.  Note also that the {@code set} method returns the
		 * old value that was stored at the specified position.
		 *
		 * @param      obj     what the component is to be set to
		 * @param      index   the specified index
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *	       ({@code index < 0 || index >= size()})
		 */
		@Override
		public synchronized void setElementAt(E obj, int index) {
			elementCount = size();
			if (index >= elementCount) {
				throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
			}
			elementData.set(index, (E) obj);
		}

		/**
		 * Deletes the component at the specified index. Each component in
		 * this vector with an index greater or equal to the specified
		 * {@code index} is shifted downward to have an index one
		 * smaller than the value it had previously. The size of this vector
		 * is decreased by {@code 1}.
		 *
		 * <p>The index must be a value greater than or equal to {@code 0}
		 * and less than the current size of the vector. 
		 *
		 * <p>This method is identical in functionality to the {@link #remove(int)}
		 * method (which is part of the {@link List} interface).  Note that the
		 * {@code remove} method returns the old value that was stored at the
		 * specified position.
		 *
		 * @param      index   the index of the object to remove
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *	       ({@code index < 0 || index >= size()})
		 */
		@Override
		public synchronized void removeElementAt(int index) {
			modCount++;
			elementData.remove(index);
		}

		/**
		 * Inserts the specified object as a component in this vector at the
		 * specified {@code index}. Each component in this vector with
		 * an index greater or equal to the specified {@code index} is
		 * shifted upward to have an index one greater than the value it had
		 * previously.
		 *
		 * <p>The index must be a value greater than or equal to {@code 0}
		 * and less than or equal to the current size of the vector. (If the
		 * index is equal to the current size of the vector, the new element
		 * is appended to the Vector.)
		 *
		 * <p>This method is identical in functionality to the
		 * {@link #add(int, Object) add(int, E)}
		 * method (which is part of the {@link List} interface).  Note that the
		 * {@code add} method reverses the order of the parameters, to more closely
		 * match array usage.
		 *
		 * @param      obj     the component to insert
		 * @param      index   where to insert the new component
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *	       ({@code index < 0 || index > size()})
		 */
		@Override
		public synchronized void insertElementAt(E obj, int index) {
			modCount++;
			elementData.add(index, obj);
		}

		/**
		 * Adds the specified component to the end of this vector,
		 * increasing its size by one. The capacity of this vector is
		 * increased if its size becomes greater than its capacity.
		 *
		 * <p>This method is identical in functionality to the
		 * {@link #add(Object) add(E)}
		 * method (which is part of the {@link List} interface).
		 *
		 * @param   obj   the component to be added
		 */
		@Override
		public synchronized void addElement(E obj) {
			modCount++;
			elementData.add(obj);
		}

		/**
		 * Removes the first (lowest-indexed) occurrence of the argument
		 * from this vector. If the object is found in this vector, each
		 * component in the vector with an index greater or equal to the
		 * object's index is shifted downward to have an index one smaller
		 * than the value it had previously.
		 *
		 * <p>This method is identical in functionality to the
		 * {@link #remove(Object)} method (which is part of the
		 * {@link List} interface).
		 *
		 * @param   obj   the component to be removed
		 * @return  {@code true} if the argument was a component of this
		 *          vector; {@code false} otherwise.
		 */
		@Override
		public synchronized boolean removeElement(Object obj) {
			modCount++;
			int i = indexOf(obj);
			if (i >= 0) {
				removeElementAt(i);
				return true;
			}
			return false;
		}

		/**
		 * Removes all components from this vector and sets its size to zero.
		 *
		 * <p>This method is identical in functionality to the {@link #clear}
		 * method (which is part of the {@link List} interface).
		 */
		@Override
		public synchronized void removeAllElements() {
			modCount++;
			elementData.clear();
		}

		/**
		 * Returns a clone of this vector. The copy will contain a
		 * reference to a clone of the internal data array, not a reference
		 * to the original internal data array of this {@code Vector} object.
		 *
		 * @return  a clone of this vector
		 */
		@Override
		public synchronized Object clone() {
			try {
				Vector<E> v = (Vector<E>) super.clone();
				v.elementData = elementData.getClass().getConstructor(Collection.class).newInstance(elementData);
				v.modCount = 0;
				return v;
			} catch (Exception e) {
				// this shouldn't happen, since we are Cloneable
				throw new InternalError();
			}
		}

		/**
		 * Returns an array containing all of the elements in this Vector
		 * in the correct order.
		 *
		 * @since 1.2
		 */
		@Override
		public synchronized Object[] toArray() {
			return elementData.toArray();
		}

		/**
		 * Returns an array containing all of the elements in this Vector in the
		 * correct order; the runtime type of the returned array is that of the
		 * specified array.  If the Vector fits in the specified array, it is
		 * returned therein.  Otherwise, a new array is allocated with the runtime
		 * type of the specified array and the size of this Vector.
		 *
		 * <p>If the Vector fits in the specified array with room to spare
		 * (i.e., the array has more elements than the Vector),
		 * the element in the array immediately following the end of the
		 * Vector is set to null.  (This is useful in determining the length
		 * of the Vector <em>only</em> if the caller knows that the Vector
		 * does not contain any null elements.)
		 *
		 * @param a the array into which the elements of the Vector are to
		 *		be stored, if it is big enough; otherwise, a new array of the
		 * 		same runtime type is allocated for this purpose.
		 * @return an array containing the elements of the Vector
		 * @throws ArrayStoreException if the runtime type of a is not a supertype
		 * of the runtime type of every element in this Vector
		 * @throws NullPointerException if the given array is null
		 * @since 1.2
		 */
		@Override
		public synchronized <T> T[] toArray(T[] a) {
			return elementData.toArray(a);
		}

		// Positional Access Operations

		/**
		 * Returns the element at the specified position in this Vector.
		 *
		 * @param index index of the element to return
		 * @return object at the specified index
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *            ({@code index < 0 || index >= size()})
		 * @since 1.2
		 */
		@Override
		public synchronized E get(int index) {
			return elementData.get(index);
		}

		/**
		 * Replaces the element at the specified position in this Vector with the
		 * specified element.
		 *
		 * @param index index of the element to replace
		 * @param element element to be stored at the specified position
		 * @return the element previously at the specified position
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *	       ({@code index < 0 || index >= size()})
		 * @since 1.2
		 */
		@Override
		public synchronized E set(int index, E element) {
			modCount++;
			return elementData.set(index, element);
		}

		/**
		 * Appends the specified element to the end of this Vector.
		 *
		 * @param e element to be appended to this Vector
		 * @return {@code true} (as specified by {@link Collection#add})
		 * @since 1.2
		 */
		@Override
		public synchronized boolean add(E e) {
			modCount++;
			return elementData.add(e);
		}

		/**
		 * Removes the first occurrence of the specified element in this Vector
		 * If the Vector does not contain the element, it is unchanged.  More
		 * formally, removes the element with the lowest index i such that
		 * {@code (o==null ? get(i)==null : o.equals(get(i)))} (if such
		 * an element exists).
		 *
		 * @param o element to be removed from this Vector, if present
		 * @return true if the Vector contained the specified element
		 * @since 1.2
		 */
		@Override
		public boolean remove(Object o) {
			return removeElement(o);
		}

		/**
		 * Inserts the specified element at the specified position in this Vector.
		 * Shifts the element currently at that position (if any) and any
		 * subsequent elements to the right (adds one to their indices).
		 *
		 * @param index index at which the specified element is to be inserted
		 * @param element element to be inserted
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *         ({@code index < 0 || index > size()})
		 * @since 1.2
		 */
		@Override
		public void add(int index, E element) {
			insertElementAt(element, index);
		}

		/**
		 * Removes the element at the specified position in this Vector.
		 * Shifts any subsequent elements to the left (subtracts one from their
		 * indices).  Returns the element that was removed from the Vector.
		 *
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *         ({@code index < 0 || index >= size()})
		 * @param index the index of the element to be removed
		 * @return element that was removed
		 * @since 1.2
		 */
		@Override
		public synchronized E remove(int index) {
			modCount++;
			return elementData.remove(index);
		}

		/**
		 * Removes all of the elements from this Vector.  The Vector will
		 * be empty after this call returns (unless it throws an exception).
		 *
		 * @since 1.2
		 */
		@Override
		public void clear() {
			removeAllElements();
		}

		// Bulk Operations

		/**
		 * Returns true if this Vector contains all of the elements in the
		 * specified Collection.
		 *
		 * @param   c a collection whose elements will be tested for containment
		 *          in this Vector
		 * @return true if this Vector contains all of the elements in the
		 *	       specified collection
		 * @throws NullPointerException if the specified collection is null
		 */
		@Override
		public synchronized boolean containsAll(Collection<?> c) {
			return super.containsAll(c);
		}

		/**
		 * Appends all of the elements in the specified Collection to the end of
		 * this Vector, in the order that they are returned by the specified
		 * Collection's Iterator.  The behavior of this operation is undefined if
		 * the specified Collection is modified while the operation is in progress.
		 * (This implies that the behavior of this call is undefined if the
		 * specified Collection is this Vector, and this Vector is nonempty.)
		 *
		 * @param c elements to be inserted into this Vector
		 * @return {@code true} if this Vector changed as a result of the call
		 * @throws NullPointerException if the specified collection is null
		 * @since 1.2
		 */
		@Override
		public synchronized boolean addAll(Collection<? extends E> c) {
			modCount++;
			return elementData.addAll(c);
		}

		/**
		 * Removes from this Vector all of its elements that are contained in the
		 * specified Collection.
		 *
		 * @param c a collection of elements to be removed from the Vector
		 * @return true if this Vector changed as a result of the call
		 * @throws ClassCastException if the types of one or more elements
		 *         in this vector are incompatible with the specified
		 *         collection (optional)
		 * @throws NullPointerException if this vector contains one or more null
		 *         elements and the specified collection does not support null
		 *         elements (optional), or if the specified collection is null
		 * @since 1.2
		 */
		@Override
		public synchronized boolean removeAll(Collection<?> c) {
			modCount++;
			return elementData.removeAll(c);
		}

		/**
		 * Retains only the elements in this Vector that are contained in the
		 * specified Collection.  In other words, removes from this Vector all
		 * of its elements that are not contained in the specified Collection.
		 *
		 * @param c a collection of elements to be retained in this Vector
		 *          (all other elements are removed)
		 * @return true if this Vector changed as a result of the call
		 * @throws ClassCastException if the types of one or more elements
		 *         in this vector are incompatible with the specified
		 *         collection (optional)
		 * @throws NullPointerException if this vector contains one or more null
		 *         elements and the specified collection does not support null
		 *         elements (optional), or if the specified collection is null
		 * @since 1.2
		 */
		@Override
		public synchronized boolean retainAll(Collection<?> c) {
			modCount++;
			return elementData.retainAll(c);
		}

		/**
		 * Inserts all of the elements in the specified Collection into this
		 * Vector at the specified position.  Shifts the element currently at
		 * that position (if any) and any subsequent elements to the right
		 * (increases their indices).  The new elements will appear in the Vector
		 * in the order that they are returned by the specified Collection's
		 * iterator.
		 *
		 * @param index index at which to insert the first element from the
		 *              specified collection
		 * @param c elements to be inserted into this Vector
		 * @return {@code true} if this Vector changed as a result of the call
		 * @throws ArrayIndexOutOfBoundsException if the index is out of range
		 *         ({@code index < 0 || index > size()})
		 * @throws NullPointerException if the specified collection is null
		 * @since 1.2
		 */
		@Override
		public synchronized boolean addAll(int index, Collection<? extends E> c) {
			modCount++;
			return elementData.addAll(index, c);
		}

		/**
		 * Compares the specified Object with this Vector for equality.  Returns
		 * true if and only if the specified Object is also a List, both Lists
		 * have the same size, and all corresponding pairs of elements in the two
		 * Lists are <em>equal</em>.  (Two elements {@code e1} and
		 * {@code e2} are <em>equal</em> if {@code (e1==null ? e2==null :
		 * e1.equals(e2))}.)  In other words, two Lists are defined to be
		 * equal if they contain the same elements in the same order.
		 *
		 * @param o the Object to be compared for equality with this Vector
		 * @return true if the specified Object is equal to this Vector
		 */
		@Override
		public synchronized boolean equals(Object o) {
			return super.equals(o);
		}

		/**
		 * Returns the hash code value for this Vector.
		 */
		@Override
		public synchronized int hashCode() {
			return elementData.hashCode();
		}

		/**
		 * Returns a string representation of this Vector, containing
		 * the String representation of each element.
		 */
		@Override
		public synchronized String toString() {
			return super.toString();
		}

		/**
		 * Returns a view of the portion of this List between fromIndex,
		 * inclusive, and toIndex, exclusive.  (If fromIndex and toIndex are
		 * equal, the returned List is empty.)  The returned List is backed by this
		 * List, so changes in the returned List are reflected in this List, and
		 * vice-versa.  The returned List supports all of the optional List
		 * operations supported by this List.
		 *
		 * <p>This method eliminates the need for explicit range operations (of
		 * the sort that commonly exist for arrays).   Any operation that expects
		 * a List can be used as a range operation by operating on a subList view
		 * instead of a whole List.  For example, the following idiom
		 * removes a range of elements from a List:
		 * <pre>
		 *	    list.subList(from, to).clear();
		 * </pre>
		 * Similar idioms may be constructed for indexOf and lastIndexOf,
		 * and all of the algorithms in the Collections class can be applied to
		 * a subList.
		 *
		 * <p>The semantics of the List returned by this method become undefined if
		 * the backing list (i.e., this List) is <i>structurally modified</i> in
		 * any way other than via the returned List.  (Structural modifications are
		 * those that change the size of the List, or otherwise perturb it in such
		 * a fashion that iterations in progress may yield incorrect results.)
		 *
		 * @param fromIndex low endpoint (inclusive) of the subList
		 * @param toIndex high endpoint (exclusive) of the subList
		 * @return a view of the specified range within this List
		 * @throws IndexOutOfBoundsException if an endpoint index value is out of range
		 *         {@code (fromIndex < 0 || toIndex > size)}
		 * @throws IllegalArgumentException if the endpoint indices are out of order
		 *	       {@code (fromIndex > toIndex)}
		 */
		@Override
		public synchronized List<E> subList(int fromIndex, int toIndex) {
			return super.subList(fromIndex, toIndex);
		}

		/**
		 * Removes from this List all of the elements whose index is between
		 * fromIndex, inclusive and toIndex, exclusive.  Shifts any succeeding
		 * elements to the left (reduces their index).
		 * This call shortens the ArrayList by (toIndex - fromIndex) elements.  (If
		 * toIndex==fromIndex, this operation has no effect.)
		 *
		 * @param fromIndex index of first element to be removed
		 * @param toIndex index after last element to be removed
		 */
		@Override
		protected synchronized void removeRange(int fromIndex, int toIndex) {
			modCount++;
			int index = fromIndex;
			elementCount = size();
			if (index >= elementCount) {
				index = elementCount - 1;
			}
			while (index > fromIndex) {
				elementData.remove(index);
				index--;
			}
		}

		/**
		 * Save the state of the {@code Vector} instance to a stream (that
		 * is, serialize it).  This method is present merely for synchronization.
		 * It just calls the default writeObject method.
		 */
		private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
			s.defaultWriteObject();
		}

		@Override public ListIterator<E> listIterator(int index) {
			return elementData.listIterator(index);
		}
	}
}
