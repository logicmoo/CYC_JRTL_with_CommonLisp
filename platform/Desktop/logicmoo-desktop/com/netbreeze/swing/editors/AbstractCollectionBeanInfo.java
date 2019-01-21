package com.netbreeze.swing.editors;

import java.beans.*;
import java.util.*;

public class AbstractCollectionBeanInfo extends SimpleBeanInfo {
  @Override
public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(AbstractCollection.class, CollectionCustomizer.class);
  }
}