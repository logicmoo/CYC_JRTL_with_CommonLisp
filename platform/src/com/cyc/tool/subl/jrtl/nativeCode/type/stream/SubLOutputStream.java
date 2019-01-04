//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;

public interface SubLOutputStream extends SubLStream {
	void flush();

	String getStringOutput();

	boolean isStringOutputStream();

	void writePositiveIntegerAsByteSequence(long p0, int p1, boolean p2);
}
