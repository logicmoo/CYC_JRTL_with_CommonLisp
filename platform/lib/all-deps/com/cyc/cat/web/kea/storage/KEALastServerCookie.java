/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.cat.web.kea.storage;

import com.cyc.cat.common.config.CycServer;
import static com.cyc.cat.web.kea.storage.KEAStorageConstants.KEA_STORAGE_PREFIX;

/**
 *
 * @author nwinant
 */
public class KEALastServerCookie extends KEACookie {
  
  public KEALastServerCookie(String value) {
    super(KEA_LAST_SERVER_COOKIE_NAME, value);
  }
  
  public KEALastServerCookie(CycServer value) {
    super(KEA_LAST_SERVER_COOKIE_NAME, value.toString());
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
  
  public static final String KEA_LAST_SERVER_COOKIE_NAME = KEA_STORAGE_PREFIX + "last_server";
  private CycServer server;
}
