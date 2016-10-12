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

//// Internal Imports

//// External Imports
import java.util.Deque;
import java.util.LinkedList;

public class SubLCommandHistory {

	//// Constructors

	private static int MAX_HISTORY = 250;

	//// Public Area

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private Deque<SubLCommandHistoryItem> history = new LinkedList<SubLCommandHistoryItem>();

	/** Creates a new instance of SubLCommandHistory. */
	public SubLCommandHistory() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public synchronized void add(SubLCommandHistoryItem item) {
		this.history.addFirst(item);
		if (this.history.size() > SubLCommandHistory.MAX_HISTORY)
			this.history.removeLast();
	}

	public synchronized void clearHistory() {
		this.history.clear();
	}

	//// Main

	public synchronized int size() {
		return this.history.size();
	}

}
