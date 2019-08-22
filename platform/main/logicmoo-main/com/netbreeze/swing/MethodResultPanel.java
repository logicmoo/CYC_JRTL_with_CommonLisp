package com.netbreeze.swing;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.log4j.Category;
import org.logicmoo.bb.BeansContext;

import com.netbreeze.util.Utility;

/**
 * A panel showing the output of a method execution.
 * Used by MethodsPanel.
 *
 * @author Henrik Kniberg
 */
class MethodResultPanel extends JPanel {
  static Category cat = Category.getInstance(MethodResultPanel.class);

  JLabel label;
  SmallBeanView value = null;
  BeansContext context;
  boolean isVoid = false;

  public MethodResultPanel(BeansContext context) {
    this.context = context;
    label = new JLabel("Return value:  ");
    //value = new PropertyValueControl(false);
    setLayout(new BorderLayout());
    add("West", label);
    //add("Center", value);
  }

  public MethodResultPanel() {
    this(SwingEnvironment.getBeansContext());
  }

  /**
   * Designates the type of return value
   */
  public void setResultType(Class type) {
    if (type == Void.TYPE) {
      label.setText("(no return value)");
      isVoid = true;
    } else {
      String name = Utility.getShortClassName(type);
      label.setText("Return value (" + name + "):  ");
      //value.setFixedType(type);
      isVoid = false;
    }
    invalidate();
    validate();
  }

  /**
   * Sets the actual return value to be displayed.
   */
  public void setResultValue(Object object) {
    try {
      if (!(isVoid && object == null)) {
        if (value != null) {
          remove(value);
        }
        value = new SmallBeanView(context, object, true, true, true);

        add("Center", value);
        invalidate();
        validate();
      }
    } catch (Exception err) {
      cat.error("An error occurred", err);
    }
  }
}
