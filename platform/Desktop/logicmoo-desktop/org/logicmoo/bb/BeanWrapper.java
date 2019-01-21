

package org.logicmoo.bb;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.armedbear.lisp.Lisp;

/**
 * A wrapper for beans used in the bean bowl system.
 * It holds an object, a name, and info about whether it is selected or not.
 * The "name" and "selected" properties are bound and constrained, i.e.
 * you can listen to changes using addPropertyChangeListener, and you can
 * also prevent changes in some cases if you use addVetoableChangeListener.
 *
 * @author Henrik Kniberg
 */
public class BeanWrapper implements java.io.Serializable {
//==== Transient instance variables =============
  transient PropertyChangeSupport propSupport = new PropertyChangeSupport(this);
  transient VetoableChangeSupport vetoSupport = new VetoableChangeSupport(this);

//==== Serializable instance variables ===============
  Object object;
  String name = null;
  boolean selected = false;

//==== Constructors ==================================

  /**
   * Creates a new BeanWrapper for the given object
   * and assigns it a default name.
   */
  public BeanWrapper(Object object) {
    this.object = object;
    this.name = getDefaultName(object);
  }

  /**
   * Creates a new BeanWrapper for the given object, with the given name.
   */
  public BeanWrapper(String name, Object object) {
    this.object = object;
    this.name = name;
  }

//==== Event listener registration =============

  /**
   * PropertyChangeListeners will find out when the name or
   * selection state changes.
   */
  public void addPropertyChangeListener(PropertyChangeListener p) {
    checkTransient();
    propSupport.addPropertyChangeListener(p);
  }

  /**
   * PropertyChangeListeners will find out when the name or
   * selection state changes.
   */
  public void removePropertyChangeListener(PropertyChangeListener p) {
    checkTransient();
    propSupport.removePropertyChangeListener(p);
  }

  /**
   * VetoableChangeListeners will find out when the name
   * or selection state is about to change, and can prevent such
   * changes if desired.
   */
  public void addVetoableChangeListener(VetoableChangeListener v) {
    checkTransient();
    vetoSupport.addVetoableChangeListener(v);
  }

  /**
   * VetoableChangeListeners will find out when the name
   * or selection state is about to change, and can prevent such
   * changes if desired.
   */
  public void removeVetoableChangeListener(VetoableChangeListener v) {
    checkTransient();
    vetoSupport.removeVetoableChangeListener(v);
  }

//===== Property getters and setters ========================

  /**
   * Changes the selection state.
   *
   * @throws PropertyVetoException if someone refused to allow selection state change
   */
  public void setSelected(boolean newSelected) throws PropertyVetoException {
    if (newSelected != selected) {
      checkTransient();
      boolean oldSelected = selected;
      vetoSupport.fireVetoableChange("selected", new Boolean(oldSelected), new Boolean(newSelected));
      this.selected = newSelected;
      propSupport.firePropertyChange("selected", new Boolean(oldSelected), new Boolean(newSelected));
    }
  }

  /**
   * True if this bean is selected
   */
  public boolean isSelected() {
    return selected;
  }

  /**
   * Returns the object that this bean wrapper represents
   */
  public Object getObject() {
    return object;
  }

  /**
   * Returns the name of this bean
   */
  public String getName() {
    return name;
  }

  /**
   * Changes the name of this bean. The name should never be null.
   *
   * @throws PropertyVetoException if someone refused to allow the name to change
   */
  public void setName(String newName) throws PropertyVetoException {
    if (!(newName.equals(name))) {
      checkTransient();
      String oldName = name;
      vetoSupport.fireVetoableChange("name", oldName, newName);
      this.name = newName;
      propSupport.firePropertyChange("name", oldName, newName);
    }
  }

  /**
   * Gets a BeanInfo object for this bean, using the Introspector class
   */
  public BeanInfo getBeanInfo() throws IntrospectionException {
    return Introspector.getBeanInfo(getObject().getClass(), Introspector.USE_ALL_BEANINFO);
  }

  /**
   * Returns an Icon for this bean, determined using BeanInfo.
   * If no icon was found a default icon will be returned.
   */
  public Icon getIcon() {
    Icon icon;
    try {
      BeanInfo info = getBeanInfo();
      Image image;
      image = info.getIcon(BeanInfo.ICON_COLOR_16x16);
      if (image == null)
        image = info.getIcon(BeanInfo.ICON_MONO_16x16);

      if (image == null)
        icon = new UnknownIcon();
      else
        icon = new ImageIcon(image);
    } catch (Exception err) {
      icon = new UnknownIcon();
    }
    return icon;
  }

  /**
   * Returns the name of this bean
   */
  @Override
public String toString() {
    return getName();
  }


//========= Utility methods =================

  public static String getDefaultName(Object object) {
    Class type = object.getClass();
    if (type == Class.class)
      return ((Class) object).getName();
    else
      return "a " + Lisp.getDotName(object.getClass());
  }



  /**
   * Updates transient instance variables if necessary
   */
  private void checkTransient() {
    if (propSupport == null) {
      propSupport = new PropertyChangeSupport(this);
      vetoSupport = new VetoableChangeSupport(this);
    }
  }

//===== Inner classes ==========================
  /**
   * A rather ugly but workable default icon used in cases
   * where there is no known icon for the bean.
   */
  class UnknownIcon implements Icon, java.io.Serializable {
    @Override
	public int getIconWidth() {
      return 16;
    }

    @Override
	public int getIconHeight() {
      return 16;
    }

    @Override
	public void paintIcon(Component c,
                                Graphics g,
                                int x,
                                int y) {
      g.setColor(Color.blue);
      g.setFont(new Font("serif", Font.BOLD, 12));
      g.drawString("@", x, y + 12);
    }
  }
}