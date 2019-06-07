package org.opencyc.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author nwinant
 */
public class OpenCycBuildInfo extends Properties {
  
  public OpenCycBuildInfo() throws IOException {
    final InputStream is = getClass().getClassLoader().getResourceAsStream(getResourcePath());
    if (is == null) {
      throw new IOException("Could not load resource [" + getResourcePath() + "]");
    }
    load(is);
  }
  
  
  // Public
  
  public String getResourcePath() {
    return getClass().getPackage().getName().replace(".", System.getProperty("file.separator"))
            + "/BuildInfo.properties";
  }
  
  public void printAll() {
    final String header = "==  " + this.getClass().getSimpleName() + "  ===================================================";
    System.out.println(header);
    System.out.println("Resource Path: " + getResourcePath());
    List<String> keys = new ArrayList(stringPropertyNames());
    Collections.sort(keys);
    for (String key : keys) {
      System.out.println("  " + key + ": " + getProperty(key));
    }
    for (int i=0; i<header.length(); i++) {
      System.out.print("=");
    }
    System.out.println();
  }
  
  
  // Main
  
  public static void main(String[] args) {
    try {
      final OpenCycBuildInfo info = new OpenCycBuildInfo();
      info.printAll();
    } catch (Exception ex) {
      ex.printStackTrace();
      System.exit(1);
    } finally {
      System.exit(0);
    }
  }
}
