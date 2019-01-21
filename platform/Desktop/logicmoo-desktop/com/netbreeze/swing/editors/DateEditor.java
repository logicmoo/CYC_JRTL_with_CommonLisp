

package com.netbreeze.swing.editors;
import com.netbreeze.swing.*;
import java.beans.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import com.netbreeze.util.*;

public class DateEditor extends PropertyEditorSupport implements PropertyChangeListener {
  DateField field = null;

  public DateEditor() {
  }

  /*public void setAsText(String text) throws IllegalArgumentException {
    setValue(Integer.valueOf(text));
  } */

  @Override
public void setValue(Object newValue) {
    if (!Utility.isEqual(newValue, getValue())) {
      Date date;
      try {
        date = (Date) newValue;
        super.setValue(date);
        if (field != null) {
          field.setDate(date);
        }
      } catch (Exception err) {
        date = new Date();
        try {
          field.setDate(date);
        } catch (Exception err2) {
        }
        super.setValue(date);
      }
    }
  }

  @Override
public Component getCustomEditor() {
    if (field == null) {
      try {
        field = new DateField();
        field.setDate((Date) getValue());
        field.addPropertyChangeListener(this);
        setValue(field.getDate());
      } catch (Exception err) {
        field = null;
        setValue(new Date());
        return new JLabel("Error! " + err.toString());
      }
    }
    return field;
  }

  @Override
public boolean supportsCustomEditor() {
    return true;
  }

  @Override
public void propertyChange(PropertyChangeEvent evt) {
    super.setValue(evt.getNewValue());
  }
}