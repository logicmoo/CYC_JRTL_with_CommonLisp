
package com.netbreeze.bbowl.gui;

import com.netbreeze.bbowl.*;
import javax.swing.*;
import javax.swing.event.*;

import org.logicmoo.bb.BeansContextListener;

import javax.swing.border.*;

import java.util.*;
import java.awt.*;
import com.netbreeze.util.*;
import com.netbreeze.swing.*;

/**
 * A GUI component showing the list of beans in the bowl
 */
public class BeanList extends JPanel implements BeansContextListener {
  BeanBowlContext context;
  JPanel panel;
  JScrollPane scroll;
  Border defaultScrollBorder;

  public BeanList(BeanBowlContext context) {
    super();
    this.context = context;
    initGUI();
    context.addListener(this);
  }

  public Dimension getPreferredSize() {
    return new Dimension(130, 200);
//    return Utility.getMaxDimension(new Dimension(250, 200), super.getPreferredSize());
  }

  public Dimension getMinimumSize() {
    return getPreferredSize();
  }

  public void beanAdded(String named, Object obj) {
    //@optimize
    reloadContents();
    invalidate();
    validate();
    repaint();
  }

  public void beanRemoved(String named, Object obj) {
    //@optimize
    reloadContents();
    invalidate();
    validate();
    repaint();
  }

  public void setTitle(String title) {
  //  scroll.setBorder(new TitledBorder(defaultScrollBorder, title));
  }

  private void initGUI() {
    panel = new JPanel();
    panel.setLayout(new VerticalLayout());

    scroll = new JScrollPane(panel);
    defaultScrollBorder = scroll.getBorder();

    //setBorder(new TitledBorder(new , "XYZ"));
    setLayout(new BorderLayout());
    add("Center", scroll);

    reloadContents();
  }

  public void reloadContents() {
    panel.removeAll();

    Iterator it = context.getBowl().getBeans();
    while (it.hasNext()) {
      Object bean = it.next();
      BeanView view = new SmallBeanView(context, bean, true, true, true);
      panel.add(view);
    }
    invalidate();
    validate();
    repaint();
  }

}