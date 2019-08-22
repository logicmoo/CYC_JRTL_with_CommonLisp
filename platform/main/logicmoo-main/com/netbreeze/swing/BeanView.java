

package com.netbreeze.swing;
import javax.swing.JPanel;

/**
 * A GUI component used to render a bean in a user interface.
 * The standard implementations are SmallBeanView (an icon-like implementation)
 * and LargeBeanView (a complete window with all the details about the bean).
 */
abstract public class BeanView extends JPanel {
  private Object bean;

  public BeanView() {
  }

  public BeanView(Object bean) {
    this.bean = bean;
  }

  public Object getBean() {
    return bean;
  }

  public void setBean(Object newBean) {
    Object oldBean = bean;
    if (oldBean != newBean) {
      bean = newBean;
      beanChanged(oldBean, newBean);
    }
  }

  /**
   * Called whenever the bean is switched. Caused
   * the GUI to update to render the new bean instead.
   */
  abstract protected void beanChanged(Object oldBean, Object newBean);
}