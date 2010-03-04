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

package  com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

//// Internal Imports

//// External Imports

public  interface SubLStream extends SubLObject, CommonSymbols {
  
  public void close();
  public boolean isClosed();
  public SubLSymbol getElementType();
  public SubLSymbol getDirection();
  public SubLSymbol ifExists();
  public SubLSymbol ifNotExists();
  public boolean isInteractive();
  public void setIsInteractive(boolean newValue);
  public String getNewline();
  public void setNewline(String newline);
  public long getFlushCount();

  public SubLList getStreams();
  public SubLSymbol getStreamSymbol();
  
  boolean isRandomAccess();
  
  /** throws exception if not a file-descriptor or file-based stream */
  long getFilePointer();
  /** throws exception if not a file-descriptor or file-based stream */ 
  void seek(long pos);
  /** throws exception if not a file-descriptor or file-based stream */ 
  long length();
  /** throws exception if not a file-descriptor or file-based stream */
  void setLength(long newLength);
  /** throws exception if not a file-descriptor or file-based stream */
  FileDescriptor getFD();
  /** throws exception if isRandomAccess() returns false */
  File getFile();
  
  public static final String DEFAULT_NEWLINE = System.getProperty("line.separator");
  public static final String DEFAULT_CHARSET_NAME = "ISO-8859-1";
  public static final Charset DEFAULT_CHARSET = Charset.forName(DEFAULT_CHARSET_NAME);
  public static final CharsetDecoder DEFAULT_CHARSET_DECODER = DEFAULT_CHARSET.newDecoder();
  public static final String STREAM_TYPE_NAME = "STREAM";
}
