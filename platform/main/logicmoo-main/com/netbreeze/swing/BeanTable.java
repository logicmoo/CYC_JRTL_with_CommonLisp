

package com.netbreeze.swing;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Category;
import org.logicmoo.bb.BeansContext;

public class BeanTable extends JTable {
  private static Category cat = Category.getInstance(BeanTable.class);

  List beans;
  BeansContext context;
  BeanInfo beanInfo;
  PropertyDescriptor[] props;
  Class beanClass;
  Model model;

  public BeanTable(BeansContext context, List beans, Class beanClass, String[] propNames) throws Exception {
    beanInfo = Introspector.getBeanInfo(beanClass);

    if (beans == null) {
      this.beans = new LinkedList();
    } else {
      this.beans = beans;
    }

    this.beanClass = beanClass;

    if (context == null) {
      this.context = BeanUtils.getDefaultContext();
    } else {
      this.context = context;
    }

    if (propNames == null || propNames.length == 0) {
      props = beanInfo.getPropertyDescriptors();
    } else {
      LinkedList list = new LinkedList();
      Map map = createPropertyMap();
      for (int i = 0; i < propNames.length; ++i) {
        PropertyDescriptor p = (PropertyDescriptor) map.get(propNames[i]);
        if (p != null) {
          list.add(p);
        }
      }
      props = (PropertyDescriptor[]) list.toArray();
    }
    model = new Model();
    setModel(model);
  }

  public void addBean(Object bean) {
    if (bean == null)
      return;

    if (beanClass.isInstance(bean)) {
      beans.add(bean);

      //@optimize
      model.fireTableDataChanged();

    } else {
      throw new IllegalArgumentException("BeanTable.addBean(): this table only accepts beans of type " + beanClass + ", not " + bean.getClass());
    }
  }

  public void removeBean(Object bean) {
    if (bean == null)
      return;

    beans.remove(bean);

    //@optimize
    model.fireTableDataChanged();
  }

  private Map createPropertyMap() {
    Map map = new HashMap();
    PropertyDescriptor[] array = beanInfo.getPropertyDescriptors();
    for (int i = 0; i < array.length; ++i) {
      map.put(array[i].getName(), array[i]);
    }
    return map;
  }

  private Object getPropertyValue(Object bean, PropertyDescriptor prop) throws Exception {
    Method method = prop.getReadMethod();
    return method.invoke(bean, new Object[0]);
  }

  private void setPropertyValue(Object bean, PropertyDescriptor prop, Object value) throws Exception {
    Method method = prop.getWriteMethod();
    method.invoke(bean, new Object[] {value});
  }

  public Object getSelectedBean() {
    int row = getSelectedRow();
    if (row == -1) {
      return null;
    } else {
      return beans.get(row);
    }
  }

  class Model extends AbstractTableModel {
    @Override
	public int getRowCount() {
      return beans.size();
    }

    @Override
	public int getColumnCount() {
      return props.length;
    }

    @Override
	public String getColumnName(int columnIndex) {
      return props[columnIndex].getDisplayName();
    }

    /*public Class getColumnClass(int columnIndex) {
      Class c = props[columnIndex].getPropertyType();

      //@temp

      System.out.println("c = " + c);
      if (c.equals(boolean.class))
        return Boolean.class;
      if (c.equals(int.class))
        return Integer.class;
      else return c;

    } */

    @Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
      return false;
      //return props[columnIndex].getWriteMethod() != null;
    }

    public Object getBeanAt(int rowIndex) {
      return beans.get(rowIndex);
    }

    @Override
	public Object getValueAt(int rowIndex, int columnIndex) {
      Object bean = getBeanAt(rowIndex);
      PropertyDescriptor prop = props[columnIndex];
      try {
        return getPropertyValue(bean, prop);
      } catch (Throwable err) {
        cat.error("An error occured in BeanTable.getValueAt(...)", err);
        return "?";
      }
    }
    /*
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
      Object bean = getBeanAt(rowIndex);
      PropertyDescriptor prop = props[columnIndex];
      try {
        setPropertyValue(bean, prop, aValue);
      } catch (Throwable err) {
        cat.error("An error occured in BeanTable.setValueAt(...)", err);
      }
    } */
  }
}
