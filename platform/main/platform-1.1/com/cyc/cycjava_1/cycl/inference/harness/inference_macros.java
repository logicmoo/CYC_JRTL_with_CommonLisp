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
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class inference_macros extends SubLTranslatedFile {

  //// Constructor

  private inference_macros() {}
  public static final SubLFile me = new inference_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_macros";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 2786) 
  public static final SubLObject do_problem_link_open_matchP(SubLObject openP, SubLObject link, SubLObject supporting_mapped_problem) {
    return makeBoolean(((NIL == openP)
          || (NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem))));
  }

  @SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8460) 
  public static SubLSymbol $controlling_inferences$ = null;

  /** Return nil or inference-p; the current inference controlling the current work in progress, or NIL if none. */
  @SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8628) 
  public static final SubLObject current_controlling_inference() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $controlling_inferences$.getDynamicValue(thread).first();
    }
  }

  @SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9283) 
  public static SubLSymbol $controlling_strategy$ = null;

  public static final SubLObject declare_inference_macros_file() {
    declareMacro(myName, "with_inference_var", "WITH-INFERENCE-VAR");
    declareMacro(myName, "with_problem_store_var", "WITH-PROBLEM-STORE-VAR");
    declareMacro(myName, "with_new_problem_store", "WITH-NEW-PROBLEM-STORE");
    declareMacro(myName, "do_problem_argument_links", "DO-PROBLEM-ARGUMENT-LINKS");
    declareMacro(myName, "do_problem_link_supporting_mapped_problems", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
    declareFunction(myName, "do_problem_link_open_matchP", "DO-PROBLEM-LINK-OPEN-MATCH?", 3, 0, false);
    declareMacro(myName, "do_problem_link_supporting_mapped_problems_numbered", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
    declareMacro(myName, "do_problem_link_supporting_problems", "DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
    declareMacro(myName, "do_problem_link_sibling_links", "DO-PROBLEM-LINK-SIBLING-LINKS");
    declareMacro(myName, "do_problem_link_dependent_links", "DO-PROBLEM-LINK-DEPENDENT-LINKS");
    declareMacro(myName, "do_problem_link_argument_links", "DO-PROBLEM-LINK-ARGUMENT-LINKS");
    declareMacro(myName, "do_problem_link_proofs_int", "DO-PROBLEM-LINK-PROOFS-INT");
    declareMacro(myName, "do_problem_link_proofs_computed", "DO-PROBLEM-LINK-PROOFS-COMPUTED");
    declareMacro(myName, "do_problem_link_proofs", "DO-PROBLEM-LINK-PROOFS");
    declareMacro(myName, "do_join_ordered_link_motivated_residual_transformation_links", "DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
    declareMacro(myName, "do_transformation_link_motivated_residual_transformation_links", "DO-TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
    declareMacro(myName, "with_forward_problem_store_reuse", "WITH-FORWARD-PROBLEM-STORE-REUSE");
    declareMacro(myName, "with_forward_dnf_type_filtering", "WITH-FORWARD-DNF-TYPE-FILTERING");
    declareMacro(myName, "with_forward_inference_all_rules_allowed", "WITH-FORWARD-INFERENCE-ALL-RULES-ALLOWED");
    declareMacro(myName, "with_forward_inference_no_rules_allowed", "WITH-FORWARD-INFERENCE-NO-RULES-ALLOWED");
    declareMacro(myName, "with_forward_inference_allowed_rules", "WITH-FORWARD-INFERENCE-ALLOWED-RULES");
    declareFunction(myName, "current_controlling_inference", "CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
    declareFunction(myName, "current_controlling_inferences", "CURRENT-CONTROLLING-INFERENCES", 0, 0, false);
    declareMacro(myName, "within_controlling_inference", "WITHIN-CONTROLLING-INFERENCE");
    declareMacro(myName, "within_no_controlling_inference", "WITHIN-NO-CONTROLLING-INFERENCE");
    declareFunction(myName, "current_controlling_strategy", "CURRENT-CONTROLLING-STRATEGY", 0, 0, false);
    declareMacro(myName, "within_controlling_strategy", "WITHIN-CONTROLLING-STRATEGY");
    declareMacro(myName, "within_no_controlling_strategy", "WITHIN-NO-CONTROLLING-STRATEGY");
    declareMacro(myName, "possibly_gathering_pad_metrics", "POSSIBLY-GATHERING-PAD-METRICS");
    declareMacro(myName, "do_pattern_possible_disjuncts", "DO-PATTERN-POSSIBLE-DISJUNCTS");
    declareMacro(myName, "do_asked_queries", "DO-ASKED-QUERIES");
    declareMacro(myName, "do_asked_queries_in_directory", "DO-ASKED-QUERIES-IN-DIRECTORY");
    return NIL;
  }

  public static final SubLObject init_inference_macros_file() {
    $controlling_inferences$ = defparameter("*CONTROLLING-INFERENCES*", NIL);
    $controlling_strategy$ = defparameter("*CONTROLLING-STRATEGY*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_macros_file() {
    // CVS_ID("Id: inference-macros.lisp 128378 2009-07-22 17:22:05Z jantos ");
    access_macros.register_macro_helper($sym28$DO_PROBLEM_LINK_OPEN_MATCH_, $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("INFERENCE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym3$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym4$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE = makeSymbol("DESTROY-INFERENCE-AND-PROBLEM-STORE");
  public static final SubLList $list6 = list(list(makeSymbol("PROBLEM-STORE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$DESTROY_PROBLEM_STORE = makeSymbol("DESTROY-PROBLEM-STORE");
  public static final SubLList $list8 = list(list(makeSymbol("PROBLEM-STORE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym9$WITH_PROBLEM_STORE_VAR = makeSymbol("WITH-PROBLEM-STORE-VAR");
  public static final SubLSymbol $sym10$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym11$NEW_PROBLEM_STORE = makeSymbol("NEW-PROBLEM-STORE");
  public static final SubLList $list12 = list(list(makeSymbol("LINK-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list13 = list(makeKeyword("TYPE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw14$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw15$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw16$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym17$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLSymbol $sym18$PROBLEM_ARGUMENT_LINKS = makeSymbol("PROBLEM-ARGUMENT-LINKS");
  public static final SubLSymbol $sym19$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");
  public static final SubLSymbol $sym20$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym21$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");
  public static final SubLList $list22 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list23 = list(makeKeyword("OPEN?"), makeKeyword("DONE"));
  public static final SubLSymbol $kw24$OPEN_ = makeKeyword("OPEN?");
  public static final SubLSymbol $sym25$LINK_VAR = makeUninternedSymbol("LINK-VAR");
  public static final SubLSymbol $sym26$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLSymbol $sym28$DO_PROBLEM_LINK_OPEN_MATCH_ = makeSymbol("DO-PROBLEM-LINK-OPEN-MATCH?");
  public static final SubLSymbol $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLList $list30 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list31 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym32$CINC = makeSymbol("CINC");
  public static final SubLList $list33 = list(list(makeSymbol("SUPPORTING-PROBLEM-VAR"), makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym34$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");
  public static final SubLSymbol $sym35$MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");
  public static final SubLSymbol $sym36$MAPPED_PROBLEM_VARIABLE_MAP = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");
  public static final SubLList $list37 = list(list(makeSymbol("SIBLING-LINK-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list38 = list(makeKeyword("DONE"));
  public static final SubLSymbol $sym39$SUPPORTED_PROBLEM = makeUninternedSymbol("SUPPORTED-PROBLEM");
  public static final SubLSymbol $sym40$LINK_VAR = makeUninternedSymbol("LINK-VAR");
  public static final SubLSymbol $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
  public static final SubLSymbol $sym42$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list43 = list(list(makeSymbol("DEPENDENT-LINK-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("LINK-TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list44 = list(makeKeyword("LINK-TYPE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw45$LINK_TYPE = makeKeyword("LINK-TYPE");
  public static final SubLSymbol $sym46$SUPPORTED_PROBLEM = makeUninternedSymbol("SUPPORTED-PROBLEM");
  public static final SubLSymbol $sym47$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");
  public static final SubLList $list48 = list(list(makeSymbol("ARGUMENT-LINK-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("LINK-TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list49 = list(makeKeyword("OPEN?"), makeKeyword("LINK-TYPE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym50$SUPPORTING_PROBLEM = makeUninternedSymbol("SUPPORTING-PROBLEM");
  public static final SubLSymbol $sym51$VARIABLE_MAP = makeUninternedSymbol("VARIABLE-MAP");
  public static final SubLSymbol $sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
  public static final SubLSymbol $sym53$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list54 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("LINK"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list55 = list(makeKeyword("PROOF-STATUS"));
  public static final SubLSymbol $kw56$PROOF_STATUS = makeKeyword("PROOF-STATUS");
  public static final SubLSymbol $sym57$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym58$PROBLEM_LINK_PROOFS = makeSymbol("PROBLEM-LINK-PROOFS");
  public static final SubLSymbol $sym59$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
  public static final SubLSymbol $sym60$LNK = makeUninternedSymbol("LNK");
  public static final SubLSymbol $sym61$PROBLEM = makeUninternedSymbol("PROBLEM");
  public static final SubLSymbol $sym62$DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");
  public static final SubLSymbol $sym63$PROOF_LINK = makeSymbol("PROOF-LINK");
  public static final SubLSymbol $sym64$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym65$_PROBLEM_LINK_DATASTRUCTURE_STORES_PROOFS__ = makeSymbol("*PROBLEM-LINK-DATASTRUCTURE-STORES-PROOFS?*");
  public static final SubLSymbol $sym66$DO_PROBLEM_LINK_PROOFS_INT = makeSymbol("DO-PROBLEM-LINK-PROOFS-INT");
  public static final SubLSymbol $sym67$DO_PROBLEM_LINK_PROOFS_COMPUTED = makeSymbol("DO-PROBLEM-LINK-PROOFS-COMPUTED");
  public static final SubLList $list68 = list(list(makeSymbol("RT-LINK-VAR"), makeSymbol("JO-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym69$JO_LINK_VAR = makeUninternedSymbol("JO-LINK-VAR");
  public static final SubLSymbol $sym70$MOTIVATING_CONJUNCTION_PROBLEM = makeUninternedSymbol("MOTIVATING-CONJUNCTION-PROBLEM");
  public static final SubLSymbol $kw71$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $sym72$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_ = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?");
  public static final SubLList $list73 = list(list(makeSymbol("RT-LINK-VAR"), makeSymbol("T-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym74$T_LINK_VAR = makeUninternedSymbol("T-LINK-VAR");
  public static final SubLSymbol $sym75$JO_LINK_VAR = makeUninternedSymbol("JO-LINK-VAR");
  public static final SubLSymbol $sym76$DO_PROBLEM_LINK_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-LINK-DEPENDENT-LINKS");
  public static final SubLSymbol $kw77$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $sym78$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS = makeSymbol("DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
  public static final SubLSymbol $sym79$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_ = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?");
  public static final SubLList $list80 = list(list(makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), NIL));
  public static final SubLList $list81 = list(list(makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));
  public static final SubLList $list82 = list(list(makeSymbol("*TYPE-FILTER-FORWARD-DNF*"), T));
  public static final SubLList $list83 = list(list(makeSymbol("*FORWARD-INFERENCE-ALLOWED-RULES*"), makeKeyword("ALL")));
  public static final SubLSymbol $sym84$WITH_FORWARD_INFERENCE_ALLOWED_RULES = makeSymbol("WITH-FORWARD-INFERENCE-ALLOWED-RULES");
  public static final SubLList $list85 = list(makeSymbol("RULES"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym86$_FORWARD_INFERENCE_ALLOWED_RULES_ = makeSymbol("*FORWARD-INFERENCE-ALLOWED-RULES*");
  public static final SubLSymbol $sym87$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLList $list88 = list(makeSymbol("INFERENCE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym89$_CONTROLLING_INFERENCES_ = makeSymbol("*CONTROLLING-INFERENCES*");
  public static final SubLSymbol $sym90$CONS = makeSymbol("CONS");
  public static final SubLList $list91 = list(makeSymbol("*CONTROLLING-INFERENCES*"));
  public static final SubLSymbol $sym92$WITHIN_CONTROLLING_INFERENCE = makeSymbol("WITHIN-CONTROLLING-INFERENCE");
  public static final SubLSymbol $sym93$WITHIN_NO_CONTROLLING_STRATEGY = makeSymbol("WITHIN-NO-CONTROLLING-STRATEGY");
  public static final SubLList $list94 = list(makeSymbol("STRATEGY"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym95$_CONTROLLING_STRATEGY_ = makeSymbol("*CONTROLLING-STRATEGY*");
  public static final SubLSymbol $sym96$WITHIN_CONTROLLING_STRATEGY = makeSymbol("WITHIN-CONTROLLING-STRATEGY");
  public static final SubLList $list97 = list(list(makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw98$CYC_MAINT = makeKeyword("CYC-MAINT");
  public static final SubLList $list99 = list(list(makeSymbol("DISJUNCT-VAR"), makeSymbol("PATTERN")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym100$PATTERN_VAR = makeUninternedSymbol("PATTERN-VAR");
  public static final SubLSymbol $sym101$OR_PATTERN_P = makeSymbol("OR-PATTERN-P");
  public static final SubLSymbol $sym102$REST = makeSymbol("REST");
  public static final SubLList $list103 = list(list(makeSymbol("QUERY-INFO-VAR"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("ELEMENT-NUM"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list104 = list(makeKeyword("ELEMENT-NUM"), makeKeyword("DONE?"));
  public static final SubLSymbol $kw105$ELEMENT_NUM = makeKeyword("ELEMENT-NUM");
  public static final SubLSymbol $kw106$DONE_ = makeKeyword("DONE?");
  public static final SubLSymbol $sym107$DONE_VAR_ = makeUninternedSymbol("DONE-VAR?");
  public static final SubLSymbol $sym108$I = makeUninternedSymbol("I");
  public static final SubLSymbol $sym109$INPUT_STREAM = makeUninternedSymbol("INPUT-STREAM");
  public static final SubLList $list110 = list(NIL);
  public static final SubLSymbol $sym111$WITH_PRIVATE_BINARY_FILE = makeSymbol("WITH-PRIVATE-BINARY-FILE");
  public static final SubLList $list112 = list(makeKeyword("INPUT"));
  public static final SubLSymbol $sym113$WITH_CFASL_COMMON_SYMBOLS = makeSymbol("WITH-CFASL-COMMON-SYMBOLS");
  public static final SubLList $list114 = list(makeSymbol("ASKED-QUERY-COMMON-SYMBOLS"));
  public static final SubLSymbol $sym115$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym116$LOAD_ASKED_QUERY_FROM_STREAM = makeSymbol("LOAD-ASKED-QUERY-FROM-STREAM");
  public static final SubLSymbol $sym117$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $kw118$EOF = makeKeyword("EOF");
  public static final SubLList $list119 = list(T);
  public static final SubLSymbol $sym120$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym121$WARN = makeSymbol("WARN");
  public static final SubLString $str122$Read_invalid_query_info__s = makeString("Read invalid query info ~s");
  public static final SubLList $list123 = list(list(makeSymbol("QUERY-INFO-VAR"), makeSymbol("FILENAME-VAR"), makeSymbol("DIRECTORY"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list124 = list(makeKeyword("DONE?"));
  public static final SubLSymbol $sym125$DO_DIRECTORY_CONTENTS = makeSymbol("DO-DIRECTORY-CONTENTS");
  public static final SubLSymbol $sym126$ASKED_QUERIES_FILENAME_ = makeSymbol("ASKED-QUERIES-FILENAME?");
  public static final SubLSymbol $sym127$DO_ASKED_QUERIES = makeSymbol("DO-ASKED-QUERIES");

  //// Initializers

  public void declareFunctions() {
    declare_inference_macros_file();
  }

  public void initializeVariables() {
    init_inference_macros_file();
  }

  public void runTopLevelForms() {
    setup_inference_macros_file();
  }

}
