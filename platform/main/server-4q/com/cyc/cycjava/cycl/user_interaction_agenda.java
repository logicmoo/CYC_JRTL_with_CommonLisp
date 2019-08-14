/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.rtp.rtp_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      USER-INTERACTION-AGENDA
 * source file: /cyc/top/cycl/user-interaction-agenda.lisp
 * created:     2019/07/03 17:37:56
 */
public final class user_interaction_agenda extends SubLTranslatedFile implements V12 {
    /**
     * Entry point for switching support.
     */
    @LispMethod(comment = "Entry point for switching support.")
    public static final SubLObject uimma_resolve_meta_agenda_id(SubLObject meta_agenda_id) {
        return uimma_find_by_id(meta_agenda_id);
    }

    /**
     * Return a list of mt -> uia tuples, and the list of unmatched Mts as
     * the second return value.
     */
    @LispMethod(comment = "Return a list of mt -> uia tuples, and the list of unmatched Mts as\r\nthe second return value.\nReturn a list of mt -> uia tuples, and the list of unmatched Mts as\nthe second return value.")
    public static final SubLObject uimma_match_mts_to_agendas(SubLObject mts, SubLObject user) {
        if (user == UNPROVIDED) {
            user = NIL;
        }
        {
            SubLObject matched = NIL;
            SubLObject unmatched = NIL;
            SubLObject idx = system_uimma();
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject uima = NIL;
                    while (NIL != id) {
                        uima = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, uima, $SKIP)) {
                            if (!((NIL != forts.fort_p(user)) && (user != uia_setup_state.uima_user(uima)))) {
                                {
                                    SubLObject cdolist_list_var = mts;
                                    SubLObject mt = NIL;
                                    for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                        {
                                            SubLObject uia = uima_match_mt_to_agenda(uima, mt);
                                            if (NIL != user_interaction_agenda_p(uia)) {
                                                matched = cons(cons(mt, uia), matched);
                                            } else {
                                                unmatched = cons(mt, unmatched);
                                            }
                                        }
                                    }
                                }
                                mts = unmatched;
                                unmatched = NIL;
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return values(matched, mts);
        }
    }

    /**
     * Return a UIMA which already exists for use in interacting with USER, or NIL if none.
     */
    @LispMethod(comment = "Return a UIMA which already exists for use in interacting with USER, or NIL if none.")
    public static final SubLObject uimma_find_by_user(SubLObject user) {
        SubLTrampolineFile.checkType(user, FORT_P);
        {
            SubLObject v_answer = NIL;
            SubLObject idx = system_uimma();
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject uima = NIL;
                    while ((NIL != id) && (NIL == v_answer)) {
                        uima = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, uima, $SKIP)) {
                            if (user == uia_setup_state.uima_user(uima)) {
                                v_answer = uima;
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return v_answer;
        }
    }

    public static final SubLObject uia_treat_comments_as_mumbling(SubLObject v_agenda) {
        if (NIL != uia_can_treat_comments_as_mumblingP()) {
            {
                SubLObject lock = $uia_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    while (NIL == queues.queue_empty_p(uia_comments(v_agenda))) {
                        {
                            SubLObject comment = queues.dequeue(uia_comments(v_agenda));
                            uia_convert_comment_to_mumble(v_agenda, comment);
                        }
                    } 
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_give_current_topic_and_name(SubLObject v_agenda) {
        {
            SubLObject topic = uia_setup_state.uia_topic(v_agenda);
            SubLObject topic_name = NIL;
            if (($UNDETERMINED == topic) || (NIL == uia_setup_state.uia_setup_completeP(v_agenda))) {
                return values(topic, $$$undetermined);
            }
            {
                SubLObject better_topic = uia_determine_superior_topic_identification(v_agenda);
                if (NIL != better_topic) {
                    topic = better_topic;
                }
            }
            topic_name = uia_trampolines.uia_html_term_phrase_np(v_agenda, topic, UNPROVIDED, UNPROVIDED);
            return values(topic, topic_name);
        }
    }

    public static final SubLObject uia_generate_request(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject operator = (NIL != user_interaction_p(interaction)) ? ((SubLObject) (ui_operator(interaction))) : uia_default_operator(v_agenda);
            SubLObject method = uia_tool_declaration.ui_operator_generate_request_method(operator);
            if (method.isFunctionSpec()) {
                return funcall(method, interaction);
            } else {
                return make_invalid_ui_request();
            }
        }
    }

    public static final SubLObject uia_generate_next_request(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = uia_next_action(v_agenda);
                SubLObject request = NIL;
                {
                    SubLObject _prev_bind_0 = $uia_generate_next_request_nesting_depth$.currentBinding(thread);
                    try {
                        $uia_generate_next_request_nesting_depth$.bind(number_utilities.f_1X($uia_generate_next_request_nesting_depth$.getDynamicValue(thread)), thread);
                        if ($uia_generate_next_request_nesting_depth$.getDynamicValue(thread).numG($uia_generate_next_request_max_nesting_depth$.getGlobalValue())) {
                            uia_mumbler.uia_mumble(v_agenda, $str_alt233$Exceeded_maximum_nesting_depth_fo);
                            uia_act_invalidate(v_agenda, interaction);
                        }
                        request = uia_generate_request(v_agenda, interaction);
                    } finally {
                        $uia_generate_next_request_nesting_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return request;
            }
        }
    }

    public static final SubLObject uia_convert_comment_to_mumble(SubLObject v_agenda, SubLObject comment) {
        {
            SubLObject datum = ui_args(comment);
            SubLObject current = datum;
            SubLObject message = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt110);
            message = current.first();
            current = current.rest();
            if (NIL == current) {
                uia_mumbler.uia_mumble(v_agenda, message);
            } else {
                cdestructuring_bind_error(datum, $list_alt110);
            }
        }
        return v_agenda;
    }

    /**
     * Within AGENDA, reject all children of INTERACTION.
     */
    @LispMethod(comment = "Within AGENDA, reject all children of INTERACTION.")
    public static final SubLObject uia_act_reject_all_children(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject children = ui_child_interactions(interaction);
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                uia_act_reject(v_agenda, child);
            }
        }
        return interaction;
    }

    /**
     * Within AGENDA, reject all interactions that are currently blocked or pending.
     */
    @LispMethod(comment = "Within AGENDA, reject all interactions that are currently blocked or pending.")
    public static final SubLObject uia_act_reject_all(SubLObject v_agenda) {
        {
            SubLObject interactions = uia_interaction_sequence(v_agenda);
            SubLObject cdolist_list_var = interactions;
            SubLObject interaction = NIL;
            for (interaction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = ui_status(interaction);
                    if (pcase_var.eql($PENDING) || pcase_var.eql($BLOCKED)) {
                        uia_act_reject(v_agenda, interaction);
                    }
                }
            }
        }
        return v_agenda;
    }

    /**
     * Within AGENDA, note that the user has decided not to perform INTERACTION.
     */
    @LispMethod(comment = "Within AGENDA, note that the user has decided not to perform INTERACTION.")
    public static final SubLObject uia_act_reject(SubLObject v_agenda, SubLObject interaction) {
        if (NIL != ui_alive_p(interaction)) {
            ui_note_status(interaction, $REJECTED);
            uia_act_finish(v_agenda, interaction);
            {
                SubLObject children = ui_child_interactions(interaction);
                SubLObject cdolist_list_var = children;
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    uia_act_reject(v_agenda, child);
                }
            }
            {
                SubLObject parent = ui_parent_interaction(interaction);
                if (NIL != parent) {
                    uia_act_propagate_child_rejected(v_agenda, parent, interaction);
                }
            }
        }
        return interaction;
    }

    /**
     * Within AGENDA, inform PARENT that the user has decided not to perform CHILD.
     */
    @LispMethod(comment = "Within AGENDA, inform PARENT that the user has decided not to perform CHILD.")
    public static final SubLObject uia_act_propagate_child_rejected(SubLObject v_agenda, SubLObject parent, SubLObject child) {
        {
            SubLObject operator = ui_operator(parent);
            SubLObject method = uia_tool_declaration.ui_operator_child_rejected_method(operator);
            if (method.isFunctionSpec()) {
                funcall(method, parent, child);
                ui_recompute_status(parent);
                return parent;
            }
            return uia_act_reject(v_agenda, parent);
        }
    }

    /**
     * Within AGENDA, inform PARENT that Cyc has decided that CHILD is no longer needed.
     */
    @LispMethod(comment = "Within AGENDA, inform PARENT that Cyc has decided that CHILD is no longer needed.")
    public static final SubLObject uia_act_propagate_child_invalidated(SubLObject v_agenda, SubLObject parent, SubLObject child) {
        {
            SubLObject operator = ui_operator(parent);
            SubLObject method = uia_tool_declaration.ui_operator_child_invalidated_method(operator);
            if (method.isFunctionSpec()) {
                funcall(method, parent, child);
                ui_recompute_status(parent);
                return parent;
            }
            return uia_act_invalidate(v_agenda, parent);
        }
    }

    /**
     * Within AGENDA, inform PARENT that its CHILD has completed.
     */
    @LispMethod(comment = "Within AGENDA, inform PARENT that its CHILD has completed.")
    public static final SubLObject uia_act_propagate_child_completed(SubLObject v_agenda, SubLObject parent, SubLObject child) {
        {
            SubLObject operator = ui_operator(parent);
            SubLObject method = uia_tool_declaration.ui_operator_child_completed_method(operator);
            if (method.isFunctionSpec()) {
                funcall(method, parent, child);
            }
        }
        ui_recompute_status(parent);
        return parent;
    }

    /**
     * Add to AGENDA an UNDO of INTERACTION.
     */
    @LispMethod(comment = "Add to AGENDA an UNDO of INTERACTION.")
    public static final SubLObject uia_act_new_undo(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject operator = ui_operator(interaction);
            SubLObject method = uia_tool_declaration.ui_operator_undo_method(operator);
            if (method.isFunctionSpec()) {
                return uia_act_new_interaction(v_agenda, $UNDO, $UNDO, list(interaction), UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Within AGENDA, invalidate all children of INTERACTION.
     */
    @LispMethod(comment = "Within AGENDA, invalidate all children of INTERACTION.")
    public static final SubLObject uia_act_invalidate_all_children(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject children = ui_child_interactions(interaction);
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                uia_act_invalidate(v_agenda, child);
            }
        }
        return interaction;
    }

    /**
     * Within AGENDA, note that Cyc has decided that INTERACTION is no longer needed.
     */
    @LispMethod(comment = "Within AGENDA, note that Cyc has decided that INTERACTION is no longer needed.")
    public static final SubLObject uia_act_invalidate(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject pcase_var = ui_status(interaction);
            if (pcase_var.eql($PENDING) || pcase_var.eql($BLOCKED)) {
                ui_note_status(interaction, $INVALIDATED);
                uia_act_finish(v_agenda, interaction);
                {
                    SubLObject children = ui_child_interactions(interaction);
                    SubLObject cdolist_list_var = children;
                    SubLObject child = NIL;
                    for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                        uia_act_invalidate(v_agenda, child);
                    }
                }
                {
                    SubLObject parent = ui_parent_interaction(interaction);
                    if (NIL != parent) {
                        uia_act_propagate_child_invalidated(v_agenda, parent, interaction);
                    }
                }
            }
        }
        return interaction;
    }

    /**
     * Within AGENDA, note that INTERACTION is now finished.
     */
    @LispMethod(comment = "Within AGENDA, note that INTERACTION is now finished.")
    public static final SubLObject uia_act_finish(SubLObject v_agenda, SubLObject interaction) {
        ui_note_finish_time(interaction, get_universal_time());
        uia_declassify(v_agenda, interaction);
        uia_add_to_history(v_agenda, interaction);
        ui_finalize(interaction);
        return interaction;
    }

    /**
     * Within AGENDA, note that INTERACTION has completed with the given RESULT.
     */
    @LispMethod(comment = "Within AGENDA, note that INTERACTION has completed with the given RESULT.")
    public static final SubLObject uia_act_complete(SubLObject v_agenda, SubLObject interaction, SubLObject result) {
        {
            SubLObject pcase_var = ui_status(interaction);
            if (pcase_var.eql($PENDING) || pcase_var.eql($BLOCKED)) {
                ui_note_result(interaction, result);
                ui_note_status(interaction, $COMPLETED);
                {
                    SubLObject parent = ui_parent_interaction(interaction);
                    if (NIL != parent) {
                        uia_act_propagate_child_completed(v_agenda, parent, interaction);
                    }
                }
                uia_act_finish(v_agenda, interaction);
            }
        }
        return interaction;
    }

    /**
     * Clear all comments in AGENDA.
     */
    @LispMethod(comment = "Clear all comments in AGENDA.")
    public static final SubLObject uia_act_clear_comments(SubLObject v_agenda) {
        return uia_clear_comments(v_agenda);
    }

    public static final SubLObject ui_virtual_parent_interaction(SubLObject interaction) {
        if (NIL == ui_parent_interaction(interaction)) {
            {
                SubLObject v_agenda = ui_agenda(interaction);
                SubLObject operator = ui_operator(interaction);
                if (NIL != uia_tool_declaration.ui_operator_has_feature_p(operator, $CONCEPT_BROWSING)) {
                    if (NIL != uia_tools_basic.uia_within_concept_finderP(v_agenda)) {
                        return uia_tools_basic.uia_concept_finder_peek(v_agenda);
                    }
                } else {
                    if (NIL != uia_tool_declaration.ui_operator_has_feature_p(operator, $SENTENCE_BROWSING)) {
                        if (NIL != uia_tools_basic.uia_within_sentence_finderP(v_agenda)) {
                            return uia_tools_basic.uia_sentence_finder_peek(v_agenda);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ui_virtual_ancestor_interactions(SubLObject interaction) {
        {
            SubLObject virtual_parent = ui_virtual_parent_interaction(interaction);
            if (NIL != virtual_parent) {
                {
                    SubLObject virtual_ancestors = ui_ancestor_interactions(virtual_parent);
                    return append(virtual_ancestors, list(virtual_parent));
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param INTERACTION;
     * 		user-interaction-p or NIL.
     * @return stringp or NIL
     */
    @LispMethod(comment = "@param INTERACTION;\r\n\t\tuser-interaction-p or NIL.\r\n@return stringp or NIL")
    public static final SubLObject ui_hint_string(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject operator = (NIL != user_interaction_p(interaction)) ? ((SubLObject) (ui_operator(interaction))) : uia_default_operator(v_agenda);
            return NIL != cb_uia_tool_declaration.cb_uia_hint_for_operator(operator) ? ((SubLObject) (cb_uia_tool_declaration.cb_uia_hint_for_operator(operator))) : uia_tool_declaration.ui_operator_hint_name(operator);
        }
    }

    /**
     *
     *
     * @param INTERACTION;
     * 		user-interaction-p or NIL.
     * @return function-spec-p
     */
    @LispMethod(comment = "@param INTERACTION;\r\n\t\tuser-interaction-p or NIL.\r\n@return function-spec-p")
    public static final SubLObject ui_hint_method(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject operator = (NIL != user_interaction_p(interaction)) ? ((SubLObject) (ui_operator(interaction))) : uia_default_operator(v_agenda);
            SubLObject method = uia_tool_declaration.ui_operator_hint_method(operator);
            if (method.isFunctionSpec()) {
                return method;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param INTERACTION;
     * 		user-interaction-p or NIL.
     * @return string; a hint of what INTERACTION is all about.
     */
    @LispMethod(comment = "@param INTERACTION;\r\n\t\tuser-interaction-p or NIL.\r\n@return string; a hint of what INTERACTION is all about.")
    public static final SubLObject ui_hint(SubLObject interaction, SubLObject v_agenda) {
        if (v_agenda == UNPROVIDED) {
            v_agenda = NIL;
        }
        {
            SubLObject method = ui_hint_method(v_agenda, interaction);
            SubLObject hint_string = ui_hint_string(v_agenda, interaction);
            SubLObject error_message = NIL;
            SubLObject result = NIL;
            if (method.isFunctionSpec()) {
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                result = funcall(method, interaction);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    result = cconcatenate($str_alt237$Error__, error_message);
                }
            } else {
                if (hint_string.isString()) {
                    result = hint_string;
                } else {
                    if (NIL != user_interaction_p(interaction)) {
                        result = ui_default_hint_method(interaction);
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject ui_help_text_for_tool_section(SubLObject interaction, SubLObject section_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = ui_agenda(interaction);
                SubLObject tool = ui_cycl_tool(interaction);
                SubLObject mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject cycl = listS($$krakenHelpTextForTool, list($$KrakenToolSectionFn, tool, section_keyword), $list_alt241);
                SubLObject result = NIL;
                SubLObject state = uia_memoization_state(v_agenda);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt242$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                result = kraken_help_text_memoized($sym243$_TEXT, cycl, mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject ui_help_text(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = ui_agenda(interaction);
                SubLObject tool = ui_cycl_tool(interaction);
                SubLObject mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject cycl = listS($$krakenHelpTextForTool, tool, $list_alt241);
                SubLObject result = NIL;
                if (NIL != hlmt.hlmt_p(mt)) {
                    {
                        SubLObject state = uia_memoization_state(v_agenda);
                        SubLObject local_state = state;
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    SubLObject original_memoization_process = NIL;
                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                        {
                                            SubLObject current_proc = current_process();
                                            if (NIL == original_memoization_process) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                            } else {
                                                if (original_memoization_process != current_proc) {
                                                    Errors.error($str_alt242$Invalid_attempt_to_reuse_memoizat);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        result = kraken_help_text_memoized($sym243$_TEXT, cycl, mt);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject ui_finalize(SubLObject interaction) {
        {
            SubLObject operator = ui_operator(interaction);
            SubLObject finalize_method = uia_tool_declaration.ui_operator_finalize_method(operator);
            if (NIL != fboundp(finalize_method)) {
                funcall(finalize_method, interaction);
            }
        }
        return interaction;
    }

    public static final SubLObject ui_default_hint_method(SubLObject interaction) {
        {
            SubLObject operator = ui_operator(interaction);
            SubLObject hint = uia_tool_declaration.ui_operator_name(operator);
            if (NIL == operator) {
                Errors.warn($str_alt238$no_hint_for__a, interaction);
                hint = $str_alt239$;
            }
            if (NIL == hint) {
                hint = prin1_to_string(operator);
            }
            return hint;
        }
    }

    /**
     *
     *
     * @return FORT-P or NIL; The CycL term representing the UIA tool handling INTERACTION.
     */
    @LispMethod(comment = "@return FORT-P or NIL; The CycL term representing the UIA tool handling INTERACTION.")
    public static final SubLObject ui_cycl_tool(SubLObject interaction) {
        {
            SubLObject operator = ui_operator(interaction);
            return uia_tool_declaration.ui_operator_cycl(operator);
        }
    }

    public static final SubLObject kraken_help_text_memoized_internal(SubLObject var, SubLObject cycl, SubLObject mt) {
        {
            SubLObject result = ask_utilities.ask_variable(var, cycl, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                return result.first();
            }
        }
        return NIL;
    }

    public static final SubLObject kraken_help_text_memoized(SubLObject var, SubLObject cycl, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return kraken_help_text_memoized_internal(var, cycl, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, KRAKEN_HELP_TEXT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), KRAKEN_HELP_TEXT_MEMOIZED, THREE_INTEGER, NIL, EQUALP, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, KRAKEN_HELP_TEXT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(var, cycl, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw246$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (var.equalp(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (cycl.equalp(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(kraken_help_text_memoized_internal(var, cycl, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, cycl, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject kraken_help_text_for_launcher_section(SubLObject launcher_cycl, SubLObject section_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject cycl = listS($$krakenHelpTextForTool, list($$KrakenToolSectionFn, launcher_cycl, section_keyword), $list_alt241);
                SubLObject result = NIL;
                SubLObject state = uia_memoization_state(v_agenda);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt242$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                result = kraken_help_text_memoized($sym243$_TEXT, cycl, mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject kraken_help_text_for_launcher(SubLObject launcher_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                SubLObject cycl = listS($$krakenHelpTextForTool, launcher_cycl, $list_alt241);
                SubLObject result = NIL;
                SubLObject state = uia_memoization_state(v_agenda);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt242$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                result = kraken_help_text_memoized($sym243$_TEXT, cycl, mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject handle_ui_reply(SubLObject reply) {
        {
            SubLObject operator = reply.first();
            SubLObject method = uia_tool_declaration.ui_operator_handle_reply_method(operator);
            if (method.isFunctionSpec()) {
                return funcall(method, reply);
            } else {
                return NIL;
            }
        }
    }

    static private final SubLString $str_alt239$ = makeString("");

    /**
     * How deep we currently are.
     */
    // defparameter
    @LispMethod(comment = "How deep we currently are.\ndefparameter")
    private static final SubLSymbol $uia_generate_next_request_nesting_depth$ = makeSymbol("*UIA-GENERATE-NEXT-REQUEST-NESTING-DEPTH*");

    /**
     * If we get down further than this, we probably won't get back up.
     */
    // deflexical
    @LispMethod(comment = "If we get down further than this, we probably won\'t get back up.\ndeflexical")
    private static final SubLSymbol $uia_generate_next_request_max_nesting_depth$ = makeSymbol("*UIA-GENERATE-NEXT-REQUEST-MAX-NESTING-DEPTH*");

    public static final class $user_interaction_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$agenda;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$mode;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$status;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$start_time;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$finish_time;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$parent_interaction;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$child_interactions;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$operator;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$args;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$result;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$state;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$agenda = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$mode = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$status = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$start_time = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$finish_time = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$parent_interaction = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$child_interactions = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$operator = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$args = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$result = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.this.$state = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $agenda = Lisp.NIL;

        public SubLObject $mode = Lisp.NIL;

        public SubLObject $status = Lisp.NIL;

        public SubLObject $start_time = Lisp.NIL;

        public SubLObject $finish_time = Lisp.NIL;

        public SubLObject $parent_interaction = Lisp.NIL;

        public SubLObject $child_interactions = Lisp.NIL;

        public SubLObject $operator = Lisp.NIL;

        public SubLObject $args = Lisp.NIL;

        public SubLObject $result = Lisp.NIL;

        public SubLObject $state = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.class, USER_INTERACTION, USER_INTERACTION_P, $list_alt8, $list_alt9, new String[]{ "$id", "$agenda", "$mode", "$status", "$start_time", "$finish_time", "$parent_interaction", "$child_interactions", "$operator", "$args", "$result", "$state" }, $list_alt10, $list_alt11, PRINT_USER_INTERACTION);
    }

    public static final class $user_interaction_meta_agenda_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$isg;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$index;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$open_agendas;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$current_agenda;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$state;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$isg = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$index = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$open_agendas = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$current_agenda = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.this.$state = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $isg = Lisp.NIL;

        public SubLObject $index = Lisp.NIL;

        public SubLObject $open_agendas = Lisp.NIL;

        public SubLObject $current_agenda = Lisp.NIL;

        public SubLObject $state = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.class, USER_INTERACTION_META_AGENDA, USER_INTERACTION_META_AGENDA_P, $list_alt145, $list_alt146, new String[]{ "$id", "$isg", "$index", "$open_agendas", "$current_agenda", "$state" }, $list_alt147, $list_alt148, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $user_interaction_agenda_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$meta_agenda;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$isg;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$index;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$history;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$undos;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$messages;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$requirements;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$relevant_suggestions;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$possible_suggestions;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$comments;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$state;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$meta_agenda = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$isg = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$index = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$history = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$undos = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$messages = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$requirements = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$relevant_suggestions = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$possible_suggestions = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$comments = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.this.$state = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $meta_agenda = Lisp.NIL;

        public SubLObject $isg = Lisp.NIL;

        public SubLObject $index = Lisp.NIL;

        public SubLObject $history = Lisp.NIL;

        public SubLObject $undos = Lisp.NIL;

        public SubLObject $messages = Lisp.NIL;

        public SubLObject $requirements = Lisp.NIL;

        public SubLObject $relevant_suggestions = Lisp.NIL;

        public SubLObject $possible_suggestions = Lisp.NIL;

        public SubLObject $comments = Lisp.NIL;

        public SubLObject $state = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.class, USER_INTERACTION_AGENDA, USER_INTERACTION_AGENDA_P, $list_alt60, $list_alt61, new String[]{ "$id", "$meta_agenda", "$isg", "$index", "$history", "$undos", "$messages", "$requirements", "$relevant_suggestions", "$possible_suggestions", "$comments", "$state" }, $list_alt62, $list_alt63, PRINT_USER_INTERACTION_AGENDA);
    }

    public static final SubLFile me = new user_interaction_agenda();

 public static final String myName = "com.cyc.cycjava.cycl.user_interaction_agenda";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $user_interaction_modes$ = makeSymbol("*USER-INTERACTION-MODES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $user_interaction_statuses$ = makeSymbol("*USER-INTERACTION-STATUSES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_user_interaction$ = makeSymbol("*DTP-USER-INTERACTION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_user_interaction_agenda$ = makeSymbol("*DTP-USER-INTERACTION-AGENDA*");



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_user_interaction_meta_agenda$ = makeSymbol("*DTP-USER-INTERACTION-META-AGENDA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $uia_frameless_environmentP$ = makeSymbol("*UIA-FRAMELESS-ENVIRONMENT?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $invalid_ui_signature$ = makeSymbol("*INVALID-UI-SIGNATURE*");

    // deflexical
    // The canonical invalid ui request
    /**
     * The canonical invalid ui request
     */
    @LispMethod(comment = "The canonical invalid ui request\ndeflexical")
    private static final SubLSymbol $invalid_ui_request$ = makeSymbol("*INVALID-UI-REQUEST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $uia_lock$ = makeSymbol("*UIA-LOCK*");

    static private final SubLString $$$User_Interaction_Agenda_lock = makeString("User Interaction Agenda lock");

    static private final SubLList $list3 = list(makeSymbol("*UIA-LOCK*"));

    static private final SubLList $list4 = list($UNDO, makeKeyword("MESSAGE"), makeKeyword("REQUIRED"), makeKeyword("RELEVANT"), makeKeyword("POSSIBLE"), makeKeyword("COMMENT"));

    static private final SubLList $list5 = list(makeKeyword("BLOCKED"), makeKeyword("PENDING"), makeKeyword("COMPLETED"), makeKeyword("REJECTED"), makeKeyword("INVALIDATED"));

    private static final SubLSymbol USER_INTERACTION = makeSymbol("USER-INTERACTION");

    static private final SubLList $list8 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("AGENDA"), makeSymbol("MODE"), makeSymbol("STATUS"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("PARENT-INTERACTION"), makeSymbol("CHILD-INTERACTIONS"), makeSymbol("OPERATOR"), makeSymbol("ARGS"), makeSymbol("RESULT"), makeSymbol("STATE") });

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("AGENDA"), $MODE, makeKeyword("STATUS"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("PARENT-INTERACTION"), makeKeyword("CHILD-INTERACTIONS"), makeKeyword("OPERATOR"), $ARGS, makeKeyword("RESULT"), makeKeyword("STATE") });

    static private final SubLList $list10 = list(new SubLObject[]{ makeSymbol("UI-ID"), makeSymbol("UI-AGENDA"), makeSymbol("UI-MODE"), makeSymbol("UI-STATUS"), makeSymbol("UI-START-TIME"), makeSymbol("UI-FINISH-TIME"), makeSymbol("UI-PARENT-INTERACTION"), makeSymbol("UI-CHILD-INTERACTIONS"), makeSymbol("UI-OPERATOR"), makeSymbol("UI-ARGS"), makeSymbol("UI-RESULT"), makeSymbol("UI-STATE") });

    static private final SubLList $list11 = list(new SubLObject[]{ makeSymbol("_CSETF-UI-ID"), makeSymbol("_CSETF-UI-AGENDA"), makeSymbol("_CSETF-UI-MODE"), makeSymbol("_CSETF-UI-STATUS"), makeSymbol("_CSETF-UI-START-TIME"), makeSymbol("_CSETF-UI-FINISH-TIME"), makeSymbol("_CSETF-UI-PARENT-INTERACTION"), makeSymbol("_CSETF-UI-CHILD-INTERACTIONS"), makeSymbol("_CSETF-UI-OPERATOR"), makeSymbol("_CSETF-UI-ARGS"), makeSymbol("_CSETF-UI-RESULT"), makeSymbol("_CSETF-UI-STATE") });

    private static final SubLSymbol PRINT_USER_INTERACTION = makeSymbol("PRINT-USER-INTERACTION");

    private static final SubLSymbol USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-INTERACTION-P"));

    private static final SubLSymbol _CSETF_UI_ID = makeSymbol("_CSETF-UI-ID");

    private static final SubLSymbol _CSETF_UI_AGENDA = makeSymbol("_CSETF-UI-AGENDA");

    private static final SubLSymbol UI_MODE = makeSymbol("UI-MODE");

    private static final SubLSymbol _CSETF_UI_MODE = makeSymbol("_CSETF-UI-MODE");

    private static final SubLSymbol UI_STATUS = makeSymbol("UI-STATUS");

    private static final SubLSymbol _CSETF_UI_STATUS = makeSymbol("_CSETF-UI-STATUS");

    private static final SubLSymbol UI_START_TIME = makeSymbol("UI-START-TIME");

    private static final SubLSymbol _CSETF_UI_START_TIME = makeSymbol("_CSETF-UI-START-TIME");

    private static final SubLSymbol UI_FINISH_TIME = makeSymbol("UI-FINISH-TIME");

    private static final SubLSymbol _CSETF_UI_FINISH_TIME = makeSymbol("_CSETF-UI-FINISH-TIME");

    private static final SubLSymbol UI_PARENT_INTERACTION = makeSymbol("UI-PARENT-INTERACTION");

    private static final SubLSymbol _CSETF_UI_PARENT_INTERACTION = makeSymbol("_CSETF-UI-PARENT-INTERACTION");

    private static final SubLSymbol UI_CHILD_INTERACTIONS = makeSymbol("UI-CHILD-INTERACTIONS");

    private static final SubLSymbol _CSETF_UI_CHILD_INTERACTIONS = makeSymbol("_CSETF-UI-CHILD-INTERACTIONS");

    private static final SubLSymbol UI_OPERATOR = makeSymbol("UI-OPERATOR");

    private static final SubLSymbol _CSETF_UI_OPERATOR = makeSymbol("_CSETF-UI-OPERATOR");

    private static final SubLSymbol UI_ARGS = makeSymbol("UI-ARGS");

    private static final SubLSymbol _CSETF_UI_ARGS = makeSymbol("_CSETF-UI-ARGS");

    private static final SubLSymbol UI_RESULT = makeSymbol("UI-RESULT");

    private static final SubLSymbol _CSETF_UI_RESULT = makeSymbol("_CSETF-UI-RESULT");

    private static final SubLSymbol UI_STATE = makeSymbol("UI-STATE");

    private static final SubLSymbol _CSETF_UI_STATE = makeSymbol("_CSETF-UI-STATE");

    private static final SubLString $str51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_USER_INTERACTION = makeSymbol("MAKE-USER-INTERACTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD");

    private static final SubLSymbol SXHASH_USER_INTERACTION_METHOD = makeSymbol("SXHASH-USER-INTERACTION-METHOD");

    private static final SubLString $str58$__UI__A__A__S_ = makeString("#<UI ~A:~A:~S>");

    private static final SubLSymbol USER_INTERACTION_AGENDA_P = makeSymbol("USER-INTERACTION-AGENDA-P");

    private static final SubLSymbol USER_INTERACTION_MODE_P = makeSymbol("USER-INTERACTION-MODE-P");

    private static final SubLSymbol UI_OPERATOR_P = makeSymbol("UI-OPERATOR-P");

    private static final SubLSymbol USER_INTERACTION_STATUS_P = makeSymbol("USER-INTERACTION-STATUS-P");

    private static final SubLSymbol USER_INTERACTION_AGENDA = makeSymbol("USER-INTERACTION-AGENDA");

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("META-AGENDA"), makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("HISTORY"), makeSymbol("UNDOS"), makeSymbol("MESSAGES"), makeSymbol("REQUIREMENTS"), makeSymbol("RELEVANT-SUGGESTIONS"), makeSymbol("POSSIBLE-SUGGESTIONS"), makeSymbol("COMMENTS"), makeSymbol("STATE") });

    private static final SubLList $list67 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("META-AGENDA"), makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("HISTORY"), makeKeyword("UNDOS"), makeKeyword("MESSAGES"), makeKeyword("REQUIREMENTS"), makeKeyword("RELEVANT-SUGGESTIONS"), makeKeyword("POSSIBLE-SUGGESTIONS"), makeKeyword("COMMENTS"), makeKeyword("STATE") });

    private static final SubLList $list68 = list(new SubLObject[]{ makeSymbol("UIA-ID"), makeSymbol("UIA-META-AGENDA"), makeSymbol("UIA-ISG"), makeSymbol("UIA-INDEX"), makeSymbol("UIA-HISTORY"), makeSymbol("UIA-UNDOS"), makeSymbol("UIA-MESSAGES"), makeSymbol("UIA-REQUIREMENTS"), makeSymbol("UIA-RELEVANT-SUGGESTIONS"), makeSymbol("UIA-POSSIBLE-SUGGESTIONS"), makeSymbol("UIA-COMMENTS"), makeSymbol("UIA-STATE") });

    private static final SubLList $list69 = list(new SubLObject[]{ makeSymbol("_CSETF-UIA-ID"), makeSymbol("_CSETF-UIA-META-AGENDA"), makeSymbol("_CSETF-UIA-ISG"), makeSymbol("_CSETF-UIA-INDEX"), makeSymbol("_CSETF-UIA-HISTORY"), makeSymbol("_CSETF-UIA-UNDOS"), makeSymbol("_CSETF-UIA-MESSAGES"), makeSymbol("_CSETF-UIA-REQUIREMENTS"), makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS"), makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS"), makeSymbol("_CSETF-UIA-COMMENTS"), makeSymbol("_CSETF-UIA-STATE") });

    private static final SubLSymbol PRINT_USER_INTERACTION_AGENDA = makeSymbol("PRINT-USER-INTERACTION-AGENDA");

    private static final SubLSymbol USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list72 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-INTERACTION-AGENDA-P"));

    private static final SubLSymbol UIA_ID = makeSymbol("UIA-ID");

    private static final SubLSymbol _CSETF_UIA_ID = makeSymbol("_CSETF-UIA-ID");

    private static final SubLSymbol UIA_META_AGENDA = makeSymbol("UIA-META-AGENDA");

    private static final SubLSymbol _CSETF_UIA_META_AGENDA = makeSymbol("_CSETF-UIA-META-AGENDA");

    private static final SubLSymbol UIA_ISG = makeSymbol("UIA-ISG");

    private static final SubLSymbol _CSETF_UIA_ISG = makeSymbol("_CSETF-UIA-ISG");

    private static final SubLSymbol UIA_INDEX = makeSymbol("UIA-INDEX");

    private static final SubLSymbol _CSETF_UIA_INDEX = makeSymbol("_CSETF-UIA-INDEX");

    private static final SubLSymbol UIA_HISTORY = makeSymbol("UIA-HISTORY");

    private static final SubLSymbol _CSETF_UIA_HISTORY = makeSymbol("_CSETF-UIA-HISTORY");

    private static final SubLSymbol UIA_UNDOS = makeSymbol("UIA-UNDOS");

    private static final SubLSymbol _CSETF_UIA_UNDOS = makeSymbol("_CSETF-UIA-UNDOS");

    private static final SubLSymbol UIA_MESSAGES = makeSymbol("UIA-MESSAGES");

    private static final SubLSymbol _CSETF_UIA_MESSAGES = makeSymbol("_CSETF-UIA-MESSAGES");

    private static final SubLSymbol UIA_REQUIREMENTS = makeSymbol("UIA-REQUIREMENTS");

    private static final SubLSymbol _CSETF_UIA_REQUIREMENTS = makeSymbol("_CSETF-UIA-REQUIREMENTS");

    private static final SubLSymbol UIA_RELEVANT_SUGGESTIONS = makeSymbol("UIA-RELEVANT-SUGGESTIONS");

    private static final SubLSymbol _CSETF_UIA_RELEVANT_SUGGESTIONS = makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS");

    private static final SubLSymbol UIA_POSSIBLE_SUGGESTIONS = makeSymbol("UIA-POSSIBLE-SUGGESTIONS");

    private static final SubLSymbol _CSETF_UIA_POSSIBLE_SUGGESTIONS = makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS");

    private static final SubLSymbol UIA_COMMENTS = makeSymbol("UIA-COMMENTS");

    private static final SubLSymbol _CSETF_UIA_COMMENTS = makeSymbol("_CSETF-UIA-COMMENTS");

    private static final SubLSymbol UIA_STATE = makeSymbol("UIA-STATE");

    private static final SubLSymbol _CSETF_UIA_STATE = makeSymbol("_CSETF-UIA-STATE");

    private static final SubLSymbol MAKE_USER_INTERACTION_AGENDA = makeSymbol("MAKE-USER-INTERACTION-AGENDA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD");

    private static final SubLSymbol SXHASH_USER_INTERACTION_AGENDA_METHOD = makeSymbol("SXHASH-USER-INTERACTION-AGENDA-METHOD");

    private static final SubLString $str110$__UIA__A_ = makeString("#<UIA ~A>");

    private static final SubLSymbol USER_INTERACTION_META_AGENDA_P = makeSymbol("USER-INTERACTION-META-AGENDA-P");

    private static final SubLSymbol $sym113$_ = makeSymbol("<");

    public static final SubLSymbol $uia_can_treat_comments_as_mumblingP$ = makeSymbol("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*");

    private static final SubLString $str125$_S__S = makeString("~S ~S");



    private static final SubLList $list128 = list(makeKeyword("TOPIC"));

    private static final SubLList $list130 = list(list(makeSymbol("UIA"), makeSymbol("UIMA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol UIMA_OPEN_AGENDAS_SEQUENCE = makeSymbol("UIMA-OPEN-AGENDAS-SEQUENCE");

    private static final SubLList $list133 = list(list(makeSymbol("UI"), makeSymbol("UIA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol UIA_INTERACTION_SEQUENCE = makeSymbol("UIA-INTERACTION-SEQUENCE");

    private static final SubLSymbol $LANGUAGE_PARSING_MT = makeKeyword("LANGUAGE-PARSING-MT");

    private static final SubLSymbol $LANGUAGE_GENERATION_MT = makeKeyword("LANGUAGE-GENERATION-MT");

    private static final SubLSymbol $LANGUAGE_LEXICAL_MT = makeKeyword("LANGUAGE-LEXICAL-MT");

    private static final SubLSymbol $ALL_INTERACTION_MTS = makeKeyword("ALL-INTERACTION-MTS");

    private static final SubLSymbol $DOMAIN_INTERACTION_MT = makeKeyword("DOMAIN-INTERACTION-MT");

    private static final SubLSymbol $PARSING_INTERACTION_MT = makeKeyword("PARSING-INTERACTION-MT");

    private static final SubLSymbol $GENERATION_INTERACTION_MT = makeKeyword("GENERATION-INTERACTION-MT");

    private static final SubLSymbol $LEXICAL_INTERACTION_MT = makeKeyword("LEXICAL-INTERACTION-MT");







    private static final SubLSymbol $SCENARIO_INTERACTION_CONTEXT = makeKeyword("SCENARIO-INTERACTION-CONTEXT");

    private static final SubLSymbol USER_INTERACTION_META_AGENDA = makeSymbol("USER-INTERACTION-META-AGENDA");

    private static final SubLList $list152 = list(makeSymbol("ID"), makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("OPEN-AGENDAS"), makeSymbol("CURRENT-AGENDA"), makeSymbol("STATE"));

    private static final SubLList $list153 = list(makeKeyword("ID"), makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("OPEN-AGENDAS"), makeKeyword("CURRENT-AGENDA"), makeKeyword("STATE"));

    private static final SubLList $list154 = list(makeSymbol("UIMA-ID"), makeSymbol("UIMA-ISG"), makeSymbol("UIMA-INDEX"), makeSymbol("UIMA-OPEN-AGENDAS"), makeSymbol("UIMA-CURRENT-AGENDA"), makeSymbol("UIMA-STATE"));

    private static final SubLList $list155 = list(makeSymbol("_CSETF-UIMA-ID"), makeSymbol("_CSETF-UIMA-ISG"), makeSymbol("_CSETF-UIMA-INDEX"), makeSymbol("_CSETF-UIMA-OPEN-AGENDAS"), makeSymbol("_CSETF-UIMA-CURRENT-AGENDA"), makeSymbol("_CSETF-UIMA-STATE"));

    private static final SubLSymbol USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list158 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-INTERACTION-META-AGENDA-P"));

    private static final SubLSymbol UIMA_ID = makeSymbol("UIMA-ID");

    private static final SubLSymbol _CSETF_UIMA_ID = makeSymbol("_CSETF-UIMA-ID");

    private static final SubLSymbol UIMA_ISG = makeSymbol("UIMA-ISG");

    private static final SubLSymbol _CSETF_UIMA_ISG = makeSymbol("_CSETF-UIMA-ISG");

    private static final SubLSymbol UIMA_INDEX = makeSymbol("UIMA-INDEX");

    private static final SubLSymbol _CSETF_UIMA_INDEX = makeSymbol("_CSETF-UIMA-INDEX");

    private static final SubLSymbol UIMA_OPEN_AGENDAS = makeSymbol("UIMA-OPEN-AGENDAS");

    private static final SubLSymbol _CSETF_UIMA_OPEN_AGENDAS = makeSymbol("_CSETF-UIMA-OPEN-AGENDAS");

    private static final SubLSymbol UIMA_CURRENT_AGENDA = makeSymbol("UIMA-CURRENT-AGENDA");

    private static final SubLSymbol _CSETF_UIMA_CURRENT_AGENDA = makeSymbol("_CSETF-UIMA-CURRENT-AGENDA");

    private static final SubLSymbol UIMA_STATE = makeSymbol("UIMA-STATE");

    private static final SubLSymbol _CSETF_UIMA_STATE = makeSymbol("_CSETF-UIMA-STATE");

    private static final SubLSymbol MAKE_USER_INTERACTION_META_AGENDA = makeSymbol("MAKE-USER-INTERACTION-META-AGENDA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD");

    private static final SubLList $list175 = list(list(makeSymbol("UIMA"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list176 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym179$ID = makeUninternedSymbol("ID");

    private static final SubLList $list181 = list(makeSymbol("SYSTEM-UIMMA"));

    private static final SubLSymbol SYSTEM_UIMMA = makeSymbol("SYSTEM-UIMMA");

    private static final SubLSymbol DO_UIMAS = makeSymbol("DO-UIMAS");

    private static final SubLSymbol $uimma$ = makeSymbol("*UIMMA*");

    private static final SubLSymbol $uimma_default_locale$ = makeSymbol("*UIMMA-DEFAULT-LOCALE*");



    private static final SubLSymbol $uimma_default_generation_mt$ = makeSymbol("*UIMMA-DEFAULT-GENERATION-MT*");

    private static final SubLSymbol $uimma_default_domain_mt$ = makeSymbol("*UIMMA-DEFAULT-DOMAIN-MT*");



    private static final SubLList $list192 = list(list(makeSymbol("AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym193$STATE = makeUninternedSymbol("STATE");

    private static final SubLSymbol UIA_MEMOIZATION_STATE = makeSymbol("UIA-MEMOIZATION-STATE");

    private static final SubLList $list198 = list(list(makeSymbol("META-AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym199$STATE = makeUninternedSymbol("STATE");

    private static final SubLSymbol UIMA_MEMOIZATION_STATE = makeSymbol("UIMA-MEMOIZATION-STATE");

    private static final SubLSymbol UIA_PENDING_ACTION_P = makeSymbol("UIA-PENDING-ACTION-P");

    private static final SubLSymbol UIA_SIGNATURE_P = makeSymbol("UIA-SIGNATURE-P");

    static private final SubLList $list207 = list(makeSymbol("META-AGENDA-ID"), makeSymbol("AGENDA-ID"));

    private static final SubLSymbol UI_SIGNATURE_P = makeSymbol("UI-SIGNATURE-P");

    private static final SubLList $list209 = list(makeSymbol("UIMA"), makeSymbol("UIA"), makeSymbol("UI"));

    private static final SubLList $list213 = list(makeSymbol("META-AGENDA-ID"), makeSymbol("AGENDA-ID"), makeSymbol("INTERACTION-ID"));

    private static final SubLSymbol $FRAMES_FOR_REFRESH = makeKeyword("FRAMES-FOR-REFRESH");

    private static final SubLList $list224 = list(makeSymbol("FRAME"), makeSymbol("AGENDA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol UIA_SCHEDULE_FRAME_FOR_REFRESH = makeSymbol("UIA-SCHEDULE-FRAME-FOR-REFRESH");

    private static final SubLList $list228 = listS(makeSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeSymbol("SIGNATURE"), makeSymbol("PLIST"));

    private static final SubLList $list229 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);

    private static final SubLSymbol UI_ACTION_TYPE_P = makeSymbol("UI-ACTION-TYPE-P");

    public static final SubLObject with_uia_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt3, append(body, NIL));
        }
    }

    public static SubLObject with_uia_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list3, append(body, NIL));
    }

    public static final SubLObject user_interaction_mode_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $user_interaction_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject user_interaction_mode_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $user_interaction_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject user_interaction_status_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $user_interaction_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject user_interaction_status_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $user_interaction_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject ui_operator_p_alt(SubLObject v_object) {
        return keywordp(v_object);
    }

    public static SubLObject ui_operator_p(final SubLObject v_object) {
        return keywordp(v_object);
    }

    public static final SubLObject user_interaction_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_user_interaction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_interaction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_interaction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject user_interaction_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject user_interaction_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native.class ? T : NIL;
    }

    public static final SubLObject ui_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField2();
    }

    public static SubLObject ui_id(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ui_agenda_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField3();
    }

    public static SubLObject ui_agenda(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ui_mode_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField4();
    }

    public static SubLObject ui_mode(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ui_status_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField5();
    }

    public static SubLObject ui_status(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ui_start_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField6();
    }

    public static SubLObject ui_start_time(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ui_finish_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField7();
    }

    public static SubLObject ui_finish_time(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject ui_parent_interaction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField8();
    }

    public static SubLObject ui_parent_interaction(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject ui_child_interactions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField9();
    }

    public static SubLObject ui_child_interactions(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject ui_operator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField10();
    }

    public static SubLObject ui_operator(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject ui_args_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField11();
    }

    public static SubLObject ui_args(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject ui_result_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField12();
    }

    public static SubLObject ui_result(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject ui_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.getField13();
    }

    public static SubLObject ui_state(final SubLObject v_object) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_ui_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ui_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ui_agenda_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ui_agenda(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ui_mode_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ui_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ui_status_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ui_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ui_start_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ui_start_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ui_finish_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ui_finish_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_ui_parent_interaction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ui_parent_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_ui_child_interactions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ui_child_interactions(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_ui_operator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ui_operator(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_ui_args_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_ui_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_ui_result_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_ui_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_ui_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_ui_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_p(v_object) : "! user_interaction_agenda.user_interaction_p(v_object) " + "user_interaction_agenda.user_interaction_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_user_interaction_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ui_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($AGENDA)) {
                            _csetf_ui_agenda(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MODE)) {
                                _csetf_ui_mode(v_new, current_value);
                            } else {
                                if (pcase_var.eql($STATUS)) {
                                    _csetf_ui_status(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($START_TIME)) {
                                        _csetf_ui_start_time(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($FINISH_TIME)) {
                                            _csetf_ui_finish_time(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PARENT_INTERACTION)) {
                                                _csetf_ui_parent_interaction(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($CHILD_INTERACTIONS)) {
                                                    _csetf_ui_child_interactions(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($OPERATOR)) {
                                                        _csetf_ui_operator(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($ARGS)) {
                                                            _csetf_ui_args(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($RESULT)) {
                                                                _csetf_ui_result(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($STATE)) {
                                                                    _csetf_ui_state(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt50$Invalid_slot__S_for_construction_, current_arg);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_user_interaction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ui_id(v_new, current_value);
            } else
                if (pcase_var.eql($AGENDA)) {
                    _csetf_ui_agenda(v_new, current_value);
                } else
                    if (pcase_var.eql($MODE)) {
                        _csetf_ui_mode(v_new, current_value);
                    } else
                        if (pcase_var.eql($STATUS)) {
                            _csetf_ui_status(v_new, current_value);
                        } else
                            if (pcase_var.eql($START_TIME)) {
                                _csetf_ui_start_time(v_new, current_value);
                            } else
                                if (pcase_var.eql($FINISH_TIME)) {
                                    _csetf_ui_finish_time(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PARENT_INTERACTION)) {
                                        _csetf_ui_parent_interaction(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CHILD_INTERACTIONS)) {
                                            _csetf_ui_child_interactions(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($OPERATOR)) {
                                                _csetf_ui_operator(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ARGS)) {
                                                    _csetf_ui_args(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($RESULT)) {
                                                        _csetf_ui_result(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($STATE)) {
                                                            _csetf_ui_state(v_new, current_value);
                                                        } else {
                                                            Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_interaction(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_INTERACTION, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ui_id(obj));
        funcall(visitor_fn, obj, $SLOT, $AGENDA, ui_agenda(obj));
        funcall(visitor_fn, obj, $SLOT, $MODE, ui_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, ui_status(obj));
        funcall(visitor_fn, obj, $SLOT, $START_TIME, ui_start_time(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISH_TIME, ui_finish_time(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_INTERACTION, ui_parent_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILD_INTERACTIONS, ui_child_interactions(obj));
        funcall(visitor_fn, obj, $SLOT, $OPERATOR, ui_operator(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGS, ui_args(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, ui_result(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, ui_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_INTERACTION, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_interaction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction(obj, visitor_fn);
    }

    public static final SubLObject sxhash_user_interaction_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(ui_id(v_object));
    }

    public static SubLObject sxhash_user_interaction_method(final SubLObject v_object) {
        return Sxhash.sxhash(ui_id(v_object));
    }

    public static final SubLObject print_user_interaction_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt52$__UI__A__A__S_, new SubLObject[]{ ui_id(v_object), ui_operator(v_object), ui_args(v_object) });
        return v_object;
    }

    public static SubLObject print_user_interaction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str58$__UI__A__A__S_, new SubLObject[]{ ui_id(v_object), ui_operator(v_object), ui_args(v_object) });
        return v_object;
    }

    public static final SubLObject new_ui_alt(SubLObject v_agenda, SubLObject mode, SubLObject operator, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(mode, USER_INTERACTION_MODE_P);
        SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
        SubLTrampolineFile.checkType(args, LISTP);
        {
            SubLObject interaction = make_user_interaction(UNPROVIDED);
            SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uia_isg(v_agenda));
            _csetf_ui_id(interaction, id);
            _csetf_ui_agenda(interaction, v_agenda);
            _csetf_ui_operator(interaction, operator);
            _csetf_ui_args(interaction, args);
            ui_note_mode(interaction, mode);
            uia_add_to_index(v_agenda, id, interaction);
            ui_note_start_time(interaction, get_universal_time());
            return interaction;
        }
    }

    public static SubLObject new_ui(final SubLObject v_agenda, final SubLObject mode, final SubLObject operator, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_mode_p(mode) : "! user_interaction_agenda.user_interaction_mode_p(mode) " + ("user_interaction_agenda.user_interaction_mode_p(mode) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_mode_p(mode) ") + mode;
        assert NIL != ui_operator_p(operator) : "! user_interaction_agenda.ui_operator_p(operator) " + ("user_interaction_agenda.ui_operator_p(operator) " + "CommonSymbols.NIL != user_interaction_agenda.ui_operator_p(operator) ") + operator;
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        final SubLObject interaction = make_user_interaction(UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uia_isg(v_agenda));
        _csetf_ui_id(interaction, id);
        _csetf_ui_agenda(interaction, v_agenda);
        _csetf_ui_operator(interaction, operator);
        _csetf_ui_args(interaction, args);
        ui_note_mode(interaction, mode);
        uia_add_to_index(v_agenda, id, interaction);
        ui_note_start_time(interaction, get_universal_time());
        return interaction;
    }

    public static final SubLObject ui_note_mode_alt(SubLObject interaction, SubLObject mode) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(mode, USER_INTERACTION_MODE_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_mode(interaction, mode);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_mode(final SubLObject interaction, final SubLObject mode) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != user_interaction_mode_p(mode) : "! user_interaction_agenda.user_interaction_mode_p(mode) " + ("user_interaction_agenda.user_interaction_mode_p(mode) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_mode_p(mode) ") + mode;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_mode(interaction, mode);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_note_status_alt(SubLObject interaction, SubLObject status) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(status, USER_INTERACTION_STATUS_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_status(interaction, status);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_status(final SubLObject interaction, final SubLObject status) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != user_interaction_status_p(status) : "! user_interaction_agenda.user_interaction_status_p(status) " + ("user_interaction_agenda.user_interaction_status_p(status) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_status_p(status) ") + status;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_status(interaction, status);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_note_start_time_alt(SubLObject interaction, SubLObject start_time) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(start_time, INTEGERP);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_start_time(interaction, start_time);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_start_time(final SubLObject interaction, final SubLObject start_time) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != integerp(start_time) : "! integerp(start_time) " + ("Types.integerp(start_time) " + "CommonSymbols.NIL != Types.integerp(start_time) ") + start_time;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_start_time(interaction, start_time);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_note_finish_time_alt(SubLObject interaction, SubLObject finish_time) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(finish_time, INTEGERP);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_finish_time(interaction, finish_time);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_finish_time(final SubLObject interaction, final SubLObject finish_time) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != integerp(finish_time) : "! integerp(finish_time) " + ("Types.integerp(finish_time) " + "CommonSymbols.NIL != Types.integerp(finish_time) ") + finish_time;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_finish_time(interaction, finish_time);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_note_parent_alt(SubLObject interaction, SubLObject parent) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(parent, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_parent_interaction(interaction, parent);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_parent(final SubLObject interaction, final SubLObject parent) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != user_interaction_p(parent) : "! user_interaction_agenda.user_interaction_p(parent) " + ("user_interaction_agenda.user_interaction_p(parent) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(parent) ") + parent;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_parent_interaction(interaction, parent);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_add_child_alt(SubLObject interaction, SubLObject child) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(child, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = child;
                    if (NIL == member(item_var, ui_child_interactions(interaction), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ui_child_interactions(interaction, cons(item_var, ui_child_interactions(interaction)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_add_child(final SubLObject interaction, final SubLObject child) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != user_interaction_p(child) : "! user_interaction_agenda.user_interaction_p(child) " + ("user_interaction_agenda.user_interaction_p(child) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(child) ") + child;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            if (NIL == member(child, ui_child_interactions(interaction), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ui_child_interactions(interaction, cons(child, ui_child_interactions(interaction)));
            }
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_note_result_alt(SubLObject interaction, SubLObject result) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_result(interaction, result);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_result(final SubLObject interaction, final SubLObject result) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_result(interaction, result);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject ui_note_state_alt(SubLObject interaction, SubLObject state) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ui_state(interaction, state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return interaction;
    }

    public static SubLObject ui_note_state(final SubLObject interaction, final SubLObject state) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_ui_state(interaction, state);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return interaction;
    }

    public static final SubLObject user_interaction_agenda_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_user_interaction_agenda(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_interaction_agenda_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_interaction_agenda(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject user_interaction_agenda_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject user_interaction_agenda_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native.class ? T : NIL;
    }

    public static final SubLObject uia_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField2();
    }

    public static SubLObject uia_id(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject uia_meta_agenda_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField3();
    }

    public static SubLObject uia_meta_agenda(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject uia_isg_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField4();
    }

    public static SubLObject uia_isg(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject uia_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField5();
    }

    public static SubLObject uia_index(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject uia_history_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField6();
    }

    public static SubLObject uia_history(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject uia_undos_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField7();
    }

    public static SubLObject uia_undos(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject uia_messages_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField8();
    }

    public static SubLObject uia_messages(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject uia_requirements_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField9();
    }

    public static SubLObject uia_requirements(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject uia_relevant_suggestions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField10();
    }

    public static SubLObject uia_relevant_suggestions(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject uia_possible_suggestions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField11();
    }

    public static SubLObject uia_possible_suggestions(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject uia_comments_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField12();
    }

    public static SubLObject uia_comments(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject uia_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.getField13();
    }

    public static SubLObject uia_state(final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_uia_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_uia_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_uia_meta_agenda_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_uia_meta_agenda(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_uia_isg_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_uia_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_uia_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_uia_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_uia_history_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_uia_history(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_uia_undos_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_uia_undos(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_uia_messages_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_uia_messages(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_uia_requirements_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_uia_requirements(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_uia_relevant_suggestions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_uia_relevant_suggestions(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_uia_possible_suggestions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_uia_possible_suggestions(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_uia_comments_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_uia_comments(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_uia_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_AGENDA_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_uia_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_agenda_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_user_interaction_agenda_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_uia_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($META_AGENDA)) {
                            _csetf_uia_meta_agenda(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ISG)) {
                                _csetf_uia_isg(v_new, current_value);
                            } else {
                                if (pcase_var.eql($INDEX)) {
                                    _csetf_uia_index(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($HISTORY)) {
                                        _csetf_uia_history(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($UNDOS)) {
                                            _csetf_uia_undos(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MESSAGES)) {
                                                _csetf_uia_messages(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($REQUIREMENTS)) {
                                                    _csetf_uia_requirements(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($RELEVANT_SUGGESTIONS)) {
                                                        _csetf_uia_relevant_suggestions(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($POSSIBLE_SUGGESTIONS)) {
                                                            _csetf_uia_possible_suggestions(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($COMMENTS)) {
                                                                _csetf_uia_comments(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($STATE)) {
                                                                    _csetf_uia_state(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt50$Invalid_slot__S_for_construction_, current_arg);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_user_interaction_agenda(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_uia_id(v_new, current_value);
            } else
                if (pcase_var.eql($META_AGENDA)) {
                    _csetf_uia_meta_agenda(v_new, current_value);
                } else
                    if (pcase_var.eql($ISG)) {
                        _csetf_uia_isg(v_new, current_value);
                    } else
                        if (pcase_var.eql($INDEX)) {
                            _csetf_uia_index(v_new, current_value);
                        } else
                            if (pcase_var.eql($HISTORY)) {
                                _csetf_uia_history(v_new, current_value);
                            } else
                                if (pcase_var.eql($UNDOS)) {
                                    _csetf_uia_undos(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MESSAGES)) {
                                        _csetf_uia_messages(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($REQUIREMENTS)) {
                                            _csetf_uia_requirements(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RELEVANT_SUGGESTIONS)) {
                                                _csetf_uia_relevant_suggestions(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($POSSIBLE_SUGGESTIONS)) {
                                                    _csetf_uia_possible_suggestions(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($COMMENTS)) {
                                                        _csetf_uia_comments(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($STATE)) {
                                                            _csetf_uia_state(v_new, current_value);
                                                        } else {
                                                            Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_interaction_agenda(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_INTERACTION_AGENDA, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, uia_id(obj));
        funcall(visitor_fn, obj, $SLOT, $META_AGENDA, uia_meta_agenda(obj));
        funcall(visitor_fn, obj, $SLOT, $ISG, uia_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, uia_index(obj));
        funcall(visitor_fn, obj, $SLOT, $HISTORY, uia_history(obj));
        funcall(visitor_fn, obj, $SLOT, $UNDOS, uia_undos(obj));
        funcall(visitor_fn, obj, $SLOT, $MESSAGES, uia_messages(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIREMENTS, uia_requirements(obj));
        funcall(visitor_fn, obj, $SLOT, $RELEVANT_SUGGESTIONS, uia_relevant_suggestions(obj));
        funcall(visitor_fn, obj, $SLOT, $POSSIBLE_SUGGESTIONS, uia_possible_suggestions(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENTS, uia_comments(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, uia_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_INTERACTION_AGENDA, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_interaction_agenda_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction_agenda(obj, visitor_fn);
    }

    public static final SubLObject sxhash_user_interaction_agenda_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(uia_id(v_object));
    }

    public static SubLObject sxhash_user_interaction_agenda_method(final SubLObject v_object) {
        return Sxhash.sxhash(uia_id(v_object));
    }

    public static final SubLObject print_user_interaction_agenda_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt101$__UIA__A_, uia_id(v_object));
        return v_object;
    }

    public static SubLObject print_user_interaction_agenda(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str110$__UIA__A_, uia_id(v_object));
        return v_object;
    }

    public static final SubLObject new_uia_alt(SubLObject meta_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        {
            SubLObject v_agenda = make_user_interaction_agenda(UNPROVIDED);
            SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uima_isg(meta_agenda));
            _csetf_uia_id(v_agenda, id);
            _csetf_uia_meta_agenda(v_agenda, meta_agenda);
            _csetf_uia_isg(v_agenda, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            _csetf_uia_index(v_agenda, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            _csetf_uia_history(v_agenda, queues.create_queue());
            _csetf_uia_undos(v_agenda, stacks.create_stack());
            _csetf_uia_messages(v_agenda, queues.create_queue());
            _csetf_uia_requirements(v_agenda, stacks.create_stack());
            _csetf_uia_relevant_suggestions(v_agenda, stacks.create_stack());
            _csetf_uia_possible_suggestions(v_agenda, queues.create_queue());
            _csetf_uia_comments(v_agenda, queues.create_queue());
            uia_state_clear_all(v_agenda);
            uima_add_to_index(meta_agenda, id, v_agenda);
            return v_agenda;
        }
    }

    public static SubLObject new_uia(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        final SubLObject v_agenda = make_user_interaction_agenda(UNPROVIDED);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(uima_isg(meta_agenda));
        _csetf_uia_id(v_agenda, id);
        _csetf_uia_meta_agenda(v_agenda, meta_agenda);
        _csetf_uia_isg(v_agenda, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_uia_index(v_agenda, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_uia_history(v_agenda, queues.create_queue(UNPROVIDED));
        _csetf_uia_undos(v_agenda, stacks.create_stack());
        _csetf_uia_messages(v_agenda, queues.create_queue(UNPROVIDED));
        _csetf_uia_requirements(v_agenda, stacks.create_stack());
        _csetf_uia_relevant_suggestions(v_agenda, stacks.create_stack());
        _csetf_uia_possible_suggestions(v_agenda, queues.create_queue(UNPROVIDED));
        _csetf_uia_comments(v_agenda, queues.create_queue(UNPROVIDED));
        uia_state_clear_all(v_agenda);
        uima_add_to_index(meta_agenda, id, v_agenda);
        return v_agenda;
    }

    public static final SubLObject uia_reset_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                integer_sequence_generator.integer_sequence_generator_reset(uia_isg(v_agenda));
                dictionary.clear_dictionary(uia_index(v_agenda));
                queues.clear_queue(uia_history(v_agenda));
                stacks.clear_stack(uia_undos(v_agenda));
                queues.clear_queue(uia_messages(v_agenda));
                stacks.clear_stack(uia_requirements(v_agenda));
                stacks.clear_stack(uia_relevant_suggestions(v_agenda));
                queues.clear_queue(uia_possible_suggestions(v_agenda));
                queues.clear_queue(uia_comments(v_agenda));
                uia_state_clear_all(v_agenda);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_reset(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            integer_sequence_generator.integer_sequence_generator_reset(uia_isg(v_agenda));
            dictionary.clear_dictionary(uia_index(v_agenda));
            queues.clear_queue(uia_history(v_agenda));
            stacks.clear_stack(uia_undos(v_agenda));
            queues.clear_queue(uia_messages(v_agenda));
            stacks.clear_stack(uia_requirements(v_agenda));
            stacks.clear_stack(uia_relevant_suggestions(v_agenda));
            queues.clear_queue(uia_possible_suggestions(v_agenda));
            queues.clear_queue(uia_comments(v_agenda));
            uia_state_clear_all(v_agenda);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_find_by_id_alt(SubLObject v_agenda, SubLObject id) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return dictionary.dictionary_lookup(uia_index(v_agenda), id, UNPROVIDED);
    }

    public static SubLObject uia_find_by_id(final SubLObject v_agenda, final SubLObject id) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return dictionary.dictionary_lookup(uia_index(v_agenda), id, UNPROVIDED);
    }

    public static final SubLObject uia_find_by_id_string_alt(SubLObject v_agenda, SubLObject id_string) {
        SubLTrampolineFile.checkType(id_string, STRINGP);
        return uia_find_by_id(v_agenda, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject uia_find_by_id_string(final SubLObject v_agenda, final SubLObject id_string) {
        assert NIL != stringp(id_string) : "! stringp(id_string) " + ("Types.stringp(id_string) " + "CommonSymbols.NIL != Types.stringp(id_string) ") + id_string;
        return uia_find_by_id(v_agenda, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject uia_some_interaction_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == dictionary.dictionary_empty_p(uia_index(v_agenda)));
    }

    public static SubLObject uia_some_interaction_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == dictionary.dictionary_empty_p(uia_index(v_agenda)));
    }

    public static final SubLObject uia_interaction_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject interactions = dictionary.dictionary_values(uia_index(v_agenda));
            interactions = Sort.sort(interactions, symbol_function($sym104$_), symbol_function(UI_ID));
            return interactions;
        }
    }

    public static SubLObject uia_interaction_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject interactions = dictionary.dictionary_values(uia_index(v_agenda));
        interactions = Sort.sort(interactions, symbol_function($sym113$_), symbol_function(UI_ID));
        return interactions;
    }

    public static final SubLObject uia_some_history_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == queues.queue_empty_p(uia_history(v_agenda)));
    }

    public static SubLObject uia_some_history_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_history(v_agenda)));
    }

    public static final SubLObject uia_history_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return queues.queue_elements(uia_history(v_agenda));
    }

    public static SubLObject uia_history_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return queues.queue_elements(uia_history(v_agenda));
    }

    public static final SubLObject uia_some_undo_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == stacks.stack_empty_p(uia_undos(v_agenda)));
    }

    public static SubLObject uia_some_undo_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uia_undos(v_agenda)));
    }

    public static final SubLObject uia_undo_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return stacks.stack_elements(uia_undos(v_agenda));
    }

    public static SubLObject uia_undo_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return stacks.stack_elements(uia_undos(v_agenda));
    }

    public static final SubLObject uia_some_message_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == queues.queue_empty_p(uia_messages(v_agenda)));
    }

    public static SubLObject uia_some_message_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_messages(v_agenda)));
    }

    public static final SubLObject uia_message_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return queues.queue_elements(uia_messages(v_agenda));
    }

    public static SubLObject uia_message_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return queues.queue_elements(uia_messages(v_agenda));
    }

    public static final SubLObject uia_some_requirement_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == stacks.stack_empty_p(uia_requirements(v_agenda)));
    }

    public static SubLObject uia_some_requirement_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uia_requirements(v_agenda)));
    }

    public static final SubLObject uia_requirement_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return stacks.stack_elements(uia_requirements(v_agenda));
    }

    public static SubLObject uia_requirement_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return stacks.stack_elements(uia_requirements(v_agenda));
    }

    public static final SubLObject uia_some_relevant_suggestion_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == stacks.stack_empty_p(uia_relevant_suggestions(v_agenda)));
    }

    public static SubLObject uia_some_relevant_suggestion_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uia_relevant_suggestions(v_agenda)));
    }

    public static final SubLObject uia_relevant_suggestion_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return stacks.stack_elements(uia_relevant_suggestions(v_agenda));
    }

    public static SubLObject uia_relevant_suggestion_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return stacks.stack_elements(uia_relevant_suggestions(v_agenda));
    }

    public static final SubLObject uia_some_possible_suggestion_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == queues.queue_empty_p(uia_possible_suggestions(v_agenda)));
    }

    public static SubLObject uia_some_possible_suggestion_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_possible_suggestions(v_agenda)));
    }

    public static final SubLObject uia_possible_suggestion_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return queues.queue_elements(uia_possible_suggestions(v_agenda));
    }

    public static SubLObject uia_possible_suggestion_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return queues.queue_elements(uia_possible_suggestions(v_agenda));
    }

    public static final SubLObject uia_some_comment_p_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return makeBoolean(NIL == queues.queue_empty_p(uia_comments(v_agenda)));
    }

    public static SubLObject uia_some_comment_p(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return makeBoolean(NIL == queues.queue_empty_p(uia_comments(v_agenda)));
    }

    public static final SubLObject uia_comment_sequence_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return queues.queue_elements(uia_comments(v_agenda));
    }

    public static SubLObject uia_comment_sequence(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return queues.queue_elements(uia_comments(v_agenda));
    }

    public static final SubLObject uia_default_operator_alt(SubLObject v_agenda) {
        return $EMPTY_AGENDA;
    }

    public static SubLObject uia_default_operator(final SubLObject v_agenda) {
        return $EMPTY_AGENDA;
    }

    public static final SubLObject uia_initialized_p_alt(SubLObject v_agenda) {
        return eq($TRUE, uia_state_lookup(v_agenda, $SETUP_COMPLETE, UNPROVIDED));
    }

    public static SubLObject uia_initialized_p(final SubLObject v_agenda) {
        return eq($TRUE, uia_state_lookup(v_agenda, $SETUP_COMPLETE, UNPROVIDED));
    }

    public static final SubLObject uia_add_to_index_alt(SubLObject v_agenda, SubLObject id, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_enter(uia_index(v_agenda), id, v_object);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_object;
    }

    public static SubLObject uia_add_to_index(final SubLObject v_agenda, final SubLObject id, final SubLObject v_object) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            dictionary.dictionary_enter(uia_index(v_agenda), id, v_object);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_object;
    }

    public static final SubLObject uia_add_to_history_alt(SubLObject v_agenda, SubLObject interaction) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.enqueue(interaction, uia_history(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_to_history(final SubLObject v_agenda, final SubLObject interaction) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(interaction, uia_history(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_clear_undos_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.clear_stack(uia_undos(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_clear_undos(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.clear_stack(uia_undos(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_add_undo_alt(SubLObject v_agenda, SubLObject undo) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(undo, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_push(undo, uia_undos(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_undo(final SubLObject v_agenda, final SubLObject undo) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(undo) : "! user_interaction_agenda.user_interaction_p(undo) " + ("user_interaction_agenda.user_interaction_p(undo) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(undo) ") + undo;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(undo, uia_undos(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_undo_alt(SubLObject v_agenda, SubLObject undo) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(undo, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_delete(undo, uia_undos(v_agenda), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_undo(final SubLObject v_agenda, final SubLObject undo) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(undo) : "! user_interaction_agenda.user_interaction_p(undo) " + ("user_interaction_agenda.user_interaction_p(undo) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(undo) ") + undo;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_delete(undo, uia_undos(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_add_message_alt(SubLObject v_agenda, SubLObject message) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(message, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.enqueue(message, uia_messages(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_message(final SubLObject v_agenda, final SubLObject message) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(message) : "! user_interaction_agenda.user_interaction_p(message) " + ("user_interaction_agenda.user_interaction_p(message) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(message) ") + message;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(message, uia_messages(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_message_alt(SubLObject v_agenda, SubLObject message) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(message, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.remqueue(message, uia_messages(v_agenda), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_message(final SubLObject v_agenda, final SubLObject message) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(message) : "! user_interaction_agenda.user_interaction_p(message) " + ("user_interaction_agenda.user_interaction_p(message) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(message) ") + message;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.remqueue(message, uia_messages(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_add_requirement_alt(SubLObject v_agenda, SubLObject requirement) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(requirement, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_push(requirement, uia_requirements(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_requirement(final SubLObject v_agenda, final SubLObject requirement) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(requirement) : "! user_interaction_agenda.user_interaction_p(requirement) " + ("user_interaction_agenda.user_interaction_p(requirement) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(requirement) ") + requirement;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(requirement, uia_requirements(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_requirement_alt(SubLObject v_agenda, SubLObject requirement) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(requirement, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_delete(requirement, uia_requirements(v_agenda), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_requirement(final SubLObject v_agenda, final SubLObject requirement) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(requirement) : "! user_interaction_agenda.user_interaction_p(requirement) " + ("user_interaction_agenda.user_interaction_p(requirement) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(requirement) ") + requirement;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_delete(requirement, uia_requirements(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_add_relevant_suggestion_alt(SubLObject v_agenda, SubLObject relevant_suggestion) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(relevant_suggestion, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_push(relevant_suggestion, uia_relevant_suggestions(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_relevant_suggestion(final SubLObject v_agenda, final SubLObject relevant_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(relevant_suggestion) : "! user_interaction_agenda.user_interaction_p(relevant_suggestion) " + ("user_interaction_agenda.user_interaction_p(relevant_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(relevant_suggestion) ") + relevant_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(relevant_suggestion, uia_relevant_suggestions(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_relevant_suggestion_alt(SubLObject v_agenda, SubLObject relevant_suggestion) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(relevant_suggestion, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_delete(relevant_suggestion, uia_relevant_suggestions(v_agenda), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_relevant_suggestion(final SubLObject v_agenda, final SubLObject relevant_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(relevant_suggestion) : "! user_interaction_agenda.user_interaction_p(relevant_suggestion) " + ("user_interaction_agenda.user_interaction_p(relevant_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(relevant_suggestion) ") + relevant_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_delete(relevant_suggestion, uia_relevant_suggestions(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_add_possible_suggestion_alt(SubLObject v_agenda, SubLObject possible_suggestion) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(possible_suggestion, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.enqueue(possible_suggestion, uia_possible_suggestions(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_possible_suggestion(final SubLObject v_agenda, final SubLObject possible_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(possible_suggestion) : "! user_interaction_agenda.user_interaction_p(possible_suggestion) " + ("user_interaction_agenda.user_interaction_p(possible_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(possible_suggestion) ") + possible_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(possible_suggestion, uia_possible_suggestions(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_possible_suggestion_alt(SubLObject v_agenda, SubLObject possible_suggestion) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(possible_suggestion, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.remqueue(possible_suggestion, uia_possible_suggestions(v_agenda), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_possible_suggestion(final SubLObject v_agenda, final SubLObject possible_suggestion) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(possible_suggestion) : "! user_interaction_agenda.user_interaction_p(possible_suggestion) " + ("user_interaction_agenda.user_interaction_p(possible_suggestion) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(possible_suggestion) ") + possible_suggestion;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.remqueue(possible_suggestion, uia_possible_suggestions(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_add_comment_alt(SubLObject v_agenda, SubLObject comment) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(comment, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.enqueue(comment, uia_comments(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_add_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(comment) : "! user_interaction_agenda.user_interaction_p(comment) " + ("user_interaction_agenda.user_interaction_p(comment) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(comment) ") + comment;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.enqueue(comment, uia_comments(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_comment_alt(SubLObject v_agenda, SubLObject comment) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(comment, USER_INTERACTION_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.remqueue(comment, uia_comments(v_agenda), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_rem_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(comment) : "! user_interaction_agenda.user_interaction_p(comment) " + ("user_interaction_agenda.user_interaction_p(comment) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(comment) ") + comment;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.remqueue(comment, uia_comments(v_agenda), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_clear_comments_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                queues.clear_queue(uia_comments(v_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_clear_comments(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            queues.clear_queue(uia_comments(v_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    /**
     *
     *
     * @return BOOLEAN; Is INTERACTION a kind that doesn't require user input?
     */
    @LispMethod(comment = "@return BOOLEAN; Is INTERACTION a kind that doesn\'t require user input?")
    public static final SubLObject uia_background_task_p_alt(SubLObject interaction) {
        return eq($THINKING, ui_operator(interaction));
    }

    /**
     *
     *
     * @return BOOLEAN; Is INTERACTION a kind that doesn't require user input?
     */
    @LispMethod(comment = "@return BOOLEAN; Is INTERACTION a kind that doesn\'t require user input?")
    public static SubLObject uia_background_task_p(final SubLObject interaction) {
        return eq($THINKING, ui_operator(interaction));
    }

    public static final SubLObject uia_can_treat_comments_as_mumblingP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $uia_can_treat_comments_as_mumblingP$.getDynamicValue(thread);
        }
    }

    public static SubLObject uia_can_treat_comments_as_mumblingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $uia_can_treat_comments_as_mumblingP$.getDynamicValue(thread);
    }

    public static final SubLObject uia_cannot_treat_comments_as_mumbling_alt() {
        $uia_can_treat_comments_as_mumblingP$.setDynamicValue(NIL);
        return uia_can_treat_comments_as_mumblingP();
    }

    public static SubLObject uia_cannot_treat_comments_as_mumbling() {
        $uia_can_treat_comments_as_mumblingP$.setDynamicValue(NIL);
        return uia_can_treat_comments_as_mumblingP();
    }

    public static final SubLObject uia_can_treat_comments_as_mumbling_alt() {
        $uia_can_treat_comments_as_mumblingP$.setDynamicValue(T);
        return uia_can_treat_comments_as_mumblingP();
    }

    public static SubLObject uia_can_treat_comments_as_mumbling() {
        $uia_can_treat_comments_as_mumblingP$.setDynamicValue(T);
        return uia_can_treat_comments_as_mumblingP();
    }

    public static final SubLObject uia_process_new_comment_alt(SubLObject v_agenda, SubLObject comment) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(comment, USER_INTERACTION_P);
        if (NIL != uima_interface_parameter_declaration.uia_treat_comments_as_mumblingP(v_agenda)) {
            uia_convert_comment_to_mumble(v_agenda, comment);
        } else {
            uia_add_comment(v_agenda, comment);
        }
        return v_agenda;
    }

    public static SubLObject uia_process_new_comment(final SubLObject v_agenda, final SubLObject comment) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != user_interaction_p(comment) : "! user_interaction_agenda.user_interaction_p(comment) " + ("user_interaction_agenda.user_interaction_p(comment) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(comment) ") + comment;
        uia_add_comment(v_agenda, comment);
        return v_agenda;
    }

    public static final SubLObject uia_classify_alt(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject mode = ui_mode(interaction);
            SubLObject pcase_var = mode;
            if (pcase_var.eql($UNDO)) {
                uia_add_undo(v_agenda, interaction);
            } else {
                if (pcase_var.eql($MESSAGE)) {
                    uia_add_message(v_agenda, interaction);
                } else {
                    if (pcase_var.eql($REQUIRED)) {
                        uia_add_requirement(v_agenda, interaction);
                    } else {
                        if (pcase_var.eql($RELEVANT)) {
                            uia_add_relevant_suggestion(v_agenda, interaction);
                        } else {
                            if (pcase_var.eql($POSSIBLE)) {
                                uia_add_possible_suggestion(v_agenda, interaction);
                            } else {
                                if (pcase_var.eql($COMMENT)) {
                                    uia_process_new_comment(v_agenda, interaction);
                                }
                            }
                        }
                    }
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_classify(final SubLObject v_agenda, final SubLObject interaction) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ui_mode(interaction);
        if (pcase_var.eql($UNDO)) {
            uia_add_undo(v_agenda, interaction);
        } else
            if (pcase_var.eql($MESSAGE)) {
                uia_add_message(v_agenda, interaction);
            } else
                if (pcase_var.eql($REQUIRED)) {
                    uia_add_requirement(v_agenda, interaction);
                } else
                    if (pcase_var.eql($RELEVANT)) {
                        uia_add_relevant_suggestion(v_agenda, interaction);
                    } else
                        if (pcase_var.eql($POSSIBLE)) {
                            uia_add_possible_suggestion(v_agenda, interaction);
                        } else
                            if (pcase_var.eql($COMMENT)) {
                                uia_process_new_comment(v_agenda, interaction);
                            }





        return v_agenda;
    }

    public static final SubLObject uia_declassify_alt(SubLObject v_agenda, SubLObject interaction) {
        {
            SubLObject mode = ui_mode(interaction);
            SubLObject pcase_var = mode;
            if (pcase_var.eql($UNDO)) {
                uia_rem_undo(v_agenda, interaction);
            } else {
                if (pcase_var.eql($MESSAGE)) {
                    uia_rem_message(v_agenda, interaction);
                } else {
                    if (pcase_var.eql($REQUIRED)) {
                        uia_rem_requirement(v_agenda, interaction);
                    } else {
                        if (pcase_var.eql($RELEVANT)) {
                            uia_rem_relevant_suggestion(v_agenda, interaction);
                        } else {
                            if (pcase_var.eql($POSSIBLE)) {
                                uia_rem_possible_suggestion(v_agenda, interaction);
                            } else {
                                if (pcase_var.eql($COMMENT)) {
                                    uia_rem_comment(v_agenda, interaction);
                                }
                            }
                        }
                    }
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_declassify(final SubLObject v_agenda, final SubLObject interaction) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ui_mode(interaction);
        if (pcase_var.eql($UNDO)) {
            uia_rem_undo(v_agenda, interaction);
        } else
            if (pcase_var.eql($MESSAGE)) {
                uia_rem_message(v_agenda, interaction);
            } else
                if (pcase_var.eql($REQUIRED)) {
                    uia_rem_requirement(v_agenda, interaction);
                } else
                    if (pcase_var.eql($RELEVANT)) {
                        uia_rem_relevant_suggestion(v_agenda, interaction);
                    } else
                        if (pcase_var.eql($POSSIBLE)) {
                            uia_rem_possible_suggestion(v_agenda, interaction);
                        } else
                            if (pcase_var.eql($COMMENT)) {
                                uia_rem_comment(v_agenda, interaction);
                            }





        return v_agenda;
    }

    public static final SubLObject uia_note_state_alt(SubLObject v_agenda, SubLObject state) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_uia_state(v_agenda, state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_note_state(final SubLObject v_agenda, final SubLObject state) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uia_state(v_agenda, state);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_global_id_string_alt(SubLObject v_agenda) {
        {
            SubLObject uima = uia_meta_agenda(v_agenda);
            SubLObject uima_id = uima_id(uima);
            SubLObject uia_id = uia_id(v_agenda);
            return format(NIL, $str_alt117$_S__S, uima_id, uia_id);
        }
    }

    public static SubLObject uia_global_id_string(final SubLObject v_agenda) {
        final SubLObject uima = uia_meta_agenda(v_agenda);
        final SubLObject uima_id = uima_id(uima);
        final SubLObject uia_id = uia_id(v_agenda);
        return format(NIL, $str125$_S__S, uima_id, uia_id);
    }

    public static final SubLObject uia_from_ids_alt(SubLObject meta_agenda, SubLObject v_agenda) {
        {
            SubLObject uima = uimma_find_by_id(meta_agenda);
            SubLObject uia = uima_find_by_id(uima, v_agenda);
            return values(uia, uima);
        }
    }

    public static SubLObject uia_from_ids(final SubLObject meta_agenda, final SubLObject v_agenda) {
        final SubLObject uima = uimma_find_by_id(meta_agenda);
        final SubLObject uia = uima_find_by_id(uima, v_agenda);
        return values(uia, uima);
    }

    /**
     *
     *
     * @unknown Notice that this will do an ask EVERY BLOODY TIME if
    there isn't a main focus assertion ... not very portable.
     */
    @LispMethod(comment = "@unknown Notice that this will do an ask EVERY BLOODY TIME if\r\nthere isn\'t a main focus assertion ... not very portable.")
    public static final SubLObject uia_determine_superior_topic_identification_alt(SubLObject v_agenda) {
        {
            SubLObject better_topic = uia_state_lookup(v_agenda, $SUPERIOR_TOPIC, NIL);
            if (NIL != better_topic) {
                return better_topic;
            }
        }
        {
            SubLObject formula = listS($$mainFocusOfUIASession, uia_domain_interaction_mt(v_agenda), $list_alt122);
            SubLObject better_topics = ask_utilities.ask_variable($TOPIC, formula, uia_domain_interaction_mt(v_agenda), ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
            SubLObject better_topic = better_topics.first();
            if (NIL != forts.fort_p(better_topic)) {
                uia_state_update(v_agenda, $SUPERIOR_TOPIC, better_topic);
            }
            return better_topic;
        }
    }

    /**
     *
     *
     * @unknown Notice that this will do an ask EVERY BLOODY TIME if
    there isn't a main focus assertion ... not very portable.
     */
    @LispMethod(comment = "@unknown Notice that this will do an ask EVERY BLOODY TIME if\r\nthere isn\'t a main focus assertion ... not very portable.")
    public static SubLObject uia_determine_superior_topic_identification(final SubLObject v_agenda) {
        final SubLObject better_topic = uia_state_lookup(v_agenda, $SUPERIOR_TOPIC, NIL);
        if (NIL != better_topic) {
            return better_topic;
        }
        final SubLObject formula = listS($$mainFocusOfUIASession, uia_domain_interaction_mt(v_agenda), $list128);
        final SubLObject better_topics = ask_utilities.ask_variable($TOPIC, formula, uia_domain_interaction_mt(v_agenda), ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        final SubLObject better_topic2 = better_topics.first();
        if (NIL != forts.fort_p(better_topic2)) {
            uia_state_update(v_agenda, $SUPERIOR_TOPIC, better_topic2);
        }
        return better_topic2;
    }

    /**
     * Iterate UIA over all user interaction agendas of UIMA.
     * Evaluate BODY within the scope of each binding.
     */
    @LispMethod(comment = "Iterate UIA over all user interaction agendas of UIMA.\r\nEvaluate BODY within the scope of each binding.\nIterate UIA over all user interaction agendas of UIMA.\nEvaluate BODY within the scope of each binding.")
    public static final SubLObject do_uias_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt124);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject uia = NIL;
                    SubLObject uima = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt124);
                    uia = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt124);
                    uima = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, list(uia, list(UIMA_OPEN_AGENDAS_SEQUENCE, uima)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt124);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterate UIA over all user interaction agendas of UIMA.
     * Evaluate BODY within the scope of each binding.
     */
    @LispMethod(comment = "Iterate UIA over all user interaction agendas of UIMA.\r\nEvaluate BODY within the scope of each binding.\nIterate UIA over all user interaction agendas of UIMA.\nEvaluate BODY within the scope of each binding.")
    public static SubLObject do_uias(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject uia = NIL;
        SubLObject uima = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        uia = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        uima = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(uia, list(UIMA_OPEN_AGENDAS_SEQUENCE, uima)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    /**
     * Iterate UI over all actions of UIA.
     * Evaluate BODY within the scope of each binding.
     */
    @LispMethod(comment = "Iterate UI over all actions of UIA.\r\nEvaluate BODY within the scope of each binding.\nIterate UI over all actions of UIA.\nEvaluate BODY within the scope of each binding.")
    public static final SubLObject do_uis_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt127);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject ui = NIL;
                    SubLObject uia = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    ui = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    uia = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, list(ui, list(UIA_INTERACTION_SEQUENCE, uia)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt127);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterate UI over all actions of UIA.
     * Evaluate BODY within the scope of each binding.
     */
    @LispMethod(comment = "Iterate UI over all actions of UIA.\r\nEvaluate BODY within the scope of each binding.\nIterate UI over all actions of UIA.\nEvaluate BODY within the scope of each binding.")
    public static SubLObject do_uis(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ui = NIL;
        SubLObject uia = NIL;
        destructuring_bind_must_consp(current, datum, $list133);
        ui = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        uia = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(ui, list(UIA_INTERACTION_SEQUENCE, uia)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list133);
        return NIL;
    }

    public static final SubLObject uia_language_parsing_mt_alt(SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_PARSING_MT, $UNDETERMINED);
    }

    public static SubLObject uia_language_parsing_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_PARSING_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_language_parsing_mt_update_alt(SubLObject v_agenda, SubLObject language_parsing_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_PARSING_MT, language_parsing_mt);
    }

    public static SubLObject uia_language_parsing_mt_update(final SubLObject v_agenda, final SubLObject language_parsing_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_PARSING_MT, language_parsing_mt);
    }

    public static final SubLObject uia_language_generation_mt_alt(SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_GENERATION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_language_generation_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_GENERATION_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_language_generation_mt_update_alt(SubLObject v_agenda, SubLObject language_generation_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_GENERATION_MT, language_generation_mt);
    }

    public static SubLObject uia_language_generation_mt_update(final SubLObject v_agenda, final SubLObject language_generation_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_GENERATION_MT, language_generation_mt);
    }

    public static final SubLObject uia_language_lexical_mt_alt(SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_LEXICAL_MT, $UNDETERMINED);
    }

    public static SubLObject uia_language_lexical_mt(final SubLObject v_agenda) {
        return uima_state_lookup(uia_meta_agenda(v_agenda), $LANGUAGE_LEXICAL_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_language_lexical_mt_update_alt(SubLObject v_agenda, SubLObject language_lexical_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_LEXICAL_MT, language_lexical_mt);
    }

    public static SubLObject uia_language_lexical_mt_update(final SubLObject v_agenda, final SubLObject language_lexical_mt) {
        return uima_state_update(uia_meta_agenda(v_agenda), $LANGUAGE_LEXICAL_MT, language_lexical_mt);
    }

    public static final SubLObject uia_domain_mt_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $DOMAIN_MT, $UNDETERMINED);
    }

    public static SubLObject uia_domain_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $DOMAIN_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_domain_mt_update_alt(SubLObject v_agenda, SubLObject domain_mt) {
        return uia_state_update(v_agenda, $DOMAIN_MT, domain_mt);
    }

    public static SubLObject uia_domain_mt_update(final SubLObject v_agenda, final SubLObject domain_mt) {
        return uia_state_update(v_agenda, $DOMAIN_MT, domain_mt);
    }

    public static final SubLObject uia_parsing_mt_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $PARSING_MT, $UNDETERMINED);
    }

    public static SubLObject uia_parsing_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $PARSING_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_parsing_mt_update_alt(SubLObject v_agenda, SubLObject parsing_mt) {
        return uia_state_update(v_agenda, $PARSING_MT, parsing_mt);
    }

    public static SubLObject uia_parsing_mt_update(final SubLObject v_agenda, final SubLObject parsing_mt) {
        return uia_state_update(v_agenda, $PARSING_MT, parsing_mt);
    }

    public static final SubLObject uia_generation_mt_alt(SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $GENERATION_MT, v_default);
    }

    public static SubLObject uia_generation_mt(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $GENERATION_MT, v_default);
    }

    public static final SubLObject uia_generation_mt_update_alt(SubLObject v_agenda, SubLObject generation_mt) {
        return uia_state_update(v_agenda, $GENERATION_MT, generation_mt);
    }

    public static SubLObject uia_generation_mt_update(final SubLObject v_agenda, final SubLObject generation_mt) {
        return uia_state_update(v_agenda, $GENERATION_MT, generation_mt);
    }

    public static final SubLObject uia_all_interaction_mts_alt(SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $ALL_INTERACTION_MTS, v_default);
    }

    public static SubLObject uia_all_interaction_mts(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $ALL_INTERACTION_MTS, v_default);
    }

    /**
     * Updates the state of AGENDA by adding INTERACTION-MT to the list stored
     * under :all-interaction-mts.  Allows stateful tools to register their
     * own interaction contexts as needed.
     */
    @LispMethod(comment = "Updates the state of AGENDA by adding INTERACTION-MT to the list stored\r\nunder :all-interaction-mts.  Allows stateful tools to register their\r\nown interaction contexts as needed.\nUpdates the state of AGENDA by adding INTERACTION-MT to the list stored\nunder :all-interaction-mts.  Allows stateful tools to register their\nown interaction contexts as needed.")
    public static final SubLObject uia_note_interaction_mt_alt(SubLObject v_agenda, SubLObject interaction_mt) {
        {
            SubLObject all_interaction_mts = uia_all_interaction_mts(v_agenda, NIL);
            all_interaction_mts = adjoin(interaction_mt, all_interaction_mts, UNPROVIDED, UNPROVIDED);
            return uia_state_update(v_agenda, $ALL_INTERACTION_MTS, all_interaction_mts);
        }
    }

    /**
     * Updates the state of AGENDA by adding INTERACTION-MT to the list stored
     * under :all-interaction-mts.  Allows stateful tools to register their
     * own interaction contexts as needed.
     */
    @LispMethod(comment = "Updates the state of AGENDA by adding INTERACTION-MT to the list stored\r\nunder :all-interaction-mts.  Allows stateful tools to register their\r\nown interaction contexts as needed.\nUpdates the state of AGENDA by adding INTERACTION-MT to the list stored\nunder :all-interaction-mts.  Allows stateful tools to register their\nown interaction contexts as needed.")
    public static SubLObject uia_note_interaction_mt(final SubLObject v_agenda, final SubLObject interaction_mt) {
        SubLObject all_interaction_mts = uia_all_interaction_mts(v_agenda, NIL);
        all_interaction_mts = adjoin(interaction_mt, all_interaction_mts, UNPROVIDED, UNPROVIDED);
        return uia_state_update(v_agenda, $ALL_INTERACTION_MTS, all_interaction_mts);
    }

    public static final SubLObject uia_domain_interaction_mt_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $DOMAIN_INTERACTION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_domain_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $DOMAIN_INTERACTION_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_domain_interaction_mt_update_alt(SubLObject v_agenda, SubLObject domain_interaction_mt) {
        return uia_state_update(v_agenda, $DOMAIN_INTERACTION_MT, domain_interaction_mt);
    }

    public static SubLObject uia_domain_interaction_mt_update(final SubLObject v_agenda, final SubLObject domain_interaction_mt) {
        return uia_state_update(v_agenda, $DOMAIN_INTERACTION_MT, domain_interaction_mt);
    }

    public static final SubLObject uia_parsing_interaction_mt_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $PARSING_INTERACTION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_parsing_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $PARSING_INTERACTION_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_parsing_interaction_mt_update_alt(SubLObject v_agenda, SubLObject parsing_interaction_mt) {
        return uia_state_update(v_agenda, $PARSING_INTERACTION_MT, parsing_interaction_mt);
    }

    public static SubLObject uia_parsing_interaction_mt_update(final SubLObject v_agenda, final SubLObject parsing_interaction_mt) {
        return uia_state_update(v_agenda, $PARSING_INTERACTION_MT, parsing_interaction_mt);
    }

    public static final SubLObject uia_generation_interaction_mt_alt(SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $GENERATION_INTERACTION_MT, v_default);
    }

    public static SubLObject uia_generation_interaction_mt(final SubLObject v_agenda, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $UNDETERMINED;
        }
        return uia_state_lookup(v_agenda, $GENERATION_INTERACTION_MT, v_default);
    }

    /**
     * The MT from which the language-specific lexical and paraphrase assertions are visible.
     */
    @LispMethod(comment = "The MT from which the language-specific lexical and paraphrase assertions are visible.")
    public static final SubLObject uia_generation_language_mt_alt(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                return $UNDETERMINED == agenda_specific_mt ? ((SubLObject) (pph_vars.$pph_language_mt$.getDynamicValue(thread))) : agenda_specific_mt;
            }
        }
    }

    /**
     * The MT from which the language-specific lexical and paraphrase assertions are visible.
     */
    @LispMethod(comment = "The MT from which the language-specific lexical and paraphrase assertions are visible.")
    public static SubLObject uia_generation_language_mt(final SubLObject v_agenda) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        return $UNDETERMINED == agenda_specific_mt ? pph_vars.$pph_language_mt$.getDynamicValue(thread) : agenda_specific_mt;
    }

    /**
     * The MT from which the items to be paraphrased are visible.
     */
    @LispMethod(comment = "The MT from which the items to be paraphrased are visible.")
    public static final SubLObject uia_generation_domain_mt_alt(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                return $UNDETERMINED == agenda_specific_mt ? ((SubLObject) (pph_vars.$pph_domain_mt$.getDynamicValue(thread))) : agenda_specific_mt;
            }
        }
    }

    /**
     * The MT from which the items to be paraphrased are visible.
     */
    @LispMethod(comment = "The MT from which the items to be paraphrased are visible.")
    public static SubLObject uia_generation_domain_mt(final SubLObject v_agenda) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject agenda_specific_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        return $UNDETERMINED == agenda_specific_mt ? pph_vars.$pph_domain_mt$.getDynamicValue(thread) : agenda_specific_mt;
    }

    public static final SubLObject uia_generation_interaction_mt_update_alt(SubLObject v_agenda, SubLObject generation_interaction_mt) {
        return uia_state_update(v_agenda, $GENERATION_INTERACTION_MT, generation_interaction_mt);
    }

    public static SubLObject uia_generation_interaction_mt_update(final SubLObject v_agenda, final SubLObject generation_interaction_mt) {
        return uia_state_update(v_agenda, $GENERATION_INTERACTION_MT, generation_interaction_mt);
    }

    public static final SubLObject uia_lexical_interaction_mt_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $LEXICAL_INTERACTION_MT, $UNDETERMINED);
    }

    public static SubLObject uia_lexical_interaction_mt(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $LEXICAL_INTERACTION_MT, $UNDETERMINED);
    }

    public static final SubLObject uia_lexical_interaction_mt_update_alt(SubLObject v_agenda, SubLObject lexical_interaction_mt) {
        return uia_state_update(v_agenda, $LEXICAL_INTERACTION_MT, lexical_interaction_mt);
    }

    public static SubLObject uia_lexical_interaction_mt_update(final SubLObject v_agenda, final SubLObject lexical_interaction_mt) {
        return uia_state_update(v_agenda, $LEXICAL_INTERACTION_MT, lexical_interaction_mt);
    }

    /**
     * Return the domain interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the domain interaction mt to use for INTERACTION.")
    public static final SubLObject ui_domain_interaction_mt_alt(SubLObject interaction) {
        {
            SubLObject v_agenda = ui_agenda(interaction);
            {
                SubLObject v_answer = ui_state_lookup(interaction, $DOMAIN_INTERACTION_MT, $UNDETERMINED);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            {
                SubLObject v_answer = uia_domain_interaction_mt(v_agenda);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            {
                SubLObject v_answer = ui_generation_interaction_mt(interaction);
                return v_answer;
            }
        }
    }

    /**
     * Return the domain interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the domain interaction mt to use for INTERACTION.")
    public static SubLObject ui_domain_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, $DOMAIN_INTERACTION_MT, $UNDETERMINED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_domain_interaction_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = ui_generation_interaction_mt(interaction);
        return v_answer;
    }

    /**
     * Return the parsing interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the parsing interaction mt to use for INTERACTION.")
    public static final SubLObject ui_parsing_interaction_mt_alt(SubLObject interaction) {
        {
            SubLObject v_agenda = ui_agenda(interaction);
            {
                SubLObject v_answer = ui_state_lookup(interaction, $PARSING_INTERACTION_MT, $UNDETERMINED);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            {
                SubLObject v_answer = uia_parsing_interaction_mt(v_agenda);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            {
                SubLObject v_answer = uia_language_parsing_mt(v_agenda);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            return $$EnglishTemplateMt;
        }
    }

    /**
     * Return the parsing interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the parsing interaction mt to use for INTERACTION.")
    public static SubLObject ui_parsing_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, $PARSING_INTERACTION_MT, $UNDETERMINED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_parsing_interaction_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_language_parsing_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        return $$EnglishTemplateMt;
    }

    /**
     * Return the generation interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the generation interaction mt to use for INTERACTION.")
    public static final SubLObject ui_generation_interaction_mt_alt(SubLObject interaction) {
        {
            SubLObject v_agenda = ui_agenda(interaction);
            {
                SubLObject v_answer = ui_state_lookup(interaction, $GENERATION_INTERACTION_MT, $UNDETERMINED);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            {
                SubLObject v_answer = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            {
                SubLObject v_answer = uia_language_generation_mt(v_agenda);
                if ($UNDETERMINED != v_answer) {
                    return v_answer;
                }
            }
            return $$EnglishParaphraseMt;
        }
    }

    /**
     * Return the generation interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the generation interaction mt to use for INTERACTION.")
    public static SubLObject ui_generation_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        SubLObject v_answer = ui_state_lookup(interaction, $GENERATION_INTERACTION_MT, $UNDETERMINED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        v_answer = uia_language_generation_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        return $$EnglishParaphraseMt;
    }

    /**
     * The MT from which the language-specific lexical and paraphrase assertions are visible.
     */
    @LispMethod(comment = "The MT from which the language-specific lexical and paraphrase assertions are visible.")
    public static final SubLObject ui_generation_language_mt_alt(SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }

    /**
     * The MT from which the language-specific lexical and paraphrase assertions are visible.
     */
    @LispMethod(comment = "The MT from which the language-specific lexical and paraphrase assertions are visible.")
    public static SubLObject ui_generation_language_mt(final SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }

    /**
     * The MT from which the items to be paraphrased are visible.
     */
    @LispMethod(comment = "The MT from which the items to be paraphrased are visible.")
    public static final SubLObject ui_generation_domain_mt_alt(SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }

    @LispMethod(comment = "The MT from which the items to be paraphrased are visible.")
    public static SubLObject ui_generation_domain_mt(final SubLObject interaction) {
        return ui_generation_interaction_mt(interaction);
    }

    /**
     * Return the lexical interaction mt to use for INTERACTION.
     */
    @LispMethod(comment = "Return the lexical interaction mt to use for INTERACTION.")
    public static final SubLObject ui_lexical_interaction_mt_alt(SubLObject interaction) {
        {
            SubLObject v_agenda = ui_agenda(interaction);
            SubLObject v_answer = uia_lexical_interaction_mt(v_agenda);
            if ($UNDETERMINED != v_answer) {
                return v_answer;
            }
            return $$EnglishMt;
        }
    }

    @LispMethod(comment = "Return the lexical interaction mt to use for INTERACTION.")
    public static SubLObject ui_lexical_interaction_mt(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject v_answer = uia_lexical_interaction_mt(v_agenda);
        if ($UNDETERMINED != v_answer) {
            return v_answer;
        }
        return $$EnglishMt;
    }

    public static final SubLObject uia_ensure_scenario_interaction_mt_alt(SubLObject v_agenda) {
        {
            SubLObject scenario_interaction_mt = uia_state_lookup(v_agenda, $SCENARIO_INTERACTION_CONTEXT, UNPROVIDED);
            if (NIL == hlmt.hlmt_p(scenario_interaction_mt)) {
                scenario_interaction_mt = rkf_context_tools.rkf_create_scenario_interaction_context(uia_domain_interaction_mt(v_agenda));
                uia_state_update(v_agenda, $SCENARIO_INTERACTION_CONTEXT, scenario_interaction_mt);
                uia_note_interaction_mt(v_agenda, scenario_interaction_mt);
            }
            return scenario_interaction_mt;
        }
    }

    public static SubLObject uia_ensure_scenario_interaction_mt(final SubLObject v_agenda) {
        SubLObject scenario_interaction_mt = uia_state_lookup(v_agenda, $SCENARIO_INTERACTION_CONTEXT, UNPROVIDED);
        if (NIL == hlmt.hlmt_p(scenario_interaction_mt)) {
            scenario_interaction_mt = rkf_context_tools.rkf_create_scenario_interaction_context(uia_domain_interaction_mt(v_agenda));
            uia_state_update(v_agenda, $SCENARIO_INTERACTION_CONTEXT, scenario_interaction_mt);
            uia_note_interaction_mt(v_agenda, scenario_interaction_mt);
        }
        return scenario_interaction_mt;
    }

    public static final SubLObject user_interaction_meta_agenda_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_interaction_meta_agenda_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject user_interaction_meta_agenda_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject user_interaction_meta_agenda_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native.class ? T : NIL;
    }

    public static final SubLObject uima_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.getField2();
    }

    public static SubLObject uima_id(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject uima_isg_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.getField3();
    }

    public static SubLObject uima_isg(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject uima_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.getField4();
    }

    public static SubLObject uima_index(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject uima_open_agendas_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.getField5();
    }

    public static SubLObject uima_open_agendas(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject uima_current_agenda_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.getField6();
    }

    public static SubLObject uima_current_agenda(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject uima_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.getField7();
    }

    public static SubLObject uima_state(final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_uima_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_uima_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_uima_isg_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_uima_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_uima_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_uima_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_uima_open_agendas_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_uima_open_agendas(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_uima_current_agenda_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_uima_current_agenda(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_uima_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_INTERACTION_META_AGENDA_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_uima_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_interaction_meta_agenda_p(v_object) : "! user_interaction_agenda.user_interaction_meta_agenda_p(v_object) " + "user_interaction_agenda.user_interaction_meta_agenda_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_user_interaction_meta_agenda_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_uima_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ISG)) {
                            _csetf_uima_isg(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INDEX)) {
                                _csetf_uima_index(v_new, current_value);
                            } else {
                                if (pcase_var.eql($OPEN_AGENDAS)) {
                                    _csetf_uima_open_agendas(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CURRENT_AGENDA)) {
                                        _csetf_uima_current_agenda(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($STATE)) {
                                            _csetf_uima_state(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt50$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_user_interaction_meta_agenda(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_uima_id(v_new, current_value);
            } else
                if (pcase_var.eql($ISG)) {
                    _csetf_uima_isg(v_new, current_value);
                } else
                    if (pcase_var.eql($INDEX)) {
                        _csetf_uima_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($OPEN_AGENDAS)) {
                            _csetf_uima_open_agendas(v_new, current_value);
                        } else
                            if (pcase_var.eql($CURRENT_AGENDA)) {
                                _csetf_uima_current_agenda(v_new, current_value);
                            } else
                                if (pcase_var.eql($STATE)) {
                                    _csetf_uima_state(v_new, current_value);
                                } else {
                                    Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_interaction_meta_agenda(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_INTERACTION_META_AGENDA, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, uima_id(obj));
        funcall(visitor_fn, obj, $SLOT, $ISG, uima_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, uima_index(obj));
        funcall(visitor_fn, obj, $SLOT, $OPEN_AGENDAS, uima_open_agendas(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_AGENDA, uima_current_agenda(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, uima_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_INTERACTION_META_AGENDA, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_interaction_meta_agenda_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_interaction_meta_agenda(obj, visitor_fn);
    }

    public static final SubLObject new_uima_alt() {
        {
            SubLObject meta_agenda = make_user_interaction_meta_agenda(UNPROVIDED);
            SubLObject id = uimma_new_id();
            _csetf_uima_id(meta_agenda, id);
            _csetf_uima_isg(meta_agenda, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            _csetf_uima_index(meta_agenda, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            _csetf_uima_open_agendas(meta_agenda, stacks.create_stack());
            uima_clear_current_agenda(meta_agenda);
            uima_note_state(meta_agenda, NIL);
            uimma_add_to_index(id, meta_agenda);
            return meta_agenda;
        }
    }

    public static SubLObject new_uima() {
        final SubLObject meta_agenda = make_user_interaction_meta_agenda(UNPROVIDED);
        final SubLObject id = uimma_new_id();
        _csetf_uima_id(meta_agenda, id);
        _csetf_uima_isg(meta_agenda, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_uima_index(meta_agenda, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_uima_open_agendas(meta_agenda, stacks.create_stack());
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, NIL);
        uimma_add_to_index(id, meta_agenda);
        return meta_agenda;
    }

    public static final SubLObject uima_reset_alt(SubLObject meta_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                integer_sequence_generator.integer_sequence_generator_reset(uima_isg(meta_agenda));
                dictionary.clear_dictionary(uima_index(meta_agenda));
                stacks.clear_stack(uima_open_agendas(meta_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, NIL);
        return meta_agenda;
    }

    public static SubLObject uima_reset(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            integer_sequence_generator.integer_sequence_generator_reset(uima_isg(meta_agenda));
            dictionary.clear_dictionary(uima_index(meta_agenda));
            stacks.clear_stack(uima_open_agendas(meta_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        uima_clear_current_agenda(meta_agenda);
        uima_note_state(meta_agenda, NIL);
        return meta_agenda;
    }

    public static final SubLObject uima_find_by_id_alt(SubLObject meta_agenda, SubLObject id) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        return dictionary.dictionary_lookup(uima_index(meta_agenda), id, UNPROVIDED);
    }

    public static SubLObject uima_find_by_id(final SubLObject meta_agenda, final SubLObject id) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        return dictionary.dictionary_lookup(uima_index(meta_agenda), id, UNPROVIDED);
    }

    public static final SubLObject uima_find_by_id_string_alt(SubLObject meta_agenda, SubLObject id_string) {
        SubLTrampolineFile.checkType(id_string, STRINGP);
        return uima_find_by_id(meta_agenda, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject uima_find_by_id_string(final SubLObject meta_agenda, final SubLObject id_string) {
        assert NIL != stringp(id_string) : "! stringp(id_string) " + ("Types.stringp(id_string) " + "CommonSymbols.NIL != Types.stringp(id_string) ") + id_string;
        return uima_find_by_id(meta_agenda, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject uima_some_open_agendas_p_alt(SubLObject meta_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        return makeBoolean(NIL == stacks.stack_empty_p(uima_open_agendas(meta_agenda)));
    }

    public static SubLObject uima_some_open_agendas_p(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        return makeBoolean(NIL == stacks.stack_empty_p(uima_open_agendas(meta_agenda)));
    }

    public static final SubLObject uima_open_agendas_sequence_alt(SubLObject meta_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        return stacks.stack_elements(uima_open_agendas(meta_agenda));
    }

    public static SubLObject uima_open_agendas_sequence(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        return stacks.stack_elements(uima_open_agendas(meta_agenda));
    }

    public static final SubLObject uima_match_mt_to_agenda_alt(SubLObject meta_agenda, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
            {
                SubLObject result = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(uima_index(meta_agenda)));
                while (!((NIL != result) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject v_agenda = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (uia_domain_interaction_mt(v_agenda) == mt) {
                            result = v_agenda;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    public static SubLObject uima_match_mt_to_agenda(final SubLObject meta_agenda, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        SubLObject result;
        SubLObject iteration_state;
        for (result = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(uima_index(meta_agenda))); (NIL == result) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject v_agenda = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (uia_domain_interaction_mt(v_agenda).eql(mt)) {
                result = v_agenda;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static final SubLObject uima_add_to_index_alt(SubLObject meta_agenda, SubLObject id, SubLObject v_object) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_enter(uima_index(meta_agenda), id, v_object);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_object;
    }

    public static SubLObject uima_add_to_index(final SubLObject meta_agenda, final SubLObject id, final SubLObject v_object) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            dictionary.dictionary_enter(uima_index(meta_agenda), id, v_object);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_object;
    }

    public static final SubLObject uima_add_open_agenda_alt(SubLObject meta_agenda, SubLObject v_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                stacks.stack_push(v_agenda, uima_open_agendas(meta_agenda));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_add_open_agenda(final SubLObject meta_agenda, final SubLObject v_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            stacks.stack_push(v_agenda, uima_open_agendas(meta_agenda));
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static final SubLObject uima_clear_current_agenda_alt(SubLObject meta_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_uima_current_agenda(meta_agenda, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_clear_current_agenda(final SubLObject meta_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uima_current_agenda(meta_agenda, NIL);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static final SubLObject uima_note_current_agenda_alt(SubLObject meta_agenda, SubLObject v_agenda) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_uima_current_agenda(meta_agenda, v_agenda);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_note_current_agenda(final SubLObject meta_agenda, final SubLObject v_agenda) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uima_current_agenda(meta_agenda, v_agenda);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    public static final SubLObject uima_note_state_alt(SubLObject meta_agenda, SubLObject state) {
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_uima_state(meta_agenda, state);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return meta_agenda;
    }

    public static SubLObject uima_note_state(final SubLObject meta_agenda, final SubLObject state) {
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            _csetf_uima_state(meta_agenda, state);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return meta_agenda;
    }

    /**
     * Iterate UIMA over all user interaction meta-agendas.
     * Evaluate BODY within the scope of each binding.
     */
    @LispMethod(comment = "Iterate UIMA over all user interaction meta-agendas.\r\nEvaluate BODY within the scope of each binding.\nIterate UIMA over all user interaction meta-agendas.\nEvaluate BODY within the scope of each binding.")
    public static final SubLObject do_uimas_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt165);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject uima = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt165);
                    uima = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt165);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt165);
                            if (NIL == member(current_1, $list_alt166, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt165);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym169$ID;
                                return listS(DO_ID_INDEX, list(id, uima, $list_alt171, $DONE, done), list(IGNORE, id), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate UIMA over all user interaction meta-agendas.\r\nEvaluate BODY within the scope of each binding.\nIterate UIMA over all user interaction meta-agendas.\nEvaluate BODY within the scope of each binding.")
    public static SubLObject do_uimas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list175);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject uima = NIL;
        destructuring_bind_must_consp(current, datum, $list175);
        uima = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list175);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list175);
            if (NIL == member(current_$1, $list176, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list175);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym179$ID;
        return listS(DO_ID_INDEX, list(id, uima, $list181, $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject system_uimma_alt() {
        return uimma();
    }

    public static SubLObject system_uimma() {
        return uimma();
    }

    public static final SubLObject uimma_alt() {
        return $uimma$.getGlobalValue();
    }

    public static SubLObject uimma() {
        return $uimma$.getGlobalValue();
    }

    public static final SubLObject new_uimma_alt() {
        return new_id_index(ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject new_uimma() {
        return new_id_index(ZERO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject uimma_reset_alt() {
        $uimma$.setGlobalValue(new_uimma());
        return uimma();
    }

    public static SubLObject uimma_reset() {
        $uimma$.setGlobalValue(new_uimma());
        return uimma();
    }

    public static final SubLObject uimma_new_id_alt() {
        return id_index_reserve(uimma());
    }

    public static SubLObject uimma_new_id() {
        return id_index_reserve(uimma());
    }

    public static final SubLObject uimma_add_to_index_alt(SubLObject id, SubLObject meta_agenda) {
        return id_index_enter(uimma(), id, meta_agenda);
    }

    public static SubLObject uimma_add_to_index(final SubLObject id, final SubLObject meta_agenda) {
        return id_index_enter(uimma(), id, meta_agenda);
    }

    public static final SubLObject uimma_find_by_id_alt(SubLObject meta_agenda_id) {
        return id_index_lookup(uimma(), meta_agenda_id, UNPROVIDED);
    }

    public static SubLObject uimma_find_by_id(final SubLObject meta_agenda_id) {
        return id_index_lookup(uimma(), meta_agenda_id, UNPROVIDED);
    }

    public static final SubLObject uimma_default_locale_alt() {
        return $uimma_default_locale$.getGlobalValue();
    }

    public static SubLObject uimma_default_locale() {
        return $uimma_default_locale$.getGlobalValue();
    }

    public static final SubLObject set_uimma_default_locale_alt(SubLObject locale) {
        $uimma_default_locale$.setGlobalValue(locale);
        return $uimma_default_locale$.getGlobalValue();
    }

    public static SubLObject set_uimma_default_locale(final SubLObject locale) {
        $uimma_default_locale$.setGlobalValue(locale);
        return $uimma_default_locale$.getGlobalValue();
    }

    public static final SubLObject uimma_default_generation_mt_alt() {
        return $uimma_default_generation_mt$.getGlobalValue();
    }

    public static SubLObject uimma_default_generation_mt() {
        return $uimma_default_generation_mt$.getGlobalValue();
    }

    public static final SubLObject set_uimma_default_generation_mt_alt(SubLObject mt) {
        $uimma_default_generation_mt$.setGlobalValue(mt);
        return $uimma_default_generation_mt$.getGlobalValue();
    }

    public static SubLObject set_uimma_default_generation_mt(final SubLObject mt) {
        $uimma_default_generation_mt$.setGlobalValue(mt);
        return $uimma_default_generation_mt$.getGlobalValue();
    }

    public static final SubLObject uimma_default_domain_mt_alt() {
        return $uimma_default_domain_mt$.getGlobalValue();
    }

    public static SubLObject uimma_default_domain_mt() {
        return $uimma_default_domain_mt$.getGlobalValue();
    }

    public static final SubLObject set_uimma_default_domain_mt_alt(SubLObject mt) {
        $uimma_default_domain_mt$.setGlobalValue(mt);
        return $uimma_default_domain_mt$.getGlobalValue();
    }

    public static SubLObject set_uimma_default_domain_mt(final SubLObject mt) {
        $uimma_default_domain_mt$.setGlobalValue(mt);
        return $uimma_default_domain_mt$.getGlobalValue();
    }

    /**
     * Return the meta-agenda for INTERACTION.
     */
    @LispMethod(comment = "Return the meta-agenda for INTERACTION.")
    public static final SubLObject ui_meta_agenda_alt(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        return uia_meta_agenda(ui_agenda(interaction));
    }

    @LispMethod(comment = "Return the meta-agenda for INTERACTION.")
    public static SubLObject ui_meta_agenda(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        return uia_meta_agenda(ui_agenda(interaction));
    }

    /**
     * Return the total number of interactions in AGENDA.
     */
    @LispMethod(comment = "Return the total number of interactions in AGENDA.")
    public static final SubLObject uia_total_interaction_count_alt(SubLObject v_agenda) {
        return dictionary.dictionary_length(uia_index(v_agenda));
    }

    @LispMethod(comment = "Return the total number of interactions in AGENDA.")
    public static SubLObject uia_total_interaction_count(final SubLObject v_agenda) {
        return dictionary.dictionary_length(uia_index(v_agenda));
    }

    /**
     * Return the total number of finished interactions in AGENDA.
     */
    @LispMethod(comment = "Return the total number of finished interactions in AGENDA.")
    public static final SubLObject uia_finished_interaction_count_alt(SubLObject v_agenda) {
        return queues.queue_size(uia_history(v_agenda));
    }

    @LispMethod(comment = "Return the total number of finished interactions in AGENDA.")
    public static SubLObject uia_finished_interaction_count(final SubLObject v_agenda) {
        return queues.queue_size(uia_history(v_agenda));
    }

    public static final SubLObject ui_state_plist_to_state_alt(SubLObject plist) {
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return plist;
    }

    public static SubLObject ui_state_plist_to_state(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return plist;
    }

    public static final SubLObject ui_state_lookup_alt(SubLObject interaction, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        return getf(ui_state(interaction), property, v_default);
    }

    public static SubLObject ui_state_lookup(final SubLObject interaction, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        return getf(ui_state(interaction), property, v_default);
    }

    public static final SubLObject ui_state_update_alt(SubLObject interaction, SubLObject property, SubLObject value) {
        return ui_note_state(interaction, putf(ui_state(interaction), property, value));
    }

    public static SubLObject ui_state_update(final SubLObject interaction, final SubLObject property, final SubLObject value) {
        return ui_note_state(interaction, putf(ui_state(interaction), property, value));
    }

    public static final SubLObject ui_state_clear_alt(SubLObject interaction, SubLObject property) {
        return ui_note_state(interaction, remf(ui_state(interaction), property));
    }

    public static SubLObject ui_state_clear(final SubLObject interaction, final SubLObject property) {
        return ui_note_state(interaction, remf(ui_state(interaction), property));
    }

    public static final SubLObject ui_state_clear_all_alt(SubLObject interaction) {
        return ui_note_state(interaction, NIL);
    }

    public static SubLObject ui_state_clear_all(final SubLObject interaction) {
        return ui_note_state(interaction, NIL);
    }

    public static final SubLObject uia_state_plist_to_state_alt(SubLObject plist) {
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return plist;
    }

    public static SubLObject uia_state_plist_to_state(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return plist;
    }

    public static final SubLObject uia_initialize_state_alt(SubLObject v_agenda, SubLObject plist) {
        uia_note_state(v_agenda, uia_state_plist_to_state(plist));
        uia_create_memoization_state(v_agenda);
        uia_glob_reset(v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_initialize_state(final SubLObject v_agenda, final SubLObject plist) {
        uia_note_state(v_agenda, uia_state_plist_to_state(plist));
        uia_create_memoization_state(v_agenda);
        uia_glob_reset(v_agenda);
        return v_agenda;
    }

    public static final SubLObject uia_state_lookup_alt(SubLObject v_agenda, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        return getf(uia_state(v_agenda), property, v_default);
    }

    public static SubLObject uia_state_lookup(final SubLObject v_agenda, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        return getf(uia_state(v_agenda), property, v_default);
    }

    public static final SubLObject uia_state_update_alt(SubLObject v_agenda, SubLObject property, SubLObject value) {
        return uia_note_state(v_agenda, putf(uia_state(v_agenda), property, value));
    }

    public static SubLObject uia_state_update(final SubLObject v_agenda, final SubLObject property, final SubLObject value) {
        return uia_note_state(v_agenda, putf(uia_state(v_agenda), property, value));
    }

    public static final SubLObject uia_state_clear_alt(SubLObject v_agenda, SubLObject property) {
        return uia_note_state(v_agenda, remf(uia_state(v_agenda), property));
    }

    public static SubLObject uia_state_clear(final SubLObject v_agenda, final SubLObject property) {
        return uia_note_state(v_agenda, remf(uia_state(v_agenda), property));
    }

    public static final SubLObject uia_state_clear_all_alt(SubLObject v_agenda) {
        uia_note_state(v_agenda, NIL);
        return v_agenda;
    }

    public static SubLObject uia_state_clear_all(final SubLObject v_agenda) {
        uia_note_state(v_agenda, NIL);
        return v_agenda;
    }

    public static final SubLObject uima_state_plist_to_state_alt(SubLObject plist) {
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return plist;
    }

    public static SubLObject uima_state_plist_to_state(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return plist;
    }

    public static final SubLObject uima_initialize_state_alt(SubLObject meta_agenda, SubLObject plist) {
        uima_note_state(meta_agenda, uima_state_plist_to_state(plist));
        uima_create_memoization_state(meta_agenda);
        return meta_agenda;
    }

    public static SubLObject uima_initialize_state(final SubLObject meta_agenda, final SubLObject plist) {
        uima_note_state(meta_agenda, uima_state_plist_to_state(plist));
        uima_create_memoization_state(meta_agenda);
        return meta_agenda;
    }

    public static final SubLObject uima_state_lookup_alt(SubLObject meta_agenda, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(meta_agenda, USER_INTERACTION_META_AGENDA_P);
        return getf(uima_state(meta_agenda), property, v_default);
    }

    public static SubLObject uima_state_lookup(final SubLObject meta_agenda, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != user_interaction_meta_agenda_p(meta_agenda) : "! user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + ("user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_meta_agenda_p(meta_agenda) ") + meta_agenda;
        return getf(uima_state(meta_agenda), property, v_default);
    }

    public static final SubLObject uima_state_update_alt(SubLObject meta_agenda, SubLObject property, SubLObject value) {
        return uima_note_state(meta_agenda, putf(uima_state(meta_agenda), property, value));
    }

    public static SubLObject uima_state_update(final SubLObject meta_agenda, final SubLObject property, final SubLObject value) {
        return uima_note_state(meta_agenda, putf(uima_state(meta_agenda), property, value));
    }

    public static final SubLObject uima_state_clear_alt(SubLObject meta_agenda, SubLObject property) {
        return uima_note_state(meta_agenda, remf(uima_state(meta_agenda), property));
    }

    public static SubLObject uima_state_clear(final SubLObject meta_agenda, final SubLObject property) {
        return uima_note_state(meta_agenda, remf(uima_state(meta_agenda), property));
    }

    public static final SubLObject uima_state_clear_all_alt(SubLObject meta_agenda) {
        return uima_note_state(meta_agenda, NIL);
    }

    public static SubLObject uima_state_clear_all(final SubLObject meta_agenda) {
        return uima_note_state(meta_agenda, NIL);
    }

    public static final SubLObject with_uia_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt184);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_agenda = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt184);
                    v_agenda = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject state = $sym185$STATE;
                            return list(CLET, list(list(state, list(UIA_MEMOIZATION_STATE, v_agenda))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt184);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_uia_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list192);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_agenda = NIL;
        destructuring_bind_must_consp(current, datum, $list192);
        v_agenda = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state = $sym193$STATE;
            return list(CLET, list(list(state, list(UIA_MEMOIZATION_STATE, v_agenda))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list192);
        return NIL;
    }

    public static final SubLObject uia_memoization_state_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $MEMOIZATION_STATE, UNPROVIDED);
    }

    public static SubLObject uia_memoization_state(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $MEMOIZATION_STATE, UNPROVIDED);
    }

    public static final SubLObject uia_create_memoization_state_alt(SubLObject v_agenda) {
        uia_state_update(v_agenda, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return v_agenda;
    }

    public static SubLObject uia_create_memoization_state(final SubLObject v_agenda) {
        uia_state_update(v_agenda, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return v_agenda;
    }

    public static final SubLObject uia_clear_memoization_state_alt(SubLObject v_agenda) {
        memoization_state.clear_all_memoization(uia_memoization_state(v_agenda));
        return v_agenda;
    }

    public static SubLObject uia_clear_memoization_state(final SubLObject v_agenda) {
        memoization_state.clear_all_memoization(uia_memoization_state(v_agenda));
        return v_agenda;
    }

    public static final SubLObject uia_clear_memoization_state_for_function_alt(SubLObject v_agenda, SubLObject symbol) {
        return memoization_state.clear_memoization(uia_memoization_state(v_agenda), symbol);
    }

    public static SubLObject uia_clear_memoization_state_for_function(final SubLObject v_agenda, final SubLObject symbol) {
        return memoization_state.clear_memoization(uia_memoization_state(v_agenda), symbol);
    }

    public static final SubLObject with_uima_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt190);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject meta_agenda = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt190);
                    meta_agenda = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject state = $sym191$STATE;
                            return list(CLET, list(list(state, list(UIMA_MEMOIZATION_STATE, meta_agenda))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt190);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_uima_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list198);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject meta_agenda = NIL;
        destructuring_bind_must_consp(current, datum, $list198);
        meta_agenda = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state = $sym199$STATE;
            return list(CLET, list(list(state, list(UIMA_MEMOIZATION_STATE, meta_agenda))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list198);
        return NIL;
    }

    public static final SubLObject uima_memoization_state_alt(SubLObject meta_agenda) {
        return uima_state_lookup(meta_agenda, $MEMOIZATION_STATE, UNPROVIDED);
    }

    public static SubLObject uima_memoization_state(final SubLObject meta_agenda) {
        return uima_state_lookup(meta_agenda, $MEMOIZATION_STATE, UNPROVIDED);
    }

    public static final SubLObject uima_create_memoization_state_alt(SubLObject meta_agenda) {
        uima_state_update(meta_agenda, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return meta_agenda;
    }

    public static SubLObject uima_create_memoization_state(final SubLObject meta_agenda) {
        uima_state_update(meta_agenda, $MEMOIZATION_STATE, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return meta_agenda;
    }

    public static final SubLObject uima_clear_memoization_state_alt(SubLObject meta_agenda) {
        memoization_state.clear_all_memoization(uima_memoization_state(meta_agenda));
        return meta_agenda;
    }

    public static SubLObject uima_clear_memoization_state(final SubLObject meta_agenda) {
        memoization_state.clear_all_memoization(uima_memoization_state(meta_agenda));
        return meta_agenda;
    }

    /**
     * Return a list of all interactions that are ancestors of INTERACTION.
     */
    @LispMethod(comment = "Return a list of all interactions that are ancestors of INTERACTION.")
    public static final SubLObject ui_ancestor_interactions_alt(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject v_answer = NIL;
            SubLObject parent = NIL;
            for (parent = ui_parent_interaction(interaction); NIL != parent; parent = ui_parent_interaction(parent)) {
                v_answer = cons(parent, v_answer);
            }
            return v_answer;
        }
    }

    @LispMethod(comment = "Return a list of all interactions that are ancestors of INTERACTION.")
    public static SubLObject ui_ancestor_interactions(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        SubLObject v_answer = NIL;
        SubLObject parent;
        for (parent = NIL, parent = ui_parent_interaction(interaction); NIL != parent; parent = ui_parent_interaction(parent)) {
            v_answer = cons(parent, v_answer);
        }
        return v_answer;
    }

    /**
     * Return all pending interactions that are descendants of INTERACTION.
     */
    @LispMethod(comment = "Return all pending interactions that are descendants of INTERACTION.")
    public static final SubLObject ui_pending_descendant_interactions_alt(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        return nreverse(ui_pending_descendants_recursive(interaction, NIL));
    }

    @LispMethod(comment = "Return all pending interactions that are descendants of INTERACTION.")
    public static SubLObject ui_pending_descendant_interactions(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        return nreverse(ui_pending_descendants_recursive(interaction, NIL));
    }

    public static final SubLObject ui_pending_descendants_recursive_alt(SubLObject interaction, SubLObject accumulator) {
        {
            SubLObject cdolist_list_var = ui_child_interactions(interaction);
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                if ($PENDING == ui_status(child)) {
                    accumulator = cons(child, accumulator);
                } else {
                    accumulator = ui_pending_descendants_recursive(child, accumulator);
                }
            }
        }
        return accumulator;
    }

    public static SubLObject ui_pending_descendants_recursive(final SubLObject interaction, SubLObject accumulator) {
        SubLObject cdolist_list_var = ui_child_interactions(interaction);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($PENDING == ui_status(child)) {
                accumulator = cons(child, accumulator);
            } else {
                accumulator = ui_pending_descendants_recursive(child, accumulator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return accumulator;
    }

    public static final SubLObject ui_sub_interactions_alt(SubLObject interaction) {
        return ui_state_lookup(interaction, $SUB_INTERACTIONS, UNPROVIDED);
    }

    public static SubLObject ui_sub_interactions(final SubLObject interaction) {
        return ui_state_lookup(interaction, $SUB_INTERACTIONS, UNPROVIDED);
    }

    public static final SubLObject ui_super_interaction_alt(SubLObject interaction) {
        return ui_state_lookup(interaction, $SUPER_INTERACTION, UNPROVIDED);
    }

    public static SubLObject ui_super_interaction(final SubLObject interaction) {
        return ui_state_lookup(interaction, $SUPER_INTERACTION, UNPROVIDED);
    }

    public static final SubLObject ui_add_sub_interaction_alt(SubLObject super_interaction, SubLObject sub_interaction) {
        {
            SubLObject sub_interactions = ui_sub_interactions(super_interaction);
            SubLObject item_var = sub_interaction;
            if (NIL == member(item_var, sub_interactions, symbol_function(EQL), symbol_function(IDENTITY))) {
                sub_interactions = cons(item_var, sub_interactions);
            }
            ui_state_update(super_interaction, $SUB_INTERACTIONS, sub_interactions);
        }
        return super_interaction;
    }

    public static SubLObject ui_add_sub_interaction(final SubLObject super_interaction, final SubLObject sub_interaction) {
        SubLObject sub_interactions = ui_sub_interactions(super_interaction);
        if (NIL == member(sub_interaction, sub_interactions, symbol_function(EQL), symbol_function(IDENTITY))) {
            sub_interactions = cons(sub_interaction, sub_interactions);
        }
        ui_state_update(super_interaction, $SUB_INTERACTIONS, sub_interactions);
        return super_interaction;
    }

    public static final SubLObject ui_remove_sub_interaction_alt(SubLObject sub_interaction) {
        {
            SubLObject super_interaction = ui_super_interaction(sub_interaction);
            SubLObject subs = ui_sub_interactions(super_interaction);
            SubLObject new_subs = remove(sub_interaction, subs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ui_state_update(super_interaction, $SUB_INTERACTIONS, new_subs);
        }
        return sub_interaction;
    }

    public static SubLObject ui_remove_sub_interaction(final SubLObject sub_interaction) {
        final SubLObject super_interaction = ui_super_interaction(sub_interaction);
        final SubLObject subs = ui_sub_interactions(super_interaction);
        final SubLObject new_subs = remove(sub_interaction, subs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        ui_state_update(super_interaction, $SUB_INTERACTIONS, new_subs);
        return sub_interaction;
    }

    public static final SubLObject ui_note_super_interaction_alt(SubLObject sub_interaction, SubLObject super_interaction) {
        ui_state_update(sub_interaction, $SUPER_INTERACTION, super_interaction);
        return sub_interaction;
    }

    public static SubLObject ui_note_super_interaction(final SubLObject sub_interaction, final SubLObject super_interaction) {
        ui_state_update(sub_interaction, $SUPER_INTERACTION, super_interaction);
        return sub_interaction;
    }

    /**
     * Turns a sub-interaction, INTERACTION, into a child interaction of whatever
     * its super-interaction was.  After this operation INTERACTION is no longer
     * a sub-interaction but instead is a child interaction.
     */
    @LispMethod(comment = "Turns a sub-interaction, INTERACTION, into a child interaction of whatever\r\nits super-interaction was.  After this operation INTERACTION is no longer\r\na sub-interaction but instead is a child interaction.\nTurns a sub-interaction, INTERACTION, into a child interaction of whatever\nits super-interaction was.  After this operation INTERACTION is no longer\na sub-interaction but instead is a child interaction.")
    public static final SubLObject uia_act_promote_to_child_alt(SubLObject interaction) {
        {
            SubLObject v_agenda = ui_agenda(interaction);
            SubLObject parent = ui_super_interaction(interaction);
            ui_remove_sub_interaction(interaction);
            uia_classify(v_agenda, interaction);
            uia_act_add_dependent(v_agenda, parent, interaction);
        }
        return interaction;
    }

    @LispMethod(comment = "Turns a sub-interaction, INTERACTION, into a child interaction of whatever\r\nits super-interaction was.  After this operation INTERACTION is no longer\r\na sub-interaction but instead is a child interaction.\nTurns a sub-interaction, INTERACTION, into a child interaction of whatever\nits super-interaction was.  After this operation INTERACTION is no longer\na sub-interaction but instead is a child interaction.")
    public static SubLObject uia_act_promote_to_child(final SubLObject interaction) {
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject parent = ui_super_interaction(interaction);
        ui_remove_sub_interaction(interaction);
        uia_classify(v_agenda, interaction);
        uia_act_add_dependent(v_agenda, parent, interaction);
        return interaction;
    }

    /**
     * Ensure the status of INTERACTION correctly reflects its current state.
     */
    @LispMethod(comment = "Ensure the status of INTERACTION correctly reflects its current state.")
    public static final SubLObject ui_recompute_status_alt(SubLObject interaction) {
        {
            SubLObject pcase_var = ui_status(interaction);
            if (pcase_var.eql($BLOCKED)) {
                {
                    SubLObject children = ui_child_interactions(interaction);
                    if (NIL == find($PENDING, children, symbol_function(EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED)) {
                        ui_note_status(interaction, $PENDING);
                    }
                }
            }
        }
        return interaction;
    }

    @LispMethod(comment = "Ensure the status of INTERACTION correctly reflects its current state.")
    public static SubLObject ui_recompute_status(final SubLObject interaction) {
        final SubLObject pcase_var = ui_status(interaction);
        if (pcase_var.eql($BLOCKED)) {
            final SubLObject children = ui_child_interactions(interaction);
            if (NIL == find($PENDING, children, symbol_function(EQ), symbol_function(UI_STATUS), UNPROVIDED, UNPROVIDED)) {
                ui_note_status(interaction, $PENDING);
            }
        }
        return interaction;
    }

    /**
     *
     *
     * @return BOOLEAN; Is there believed to be more work to do on INTERACTION?
     */
    @LispMethod(comment = "@return BOOLEAN; Is there believed to be more work to do on INTERACTION?")
    public static final SubLObject ui_alive_p_alt(SubLObject interaction) {
        {
            SubLObject pcase_var = ui_status(interaction);
            if (pcase_var.eql($BLOCKED) || pcase_var.eql($PENDING)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is there believed to be more work to do on INTERACTION?
     */
    @LispMethod(comment = "@return BOOLEAN; Is there believed to be more work to do on INTERACTION?")
    public static SubLObject ui_alive_p(final SubLObject interaction) {
        final SubLObject pcase_var = ui_status(interaction);
        if (pcase_var.eql($BLOCKED) || pcase_var.eql($PENDING)) {
            return T;
        }
        return NIL;
    }

    /**
     * Determine the next interaction to pursue
     */
    @LispMethod(comment = "Determine the next interaction to pursue")
    public static final SubLObject uia_next_action_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        if (NIL != uia_some_message_p(v_agenda)) {
            {
                SubLObject pending = uia_best_pending_action(uia_messages(v_agenda));
                if (NIL != pending) {
                    return pending;
                }
            }
        }
        if (NIL != uia_some_requirement_p(v_agenda)) {
            {
                SubLObject pending = uia_best_pending_action(uia_requirements(v_agenda));
                if (NIL != pending) {
                    return pending;
                }
            }
        }
        if (NIL != uia_some_relevant_suggestion_p(v_agenda)) {
            {
                SubLObject pending = uia_best_pending_action(uia_relevant_suggestions(v_agenda));
                if (NIL != pending) {
                    return pending;
                }
            }
        }
        if (NIL != uia_some_possible_suggestion_p(v_agenda)) {
            {
                SubLObject pending = uia_best_pending_action(uia_possible_suggestions(v_agenda));
                if (NIL != pending) {
                    return pending;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Determine the next interaction to pursue")
    public static SubLObject uia_next_action(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        if (NIL != uia_some_message_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_messages(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        if (NIL != uia_some_requirement_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_requirements(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        if (NIL != uia_some_relevant_suggestion_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_relevant_suggestions(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        if (NIL != uia_some_possible_suggestion_p(v_agenda)) {
            final SubLObject pending = uia_best_pending_action(uia_possible_suggestions(v_agenda));
            if (NIL != pending) {
                return pending;
            }
        }
        return NIL;
    }

    public static final SubLObject uia_note_user_selection_alt(SubLObject v_agenda, SubLObject interaction) {
        if ($PENDING == ui_status(interaction)) {
            uia_promote_interaction(v_agenda, interaction);
        }
        return v_agenda;
    }

    public static SubLObject uia_note_user_selection(final SubLObject v_agenda, final SubLObject interaction) {
        if ($PENDING == ui_status(interaction)) {
            uia_promote_interaction(v_agenda, interaction);
        }
        return v_agenda;
    }

    public static final SubLObject uia_promote_interaction_alt(SubLObject v_agenda, SubLObject interaction) {
        uia_declassify(v_agenda, interaction);
        _csetf_ui_mode(interaction, $REQUIRED);
        uia_classify(v_agenda, interaction);
        return v_agenda;
    }

    public static SubLObject uia_promote_interaction(final SubLObject v_agenda, final SubLObject interaction) {
        uia_declassify(v_agenda, interaction);
        _csetf_ui_mode(interaction, $REQUIRED);
        uia_classify(v_agenda, interaction);
        return v_agenda;
    }

    /**
     *
     *
     * @return USER-INTERACTION-P; The best one in CONTAINER to work on next.
     */
    @LispMethod(comment = "@return USER-INTERACTION-P; The best one in CONTAINER to work on next.")
    public static final SubLObject uia_best_pending_action_alt(SubLObject container) {
        {
            SubLObject best = uia_first_pending_nonbackground_action(container);
            if (NIL != user_interaction_p(best)) {
                return best;
            } else {
                if (NIL != queues.queue_p(container)) {
                    return queues.queue_find_if(UIA_PENDING_ACTION_P, container, UNPROVIDED);
                } else {
                    if (NIL != stacks.stack_p(container)) {
                        return stacks.stack_find_if(UIA_PENDING_ACTION_P, container, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return USER-INTERACTION-P; The best one in CONTAINER to work on next.
     */
    @LispMethod(comment = "@return USER-INTERACTION-P; The best one in CONTAINER to work on next.")
    public static SubLObject uia_best_pending_action(final SubLObject container) {
        final SubLObject best = uia_first_pending_nonbackground_action(container);
        if (NIL != user_interaction_p(best)) {
            return best;
        }
        if (NIL != queues.queue_p(container)) {
            return queues.queue_find_if(UIA_PENDING_ACTION_P, container, UNPROVIDED);
        }
        if (NIL != stacks.stack_p(container)) {
            return stacks.stack_find_if(UIA_PENDING_ACTION_P, container, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject uia_pending_action_p_alt(SubLObject interaction) {
        if (NIL == user_interaction_p(interaction)) {
            return NIL;
        } else {
            if (!$PENDING.eql(ui_status(interaction))) {
                return NIL;
            } else {
                if ($THINKING != ui_operator(interaction)) {
                    return T;
                } else {
                    if (NIL != user_interaction_p(ui_parent_interaction(interaction))) {
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject uia_pending_action_p(final SubLObject interaction) {
        if (NIL == user_interaction_p(interaction)) {
            return NIL;
        }
        if (!$PENDING.eql(ui_status(interaction))) {
            return NIL;
        }
        if ($THINKING != ui_operator(interaction)) {
            return T;
        }
        if (NIL != user_interaction_p(ui_parent_interaction(interaction))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject uia_first_pending_nonbackground_action_alt(SubLObject container) {
        if (NIL != queues.queue_p(container)) {
            {
                SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(container);
                SubLObject interaction = NIL;
                for (interaction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction = cdolist_list_var.first()) {
                    if ($PENDING.eql(ui_status(interaction)) && (NIL == uia_background_task_p(interaction))) {
                        return interaction;
                    }
                }
            }
            return NIL;
        } else {
            if (NIL != stacks.stack_p(container)) {
                {
                    SubLObject cdolist_list_var = stacks.do_stack_elements_stack_elements(container);
                    SubLObject interaction = NIL;
                    for (interaction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interaction = cdolist_list_var.first()) {
                        if ($PENDING.eql(ui_status(interaction)) && (NIL == uia_background_task_p(interaction))) {
                            return interaction;
                        }
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject uia_first_pending_nonbackground_action(final SubLObject container) {
        if (NIL != queues.queue_p(container)) {
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(container);
            SubLObject interaction = NIL;
            interaction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($PENDING.eql(ui_status(interaction)) && (NIL == uia_background_task_p(interaction))) {
                    return interaction;
                }
                cdolist_list_var = cdolist_list_var.rest();
                interaction = cdolist_list_var.first();
            } 
            return NIL;
        }
        if (NIL != stacks.stack_p(container)) {
            SubLObject cdolist_list_var = stacks.do_stack_elements_stack_elements(container);
            SubLObject interaction = NIL;
            interaction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($PENDING.eql(ui_status(interaction)) && (NIL == uia_background_task_p(interaction))) {
                    return interaction;
                }
                cdolist_list_var = cdolist_list_var.rest();
                interaction = cdolist_list_var.first();
            } 
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject uia_signature_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), v_object, UNPROVIDED)));
    }

    public static SubLObject uia_signature_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), v_object, UNPROVIDED)));
    }

    public static final SubLObject uia_signature_alt(SubLObject v_agenda) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        {
            SubLObject agenda_id = uia_id(v_agenda);
            SubLObject meta_agenda = uia_meta_agenda(v_agenda);
            SubLObject meta_agenda_id = uima_id(meta_agenda);
            return list(meta_agenda_id, agenda_id);
        }
    }

    public static SubLObject uia_signature(final SubLObject v_agenda) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        final SubLObject agenda_id = uia_id(v_agenda);
        final SubLObject meta_agenda = uia_meta_agenda(v_agenda);
        final SubLObject meta_agenda_id = uima_id(meta_agenda);
        return list(meta_agenda_id, agenda_id);
    }

    /**
     * Uses the signature and the UIMMA to find a user interaction.
     */
    @LispMethod(comment = "Uses the signature and the UIMMA to find a user interaction.")
    public static final SubLObject find_uia_by_signature_alt(SubLObject signature) {
        SubLTrampolineFile.checkType(signature, UIA_SIGNATURE_P);
        {
            SubLObject datum = signature;
            SubLObject current = datum;
            SubLObject meta_agenda_id = NIL;
            SubLObject agenda_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt201);
            meta_agenda_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt201);
            agenda_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject meta_agenda = uimma_find_by_id(meta_agenda_id);
                    if (NIL != meta_agenda) {
                        {
                            SubLObject v_agenda = uima_find_by_id(meta_agenda, agenda_id);
                            if (NIL != v_agenda) {
                                return v_agenda;
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt201);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Uses the signature and the UIMMA to find a user interaction.")
    public static SubLObject find_uia_by_signature(final SubLObject signature) {
        assert NIL != uia_signature_p(signature) : "! user_interaction_agenda.uia_signature_p(signature) " + ("user_interaction_agenda.uia_signature_p(signature) " + "CommonSymbols.NIL != user_interaction_agenda.uia_signature_p(signature) ") + signature;
        SubLObject meta_agenda_id = NIL;
        SubLObject agenda_id = NIL;
        destructuring_bind_must_consp(signature, signature, $list207);
        meta_agenda_id = signature.first();
        SubLObject current = signature.rest();
        destructuring_bind_must_consp(current, signature, $list207);
        agenda_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject meta_agenda = uimma_find_by_id(meta_agenda_id);
            if (NIL != meta_agenda) {
                final SubLObject v_agenda = uima_find_by_id(meta_agenda, agenda_id);
                if (NIL != v_agenda) {
                    return v_agenda;
                }
            }
        } else {
            cdestructuring_bind_error(signature, $list207);
        }
        return NIL;
    }

    public static final SubLObject ui_signature_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), v_object, UNPROVIDED)));
    }

    public static SubLObject ui_signature_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(INTEGERP), v_object, UNPROVIDED)));
    }

    public static final SubLObject ui_signature_alt(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject interaction_id = ui_id(interaction);
            SubLObject v_agenda = ui_agenda(interaction);
            SubLObject agenda_signature = uia_signature(v_agenda);
            return append(agenda_signature, list(interaction_id));
        }
    }

    public static SubLObject ui_signature(final SubLObject interaction) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        final SubLObject interaction_id = ui_id(interaction);
        final SubLObject v_agenda = ui_agenda(interaction);
        final SubLObject agenda_signature = uia_signature(v_agenda);
        return append(agenda_signature, list(interaction_id));
    }

    public static final SubLObject ui_signature_to_property_list_alt(SubLObject signature) {
        SubLTrampolineFile.checkType(signature, UI_SIGNATURE_P);
        {
            SubLObject datum = signature;
            SubLObject current = datum;
            SubLObject uima = NIL;
            SubLObject uia = NIL;
            SubLObject ui = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt203);
            uima = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt203);
            uia = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt203);
            ui = current.first();
            current = current.rest();
            if (NIL == current) {
                return list($UIMA, uima, $UIA, uia, $UI, ui);
            } else {
                cdestructuring_bind_error(datum, $list_alt203);
            }
        }
        return NIL;
    }

    public static SubLObject ui_signature_to_property_list(final SubLObject signature) {
        assert NIL != ui_signature_p(signature) : "! user_interaction_agenda.ui_signature_p(signature) " + ("user_interaction_agenda.ui_signature_p(signature) " + "CommonSymbols.NIL != user_interaction_agenda.ui_signature_p(signature) ") + signature;
        SubLObject uima = NIL;
        SubLObject uia = NIL;
        SubLObject ui = NIL;
        destructuring_bind_must_consp(signature, signature, $list209);
        uima = signature.first();
        SubLObject current = signature.rest();
        destructuring_bind_must_consp(current, signature, $list209);
        uia = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, signature, $list209);
        ui = current.first();
        current = current.rest();
        if (NIL == current) {
            return list($UIMA, uima, $UIA, uia, $UI, ui);
        }
        cdestructuring_bind_error(signature, $list209);
        return NIL;
    }

    /**
     * Uses the signature and the UIMMA to find a user interaction.
     */
    @LispMethod(comment = "Uses the signature and the UIMMA to find a user interaction.")
    public static final SubLObject find_ui_by_signature_alt(SubLObject signature) {
        SubLTrampolineFile.checkType(signature, UI_SIGNATURE_P);
        {
            SubLObject datum = signature;
            SubLObject current = datum;
            SubLObject meta_agenda_id = NIL;
            SubLObject agenda_id = NIL;
            SubLObject interaction_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt207);
            meta_agenda_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt207);
            agenda_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt207);
            interaction_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject agenda_signature = list(meta_agenda_id, agenda_id);
                    SubLObject v_agenda = find_uia_by_signature(agenda_signature);
                    if (NIL != v_agenda) {
                        {
                            SubLObject interaction = uia_find_by_id(v_agenda, interaction_id);
                            if (NIL != interaction) {
                                return interaction;
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt207);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Uses the signature and the UIMMA to find a user interaction.")
    public static SubLObject find_ui_by_signature(final SubLObject signature) {
        assert NIL != ui_signature_p(signature) : "! user_interaction_agenda.ui_signature_p(signature) " + ("user_interaction_agenda.ui_signature_p(signature) " + "CommonSymbols.NIL != user_interaction_agenda.ui_signature_p(signature) ") + signature;
        SubLObject meta_agenda_id = NIL;
        SubLObject agenda_id = NIL;
        SubLObject interaction_id = NIL;
        destructuring_bind_must_consp(signature, signature, $list213);
        meta_agenda_id = signature.first();
        SubLObject current = signature.rest();
        destructuring_bind_must_consp(current, signature, $list213);
        agenda_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, signature, $list213);
        interaction_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject agenda_signature = list(meta_agenda_id, agenda_id);
            final SubLObject v_agenda = find_uia_by_signature(agenda_signature);
            if (NIL != v_agenda) {
                final SubLObject interaction = uia_find_by_id(v_agenda, interaction_id);
                if (NIL != interaction) {
                    return interaction;
                }
            }
        } else {
            cdestructuring_bind_error(signature, $list213);
        }
        return NIL;
    }

    public static final SubLObject uia_schedule_frame_for_refresh_alt(SubLObject v_agenda, SubLObject frame_name) {
        {
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject frames = uia_state_lookup(v_agenda, $FRAMES_FOR_REFRESH, NIL);
                    SubLObject item_var = frame_name;
                    if (NIL == member(item_var, frames, symbol_function(EQL), symbol_function(IDENTITY))) {
                        frames = cons(item_var, frames);
                    }
                    uia_state_update(v_agenda, $FRAMES_FOR_REFRESH, frames);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return v_agenda;
    }

    public static SubLObject uia_schedule_frame_for_refresh(final SubLObject v_agenda, final SubLObject frame_name) {
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            SubLObject frames = uia_state_lookup(v_agenda, $FRAMES_FOR_REFRESH, NIL);
            if (NIL == member(frame_name, frames, symbol_function(EQL), symbol_function(IDENTITY))) {
                frames = cons(frame_name, frames);
            }
            uia_state_update(v_agenda, $FRAMES_FOR_REFRESH, frames);
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_get_frames_scheduled_for_refresh_alt(SubLObject v_agenda) {
        {
            SubLObject frames = NIL;
            SubLObject lock = $uia_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                frames = uia_state_lookup(v_agenda, $FRAMES_FOR_REFRESH, NIL);
                if (NIL != frames) {
                    uia_state_clear(v_agenda, $FRAMES_FOR_REFRESH);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return frames;
        }
    }

    public static SubLObject uia_get_frames_scheduled_for_refresh(final SubLObject v_agenda) {
        SubLObject frames = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($uia_lock$.getGlobalValue());
            frames = uia_state_lookup(v_agenda, $FRAMES_FOR_REFRESH, NIL);
            if (NIL != frames) {
                uia_state_clear(v_agenda, $FRAMES_FOR_REFRESH);
            }
        } finally {
            if (NIL != release) {
                release_lock($uia_lock$.getGlobalValue());
            }
        }
        return frames;
    }

    public static final SubLObject uia_crumb_trail_alt(SubLObject v_agenda) {
        {
            SubLObject crumb_trail = uia_state_lookup(v_agenda, $CRUMB_TRAIL, $UNDEFINED);
            if (crumb_trail == $UNDEFINED) {
                crumb_trail = uia_create_new_crumb_trail(v_agenda);
            }
            return crumb_trail;
        }
    }

    public static SubLObject uia_crumb_trail(final SubLObject v_agenda) {
        SubLObject crumb_trail = uia_state_lookup(v_agenda, $CRUMB_TRAIL, $UNDEFINED);
        if (crumb_trail == $UNDEFINED) {
            crumb_trail = uia_create_new_crumb_trail(v_agenda);
        }
        return crumb_trail;
    }

    public static final SubLObject uia_create_new_crumb_trail_alt(SubLObject v_agenda) {
        {
            SubLObject crumb_trail = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            uia_state_update(v_agenda, $CRUMB_TRAIL, crumb_trail);
            dictionary.dictionary_enter(crumb_trail, $TERMS, NIL);
            dictionary.dictionary_enter(crumb_trail, $FACTS, NIL);
            return crumb_trail;
        }
    }

    public static SubLObject uia_create_new_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        uia_state_update(v_agenda, $CRUMB_TRAIL, crumb_trail);
        dictionary.dictionary_enter(crumb_trail, $TERMS, NIL);
        dictionary.dictionary_enter(crumb_trail, $FACTS, NIL);
        return crumb_trail;
    }

    public static final SubLObject uia_update_term_crumb_trail_alt(SubLObject crumb_trail, SubLObject v_term) {
        dictionary_utilities.dictionary_remove_from_value(crumb_trail, $TERMS, v_term, UNPROVIDED, UNPROVIDED);
        dictionary_utilities.dictionary_push(crumb_trail, $TERMS, v_term);
        return crumb_trail;
    }

    public static SubLObject uia_update_term_crumb_trail(final SubLObject crumb_trail, final SubLObject v_term) {
        dictionary_utilities.dictionary_remove_from_value(crumb_trail, $TERMS, v_term, UNPROVIDED, UNPROVIDED);
        dictionary_utilities.dictionary_push(crumb_trail, $TERMS, v_term);
        return crumb_trail;
    }

    /**
     * Add the fact to the crumb trail, provided it is not an EL sentence
     * and we already have a stale assertion for that one.
     */
    @LispMethod(comment = "Add the fact to the crumb trail, provided it is not an EL sentence\r\nand we already have a stale assertion for that one.\nAdd the fact to the crumb trail, provided it is not an EL sentence\nand we already have a stale assertion for that one.")
    public static final SubLObject uia_update_fact_crumb_trail_alt(SubLObject crumb_trail, SubLObject fact) {
        {
            SubLObject trailed_facts = dictionary.dictionary_lookup(crumb_trail, $FACTS, UNPROVIDED);
            SubLObject new_trail = NIL;
            SubLObject cdolist_list_var = trailed_facts;
            SubLObject old_fact = NIL;
            for (old_fact = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_fact = cdolist_list_var.first()) {
                if (NIL == uia_crumb_trail_facts_equalP(fact, old_fact)) {
                    {
                        SubLObject item_var = old_fact;
                        if (NIL == member(item_var, new_trail, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            new_trail = cons(item_var, new_trail);
                        }
                    }
                } else {
                    if ((NIL != uia_crumb_trail_el_sentenceP(fact)) && (NIL != uia_crumb_trail_stale_assertionP(old_fact))) {
                        return crumb_trail;
                    }
                }
            }
            new_trail = nreverse(new_trail);
            {
                SubLObject item_var = fact;
                if (NIL == member(item_var, new_trail, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    new_trail = cons(item_var, new_trail);
                }
            }
            dictionary.dictionary_enter(crumb_trail, $FACTS, new_trail);
        }
        return crumb_trail;
    }

    @LispMethod(comment = "Add the fact to the crumb trail, provided it is not an EL sentence\r\nand we already have a stale assertion for that one.\nAdd the fact to the crumb trail, provided it is not an EL sentence\nand we already have a stale assertion for that one.")
    public static SubLObject uia_update_fact_crumb_trail(final SubLObject crumb_trail, final SubLObject fact) {
        final SubLObject trailed_facts = dictionary.dictionary_lookup(crumb_trail, $FACTS, UNPROVIDED);
        SubLObject new_trail = NIL;
        SubLObject cdolist_list_var = trailed_facts;
        SubLObject old_fact = NIL;
        old_fact = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == uia_crumb_trail_facts_equalP(fact, old_fact)) {
                final SubLObject item_var = old_fact;
                if (NIL == member(item_var, new_trail, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    new_trail = cons(item_var, new_trail);
                }
            } else
                if ((NIL != uia_crumb_trail_el_sentenceP(fact)) && (NIL != uia_crumb_trail_stale_assertionP(old_fact))) {
                    return crumb_trail;
                }

            cdolist_list_var = cdolist_list_var.rest();
            old_fact = cdolist_list_var.first();
        } 
        new_trail = nreverse(new_trail);
        if (NIL == member(fact, new_trail, symbol_function(EQUAL), symbol_function(IDENTITY))) {
            new_trail = cons(fact, new_trail);
        }
        dictionary.dictionary_enter(crumb_trail, $FACTS, new_trail);
        return crumb_trail;
    }

    /**
     * Add the question to the crumb trail.
     */
    @LispMethod(comment = "Add the question to the crumb trail.")
    public static final SubLObject uia_update_question_crumb_trail_alt(SubLObject crumb_trail, SubLObject v_question) {
        dictionary_utilities.dictionary_pushnew(crumb_trail, $QUESTIONS, v_question, symbol_function(EQUAL), UNPROVIDED);
        return crumb_trail;
    }

    @LispMethod(comment = "Add the question to the crumb trail.")
    public static SubLObject uia_update_question_crumb_trail(final SubLObject crumb_trail, final SubLObject v_question) {
        dictionary_utilities.dictionary_pushnew(crumb_trail, $QUESTIONS, v_question, symbol_function(EQUAL), UNPROVIDED);
        return crumb_trail;
    }

    public static final SubLObject uia_crumb_trail_stale_assertionP_alt(SubLObject fact) {
        return makeBoolean(NIL == assertions_high.valid_assertion(getf(fact, $ASSERTION, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject uia_crumb_trail_stale_assertionP(final SubLObject fact) {
        return makeBoolean(NIL == assertions_high.valid_assertion(getf(fact, $ASSERTION, UNPROVIDED), UNPROVIDED));
    }

    public static final SubLObject uia_crumb_trail_el_sentenceP_alt(SubLObject fact) {
        return makeBoolean(NIL == hlmt.hlmt_p(getf(fact, $MT, UNPROVIDED)));
    }

    public static SubLObject uia_crumb_trail_el_sentenceP(final SubLObject fact) {
        return makeBoolean(NIL == hlmt.hlmt_p(getf(fact, $MT, UNPROVIDED)));
    }

    public static final SubLObject uia_crumb_trail_facts_equalP_alt(SubLObject fact1, SubLObject fact2) {
        {
            SubLObject sentence1 = getf(fact1, $SENTENCE, UNPROVIDED);
            SubLObject sentence2 = getf(fact2, $SENTENCE, UNPROVIDED);
            return equal(sentence1, sentence2);
        }
    }

    public static SubLObject uia_crumb_trail_facts_equalP(final SubLObject fact1, final SubLObject fact2) {
        final SubLObject sentence1 = getf(fact1, $SENTENCE, UNPROVIDED);
        final SubLObject sentence2 = getf(fact2, $SENTENCE, UNPROVIDED);
        return equal(sentence1, sentence2);
    }

    public static final SubLObject uia_get_term_crumb_trail_alt(SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $TERMS, NIL);
    }

    public static SubLObject uia_get_term_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $TERMS, NIL);
    }

    public static final SubLObject uia_get_fact_crumb_trail_alt(SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $FACTS, NIL);
    }

    public static SubLObject uia_get_fact_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $FACTS, NIL);
    }

    public static final SubLObject uia_get_question_crumb_trail_alt(SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $QUESTIONS, NIL);
    }

    public static SubLObject uia_get_question_crumb_trail(final SubLObject crumb_trail) {
        return dictionary.dictionary_lookup(crumb_trail, $QUESTIONS, NIL);
    }

    public static final SubLObject uia_remove_crumb_trail_term_alt(SubLObject crumb_trail, SubLObject v_term) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $TERMS, v_term, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject uia_remove_crumb_trail_term(final SubLObject crumb_trail, final SubLObject v_term) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $TERMS, v_term, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uia_remove_crumb_trail_fact_alt(SubLObject crumb_trail, SubLObject fact) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $FACTS, fact, EQUAL, UNPROVIDED);
    }

    public static SubLObject uia_remove_crumb_trail_fact(final SubLObject crumb_trail, final SubLObject fact) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $FACTS, fact, EQUAL, UNPROVIDED);
    }

    public static final SubLObject uia_remove_crumb_trail_question_alt(SubLObject crumb_trail, SubLObject v_question) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $QUESTIONS, v_question, EQUAL, UNPROVIDED);
    }

    public static SubLObject uia_remove_crumb_trail_question(final SubLObject crumb_trail, final SubLObject v_question) {
        return dictionary_utilities.dictionary_remove_from_value(crumb_trail, $QUESTIONS, v_question, EQUAL, UNPROVIDED);
    }

    public static final SubLObject uia_shorten_term_crumb_trail_alt(SubLObject crumb_trail, SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $TERMS, subseq(dictionary.dictionary_lookup(crumb_trail, $TERMS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static SubLObject uia_shorten_term_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $TERMS, subseq(dictionary.dictionary_lookup(crumb_trail, $TERMS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static final SubLObject uia_shorten_fact_crumb_trail_alt(SubLObject crumb_trail, SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $FACTS, subseq(dictionary.dictionary_lookup(crumb_trail, $FACTS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static SubLObject uia_shorten_fact_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $FACTS, subseq(dictionary.dictionary_lookup(crumb_trail, $FACTS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static final SubLObject uia_shorten_question_crumb_trail_alt(SubLObject crumb_trail, SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $QUESTIONS, subseq(dictionary.dictionary_lookup(crumb_trail, $QUESTIONS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static SubLObject uia_shorten_question_crumb_trail(final SubLObject crumb_trail, final SubLObject how_many) {
        dictionary.dictionary_enter(crumb_trail, $QUESTIONS, subseq(dictionary.dictionary_lookup(crumb_trail, $QUESTIONS, NIL), ZERO_INTEGER, how_many));
        return crumb_trail;
    }

    public static final SubLObject uia_reset_crumb_trail_alt(SubLObject v_agenda) {
        uia_create_new_crumb_trail(v_agenda);
        return v_agenda;
    }

    public static SubLObject uia_reset_crumb_trail(final SubLObject v_agenda) {
        uia_create_new_crumb_trail(v_agenda);
        return v_agenda;
    }

    public static final SubLObject uia_add_term_to_crumb_trail_alt(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            uia_update_term_crumb_trail(crumb_trail, v_term);
        }
        return v_agenda;
    }

    public static SubLObject uia_add_term_to_crumb_trail(final SubLObject v_agenda, final SubLObject v_term) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        uia_update_term_crumb_trail(crumb_trail, v_term);
        return v_agenda;
    }

    /**
     *
     *
     * @param QUESTION
    el-formula-p
     * 		
     */
    @LispMethod(comment = "@param QUESTION\nel-formula-p")
    public static final SubLObject uia_add_question_to_crumb_trail_alt(SubLObject v_agenda, SubLObject v_question, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            SubLObject encapsulated_question = uia_crumb_trail_encapsulate_sentence(v_question, mt);
            uia_update_question_crumb_trail(crumb_trail, encapsulated_question);
        }
        return v_agenda;
    }

    /**
     *
     *
     * @param QUESTION
    el-formula-p
     * 		
     */
    @LispMethod(comment = "@param QUESTION\nel-formula-p")
    public static SubLObject uia_add_question_to_crumb_trail(final SubLObject v_agenda, final SubLObject v_question, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        final SubLObject encapsulated_question = uia_crumb_trail_encapsulate_sentence(v_question, mt);
        uia_update_question_crumb_trail(crumb_trail, encapsulated_question);
        return v_agenda;
    }

    /**
     *
     *
     * @param FACT
     * 		el-formula-p or assertion-p
     */
    @LispMethod(comment = "@param FACT\r\n\t\tel-formula-p or assertion-p")
    public static final SubLObject uia_add_fact_to_crumb_trail_alt(SubLObject v_agenda, SubLObject fact, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            SubLObject encapsulated_fact = (NIL != assertion_handles.assertion_p(fact)) ? ((SubLObject) (uia_crumb_trail_encapsulate_assertion(fact))) : uia_crumb_trail_encapsulate_sentence(fact, mt);
            uia_update_fact_crumb_trail(crumb_trail, encapsulated_fact);
        }
        return v_agenda;
    }

    /**
     *
     *
     * @param FACT
     * 		el-formula-p or assertion-p
     */
    @LispMethod(comment = "@param FACT\r\n\t\tel-formula-p or assertion-p")
    public static SubLObject uia_add_fact_to_crumb_trail(final SubLObject v_agenda, final SubLObject fact, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        final SubLObject encapsulated_fact = (NIL != assertion_handles.assertion_p(fact)) ? uia_crumb_trail_encapsulate_assertion(fact) : uia_crumb_trail_encapsulate_sentence(fact, mt);
        uia_update_fact_crumb_trail(crumb_trail, encapsulated_fact);
        return v_agenda;
    }

    public static final SubLObject uia_crumb_trail_encapsulate_assertion_alt(SubLObject assertion) {
        {
            SubLObject sentence = assertions_high.assertion_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject plist = NIL;
            plist = putf(plist, $ASSERTION, assertion);
            plist = putf(plist, $SENTENCE, sentence);
            plist = putf(plist, $MT, mt);
            return plist;
        }
    }

    public static SubLObject uia_crumb_trail_encapsulate_assertion(final SubLObject assertion) {
        final SubLObject sentence = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject plist = NIL;
        plist = putf(plist, $ASSERTION, assertion);
        plist = putf(plist, $SENTENCE, sentence);
        plist = putf(plist, $MT, mt);
        return plist;
    }

    public static final SubLObject uia_crumb_trail_encapsulate_sentence_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject assertion = (NIL != hlmt.hlmt_p(mt)) ? ((SubLObject) (czer_meta.find_assertion_cycl(sentence, mt))) : NIL;
            SubLObject plist = NIL;
            if (NIL != assertion_handles.assertion_p(assertion)) {
                plist = putf(plist, $ASSERTION, assertion);
            }
            plist = putf(plist, $SENTENCE, sentence);
            plist = putf(plist, $MT, mt);
            return plist;
        }
    }

    public static SubLObject uia_crumb_trail_encapsulate_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject assertion = (NIL != hlmt.hlmt_p(mt)) ? czer_meta.find_assertion_cycl(sentence, mt) : NIL;
        SubLObject plist = NIL;
        if (NIL != assertion_handles.assertion_p(assertion)) {
            plist = putf(plist, $ASSERTION, assertion);
        }
        plist = putf(plist, $SENTENCE, sentence);
        plist = putf(plist, $MT, mt);
        return plist;
    }

    public static final SubLObject uia_get_terms_on_crumb_trail_alt(SubLObject v_agenda) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            SubLObject stales = NIL;
            {
                SubLObject cdolist_list_var = uia_get_term_crumb_trail(crumb_trail);
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL == forts.valid_fort_robustP(v_term)) {
                        stales = cons(v_term, stales);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = stales;
                SubLObject stale = NIL;
                for (stale = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stale = cdolist_list_var.first()) {
                    uia_remove_crumb_trail_term(crumb_trail, stale);
                }
            }
            return uia_get_term_crumb_trail(crumb_trail);
        }
    }

    public static SubLObject uia_get_terms_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        SubLObject stales = NIL;
        SubLObject cdolist_list_var = uia_get_term_crumb_trail(crumb_trail);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == forts.valid_fort_robustP(v_term)) {
                stales = cons(v_term, stales);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = stales;
        SubLObject stale = NIL;
        stale = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            uia_remove_crumb_trail_term(crumb_trail, stale);
            cdolist_list_var = cdolist_list_var.rest();
            stale = cdolist_list_var.first();
        } 
        return uia_get_term_crumb_trail(crumb_trail);
    }

    public static final SubLObject uia_get_facts_on_crumb_trail_alt(SubLObject v_agenda) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            return uia_get_fact_crumb_trail(crumb_trail);
        }
    }

    public static SubLObject uia_get_facts_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_get_fact_crumb_trail(crumb_trail);
    }

    public static final SubLObject uia_get_questions_on_crumb_trail_alt(SubLObject v_agenda) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            return uia_get_question_crumb_trail(crumb_trail);
        }
    }

    public static SubLObject uia_get_questions_on_crumb_trail(final SubLObject v_agenda) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_get_question_crumb_trail(crumb_trail);
    }

    public static final SubLObject uia_anything_on_crumb_trailP_alt(SubLObject v_agenda) {
        return makeBoolean((NIL != list_utilities.sublisp_boolean(uia_get_terms_on_crumb_trail(v_agenda))) || (NIL != list_utilities.sublisp_boolean(uia_get_facts_on_crumb_trail(v_agenda))));
    }

    public static SubLObject uia_anything_on_crumb_trailP(final SubLObject v_agenda) {
        return makeBoolean((NIL != list_utilities.sublisp_boolean(uia_get_terms_on_crumb_trail(v_agenda))) || (NIL != list_utilities.sublisp_boolean(uia_get_facts_on_crumb_trail(v_agenda))));
    }

    public static final SubLObject uia_remove_term_from_crumb_trail_alt(SubLObject v_agenda, SubLObject v_term) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            return uia_remove_crumb_trail_term(crumb_trail, v_term);
        }
    }

    public static SubLObject uia_remove_term_from_crumb_trail(final SubLObject v_agenda, final SubLObject v_term) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_term(crumb_trail, v_term);
    }

    public static final SubLObject uia_remove_fact_from_crumb_trail_alt(SubLObject v_agenda, SubLObject fact) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            return uia_remove_crumb_trail_fact(crumb_trail, fact);
        }
    }

    public static SubLObject uia_remove_fact_from_crumb_trail(final SubLObject v_agenda, final SubLObject fact) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_fact(crumb_trail, fact);
    }

    public static final SubLObject uia_remove_question_from_crumb_trail_alt(SubLObject v_agenda, SubLObject v_question) {
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            return uia_remove_crumb_trail_question(crumb_trail, v_question);
        }
    }

    public static SubLObject uia_remove_question_from_crumb_trail(final SubLObject v_agenda, final SubLObject v_question) {
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        return uia_remove_crumb_trail_question(crumb_trail, v_question);
    }

    public static final SubLObject uia_shorten_crumb_trail_to_alt(SubLObject v_agenda, SubLObject how_many) {
        if (how_many == UNPROVIDED) {
            how_many = TEN_INTEGER;
        }
        {
            SubLObject crumb_trail = uia_crumb_trail(v_agenda);
            uia_shorten_term_crumb_trail(crumb_trail, how_many);
            uia_shorten_fact_crumb_trail(crumb_trail, how_many);
            uia_shorten_question_crumb_trail(crumb_trail, how_many);
        }
        return v_agenda;
    }

    public static SubLObject uia_shorten_crumb_trail_to(final SubLObject v_agenda, SubLObject how_many) {
        if (how_many == UNPROVIDED) {
            how_many = TEN_INTEGER;
        }
        final SubLObject crumb_trail = uia_crumb_trail(v_agenda);
        uia_shorten_term_crumb_trail(crumb_trail, how_many);
        uia_shorten_fact_crumb_trail(crumb_trail, how_many);
        uia_shorten_question_crumb_trail(crumb_trail, how_many);
        return v_agenda;
    }

    /**
     * Create a new user interaction meta agenda with PLIST as initial state.
     */
    @LispMethod(comment = "Create a new user interaction meta agenda with PLIST as initial state.")
    public static final SubLObject uima_act_create_alt(SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject meta_agenda = new_uima();
            uima_initialize_state(meta_agenda, plist);
            return meta_agenda;
        }
    }

    @LispMethod(comment = "Create a new user interaction meta agenda with PLIST as initial state.")
    public static SubLObject uima_act_create(SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject meta_agenda = new_uima();
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }

    /**
     * Change the current focus of META-AGENDA to AGENDA.
     */
    @LispMethod(comment = "Change the current focus of META-AGENDA to AGENDA.")
    public static final SubLObject uima_act_focus_alt(SubLObject meta_agenda, SubLObject v_agenda) {
        uima_note_current_agenda(meta_agenda, v_agenda);
        return meta_agenda;
    }

    @LispMethod(comment = "Change the current focus of META-AGENDA to AGENDA.")
    public static SubLObject uima_act_focus(final SubLObject meta_agenda, final SubLObject v_agenda) {
        uima_note_current_agenda(meta_agenda, v_agenda);
        return meta_agenda;
    }

    /**
     * Create a new user interaction agenda under META-AGENDA with PLIST as initial state.
     */
    @LispMethod(comment = "Create a new user interaction agenda under META-AGENDA with PLIST as initial state.")
    public static final SubLObject uia_act_create_alt(SubLObject meta_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject v_agenda = new_uia(meta_agenda);
            uia_initialize_state(v_agenda, plist);
            uima_add_open_agenda(meta_agenda, v_agenda);
            return v_agenda;
        }
    }

    @LispMethod(comment = "Create a new user interaction agenda under META-AGENDA with PLIST as initial state.")
    public static SubLObject uia_act_create(final SubLObject meta_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject v_agenda = new_uia(meta_agenda);
        uia_initialize_state(v_agenda, plist);
        uima_add_open_agenda(meta_agenda, v_agenda);
        return v_agenda;
    }

    /**
     * Perform the standard initialization population of a new AGENDA.
     */
    @LispMethod(comment = "Perform the standard initialization population of a new AGENDA.")
    public static final SubLObject uia_act_standard_initialization_alt(SubLObject v_agenda) {
        uia_act_new_interaction(v_agenda, $REQUIRED, $INITIALIZER, UNPROVIDED, UNPROVIDED);
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return v_agenda;
    }

    @LispMethod(comment = "Perform the standard initialization population of a new AGENDA.")
    public static SubLObject uia_act_standard_initialization(final SubLObject v_agenda) {
        uia_act_new_interaction(v_agenda, $REQUIRED, $INITIALIZER, UNPROVIDED, UNPROVIDED);
        rtp_datastructures.reset_all_rtp_datastructure_caches();
        return v_agenda;
    }

    /**
     * Reset META-AGENDA to a state with no agendas and with PLIST as initial state.
     */
    @LispMethod(comment = "Reset META-AGENDA to a state with no agendas and with PLIST as initial state.")
    public static final SubLObject uima_act_reset_alt(SubLObject meta_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        meta_agenda = uima_reset(meta_agenda);
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }

    @LispMethod(comment = "Reset META-AGENDA to a state with no agendas and with PLIST as initial state.")
    public static SubLObject uima_act_reset(SubLObject meta_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        meta_agenda = uima_reset(meta_agenda);
        uima_initialize_state(meta_agenda, plist);
        return meta_agenda;
    }

    /**
     * Reset AGENDA to a state with no interactions and with PLIST as initial state.
     */
    @LispMethod(comment = "Reset AGENDA to a state with no interactions and with PLIST as initial state.")
    public static final SubLObject uia_act_reset_alt(SubLObject v_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        v_agenda = uia_reset(v_agenda);
        uia_initialize_state(v_agenda, plist);
        return v_agenda;
    }

    @LispMethod(comment = "Reset AGENDA to a state with no interactions and with PLIST as initial state.")
    public static SubLObject uia_act_reset(SubLObject v_agenda, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        v_agenda = uia_reset(v_agenda);
        uia_initialize_state(v_agenda, plist);
        return v_agenda;
    }

    /**
     * Clear the memoization caches of AGENDA.
     */
    @LispMethod(comment = "Clear the memoization caches of AGENDA.")
    public static final SubLObject uia_act_clear_memoization_alt(SubLObject v_agenda) {
        uia_clear_memoization_state(v_agenda);
        return v_agenda;
    }

    @LispMethod(comment = "Clear the memoization caches of AGENDA.")
    public static SubLObject uia_act_clear_memoization(final SubLObject v_agenda) {
        uia_clear_memoization_state(v_agenda);
        return v_agenda;
    }

    public static final SubLObject uia_launch_action_in_frame_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject frame = NIL;
            SubLObject v_agenda = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt218);
            frame = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt218);
            v_agenda = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(UIA_SCHEDULE_FRAME_FOR_REFRESH, v_agenda, frame), bq_cons(PROGN, append(body, NIL)));
            }
        }
    }

    public static SubLObject uia_launch_action_in_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject frame = NIL;
        SubLObject v_agenda = NIL;
        destructuring_bind_must_consp(current, datum, $list224);
        frame = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list224);
        v_agenda = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(UIA_SCHEDULE_FRAME_FOR_REFRESH, v_agenda, frame), bq_cons(PROGN, append(body, NIL)));
    }

    /**
     * Add to AGENDA a new MODE interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.
     */
    @LispMethod(comment = "Add to AGENDA a new MODE interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.")
    public static final SubLObject uia_act_new_interaction_alt(SubLObject v_agenda, SubLObject mode, SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = new_ui(v_agenda, mode, operator, args);
                ui_note_state(interaction, ui_state_plist_to_state(plist));
                if (NIL != uia_macros.$focused_uia_interaction$.getDynamicValue(thread)) {
                    ui_state_update(interaction, $FOCUSED_INTERACTION, T);
                }
                ui_note_status(interaction, $PENDING);
                uia_classify(v_agenda, interaction);
                return interaction;
            }
        }
    }

    @LispMethod(comment = "Add to AGENDA a new MODE interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.")
    public static SubLObject uia_act_new_interaction(final SubLObject v_agenda, final SubLObject mode, final SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject interaction = new_ui(v_agenda, mode, operator, args);
        ui_note_state(interaction, ui_state_plist_to_state(plist));
        ui_note_status(interaction, $PENDING);
        uia_classify(v_agenda, interaction);
        return interaction;
    }

    /**
     * Add to SUPER-INTERACTION a new sub-interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.
     * Its other properties are inherited from SUPER-INTERACTION.
     */
    @LispMethod(comment = "Add to SUPER-INTERACTION a new sub-interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.\r\nIts other properties are inherited from SUPER-INTERACTION.\nAdd to SUPER-INTERACTION a new sub-interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.\nIts other properties are inherited from SUPER-INTERACTION.")
    public static final SubLObject uia_act_new_sub_interaction_alt(SubLObject super_interaction, SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject super_agenda = ui_agenda(super_interaction);
            SubLObject super_mode = ui_mode(super_interaction);
            SubLObject super_status = ui_status(super_interaction);
            SubLObject sub_interaction = new_ui(super_agenda, super_mode, operator, args);
            ui_note_state(sub_interaction, ui_state_plist_to_state(plist));
            ui_note_status(sub_interaction, super_status);
            ui_note_super_interaction(sub_interaction, super_interaction);
            ui_add_sub_interaction(super_interaction, sub_interaction);
            return sub_interaction;
        }
    }

    @LispMethod(comment = "Add to SUPER-INTERACTION a new sub-interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.\r\nIts other properties are inherited from SUPER-INTERACTION.\nAdd to SUPER-INTERACTION a new sub-interaction of type OPERATOR parametrized by ARGS with PLIST as initial state.\nIts other properties are inherited from SUPER-INTERACTION.")
    public static SubLObject uia_act_new_sub_interaction(final SubLObject super_interaction, final SubLObject operator, SubLObject args, SubLObject plist) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject super_agenda = ui_agenda(super_interaction);
        final SubLObject super_mode = ui_mode(super_interaction);
        final SubLObject super_status = ui_status(super_interaction);
        final SubLObject sub_interaction = new_ui(super_agenda, super_mode, operator, args);
        ui_note_state(sub_interaction, ui_state_plist_to_state(plist));
        ui_note_status(sub_interaction, super_status);
        ui_note_super_interaction(sub_interaction, super_interaction);
        ui_add_sub_interaction(super_interaction, sub_interaction);
        return sub_interaction;
    }

    /**
     * Within AGENDA, note that CHILD is a dependent interaction of PARENT.
     */
    @LispMethod(comment = "Within AGENDA, note that CHILD is a dependent interaction of PARENT.")
    public static final SubLObject uia_act_add_dependent_alt(SubLObject v_agenda, SubLObject parent, SubLObject child) {
        ui_note_parent(child, parent);
        ui_add_child(parent, child);
        ui_note_status(parent, $BLOCKED);
        return parent;
    }

    @LispMethod(comment = "Within AGENDA, note that CHILD is a dependent interaction of PARENT.")
    public static SubLObject uia_act_add_dependent(final SubLObject v_agenda, final SubLObject parent, final SubLObject child) {
        ui_note_parent(child, parent);
        ui_add_child(parent, child);
        ui_note_status(parent, $BLOCKED);
        return parent;
    }

    public static final SubLObject uia_act_new_acknowledge_message_alt(SubLObject v_agenda, SubLObject message) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $ACKNOWLEDGE_MESSAGE, list(message), UNPROVIDED);
    }

    public static SubLObject uia_act_new_acknowledge_message(final SubLObject v_agenda, final SubLObject message) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $ACKNOWLEDGE_MESSAGE, list(message), UNPROVIDED);
    }

    public static final SubLObject uia_act_new_timed_acknowledge_message_alt(SubLObject v_agenda, SubLObject message, SubLObject secs) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $ACKNOWLEDGE_MESSAGE, list(message, secs), UNPROVIDED);
    }

    public static SubLObject uia_act_new_timed_acknowledge_message(final SubLObject v_agenda, final SubLObject message, final SubLObject secs) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $ACKNOWLEDGE_MESSAGE, list(message, secs), UNPROVIDED);
    }

    /**
     * Add to AGENDA an interaction to acknowledge a message that says MESSAGE-STRING.
     */
    @LispMethod(comment = "Add to AGENDA an interaction to acknowledge a message that says MESSAGE-STRING.")
    public static final SubLObject uia_act_new_message_alt(SubLObject v_agenda, SubLObject message_string) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $MESSAGE, list(message_string), UNPROVIDED);
    }

    @LispMethod(comment = "Add to AGENDA an interaction to acknowledge a message that says MESSAGE-STRING.")
    public static SubLObject uia_act_new_message(final SubLObject v_agenda, final SubLObject message_string) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $MESSAGE, list(message_string), UNPROVIDED);
    }

    /**
     * Question that goes away basically immediately.
     */
    @LispMethod(comment = "Question that goes away basically immediately.")
    public static final SubLObject uia_act_new_quick_message_alt(SubLObject v_agenda, SubLObject message_string) {
        return uia_act_new_timed_message(v_agenda, message_string, ONE_INTEGER);
    }

    @LispMethod(comment = "Question that goes away basically immediately.")
    public static SubLObject uia_act_new_quick_message(final SubLObject v_agenda, final SubLObject message_string) {
        return uia_act_new_timed_message(v_agenda, message_string, ONE_INTEGER);
    }

    /**
     * Add to AGENDA an interaction to show a message that says MESSAGE-STRING and goes
     * away after SECs seconds.
     */
    @LispMethod(comment = "Add to AGENDA an interaction to show a message that says MESSAGE-STRING and goes\r\naway after SECs seconds.\nAdd to AGENDA an interaction to show a message that says MESSAGE-STRING and goes\naway after SECs seconds.")
    public static final SubLObject uia_act_new_timed_message_alt(SubLObject v_agenda, SubLObject message_string, SubLObject secs) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $MESSAGE, list(message_string, secs), UNPROVIDED);
    }

    @LispMethod(comment = "Add to AGENDA an interaction to show a message that says MESSAGE-STRING and goes\r\naway after SECs seconds.\nAdd to AGENDA an interaction to show a message that says MESSAGE-STRING and goes\naway after SECs seconds.")
    public static SubLObject uia_act_new_timed_message(final SubLObject v_agenda, final SubLObject message_string, final SubLObject secs) {
        return uia_act_new_interaction(v_agenda, $MESSAGE, $MESSAGE, list(message_string, secs), UNPROVIDED);
    }

    /**
     * Add to AGENDA a comment that says COMMENT-STRING.
     */
    @LispMethod(comment = "Add to AGENDA a comment that says COMMENT-STRING.")
    public static final SubLObject uia_act_new_comment_alt(SubLObject v_agenda, SubLObject comment_string) {
        return uia_act_new_interaction(v_agenda, $COMMENT, $MESSAGE, list(comment_string), UNPROVIDED);
    }

    @LispMethod(comment = "Add to AGENDA a comment that says COMMENT-STRING.")
    public static SubLObject uia_act_new_comment(final SubLObject v_agenda, final SubLObject comment_string) {
        return uia_act_new_interaction(v_agenda, $COMMENT, $MESSAGE, list(comment_string), UNPROVIDED);
    }

    public static final SubLObject ui_request_p_alt(SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject datum = v_object;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject action_type = NIL;
                SubLObject signature = NIL;
                SubLObject plist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt226);
                operator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt226);
                action_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt226);
                signature = current.first();
                current = current.rest();
                plist = current;
                return makeBoolean((((NIL != ui_signature_p(signature)) && (NIL != ui_operator_p(operator))) && (NIL != ui_action_type_p(action_type))) && (NIL != list_utilities.property_list_p(plist)));
            }
        }
        return NIL;
    }

    public static SubLObject ui_request_p(final SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) {
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject signature = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list228);
            operator = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list228);
            action_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list228);
            signature = current.first();
            current = plist = current.rest();
            return makeBoolean((((NIL != ui_signature_p(signature)) && (NIL != ui_operator_p(operator))) && (NIL != ui_action_type_p(action_type))) && (NIL != list_utilities.property_list_p(plist)));
        }
        return NIL;
    }

    public static final SubLObject invalid_ui_signature_alt() {
        return $invalid_ui_signature$.getGlobalValue();
    }

    public static SubLObject invalid_ui_signature() {
        return $invalid_ui_signature$.getGlobalValue();
    }

    public static final SubLObject valid_ui_request_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != ui_request_p(v_object)) && (!v_object.equal($invalid_ui_request$.getGlobalValue())));
    }

    public static SubLObject valid_ui_request_p(final SubLObject v_object) {
        return makeBoolean((NIL != ui_request_p(v_object)) && (!v_object.equal($invalid_ui_request$.getGlobalValue())));
    }

    public static final SubLObject ui_action_type_p_alt(SubLObject v_object) {
        return keywordp(v_object);
    }

    public static SubLObject ui_action_type_p(final SubLObject v_object) {
        return keywordp(v_object);
    }

    public static final SubLObject make_ui_request_alt(SubLObject interaction, SubLObject action_type, SubLObject plist) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(action_type, UI_ACTION_TYPE_P);
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return listS(ui_operator(interaction), action_type, ui_signature(interaction), plist);
    }

    public static SubLObject make_ui_request(final SubLObject interaction, final SubLObject action_type, final SubLObject plist) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != ui_action_type_p(action_type) : "! user_interaction_agenda.ui_action_type_p(action_type) " + ("user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) ") + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return listS(ui_operator(interaction), action_type, ui_signature(interaction), plist);
    }

    public static final SubLObject make_empty_ui_request_alt() {
        return listS($EMPTY_AGENDA, $SHOW, invalid_ui_signature(), NIL);
    }

    public static SubLObject make_empty_ui_request() {
        return listS($EMPTY_AGENDA, $SHOW, invalid_ui_signature(), NIL);
    }

    public static final SubLObject make_invalid_ui_request_alt() {
        return $invalid_ui_request$.getGlobalValue();
    }

    public static SubLObject make_invalid_ui_request() {
        return $invalid_ui_request$.getGlobalValue();
    }

    public static final SubLObject make_ui_reply_with_interaction_alt(SubLObject interaction, SubLObject action_type, SubLObject plist) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        SubLTrampolineFile.checkType(action_type, UI_ACTION_TYPE_P);
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return listS(ui_operator(interaction), action_type, $SIGNATURE, ui_signature(interaction), plist);
    }

    public static SubLObject make_ui_reply_with_interaction(final SubLObject interaction, final SubLObject action_type, final SubLObject plist) {
        assert NIL != user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        assert NIL != ui_action_type_p(action_type) : "! user_interaction_agenda.ui_action_type_p(action_type) " + ("user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) ") + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return listS(ui_operator(interaction), action_type, $SIGNATURE, ui_signature(interaction), plist);
    }

    public static final SubLObject make_ui_reply_with_agenda_alt(SubLObject v_agenda, SubLObject operator, SubLObject action_type, SubLObject plist) {
        SubLTrampolineFile.checkType(v_agenda, USER_INTERACTION_AGENDA_P);
        SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
        SubLTrampolineFile.checkType(action_type, UI_ACTION_TYPE_P);
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return listS(operator, action_type, $AGENDA_SIGNATURE, uia_signature(v_agenda), plist);
    }

    public static SubLObject make_ui_reply_with_agenda(final SubLObject v_agenda, final SubLObject operator, final SubLObject action_type, final SubLObject plist) {
        assert NIL != user_interaction_agenda_p(v_agenda) : "! user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + ("user_interaction_agenda.user_interaction_agenda_p(v_agenda) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_agenda_p(v_agenda) ") + v_agenda;
        assert NIL != ui_operator_p(operator) : "! user_interaction_agenda.ui_operator_p(operator) " + ("user_interaction_agenda.ui_operator_p(operator) " + "CommonSymbols.NIL != user_interaction_agenda.ui_operator_p(operator) ") + operator;
        assert NIL != ui_action_type_p(action_type) : "! user_interaction_agenda.ui_action_type_p(action_type) " + ("user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) ") + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return listS(operator, action_type, $AGENDA_SIGNATURE, uia_signature(v_agenda), plist);
    }

    public static final SubLObject make_ui_reply_alt(SubLObject operator, SubLObject action_type, SubLObject plist) {
        SubLTrampolineFile.checkType(operator, UI_OPERATOR_P);
        SubLTrampolineFile.checkType(action_type, UI_ACTION_TYPE_P);
        SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
        return listS(operator, action_type, plist);
    }

    public static SubLObject make_ui_reply(final SubLObject operator, final SubLObject action_type, final SubLObject plist) {
        assert NIL != ui_operator_p(operator) : "! user_interaction_agenda.ui_operator_p(operator) " + ("user_interaction_agenda.ui_operator_p(operator) " + "CommonSymbols.NIL != user_interaction_agenda.ui_operator_p(operator) ") + operator;
        assert NIL != ui_action_type_p(action_type) : "! user_interaction_agenda.ui_action_type_p(action_type) " + ("user_interaction_agenda.ui_action_type_p(action_type) " + "CommonSymbols.NIL != user_interaction_agenda.ui_action_type_p(action_type) ") + action_type;
        assert NIL != list_utilities.property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        return listS(operator, action_type, plist);
    }

    public static final SubLObject uia_glob_alt(SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $GLOB, $UNINITIALIZED_GLOB);
    }

    public static SubLObject uia_glob(final SubLObject v_agenda) {
        return uia_state_lookup(v_agenda, $GLOB, $UNINITIALIZED_GLOB);
    }

    public static final SubLObject uia_glob_reset_alt(SubLObject v_agenda) {
        {
            SubLObject v_glob = glob.new_glob(symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            glob.glob_note_owner(v_glob, v_agenda);
            uia_state_update(v_agenda, $GLOB, v_glob);
        }
        return NIL;
    }

    public static SubLObject uia_glob_reset(final SubLObject v_agenda) {
        final SubLObject v_glob = glob.new_glob(symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        glob.glob_note_owner(v_glob, v_agenda);
        uia_state_update(v_agenda, $GLOB, v_glob);
        return NIL;
    }

    public static final SubLObject uia_glob_add_alt(SubLObject v_agenda, SubLObject v_object) {
        {
            SubLObject v_glob = uia_glob(v_agenda);
            return glob.glob_enter(v_glob, v_object);
        }
    }

    public static SubLObject uia_glob_add(final SubLObject v_agenda, final SubLObject v_object) {
        final SubLObject v_glob = uia_glob(v_agenda);
        return glob.glob_enter(v_glob, v_object);
    }

    public static final SubLObject uia_glob_remove_alt(SubLObject v_agenda, SubLObject id) {
        {
            SubLObject v_glob = uia_glob(v_agenda);
            glob.glob_remove_id(v_glob, id);
        }
        return NIL;
    }

    public static SubLObject uia_glob_remove(final SubLObject v_agenda, final SubLObject id) {
        final SubLObject v_glob = uia_glob(v_agenda);
        glob.glob_remove_id(v_glob, id);
        return NIL;
    }

    public static final SubLObject uia_glob_lookup_alt(SubLObject v_agenda, SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject v_glob = uia_glob(v_agenda);
            return glob.glob_lookup(v_glob, id, v_default);
        }
    }

    public static SubLObject uia_glob_lookup(final SubLObject v_agenda, final SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject v_glob = uia_glob(v_agenda);
        return glob.glob_lookup(v_glob, id, v_default);
    }

    public static final SubLObject uia_glob_pop_alt(SubLObject v_agenda, SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject v_object = uia_glob_lookup(v_agenda, id, v_default);
            uia_glob_remove(v_agenda, id);
            return v_object;
        }
    }

    public static SubLObject uia_glob_pop(final SubLObject v_agenda, final SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject v_object = uia_glob_lookup(v_agenda, id, v_default);
        uia_glob_remove(v_agenda, id);
        return v_object;
    }

    public static final SubLObject uia_glob_remove_by_id_string_alt(SubLObject v_agenda, SubLObject id_string) {
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return uia_glob_remove(v_agenda, id);
        }
    }

    public static SubLObject uia_glob_remove_by_id_string(final SubLObject v_agenda, final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uia_glob_remove(v_agenda, id);
    }

    public static final SubLObject uia_glob_lookup_by_id_string_alt(SubLObject v_agenda, SubLObject id_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return uia_glob_lookup(v_agenda, id, v_default);
        }
    }

    public static SubLObject uia_glob_lookup_by_id_string(final SubLObject v_agenda, final SubLObject id_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uia_glob_lookup(v_agenda, id, v_default);
    }

    public static final SubLObject uia_glob_pop_by_id_string_alt(SubLObject v_agenda, SubLObject id_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return uia_glob_pop(v_agenda, id, v_default);
        }
    }

    public static SubLObject uia_glob_pop_by_id_string(final SubLObject v_agenda, final SubLObject id_string, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uia_glob_pop(v_agenda, id, v_default);
    }

    public static final SubLObject declare_user_interaction_agenda_file_alt() {
        declareMacro("with_uia_lock", "WITH-UIA-LOCK");
        declareFunction("user_interaction_mode_p", "USER-INTERACTION-MODE-P", 1, 0, false);
        declareFunction("user_interaction_status_p", "USER-INTERACTION-STATUS-P", 1, 0, false);
        declareFunction("ui_operator_p", "UI-OPERATOR-P", 1, 0, false);
        declareFunction("user_interaction_print_function_trampoline", "USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_interaction_p", "USER-INTERACTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_p$UnaryFunction();
        declareFunction("ui_id", "UI-ID", 1, 0, false);
        declareFunction("ui_agenda", "UI-AGENDA", 1, 0, false);
        declareFunction("ui_mode", "UI-MODE", 1, 0, false);
        declareFunction("ui_status", "UI-STATUS", 1, 0, false);
        declareFunction("ui_start_time", "UI-START-TIME", 1, 0, false);
        declareFunction("ui_finish_time", "UI-FINISH-TIME", 1, 0, false);
        declareFunction("ui_parent_interaction", "UI-PARENT-INTERACTION", 1, 0, false);
        declareFunction("ui_child_interactions", "UI-CHILD-INTERACTIONS", 1, 0, false);
        declareFunction("ui_operator", "UI-OPERATOR", 1, 0, false);
        declareFunction("ui_args", "UI-ARGS", 1, 0, false);
        declareFunction("ui_result", "UI-RESULT", 1, 0, false);
        declareFunction("ui_state", "UI-STATE", 1, 0, false);
        declareFunction("_csetf_ui_id", "_CSETF-UI-ID", 2, 0, false);
        declareFunction("_csetf_ui_agenda", "_CSETF-UI-AGENDA", 2, 0, false);
        declareFunction("_csetf_ui_mode", "_CSETF-UI-MODE", 2, 0, false);
        declareFunction("_csetf_ui_status", "_CSETF-UI-STATUS", 2, 0, false);
        declareFunction("_csetf_ui_start_time", "_CSETF-UI-START-TIME", 2, 0, false);
        declareFunction("_csetf_ui_finish_time", "_CSETF-UI-FINISH-TIME", 2, 0, false);
        declareFunction("_csetf_ui_parent_interaction", "_CSETF-UI-PARENT-INTERACTION", 2, 0, false);
        declareFunction("_csetf_ui_child_interactions", "_CSETF-UI-CHILD-INTERACTIONS", 2, 0, false);
        declareFunction("_csetf_ui_operator", "_CSETF-UI-OPERATOR", 2, 0, false);
        declareFunction("_csetf_ui_args", "_CSETF-UI-ARGS", 2, 0, false);
        declareFunction("_csetf_ui_result", "_CSETF-UI-RESULT", 2, 0, false);
        declareFunction("_csetf_ui_state", "_CSETF-UI-STATE", 2, 0, false);
        declareFunction("make_user_interaction", "MAKE-USER-INTERACTION", 0, 1, false);
        declareFunction("sxhash_user_interaction_method", "SXHASH-USER-INTERACTION-METHOD", 1, 0, false);
        declareFunction("print_user_interaction", "PRINT-USER-INTERACTION", 3, 0, false);
        declareFunction("new_ui", "NEW-UI", 3, 1, false);
        declareFunction("ui_note_mode", "UI-NOTE-MODE", 2, 0, false);
        declareFunction("ui_note_status", "UI-NOTE-STATUS", 2, 0, false);
        declareFunction("ui_note_start_time", "UI-NOTE-START-TIME", 2, 0, false);
        declareFunction("ui_note_finish_time", "UI-NOTE-FINISH-TIME", 2, 0, false);
        declareFunction("ui_note_parent", "UI-NOTE-PARENT", 2, 0, false);
        declareFunction("ui_add_child", "UI-ADD-CHILD", 2, 0, false);
        declareFunction("ui_note_result", "UI-NOTE-RESULT", 2, 0, false);
        declareFunction("ui_note_state", "UI-NOTE-STATE", 2, 0, false);
        declareFunction("user_interaction_agenda_print_function_trampoline", "USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_interaction_agenda_p", "USER-INTERACTION-AGENDA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_agenda_p$UnaryFunction();
        declareFunction("uia_id", "UIA-ID", 1, 0, false);
        declareFunction("uia_meta_agenda", "UIA-META-AGENDA", 1, 0, false);
        declareFunction("uia_isg", "UIA-ISG", 1, 0, false);
        declareFunction("uia_index", "UIA-INDEX", 1, 0, false);
        declareFunction("uia_history", "UIA-HISTORY", 1, 0, false);
        declareFunction("uia_undos", "UIA-UNDOS", 1, 0, false);
        declareFunction("uia_messages", "UIA-MESSAGES", 1, 0, false);
        declareFunction("uia_requirements", "UIA-REQUIREMENTS", 1, 0, false);
        declareFunction("uia_relevant_suggestions", "UIA-RELEVANT-SUGGESTIONS", 1, 0, false);
        declareFunction("uia_possible_suggestions", "UIA-POSSIBLE-SUGGESTIONS", 1, 0, false);
        declareFunction("uia_comments", "UIA-COMMENTS", 1, 0, false);
        declareFunction("uia_state", "UIA-STATE", 1, 0, false);
        declareFunction("_csetf_uia_id", "_CSETF-UIA-ID", 2, 0, false);
        declareFunction("_csetf_uia_meta_agenda", "_CSETF-UIA-META-AGENDA", 2, 0, false);
        declareFunction("_csetf_uia_isg", "_CSETF-UIA-ISG", 2, 0, false);
        declareFunction("_csetf_uia_index", "_CSETF-UIA-INDEX", 2, 0, false);
        declareFunction("_csetf_uia_history", "_CSETF-UIA-HISTORY", 2, 0, false);
        declareFunction("_csetf_uia_undos", "_CSETF-UIA-UNDOS", 2, 0, false);
        declareFunction("_csetf_uia_messages", "_CSETF-UIA-MESSAGES", 2, 0, false);
        declareFunction("_csetf_uia_requirements", "_CSETF-UIA-REQUIREMENTS", 2, 0, false);
        declareFunction("_csetf_uia_relevant_suggestions", "_CSETF-UIA-RELEVANT-SUGGESTIONS", 2, 0, false);
        declareFunction("_csetf_uia_possible_suggestions", "_CSETF-UIA-POSSIBLE-SUGGESTIONS", 2, 0, false);
        declareFunction("_csetf_uia_comments", "_CSETF-UIA-COMMENTS", 2, 0, false);
        declareFunction("_csetf_uia_state", "_CSETF-UIA-STATE", 2, 0, false);
        declareFunction("make_user_interaction_agenda", "MAKE-USER-INTERACTION-AGENDA", 0, 1, false);
        declareFunction("sxhash_user_interaction_agenda_method", "SXHASH-USER-INTERACTION-AGENDA-METHOD", 1, 0, false);
        declareFunction("print_user_interaction_agenda", "PRINT-USER-INTERACTION-AGENDA", 3, 0, false);
        declareFunction("new_uia", "NEW-UIA", 1, 0, false);
        declareFunction("uia_reset", "UIA-RESET", 1, 0, false);
        declareFunction("uia_find_by_id", "UIA-FIND-BY-ID", 2, 0, false);
        declareFunction("uia_find_by_id_string", "UIA-FIND-BY-ID-STRING", 2, 0, false);
        declareFunction("uia_some_interaction_p", "UIA-SOME-INTERACTION-P", 1, 0, false);
        declareFunction("uia_interaction_sequence", "UIA-INTERACTION-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_history_p", "UIA-SOME-HISTORY-P", 1, 0, false);
        declareFunction("uia_history_sequence", "UIA-HISTORY-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_undo_p", "UIA-SOME-UNDO-P", 1, 0, false);
        declareFunction("uia_undo_sequence", "UIA-UNDO-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_message_p", "UIA-SOME-MESSAGE-P", 1, 0, false);
        declareFunction("uia_message_sequence", "UIA-MESSAGE-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_requirement_p", "UIA-SOME-REQUIREMENT-P", 1, 0, false);
        declareFunction("uia_requirement_sequence", "UIA-REQUIREMENT-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_relevant_suggestion_p", "UIA-SOME-RELEVANT-SUGGESTION-P", 1, 0, false);
        declareFunction("uia_relevant_suggestion_sequence", "UIA-RELEVANT-SUGGESTION-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_possible_suggestion_p", "UIA-SOME-POSSIBLE-SUGGESTION-P", 1, 0, false);
        declareFunction("uia_possible_suggestion_sequence", "UIA-POSSIBLE-SUGGESTION-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_comment_p", "UIA-SOME-COMMENT-P", 1, 0, false);
        declareFunction("uia_comment_sequence", "UIA-COMMENT-SEQUENCE", 1, 0, false);
        declareFunction("uia_default_operator", "UIA-DEFAULT-OPERATOR", 1, 0, false);
        declareFunction("uia_initialized_p", "UIA-INITIALIZED-P", 1, 0, false);
        declareFunction("uia_add_to_index", "UIA-ADD-TO-INDEX", 3, 0, false);
        declareFunction("uia_add_to_history", "UIA-ADD-TO-HISTORY", 2, 0, false);
        declareFunction("uia_clear_undos", "UIA-CLEAR-UNDOS", 1, 0, false);
        declareFunction("uia_add_undo", "UIA-ADD-UNDO", 2, 0, false);
        declareFunction("uia_rem_undo", "UIA-REM-UNDO", 2, 0, false);
        declareFunction("uia_add_message", "UIA-ADD-MESSAGE", 2, 0, false);
        declareFunction("uia_rem_message", "UIA-REM-MESSAGE", 2, 0, false);
        declareFunction("uia_add_requirement", "UIA-ADD-REQUIREMENT", 2, 0, false);
        declareFunction("uia_rem_requirement", "UIA-REM-REQUIREMENT", 2, 0, false);
        declareFunction("uia_add_relevant_suggestion", "UIA-ADD-RELEVANT-SUGGESTION", 2, 0, false);
        declareFunction("uia_rem_relevant_suggestion", "UIA-REM-RELEVANT-SUGGESTION", 2, 0, false);
        declareFunction("uia_add_possible_suggestion", "UIA-ADD-POSSIBLE-SUGGESTION", 2, 0, false);
        declareFunction("uia_rem_possible_suggestion", "UIA-REM-POSSIBLE-SUGGESTION", 2, 0, false);
        declareFunction("uia_add_comment", "UIA-ADD-COMMENT", 2, 0, false);
        declareFunction("uia_rem_comment", "UIA-REM-COMMENT", 2, 0, false);
        declareFunction("uia_clear_comments", "UIA-CLEAR-COMMENTS", 1, 0, false);
        declareFunction("uia_background_task_p", "UIA-BACKGROUND-TASK-P", 1, 0, false);
        declareFunction("uia_can_treat_comments_as_mumblingP", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?", 0, 0, false);
        declareFunction("uia_cannot_treat_comments_as_mumbling", "UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        declareFunction("uia_can_treat_comments_as_mumbling", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        declareFunction("uia_process_new_comment", "UIA-PROCESS-NEW-COMMENT", 2, 0, false);
        declareFunction("uia_treat_comments_as_mumbling", "UIA-TREAT-COMMENTS-AS-MUMBLING", 1, 0, false);
        declareFunction("uia_convert_comment_to_mumble", "UIA-CONVERT-COMMENT-TO-MUMBLE", 2, 0, false);
        declareFunction("uia_classify", "UIA-CLASSIFY", 2, 0, false);
        declareFunction("uia_declassify", "UIA-DECLASSIFY", 2, 0, false);
        declareFunction("uia_note_state", "UIA-NOTE-STATE", 2, 0, false);
        declareFunction("uia_global_id_string", "UIA-GLOBAL-ID-STRING", 1, 0, false);
        declareFunction("uia_from_ids", "UIA-FROM-IDS", 2, 0, false);
        declareFunction("uia_give_current_topic_and_name", "UIA-GIVE-CURRENT-TOPIC-AND-NAME", 1, 0, false);
        declareFunction("uia_determine_superior_topic_identification", "UIA-DETERMINE-SUPERIOR-TOPIC-IDENTIFICATION", 1, 0, false);
        declareMacro("do_uias", "DO-UIAS");
        declareMacro("do_uis", "DO-UIS");
        declareFunction("uia_language_parsing_mt", "UIA-LANGUAGE-PARSING-MT", 1, 0, false);
        declareFunction("uia_language_parsing_mt_update", "UIA-LANGUAGE-PARSING-MT-UPDATE", 2, 0, false);
        declareFunction("uia_language_generation_mt", "UIA-LANGUAGE-GENERATION-MT", 1, 0, false);
        declareFunction("uia_language_generation_mt_update", "UIA-LANGUAGE-GENERATION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_language_lexical_mt", "UIA-LANGUAGE-LEXICAL-MT", 1, 0, false);
        declareFunction("uia_language_lexical_mt_update", "UIA-LANGUAGE-LEXICAL-MT-UPDATE", 2, 0, false);
        declareFunction("uia_domain_mt", "UIA-DOMAIN-MT", 1, 0, false);
        declareFunction("uia_domain_mt_update", "UIA-DOMAIN-MT-UPDATE", 2, 0, false);
        declareFunction("uia_parsing_mt", "UIA-PARSING-MT", 1, 0, false);
        declareFunction("uia_parsing_mt_update", "UIA-PARSING-MT-UPDATE", 2, 0, false);
        declareFunction("uia_generation_mt", "UIA-GENERATION-MT", 1, 1, false);
        declareFunction("uia_generation_mt_update", "UIA-GENERATION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_all_interaction_mts", "UIA-ALL-INTERACTION-MTS", 1, 1, false);
        declareFunction("uia_note_interaction_mt", "UIA-NOTE-INTERACTION-MT", 2, 0, false);
        declareFunction("uia_domain_interaction_mt", "UIA-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_domain_interaction_mt_update", "UIA-DOMAIN-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_parsing_interaction_mt", "UIA-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_parsing_interaction_mt_update", "UIA-PARSING-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_generation_interaction_mt", "UIA-GENERATION-INTERACTION-MT", 1, 1, false);
        declareFunction("uia_generation_language_mt", "UIA-GENERATION-LANGUAGE-MT", 1, 0, false);
        declareFunction("uia_generation_domain_mt", "UIA-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction("uia_generation_interaction_mt_update", "UIA-GENERATION-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_lexical_interaction_mt", "UIA-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_lexical_interaction_mt_update", "UIA-LEXICAL-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("ui_domain_interaction_mt", "UI-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("ui_parsing_interaction_mt", "UI-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction("ui_generation_interaction_mt", "UI-GENERATION-INTERACTION-MT", 1, 0, false);
        declareFunction("ui_generation_language_mt", "UI-GENERATION-LANGUAGE-MT", 1, 0, false);
        declareFunction("ui_generation_domain_mt", "UI-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction("ui_lexical_interaction_mt", "UI-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_ensure_scenario_interaction_mt", "UIA-ENSURE-SCENARIO-INTERACTION-MT", 1, 0, false);
        declareFunction("user_interaction_meta_agenda_print_function_trampoline", "USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_interaction_meta_agenda_p", "USER-INTERACTION-META-AGENDA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.user_interaction_agenda.$user_interaction_meta_agenda_p$UnaryFunction();
        declareFunction("uima_id", "UIMA-ID", 1, 0, false);
        declareFunction("uima_isg", "UIMA-ISG", 1, 0, false);
        declareFunction("uima_index", "UIMA-INDEX", 1, 0, false);
        declareFunction("uima_open_agendas", "UIMA-OPEN-AGENDAS", 1, 0, false);
        declareFunction("uima_current_agenda", "UIMA-CURRENT-AGENDA", 1, 0, false);
        declareFunction("uima_state", "UIMA-STATE", 1, 0, false);
        declareFunction("_csetf_uima_id", "_CSETF-UIMA-ID", 2, 0, false);
        declareFunction("_csetf_uima_isg", "_CSETF-UIMA-ISG", 2, 0, false);
        declareFunction("_csetf_uima_index", "_CSETF-UIMA-INDEX", 2, 0, false);
        declareFunction("_csetf_uima_open_agendas", "_CSETF-UIMA-OPEN-AGENDAS", 2, 0, false);
        declareFunction("_csetf_uima_current_agenda", "_CSETF-UIMA-CURRENT-AGENDA", 2, 0, false);
        declareFunction("_csetf_uima_state", "_CSETF-UIMA-STATE", 2, 0, false);
        declareFunction("make_user_interaction_meta_agenda", "MAKE-USER-INTERACTION-META-AGENDA", 0, 1, false);
        declareFunction("new_uima", "NEW-UIMA", 0, 0, false);
        declareFunction("uima_reset", "UIMA-RESET", 1, 0, false);
        declareFunction("uima_find_by_id", "UIMA-FIND-BY-ID", 2, 0, false);
        declareFunction("uima_find_by_id_string", "UIMA-FIND-BY-ID-STRING", 2, 0, false);
        declareFunction("uima_some_open_agendas_p", "UIMA-SOME-OPEN-AGENDAS-P", 1, 0, false);
        declareFunction("uima_open_agendas_sequence", "UIMA-OPEN-AGENDAS-SEQUENCE", 1, 0, false);
        declareFunction("uima_match_mt_to_agenda", "UIMA-MATCH-MT-TO-AGENDA", 2, 0, false);
        declareFunction("uima_add_to_index", "UIMA-ADD-TO-INDEX", 3, 0, false);
        declareFunction("uima_add_open_agenda", "UIMA-ADD-OPEN-AGENDA", 2, 0, false);
        declareFunction("uima_clear_current_agenda", "UIMA-CLEAR-CURRENT-AGENDA", 1, 0, false);
        declareFunction("uima_note_current_agenda", "UIMA-NOTE-CURRENT-AGENDA", 2, 0, false);
        declareFunction("uima_note_state", "UIMA-NOTE-STATE", 2, 0, false);
        declareMacro("do_uimas", "DO-UIMAS");
        declareFunction("system_uimma", "SYSTEM-UIMMA", 0, 0, false);
        declareFunction("uimma", "UIMMA", 0, 0, false);
        declareFunction("new_uimma", "NEW-UIMMA", 0, 0, false);
        declareFunction("uimma_reset", "UIMMA-RESET", 0, 0, false);
        declareFunction("uimma_new_id", "UIMMA-NEW-ID", 0, 0, false);
        declareFunction("uimma_add_to_index", "UIMMA-ADD-TO-INDEX", 2, 0, false);
        declareFunction("uimma_find_by_id", "UIMMA-FIND-BY-ID", 1, 0, false);
        declareFunction("uimma_find_by_user", "UIMMA-FIND-BY-USER", 1, 0, false);
        declareFunction("uimma_resolve_meta_agenda_id", "UIMMA-RESOLVE-META-AGENDA-ID", 1, 0, false);
        declareFunction("uimma_match_mts_to_agendas", "UIMMA-MATCH-MTS-TO-AGENDAS", 1, 1, false);
        declareFunction("uimma_default_locale", "UIMMA-DEFAULT-LOCALE", 0, 0, false);
        declareFunction("set_uimma_default_locale", "SET-UIMMA-DEFAULT-LOCALE", 1, 0, false);
        declareFunction("uimma_default_generation_mt", "UIMMA-DEFAULT-GENERATION-MT", 0, 0, false);
        declareFunction("set_uimma_default_generation_mt", "SET-UIMMA-DEFAULT-GENERATION-MT", 1, 0, false);
        declareFunction("uimma_default_domain_mt", "UIMMA-DEFAULT-DOMAIN-MT", 0, 0, false);
        declareFunction("set_uimma_default_domain_mt", "SET-UIMMA-DEFAULT-DOMAIN-MT", 1, 0, false);
        declareFunction("ui_meta_agenda", "UI-META-AGENDA", 1, 0, false);
        declareFunction("uia_total_interaction_count", "UIA-TOTAL-INTERACTION-COUNT", 1, 0, false);
        declareFunction("uia_finished_interaction_count", "UIA-FINISHED-INTERACTION-COUNT", 1, 0, false);
        declareFunction("ui_state_plist_to_state", "UI-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction("ui_state_lookup", "UI-STATE-LOOKUP", 2, 1, false);
        declareFunction("ui_state_update", "UI-STATE-UPDATE", 3, 0, false);
        declareFunction("ui_state_clear", "UI-STATE-CLEAR", 2, 0, false);
        declareFunction("ui_state_clear_all", "UI-STATE-CLEAR-ALL", 1, 0, false);
        declareFunction("uia_state_plist_to_state", "UIA-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction("uia_initialize_state", "UIA-INITIALIZE-STATE", 2, 0, false);
        declareFunction("uia_state_lookup", "UIA-STATE-LOOKUP", 2, 1, false);
        declareFunction("uia_state_update", "UIA-STATE-UPDATE", 3, 0, false);
        declareFunction("uia_state_clear", "UIA-STATE-CLEAR", 2, 0, false);
        declareFunction("uia_state_clear_all", "UIA-STATE-CLEAR-ALL", 1, 0, false);
        declareFunction("uima_state_plist_to_state", "UIMA-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction("uima_initialize_state", "UIMA-INITIALIZE-STATE", 2, 0, false);
        declareFunction("uima_state_lookup", "UIMA-STATE-LOOKUP", 2, 1, false);
        declareFunction("uima_state_update", "UIMA-STATE-UPDATE", 3, 0, false);
        declareFunction("uima_state_clear", "UIMA-STATE-CLEAR", 2, 0, false);
        declareFunction("uima_state_clear_all", "UIMA-STATE-CLEAR-ALL", 1, 0, false);
        declareMacro("with_uia_memoization_state", "WITH-UIA-MEMOIZATION-STATE");
        declareFunction("uia_memoization_state", "UIA-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uia_create_memoization_state", "UIA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uia_clear_memoization_state", "UIA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uia_clear_memoization_state_for_function", "UIA-CLEAR-MEMOIZATION-STATE-FOR-FUNCTION", 2, 0, false);
        declareMacro("with_uima_memoization_state", "WITH-UIMA-MEMOIZATION-STATE");
        declareFunction("uima_memoization_state", "UIMA-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uima_create_memoization_state", "UIMA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uima_clear_memoization_state", "UIMA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("ui_ancestor_interactions", "UI-ANCESTOR-INTERACTIONS", 1, 0, false);
        declareFunction("ui_pending_descendant_interactions", "UI-PENDING-DESCENDANT-INTERACTIONS", 1, 0, false);
        declareFunction("ui_pending_descendants_recursive", "UI-PENDING-DESCENDANTS-RECURSIVE", 2, 0, false);
        declareFunction("ui_virtual_parent_interaction", "UI-VIRTUAL-PARENT-INTERACTION", 1, 0, false);
        declareFunction("ui_virtual_ancestor_interactions", "UI-VIRTUAL-ANCESTOR-INTERACTIONS", 1, 0, false);
        declareFunction("ui_sub_interactions", "UI-SUB-INTERACTIONS", 1, 0, false);
        declareFunction("ui_super_interaction", "UI-SUPER-INTERACTION", 1, 0, false);
        declareFunction("ui_add_sub_interaction", "UI-ADD-SUB-INTERACTION", 2, 0, false);
        declareFunction("ui_remove_sub_interaction", "UI-REMOVE-SUB-INTERACTION", 1, 0, false);
        declareFunction("ui_note_super_interaction", "UI-NOTE-SUPER-INTERACTION", 2, 0, false);
        declareFunction("uia_act_promote_to_child", "UIA-ACT-PROMOTE-TO-CHILD", 1, 0, false);
        declareFunction("ui_recompute_status", "UI-RECOMPUTE-STATUS", 1, 0, false);
        declareFunction("ui_alive_p", "UI-ALIVE-P", 1, 0, false);
        declareFunction("uia_next_action", "UIA-NEXT-ACTION", 1, 0, false);
        declareFunction("uia_note_user_selection", "UIA-NOTE-USER-SELECTION", 2, 0, false);
        declareFunction("uia_promote_interaction", "UIA-PROMOTE-INTERACTION", 2, 0, false);
        declareFunction("uia_best_pending_action", "UIA-BEST-PENDING-ACTION", 1, 0, false);
        declareFunction("uia_pending_action_p", "UIA-PENDING-ACTION-P", 1, 0, false);
        declareFunction("uia_first_pending_nonbackground_action", "UIA-FIRST-PENDING-NONBACKGROUND-ACTION", 1, 0, false);
        declareFunction("uia_signature_p", "UIA-SIGNATURE-P", 1, 0, false);
        declareFunction("uia_signature", "UIA-SIGNATURE", 1, 0, false);
        declareFunction("find_uia_by_signature", "FIND-UIA-BY-SIGNATURE", 1, 0, false);
        declareFunction("ui_signature_p", "UI-SIGNATURE-P", 1, 0, false);
        declareFunction("ui_signature", "UI-SIGNATURE", 1, 0, false);
        declareFunction("ui_signature_to_property_list", "UI-SIGNATURE-TO-PROPERTY-LIST", 1, 0, false);
        declareFunction("find_ui_by_signature", "FIND-UI-BY-SIGNATURE", 1, 0, false);
        declareFunction("uia_schedule_frame_for_refresh", "UIA-SCHEDULE-FRAME-FOR-REFRESH", 2, 0, false);
        declareFunction("uia_get_frames_scheduled_for_refresh", "UIA-GET-FRAMES-SCHEDULED-FOR-REFRESH", 1, 0, false);
        declareFunction("uia_crumb_trail", "UIA-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_create_new_crumb_trail", "UIA-CREATE-NEW-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_update_term_crumb_trail", "UIA-UPDATE-TERM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_update_fact_crumb_trail", "UIA-UPDATE-FACT-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_update_question_crumb_trail", "UIA-UPDATE-QUESTION-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_crumb_trail_stale_assertionP", "UIA-CRUMB-TRAIL-STALE-ASSERTION?", 1, 0, false);
        declareFunction("uia_crumb_trail_el_sentenceP", "UIA-CRUMB-TRAIL-EL-SENTENCE?", 1, 0, false);
        declareFunction("uia_crumb_trail_facts_equalP", "UIA-CRUMB-TRAIL-FACTS-EQUAL?", 2, 0, false);
        declareFunction("uia_get_term_crumb_trail", "UIA-GET-TERM-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_fact_crumb_trail", "UIA-GET-FACT-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_question_crumb_trail", "UIA-GET-QUESTION-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_remove_crumb_trail_term", "UIA-REMOVE-CRUMB-TRAIL-TERM", 2, 0, false);
        declareFunction("uia_remove_crumb_trail_fact", "UIA-REMOVE-CRUMB-TRAIL-FACT", 2, 0, false);
        declareFunction("uia_remove_crumb_trail_question", "UIA-REMOVE-CRUMB-TRAIL-QUESTION", 2, 0, false);
        declareFunction("uia_shorten_term_crumb_trail", "UIA-SHORTEN-TERM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_shorten_fact_crumb_trail", "UIA-SHORTEN-FACT-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_shorten_question_crumb_trail", "UIA-SHORTEN-QUESTION-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_reset_crumb_trail", "UIA-RESET-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_add_term_to_crumb_trail", "UIA-ADD-TERM-TO-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_add_question_to_crumb_trail", "UIA-ADD-QUESTION-TO-CRUMB-TRAIL", 2, 1, false);
        declareFunction("uia_add_fact_to_crumb_trail", "UIA-ADD-FACT-TO-CRUMB-TRAIL", 2, 1, false);
        declareFunction("uia_crumb_trail_encapsulate_assertion", "UIA-CRUMB-TRAIL-ENCAPSULATE-ASSERTION", 1, 0, false);
        declareFunction("uia_crumb_trail_encapsulate_sentence", "UIA-CRUMB-TRAIL-ENCAPSULATE-SENTENCE", 2, 0, false);
        declareFunction("uia_get_terms_on_crumb_trail", "UIA-GET-TERMS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_facts_on_crumb_trail", "UIA-GET-FACTS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_questions_on_crumb_trail", "UIA-GET-QUESTIONS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_anything_on_crumb_trailP", "UIA-ANYTHING-ON-CRUMB-TRAIL?", 1, 0, false);
        declareFunction("uia_remove_term_from_crumb_trail", "UIA-REMOVE-TERM-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_remove_fact_from_crumb_trail", "UIA-REMOVE-FACT-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_remove_question_from_crumb_trail", "UIA-REMOVE-QUESTION-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_shorten_crumb_trail_to", "UIA-SHORTEN-CRUMB-TRAIL-TO", 1, 1, false);
        declareFunction("uima_act_create", "UIMA-ACT-CREATE", 0, 1, false);
        declareFunction("uima_act_focus", "UIMA-ACT-FOCUS", 2, 0, false);
        declareFunction("uia_act_create", "UIA-ACT-CREATE", 1, 1, false);
        declareFunction("uia_act_standard_initialization", "UIA-ACT-STANDARD-INITIALIZATION", 1, 0, false);
        declareFunction("uima_act_reset", "UIMA-ACT-RESET", 1, 1, false);
        declareFunction("uia_act_reset", "UIA-ACT-RESET", 1, 1, false);
        declareFunction("uia_act_clear_memoization", "UIA-ACT-CLEAR-MEMOIZATION", 1, 0, false);
        declareMacro("uia_launch_action_in_frame", "UIA-LAUNCH-ACTION-IN-FRAME");
        declareFunction("uia_act_new_interaction", "UIA-ACT-NEW-INTERACTION", 3, 2, false);
        declareFunction("uia_act_new_sub_interaction", "UIA-ACT-NEW-SUB-INTERACTION", 2, 2, false);
        declareFunction("uia_act_add_dependent", "UIA-ACT-ADD-DEPENDENT", 3, 0, false);
        declareFunction("uia_act_new_undo", "UIA-ACT-NEW-UNDO", 2, 0, false);
        declareFunction("uia_act_new_acknowledge_message", "UIA-ACT-NEW-ACKNOWLEDGE-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_timed_acknowledge_message", "UIA-ACT-NEW-TIMED-ACKNOWLEDGE-MESSAGE", 3, 0, false);
        declareFunction("uia_act_new_message", "UIA-ACT-NEW-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_quick_message", "UIA-ACT-NEW-QUICK-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_timed_message", "UIA-ACT-NEW-TIMED-MESSAGE", 3, 0, false);
        declareFunction("uia_act_new_comment", "UIA-ACT-NEW-COMMENT", 2, 0, false);
        declareFunction("uia_act_complete", "UIA-ACT-COMPLETE", 3, 0, false);
        declareFunction("uia_act_invalidate", "UIA-ACT-INVALIDATE", 2, 0, false);
        declareFunction("uia_act_invalidate_all_children", "UIA-ACT-INVALIDATE-ALL-CHILDREN", 2, 0, false);
        declareFunction("uia_act_reject", "UIA-ACT-REJECT", 2, 0, false);
        declareFunction("uia_act_reject_all", "UIA-ACT-REJECT-ALL", 1, 0, false);
        declareFunction("uia_act_reject_all_children", "UIA-ACT-REJECT-ALL-CHILDREN", 2, 0, false);
        declareFunction("uia_act_clear_comments", "UIA-ACT-CLEAR-COMMENTS", 1, 0, false);
        declareFunction("uia_act_finish", "UIA-ACT-FINISH", 2, 0, false);
        declareFunction("ui_finalize", "UI-FINALIZE", 1, 0, false);
        declareFunction("uia_act_propagate_child_completed", "UIA-ACT-PROPAGATE-CHILD-COMPLETED", 3, 0, false);
        declareFunction("uia_act_propagate_child_rejected", "UIA-ACT-PROPAGATE-CHILD-REJECTED", 3, 0, false);
        declareFunction("uia_act_propagate_child_invalidated", "UIA-ACT-PROPAGATE-CHILD-INVALIDATED", 3, 0, false);
        declareFunction("ui_request_p", "UI-REQUEST-P", 1, 0, false);
        declareFunction("invalid_ui_signature", "INVALID-UI-SIGNATURE", 0, 0, false);
        declareFunction("valid_ui_request_p", "VALID-UI-REQUEST-P", 1, 0, false);
        declareFunction("ui_action_type_p", "UI-ACTION-TYPE-P", 1, 0, false);
        declareFunction("make_ui_request", "MAKE-UI-REQUEST", 3, 0, false);
        declareFunction("make_empty_ui_request", "MAKE-EMPTY-UI-REQUEST", 0, 0, false);
        declareFunction("make_invalid_ui_request", "MAKE-INVALID-UI-REQUEST", 0, 0, false);
        declareFunction("uia_generate_request", "UIA-GENERATE-REQUEST", 2, 0, false);
        declareFunction("uia_generate_next_request", "UIA-GENERATE-NEXT-REQUEST", 1, 0, false);
        declareFunction("make_ui_reply_with_interaction", "MAKE-UI-REPLY-WITH-INTERACTION", 3, 0, false);
        declareFunction("make_ui_reply_with_agenda", "MAKE-UI-REPLY-WITH-AGENDA", 4, 0, false);
        declareFunction("make_ui_reply", "MAKE-UI-REPLY", 3, 0, false);
        declareFunction("handle_ui_reply", "HANDLE-UI-REPLY", 1, 0, false);
        declareFunction("ui_hint", "UI-HINT", 1, 1, false);
        declareFunction("ui_hint_method", "UI-HINT-METHOD", 2, 0, false);
        declareFunction("ui_hint_string", "UI-HINT-STRING", 2, 0, false);
        declareFunction("ui_default_hint_method", "UI-DEFAULT-HINT-METHOD", 1, 0, false);
        declareFunction("ui_cycl_tool", "UI-CYCL-TOOL", 1, 0, false);
        declareFunction("ui_help_text", "UI-HELP-TEXT", 1, 0, false);
        declareFunction("ui_help_text_for_tool_section", "UI-HELP-TEXT-FOR-TOOL-SECTION", 2, 0, false);
        declareFunction("kraken_help_text_for_launcher", "KRAKEN-HELP-TEXT-FOR-LAUNCHER", 1, 0, false);
        declareFunction("kraken_help_text_for_launcher_section", "KRAKEN-HELP-TEXT-FOR-LAUNCHER-SECTION", 2, 0, false);
        declareFunction("kraken_help_text_memoized_internal", "KRAKEN-HELP-TEXT-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("kraken_help_text_memoized", "KRAKEN-HELP-TEXT-MEMOIZED", 3, 0, false);
        declareFunction("uia_glob", "UIA-GLOB", 1, 0, false);
        declareFunction("uia_glob_reset", "UIA-GLOB-RESET", 1, 0, false);
        declareFunction("uia_glob_add", "UIA-GLOB-ADD", 2, 0, false);
        declareFunction("uia_glob_remove", "UIA-GLOB-REMOVE", 2, 0, false);
        declareFunction("uia_glob_lookup", "UIA-GLOB-LOOKUP", 2, 1, false);
        declareFunction("uia_glob_pop", "UIA-GLOB-POP", 2, 1, false);
        declareFunction("uia_glob_remove_by_id_string", "UIA-GLOB-REMOVE-BY-ID-STRING", 2, 0, false);
        declareFunction("uia_glob_lookup_by_id_string", "UIA-GLOB-LOOKUP-BY-ID-STRING", 2, 1, false);
        declareFunction("uia_glob_pop_by_id_string", "UIA-GLOB-POP-BY-ID-STRING", 2, 1, false);
        return NIL;
    }

    public static SubLObject declare_user_interaction_agenda_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_uia_lock", "WITH-UIA-LOCK");
            declareFunction("user_interaction_mode_p", "USER-INTERACTION-MODE-P", 1, 0, false);
            declareFunction("user_interaction_status_p", "USER-INTERACTION-STATUS-P", 1, 0, false);
            declareFunction("ui_operator_p", "UI-OPERATOR-P", 1, 0, false);
            declareFunction("user_interaction_print_function_trampoline", "USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("user_interaction_p", "USER-INTERACTION-P", 1, 0, false);
            new user_interaction_agenda.$user_interaction_p$UnaryFunction();
            declareFunction("ui_id", "UI-ID", 1, 0, false);
            declareFunction("ui_agenda", "UI-AGENDA", 1, 0, false);
            declareFunction("ui_mode", "UI-MODE", 1, 0, false);
            declareFunction("ui_status", "UI-STATUS", 1, 0, false);
            declareFunction("ui_start_time", "UI-START-TIME", 1, 0, false);
            declareFunction("ui_finish_time", "UI-FINISH-TIME", 1, 0, false);
            declareFunction("ui_parent_interaction", "UI-PARENT-INTERACTION", 1, 0, false);
            declareFunction("ui_child_interactions", "UI-CHILD-INTERACTIONS", 1, 0, false);
            declareFunction("ui_operator", "UI-OPERATOR", 1, 0, false);
            declareFunction("ui_args", "UI-ARGS", 1, 0, false);
            declareFunction("ui_result", "UI-RESULT", 1, 0, false);
            declareFunction("ui_state", "UI-STATE", 1, 0, false);
            declareFunction("_csetf_ui_id", "_CSETF-UI-ID", 2, 0, false);
            declareFunction("_csetf_ui_agenda", "_CSETF-UI-AGENDA", 2, 0, false);
            declareFunction("_csetf_ui_mode", "_CSETF-UI-MODE", 2, 0, false);
            declareFunction("_csetf_ui_status", "_CSETF-UI-STATUS", 2, 0, false);
            declareFunction("_csetf_ui_start_time", "_CSETF-UI-START-TIME", 2, 0, false);
            declareFunction("_csetf_ui_finish_time", "_CSETF-UI-FINISH-TIME", 2, 0, false);
            declareFunction("_csetf_ui_parent_interaction", "_CSETF-UI-PARENT-INTERACTION", 2, 0, false);
            declareFunction("_csetf_ui_child_interactions", "_CSETF-UI-CHILD-INTERACTIONS", 2, 0, false);
            declareFunction("_csetf_ui_operator", "_CSETF-UI-OPERATOR", 2, 0, false);
            declareFunction("_csetf_ui_args", "_CSETF-UI-ARGS", 2, 0, false);
            declareFunction("_csetf_ui_result", "_CSETF-UI-RESULT", 2, 0, false);
            declareFunction("_csetf_ui_state", "_CSETF-UI-STATE", 2, 0, false);
            declareFunction("make_user_interaction", "MAKE-USER-INTERACTION", 0, 1, false);
            declareFunction("visit_defstruct_user_interaction", "VISIT-DEFSTRUCT-USER-INTERACTION", 2, 0, false);
            declareFunction("visit_defstruct_object_user_interaction_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD", 2, 0, false);
            declareFunction("sxhash_user_interaction_method", "SXHASH-USER-INTERACTION-METHOD", 1, 0, false);
            declareFunction("print_user_interaction", "PRINT-USER-INTERACTION", 3, 0, false);
            declareFunction("new_ui", "NEW-UI", 3, 1, false);
            declareFunction("ui_note_mode", "UI-NOTE-MODE", 2, 0, false);
            declareFunction("ui_note_status", "UI-NOTE-STATUS", 2, 0, false);
            declareFunction("ui_note_start_time", "UI-NOTE-START-TIME", 2, 0, false);
            declareFunction("ui_note_finish_time", "UI-NOTE-FINISH-TIME", 2, 0, false);
            declareFunction("ui_note_parent", "UI-NOTE-PARENT", 2, 0, false);
            declareFunction("ui_add_child", "UI-ADD-CHILD", 2, 0, false);
            declareFunction("ui_note_result", "UI-NOTE-RESULT", 2, 0, false);
            declareFunction("ui_note_state", "UI-NOTE-STATE", 2, 0, false);
            declareFunction("user_interaction_agenda_print_function_trampoline", "USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("user_interaction_agenda_p", "USER-INTERACTION-AGENDA-P", 1, 0, false);
            new user_interaction_agenda.$user_interaction_agenda_p$UnaryFunction();
            declareFunction("uia_id", "UIA-ID", 1, 0, false);
            declareFunction("uia_meta_agenda", "UIA-META-AGENDA", 1, 0, false);
            declareFunction("uia_isg", "UIA-ISG", 1, 0, false);
            declareFunction("uia_index", "UIA-INDEX", 1, 0, false);
            declareFunction("uia_history", "UIA-HISTORY", 1, 0, false);
            declareFunction("uia_undos", "UIA-UNDOS", 1, 0, false);
            declareFunction("uia_messages", "UIA-MESSAGES", 1, 0, false);
            declareFunction("uia_requirements", "UIA-REQUIREMENTS", 1, 0, false);
            declareFunction("uia_relevant_suggestions", "UIA-RELEVANT-SUGGESTIONS", 1, 0, false);
            declareFunction("uia_possible_suggestions", "UIA-POSSIBLE-SUGGESTIONS", 1, 0, false);
            declareFunction("uia_comments", "UIA-COMMENTS", 1, 0, false);
            declareFunction("uia_state", "UIA-STATE", 1, 0, false);
            declareFunction("_csetf_uia_id", "_CSETF-UIA-ID", 2, 0, false);
            declareFunction("_csetf_uia_meta_agenda", "_CSETF-UIA-META-AGENDA", 2, 0, false);
            declareFunction("_csetf_uia_isg", "_CSETF-UIA-ISG", 2, 0, false);
            declareFunction("_csetf_uia_index", "_CSETF-UIA-INDEX", 2, 0, false);
            declareFunction("_csetf_uia_history", "_CSETF-UIA-HISTORY", 2, 0, false);
            declareFunction("_csetf_uia_undos", "_CSETF-UIA-UNDOS", 2, 0, false);
            declareFunction("_csetf_uia_messages", "_CSETF-UIA-MESSAGES", 2, 0, false);
            declareFunction("_csetf_uia_requirements", "_CSETF-UIA-REQUIREMENTS", 2, 0, false);
            declareFunction("_csetf_uia_relevant_suggestions", "_CSETF-UIA-RELEVANT-SUGGESTIONS", 2, 0, false);
            declareFunction("_csetf_uia_possible_suggestions", "_CSETF-UIA-POSSIBLE-SUGGESTIONS", 2, 0, false);
            declareFunction("_csetf_uia_comments", "_CSETF-UIA-COMMENTS", 2, 0, false);
            declareFunction("_csetf_uia_state", "_CSETF-UIA-STATE", 2, 0, false);
            declareFunction("make_user_interaction_agenda", "MAKE-USER-INTERACTION-AGENDA", 0, 1, false);
            declareFunction("visit_defstruct_user_interaction_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-AGENDA", 2, 0, false);
            declareFunction("visit_defstruct_object_user_interaction_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD", 2, 0, false);
            declareFunction("sxhash_user_interaction_agenda_method", "SXHASH-USER-INTERACTION-AGENDA-METHOD", 1, 0, false);
            declareFunction("print_user_interaction_agenda", "PRINT-USER-INTERACTION-AGENDA", 3, 0, false);
            declareFunction("new_uia", "NEW-UIA", 1, 0, false);
            declareFunction("uia_reset", "UIA-RESET", 1, 0, false);
            declareFunction("uia_find_by_id", "UIA-FIND-BY-ID", 2, 0, false);
            declareFunction("uia_find_by_id_string", "UIA-FIND-BY-ID-STRING", 2, 0, false);
            declareFunction("uia_some_interaction_p", "UIA-SOME-INTERACTION-P", 1, 0, false);
            declareFunction("uia_interaction_sequence", "UIA-INTERACTION-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_history_p", "UIA-SOME-HISTORY-P", 1, 0, false);
            declareFunction("uia_history_sequence", "UIA-HISTORY-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_undo_p", "UIA-SOME-UNDO-P", 1, 0, false);
            declareFunction("uia_undo_sequence", "UIA-UNDO-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_message_p", "UIA-SOME-MESSAGE-P", 1, 0, false);
            declareFunction("uia_message_sequence", "UIA-MESSAGE-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_requirement_p", "UIA-SOME-REQUIREMENT-P", 1, 0, false);
            declareFunction("uia_requirement_sequence", "UIA-REQUIREMENT-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_relevant_suggestion_p", "UIA-SOME-RELEVANT-SUGGESTION-P", 1, 0, false);
            declareFunction("uia_relevant_suggestion_sequence", "UIA-RELEVANT-SUGGESTION-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_possible_suggestion_p", "UIA-SOME-POSSIBLE-SUGGESTION-P", 1, 0, false);
            declareFunction("uia_possible_suggestion_sequence", "UIA-POSSIBLE-SUGGESTION-SEQUENCE", 1, 0, false);
            declareFunction("uia_some_comment_p", "UIA-SOME-COMMENT-P", 1, 0, false);
            declareFunction("uia_comment_sequence", "UIA-COMMENT-SEQUENCE", 1, 0, false);
            declareFunction("uia_default_operator", "UIA-DEFAULT-OPERATOR", 1, 0, false);
            declareFunction("uia_initialized_p", "UIA-INITIALIZED-P", 1, 0, false);
            declareFunction("uia_add_to_index", "UIA-ADD-TO-INDEX", 3, 0, false);
            declareFunction("uia_add_to_history", "UIA-ADD-TO-HISTORY", 2, 0, false);
            declareFunction("uia_clear_undos", "UIA-CLEAR-UNDOS", 1, 0, false);
            declareFunction("uia_add_undo", "UIA-ADD-UNDO", 2, 0, false);
            declareFunction("uia_rem_undo", "UIA-REM-UNDO", 2, 0, false);
            declareFunction("uia_add_message", "UIA-ADD-MESSAGE", 2, 0, false);
            declareFunction("uia_rem_message", "UIA-REM-MESSAGE", 2, 0, false);
            declareFunction("uia_add_requirement", "UIA-ADD-REQUIREMENT", 2, 0, false);
            declareFunction("uia_rem_requirement", "UIA-REM-REQUIREMENT", 2, 0, false);
            declareFunction("uia_add_relevant_suggestion", "UIA-ADD-RELEVANT-SUGGESTION", 2, 0, false);
            declareFunction("uia_rem_relevant_suggestion", "UIA-REM-RELEVANT-SUGGESTION", 2, 0, false);
            declareFunction("uia_add_possible_suggestion", "UIA-ADD-POSSIBLE-SUGGESTION", 2, 0, false);
            declareFunction("uia_rem_possible_suggestion", "UIA-REM-POSSIBLE-SUGGESTION", 2, 0, false);
            declareFunction("uia_add_comment", "UIA-ADD-COMMENT", 2, 0, false);
            declareFunction("uia_rem_comment", "UIA-REM-COMMENT", 2, 0, false);
            declareFunction("uia_clear_comments", "UIA-CLEAR-COMMENTS", 1, 0, false);
            declareFunction("uia_background_task_p", "UIA-BACKGROUND-TASK-P", 1, 0, false);
            declareFunction("uia_can_treat_comments_as_mumblingP", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?", 0, 0, false);
            declareFunction("uia_cannot_treat_comments_as_mumbling", "UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
            declareFunction("uia_can_treat_comments_as_mumbling", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
            declareFunction("uia_process_new_comment", "UIA-PROCESS-NEW-COMMENT", 2, 0, false);
            declareFunction("uia_classify", "UIA-CLASSIFY", 2, 0, false);
            declareFunction("uia_declassify", "UIA-DECLASSIFY", 2, 0, false);
            declareFunction("uia_note_state", "UIA-NOTE-STATE", 2, 0, false);
            declareFunction("uia_global_id_string", "UIA-GLOBAL-ID-STRING", 1, 0, false);
            declareFunction("uia_from_ids", "UIA-FROM-IDS", 2, 0, false);
            declareFunction("uia_determine_superior_topic_identification", "UIA-DETERMINE-SUPERIOR-TOPIC-IDENTIFICATION", 1, 0, false);
            declareMacro("do_uias", "DO-UIAS");
            declareMacro("do_uis", "DO-UIS");
            declareFunction("uia_language_parsing_mt", "UIA-LANGUAGE-PARSING-MT", 1, 0, false);
            declareFunction("uia_language_parsing_mt_update", "UIA-LANGUAGE-PARSING-MT-UPDATE", 2, 0, false);
            declareFunction("uia_language_generation_mt", "UIA-LANGUAGE-GENERATION-MT", 1, 0, false);
            declareFunction("uia_language_generation_mt_update", "UIA-LANGUAGE-GENERATION-MT-UPDATE", 2, 0, false);
            declareFunction("uia_language_lexical_mt", "UIA-LANGUAGE-LEXICAL-MT", 1, 0, false);
            declareFunction("uia_language_lexical_mt_update", "UIA-LANGUAGE-LEXICAL-MT-UPDATE", 2, 0, false);
            declareFunction("uia_domain_mt", "UIA-DOMAIN-MT", 1, 0, false);
            declareFunction("uia_domain_mt_update", "UIA-DOMAIN-MT-UPDATE", 2, 0, false);
            declareFunction("uia_parsing_mt", "UIA-PARSING-MT", 1, 0, false);
            declareFunction("uia_parsing_mt_update", "UIA-PARSING-MT-UPDATE", 2, 0, false);
            declareFunction("uia_generation_mt", "UIA-GENERATION-MT", 1, 1, false);
            declareFunction("uia_generation_mt_update", "UIA-GENERATION-MT-UPDATE", 2, 0, false);
            declareFunction("uia_all_interaction_mts", "UIA-ALL-INTERACTION-MTS", 1, 1, false);
            declareFunction("uia_note_interaction_mt", "UIA-NOTE-INTERACTION-MT", 2, 0, false);
            declareFunction("uia_domain_interaction_mt", "UIA-DOMAIN-INTERACTION-MT", 1, 0, false);
            declareFunction("uia_domain_interaction_mt_update", "UIA-DOMAIN-INTERACTION-MT-UPDATE", 2, 0, false);
            declareFunction("uia_parsing_interaction_mt", "UIA-PARSING-INTERACTION-MT", 1, 0, false);
            declareFunction("uia_parsing_interaction_mt_update", "UIA-PARSING-INTERACTION-MT-UPDATE", 2, 0, false);
            declareFunction("uia_generation_interaction_mt", "UIA-GENERATION-INTERACTION-MT", 1, 1, false);
            declareFunction("uia_generation_language_mt", "UIA-GENERATION-LANGUAGE-MT", 1, 0, false);
            declareFunction("uia_generation_domain_mt", "UIA-GENERATION-DOMAIN-MT", 1, 0, false);
            declareFunction("uia_generation_interaction_mt_update", "UIA-GENERATION-INTERACTION-MT-UPDATE", 2, 0, false);
            declareFunction("uia_lexical_interaction_mt", "UIA-LEXICAL-INTERACTION-MT", 1, 0, false);
            declareFunction("uia_lexical_interaction_mt_update", "UIA-LEXICAL-INTERACTION-MT-UPDATE", 2, 0, false);
            declareFunction("ui_domain_interaction_mt", "UI-DOMAIN-INTERACTION-MT", 1, 0, false);
            declareFunction("ui_parsing_interaction_mt", "UI-PARSING-INTERACTION-MT", 1, 0, false);
            declareFunction("ui_generation_interaction_mt", "UI-GENERATION-INTERACTION-MT", 1, 0, false);
            declareFunction("ui_generation_language_mt", "UI-GENERATION-LANGUAGE-MT", 1, 0, false);
            declareFunction("ui_generation_domain_mt", "UI-GENERATION-DOMAIN-MT", 1, 0, false);
            declareFunction("ui_lexical_interaction_mt", "UI-LEXICAL-INTERACTION-MT", 1, 0, false);
            declareFunction("uia_ensure_scenario_interaction_mt", "UIA-ENSURE-SCENARIO-INTERACTION-MT", 1, 0, false);
            declareFunction("user_interaction_meta_agenda_print_function_trampoline", "USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("user_interaction_meta_agenda_p", "USER-INTERACTION-META-AGENDA-P", 1, 0, false);
            new user_interaction_agenda.$user_interaction_meta_agenda_p$UnaryFunction();
            declareFunction("uima_id", "UIMA-ID", 1, 0, false);
            declareFunction("uima_isg", "UIMA-ISG", 1, 0, false);
            declareFunction("uima_index", "UIMA-INDEX", 1, 0, false);
            declareFunction("uima_open_agendas", "UIMA-OPEN-AGENDAS", 1, 0, false);
            declareFunction("uima_current_agenda", "UIMA-CURRENT-AGENDA", 1, 0, false);
            declareFunction("uima_state", "UIMA-STATE", 1, 0, false);
            declareFunction("_csetf_uima_id", "_CSETF-UIMA-ID", 2, 0, false);
            declareFunction("_csetf_uima_isg", "_CSETF-UIMA-ISG", 2, 0, false);
            declareFunction("_csetf_uima_index", "_CSETF-UIMA-INDEX", 2, 0, false);
            declareFunction("_csetf_uima_open_agendas", "_CSETF-UIMA-OPEN-AGENDAS", 2, 0, false);
            declareFunction("_csetf_uima_current_agenda", "_CSETF-UIMA-CURRENT-AGENDA", 2, 0, false);
            declareFunction("_csetf_uima_state", "_CSETF-UIMA-STATE", 2, 0, false);
            declareFunction("make_user_interaction_meta_agenda", "MAKE-USER-INTERACTION-META-AGENDA", 0, 1, false);
            declareFunction("visit_defstruct_user_interaction_meta_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-META-AGENDA", 2, 0, false);
            declareFunction("visit_defstruct_object_user_interaction_meta_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD", 2, 0, false);
            declareFunction("new_uima", "NEW-UIMA", 0, 0, false);
            declareFunction("uima_reset", "UIMA-RESET", 1, 0, false);
            declareFunction("uima_find_by_id", "UIMA-FIND-BY-ID", 2, 0, false);
            declareFunction("uima_find_by_id_string", "UIMA-FIND-BY-ID-STRING", 2, 0, false);
            declareFunction("uima_some_open_agendas_p", "UIMA-SOME-OPEN-AGENDAS-P", 1, 0, false);
            declareFunction("uima_open_agendas_sequence", "UIMA-OPEN-AGENDAS-SEQUENCE", 1, 0, false);
            declareFunction("uima_match_mt_to_agenda", "UIMA-MATCH-MT-TO-AGENDA", 2, 0, false);
            declareFunction("uima_add_to_index", "UIMA-ADD-TO-INDEX", 3, 0, false);
            declareFunction("uima_add_open_agenda", "UIMA-ADD-OPEN-AGENDA", 2, 0, false);
            declareFunction("uima_clear_current_agenda", "UIMA-CLEAR-CURRENT-AGENDA", 1, 0, false);
            declareFunction("uima_note_current_agenda", "UIMA-NOTE-CURRENT-AGENDA", 2, 0, false);
            declareFunction("uima_note_state", "UIMA-NOTE-STATE", 2, 0, false);
            declareMacro("do_uimas", "DO-UIMAS");
            declareFunction("system_uimma", "SYSTEM-UIMMA", 0, 0, false);
            declareFunction("uimma", "UIMMA", 0, 0, false);
            declareFunction("new_uimma", "NEW-UIMMA", 0, 0, false);
            declareFunction("uimma_reset", "UIMMA-RESET", 0, 0, false);
            declareFunction("uimma_new_id", "UIMMA-NEW-ID", 0, 0, false);
            declareFunction("uimma_add_to_index", "UIMMA-ADD-TO-INDEX", 2, 0, false);
            declareFunction("uimma_find_by_id", "UIMMA-FIND-BY-ID", 1, 0, false);
            declareFunction("uimma_default_locale", "UIMMA-DEFAULT-LOCALE", 0, 0, false);
            declareFunction("set_uimma_default_locale", "SET-UIMMA-DEFAULT-LOCALE", 1, 0, false);
            declareFunction("uimma_default_generation_mt", "UIMMA-DEFAULT-GENERATION-MT", 0, 0, false);
            declareFunction("set_uimma_default_generation_mt", "SET-UIMMA-DEFAULT-GENERATION-MT", 1, 0, false);
            declareFunction("uimma_default_domain_mt", "UIMMA-DEFAULT-DOMAIN-MT", 0, 0, false);
            declareFunction("set_uimma_default_domain_mt", "SET-UIMMA-DEFAULT-DOMAIN-MT", 1, 0, false);
            declareFunction("ui_meta_agenda", "UI-META-AGENDA", 1, 0, false);
            declareFunction("uia_total_interaction_count", "UIA-TOTAL-INTERACTION-COUNT", 1, 0, false);
            declareFunction("uia_finished_interaction_count", "UIA-FINISHED-INTERACTION-COUNT", 1, 0, false);
            declareFunction("ui_state_plist_to_state", "UI-STATE-PLIST-TO-STATE", 1, 0, false);
            declareFunction("ui_state_lookup", "UI-STATE-LOOKUP", 2, 1, false);
            declareFunction("ui_state_update", "UI-STATE-UPDATE", 3, 0, false);
            declareFunction("ui_state_clear", "UI-STATE-CLEAR", 2, 0, false);
            declareFunction("ui_state_clear_all", "UI-STATE-CLEAR-ALL", 1, 0, false);
            declareFunction("uia_state_plist_to_state", "UIA-STATE-PLIST-TO-STATE", 1, 0, false);
            declareFunction("uia_initialize_state", "UIA-INITIALIZE-STATE", 2, 0, false);
            declareFunction("uia_state_lookup", "UIA-STATE-LOOKUP", 2, 1, false);
            declareFunction("uia_state_update", "UIA-STATE-UPDATE", 3, 0, false);
            declareFunction("uia_state_clear", "UIA-STATE-CLEAR", 2, 0, false);
            declareFunction("uia_state_clear_all", "UIA-STATE-CLEAR-ALL", 1, 0, false);
            declareFunction("uima_state_plist_to_state", "UIMA-STATE-PLIST-TO-STATE", 1, 0, false);
            declareFunction("uima_initialize_state", "UIMA-INITIALIZE-STATE", 2, 0, false);
            declareFunction("uima_state_lookup", "UIMA-STATE-LOOKUP", 2, 1, false);
            declareFunction("uima_state_update", "UIMA-STATE-UPDATE", 3, 0, false);
            declareFunction("uima_state_clear", "UIMA-STATE-CLEAR", 2, 0, false);
            declareFunction("uima_state_clear_all", "UIMA-STATE-CLEAR-ALL", 1, 0, false);
            declareMacro("with_uia_memoization_state", "WITH-UIA-MEMOIZATION-STATE");
            declareFunction("uia_memoization_state", "UIA-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("uia_create_memoization_state", "UIA-CREATE-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("uia_clear_memoization_state", "UIA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("uia_clear_memoization_state_for_function", "UIA-CLEAR-MEMOIZATION-STATE-FOR-FUNCTION", 2, 0, false);
            declareMacro("with_uima_memoization_state", "WITH-UIMA-MEMOIZATION-STATE");
            declareFunction("uima_memoization_state", "UIMA-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("uima_create_memoization_state", "UIMA-CREATE-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("uima_clear_memoization_state", "UIMA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("ui_ancestor_interactions", "UI-ANCESTOR-INTERACTIONS", 1, 0, false);
            declareFunction("ui_pending_descendant_interactions", "UI-PENDING-DESCENDANT-INTERACTIONS", 1, 0, false);
            declareFunction("ui_pending_descendants_recursive", "UI-PENDING-DESCENDANTS-RECURSIVE", 2, 0, false);
            declareFunction("ui_sub_interactions", "UI-SUB-INTERACTIONS", 1, 0, false);
            declareFunction("ui_super_interaction", "UI-SUPER-INTERACTION", 1, 0, false);
            declareFunction("ui_add_sub_interaction", "UI-ADD-SUB-INTERACTION", 2, 0, false);
            declareFunction("ui_remove_sub_interaction", "UI-REMOVE-SUB-INTERACTION", 1, 0, false);
            declareFunction("ui_note_super_interaction", "UI-NOTE-SUPER-INTERACTION", 2, 0, false);
            declareFunction("uia_act_promote_to_child", "UIA-ACT-PROMOTE-TO-CHILD", 1, 0, false);
            declareFunction("ui_recompute_status", "UI-RECOMPUTE-STATUS", 1, 0, false);
            declareFunction("ui_alive_p", "UI-ALIVE-P", 1, 0, false);
            declareFunction("uia_next_action", "UIA-NEXT-ACTION", 1, 0, false);
            declareFunction("uia_note_user_selection", "UIA-NOTE-USER-SELECTION", 2, 0, false);
            declareFunction("uia_promote_interaction", "UIA-PROMOTE-INTERACTION", 2, 0, false);
            declareFunction("uia_best_pending_action", "UIA-BEST-PENDING-ACTION", 1, 0, false);
            declareFunction("uia_pending_action_p", "UIA-PENDING-ACTION-P", 1, 0, false);
            declareFunction("uia_first_pending_nonbackground_action", "UIA-FIRST-PENDING-NONBACKGROUND-ACTION", 1, 0, false);
            declareFunction("uia_signature_p", "UIA-SIGNATURE-P", 1, 0, false);
            declareFunction("uia_signature", "UIA-SIGNATURE", 1, 0, false);
            declareFunction("find_uia_by_signature", "FIND-UIA-BY-SIGNATURE", 1, 0, false);
            declareFunction("ui_signature_p", "UI-SIGNATURE-P", 1, 0, false);
            declareFunction("ui_signature", "UI-SIGNATURE", 1, 0, false);
            declareFunction("ui_signature_to_property_list", "UI-SIGNATURE-TO-PROPERTY-LIST", 1, 0, false);
            declareFunction("find_ui_by_signature", "FIND-UI-BY-SIGNATURE", 1, 0, false);
            declareFunction("uia_schedule_frame_for_refresh", "UIA-SCHEDULE-FRAME-FOR-REFRESH", 2, 0, false);
            declareFunction("uia_get_frames_scheduled_for_refresh", "UIA-GET-FRAMES-SCHEDULED-FOR-REFRESH", 1, 0, false);
            declareFunction("uia_crumb_trail", "UIA-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_create_new_crumb_trail", "UIA-CREATE-NEW-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_update_term_crumb_trail", "UIA-UPDATE-TERM-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_update_fact_crumb_trail", "UIA-UPDATE-FACT-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_update_question_crumb_trail", "UIA-UPDATE-QUESTION-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_crumb_trail_stale_assertionP", "UIA-CRUMB-TRAIL-STALE-ASSERTION?", 1, 0, false);
            declareFunction("uia_crumb_trail_el_sentenceP", "UIA-CRUMB-TRAIL-EL-SENTENCE?", 1, 0, false);
            declareFunction("uia_crumb_trail_facts_equalP", "UIA-CRUMB-TRAIL-FACTS-EQUAL?", 2, 0, false);
            declareFunction("uia_get_term_crumb_trail", "UIA-GET-TERM-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_get_fact_crumb_trail", "UIA-GET-FACT-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_get_question_crumb_trail", "UIA-GET-QUESTION-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_remove_crumb_trail_term", "UIA-REMOVE-CRUMB-TRAIL-TERM", 2, 0, false);
            declareFunction("uia_remove_crumb_trail_fact", "UIA-REMOVE-CRUMB-TRAIL-FACT", 2, 0, false);
            declareFunction("uia_remove_crumb_trail_question", "UIA-REMOVE-CRUMB-TRAIL-QUESTION", 2, 0, false);
            declareFunction("uia_shorten_term_crumb_trail", "UIA-SHORTEN-TERM-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_shorten_fact_crumb_trail", "UIA-SHORTEN-FACT-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_shorten_question_crumb_trail", "UIA-SHORTEN-QUESTION-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_reset_crumb_trail", "UIA-RESET-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_add_term_to_crumb_trail", "UIA-ADD-TERM-TO-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_add_question_to_crumb_trail", "UIA-ADD-QUESTION-TO-CRUMB-TRAIL", 2, 1, false);
            declareFunction("uia_add_fact_to_crumb_trail", "UIA-ADD-FACT-TO-CRUMB-TRAIL", 2, 1, false);
            declareFunction("uia_crumb_trail_encapsulate_assertion", "UIA-CRUMB-TRAIL-ENCAPSULATE-ASSERTION", 1, 0, false);
            declareFunction("uia_crumb_trail_encapsulate_sentence", "UIA-CRUMB-TRAIL-ENCAPSULATE-SENTENCE", 2, 0, false);
            declareFunction("uia_get_terms_on_crumb_trail", "UIA-GET-TERMS-ON-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_get_facts_on_crumb_trail", "UIA-GET-FACTS-ON-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_get_questions_on_crumb_trail", "UIA-GET-QUESTIONS-ON-CRUMB-TRAIL", 1, 0, false);
            declareFunction("uia_anything_on_crumb_trailP", "UIA-ANYTHING-ON-CRUMB-TRAIL?", 1, 0, false);
            declareFunction("uia_remove_term_from_crumb_trail", "UIA-REMOVE-TERM-FROM-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_remove_fact_from_crumb_trail", "UIA-REMOVE-FACT-FROM-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_remove_question_from_crumb_trail", "UIA-REMOVE-QUESTION-FROM-CRUMB-TRAIL", 2, 0, false);
            declareFunction("uia_shorten_crumb_trail_to", "UIA-SHORTEN-CRUMB-TRAIL-TO", 1, 1, false);
            declareFunction("uima_act_create", "UIMA-ACT-CREATE", 0, 1, false);
            declareFunction("uima_act_focus", "UIMA-ACT-FOCUS", 2, 0, false);
            declareFunction("uia_act_create", "UIA-ACT-CREATE", 1, 1, false);
            declareFunction("uia_act_standard_initialization", "UIA-ACT-STANDARD-INITIALIZATION", 1, 0, false);
            declareFunction("uima_act_reset", "UIMA-ACT-RESET", 1, 1, false);
            declareFunction("uia_act_reset", "UIA-ACT-RESET", 1, 1, false);
            declareFunction("uia_act_clear_memoization", "UIA-ACT-CLEAR-MEMOIZATION", 1, 0, false);
            declareMacro("uia_launch_action_in_frame", "UIA-LAUNCH-ACTION-IN-FRAME");
            declareFunction("uia_act_new_interaction", "UIA-ACT-NEW-INTERACTION", 3, 2, false);
            declareFunction("uia_act_new_sub_interaction", "UIA-ACT-NEW-SUB-INTERACTION", 2, 2, false);
            declareFunction("uia_act_add_dependent", "UIA-ACT-ADD-DEPENDENT", 3, 0, false);
            declareFunction("uia_act_new_acknowledge_message", "UIA-ACT-NEW-ACKNOWLEDGE-MESSAGE", 2, 0, false);
            declareFunction("uia_act_new_timed_acknowledge_message", "UIA-ACT-NEW-TIMED-ACKNOWLEDGE-MESSAGE", 3, 0, false);
            declareFunction("uia_act_new_message", "UIA-ACT-NEW-MESSAGE", 2, 0, false);
            declareFunction("uia_act_new_quick_message", "UIA-ACT-NEW-QUICK-MESSAGE", 2, 0, false);
            declareFunction("uia_act_new_timed_message", "UIA-ACT-NEW-TIMED-MESSAGE", 3, 0, false);
            declareFunction("uia_act_new_comment", "UIA-ACT-NEW-COMMENT", 2, 0, false);
            declareFunction("ui_request_p", "UI-REQUEST-P", 1, 0, false);
            declareFunction("invalid_ui_signature", "INVALID-UI-SIGNATURE", 0, 0, false);
            declareFunction("valid_ui_request_p", "VALID-UI-REQUEST-P", 1, 0, false);
            declareFunction("ui_action_type_p", "UI-ACTION-TYPE-P", 1, 0, false);
            declareFunction("make_ui_request", "MAKE-UI-REQUEST", 3, 0, false);
            declareFunction("make_empty_ui_request", "MAKE-EMPTY-UI-REQUEST", 0, 0, false);
            declareFunction("make_invalid_ui_request", "MAKE-INVALID-UI-REQUEST", 0, 0, false);
            declareFunction("make_ui_reply_with_interaction", "MAKE-UI-REPLY-WITH-INTERACTION", 3, 0, false);
            declareFunction("make_ui_reply_with_agenda", "MAKE-UI-REPLY-WITH-AGENDA", 4, 0, false);
            declareFunction("make_ui_reply", "MAKE-UI-REPLY", 3, 0, false);
            declareFunction("uia_glob", "UIA-GLOB", 1, 0, false);
            declareFunction("uia_glob_reset", "UIA-GLOB-RESET", 1, 0, false);
            declareFunction("uia_glob_add", "UIA-GLOB-ADD", 2, 0, false);
            declareFunction("uia_glob_remove", "UIA-GLOB-REMOVE", 2, 0, false);
            declareFunction("uia_glob_lookup", "UIA-GLOB-LOOKUP", 2, 1, false);
            declareFunction("uia_glob_pop", "UIA-GLOB-POP", 2, 1, false);
            declareFunction("uia_glob_remove_by_id_string", "UIA-GLOB-REMOVE-BY-ID-STRING", 2, 0, false);
            declareFunction("uia_glob_lookup_by_id_string", "UIA-GLOB-LOOKUP-BY-ID-STRING", 2, 1, false);
            declareFunction("uia_glob_pop_by_id_string", "UIA-GLOB-POP-BY-ID-STRING", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("uia_treat_comments_as_mumbling", "UIA-TREAT-COMMENTS-AS-MUMBLING", 1, 0, false);
            declareFunction("uia_convert_comment_to_mumble", "UIA-CONVERT-COMMENT-TO-MUMBLE", 2, 0, false);
            declareFunction("uia_give_current_topic_and_name", "UIA-GIVE-CURRENT-TOPIC-AND-NAME", 1, 0, false);
            declareFunction("uimma_find_by_user", "UIMMA-FIND-BY-USER", 1, 0, false);
            declareFunction("uimma_resolve_meta_agenda_id", "UIMMA-RESOLVE-META-AGENDA-ID", 1, 0, false);
            declareFunction("uimma_match_mts_to_agendas", "UIMMA-MATCH-MTS-TO-AGENDAS", 1, 1, false);
            declareFunction("ui_virtual_parent_interaction", "UI-VIRTUAL-PARENT-INTERACTION", 1, 0, false);
            declareFunction("ui_virtual_ancestor_interactions", "UI-VIRTUAL-ANCESTOR-INTERACTIONS", 1, 0, false);
            declareFunction("uia_act_new_undo", "UIA-ACT-NEW-UNDO", 2, 0, false);
            declareFunction("uia_act_complete", "UIA-ACT-COMPLETE", 3, 0, false);
            declareFunction("uia_act_invalidate", "UIA-ACT-INVALIDATE", 2, 0, false);
            declareFunction("uia_act_invalidate_all_children", "UIA-ACT-INVALIDATE-ALL-CHILDREN", 2, 0, false);
            declareFunction("uia_act_reject", "UIA-ACT-REJECT", 2, 0, false);
            declareFunction("uia_act_reject_all", "UIA-ACT-REJECT-ALL", 1, 0, false);
            declareFunction("uia_act_reject_all_children", "UIA-ACT-REJECT-ALL-CHILDREN", 2, 0, false);
            declareFunction("uia_act_clear_comments", "UIA-ACT-CLEAR-COMMENTS", 1, 0, false);
            declareFunction("uia_act_finish", "UIA-ACT-FINISH", 2, 0, false);
            declareFunction("ui_finalize", "UI-FINALIZE", 1, 0, false);
            declareFunction("uia_act_propagate_child_completed", "UIA-ACT-PROPAGATE-CHILD-COMPLETED", 3, 0, false);
            declareFunction("uia_act_propagate_child_rejected", "UIA-ACT-PROPAGATE-CHILD-REJECTED", 3, 0, false);
            declareFunction("uia_act_propagate_child_invalidated", "UIA-ACT-PROPAGATE-CHILD-INVALIDATED", 3, 0, false);
            declareFunction("uia_generate_request", "UIA-GENERATE-REQUEST", 2, 0, false);
            declareFunction("uia_generate_next_request", "UIA-GENERATE-NEXT-REQUEST", 1, 0, false);
            declareFunction("handle_ui_reply", "HANDLE-UI-REPLY", 1, 0, false);
            declareFunction("ui_hint", "UI-HINT", 1, 1, false);
            declareFunction("ui_hint_method", "UI-HINT-METHOD", 2, 0, false);
            declareFunction("ui_hint_string", "UI-HINT-STRING", 2, 0, false);
            declareFunction("ui_default_hint_method", "UI-DEFAULT-HINT-METHOD", 1, 0, false);
            declareFunction("ui_cycl_tool", "UI-CYCL-TOOL", 1, 0, false);
            declareFunction("ui_help_text", "UI-HELP-TEXT", 1, 0, false);
            declareFunction("ui_help_text_for_tool_section", "UI-HELP-TEXT-FOR-TOOL-SECTION", 2, 0, false);
            declareFunction("kraken_help_text_for_launcher", "KRAKEN-HELP-TEXT-FOR-LAUNCHER", 1, 0, false);
            declareFunction("kraken_help_text_for_launcher_section", "KRAKEN-HELP-TEXT-FOR-LAUNCHER-SECTION", 2, 0, false);
            declareFunction("kraken_help_text_memoized_internal", "KRAKEN-HELP-TEXT-MEMOIZED-INTERNAL", 3, 0, false);
            declareFunction("kraken_help_text_memoized", "KRAKEN-HELP-TEXT-MEMOIZED", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_user_interaction_agenda_file_Previous() {
        declareMacro("with_uia_lock", "WITH-UIA-LOCK");
        declareFunction("user_interaction_mode_p", "USER-INTERACTION-MODE-P", 1, 0, false);
        declareFunction("user_interaction_status_p", "USER-INTERACTION-STATUS-P", 1, 0, false);
        declareFunction("ui_operator_p", "UI-OPERATOR-P", 1, 0, false);
        declareFunction("user_interaction_print_function_trampoline", "USER-INTERACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_interaction_p", "USER-INTERACTION-P", 1, 0, false);
        new user_interaction_agenda.$user_interaction_p$UnaryFunction();
        declareFunction("ui_id", "UI-ID", 1, 0, false);
        declareFunction("ui_agenda", "UI-AGENDA", 1, 0, false);
        declareFunction("ui_mode", "UI-MODE", 1, 0, false);
        declareFunction("ui_status", "UI-STATUS", 1, 0, false);
        declareFunction("ui_start_time", "UI-START-TIME", 1, 0, false);
        declareFunction("ui_finish_time", "UI-FINISH-TIME", 1, 0, false);
        declareFunction("ui_parent_interaction", "UI-PARENT-INTERACTION", 1, 0, false);
        declareFunction("ui_child_interactions", "UI-CHILD-INTERACTIONS", 1, 0, false);
        declareFunction("ui_operator", "UI-OPERATOR", 1, 0, false);
        declareFunction("ui_args", "UI-ARGS", 1, 0, false);
        declareFunction("ui_result", "UI-RESULT", 1, 0, false);
        declareFunction("ui_state", "UI-STATE", 1, 0, false);
        declareFunction("_csetf_ui_id", "_CSETF-UI-ID", 2, 0, false);
        declareFunction("_csetf_ui_agenda", "_CSETF-UI-AGENDA", 2, 0, false);
        declareFunction("_csetf_ui_mode", "_CSETF-UI-MODE", 2, 0, false);
        declareFunction("_csetf_ui_status", "_CSETF-UI-STATUS", 2, 0, false);
        declareFunction("_csetf_ui_start_time", "_CSETF-UI-START-TIME", 2, 0, false);
        declareFunction("_csetf_ui_finish_time", "_CSETF-UI-FINISH-TIME", 2, 0, false);
        declareFunction("_csetf_ui_parent_interaction", "_CSETF-UI-PARENT-INTERACTION", 2, 0, false);
        declareFunction("_csetf_ui_child_interactions", "_CSETF-UI-CHILD-INTERACTIONS", 2, 0, false);
        declareFunction("_csetf_ui_operator", "_CSETF-UI-OPERATOR", 2, 0, false);
        declareFunction("_csetf_ui_args", "_CSETF-UI-ARGS", 2, 0, false);
        declareFunction("_csetf_ui_result", "_CSETF-UI-RESULT", 2, 0, false);
        declareFunction("_csetf_ui_state", "_CSETF-UI-STATE", 2, 0, false);
        declareFunction("make_user_interaction", "MAKE-USER-INTERACTION", 0, 1, false);
        declareFunction("visit_defstruct_user_interaction", "VISIT-DEFSTRUCT-USER-INTERACTION", 2, 0, false);
        declareFunction("visit_defstruct_object_user_interaction_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-METHOD", 2, 0, false);
        declareFunction("sxhash_user_interaction_method", "SXHASH-USER-INTERACTION-METHOD", 1, 0, false);
        declareFunction("print_user_interaction", "PRINT-USER-INTERACTION", 3, 0, false);
        declareFunction("new_ui", "NEW-UI", 3, 1, false);
        declareFunction("ui_note_mode", "UI-NOTE-MODE", 2, 0, false);
        declareFunction("ui_note_status", "UI-NOTE-STATUS", 2, 0, false);
        declareFunction("ui_note_start_time", "UI-NOTE-START-TIME", 2, 0, false);
        declareFunction("ui_note_finish_time", "UI-NOTE-FINISH-TIME", 2, 0, false);
        declareFunction("ui_note_parent", "UI-NOTE-PARENT", 2, 0, false);
        declareFunction("ui_add_child", "UI-ADD-CHILD", 2, 0, false);
        declareFunction("ui_note_result", "UI-NOTE-RESULT", 2, 0, false);
        declareFunction("ui_note_state", "UI-NOTE-STATE", 2, 0, false);
        declareFunction("user_interaction_agenda_print_function_trampoline", "USER-INTERACTION-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_interaction_agenda_p", "USER-INTERACTION-AGENDA-P", 1, 0, false);
        new user_interaction_agenda.$user_interaction_agenda_p$UnaryFunction();
        declareFunction("uia_id", "UIA-ID", 1, 0, false);
        declareFunction("uia_meta_agenda", "UIA-META-AGENDA", 1, 0, false);
        declareFunction("uia_isg", "UIA-ISG", 1, 0, false);
        declareFunction("uia_index", "UIA-INDEX", 1, 0, false);
        declareFunction("uia_history", "UIA-HISTORY", 1, 0, false);
        declareFunction("uia_undos", "UIA-UNDOS", 1, 0, false);
        declareFunction("uia_messages", "UIA-MESSAGES", 1, 0, false);
        declareFunction("uia_requirements", "UIA-REQUIREMENTS", 1, 0, false);
        declareFunction("uia_relevant_suggestions", "UIA-RELEVANT-SUGGESTIONS", 1, 0, false);
        declareFunction("uia_possible_suggestions", "UIA-POSSIBLE-SUGGESTIONS", 1, 0, false);
        declareFunction("uia_comments", "UIA-COMMENTS", 1, 0, false);
        declareFunction("uia_state", "UIA-STATE", 1, 0, false);
        declareFunction("_csetf_uia_id", "_CSETF-UIA-ID", 2, 0, false);
        declareFunction("_csetf_uia_meta_agenda", "_CSETF-UIA-META-AGENDA", 2, 0, false);
        declareFunction("_csetf_uia_isg", "_CSETF-UIA-ISG", 2, 0, false);
        declareFunction("_csetf_uia_index", "_CSETF-UIA-INDEX", 2, 0, false);
        declareFunction("_csetf_uia_history", "_CSETF-UIA-HISTORY", 2, 0, false);
        declareFunction("_csetf_uia_undos", "_CSETF-UIA-UNDOS", 2, 0, false);
        declareFunction("_csetf_uia_messages", "_CSETF-UIA-MESSAGES", 2, 0, false);
        declareFunction("_csetf_uia_requirements", "_CSETF-UIA-REQUIREMENTS", 2, 0, false);
        declareFunction("_csetf_uia_relevant_suggestions", "_CSETF-UIA-RELEVANT-SUGGESTIONS", 2, 0, false);
        declareFunction("_csetf_uia_possible_suggestions", "_CSETF-UIA-POSSIBLE-SUGGESTIONS", 2, 0, false);
        declareFunction("_csetf_uia_comments", "_CSETF-UIA-COMMENTS", 2, 0, false);
        declareFunction("_csetf_uia_state", "_CSETF-UIA-STATE", 2, 0, false);
        declareFunction("make_user_interaction_agenda", "MAKE-USER-INTERACTION-AGENDA", 0, 1, false);
        declareFunction("visit_defstruct_user_interaction_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-AGENDA", 2, 0, false);
        declareFunction("visit_defstruct_object_user_interaction_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-AGENDA-METHOD", 2, 0, false);
        declareFunction("sxhash_user_interaction_agenda_method", "SXHASH-USER-INTERACTION-AGENDA-METHOD", 1, 0, false);
        declareFunction("print_user_interaction_agenda", "PRINT-USER-INTERACTION-AGENDA", 3, 0, false);
        declareFunction("new_uia", "NEW-UIA", 1, 0, false);
        declareFunction("uia_reset", "UIA-RESET", 1, 0, false);
        declareFunction("uia_find_by_id", "UIA-FIND-BY-ID", 2, 0, false);
        declareFunction("uia_find_by_id_string", "UIA-FIND-BY-ID-STRING", 2, 0, false);
        declareFunction("uia_some_interaction_p", "UIA-SOME-INTERACTION-P", 1, 0, false);
        declareFunction("uia_interaction_sequence", "UIA-INTERACTION-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_history_p", "UIA-SOME-HISTORY-P", 1, 0, false);
        declareFunction("uia_history_sequence", "UIA-HISTORY-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_undo_p", "UIA-SOME-UNDO-P", 1, 0, false);
        declareFunction("uia_undo_sequence", "UIA-UNDO-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_message_p", "UIA-SOME-MESSAGE-P", 1, 0, false);
        declareFunction("uia_message_sequence", "UIA-MESSAGE-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_requirement_p", "UIA-SOME-REQUIREMENT-P", 1, 0, false);
        declareFunction("uia_requirement_sequence", "UIA-REQUIREMENT-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_relevant_suggestion_p", "UIA-SOME-RELEVANT-SUGGESTION-P", 1, 0, false);
        declareFunction("uia_relevant_suggestion_sequence", "UIA-RELEVANT-SUGGESTION-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_possible_suggestion_p", "UIA-SOME-POSSIBLE-SUGGESTION-P", 1, 0, false);
        declareFunction("uia_possible_suggestion_sequence", "UIA-POSSIBLE-SUGGESTION-SEQUENCE", 1, 0, false);
        declareFunction("uia_some_comment_p", "UIA-SOME-COMMENT-P", 1, 0, false);
        declareFunction("uia_comment_sequence", "UIA-COMMENT-SEQUENCE", 1, 0, false);
        declareFunction("uia_default_operator", "UIA-DEFAULT-OPERATOR", 1, 0, false);
        declareFunction("uia_initialized_p", "UIA-INITIALIZED-P", 1, 0, false);
        declareFunction("uia_add_to_index", "UIA-ADD-TO-INDEX", 3, 0, false);
        declareFunction("uia_add_to_history", "UIA-ADD-TO-HISTORY", 2, 0, false);
        declareFunction("uia_clear_undos", "UIA-CLEAR-UNDOS", 1, 0, false);
        declareFunction("uia_add_undo", "UIA-ADD-UNDO", 2, 0, false);
        declareFunction("uia_rem_undo", "UIA-REM-UNDO", 2, 0, false);
        declareFunction("uia_add_message", "UIA-ADD-MESSAGE", 2, 0, false);
        declareFunction("uia_rem_message", "UIA-REM-MESSAGE", 2, 0, false);
        declareFunction("uia_add_requirement", "UIA-ADD-REQUIREMENT", 2, 0, false);
        declareFunction("uia_rem_requirement", "UIA-REM-REQUIREMENT", 2, 0, false);
        declareFunction("uia_add_relevant_suggestion", "UIA-ADD-RELEVANT-SUGGESTION", 2, 0, false);
        declareFunction("uia_rem_relevant_suggestion", "UIA-REM-RELEVANT-SUGGESTION", 2, 0, false);
        declareFunction("uia_add_possible_suggestion", "UIA-ADD-POSSIBLE-SUGGESTION", 2, 0, false);
        declareFunction("uia_rem_possible_suggestion", "UIA-REM-POSSIBLE-SUGGESTION", 2, 0, false);
        declareFunction("uia_add_comment", "UIA-ADD-COMMENT", 2, 0, false);
        declareFunction("uia_rem_comment", "UIA-REM-COMMENT", 2, 0, false);
        declareFunction("uia_clear_comments", "UIA-CLEAR-COMMENTS", 1, 0, false);
        declareFunction("uia_background_task_p", "UIA-BACKGROUND-TASK-P", 1, 0, false);
        declareFunction("uia_can_treat_comments_as_mumblingP", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?", 0, 0, false);
        declareFunction("uia_cannot_treat_comments_as_mumbling", "UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        declareFunction("uia_can_treat_comments_as_mumbling", "UIA-CAN-TREAT-COMMENTS-AS-MUMBLING", 0, 0, false);
        declareFunction("uia_process_new_comment", "UIA-PROCESS-NEW-COMMENT", 2, 0, false);
        declareFunction("uia_classify", "UIA-CLASSIFY", 2, 0, false);
        declareFunction("uia_declassify", "UIA-DECLASSIFY", 2, 0, false);
        declareFunction("uia_note_state", "UIA-NOTE-STATE", 2, 0, false);
        declareFunction("uia_global_id_string", "UIA-GLOBAL-ID-STRING", 1, 0, false);
        declareFunction("uia_from_ids", "UIA-FROM-IDS", 2, 0, false);
        declareFunction("uia_determine_superior_topic_identification", "UIA-DETERMINE-SUPERIOR-TOPIC-IDENTIFICATION", 1, 0, false);
        declareMacro("do_uias", "DO-UIAS");
        declareMacro("do_uis", "DO-UIS");
        declareFunction("uia_language_parsing_mt", "UIA-LANGUAGE-PARSING-MT", 1, 0, false);
        declareFunction("uia_language_parsing_mt_update", "UIA-LANGUAGE-PARSING-MT-UPDATE", 2, 0, false);
        declareFunction("uia_language_generation_mt", "UIA-LANGUAGE-GENERATION-MT", 1, 0, false);
        declareFunction("uia_language_generation_mt_update", "UIA-LANGUAGE-GENERATION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_language_lexical_mt", "UIA-LANGUAGE-LEXICAL-MT", 1, 0, false);
        declareFunction("uia_language_lexical_mt_update", "UIA-LANGUAGE-LEXICAL-MT-UPDATE", 2, 0, false);
        declareFunction("uia_domain_mt", "UIA-DOMAIN-MT", 1, 0, false);
        declareFunction("uia_domain_mt_update", "UIA-DOMAIN-MT-UPDATE", 2, 0, false);
        declareFunction("uia_parsing_mt", "UIA-PARSING-MT", 1, 0, false);
        declareFunction("uia_parsing_mt_update", "UIA-PARSING-MT-UPDATE", 2, 0, false);
        declareFunction("uia_generation_mt", "UIA-GENERATION-MT", 1, 1, false);
        declareFunction("uia_generation_mt_update", "UIA-GENERATION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_all_interaction_mts", "UIA-ALL-INTERACTION-MTS", 1, 1, false);
        declareFunction("uia_note_interaction_mt", "UIA-NOTE-INTERACTION-MT", 2, 0, false);
        declareFunction("uia_domain_interaction_mt", "UIA-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_domain_interaction_mt_update", "UIA-DOMAIN-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_parsing_interaction_mt", "UIA-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_parsing_interaction_mt_update", "UIA-PARSING-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_generation_interaction_mt", "UIA-GENERATION-INTERACTION-MT", 1, 1, false);
        declareFunction("uia_generation_language_mt", "UIA-GENERATION-LANGUAGE-MT", 1, 0, false);
        declareFunction("uia_generation_domain_mt", "UIA-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction("uia_generation_interaction_mt_update", "UIA-GENERATION-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("uia_lexical_interaction_mt", "UIA-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_lexical_interaction_mt_update", "UIA-LEXICAL-INTERACTION-MT-UPDATE", 2, 0, false);
        declareFunction("ui_domain_interaction_mt", "UI-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("ui_parsing_interaction_mt", "UI-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction("ui_generation_interaction_mt", "UI-GENERATION-INTERACTION-MT", 1, 0, false);
        declareFunction("ui_generation_language_mt", "UI-GENERATION-LANGUAGE-MT", 1, 0, false);
        declareFunction("ui_generation_domain_mt", "UI-GENERATION-DOMAIN-MT", 1, 0, false);
        declareFunction("ui_lexical_interaction_mt", "UI-LEXICAL-INTERACTION-MT", 1, 0, false);
        declareFunction("uia_ensure_scenario_interaction_mt", "UIA-ENSURE-SCENARIO-INTERACTION-MT", 1, 0, false);
        declareFunction("user_interaction_meta_agenda_print_function_trampoline", "USER-INTERACTION-META-AGENDA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_interaction_meta_agenda_p", "USER-INTERACTION-META-AGENDA-P", 1, 0, false);
        new user_interaction_agenda.$user_interaction_meta_agenda_p$UnaryFunction();
        declareFunction("uima_id", "UIMA-ID", 1, 0, false);
        declareFunction("uima_isg", "UIMA-ISG", 1, 0, false);
        declareFunction("uima_index", "UIMA-INDEX", 1, 0, false);
        declareFunction("uima_open_agendas", "UIMA-OPEN-AGENDAS", 1, 0, false);
        declareFunction("uima_current_agenda", "UIMA-CURRENT-AGENDA", 1, 0, false);
        declareFunction("uima_state", "UIMA-STATE", 1, 0, false);
        declareFunction("_csetf_uima_id", "_CSETF-UIMA-ID", 2, 0, false);
        declareFunction("_csetf_uima_isg", "_CSETF-UIMA-ISG", 2, 0, false);
        declareFunction("_csetf_uima_index", "_CSETF-UIMA-INDEX", 2, 0, false);
        declareFunction("_csetf_uima_open_agendas", "_CSETF-UIMA-OPEN-AGENDAS", 2, 0, false);
        declareFunction("_csetf_uima_current_agenda", "_CSETF-UIMA-CURRENT-AGENDA", 2, 0, false);
        declareFunction("_csetf_uima_state", "_CSETF-UIMA-STATE", 2, 0, false);
        declareFunction("make_user_interaction_meta_agenda", "MAKE-USER-INTERACTION-META-AGENDA", 0, 1, false);
        declareFunction("visit_defstruct_user_interaction_meta_agenda", "VISIT-DEFSTRUCT-USER-INTERACTION-META-AGENDA", 2, 0, false);
        declareFunction("visit_defstruct_object_user_interaction_meta_agenda_method", "VISIT-DEFSTRUCT-OBJECT-USER-INTERACTION-META-AGENDA-METHOD", 2, 0, false);
        declareFunction("new_uima", "NEW-UIMA", 0, 0, false);
        declareFunction("uima_reset", "UIMA-RESET", 1, 0, false);
        declareFunction("uima_find_by_id", "UIMA-FIND-BY-ID", 2, 0, false);
        declareFunction("uima_find_by_id_string", "UIMA-FIND-BY-ID-STRING", 2, 0, false);
        declareFunction("uima_some_open_agendas_p", "UIMA-SOME-OPEN-AGENDAS-P", 1, 0, false);
        declareFunction("uima_open_agendas_sequence", "UIMA-OPEN-AGENDAS-SEQUENCE", 1, 0, false);
        declareFunction("uima_match_mt_to_agenda", "UIMA-MATCH-MT-TO-AGENDA", 2, 0, false);
        declareFunction("uima_add_to_index", "UIMA-ADD-TO-INDEX", 3, 0, false);
        declareFunction("uima_add_open_agenda", "UIMA-ADD-OPEN-AGENDA", 2, 0, false);
        declareFunction("uima_clear_current_agenda", "UIMA-CLEAR-CURRENT-AGENDA", 1, 0, false);
        declareFunction("uima_note_current_agenda", "UIMA-NOTE-CURRENT-AGENDA", 2, 0, false);
        declareFunction("uima_note_state", "UIMA-NOTE-STATE", 2, 0, false);
        declareMacro("do_uimas", "DO-UIMAS");
        declareFunction("system_uimma", "SYSTEM-UIMMA", 0, 0, false);
        declareFunction("uimma", "UIMMA", 0, 0, false);
        declareFunction("new_uimma", "NEW-UIMMA", 0, 0, false);
        declareFunction("uimma_reset", "UIMMA-RESET", 0, 0, false);
        declareFunction("uimma_new_id", "UIMMA-NEW-ID", 0, 0, false);
        declareFunction("uimma_add_to_index", "UIMMA-ADD-TO-INDEX", 2, 0, false);
        declareFunction("uimma_find_by_id", "UIMMA-FIND-BY-ID", 1, 0, false);
        declareFunction("uimma_default_locale", "UIMMA-DEFAULT-LOCALE", 0, 0, false);
        declareFunction("set_uimma_default_locale", "SET-UIMMA-DEFAULT-LOCALE", 1, 0, false);
        declareFunction("uimma_default_generation_mt", "UIMMA-DEFAULT-GENERATION-MT", 0, 0, false);
        declareFunction("set_uimma_default_generation_mt", "SET-UIMMA-DEFAULT-GENERATION-MT", 1, 0, false);
        declareFunction("uimma_default_domain_mt", "UIMMA-DEFAULT-DOMAIN-MT", 0, 0, false);
        declareFunction("set_uimma_default_domain_mt", "SET-UIMMA-DEFAULT-DOMAIN-MT", 1, 0, false);
        declareFunction("ui_meta_agenda", "UI-META-AGENDA", 1, 0, false);
        declareFunction("uia_total_interaction_count", "UIA-TOTAL-INTERACTION-COUNT", 1, 0, false);
        declareFunction("uia_finished_interaction_count", "UIA-FINISHED-INTERACTION-COUNT", 1, 0, false);
        declareFunction("ui_state_plist_to_state", "UI-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction("ui_state_lookup", "UI-STATE-LOOKUP", 2, 1, false);
        declareFunction("ui_state_update", "UI-STATE-UPDATE", 3, 0, false);
        declareFunction("ui_state_clear", "UI-STATE-CLEAR", 2, 0, false);
        declareFunction("ui_state_clear_all", "UI-STATE-CLEAR-ALL", 1, 0, false);
        declareFunction("uia_state_plist_to_state", "UIA-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction("uia_initialize_state", "UIA-INITIALIZE-STATE", 2, 0, false);
        declareFunction("uia_state_lookup", "UIA-STATE-LOOKUP", 2, 1, false);
        declareFunction("uia_state_update", "UIA-STATE-UPDATE", 3, 0, false);
        declareFunction("uia_state_clear", "UIA-STATE-CLEAR", 2, 0, false);
        declareFunction("uia_state_clear_all", "UIA-STATE-CLEAR-ALL", 1, 0, false);
        declareFunction("uima_state_plist_to_state", "UIMA-STATE-PLIST-TO-STATE", 1, 0, false);
        declareFunction("uima_initialize_state", "UIMA-INITIALIZE-STATE", 2, 0, false);
        declareFunction("uima_state_lookup", "UIMA-STATE-LOOKUP", 2, 1, false);
        declareFunction("uima_state_update", "UIMA-STATE-UPDATE", 3, 0, false);
        declareFunction("uima_state_clear", "UIMA-STATE-CLEAR", 2, 0, false);
        declareFunction("uima_state_clear_all", "UIMA-STATE-CLEAR-ALL", 1, 0, false);
        declareMacro("with_uia_memoization_state", "WITH-UIA-MEMOIZATION-STATE");
        declareFunction("uia_memoization_state", "UIA-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uia_create_memoization_state", "UIA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uia_clear_memoization_state", "UIA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uia_clear_memoization_state_for_function", "UIA-CLEAR-MEMOIZATION-STATE-FOR-FUNCTION", 2, 0, false);
        declareMacro("with_uima_memoization_state", "WITH-UIMA-MEMOIZATION-STATE");
        declareFunction("uima_memoization_state", "UIMA-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uima_create_memoization_state", "UIMA-CREATE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("uima_clear_memoization_state", "UIMA-CLEAR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("ui_ancestor_interactions", "UI-ANCESTOR-INTERACTIONS", 1, 0, false);
        declareFunction("ui_pending_descendant_interactions", "UI-PENDING-DESCENDANT-INTERACTIONS", 1, 0, false);
        declareFunction("ui_pending_descendants_recursive", "UI-PENDING-DESCENDANTS-RECURSIVE", 2, 0, false);
        declareFunction("ui_sub_interactions", "UI-SUB-INTERACTIONS", 1, 0, false);
        declareFunction("ui_super_interaction", "UI-SUPER-INTERACTION", 1, 0, false);
        declareFunction("ui_add_sub_interaction", "UI-ADD-SUB-INTERACTION", 2, 0, false);
        declareFunction("ui_remove_sub_interaction", "UI-REMOVE-SUB-INTERACTION", 1, 0, false);
        declareFunction("ui_note_super_interaction", "UI-NOTE-SUPER-INTERACTION", 2, 0, false);
        declareFunction("uia_act_promote_to_child", "UIA-ACT-PROMOTE-TO-CHILD", 1, 0, false);
        declareFunction("ui_recompute_status", "UI-RECOMPUTE-STATUS", 1, 0, false);
        declareFunction("ui_alive_p", "UI-ALIVE-P", 1, 0, false);
        declareFunction("uia_next_action", "UIA-NEXT-ACTION", 1, 0, false);
        declareFunction("uia_note_user_selection", "UIA-NOTE-USER-SELECTION", 2, 0, false);
        declareFunction("uia_promote_interaction", "UIA-PROMOTE-INTERACTION", 2, 0, false);
        declareFunction("uia_best_pending_action", "UIA-BEST-PENDING-ACTION", 1, 0, false);
        declareFunction("uia_pending_action_p", "UIA-PENDING-ACTION-P", 1, 0, false);
        declareFunction("uia_first_pending_nonbackground_action", "UIA-FIRST-PENDING-NONBACKGROUND-ACTION", 1, 0, false);
        declareFunction("uia_signature_p", "UIA-SIGNATURE-P", 1, 0, false);
        declareFunction("uia_signature", "UIA-SIGNATURE", 1, 0, false);
        declareFunction("find_uia_by_signature", "FIND-UIA-BY-SIGNATURE", 1, 0, false);
        declareFunction("ui_signature_p", "UI-SIGNATURE-P", 1, 0, false);
        declareFunction("ui_signature", "UI-SIGNATURE", 1, 0, false);
        declareFunction("ui_signature_to_property_list", "UI-SIGNATURE-TO-PROPERTY-LIST", 1, 0, false);
        declareFunction("find_ui_by_signature", "FIND-UI-BY-SIGNATURE", 1, 0, false);
        declareFunction("uia_schedule_frame_for_refresh", "UIA-SCHEDULE-FRAME-FOR-REFRESH", 2, 0, false);
        declareFunction("uia_get_frames_scheduled_for_refresh", "UIA-GET-FRAMES-SCHEDULED-FOR-REFRESH", 1, 0, false);
        declareFunction("uia_crumb_trail", "UIA-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_create_new_crumb_trail", "UIA-CREATE-NEW-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_update_term_crumb_trail", "UIA-UPDATE-TERM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_update_fact_crumb_trail", "UIA-UPDATE-FACT-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_update_question_crumb_trail", "UIA-UPDATE-QUESTION-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_crumb_trail_stale_assertionP", "UIA-CRUMB-TRAIL-STALE-ASSERTION?", 1, 0, false);
        declareFunction("uia_crumb_trail_el_sentenceP", "UIA-CRUMB-TRAIL-EL-SENTENCE?", 1, 0, false);
        declareFunction("uia_crumb_trail_facts_equalP", "UIA-CRUMB-TRAIL-FACTS-EQUAL?", 2, 0, false);
        declareFunction("uia_get_term_crumb_trail", "UIA-GET-TERM-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_fact_crumb_trail", "UIA-GET-FACT-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_question_crumb_trail", "UIA-GET-QUESTION-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_remove_crumb_trail_term", "UIA-REMOVE-CRUMB-TRAIL-TERM", 2, 0, false);
        declareFunction("uia_remove_crumb_trail_fact", "UIA-REMOVE-CRUMB-TRAIL-FACT", 2, 0, false);
        declareFunction("uia_remove_crumb_trail_question", "UIA-REMOVE-CRUMB-TRAIL-QUESTION", 2, 0, false);
        declareFunction("uia_shorten_term_crumb_trail", "UIA-SHORTEN-TERM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_shorten_fact_crumb_trail", "UIA-SHORTEN-FACT-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_shorten_question_crumb_trail", "UIA-SHORTEN-QUESTION-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_reset_crumb_trail", "UIA-RESET-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_add_term_to_crumb_trail", "UIA-ADD-TERM-TO-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_add_question_to_crumb_trail", "UIA-ADD-QUESTION-TO-CRUMB-TRAIL", 2, 1, false);
        declareFunction("uia_add_fact_to_crumb_trail", "UIA-ADD-FACT-TO-CRUMB-TRAIL", 2, 1, false);
        declareFunction("uia_crumb_trail_encapsulate_assertion", "UIA-CRUMB-TRAIL-ENCAPSULATE-ASSERTION", 1, 0, false);
        declareFunction("uia_crumb_trail_encapsulate_sentence", "UIA-CRUMB-TRAIL-ENCAPSULATE-SENTENCE", 2, 0, false);
        declareFunction("uia_get_terms_on_crumb_trail", "UIA-GET-TERMS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_facts_on_crumb_trail", "UIA-GET-FACTS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_get_questions_on_crumb_trail", "UIA-GET-QUESTIONS-ON-CRUMB-TRAIL", 1, 0, false);
        declareFunction("uia_anything_on_crumb_trailP", "UIA-ANYTHING-ON-CRUMB-TRAIL?", 1, 0, false);
        declareFunction("uia_remove_term_from_crumb_trail", "UIA-REMOVE-TERM-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_remove_fact_from_crumb_trail", "UIA-REMOVE-FACT-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_remove_question_from_crumb_trail", "UIA-REMOVE-QUESTION-FROM-CRUMB-TRAIL", 2, 0, false);
        declareFunction("uia_shorten_crumb_trail_to", "UIA-SHORTEN-CRUMB-TRAIL-TO", 1, 1, false);
        declareFunction("uima_act_create", "UIMA-ACT-CREATE", 0, 1, false);
        declareFunction("uima_act_focus", "UIMA-ACT-FOCUS", 2, 0, false);
        declareFunction("uia_act_create", "UIA-ACT-CREATE", 1, 1, false);
        declareFunction("uia_act_standard_initialization", "UIA-ACT-STANDARD-INITIALIZATION", 1, 0, false);
        declareFunction("uima_act_reset", "UIMA-ACT-RESET", 1, 1, false);
        declareFunction("uia_act_reset", "UIA-ACT-RESET", 1, 1, false);
        declareFunction("uia_act_clear_memoization", "UIA-ACT-CLEAR-MEMOIZATION", 1, 0, false);
        declareMacro("uia_launch_action_in_frame", "UIA-LAUNCH-ACTION-IN-FRAME");
        declareFunction("uia_act_new_interaction", "UIA-ACT-NEW-INTERACTION", 3, 2, false);
        declareFunction("uia_act_new_sub_interaction", "UIA-ACT-NEW-SUB-INTERACTION", 2, 2, false);
        declareFunction("uia_act_add_dependent", "UIA-ACT-ADD-DEPENDENT", 3, 0, false);
        declareFunction("uia_act_new_acknowledge_message", "UIA-ACT-NEW-ACKNOWLEDGE-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_timed_acknowledge_message", "UIA-ACT-NEW-TIMED-ACKNOWLEDGE-MESSAGE", 3, 0, false);
        declareFunction("uia_act_new_message", "UIA-ACT-NEW-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_quick_message", "UIA-ACT-NEW-QUICK-MESSAGE", 2, 0, false);
        declareFunction("uia_act_new_timed_message", "UIA-ACT-NEW-TIMED-MESSAGE", 3, 0, false);
        declareFunction("uia_act_new_comment", "UIA-ACT-NEW-COMMENT", 2, 0, false);
        declareFunction("ui_request_p", "UI-REQUEST-P", 1, 0, false);
        declareFunction("invalid_ui_signature", "INVALID-UI-SIGNATURE", 0, 0, false);
        declareFunction("valid_ui_request_p", "VALID-UI-REQUEST-P", 1, 0, false);
        declareFunction("ui_action_type_p", "UI-ACTION-TYPE-P", 1, 0, false);
        declareFunction("make_ui_request", "MAKE-UI-REQUEST", 3, 0, false);
        declareFunction("make_empty_ui_request", "MAKE-EMPTY-UI-REQUEST", 0, 0, false);
        declareFunction("make_invalid_ui_request", "MAKE-INVALID-UI-REQUEST", 0, 0, false);
        declareFunction("make_ui_reply_with_interaction", "MAKE-UI-REPLY-WITH-INTERACTION", 3, 0, false);
        declareFunction("make_ui_reply_with_agenda", "MAKE-UI-REPLY-WITH-AGENDA", 4, 0, false);
        declareFunction("make_ui_reply", "MAKE-UI-REPLY", 3, 0, false);
        declareFunction("uia_glob", "UIA-GLOB", 1, 0, false);
        declareFunction("uia_glob_reset", "UIA-GLOB-RESET", 1, 0, false);
        declareFunction("uia_glob_add", "UIA-GLOB-ADD", 2, 0, false);
        declareFunction("uia_glob_remove", "UIA-GLOB-REMOVE", 2, 0, false);
        declareFunction("uia_glob_lookup", "UIA-GLOB-LOOKUP", 2, 1, false);
        declareFunction("uia_glob_pop", "UIA-GLOB-POP", 2, 1, false);
        declareFunction("uia_glob_remove_by_id_string", "UIA-GLOB-REMOVE-BY-ID-STRING", 2, 0, false);
        declareFunction("uia_glob_lookup_by_id_string", "UIA-GLOB-LOOKUP-BY-ID-STRING", 2, 1, false);
        declareFunction("uia_glob_pop_by_id_string", "UIA-GLOB-POP-BY-ID-STRING", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_user_interaction_agenda_file_alt() {
        deflexical("*UIA-LOCK*", NIL != boundp($uia_lock$) ? ((SubLObject) ($uia_lock$.getGlobalValue())) : make_lock($$$User_Interaction_Agenda_lock));
        deflexical("*USER-INTERACTION-MODES*", $list_alt4);
        deflexical("*USER-INTERACTION-STATUSES*", $list_alt5);
        defconstant("*DTP-USER-INTERACTION*", USER_INTERACTION);
        defconstant("*DTP-USER-INTERACTION-AGENDA*", USER_INTERACTION_AGENDA);
        defparameter("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*", T);
        defconstant("*DTP-USER-INTERACTION-META-AGENDA*", USER_INTERACTION_META_AGENDA);
        deflexical("*UIMMA*", NIL != boundp($uimma$) ? ((SubLObject) ($uimma$.getGlobalValue())) : NIL);
        deflexical("*UIMMA-DEFAULT-LOCALE*", NIL != boundp($uimma_default_locale$) ? ((SubLObject) ($uimma_default_locale$.getGlobalValue())) : NIL != system_info.cycorp_execution_context_p() ? ((SubLObject) ($$EnglishLanguage)) : $$EnglishLanguage);
        deflexical("*UIMMA-DEFAULT-GENERATION-MT*", NIL != boundp($uimma_default_generation_mt$) ? ((SubLObject) ($uimma_default_generation_mt$.getGlobalValue())) : $$EnglishParaphraseMt);
        deflexical("*UIMMA-DEFAULT-DOMAIN-MT*", NIL != boundp($uimma_default_domain_mt$) ? ((SubLObject) ($uimma_default_domain_mt$.getGlobalValue())) : $$EverythingPSC);
        defparameter("*UIA-FRAMELESS-ENVIRONMENT?*", NIL);
        deflexical("*INVALID-UI-SIGNATURE*", $list_alt227);
        deflexical("*INVALID-UI-REQUEST*", list($UNKNOWN_INTERACTION, $UNKNOWN_ACTION, invalid_ui_signature()));
        deflexical("*UIA-GENERATE-NEXT-REQUEST-MAX-NESTING-DEPTH*", $int$75);
        defparameter("*UIA-GENERATE-NEXT-REQUEST-NESTING-DEPTH*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject init_user_interaction_agenda_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*UIA-LOCK*", SubLTrampolineFile.maybeDefault($uia_lock$, $uia_lock$, () -> make_lock($$$User_Interaction_Agenda_lock)));
            deflexical("*USER-INTERACTION-MODES*", $list4);
            deflexical("*USER-INTERACTION-STATUSES*", $list5);
            defconstant("*DTP-USER-INTERACTION*", USER_INTERACTION);
            defconstant("*DTP-USER-INTERACTION-AGENDA*", USER_INTERACTION_AGENDA);
            defparameter("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*", T);
            defconstant("*DTP-USER-INTERACTION-META-AGENDA*", USER_INTERACTION_META_AGENDA);
            deflexical("*UIMMA*", SubLTrampolineFile.maybeDefault($uimma$, $uimma$, NIL));
            deflexical("*UIMMA-DEFAULT-LOCALE*", SubLTrampolineFile.maybeDefault($uimma_default_locale$, $uimma_default_locale$, () -> NIL != system_info.cycorp_execution_context_p() ? $$EnglishLanguage : $$EnglishLanguage));
            deflexical("*UIMMA-DEFAULT-GENERATION-MT*", SubLTrampolineFile.maybeDefault($uimma_default_generation_mt$, $uimma_default_generation_mt$, $$EnglishParaphraseMt));
            deflexical("*UIMMA-DEFAULT-DOMAIN-MT*", SubLTrampolineFile.maybeDefault($uimma_default_domain_mt$, $uimma_default_domain_mt$, $$EverythingPSC));
            defparameter("*UIA-FRAMELESS-ENVIRONMENT?*", NIL);
            deflexical("*INVALID-UI-SIGNATURE*", $list229);
            deflexical("*INVALID-UI-REQUEST*", list($UNKNOWN_INTERACTION, $UNKNOWN_ACTION, invalid_ui_signature()));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*UIA-LOCK*", NIL != boundp($uia_lock$) ? ((SubLObject) ($uia_lock$.getGlobalValue())) : make_lock($$$User_Interaction_Agenda_lock));
            deflexical("*UIMMA*", NIL != boundp($uimma$) ? ((SubLObject) ($uimma$.getGlobalValue())) : NIL);
            deflexical("*UIMMA-DEFAULT-LOCALE*", NIL != boundp($uimma_default_locale$) ? ((SubLObject) ($uimma_default_locale$.getGlobalValue())) : NIL != system_info.cycorp_execution_context_p() ? ((SubLObject) ($$EnglishLanguage)) : $$EnglishLanguage);
            deflexical("*UIMMA-DEFAULT-GENERATION-MT*", NIL != boundp($uimma_default_generation_mt$) ? ((SubLObject) ($uimma_default_generation_mt$.getGlobalValue())) : $$EnglishParaphraseMt);
            deflexical("*UIMMA-DEFAULT-DOMAIN-MT*", NIL != boundp($uimma_default_domain_mt$) ? ((SubLObject) ($uimma_default_domain_mt$.getGlobalValue())) : $$EverythingPSC);
            deflexical("*INVALID-UI-SIGNATURE*", $list_alt227);
            deflexical("*UIA-GENERATE-NEXT-REQUEST-MAX-NESTING-DEPTH*", $int$75);
            defparameter("*UIA-GENERATE-NEXT-REQUEST-NESTING-DEPTH*", ZERO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject init_user_interaction_agenda_file_Previous() {
        deflexical("*UIA-LOCK*", SubLTrampolineFile.maybeDefault($uia_lock$, $uia_lock$, () -> make_lock($$$User_Interaction_Agenda_lock)));
        deflexical("*USER-INTERACTION-MODES*", $list4);
        deflexical("*USER-INTERACTION-STATUSES*", $list5);
        defconstant("*DTP-USER-INTERACTION*", USER_INTERACTION);
        defconstant("*DTP-USER-INTERACTION-AGENDA*", USER_INTERACTION_AGENDA);
        defparameter("*UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?*", T);
        defconstant("*DTP-USER-INTERACTION-META-AGENDA*", USER_INTERACTION_META_AGENDA);
        deflexical("*UIMMA*", SubLTrampolineFile.maybeDefault($uimma$, $uimma$, NIL));
        deflexical("*UIMMA-DEFAULT-LOCALE*", SubLTrampolineFile.maybeDefault($uimma_default_locale$, $uimma_default_locale$, () -> NIL != system_info.cycorp_execution_context_p() ? $$EnglishLanguage : $$EnglishLanguage));
        deflexical("*UIMMA-DEFAULT-GENERATION-MT*", SubLTrampolineFile.maybeDefault($uimma_default_generation_mt$, $uimma_default_generation_mt$, $$EnglishParaphraseMt));
        deflexical("*UIMMA-DEFAULT-DOMAIN-MT*", SubLTrampolineFile.maybeDefault($uimma_default_domain_mt$, $uimma_default_domain_mt$, $$EverythingPSC));
        defparameter("*UIA-FRAMELESS-ENVIRONMENT?*", NIL);
        deflexical("*INVALID-UI-SIGNATURE*", $list229);
        deflexical("*INVALID-UI-REQUEST*", list($UNKNOWN_INTERACTION, $UNKNOWN_ACTION, invalid_ui_signature()));
        return NIL;
    }

    public static final SubLObject setup_user_interaction_agenda_file_alt() {
        declare_defglobal($uia_lock$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(UI_ID, _CSETF_UI_ID);
        def_csetf(UI_AGENDA, _CSETF_UI_AGENDA);
        def_csetf(UI_MODE, _CSETF_UI_MODE);
        def_csetf(UI_STATUS, _CSETF_UI_STATUS);
        def_csetf(UI_START_TIME, _CSETF_UI_START_TIME);
        def_csetf(UI_FINISH_TIME, _CSETF_UI_FINISH_TIME);
        def_csetf(UI_PARENT_INTERACTION, _CSETF_UI_PARENT_INTERACTION);
        def_csetf(UI_CHILD_INTERACTIONS, _CSETF_UI_CHILD_INTERACTIONS);
        def_csetf(UI_OPERATOR, _CSETF_UI_OPERATOR);
        def_csetf(UI_ARGS, _CSETF_UI_ARGS);
        def_csetf(UI_RESULT, _CSETF_UI_RESULT);
        def_csetf(UI_STATE, _CSETF_UI_STATE);
        identity(USER_INTERACTION);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(UIA_ID, _CSETF_UIA_ID);
        def_csetf(UIA_META_AGENDA, _CSETF_UIA_META_AGENDA);
        def_csetf(UIA_ISG, _CSETF_UIA_ISG);
        def_csetf(UIA_INDEX, _CSETF_UIA_INDEX);
        def_csetf(UIA_HISTORY, _CSETF_UIA_HISTORY);
        def_csetf(UIA_UNDOS, _CSETF_UIA_UNDOS);
        def_csetf(UIA_MESSAGES, _CSETF_UIA_MESSAGES);
        def_csetf(UIA_REQUIREMENTS, _CSETF_UIA_REQUIREMENTS);
        def_csetf(UIA_RELEVANT_SUGGESTIONS, _CSETF_UIA_RELEVANT_SUGGESTIONS);
        def_csetf(UIA_POSSIBLE_SUGGESTIONS, _CSETF_UIA_POSSIBLE_SUGGESTIONS);
        def_csetf(UIA_COMMENTS, _CSETF_UIA_COMMENTS);
        def_csetf(UIA_STATE, _CSETF_UIA_STATE);
        identity(USER_INTERACTION_AGENDA);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_AGENDA_METHOD));
        register_html_state_variable($uia_can_treat_comments_as_mumblingP$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(UIMA_ID, _CSETF_UIMA_ID);
        def_csetf(UIMA_ISG, _CSETF_UIMA_ISG);
        def_csetf(UIMA_INDEX, _CSETF_UIMA_INDEX);
        def_csetf(UIMA_OPEN_AGENDAS, _CSETF_UIMA_OPEN_AGENDAS);
        def_csetf(UIMA_CURRENT_AGENDA, _CSETF_UIMA_CURRENT_AGENDA);
        def_csetf(UIMA_STATE, _CSETF_UIMA_STATE);
        identity(USER_INTERACTION_META_AGENDA);
        register_macro_helper(SYSTEM_UIMMA, DO_UIMAS);
        declare_defglobal($uimma$);
        if (NIL == $uimma$.getGlobalValue()) {
            uimma_reset();
        }
        declare_defglobal($uimma_default_locale$);
        declare_defglobal($uimma_default_generation_mt$);
        declare_defglobal($uimma_default_domain_mt$);
        memoization_state.note_memoized_function(KRAKEN_HELP_TEXT_MEMOIZED);
        return NIL;
    }

    public static SubLObject setup_user_interaction_agenda_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($uia_lock$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list14);
            def_csetf(UI_ID, _CSETF_UI_ID);
            def_csetf(UI_AGENDA, _CSETF_UI_AGENDA);
            def_csetf(UI_MODE, _CSETF_UI_MODE);
            def_csetf(UI_STATUS, _CSETF_UI_STATUS);
            def_csetf(UI_START_TIME, _CSETF_UI_START_TIME);
            def_csetf(UI_FINISH_TIME, _CSETF_UI_FINISH_TIME);
            def_csetf(UI_PARENT_INTERACTION, _CSETF_UI_PARENT_INTERACTION);
            def_csetf(UI_CHILD_INTERACTIONS, _CSETF_UI_CHILD_INTERACTIONS);
            def_csetf(UI_OPERATOR, _CSETF_UI_OPERATOR);
            def_csetf(UI_ARGS, _CSETF_UI_ARGS);
            def_csetf(UI_RESULT, _CSETF_UI_RESULT);
            def_csetf(UI_STATE, _CSETF_UI_STATE);
            identity(USER_INTERACTION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list72);
            def_csetf(UIA_ID, _CSETF_UIA_ID);
            def_csetf(UIA_META_AGENDA, _CSETF_UIA_META_AGENDA);
            def_csetf(UIA_ISG, _CSETF_UIA_ISG);
            def_csetf(UIA_INDEX, _CSETF_UIA_INDEX);
            def_csetf(UIA_HISTORY, _CSETF_UIA_HISTORY);
            def_csetf(UIA_UNDOS, _CSETF_UIA_UNDOS);
            def_csetf(UIA_MESSAGES, _CSETF_UIA_MESSAGES);
            def_csetf(UIA_REQUIREMENTS, _CSETF_UIA_REQUIREMENTS);
            def_csetf(UIA_RELEVANT_SUGGESTIONS, _CSETF_UIA_RELEVANT_SUGGESTIONS);
            def_csetf(UIA_POSSIBLE_SUGGESTIONS, _CSETF_UIA_POSSIBLE_SUGGESTIONS);
            def_csetf(UIA_COMMENTS, _CSETF_UIA_COMMENTS);
            def_csetf(UIA_STATE, _CSETF_UIA_STATE);
            identity(USER_INTERACTION_AGENDA);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_AGENDA_METHOD));
            register_html_state_variable($uia_can_treat_comments_as_mumblingP$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list158);
            def_csetf(UIMA_ID, _CSETF_UIMA_ID);
            def_csetf(UIMA_ISG, _CSETF_UIMA_ISG);
            def_csetf(UIMA_INDEX, _CSETF_UIMA_INDEX);
            def_csetf(UIMA_OPEN_AGENDAS, _CSETF_UIMA_OPEN_AGENDAS);
            def_csetf(UIMA_CURRENT_AGENDA, _CSETF_UIMA_CURRENT_AGENDA);
            def_csetf(UIMA_STATE, _CSETF_UIMA_STATE);
            identity(USER_INTERACTION_META_AGENDA);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD));
            register_macro_helper(SYSTEM_UIMMA, DO_UIMAS);
            declare_defglobal($uimma$);
            if (NIL == $uimma$.getGlobalValue()) {
                uimma_reset();
            }
            declare_defglobal($uimma_default_locale$);
            declare_defglobal($uimma_default_generation_mt$);
            declare_defglobal($uimma_default_domain_mt$);
        }
        if (SubLFiles.USE_V2) {
            register_html_state_variable($uia_can_treat_comments_as_mumblingP$);
            memoization_state.note_memoized_function(KRAKEN_HELP_TEXT_MEMOIZED);
        }
        return NIL;
    }

    public static SubLObject setup_user_interaction_agenda_file_Previous() {
        declare_defglobal($uia_lock$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(USER_INTERACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(UI_ID, _CSETF_UI_ID);
        def_csetf(UI_AGENDA, _CSETF_UI_AGENDA);
        def_csetf(UI_MODE, _CSETF_UI_MODE);
        def_csetf(UI_STATUS, _CSETF_UI_STATUS);
        def_csetf(UI_START_TIME, _CSETF_UI_START_TIME);
        def_csetf(UI_FINISH_TIME, _CSETF_UI_FINISH_TIME);
        def_csetf(UI_PARENT_INTERACTION, _CSETF_UI_PARENT_INTERACTION);
        def_csetf(UI_CHILD_INTERACTIONS, _CSETF_UI_CHILD_INTERACTIONS);
        def_csetf(UI_OPERATOR, _CSETF_UI_OPERATOR);
        def_csetf(UI_ARGS, _CSETF_UI_ARGS);
        def_csetf(UI_RESULT, _CSETF_UI_RESULT);
        def_csetf(UI_STATE, _CSETF_UI_STATE);
        identity(USER_INTERACTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list72);
        def_csetf(UIA_ID, _CSETF_UIA_ID);
        def_csetf(UIA_META_AGENDA, _CSETF_UIA_META_AGENDA);
        def_csetf(UIA_ISG, _CSETF_UIA_ISG);
        def_csetf(UIA_INDEX, _CSETF_UIA_INDEX);
        def_csetf(UIA_HISTORY, _CSETF_UIA_HISTORY);
        def_csetf(UIA_UNDOS, _CSETF_UIA_UNDOS);
        def_csetf(UIA_MESSAGES, _CSETF_UIA_MESSAGES);
        def_csetf(UIA_REQUIREMENTS, _CSETF_UIA_REQUIREMENTS);
        def_csetf(UIA_RELEVANT_SUGGESTIONS, _CSETF_UIA_RELEVANT_SUGGESTIONS);
        def_csetf(UIA_POSSIBLE_SUGGESTIONS, _CSETF_UIA_POSSIBLE_SUGGESTIONS);
        def_csetf(UIA_COMMENTS, _CSETF_UIA_COMMENTS);
        def_csetf(UIA_STATE, _CSETF_UIA_STATE);
        identity(USER_INTERACTION_AGENDA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_AGENDA_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_user_interaction_agenda$.getGlobalValue(), symbol_function(SXHASH_USER_INTERACTION_AGENDA_METHOD));
        register_html_state_variable($uia_can_treat_comments_as_mumblingP$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(USER_INTERACTION_META_AGENDA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list158);
        def_csetf(UIMA_ID, _CSETF_UIMA_ID);
        def_csetf(UIMA_ISG, _CSETF_UIMA_ISG);
        def_csetf(UIMA_INDEX, _CSETF_UIMA_INDEX);
        def_csetf(UIMA_OPEN_AGENDAS, _CSETF_UIMA_OPEN_AGENDAS);
        def_csetf(UIMA_CURRENT_AGENDA, _CSETF_UIMA_CURRENT_AGENDA);
        def_csetf(UIMA_STATE, _CSETF_UIMA_STATE);
        identity(USER_INTERACTION_META_AGENDA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_interaction_meta_agenda$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_INTERACTION_META_AGENDA_METHOD));
        register_macro_helper(SYSTEM_UIMMA, DO_UIMAS);
        declare_defglobal($uimma$);
        if (NIL == $uimma$.getGlobalValue()) {
            uimma_reset();
        }
        declare_defglobal($uimma_default_locale$);
        declare_defglobal($uimma_default_generation_mt$);
        declare_defglobal($uimma_default_domain_mt$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_user_interaction_agenda_file();
    }

    @Override
    public void initializeVariables() {
        init_user_interaction_agenda_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_user_interaction_agenda_file();
    }

    static {
    }

    public static final class $user_interaction_p$UnaryFunction extends UnaryFunction {
        public $user_interaction_p$UnaryFunction() {
            super(extractFunctionNamed("USER-INTERACTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_p(arg1);
        }
    }

    public static final class $user_interaction_agenda_p$UnaryFunction extends UnaryFunction {
        public $user_interaction_agenda_p$UnaryFunction() {
            super(extractFunctionNamed("USER-INTERACTION-AGENDA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_agenda_p(arg1);
        }
    }

    public static final class $user_interaction_meta_agenda_p$UnaryFunction extends UnaryFunction {
        public $user_interaction_meta_agenda_p$UnaryFunction() {
            super(extractFunctionNamed("USER-INTERACTION-META-AGENDA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_interaction_meta_agenda_p(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("*UIA-LOCK*"));

    static private final SubLList $list_alt4 = list($UNDO, makeKeyword("MESSAGE"), makeKeyword("REQUIRED"), makeKeyword("RELEVANT"), makeKeyword("POSSIBLE"), makeKeyword("COMMENT"));

    static private final SubLList $list_alt5 = list(makeKeyword("BLOCKED"), makeKeyword("PENDING"), makeKeyword("COMPLETED"), makeKeyword("REJECTED"), makeKeyword("INVALIDATED"));

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("AGENDA"), makeSymbol("MODE"), makeSymbol("STATUS"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("PARENT-INTERACTION"), makeSymbol("CHILD-INTERACTIONS"), makeSymbol("OPERATOR"), makeSymbol("ARGS"), makeSymbol("RESULT"), makeSymbol("STATE") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("AGENDA"), $MODE, makeKeyword("STATUS"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("PARENT-INTERACTION"), makeKeyword("CHILD-INTERACTIONS"), makeKeyword("OPERATOR"), $ARGS, makeKeyword("RESULT"), makeKeyword("STATE") });

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeSymbol("UI-ID"), makeSymbol("UI-AGENDA"), makeSymbol("UI-MODE"), makeSymbol("UI-STATUS"), makeSymbol("UI-START-TIME"), makeSymbol("UI-FINISH-TIME"), makeSymbol("UI-PARENT-INTERACTION"), makeSymbol("UI-CHILD-INTERACTIONS"), makeSymbol("UI-OPERATOR"), makeSymbol("UI-ARGS"), makeSymbol("UI-RESULT"), makeSymbol("UI-STATE") });

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("_CSETF-UI-ID"), makeSymbol("_CSETF-UI-AGENDA"), makeSymbol("_CSETF-UI-MODE"), makeSymbol("_CSETF-UI-STATUS"), makeSymbol("_CSETF-UI-START-TIME"), makeSymbol("_CSETF-UI-FINISH-TIME"), makeSymbol("_CSETF-UI-PARENT-INTERACTION"), makeSymbol("_CSETF-UI-CHILD-INTERACTIONS"), makeSymbol("_CSETF-UI-OPERATOR"), makeSymbol("_CSETF-UI-ARGS"), makeSymbol("_CSETF-UI-RESULT"), makeSymbol("_CSETF-UI-STATE") });

    static private final SubLString $str_alt50$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt52$__UI__A__A__S_ = makeString("#<UI ~A:~A:~S>");

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("META-AGENDA"), makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("HISTORY"), makeSymbol("UNDOS"), makeSymbol("MESSAGES"), makeSymbol("REQUIREMENTS"), makeSymbol("RELEVANT-SUGGESTIONS"), makeSymbol("POSSIBLE-SUGGESTIONS"), makeSymbol("COMMENTS"), makeSymbol("STATE") });

    static private final SubLList $list_alt61 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("META-AGENDA"), makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("HISTORY"), makeKeyword("UNDOS"), makeKeyword("MESSAGES"), makeKeyword("REQUIREMENTS"), makeKeyword("RELEVANT-SUGGESTIONS"), makeKeyword("POSSIBLE-SUGGESTIONS"), makeKeyword("COMMENTS"), makeKeyword("STATE") });

    static private final SubLList $list_alt62 = list(new SubLObject[]{ makeSymbol("UIA-ID"), makeSymbol("UIA-META-AGENDA"), makeSymbol("UIA-ISG"), makeSymbol("UIA-INDEX"), makeSymbol("UIA-HISTORY"), makeSymbol("UIA-UNDOS"), makeSymbol("UIA-MESSAGES"), makeSymbol("UIA-REQUIREMENTS"), makeSymbol("UIA-RELEVANT-SUGGESTIONS"), makeSymbol("UIA-POSSIBLE-SUGGESTIONS"), makeSymbol("UIA-COMMENTS"), makeSymbol("UIA-STATE") });

    static private final SubLList $list_alt63 = list(new SubLObject[]{ makeSymbol("_CSETF-UIA-ID"), makeSymbol("_CSETF-UIA-META-AGENDA"), makeSymbol("_CSETF-UIA-ISG"), makeSymbol("_CSETF-UIA-INDEX"), makeSymbol("_CSETF-UIA-HISTORY"), makeSymbol("_CSETF-UIA-UNDOS"), makeSymbol("_CSETF-UIA-MESSAGES"), makeSymbol("_CSETF-UIA-REQUIREMENTS"), makeSymbol("_CSETF-UIA-RELEVANT-SUGGESTIONS"), makeSymbol("_CSETF-UIA-POSSIBLE-SUGGESTIONS"), makeSymbol("_CSETF-UIA-COMMENTS"), makeSymbol("_CSETF-UIA-STATE") });

    static private final SubLString $str_alt101$__UIA__A_ = makeString("#<UIA ~A>");

    static private final SubLSymbol $sym104$_ = makeSymbol("<");

    static private final SubLList $list_alt110 = list(makeSymbol("MESSAGE"));

    static private final SubLString $str_alt117$_S__S = makeString("~S ~S");

    static private final SubLString $$$undetermined = makeString("undetermined");

    static private final SubLList $list_alt122 = list(makeKeyword("TOPIC"));

    static private final SubLList $list_alt124 = list(list(makeSymbol("UIA"), makeSymbol("UIMA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("UI"), makeSymbol("UIA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt145 = list(makeSymbol("ID"), makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("OPEN-AGENDAS"), makeSymbol("CURRENT-AGENDA"), makeSymbol("STATE"));

    static private final SubLList $list_alt146 = list(makeKeyword("ID"), makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("OPEN-AGENDAS"), makeKeyword("CURRENT-AGENDA"), makeKeyword("STATE"));

    static private final SubLList $list_alt147 = list(makeSymbol("UIMA-ID"), makeSymbol("UIMA-ISG"), makeSymbol("UIMA-INDEX"), makeSymbol("UIMA-OPEN-AGENDAS"), makeSymbol("UIMA-CURRENT-AGENDA"), makeSymbol("UIMA-STATE"));

    static private final SubLList $list_alt148 = list(makeSymbol("_CSETF-UIMA-ID"), makeSymbol("_CSETF-UIMA-ISG"), makeSymbol("_CSETF-UIMA-INDEX"), makeSymbol("_CSETF-UIMA-OPEN-AGENDAS"), makeSymbol("_CSETF-UIMA-CURRENT-AGENDA"), makeSymbol("_CSETF-UIMA-STATE"));

    static private final SubLList $list_alt165 = list(list(makeSymbol("UIMA"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt166 = list($DONE);

    static private final SubLSymbol $sym169$ID = makeUninternedSymbol("ID");

    static private final SubLList $list_alt171 = list(makeSymbol("SYSTEM-UIMMA"));

    static private final SubLList $list_alt184 = list(list(makeSymbol("AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym185$STATE = makeUninternedSymbol("STATE");

    static private final SubLList $list_alt190 = list(list(makeSymbol("META-AGENDA")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym191$STATE = makeUninternedSymbol("STATE");

    static private final SubLList $list_alt201 = list(makeSymbol("META-AGENDA-ID"), makeSymbol("AGENDA-ID"));

    static private final SubLList $list_alt203 = list(makeSymbol("UIMA"), makeSymbol("UIA"), makeSymbol("UI"));

    static private final SubLList $list_alt207 = list(makeSymbol("META-AGENDA-ID"), makeSymbol("AGENDA-ID"), makeSymbol("INTERACTION-ID"));

    static private final SubLList $list_alt218 = list(makeSymbol("FRAME"), makeSymbol("AGENDA"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt226 = listS(makeSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeSymbol("SIGNATURE"), makeSymbol("PLIST"));

    static private final SubLList $list_alt227 = list(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);

    public static final SubLInteger $int$75 = makeInteger(75);

    static private final SubLString $str_alt233$Exceeded_maximum_nesting_depth_fo = makeString("Exceeded maximum nesting depth for UIA-GENERATE-NEXT-REQUEST.");

    static private final SubLString $str_alt237$Error__ = makeString("Error: ");

    static private final SubLString $str_alt238$no_hint_for__a = makeString("no hint for ~a");



    static private final SubLList $list_alt241 = list(makeSymbol("?TEXT"));

    static private final SubLString $str_alt242$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym243$_TEXT = makeSymbol("?TEXT");



    private static final SubLSymbol KRAKEN_HELP_TEXT_MEMOIZED = makeSymbol("KRAKEN-HELP-TEXT-MEMOIZED");

    public static final SubLSymbol $kw246$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 909 ms
 */
