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

package com.cyc.cycjava_1.cycl.inference.modules.removal;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class removal_modules_reflexive_on extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_reflexive_on() {}
  public static final SubLFile me = new removal_modules_reflexive_on();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_reflexive_on";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexive-on.lisp", position = 863) 
  public static final SubLObject reflexive_on_predicateP(SubLObject object) {
    return makeBoolean((((!(ONE_INTEGER.eql(somewhere_cache.some_pred_assertion_somewhere_argnum($const0$reflexiveOn))))
            || (NIL != somewhere_cache.some_pred_assertion_somewhereP($const0$reflexiveOn, object, ONE_INTEGER, UNPROVIDED)))
           && (NIL != kb_mapping_utilities.some_pred_value(object, $const0$reflexiveOn, ONE_INTEGER, $kw1$TRUE))));
  }

  public static final class $reflexive_on_predicateP$UnaryFunction extends UnaryFunction {
    public $reflexive_on_predicateP$UnaryFunction() { super(extractFunctionNamed("REFLEXIVE-ON-PREDICATE?")); }
    public SubLObject processItem(SubLObject arg1) { return reflexive_on_predicateP(arg1); }
  }

  public static final SubLObject declare_removal_modules_reflexive_on_file() {
    declareFunction("reflexive_on_predicateP", "REFLEXIVE-ON-PREDICATE?", 1, 0, false); new $reflexive_on_predicateP$UnaryFunction();
    declareFunction("reflexive_on_cols", "REFLEXIVE-ON-COLS", 1, 0, false);
    declareFunction("removal_reflexive_on_expand", "REMOVAL-REFLEXIVE-ON-EXPAND", 1, 1, false);
    declareFunction("reflexive_on_completness", "REFLEXIVE-ON-COMPLETNESS", 1, 0, false);
    declareFunction("supports_for_reflexive_on", "SUPPORTS-FOR-REFLEXIVE-ON", 2, 0, false);
    declareFunction("reflexive_on_isa_support", "REFLEXIVE-ON-ISA-SUPPORT", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_reflexive_on_file() {
    return NIL;
  }

  public static final SubLObject setup_removal_modules_reflexive_on_file() {
        utilities_macros.note_funcall_helper_function($sym7$REFLEXIVE_ON_COMPLETNESS);
    inference_modules.inference_removal_module($kw8$REMOVAL_REFLEXIVE_ON, $list9);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$reflexiveOn = constant_handles.reader_make_constant_shell(makeString("reflexiveOn"));
  public static final SubLSymbol $kw1$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym2$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
  public static final SubLList $list3 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $kw4$REFLEXIVE_ON = makeKeyword("REFLEXIVE-ON");
  public static final SubLSymbol $kw5$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw6$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $sym7$REFLEXIVE_ON_COMPLETNESS = makeSymbol("REFLEXIVE-ON-COMPLETNESS");
  public static final SubLSymbol $kw8$REMOVAL_REFLEXIVE_ON = makeKeyword("REMOVAL-REFLEXIVE-ON");
  public static final SubLList $list9 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), cons(list(makeKeyword("TEST"), makeSymbol("REFLEXIVE-ON-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REFLEXIVE-ON-COMPLETNESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), makeKeyword("EXAMPLE"), makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)")});
  public static final SubLSymbol $kw10$EQUALITY = makeKeyword("EQUALITY");
  public static final SubLObject $const11$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLSymbol $kw12$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw13$DEFN = makeKeyword("DEFN");
  public static final SubLString $str14$Couldn_t_validate____isa__S__S__i = makeString("Couldn't validate (#$isa ~S ~S) in ~S");
  public static final SubLObject $const15$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_reflexive_on_file();
  }

  public void initializeVariables() {
    init_removal_modules_reflexive_on_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_reflexive_on_file();
  }

}
