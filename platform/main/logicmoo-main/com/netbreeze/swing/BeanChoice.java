

package com.netbreeze.swing;
import javax.swing.*;

import org.logicmoo.bb.BeansContext;
import org.logicmoo.bb.BeansContextListener;

import java.beans.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A GUI widget that lets you choose among a set of beans
 * of a certain type.
 *
 */
public class BeanChoice extends JPanel implements BeansContextListener, MouseListener {
  BeansContext context = new EmptyBeansContext();
  PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

  Class type;
  JComboBox combo;
  Model model;

  public BeanChoice(Class type, Object value) {
    this(null, type, value);
  }

  public BeanChoice(BeansContext context, Class type, Object value) {
    this.type = type;
    if (context != null)
      this.context = context;
    if (type == null)
      type = Object.class;
    initGUI();
    combo.setSelectedItem(value);
    if (context != null)
      context.addListener(this);
  }

  @Override
public void addPropertyChangeListener(PropertyChangeListener p) {
    propSupport.addPropertyChangeListener(p);
  }

  @Override
public void removePropertyChangeListener(PropertyChangeListener p) {
    propSupport.removePropertyChangeListener(p);
  }

  public void setSelection(Object bean) {
    model.setSelectedItem(bean);
  }


  @Override
public void beanAdded(String named, Object obj) {
    model.reload();
  }

  @Override
public void beanRemoved(String named, Object obj) {
    model.reload();
  }

  private void initGUI() {
    model = new Model();
    combo = new JComboBox(model);
    combo.setEditable(false);
    setLayout(new BorderLayout());
    add("Center", combo);
    combo.addMouseListener(this);
  }

  @Override
public void mouseClicked(MouseEvent e) {
    if (e.isPopupTrigger()) {
      showMenu(e.getX() + 5, e.getY() + 5);
    }
  }
  @Override
public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) {
      showMenu(e.getX() + 5, e.getY() + 5);
    }
  }

  @Override
public void mouseReleased(MouseEvent e) {
    if (e.isPopupTrigger()) {
      showMenu(e.getX() + 5, e.getY() + 5);
    }
  }

  @Override
public void mouseEntered(MouseEvent e) {
    //@temp
    //label.setForeground(Color.blue);
  }
  @Override
public void mouseExited(MouseEvent e) {
    //label.setForeground(Color.black);
  }

  public Object getSelection() {
    return model.getSelectedItem();
  }

  private void showMenu(int x, int y) {
    Object bean = model.getSelectedBean();
    if (bean != null) {
      BeanPopupMenu menu = new BeanPopupMenu(bean);
      add(menu);
      menu.show(this, x, y);
    }
  }

  class Model extends AbstractListModel implements ComboBoxModel {
    //Vector listeners = new Vector();
    java.util.List values;
    Object selected = null;

    public Model() {
      if (context == null)
        values = new LinkedList();
      else
        values = new LinkedList(context.getBeansOfType(type));
      values.add("<null>");
    }

    @Override
	public synchronized void setSelectedItem(Object anItem) {
      Object old = selected;
      selected = anItem;

      //if (old != selected)
      //  notifyListeners();

      if (selected != null && !values.contains(selected))
        values.add(selected);
      fireContentsChanged(this, -1, -1);
      if (selected != old) {
        propSupport.firePropertyChange("selection", old, selected);
      }
    }

    @Override
	public Object getSelectedItem() {
      if (selected == null)
        return "<null>";
      else
        return selected;
    }

    public Object getSelectedBean() {
      return selected;
    }

    @Override
	public int getSize() {
      return values.size();
    }

    @Override
	public Object getElementAt(int index) {
      try {
        return values.get(index);
      } catch (Exception err) {
        return null;
      }
    }

    public synchronized void reload() {
      Object selected = getSelectedBean();
      if (values == null)
        values = new LinkedList();
      else
        values = new LinkedList(context.getBeansOfType(type));
      values.add("<null>");
      setSelectedItem(selected);
    }
  }



}