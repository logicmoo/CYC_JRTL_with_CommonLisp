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
//dm import com.cyc.cycjava_1.cycl.arg_type;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.gt_search;
//dm import com.cyc.cycjava_1.cycl.gt_vars;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.wff;

public  final class gt_utilities extends SubLTranslatedFile {

  //// Constructor

  private gt_utilities() {}
  public static final SubLFile me = new gt_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.gt_utilities";

  //// Definitions

  /** @return booleanp; Whether OBJ is a valid term in GT searches. */
  @SubL(source = "cycl/gt-utilities.lisp", position = 380) 
  public static final SubLObject gt_term_p(SubLObject obj) {
    if ((NIL != cycl_utilities.reified_term_p(obj))) {
      return T;
    }
    return NIL;
  }

  public static final SubLObject declare_gt_utilities_file() {
    declareFunction(myName, "gt_term_p", "GT-TERM-P", 1, 0, false);
    //declareFunction(myName, "gt_modeP", "GT-MODE?", 1, 0, false);
    //declareFunction(myName, "gt_type_fn", "GT-TYPE-FN", 1, 0, false);
    //declareFunction(myName, "gt_reflexiveP", "GT-REFLEXIVE?", 0, 0, false);
    //declareFunction(myName, "gt_index_arg_okP", "GT-INDEX-ARG-OK?", 1, 0, false);
    //declareFunction(myName, "gt_gather_arg_okP", "GT-GATHER-ARG-OK?", 1, 0, false);
    //declareFunction(myName, "tt_index_arg_okP", "TT-INDEX-ARG-OK?", 1, 0, false);
    //declareFunction(myName, "tt_gather_arg_okP", "TT-GATHER-ARG-OK?", 1, 0, false);
    //declareFunction(myName, "gt_either_arg_okP", "GT-EITHER-ARG-OK?", 1, 0, false);
    //declareFunction(myName, "gt_type_violation", "GT-TYPE-VIOLATION", 2, 0, false);
    //declareFunction(myName, "gt_assertion_type_violation", "GT-ASSERTION-TYPE-VIOLATION", 2, 0, false);
    //declareFunction(myName, "make_gt_search_space", "MAKE-GT-SEARCH-SPACE", 0, 1, false);
    //declareFunction(myName, "gt_not_all_predecessors_searchedP", "GT-NOT-ALL-PREDECESSORS-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "gt_all_predecessors_searchedP", "GT-ALL-PREDECESSORS-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "gt_each_link_nodeP", "GT-EACH-LINK-NODE?", 1, 0, false);
    //declareFunction(myName, "gt_check_type_internal", "GT-CHECK-TYPE-INTERNAL", 3, 0, false);
    //declareFunction(myName, "gt_step_fn_funcall", "GT-STEP-FN-FUNCALL", 1, 0, false);
    //declareFunction(myName, "gt_compare_fn_funcall", "GT-COMPARE-FN-FUNCALL", 2, 0, false);
    //declareFunction(myName, "gt_gp_mapper_funcall", "GT-GP-MAPPER-FUNCALL", 2, 0, false);
    //declareFunction(myName, "gt_note", "GT-NOTE", 2, 5, false);
    //declareFunction(myName, "gt_error", "GT-ERROR", 2, 5, false);
    //declareFunction(myName, "gt_cerror", "GT-CERROR", 3, 5, false);
    //declareFunction(myName, "gt_warn", "GT-WARN", 2, 5, false);
    return NIL;
  }

  public static final SubLObject init_gt_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_gt_utilities_file() {
    // CVS_ID("Id: gt-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$GT_INDEX = makeKeyword("GT-INDEX");
  public static final SubLSymbol $sym1$GT_INDEX_ARG_OK_ = makeSymbol("GT-INDEX-ARG-OK?");
  public static final SubLSymbol $kw2$GT_GATHER = makeKeyword("GT-GATHER");
  public static final SubLSymbol $sym3$GT_GATHER_ARG_OK_ = makeSymbol("GT-GATHER-ARG-OK?");
  public static final SubLSymbol $kw4$GT_EITHER = makeKeyword("GT-EITHER");
  public static final SubLSymbol $sym5$GT_EITHER_ARG_OK_ = makeSymbol("GT-EITHER-ARG-OK?");
  public static final SubLSymbol $kw6$TT_INDEX = makeKeyword("TT-INDEX");
  public static final SubLSymbol $sym7$TT_INDEX_ARG_OK_ = makeSymbol("TT-INDEX-ARG-OK?");
  public static final SubLSymbol $kw8$TT_GATHER = makeKeyword("TT-GATHER");
  public static final SubLSymbol $sym9$TT_GATHER_ARG_OK_ = makeSymbol("TT-GATHER-ARG-OK?");
  public static final SubLSymbol $kw10$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $kw11$ACCESSORS = makeKeyword("ACCESSORS");
  public static final SubLList $list12 = list(makeSymbol("*GT-PRED*"), makeSymbol("*GT-INDEX-ARG*"), makeSymbol("*GT-GATHER-ARG*"));
  public static final SubLSymbol $sym13$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLSymbol $kw14$TT_EITHER = makeKeyword("TT-EITHER");
  public static final SubLInteger $int15$128 = makeInteger(128);
  public static final SubLSymbol $sym16$GT_SEARCHED_ = makeSymbol("GT-SEARCHED?");
  public static final SubLSymbol $sym17$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $kw18$SUPERIOR = makeKeyword("SUPERIOR");
  public static final SubLSymbol $kw19$INFERIOR = makeKeyword("INFERIOR");
  public static final SubLString $str20$invalid_gt_mode___a = makeString("invalid gt mode: ~a");
  public static final SubLSymbol $sym21$GT_EACH_LINK_NODE_ = makeSymbol("GT-EACH-LINK-NODE?");
  public static final SubLString $str22$illegal_value_of__gt_mode_ = makeString("illegal value of *gt-mode*");
  public static final SubLString $str23$skip_gt_query = makeString("skip gt query");
  public static final SubLString $str24$_gt_type_violaton___a = makeString("(gt type violaton) ~a");
  public static final SubLSymbol $kw25$GT_ERROR = makeKeyword("GT-ERROR");
  public static final SubLSymbol $sym26$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym27$GT_MAP_LINKS = makeSymbol("GT-MAP-LINKS");
  public static final SubLSymbol $sym28$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS = makeSymbol("GT-MAP-LINKS-REBINDING-CANDIDATE-MTS");
  public static final SubLSymbol $sym29$GT_GATHER_LINK_NODE = makeSymbol("GT-GATHER-LINK-NODE");
  public static final SubLSymbol $sym30$GT_TEST_LINK_NODE = makeSymbol("GT-TEST-LINK-NODE");
  public static final SubLSymbol $sym31$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY = makeSymbol("GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY");
  public static final SubLSymbol $sym32$GT_GATHER_ACCESS_JUST = makeSymbol("GT-GATHER-ACCESS-JUST");
  public static final SubLString $str33$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $sym34$WARN = makeSymbol("WARN");

  //// Initializers

  public void declareFunctions() {
    declare_gt_utilities_file();
  }

  public void initializeVariables() {
    init_gt_utilities_file();
  }

  public void runTopLevelForms() {
    setup_gt_utilities_file();
  }

}
