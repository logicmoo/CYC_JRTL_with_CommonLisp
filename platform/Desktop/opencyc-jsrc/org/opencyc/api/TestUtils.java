/*
 */
package org.opencyc.api;

import java.io.IOException;

/**
 *
 * @author baxter
 */
public class TestUtils {

  private static CycAccess cyc = null;
  private static boolean initialized = false;
  /** the test host */
  public static String testHostName = CycConnection.DEFAULT_HOSTNAME;
  /** the test base port */
  public static int testBasePort = CycConnection.DEFAULT_BASE_PORT;

  public static synchronized void ensureCurrentCycSet() {
    if (!CycAccess.hasCurrent() || (cyc == null) || cyc.isClosed()) {
      if ((cyc == null) || cyc.isClosed()) {
        cyc = CycAccess.getNewCycAccessInteractively(testHostName, testBasePort);
      }
      CycAccess.setCurrent(cyc);
    }
  }
    
  public static synchronized void ensureConstantsInitialized() {
    ensureCurrentCycSet();
    if (initialized == false) {
      testHostName = cyc.getHostName();
      testBasePort = cyc.getBasePort();
      System.out.println("current cyc: " + CycAccess.getCurrent());
      initialized = true;
    }
  }

  public synchronized static CycAccess getCyc() throws IOException {
    ensureConstantsInitialized();
    if (cyc == null || cyc.isClosed()) {
      System.out.println("Making new Cyc Access to " + testHostName + ":" + testBasePort);
      cyc = new CycAccess(testHostName, testBasePort);
    }
    return cyc;
  }
}
