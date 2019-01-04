package com.netbreeze.swing.editors;

import com.netbreeze.swing.*;
import java.awt.*;
import javax.swing.*;
import com.netbreeze.util.Utility;
import java.beans.*;

public class ThrowableCustomizer extends LargeBeanView {
  protected void initGUI() {
    super.initGUI();

    String name;
    Throwable bean = (Throwable) getBean();
    if (bean instanceof Error) {
      name = "Error";
    } else if (bean instanceof RuntimeException) {
      name = "RuntimeException";
    } else if (bean instanceof Exception) {
      name = "Exception";
    } else {
      name = "Throwable";
    }

    try {
      ErrorPanel errorPanel = new ErrorPanel(bean);
      tabs.insertTab(name, null, errorPanel, null, 0);
    } catch (Exception err) {
      tabs.insertTab(name, null, new ErrorPanel("Could not show error info for " + bean, err), null, 0);
    }
  }
}