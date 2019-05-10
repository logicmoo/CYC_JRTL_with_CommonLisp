package org.appdapter.gui.browse;

import java.util.LinkedList;

public class UtilityBoot {

	protected static void runLoadComplete() {
		LinkedList<Runnable> todo = new LinkedList<Runnable>();
		synchronized (Utility.onLoadComplete) {
			Utility.isLoadComplete = true;
			todo.addAll(Utility.onLoadComplete);
			Utility.onLoadComplete.clear();
		}
		for (Runnable td : todo) {
			Utility.runTask(td);
		}
	
	}

}
