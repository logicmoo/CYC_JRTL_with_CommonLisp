

package com.netbreeze.swing.editors;

import java.beans.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
* JavaBeans PropertyEditor implementation for boolean values.
* Basically a checkbox...
*/
public class BooleanEditor extends PropertyEditorSupport  {
  GUI gui = null;

  public BooleanEditor() {
  }

  @Override
public void setAsText(String text) throws IllegalArgumentException {
    setValue(Boolean.valueOf(text));
  }

  @Override
public String getAsText() {
    return "" + getValue();
  }

  @Override
public void setValue(Object value) {
    if (value instanceof Boolean) {
      super.setValue(value);
      if (gui != null)
        gui.setState(getBooleanValue());
    }
  }

  public boolean getBooleanValue() {
    try {
    	 Object o = getValue();
    	 if(o==null) return false;
      return ((Boolean)o).booleanValue();
    } catch (Exception err) {
      return false;
    }
  }

  @Override
public Component getCustomEditor() {
    if (gui == null) {
      gui = new GUI();
    }
    return gui;
  }

  @Override
public boolean supportsCustomEditor() {
    return true;
  }

  class GUI extends JCheckBox implements ChangeListener {
    public GUI() {
      super();
      setText(getAsText());
      getModel().setSelected(getBooleanValue());
      addChangeListener(this);
    }

    @Override
	public void stateChanged(ChangeEvent e) {
      boolean state = getState();
      if (state != getBooleanValue())
        setValue(new Boolean(getState()));
    }

    public void setState(boolean b) {
      setText(getAsText());
      if (b != getState());
        getModel().setSelected(b);
    }

    public boolean getState() {
      return getModel().isSelected();
    }

  }
}

