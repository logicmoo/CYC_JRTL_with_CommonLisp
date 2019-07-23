/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.exception;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class ExceptionFactory {
	private static void verifyHandleable(Throwable t) {
		if (t != null && t instanceof Unhandleable)
			throw (Unhandleable) t;
	}

	public static SubLException makeException() {
		return new SubLException();
	}

	public static SubLException makeException(String str) {
		return new SubLException(str);
	}

	public static SubLException makeException(String str, Throwable t) {
		verifyHandleable(t);
		return new SubLException(str, t);
	}

	public static SubLException makeException(SubLString str) {
		return makeException(str.getStringValue());
	}

	public static SubLException makeException(SubLString str, Throwable t) {
		verifyHandleable(t);
		return makeException(str.getStringValue(), t);
	}
}
