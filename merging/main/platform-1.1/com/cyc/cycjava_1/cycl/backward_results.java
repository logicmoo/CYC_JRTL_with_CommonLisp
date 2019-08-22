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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;

public  final class backward_results extends SubLTranslatedFile {

  //// Constructor

  private backward_results() {}
  public static final SubLFile me = new backward_results();
  public static final String myName = "com.cyc.cycjava_1.cycl.backward_results";

  //// Definitions

  /** The level of semantic validation performed for intermediate steps of successful inferences.
Can be one of  :all :arg-type :minimal :none */
  @SubL(source = "cycl/backward-results.lisp", position = 1554) 
  public static SubLSymbol $inference_intermediate_step_validation_level$ = null;

  @SubL(source = "cycl/backward-results.lisp", position = 1780) 
  public static SubLSymbol $inference_answer_template$ = null;

  public static final SubLObject declare_backward_results_file() {
    declareFunction(myName, "reject_inference", "REJECT-INFERENCE", 1, 0, false);
    declareFunction(myName, "note_inference_rejected", "NOTE-INFERENCE-REJECTED", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_backward_results_file() {
    $inference_intermediate_step_validation_level$ = defparameter("*INFERENCE-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $kw4$NONE);
    $inference_answer_template$ = defparameter("*INFERENCE-ANSWER-TEMPLATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_backward_results_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$INFERENCE_REJECTED = makeKeyword("INFERENCE-REJECTED");
  public static final SubLList $list1 = list(makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS"));
  public static final SubLSymbol $sym2$WARN = makeSymbol("WARN");
  public static final SubLString $str3$Inference_rejected____S = makeString("Inference rejected : ~S");
  public static final SubLSymbol $kw4$NONE = makeKeyword("NONE");

  //// Initializers

  public void declareFunctions() {
    declare_backward_results_file();
  }

  public void initializeVariables() {
    init_backward_results_file();
  }

  public void runTopLevelForms() {
    setup_backward_results_file();
  }

}
