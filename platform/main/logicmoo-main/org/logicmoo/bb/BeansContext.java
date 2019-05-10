

package org.logicmoo.bb;
import java.util.Collection;

/**
 * Represents any kind of bean-container environment.
 * You can set a global BeansContext using SwingEnvironment.setBeansContext(...)
 *
 * @author Henrik Kniberg
 */
public interface BeansContext {
  /**
   * Returns all beans of the given type (including subclasses)
   */
  public Collection getBeansOfType(Class type);

  public Object findBean(String name);

  public String getBeanName(Object bean);

  /**
   * Checks if the context contains the given bean
   */
  public boolean containsBean(Object bean);

  /**
   * Opens up a GUI to show the details of the given bean
   */
  public void showBeanDetails(Object bean) throws Exception;

  /**
   * Adds a BeansContextListener to this context. The listener will
   * find out when beans are added or removed.
   */
  public void addListener(BeansContextListener o);

  /**
   * Adds a BeansContextListener to this context. The listener will
   * find out when beans are added or removed.
   */
  public void removeListener(BeansContextListener o);

  /**
   * Returns all actions that can be carried out on the given bean
   */
  public Collection getActions(Object bean);

  /**
   * Adds a new bean, if it wasn't already there
   *
   * @returns true if the bean was added, false if the bean was already there
   */
  public boolean addBean(Object bean);

  /**
   * Adds a new bean, if it wasn't already there
   *
   * @returns true if the bean was added, false if the bean was already there
   */
  public boolean addObject(String named, Object bean);

  /**
   * Removes a bean, if it is there
   *
   * @returns true if the bean was removed, false if that bean wasn't in this context
   */
  public boolean removeBean(Object bean);

  /**
   * Displays the given error message somehow
   */
  public void showError(String msg, Throwable err);
}
