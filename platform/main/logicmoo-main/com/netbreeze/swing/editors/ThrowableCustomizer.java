package com.netbreeze.swing.editors;

import com.netbreeze.swing.ErrorPanel;
import com.netbreeze.swing.LargeBeanView;

public class ThrowableCustomizer extends LargeBeanView {
  @Override
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