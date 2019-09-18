package com.cyc.cat.common.url;

import com.cyc.cat.common.url.URLString.Parameter;
import com.cyc.cat.common.url.URLString.Protocol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nwinant
 */
abstract public class BaseURLStringLibrary implements Serializable {
  
  // Constructors
  
  public BaseURLStringLibrary(Protocol protocol, String host, Integer port) {
    this.protocol = protocol;
    this.host = host;
    this.port = port;
  }
  
  public BaseURLStringLibrary(String host, Integer port) {
    this(URLString.DEFAULT_PROTOCOL, host, port);
  }
  
  public BaseURLStringLibrary() {
    this(null, null, null);
  }
  
  
  // Public
  
  public URLString getServiceStatus() {
    return makeURL(STATUS_PATH);
  }
  
  public URLString getServiceConfig() {
    return makeURL(CONFIG_PATH);
  }
  
  
  // Protected
  
  abstract protected String getBasePath();
  
  protected String makeAbsolutePath(String relativePath) { return getBasePath() + relativePath; }
  
  protected URLString makeURL(String relativePath) {
    return new URLString(protocol, host, port, makeAbsolutePath(relativePath));
  }
  
  protected URLString makeURL(String relativePath, Parameter... parameters) {
    return new URLString(protocol, host, port, makeAbsolutePath(relativePath), Arrays.asList(parameters));
  }
  
  protected void addGlobalParameter(String name, Object value) {
    globalParams.put(name, value);
  }
  
  protected Object getGlobalParameter(String name) {
    return globalParams.get(name);
  }
  
  protected List<String> getGlobalParameterNames() {
    final List<String> names = new ArrayList<String>(globalParams.keySet());
    Collections.sort(names);
    return names;
  }
  
  protected URLString applyGlobalParameters(URLString url) {
    for (String name : getGlobalParameterNames()) {
      if (globalParams.get(name) != null) {
        url.addParameter(name, globalParams.get(name));
      }
    }
    return url;
  }
  
  protected Protocol getProtocol() { return this.protocol; }
  protected String getHost() { return this.host; }
  protected int getPort() { return this.port; }
  
  
  // Internal
  
  private static final long serialVersionUID = 1L;
  
  static final public String STATUS_PATH = "/service/status";
  static final public String CONFIG_PATH = "/service/status/config";
  
  final private Protocol protocol;
  final private String host;
  final private Integer port;
  final private Map<String,Object> globalParams = new HashMap<String,Object>();
}
