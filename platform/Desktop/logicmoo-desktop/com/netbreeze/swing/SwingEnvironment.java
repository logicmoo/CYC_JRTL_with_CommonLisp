package com.netbreeze.swing;

import org.logicmoo.bb.BeansContext;

/**
 * Contains all global stuff
 */
public class SwingEnvironment {
  private static BeansContext beansContext = null;

  /**
   * Returns the global beansContext, or null if none
   * has been set
   */
  public static BeansContext getBeansContext() {
    return beansContext;
  }

  /**
   * Sets the global beans context
   */
  public static void setBeansContext(BeansContext newValue) {
    beansContext = newValue;
  }
}