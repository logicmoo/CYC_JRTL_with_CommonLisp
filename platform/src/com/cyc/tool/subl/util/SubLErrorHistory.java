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

package com.cyc.tool.subl.util;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

//// Internal Imports

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;

public class SubLErrorHistory {

	//// Constructors

	private static int MAX_HISTORY = 100;

	//// Public Area

	public static SubLErrorHistory me = new SubLErrorHistory();

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private Deque<SubLException> history = new LinkedList<SubLException>();

	/** Creates a new instance of SubLCommandHistory. */
	SubLErrorHistory() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public synchronized void add(SubLException item) {
		this.history.addFirst(item);
		if (this.history.size() > SubLErrorHistory.MAX_HISTORY)
			this.history.removeLast();
	}

	public synchronized void clearHistory() {
		this.history.clear();
	}

	public synchronized ArrayList<SubLString> getAllErrors() {
		ArrayList<SubLString> result = new ArrayList<SubLString>(this.history.size());
		for (SubLException e : this.history)
			result.add(SubLObjectFactory.makeString(SubLException.getStringForException(e)));
		return result;
	}

	//// Main

	public synchronized int size() {
		return this.history.size();
	}

}
