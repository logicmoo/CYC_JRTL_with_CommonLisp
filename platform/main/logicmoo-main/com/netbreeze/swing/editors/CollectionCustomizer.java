package com.netbreeze.swing.editors;

import java.util.Collection;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.netbreeze.swing.CollectionContentsPanel;
import com.netbreeze.swing.ErrorPanel;
import com.netbreeze.swing.LargeBeanView;

public class CollectionCustomizer extends LargeBeanView implements ChangeListener {
  CollectionContentsPanel contents;

  @Override
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

  @Override
public void stateChanged(ChangeEvent evt) {
    if (tabs.getSelectedIndex() == 0) {
      if (contents != null) {
        contents.reloadContents();
      }
    }
  }
}