

package com.netbreeze.swing;
import java.util.*;

import org.logicmoo.bb.BeansContext;
import org.logicmoo.bb.BeansContextListener;

class EmptyBeansContext implements BeansContext{
  /**
   * Adds a new bean, if it wasn't already there
   *
   * @returns true if the bean was added, false if the bean was already there
   */
  public boolean addBean(Object bean) {
    return false;
  }

  /**
   * Removes a bean, if it is there
   *
   * @returns true if the bean was removed, false if that bean wasn't in this context
   */
  public boolean removeBean(Object bean) {
    return false;
  }

  public Collection getBeansOfType(Class type) {
    return new Vector();
  }

  public boolean containsBean(Object bean) {
    return false;
  }

  public void showBeanDetails(Object bean) {
  }

  public void addListener(BeansContextListener o) {
  }

  public void removeListener(BeansContextListener o) {
  }

  public Collection getActions(Object bean) {
    return new Vector();
  }

  public Object findBean(String name) {
    return null;
  }

  public String getBeanName(Object bean) {
    return "" + bean;
  }

  public void showError(String msg, Throwable err) {
    new ErrorDialog(msg, err).show();
  }

@Override
public boolean addObject(String named, Object bean) {
	return false;
}
}