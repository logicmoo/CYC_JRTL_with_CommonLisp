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
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.special_variable_state;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class wff_macros extends SubLTranslatedFile {

  //// Constructor

  private wff_macros() {}
  public static final SubLFile me = new wff_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.wff_macros";

  //// Definitions

  /** @return boolean; t iff currently within wff checking */
  @SubL(source = "cycl/wff-macros.lisp", position = 904) 
  public static final SubLObject within_wffP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$within_wffP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff-macros.lisp", position = 1809) 
  public static final SubLObject possibly_new_wff_memoization_state() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != wff_vars.$wff_memoization_state$.getDynamicValue(thread)) ? ((SubLObject) wff_vars.$wff_memoization_state$.getDynamicValue(thread)) : memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/wff-macros.lisp", position = 3859) 
  public static final SubLObject new_wff_special_variable_state(SubLObject v_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      wff_vars.check_wff_properties(v_properties);
      {
        SubLObject svs = special_variable_state.new_special_variable_state(NIL);
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(wff_vars.wff_properties_table()));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject indicator = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject datum = data;
              SubLObject current = datum;
              SubLObject var = NIL;
              SubLObject v_default = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
              var = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
              v_default = current.first();
              current = current.rest();
              if ((NIL == current)) {
                if ((NIL != var)) {
                  {
                    SubLObject desired_value = conses_high.getf(v_properties, indicator, v_default);
                    if ((!(desired_value.equal(v_default)))) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31672");
                    }
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list42);
              }
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return svs;
      }
    }
  }

  public static final SubLObject declare_wff_macros_file() {
    declareMacro(myName, "within_wff", "WITHIN-WFF");
    declareFunction(myName, "within_wffP", "WITHIN-WFF?", 0, 0, false);
    declareMacro(myName, "with_wff_formula", "WITH-WFF-FORMULA");
    declareMacro(myName, "with_wff_expansion", "WITH-WFF-EXPANSION");
    declareMacro(myName, "with_specified_wff_memoization_state", "WITH-SPECIFIED-WFF-MEMOIZATION-STATE");
    declareMacro(myName, "with_wff_memoization_state", "WITH-WFF-MEMOIZATION-STATE");
    declareFunction(myName, "possibly_new_wff_memoization_state", "POSSIBLY-NEW-WFF-MEMOIZATION-STATE", 0, 0, false);
    declareMacro(myName, "validating_expansion_of", "VALIDATING-EXPANSION-OF");
    declareMacro(myName, "validating_expansion_of_nat", "VALIDATING-EXPANSION-OF-NAT");
    declareMacro(myName, "defparameter_wff", "DEFPARAMETER-WFF");
    declareMacro(myName, "with_wff_properties", "WITH-WFF-PROPERTIES");
    declareFunction(myName, "new_wff_special_variable_state", "NEW-WFF-SPECIAL-VARIABLE-STATE", 1, 0, false);
    declareMacro(myName, "with_wff_special_variable_state", "WITH-WFF-SPECIAL-VARIABLE-STATE");
    return NIL;
  }

  public static final SubLObject init_wff_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_wff_macros_file() {
    // CVS_ID("Id: wff-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE, $sym20$WITH_WFF_MEMOIZATION_STATE);
    access_macros.register_macro_helper($sym39$NEW_WFF_SPECIAL_VARIABLE_STATE, $sym41$WITH_WFF_PROPERTIES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*WITHIN-WFF?*"), T));
  public static final SubLList $list2 = list(makeSymbol("FORMULA"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$_WFF_FORMULA_ = makeSymbol("*WFF-FORMULA*");
  public static final SubLSymbol $sym4$_WFF_ORIGINAL_FORMULA_ = makeSymbol("*WFF-ORIGINAL-FORMULA*");
  public static final SubLSymbol $sym5$FIF = makeSymbol("FIF");
  public static final SubLList $list6 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-ORIGINAL-FORMULA")));
  public static final SubLList $list7 = list(makeSymbol("WFF-ORIGINAL-FORMULA"));
  public static final SubLList $list8 = list(makeSymbol("EXPANSION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym9$_WFF_EXPANSION_FORMULA_ = makeSymbol("*WFF-EXPANSION-FORMULA*");
  public static final SubLList $list10 = list(makeSymbol("CAND"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("WFF-EXPANSION-FORMULA")));
  public static final SubLList $list11 = list(makeSymbol("WFF-EXPANSION-FORMULA"));
  public static final SubLList $list12 = list(makeSymbol("STATE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym13$_WFF_MEMOIZATION_STATE_ = makeSymbol("*WFF-MEMOIZATION-STATE*");
  public static final SubLSymbol $sym14$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
  public static final SubLList $list15 = list(makeSymbol("*WFF-MEMOIZATION-STATE*"));
  public static final SubLList $list16 = list(makeSymbol("PUNLESS"), list(makeSymbol("WITHIN-WFF?")), list(makeSymbol("RESET-WFF-STATE")));
  public static final SubLSymbol $sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE = makeSymbol("WITH-SPECIFIED-WFF-MEMOIZATION-STATE");
  public static final SubLList $list18 = list(makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE"));
  public static final SubLSymbol $sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE = makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE");
  public static final SubLSymbol $sym20$WITH_WFF_MEMOIZATION_STATE = makeSymbol("WITH-WFF-MEMOIZATION-STATE");
  public static final SubLSymbol $sym21$_UNEXPANDED_FORMULA_ = makeSymbol("*UNEXPANDED-FORMULA*");
  public static final SubLList $list22 = list(list(makeSymbol("*VALIDATE-EXPANSIONS?*"), NIL), list(makeSymbol("*VALIDATING-EXPANSION?*"), T));
  public static final SubLList $list23 = list(list(makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*"), NIL));
  public static final SubLSymbol $sym24$VALIDATING_EXPANSION_OF = makeSymbol("VALIDATING-EXPANSION-OF");
  public static final SubLList $list25 = list(makeSymbol("VARIABLE"), makeSymbol("KEYWORD"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("VACCESS"), list(makeSymbol("QUOTE"), makeSymbol("PROTECTED"))));
  public static final SubLSymbol $sym26$PROTECTED = makeSymbol("PROTECTED");
  public static final SubLSymbol $sym27$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym28$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym29$SELF_EVALUATING_FORM_P = makeSymbol("SELF-EVALUATING-FORM-P");
  public static final SubLSymbol $sym30$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym31$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym32$PROCLAIM = makeSymbol("PROCLAIM");
  public static final SubLSymbol $sym33$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym34$VACCESS = makeSymbol("VACCESS");
  public static final SubLSymbol $sym35$DEFPARAMETER = makeSymbol("DEFPARAMETER");
  public static final SubLSymbol $sym36$NOTE_WFF_PROPERTY = makeSymbol("NOTE-WFF-PROPERTY");
  public static final SubLList $list37 = list(makeSymbol("PROPERTIES"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym38$WFF_SVS = makeUninternedSymbol("WFF-SVS");
  public static final SubLSymbol $sym39$NEW_WFF_SPECIAL_VARIABLE_STATE = makeSymbol("NEW-WFF-SPECIAL-VARIABLE-STATE");
  public static final SubLSymbol $sym40$WITH_WFF_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-WFF-SPECIAL-VARIABLE-STATE");
  public static final SubLSymbol $sym41$WITH_WFF_PROPERTIES = makeSymbol("WITH-WFF-PROPERTIES");
  public static final SubLList $list42 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"));
  public static final SubLList $list43 = list(makeSymbol("WFF-SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym44$SVS = makeUninternedSymbol("SVS");
  public static final SubLSymbol $sym45$_WFF_PROPERTIES_ = makeSymbol("*WFF-PROPERTIES*");
  public static final SubLSymbol $sym46$WITH_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-SPECIAL-VARIABLE-STATE");

  //// Initializers

  public void declareFunctions() {
    declare_wff_macros_file();
  }

  public void initializeVariables() {
    init_wff_macros_file();
  }

  public void runTopLevelForms() {
    setup_wff_macros_file();
  }

}
