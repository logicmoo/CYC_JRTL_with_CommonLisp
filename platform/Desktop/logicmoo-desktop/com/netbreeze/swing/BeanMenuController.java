package com.netbreeze.swing;

import javax.swing.*;

import org.logicmoo.bb.BeansContext;
import org.logicmoo.bb.BeansContextListener;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * The controller class for a bean menu (JMenu or JPopupMenu), showing the list
 * of available actions for a given bean. <p>
 *
 * The list of available actions is fetched from the
 * given BeansContext. <p>
 *
 * If the bean or context is null the menu will be empty.
 *
 * @author Henrik Kniberg
 */
class BeanMenuController implements BeansContextListener {
  BeansContext context;

  Object bean;

  JPopupMenu popup = null;
  JMenu menu = null;

  public BeanMenuController(BeansContext context, Object bean, JPopupMenu popup) {
    this.context = context;
    if (context != null) {
      context.addListener(this);
    }
    this.bean = bean;
    this.popup = popup;

    if (bean != null) {
      if (context == null) {
        popup.setLabel("" + bean);
      } else {
        popup.setLabel(context.getBeanName(bean));
      }
      initMenu();
    }
  }

  public BeanMenuController(BeansContext context, Object bean, JMenu menu) {
    this.context = context;
    if (context != null) {
      context.addListener(this);
    }

    this.bean = bean;
    this.menu = menu;

    if (bean != null) {
      if (context == null) {
        menu.setText("" + bean);
      } else {
        menu.setText(context.getBeanName(bean));
      }
      initMenu();
    }
  }

  void updateMenu() {
    if (popup != null)
      popup.removeAll();
    else
      menu.removeAll();
    initMenu();
  }

  private void initMenu() {
    if (context != null) {
      Collection actions = context.getActions(bean);
      Iterator it = actions.iterator();
      while(it.hasNext()) {
        Action action = (Action) it.next();
        addAction(action);
      }
    }
  }

  void addAction(Action a) {
    if (popup != null) {
      popup.add(a);
    } else {
      menu.add(a);
    }
  }

/*  void removeAction(Action a) {
    if (popup != null) {
      popup.remove(a);
    } else {
      menu.remove(a);
    }
  }
*/

  public void beanAdded(String name, Object obj) {
    if (obj == bean) {
      updateMenu();
    }
  }

  public void beanRemoved(String named, Object obj) {
    if (obj == bean) {
      updateMenu();
    }
  }
}
