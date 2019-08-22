package com.netbreeze.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.ToolTipManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.apache.log4j.Category;

import com.netbreeze.util.ClassFinder;
import com.netbreeze.util.Utility;

/**
 * A JavaBean-compatible GUI component consisting of list with name of the classes
 * provided in constructor and label component containing package name for
 * selected in list component class. List cells are rendered with pictures
 * corresponds with class type.
 *
 * @author      Marcin Slowik & Henrik Kniberg
 */
public class ClassSelectionList extends JPanel {
    static Category cat = Category.getInstance(ClassSelectionList.class);

    public static final String ICON_CLASS = "ClassImage.gif";
    public static final String ICON_ABSTRACT_CLASS = "AbstractClassImage.gif";
    public static final String ICON_INTERFACE = "InterfaceImage.gif";
    public static final String ICON_PACKAGE = "PackageImage.gif";

    public static final String PROP_SELECTED_CLASS = "selectedClass";

    private JList list;
    private JLabel packageInfo;

    /**
     * Editable property
     */
    private boolean includeInterfaces = true;

    /**
     * Editable property
     */
    private boolean includeAbstractClasses = true;

    /**
     * JavaBean property change support object.
     */
    private PropertyChangeSupport propertySupport;
    /**
     * List selection model.
     */
    private ListSelectionModel selectionModel;

    /**
     * List model.
     */
    private ClassListModel model;

    /**
     * Name of package which all classes must be member of
     */
    private String packageName = null;

    /**
     * Name of class which all classes must be ancestor of
     */
    private Class ancestor = Object.class;

    /**
     * Class selected by marking cell on the list.
     */
    private Class selectedClass = null;
    /**
     * By default on the list is visible 15 rows.
     */
    private int ListVisibleRowCount = 15;
    /**
     * By default list is in single line selection mode.
     */
    private int ListSelectionMode = ListSelectionModel.SINGLE_SELECTION;


    /**
     * Causes the contents of the list to be reloaded.
     * Called automatically whenever the ancestor or package is changed
     */
    public void refreshClassList() throws IOException {
      model.loadValues();
    }

    public ClassSelectionList(String packageName, Class ancestor) {
      this.packageName = packageName;
      this.ancestor = ancestor;
        // initialize new property change support object
        propertySupport = new PropertyChangeSupport ( this );

        // initialize GUI components
        initComponents();

        // another settigs for GUI components
        setComponents();

        // sets border specific settings
        TitledBorder border = (TitledBorder) getBorder();
        try {
            Font listFont = list.getFont();
            border.setTitleFont(listFont.deriveFont((float)(listFont.getSize() - 0.5)));
        } catch (Throwable e) {
        }
        border.setTitleColor(Color.black);
    }

    public ClassSelectionList() {
      this("", Object.class);
    }

    public void setTitle(String title) {
      TitledBorder border = (TitledBorder) getBorder();
      border.setTitle(title);
    }

    public String getTitle() {
      TitledBorder border = (TitledBorder) getBorder();
      return border.getTitle();
    }

    /**
     * @see getPackageName()
     */
    public void setPackageName(String packageName) {
      this.packageName = packageName;
      model.setRefreshNeeded();
    }

    /**
     * The name of the package to which all shown classes
     * must belong.
     */
    public String getPackageName() {
      return packageName;
    }

    /**
     * @see getAncestor()
     */
    public void setAncestor(Class ancestor) {
      this.ancestor = ancestor;
      model.setRefreshNeeded();
    }

    /**
     * The class to which all shown classes must be ancestor
     */
    public Class getAncestor() {
      return ancestor;
    }

