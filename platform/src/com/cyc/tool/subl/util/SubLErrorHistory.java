//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;

public class SubLErrorHistory {
	SubLErrorHistory() {
		history = new LinkedList<SubLException>();
	}

	public static void main(String[] args) {
	}

	private Deque<SubLException> history;
	private static int MAX_HISTORY = 100;
	public static SubLErrorHistory me;
	static {
		me = new SubLErrorHistory();
	}

	public synchronized void add(SubLException item) {
		history.addFirst(item);
		if (history.size() > 100)
			history.removeLast();
	}

	public synchronized void clearHistory() {
		history.clear();
	}

	public synchronized ArrayList<SubLString> getAllErrors() {
		ArrayList<SubLString> result = new ArrayList<SubLString>(history.size());
		for (SubLException e : history)
			result.add(SubLObjectFactory.makeString(SubLException.getStringForException(e)));
		return result;
	}

	public synchronized int size() {
		return history.size();
	}
}
