package com.netbreeze.swing.editors;

import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.Collection;

public class CollectionBeanInfo extends SimpleBeanInfo {
  @Override
public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Collection.class, CollectionCustomizer.class);
  }
}