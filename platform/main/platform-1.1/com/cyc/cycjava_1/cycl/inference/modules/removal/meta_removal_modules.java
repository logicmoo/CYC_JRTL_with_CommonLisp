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
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.inference_completeness_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;

public  final class meta_removal_modules extends SubLTranslatedFile {

  //// Constructor

  private meta_removal_modules() {}
  public static final SubLFile me = new meta_removal_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.meta_removal_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 904) 
  public static final SubLObject meta_removal_complete_pos_required() {
    {
      SubLObject problem = inference_worker.currently_active_problem();
      if ((NIL != problem)) {
        return makeBoolean(((NIL != inference_datastructures_problem.problem_has_possible_removal_tacticP(problem, $kw0$TACTICAL))
               && (NIL == inference_datastructures_problem.problem_has_complete_possible_removal_tacticP(problem, $kw0$TACTICAL))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 1891) 
  public static final SubLObject meta_removal_completely_enumerable_pos_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return makeBoolean(((NIL != meta_removal_complete_pos_required())
           && (NIL != inference_completeness_utilities.inference_completely_enumerable_asentP(asent, mt_relevance_macros.inference_relevant_mt()))));
  }

  @SubL(source = "cycl/inference/modules/removal/meta-removal-modules.lisp", position = 2301) 
  public static final SubLObject meta_removal_completely_decidable_pos_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return makeBoolean(((NIL != meta_removal_complete_pos_required())
           && (NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt()))));
  }

  public static final SubLObject declare_meta_removal_modules_file() {
    declareFunction(myName, "meta_removal_complete_pos_required", "META-REMOVAL-COMPLETE-POS-REQUIRED", 0, 0, false);
    declareFunction(myName, "meta_removal_complete_pos_cost", "META-REMOVAL-COMPLETE-POS-COST", 1, 1, false);
    declareFunction(myName, "meta_removal_completely_enumerable_pos_required", "META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED", 1, 1, false);
    declareFunction(myName, "meta_removal_completely_decidable_pos_required", "META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_meta_removal_modules_file() {
    return NIL;
  }

  public static final SubLObject setup_meta_removal_modules_file() {
        inference_modules.inference_meta_removal_module($kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS, $list2);
    inference_modules.inference_meta_removal_module($kw3$META_REMOVAL_COMPLETELY_DECIDABLE_POS, $list4);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
  public static final SubLList $list2 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <not fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), makeKeyword("EXAMPLE"), makeString("(#$borderingCountries #$Canada ?WHAT)\n    given other tactics to solve this and\n    (#$completeExtentEnumerable #$borderingCountries)")});
  public static final SubLSymbol $kw3$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("META-REMOVAL-COMPLETE-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <fully bound>))\n    via indirection, by execution of other tactics on the problem\n    and completeness meta-knowledge about the sentence."), makeKeyword("EXAMPLE"), makeString("(#$borderingCountries #$Canada #$Mexico)\n    given other tactics to solve this and\n    (#$completeExtentDecidable #$borderingCountries)")});

  //// Initializers

  public void declareFunctions() {
    declare_meta_removal_modules_file();
  }

  public void initializeVariables() {
    init_meta_removal_modules_file();
  }

  public void runTopLevelForms() {
    setup_meta_removal_modules_file();
  }

}
