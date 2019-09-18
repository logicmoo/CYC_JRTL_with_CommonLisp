package com.cyc.webservice.client.api.url;

import com.cyc.cat.common.config.CycConfigurationProperties;
import com.cyc.cat.common.config.CycServer;
import com.cyc.cat.common.url.BaseURLStringLibrary;
import com.cyc.cat.common.url.URLString;
import com.cyc.cat.common.url.URLString.Parameter;
import com.cyc.cat.common.url.URLString.Protocol;
import com.cyc.cat.common.url.URLString.UnvaluedParameter;
import com.cyc.webservice.client.api.url.TermCompleteParam.Name;
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
 * @deprecated
 * 
 * @author nwinant
 */
public class KeaApiLegacyURLs extends BaseURLStringLibrary implements Serializable {
  
  // Constructors
  
  public KeaApiLegacyURLs(Protocol protocol, String host, Integer port, String sessionId) {
    super(protocol, host, port);
    setSessionId(sessionId);
    legacyURLs = new LegacyCbApiURLS(protocol, host, port);
  }
  
  public KeaApiLegacyURLs(String host, Integer port, String sessionId) {
    super(host, port);
    setSessionId(sessionId);
    legacyURLs = new LegacyCbApiURLS(this.getProtocol(), host, port);
  }
  
  public KeaApiLegacyURLs(Protocol protocol, String host, Integer port) {
    this(protocol, host, port, null);
  }
  
  public KeaApiLegacyURLs(String host, Integer port) {
    this(host, port, null);
  }
  
  public KeaApiLegacyURLs(String sessionId) {
    this(null, null, null, sessionId);
  }
  
  public KeaApiLegacyURLs() {
    this(null);
  }
  
  
  // Public
  
  public URLString getBookmarkedToolsUrl() {
    return makeURL(BOOKMARKED_TOOLS_WS_PATH, true);
  }
  
  public URLString getHistoryUrl() {
    return makeURL(HISTORY_WS_PATH, true);
  }
  
  public URLString getLoginUrl(String userName) {
    return makeURL(LOGIN_WS_PATH, false, new Parameter("userName", userName));
  }
  
  public URLString getLogoutUrl() {
    return makeURL(LOGOUT_WS_PATH, true);
  }
  
  public URLString getServerDefaultsUrl() {
    return makeURL(SERVER_DEFAULTS_WS_PATH, true);
  }
  
  public URLString getServerStatusUrl(boolean fast) {
    if (fast) {
      return makeURL(SERVER_STATUS_WS_PATH, true, new Parameter("fast", fast));
    }
    return makeURL(SERVER_STATUS_WS_PATH, true);
  }
  
  public URLString getTermCompletionUrl(String term, String action, String queryType, List<TermCompleteParam> params, TermCompleteReturnAttribute... returnAttrs) {
    final ArrayList<Parameter> parameters = new ArrayList<Parameter>();
    parameters.add(new UnvaluedParameter(action));
    for (TermCompleteParam param : params) {
      parameters.add(param);
    }
    parameters.add(new Parameter(queryType, term));
    if ((returnAttrs != null) && (returnAttrs.length > 0)) {
      final StringBuilder attrs = new StringBuilder("(");
      for (TermCompleteReturnAttribute returnAttr : returnAttrs) {
        if (attrs.length() > 1) {
          attrs.append(" ");
        }
        attrs.append(returnAttr);
      }
      parameters.add(new Parameter(TERM_COMPLETE_RETURN_ATTRS_PARAM, attrs.append(")").toString()));
    }
    return applyGlobalParameters(this.legacyURLs.makeURL(TERM_COMPLETE_WS_PATH, parameters.toArray(new Parameter[]{})));
  }
  
