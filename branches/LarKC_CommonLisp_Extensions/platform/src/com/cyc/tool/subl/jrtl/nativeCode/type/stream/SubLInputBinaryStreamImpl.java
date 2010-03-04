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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;

//// Internal Imports

public  final class SubLInputBinaryStreamImpl extends AbstractSubLBinaryStream implements SubLInputBinaryStream, CommonSymbols {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInputBinaryStreamImpl(InputStream inStream) {
    super(BINARY_KEYWORD, INPUT_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.inStream = inStream;
    //this.bufferedInStream = new BufferedInputStream(inStream);
    this.pushbackInputStream = new PushbackInputStream(inStream/*bufferedInStream*/);
    init();
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInputBinaryStreamImpl(String filename, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(filename, BINARY_KEYWORD, INPUT_KEYWORD, ifExists, ifNotExists);
    init();
  }
  
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInputBinaryStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, 
      SubLSymbol ifNotExists) {
    super(BINARY_KEYWORD, INPUT_KEYWORD, ifExists, ifNotExists);
    this.inStream = new FileInputStream(fileDesc);
    this.bufferedInStream = new BufferedInputStream(inStream);
    this.pushbackInputStream = new PushbackInputStream(bufferedInStream);
    init();
  }

  //// Public Area
  
  public final SubLStream getStream(boolean followSynonymStream) {
    return this;
  }
  
  /** Method created to avoid casting */
  public final SubLInputStream toInputStream() {
    return this;
  }
  /** Method created to avoid casting */
  public final SubLInputBinaryStream toInputBinaryStream() {
    return this;
  }
  
  public synchronized void close() {
    if (isClosed()) { return; }
    super.close();
    try {
      if (pushbackInputStream != null) {
        pushbackInputStream.close();
        inStream = null;
        bufferedInStream = null;
        pushbackInputStream = null;
      }
    } catch (Exception e) {
      Errors.error("Unable to close stream.", e);
    }
  }
  
  public final long numBytesAvailable() {
    if (isClosed()) { return 0; }
    if (isRandomAccess()) {
      return super.numBytesAvailable();
    }
    try {
      return pushbackInputStream.available();
    } catch (Exception e) {
      Errors.error("Unable to get available bytes for stream.", e);
      return -1;
    }
  }
  
  public final int readByteSequenceToString(SubLString str) {
    ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
    if (shouldParentDoWork()) {
      return super.readByteSequenceToString(str);
    }
    int curChar = 1;
    for (int i = 0, size = str.size(); i < size; i++) { //@todo this is pretty inefficient
      curChar = readInternal();
      if (curChar == -1) { // EOF
        return -1;
      }
      str.set(i, (char)curChar);
    }
    return curChar;
  }
  
  public long readByteSequenceToPositiveInteger(int bytesInInteger) {
    ensureOpen("READ-BYTES-SEQUENCE-TO-POSITIVE-INTEGER");
    if (shouldParentDoWork()) {
      return super.readByteSequenceToPositiveInteger(bytesInInteger);
    }
    if ((bytesInInteger > 8) || (bytesInInteger < 0)) {
      Errors.error("Bytes in integer is too large: " + bytesInInteger);
    }
    long result = 0;
    int curChar = -1;
    for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
      curChar = readInternal();
      if (curChar == -1) { // EOF
        return -1;
      }
      result |= curChar << i;
    }
    return result;
  }
  
  public final int read() {
    ensureOpen("READ-CHAR");
    if (shouldParentDoWork()) {
      return super.read();
    }
    return readInternal();
  }
  
  private final int readInternal() {
    boolean ready = false;
    while (true) {
      try {
        ready = pushbackInputStream.available() > 0;
      } catch (Exception e) {
        Errors.error("Unable to read character from stream: " + this, e);
      }
      // @todo this function should be fixed to be nearly the same as SubLInputTextStreamImpl.readChar()
      if (ready) {
        try {
          int result = pushbackInputStream.read();
          if (result >= 0) {
            incrementInputIndex(1); //@hack should be width of character when we support UTF 8
          }
          return result;
        } catch (java.net.SocketTimeoutException ste) {
          Threads.possiblyHandleInterrupts(false);
        } catch (Exception e) {
          Errors.error("Unable to read character from stream: " + this, e);
        }
      } else {
        if (isClosed()) { return streams_high.EOF_CHAR; }
        try {
          Threads.possiblyHandleInterrupts(true);
          Thread.currentThread().sleep(5);
        } catch (InterruptedException ie) {
          Threads.possiblyHandleInterrupts(false);
        }
        if (isClosed()) { return streams_high.EOF_CHAR; }
        // @todo uncomment this and get it working
        /*try { // deal with connection being closed by client or network gracefully
          if (socket != null) {
            socket.sendUrgentData(0);
          }
        } catch (Exception ex) { 
          try {
            Thread.currentThread().sleep(500);
          } catch (Exception e) {}
          try {
            ready = pushbackInputStream.available() > 0;
          } catch (Exception e) {
            Errors.error("Unable to read character from stream: " + this, e);
          }
          if (!ready) { 
            return streams_high.EOF_CHAR;
          }
        }*/
      }
    }
  }
   
  public final int read(byte[] b) { //@note make this interruptable
    ensureOpen("READ");
    if (isRandomAccess()) {
      return super.read(b);
    }
    try {
      int result = pushbackInputStream.read(b);
      return result;
    } catch (Exception e) {
      Errors.error("Unable to read character from stream.", e);
      return -1;
    }
  }
   
  public final int read(byte[] b, int off, int len) {//@note make this interruptable
    ensureOpen("READ");
    if (isRandomAccess()) {
      return super.read(b, off,len);
    }
    try {
      int result = pushbackInputStream.read(b, off, len);
      return result;
    } catch (Exception e) {
      Errors.error("Unable to read character from stream.", e);
      return -1;
    }
  }
  
  public final long skip(long n) {
    ensureOpen("SKIP");
    if (isRandomAccess()) {
      return super.skip(n);
    }
    try {
      long result = pushbackInputStream.skip(n);
      return result;
    } catch (Exception e) {
      Errors.error("Unable to skip characters.", e);
      return -1;
    }
  }
  
  public final void unread(int c) {
    ensureOpen("UNREAD");
    if (isRandomAccess()) {
      super.unread(c);
      return;
    }
    try {
      pushbackInputStream.unread(c);
    } catch (Exception e) {
      Errors.error("Unable to unread character from stream.", e);
    }
  }
  
  //// Protected Area
  
  //// Private Area
  
  private void init() {
    if (isRandomAccess()) {
      return; 
    }
    
  }
  
  //// Internal Rep
  
  private InputStream inStream;
  private BufferedInputStream bufferedInStream;
  private PushbackInputStream pushbackInputStream;
  
  //// Main
  
}
