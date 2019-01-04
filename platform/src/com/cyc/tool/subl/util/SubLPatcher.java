//
// For LarKC
//
package com.cyc.tool.subl.util;

public interface SubLPatcher {
	void doPatch();

	String[] getPatchedClasses();

	long getPatchOrdering();
}