    /**
     * Initialize panels controls.
     */
    private void initComponents() {
        // set border layout for this panel control
        setLayout(new BorderLayout());
        // create scroll pane to enable list to scroll
        JScrollPane scrollList = new JScrollPane();
        scrollList.setAutoscrolls(true);
        // create model for list
        model = new ClassListModel();
        // create new list control and override getToolTipText method to display
        // tooltip containing info about class or interface
        list = new JList(model) {
            @Override
			public String getToolTipText(java.awt.event.MouseEvent ev) {
                if (ev == null) return null;
                // gets collection index from position of cursor on the screen
                int index = list.locationToIndex(new Point(ev.getX(), ev.getY()));
                if (index > -1)
                    return getClassDefString(index);
                else
                    return null;
            }
            /*public Point getToolTipLocation(java.awt.event.MouseEvent ev) {
                return (new Point(0, ev.getY()));
            }*/
        };
        // register list for tooltip management by shared Tooltip Manager
        ToolTipManager.sharedInstance().registerComponent(list);
        // set new cell renderer for list control which manages appearance of list
        list.setCellRenderer(new ClassListRenderer());
        // create control for displaying info about package name for selected class
        packageInfo = new JLabel();
        scrollList.setViewportView(list);
        // place scroll pane and package info control into panel
        add(scrollList, BorderLayout.CENTER);
        add(packageInfo, BorderLayout.NORTH);
        // update default selection model for list control
        selectionModel = list.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionHandler());
    }

    /**
     * Set controls properties.
     */
    private void setComponents() {
        // set displaying list - double buffered
        list.setDoubleBuffered(true);
        // set visible row count
        list.setVisibleRowCount(ListVisibleRowCount);
        // set selection mode for the list
        list.setSelectionMode(ListSelectionMode);
        // clear package info text
        packageInfo.setText(" ");
        try {
          // set package info image
          packageInfo.setIcon(new ImageIcon(getClass().getResource(ICON_PACKAGE)));
        } catch (Throwable e) {
          cat.warn("SET COMPONENTS EXCEPTION - set icon for package", e);
        }
        // set font for packageinfo label the same as list font
        packageInfo.setFont(list.getFont());
        // set black color for infopackage label
        packageInfo.setForeground(java.awt.Color.black);
        // create border around control
        setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder()));
    }

    /**
     * Add a PropertyChangeListener to the listener list.
     * @param l The listener to add.
     */
    @Override
	public void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
        propertySupport.addPropertyChangeListener (l);
    }

    /**
     * Removes a PropertyChangeListener from the listener list.
     * @param l The listener to remove.
     */
    @Override
	public void removePropertyChangeListener(java.beans.PropertyChangeListener l) {
        propertySupport.removePropertyChangeListener (l);
    }

    /**
     * Getter for property selectedClass.
     * @return Value of property selectedClass.
     */
    public Class getSelectedClass() {
        return selectedClass;
    }

    /**
     * Setter for property selectedClass.
     * @param selectedClass New value of property selectedClass.
     */
    public void setSelectedClass(Class selectedClass) {
        Class oldSelectedClass = this.selectedClass;
        if (!Utility.isEqual(oldSelectedClass, selectedClass)) {
            this.selectedClass = selectedClass;
            try {
                packageInfo.setText(getPackageName(selectedClass));
            } catch (Throwable e) {
              cat.warn("==== SET SELECTED CLASS EXCEPTION - set package info text !", e);
              packageInfo.setText("");
            }
        }

        propertySupport.firePropertyChange (PROP_SELECTED_CLASS, oldSelectedClass, selectedClass);
    }

    /**
     * get class info with super class name and all implemented interfaces name
     * @param index class index in collection classes in list data model
     * @result class definition string
     */
    private String getClassDefString(int index) {
        String result = null;
        try {
            // get class from lista data
            ListData ld = (ListData) model.getElementAt(index);
            Class _class = ld.getData();
            // show info about specificity of given class
            if (Modifier.isInterface(_class.getModifiers()))
                result = "interface ";
            else
                result = "class ";
            // show given class name without package info
            result = result + getClassName(_class);
            // get superclass for given class
            Class superClass = _class.getSuperclass();
            // if class extends Object, info about class specialization is not displayed on tooltip
            if (superClass != null && !superClass.getName().equalsIgnoreCase("java.lang.Object"))
                result = result + " extends " + getClassName(superClass);
            // display info about interfaces implemented by class
            Class[] interfaces = _class.getInterfaces();
            for (int i=0; i<interfaces.length; i++) {
                if (i == 0) result = result + " implements";
                result = result + " " + getClassName(interfaces[i]) + ",";
                if (i == interfaces.length - 1) result = result.substring(0, result.length() - 1);
            }
        } catch (Throwable e) {
          cat.warn("GET CLASS DEFINITION STRING EXCEPTION !!!", e);
        } finally {
        }
        return result;
    }
    /**
     * get class name without package info
     * @param _class Class which name is searched
     * @return class name
     */
    private String getClassName(Class _class) {
        return Utility.getShortClassName(_class);
    }
    /**
     * get package/path name for given class
     * @param _class Class for which path name is needed
     * @return package/path name for given class
     */
    private String getPackageName(Class _class) {
        String packageName = "";
        try {
          packageName = _class.getPackage().getName();
        } catch (Exception e) {
          packageName = _class.getName();
          int lastDotPos = packageName.lastIndexOf('.');
          if (lastDotPos > -1)
            packageName = packageName.substring(0, lastDotPos);
        }

        return packageName;
    }

    /**
     * If this value is greater than zero it defines the width of every cell
     * in the list. Otherwise cell widths are computed by applying
     * <code>getPreferredSize()</code> to the cellRenderer component for each list element.
     * @param width the width for all cells in this list
     */
    public void setListFixedCellWidth(int width) {
        list.setFixedCellWidth(width);
    }
    /**
     * get list selection mode.
     * @return List selection mode.
     * @see javax.swing.JList#getSelectionMode(int )
     */
    public int getListSelectionMode() {
        return ListSelectionMode;
    }
    /**
     * set list selection mode
     * @param mode an int specifying the type of selections that are permissible
     * @see javax.swing.JList#setSelectionMode(int )
     */
    public void setListSelectionMode(int mode) {
        if (mode != ListSelectionMode) {
            ListSelectionMode = mode;
            list.setSelectionMode(ListSelectionMode);
        }
    }
    /**
     * get list visible row count
     * @see javax.swing.JList#getVisibleRowCount()
     */
    public int getListVisibleRowCount() {
        return ListVisibleRowCount;
    }
    /**
     * set list visible row count
     * @param rowcount an int specifying the preferred number of
     *                         visible rows
     * @see javax.swing.JList#setVisibleRowCount(int )
     */
    public void setListVisibleRowCount(int rowcount) {
        if (rowcount != ListVisibleRowCount) {
            ListVisibleRowCount = rowcount;
            list.setVisibleRowCount(ListVisibleRowCount);
        }
    }
    /**
     * get element (class) with index <code>index</code> from collection and
     * mark it as selected.
     * @param index Index of class in the collection.
     */
    private void checkControls(int index) {
        try {
            ListData ld = (ListData) model.getElementAt(index);
            setSelectedClass(ld.getData());
        } catch (Exception e) {
          cat.warn("CheckControl Exception", e);
          setSelectedClass(null);
        }
    }

    /**
     * Class containing info about list data.
     */
    class ListData implements Comparable {
        /**
         * Holds value of property icon.
         */
        private Icon icon;
        /**
         * Holds value of property data.
         */
        private Class data;
        /**
         * Default constructor.
         */
        public ListData(Icon icon, Class data) {
            this.icon = icon;
            this.data = data;
        }

        @Override
		public int compareTo(Object o) {
          ListData listData = (ListData) o;
          Class c = listData.getData();
          String thisClass = Utility.getShortClassName(data);
          String thatClass = Utility.getShortClassName(c);
          int result = thisClass.compareTo(thatClass);
          return result;
        }

        /**
         * Getter for property icon.
         * @return Value of property icon.
         */
        public Icon getIcon() {
            return icon;
        }
        /**
         * Getter for property data.
         * @return Value of property data.
         */
        public Class getData() {
            return data;
        }
        /**
         * get string representation of list data - name of the class
         * @return string representation of class.
         */
        @Override
		public String toString() {
            return getClassName(data);
        }
    }

    /**
     *  Class used as renderer for list. It uses JLabel component as "rubber stamp" to
     *  paint the cells in the list.
     */
    class ClassListRenderer extends JLabel implements ListCellRenderer {

        Color fColor, bColor;
        boolean hasFocus;

        /**
         *  default constructor which sets border properties and opaque mode that
         *  means that label paints every pixel within its bounds.
         */
        public ClassListRenderer() {
            super();
            setOpaque(false);
        }
        /**
         *  Return a component that has been configured to display the specified value.
         *  @param list The JList we're painting.
         *  @param value The value returned by <code>list.getModel().getElementAt(index)</code>.
         *  @param index The cells index.
         *  @param isSelected True if the specified cell was selected.
         *  @param cellHasFocus True if the specified cell has the focus.
         *  @return label component configured to display cell for list
         */
        @Override
		public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
          try {
            setComponentOrientation(list.getComponentOrientation());
            setEnabled(list.isEnabled());
            setFont(list.getFont());
            setText(value.toString());
            ListData ld = (ListData) value;
            Icon icon = ld.getIcon();
            if (icon != null)
              setIcon(icon);
            bColor = (isSelected ? list.getSelectionBackground() : list.getBackground());
            fColor = (isSelected ? list.getSelectionForeground() : list.getForeground());
            hasFocus = cellHasFocus;
          } catch (Throwable e) {
            cat.warn("getListCellRendererComponent Exception", e);
          }

          return this;
        }
        /**
         * This method is extension of <code>JLabel.paint(Graphics )</code>
         * standard method to paint non standard selection for list control.
         * @param g the specified Graphics window
         */
        @Override
		public void paint(Graphics g) {
            Icon icon = getIcon();

          try {
            // clear selection
            g.setColor(list.getBackground());
            g.fillRect(0,0,getWidth(),getHeight());
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
                g.setColor(new Color(225,225,255));
                g.drawString(getText(),offset + 4, getHeight() - 3);
            }
            // sets default colors and call default paint method
            setForeground(fColor);
            setBackground(bColor);
            super.paint(g);
          } catch (Throwable e) {
            cat.warn("Paint rubber stamp for list exception", e);
          }
        }
    }

    /**
     *  Class defining selection listener for list box. This listener watches
     *  for changes in the list's selection and reports them to the list box.
     */
    class ListSelectionHandler implements ListSelectionListener {
        /**
         *  Called whenever the value of the selection in the list changes.
         *  @param e The event that characterizes the change.
         */
        @Override
		public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel lsm = (ListSelectionModel)e.getSource();

            if (e.getValueIsAdjusting() == false) {
                if (lsm.isSelectionEmpty())
                    checkControls(-1);
                else {
                    int minIndex = lsm.getMinSelectionIndex();
                    int maxIndex = lsm.getMaxSelectionIndex();
                    for (int i = minIndex; i <= maxIndex; i++)
                        if (lsm.isSelectedIndex(i))
                            checkControls(i);
                }
            }
        }
    }
    /**
     *  The model for list box containing info about given classes.
     */
    class ClassListModel extends AbstractListModel {

        private boolean refreshNeeded = true;

        /**
         *  List of values on the model list.
         *  Initialized when needed.
         */
        java.util.List values = null;
        /**
         *  Default constructor that initialize <code>DataList</code> objects
         *  on the basis of class infos obtained by java-reflection.
         */
        public ClassListModel() {
        }

        public java.util.List getValues() {
          if (values == null || refreshNeeded) {
            loadValues();
            refreshNeeded = false;
          }
          return values;
        }

        /**
         * Tells this model that a refresh is needed as soon as possible.
         * This will be done whenever any of the display methods are called.
         */
        public void setRefreshNeeded() {
          refreshNeeded = true;
        }

        /**
         * Reset model collection.
         */
        public synchronized void loadValues() {
          cat.debug("refresh");

          int oldSize = 0;
          if (values != null) {
            oldSize = values.size();
          }

          // find the classes
          try {
            Set classes = ClassFinder.getClasses(packageName, ancestor);
            values = new LinkedList();
            Iterator iter = classes.iterator();
            while (iter.hasNext()) {
              Class _class = (Class) iter.next();
              int mod = _class.getModifiers();
              try {
                if (Modifier.isInterface(mod))
                  values.add(new ListData(new ImageIcon(getClass().getResource(ICON_INTERFACE)), _class));
                else if (Modifier.isAbstract(mod))
                  values.add(new ListData(new ImageIcon(getClass().getResource(ICON_ABSTRACT_CLASS)), _class));
                else
                  values.add(new ListData(new ImageIcon(getClass().getResource(ICON_CLASS)), _class));
              } catch (NullPointerException npe) {
                cat.warn("An error occurred", npe);
                values.add(new ListData((ImageIcon)null, _class));
              }
            }
            Collections.sort(values);
          } catch (IOException err) {
            new ErrorDialog("An error occurred while getting the list of classes", err).show();
            values = new LinkedList();
          }
          fireContentsChanged(this, 0, oldSize);

        }

        /**
         * Adds the specified component to the end of this list.
         * @param   obj   the component to be added.
         * @see Vector#addElement(Object)
         */
        public void addElement(Object obj) {
          java.util.List values = getValues();
          int index = values.size();
          values.add(obj);
          fireIntervalAdded(this, index, index);
        }
        /**
         * Returns the component at the specified index.
         * @param index an index into this list.
         * @see javax.swing.DefaultListModel#getElementAt(int )
         */
        @Override
		public Object getElementAt(int index) {
            return getValues().get(index);
        }
        /**
         * Returns the number of components in this list.
         * @return the number of components in this list.
         * @see Vector#size()
         */
        @Override
		public int getSize() {
            return getValues().size();
        }
    }

//===== Module test program =======================

  public static void main(String[] args) {
    try {
      JFrame frame = new JFrame("Test");
      ClassSelectionList list = new ClassSelectionList();
      list.setAncestor(Comparable.class);
      //list.setPackageName("com.netbreeze");
      frame.getContentPane().add(list);
      frame.pack();
      frame.show();
    } catch (Throwable err) {
      err.printStackTrace();
    }
  }

}
