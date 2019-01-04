//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;

public interface SubLInputTextStream extends SubLInputStream, SubLInputBinaryStream {
	int readChar();

	int readChar(char[] p0);

	int readChar(char[] p0, int p1, int p2);

	boolean ready();

	@Override
	long skip(long p0);

	@Override
	void unread(int p0);
}
