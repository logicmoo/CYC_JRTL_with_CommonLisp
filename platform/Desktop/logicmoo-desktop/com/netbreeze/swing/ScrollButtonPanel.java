package com.netbreeze.swing;

import javax.swing.*;
//import andrik.gui.VerticalLayout;
import java.awt.*;
import java.beans.*;
import java.util.*;

import java.awt.event.*;

public class ScrollButtonPanel extends JPanel implements ActionListener {

  public final static int INCREMENT = ActionEvent.ACTION_FIRST;
  public final static int DECREMENT = INCREMENT + 1;

  public static final int VERTICAL = 0;
  public static final int HORIZONTAL = 1;

  Vector listeners = new Vector();

  ArrowButton incButton;
  ArrowButton decButton;
  Component target;
  int width;
  int height;
  int orientation;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Test");
    frame.getContentPane().setLayout(new BorderLayout());
    JTextField text = new JTextField(10);
    frame.getContentPane().add("Center", text);
    frame.getContentPane().add("East", new ScrollButtonPanel(text));
    frame.pack();
    frame.show();
  }


  public ScrollButtonPanel() {
    this(null);
  }

  public ScrollButtonPanel(Component target) {
    this(target, 15, VERTICAL);
  }

  public ScrollButtonPanel(Component target, int width, int orientation) {
    this.target = target;
    this.height = 10;
    this.width = width;
    this.orientation = orientation;
    initGUI(orientation);
  }

  public void addActionListener(ActionListener l) {
    listeners.addElement(l);
  }

  public void removeActionListener(ActionListener l) {
    listeners.removeElement(l);
  }

  public void actionPerformed(ActionEvent evt) {
    ActionEvent evt2 = null;
    if (evt.getSource() == incButton) {
      evt2 = new ActionEvent(this, INCREMENT, "increment");
    } else if (evt.getSource() == decButton) {
      evt2 = new ActionEvent(this, DECREMENT, "decrement");
    }
    if (evt2 != null) {
      Enumeration enumr = listeners.elements();
      while (enumr.hasMoreElements()) {
        ((ActionListener) enumr.nextElement()).actionPerformed(evt2);
      }
    }
  }

  public JButton getIncButton() {
    return incButton;
  }

  public JButton getDecButton() {
    return decButton;
  }

  public Dimension getPreferredSize() {
    int w, h;
    w = width;
    if (target == null)
      h = height;
    else
      h = target.getSize().height;
    return new Dimension(w, h);
  }

  public Dimension getMinimumSize() {
    return getPreferredSize();
  }

  void initGUI(int orientation) {
    if (orientation == VERTICAL) {
      this.incButton = new ArrowButton(Color.black, Color.blue, ArrowButton.UP);
      this.decButton = new ArrowButton(Color.black, Color.blue, ArrowButton.DOWN);
      setLayout(new GridLayout(2, 1));
    } else {
      this.incButton = new ArrowButton(Color.black, Color.blue, ArrowButton.RIGHT);
      this.decButton = new ArrowButton(Color.black, Color.blue, ArrowButton.LEFT);
      setLayout(new GridLayout(1, 2));
    }
      add(incButton);
      add(decButton);
      incButton.addActionListener(this);
      decButton.addActionListener(this);
  }
}