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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.constant_handles;

public  final class cyc_revision_extraction extends SubLTranslatedFile {

  //// Constructor

  private cyc_revision_extraction() {}
  public static final SubLFile me = new cyc_revision_extraction();
  public static final String myName = "com.cyc.cycjava.cycl.cyc_revision_extraction";

  //// Definitions

  @SubL(source = "cycl/cyc-revision-extraction.lisp", position = 527) 
  public static final SubLObject extract_cyc_revision_string(SubLObject raw_revision_string) {
    {
      SubLObject first_space = Sequences.position(Characters.CHAR_space, raw_revision_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != first_space)) {
        {
          SubLObject second_space = Sequences.position(Characters.CHAR_space, raw_revision_string, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY), Numbers.add(first_space, ONE_INTEGER), UNPROVIDED);
          if ((NIL != second_space)) {
            return Sequences.subseq(raw_revision_string, Numbers.add(first_space, ONE_INTEGER), second_space);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cyc-revision-extraction.lisp", position = 870) 
  public static final SubLObject extract_cyc_revision_numbers(SubLObject revision_string, SubLObject system_vesion) {
    if ((system_vesion == UNPROVIDED)) {
      system_vesion = TEN_INTEGER;
    }
    if (revision_string.isString()) {
      {
        SubLObject start = ZERO_INTEGER;
        SubLObject period = Sequences.position(Characters.CHAR_period, revision_string, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY), start, UNPROVIDED);
        SubLObject numbers = NIL;
        for (; start.isInteger(); ) {
          {
            SubLObject integer = reader.read_from_string_ignoring_errors(revision_string, NIL, NIL, start, period);
            if ((NIL != integer)) {
              numbers = cons(integer, numbers);
            }
          }
          if (period.isInteger()) {
            start = Numbers.add(period, ONE_INTEGER);
            period = Sequences.position(Characters.CHAR_period, revision_string, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY), start, UNPROVIDED);
          } else {
            start = NIL;
          }
        }
        numbers = Sequences.nreverse(numbers);
        if (ONE_INTEGER.numE(Sequences.length(numbers))) {
          numbers = cons(system_vesion, numbers);
        }
        return numbers;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cyc-revision-extraction.lisp", position = 1590) 
  public static final SubLObject construct_cyc_revision_string_from_numbers(SubLObject revision_numbers) {
    {
      SubLObject string = NIL;
      SubLObject s = NIL;
      try {
        s = streams_high.make_private_string_output_stream();
        {
          SubLObject first_p = T;
          SubLObject cdolist_list_var = revision_numbers;
          SubLObject number = NIL;
          for (number = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), number = cdolist_list_var.first()) {
            if ((NIL == first_p)) {
              print_high.princ(Characters.CHAR_period, s);
            }
            print_high.princ(number, s);
            first_p = NIL;
          }
        }
        string = streams_high.get_output_stream_string(s);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            streams_high.close(s, UNPROVIDED);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return string;
    }
  }

  public static final SubLObject declare_cyc_revision_extraction_file() {
    declareFunction(myName, "extract_cyc_revision_string", "EXTRACT-CYC-REVISION-STRING", 1, 0, false);
    declareFunction(myName, "extract_cyc_revision_numbers", "EXTRACT-CYC-REVISION-NUMBERS", 1, 1, false);
    declareFunction(myName, "construct_cyc_revision_string_from_numbers", "CONSTRUCT-CYC-REVISION-STRING-FROM-NUMBERS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cyc_revision_extraction_file() {
    return NIL;
  }

  public static final SubLObject setup_cyc_revision_extraction_file() {
    // CVS_ID("Id: cyc-revision-extraction.lisp 126698 2008-12-17 17:45:32Z rck ");
    return NIL;
  }

  //// Initializers

  public void declareFunctions() {
    declare_cyc_revision_extraction_file();
  }

  public void initializeVariables() {
    init_cyc_revision_extraction_file();
  }

  public void runTopLevelForms() {
    setup_cyc_revision_extraction_file();
  }

}
