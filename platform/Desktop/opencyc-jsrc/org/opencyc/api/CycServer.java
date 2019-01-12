package org.opencyc.api;

import java.io.Serializable;

public class CycServer extends Server implements Serializable {

  public CycServer(String hostName, int basePort) {
    super(hostName, (basePort < 100) ? 3600 + basePort : basePort);
  }

  protected CycServer() {
    // Used by GWT's serialization mechanism
  }
  
  
  // Static

  public static boolean isValidString(String string) {
    if (Server.isValidString(string)) {
      final Server server = Server.fromString(string);
      if (server.getPort() == null) {
        return false;
      }
      final String portString = server.getPort().toString();
      return (portString.length() == 1) || (portString.length() == 2) || (portString.length() == 4);
    }
    return false;
  }

  public static CycServer fromString(String string) {
    String tokens[] = string.split(":");
    return new CycServer(tokens[0], Integer.valueOf(tokens[1]));
  }
  
  /**
   * Attempt to guess the base port of a CycServer from an offset port. 
   * For example, given a port of 3654, we can somewhat safely guess that the
   * base port would be 3600.
   * @param port
   * @return 
   */
  public static Integer guessBasePortFromOffsetPort(final int port) {
    if ((port >= 3600) && (port <= 3699)) {
      final int suffix = port % 100;
      int image = suffix / 10 * 10;
      int offset = suffix % 10;
      if (suffix / 10 % 2 == 1) {
        image = image - 10;
        offset = offset + 10;
      }
      if ((offset == 0) || isAPortOffset(offset)) {
        return 3600 + image;
      }
    }
    return null;
  }
  
  private static boolean isAPortOffset(int offset) {
    return (offset == CYC_ASCII_PORT_OFFSET)
            || (offset == CYC_HTTP_PORT_OFFSET)
            || (offset == CYC_SERVLET_PORT_OFFSET)
            || (offset == CYC_CFASL_PORT_OFFSET);
  }
  
  
  // Public
  
  public void setBasePort(Integer basePort) {
    super.setPort(basePort);
  }

  public Integer getBasePort() {
    return super.getPort();
  }
  
  public Integer getAsciiPort() {
    return getBasePort() + asciiPortOffset;
  }
  
  public Integer getCfaslPort() {
    return getBasePort() + cfaslPortOffset;
  }

  public Integer getHttpPort() {
    return getBasePort() + httpPortOffset;
  }
  
  public Integer getServletPort() {
    return getBasePort() + servletPortOffset;
  }
  
  
  // Overridden
  
  @Override
  public boolean isDefined() {
    return super.isDefined() && (getPort() != null);
  }
  
  
  // Internal rep
  
  private static final long serialVersionUID = 1L;
  
  public static final int CYC_ASCII_PORT_OFFSET = 1;
  public static final int CYC_HTTP_PORT_OFFSET = 2;
  public static final int CYC_SERVLET_PORT_OFFSET = 3;
  public static final int CYC_CFASL_PORT_OFFSET = 14;
  
  // These normally shouldn't change, but can be easily overridden by CycConfiguration or an extending class
  protected int asciiPortOffset = CYC_ASCII_PORT_OFFSET;
  protected int cfaslPortOffset = CYC_CFASL_PORT_OFFSET;
  protected int httpPortOffset = CYC_HTTP_PORT_OFFSET;
  protected int servletPortOffset = CYC_SERVLET_PORT_OFFSET;
}
