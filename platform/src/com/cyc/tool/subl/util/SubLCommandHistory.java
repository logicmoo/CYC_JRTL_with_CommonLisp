//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.Deque;
import java.util.LinkedList;

public class SubLCommandHistory {
	public SubLCommandHistory() {
		history = new LinkedList<SubLCommandHistoryItem>();
	}

	public static void main(String[] args) {
	}

	private Deque<SubLCommandHistoryItem> history;
	private static int MAX_HISTORY = 250;

	public synchronized void add(SubLCommandHistoryItem item) {
		history.addFirst(item);
		if (history.size() > 250)
			history.removeLast();
	}

	public synchronized void clearHistory() {
		history.clear();
	}

	public synchronized int size() {
		return history.size();
	}
}
