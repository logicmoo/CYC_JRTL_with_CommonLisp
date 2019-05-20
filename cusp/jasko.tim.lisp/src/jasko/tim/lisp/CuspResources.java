package jasko.tim.lisp;

import java.net.*;
import java.util.*;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.*;
import org.eclipse.swt.graphics.Image;

/**
 * The jasko.tim.lisp container class for the plugin's resources (images,
 * strings, etc.)
 */
public class CuspResources {
	public static final String DEFPACKAGE = "defpackage"; //$NON-NLS-1$
	public static final String LOAD_PACKAGE = "load-package"; //$NON-NLS-1$

	public static final String DEFOTHER = "defother"; //$NON-NLS-1$
	public static final String OTHER = "other"; //$NON-NLS-1$
	public static final String SORT_ALPHA = "sort-alpha"; //$NON-NLS-1$
	public static final String SORT_TYPE = "sort-type"; //$NON-NLS-1$
	public static final String SORT_POSITION = "sort-position"; //$NON-NLS-1$
	public static final String ERROR = "error"; //$NON-NLS-1$
	public static final String WARNING = "warning"; //$NON-NLS-1$
	public static final String RECONNECT = "reconnect"; //$NON-NLS-1$
	public static final String DISCONNECTED = "disconnected"; //$NON-NLS-1$
	public static final String CLEAR = "clear"; //$NON-NLS-1$
	public static final String THREAD_DEBUG = "thread-debug"; //$NON-NLS-1$
	public static final String THREAD_KILL = "thread-kill"; //$NON-NLS-1$
	public static final String REFRESH = "refresh"; //$NON-NLS-1$
	public static final String FORWARD_NAV = "forward-nav"; //$NON-NLS-1$
	public static final String BACKWARD_NAV = "backward-nav"; //$NON-NLS-1$
	public static final String RUN_TESTS = "run-tests"; //$NON-NLS-1$
	public static final String STEP = "step"; //$NON-NLS-1$
	public static final String EXEC = "exec"; //$NON-NLS-1$

