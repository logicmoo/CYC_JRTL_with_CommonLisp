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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

//// Internal Imports

//// External Imports

public  class SubLStreamFactory implements CommonSymbols {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLStreamFactory.
   */
  private SubLStreamFactory() {}
  
  //// Public Area
  
  public static final SubLInputTextStream makeStringInputStream(String str) {
    return makeStringInputStream(str, 0, str.length());
  }
  
  public static final SubLInputTextStream makeStringInputStream(String str, int start, int end) {
    try {
      ByteBuffer byteBuffer = ByteBuffer.wrap(str.substring(start, end).getBytes(SubLStream.DEFAULT_CHARSET_NAME));
      SubLInputTextStream result = new SubLInputTextStreamImpl(byteBuffer, start);
      return result;
    } catch (Exception e) {
      return Errors.error("Unable to create string input stream.", e).toInputTextStream();
    }
  }
  
  public static final SubLOutputTextStream makeStringOutputStream() {
    return makeStringOutputStream(INITIAL_STRING_STREAM_SIZE);
  }
  
  public static final SubLOutputTextStream makeStringOutputStream(int initialSize) {
    SubLOutputTextStream result = new SubLOutputTextStreamImpl(initialSize);
    return result;
  }
  
  public static final SubLBroadcastStream makeBroadcastStream() {
    return makeBroadcastStream(NIL);
  }
  
  public static final SubLBroadcastStream makeBroadcastStream(SubLList streamList) {
    SubLOutputStream[] streams = new SubLOutputStream[streamList.size()];
    int i = 0;
    for (SubLObject cur = streamList; cur != SubLNil.NIL; cur = cur.rest()) {
      streams[i++] = cur.first().toOutputStream();
    }
    SubLBroadcastStream result = new SubLBroadcastStream(streams);
    return result;
  }
  
  public static final SubLStream makeFileStream(String fileName, SubLSymbol direction,
      SubLSymbol elementType, SubLSymbol ifExists, SubLSymbol ifNotExists, 
    SubLObject externalFormat) {
    try {
      if (direction == INPUT_KEYWORD) {
        if (elementType == BINARY_KEYWORD) {
          return new SubLInputBinaryStreamImpl(fileName, ifExists, ifNotExists);
        } else if (elementType == TEXT_KEYWORD) {
          return new SubLInputTextStreamImpl(fileName, ifExists, ifNotExists);
        }
      } else if (direction == OUTPUT_KEYWORD) {
        if (elementType == BINARY_KEYWORD) {
          return new SubLOutputBinaryStreamImpl(fileName, ifExists, ifNotExists);
        } else if (elementType == TEXT_KEYWORD) {
          return new SubLOutputTextStreamImpl(fileName, ifExists, ifNotExists);
        }
      } else if (direction == IO_KEYWORD) {
        if (elementType == BINARY_KEYWORD) {
          return new SubLInOutBinaryStreamImpl(fileName, ifExists, ifNotExists);
        } else if (elementType == TEXT_KEYWORD) {
          return new SubLInOutTextStreamImpl(fileName, ifExists, ifNotExists);
        }
      }
    } catch (SubLStreamNilException ssne) {
      return null;
    }
    return Errors.error("Can't open stream " + fileName + ".").getStream(false);
  }
  
  public static final SubLSynonymStream makeSynonymStream(SubLSymbol streamSymbol) {
    return new SubLSynonymStream(streamSymbol);
  }
  
  public static final SubLSynonymStream makeUnclosableSynonymStream(SubLSymbol streamSymbol) {
    return new SubLSynonymStream(streamSymbol) {
      public void close() {
        Errors.error("Illegal attempt to close a system stream: " + this);
      }
    };
  }
  
  public static final SubLOutputTextStream makeOutputTextStream(OutputStream stream) {
    return new SubLOutputTextStreamImpl(stream);
  }
  
  public static final SubLOutputTextStream makeOutputTextStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    try {
      return new SubLOutputTextStreamImpl(fileName, ifExists, ifNotExists);
    } catch (SubLStreamNilException ssne) {
      return null;
    }
  }
  
  public static final SubLInputTextStream makeInputTextStream(InputStream stream) {
    return new SubLInputTextStreamImpl(stream);
  }
  
  public static final SubLInputTextStream makeInputTextStream(Socket socket) {
    return new SubLInputTextStreamImpl(socket);
  }
  
  public static final SubLInputTextStream makeInputTextStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    try {
      return new SubLInputTextStreamImpl(fileName, ifExists, ifNotExists);
    } catch (SubLStreamNilException ssne) {
      return null;
    }
  }
  
  public static final SubLOutputBinaryStream makeOutputBinaryStream(OutputStream stream) {
    return new SubLOutputBinaryStreamImpl(stream);
  }
  
  public static final SubLOutputBinaryStream makeOutputBinaryStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    try {
      return new SubLOutputBinaryStreamImpl(fileName, ifExists, ifNotExists);
    } catch (SubLStreamNilException ssne) {
      return null;
    }
  }
  
  public static final SubLInputBinaryStream makeInputBinaryStream(InputStream stream) {
    return new SubLInputBinaryStreamImpl(stream);
  }
  
  public static final SubLInputBinaryStream makeInputBinaryStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    try {
      return new SubLInputBinaryStreamImpl(fileName, ifExists, ifNotExists);
    } catch (SubLStreamNilException ssne) {
      return null;
    }
  }
  
  public static final SubLInOutTextStream makeInOutTextStream(SubLInputTextStream inStream, 
      SubLOutputTextStream outStream) {
    return new SubLInOutTextStreamImpl(inStream, outStream);
  }
  
  public static final SubLInOutBinaryStream makeInOutBinaryStream(SubLInputBinaryStream inStream, 
      SubLOutputBinaryStream outStream) {
    return new SubLInOutBinaryStreamImpl(inStream, outStream);
  }
  
  public static final SubLInOutTextStream makeInOutTextStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    try {
      return new SubLInOutTextStreamImpl(fileName, ifExists, ifNotExists);
    } catch (SubLStreamNilException ssne) {
      return null;
    }
  }
  
  public static final SubLInOutBinaryStream makeInOutBinaryStream(String fileName, 
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    try {
      return new SubLInOutBinaryStreamImpl(fileName, ifExists, ifNotExists);
    } catch (SubLStreamNilException ssne) {
      return null;
    }
  }
  
  public static final SubLSocketStream makeSocketStream(String host, int port) {
    return new SubLSocketStream(host, port);
  }
  
  public static final SubLSocketStream makeSocketStream(Socket socket) {
    return new SubLSocketStream(socket);
  }
  
  public static final int INITIAL_STRING_STREAM_SIZE = 256;
  
  public static final SubLInputTextStream NULL_IN_STREAM = makeStringInputStream("");
  public static final SubLBroadcastStream NULL_OUT_STREAM = makeBroadcastStream();
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}
