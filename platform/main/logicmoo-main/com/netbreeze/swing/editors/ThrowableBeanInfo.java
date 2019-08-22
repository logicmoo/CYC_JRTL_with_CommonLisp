package com.netbreeze.swing.editors;

import java.beans.BeanDescriptor;
import java.beans.SimpleBeanInfo;

public class ThrowableBeanInfo extends SimpleBeanInfo {
  @Override
public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Throwable.class, ThrowableCustomizer.class);
  }
}