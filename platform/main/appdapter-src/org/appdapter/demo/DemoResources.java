package org.appdapter.demo;

import org.slf4j.LoggerFactory;
import java.net.URL;
import org.slf4j.Logger;

public class DemoResources
{
    static Logger theLogger;
    public static String OPTIONAL_ABSOLUTE_ROOT_PATH;
    public static String DEMOCONF_ROOT_PATH;
    public static String STORE_CONFIG_PATH;
    public static String DATA_PATH;
    public static String QUERY_PATH;
    public static String MENU_ASSEMBLY_PATH;
    
    public static String makeURLforClassNeighborResPath_JenaFMCantUseButModelReaderCan(final Class neighbor, final String resURL_path) {
        if (!resURL_path.startsWith("/")) {
            DemoResources.theLogger.warn("Relative path class.getResource(" + resURL_path + ") will receive converted package prefix for: " + neighbor.getPackage().getName());
        }
        final URL resURL = neighbor.getResource(resURL_path);
        DemoResources.theLogger.debug(neighbor.toString() + " resolved " + resURL_path + " to " + resURL);
        return resURL.toString();
    }
    
    public static String makeURLforClassLoaderResPath_JenaFMCantUseButModelReaderCan(final ClassLoader classLoader, final String resURL_path) {
        final URL resURL = classLoader.getResource(resURL_path);
        DemoResources.theLogger.debug(classLoader.toString() + " resolved " + resURL_path + " to " + resURL);
        return resURL.toString();
    }
    
    static {
        DemoResources.theLogger = LoggerFactory.getLogger((Class)DemoResources.class);
        DemoResources.OPTIONAL_ABSOLUTE_ROOT_PATH = "";
        DemoResources.DEMOCONF_ROOT_PATH = DemoResources.OPTIONAL_ABSOLUTE_ROOT_PATH + "org/appdapter/democonf";
        DemoResources.STORE_CONFIG_PATH = DemoResources.DEMOCONF_ROOT_PATH + "/store/appdemo_sdb_h2.ttl";
        DemoResources.DATA_PATH = DemoResources.DEMOCONF_ROOT_PATH + "/owl/snazzy.owl";
        DemoResources.QUERY_PATH = DemoResources.DEMOCONF_ROOT_PATH + "/sparql/query_stuff.sparql";
        DemoResources.MENU_ASSEMBLY_PATH = DemoResources.DEMOCONF_ROOT_PATH + "/app/boxdemo/boxy_001.ttl";
    }
}

/*

	Total time: 31 ms
	
*/