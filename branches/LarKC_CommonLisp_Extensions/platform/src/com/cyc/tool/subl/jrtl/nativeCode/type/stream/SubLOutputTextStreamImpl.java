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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//// External Imports

public  final class SubLOutputTextStreamImpl extends AbstractSubLTextStream implements SubLOutputTextStream, CommonSymbols {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLOutputTextStreamImpl(OutputStream outStream) {
    super(TEXT_KEYWORD, OUTPUT_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
    this.outStream = outStream;
    outWriter = new OutputStreamWriter(outStream, DEFAULT_CHARSET);
    bufferedWriter = outWriter;// = new BufferedWriter(outWriter);
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl.
   */
  SubLOutputTextStreamImpl(String filename,
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(filename, TEXT_KEYWORD, OUTPUT_KEYWORD, ifExists, ifNotExists);
  }
  
  /**
   * Creates a new instance of SubLInputBinaryStreamImpl as a text output stream.
   */
  SubLOutputTextStreamImpl(int initialByteSizeForString) {
    super(TEXT_KEYWORD, OUTPUT_KEYWORD, APPEND_KEYWORD, CREATE_KEYWORD);
    this.outStream = new ByteArrayOutputStream(initialByteSizeForString);
    outWriter = new OutputStreamWriter(outStream, DEFAULT_CHARSET);
    bufferedWriter = outWriter;//new BufferedWriter(outWriter); //@note this is probably inefficient in this case -APB
  }
  
  /**
   * Creates a new instance of SubLOutputBinaryStreamImpl.
   */
  /*SubLOutputTextStreamImpl(FileDescriptor fileDesc, SubLSymbol elementType, 
      SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(elementType, direction, ifExists, ifNotExists);
    this.outStream = new FileOutputStream(fileDesc);
    outWriter = new OutputStreamWriter(outStream, DEFAULT_CHARSET);
    bufferedWriter = outWriter;//= new BufferedWriter(outWriter);
  }*/

  //// Public Area
  
  public final SubLStream getStream(boolean followSynonymStream) {
    return this;
  }
  
  /** Method created to avoid casting */
  public final SubLOutputStream toOutputStream() {
    return this;
  }
  /** Method created to avoid casting */
  public final SubLOutputTextStream toOutputTextStream() {
    return this;
  }
  
//  /** Method created to avoid casting */
//  public final SubLOutputBinaryStream toOutputBinaryStream() {
//    return this;
//  }
  
  public boolean isStringOutputStream() {
    return (outStream != null) && (outStream instanceof ByteArrayOutputStream);
  }
  
  public String getStringOutput() {
    if (!isStringOutputStream()) {
      Errors.error("Can't get the stream string output for non-string streams.");
    }
    ensureOpen("GET-STRING-OUTPUT");
    ByteArrayOutputStream byteStream = (ByteArrayOutputStream)outStream;
    try {
      flush();
      String result = byteStream.toString(DEFAULT_CHARSET.name());
      byteStream.reset();
      return result;
    } catch (Exception e) {
      return Errors.error("Unsupported charset: " + DEFAULT_CHARSET, e).getString();
    }
  }

  // @todo create appropriate hashcode!!!!!!!!!!!!!!

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof SubLOutputTextStreamImpl)) {
      return false;
    }
    SubLOutputTextStreamImpl imp2 = (SubLOutputTextStreamImpl)obj;
    return outStream == imp2.outStream;
  }
  
  public synchronized void close() {
    if (isClosed()) { return; }
    super.close();
    try {
      if (bufferedWriter != null) {
        try { bufferedWriter.flush(); } catch (Exception e) {} // ignore
        bufferedWriter.close();
        outStream = null;
        outWriter = null;
        bufferedWriter = null;
      }
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      close();
    } catch (Exception e) {
      Errors.error("Unable to close stream.", e);
    }
  }
  
  public void flush() {
    ensureOpen("FLUSH");
    if (shouldParentDoWork()) {
      super.flush();
      return;
    }
    try {
      bufferedWriter.flush();
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      flush();
    } catch (Exception e) {
      Errors.error("Error flushing stream.", e);
    }
  }
  
  public void writeChar(char b) {
    ensureOpen("WRITE-CHAR");
    if (shouldParentDoWork()) {
      super.write(b);
    } else try {
      bufferedWriter.write(b);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < 1) {
        writeChar(b);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeChar(char[] b) {
    ensureOpen("WRITE-CHAR");
    if (shouldParentDoWork()) {
      super.writeChar(b);
    } else try {
      bufferedWriter.write(b);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < b.length) {
        writeChar(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeChar(char[] b, int off, int len) {
    ensureOpen("WRITE-CHAR");
    if (shouldParentDoWork()) {
      super.writeChar(b, off, len);
    } else try {
      bufferedWriter.write(b, off, len);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < len) {
        writeChar(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeString(String str) {
    ensureOpen("WRITE-STRING");
    if (shouldParentDoWork()) {
      super.write(str);
    } else try {
      bufferedWriter.write(str);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < str.length()) {
        writeString(str, ioe.bytesTransferred, str.length() - ioe.bytesTransferred);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeString(String str, int off, int len) {
    ensureOpen("WRITE-STRING");
    if (shouldParentDoWork()) {
      super.write(str, off, len);
    } else try {
      bufferedWriter.write(str, off, len);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < len) {
        writeString(str, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
    public void write(int b) {
    ensureOpen("WRITE");
    if (shouldParentDoWork()) {
      super.write(b);
    } else try {
      outStream.write(b);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < 1) {
        write(b);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void write(byte[] b) {
    ensureOpen("WRITE");
    if (shouldParentDoWork()) {
      super.write(b);
    } else try {
      outStream.write(b);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < b.length) {
        write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void write(byte[] b, int off, int len) {
    ensureOpen("WRITE");
    if (shouldParentDoWork()) {
      super.write(b, off, len);
    } else try {
      outStream.write(b, off, len);
    } catch (InterruptedIOException ioe) {
      Threads.possiblyHandleInterrupts(false);
      if (ioe.bytesTransferred < len) {
        write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
    @Override
    public void writeNewline() {
      writeString(getNewline());
      freshLine = true;
    }

    @Override
    public boolean freshLine() {
      return freshLine;
    }

  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private OutputStream outStream;
  private OutputStreamWriter outWriter;
  private Writer bufferedWriter;
  private boolean freshLine = true;

  //// Main
  
}
