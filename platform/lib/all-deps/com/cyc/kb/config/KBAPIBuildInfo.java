package com.cyc.kb.config;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.baseclient.BuildInfo;
import java.io.IOException;

/**
 *
 * @author nwinant
 */
public class KBAPIBuildInfo extends BuildInfo {
  
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
