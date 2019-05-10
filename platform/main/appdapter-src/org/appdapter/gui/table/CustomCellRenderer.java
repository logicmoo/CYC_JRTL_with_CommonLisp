package org.appdapter.gui.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.tree.TreeCellRenderer;

import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.SmallObjectView;

public class CustomCellRenderer extends DefaultTableCellRenderer implements

ListCellRenderer, TableCellRenderer, TreeCellRenderer {

	protected Class columnClass;
	protected int columnNumber;
	Color fColor, bColor;
	boolean hasFocus;
	final JLabel label = this;
	private JComponent parentHolder;
	int render_col, render_row;
	private Object toStr;
	CellConversions listFromH;

	/**
	 * default constructor which sets border properties and opaque mode that
	 * means that label paints every pixel within its bounds.
	 * @param conv 
	 */
	public CustomCellRenderer(JTable table, int columnNum, Class<?> columnCl, Object toS, CellConversions conv) {
		super();
		this.myTable = table;
		//this.label = new JLabel();
		//add(label);
		setOpaque(false);
		columnClass = columnCl;
		columnNumber = columnNum;
		toStr = toS;
	}

	public TableColumn getTableColumn() {
		TableColumn tcol = myTable.getColumnModel().getColumn(columnNumber);
		return tcol;
	}

	protected javax.swing.JTable myTable;
	private boolean isText = true;

	public Class getColumnClass() {
		if (columnClass != null)
			return columnClass;
		return myTable.getColumnClass(columnNumber);
	}

	public TableCellEditor getEditor() {
		return new CustomCellEditor(myTable, columnNumber, columnClass, toStr, listFromH);
	}

	/**
	 * Return a component that has been configured to display the specified
	 * value.
	 * 
	 * @param list
	 *            The JList we're painting.
	 * @param value
	 *            The value returned by
	 *            <code>list.getModel().getElementAt(index)</code>.
	 * @param index
	 *            The cells index.
	 * @param isSelected
	 *            True if the specified cell was selected.
	 * @param cellHasFocus
	 *            True if the specified cell has the focus.
	 * @return label component configured to display cell for list
	 */
	@Override public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		try {
			return renderComponent(list, value, index, -1, isSelected, -1, list.getSelectionBackground(), list.getSelectionForeground());
		} catch (Throwable e) {
			SafeJTable.theLogger.warn("getListCellRendererComponent Exception", e);
		}

		return this;
	}

	@Override public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

		int width = table.getColumnModel().getColumn(column).getWidth();
		int height = table.getRowHeight(row);
		this.render_col = column;
		this.render_row = row;
		return renderComponent(table, value, row, column, isSelected, width, table.getSelectionBackground(), table.getSelectionForeground());

	}

	public String getTitle() {
		return "" + toStr;
	}

	/**
	 * This method is extension of <code>JLabel.paint(Graphics )</code>
	 * standard method to paint non standard selection for list control.
	 * 
	 * @param g
	 *            the specified Graphics window
	 */
	@Override public void paint(Graphics g) {
		try {

			if (true) {
				super.paint(g);
				return;
			}
			Icon icon = getIcon();

			// clear selection
			g.setColor(parentHolder.getBackground());
			g.fillRect(0, 0, getWidth(), getHeight());
			// paint cell
			g.setColor(bColor);
			int offset = 0;
			if (icon != null && getText() != null) {
				Insets ins = getInsets();
				offset = ins.left + icon.getIconWidth() + getIconTextGap() - 3;
			}
			g.fillRect(offset, 0, getWidth() - offset - 1, getHeight() - 1);
			// if cell has focus draw rectangle over selection and correct
			// text look like (adds font 3D effect)
			if (hasFocus) {
				g.draw3DRect(offset + 1, 1, getWidth() - offset - 2, getHeight() - 2, false);
				g.setColor(new Color(96, 96, 156));
				g.drawRect(offset, 0, getWidth() - offset - 1, getHeight() - 1);
				g.setColor(new Color(225, 225, 255));
				g.drawString(getText(), offset + 4, getHeight() - 3);
			}
			// sets default colors and call default paint method
			setForeground(fColor);
			setBackground(bColor);
			super.paint(g);
		} catch (Throwable e) {
			SafeJTable.theLogger.warn("Paint rubber stamp for list exception", e);
		}
	}

	private Component renderComponent(JComponent list, Object value, int row, int col, boolean isSelected, int width, Color selectionBackground, Color selectionForeground) {
		try {
			if (columnClass == Component.class) {
				Component comp;
				if (value instanceof Component)
					comp = (Component) value;
				else
					comp = new SmallObjectView(null, null, value, null, true, true, true, false);
				if (true)
					return comp;
				JPanel label = new JPanel();
				label.setOpaque(true);
				label.add(comp);
				return label;
			}

			if (value instanceof JComponent)
				return (JComponent) value;

			this.parentHolder = list;
			this.render_col = col;
			this.render_row = row;
			this.parentHolder = list;
			label.setComponentOrientation(list.getComponentOrientation());
			label.setEnabled(list.isEnabled());
			label.setFont(list.getFont());
			if (isText) {
				if (value != null) {
					value = Utility.getUniqueNamePretty(value);
				} else {
					value = "(" + Utility.getShortClassName(columnClass) + ")null";
				}
			}
			setValue(value);
			//ListData ld = (ListData) value;
			//Icon icon = ld.getIcon(); 
			//if (icon != null)
			//label.setIcon(icon);
			bColor = list.getBackground();
			fColor = list.getForeground();
			if (isSelected) {
				hasFocus = isSelected;
				fColor = Color.blue;
			}
			hasFocus = isSelected;
			label.setForeground(fColor);
			label.setBackground(bColor);

		} catch (Throwable e) {
			SafeJTable.theLogger.warn("getListCellRendererComponent Exception", e);
		}

		return this;
	}

	@Override
	public void setValue(Object value) {
		//String str = getTextName(value, render_row, render_col);
		super.setValue(value);
		//label.setText(str);
	}

	@Override public Component getTreeCellRendererComponent(JTree table, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
		return renderComponent(table, value, row, -1, selected, -1, table.getForeground(), table.getBackground());
	}
}