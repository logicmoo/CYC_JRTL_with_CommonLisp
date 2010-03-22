package eu.larkc.core.pluginManager.local;

import java.util.Properties;
import eu.larkc.plugin.Contract;

/**
 * A simple contract object that is serialisable and *NOT* declared
 * as an anonymous inner class of some plug-in manager (which requires
 * all the wrapping classes to be serialisable as well).
 */
public class SimpleContract extends Properties implements Contract {
}
