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

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.equality_store;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class rewrite_of_propagation extends SubLTranslatedFile {

  //// Constructor

  private rewrite_of_propagation() {}
  public static final SubLFile me = new rewrite_of_propagation();
  public static final String myName = "com.cyc.cycjava_1.cycl.rewrite_of_propagation";

  //// Definitions

  /** Enable assertion propagation across equal forts when this is non-nil. */
  @SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1044) 
  public static SubLSymbol $enable_rewrite_of_propagationP$ = null;

  @SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1905) 
  private static SubLSymbol $propagate_rewrite_of_source_term$ = null;

  @SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1982) 
  private static SubLSymbol $propagate_rewrite_of_target_term$ = null;

  @SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2044) 
  private static SubLSymbol $propagate_rewrite_of_assertion$ = null;

  @SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2831) 
  public static final SubLObject perform_rewrite_of_propagation(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $enable_rewrite_of_propagationP$.getDynamicValue(thread))) {
        {
          SubLObject forts_with_rewrite_of = cycl_utilities.expression_gather(assertion, $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          if ((NIL != forts_with_rewrite_of)) {
            {
              SubLObject cdolist_list_var = forts_with_rewrite_of;
              SubLObject fort = NIL;
              for (fort = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), fort = cdolist_list_var.first()) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4713");
              }
            }
          }
        }
      }
      return assertion;
    }
  }

  @SubL(source = "cycl/rewrite-of-propagation.lisp", position = 3908) 
  public static final SubLObject fort_with_some_source_rewrite_of_assertions(SubLObject fort) {
    return equality_store.some_source_rewrite_of_assertions_somewhereP(fort);
  }

  public static final class $fort_with_some_source_rewrite_of_assertions$UnaryFunction extends UnaryFunction {
    public $fort_with_some_source_rewrite_of_assertions$UnaryFunction() { super(extractFunctionNamed("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS")); }
    public SubLObject processItem(SubLObject arg1) { return fort_with_some_source_rewrite_of_assertions(arg1); }
  }

  public static final SubLObject declare_rewrite_of_propagation_file() {
    //declareFunction(myName, "rewrite_of_after_adding", "REWRITE-OF-AFTER-ADDING", 2, 0, false);
    //declareFunction(myName, "rewrite_of_after_adding_internal", "REWRITE-OF-AFTER-ADDING-INTERNAL", 3, 0, false);
    //declareFunction(myName, "propagate_rewrite_of_assertion", "PROPAGATE-REWRITE-OF-ASSERTION", 1, 0, false);
    declareFunction(myName, "perform_rewrite_of_propagation", "PERFORM-REWRITE-OF-PROPAGATION", 1, 0, false);
    //declareFunction(myName, "perform_rewrite_of_propagation_internal", "PERFORM-REWRITE-OF-PROPAGATION-INTERNAL", 2, 0, false);
    declareFunction(myName, "fort_with_some_source_rewrite_of_assertions", "FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS", 1, 0, false); new $fort_with_some_source_rewrite_of_assertions$UnaryFunction();
    //declareFunction(myName, "propagate_assertion_via_rewrite_of", "PROPAGATE-ASSERTION-VIA-REWRITE-OF", 4, 0, false);
    //declareFunction(myName, "should_propagate_rewrite_of_cnf", "SHOULD-PROPAGATE-REWRITE-OF-CNF", 3, 0, false);
    //declareFunction(myName, "note_should_propagate_rewrite_of_cnf", "NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF", 0, 0, false);
    //declareFunction(myName, "propagate_rewrite_of_cnf", "PROPAGATE-REWRITE-OF-CNF", 3, 0, false);
    //declareFunction(myName, "propagate_rewrite_of_cnf_internal", "PROPAGATE-REWRITE-OF-CNF-INTERNAL", 4, 0, false);
    //declareFunction(myName, "propagate_rewrite_of_atomic_sentence", "PROPAGATE-REWRITE-OF-ATOMIC-SENTENCE", 4, 0, false);
    //declareFunction(myName, "determine_propagate_rewrite_of_mt", "DETERMINE-PROPAGATE-REWRITE-OF-MT", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_rewrite_of_propagation_file() {
    $enable_rewrite_of_propagationP$ = defparameter("*ENABLE-REWRITE-OF-PROPAGATION?*", T);
    $propagate_rewrite_of_source_term$ = defparameter("*PROPAGATE-REWRITE-OF-SOURCE-TERM*", NIL);
    $propagate_rewrite_of_target_term$ = defparameter("*PROPAGATE-REWRITE-OF-TARGET-TERM*", NIL);
    $propagate_rewrite_of_assertion$ = defparameter("*PROPAGATE-REWRITE-OF-ASSERTION*", NIL);
    return NIL;
  }

  public static final SubLObject setup_rewrite_of_propagation_file() {
        utilities_macros.register_kb_function($sym2$REWRITE_OF_AFTER_ADDING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$rewriteOf = constant_handles.reader_make_constant_shell(makeString("rewriteOf"));
  public static final SubLSymbol $kw1$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym2$REWRITE_OF_AFTER_ADDING = makeSymbol("REWRITE-OF-AFTER-ADDING");
  public static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const4$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym5$PROPAGATE_REWRITE_OF_ASSERTION = makeSymbol("PROPAGATE-REWRITE-OF-ASSERTION");
  public static final SubLSymbol $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS = makeSymbol("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS");
  public static final SubLSymbol $kw7$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym8$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym9$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw10$PROPAGATE_REWRITE_OF_CNF = makeKeyword("PROPAGATE-REWRITE-OF-CNF");
  public static final SubLObject $const11$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

  //// Initializers

  public void declareFunctions() {
    declare_rewrite_of_propagation_file();
  }

  public void initializeVariables() {
    init_rewrite_of_propagation_file();
  }

  public void runTopLevelForms() {
    setup_rewrite_of_propagation_file();
  }

}
