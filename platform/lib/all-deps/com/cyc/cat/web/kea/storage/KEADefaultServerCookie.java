package com.cyc.cat.web.kea.storage;

import com.cyc.cat.common.config.CycServer;
import static com.cyc.cat.web.kea.storage.KEAStorageConstants.KEA_STORAGE_PREFIX;

/**
 *
 * @author nwinant
 */
public class KEADefaultServerCookie extends KEACookie {
  
  public KEADefaultServerCookie(String value) {
    super(KEA_DEFAULT_SERVER_COOKIE_NAME, value);
  }
  
  public KEADefaultServerCookie(CycServer value) {
    this(value.toString());
  }
  
  
  // Public
  
  public CycServer getServer() {
    return this.server;
  }
  
  
  // Protected
  
  @Override
  protected void parseStringValue(String value) {
    this.server = CycServer.fromString(value);
    super.parseStringValue(value);
  }
  
  
  // Internal
  
  public static final String KEA_DEFAULT_SERVER_COOKIE_NAME = KEA_STORAGE_PREFIX + "default_server";
  private CycServer server;
}
