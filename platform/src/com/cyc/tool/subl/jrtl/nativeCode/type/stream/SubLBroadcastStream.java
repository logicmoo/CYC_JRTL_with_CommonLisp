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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import java.io.File;
import java.io.FileDescriptor;

//// Internal Imports

//// External Imports

public  final class SubLBroadcastStream extends AbstractSubLStream implements SubLOutputTextStream, SubLOutputBinaryStream {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLBroadcastStream.
   * Note: reuses the array passed in, do not modify externally!
   */
  SubLBroadcastStream(SubLOutputStream[] outStreams) {
    super(BINARY_KEYWORD, OUTPUT_KEYWORD, ERROR_KEYWORD, CREATE_KEYWORD);
    if (outStreams == null) {
      this.outStreams = new SubLOutputStream[0];
    } else {
      this.outStreams = outStreams;
    }
  }
  
  /** null output stream */
  SubLBroadcastStream() {
    this(null);
  }
  
  //// Public Area
  
  /** Method created to avoid casting */
  public final SubLOutputStream toOutputStream() {
    return this;
  }
  /** Method created to avoid casting */
  public final SubLOutputTextStream toOutputTextStream() {
    return this;
  }
  /** Method created to avoid casting */
  public final SubLOutputBinaryStream toOutputBinaryStream() {
    return this;
  }
  
  /** Method created to avoid casting */
  public final SubLStream getStream(boolean followSynonymStream) {
    return this;
  }
  
  public File getFile() {
    Errors.error("Illegal operation on a non-random access stream.");
    return null;
  } 
  
  public final SubLList getStreams() {
    return SubLObjectFactory.makeList(outStreams);
  }
  
  public final boolean isRandomAccess() {
    return false;
  }
  
  public final long getFilePointer() {
    return 0;
  }
  
  public final void seek(long pos) {
    Errors.error("Illegal operation on a non-random access stream.");
  }
  
  public final long length() {
    return 0;
  }
  
  public final FileDescriptor getFD() {
    Errors.error("Illegal operation on a non-random access stream.");
    return null;
  }
  
  public final void setLength(long newLength) {
    Errors.error("Illegal operation on a non-random access stream.");
  }
  
  public boolean isClosed() {
    return isClosed;
  }
  
  public synchronized void close() {
    isClosed = true;
  }
  
  public void flush() {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        outStreams[i].flush();
      }
    } catch (Exception e) {
      Errors.error("Error flushing stream.", e);
    }
  }
    
  public void writeChar(char b) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputTextStream)outStreams[i]).writeChar(b);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeChar(char[] b) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputTextStream)outStreams[i]).writeChar(b);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeChar(char[] b, int off, int len) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputTextStream)outStreams[i]).writeChar(b, off, len);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeString(String str) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputTextStream)outStreams[i]).writeString(str);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void writeString(String str, int off, int len) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputTextStream)outStreams[i]).writeString(str, off, len);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void write(int b) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputBinaryStream)outStreams[i]).write(b);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void write(byte[] b) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputBinaryStream)outStreams[i]).write(b);
      }
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
    freshLine = false;
  }
  
  public void write(byte[] b, int off, int len) {
    try {
      for (int i = 0, size = outStreams.length; i < size; i++) {
        ((SubLOutputBinaryStream)outStreams[i]).write(b, off, len);
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
  
  private SubLOutputStream[] outStreams;
  private boolean isClosed = false;
  private boolean freshLine = true;
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }

}
