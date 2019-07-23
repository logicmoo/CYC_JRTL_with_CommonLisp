/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.exception;

public class Unhandleable extends SubLException {
	public Unhandleable() {
	}

	Unhandleable(String message) {
		super(message);
	}

	Unhandleable(String message, Throwable cause) {
		super(message, cause);
	}

	Unhandleable(Throwable cause) {
		super(cause);
	}
}
