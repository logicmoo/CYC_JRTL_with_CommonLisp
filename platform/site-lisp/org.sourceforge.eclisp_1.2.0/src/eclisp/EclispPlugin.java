package eclisp;

import org.eclipse.ui.plugin.*;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.preferences.*;
import org.eclipse.ui.progress.*;
import org.eclipse.core.runtime.*;
import java.util.*;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.equinox.events.*;

/**
 * The main plugin class to be used in the desktop.
 */
public class EclispPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static EclispPlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	
	/**
	 * The constructor.
	 */
	@SuppressWarnings("deprecation")
	public EclispPlugin(IPluginDescriptor descriptor) {
		super(descriptor);
		plugin = this;
		try {
			resourceBundle   = ResourceBundle.getBundle("eclisp.EclispPluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	/**
	 * Returns the shared instance.
	 */
	public static EclispPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = EclispPlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
}
