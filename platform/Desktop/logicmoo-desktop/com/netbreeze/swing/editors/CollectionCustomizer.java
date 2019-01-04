package com.netbreeze.swing.editors;

import com.netbreeze.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class CollectionCustomizer extends LargeBeanView implements ChangeListener {
  CollectionContentsPanel contents;

  protected void initGUI() {
    super.initGUI();
    try {
      contents = new CollectionContentsPanel((Collection) getBean());
      tabs.insertTab("Contents", null, contents, null, 0);
      tabs.addChangeListener(this);
    } catch (Exception err) {
      tabs.insertTab("Contents", null, new ErrorPanel("The contents of " + getBean() + " could not be shown", err), null, 0);
    }
  }

  public void stateChanged(ChangeEvent evt) {
    if (tabs.getSelectedIndex() == 0) {
      if (contents != null) {
        contents.reloadContents();
      }
    }
  }
}