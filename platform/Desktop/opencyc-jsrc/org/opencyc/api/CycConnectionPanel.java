package org.opencyc.api;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static org.opencyc.api.CycConnection.DEFAULT_HOSTNAME;
import static org.opencyc.api.CycConnection.DEFAULT_BASE_PORT;

/**
 * A Swing JPanel which prompts the user for a Cyc hostname & base port.
 * 
 * @author nwinant
 */
public class CycConnectionPanel extends JPanel {

  public CycConnectionPanel(CycServer server) {
    hostField = new JTextField(server.getHostName(), 20);
    portField = new JComboBox(getBasePorts());
    if (server.getBasePort() != null) {
      portField.setSelectedItem(server.getBasePort());
    }
    add(new JLabel("Cyc host and base port:"));
    add(hostField);
    add(portField);
    
    addComponentListener(new ComponentAdapter() {
      @Override
      public void componentShown(ComponentEvent ce) {
        hostField.requestFocusInWindow();
      }
    });
  }
  
  public CycConnectionPanel(String defaultHost, Integer defaultPort) {
    this(new CycServer(defaultHost, defaultPort));
  }
  
  public CycConnectionPanel() {
    this(DEFAULT_HOSTNAME, DEFAULT_BASE_PORT);
  }
  
  
  // Public
  
  public CycServer getCycServer() {
    return new CycServer(getHostName(), getBasePort());
  }
  
  
  // Protected
  
  protected Integer[] getBasePorts() {
    return new Integer[]{3600, 3620, 3600, 3660, 3680};
  }
  
  protected String getHostName() {
    return hostField.getText();
  }
  
  protected Integer getBasePort() {
    if (portField.getSelectedItem() != null) {
      return Integer.parseInt(portField.getSelectedItem().toString());
    }
    return null;
  }
  
  
  // Internal  
  
  final private JTextField hostField;
  final private JComboBox portField;

  
  // Static
  
  /**
   * Presents a CycConnectionPanel to the user via a JOptionPane, and
   * returns the user's input wrapped in a CycServer object.
   * 
   * @param server
   * @return Returns a CycServer object wrapping the user's input, or null if they cancel.
   */
  private static CycServer wrapInJOptionPane(CycConnectionPanel panel) {
    final Object[] options = { "OK", "Cancel" };
    int result = JOptionPane.showOptionDialog(null, panel, "Set Cyc Connection",
              JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
    if (result == JOptionPane.OK_OPTION) {
      return panel.getCycServer();
    }
    return null;
  }
  
  /**
   * Creates a CycConnectionPanel, presents it to the user via a JOptionPane, and
   * returns the user's input wrapped in a CycServer object.
   * 
   * @param server
   * @return Returns a CycServer object wrapping the user's input, or null if they cancel.
   */
  public static CycServer promptUser(CycServer server) {
    return wrapInJOptionPane(new CycConnectionPanel(server));
  }
  
  /**
   * Creates a CycConnectionPanel, presents it to the user via a JOptionPane, and
   * returns the user's input wrapped in a CycServer object.
   * 
   * @param server
   * @return Returns a CycServer object wrapping the user's input, or null if they cancel.
   */
  public static CycServer promptUser(String defaultHost, Integer defaultPort) {
    return wrapInJOptionPane(new CycConnectionPanel(defaultHost, defaultPort));
  }
  
  /**
   * Creates a CycConnectionPanel, presents it to the user via a JOptionPane, and
   * returns the user's input wrapped in a CycServer object.
   * 
   * @param server
   * @return Returns a CycServer object wrapping the user's input, or null if they cancel.
   */
  public static CycServer promptUser() {
    return wrapInJOptionPane(new CycConnectionPanel());
  }
  
  public static void main(String[] args) {
    try {
      final CycServer result = CycConnectionPanel.promptUser();
      if (result != null) {
        System.out.println("Server: " + result.toString());
      } else {
        System.out.println("Cancelled!");
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      System.exit(0);
    }
  }
}