package com.cyc.kb;

import java.io.IOException;
import org.opencyc.api.OpenCycBuildInfo;

/**
 *
 * @author nwinant
 */
public class KBAPIBuildInfo extends OpenCycBuildInfo {
  
  public KBAPIBuildInfo() throws IOException {
    super();
  }
  
  
  // Main
  
  public static void main(String[] args) {
    try {
      final KBAPIBuildInfo info = new KBAPIBuildInfo();
      info.printAll();
    } catch (Exception ex) {
      ex.printStackTrace();
      System.exit(1);
    } finally {
      System.exit(0);
    }
  }
}
