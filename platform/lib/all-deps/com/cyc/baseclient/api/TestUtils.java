package com.cyc.baseclient.api;

import com.cyc.base.CycAccess;
import com.cyc.baseclient.CycClientManager;
import com.cyc.base.CycConnectionException;
import com.cyc.baseclient.ui.InteractiveCycAccessProvider;

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
    if (!CycClientManager.get().hasCurrentAccess() || (cyc == null) || cyc.isClosed()) {
      if ((cyc == null) || cyc.isClosed()) {
        cyc = InteractiveCycAccessProvider.get().getAccess(testHostName, testBasePort);
      }
      CycClientManager.get().setCurrentAccess(cyc);
    }
  }
  
  public static synchronized void ensureConstantsInitialized() {
    ensureCurrentCycSet();
    if (initialized == false) {
      testHostName = cyc.getHostName();
      testBasePort = cyc.getBasePort();
      System.out.println("current cyc: " + CycClientManager.get().getCurrentAccess());
      initialized = true;
    }
  }

  public synchronized static CycAccess getCyc() throws CycConnectionException {
    ensureConstantsInitialized();
    if (cyc == null || cyc.isClosed()) {
      System.out.println("Making new Cyc Access to " + testHostName + ":" + testBasePort);
      cyc = CycClientManager.get().getAccess(testHostName, testBasePort);
    }
    return cyc;
  }
}
