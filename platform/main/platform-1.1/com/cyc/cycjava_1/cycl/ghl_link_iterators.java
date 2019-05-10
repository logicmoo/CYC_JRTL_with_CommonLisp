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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.ghl_search_vars;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.predicate_relevance_cache;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;

public  final class ghl_link_iterators extends SubLTranslatedFile {

  //// Constructor

  private ghl_link_iterators() {}
  public static final SubLFile me = new ghl_link_iterators();
  public static final String myName = "com.cyc.cycjava_1.cycl.ghl_link_iterators";

  //// Definitions

  @SubL(source = "cycl/ghl-link-iterators.lisp", position = 789) 
  public static SubLSymbol $ghl_link_pred$ = null;

  /** bound for relevant-pred? checking */
  @SubL(source = "cycl/ghl-link-iterators.lisp", position = 5781) 
  public static SubLSymbol $gt_relevant_pred$ = null;

  @SubL(source = "cycl/ghl-link-iterators.lisp", position = 5899) 
  public static final SubLObject relevant_pred_wrt_gtP(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return gt_relevant_predP(predicate, $gt_relevant_pred$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/ghl-link-iterators.lisp", position = 6695) 
  public static final SubLObject gt_predicate_p(SubLObject pred) {
    return T;
  }

  @SubL(source = "cycl/ghl-link-iterators.lisp", position = 6798) 
  public static final SubLObject gt_index_argnum_for_direction(SubLObject direction) {
    {
      SubLObject pcase_var = direction;
      if (pcase_var.eql($kw91$FORWARD)) {
        return ONE_INTEGER;
      } else if (pcase_var.eql($kw92$BACKWARD)) {
        return TWO_INTEGER;
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31825");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/ghl-link-iterators.lisp", position = 6999) 
  public static final SubLObject gt_relevant_predP(SubLObject pred, SubLObject search_pred) {
    if ((NIL != ghl_search_vars.ghl_uses_spec_preds_p())) {
      if ((NIL != ghl_search_vars.gt_args_swapped_p())) {
        return predicate_relevance_cache.cached_spec_inverseP(search_pred, pred, UNPROVIDED);
      } else {
        return predicate_relevance_cache.cached_spec_predP(search_pred, pred, UNPROVIDED);
      }
    } else {
      return Equality.eq(pred, search_pred);
    }
  }

  public static final SubLObject declare_ghl_link_iterators_file() {
    //declareMacro(myName, "with_ghl_link_pred", "WITH-GHL-LINK-PRED");
    //declareMacro(myName, "with_new_ghl_link_pred", "WITH-NEW-GHL-LINK-PRED");
    //declareFunction(myName, "get_ghl_link_pred", "GET-GHL-LINK-PRED", 0, 0, false);
    //declareMacro(myName, "do_ghl_accessible_link_nodes", "DO-GHL-ACCESSIBLE-LINK-NODES");
    //declareFunction(myName, "ghl_make_sbhl_support", "GHL-MAKE-SBHL-SUPPORT", 4, 0, false);
    //declareMacro(myName, "do_sbhl_accessible_link_nodes", "DO-SBHL-ACCESSIBLE-LINK-NODES");
    //declareMacro(myName, "do_gt_accessible_link_nodes", "DO-GT-ACCESSIBLE-LINK-NODES");
    declareFunction(myName, "relevant_pred_wrt_gtP", "RELEVANT-PRED-WRT-GT?", 1, 0, false);
    //declareMacro(myName, "do_gt_gaf_arg_index", "DO-GT-GAF-ARG-INDEX");
    declareFunction(myName, "gt_predicate_p", "GT-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "gt_index_argnum_for_direction", "GT-INDEX-ARGNUM-FOR-DIRECTION", 1, 0, false);
    declareFunction(myName, "gt_relevant_predP", "GT-RELEVANT-PRED?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_ghl_link_iterators_file() {
    $ghl_link_pred$ = defparameter("*GHL-LINK-PRED*", NIL);
    $gt_relevant_pred$ = defparameter("*GT-RELEVANT-PRED*", NIL);
    return NIL;
  }

  public static final SubLObject setup_ghl_link_iterators_file() {
    // CVS_ID("Id: ghl-link-iterators.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym18$GHL_MAKE_SBHL_SUPPORT, $sym24$DO_GHL_ACCESSIBLE_LINK_NODES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_GHL_LINK_PRED_ = makeSymbol("*GHL-LINK-PRED*");
  public static final SubLList $list3 = list(list(makeSymbol("*GHL-LINK-PRED*"), NIL));
  public static final SubLList $list4 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("PREDICATES"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("SUPPORT-VAR"), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list5 = list(makeKeyword("SUPPORT-VAR"), makeKeyword("TV"), makeKeyword("DONE-VAR"));
  public static final SubLSymbol $kw6$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw7$SUPPORT_VAR = makeKeyword("SUPPORT-VAR");
  public static final SubLSymbol $kw8$TV = makeKeyword("TV");
  public static final SubLSymbol $kw9$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw10$DONE_VAR = makeKeyword("DONE-VAR");
  public static final SubLSymbol $sym11$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym12$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym13$WITH_GHL_LINK_PRED = makeSymbol("WITH-GHL-LINK-PRED");
  public static final SubLSymbol $sym14$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym15$SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");
  public static final SubLSymbol $sym16$DO_SBHL_ACCESSIBLE_LINK_NODES = makeSymbol("DO-SBHL-ACCESSIBLE-LINK-NODES");
  public static final SubLSymbol $sym17$GET_SBHL_MODULE = makeSymbol("GET-SBHL-MODULE");
  public static final SubLSymbol $sym18$GHL_MAKE_SBHL_SUPPORT = makeSymbol("GHL-MAKE-SBHL-SUPPORT");
  public static final SubLSymbol $sym19$GT_PREDICATE_P = makeSymbol("GT-PREDICATE-P");
  public static final SubLSymbol $sym20$DO_GT_ACCESSIBLE_LINK_NODES = makeSymbol("DO-GT-ACCESSIBLE-LINK-NODES");
  public static final SubLSymbol $sym21$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym22$SUPPORT_VAR = makeUninternedSymbol("SUPPORT-VAR");
  public static final SubLSymbol $sym23$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym24$DO_GHL_ACCESSIBLE_LINK_NODES = makeSymbol("DO-GHL-ACCESSIBLE-LINK-NODES");
  public static final SubLList $list25 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("START-NODE"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list26 = list(makeKeyword("DONE-VAR"));
  public static final SubLSymbol $sym27$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");
  public static final SubLSymbol $sym28$SEARCH_DIRECTION = makeUninternedSymbol("SEARCH-DIRECTION");
  public static final SubLSymbol $sym29$LINK_DIRECTION = makeUninternedSymbol("LINK-DIRECTION");
  public static final SubLSymbol $sym30$D_LINK = makeUninternedSymbol("D-LINK");
  public static final SubLSymbol $sym31$MT = makeUninternedSymbol("MT");
  public static final SubLSymbol $sym32$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym33$TV = makeUninternedSymbol("TV");
  public static final SubLSymbol $sym34$NODE = makeUninternedSymbol("NODE");
  public static final SubLSymbol $sym35$NAUT_TO_NART = makeSymbol("NAUT-TO-NART");
  public static final SubLSymbol $sym36$WITH_SBHL_SEARCH_MODULE = makeSymbol("WITH-SBHL-SEARCH-MODULE");
  public static final SubLSymbol $sym37$POSSIBLY_FLIP_GENL_INVERSE_MODE = makeSymbol("POSSIBLY-FLIP-GENL-INVERSE-MODE");
  public static final SubLSymbol $sym38$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym39$WITH_SBHL_GRAPH_LINK = makeSymbol("WITH-SBHL-GRAPH-LINK");
  public static final SubLSymbol $sym40$DO_GHL_RELEVANT_DIRECTIONS = makeSymbol("DO-GHL-RELEVANT-DIRECTIONS");
  public static final SubLSymbol $sym41$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = makeSymbol("SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION");
  public static final SubLSymbol $sym42$DO_SBHL_DIRECTION_LINK = makeSymbol("DO-SBHL-DIRECTION-LINK");
  public static final SubLSymbol $sym43$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym44$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLSymbol $sym45$_SBHL_LINK_MT_ = makeSymbol("*SBHL-LINK-MT*");
  public static final SubLSymbol $sym46$DO_SBHL_TV_LINKS = makeSymbol("DO-SBHL-TV-LINKS");
  public static final SubLSymbol $sym47$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");
  public static final SubLSymbol $sym48$_SBHL_LINK_TV_ = makeSymbol("*SBHL-LINK-TV*");
  public static final SubLSymbol $sym49$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $kw50$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym51$CLOSED_NAUT_ = makeSymbol("CLOSED-NAUT?");
  public static final SubLSymbol $sym52$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
  public static final SubLList $list53 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("ASSERTION-VAR"), makeSymbol("NODE"), makeSymbol("PRED"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list54 = list(makeKeyword("TV"), makeKeyword("DONE-VAR"));
  public static final SubLSymbol $sym55$SEARCH_DIRECTION = makeUninternedSymbol("SEARCH-DIRECTION");
  public static final SubLSymbol $sym56$INDEX_ARGNUM = makeUninternedSymbol("INDEX-ARGNUM");
  public static final SubLSymbol $sym57$GATHER_ARGNUM = makeUninternedSymbol("GATHER-ARGNUM");
  public static final SubLSymbol $sym58$ASSERTION = makeUninternedSymbol("ASSERTION");
  public static final SubLSymbol $sym59$TRUTH = makeUninternedSymbol("TRUTH");
  public static final SubLSymbol $sym60$STRENGTH = makeUninternedSymbol("STRENGTH");
  public static final SubLSymbol $sym61$TV_TRUTH = makeSymbol("TV-TRUTH");
  public static final SubLSymbol $sym62$TV_STRENGTH = makeSymbol("TV-STRENGTH");
  public static final SubLSymbol $sym63$WITH_GT_ARGS_UNSWAPPED = makeSymbol("WITH-GT-ARGS-UNSWAPPED");
  public static final SubLSymbol $sym64$GT_INDEX_ARGNUM_FOR_DIRECTION = makeSymbol("GT-INDEX-ARGNUM-FOR-DIRECTION");
  public static final SubLSymbol $sym65$OTHER_BINARY_ARG = makeSymbol("OTHER-BINARY-ARG");
  public static final SubLSymbol $sym66$DO_GT_GAF_ARG_INDEX = makeSymbol("DO-GT-GAF-ARG-INDEX");
  public static final SubLSymbol $kw67$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw68$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $sym69$COR = makeSymbol("COR");
  public static final SubLSymbol $sym70$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym71$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym72$EL_STRENGTH_IMPLIES = makeSymbol("EL-STRENGTH-IMPLIES");
  public static final SubLSymbol $sym73$ASSERTION_STRENGTH = makeSymbol("ASSERTION-STRENGTH");
  public static final SubLSymbol $sym74$FORMULA_ARG = makeSymbol("FORMULA-ARG");
  public static final SubLList $list75 = list(makeSymbol("GHL-USES-SPEC-PREDS-P"));
  public static final SubLSymbol $sym76$WITH_GT_ARGS_SWAPPED = makeSymbol("WITH-GT-ARGS-SWAPPED");
  public static final SubLList $list77 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list78 = list(makeKeyword("INDEX"), makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $sym79$VAR_MT = makeUninternedSymbol("VAR-MT");
  public static final SubLSymbol $sym80$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym81$_GT_RELEVANT_PRED_ = makeSymbol("*GT-RELEVANT-PRED*");
  public static final SubLSymbol $sym82$WITH_PREDICATE_FUNCTION = makeSymbol("WITH-PREDICATE-FUNCTION");
  public static final SubLList $list83 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-WRT-GT?"));
  public static final SubLSymbol $sym84$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLSymbol $sym85$PWHEN_FEATURE = makeSymbol("PWHEN-FEATURE");
  public static final SubLSymbol $kw86$CYC_SKSI = makeKeyword("CYC-SKSI");
  public static final SubLList $list87 = list(makeSymbol("GT-USE-SKSI?"));
  public static final SubLSymbol $sym88$WITH_SKSI_GT_SEARCH_PRED = makeSymbol("WITH-SKSI-GT-SEARCH-PRED");
  public static final SubLSymbol $sym89$DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol("DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");
  public static final SubLSymbol $kw90$INDEX_ARGNUM = makeKeyword("INDEX-ARGNUM");
  public static final SubLSymbol $kw91$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw92$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLString $str93$Invalid_direction__a = makeString("Invalid direction ~a");

  //// Initializers

  public void declareFunctions() {
    declare_ghl_link_iterators_file();
  }

  public void initializeVariables() {
    init_ghl_link_iterators_file();
  }

  public void runTopLevelForms() {
    setup_ghl_link_iterators_file();
  }

}
