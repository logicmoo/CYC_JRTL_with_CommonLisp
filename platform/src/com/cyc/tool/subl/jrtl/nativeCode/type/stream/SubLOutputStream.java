/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.Flushable;

public interface SubLOutputStream extends SubLStream /*, maybe? Appendable, Flushable */ {
	void flush();

	String getStringOutput();

	boolean isStringOutputStream();

	void writePositiveIntegerAsByteSequence(long p0, int p1, boolean p2);
}
