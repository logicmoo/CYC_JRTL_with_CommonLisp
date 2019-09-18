package com.cyc.baseclient.ui;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycServer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.cyc.baseclient.CycClientManager;

/**
 *
 * @author nwinant
 */
public class InteractiveCycAccessProvider {
  
  private InteractiveCycAccessProvider() {}
  
  synchronized public static InteractiveCycAccessProvider get() {
    if (ME == null) {
      ME = new InteractiveCycAccessProvider();
    }
    return ME;
  }
  
  
  // Public
  
  /**
   * Attempt to create a new CycAccess object from defaultHost and defaultPort;
 prompting the user if no Cyc server is accessible at that address. 
   *
   * @param defaultHost
   * @param defaultPort
   * @return
   */
  public CycAccess getAccess(String defaultHost, int defaultPort) {
    try {
      CycAccess cycAccess = CycClientManager.get().getAccess(defaultHost, defaultPort);
      return cycAccess;
    } catch (CycConnectionException ex) {
      Logger.getLogger(InteractiveCycAccessProvider.class.getName()).log(Level.INFO,
              "Cyc server not reachable at " + defaultHost + ":" + defaultPort + ". Asking the user to specify host and port.");
    }
    return getAccess();
  }
  
  /**
   * Prompts the user (via a JOptionPane), for a Cyc host & port, and returns a 
 new CycAccess object. If no Cyc server is accessible at that address, it will
   * prompt the user again.
   * 
   * @param server
   * @return Returns a CycAccess object, or null if the user cancels out.
   */
  public CycAccess getAccess() {
    CycAccess cycAccess = null;
    final Integer[] ports = {3600, 3620, 3640, 3660, 3680};
    //String hostname = "localhost";
    //Integer port = ports[0];
    CycServer server = new CycServer("localhost", ports[0]);
    while (cycAccess == null) {
      server = CycConnectionPanel.promptUser(server);
      try {
        if (server == null) {
          return null;
        }
        cycAccess = CycClientManager.get().getAccess(server.getHostName(), server.getBasePort());
      } catch (Exception ex) {
        final int result = JOptionPane.showConfirmDialog(null,
                "Got Exception trying to connect to " + server.toString() + ":\n" + ex.getLocalizedMessage()
                + "\nTry again?", "Exception", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (result != JOptionPane.OK_OPTION) {
          return null;
        }
      }
    }
    return cycAccess;
  }
  
  
  // Internal
  
  private static InteractiveCycAccessProvider ME;
}
