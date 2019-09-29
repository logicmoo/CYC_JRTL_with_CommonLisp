package com.cyc.cat.web.kea.storage;

import com.cyc.cat.common.config.CycServer;
import java.util.HashMap;
import java.util.Map;
import static com.cyc.cat.web.kea.storage.KEAStorageConstants.KEA_STORAGE_PREFIX;

/**
 *
 * @author nwinant
 */
public class KEASessionsCookie extends KEACookie {
  
  public KEASessionsCookie(String value) {
    super(KEA_SESSIONS_COOKIE_NAME, value);
  }
  
  public KEASessionsCookie(Map<String,CycServer> map) {
    this(parseMap(map));
  }
  
  public KEASessionsCookie() {
    this(new HashMap<String,CycServer>());
  }
  
  
  // Public
  
  public Map<String,CycServer> getSessions() {
    return sessions;
  }
  
  
  // Protected
  
  protected static String parseMap(Map<String,CycServer> map) {
    StringBuilder sb = new StringBuilder();
    for (String key : map.keySet()) {
      if (sb.length() > 0) {
        sb.append(SESSION_PAIR_DELIMITER);
      }
      if (map.get(key) != null) {
        sb.append(key).append(SESSION_SERVER_DELIMITER).append(map.get(key));
      }
    }
    return sb.toString();
  }
  
  @Override
  protected void parseStringValue(String value) {
    final Map<String,CycServer> newSessions = new HashMap<String,CycServer>();
    final String[] sessionPairs = value.split(SESSION_PAIR_DELIMITER);
    for (String sessionPair : sessionPairs) {
      if ((sessionPair != null) && !sessionPair.isEmpty()) {
        final String[] tokens = sessionPair.split(SESSION_SERVER_DELIMITER);
        if ((tokens.length == 2) && (CycServer.isValidString(tokens[1]))) {
          final String sessionId = tokens[0];
          final CycServer server = CycServer.fromString(tokens[1]);
          newSessions.put(sessionId, server);
        }
      }
    }
    this.sessions = newSessions;
    super.parseStringValue(value);
  }
  
  
  // Internal
  
  public static final String KEA_SESSIONS_COOKIE_NAME = KEA_STORAGE_PREFIX + "sessions";
  public static final String SESSION_PAIR_DELIMITER = ";";
  public static final String SESSION_SERVER_DELIMITER = "=";
  private Map<String,CycServer> sessions;
}
