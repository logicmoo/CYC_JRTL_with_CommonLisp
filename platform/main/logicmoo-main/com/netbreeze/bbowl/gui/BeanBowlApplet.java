

package com.netbreeze.bbowl.gui;
import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BeanBowlApplet extends JApplet {
  @Override
public void init() {
    Box box = new Box(BoxLayout.Y_AXIS);
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add("Center", box);

    try {
      //setLayout(new BorderLayout());
      //add("Center", new BeanBowlPanel());

      box.add(new JLabel("Opening BeanBowl in a new window..."));
      (new BeanBowlGUI()).show();
      //setVisible(false);
      //setSize(0, 0);
    } catch (Exception err) {
      JTextArea text = new JTextArea();
      text.setEditable(false);
      text.setText("Darn, an error occurred!\nPlease email this to henrik@kniberg.com, thanks!\n\n" + err.toString());
      box.add(text);
    }
  }
}