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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  final class SubLInOutBinaryStreamImpl 
  extends AbstractSubLBinaryStream 
  implements SubLInOutBinaryStream, SubLInputBinaryStream, SubLOutputBinaryStream, CommonSymbols {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInOutBinaryStreamImpl(SubLInputBinaryStream inStream, SubLOutputBinaryStream outStream) {
    super(BINARY_KEYWORD, IO_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.inStream = inStream;
    this.outStream = outStream;
    if ((inStream == null) || (outStream == null)) {
      Errors.error("Unable to create in/out stream.");
    }
    init();
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInOutBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(filename, BINARY_KEYWORD, IO_KEYWORD, ifExists, ifNotExists);
    init();
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
  public final SubLOutputBinaryStream toOutputBinaryStream() {
    if (shouldParentDoWork()) {
      return this;
    }
    return outStream;
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
      if (inStream != null) {
        inStream.close();
        inStream = null;
      }
      if (outStream != null) {
        outStream.close();
        outStream = null;
      }
    } catch (Exception e) {
      Errors.error("Unable to close stream.", e);
    }
  }
  
  public final long numBytesAvailable() {
    ensureOpen("numBytesAvailable");
    if (shouldParentDoWork()) {
      return super.numBytesAvailable();
    }
    return toInputBinaryStream().numBytesAvailable();
  }
  
  public final int read() {
    ensureOpen("read");
    if (shouldParentDoWork()) {
      return super.read();
    }
    return toInputBinaryStream().read();
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
   
  public final int read(byte[] b) {
    ensureOpen("read");
    if (shouldParentDoWork()) {
      return super.read(b);
    }
    return toInputBinaryStream().read(b);
  }
   
  public final int read(byte[] b, int off, int len) {
    ensureOpen("read");
    if (shouldParentDoWork()) {
      return super.read(b, off, len);
    }
    return toInputBinaryStream().read(b, off, len);
  }
  
  public final long skip(long n) {
    ensureOpen("skip");
    if (shouldParentDoWork()) {
      return super.skip(n);
    }
    return toInputBinaryStream().skip(n);
  }
  
  public final void unread(int c) {
    ensureOpen("unread");
    if (shouldParentDoWork()) {
      super.unread(c);
      return;
    }
    toInputBinaryStream().unread(c);
  }
  
  public void flush() {
    ensureOpen("flush");
    if (shouldParentDoWork()) {
      super.flush();
      return;
    }
    toOutputBinaryStream().flush();
  }
  
  public void write(int b) {
    ensureOpen("write");
    if (shouldParentDoWork()) {
      super.write(b);
      return;
    }
    toOutputBinaryStream().write(b);
  }
  
  public void write(byte[] b) {
    ensureOpen("write");
    if (shouldParentDoWork()) {
      super.write(b);
      return;
    }
    toOutputBinaryStream().write(b);
  }
  
  public void write(byte[] b, int off, int len) {
    ensureOpen("write");
    if (shouldParentDoWork()) {
      super.write(b, off, len);
      return;
    }
    toOutputBinaryStream().write(b, off, len);
  }
  
  //// Protected Area
  
  //// Private Area
  
  private void init() {
    if (isRandomAccess()) {
      return; 
    }
  }
  
  //// Internal Rep
  
 
  private SubLInputBinaryStream inStream;
  private SubLOutputBinaryStream outStream;
  
  //// Main
  
}
