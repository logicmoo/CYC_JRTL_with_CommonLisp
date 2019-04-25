package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class script_instance_editor_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.script_instance_editor_api";
    public static final String myFingerPrint = "eb05735445bb4b8b89152a7f4bfc0b0150dc7291d7d53689a61ad6cda1ebca18";
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 880L)
    public static SubLSymbol $script_instance_editor_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 1021L)
    public static SubLSymbol $default_sub_situation_instance_level_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 1226L)
    public static SubLSymbol $sub_situation_instance_level_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 1412L)
    public static SubLSymbol $default_role_player_instance_level_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 1750L)
    public static SubLSymbol $role_player_instance_level_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 1970L)
    public static SubLSymbol $default_role_player_type_level_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 2434L)
    public static SubLSymbol $role_player_type_level_relations$;
    private static final SubLSymbol $sym0$_SCRIPT_INSTANCE_EDITOR_MT_;
    private static final SubLObject $const1$InferencePSC;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$WITH_ROLE_PLAYER_INSTANCE_LEVEL_RELATIONS;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$CLET;
    private static final SubLSymbol $sym8$_ROLE_PLAYER_INSTANCE_LEVEL_RELATIONS_;
    private static final SubLSymbol $sym9$WITH_SUB_SITUATION_INSTANCE_LEVEL_RELATIONS;
    private static final SubLSymbol $sym10$_SUB_SITUATION_INSTANCE_LEVEL_RELATIONS_;
    private static final SubLSymbol $sym11$WITH_ROLE_PLAYER_TYPE_LEVEL_RELATIONS;
    private static final SubLSymbol $sym12$_ROLE_PLAYER_TYPE_LEVEL_RELATIONS_;
    private static final SubLSymbol $sym13$GET_SCRIPT_GRAPH_INFO;
    private static final SubLObject $const14$SituationType;
    private static final SubLString $str15$Argument_not_a_situation_type;
    private static final SubLSymbol $kw16$SUB_EVT_TYPE;
    private static final SubLObject $const17$properSubSituationTypes;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$SUB_EVENT_TYPES;
    private static final SubLSymbol $kw20$ROLE_PLAYER_EQUIVALENCES;
    private static final SubLSymbol $sym21$GET_ROLE_PLAYER_EQUIVALENCES_FOR_PRED_AND_SCRIPT;
    private static final SubLObject $const22$equivalentRolePlayers_SubSitTypeT;
    private static final SubLList $list23;
    private static final SubLObject $const24$equivalentRolePlayers_SitTypeToSu;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$CANONICALIZE_TERM;
    private static final SubLSymbol $sym27$GET_GRAPH_FOR_SCRIPT_INSTANCE;
    private static final SubLString $str28$_A_is_not_an_individual_;
    private static final SubLSymbol $kw29$GENLS;
    private static final SubLSymbol $kw30$SPEC;
    private static final SubLSymbol $kw31$GAF;
    private static final SubLSymbol $kw32$PARENT_EVENTS;
    private static final SubLSymbol $kw33$SUB_EVENTS;
    private static final SubLSymbol $kw34$ROLE_PLAYERS;
    private static final SubLSymbol $sym35$GET_COMPLETE_GRAPH_FOR_SCRIPT_INSTANCE;
    private static final SubLSymbol $kw36$NOT_FOUND;
    private static final SubLSymbol $sym37$AUGMENT_COMPLETE_GRAPH_FOR_SCRIPT_INSTANCE;
    private static final SubLSymbol $kw38$SENTENCE;
    private static final SubLSymbol $kw39$ELMT;
    private static final SubLSymbol $sym40$GET_GRAPH_FOR_SCRIPT_ROLE_PLAYER_INSTANCE;
    private static final SubLObject $const41$TheSet;
    private static final SubLSymbol $kw42$EVT;
    private static final SubLObject $const43$properSubEvents;
    private static final SubLList $list44;
    private static final SubLObject $const45$and;
    private static final SubLObject $const46$assertedSentence;
    private static final SubLSymbol $sym47$_PRED;
    private static final SubLSymbol $sym48$_SUB_EVENT;
    private static final SubLObject $const49$elementOf;
    private static final SubLSymbol $sym50$GET_ANCESTOR_NODES;
    private static final SubLSymbol $kw51$DISJUNCTION_FREE_EL_VARS_POLICY;
    private static final SubLSymbol $kw52$COMPUTE_UNION;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$_SUB1;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$GET_ROLE_PLAYER_EQUIVALENCES;
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 2648L)
    public static SubLObject with_role_player_instance_level_relations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject relations = (SubLObject)script_instance_editor_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list6);
        relations = current.first();
        current = current.rest();
        if (script_instance_editor_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)script_instance_editor_api.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)script_instance_editor_api.$sym8$_ROLE_PLAYER_INSTANCE_LEVEL_RELATIONS_, relations)), ConsesLow.append(body, (SubLObject)script_instance_editor_api.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)script_instance_editor_api.$list6);
        return (SubLObject)script_instance_editor_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 2952L)
    public static SubLObject with_sub_situation_instance_level_relations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject relations = (SubLObject)script_instance_editor_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list6);
        relations = current.first();
        current = current.rest();
        if (script_instance_editor_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)script_instance_editor_api.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)script_instance_editor_api.$sym10$_SUB_SITUATION_INSTANCE_LEVEL_RELATIONS_, relations)), ConsesLow.append(body, (SubLObject)script_instance_editor_api.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)script_instance_editor_api.$list6);
        return (SubLObject)script_instance_editor_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 3224L)
    public static SubLObject with_role_player_type_level_relations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject relations = (SubLObject)script_instance_editor_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list6);
        relations = current.first();
        current = current.rest();
        if (script_instance_editor_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)script_instance_editor_api.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)script_instance_editor_api.$sym12$_ROLE_PLAYER_TYPE_LEVEL_RELATIONS_, relations)), ConsesLow.append(body, (SubLObject)script_instance_editor_api.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)script_instance_editor_api.$list6);
        return (SubLObject)script_instance_editor_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 3521L)
    public static SubLObject get_script_graph_info(final SubLObject sit_type, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph_info = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)script_instance_editor_api.EQ), (SubLObject)script_instance_editor_api.UNPROVIDED);
        if (script_instance_editor_api.NIL != isa.not_isaP(sit_type, script_instance_editor_api.$const14$SituationType, (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
            Errors.error((SubLObject)script_instance_editor_api.$str15$Argument_not_a_situation_type);
        }
        else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject sub_events = ask_utilities.query_variable((SubLObject)script_instance_editor_api.$kw16$SUB_EVT_TYPE, (SubLObject)ConsesLow.listS(script_instance_editor_api.$const17$properSubSituationTypes, sit_type, (SubLObject)script_instance_editor_api.$list18), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED);
                dictionary_utilities.dictionary_push(graph_info, (SubLObject)script_instance_editor_api.$kw19$SUB_EVENT_TYPES, sub_events);
                SubLObject role_player_assertions = (SubLObject)script_instance_editor_api.NIL;
                SubLObject query_results = (SubLObject)script_instance_editor_api.NIL;
                SubLObject cdolist_list_var = script_instance_editor_api.$role_player_type_level_relations$.getDynamicValue(thread);
                SubLObject pred = (SubLObject)script_instance_editor_api.NIL;
                pred = cdolist_list_var.first();
                while (script_instance_editor_api.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1;
                    query_results = (cdolist_list_var_$1 = get_role_player_equivalences_for_pred_and_script(pred, sit_type, (SubLObject)script_instance_editor_api.UNPROVIDED));
                    SubLObject ass = (SubLObject)script_instance_editor_api.NIL;
                    ass = cdolist_list_var_$1.first();
                    while (script_instance_editor_api.NIL != cdolist_list_var_$1) {
                        role_player_assertions = (SubLObject)ConsesLow.cons(ass, role_player_assertions);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        ass = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
                dictionary_utilities.dictionary_push(graph_info, (SubLObject)script_instance_editor_api.$kw20$ROLE_PLAYER_EQUIVALENCES, role_player_assertions);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return dictionary_utilities.dictionary_to_alist(graph_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 4770L)
    public static SubLObject get_role_player_equivalences_for_pred_and_script(final SubLObject role_player_equiv_pred, final SubLObject script, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        final SubLObject query_properties = inference_parameters.explicify_inference_engine_query_property_defaults((SubLObject)script_instance_editor_api.NIL);
        SubLObject query = (SubLObject)script_instance_editor_api.NIL;
        SubLObject template = (SubLObject)script_instance_editor_api.NIL;
        SubLObject results = (SubLObject)script_instance_editor_api.NIL;
        if (role_player_equiv_pred.equal(script_instance_editor_api.$const22$equivalentRolePlayers_SubSitTypeT)) {
            query = (SubLObject)ConsesLow.listS(script_instance_editor_api.$const22$equivalentRolePlayers_SubSitTypeT, script, (SubLObject)script_instance_editor_api.$list23);
            template = (SubLObject)ConsesLow.listS(script_instance_editor_api.$const22$equivalentRolePlayers_SubSitTypeT, script, (SubLObject)script_instance_editor_api.$list23);
        }
        else {
            if (!role_player_equiv_pred.equalp(script_instance_editor_api.$const24$equivalentRolePlayers_SitTypeToSu)) {
                return (SubLObject)script_instance_editor_api.NIL;
            }
            query = (SubLObject)ConsesLow.listS(script_instance_editor_api.$const24$equivalentRolePlayers_SitTypeToSu, script, (SubLObject)script_instance_editor_api.$list25);
            template = (SubLObject)ConsesLow.listS(script_instance_editor_api.$const24$equivalentRolePlayers_SitTypeToSu, script, (SubLObject)script_instance_editor_api.$list25);
        }
        results = ask_utilities.query_template(template, query, elmt, query_properties);
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)script_instance_editor_api.$sym26$CANONICALIZE_TERM), results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 6285L)
    public static SubLObject get_graph_for_script_instance(final SubLObject sit_type_instance, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        return get_graph_for_script_instance_impl(sit_type_instance, elmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 6728L)
    public static SubLObject get_graph_for_script_instance_impl(final SubLObject situation_type_instance, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject categorized_assertion_map = (SubLObject)script_instance_editor_api.NIL;
        SubLObject genl_pred_map = (SubLObject)script_instance_editor_api.NIL;
        categorized_assertion_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), (SubLObject)script_instance_editor_api.ZERO_INTEGER);
        genl_pred_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), (SubLObject)script_instance_editor_api.ZERO_INTEGER);
        if (script_instance_editor_api.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && script_instance_editor_api.NIL == kb_accessors.individualP(situation_type_instance)) {
            Errors.error((SubLObject)script_instance_editor_api.$str28$_A_is_not_an_individual_, situation_type_instance);
        }
        SubLObject cdolist_list_var = script_instance_editor_api.$sub_situation_instance_level_relations$.getDynamicValue(thread);
        SubLObject pred = (SubLObject)script_instance_editor_api.NIL;
        pred = cdolist_list_var.first();
        while (script_instance_editor_api.NIL != cdolist_list_var) {
            if (script_instance_editor_api.NIL != list_utilities.intersectP(genl_predicates.min_genl_predicates(pred, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED), script_instance_editor_api.$sub_situation_instance_level_relations$.getDynamicValue(thread), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                dictionary_utilities.dictionary_push(genl_pred_map, pred, (SubLObject)script_instance_editor_api.$kw29$GENLS);
            }
            if (script_instance_editor_api.NIL != list_utilities.intersectP(genl_predicates.max_spec_predicates(pred, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED), script_instance_editor_api.$sub_situation_instance_level_relations$.getDynamicValue(thread), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                dictionary_utilities.dictionary_push(genl_pred_map, pred, (SubLObject)script_instance_editor_api.$kw30$SPEC);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = (SubLObject)script_instance_editor_api.NIL;
            if (script_instance_editor_api.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(situation_type_instance, (SubLObject)script_instance_editor_api.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(situation_type_instance, (SubLObject)script_instance_editor_api.NIL, pred_var);
                SubLObject done_var = (SubLObject)script_instance_editor_api.NIL;
                final SubLObject token_var = (SubLObject)script_instance_editor_api.NIL;
                while (script_instance_editor_api.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (script_instance_editor_api.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)script_instance_editor_api.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)script_instance_editor_api.$kw31$GAF, (SubLObject)script_instance_editor_api.NIL, (SubLObject)script_instance_editor_api.NIL);
                            SubLObject done_var_$2 = (SubLObject)script_instance_editor_api.NIL;
                            final SubLObject token_var_$3 = (SubLObject)script_instance_editor_api.NIL;
                            while (script_instance_editor_api.NIL == done_var_$2) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(ass));
                                if (script_instance_editor_api.NIL != valid_$4) {
                                    final SubLObject pred2 = assertions_high.gaf_arg0(ass);
                                    SubLObject type = (SubLObject)script_instance_editor_api.NIL;
                                    SubLObject event_type = (SubLObject)script_instance_editor_api.NIL;
                                    SubLObject check_assertion_list = (SubLObject)script_instance_editor_api.NIL;
                                    SubLObject spec_foundP = (SubLObject)script_instance_editor_api.NIL;
                                    SubLObject assertions_to_remove = (SubLObject)script_instance_editor_api.NIL;
                                    if (assertions_high.gaf_arg2(ass).equalp(situation_type_instance)) {
                                        event_type = (SubLObject)script_instance_editor_api.$kw32$PARENT_EVENTS;
                                    }
                                    else {
                                        event_type = (SubLObject)script_instance_editor_api.$kw33$SUB_EVENTS;
                                    }
                                    if (script_instance_editor_api.NIL != subl_promotions.memberP(pred2, script_instance_editor_api.$sub_situation_instance_level_relations$.getDynamicValue(thread), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                                        type = dictionary.dictionary_lookup(genl_pred_map, pred2, (SubLObject)script_instance_editor_api.UNPROVIDED);
                                        if (type.equalp((SubLObject)script_instance_editor_api.$kw29$GENLS)) {
                                            SubLObject cdolist_list_var2;
                                            check_assertion_list = (cdolist_list_var2 = dictionary_utilities.dictionary_pop(categorized_assertion_map, event_type));
                                            SubLObject each_item = (SubLObject)script_instance_editor_api.NIL;
                                            each_item = cdolist_list_var2.first();
                                            while (script_instance_editor_api.NIL != cdolist_list_var2) {
                                                if (assertions_high.gaf_arg2(each_item).equal(assertions_high.gaf_arg2(ass)) && script_instance_editor_api.NIL != subl_promotions.memberP(assertions_high.gaf_arg0(each_item), genl_predicates.min_genl_predicates(pred2, (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                                                    assertions_to_remove = (SubLObject)ConsesLow.cons(each_item, assertions_to_remove);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                each_item = cdolist_list_var2.first();
                                            }
                                            check_assertion_list = list_utilities.compare_lists(check_assertion_list, assertions_to_remove, (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED);
                                            dictionary_utilities.dictionary_push(categorized_assertion_map, event_type, check_assertion_list);
                                        }
                                        else {
                                            spec_foundP = (SubLObject)script_instance_editor_api.NIL;
                                            check_assertion_list = dictionary.dictionary_lookup(categorized_assertion_map, event_type, (SubLObject)script_instance_editor_api.UNPROVIDED);
                                            SubLObject each_item;
                                            SubLObject rest;
                                            for (rest = (SubLObject)script_instance_editor_api.NIL, rest = check_assertion_list; script_instance_editor_api.NIL == spec_foundP && script_instance_editor_api.NIL != rest; rest = rest.rest()) {
                                                each_item = rest.first();
                                                if (assertions_high.gaf_arg2(each_item).equal(assertions_high.gaf_arg2(ass)) && script_instance_editor_api.NIL != subl_promotions.memberP(assertions_high.gaf_arg0(each_item), genl_predicates.max_spec_predicates(pred2, (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                                                    spec_foundP = (SubLObject)script_instance_editor_api.T;
                                                }
                                            }
                                            if (script_instance_editor_api.NIL == spec_foundP) {
                                                dictionary_utilities.dictionary_push(categorized_assertion_map, event_type, ass);
                                            }
                                        }
                                    }
                                    if (script_instance_editor_api.NIL != subl_promotions.memberP(pred2, script_instance_editor_api.$role_player_instance_level_relations$.getDynamicValue(thread), (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                                        dictionary_utilities.dictionary_push(categorized_assertion_map, (SubLObject)script_instance_editor_api.$kw34$ROLE_PLAYERS, ass);
                                    }
                                }
                                done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(script_instance_editor_api.NIL == valid_$4);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)script_instance_editor_api.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (script_instance_editor_api.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(script_instance_editor_api.NIL == valid);
                }
            }
            SubLObject cdolist_list_var3 = get_ancestor_nodes(situation_type_instance, elmt);
            SubLObject each_ass = (SubLObject)script_instance_editor_api.NIL;
            each_ass = cdolist_list_var3.first();
            while (script_instance_editor_api.NIL != cdolist_list_var3) {
                dictionary_utilities.dictionary_push(categorized_assertion_map, (SubLObject)script_instance_editor_api.$kw32$PARENT_EVENTS, each_ass);
                cdolist_list_var3 = cdolist_list_var3.rest();
                each_ass = cdolist_list_var3.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return dictionary_utilities.dictionary_to_alist(categorized_assertion_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 9985L)
    public static SubLObject get_complete_graph_for_script_instance(final SubLObject sittype_instance, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        final SubLObject to_check = queues.create_queue((SubLObject)script_instance_editor_api.UNPROVIDED);
        final SubLObject checked = dictionary.new_dictionary((SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED);
        queues.enqueue(sittype_instance, to_check);
        while (script_instance_editor_api.NIL == queues.queue_empty_p(to_check)) {
            final SubLObject current = queues.dequeue(to_check);
            final SubLObject instance_graph = get_graph_for_script_instance(current, elmt);
            dictionary.dictionary_enter(checked, current, instance_graph);
            SubLObject cdolist_list_var;
            final SubLObject sub_event_assertions = cdolist_list_var = conses_high.assoc((SubLObject)script_instance_editor_api.$kw33$SUB_EVENTS, instance_graph, (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED).rest();
            SubLObject sub_event_assertion = (SubLObject)script_instance_editor_api.NIL;
            sub_event_assertion = cdolist_list_var.first();
            while (script_instance_editor_api.NIL != cdolist_list_var) {
                final SubLObject sentence = uncanonicalizer.assertion_el_formula(sub_event_assertion);
                final SubLObject sub_event = cycl_utilities.formula_arg2(sentence, (SubLObject)script_instance_editor_api.UNPROVIDED);
                if (script_instance_editor_api.$kw36$NOT_FOUND == dictionary.dictionary_lookup(checked, sub_event, (SubLObject)script_instance_editor_api.$kw36$NOT_FOUND)) {
                    queues.enqueue(sub_event, to_check);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_event_assertion = cdolist_list_var.first();
            }
        }
        return dictionary_utilities.dictionary_to_alist(checked);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 11177L)
    public static SubLObject augment_complete_graph_for_script_instance(final SubLObject instance_graph, final SubLObject sentence_map, final SubLObject term_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_graph = conses_high.copy_tree(instance_graph);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentence_map)); script_instance_editor_api.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject sentence = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (script_instance_editor_api.NIL != assertion_handles.assertion_p(assertion)) {
                final SubLObject elmt = uncanonicalizer.assertion_elmt(assertion);
                final SubLObject hypothetical = (SubLObject)ConsesLow.list((SubLObject)script_instance_editor_api.$kw38$SENTENCE, sentence, (SubLObject)script_instance_editor_api.$kw39$ELMT, elmt);
                v_graph = list_utilities.tree_substitute(v_graph, assertion, hypothetical);
            }
            else {
                v_graph = list_utilities.tree_substitute(v_graph, assertion, sentence);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_map)); script_instance_editor_api.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject old_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject new_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_graph = list_utilities.tree_substitute(v_graph, old_term, new_term);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 12740L)
    public static SubLObject get_graph_for_script_role_player_instance(final SubLObject role_player, final SubLObject sit_type_instance, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject categorized_assertion_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), (SubLObject)script_instance_editor_api.UNPROVIDED);
        final SubLObject preds = el_utilities.make_formula(script_instance_editor_api.$const41$TheSet, script_instance_editor_api.$role_player_instance_level_relations$.getDynamicValue(thread), (SubLObject)script_instance_editor_api.UNPROVIDED);
        SubLObject sub_events = (SubLObject)script_instance_editor_api.NIL;
        SubLObject query = (SubLObject)script_instance_editor_api.NIL;
        SubLObject results = (SubLObject)script_instance_editor_api.NIL;
        sub_events = ask_utilities.query_variable((SubLObject)script_instance_editor_api.$kw42$EVT, (SubLObject)ConsesLow.listS(script_instance_editor_api.$const43$properSubEvents, sit_type_instance, (SubLObject)script_instance_editor_api.$list44), elmt, (SubLObject)script_instance_editor_api.UNPROVIDED);
        if (script_instance_editor_api.NIL == conses_high.member(sit_type_instance, sub_events, Symbols.symbol_function((SubLObject)script_instance_editor_api.EQL), Symbols.symbol_function((SubLObject)script_instance_editor_api.IDENTITY))) {
            sub_events = (SubLObject)ConsesLow.cons(sit_type_instance, sub_events);
        }
        sub_events = el_utilities.make_formula(script_instance_editor_api.$const41$TheSet, sub_events, (SubLObject)script_instance_editor_api.UNPROVIDED);
        query = (SubLObject)ConsesLow.list(script_instance_editor_api.$const45$and, (SubLObject)ConsesLow.list(script_instance_editor_api.$const46$assertedSentence, (SubLObject)ConsesLow.list((SubLObject)script_instance_editor_api.$sym47$_PRED, (SubLObject)script_instance_editor_api.$sym48$_SUB_EVENT, role_player)), (SubLObject)ConsesLow.list(script_instance_editor_api.$const49$elementOf, (SubLObject)script_instance_editor_api.$sym47$_PRED, preds), (SubLObject)ConsesLow.list(script_instance_editor_api.$const49$elementOf, (SubLObject)script_instance_editor_api.$sym48$_SUB_EVENT, sub_events));
        SubLObject cdolist_list_var;
        results = (cdolist_list_var = ask_utilities.query_template((SubLObject)ConsesLow.list((SubLObject)script_instance_editor_api.$sym47$_PRED, (SubLObject)script_instance_editor_api.$sym48$_SUB_EVENT, role_player), query, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED));
        SubLObject result = (SubLObject)script_instance_editor_api.NIL;
        result = cdolist_list_var.first();
        while (script_instance_editor_api.NIL != cdolist_list_var) {
            final SubLObject ass = czer_meta.find_visible_assertion_cycl(result, elmt);
            dictionary_utilities.dictionary_push(categorized_assertion_map, (SubLObject)script_instance_editor_api.$kw34$ROLE_PLAYERS, ass);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return dictionary_utilities.dictionary_to_alist(categorized_assertion_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 14055L)
    public static SubLObject get_ancestor_nodes(final SubLObject instance, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        SubLObject results = (SubLObject)script_instance_editor_api.NIL;
        SubLObject query_properties = (SubLObject)script_instance_editor_api.NIL;
        SubLObject assertions = (SubLObject)script_instance_editor_api.NIL;
        query_properties = inference_parameters.explicify_inference_engine_query_property_defaults((SubLObject)script_instance_editor_api.NIL);
        conses_high.putf(query_properties, (SubLObject)script_instance_editor_api.$kw51$DISJUNCTION_FREE_EL_VARS_POLICY, (SubLObject)script_instance_editor_api.$kw52$COMPUTE_UNION);
        SubLObject cdolist_list_var;
        results = (cdolist_list_var = ask_utilities.query_template((SubLObject)script_instance_editor_api.$list53, (SubLObject)ConsesLow.listS(script_instance_editor_api.$const45$and, (SubLObject)ConsesLow.list(script_instance_editor_api.$const43$properSubEvents, (SubLObject)script_instance_editor_api.$sym54$_SUB1, instance), (SubLObject)script_instance_editor_api.$list55), script_instance_editor_api.$const1$InferencePSC, query_properties));
        SubLObject res = (SubLObject)script_instance_editor_api.NIL;
        res = cdolist_list_var.first();
        while (script_instance_editor_api.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = res;
            SubLObject arg_1 = (SubLObject)script_instance_editor_api.NIL;
            SubLObject arg_2 = (SubLObject)script_instance_editor_api.NIL;
            SubLObject item = (SubLObject)script_instance_editor_api.NIL;
            SubLObject mt = (SubLObject)script_instance_editor_api.NIL;
            SubLObject mt2 = (SubLObject)script_instance_editor_api.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list56);
            arg_1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list56);
            arg_2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list56);
            item = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list56);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)script_instance_editor_api.$list56);
            mt2 = current.first();
            current = current.rest();
            if (script_instance_editor_api.NIL == current) {
                if (item.equal(instance)) {
                    final SubLObject ass_var = czer_meta.find_visible_assertion_cycl((SubLObject)ConsesLow.list(script_instance_editor_api.$const43$properSubEvents, arg_1, arg_2), mt);
                    assertions = (SubLObject)ConsesLow.cons(ass_var, assertions);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)script_instance_editor_api.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            res = cdolist_list_var.first();
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 15269L)
    public static SubLObject get_role_player_equivalences(final SubLObject role_player, final SubLObject script_instance, final SubLObject script, SubLObject elmt) {
        if (elmt == script_instance_editor_api.UNPROVIDED) {
            elmt = script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_facts = (SubLObject)script_instance_editor_api.NIL;
        SubLObject roles_played_by = (SubLObject)script_instance_editor_api.NIL;
        SubLObject equiv_sub_sit_list = (SubLObject)script_instance_editor_api.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            known_facts = event_learning.get_represented_facts_for_event(script_instance, elmt);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = known_facts;
        SubLObject fact = (SubLObject)script_instance_editor_api.NIL;
        fact = cdolist_list_var.first();
        while (script_instance_editor_api.NIL != cdolist_list_var) {
            if (role_player.equal(conses_high.third(fact))) {
                final SubLObject item_var = fact;
                if (script_instance_editor_api.NIL == conses_high.member(item_var, roles_played_by, Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), Symbols.symbol_function((SubLObject)script_instance_editor_api.IDENTITY))) {
                    roles_played_by = (SubLObject)ConsesLow.cons(item_var, roles_played_by);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact = cdolist_list_var.first();
        }
        final SubLObject script_map = get_script_graph_info(script, elmt);
        final SubLObject script_role_player_equivalences = list_utilities.alist_lookup(script_map, (SubLObject)script_instance_editor_api.$kw20$ROLE_PLAYER_EQUIVALENCES, (SubLObject)script_instance_editor_api.UNPROVIDED, (SubLObject)script_instance_editor_api.UNPROVIDED);
        SubLObject equivalence_predicate = (SubLObject)script_instance_editor_api.NIL;
        SubLObject cdolist_list_var2 = script_role_player_equivalences.first();
        SubLObject role_player_relation = (SubLObject)script_instance_editor_api.NIL;
        role_player_relation = cdolist_list_var2.first();
        while (script_instance_editor_api.NIL != cdolist_list_var2) {
            equivalence_predicate = role_player_relation.first();
            if (equivalence_predicate.equal(script_instance_editor_api.$const22$equivalentRolePlayers_SubSitTypeT)) {
                final SubLObject sit_type = conses_high.second(role_player_relation);
                final SubLObject role_1 = conses_high.third(role_player_relation);
                final SubLObject sub_sit_type_1 = conses_high.fourth(role_player_relation);
                final SubLObject role_2 = conses_high.fifth(role_player_relation);
                final SubLObject sub_sit_type_2 = conses_high.sixth(role_player_relation);
                final SubLObject roles_map = all_roles_matching(roles_played_by, (SubLObject)ConsesLow.list(role_1, role_2));
                final SubLObject roles_by_role_1 = dictionary.dictionary_lookup(roles_map, role_1, (SubLObject)script_instance_editor_api.UNPROVIDED);
                final SubLObject roles_by_role_2 = dictionary.dictionary_lookup(roles_map, role_2, (SubLObject)script_instance_editor_api.UNPROVIDED);
                if (script_instance_editor_api.NIL != roles_by_role_1 && script_instance_editor_api.NIL != roles_by_role_2) {
                    SubLObject cdolist_list_var_$6 = roles_by_role_1;
                    SubLObject role_formula = (SubLObject)script_instance_editor_api.NIL;
                    role_formula = cdolist_list_var_$6.first();
                    while (script_instance_editor_api.NIL != cdolist_list_var_$6) {
                        if (script_instance_editor_api.NIL != isa.isaP(conses_high.second(role_formula), sub_sit_type_1, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                            SubLObject cdolist_list_var_$7 = roles_by_role_2;
                            SubLObject role_formula2 = (SubLObject)script_instance_editor_api.NIL;
                            role_formula2 = cdolist_list_var_$7.first();
                            while (script_instance_editor_api.NIL != cdolist_list_var_$7) {
                                if (script_instance_editor_api.NIL != isa.isaP(conses_high.second(role_formula2), sub_sit_type_2, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                                    SubLObject item_var2 = (SubLObject)ConsesLow.list(conses_high.second(role_formula), role_1);
                                    if (script_instance_editor_api.NIL == conses_high.member(item_var2, equiv_sub_sit_list, Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), Symbols.symbol_function((SubLObject)script_instance_editor_api.IDENTITY))) {
                                        equiv_sub_sit_list = (SubLObject)ConsesLow.cons(item_var2, equiv_sub_sit_list);
                                    }
                                    item_var2 = (SubLObject)ConsesLow.list(conses_high.second(role_formula2), role_2);
                                    if (script_instance_editor_api.NIL == conses_high.member(item_var2, equiv_sub_sit_list, Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), Symbols.symbol_function((SubLObject)script_instance_editor_api.IDENTITY))) {
                                        equiv_sub_sit_list = (SubLObject)ConsesLow.cons(item_var2, equiv_sub_sit_list);
                                    }
                                }
                                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                role_formula2 = cdolist_list_var_$7.first();
                            }
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        role_formula = cdolist_list_var_$6.first();
                    }
                }
            }
            else if (equivalence_predicate.equal(script_instance_editor_api.$const24$equivalentRolePlayers_SitTypeToSu)) {
                final SubLObject sit_type = conses_high.second(role_player_relation);
                final SubLObject sit_role_1 = conses_high.third(role_player_relation);
                final SubLObject sub_sit_type_1 = conses_high.fourth(role_player_relation);
                final SubLObject sub_sit_role_2 = conses_high.fifth(role_player_relation);
                final SubLObject roles_map2 = all_roles_matching(roles_played_by, (SubLObject)ConsesLow.list(sit_role_1, sub_sit_role_2));
                final SubLObject roles_by_role_3 = dictionary.dictionary_lookup(roles_map2, sit_role_1, (SubLObject)script_instance_editor_api.UNPROVIDED);
                final SubLObject roles_by_role_4 = dictionary.dictionary_lookup(roles_map2, sub_sit_role_2, (SubLObject)script_instance_editor_api.UNPROVIDED);
                if (script_instance_editor_api.NIL != roles_by_role_3 && script_instance_editor_api.NIL != roles_by_role_4) {
                    SubLObject cdolist_list_var_$8 = roles_by_role_3;
                    SubLObject role_formula3 = (SubLObject)script_instance_editor_api.NIL;
                    role_formula3 = cdolist_list_var_$8.first();
                    while (script_instance_editor_api.NIL != cdolist_list_var_$8) {
                        if (script_instance_editor_api.NIL != isa.isaP(conses_high.second(role_formula3), sit_type, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                            SubLObject cdolist_list_var_$9 = roles_by_role_4;
                            SubLObject role_formula4 = (SubLObject)script_instance_editor_api.NIL;
                            role_formula4 = cdolist_list_var_$9.first();
                            while (script_instance_editor_api.NIL != cdolist_list_var_$9) {
                                if (script_instance_editor_api.NIL != isa.isaP(conses_high.second(role_formula4), sub_sit_type_1, elmt, (SubLObject)script_instance_editor_api.UNPROVIDED)) {
                                    SubLObject item_var3 = (SubLObject)ConsesLow.list(conses_high.second(role_formula3), sit_role_1);
                                    if (script_instance_editor_api.NIL == conses_high.member(item_var3, equiv_sub_sit_list, Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), Symbols.symbol_function((SubLObject)script_instance_editor_api.IDENTITY))) {
                                        equiv_sub_sit_list = (SubLObject)ConsesLow.cons(item_var3, equiv_sub_sit_list);
                                    }
                                    item_var3 = (SubLObject)ConsesLow.list(conses_high.second(role_formula4), sub_sit_role_2);
                                    if (script_instance_editor_api.NIL == conses_high.member(item_var3, equiv_sub_sit_list, Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), Symbols.symbol_function((SubLObject)script_instance_editor_api.IDENTITY))) {
                                        equiv_sub_sit_list = (SubLObject)ConsesLow.cons(item_var3, equiv_sub_sit_list);
                                    }
                                }
                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                role_formula4 = cdolist_list_var_$9.first();
                            }
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        role_formula3 = cdolist_list_var_$8.first();
                    }
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            role_player_relation = cdolist_list_var2.first();
        }
        return equiv_sub_sit_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/script-instance-editor-api.lisp", position = 18968L)
    public static SubLObject all_roles_matching(final SubLObject list_of_roles_played, final SubLObject list_of_roles_to_search) {
        final SubLObject roles_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)script_instance_editor_api.EQUAL), (SubLObject)script_instance_editor_api.UNPROVIDED);
        SubLObject cdolist_list_var = list_of_roles_to_search;
        SubLObject role_to_search = (SubLObject)script_instance_editor_api.NIL;
        role_to_search = cdolist_list_var.first();
        while (script_instance_editor_api.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = list_of_roles_played;
            SubLObject role_played_formula = (SubLObject)script_instance_editor_api.NIL;
            role_played_formula = cdolist_list_var_$10.first();
            while (script_instance_editor_api.NIL != cdolist_list_var_$10) {
                if (role_played_formula.first().equalp(role_to_search)) {
                    dictionary_utilities.dictionary_push(roles_map, role_to_search, role_played_formula);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                role_played_formula = cdolist_list_var_$10.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            role_to_search = cdolist_list_var.first();
        }
        return roles_map;
    }
    
    public static SubLObject declare_script_instance_editor_api_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.script_instance_editor_api", "with_role_player_instance_level_relations", "WITH-ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.script_instance_editor_api", "with_sub_situation_instance_level_relations", "WITH-SUB-SITUATION-INSTANCE-LEVEL-RELATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.script_instance_editor_api", "with_role_player_type_level_relations", "WITH-ROLE-PLAYER-TYPE-LEVEL-RELATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_script_graph_info", "GET-SCRIPT-GRAPH-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_role_player_equivalences_for_pred_and_script", "GET-ROLE-PLAYER-EQUIVALENCES-FOR-PRED-AND-SCRIPT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_graph_for_script_instance", "GET-GRAPH-FOR-SCRIPT-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_graph_for_script_instance_impl", "GET-GRAPH-FOR-SCRIPT-INSTANCE-IMPL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_complete_graph_for_script_instance", "GET-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "augment_complete_graph_for_script_instance", "AUGMENT-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_graph_for_script_role_player_instance", "GET-GRAPH-FOR-SCRIPT-ROLE-PLAYER-INSTANCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_ancestor_nodes", "GET-ANCESTOR-NODES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "get_role_player_equivalences", "GET-ROLE-PLAYER-EQUIVALENCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.script_instance_editor_api", "all_roles_matching", "ALL-ROLES-MATCHING", 2, 0, false);
        return (SubLObject)script_instance_editor_api.NIL;
    }
    
    public static SubLObject init_script_instance_editor_api_file() {
        script_instance_editor_api.$script_instance_editor_mt$ = SubLFiles.defparameter("*SCRIPT-INSTANCE-EDITOR-MT*", script_instance_editor_api.$const1$InferencePSC);
        script_instance_editor_api.$default_sub_situation_instance_level_relations$ = SubLFiles.deflexical("*DEFAULT-SUB-SITUATION-INSTANCE-LEVEL-RELATIONS*", (SubLObject)script_instance_editor_api.$list2);
        script_instance_editor_api.$sub_situation_instance_level_relations$ = SubLFiles.defparameter("*SUB-SITUATION-INSTANCE-LEVEL-RELATIONS*", script_instance_editor_api.$default_sub_situation_instance_level_relations$.getGlobalValue());
        script_instance_editor_api.$default_role_player_instance_level_relations$ = SubLFiles.deflexical("*DEFAULT-ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS*", (SubLObject)script_instance_editor_api.$list3);
        script_instance_editor_api.$role_player_instance_level_relations$ = SubLFiles.defparameter("*ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS*", script_instance_editor_api.$default_role_player_instance_level_relations$.getGlobalValue());
        script_instance_editor_api.$default_role_player_type_level_relations$ = SubLFiles.deflexical("*DEFAULT-ROLE-PLAYER-TYPE-LEVEL-RELATIONS*", (SubLObject)script_instance_editor_api.$list4);
        script_instance_editor_api.$role_player_type_level_relations$ = SubLFiles.defparameter("*ROLE-PLAYER-TYPE-LEVEL-RELATIONS*", script_instance_editor_api.$default_role_player_type_level_relations$.getGlobalValue());
        return (SubLObject)script_instance_editor_api.NIL;
    }
    
    public static SubLObject setup_script_instance_editor_api_file() {
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym0$_SCRIPT_INSTANCE_EDITOR_MT_);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym5$WITH_ROLE_PLAYER_INSTANCE_LEVEL_RELATIONS);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym9$WITH_SUB_SITUATION_INSTANCE_LEVEL_RELATIONS);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym11$WITH_ROLE_PLAYER_TYPE_LEVEL_RELATIONS);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym13$GET_SCRIPT_GRAPH_INFO);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym21$GET_ROLE_PLAYER_EQUIVALENCES_FOR_PRED_AND_SCRIPT);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym27$GET_GRAPH_FOR_SCRIPT_INSTANCE);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym35$GET_COMPLETE_GRAPH_FOR_SCRIPT_INSTANCE);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym37$AUGMENT_COMPLETE_GRAPH_FOR_SCRIPT_INSTANCE);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym40$GET_GRAPH_FOR_SCRIPT_ROLE_PLAYER_INSTANCE);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym50$GET_ANCESTOR_NODES);
        access_macros.register_external_symbol((SubLObject)script_instance_editor_api.$sym57$GET_ROLE_PLAYER_EQUIVALENCES);
        return (SubLObject)script_instance_editor_api.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_script_instance_editor_api_file();
    }
    
    @Override
	public void initializeVariables() {
        init_script_instance_editor_api_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_script_instance_editor_api_file();
    }
    
    static {
        me = (SubLFile)new script_instance_editor_api();
        script_instance_editor_api.$script_instance_editor_mt$ = null;
        script_instance_editor_api.$default_sub_situation_instance_level_relations$ = null;
        script_instance_editor_api.$sub_situation_instance_level_relations$ = null;
        script_instance_editor_api.$default_role_player_instance_level_relations$ = null;
        script_instance_editor_api.$role_player_instance_level_relations$ = null;
        script_instance_editor_api.$default_role_player_type_level_relations$ = null;
        script_instance_editor_api.$role_player_type_level_relations$ = null;
        $sym0$_SCRIPT_INSTANCE_EDITOR_MT_ = SubLObjectFactory.makeSymbol("*SCRIPT-INSTANCE-EDITOR-MT*");
        $const1$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstSubEvents")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lastSubEvents")));
        $list3 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hostages")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("losesControl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectOfControlTransfer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agreeingAgents")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ransomDemanded")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("senderOfInfo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agreementCreated")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("crimeVictim")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")) });
        $list4 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivRolePlayers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivRolePlayersOfType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayers-SitTypeToSubSitType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayers-SitTypeToSubSitType-Unique")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayers-SubSitTypeToSubSitType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayers-SubSitTypeToSubSitType-Unique")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayersOfType-SubSitTypeToSubSitType")));
        $sym5$WITH_ROLE_PLAYER_INSTANCE_LEVEL_RELATIONS = SubLObjectFactory.makeSymbol("WITH-ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym8$_ROLE_PLAYER_INSTANCE_LEVEL_RELATIONS_ = SubLObjectFactory.makeSymbol("*ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS*");
        $sym9$WITH_SUB_SITUATION_INSTANCE_LEVEL_RELATIONS = SubLObjectFactory.makeSymbol("WITH-SUB-SITUATION-INSTANCE-LEVEL-RELATIONS");
        $sym10$_SUB_SITUATION_INSTANCE_LEVEL_RELATIONS_ = SubLObjectFactory.makeSymbol("*SUB-SITUATION-INSTANCE-LEVEL-RELATIONS*");
        $sym11$WITH_ROLE_PLAYER_TYPE_LEVEL_RELATIONS = SubLObjectFactory.makeSymbol("WITH-ROLE-PLAYER-TYPE-LEVEL-RELATIONS");
        $sym12$_ROLE_PLAYER_TYPE_LEVEL_RELATIONS_ = SubLObjectFactory.makeSymbol("*ROLE-PLAYER-TYPE-LEVEL-RELATIONS*");
        $sym13$GET_SCRIPT_GRAPH_INFO = SubLObjectFactory.makeSymbol("GET-SCRIPT-GRAPH-INFO");
        $const14$SituationType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SituationType"));
        $str15$Argument_not_a_situation_type = SubLObjectFactory.makeString("Argument not a situation type");
        $kw16$SUB_EVT_TYPE = SubLObjectFactory.makeKeyword("SUB-EVT-TYPE");
        $const17$properSubSituationTypes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubSituationTypes"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUB-EVT-TYPE"));
        $kw19$SUB_EVENT_TYPES = SubLObjectFactory.makeKeyword("SUB-EVENT-TYPES");
        $kw20$ROLE_PLAYER_EQUIVALENCES = SubLObjectFactory.makeKeyword("ROLE-PLAYER-EQUIVALENCES");
        $sym21$GET_ROLE_PLAYER_EQUIVALENCES_FOR_PRED_AND_SCRIPT = SubLObjectFactory.makeSymbol("GET-ROLE-PLAYER-EQUIVALENCES-FOR-PRED-AND-SCRIPT");
        $const22$equivalentRolePlayers_SubSitTypeT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayers-SubSitTypeToSubSitType"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SUB-SIT-TYPE-1"), (SubLObject)SubLObjectFactory.makeSymbol("?SIT-ROLE-1"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-SIT-TYPE-2"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-SIT-ROLE-2"));
        $const24$equivalentRolePlayers_SitTypeToSu = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equivalentRolePlayers-SitTypeToSubSitType"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SIT-ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-SIT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-SIT-ROLE"));
        $sym26$CANONICALIZE_TERM = SubLObjectFactory.makeSymbol("CANONICALIZE-TERM");
        $sym27$GET_GRAPH_FOR_SCRIPT_INSTANCE = SubLObjectFactory.makeSymbol("GET-GRAPH-FOR-SCRIPT-INSTANCE");
        $str28$_A_is_not_an_individual_ = SubLObjectFactory.makeString("~A is not an individual.");
        $kw29$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw30$SPEC = SubLObjectFactory.makeKeyword("SPEC");
        $kw31$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw32$PARENT_EVENTS = SubLObjectFactory.makeKeyword("PARENT-EVENTS");
        $kw33$SUB_EVENTS = SubLObjectFactory.makeKeyword("SUB-EVENTS");
        $kw34$ROLE_PLAYERS = SubLObjectFactory.makeKeyword("ROLE-PLAYERS");
        $sym35$GET_COMPLETE_GRAPH_FOR_SCRIPT_INSTANCE = SubLObjectFactory.makeSymbol("GET-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE");
        $kw36$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym37$AUGMENT_COMPLETE_GRAPH_FOR_SCRIPT_INSTANCE = SubLObjectFactory.makeSymbol("AUGMENT-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE");
        $kw38$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw39$ELMT = SubLObjectFactory.makeKeyword("ELMT");
        $sym40$GET_GRAPH_FOR_SCRIPT_ROLE_PLAYER_INSTANCE = SubLObjectFactory.makeSymbol("GET-GRAPH-FOR-SCRIPT-ROLE-PLAYER-INSTANCE");
        $const41$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $kw42$EVT = SubLObjectFactory.makeKeyword("EVT");
        $const43$properSubEvents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVT"));
        $const45$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const46$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $sym47$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $sym48$_SUB_EVENT = SubLObjectFactory.makeSymbol("?SUB-EVENT");
        $const49$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym50$GET_ANCESTOR_NODES = SubLObjectFactory.makeSymbol("GET-ANCESTOR-NODES");
        $kw51$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $kw52$COMPUTE_UNION = SubLObjectFactory.makeKeyword("COMPUTE-UNION");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SUB"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB1"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB2"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-MT"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB2-MT"));
        $sym54$_SUB1 = SubLObjectFactory.makeSymbol("?SUB1");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("join-left")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-MT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents")), (SubLObject)SubLObjectFactory.makeSymbol("?SUB"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?SUB2-MT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents")), (SubLObject)SubLObjectFactory.makeSymbol("?SUB1"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB2")))));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-2"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT2"));
        $sym57$GET_ROLE_PLAYER_EQUIVALENCES = SubLObjectFactory.makeSymbol("GET-ROLE-PLAYER-EQUIVALENCES");
    }
}

/*

	Total time: 359 ms
	
*/