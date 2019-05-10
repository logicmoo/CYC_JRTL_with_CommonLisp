package org.appdapter.gui.swing;

/**
 * A GUI component that shows all the static methods for a given class,
 * and provides ways of executing these methods.
 *
 * 
 */
public class StaticMethodList extends MethodList {

	public StaticMethodList(Class cls) throws Exception {
		super(null, cls, true, false);
	}

}
