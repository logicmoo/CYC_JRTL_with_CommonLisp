

package com.netbreeze.swing;

import javax.swing.*;
import java.beans.*;
import java.util.*;
import java.awt.*;

import org.apache.log4j.*;
import org.armedbear.lisp.Main;
import org.logicmoo.bb.BeansContext;

public class PropertiesPanel extends JPanel {
  static Category cat = Category.getInstance(PropertiesPanel.class);

  BeansContext context = new EmptyBeansContext();
  Object bean = null;

  private PropertyComparator propertyComparator = new PropertyComparator();

  // private LessString lessString = new LessString();

  public PropertiesPanel(BeansContext context, Object bean) {
    if (context != null)
      this.context = context;
    setBean(bean);
  }

  public PropertiesPanel(Object bean) {
    this(null, bean);
  }

  public void setBean(Object bean) {
	  boolean wasNoDebug = Main.isNoDebug();
	  try {

		  Main.setNoDebug(true);
	  setBean0(bean);
	  } finally {
		  Main.setNoDebug(wasNoDebug);
	  }
  }

  public void setBean0(Object bean) {
    this.bean = bean;
    removeAll();
    //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    //setLayout(new VerticalLayout(VerticalLayout.LEFT, true));
    setLayout(new BorderLayout());

    if (bean != null) {
      try {
        PropertySheet sheet = new PropertySheet();

        BeanInfo info = Introspector.getBeanInfo(bean.getClass());

        java.util.List props = Arrays.asList(info.getPropertyDescriptors());
        Collections.sort(props, propertyComparator);

        Iterator it = props.iterator();

        while(it.hasNext()) {
          PropertyDescriptor p = (PropertyDescriptor) it.next();
          sheet.add(
            p.getDisplayName() + ":",

            new PropertyValueControl(context, bean, p)
          );
        }
        add("Center", sheet);
      } catch (Exception err) {
        cat.error("An error occurred", err);
      }
    }
  }

  /*private JComponent createRow(PropertyDescriptor descriptor) {
    JPanel panel = new JPanel();
    BorderLayout layout = new BorderLayout(10, 5);
    panel.setLayout(layout);
    panel.add("West", new JLabel(descriptor.getDisplayName() + ":"));
    panel.add("Center", new PropertyValueControl(context, bean, descriptor));
    return panel;
  } */

 /* class MyTableModel extends AbstractTableModel {
    public int getRowCount() {
    }
    public int getColumnCount() {
    }
    public Object getValueAt(int row, int column) {
    }
  }*/

  class PropertyComparator implements Comparator {
    public int compare(Object first, Object second) {
      PropertyDescriptor a = (PropertyDescriptor) first;
      PropertyDescriptor b = (PropertyDescriptor) second;
      String nameA = a.getName();
      String nameB = b.getName();
      return nameA.compareTo(nameB);
    }

    public boolean equals(Object o) {
      return (o instanceof PropertyComparator);
    }
  }
}
