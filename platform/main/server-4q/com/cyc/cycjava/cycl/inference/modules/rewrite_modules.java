/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REWRITE-MODULES
 * source file: /cyc/top/cycl/inference/modules/rewrite-modules.lisp
 * created:     2019/07/03 17:37:47
 */
public final class rewrite_modules extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rewrite_modules();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.rewrite_modules";


    public static final SubLSymbol $ral_sub_situations_from_sub_situation_types_rule$ = makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*");

    static private final SubLSymbol $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER = makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER");

    static private final SubLList $list3 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("subSituationTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subSituations"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));



    public static final SubLSymbol $sub_situation_types_from_ral_sub_situations_rule$ = makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*");

    static private final SubLSymbol $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER = makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*-INITIALIZER");

    static private final SubLList $list7 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subSituations"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("subSituationTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));

    private static final SubLSymbol $RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK = makeKeyword("RELATION-ALL-EXISTS-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-CHECK");

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subSituations"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$subSituationTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subSituations <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$subSituationTypes #$AilmentCondition #$PhysiologicalCondition) \n    ----->\n    (#$relationAllExists #$subSituations #$AilmentCondition #$PhysiologicalCondition)") });



    private static final SubLSymbol $SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK = makeKeyword("SUB-SITUATION-TYPES-FROM-RELATION-ALL-EXISTS-SUB-SITUATIONS-CHECK");

    static private final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subSituationTypes"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SUB-SITUATION-TYPES-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllExists #$subSituations <fort1> <fort2>) literals as \n    (#$subSituationTypes <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$subSituations #$PhysiologicalCondition #$BiologicalEvent)\n    ----->\n    (#$subSituationTypes #$PhysiologicalCondition #$BiologicalEvent)") });





    public static final SubLSymbol $rai_group_member_type_from_group_type_member_type_rule$ = makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*");

    static private final SubLSymbol $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI = makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER");

    static private final SubLList $list18 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("groupTypeMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("groupMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")));

    public static final SubLSymbol $group_type_member_type_from_rai_group_member_type_rule$ = makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*");

    static private final SubLSymbol $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI = makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER");

    static private final SubLList $list21 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("groupMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")), list(reader_make_constant_shell("groupTypeMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")));

    private static final SubLSymbol $kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY = makeKeyword("RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-CHECK");

    static private final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("groupMemberType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$groupTypeMemberType <fort1> <fort2>) literals as \n    (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))\n    ----->\n    (#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))") });



    private static final SubLSymbol $kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY = makeKeyword("GROUP-TYPE-MEMBER-TYPE-FROM-RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-CHECK");

    static private final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("groupTypeMemberType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals as \n    (#$groupTypeMemberType <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)\n    ----->\n    (#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)") });





    public static final SubLSymbol $ral_sub_events_from_sub_event_types_rule$ = makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*");

    static private final SubLSymbol $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER = makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER");

    static private final SubLList $list31 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("subEventTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subEvents"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));

    public static final SubLSymbol $sub_event_types_from_ral_sub_events_rule$ = makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*");

    static private final SubLSymbol $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER = makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER");

    static private final SubLList $list34 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subEvents"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("subEventTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));

    private static final SubLSymbol $RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK = makeKeyword("RELATION-ALL-EXISTS-SUB-EVENTS-FROM-SUB-EVENT-TYPES-CHECK");

    static private final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subEvents"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$subEventTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subEvents <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$subEventTypes #$Foraging #$Perceiving)\n    ----->\n    (#$relationAllExists #$subEvents #$Foraging #$Perceiving)") });

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("subSituationTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subSituations"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));



    private static final SubLSymbol $SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK = makeKeyword("SUB-EVENT-TYPES-FROM-RELATION-ALL-EXISTS-SUB-EVENTS-CHECK");

    static private final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subEventTypes"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SUB-EVENT-TYPES-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllExists #$subEvents <fort1> <fort2>) literals as \n    (#$subEventTypes <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$subEvents #$CompostingProcess #$DecompositionProcess)\n    ----->\n    (#$subEventTypes #$CompostingProcess #$DecompositionProcess)") });

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subSituations"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("subSituationTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subSituations"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$subSituationTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subSituations <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$subSituationTypes #$AilmentCondition #$PhysiologicalCondition) \n    ----->\n    (#$relationAllExists #$subSituations #$AilmentCondition #$PhysiologicalCondition)") });



    public static final SubLObject ral_sub_situations_from_sub_situation_types_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt3, $$BaseKB);
    }

    public static SubLObject ral_sub_situations_from_sub_situation_types_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list3, $$BaseKB);
    }

    public static final SubLObject sub_situation_types_from_ral_sub_situations_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt7, $$BaseKB);
    }

    public static SubLObject sub_situation_types_from_ral_sub_situations_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list7, $$BaseKB);
    }

    public static final SubLObject relation_all_exists_sub_situations_rewrite_expand_alt(SubLObject asent) {
        {
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            SubLObject new_asent = list($$subSituationTypes, arg2, arg3);
            SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            inference_worker_rewrite.rewrite_add_link(query, NIL);
        }
        return NIL;
    }

    public static SubLObject relation_all_exists_sub_situations_rewrite_expand(final SubLObject asent) {
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject new_asent = list($$subSituationTypes, arg2, arg3);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
        inference_worker_rewrite.rewrite_add_link(query, NIL);
        return NIL;
    }

    public static final SubLObject sub_situation_types_rewrite_expand_alt(SubLObject asent) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject new_asent = list($$relationAllExists, $$subSituations, arg1, arg2);
            SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            inference_worker_rewrite.rewrite_add_link(query, NIL);
        }
        return NIL;
    }

    public static SubLObject sub_situation_types_rewrite_expand(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject new_asent = list($$relationAllExists, $$subSituations, arg1, arg2);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
        inference_worker_rewrite.rewrite_add_link(query, NIL);
        return NIL;
    }

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subSituationTypes"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SUB-SITUATION-TYPES-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllExists #$subSituations <fort1> <fort2>) literals as \n    (#$subSituationTypes <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$subSituations #$PhysiologicalCondition #$BiologicalEvent)\n    ----->\n    (#$subSituationTypes #$PhysiologicalCondition #$BiologicalEvent)") });

    public static final SubLObject rai_group_member_type_from_group_type_member_type_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt18, $$BaseKB);
    }

    public static SubLObject rai_group_member_type_from_group_type_member_type_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list18, $$BaseKB);
    }

    public static final SubLObject group_type_member_type_from_rai_group_member_type_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt21, $$BaseKB);
    }

    public static SubLObject group_type_member_type_from_rai_group_member_type_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list21, $$BaseKB);
    }

    public static final SubLObject relation_all_instance_group_member_type_rewrite_expand_alt(SubLObject asent) {
        {
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            SubLObject new_asent = list($$groupTypeMemberType, arg2, arg3);
            SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            inference_worker_rewrite.rewrite_add_link(query, NIL);
        }
        return NIL;
    }

    public static SubLObject relation_all_instance_group_member_type_rewrite_expand(final SubLObject asent) {
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject new_asent = list($$groupTypeMemberType, arg2, arg3);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
        inference_worker_rewrite.rewrite_add_link(query, NIL);
        return NIL;
    }

    static private final SubLList $list_alt18 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("groupTypeMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("groupMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")));

    public static final SubLObject group_type_member_type_rewrite_expand_alt(SubLObject asent) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject new_asent = list($$relationAllInstance, $$groupMemberType, arg1, arg2);
            SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            inference_worker_rewrite.rewrite_add_link(query, NIL);
        }
        return NIL;
    }

    public static SubLObject group_type_member_type_rewrite_expand(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject new_asent = list($$relationAllInstance, $$groupMemberType, arg1, arg2);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
        inference_worker_rewrite.rewrite_add_link(query, NIL);
        return NIL;
    }

    public static final SubLObject ral_sub_events_from_sub_event_types_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt31, $$BaseKB);
    }

    public static SubLObject ral_sub_events_from_sub_event_types_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list31, $$BaseKB);
    }

    static private final SubLList $list_alt21 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("groupMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")), list(reader_make_constant_shell("groupTypeMemberType"), makeSymbol("?GROUPTYPE"), makeSymbol("?MEMBERTYPE")));

    public static final SubLObject sub_event_types_from_ral_sub_events_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt34, $$BaseKB);
    }

    public static SubLObject sub_event_types_from_ral_sub_events_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list34, $$BaseKB);
    }

    public static final SubLObject relation_all_exists_sub_events_rewrite_expand_alt(SubLObject asent) {
        {
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            SubLObject new_asent = list($$subEventTypes, arg2, arg3);
            SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            inference_worker_rewrite.rewrite_add_link(query, NIL);
        }
        return NIL;
    }

    public static SubLObject relation_all_exists_sub_events_rewrite_expand(final SubLObject asent) {
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject new_asent = list($$subEventTypes, arg2, arg3);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
        inference_worker_rewrite.rewrite_add_link(query, NIL);
        return NIL;
    }

    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("groupMemberType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$groupTypeMemberType <fort1> <fort2>) literals as \n    (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))\n    ----->\n    (#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject))") });

    public static final SubLObject sub_event_types_rewrite_expand_alt(SubLObject asent) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject new_asent = list($$relationAllExists, $$subEvents, arg1, arg2);
            SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            inference_worker_rewrite.rewrite_add_link(query, NIL);
        }
        return NIL;
    }

    public static SubLObject sub_event_types_rewrite_expand(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject new_asent = list($$relationAllExists, $$subEvents, arg1, arg2);
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
        inference_worker_rewrite.rewrite_add_link(query, NIL);
        return NIL;
    }

    public static SubLObject declare_rewrite_modules_file() {
        declareFunction("ral_sub_situations_from_sub_situation_types_ruleX_initializer", "*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("sub_situation_types_from_ral_sub_situations_ruleX_initializer", "*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("relation_all_exists_sub_situations_rewrite_expand", "RELATION-ALL-EXISTS-SUB-SITUATIONS-REWRITE-EXPAND", 1, 0, false);
        declareFunction("sub_situation_types_rewrite_expand", "SUB-SITUATION-TYPES-REWRITE-EXPAND", 1, 0, false);
        declareFunction("rai_group_member_type_from_group_type_member_type_ruleX_initializer", "*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("group_type_member_type_from_rai_group_member_type_ruleX_initializer", "*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("relation_all_instance_group_member_type_rewrite_expand", "RELATION-ALL-INSTANCE-GROUP-MEMBER-TYPE-REWRITE-EXPAND", 1, 0, false);
        declareFunction("group_type_member_type_rewrite_expand", "GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND", 1, 0, false);
        declareFunction("ral_sub_events_from_sub_event_types_ruleX_initializer", "*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("sub_event_types_from_ral_sub_events_ruleX_initializer", "*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("relation_all_exists_sub_events_rewrite_expand", "RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND", 1, 0, false);
        declareFunction("sub_event_types_rewrite_expand", "SUB-EVENT-TYPES-REWRITE-EXPAND", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("groupTypeMemberType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("GROUP-TYPE-MEMBER-TYPE-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllInstance #$groupMemberType <fort1> <fort2>) literals as \n    (#$groupTypeMemberType <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllInstance #$groupMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)\n    ----->\n    (#$groupTypeMemberType (#$GroupFn #$InanimateObject) #$InanimateObject)") });

    public static SubLObject init_rewrite_modules_file() {
        defvar("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*", $UNINITIALIZED);
        defvar("*SUB-SITUATION-TYPES-FROM-RAL-SUB-SITUATIONS-RULE*", $UNINITIALIZED);
        defvar("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*", $UNINITIALIZED);
        defvar("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*", $UNINITIALIZED);
        defvar("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*", $UNINITIALIZED);
        defvar("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*", $UNINITIALIZED);
        return NIL;
    }

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("subEventTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subEvents"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));

    public static SubLObject setup_rewrite_modules_file() {
        register_kb_variable_initialization($ral_sub_situations_from_sub_situation_types_rule$, $sym2$_RAL_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_RULE__INITIALIZER);
        register_kb_variable_initialization($sub_situation_types_from_ral_sub_situations_rule$, $sym6$_SUB_SITUATION_TYPES_FROM_RAL_SUB_SITUATIONS_RULE__INITIALIZER);
        inference_modules.inference_rewrite_module($RELATION_ALL_EXISTS_SUB_SITUATIONS_FROM_SUB_SITUATION_TYPES_CHECK, $list9);
        inference_modules.inference_rewrite_module($SUB_SITUATION_TYPES_FROM_RELATION_ALL_EXISTS_SUB_SITUATIONS_CHECK, $list13);
        register_kb_variable_initialization($rai_group_member_type_from_group_type_member_type_rule$, $sym17$_RAI_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TYPE_RULE__INITIALI);
        register_kb_variable_initialization($group_type_member_type_from_rai_group_member_type_rule$, $sym20$_GROUP_TYPE_MEMBER_TYPE_FROM_RAI_GROUP_MEMBER_TYPE_RULE__INITIALI);
        inference_modules.inference_rewrite_module($kw22$RELATION_ALL_INSTANCE_GROUP_MEMBER_TYPE_FROM_GROUP_TYPE_MEMBER_TY, $list23);
        inference_modules.inference_rewrite_module($kw25$GROUP_TYPE_MEMBER_TYPE_FROM_RELATION_ALL_INSTANCE_GROUP_MEMBER_TY, $list26);
        register_kb_variable_initialization($ral_sub_events_from_sub_event_types_rule$, $sym30$_RAL_SUB_EVENTS_FROM_SUB_EVENT_TYPES_RULE__INITIALIZER);
        register_kb_variable_initialization($sub_event_types_from_ral_sub_events_rule$, $sym33$_SUB_EVENT_TYPES_FROM_RAL_SUB_EVENTS_RULE__INITIALIZER);
        inference_modules.inference_rewrite_module($RELATION_ALL_EXISTS_SUB_EVENTS_FROM_SUB_EVENT_TYPES_CHECK, $list36);
        inference_modules.inference_rewrite_module($SUB_EVENT_TYPES_FROM_RELATION_ALL_EXISTS_SUB_EVENTS_CHECK, $list39);
        return NIL;
    }

    static private final SubLList $list_alt34 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subEvents"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")), list(reader_make_constant_shell("subEventTypes"), makeSymbol("?WHOLE-TYPE"), makeSymbol("?PART-TYPE")));

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("subEvents"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("RELATION-ALL-EXISTS-SUB-EVENTS-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$subEventTypes <fort1> <fort2>) literals as \n    (#$relationAllExists #$subEvents <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$subEventTypes #$Foraging #$Perceiving)\n    ----->\n    (#$relationAllExists #$subEvents #$Foraging #$Perceiving)") });

    @Override
    public void declareFunctions() {
        declare_rewrite_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_rewrite_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rewrite_modules_file();
    }

    static private final SubLList $list_alt39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("subEventTypes"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SUB-EVENT-TYPES-REWRITE-EXPAND"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites (#$relationAllExists #$subEvents <fort1> <fort2>) literals as \n    (#$subEventTypes <fort1> <fort2>) literals."), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$subEvents #$CompostingProcess #$DecompositionProcess)\n    ----->\n    (#$subEventTypes #$CompostingProcess #$DecompositionProcess)") });

    static {
    }
}

/**
 * Total time: 49 ms
 */
