package com.cyc.cat.web.kea.storage;

/**
 *
 * @author nwinant
 */
public class KEAStorageConstants {
  
  // Global
  
  public static final String KEA_STORAGE_PREFIX = "KEA_";
  
  
  // Local storage
  
  public static final String KEA_LS_SESSIONS_NAME = KEA_STORAGE_PREFIX + "sessions";
  public static final String KEA_LS_CONTEXTS_NAME = KEA_STORAGE_PREFIX + "contexts" ;
  
  
  // Session storage
  
  public static final String KEA_SS_CURRENT_SESSION_NAME = KEA_STORAGE_PREFIX + "current_session";
  public static final String KEA_SS_FOCAL_TERM_NAME = KEA_STORAGE_PREFIX + "focal_term";
}
