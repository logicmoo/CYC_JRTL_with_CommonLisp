/*
 * Created on 19.04.2004
 *
 * 
 */
package org.eclisp.ui.editor;

import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclisp.ui.editor.util.LispColorProvider;


/**
 * @author soul
 *
 */
public class LispEditorEnvironment {
    	
    private static LispColorProvider colorProvider;
    private static LispCodeScanner codeScanner;
    
    private static int refCount= 0;
    
	/**
	 * A connection has occured - initialize the receiver if it is the first activation.
	 */
	public static void connect(Object client) {
		if (++refCount == 1) {
			colorProvider= new LispColorProvider();
			codeScanner= new LispCodeScanner(colorProvider);
		}
	}
	
	/**
	 * A disconnection has occured - clear the receiver if it is the last deactivation.
	 */
	 public static void disconnect(Object client) {
		if (--refCount == 0) {
			codeScanner= null;
			colorProvider.dispose();
			colorProvider= null;
		}
	}
	
	/**
	 * Returns the singleton scanner.
	*/ 
	 public static RuleBasedScanner getLispCodeScanner() {
		return codeScanner;
	}
		 
	/**
	 * Returns the singleton color provider.
	 */
	 public static LispColorProvider getLispColorProvider() {
		return colorProvider;
	}

}
