/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

public interface SubLOutputBinaryStream extends SubLOutputStream {
	void write(byte[] p0);

	void write(byte[] p0, int p1, int p2);

	void write(int p0);

	@Override
	void writePositiveIntegerAsByteSequence(long p0, int p1, boolean p2);
}
