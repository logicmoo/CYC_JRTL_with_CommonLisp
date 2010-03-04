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
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

//// Internal Imports

//// External Imports

public  final class SubLInputTextStreamImpl extends AbstractSubLTextStream implements SubLInputTextStream, CommonSymbols {
  
  //// Constructors

  // @hack to be compatible with Allegro/C
  SubLInputTextStreamImpl(InputStream inStream, int start) {
    this(inStream);
    setInputIndex(start);
  }

  /**
   * Creates a new instance of SubLInputTextStreamImpl.
   */
  SubLInputTextStreamImpl(InputStream inStream) {
    super(TEXT_KEYWORD, INPUT_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.inStream = inStream;
    this.bufferedStream = new BufferedInputStream(inStream);
    this.pbInStream = new PushbackInputStream(bufferedStream);
    // @todo we need to use reader for reading characters...
    //inReader = new InputStreamReader(inStream, DEFAULT_CHARSET);
    //inBufReader = new BufferedReader(inReader);
    //pushbackReader = new PushbackReader(inReader);
  }
  
  /**
   * Creates a new instance of SubLInputTextStreamImpl.
   */
  SubLInputTextStreamImpl(Socket socket) {
    super(TEXT_KEYWORD, INPUT_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.socket = socket;
    try {
      this.inStream = socket.getInputStream();
    } catch (IOException ioe) {
      Errors.error("Unable to open stream for socket; " + socket, ioe);
    }
    this.bufferedStream = new BufferedInputStream(inStream);
    this.pbInStream = new PushbackInputStream(bufferedStream);
    // @todo we need to use reader for reading characters...
    //inReader = new InputStreamReader(inStream, DEFAULT_CHARSET);
    //inBufReader = new BufferedReader(inReader);
    //pushbackReader = new PushbackReader(inReader);
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInputTextStreamImpl(ByteBuffer byteBuffer) {
    super(TEXT_KEYWORD, INPUT_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.byteBuffer = byteBuffer;
  }

  // @hack to be compatible with Allegro/C
  SubLInputTextStreamImpl(ByteBuffer byteBuffer, int start) {
    this(byteBuffer);
    if (start > 0) {
      setInputIndex(start);
    }
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLInputTextStreamImpl(String filename, SubLSymbol ifExists, 
      SubLSymbol ifNotExists) {
    super(filename, TEXT_KEYWORD, INPUT_KEYWORD, ifExists, ifNotExists);
  }
  
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  public SubLInputTextStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, 
      SubLSymbol ifNotExists) {
    super(TEXT_KEYWORD, INPUT_KEYWORD, ifExists, ifNotExists);
    this.inStream = new FileInputStream(fileDesc);
    this.bufferedStream = new BufferedInputStream(inStream);
    this.pbInStream = new PushbackInputStream(bufferedStream);
    //inReader = new InputStreamReader(inStream, DEFAULT_CHARSET);
    //inBufReader = new BufferedReader(inReader);
    //pushbackReader = new PushbackReader(inReader);
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
  public final SubLInputTextStream toInputTextStream() {
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
      if (pbInStream != null) {
        pbInStream.close();
        inStream = null;
        bufferedStream = null;
        pbInStream = null;
      }
      /*if (pushbackReader != null) {
        pushbackReader.close();
        inStream = null;
        inReader = null;
        pushbackReader = null;
      }*/
    } catch (Exception e) {
      Errors.error("Unable to close stream.", e);
    }
  }
  
  public boolean ready() {
    ensureOpen("READY");
    if (shouldParentDoWork()) {
      return super.ready();
    }
    try {
      return pbInStream.available() > 0;
    } catch (Exception e) {
      Errors.error("Error on stream: " + this);
      return false;
    }
  }
  
  public final int readChar() {
    return read(); // @hack once we support unicode this won't be sufficient
    /*ensureOpen("READ-CHAR");
    if (shouldParentDoWork()) {
      return super.read();
    }
    boolean ready = false;
    while (true) {
      try {
        ready = pushbackReader.ready();
      } catch (Exception e) {
        Errors.error("Unable to read character from stream: " + this, e);
      }
      if (ready || (socket != null)) {
        try {
          int result = pushbackReader.read();
          char result_char = (char)result;
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
      }
    }*/
  }
   
  private boolean isSocketConnectionDead() {
    if (socket == null) { return false; }
    try { // deal with connection being closed by client or network gracefully
      socket.sendUrgentData(32);
    } catch (Exception ex) {
      return true;
    }
    return false;
  }
  
  private final int socketRead() {
    while (true) {
      if (isClosed()) {
        return streams_high.EOF_CHAR;
      }
      try {
        int curByte = pbInStream.read();
        if (curByte >= 0) {
          incrementInputIndex(1); //@hack should be width of character when we support UTF 8
        }
        return curByte;
      } catch (SocketTimeoutException ste) {
        Threads.possiblyHandleInterrupts(true);
      } catch (IOException ioe) { // probably the client died...
        return streams_high.EOF_CHAR;
      } catch (Exception e) {
        Errors.error("Unable to read character from stream: " + this, e);
      }
    }
  }
  
  public final int read() {
    ensureOpen("READ");
    if (shouldParentDoWork()) {
      return super.read();
    }
    if (socket != null) {
      return socketRead();
    }
    boolean ready = false;
    while (true) {
      if (isClosed()) { return streams_high.EOF_CHAR; }
      try {
        ready = pbInStream.available() > 0;
      } catch (Exception e) {
        return streams_high.EOF_CHAR;
      }
      if (ready) {
        try {
          int result = pbInStream.read();
          if (result >= 0) {
            incrementInputIndex(1); //@hack should be width of character when we support UTF 8
          }
          return result;
        } catch (Exception e) {
          Errors.error("Unable to read character from stream: " + this, e);
        }
      } else {
        try {
          Threads.possiblyHandleInterrupts(true);
          Thread.currentThread().sleep(5);
        } catch (InterruptedException ie) {
          Threads.possiblyHandleInterrupts(false);
        }
        if (isClosed()) { return streams_high.EOF_CHAR; }
      }
    }
  }
  
  public final int readByteSequenceToString(SubLString str) {
    ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
    int curChar = 1;
    if (shouldParentDoWork()) {
      return super.readByteSequenceToString(str);
    }
    for (int i = 0, size = str.size(); i < size; i++) {
      //@todo this is pretty inefficient
      curChar = read();
      if (curChar == -1) {
        // EOF
        return -1;
      }
      str.set(i, (char) curChar);
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
      curChar = read();
      if (curChar == -1) {
        // EOF
        return -1;
      }
      result |= curChar << i;
    }
    return result;
  }
  
  public final int read(byte[] b) { //@note make this interruptable
    //@todo copy implementation from BinaryStreams
    Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
    return -1;
  }
  
  public final int read(byte[] b, int off, int len) {//@note make this interruptable
    //@todo copy implementation from BinaryStreams
    Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[], off, len)");
    return -1;
  }

  public int readChar(char[] b) {
    ensureOpen("READ-CHAR");
    Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
    return -1;
    /*if (shouldParentDoWork()) {
      return super.readChar(b);
    }
    try { // @note this needs to be interruptable -- see read()
      int result = pbInStream.read(b);
      if (result >= 0) {
        incrementInputIndex(result);
      }
      return result;
    } catch (Exception e) {
      Errors.error("Unable to read character from stream.", e);
    }*/
  }
   
  public int readChar(char[] b, int off, int len) {
    // @todo this should be made much more efficient by
    // using the array read on streams
    int curChar = -1;
    int i = off;
    for (int size = off + len; i < size; i++) {
      curChar = read();
      if (curChar == streams_high.EOF_CHAR) {
        break;
      }
      b[i] = (char)curChar;
    }
    return i;
  }
   
  public final long skip(long n) {
    ensureOpen("SKIP");
    if (shouldParentDoWork()) {
      return super.skip(n);
    }
    try {
      long result = pbInStream.skip(n);
      if (result >= 0) {
        incrementInputIndex(result);
      }
      return result;
    } catch (Exception e) {
      Errors.error("Unable to skip characters.", e);
      return -1;
    }
  }
  
  public final void unread(int c) {
    ensureOpen("UNREAD");
    if (shouldParentDoWork()) {
      super.unread(c);
      return;
    }
    try {
      pbInStream.unread(c);
      incrementInputIndex(-1);
    } catch (Exception e) {
      Errors.error("Unable to unread character from stream.", e);
    }
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private Socket socket;
  private InputStream inStream;
  private BufferedInputStream bufferedStream;
  private PushbackInputStream pbInStream;
  //private InputStreamReader inReader;
  //private BufferedReader inBufReader;
  //private PushbackReader pushbackReader;
  
  //// Main
  
}
