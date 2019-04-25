package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rewrite_modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.rewrite_modules";
  public static final String myFingerPrint = "c039af0fa5542c135166dcf2bd28fb0e756fbb7383777af6e3b5df66b87f06aa";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 904L)
  private static SubLSymbol $ral_sub_situations_from_sub_situation_types_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 1273L)
  private static SubLSymbol $sub_situation_types_from_ral_sub_situations_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 3772L)
  private static SubLSymbol $rai_group_member_type_from_group_type_member_type_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 4173L)
  private static SubLSymbol $group_type_member_type_from_rai_group_member_type_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 6799L)
  private static SubLSymbol $ral_sub_events_from_sub_event_types_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 7144L)
  private static SubLSymbol $sub_event_types_from_ral_sub_events_rule$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLSymbol $sym1$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE_;
  private static final SubLSymbol $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER;
  private static final SubLList $list3;
  private static final SubLObject $const4$BaseKB;
  private static final SubLSymbol $sym5$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE_;
  private static final SubLSymbol $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK;
  private static final SubLList $list9;
  private static final SubLObject $const10$subSituationTypes;
  private static final SubLSymbol $kw11$POS;
  private static final SubLSymbol $kw12$SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK;
  private static final SubLList $list13;
  private static final SubLObject $const14$relationAllExists;
  private static final SubLObject $const15$subSituations;
  private static final SubLSymbol $sym16$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE_;
  private static final SubLSymbol $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE_;
  private static final SubLSymbol $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY;
  private static final SubLList $list23;
  private static final SubLObject $const24$groupTypeMemberType;
  private static final SubLSymbol $kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY;
  private static final SubLList $list26;
  private static final SubLObject $const27$relationAllInstance;
  private static final SubLObject $const28$groupMemberType;
  private static final SubLSymbol $sym29$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE_;
  private static final SubLSymbol $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE_;
  private static final SubLSymbol $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK;
  private static final SubLList $list36;
  private static final SubLObject $const37$subEventTypes;
  private static final SubLSymbol $kw38$SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK;
  private static final SubLList $list39;
  private static final SubLObject $const40$subEvents;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 904L)
  public static SubLObject ral_sub_situations_from_sub_situation_types_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list3, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 1273L)
  public static SubLObject sub_situation_types_from_ral_sub_situations_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list7, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 2328L)
  public static SubLObject relation_all_exists_sub_situations_rewrite_expand(final SubLObject asent)
  {
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject new_asent = ConsesLow.list( $const10$subSituationTypes, arg2, arg3 );
    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw11$POS, inference_worker_rewrite.current_rewrite_mt() );
    inference_worker_rewrite.rewrite_add_link( query, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 3420L)
  public static SubLObject sub_situation_types_rewrite_expand(final SubLObject asent)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject new_asent = ConsesLow.list( $const14$relationAllExists, $const15$subSituations, arg1, arg2 );
    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw11$POS, inference_worker_rewrite.current_rewrite_mt() );
    inference_worker_rewrite.rewrite_add_link( query, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 3772L)
  public static SubLObject rai_group_member_type_from_group_type_member_type_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list18, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 4173L)
  public static SubLObject group_type_member_type_from_rai_group_member_type_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list21, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 5300L)
  public static SubLObject relation_all_instance_group_member_type_rewrite_expand(final SubLObject asent)
  {
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject new_asent = ConsesLow.list( $const24$groupTypeMemberType, arg2, arg3 );
    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw11$POS, inference_worker_rewrite.current_rewrite_mt() );
    inference_worker_rewrite.rewrite_add_link( query, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 6440L)
  public static SubLObject group_type_member_type_rewrite_expand(final SubLObject asent)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject new_asent = ConsesLow.list( $const27$relationAllInstance, $const28$groupMemberType, arg1, arg2 );
    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw11$POS, inference_worker_rewrite.current_rewrite_mt() );
    inference_worker_rewrite.rewrite_add_link( query, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 6799L)
  public static SubLObject ral_sub_events_from_sub_event_types_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list31, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 7144L)
  public static SubLObject sub_event_types_from_ral_sub_events_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list34, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 8102L)
  public static SubLObject relation_all_exists_sub_events_rewrite_expand(final SubLObject asent)
  {
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject new_asent = ConsesLow.list( $const37$subEventTypes, arg2, arg3 );
    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw11$POS, inference_worker_rewrite.current_rewrite_mt() );
    inference_worker_rewrite.rewrite_add_link( query, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/rewrite-modules.lisp", position = 9146L)
  public static SubLObject sub_event_types_rewrite_expand(final SubLObject asent)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject new_asent = ConsesLow.list( $const14$relationAllExists, $const40$subEvents, arg1, arg2 );
    final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw11$POS, inference_worker_rewrite.current_rewrite_mt() );
    inference_worker_rewrite.rewrite_add_link( query, NIL );
    return NIL;
  }

  public static SubLObject declare_rewrite_modules_file()
  {
    SubLFiles.declareFunction( me, "ral_sub_situations_from_sub_situation_types_ruleX_initializer", "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "sub_situation_types_from_ral_sub_situations_ruleX_initializer", "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "relation_all_exists_sub_situations_rewrite_expand", "RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "sub_situation_types_rewrite_expand", "SUB-SITUATION-TYPES-REWRITE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "rai_group_member_type_from_group_type_member_type_ruleX_initializer", "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "group_type_member_type_from_rai_group_member_type_ruleX_initializer", "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "relation_all_instance_group_member_type_rewrite_expand", "RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "group_type_member_type_rewrite_expand", "GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "ral_sub_events_from_sub_event_types_ruleX_initializer", "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "sub_event_types_from_ral_sub_events_ruleX_initializer", "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "relation_all_exists_sub_events_rewrite_expand", "RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "sub_event_types_rewrite_expand", "SUB-EVENT-TYPES-REWRITE-EXPAND", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rewrite_modules_file()
  {
    $ral_sub_situations_from_sub_situation_types_rule$ = SubLFiles.defvar( "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*", $kw0$UNINITIALIZED );
    $sub_situation_types_from_ral_sub_situations_rule$ = SubLFiles.defvar( "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*", $kw0$UNINITIALIZED );
    $rai_group_member_type_from_group_type_member_type_rule$ = SubLFiles.defvar( "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*", $kw0$UNINITIALIZED );
    $group_type_member_type_from_rai_group_member_type_rule$ = SubLFiles.defvar( "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*", $kw0$UNINITIALIZED );
    $ral_sub_events_from_sub_event_types_rule$ = SubLFiles.defvar( "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*", $kw0$UNINITIALIZED );
    $sub_event_types_from_ral_sub_events_rule$ = SubLFiles.defvar( "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*", $kw0$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_rewrite_modules_file()
  {
    utilities_macros.register_kb_variable_initialization( $sym1$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE_, $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym5$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE_, $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER );
    inference_modules.inference_rewrite_module( $kw8$RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK, $list9 );
    inference_modules.inference_rewrite_module( $kw12$SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK, $list13 );
    utilities_macros.register_kb_variable_initialization( $sym16$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE_, $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI );
    utilities_macros.register_kb_variable_initialization( $sym19$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE_, $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI );
    inference_modules.inference_rewrite_module( $kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY, $list23 );
    inference_modules.inference_rewrite_module( $kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY, $list26 );
    utilities_macros.register_kb_variable_initialization( $sym29$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE_, $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym32$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE_, $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER );
    inference_modules.inference_rewrite_module( $kw35$RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK, $list36 );
    inference_modules.inference_rewrite_module( $kw38$SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK, $list39 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rewrite_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rewrite_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rewrite_modules_file();
  }
  static
  {
    me = new rewrite_modules();
    $ral_sub_situations_from_sub_situation_types_rule$ = null;
    $sub_situation_types_from_ral_sub_situations_rule$ = null;
    $rai_group_member_type_from_group_type_member_type_rule$ = null;
    $group_type_member_type_from_rai_group_member_type_rule$ = null;
    $ral_sub_events_from_sub_event_types_rule$ = null;
    $sub_event_types_from_ral_sub_events_rule$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym1$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE_ = makeSymbol( "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*" );
    $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER = makeSymbol( "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subSituationTypes" ) ), makeSymbol(
        "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString(
            "subSituations" ) ), makeSymbol( "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ) );
    $const4$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym5$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE_ = makeSymbol( "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*" );
    $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER = makeSymbol( "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*-INITIALIZER" );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles
        .reader_make_constant_shell( makeString( "subSituations" ) ), makeSymbol( "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "subSituationTypes" ) ), makeSymbol( "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ) );
    $kw8$RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK = makeKeyword( "RELATION-ALL-EXISTS-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-CHECK" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString( "subSituations" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER,
      makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol(
          "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "Rewrites (#$subSituationTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subSituations <fort1> <fort2>) literals." ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$subSituationTypes #$AilmentCondition #$PhysiologicalCondition) \n    ----->\n    (#$relationAllExists #$subSituations #$AilmentCondition #$PhysiologicalCondition)" )
    } );
    $const10$subSituationTypes = constant_handles.reader_make_constant_shell( makeString( "subSituationTypes" ) );
    $kw11$POS = makeKeyword( "POS" );
    $kw12$SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK = makeKeyword( "SUB-SITUATION-TYPES-FROM-RELATION-ALL-EXISTS-SUB-SITUATIONS-CHECK" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "subSituationTypes" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword(
            "EXPAND" ), makeSymbol( "SUB-SITUATION-TYPES-REWRITE-EXPAND" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol( "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "Rewrites (#$relationAllExists #$subSituations <fort1> <fort2>) literals as \n    (#$subSituationTypes <fort1> <fort2>) literals." ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$relationAllExists #$subSituations #$PhysiologicalCondition #$BiologicalEvent)\n    ----->\n    (#$subSituationTypes #$PhysiologicalCondition #$BiologicalEvent)" )
    } );
    $const14$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $const15$subSituations = constant_handles.reader_make_constant_shell( makeString( "subSituations" ) );
    $sym16$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE_ = makeSymbol( "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*" );
    $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI = makeSymbol( "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER" );
    $list18 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "groupTypeMemberType" ) ), makeSymbol(
        "?GROUPTYPE" ), makeSymbol( "?MEMBERTYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) ), constant_handles.reader_make_constant_shell( makeString(
            "groupMemberType" ) ), makeSymbol( "?GROUPTYPE" ), makeSymbol( "?MEMBERTYPE" ) ) );
    $sym19$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE_ = makeSymbol( "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*" );
    $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI = makeSymbol( "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER" );
    $list21 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) ), constant_handles
        .reader_make_constant_shell( makeString( "groupMemberType" ) ), makeSymbol( "?GROUPTYPE" ), makeSymbol( "?MEMBERTYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "groupTypeMemberType" ) ), makeSymbol( "?GROUPTYPE" ), makeSymbol( "?MEMBERTYPE" ) ) );
    $kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY = makeKeyword( "RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-CHECK" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "relationAllInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "groupMemberType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND" ), makeKeyword( "REWRITE-SUPPORT" ),
      makeSymbol( "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "Rewrites (#$groupTypeMemberType <fort1> <fort2>) literals as \n    (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals." ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))\n    ----->\n    (#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))" )
    } );
    $const24$groupTypeMemberType = constant_handles.reader_make_constant_shell( makeString( "groupTypeMemberType" ) );
    $kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY = makeKeyword( "GROUP-TYPE-MEMBER-TYPE-FROM-RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-CHECK" );
    $list26 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "groupTypeMemberType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword(
            "EXPAND" ), makeSymbol( "GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol( "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "Rewrites (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals as \n    (#$groupTypeMemberType <fort1> <fort2>) literals." ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)\n    ----->\n    (#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)" )
    } );
    $const27$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const28$groupMemberType = constant_handles.reader_make_constant_shell( makeString( "groupMemberType" ) );
    $sym29$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE_ = makeSymbol( "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*" );
    $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER = makeSymbol( "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER" );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subEventTypes" ) ), makeSymbol(
        "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString(
            "subEvents" ) ), makeSymbol( "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ) );
    $sym32$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE_ = makeSymbol( "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*" );
    $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER = makeSymbol( "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER" );
    $list34 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles
        .reader_make_constant_shell( makeString( "subEvents" ) ), makeSymbol( "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subEventTypes" ) ),
            makeSymbol( "?WHOLE-TYPE" ), makeSymbol( "?PART-TYPE" ) ) );
    $kw35$RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK = makeKeyword( "RELATION-ALL-EXISTS-SUB-EVENTS-FROM-SUB-EVENT-TYPES-CHECK" );
    $list36 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString( "subEvents" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER,
      makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol(
          "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "Rewrites (#$subEventTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subEvents <fort1> <fort2>) literals." ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$subEventTypes #$Foraging #$Perceiving)\n    ----->\n    (#$relationAllExists #$subEvents #$Foraging #$Perceiving)" )
    } );
    $const37$subEventTypes = constant_handles.reader_make_constant_shell( makeString( "subEventTypes" ) );
    $kw38$SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK = makeKeyword( "SUB-EVENT-TYPES-FROM-RELATION-ALL-EXISTS-SUB-EVENTS-CHECK" );
    $list39 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "subEventTypes" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword(
            "EXPAND" ), makeSymbol( "SUB-EVENT-TYPES-REWRITE-EXPAND" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol( "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "Rewrites (#$relationAllExists #$subEvents <fort1> <fort2>) literals as \n    (#$subEventTypes <fort1> <fort2>) literals." ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$relationAllExists #$subEvents #$CompostingProcess #$DecompositionProcess)\n    ----->\n    (#$subEventTypes #$CompostingProcess #$DecompositionProcess)" )
    } );
    $const40$subEvents = constant_handles.reader_make_constant_shell( makeString( "subEvents" ) );
  }
}
/*
 * 
 * Total time: 49 ms
 * 
 */