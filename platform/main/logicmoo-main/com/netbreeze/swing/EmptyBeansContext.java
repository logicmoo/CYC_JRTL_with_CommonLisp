

package com.netbreeze.swing;
import java.util.Collection;
import java.util.Vector;

import org.logicmoo.bb.BeansContext;
import org.logicmoo.bb.BeansContextListener;

class EmptyBeansContext implements BeansContext{
  /**
   * Adds a new bean, if it wasn't already there
   *
   * @returns true if the bean was added, false if the bean was already there
   */
  @Override
public boolean addBean(Object bean) {
    return false;
  }

  /**
   * Removes a bean, if it is there
   *
   * @returns true if the bean was removed, false if that bean wasn't in this context
   */
  @Override
public boolean removeBean(Object bean) {
    return false;
  }

  @Override
public Collection getBeansOfType(Class type) {
    return new Vector();
  }

  @Override
public boolean containsBean(Object bean) {
    return false;
  }

  @Override
public void showBeanDetails(Object bean) {
  }

  @Override
public void addListener(BeansContextListener o) {
  }

  @Override
public void removeListener(BeansContextListener o) {
  }

  @Override
public Collection getActions(Object bean) {
    return new Vector();
  }

  @Override
public Object findBean(String name) {
    return null;
  }

  @Override
public String getBeanName(Object bean) {
    return "" + bean;
  }

  @Override
public void showError(String msg, Throwable err) {
    new ErrorDialog(msg, err).show();
  }

@Override
public boolean addObject(String named, Object bean) {
	return false;
}
}