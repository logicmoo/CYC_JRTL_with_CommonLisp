/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.exception;

//// Internal Imports

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

//// External Imports

public class ExceptionFactory {

	//// Constructors

	public static SubLException makeException() {
		return new SubLException();
	}

	//// Public Area

	public static SubLException makeException(String str) {
		return new SubLException(str);
	}

	public static SubLException makeException(String str, Throwable t) {
		ExceptionFactory.verifyHandleable(t);
		return new SubLException(str, t);
	}

	public static SubLException makeException(SubLString str) {
		return ExceptionFactory.makeException(str.getString());
	}

	public static SubLException makeException(SubLString str, Throwable t) {
		ExceptionFactory.verifyHandleable(t);
		return ExceptionFactory.makeException(str.getString(), t);
	}

	private static void verifyHandleable(Throwable t) {
		if (t != null && t instanceof Unhandleable)
			throw (Unhandleable) t;
	}

	//// Protected Area

	//// Private Area

	/** Creates a new instance of ExceptionFactory. */
	private ExceptionFactory() {
	}

	//// Internal Rep

	//// Main

}
