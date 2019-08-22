
package com.netbreeze.bbowl.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import org.logicmoo.bb.BeansContextListener;

import com.netbreeze.swing.BeanView;
import com.netbreeze.swing.SmallBeanView;
import com.netbreeze.swing.VerticalLayout;

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

  @Override
public Dimension getPreferredSize() {
    return new Dimension(130, 200);
//    return Utility.getMaxDimension(new Dimension(250, 200), super.getPreferredSize());
  }

  @Override
public Dimension getMinimumSize() {
    return getPreferredSize();
  }

  @Override
public void beanAdded(String named, Object obj) {
    //@optimize
    reloadContents();
    invalidate();
    validate();
    repaint();
  }

  @Override
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