package com.cyc.webservice.client.api.url;

import com.cyc.cat.common.config.CycConfigurationProperties;
import com.cyc.cat.common.config.CycServer;
import com.cyc.cat.common.url.BaseURLStringLibrary;
import com.cyc.cat.common.url.URLString;
import com.cyc.cat.common.url.URLString.Parameter;
import com.cyc.cat.common.url.URLString.Protocol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Builds URLStrings for KEA/legacy CB URLs.
 * 
 * @todo Ultimately, the CB/KEA API should probably a transitional path from 
 * the Old Ways to a shiny new future in which the KEA relies exclusively upon
 * the other WS APIs.
 * 
 * @author nwinant
 */
public class KeaApiURLs extends BaseURLStringLibrary implements Serializable {
  
  // Constructors
  
  public KeaApiURLs(Protocol protocol, String host, Integer port, String sessionId) {
    super(protocol, host, port);
    legacy = new  KeaApiLegacyURLs(protocol, host, port, sessionId);
    setSessionId(sessionId);
  }
  
  public KeaApiURLs(String host, Integer port, String sessionId) {
    super(host, port);
    legacy = new  KeaApiLegacyURLs(this.getProtocol(), host, port, sessionId);
    setSessionId(sessionId);
  }
  
  public KeaApiURLs(Protocol protocol, String host, Integer port) {
    this(protocol, host, port, null);
  }
  
  public KeaApiURLs(String host, Integer port) {
    this(host, port, null);
  }
  
  public KeaApiURLs(String sessionId) {
    this(null, null, null, sessionId);
  }
  
  public KeaApiURLs() {
    this(null);
  }
  
  
  // Public
  
  public URLString getKETextParseUrl(String keText) {
    return makeURL(KE_TEXT_PARSE_WS_PATH, false, new Parameter("keText", keText));
  }
  
  
  // Legacy URLs
  
  public URLString getBookmarkedToolsUrl() {
    return legacy.getBookmarkedToolsUrl();
  }
  
  public URLString getHistoryUrl() {
    return legacy.getHistoryUrl();
  }
  
  public URLString getLoginUrl(String userName) {
    return legacy.getLoginUrl(userName);
  }
  
  public URLString getLogoutUrl() {
    return legacy.getLogoutUrl();
  }
  
  public URLString getServerDefaultsUrl() {
    return legacy.getServerDefaultsUrl();
  }
  
  public URLString getServerStatusUrl(boolean fast) {
    return legacy.getServerStatusUrl(fast);
  }
  
  public URLString getTermCompletionUrl(String term, String action, String queryType, List<TermCompleteParam> params, TermCompleteReturnAttribute... returnAttrs) {
    return legacy.getTermCompletionUrl(term, action, queryType, params, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String term, List<TermCompleteParam> params, TermCompleteReturnAttribute... returnAttrs) {
    return legacy. getTermCompletionUrl(term, params, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String term, TermCompleteParam param, TermCompleteReturnAttribute... returnAttrs) {
    return legacy.getTermCompletionUrl(term, param, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String prefix, String filter, TermCompleteReturnAttribute... returnAttrs) {
    return legacy.getTermCompletionUrl(prefix, filter, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String prefix, List<TermCompleteParam> params) {
    return legacy.getTermCompletionUrl(prefix, params);
  }
  
  public URLString getTermCompletionUrl(String prefix, TermCompleteReturnAttribute... returnAttrs) {
    return legacy.getTermCompletionUrl(prefix, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String prefix, String filter) {
    return legacy.getTermCompletionUrl(prefix, filter);
  }
  
  public URLString getTermCompletionUrl(String prefix) {
    return legacy.getTermCompletionUrl(prefix);
  }
  
  public URLString getToolListUrl() {
    return legacy.getToolListUrl();
  }
  
  public void setSessionId(String sessionId) { 
    this.sessionId = sessionId;
    this.legacy.setSessionId(sessionId);
  }
  public String getSessionId() { return this.sessionId; }
  
  public void setProxiedServer(CycServer server) { 
    this.addGlobalParameter(PROXIED_SERVER_PARAM, server);
    this.legacy.setProxiedServer(server);
  }
  public CycServer getProxiedServer() { 
    if (this.getGlobalParameter(PROXIED_SERVER_PARAM) != null) {
      return (CycServer) this.getGlobalParameter(PROXIED_SERVER_PARAM);
    }
    return null;
  }
  
  
  // Protected
  
  @Override
  protected String getBasePath() { return BASE_PATH; }
  
  protected URLString makeURL(String relativePath, boolean addSessionId) {
    return applyGlobalParameters(makeURL(relativePath));
  }
  
  protected URLString makeURL(String relativePath, boolean addSessionId, Parameter... parameters) {
    return applyGlobalParameters(makeURL(relativePath, parameters));
  }
  
  
  // Internal

  private static final long serialVersionUID = 1L;
    
  public static final String BASE_PATH = "/keaws";
  public static final String PROXIED_SERVER_PARAM = CycConfigurationProperties.CYC_SERVER_PROPERTY;
  
  
  public static class Path {
    static final String SEPARATOR = "/";
    final Path parent;
    final String segment;
    public Path(Path parent, String segment) {
      this.parent = parent;
      this.segment = segment;
    }
    public Path(String local) {
      this(null, local);
    }
    public Path getParent() { return this.parent; }
    public String getLocal() { return this.segment; }
    public String getFullPath() {
      String path = "";
      if (getParent() == null) {
        path = getParent().getFullPath();
      }
      return path + SEPARATOR + getLocal();
    }
    @Override public String toString() { return getFullPath(); }
  }
  
  
  
  
  public static final String KM_PATH = "/km";
  public static final String KE_TEXT_PATH = KM_PATH + "/ketext";
  public static final String KE_TEXT_PARSE_WS_PATH = KE_TEXT_PATH + "/parse";
  
  private final KeaApiLegacyURLs legacy;

  private String sessionId = null;
}