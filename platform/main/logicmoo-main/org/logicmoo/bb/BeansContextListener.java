

package org.logicmoo.bb;

public interface BeansContextListener {
  public void beanAdded(String named, Object obj);

  public void beanRemoved(String named, Object obj);
}