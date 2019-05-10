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

package com.cyc.cycjava_1.cycl.inference.modules;
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
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class rewrite_modules extends SubLTranslatedFile {

  //// Constructor

  private rewrite_modules() {}
  public static final SubLFile me = new rewrite_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.rewrite_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 904) 
  private static SubLSymbol $ral_sub_situations_from_sub_situation_types_rule$ = null;

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 904) 
  public static final SubLObject ral_sub_situations_from_sub_situation_types_ruleX_initializer() {
    return hl_supports.find_assertion_or_make_support($list3, $const4$BaseKB);
  }

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 1273) 
  private static SubLSymbol $sub_situation_types_from_ral_sub_situations_rule$ = null;

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 1273) 
  public static final SubLObject sub_situation_types_from_ral_sub_situations_ruleX_initializer() {
    return hl_supports.find_assertion_or_make_support($list7, $const4$BaseKB);
  }

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 3772) 
  private static SubLSymbol $rai_group_member_type_from_group_type_member_type_rule$ = null;

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 3772) 
  public static final SubLObject rai_group_member_type_from_group_type_member_type_ruleX_initializer() {
    return hl_supports.find_assertion_or_make_support($list18, $const4$BaseKB);
  }

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 4173) 
  private static SubLSymbol $group_type_member_type_from_rai_group_member_type_rule$ = null;

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 4173) 
  public static final SubLObject group_type_member_type_from_rai_group_member_type_ruleX_initializer() {
    return hl_supports.find_assertion_or_make_support($list21, $const4$BaseKB);
  }

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 6799) 
  private static SubLSymbol $ral_sub_events_from_sub_event_types_rule$ = null;

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 6799) 
  public static final SubLObject ral_sub_events_from_sub_event_types_ruleX_initializer() {
    return hl_supports.find_assertion_or_make_support($list31, $const4$BaseKB);
  }

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 7144) 
  private static SubLSymbol $sub_event_types_from_ral_sub_events_rule$ = null;

  @SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 7144) 
  public static final SubLObject sub_event_types_from_ral_sub_events_ruleX_initializer() {
    return hl_supports.find_assertion_or_make_support($list34, $const4$BaseKB);
  }

  public static final SubLObject declare_rewrite_modules_file() {
    declareFunction(myName, "ral_sub_situations_from_sub_situation_types_ruleX_initializer", "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER", 0, 0, false);
    declareFunction(myName, "sub_situation_types_from_ral_sub_situations_ruleX_initializer", "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*-INITIALIZER", 0, 0, false);
    declareFunction(myName, "relation_all_exists_sub_situations_rewrite_expand", "RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND", 1, 0, false);
    declareFunction(myName, "sub_situation_types_rewrite_expand", "SUB-SITUATION-TYPES-REWRITE-EXPAND", 1, 0, false);
    declareFunction(myName, "rai_group_member_type_from_group_type_member_type_ruleX_initializer", "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER", 0, 0, false);
    declareFunction(myName, "group_type_member_type_from_rai_group_member_type_ruleX_initializer", "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER", 0, 0, false);
    declareFunction(myName, "relation_all_instance_group_member_type_rewrite_expand", "RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND", 1, 0, false);
    declareFunction(myName, "group_type_member_type_rewrite_expand", "GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND", 1, 0, false);
    declareFunction(myName, "ral_sub_events_from_sub_event_types_ruleX_initializer", "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER", 0, 0, false);
    declareFunction(myName, "sub_event_types_from_ral_sub_events_ruleX_initializer", "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER", 0, 0, false);
    declareFunction(myName, "relation_all_exists_sub_events_rewrite_expand", "RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND", 1, 0, false);
    declareFunction(myName, "sub_event_types_rewrite_expand", "SUB-EVENT-TYPES-REWRITE-EXPAND", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_rewrite_modules_file() {
    $ral_sub_situations_from_sub_situation_types_rule$ = defvar("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*", $kw0$UNINITIALIZED);
    $sub_situation_types_from_ral_sub_situations_rule$ = defvar("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*", $kw0$UNINITIALIZED);
    $rai_group_member_type_from_group_type_member_type_rule$ = defvar("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*", $kw0$UNINITIALIZED);
    $group_type_member_type_from_rai_group_member_type_rule$ = defvar("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*", $kw0$UNINITIALIZED);
    $ral_sub_events_from_sub_event_types_rule$ = defvar("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*", $kw0$UNINITIALIZED);
    $sub_event_types_from_ral_sub_events_rule$ = defvar("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*", $kw0$UNINITIALIZED);
    return NIL;
  }

  public static final SubLObject setup_rewrite_modules_file() {
    // CVS_ID("Id: rewrite-modules.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_kb_variable_initialization($sym1$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE_, $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER);
    utilities_macros.register_kb_variable_initialization($sym5$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE_, $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER);
    inference_modules.inference_rewrite_module($kw8$RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK, $list9);
    inference_modules.inference_rewrite_module($kw12$SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK, $list13);
    utilities_macros.register_kb_variable_initialization($sym16$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE_, $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI);
    utilities_macros.register_kb_variable_initialization($sym19$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE_, $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI);
    inference_modules.inference_rewrite_module($kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY, $list23);
    inference_modules.inference_rewrite_module($kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY, $list26);
    utilities_macros.register_kb_variable_initialization($sym29$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE_, $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER);
    utilities_macros.register_kb_variable_initialization($sym32$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE_, $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER);
    inference_modules.inference_rewrite_module($kw35$RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK, $list36);
    inference_modules.inference_rewrite_module($kw38$SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK, $list39);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym1$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE_ = makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*");
  public static final SubLSymbol $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER = makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER");
  public static final SubLList $list3 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("subSituationTypes")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("subSituations")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));
  public static final SubLObject $const4$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $sym5$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE_ = makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*");
  public static final SubLSymbol $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER = makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*-INITIALIZER");
  public static final SubLList $list7 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("subSituations")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(constant_handles.reader_make_constant_shell(makeString("subSituationTypes")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));
  public static final SubLSymbol $kw8$RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK = makeKeyword("RELATION-ALL-EXISTS-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-CHECK");
  public static final SubLList $list9 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("subSituations")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$subSituationTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subSituations <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$subSituationTypes #$AilmentCondition #$PhysiologicalCondition) \n    ----->\n    (#$relationAllExists #$subSituations #$AilmentCondition #$PhysiologicalCondition)")});
  public static final SubLObject $const10$subSituationTypes = constant_handles.reader_make_constant_shell(makeString("subSituationTypes"));
  public static final SubLSymbol $kw11$POS = makeKeyword("POS");
  public static final SubLSymbol $kw12$SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK = makeKeyword("SUB-SITUATION-TYPES-FROM-RELATION-ALL-EXISTS-SUB-SITUATIONS-CHECK");
  public static final SubLList $list13 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("subSituationTypes")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SUB-SITUATION-TYPES-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllExists #$subSituations <fort1> <fort2>) literals as \n    (#$subSituationTypes <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$subSituations #$PhysiologicalCondition #$BiologicalEvent)\n    ----->\n    (#$subSituationTypes #$PhysiologicalCondition #$BiologicalEvent)")});
  public static final SubLObject $const14$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));
  public static final SubLObject $const15$subSituations = constant_handles.reader_make_constant_shell(makeString("subSituations"));
  public static final SubLSymbol $sym16$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE_ = makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*");
  public static final SubLSymbol $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI = makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER");
  public static final SubLList $list18 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("groupTypeMemberType")), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")), list(constant_handles.reader_make_constant_shell(makeString("relationAllInstance")), constant_handles.reader_make_constant_shell(makeString("groupMemberType")), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")));
  public static final SubLSymbol $sym19$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE_ = makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*");
  public static final SubLSymbol $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI = makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER");
  public static final SubLList $list21 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("relationAllInstance")), constant_handles.reader_make_constant_shell(makeString("groupMemberType")), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")), list(constant_handles.reader_make_constant_shell(makeString("groupTypeMemberType")), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")));
  public static final SubLSymbol $kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY = makeKeyword("RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-CHECK");
  public static final SubLList $list23 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("relationAllInstance")), constant_handles.reader_make_constant_shell(makeString("groupMemberType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$groupTypeMemberType <fort1> <fort2>) literals as \n    (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))\n    ----->\n    (#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))")});
  public static final SubLObject $const24$groupTypeMemberType = constant_handles.reader_make_constant_shell(makeString("groupTypeMemberType"));
  public static final SubLSymbol $kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY = makeKeyword("GROUP-TYPE-MEMBER-TYPE-FROM-RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-CHECK");
  public static final SubLList $list26 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("groupTypeMemberType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals as \n    (#$groupTypeMemberType <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)\n    ----->\n    (#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)")});
  public static final SubLObject $const27$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));
  public static final SubLObject $const28$groupMemberType = constant_handles.reader_make_constant_shell(makeString("groupMemberType"));
  public static final SubLSymbol $sym29$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE_ = makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*");
  public static final SubLSymbol $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER = makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER");
  public static final SubLList $list31 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("subEventTypes")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("subEvents")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));
  public static final SubLSymbol $sym32$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE_ = makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*");
  public static final SubLSymbol $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER = makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER");
  public static final SubLList $list34 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("subEvents")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(constant_handles.reader_make_constant_shell(makeString("subEventTypes")), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));
  public static final SubLSymbol $kw35$RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK = makeKeyword("RELATION-ALL-EXISTS-SUB-EVENTS-FROM-SUB-EVENT-TYPES-CHECK");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("subEvents")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$subEventTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subEvents <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$subEventTypes #$Foraging #$Perceiving)\n    ----->\n    (#$relationAllExists #$subEvents #$Foraging #$Perceiving)")});
  public static final SubLObject $const37$subEventTypes = constant_handles.reader_make_constant_shell(makeString("subEventTypes"));
  public static final SubLSymbol $kw38$SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK = makeKeyword("SUB-EVENT-TYPES-FROM-RELATION-ALL-EXISTS-SUB-EVENTS-CHECK");
  public static final SubLList $list39 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("subEventTypes")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SUB-EVENT-TYPES-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllExists #$subEvents <fort1> <fort2>) literals as \n    (#$subEventTypes <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$subEvents #$CompostingProcess #$DecompositionProcess)\n    ----->\n    (#$subEventTypes #$CompostingProcess #$DecompositionProcess)")});
  public static final SubLObject $const40$subEvents = constant_handles.reader_make_constant_shell(makeString("subEvents"));

  //// Initializers

  public void declareFunctions() {
    declare_rewrite_modules_file();
  }

  public void initializeVariables() {
    init_rewrite_modules_file();
  }

  public void runTopLevelForms() {
    setup_rewrite_modules_file();
  }

}
