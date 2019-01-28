//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

import org.armedbear.lisp.Stream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface SubLStream extends SubLObject {
	public static String DEFAULT_NEWLINE = System.getProperty("line.separator");
	public static String DEFAULT_CHARSET_NAME = "ISO-8859-1";
	public static Charset DEFAULT_CHARSET = Charset.forName("ISO-8859-1");
	public static CharsetDecoder DEFAULT_CHARSET_DECODER = SubLStream.DEFAULT_CHARSET.newDecoder();
	public static String STREAM_TYPE_NAME = "STREAM";

	void close();

	SubLSymbol getDirection();

	SubLSymbol getElementType();

	FileDescriptor getFD();

	File getFile();

	long getFilePointer();

	long getFlushCount();

	String getNewline();

	SubLList getStreams();

	SubLSymbol getStreamSymbol();

	SubLSymbol ifExists();

	SubLSymbol ifNotExists();

	boolean isClosed();

	boolean isInteractive();

	boolean isMemoryMapped();

	boolean isRandomAccess();

	long file_length();

	void seek(long p0);

	void setIsInteractive(boolean p0);

	void setLength(long p0);

	void setNewline(String p0);

	@Override
	Stream toLispObject();
}
