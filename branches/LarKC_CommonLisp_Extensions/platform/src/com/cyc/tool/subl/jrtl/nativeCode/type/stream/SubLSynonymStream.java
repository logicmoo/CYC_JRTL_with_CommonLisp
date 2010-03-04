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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.File;
import java.io.FileDescriptor;

//// Internal Imports

//// External Imports

public  class SubLSynonymStream extends AbstractSubLStream {
  
  //// Constructors
  
  /** Creates a new instance of SubLSynonymStream. */
  SubLSynonymStream(SubLSymbol streamSymbol) {
    super(TEXT_KEYWORD, streamSymbol.getValue().getStream(true).getDirection(), ERROR_KEYWORD, ERROR_KEYWORD);
    this.streamSymbol = streamSymbol;
  }
  
  //// Public Area
  
  /** Method created to avoid casting */
  public final SubLInputStream toInputStream() {
    return getStream(true).toInputStream();
  }
  /** Method created to avoid casting */
  public final SubLInputTextStream toInputTextStream() {
    return getStream(true).toInputTextStream();
  }
  /** Method created to avoid casting */
  public final SubLInputBinaryStream toInputBinaryStream() {
    return getStream(true).toInputBinaryStream();
  }
  /** Method created to avoid casting */
  public final SubLOutputStream toOutputStream() {
    return getStream(true).toOutputStream();
  }
  /** Method created to avoid casting */
  public final SubLOutputTextStream toOutputTextStream() {
    return getStream(true).toOutputTextStream();
  }
  /** Method created to avoid casting */
  public final SubLOutputBinaryStream toOutputBinaryStream() {
    return getStream(true).toOutputBinaryStream();
  }
  
  public final SubLSymbol getStreamSymbol() {
    return streamSymbol;
  }
  
  public final SubLStream getStream(boolean followSynonymStream) {
    if (!followSynonymStream) { return this; }
    try {
      SubLStream result = streamSymbol.getValue().getStream(true);
      while (result instanceof SubLSynonymStream) {
        result = ((SubLSynonymStream)result).getStreamSymbol().getValue().getStream(true);
      }
      return result;
    } catch (Exception e) {
      return this;
    }
  }
  
   public SubLSymbol getElementType() {
    return getStream(true).getElementType();
  }
  
  public SubLSymbol getDirection() {
    return getStream(true).getDirection();
  }
  
  public SubLSymbol ifExists() {
    return getStream(true).ifExists();
  }
  
  public SubLSymbol ifNotExists() {
    return getStream(true).ifNotExists();
  }
  
  public boolean isInteractive() {
    return getStream(true).isInteractive();
  }
  
  public void setIsInteractive(boolean newValue) {
    getStream(true).setIsInteractive(newValue);
  }
  
  public String getNewline() {
    return getStream(true).getNewline();
  }
  
  public void setNewline(String newline) {
    getStream(true).setNewline(newline);
  }
  
  /*public synchronized void close() {
    getStream(true).close();
  }
  
  public boolean isClosed() {
    return getStream(true).isClosed();
  }*/
  
  public final boolean isRandomAccess() {
    return getStream(true).isRandomAccess();
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final long getFilePointer() {
    return getStream(true).getFilePointer();
  }
  
  /** throws exception if isRandomAccess() returns false */ 
  public final void seek(long pos) {
    getStream(true).seek(pos);
  }
  
  /** throws exception if isRandomAccess() returns false */ 
  public final long length() {
    return getStream(true).length();
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final FileDescriptor getFD() {
    return getStream(true).getFD();
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final void setLength(long newLength) {
    getStream(true).setLength(newLength);
  }
  
  public final File getFile() {
    return getStream(true).getFile();
  } 
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  private SubLSymbol streamSymbol;
  
  //// Main
  
}