  public URLString getTermCompletionUrl(String term, List<TermCompleteParam> params, TermCompleteReturnAttribute... returnAttrs) {
    return getTermCompletionUrl(term, TERM_COMPLETE_DEFAULT_ACTION, TERM_COMPLETE_DEFAULT_QUERY_TYPE, params, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String term, TermCompleteParam param, TermCompleteReturnAttribute... returnAttrs) {
    return getTermCompletionUrl(term, Arrays.asList(param), returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String prefix, String filter, TermCompleteReturnAttribute... returnAttrs) {
    return getTermCompletionUrl(prefix, new TermCompleteParam(Name.FILTER, filter), returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String prefix, List<TermCompleteParam> params) {
    return getTermCompletionUrl(prefix, params, TERM_COMPLETE_DEFAULT_RETURN_ATTRS);
  }
  
  public URLString getTermCompletionUrl(String prefix, TermCompleteReturnAttribute... returnAttrs) {
    return getTermCompletionUrl(prefix, TERM_COMPLETE_DEFAULT_FILTER, returnAttrs);
  }
  
  public URLString getTermCompletionUrl(String prefix, String filter) {
    return getTermCompletionUrl(prefix, filter, TERM_COMPLETE_DEFAULT_RETURN_ATTRS);
  }
  
  public URLString getTermCompletionUrl(String prefix) {
    return getTermCompletionUrl(prefix, TERM_COMPLETE_DEFAULT_RETURN_ATTRS);
  }
  
  public URLString getToolListUrl() {
    return makeURL(TOOL_LIST_WS_PATH, true);
  }
  
  public void setSessionId(String sessionId) { this.sessionId = sessionId; }
  public String getSessionId() { return this.sessionId; }
  
  public void setProxiedServer(CycServer server) { 
    this.addGlobalParameter(PROXIED_SERVER_PARAM, server);
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
    return applyGlobalParameters(makeURL(addSessionId(relativePath, addSessionId)));
  }
  
  protected URLString makeURL(String relativePath, boolean addSessionId, Parameter... parameters) {
    return applyGlobalParameters(makeURL(addSessionId(relativePath, addSessionId), parameters));
  }
  
  private String addSessionId(String path, boolean addSessionId) {
    if (addSessionId && (getSessionId() != null)) {
      return "/" + getSessionId() + path;
    }
    return path;
  }
  
  
  // Inner Classes
  
  public static class LegacyCbApiURLS extends BaseURLStringLibrary {
    public LegacyCbApiURLS(Protocol protocol, String host, int port) {
      super(protocol, host, port);
    }
    @Override
    protected String getBasePath() {
//      return "/cgi-bin/cyccgi/cg";
      return "/cgi-bin/cg";
    }
    @Override
    public URLString makeURL(String relativePath) {
      return super.makeURL(relativePath);
    }
    @Override
    public URLString makeURL(String relativePath, Parameter... parameters) {
      return super.makeURL(relativePath, parameters);
    }
  }
  
  
  // Internal

  private static final long serialVersionUID = 1L;
  
  public static final String SESSION_PREFIX = "a";
  public static final String BASE_PATH = "/" + SESSION_PREFIX;
  public static final String PROXIED_SERVER_PARAM = CycConfigurationProperties.CYC_SERVER_PROPERTY;

  public static final String BOOKMARKED_TOOLS_WS_PATH = "/xml-bookmarked-tools";
  public static final String HISTORY_WS_PATH = "/xml-history";
  public static final String LOGIN_WS_PATH = "/xml-login";
  public static final String LOGOUT_WS_PATH = "/xml-logout";
  public static final String SERVER_DEFAULTS_WS_PATH = "/xml-server-defaults";
  public static final String SERVER_STATUS_WS_PATH = "/xml-server-status";
  public static final String TERM_COMPLETE_WS_PATH = "";
  public static final String TOOL_LIST_WS_PATH = "/xml-tools";
  
  public static final String TERM_COMPLETE_RETURN_ATTRS_PARAM = "return-attrs";
  public static final String TERM_COMPLETE_FILTER_PARAM = "filter";
  
  public static final String TERM_COMPLETE_DEFAULT_ACTION = "xml-complete";
  public static final String TERM_COMPLETE_DEFAULT_FILTER = "Mx4rvViA9JwpEbGdrcN5Y29ycA";
  public static final String TERM_COMPLETE_DEFAULT_QUERY_TYPE = "prefix";
  public static final TermCompleteReturnAttribute[] TERM_COMPLETE_DEFAULT_RETURN_ATTRS = null;
  
  private final LegacyCbApiURLS legacyURLs;
  
  private String sessionId = null;
}