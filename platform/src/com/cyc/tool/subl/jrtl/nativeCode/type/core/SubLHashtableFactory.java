//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Comparator;
import java.util.Map;

public interface SubLHashtableFactory {
	Map createMap(Comparator c);

	Map createMap(Comparator c, int p0);

	Map createMap(Comparator c, int p0, float p1);
}
