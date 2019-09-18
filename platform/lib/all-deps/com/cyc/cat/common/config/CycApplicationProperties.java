/* $Id: CycApplicationProperties.java 141091 2012-08-13 20:40:54Z nwinant $
 *
 * Copyright (c) 2010 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package com.cyc.cat.common.config;

//// Internal Imports

//// External Imports
import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


/** 
 * <P>ConfigurationProperties is a Properties file which, upon instantiation,
 * looks for a CycApplication.properties file and populates itself with the
 * contents.
 *
 * <P>Copyright (c) 2010 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : Dec 3, 2010, 4:31:03 PM
 * Author     : nwinant
 * @version $Id: CycApplicationProperties.java 141091 2012-08-13 20:40:54Z nwinant $
 */
public class CycApplicationProperties extends Properties {

  //// Constructors

  /** Creates a new instance of ConfigurationProperties. */
  public CycApplicationProperties(final String configurationResourcesPath, final boolean loadDefaults) {
    super();
    this.configurationResourcesPath = configurationResourcesPath;
    if (loadDefaults) {
      loadResourcePath(getDefaultConfigurationResourcesPath(), false, true);
    }
    if (!loadDefaults || !getDefaultConfigurationResourcesPath().equals(getConfigurationResourcesPath())) {
      loadResourcePath(getConfigurationResourcesPath(), true, true);
    }
  }
  
  public CycApplicationProperties(final String configurationResourcesPath) {
    this(configurationResourcesPath, true);
  }
  
  public CycApplicationProperties(final boolean loadDefaults) {
    this(null, loadDefaults);
  }
  
  public CycApplicationProperties() {
    this(null);
  }
  
  
  //// Public Area
  
  public ResourceBundle getConfigurationBundle(String resourcePath) {
    return ResourceBundle.getBundle(resourcePath);
  }

  public ResourceBundle getLocalConfigurationBundle(String resourcePath) {
    return ResourceBundle.getBundle(resourcePath + CONFIG_RESOURCES_PATH_LOCAL_SUFFIX);
  }
  
  public void loadResourceBundle(ResourceBundle resource) {
    Enumeration<String> keys = resource.getKeys();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      put(key, resource.getString(key));
    }
  }
  
  public void loadResourcePath(String resourcePath, boolean isRequired, boolean loadLocalVersion) {
    try {
      logger.log(Level.WARNING, "Loading {0}.properties ...", resourcePath);
      loadResourceBundle(getConfigurationBundle(resourcePath));
    } catch (MissingResourceException mre) {
      if (isRequired) {
        throw mre;
      } else {
        logger.log(Level.WARNING, "... Could not find {0}.properties", resourcePath);
      }
    }
    if (loadLocalVersion) {
      try {
        logger.log(Level.WARNING, "Loading {0}{1}.properties", new Object[] {resourcePath, CONFIG_RESOURCES_PATH_LOCAL_SUFFIX});
        loadResourceBundle(getLocalConfigurationBundle(resourcePath));
      } catch (MissingResourceException mre) {
        logger.log(Level.WARNING, "... Could not find {0}{1}.properties", new Object[] {resourcePath, CONFIG_RESOURCES_PATH_LOCAL_SUFFIX});
      }
    }
  }
  
  public CycApplicationProperties loadSystemProperties() {
    for (Object key : System.getProperties().keySet()) {
      put(key, System.getProperty(key.toString()));
    }
    return this;
  }
  
  
  //// Protected Area

  protected String getDefaultConfigurationResourcesPath() {
    return DEFAULT_CONFIG_RESOURCES_PATH;
  }
  
  protected String getConfigurationResourcesPath() {
    if (configurationResourcesPath != null) {
      return configurationResourcesPath;
    }
    return getConfigurationFileName();
  }
  
  protected String getConfigurationFileName() {
    String name = this.getClass().getSimpleName();
    if (name.endsWith("Properties")) {
      return name.substring(0, name.length() - 10);
    }
    return name;
  }
  
  
  //// Internal Rep

  private static final long serialVersionUID = 1L;
  private static final String DEFAULT_CONFIG_RESOURCES_PATH = "CycApplication";
  private static final String CONFIG_RESOURCES_PATH_LOCAL_SUFFIX = "_local";
  private final String configurationResourcesPath;
  protected Logger logger = Logger.getLogger(CycApplicationProperties.class.getCanonicalName());//LoggerFactory.getLogger(this.getClass().getCanonicalName());
}
