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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSynonymStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  class StreamsLow extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of StreamsLow. */
  public StreamsLow() {}
  public static final SubLFile me = new StreamsLow();
  
  
  //// Public Area
  
  public static SubLSymbol $terminal_io$;
  public static SubLSymbol $standard_input$;
  public static SubLSymbol $standard_output$;
  public static SubLSymbol $error_output$;
  public static SubLSymbol $debug_io$;
  public static SubLSymbol $null_input$;
  public static SubLSymbol $null_output$;
  public static SubLSymbol $query_io$;
  public static SubLSymbol $trace_output$;

  public static SubLInputTextStream originalInputStream;
  public static SubLOutputTextStream originalOutputStream;
  public static SubLOutputTextStream originalErrorStream;

  public static SubLSynonymStream originalSynInputStream;
  public static SubLSynonymStream originalSynOutputStream;
  public static SubLSynonymStream originalSynErrorStream;

  public static SubLInOutTextStream originalIOStream;
  
  public static final SubLObject open(SubLObject fileSpec, SubLObject[]keys) {
    String fileSpecTyped = fileSpec.getFileDesignator();
    if ((keys.length % 2) == 1) {
      Errors.error("Need an even number of arguments to OPEN.");
    }
    SubLSymbol direction = INPUT_KEYWORD;
    SubLSymbol elementType = TEXT_KEYWORD;
    SubLSymbol ifExists = ERROR_KEYWORD;
    SubLSymbol ifNotExists = ERROR_KEYWORD;
    for (int i = 0, size = keys.length; i < size; i += 2) {
      SubLObject curKey = keys[i];
      SubLObject curVal = keys[i+1];
      if (curKey == DIRECTION_KEYWORD) {
        direction = (SubLSymbol)curVal;
      } else if (curKey == ELEMENT_TYPE_KEYWORD) {
        elementType = (SubLSymbol)curVal;
      } else if (curKey == IF_EXISTS_KEYWORD) {
        ifExists = (SubLSymbol)curVal;
      } else if (curKey == IF_DOES_NOT_EXIST_KEYWORD) {
        ifNotExists = (SubLSymbol)curVal;
      } else if (curKey == EXTERNAL_FORMAT_KEYWORD) {
        ; //ignore for now...probably want to introduce a CharsetSpec type for this -APB
      } else {
        Errors.error("OPEN got unexpected parameter " + curKey + ".");
      }
    }
    SubLStream result = SubLStreamFactory.makeFileStream(fileSpecTyped, direction,
      elementType, ifExists, ifNotExists, NIL);
    if (result == null) {
      return NIL;
    }
    return result;
  }
  
  public static final SubLObject wide_newline_stream_p(SubLObject stream) {
    return (stream.getStream(true).getNewline().length() > 1) ? T : (SubLBoolean)NIL;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "open",  "OPEN",  1, 0, true);
    SubLFiles.declareFunction(me, "wide_newline_stream_p",  "WIDE-NEWLINE-STREAM-P",  1, 0, false);
  }
  
  public void initializeVariables() {
    originalInputStream = SubLStreamFactory.makeInputTextStream(System.in);
    originalOutputStream = SubLStreamFactory.makeOutputTextStream(System.out);
    originalErrorStream = SubLStreamFactory.makeOutputTextStream(System.out);
    SubLInOutTextStream ioStream = SubLStreamFactory.makeInOutTextStream(originalInputStream, originalOutputStream);
    originalIOStream = ioStream;
    ioStream.setIsInteractive(true);
    $terminal_io$ = SubLFiles.defvar(me, "*TERMINAL-IO*",     ioStream);
    SubLSynonymStream ioSynonymStream = SubLStreamFactory.makeUnclosableSynonymStream(TERMINAL_IO);
    SubLSynonymStream ioSynonymStream2 = SubLStreamFactory.makeUnclosableSynonymStream(TERMINAL_IO);
    SubLSynonymStream ioSynonymStream3 = SubLStreamFactory.makeUnclosableSynonymStream(TERMINAL_IO);
    SubLSynonymStream ioSynonymStream4 = SubLStreamFactory.makeUnclosableSynonymStream(TERMINAL_IO);
    SubLSynonymStream ioSynonymStream5 = SubLStreamFactory.makeUnclosableSynonymStream(TERMINAL_IO);
    SubLSynonymStream ioSynonymStream6 = SubLStreamFactory.makeUnclosableSynonymStream(TERMINAL_IO);
    originalSynInputStream = ioSynonymStream;
    originalSynOutputStream = ioSynonymStream2;
    originalSynErrorStream = ioSynonymStream3;
    $standard_input$ = SubLFiles.defvar(me, "*STANDARD-INPUT*",  ioSynonymStream);
    $standard_output$ = SubLFiles.defvar(me, "*STANDARD-OUTPUT*", ioSynonymStream2);
    $error_output$ = SubLFiles.defvar(me, "*ERROR-OUTPUT*",    ioSynonymStream3);
    originalErrorStream = $error_output$.toOutputTextStream();
    $debug_io$ = SubLFiles.defvar(me, "*DEBUG-IO*", ioSynonymStream4);
    $null_input$ = SubLFiles.defvar(me, "*NULL-INPUT*", SubLStreamFactory.NULL_IN_STREAM);
    $null_output$ = SubLFiles.defvar(me, "*NULL-OUTPUT*", SubLStreamFactory.NULL_OUT_STREAM);
    $query_io$ = SubLFiles.defvar(me, "*QUERY-IO*", ioSynonymStream5);
    $trace_output$ = SubLFiles.defvar(me, "*TRACE-OUTPUT*", ioSynonymStream6);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}
