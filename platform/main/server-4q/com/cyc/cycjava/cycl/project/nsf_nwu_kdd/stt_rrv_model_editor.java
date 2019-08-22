/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.project.nsf_nwu_kdd;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.cycml;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.rkf_term_utilities;
import com.cyc.cycjava.cycl.script_instance_editor_api;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      STT-RRV-MODEL-EDITOR
 *  source file: /cyc/top/cycl/project/nsf-nwu-kdd/stt-rrv-model-editor.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class stt_rrv_model_editor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private stt_rrv_model_editor() {
    }

    public static final SubLFile me = new stt_rrv_model_editor();


    // // Definitions
    // deflexical
    private static final SubLSymbol $situation_type_level_relations$ = makeSymbol("*SITUATION-TYPE-LEVEL-RELATIONS*");

    // deflexical
    private static final SubLSymbol $stt_rrv_script_edit_mt$ = makeSymbol("*STT-RRV-SCRIPT-EDIT-MT*");

    // deflexical
    private static final SubLSymbol $stt_rrv_entity_types$ = makeSymbol("*STT-RRV-ENTITY-TYPES*");

    /**
     * Obtain the relations that we use to organize the script infrastructure.
     */
    public static final SubLObject get_script_ancestor_relationships() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return copy_list(script_instance_editor_api.$sub_situation_instance_level_relations$.getDynamicValue(thread));
        }
    }

    /**
     * Project a node's isas down to the types enumerated in the RRV list.
     */
    public static final SubLObject get_script_node_isas(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return isa.all_isa_among(node, $stt_rrv_entity_types$.getGlobalValue(), mt, UNPROVIDED);
    }

    public static final SubLObject clamp_collection_to_rrv_permitted(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (NIL != subl_promotions.memberP(col, $stt_rrv_entity_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            return list(col);
        }
        {
            SubLObject broadened = genls.all_genls_among(col, $stt_rrv_entity_types$.getGlobalValue(), mt, UNPROVIDED);
            SubLObject tightened = genls.all_specs_among(col, $stt_rrv_entity_types$.getGlobalValue(), mt, UNPROVIDED);
            return remove_duplicates(append(broadened, tightened), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject clamp_predicate_to_rrv_permitted(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return clamp_predicate_to_rrv_predicates(pred, script_instance_editor_api.$role_player_instance_level_relations$.getDynamicValue(thread), mt);
        }
    }

    public static final SubLObject clamp_predicate_to_rrv_scene_permitted(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return clamp_predicate_to_rrv_predicates(pred, script_instance_editor_api.$sub_situation_instance_level_relations$.getDynamicValue(thread), mt);
        }
    }

    public static final SubLObject clamp_predicate_to_rrv_predicates(SubLObject pred, SubLObject rrv_predicates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (NIL != subl_promotions.memberP(pred, rrv_predicates, UNPROVIDED, UNPROVIDED)) {
            return list(pred);
        }
        {
            SubLObject broadened = genl_predicates.all_genl_preds_among(pred, rrv_predicates, mt, UNPROVIDED);
            SubLObject tightened = genl_predicates.all_spec_predicates_among(pred, rrv_predicates, mt, UNPROVIDED);
            return genl_predicates.min_predicates(remove_duplicates(append(broadened, tightened), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Create an edge between the SOURCE and the TARGET node of EDGE-TYPE in ELMT.
     *
     * @return ASSERTION-P the assertion modeling the edge, NIL on failure
     */
    public static final SubLObject model_editor_create_edge(SubLObject source, SubLObject edge_type, SubLObject target, SubLObject elmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
                SubLObject sentence = el_utilities.make_binary_formula(edge_type, source, target);
                thread.resetMultipleValues();
                {
                    SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(sentence, v_hlmt, T);
                    SubLObject reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != successP) {
                        {
                            SubLObject assertion = czer_meta.find_assertion_cycl(sentence, v_hlmt);
                            return assertion;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Remove an existing edge between the SOURCE and the TARGET node of EDGE-TYPE visible
     * from ELMT.
     *
     * @return BOOLEANP success or failure
     */
    public static final SubLObject model_editor_remove_edge(SubLObject source, SubLObject edge_type, SubLObject target, SubLObject elmt) {
        {
            SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
            SubLObject sentence = el_utilities.make_binary_formula(edge_type, source, target);
            return rkf_assertion_utilities.rkf_unassert(sentence, v_hlmt);
        }
    }

    /**
     * Change either the SOURCE or the TARGET (depending on CHANGE-TARGET?) of an existing edge
     * of EDGE-TYPE between SOURCE and TARGET, visible from ELMT, to NEW.
     *
     * @return ASSERTION-P the new assertion modeling the edge, NIL on failure
     */
    public static final SubLObject model_editor_edit_edge(SubLObject source, SubLObject edge_type, SubLObject target, SubLObject elmt, SubLObject v_new, SubLObject change_targetP) {
        if (change_targetP == UNPROVIDED) {
            change_targetP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
                SubLObject old_sentence = el_utilities.make_binary_formula(edge_type, source, target);
                SubLObject new_sentence = el_utilities.copy_formula(old_sentence);
                set_nth(NIL != change_targetP ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER, new_sentence, v_new);
                thread.resetMultipleValues();
                {
                    SubLObject successP = rkf_assertion_utilities.rkf_edit_with_implicature(old_sentence, new_sentence, v_hlmt);
                    SubLObject why_notP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != successP) {
                        {
                            SubLObject assertion = czer_meta.find_assertion_cycl(new_sentence, v_hlmt);
                            return assertion;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * The default prefix that all model editor nodes have that are introduced programmatically.
     */
    // deflexical
    public static final SubLSymbol $model_editor_default_node_prefix$ = makeSymbol("*MODEL-EDITOR-DEFAULT-NODE-PREFIX*");

    /**
     * Create a new node of type NODE-TYPE with type information in ELMT, lexifying it
     * with LABEL in LEXICAL-MT.
     *
     * @return FORT-P the new node or NIL on failure
     */
    public static final SubLObject model_editor_introduce_node(SubLObject node_type, SubLObject elmt, SubLObject label, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
                SubLObject new_node = rkf_term_utilities.rkf_create(label, NIL, $model_editor_default_node_prefix$.getGlobalValue(), NIL, UNPROVIDED);
                SubLObject type_sentence = el_utilities.make_binary_formula($$isa, new_node, node_type);
                thread.resetMultipleValues();
                {
                    SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(type_sentence, v_hlmt, T);
                    SubLObject why_notP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != successP) {
                        {
                            SubLObject label_predicate = choose_model_editor_node_labeling_predicate_from_type(node_type, v_hlmt);
                            SubLObject labeling_sentence = el_utilities.make_binary_formula(label_predicate, new_node, label);
                            SubLObject lexical_hlmt = hlmt_czer.canonicalize_hlmt(lexical_mt);
                            thread.resetMultipleValues();
                            {
                                SubLObject successP_1 = rkf_assertion_utilities.rkf_assert_with_implicature(labeling_sentence, lexical_hlmt, T);
                                SubLObject why_notP_2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != successP_1) {
                                    return new_node;
                                }
                            }
                        }
                    }
                }
                rkf_term_utilities.rkf_kill_now(new_node);
            }
            return NIL;
        }
    }

    /**
     * Delete the NODE from the KB.
     *
     * @return BOOLEANP success or failure
     */
    public static final SubLObject model_editor_delete_node(SubLObject node) {
        return list_utilities.sublisp_boolean(rkf_term_utilities.rkf_kill_now(node));
    }

    /**
     * Relexify the NODE to NEW-LABEL in LEXICAL-MT.
     *
     * @return STRINGP the new lexification or NIL on failure
     */
    public static final SubLObject model_editor_rename_node(SubLObject node, SubLObject new_label, SubLObject elmt, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
                SubLObject lexical_hlmt = hlmt_czer.canonicalize_hlmt(lexical_mt);
                SubLObject label_predicate = choose_model_editor_node_labeling_predicate_from_node(node, v_hlmt);
                SubLObject label_finder = el_utilities.make_binary_formula(label_predicate, node, $sym14$_OLD_LABEL);
                SubLObject old_sentence_template = el_utilities.copy_formula(label_finder);
                SubLObject old_sentence = ask_utilities.query_template(old_sentence_template, label_finder, lexical_hlmt, UNPROVIDED).first();
                SubLObject new_sentence = el_utilities.copy_formula(old_sentence);
                if (NIL == new_sentence) {
                    new_sentence = el_utilities.make_binary_formula(label_predicate, node, new_label);
                    thread.resetMultipleValues();
                    {
                        SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(new_sentence, lexical_hlmt, UNPROVIDED);
                        SubLObject why_notP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != successP) {
                            return pph_main.generate_phrase(node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    set_nth(TWO_INTEGER, new_sentence, new_label);
                    thread.resetMultipleValues();
                    {
                        SubLObject successP = rkf_assertion_utilities.rkf_edit_with_implicature(old_sentence, new_sentence, lexical_hlmt);
                        SubLObject why_notP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != successP) {
                            return pph_main.generate_phrase(node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Predicates that we need to make sure are available to the parsing code.
     */
    // deflexical
    private static final SubLSymbol $needed_model_editor_lexical_predicates$ = makeSymbol("*NEEDED-MODEL-EDITOR-LEXICAL-PREDICATES*");

    public static final SubLObject augment_semantic_predicates_excluded_from_lexical_lookup(SubLObject filtered_predicate_set, SubLObject needed_preds) {
        {
            SubLObject augmented_set = set.copy_set(filtered_predicate_set);
            SubLObject cdolist_list_var = needed_preds;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                set.set_remove(predicate, augmented_set);
            }
            return augmented_set;
        }
    }

    // deflexical
    private static final SubLSymbol $augmented_semantic_predicates_excluded_from_lexical_lookup$ = makeSymbol("*AUGMENTED-SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*");

    /**
     * Parse the contents of a node label to an actual node of type node-type
     *
     * @return LISTP of (FORT-P STRINGP) the parsed node or NIL
     */
    public static final SubLObject model_editor_parse_node(SubLObject label, SubLObject node_type, SubLObject elmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(elmt);
                SubLObject answers = NIL;
                SubLObject interpretations = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.currentBinding(thread);
                    try {
                        lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.bind($augmented_semantic_predicates_excluded_from_lexical_lookup$.getGlobalValue(), thread);
                        answers = api_widgets.get_constrained_cycl_for_string(label, node_type, v_hlmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = answers;
                    SubLObject v_answer = NIL;
                    for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                        {
                            SubLObject datum = v_answer;
                            SubLObject current = datum;
                            SubLObject trash = NIL;
                            SubLObject fort = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt17);
                            trash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt17);
                            fort = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject datum_3 = trash;
                                    SubLObject current_4 = datum_3;
                                    SubLObject string = NIL;
                                    SubLObject remainder = NIL;
                                    destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                                    string = current_4.first();
                                    current_4 = current_4.rest();
                                    destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                                    remainder = current_4.first();
                                    current_4 = current_4.rest();
                                    if (NIL == current_4) {
                                        interpretations = cons(list(fort, string), interpretations);
                                    } else {
                                        cdestructuring_bind_error(datum_3, $list_alt18);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt17);
                            }
                        }
                    }
                }
                return nreverse(interpretations);
            }
        }
    }

    public static final SubLObject suggested_mt_for_role_player_assertion(SubLObject script_scene) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_assertion_mts = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($stt_rrv_script_edit_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(script_scene, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(script_scene, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_5 = NIL;
                                                            SubLObject token_var_6 = NIL;
                                                            while (NIL == done_var_5) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                    SubLObject valid_7 = makeBoolean(token_var_6 != ass);
                                                                    if (NIL != valid_7) {
                                                                        if (NIL != member(assertions_high.gaf_arg0(ass), script_instance_editor_api.$role_player_instance_level_relations$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                                            {
                                                                                SubLObject item_var = assertions_high.assertion_mt(ass);
                                                                                if (NIL == member(item_var, all_assertion_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    all_assertion_mts = cons(item_var, all_assertion_mts);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_5 = makeBoolean(NIL == valid_7);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return all_assertion_mts.first();
            }
        }
    }

    public static final SubLObject rrv_relations_info() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rrv_info = NIL;
                SubLObject cdolist_list_var = script_instance_editor_api.$role_player_instance_level_relations$.getDynamicValue(thread);
                SubLObject each_pred = NIL;
                for (each_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_pred = cdolist_list_var.first()) {
                    {
                        SubLObject arg1isa = convert_arg_constraints_to_rrv_permitted(kb_accessors.arg1_isa(each_pred, UNPROVIDED));
                        SubLObject arg2isa = convert_arg_constraints_to_rrv_permitted(kb_accessors.arg2_isa(each_pred, UNPROVIDED));
                        rrv_info = cons(list(each_pred, $ARG1_ISA, arg1isa, $ARG2_ISA, arg2isa), rrv_info);
                    }
                }
                return rrv_info;
            }
        }
    }

    public static final SubLObject rrv_relations_information() {
        {
            SubLObject information = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject rrv_infos = rrv_relations_info();
            SubLObject cdolist_list_var = rrv_infos;
            SubLObject rrv_info = NIL;
            for (rrv_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rrv_info = cdolist_list_var.first()) {
                {
                    SubLObject relation = rrv_info.first();
                    dictionary.dictionary_enter(information, relation, rrv_info);
                }
            }
            return information;
        }
    }

    public static final SubLObject convert_arg_constraints_to_rrv_permitted(SubLObject arg_constraints) {
        {
            SubLObject constraints = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = arg_constraints;
            SubLObject arg_constraint = NIL;
            for (arg_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_constraint = cdolist_list_var.first()) {
                {
                    SubLObject converted = clamp_collection_to_rrv_permitted(arg_constraint, UNPROVIDED);
                    if (NIL == converted) {
                        Errors.warn($str_alt24$Failed_to_convert_argument_constr, arg_constraint);
                    }
                    set_utilities.set_add_all(converted, constraints);
                }
            }
            return set.set_element_list(constraints);
        }
    }

    /**
     * A list of the predicates to select from based on the node-type of the node.
     */
    // deflexical
    private static final SubLSymbol $model_editor_node_labeling_predicate_choices$ = makeSymbol("*MODEL-EDITOR-NODE-LABELING-PREDICATE-CHOICES*");

    public static final SubLObject choose_model_editor_node_labeling_predicate_from_type(SubLObject node_type, SubLObject v_hlmt) {
        {
            SubLObject cdolist_list_var = $model_editor_node_labeling_predicate_choices$.getGlobalValue();
            SubLObject choice = NIL;
            for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                {
                    SubLObject datum = choice;
                    SubLObject current = datum;
                    SubLObject collection = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    collection = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    predicate = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != genls.genlsP(node_type, collection, v_hlmt, UNPROVIDED)) {
                            return predicate;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt26);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject choose_model_editor_node_labeling_predicate_from_node(SubLObject node, SubLObject v_hlmt) {
        {
            SubLObject cdolist_list_var = $model_editor_node_labeling_predicate_choices$.getGlobalValue();
            SubLObject choice = NIL;
            for (choice = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , choice = cdolist_list_var.first()) {
                {
                    SubLObject datum = choice;
                    SubLObject current = datum;
                    SubLObject collection = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    collection = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    predicate = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != isa.isaP(node, collection, v_hlmt, UNPROVIDED)) {
                            return predicate;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt26);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject get_url_for_elmt(SubLObject elmt) {
        return ask_utilities.query_variable($URL, listS($$and, list($$contextOfPCW, $sym31$_CONTEXT, elmt), $list_alt32), elmt, $list_alt33).first();
    }

    /**
     * This is the API that retrieves the textual supports in the style of NWU
     * justifications.
     *
     * @return LISTP of tuples of the form (CYCL-SENTENCE-P DOC# SENTENCE#)
     */
    public static final SubLObject get_document_supports_for_assertions_in_elmt(SubLObject elmt) {
        return ask_utilities.query_template($list_alt35, list($$assertedSentence, list($const37$corroboratingSourcesForPropositio, $list_alt38, listS($$ist, elmt, $list_alt40))), elmt, $list_alt41);
    }

    /**
     * Get the information we have about the NU rule learner.
     *
     * @return LISTP of tuples of the form (RULE-NAT PROBABILITY URL-STRING CONFIDENCE)
     */
    public static final SubLObject get_all_known_nu_rule_properties(SubLObject elmt) {
        if (elmt == UNPROVIDED) {
            elmt = $$InferencePSC;
        }
        return get_some_known_nu_rule_properties($sym43$_RULE_NAT, elmt);
    }

    /**
     * Get the information we have about a specific the NU rule learner rule.
     * Rule-NAT
     *
     * @return LISTP of tuples of the form (RULE-NAT PROBABILITY URL-STRING CONFIDENCE)
     */
    public static final SubLObject get_some_known_nu_rule_properties(SubLObject rule_nat, SubLObject elmt) {
        if (rule_nat == UNPROVIDED) {
            rule_nat = $sym43$_RULE_NAT;
        }
        if (elmt == UNPROVIDED) {
            elmt = $$InferencePSC;
        }
        {
            SubLObject query_sentence = $list_alt45;
            if (NIL == cycl_variables.el_varP(rule_nat)) {
                query_sentence = el_utilities.make_binary_formula($$and, list($$equalSymbols, $sym43$_RULE_NAT, rule_nat), query_sentence);
            }
            return Mapping.mapcar(NU_RULE_REFORMULATE_URL_EXPRESSION_PRESERVING_PROPERTIES, ask_utilities.query_template($list_alt48, query_sentence, elmt, $list_alt49));
        }
    }

    public static final SubLObject nu_rule_reformulate_url_expression_preserving_properties(SubLObject tuple) {
        {
            SubLObject datum = tuple;
            SubLObject current = datum;
            SubLObject rule_nat = NIL;
            SubLObject probability = NIL;
            SubLObject url_expression = NIL;
            SubLObject confidence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            rule_nat = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            probability = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            url_expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt50);
            confidence = current.first();
            current = current.rest();
            if (NIL == current) {
                url_expression = nu_rule_extract_url_string_from_url_expression(url_expression);
                return list(rule_nat, probability, url_expression, confidence);
            } else {
                cdestructuring_bind_error(datum, $list_alt50);
            }
        }
        return NIL;
    }

    public static final SubLObject nu_rule_extract_url_string_from_url_expression(SubLObject v_object) {
        if (v_object.isString()) {
            return v_object;
        } else
            if (NIL != narts_high.naut_p(v_object)) {
                {
                    SubLObject datum = v_object;
                    SubLObject current = datum;
                    SubLObject url_functor = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    url_functor = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    string = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return string;
                    } else {
                        cdestructuring_bind_error(datum, $list_alt51);
                    }
                }
            } else {
                return v_object;
            }

        return NIL;
    }

    /**
     * Ask nuRule for actor/role suggestions and for missing sub-scenes for the
     * case under considation.
     *
     * @unknown This expects the top-level graph handle to be passed in.
     * @return VALUES 1 LISTP of role/actor tuples of the form (CycL-SENTENCE RULE-NAT)
     * @return VALUES 2 LISTP of subscene tuples of the form (CycL-SENTENCE RULE-NAT)
     * @return VALUES 3 LISTP of tuples of the form (VIOLATION-CODE (CYCL-SENTENCE RULE-NAT))
    for the raw suggestions that had to be filtered out
     */
    public static final SubLObject get_nu_rule_suggestions_for_case(SubLObject v_case, SubLObject elmt) {
        {
            SubLObject raw_suggestions = ask_utilities.query_template($list_alt53, listS($$augmentCaseViaNURules, list($$ExplicitCaseFn, elmt), $list_alt53), elmt, $list_alt56);
            SubLObject actor_suggestions = NIL;
            SubLObject scene_suggestions = NIL;
            SubLObject filtered = NIL;
            SubLObject cdolist_list_var = raw_suggestions;
            SubLObject raw_suggestion = NIL;
            for (raw_suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , raw_suggestion = cdolist_list_var.first()) {
                {
                    SubLObject datum = raw_suggestion;
                    SubLObject current = datum;
                    SubLObject suggested_sentence = NIL;
                    SubLObject rule_nat = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    suggested_sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    rule_nat = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (el_utilities.formula_length(suggested_sentence, UNPROVIDED).numG(THREE_INTEGER)) {
                            filtered = cons(list($ARTIY_VIOLATION, raw_suggestion), filtered);
                        } else {
                            {
                                SubLObject raw_predicate = cycl_utilities.formula_arg0(suggested_sentence);
                                SubLObject clamped_actor_predicates = NIL;
                                SubLObject clamped_scene_predicates = NIL;
                                if (($$finalKidnappingScene == raw_predicate) && (v_case == cycl_utilities.formula_arg1(suggested_sentence, UNPROVIDED))) {
                                    {
                                        SubLObject event_type = cycl_utilities.formula_arg2(suggested_sentence, UNPROVIDED);
                                        suggested_sentence = el_utilities.make_binary_formula($$lastSubEvents, v_case, el_utilities.make_unary_formula($$SomeFn, event_type));
                                        raw_predicate = cycl_utilities.formula_arg0(suggested_sentence);
                                    }
                                }
                                clamped_actor_predicates = clamp_predicate_to_rrv_permitted(raw_predicate, UNPROVIDED);
                                clamped_scene_predicates = clamp_predicate_to_rrv_scene_permitted(raw_predicate, UNPROVIDED);
                                if ((NIL == clamped_actor_predicates) && (NIL == clamped_scene_predicates)) {
                                    filtered = cons(list($NO_RRV_PREDICATE, raw_suggestion), filtered);
                                } else
                                    if ((NIL != list_utilities.sublisp_boolean(clamped_scene_predicates)) && (NIL != list_utilities.sublisp_boolean(clamped_actor_predicates))) {
                                        Errors.error($str_alt63$Bad_ontologizing______A_is_both_a, raw_predicate);
                                    } else {
                                        {
                                            SubLObject clamped_predicates = (NIL == clamped_actor_predicates) ? ((SubLObject) (clamped_scene_predicates)) : clamped_actor_predicates;
                                            SubLObject type = (NIL == clamped_actor_predicates) ? ((SubLObject) ($SCENE)) : $ACTOR;
                                            SubLObject cdolist_list_var_9 = clamped_predicates;
                                            SubLObject clamped_predicate = NIL;
                                            for (clamped_predicate = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , clamped_predicate = cdolist_list_var_9.first()) {
                                                {
                                                    SubLObject v_arguments = cycl_utilities.formula_args(suggested_sentence, UNPROVIDED);
                                                    SubLObject rrv_sentence = el_utilities.make_formula(clamped_predicate, v_arguments, UNPROVIDED);
                                                    SubLObject clamped_suggestion = list(rrv_sentence, rule_nat);
                                                    SubLObject pcase_var = type;
                                                    if (pcase_var.eql($ACTOR)) {
                                                        actor_suggestions = cons(clamped_suggestion, actor_suggestions);
                                                    } else
                                                        if (pcase_var.eql($SCENE)) {
                                                            scene_suggestions = cons(clamped_suggestion, scene_suggestions);
                                                        } else {
                                                            Errors.error($str_alt66$Unknown_suggestion_type__A_, type);
                                                        }

                                                }
                                            }
                                        }
                                    }

                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
            return values(actor_suggestions, scene_suggestions, filtered);
        }
    }

    public static final SubLObject get_tool_palettes_for_situation_type_in_xml(SubLObject sit_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject palettes = $default_tool_palettes_for_stt_rrv_model_editor$.getGlobalValue();
                SubLObject rrv_information = rrv_relations_information();
                SubLObject result = NIL;
                SubLObject s = NIL;
                try {
                    s = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(s, thread);
                            stt_rrv_generate_tool_palette_xml_header();
                            {
                                SubLObject _prev_bind_0_10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$toolPalettes, NIL, NIL);
                                    {
                                        SubLObject cdolist_list_var = palettes;
                                        SubLObject palette = NIL;
                                        for (palette = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , palette = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = palette;
                                                SubLObject current = datum;
                                                SubLObject allow_other_keys_p = NIL;
                                                SubLObject rest = current;
                                                SubLObject bad = NIL;
                                                SubLObject current_11 = NIL;
                                                for (; NIL != rest;) {
                                                    destructuring_bind_must_consp(rest, datum, $list_alt69);
                                                    current_11 = rest.first();
                                                    rest = rest.rest();
                                                    destructuring_bind_must_consp(rest, datum, $list_alt69);
                                                    if (NIL == member(current_11, $list_alt70, UNPROVIDED, UNPROVIDED)) {
                                                        bad = T;
                                                    }
                                                    if (current_11 == $ALLOW_OTHER_KEYS) {
                                                        allow_other_keys_p = rest.first();
                                                    }
                                                    rest = rest.rest();
                                                }
                                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                    cdestructuring_bind_error(datum, $list_alt69);
                                                }
                                                {
                                                    SubLObject palette_tail = property_list_member($PALETTE, current);
                                                    SubLObject palette_12 = (NIL != palette_tail) ? ((SubLObject) (cadr(palette_tail))) : NIL;
                                                    SubLObject relations_tail = property_list_member($RELATIONS, current);
                                                    SubLObject relations = (NIL != relations_tail) ? ((SubLObject) (cadr(relations_tail))) : NIL;
                                                    SubLObject events_tail = property_list_member($EVENTS, current);
                                                    SubLObject events = (NIL != events_tail) ? ((SubLObject) (cadr(events_tail))) : NIL;
                                                    SubLObject entities_tail = property_list_member($ENTITIES, current);
                                                    SubLObject entities = (NIL != entities_tail) ? ((SubLObject) (cadr(entities_tail))) : NIL;
                                                    SubLObject attributes = list($$$name, palette_12);
                                                    {
                                                        SubLObject _prev_bind_0_13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$toolPalette, attributes, NIL);
                                                            {
                                                                SubLObject _prev_bind_0_15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$relations, NIL, NIL);
                                                                    {
                                                                        SubLObject cdolist_list_var_17 = relations;
                                                                        SubLObject relation = NIL;
                                                                        for (relation = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , relation = cdolist_list_var_17.first()) {
                                                                            {
                                                                                SubLObject rrv_info = dictionary.dictionary_lookup(rrv_information, relation, UNPROVIDED);
                                                                                if (NIL == list_utilities.sublisp_boolean(rrv_info)) {
                                                                                    Errors.error($str_alt79$Relation_map_of_tool_palette_cont, relation);
                                                                                }
                                                                                {
                                                                                    SubLObject datum_18 = rrv_info;
                                                                                    SubLObject current_19 = datum_18;
                                                                                    SubLObject predicate = NIL;
                                                                                    destructuring_bind_must_consp(current_19, datum_18, $list_alt80);
                                                                                    predicate = current_19.first();
                                                                                    current_19 = current_19.rest();
                                                                                    {
                                                                                        SubLObject allow_other_keys_p_20 = NIL;
                                                                                        SubLObject rest_21 = current_19;
                                                                                        SubLObject bad_22 = NIL;
                                                                                        SubLObject current_23 = NIL;
                                                                                        for (; NIL != rest_21;) {
                                                                                            destructuring_bind_must_consp(rest_21, datum_18, $list_alt80);
                                                                                            current_23 = rest_21.first();
                                                                                            rest_21 = rest_21.rest();
                                                                                            destructuring_bind_must_consp(rest_21, datum_18, $list_alt80);
                                                                                            if (NIL == member(current_23, $list_alt81, UNPROVIDED, UNPROVIDED)) {
                                                                                                bad_22 = T;
                                                                                            }
                                                                                            if (current_23 == $ALLOW_OTHER_KEYS) {
                                                                                                allow_other_keys_p_20 = rest_21.first();
                                                                                            }
                                                                                            rest_21 = rest_21.rest();
                                                                                        }
                                                                                        if ((NIL != bad_22) && (NIL == allow_other_keys_p_20)) {
                                                                                            cdestructuring_bind_error(datum_18, $list_alt80);
                                                                                        }
                                                                                        {
                                                                                            SubLObject arg1_isa_tail = property_list_member($ARG1_ISA, current_19);
                                                                                            SubLObject arg1_isa = (NIL != arg1_isa_tail) ? ((SubLObject) (cadr(arg1_isa_tail))) : NIL;
                                                                                            SubLObject arg2_isa_tail = property_list_member($ARG2_ISA, current_19);
                                                                                            SubLObject arg2_isa = (NIL != arg2_isa_tail) ? ((SubLObject) (cadr(arg2_isa_tail))) : NIL;
                                                                                            {
                                                                                                SubLObject _prev_bind_0_24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                try {
                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                    xml_utilities.xml_start_tag_internal($$$relation, NIL, NIL);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal($$$rrvPredicate, NIL, NIL);
                                                                                                            stt_rrv_serialize_tool_palette_term(predicate);
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_27, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_26, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    xml_utilities.xml_terpri();
                                                                                                    xml_utilities.xml_end_tag_internal($$$rrvPredicate);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal($$$arg1, NIL, NIL);
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_1_31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                    xml_utilities.xml_start_tag_internal($$$argIsas, NIL, NIL);
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_32 = arg1_isa;
                                                                                                                        SubLObject col = NIL;
                                                                                                                        for (col = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , col = cdolist_list_var_32.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_1_34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                                    xml_utilities.xml_start_tag_internal($$$argIsa, NIL, NIL);
                                                                                                                                    stt_rrv_serialize_tool_palette_term(col);
                                                                                                                                } finally {
                                                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_34, thread);
                                                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_33, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            xml_utilities.xml_terpri();
                                                                                                                            xml_utilities.xml_end_tag_internal($$$argIsa);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_31, thread);
                                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_30, thread);
                                                                                                                }
                                                                                                            }
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            xml_utilities.xml_end_tag_internal($$$argIsas);
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_29, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_28, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    xml_utilities.xml_terpri();
                                                                                                    xml_utilities.xml_end_tag_internal($$$arg1);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_35 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal($$$arg2, NIL, NIL);
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_37 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_1_38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                    xml_utilities.xml_start_tag_internal($$$argIsas, NIL, NIL);
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_39 = arg2_isa;
                                                                                                                        SubLObject col = NIL;
                                                                                                                        for (col = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , col = cdolist_list_var_39.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_40 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_1_41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                                    xml_utilities.xml_start_tag_internal($$$argIsa, NIL, NIL);
                                                                                                                                    stt_rrv_serialize_tool_palette_term(col);
                                                                                                                                } finally {
                                                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_41, thread);
                                                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_40, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            xml_utilities.xml_terpri();
                                                                                                                            xml_utilities.xml_end_tag_internal($$$argIsa);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_38, thread);
                                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_37, thread);
                                                                                                                }
                                                                                                            }
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            xml_utilities.xml_end_tag_internal($$$argIsas);
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_36, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_35, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    xml_utilities.xml_terpri();
                                                                                                    xml_utilities.xml_end_tag_internal($$$arg2);
                                                                                                } finally {
                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_25, thread);
                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_24, thread);
                                                                                                }
                                                                                            }
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal($$$relation);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_16, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_15, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$relations);
                                                            {
                                                                SubLObject _prev_bind_0_42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$eventTypes, NIL, NIL);
                                                                    {
                                                                        SubLObject cdolist_list_var_44 = events;
                                                                        SubLObject event = NIL;
                                                                        for (event = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , event = cdolist_list_var_44.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_45 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$eventType, NIL, NIL);
                                                                                    stt_rrv_serialize_tool_palette_term(event);
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_46, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_45, thread);
                                                                                }
                                                                            }
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$eventType);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_43, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_42, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$eventTypes);
                                                            {
                                                                SubLObject _prev_bind_0_47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$entityGroups, NIL, NIL);
                                                                    {
                                                                        SubLObject cdolist_list_var_49 = entities;
                                                                        SubLObject entity = NIL;
                                                                        for (entity = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , entity = cdolist_list_var_49.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$entityGroup, NIL, NIL);
                                                                                    stt_rrv_serialize_tool_palette_term(entity);
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_51, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_50, thread);
                                                                                }
                                                                            }
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$entityGroup);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_48, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_47, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$entityGroups);
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_14, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_13, thread);
                                                        }
                                                    }
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$toolPalette);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$toolPalettes);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    result = get_output_stream_string(s);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(s, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject stt_rrv_serialize_tool_palette_term(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$term, NIL, NIL);
                    cycml.cycml_serialize_term(v_term);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$term);
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$rendering, NIL, NIL);
                    write_string(kb_paths.fort_name(v_term), xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$rendering);
            return v_term;
        }
    }

    public static final SubLObject stt_rrv_generate_tool_palette_xml_header() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            xml_utilities.generate_valid_xml_header(xml_vars.$xml_stream$.getDynamicValue(thread));
            xml_utilities.generate_xml_header_entry_for_dtd($$$toolPalettes, $str_alt94$toolPalettes_dtd, xml_vars.$xml_stream$.getDynamicValue(thread));
            return xml_utilities.xml_terpri();
        }
    }

    // deflexical
    private static final SubLSymbol $default_tool_palettes_for_stt_rrv_model_editor$ = makeSymbol("*DEFAULT-TOOL-PALETTES-FOR-STT-RRV-MODEL-EDITOR*");

    public static final SubLObject declare_stt_rrv_model_editor_file() {
        declareFunction("get_script_ancestor_relationships", "GET-SCRIPT-ANCESTOR-RELATIONSHIPS", 0, 0, false);
        declareFunction("get_script_node_isas", "GET-SCRIPT-NODE-ISAS", 1, 1, false);
        declareFunction("clamp_collection_to_rrv_permitted", "CLAMP-COLLECTION-TO-RRV-PERMITTED", 1, 1, false);
        declareFunction("clamp_predicate_to_rrv_permitted", "CLAMP-PREDICATE-TO-RRV-PERMITTED", 1, 1, false);
        declareFunction("clamp_predicate_to_rrv_scene_permitted", "CLAMP-PREDICATE-TO-RRV-SCENE-PERMITTED", 1, 1, false);
        declareFunction("clamp_predicate_to_rrv_predicates", "CLAMP-PREDICATE-TO-RRV-PREDICATES", 2, 1, false);
        declareFunction("model_editor_create_edge", "MODEL-EDITOR-CREATE-EDGE", 4, 0, false);
        declareFunction("model_editor_remove_edge", "MODEL-EDITOR-REMOVE-EDGE", 4, 0, false);
        declareFunction("model_editor_edit_edge", "MODEL-EDITOR-EDIT-EDGE", 5, 1, false);
        declareFunction("model_editor_introduce_node", "MODEL-EDITOR-INTRODUCE-NODE", 3, 1, false);
        declareFunction("model_editor_delete_node", "MODEL-EDITOR-DELETE-NODE", 1, 0, false);
        declareFunction("model_editor_rename_node", "MODEL-EDITOR-RENAME-NODE", 3, 1, false);
        declareFunction("augment_semantic_predicates_excluded_from_lexical_lookup", "AUGMENT-SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP", 2, 0, false);
        declareFunction("model_editor_parse_node", "MODEL-EDITOR-PARSE-NODE", 3, 0, false);
        declareFunction("suggested_mt_for_role_player_assertion", "SUGGESTED-MT-FOR-ROLE-PLAYER-ASSERTION", 1, 0, false);
        declareFunction("rrv_relations_info", "RRV-RELATIONS-INFO", 0, 0, false);
        declareFunction("rrv_relations_information", "RRV-RELATIONS-INFORMATION", 0, 0, false);
        declareFunction("convert_arg_constraints_to_rrv_permitted", "CONVERT-ARG-CONSTRAINTS-TO-RRV-PERMITTED", 1, 0, false);
        declareFunction("choose_model_editor_node_labeling_predicate_from_type", "CHOOSE-MODEL-EDITOR-NODE-LABELING-PREDICATE-FROM-TYPE", 2, 0, false);
        declareFunction("choose_model_editor_node_labeling_predicate_from_node", "CHOOSE-MODEL-EDITOR-NODE-LABELING-PREDICATE-FROM-NODE", 2, 0, false);
        declareFunction("get_url_for_elmt", "GET-URL-FOR-ELMT", 1, 0, false);
        declareFunction("get_document_supports_for_assertions_in_elmt", "GET-DOCUMENT-SUPPORTS-FOR-ASSERTIONS-IN-ELMT", 1, 0, false);
        declareFunction("get_all_known_nu_rule_properties", "GET-ALL-KNOWN-NU-RULE-PROPERTIES", 0, 1, false);
        declareFunction("get_some_known_nu_rule_properties", "GET-SOME-KNOWN-NU-RULE-PROPERTIES", 0, 2, false);
        declareFunction("nu_rule_reformulate_url_expression_preserving_properties", "NU-RULE-REFORMULATE-URL-EXPRESSION-PRESERVING-PROPERTIES", 1, 0, false);
        declareFunction("nu_rule_extract_url_string_from_url_expression", "NU-RULE-EXTRACT-URL-STRING-FROM-URL-EXPRESSION", 1, 0, false);
        declareFunction("get_nu_rule_suggestions_for_case", "GET-NU-RULE-SUGGESTIONS-FOR-CASE", 2, 0, false);
        declareFunction("get_tool_palettes_for_situation_type_in_xml", "GET-TOOL-PALETTES-FOR-SITUATION-TYPE-IN-XML", 1, 0, false);
        declareFunction("stt_rrv_serialize_tool_palette_term", "STT-RRV-SERIALIZE-TOOL-PALETTE-TERM", 1, 0, false);
        declareFunction("stt_rrv_generate_tool_palette_xml_header", "STT-RRV-GENERATE-TOOL-PALETTE-XML-HEADER", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_stt_rrv_model_editor_file() {
        deflexical("*SITUATION-TYPE-LEVEL-RELATIONS*", $$SituationTypeRelation);
        deflexical("*STT-RRV-SCRIPT-EDIT-MT*", script_instance_editor_api.$script_instance_editor_mt$.getDynamicValue());
        deflexical("*STT-RRV-ENTITY-TYPES*", $list_alt1);
        deflexical("*MODEL-EDITOR-DEFAULT-NODE-PREFIX*", $str_alt8$MENode_);
        deflexical("*NEEDED-MODEL-EDITOR-LEXICAL-PREDICATES*", $list_alt15);
        deflexical("*AUGMENTED-SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*", augment_semantic_predicates_excluded_from_lexical_lookup(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(), $needed_model_editor_lexical_predicates$.getGlobalValue()));
        deflexical("*MODEL-EDITOR-NODE-LABELING-PREDICATE-CHOICES*", $list_alt25);
        deflexical("*DEFAULT-TOOL-PALETTES-FOR-STT-RRV-MODEL-EDITOR*", list($list_alt95, list($PALETTE, $$$Kidnappings, $RELATIONS, script_instance_editor_api.$role_player_instance_level_relations$.getDynamicValue(), $EVENTS, $list_alt97, $ENTITIES, $stt_rrv_entity_types$.getGlobalValue())));
        return NIL;
    }

    public static final SubLObject setup_stt_rrv_model_editor_file() {
                access_macros.register_external_symbol(GET_SCRIPT_ANCESTOR_RELATIONSHIPS);
        access_macros.register_external_symbol(GET_SCRIPT_NODE_ISAS);
        access_macros.register_external_symbol(MODEL_EDITOR_CREATE_EDGE);
        access_macros.register_external_symbol(MODEL_EDITOR_REMOVE_EDGE);
        access_macros.register_external_symbol(MODEL_EDITOR_EDIT_EDGE);
        access_macros.register_external_symbol(MODEL_EDITOR_INTRODUCE_NODE);
        access_macros.register_external_symbol(MODEL_EDITOR_DELETE_NODE);
        access_macros.register_external_symbol(MODEL_EDITOR_RENAME_NODE);
        access_macros.register_external_symbol(MODEL_EDITOR_PARSE_NODE);
        access_macros.register_external_symbol(SUGGESTED_MT_FOR_ROLE_PLAYER_ASSERTION);
        access_macros.register_external_symbol(RRV_RELATIONS_INFO);
        access_macros.register_external_symbol(GET_URL_FOR_ELMT);
        access_macros.register_external_symbol(GET_DOCUMENT_SUPPORTS_FOR_ASSERTIONS_IN_ELMT);
        access_macros.register_external_symbol(GET_ALL_KNOWN_NU_RULE_PROPERTIES);
        access_macros.register_external_symbol(GET_SOME_KNOWN_NU_RULE_PROPERTIES);
        access_macros.register_external_symbol(GET_NU_RULE_SUGGESTIONS_FOR_CASE);
        access_macros.register_external_symbol(GET_TOOL_PALETTES_FOR_SITUATION_TYPE_IN_XML);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$SituationTypeRelation = constant_handles.reader_make_constant_shell(makeString("SituationTypeRelation"));

    static private final SubLList $list_alt1 = list(constant_handles.reader_make_constant_shell(makeString("Person")), constant_handles.reader_make_constant_shell(makeString("CalendarDay")), constant_handles.reader_make_constant_shell(makeString("Organization")), constant_handles.reader_make_constant_shell(makeString("GeographicalRegion")), constant_handles.reader_make_constant_shell(makeString("Event")), constant_handles.reader_make_constant_shell(makeString("Agreement")), constant_handles.reader_make_constant_shell(makeString("MonetaryValue")));

    private static final SubLSymbol GET_SCRIPT_ANCESTOR_RELATIONSHIPS = makeSymbol("GET-SCRIPT-ANCESTOR-RELATIONSHIPS");

    private static final SubLSymbol GET_SCRIPT_NODE_ISAS = makeSymbol("GET-SCRIPT-NODE-ISAS");

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol MODEL_EDITOR_CREATE_EDGE = makeSymbol("MODEL-EDITOR-CREATE-EDGE");

    private static final SubLSymbol MODEL_EDITOR_REMOVE_EDGE = makeSymbol("MODEL-EDITOR-REMOVE-EDGE");

    private static final SubLSymbol MODEL_EDITOR_EDIT_EDGE = makeSymbol("MODEL-EDITOR-EDIT-EDGE");

    static private final SubLString $str_alt8$MENode_ = makeString("MENode-");

    private static final SubLSymbol MODEL_EDITOR_INTRODUCE_NODE = makeSymbol("MODEL-EDITOR-INTRODUCE-NODE");

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol MODEL_EDITOR_DELETE_NODE = makeSymbol("MODEL-EDITOR-DELETE-NODE");

    private static final SubLSymbol MODEL_EDITOR_RENAME_NODE = makeSymbol("MODEL-EDITOR-RENAME-NODE");

    static private final SubLSymbol $sym14$_OLD_LABEL = makeSymbol("?OLD-LABEL");

    static private final SubLList $list_alt15 = list(constant_handles.reader_make_constant_shell(makeString("familyName")), constant_handles.reader_make_constant_shell(makeString("lastName")), constant_handles.reader_make_constant_shell(makeString("preferredNameString")));

    private static final SubLSymbol MODEL_EDITOR_PARSE_NODE = makeSymbol("MODEL-EDITOR-PARSE-NODE");

    static private final SubLList $list_alt17 = list(makeSymbol("TRASH"), makeSymbol("FORT"));

    static private final SubLList $list_alt18 = list(makeSymbol("STRING"), makeSymbol("REMAINDER"));

    private static final SubLSymbol SUGGESTED_MT_FOR_ROLE_PLAYER_ASSERTION = makeSymbol("SUGGESTED-MT-FOR-ROLE-PLAYER-ASSERTION");



    private static final SubLSymbol RRV_RELATIONS_INFO = makeSymbol("RRV-RELATIONS-INFO");

    private static final SubLSymbol $ARG1_ISA = makeKeyword("ARG1-ISA");

    private static final SubLSymbol $ARG2_ISA = makeKeyword("ARG2-ISA");

    static private final SubLString $str_alt24$Failed_to_convert_argument_constr = makeString("Failed to convert argument constraint ~A to an RRV-permitted one.");

    static private final SubLList $list_alt25 = list(list(constant_handles.reader_make_constant_shell(makeString("Event")), constant_handles.reader_make_constant_shell(makeString("definiteDescriptions"))), list(constant_handles.reader_make_constant_shell(makeString("Thing")), constant_handles.reader_make_constant_shell(makeString("nameString"))));

    static private final SubLList $list_alt26 = list(makeSymbol("COLLECTION"), makeSymbol("PREDICATE"));

    private static final SubLSymbol GET_URL_FOR_ELMT = makeSymbol("GET-URL-FOR-ELMT");



    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$contextOfPCW = constant_handles.reader_make_constant_shell(makeString("contextOfPCW"));

    static private final SubLSymbol $sym31$_CONTEXT = makeSymbol("?CONTEXT");

    static private final SubLList $list_alt32 = list(list(constant_handles.reader_make_constant_shell(makeString("urlOfCW")), makeSymbol("?CONTEXT"), list(constant_handles.reader_make_constant_shell(makeString("URLFn")), makeKeyword("URL"))));

    static private final SubLList $list_alt33 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol GET_DOCUMENT_SUPPORTS_FOR_ASSERTIONS_IN_ELMT = makeSymbol("GET-DOCUMENT-SUPPORTS-FOR-ASSERTIONS-IN-ELMT");

    static private final SubLList $list_alt35 = list(makeSymbol("?SENTENCE"), makeSymbol("?DOC-NUM"), makeSymbol("?SENTENCE-NUM"));

    public static final SubLObject $$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));

    public static final SubLObject $const37$corroboratingSourcesForPropositio = constant_handles.reader_make_constant_shell(makeString("corroboratingSourcesForProposition"));

    static private final SubLList $list_alt38 = list(constant_handles.reader_make_constant_shell(makeString("DocumentSentenceFn")), list(constant_handles.reader_make_constant_shell(makeString("CorpusDocumentFn")), constant_handles.reader_make_constant_shell(makeString("STT-RSSFeeds-Corpus")), list(constant_handles.reader_make_constant_shell(makeString("DocumentNumberFn")), makeSymbol("?DOC-NUM"))), list(constant_handles.reader_make_constant_shell(makeString("SentenceNumberFn")), makeSymbol("?SENTENCE-NUM")));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    static private final SubLList $list_alt40 = list(makeSymbol("?SENTENCE"));

    static private final SubLList $list_alt41 = list(makeKeyword("MAX-NUMBER"), NIL);

    private static final SubLSymbol GET_ALL_KNOWN_NU_RULE_PROPERTIES = makeSymbol("GET-ALL-KNOWN-NU-RULE-PROPERTIES");

    static private final SubLSymbol $sym43$_RULE_NAT = makeSymbol("?RULE-NAT");

    private static final SubLSymbol GET_SOME_KNOWN_NU_RULE_PROPERTIES = makeSymbol("GET-SOME-KNOWN-NU-RULE-PROPERTIES");

    static private final SubLList $list_alt45 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("nuRuleProbability")), makeSymbol("?RULE-NAT"), makeSymbol("?PROBABILITY")), list(constant_handles.reader_make_constant_shell(makeString("nuRuleConfidence")), makeSymbol("?RULE-NAT"), makeSymbol("?CONFIDENCE")), list(constant_handles.reader_make_constant_shell(makeString("nuRuleViewerURL")), makeSymbol("?RULE-NAT"), makeSymbol("?URL-EXPRESSION")));

    public static final SubLObject $$equalSymbols = constant_handles.reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLSymbol NU_RULE_REFORMULATE_URL_EXPRESSION_PRESERVING_PROPERTIES = makeSymbol("NU-RULE-REFORMULATE-URL-EXPRESSION-PRESERVING-PROPERTIES");

    static private final SubLList $list_alt48 = list(makeSymbol("?RULE-NAT"), makeSymbol("?PROBABILITY"), makeSymbol("?URL-EXPRESSION"), makeSymbol("?CONFIDENCE"));

    static private final SubLList $list_alt49 = list(makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL);

    static private final SubLList $list_alt50 = list(makeSymbol("RULE-NAT"), makeSymbol("PROBABILITY"), makeSymbol("URL-EXPRESSION"), makeSymbol("CONFIDENCE"));

    static private final SubLList $list_alt51 = list(makeSymbol("URL-FUNCTOR"), makeSymbol("STRING"));

    private static final SubLSymbol GET_NU_RULE_SUGGESTIONS_FOR_CASE = makeSymbol("GET-NU-RULE-SUGGESTIONS-FOR-CASE");

    static private final SubLList $list_alt53 = list(makeSymbol("?SENTENCE"), makeSymbol("?RULE-NAT"));

    public static final SubLObject $$augmentCaseViaNURules = constant_handles.reader_make_constant_shell(makeString("augmentCaseViaNURules"));

    public static final SubLObject $$ExplicitCaseFn = constant_handles.reader_make_constant_shell(makeString("ExplicitCaseFn"));

    static private final SubLList $list_alt56 = list(makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-NUMBER"), NIL);

    static private final SubLList $list_alt57 = list(makeSymbol("SUGGESTED-SENTENCE"), makeSymbol("RULE-NAT"));

    private static final SubLSymbol $ARTIY_VIOLATION = makeKeyword("ARTIY-VIOLATION");

    public static final SubLObject $$finalKidnappingScene = constant_handles.reader_make_constant_shell(makeString("finalKidnappingScene"));

    public static final SubLObject $$lastSubEvents = constant_handles.reader_make_constant_shell(makeString("lastSubEvents"));

    public static final SubLObject $$SomeFn = constant_handles.reader_make_constant_shell(makeString("SomeFn"));

    private static final SubLSymbol $NO_RRV_PREDICATE = makeKeyword("NO-RRV-PREDICATE");

    static private final SubLString $str_alt63$Bad_ontologizing______A_is_both_a = makeString("Bad ontologizing ... ~A is both a scene and an actor predicate?");





    static private final SubLString $str_alt66$Unknown_suggestion_type__A_ = makeString("Unknown suggestion type ~A.");

    private static final SubLSymbol GET_TOOL_PALETTES_FOR_SITUATION_TYPE_IN_XML = makeSymbol("GET-TOOL-PALETTES-FOR-SITUATION-TYPE-IN-XML");

    static private final SubLString $$$toolPalettes = makeString("toolPalettes");

    static private final SubLList $list_alt69 = list(makeSymbol("&KEY"), makeSymbol("PALETTE"), makeSymbol("RELATIONS"), makeSymbol("EVENTS"), makeSymbol("ENTITIES"));

    static private final SubLList $list_alt70 = list(makeKeyword("PALETTE"), makeKeyword("RELATIONS"), makeKeyword("EVENTS"), makeKeyword("ENTITIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $PALETTE = makeKeyword("PALETTE");

    private static final SubLSymbol $RELATIONS = makeKeyword("RELATIONS");



    private static final SubLSymbol $ENTITIES = makeKeyword("ENTITIES");

    static private final SubLString $$$name = makeString("name");

    static private final SubLString $$$toolPalette = makeString("toolPalette");

    static private final SubLString $$$relations = makeString("relations");

    static private final SubLString $str_alt79$Relation_map_of_tool_palette_cont = makeString("Relation map of tool palette contains a non-RRV relation ~A.");

    static private final SubLList $list_alt80 = list(makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("ARG1-ISA"), makeSymbol("ARG2-ISA"));

    static private final SubLList $list_alt81 = list(makeKeyword("ARG1-ISA"), makeKeyword("ARG2-ISA"));

    static private final SubLString $$$relation = makeString("relation");

    static private final SubLString $$$rrvPredicate = makeString("rrvPredicate");

    static private final SubLString $$$arg1 = makeString("arg1");

    static private final SubLString $$$argIsas = makeString("argIsas");

    static private final SubLString $$$argIsa = makeString("argIsa");

    static private final SubLString $$$arg2 = makeString("arg2");

    static private final SubLString $$$eventTypes = makeString("eventTypes");

    static private final SubLString $$$eventType = makeString("eventType");

    static private final SubLString $$$entityGroups = makeString("entityGroups");

    static private final SubLString $$$entityGroup = makeString("entityGroup");

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $$$rendering = makeString("rendering");

    static private final SubLString $str_alt94$toolPalettes_dtd = makeString("toolPalettes.dtd");

    static private final SubLList $list_alt95 = list(makeKeyword("PALETTE"), makeString("Generic"), makeKeyword("RELATIONS"), list(constant_handles.reader_make_constant_shell(makeString("eventOccursAt")), constant_handles.reader_make_constant_shell(makeString("dateOfEvent"))), makeKeyword("EVENTS"), NIL, makeKeyword("ENTITIES"), list(constant_handles.reader_make_constant_shell(makeString("Date")), constant_handles.reader_make_constant_shell(makeString("GeographicalRegion"))));

    static private final SubLString $$$Kidnappings = makeString("Kidnappings");

    static private final SubLList $list_alt97 = list(constant_handles.reader_make_constant_shell(makeString("KidnappingSomeone")), constant_handles.reader_make_constant_shell(makeString("HoldingHostage")), constant_handles.reader_make_constant_shell(makeString("HostileSeizure")), constant_handles.reader_make_constant_shell(makeString("DemandingARansom")), constant_handles.reader_make_constant_shell(makeString("ReleasingAPrisoner")), constant_handles.reader_make_constant_shell(makeString("NewsConference")));

    // // Initializers
    public void declareFunctions() {
        declare_stt_rrv_model_editor_file();
    }

    public void initializeVariables() {
        init_stt_rrv_model_editor_file();
    }

    public void runTopLevelForms() {
        setup_stt_rrv_model_editor_file();
    }
}

