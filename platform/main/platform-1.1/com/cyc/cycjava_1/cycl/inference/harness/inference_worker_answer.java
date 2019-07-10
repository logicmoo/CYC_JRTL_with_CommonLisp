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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class inference_worker_answer extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_answer() {}
  public static final SubLFile me = new inference_worker_answer();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 867) 
  public static final SubLObject answer_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw0$ANSWER == inference_datastructures_problem_link.problem_link_type(object))));
  }

  /** Creates a new answer link under INFERENCE.
  An :answer link is special because it supports an inference (namely, INFERENCE)
  rather than a problem. */
  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 1485) 
  public static final SubLObject new_answer_link(SubLObject inference) {
    checkType(inference, $sym1$INFERENCE_P);
    {
      SubLObject answer_link = new_answer_link_int(inference);
      inference_datastructures_inference.set_inference_root_link(inference, answer_link);
      return answer_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 1895) 
  public static final SubLObject new_answer_link_int(SubLObject inference) {
    {
      SubLObject explanatory_subquery = inference_datastructures_inference.inference_explanatory_subquery(inference);
      SubLObject answer_link = inference_datastructures_problem_link.new_problem_link_int(inference, $kw0$ANSWER);
      set_answer_link_explanatory_subquery(answer_link, explanatory_subquery);
      return answer_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2177) 
  public static final SubLObject answer_link_supported_inference(SubLObject answer_link) {
    checkType(answer_link, $sym2$ANSWER_LINK_P);
    return inference_datastructures_problem_link.problem_link_supported_object(answer_link);
  }

  /** @note this will return NIL if ANSWER-LINK gets closed later, after propagation. */
  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2348) 
  public static final SubLObject answer_link_propagatedP(SubLObject answer_link) {
    checkType(answer_link, $sym2$ANSWER_LINK_P);
    return inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(answer_link);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2603) 
  public static final SubLObject answer_link_supporting_mapped_problem(SubLObject answer_link) {
    checkType(answer_link, $sym2$ANSWER_LINK_P);
    return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(answer_link);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2783) 
  public static final SubLObject answer_link_explanatory_subquery(SubLObject answer_link) {
    checkType(answer_link, $sym2$ANSWER_LINK_P);
    return inference_datastructures_problem_link.problem_link_data(answer_link);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 2931) 
  public static final SubLObject set_answer_link_explanatory_subquery(SubLObject answer_link, SubLObject subquery) {
    checkType(answer_link, $sym2$ANSWER_LINK_P);
    checkType(subquery, $sym3$EXPLANATORY_SUBQUERY_SPEC_P);
    inference_datastructures_problem_link.set_problem_link_data(answer_link, subquery);
    return answer_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3181) 
  public static final SubLObject note_answer_link_propagated(SubLObject answer_link) {
    checkType(answer_link, $sym2$ANSWER_LINK_P);
    inference_datastructures_problem_link.problem_link_open_sole_supporting_mapped_problem(answer_link);
    return answer_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3369) 
  public static final SubLObject answer_link_supporting_problem(SubLObject answer_link) {
    {
      SubLObject mapped_problem = answer_link_supporting_mapped_problem(answer_link);
      return inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-answer.lisp", position = 3578) 
  public static final SubLObject answer_link_supporting_problem_wholly_explanatoryP(SubLObject answer_link) {
    return Equality.eq($kw4$ALL, answer_link_explanatory_subquery(answer_link));
  }

  public static final SubLObject declare_inference_worker_answer_file() {
    declareFunction(myName, "answer_link_p", "ANSWER-LINK-P", 1, 0, false);
    declareFunction(myName, "new_answer_link", "NEW-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "new_answer_link_int", "NEW-ANSWER-LINK-INT", 1, 0, false);
    declareFunction(myName, "answer_link_supported_inference", "ANSWER-LINK-SUPPORTED-INFERENCE", 1, 0, false);
    declareFunction(myName, "answer_link_propagatedP", "ANSWER-LINK-PROPAGATED?", 1, 0, false);
    declareFunction(myName, "answer_link_supporting_mapped_problem", "ANSWER-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "answer_link_explanatory_subquery", "ANSWER-LINK-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "set_answer_link_explanatory_subquery", "SET-ANSWER-LINK-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "note_answer_link_propagated", "NOTE-ANSWER-LINK-PROPAGATED", 1, 0, false);
    declareFunction(myName, "answer_link_supporting_problem", "ANSWER-LINK-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "answer_link_supporting_problem_wholly_explanatoryP", "ANSWER-LINK-SUPPORTING-PROBLEM-WHOLLY-EXPLANATORY?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_answer_file() {
    return NIL;
  }

  public static final SubLObject setup_inference_worker_answer_file() {
    // CVS_ID("Id: inference-worker-answer.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$ANSWER = makeKeyword("ANSWER");
  public static final SubLSymbol $sym1$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $sym2$ANSWER_LINK_P = makeSymbol("ANSWER-LINK-P");
  public static final SubLSymbol $sym3$EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("EXPLANATORY-SUBQUERY-SPEC-P");
  public static final SubLSymbol $kw4$ALL = makeKeyword("ALL");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_answer_file();
  }

  public void initializeVariables() {
    init_inference_worker_answer_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_answer_file();
  }

}
