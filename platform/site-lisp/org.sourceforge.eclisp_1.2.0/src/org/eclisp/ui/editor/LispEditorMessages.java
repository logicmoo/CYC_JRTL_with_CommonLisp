/*
 * Created on 01.05.2004
 *
 * 
 */
package org.eclisp.ui.editor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 *
 */
public class LispEditorMessages {
    
	private static final String BUNDLE_NAME = "org.eclisp.ui.editor.LispEditorMessages";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
