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

package com.cyc.cycjava_1.cycl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tries;

public  final class constant_completion_low extends SubLTranslatedFile {

  //// Constructor

  private constant_completion_low() {}
  public static final SubLFile me = new constant_completion_low();
  public static final String myName = "com.cyc.cycjava_1.cycl.constant_completion_low";

  //// Definitions

  /** Table for indexing constants by the string for their name */
  @SubL(source = "cycl/constant-completion-low.lisp", position = 852) 
  private static SubLSymbol $constant_completion_table$ = null;

  @SubL(source = "cycl/constant-completion-low.lisp", position = 1103) 
  public static SubLSymbol $require_valid_constants$ = null;

  /** Return a constant or constant shell whose name exactly matches STRING. */
  @SubL(source = "cycl/constant-completion-low.lisp", position = 1230) 
  public static final SubLObject constant_shell_from_name(SubLObject string) {
    checkType(string, $sym2$STRINGP);
    return tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, ZERO_INTEGER, NIL);
  }

  @SubL(source = "cycl/constant-completion-low.lisp", position = 1527) 
  public static final SubLObject kb_constant_complete_exact_internal(SubLObject string, SubLObject start, SubLObject end) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, start, end);
        if ((NIL != constant_handles.constant_p(answer))) {
          if ((NIL != $require_valid_constants$.getDynamicValue(thread))) {
            if ((NIL == constant_handles.valid_constant_handleP(answer))) {
              answer = NIL;
            }
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/constant-completion-low.lisp", position = 1836) 
  public static final SubLObject kb_constant_complete_internal(SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = tries.trie_prefix($constant_completion_table$.getGlobalValue(), prefix, case_sensitiveP, exact_lengthP, start, end);
        if ((NIL != $require_valid_constants$.getDynamicValue(thread))) {
          answer = Sequences.delete_if($sym3$INVALID_CONSTANT_HANDLE_, answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return answer;
      }
    }
  }

  /** Add CONSTANT to the completions table under the name STRING. */
  @SubL(source = "cycl/constant-completion-low.lisp", position = 4170) 
  public static final SubLObject add_constant_to_completions(SubLObject constant, SubLObject string) {
    checkType(constant, $sym5$CONSTANT_P);
    checkType(string, $sym2$STRINGP);
    tries.trie_insert($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
    return constant;
  }

  /** Remove CONSTANT from the completion table under the name STRING. */
  @SubL(source = "cycl/constant-completion-low.lisp", position = 4443) 
  public static final SubLObject remove_constant_from_completions(SubLObject constant, SubLObject string) {
    checkType(constant, $sym5$CONSTANT_P);
    checkType(string, $sym2$STRINGP);
    tries.trie_remove($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
    return constant;
  }

  @SubL(source = "cycl/constant-completion-low.lisp", position = 4725) 
  public static final SubLObject kb_new_constant_completion_iterator_internal(SubLObject forwardP) {
    if ((forwardP == UNPROVIDED)) {
      forwardP = T;
    }
    return tries.new_trie_iterator($constant_completion_table$.getGlobalValue(), forwardP);
  }

  public static final SubLObject declare_constant_completion_low_file() {
    declareFunction(myName, "constant_shell_from_name", "CONSTANT-SHELL-FROM-NAME", 1, 0, false);
    declareFunction(myName, "kb_constant_complete_exact_internal", "KB-CONSTANT-COMPLETE-EXACT-INTERNAL", 3, 0, false);
    declareFunction(myName, "kb_constant_complete_internal", "KB-CONSTANT-COMPLETE-INTERNAL", 5, 0, false);
    declareFunction(myName, "kb_constant_apropos_internal", "KB-CONSTANT-APROPOS-INTERNAL", 4, 0, false);
    declareFunction(myName, "kb_constant_postfix_internal", "KB-CONSTANT-POSTFIX-INTERNAL", 4, 0, false);
    declareFunction(myName, "kb_n_constants_before_internal", "KB-N-CONSTANTS-BEFORE-INTERNAL", 6, 0, false);
    declareFunction(myName, "kb_n_constants_after_internal", "KB-N-CONSTANTS-AFTER-INTERNAL", 6, 0, false);
    declareFunction(myName, "kb_n_constants_internal", "KB-N-CONSTANTS-INTERNAL", 7, 0, false);
    declareFunction(myName, "clear_constant_completion_table", "CLEAR-CONSTANT-COMPLETION-TABLE", 0, 0, false);
    declareFunction(myName, "add_constant_to_completions", "ADD-CONSTANT-TO-COMPLETIONS", 2, 0, false);
    declareFunction(myName, "remove_constant_from_completions", "REMOVE-CONSTANT-FROM-COMPLETIONS", 2, 0, false);
    declareFunction(myName, "kb_new_constant_completion_iterator_internal", "KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 0, 1, false);
    declareFunction(myName, "kb_new_directed_constant_completion_iterator_internal", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 1, 5, false);
    return NIL;
  }

  public static final SubLObject init_constant_completion_low_file() {
    $constant_completion_table$ = deflexical("*CONSTANT-COMPLETION-TABLE*", maybeDefault( $sym0$_CONSTANT_COMPLETION_TABLE_, $constant_completion_table$, ()-> (tries.create_trie(T, $str1$Constant_Completion_Table, UNPROVIDED, UNPROVIDED))));
    $require_valid_constants$ = defparameter("*REQUIRE-VALID-CONSTANTS*", T);
    return NIL;
  }

  public static final SubLObject setup_constant_completion_low_file() {
    // CVS_ID("Id: constant-completion-low.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_CONSTANT_COMPLETION_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_CONSTANT_COMPLETION_TABLE_ = makeSymbol("*CONSTANT-COMPLETION-TABLE*");
  public static final SubLString $str1$Constant_Completion_Table = makeString("Constant Completion Table");
  public static final SubLSymbol $sym2$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym3$INVALID_CONSTANT_HANDLE_ = makeSymbol("INVALID-CONSTANT-HANDLE?");
  public static final SubLSymbol $sym4$CHAR_EQUAL = makeSymbol("CHAR-EQUAL");
  public static final SubLSymbol $sym5$CONSTANT_P = makeSymbol("CONSTANT-P");

  //// Initializers

  public void declareFunctions() {
    declare_constant_completion_low_file();
  }

  public void initializeVariables() {
    init_constant_completion_low_file();
  }

  public void runTopLevelForms() {
    setup_constant_completion_low_file();
  }

}