	private final static String[][] keywordImageArray = {
		{ "defclass", "defclass.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defcomponent", "defclass.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defconstant", "defconstant.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defgeneric", "defgeneric.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defmacro", "defmacro.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defmethod", "defmethod.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ DEFPACKAGE, "defpackage.gif" }, //$NON-NLS-1$
		{ LOAD_PACKAGE, "load-package.gif" }, //$NON-NLS-1$
		{ "defsystem", "defsystem.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defparameter", "defparameter.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defstruct", "defstruct.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "deftype", "deftype.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defun", "defun.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defaction", "defaction.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "defvar", "defvar.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "define-condition", "define-condition.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "define-alien-routine", "define-alien-routine.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "define-alien-variable", "define-alien-variable.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "define-alien-type", "define-alien-type.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "lambda", "lisp-nature.gif" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "in-package", "in-package.gif" } //$NON-NLS-1$ //$NON-NLS-2$
	};
	
	/**
	 * Type typewords associated with icons
	 * @see getImageForType()
	 */
	private static final Set<String> typewords = Collections.synchronizedSet(new HashSet<String>());
	
	/**
	 * The strings resource bundle
	 */
	private static ResourceBundle bundle = null;

	static {
		try {
			bundle = ResourceBundle.getBundle("jasko.tim.lisp.messages"); //$NON-NLS-1$
		} catch (MissingResourceException e) {
			bundle = null;
		}
		
		ImageRegistry imageReg = LispPlugin.getDefault().getImageRegistry();

		// Put all of the type keywords into the typeword set:
		// (Note: If you define a new type keyword that is associated with an
		// image, you need to add it here and also to the image registry below!)

		for (String[] keyw_image : keywordImageArray) {
		  typewords.add(keyw_image[0]);
		  imageReg.put(keyw_image[0], loadImageDescriptor(keyw_image[1]));
		}
	
		// Everything else:
		imageReg.put(DEFOTHER, loadImageDescriptor("defother.gif")); //$NON-NLS-1$
		imageReg.put(OTHER, loadImageDescriptor("other.gif")); //$NON-NLS-1$
		imageReg.put(SORT_ALPHA, loadImageDescriptor("sort-alpha.gif")); //$NON-NLS-1$
		imageReg.put(SORT_TYPE, loadImageDescriptor("sort-type.gif")); //$NON-NLS-1$
		imageReg.put(SORT_POSITION, loadImageDescriptor("sort-position.gif")); //$NON-NLS-1$
		
		imageReg.put(ERROR, loadImageDescriptor("error.gif")); //$NON-NLS-1$
		imageReg.put(WARNING, loadImageDescriptor("warning.gif")); //$NON-NLS-1$
		
		imageReg.put(RECONNECT, loadImageDescriptor("reconnect.gif")); //$NON-NLS-1$
		imageReg.put(DISCONNECTED, loadImageDescriptor("disconnected.gif")); //$NON-NLS-1$
		
		imageReg.put(CLEAR, loadImageDescriptor("clear.gif")); //$NON-NLS-1$
		
		imageReg.put(THREAD_DEBUG, loadImageDescriptor("thread-debug.gif")); //$NON-NLS-1$
		imageReg.put(THREAD_KILL, loadImageDescriptor("thread-kill.gif")); //$NON-NLS-1$
		imageReg.put(REFRESH, loadImageDescriptor("refresh.gif")); //$NON-NLS-1$
		imageReg.put(FORWARD_NAV, loadImageDescriptor("forward-nav.gif")); //$NON-NLS-1$
		imageReg.put(BACKWARD_NAV, loadImageDescriptor("backward-nav.gif")); //$NON-NLS-1$
		
		imageReg.put(STEP, loadImageDescriptor("step.gif")); //$NON-NLS-1$
		imageReg.put(EXEC, loadImageDescriptor("exec-lisp.gif")); //$NON-NLS-1$
		imageReg.put(RUN_TESTS, loadImageDescriptor("run-tests.gif")); //$NON-NLS-1$
	}
	
	
	public static Image getImageForType(String type) {
		type = type.replace("(", "").toLowerCase(); //$NON-NLS-1$ //$NON-NLS-2$
		if (typewords.contains(type)) {
			return getImage(type);
		} else if (type.startsWith("def")) { //$NON-NLS-1$
			// Defining something, but it doesn't match a type keyword...
			return getImage(DEFOTHER);
		} else {
			return getImage(OTHER);
		}
	}
	
	public static Image getImage(String id) {
		ImageRegistry ir = LispPlugin.getDefault().getImageRegistry(); 
		return ir.get(id);
	}
	
	public static ImageDescriptor getImageDescriptor(String id) {
		ImageRegistry ir = LispPlugin.getDefault().getImageRegistry();
		return ir.getDescriptor(id);
	}
	
	/**
	 * Loads an ImageDescriptor from a file in the icons directory
	 * 
	 * @param name - name of the file to be loaded
	 * @return An ImageDescriptor representing the image in the file
	 */
	private static ImageDescriptor loadImageDescriptor(String name) {
		try {
			 URL installURL = Platform.getBundle("jasko.tim.lisp").getEntry("/"); //$NON-NLS-1$ //$NON-NLS-2$
			 URL url = new URL(installURL, "icons/" + name); //$NON-NLS-1$
			 return ImageDescriptor.createFromURL(url);
		} catch (MalformedURLException e) {
			 // should not happen
			 return ImageDescriptor.getMissingImageDescriptor();
		}
	}

	/**
	 * Look up strings in the resource bundle, return the value corresponding
	 * to the key.
	 * @param key The resource to look up
	 * @return The resource's value, !key! if not found or +key+ if the
	 * resource bundle does not exist or cannot be accessed.
	 */
	public static String getString(String key) {
		if (bundle != null) {
	        try {
	              return bundle.getString(key);
	        } catch (MissingResourceException e) {
	              return "!" + key + "!"; //$NON-NLS-1$ //$NON-NLS-2$
	        }
		} else
			return "+" + key + "+"; //$NON-NLS-1$ //$NON-NLS-2$
  }
}
