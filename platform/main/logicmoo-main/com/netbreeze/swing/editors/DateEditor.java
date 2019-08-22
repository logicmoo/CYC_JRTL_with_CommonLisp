

package com.netbreeze.swing.editors;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditorSupport;
import java.util.Date;

import javax.swing.JLabel;

import com.netbreeze.swing.DateField;
import com.netbreeze.util.Utility;

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