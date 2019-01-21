package com.netbreeze.swing;

import javax.swing.*;
import java.util.*;
import java.lang.reflect.*;
import java.beans.*;

/**
 * A GUI component that shows all the methods for a given object,
 * and provides ways of executing these methods.
 *
 * @author Henrik Kniberg
 */
public class MethodList extends JList {
  private Model model;
  private Object bean;

  public MethodList(Object bean) throws Exception {
    super();
    this.bean = bean;
    this.model = new Model();
    setModel(model);
  }

  public Method getSelectedMethod() {
    return model.getMethodAt(getSelectedIndex());
  }

  class Model extends AbstractListModel {
    List methods;

    public Model() throws Exception {
      BeanInfo info = Introspector.getBeanInfo(bean.getClass());

      MethodDescriptor[] descriptors;
      descriptors = info.getMethodDescriptors();
      methods = new LinkedList();
      for (int i = 0; i < descriptors.length; ++i) {
        MethodDescriptor descriptor = descriptors[i];
        methods.add(descriptor.getMethod());
      }

      Collections.sort(methods, new MethodComparator());
    }

    public Method getMethodAt(int index) {
      return (Method) methods.get(index);
    }

    @Override
	public Object getElementAt(int index) {
      return getMethodAt(index).getName();
    }

    @Override
	public int getSize() {
      return methods.size();
    }
  }

  class MethodComparator implements Comparator {
    @Override
	public int compare(Object first, Object second) {
      Method a = (Method) first;
      Method b = (Method) second;
      String nameA = a.getName();
      String nameB = b.getName();
      return nameA.compareTo(nameB);
    }

    @Override
	public boolean equals(Object o) {
      return (o instanceof MethodComparator);
    }
  }

}