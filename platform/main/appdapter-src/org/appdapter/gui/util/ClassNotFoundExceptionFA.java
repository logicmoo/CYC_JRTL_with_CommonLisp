package org.appdapter.gui.util;
/**
 *  So we can tell when we've throw the ClassNotFoundException ourselves
 * @author Administrator
 *
 */
public class ClassNotFoundExceptionFA extends ClassNotFoundException {

	public ClassNotFoundExceptionFA(String m, Throwable e) {
		super(m, e);
	}

	public ClassNotFoundExceptionFA(String m) {
		super(m);
	}

	@Override public String getMessage() {
		String m = super.getMessage();
		if (m != null)
			return "Felix: " + m;
		return null;
	}

}
