

package com.netbreeze.swing;

import javax.swing.*;
import java.awt.*;

public class PropertySheet extends JPanel {
  private GridBagLayout gb = new GridBagLayout();
  private GridBagConstraints c = new GridBagConstraints();
  private int y = 0;

  private JPanel internal = new JPanel();
  private JPanel main = new JPanel();

  public PropertySheet() {
    c.anchor = GridBagConstraints.WEST;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.insets = new Insets(5, 5, 5, 5);
    c.weighty = 0;

    internal.setLayout(gb);

    main.setLayout(new BorderLayout());
    main.add("North", internal);

    setLayout(new BorderLayout());
    super.add("Center",
      new JScrollPane(
        main//,
        //JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        //JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
      )
    );
  }

  public Component add(String label, Component comp) {
    JLabel labelComponent = new JLabel(label);

    c.gridwidth = 1;
    c.gridx = 0;
    c.gridy = y;
    c.weightx = 0;

    gb.setConstraints(labelComponent, c);
    internal.add(labelComponent);

    c.gridx = 1;
    c.weightx = 1;

    gb.setConstraints(comp, c);
    internal.add(comp);

    ++y;
    return null;
  }

  public Component add(Component comp) {
    c.gridwidth = 2;
    c.gridx = 0;
    c.gridy = y;
    c.weightx = 1;

    gb.setConstraints(comp, c);
    internal.add(comp);

    ++y;
    return comp;
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("Test");
    PropertySheet s = new PropertySheet();
    s.add("First", new JButton("bla bla bla"));
    s.add("second one", new JTextField(3));
    s.add("t", new JTextArea("Yeah!", 5, 10));

    //f.getContentPane().setLayout(new FlowLayout());
    f.getContentPane().add(s);
    //f.pack();
    f.setSize(300, 300);
    f.setVisible(true);
  }
}