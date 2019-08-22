package com.netbreeze.swing.editors;

import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.AbstractCollection;

public class AbstractCollectionBeanInfo extends SimpleBeanInfo {
  @Override
public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(AbstractCollection.class, CollectionCustomizer.class);
  }
}