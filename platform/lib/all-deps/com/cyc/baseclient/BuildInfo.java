package com.cyc.baseclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author nwinant
 */
abstract public class BuildInfo extends Properties {
  
  public BuildInfo() throws IOException {
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
  
  public void printAll(PrintStream out) {
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
  
  public void printAll() {
    printAll(System.out);
  }
}
