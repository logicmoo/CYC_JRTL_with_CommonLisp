package com.netbreeze.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

/**
 * A button that represents a javax.swing.Action.
 * It will show the right icon and/or name, and when pressed
 * it will execute the action
 *
 * @author Henrik Kniberg
 */
public class ActionButton extends JButton {
  Action action;
  PropertyAdapter propertyAdapter = new PropertyAdapter();
  ActionAdapter actionAdapter = new ActionAdapter();

  public ActionButton() {
    this(null);
  }

  public ActionButton(Action action) {
    addActionListener(actionAdapter);
    setAction(action);
  }

  @Override
public void setAction(Action newAction) {
    Action oldAction = action;
    if (newAction != oldAction) {
      if (oldAction != null) {
        oldAction.removePropertyChangeListener(propertyAdapter);
      }
      if (newAction != null) {
        newAction.addPropertyChangeListener(propertyAdapter);
      }
      action = newAction;
      updateView();
    }
  }

  @Override
public Action getAction() {
    return action;
  }

  void updateView() {
    if (action == null) {
      setIcon(null);
      setText("");
      setEnabled(false);
      setToolTipText("");
    } else {
      setIcon((Icon) action.getValue(Action.SMALL_ICON));
      setText((String) action.getValue(Action.NAME));
      setEnabled(action.isEnabled());
      setToolTipText((String) action.getValue(Action.SHORT_DESCRIPTION));
    }
  }

  class PropertyAdapter implements PropertyChangeListener {
    @Override
	public void propertyChange(PropertyChangeEvent evt) {
      if (action != null)
        updateView();
    }
  }

  class ActionAdapter implements ActionListener {
    @Override
	public void actionPerformed(ActionEvent evt) {
      if (action != null)
        action.actionPerformed(evt);
    }
  }
}