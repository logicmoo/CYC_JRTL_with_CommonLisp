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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public  class SubLInOutTextStreamImpl 
  extends AbstractSubLTextStream 
  implements SubLInOutTextStream, SubLOutputTextStream, SubLInputTextStream, CommonSymbols {
  
  //// Constructors
  
  protected SubLInOutTextStreamImpl() {
    super(TEXT_KEYWORD, IO_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInOutTextStreamImpl(SubLInputTextStream inStream, SubLOutputTextStream outStream) {
    super(TEXT_KEYWORD, IO_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.inStream = inStream;
    this.outStream = outStream;
    if ((inStream == null) || (outStream == null)) {
      Errors.error("Unable to create in/out stream.");
    }
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInOutTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(filename, TEXT_KEYWORD, IO_KEYWORD, ifExists, ifNotExists);
  }

  //// Public Area
  
  public final SubLStream getStream(boolean followSynonymStream) {
    return this;
  }
  
  /** Method created to avoid casting */
  public final SubLInputStream toInputStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return inStream;
  }
  /** Method created to avoid casting */
  public final SubLInputTextStream toInputTextStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return inStream;
  }
  /** Method created to avoid casting */
  public final SubLInputBinaryStream toInputBinaryStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return inStream;
  }
  /** Method created to avoid casting */
  public final SubLOutputStream toOutputStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return outStream;
  }
  /** Method created to avoid casting */
  public final SubLOutputTextStream toOutputTextStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return outStream;
  }
  /** Method created to avoid casting */
  public final SubLOutputBinaryStream toOutputBinaryStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return outStream;
  }
  
  public final int readByteSequenceToString(SubLString str) {
    ensureOpen("readByteSequenceToString");
    if (shouldParentDoWork()) {
      return super.readByteSequenceToString(str);
    }
    return toInputBinaryStream().readByteSequenceToString(str);
  }
  
  public final long readByteSequenceToPositiveInteger(int bytesInInteger) {
    ensureOpen("readByteSequenceToString");
    if (shouldParentDoWork()) {
      return super.readByteSequenceToPositiveInteger(bytesInInteger);
    }
    return toInputBinaryStream().readByteSequenceToPositiveInteger(bytesInInteger);
  }
  
  public synchronized void close() {
    ensureOpen("close");
    if (shouldParentDoWork()) {
      super.close();
      return;
    }
    if (isClosed()) { return; }
    super.close();
    try {
      try {
        if (outStream != null) {
          outStream.close();
        }
      } finally {
        if (inStream != null) {
          inStream.close();
        }
      }
    } catch (Exception e) {
      Errors.error("Unable to close stream.", e);
    }
  }
  
  public final boolean ready() {
    ensureOpen("ready");
    if (shouldParentDoWork()) {
      return super.ready();
    }
    return toInputTextStream().ready();
  }
  
  public final int readChar() {
    ensureOpen("readChar");
    if (shouldParentDoWork()) {
      return super.readChar();
    }
    return toInputTextStream().readChar();
  }
   
  public final int readChar(char[] b) {
    ensureOpen("readChar");
    if (shouldParentDoWork()) {
      return super.readChar(b);
    }
    return toInputTextStream().readChar(b);
  }
   
  public final int readChar(char[] b, int off, int len) {
    ensureOpen("readChar");
    if (shouldParentDoWork()) {
      return super.readChar(b, off, len);
    }
    return toInputTextStream().readChar(b, off, len);
  }
   
  public final long skip(long n) {
    ensureOpen("skip");
    if (shouldParentDoWork()) {
      return super.skip(n);
    }
    return toInputTextStream().skip(n);
  }
  
  public final void unread(int c) {
    ensureOpen("unread");
    if (shouldParentDoWork()) {
      super.unread(c);
      return;
    }
    toInputTextStream().unread(c);
  }
  
  public final void flush() {
    ensureOpen("flush");
    if (shouldParentDoWork()) {
      super.flush();
      return;
    }
    toOutputTextStream().flush();
  }
  
  public final void writeChar(char b) {
    ensureOpen("writeChar");
    if (shouldParentDoWork()) {
      super.writeChar(b);
      return;
    }
    toOutputTextStream().writeChar(b);
  }
  
  public final void writeChar(char[] b) {
    ensureOpen("writeChar");
    if (shouldParentDoWork()) {
      super.writeChar(b);
      return;
    }
    toOutputTextStream().writeChar(b);
  }
  
  public final void writeChar(char[] b, int off, int len) {
    ensureOpen("writeChar");
    if (shouldParentDoWork()) {
      super.writeChar(b, off, len);
      return;
    }
    toOutputTextStream().writeChar(b, off, len);
  }
  
  public final void writeString(String str) {
    ensureOpen("writeString");
    if (shouldParentDoWork()) {
      super.write(str);
      return;
    }
    toOutputTextStream().writeString(str);
  }
  
  public final void writeString(String str, int off, int len) {
    ensureOpen("writeString");
    if (shouldParentDoWork()) {
      super.write(str, off, len);
      return;
    }
    toOutputTextStream().writeString(str, off, len);
  }
  
  @Override
  public void writeNewline() {
    toOutputTextStream().writeNewline();
  }

  @Override
  public boolean freshLine() {
    return toOutputTextStream().freshLine();
  }

  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  protected SubLInputTextStream inStream;
  protected SubLOutputTextStream outStream;

  //// Main
  
}
