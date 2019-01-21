
package com.netbreeze.swing;

import javax.swing.*;

import org.logicmoo.bb.BeansContext;

import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class ErrorPanel extends JPanel {
  Throwable error;
  String message;
  JButton viewButton;
  BeansContext context;

  public ErrorPanel(String message, Throwable error) {
    super();
    this.message = message;
    this.error = error;
    this.context = BeanUtils.getDefaultContext();
    createGUI();
  }

  public ErrorPanel(Throwable error) {
    this("Something went wrong!", error);
  }

  public ErrorPanel(String message) {
    this(message, null);
  }

  private void createGUI() {
    JPanel panel = new JPanel(new BorderLayout(5, 5));
    JLabel messageLabel = new JLabel(message);
    panel.add("North", messageLabel);
    if (error != null) {
      JPanel errorPanel = new JPanel(new BorderLayout(2, 2));

      Box labels = new Box(BoxLayout.Y_AXIS);
      labels.add(new JLabel("Class: " + error.getClass().getName()));
      labels.add(new JLabel("Message: " + error.getMessage()));

      JTextArea stackTrace = new JTextArea(10, 50);
      TextAreaOutputStream stream = new TextAreaOutputStream(stackTrace);
      PrintWriter writer = new PrintWriter(stream);
      error.printStackTrace(new PrintStream(stream));

      errorPanel.add("North", labels);
      errorPanel.add("Center", new JScrollPane(stackTrace));

      panel.add("Center", errorPanel);
    }

    setLayout(new BorderLayout(5, 5));
    add("Center", panel);

    JPanel buttonPanel = new JPanel(new FlowLayout());
    if (context != null) {
      viewButton = new JButton("Details...");
      buttonPanel.add(viewButton);
      viewButton.addActionListener(
        new ActionListener() {
          @Override
		public void actionPerformed(ActionEvent evt) {
            try {
              context.showBeanDetails(error);
            } catch (Throwable err) {
              if (context == null) {
                new ErrorDialog(err).show();
              } else {
                context.showError(null, err);
              }
            }
          }
        }
      );
    }

    add("South", buttonPanel);
  }
}