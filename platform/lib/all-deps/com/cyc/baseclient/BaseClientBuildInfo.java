package com.cyc.baseclient;

import java.io.IOException;

/**
 *
 * @author nwinant
 */
public class BaseClientBuildInfo extends BuildInfo {
  
  public BaseClientBuildInfo() throws IOException {
    super();
  }
  
  
  // Main
  
  public static void main(String[] args) {
    try {
      final BaseClientBuildInfo info = new BaseClientBuildInfo();
      info.printAll();
    } catch (Exception ex) {
      ex.printStackTrace();
      System.exit(1);
    } finally {
      System.exit(0);
    }
  }
}
