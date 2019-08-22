package com.netbreeze.swing;

import javax.swing.JMenu;

import org.logicmoo.bb.BeansContext;

/**
 * A menu showing the available actions for a bean.
 * The valid menu actions are fetched from the beans context
 *
 * @author Henrik Kniberg
 */
public class BeanMenu extends JMenu{
  BeanMenuController controller;

  public BeanMenu(Object bean) {
    this(SwingEnvironment.getBeansContext(), bean);
  }
  public BeanMenu(BeansContext context, Object bean) {
    controller = new BeanMenuController(context, bean, this);
  }
}