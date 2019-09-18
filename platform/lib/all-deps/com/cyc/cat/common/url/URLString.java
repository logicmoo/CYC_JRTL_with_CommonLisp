package com.cyc.cat.common.url;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * URLString provides a very simple, structured representation of a URL. 
 * All portions of the URL remain editable.
 * 
 * @author nwinant
 */
public class URLString implements Serializable {
  
  // Constructors
  
  public URLString(Protocol protocol, String host, Integer port, String path, List<Parameter> parameters) {
    this.protocol = protocol;
    this.host = host;
    this.port = port;
    this.path = path;
    if (parameters != null) {
      this.parameters.addAll(parameters);
    }
  }
  
  public URLString(Protocol protocol, String host, Integer port, String path) {
   this(protocol, host, port, path, null);
  }
  
  public URLString(Protocol protocol, String host, Integer port) {
    this(protocol, host, port, null);
  }
  
  public URLString(Protocol protocol, String host, String path) {
   this(protocol, host, null, path);
  }
  
  public URLString(String host, Integer port, String path) {
    this(DEFAULT_PROTOCOL, host, port, path);
  }
  
  public URLString(Protocol protocol, String host) {
   this(protocol, host, (Integer) null);
  }
  
  public URLString(String host, Integer port) {
    this(host, port, null);
  }
  
  public URLString(String host, String path) {
    this(host, (Integer) null, path);
  }
  
  public URLString(String host) {
    this(host, (Integer) null);
  }
  
  public static URLString makeRelativeURL(String path, List<Parameter> parameters) {
    return new URLString(null, null, null, path,  parameters);
  }
  
  public static URLString makeRelativeURL(String path) {
    return new URLString(null, null, null, path);
  }
  
  
  // Public
  
  public Protocol getProtocol() {
    return protocol;
  }

  public void setProtocol(Protocol protocol) {
    this.protocol = protocol;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }
  
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
  
  public List<Parameter> getParameters() {
    return this.parameters;
  }
  
  public List<String> getParameterNames() {
    final List<String> names = new ArrayList<String>();
    for (Parameter p : getParameters()) {
      names.add(p.getName());
    }
    return names;
  }
  
  public void addParameter(String name, Object value) {
    getParameters().add(new Parameter(name, value));
  }
  
  public Object[] getParametersAsNameAndValue() {
    ArrayList<Object> result = new ArrayList<Object>();
    for (Parameter param : getParameters()) {
      result.add(param.getName());
      result.add(param.getValue());
    }
    return result.toArray();
  }
  
  public boolean isRelative() {
    return (getProtocol() == null) || (getHost() == null);
  }
  
  public String getServer() {
    if (isRelative()) {
      return "";
    }
    return getProtocol() + "://"
            + ((getHost() != null) ? getHost() : "") 
            + ((getPort() != null) ? ":" + getPort() : "");
  }
  
  public String toURL(boolean buildQueryString) {
    return getServer()
            + (((getPath() != null) && getPath().startsWith("/")) ? "" : "/") 
            + ((getPath() != null) ? getPath() : "")
            + (buildQueryString ? buildQueryString() : "");
  }
  
  @Override
  public String toString() {
    return toURL(true);
  }
  
  
  // Protected
  
  protected String buildQueryString() {
    if (getParameters().isEmpty()) {
      return "";
    }
    final StringBuilder sb = new StringBuilder("?");
    for (Parameter param : getParameters()) {
      if (sb.length() > 1) {
        sb.append("&");
      }
      sb.append(param.valueOf());
    }
    return sb.toString();
  }
  
  
  // Private
  
  private static String encodeParam(String value) {
    // TODO: this should be an overridable instance method.
    StringBuilder resultStr = new StringBuilder();
    for (char ch : value.toCharArray()) {
      if (isUnsafe(ch)) {
        if (isSpace(ch)) {
          resultStr.append('+');
        } else {
          resultStr.append('%');
          resultStr.append(toHex(ch / 16));
          resultStr.append(toHex(ch % 16));
        }
      } else {
        resultStr.append(ch);
      }
    }
    return resultStr.toString();
  }

  private static char toHex(int ch) {
    return (char) (ch < 10 ? '0' + ch : 'A' + ch - 10);
  }

  private static boolean isUnsafe(char ch) {
    if (ch > 128 || ch < 0) {
      return true;
    }
    return " %$&+,/:;=?@<>#%".indexOf(ch) >= 0;
  }
  
  private static boolean isSpace(char ch) {
    return ch == 32;
  }
    
  
  // Classes
  
  public static class Protocol {
    final private String value;
    public Protocol(String value) {
      this.value = value;
    }
    public String getValue() { return this.value; }
    @Override public String toString() { return this.getValue(); }
    
    public static final Protocol HTTP = new Protocol("http");
    public static final Protocol HTTPS = new Protocol("https");
  }
    
  public static class Parameter {
    final private String name;
    final private Object value;
    public Parameter(String name, Object value) {
      this.name = name;
      this.value = value;
    }
    public String getName() { return this.name; }
    public Object getValue() { return this.value; }
    public String valueOf() {
      StringBuilder sb = new StringBuilder().append(encodeParam(name)).append("=");
      if (value != null) {
        sb.append(encodeParam(value.toString()));
      }
      return sb.toString();
    }
  }
  
  /**
   * This exists to support undisciplined querystringin' behavior. E.g.:
   * http://localhost:3603/cgi-bin/cyccgi/cg/cgi-bin/cyccgi/cg?xml-complete&filter=Mx4rvViA9JwpEbGdrcN5Y29ycA&prefix=dog
   * 
   * @deprecated
   */
  public static class UnvaluedParameter extends Parameter {
    public UnvaluedParameter(String name) {
      super(name, name);
    }
    @Override
    public String valueOf() {
      return new StringBuilder().append(encodeParam(getName())).toString();
    }
  }
  
  // Internal
  
  private static final long serialVersionUID = 1L;
  
  public static final Protocol DEFAULT_PROTOCOL = Protocol.HTTP;
  
  private final List<Parameter> parameters = new ArrayList<Parameter>();
  private Protocol protocol;
  private String host;
  private Integer port;
  private String path;
}
