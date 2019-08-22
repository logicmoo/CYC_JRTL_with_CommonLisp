package com.netbreeze.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.apache.log4j.Category;
import org.logicmoo.bb.BeansContext;

/**
 * A GUI component showing all the methods of a given bean and controls
 * for providing parameters, executing the methods, and manipulating the result
 *
 * @author Henrik Kniberg
 */
public class MethodsPanel extends JPanel implements ActionListener, ListSelectionListener {
  private static Category cat = Category.getInstance(MethodsPanel.class);

  BeansContext context;
  Object bean;

  MethodList methodList;
  MethodParametersPanel paramPanel;
  JButton executeButton;
  JSplitPane splitter;
  MethodResultPanel resultPanel;


  public MethodsPanel(Object bean) throws Exception {
    this(SwingEnvironment.getBeansContext(), bean);
  }

  public MethodsPanel(BeansContext context, Object bean) throws Exception {
    this.context = context;
    this.bean = bean;
    initGUI();
  }

  @Override
public void valueChanged(ListSelectionEvent e) {
    Method current = methodList.getSelectedMethod();

    paramPanel.setMethod(current);
    resultPanel.setVisible(current != null);
    if (current != null)
      resultPanel.setResultType(current.getReturnType());
  }

  /**
   * Executes the given method now
   */
  private void executeMethod(Method method) throws Exception {
    if (method != null) {
      Object[] params = paramPanel.getValues();
      cat.debug("Invoking " + method + " on " + bean + " with args " + params);
      boolean wasAccessable = method.isAccessible();
      if(!wasAccessable) {
    	  method.setAccessible(true);
      }
      try {
          Object returnValue = method.invoke(bean, params);
          resultPanel.setResultValue(returnValue);
      } finally {
      	if(!wasAccessable) {
      		method.setAccessible(false);
      	}
      }
    }
  }

  private void initGUI() throws Exception {
    paramPanel = new MethodParametersPanel();
    methodList = new MethodList(bean);
    resultPanel = new MethodResultPanel(context);

    executeButton = new JButton("Execute method");
    executeButton.addActionListener(this);

    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new BorderLayout(10, 10));
    bottomPanel.add("West", executeButton);
    bottomPanel.add("Center", resultPanel);

    JScrollPane scroller = new JScrollPane(methodList);
    scroller.setHorizontalScrollBarPolicy(
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    splitter = new JSplitPane(
          JSplitPane.HORIZONTAL_SPLIT,
          true,
          scroller,
          paramPanel);


    setLayout(new BorderLayout());
    add("Center", splitter);
    add("South", bottomPanel);
    methodList.addListSelectionListener(this);
  }

  @Override
public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == executeButton) {
      Method method = methodList.getSelectedMethod();
      if (method != null) {
        try {
          executeMethod(method);
        } catch (InvocationTargetException err) {
          if (context == null) {
            new ErrorDialog(err.getTargetException()).show();
          } else {
            context.showError(null, err.getTargetException());
          }
        } catch (Throwable err) {
          if (context == null) {
            new ErrorDialog(err).show();
          } else {
            context.showError(null, err);
          }
        }
      }
    }
  }
}


