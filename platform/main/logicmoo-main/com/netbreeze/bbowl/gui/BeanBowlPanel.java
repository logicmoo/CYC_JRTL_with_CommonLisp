
package com.netbreeze.bbowl.gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.logicmoo.bb.BeanBowl;

import com.netbreeze.swing.BeanUtils;

public class BeanBowlPanel extends JPanel implements ActionListener, DocumentListener {
  Class currentClass = null;

  JDesktopPane desk;
  JSplitPane split;
  BeanList list;
  JButton classBrowserButton;
  JTextField classField;
  BeanBowlContext context;

  public BeanBowlPanel(BeanBowlContext context) {
    this.context = context;
    BeanUtils.registerEditors();
    BeanUtils.setBeanInfoSearchPath();
    initGUI();
  }

  public JDesktopPane getDesk() {
    return desk;
  }

  public BeanBowl getBowl() {
    return context.getBowl();
  }

  @Override
public void actionPerformed(ActionEvent evt){
    if (evt.getSource() == classField || evt.getSource() == classBrowserButton) {
      openClassBrowser();
    }
  }

  public BeanList getBeanList() {
    return list;
  }

  private synchronized void openClassBrowser() {
    if (currentClass != null) {
      try {
        context.showBeanDetails(currentClass);
      } catch (Throwable err) {
        context.showError(null, err);
      }
    }
  }

  private void initGUI() {
    desk = new JDesktopPane();
    list = new BeanList(context);

    classBrowserButton = new JButton("Examine...");
    classBrowserButton.setToolTipText("Opens a new window that lets you examine classes and create new object instances");
    classBrowserButton.addActionListener(this);
    classBrowserButton.setEnabled(false);
    //classBrowserButton.setActionCommand(COMMAND_CREATE_BEAN);

    classField = new JTextField(10);
    classField.addActionListener(this);
    classField.getDocument().addDocumentListener(this);

    JPanel classPanel = new JPanel();
    classPanel.setBorder(new TitledBorder("Class browser"));
    classPanel.setLayout(new BorderLayout());
    classPanel.add("North", new JLabel("Full class name:"));
    classPanel.add("Center", classField);
    classPanel.add("East", classBrowserButton);

    JPanel leftPanel = new JPanel();
    leftPanel.setLayout(new BorderLayout());
    //beansPanel.setBorder(new TitledBorder("Object browser"));

    //list.setTitle("Object browser");
    list.setBorder(new TitledBorder("Object browser"));


  /*  JPanel listPanel = new JPanel();
    listPanel.setLayout(new BorderLayout());
    listPanel.add("North", tempPanel);
    listPanel.add("Center", list);*/

    split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, leftPanel, desk);
    split.setOneTouchExpandable(true);

    setLayout(new BorderLayout());
    add("Center", split);

    leftPanel.add("North", classPanel);
    leftPanel.add("Center", list);
  }

  private void classFieldChanged() {
    try {
      currentClass = Class.forName(classField.getText());
    } catch (Exception err) {
      currentClass = null;
    }
    classBrowserButton.setEnabled(currentClass != null);
  }

  @Override
public void insertUpdate(DocumentEvent e) {
    classFieldChanged();
  }

  @Override
public void removeUpdate(DocumentEvent e) {
    classFieldChanged();
  }

  @Override
public void changedUpdate(DocumentEvent e) {
    classFieldChanged();
  }


}
