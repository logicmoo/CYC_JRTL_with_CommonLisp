package com.netbreeze.swing;

import javax.swing.JPopupMenu;

import org.logicmoo.bb.BeansContext;

/**
 * A Popup menu for a bean. The valid actions are
 * fetched using the beans context.
 */
public class BeanPopupMenu extends JPopupMenu{
  BeanMenuController controller;

  public BeanPopupMenu(Object bean) {
    this(SwingEnvironment.getBeansContext(), bean);
  }

  public BeanPopupMenu(BeansContext context, Object bean) {
    controller = new BeanMenuController(context, bean, this);
  }

}