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
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//// Internal Imports

//// External Imports

public  abstract class AbstractSubLTextStream extends AbstractRandomAccessSubLStream {
  
  //// Constructors
  
  AbstractSubLTextStream(SubLSymbol elementType, SubLSymbol direction,
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(elementType, direction, ifExists, ifNotExists);
    if (elementType != TEXT_KEYWORD) {
      Errors.error("Got bad stream element type: " + elementType);
    }
  }
  
  AbstractSubLTextStream(String fileName, SubLSymbol elementType, 
      SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(fileName, elementType, direction, ifExists, ifNotExists);
    if (elementType != TEXT_KEYWORD) {
      Errors.error("Got bad stream element type: " + elementType);
    }
  }
  
  //// Public Area
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}
