package com.cyc.baseclient;

import com.cyc.base.CycApiException;
import com.cyc.base.CycAccess;
import com.cyc.base.CycAccessManager;
import com.cyc.base.CycConnectionException;
import com.cyc.base.conn.CycConnectionInterface;
import java.net.URL;

/**
 *
 * @author nwinant
 */
public class CycClientManager extends CycAccessManager {

  public synchronized static CycClientManager get() {
    if (ME == null) {
      ME = new CycClientManager();
    }
    return ME;
  }
  
  
  // Public

  @Override
  public CycClient getAccess() throws CycConnectionException, CycApiException {
    return new CycClient();
  }

  @Override
  public CycClient getAccess(CycConnectionInterface conn) throws CycConnectionException, CycApiException {
    return new CycClient(conn);
  }

  @Override
  public CycClient getAccess(URL endpointURL, String hostName, int basePort) throws CycConnectionException, CycApiException {
    return new CycClient(endpointURL, hostName, basePort);
  }

  @Override
  public CycClient getAccess(String hostName, int basePort) throws CycConnectionException, CycApiException {
    return new CycClient(hostName, basePort);
  }

  @Override
  public CycClient getCurrentAccess() {
    return CycClient.getCurrent();
  }

  @Override
  public CycClient setCurrentAccess(CycAccess access) {
    return CycClient.setCurrent((CycClient) access);
  }

  @Override
  public CycAccess setCurrentAccess(String hostName, int port) throws CycConnectionException {
    return CycClient.setCurrent(hostName, port);
  }

  @Override
  public boolean hasCurrentAccess() {
    return CycClient.hasCurrent();
  }

  @Override
  public void setSharedAccessInstance(CycAccess sharedCycClientInstance) {
    CycClient.setSharedCycAccessInstance((CycClient) sharedCycClientInstance);
  }
  
  public CycClient fromCycAccess(CycAccess access) {
    return (CycClient) access;
  }
  
  
  // Internal
  
  static private CycClientManager ME;
}
