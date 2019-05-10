package org.appdapter.gui.api;


import org.appdapter.api.trigger.UserResult;
import org.appdapter.gui.util.Annotations.UIProvider;

public interface IShowObjectMessageAndErrors extends UIProvider {

	/**
	 * Displays the given error message somehow
	 */
	UserResult showError(String msg, Throwable error);

	/**
	 * Opens up a GUI to show the details of the given value
	 */
	UserResult showScreenBox(String title, Object value) throws Exception;

	/**
	 * Opens up a GUI to show the details of the given value
	 */
	UserResult showScreenBox(Object value) throws Exception;

	/**
	 * Displays the given information message somehow
	 */
	UserResult showMessage(String string, Class extraClassInfo);

	UserResult addObject(String title, Object anyObject, boolean showASAP, boolean expandChildren);

}
