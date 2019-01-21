

package com.netbreeze.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.beans.*;
import com.netbreeze.util.*;
import javax.swing.event.*;

/**
  A GUI widget that lets you select a class.
*/
public class ClassSelectionField extends JPanel {
  JTextField text = new JTextField(20);
  Class selectedClass = null;
  PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

  public ClassSelectionField() {
    setLayout(new BorderLayout());
    add(text);

    text.getDocument().addDocumentListener(
      new DocumentListener() {
        @Override
		public void insertUpdate(DocumentEvent e) {
          checkControls();
        }

        @Override
		public void removeUpdate(DocumentEvent e) {
          checkControls();
        }

        @Override
		public void changedUpdate(DocumentEvent e) {
          checkControls();
        }
      }
    );
  }

  @Override
public void addPropertyChangeListener(PropertyChangeListener p) {
    propSupport.addPropertyChangeListener(p);
  }

  @Override
public void removePropertyChangeListener(PropertyChangeListener p) {
    propSupport.removePropertyChangeListener(p);
  }

  public Class getSelectedClass() {
    return selectedClass;
  }

  public void setSelectedClass(Class newValue) {
    setSelectedClass(newValue, true);
  }

  private void setSelectedClass(Class newValue, boolean updateTextField) {
    Class oldValue = selectedClass;
    if (!Utility.isEqual(oldValue, newValue)) {
      selectedClass = newValue;

      //Make sure the contents of the text field corresponds
      //to the selected class
      if (updateTextField) {
        if (selectedClass == null) {
          text.setText("");
        } else {
          text.setText(selectedClass.getName());
        }
      }

      propSupport.firePropertyChange("selectedClass", oldValue, newValue);
    }
  }

  private void checkControls() {
    try {
      setSelectedClass(Class.forName(text.getText()), false);
    } catch (Exception err) {
      setSelectedClass(null);
    }
  }
}
