/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public interface SubLStream extends SubLObject, CommonSymbols {

	public static String DEFAULT_NEWLINE = System.getProperty("line.separator");

	public static String DEFAULT_CHARSET_NAME = "ISO-8859-1";

	public static Charset DEFAULT_CHARSET = Charset.forName(SubLStream.DEFAULT_CHARSET_NAME);

	public static CharsetDecoder DEFAULT_CHARSET_DECODER = SubLStream.DEFAULT_CHARSET.newDecoder();

	public static String STREAM_TYPE_NAME = "STREAM";

	public void close();

	public SubLSymbol getDirection();

	public SubLSymbol getElementType();

	/** throws exception if not a file-descriptor or file-based stream */
	FileDescriptor getFD();

	/** throws exception if isRandomAccess() returns false */
	File getFile();

	/** throws exception if not a file-descriptor or file-based stream */
	long getFilePointer();

	public long getFlushCount();

	public String getNewline();

	public SubLList getStreams();

	public SubLSymbol getStreamSymbol();

	public SubLSymbol ifExists();

	public SubLSymbol ifNotExists();

	public boolean isClosed();

	public boolean isInteractive();

	boolean isMemoryMapped();

	boolean isRandomAccess();

	/** throws exception if not a file-descriptor or file-based stream */
	long length();

	/** throws exception if not a file-descriptor or file-based stream */
	void seek(long pos);

	public void setIsInteractive(boolean newValue);

	/** throws exception if not a file-descriptor or file-based stream */
	void setLength(long newLength);

	public void setNewline(String newline);
}
