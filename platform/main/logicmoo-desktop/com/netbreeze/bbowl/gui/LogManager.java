package com.netbreeze.bbowl.gui;

import org.apache.log4j.*;
import java.io.*;
import java.net.*;

/**
 * Manages logging configuration
 */
public class LogManager {
  public static String CONFIG_FILE_NAME="log4j.properties";
  public static long POLL_INTERVAL=10000L;

  public static void initLog4J() {
    File configFile = new File(CONFIG_FILE_NAME);
    if (configFile.exists()) {
      PropertyConfigurator.configureAndWatch(configFile.getName(), POLL_INTERVAL);
      Category.getInstance(LogManager.class).debug("Logging successfully initialized from " + configFile.getAbsoluteFile() + ". It will be automatically polled for updates every " + (POLL_INTERVAL / 1000) + " seconds.");
      return;
    }

    //If we get this far, then the config file was not found.
    //So now let's check the classpath.
    URL url = LogManager.class.getResource(CONFIG_FILE_NAME);
    if (url != null) {
      PropertyConfigurator.configure(url);
      Category.getInstance(LogManager.class).debug("Logging successfully initialized from " + url + ".");
      return;
    }

    BasicConfigurator.configure();
    Category.getInstance(LogManager.class).debug(CONFIG_FILE_NAME + " was not found in current directory or classpath, so logging has been initialized using Log4J defaults.");
  }

}