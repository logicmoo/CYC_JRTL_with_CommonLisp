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
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_high;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class constant_completion extends SubLTranslatedFile {

  //// Constructor

  private constant_completion() {}
  public static final SubLFile me = new constant_completion();
  public static final String myName = "com.cyc.cycjava_1.cycl.constant_completion";

  //// Definitions

  @SubL(source = "cycl/constant-completion.lisp", position = 636) 
  private static SubLSymbol $constant_names_in_code$ = null;

  @SubL(source = "cycl/constant-completion.lisp", position = 1121) 
  private static SubLSymbol $bogus_constant_names_in_code$ = null;

  @SubL(source = "cycl/constant-completion.lisp", position = 1600) 
  public static final SubLObject initialize_constant_names_in_code() {
    if (ZERO_INTEGER.numE(constant_handles.constant_count())) {
      $constant_names_in_code$.setGlobalValue(NIL);
      {
        SubLObject cdolist_list_var = constant_handles.invalid_constant_names();
        SubLObject invalid_constant_name = NIL;
        for (invalid_constant_name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), invalid_constant_name = cdolist_list_var.first()) {
          $constant_names_in_code$.setGlobalValue(cons(invalid_constant_name, $constant_names_in_code$.getGlobalValue()));
        }
      }
      $constant_names_in_code$.setGlobalValue(Sort.sort($constant_names_in_code$.getGlobalValue(), Symbols.symbol_function($sym3$STRING_), UNPROVIDED));
    }
    return Sequences.length($constant_names_in_code$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-completion.lisp", position = 2143) 
  public static final SubLObject compute_bogus_constant_names_in_code() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $constant_names_in_code$.getGlobalValue())) {
        {
          SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$noting_progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.noting_progress_preamble($str4$Computing_bogus_constant_names_in);
            $bogus_constant_names_in_code$.setGlobalValue(NIL);
            {
              SubLObject cdolist_list_var = $constant_names_in_code$.getGlobalValue();
              SubLObject name = NIL;
              for (name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), name = cdolist_list_var.first()) {
                {
                  SubLObject constant = constants_high.find_constant(name);
                  if ((NIL != constants_high.uninstalled_constant_p(constant))) {
                    $bogus_constant_names_in_code$.setGlobalValue(cons(name, $bogus_constant_names_in_code$.getGlobalValue()));
                  }
                }
              }
            }
            $bogus_constant_names_in_code$.setGlobalValue(Sort.sort($bogus_constant_names_in_code$.getGlobalValue(), Symbols.symbol_function($sym3$STRING_), UNPROVIDED));
            utilities_macros.noting_progress_postamble();
          } finally {
            utilities_macros.$noting_progress_start_time$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return Sequences.length($bogus_constant_names_in_code$.getGlobalValue());
    }
  }

  public static final SubLObject declare_constant_completion_file() {
    declareFunction(myName, "constants_mentioned_in_code", "CONSTANTS-MENTIONED-IN-CODE", 0, 0, false);
    declareFunction(myName, "constant_mentioned_in_codeP", "CONSTANT-MENTIONED-IN-CODE?", 1, 0, false);
    declareFunction(myName, "bogus_constants_mentioned_in_code", "BOGUS-CONSTANTS-MENTIONED-IN-CODE", 0, 0, false);
    declareFunction(myName, "initialize_constant_names_in_code", "INITIALIZE-CONSTANT-NAMES-IN-CODE", 0, 0, false);
    declareFunction(myName, "compute_bogus_constant_names_in_code", "COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE", 0, 0, false);
    declareFunction(myName, "report_constant_names_in_code_but_not_kb", "REPORT-CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false);
    declareFunction(myName, "constant_names_in_code_but_not_kb", "CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_constant_completion_file() {
    $constant_names_in_code$ = deflexical("*CONSTANT-NAMES-IN-CODE*", ((NIL != Symbols.boundp($sym0$_CONSTANT_NAMES_IN_CODE_)) ? ((SubLObject) $constant_names_in_code$.getGlobalValue()) : NIL));
    $bogus_constant_names_in_code$ = deflexical("*BOGUS-CONSTANT-NAMES-IN-CODE*", ((NIL != Symbols.boundp($sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_)) ? ((SubLObject) $bogus_constant_names_in_code$.getGlobalValue()) : NIL));
    return NIL;
  }

  public static final SubLObject setup_constant_completion_file() {
    // CVS_ID("Id: constant-completion.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_CONSTANT_NAMES_IN_CODE_);
    subl_macro_promotions.declare_defglobal($sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_CONSTANT_NAMES_IN_CODE_ = makeSymbol("*CONSTANT-NAMES-IN-CODE*");
  public static final SubLSymbol $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_ = makeSymbol("*BOGUS-CONSTANT-NAMES-IN-CODE*");
  public static final SubLSymbol $sym2$FIND_CONSTANT = makeSymbol("FIND-CONSTANT");
  public static final SubLSymbol $sym3$STRING_ = makeSymbol("STRING<");
  public static final SubLString $str4$Computing_bogus_constant_names_in = makeString("Computing bogus constant names in code...");
  public static final SubLString $str5$The_following__A_constants_are_me = makeString("The following ~A constants are mentioned in code but missing in the KB:~%");
  public static final SubLString $str6$__A__ = makeString(" ~A~%");
  public static final SubLString $str7$__ = makeString("~%");
  public static final SubLString $str8$All_constants_mentioned_in_code_a = makeString("All constants mentioned in code are good in the KB.~%");

  //// Initializers

  public void declareFunctions() {
    declare_constant_completion_file();
  }

  public void initializeVariables() {
    init_constant_completion_file();
  }

  public void runTopLevelForms() {
    setup_constant_completion_file();
  }

}
