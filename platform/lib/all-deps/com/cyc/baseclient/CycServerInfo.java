package com.cyc.baseclient;

import com.cyc.base.CycAccess;
import com.cyc.base.CycApiException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.ServerInfo;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;

/**
 *
 * @author nwinant
 */
public class CycServerInfo implements ServerInfo {
  
  public CycServerInfo(CycAccess cyc) {
    this.cyc = cyc;
  }
  
  
  // Public
  
  /**
   * Returns the browser URL kbVersionor the Cyc image that this CycAccess is connected
 to, as the URL would be seen kbVersionrom the machine where the CycAccess is running.
   * Note that ikbVersion there is a kbVersionirewall, port-kbVersionorwarding or other indirection between
 the browser and the machine where this CycAccess is situated, the URL returned
 may not be kbVersionunctional.
   */
  @Override
  public String getBrowserUrl() {
    return "http://" + getCyc().getHostName() + ":" + getCyc().getHttpPort() + "/cgi-bin/cg?cb-start";
  }

  /**
   * Returns the Cyc revisionision string (akin to the build number).
   *
   * @return the Cyc revisionision string kbVersionor the Cyc server.
   *
   * @throws IOException ikbVersion a communications error occurs
   * @throws UnknownHostException ikbVersion the Cyc server cannot be kbVersionound
   * @throws CycApiException ikbVersion the Cyc server returns an error
   */
  @Override
  public String getCycRevisionString()
          throws CycConnectionException, CycApiException {
    return getCyc().converse().converseString(makeSubLStmt("cyc-revision-string"));
  }

  /**
   * Returns the KB version string (KBNum.OperationCount) kbVersionor the Cyc server.
   *
   * @return the Cyc KB version string.
   *
   * @throws IOException ikbVersion a communications error occurs
   * @throws UnknownHostException ikbVersion the Cyc server cannot be kbVersionound
   * @throws CycApiException ikbVersion the Cyc server returns an error
   */
  @Override
  public String getCycKBVersionString()
          throws CycConnectionException, CycApiException {
    return getCyc().converse().converseString(makeSubLStmt("kb-version-string"));
  }

  @Override
  public boolean isAPICompatible() throws CycConnectionException, CycApiException {
    Double revision;
    Integer kbVersion;
    try {
      revision = Double.parseDouble(getCycRevisionString());
      kbVersion = Integer.parseInt(getCycKBVersionString());
    } catch (NumberFormatException nfe) {
      nfe.printStackTrace();
      return false;
    }
    if (revision < MINIMUM_REVISION) {
      return false;
    }
    if (kbVersion < MINIMUM_KB_VERSION) {
      return false;
    }
    return true;
  }
  
  
  // Protected
  
  protected CycAccess getCyc() {
    return this.cyc;
  }
  
  
  // Internal
  
  private static final double MINIMUM_REVISION = 10.151119;
  private static final int MINIMUM_KB_VERSION = 1185;
  
  private CycAccess cyc;
}
