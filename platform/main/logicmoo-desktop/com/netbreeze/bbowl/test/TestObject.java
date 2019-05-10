

package com.netbreeze.bbowl.test;

import java.beans.*;
import java.awt.*;

/**
* A general test-bean with some typical properties and events.
*/
public class TestObject {
  private String name = "Unnamed";
  private int value = 0;
  private Integer value2 = new Integer(10);
  private Button button = null;
  private PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

  private static int staticValue = 12;

  public TestObject() {
  }

  public static void setStaticValue(int i) {
    staticValue = i;
  }

  public static int getStaticValue() {
    return staticValue;
  }

  public void addPropertyChangeListener(PropertyChangeListener p) {
    propSupport.addPropertyChangeListener(p);
  }

  public void removePropertyChangeListener(PropertyChangeListener p) {
    propSupport.removePropertyChangeListener(p);
  }

  public void setName(String name) {
    this.name = name;
    propSupport.firePropertyChange("name", null, name);
  }

  public String getName() {
    return name;
  }


  public void setValue(int value) {
    this.value = value;
    propSupport.firePropertyChange("value", null, new Integer(value));
  }

  public int getValue() {
    return value;
  }

  public void bzz(Integer value2) {
    this.value2 = value2;
    propSupport.firePropertyChange("value2", null, value2);
  }



  public Integer getValue2() {
    return value2;
  }

  public void setButton(Button button) {
    this.button = button;
    propSupport.firePropertyChange("button", null, button);
  }

  public Button getButton() {
    return button;
  }

  @Override
public String toString() {
    return name + " (" + hashCode() + ")";
  }
}
