package com.netbreeze.swing.editors;

import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * A BeanInfo for java.lang.Class. This one provides a Customizer
 * GUI class which the same as LargeBeanView, but adds tabs
 * for static methods and constructors as well.
*/
public class ClassBeanInfo extends SimpleBeanInfo {
  @Override
public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Class.class, ClassCustomizer.class);
  }
}