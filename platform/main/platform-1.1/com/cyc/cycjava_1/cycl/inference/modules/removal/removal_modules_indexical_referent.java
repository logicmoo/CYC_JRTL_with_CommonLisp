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
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_info;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_modules_indexical_referent extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_indexical_referent() {}
  public static final SubLFile me = new removal_modules_indexical_referent();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_indexical_referent";

  //// Definitions

  /** A table of expansion methods for #$indexicalReferent. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 906) 
  private static SubLSymbol $indexical_referent_expansions$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 1228) 
  public static final SubLObject register_indexical_referent_expansion(SubLObject indexical, SubLObject method) {
    $indexical_referent_expansions$.setGlobalValue(list_utilities.alist_enter($indexical_referent_expansions$.getGlobalValue(), indexical, method, Symbols.symbol_function(EQUAL)));
    return NIL;
  }

  public static final class $indexical_referent_term_p$UnaryFunction extends UnaryFunction {
    public $indexical_referent_term_p$UnaryFunction() { super(extractFunctionNamed("INDEXICAL-REFERENT-TERM-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32833"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 2345) 
  private static SubLSymbol $default_indexical_referent_cost$ = null;

  public static final class $temporal_indexical_expand$UnaryFunction extends UnaryFunction {
    public $temporal_indexical_expand$UnaryFunction() { super(extractFunctionNamed("TEMPORAL-INDEXICAL-EXPAND")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32834"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-indexical-referent.lisp", position = 4609) 
  private static SubLSymbol $indexical_the_cyc_process_owner_caching_state$ = null;

  public static final SubLObject declare_removal_modules_indexical_referent_file() {
    declareFunction(myName, "register_indexical_referent_expansion", "REGISTER-INDEXICAL-REFERENT-EXPANSION", 2, 0, false);
    declareFunction(myName, "cyc_indexical_referent", "CYC-INDEXICAL-REFERENT", 1, 0, false);
    declareFunction(myName, "indexical_referent_term_p", "INDEXICAL-REFERENT-TERM-P", 1, 0, false); new $indexical_referent_term_p$UnaryFunction();
    declareFunction(myName, "indexical_referent_expand", "INDEXICAL-REFERENT-EXPAND", 1, 0, false);
    declareFunction(myName, "temporal_indexical_expand", "TEMPORAL-INDEXICAL-EXPAND", 1, 0, false); new $temporal_indexical_expand$UnaryFunction();
    declareFunction(myName, "indexical_query_mt", "INDEXICAL-QUERY-MT", 0, 0, false);
    declareFunction(myName, "indexical_the_user", "INDEXICAL-THE-USER", 0, 0, false);
    declareFunction(myName, "indexical_the_purpose", "INDEXICAL-THE-PURPOSE", 0, 0, false);
    declareFunction(myName, "clear_indexical_the_cyc_process_owner", "CLEAR-INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
    declareFunction(myName, "remove_indexical_the_cyc_process_owner", "REMOVE-INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
    declareFunction(myName, "indexical_the_cyc_process_owner_internal", "INDEXICAL-THE-CYC-PROCESS-OWNER-INTERNAL", 0, 0, false);
    declareFunction(myName, "indexical_the_cyc_process_owner", "INDEXICAL-THE-CYC-PROCESS-OWNER", 0, 0, false);
    declareFunction(myName, "indexical_the_current_kb_number", "INDEXICAL-THE-CURRENT-KB-NUMBER", 0, 0, false);
    declareFunction(myName, "indexical_the_current_system_number", "INDEXICAL-THE-CURRENT-SYSTEM-NUMBER", 0, 0, false);
    declareFunction(myName, "indexical_the_current_host_name", "INDEXICAL-THE-CURRENT-HOST-NAME", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_indexical_referent_file() {
    $indexical_referent_expansions$ = deflexical("*INDEXICAL-REFERENT-EXPANSIONS*", NIL);
    $default_indexical_referent_cost$ = defparameter("*DEFAULT-INDEXICAL-REFERENT-COST*", ONE_INTEGER);
    $indexical_the_cyc_process_owner_caching_state$ = deflexical("*INDEXICAL-THE-CYC-PROCESS-OWNER-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_indexical_referent_file() {
    // CVS_ID("Id: removal-modules-indexical-referent.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_kb_function($sym0$CYC_INDEXICAL_REFERENT);
    inference_modules.register_solely_specific_removal_module_predicate($const1$indexicalReferent);
    inference_modules.inference_removal_module($kw2$REMOVAL_INDEXICAL_REFERENT_POS, $list3);
    register_indexical_referent_expansion($const6$QueryMt, $sym7$INDEXICAL_QUERY_MT);
    register_indexical_referent_expansion($const8$TheUser, $sym9$INDEXICAL_THE_USER);
    register_indexical_referent_expansion($const11$ThePurpose, $sym12$INDEXICAL_THE_PURPOSE);
    memoization_state.note_globally_cached_function($sym13$INDEXICAL_THE_CYC_PROCESS_OWNER);
    register_indexical_referent_expansion($const16$TheCycProcessOwner, $sym13$INDEXICAL_THE_CYC_PROCESS_OWNER);
    register_indexical_referent_expansion($const17$TheCurrentKBNumber, $sym18$INDEXICAL_THE_CURRENT_KB_NUMBER);
    register_indexical_referent_expansion($const19$TheCurrentSystemNumber, $sym20$INDEXICAL_THE_CURRENT_SYSTEM_NUMBER);
    register_indexical_referent_expansion($const21$TheCurrentHostName, $sym22$INDEXICAL_THE_CURRENT_HOST_NAME);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CYC_INDEXICAL_REFERENT = makeSymbol("CYC-INDEXICAL-REFERENT");
  public static final SubLObject $const1$indexicalReferent = constant_handles.reader_make_constant_shell(makeString("indexicalReferent"));
  public static final SubLSymbol $kw2$REMOVAL_INDEXICAL_REFERENT_POS = makeKeyword("REMOVAL-INDEXICAL-REFERENT-POS");
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("indexicalReferent")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("indexicalReferent")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("INDEXICAL-REFERENT-TERM-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INDEXICAL-REFERENT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("indexicalReferent")), list(makeKeyword("BIND"), makeSymbol("INDEXICAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INDEXICAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INDEXICAL-REFERENT-EXPAND"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("indexicalReferent")), list(makeKeyword("VALUE"), makeSymbol("INDEXICAL")), makeKeyword("INPUT"))});
  public static final SubLObject $const4$HypotheticalContext = constant_handles.reader_make_constant_shell(makeString("HypotheticalContext"));
  public static final SubLObject $const5$termDependsOn = constant_handles.reader_make_constant_shell(makeString("termDependsOn"));
  public static final SubLObject $const6$QueryMt = constant_handles.reader_make_constant_shell(makeString("QueryMt"));
  public static final SubLSymbol $sym7$INDEXICAL_QUERY_MT = makeSymbol("INDEXICAL-QUERY-MT");
  public static final SubLObject $const8$TheUser = constant_handles.reader_make_constant_shell(makeString("TheUser"));
  public static final SubLSymbol $sym9$INDEXICAL_THE_USER = makeSymbol("INDEXICAL-THE-USER");
  public static final SubLObject $const10$GeneralCycKE = constant_handles.reader_make_constant_shell(makeString("GeneralCycKE"));
  public static final SubLObject $const11$ThePurpose = constant_handles.reader_make_constant_shell(makeString("ThePurpose"));
  public static final SubLSymbol $sym12$INDEXICAL_THE_PURPOSE = makeSymbol("INDEXICAL-THE-PURPOSE");
  public static final SubLSymbol $sym13$INDEXICAL_THE_CYC_PROCESS_OWNER = makeSymbol("INDEXICAL-THE-CYC-PROCESS-OWNER");
  public static final SubLSymbol $sym14$_INDEXICAL_THE_CYC_PROCESS_OWNER_CACHING_STATE_ = makeSymbol("*INDEXICAL-THE-CYC-PROCESS-OWNER-CACHING-STATE*");
  public static final SubLSymbol $kw15$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const16$TheCycProcessOwner = constant_handles.reader_make_constant_shell(makeString("TheCycProcessOwner"));
  public static final SubLObject $const17$TheCurrentKBNumber = constant_handles.reader_make_constant_shell(makeString("TheCurrentKBNumber"));
  public static final SubLSymbol $sym18$INDEXICAL_THE_CURRENT_KB_NUMBER = makeSymbol("INDEXICAL-THE-CURRENT-KB-NUMBER");
  public static final SubLObject $const19$TheCurrentSystemNumber = constant_handles.reader_make_constant_shell(makeString("TheCurrentSystemNumber"));
  public static final SubLSymbol $sym20$INDEXICAL_THE_CURRENT_SYSTEM_NUMBER = makeSymbol("INDEXICAL-THE-CURRENT-SYSTEM-NUMBER");
  public static final SubLObject $const21$TheCurrentHostName = constant_handles.reader_make_constant_shell(makeString("TheCurrentHostName"));
  public static final SubLSymbol $sym22$INDEXICAL_THE_CURRENT_HOST_NAME = makeSymbol("INDEXICAL-THE-CURRENT-HOST-NAME");

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_indexical_referent_file();
  }

  public void initializeVariables() {
    init_removal_modules_indexical_referent_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_indexical_referent_file();
  }

}
