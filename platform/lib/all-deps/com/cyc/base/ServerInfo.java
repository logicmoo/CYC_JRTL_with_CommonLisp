package com.cyc.base;

/**
 *
 * @author nwinant
 */
public interface ServerInfo {
  
  /**
   * Returns the browser URL for the Cyc image that this CycAccess is connected
   * to, as the URL would be seen from the machine where the CycAccess is running.
   * Note that if there is a firewall, port-forwarding or other indirection between
   * the browser and the machine where this CycAccess is situated, the URL returned
   * may not be functional.
   */
  String getBrowserUrl();

  /**
   * Returns the KB version string (KBNum.OperationCount) for the Cyc server.
   *
   * @return the Cyc KB version string.
   *
   * @throws CycConnectionException if a communications error occurs or the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  String getCycKBVersionString() throws CycConnectionException, CycApiException;
  
  /**
   * Returns the Cyc revision string (akin to the build number).
   *
   * @return the Cyc revision string for the Cyc server.
   *
   * @throws CycConnectionException if a communications error occurs or the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  String getCycRevisionString() throws CycConnectionException, CycApiException;

  /**
   * Determines whether the server is expected to be fully compatible with this API.
   * Note that there are a number of factors which may effect compatibility, so
   * this answer should be construed as an expectation, not a guarantee. Likewise, a result
   * of false does not mean that the server is completely incompatible with the API,
   * but some functionality may be missing or broken.
   * 
   * @return boolean
   * 
   * @throws CycConnectionException if a communications error occurs or the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  boolean isAPICompatible() throws CycConnectionException, CycApiException;
}
