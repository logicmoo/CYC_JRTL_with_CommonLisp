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

package  com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.cfasl_compression;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.integer_sequence_generator;

public  final class cfasl_utilities extends SubLTranslatedFile {

  //// Constructor

  private cfasl_utilities() {}
  public static final SubLFile me = new cfasl_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.cfasl_utilities";

  //// Definitions

  /** Return the first object saved in FILENAME in CFASL format. */
  @SubL(source = "cycl/cfasl-utilities.lisp", position = 1479) 
  public static final SubLObject cfasl_load(SubLObject filename) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(filename, $sym0$STRINGP);
      {
        SubLObject object = NIL;
        SubLObject stream = NIL;
        try {
          {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
              stream_macros.$stream_requires_locking$.bind(NIL, thread);
              stream = compatibility.open_binary(filename, $kw4$INPUT);
            } finally {
              stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
          }
          if ((!(stream.isStream()))) {
            Errors.error($str2$Unable_to_open__S, filename);
          }
          {
            SubLObject stream_3 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((!(stream_3.isStream()))) {
                Errors.error($str3$Cannot_open__A, filename);
              }
            }
            object = cfasl.cfasl_input(stream_3, UNPROVIDED, UNPROVIDED);
          }
        } finally {
          {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
              if (stream.isStream()) {
                streams_high.close(stream, UNPROVIDED);
              }
            } finally {
              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return object;
      }
    }
  }

  @SubL(source = "cycl/cfasl-utilities.lisp", position = 2694) 
  private static SubLSymbol $cfasl_default_compression_options$ = null;

  public static final SubLObject declare_cfasl_utilities_file() {
    //declareFunction(myName, "cfasl_save", "CFASL-SAVE", 2, 0, false);
    //declareFunction(myName, "cfasl_save_all", "CFASL-SAVE-ALL", 2, 0, false);
    declareFunction(myName, "cfasl_load", "CFASL-LOAD", 1, 0, false);
    //declareFunction(myName, "cfasl_load_all", "CFASL-LOAD-ALL", 1, 0, false);
    //declareFunction(myName, "cfasl_save_externalized", "CFASL-SAVE-EXTERNALIZED", 2, 0, false);
    //declareFunction(myName, "cfasl_save_maybe_externalized", "CFASL-SAVE-MAYBE-EXTERNALIZED", 3, 0, false);
    //declareFunction(myName, "cfasl_output_compressed", "CFASL-OUTPUT-COMPRESSED", 2, 1, false);
    //declareFunction(myName, "cfasl_output_compressed_externalized", "CFASL-OUTPUT-COMPRESSED-EXTERNALIZED", 2, 1, false);
    //declareFunction(myName, "cfasl_output_compressed_maybe_externalized", "CFASL-OUTPUT-COMPRESSED-MAYBE-EXTERNALIZED", 3, 1, false);
    //declareFunction(myName, "cfasl_output_compressed_int", "CFASL-OUTPUT-COMPRESSED-INT", 4, 0, false);
    //declareFunction(myName, "cfasl_save_compressed", "CFASL-SAVE-COMPRESSED", 2, 1, false);
    //declareFunction(myName, "cfasl_save_compressed_externalized", "CFASL-SAVE-COMPRESSED-EXTERNALIZED", 2, 1, false);
    //declareFunction(myName, "cfasl_save_compressed_maybe_externalized", "CFASL-SAVE-COMPRESSED-MAYBE-EXTERNALIZED", 3, 1, false);
    //declareFunction(myName, "cfasl_save_compressed_int", "CFASL-SAVE-COMPRESSED-INT", 3, 1, false);
    //declareFunction(myName, "cfasl_save_all_compressed", "CFASL-SAVE-ALL-COMPRESSED", 2, 1, false);
    //declareFunction(myName, "cfasl_compress", "CFASL-COMPRESS", 2, 1, false);
    //declareFunction(myName, "cfasl_byte_compile", "CFASL-BYTE-COMPILE", 2, 0, false);
    //declareFunction(myName, "cfasl_byte_load", "CFASL-BYTE-LOAD", 1, 0, false);
    //declareFunction(myName, "cfasl_copy_object", "CFASL-COPY-OBJECT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cfasl_utilities_file() {
    $cfasl_default_compression_options$ = deflexical("*CFASL-DEFAULT-COMPRESSION-OPTIONS*", $list6);
    return NIL;
  }

  public static final SubLObject setup_cfasl_utilities_file() {
    // CVS_ID("Id: cfasl-utilities.lisp 127165 2009-02-18 19:22:51Z rck ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw1$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str2$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str3$Cannot_open__A = makeString("Cannot open ~A");
  public static final SubLSymbol $kw4$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw5$EOF = makeKeyword("EOF");
  public static final SubLList $list6 = list(makeKeyword("ANALYZE"), makeKeyword("OBJECT"));
  public static final SubLSymbol $kw7$NOT = makeKeyword("NOT");
  public static final SubLSymbol $kw8$ANALYZE = makeKeyword("ANALYZE");
  public static final SubLSymbol $kw9$OBJECT = makeKeyword("OBJECT");

  //// Initializers

  public void declareFunctions() {
    declare_cfasl_utilities_file();
  }

  public void initializeVariables() {
    init_cfasl_utilities_file();
  }

  public void runTopLevelForms() {
    setup_cfasl_utilities_file();
  }

}
