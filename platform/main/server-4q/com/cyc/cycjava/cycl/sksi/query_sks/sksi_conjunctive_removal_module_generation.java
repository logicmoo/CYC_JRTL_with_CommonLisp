package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_conjunctive_removal_module_generation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_conjunctive_removal_module_generation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation";

    public static final String myFingerPrint = "26501e8bce1f7e301b747df9db69913846555a6c3887c2f0f3f9b0739a4c14a3";



    // deflexical
    /**
     * Since the actual cost is near-impossible to compute and we always want this
     * modult to apply when applicable, pretend to be very cheap
     */
    private static final SubLSymbol $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$ = makeSymbol("*REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST*");

    // Internal Constants
    public static final SubLSymbol $sksi_conjunctive_removal_modules$ = makeSymbol("*SKSI-CONJUNCTIVE-REMOVAL-MODULES*");

    public static final SubLList $list1 = list(list(makeSymbol("SKS"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym2$HL_MODULES = makeUninternedSymbol("HL-MODULES");



    public static final SubLList $list4 = list(makeSymbol("*SKSI-CONJUNCTIVE-REMOVAL-MODULES*"));



    public static final SubLList $list6 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym7$SKS = makeUninternedSymbol("SKS");

    public static final SubLSymbol DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS = makeSymbol("DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES-BY-SKS");



    private static final SubLObject $$sksDoesNotAllowConjunctiveRemoval = reader_make_constant_shell(makeString("sksDoesNotAllowConjunctiveRemoval"));

    public static final SubLString $str11$SKSI_conjunctive_removal_module_f = makeString("SKSI conjunctive removal module for ");

    public static final SubLString $str12$_ = makeString(".");













    public static final SubLSymbol REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY = makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY");





    public static final SubLSymbol REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST = makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-COST");



    public static final SubLSymbol REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS = makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS");

    private static final SubLSymbol $EXPAND_ITERATIVE_PATTERN = makeKeyword("EXPAND-ITERATIVE-PATTERN");

    public static final SubLSymbol REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE = makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-OUTPUT-GENERATE");



    public static final SubLSymbol DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME = makeSymbol("DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME");

    public static final SubLString $str29$_ = makeString("-");

    public static final SubLString $str30$_ = makeString("_");

    public static final SubLString $str31$REMOVAL_SKSI_ = makeString("REMOVAL-SKSI-");

    public static final SubLString $str32$_CONJUNCTION_POS_LITS = makeString("-CONJUNCTION-POS-LITS");

    private static final SubLSymbol $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI = makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-APPLICABILITY");

    private static final SubLSymbol REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST = makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST");

    private static final SubLSymbol $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN = makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COMPLETENESS");

    private static final SubLSymbol $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE = makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-OUTPUT-GENERATE");







    private static final SubLString $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC = makeString("-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS");



    private static final SubLList $list42 = list(makeSymbol("THIS-MT"), makeSymbol("ASENT"));



    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLSymbol NEW_POS_SUBCLAUSE_SPEC = makeSymbol("NEW-POS-SUBCLAUSE-SPEC");





    public static final SubLSymbol $sym48$BINDINGS_EQUAL_ = makeSymbol("BINDINGS-EQUAL?");

    public static SubLObject note_sksi_conjunctive_removal_module(final SubLObject hl_module, final SubLObject sks) {
        return dictionary_utilities.dictionary_push($sksi_conjunctive_removal_modules$.getGlobalValue(), sks, hl_module);
    }

    public static SubLObject un_note_sksi_conjunctive_removal_module(final SubLObject sks) {
        return dictionary_utilities.dictionary_pop($sksi_conjunctive_removal_modules$.getGlobalValue(), sks);
    }

    public static SubLObject clear_sksi_conjunctive_removal_modules() {
        return dictionary.clear_dictionary($sksi_conjunctive_removal_modules$.getGlobalValue());
    }

    public static SubLObject look_up_sksi_conjunctive_removal_modules(final SubLObject sks) {
        return dictionary.dictionary_lookup($sksi_conjunctive_removal_modules$.getGlobalValue(), sks, UNPROVIDED);
    }

    public static SubLObject sksi_conjunctive_removal_modules_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_conjunctive_removal_modules$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_modules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            count = add(count, length(hl_modules));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }

    public static SubLObject some_sksi_conjunctive_removal_module_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_conjunctive_removal_modules$.getGlobalValue()));
    }

    public static SubLObject do_sksi_conjunctive_removal_modules_by_sks(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = NIL;
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject hl_modules = $sym2$HL_MODULES;
            return list(DO_DICTIONARY, listS(sks, hl_modules, $list4), listS(CDOLIST, list(hl_module, hl_modules), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static SubLObject do_sksi_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sks = $sym7$SKS;
            return listS(DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS, list(sks, hl_module), list(IGNORE, sks), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static SubLObject register_sksi_conjunctive_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    SubLObject ks = NIL;
                    ks = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        count = add(count, register_sksi_conjunctive_removal_module_for_just_sks(ks, mapping_mt, NIL));
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }

    public static SubLObject register_sksi_conjunctive_removal_module_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        deregister_sksi_conjunctive_removal_module_for_just_sks(sks, UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL != register_sksi_conjunctive_removal_module_for_just_sks_int(sks, mapping_mt)) {
                    count = ONE_INTEGER;
                }
                if (NIL != register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int(sks, mapping_mt)) {
                    count = ONE_INTEGER;
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }

    public static SubLObject deregister_sksi_conjunctive_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = NIL;
            ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, deregister_sksi_conjunctive_removal_module_for_just_sks(ks, NIL));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }

    public static SubLObject deregister_sksi_conjunctive_removal_module_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        SubLObject hl_modules = look_up_sksi_conjunctive_removal_modules(sks);
        SubLObject count = ZERO_INTEGER;
        if (NIL != hl_modules) {
            if (!hl_modules.isCons()) {
                hl_modules = list(hl_modules);
            }
            SubLObject cdolist_list_var = hl_modules;
            SubLObject hl_module = NIL;
            hl_module = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                un_note_sksi_conjunctive_removal_module(sks);
                inference_modules.undeclare_inference_conjunctive_removal_module(name);
                if (NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                count = ONE_INTEGER;
                cdolist_list_var = cdolist_list_var.rest();
                hl_module = cdolist_list_var.first();
            } 
        }
        return count;
    }

    public static SubLObject deregister_all_sksi_conjunctive_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_conjunctive_removal_modules$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_modules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = hl_modules;
            SubLObject hl_module = NIL;
            hl_module = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                inference_modules.undeclare_inference_conjunctive_removal_module(name);
                count = add(count, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                hl_module = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        clear_sksi_conjunctive_removal_modules();
        inference_modules.reclassify_removal_modules();
        return count;
    }

    public static SubLObject sks_does_not_allow_conjunctive_removalP(final SubLObject sks) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value_gaf(sks, $$sksDoesNotAllowConjunctiveRemoval, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject register_sksi_conjunctive_removal_module_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, T);
        SubLObject hl_module = NIL;
        if ((NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile)) && (NIL == sks_does_not_allow_conjunctive_removalP(sks))) {
            SubLObject direction = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mapping_mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mapping_mt), thread);
                direction = sksi_kb_accessors.get_sks_multi_literal_lookup_direction_from_kb(sks);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            final SubLObject name = determine_sksi_conjunctive_removal_module_name(sks);
            final SubLObject doc_string = cconcatenate($str11$SKSI_conjunctive_removal_module_f, new SubLObject[]{ format_nil.format_nil_s_no_copy(sks), $str12$_ });
            final SubLObject plist = list(new SubLObject[]{ $MODULE_SUBTYPE, $SKSI, $MODULE_SOURCE, sks, $DIRECTION, direction, $APPLICABILITY_PATTERN, list($CALL, REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY, $INPUT, sks_profile), $COST_PATTERN, list($CALL, REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST, $INPUT, sks_profile), $COMPLETENESS_PATTERN, list($CALL, REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS, $INPUT, sks_profile), $EXPAND_ITERATIVE_PATTERN, list($CALL, REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE, $INPUT, sks_profile), $DOCUMENTATION, doc_string });
            hl_module = inference_modules.inference_conjunctive_removal_module(name, plist);
            note_sksi_conjunctive_removal_module(hl_module, sks);
        }
        return hl_module;
    }

    public static SubLObject determine_sksi_conjunctive_removal_module_name_internal(final SubLObject sks) {
        if (NIL == sks) {
            return NIL;
        }
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
        final SubLObject core_name_string = (NIL != sks_name) ? string_utilities.string_substitute($str29$_, $str30$_, Strings.string_upcase(sks_name, UNPROVIDED, UNPROVIDED), UNPROVIDED) : NIL;
        final SubLObject core_name_symbol = gensym(core_name_string);
        final SubLObject name_string = cconcatenate($str31$REMOVAL_SKSI_, new SubLObject[]{ format_nil.format_nil_a_no_copy(core_name_symbol), $str32$_CONJUNCTION_POS_LITS });
        final SubLObject name = make_keyword(name_string);
        return name;
    }

    public static SubLObject determine_sksi_conjunctive_removal_module_name(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return determine_sksi_conjunctive_removal_module_name_internal(sks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sks, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(determine_sksi_conjunctive_removal_module_name_internal(sks)));
            memoization_state.caching_state_put(caching_state, sks, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, T);
        SubLObject hl_module = NIL;
        if ((NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile)) && (NIL == sks_does_not_allow_conjunctive_removalP(sks))) {
            SubLObject direction = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mapping_mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mapping_mt), thread);
                direction = sksi_kb_accessors.get_sks_multi_literal_lookup_direction_from_kb(sks);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            final SubLObject name = determine_sksi_conjunctive_removal_with_unknown_sentence_module_name(sks);
            final SubLObject supplants_name = determine_sksi_conjunctive_removal_module_name(sks);
            final SubLObject doc_string = cconcatenate($str11$SKSI_conjunctive_removal_module_f, new SubLObject[]{ format_nil.format_nil_s_no_copy(sks), $str12$_ });
            final SubLObject plist = list(new SubLObject[]{ $MODULE_SUBTYPE, $SKSI, $MODULE_SOURCE, sks, $DIRECTION, direction, $APPLICABILITY_PATTERN, list($CALL, $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI, $INPUT, sks_profile), $COST_PATTERN, list($CALL, REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST, $INPUT, sks_profile), $COMPLETENESS_PATTERN, list($CALL, $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN, $INPUT, sks_profile), $EXPAND_ITERATIVE_PATTERN, list($CALL, $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE, $INPUT, sks_profile), $EXCLUSIVE, TRUE, $SUPPLANTS, list(supplants_name), $DOCUMENTATION, doc_string });
            hl_module = inference_modules.inference_conjunctive_removal_module(name, plist);
            note_sksi_conjunctive_removal_module(hl_module, sks);
        }
        return hl_module;
    }

    public static SubLObject determine_sksi_conjunctive_removal_with_unknown_sentence_module_name(final SubLObject sks) {
        if (NIL == sks) {
            return NIL;
        }
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
        final SubLObject core_name_string = (NIL != sks_name) ? string_utilities.string_substitute($str29$_, $str30$_, Strings.string_upcase(sks_name, UNPROVIDED, UNPROVIDED), UNPROVIDED) : NIL;
        final SubLObject core_name_symbol = gensym(core_name_string);
        final SubLObject name_string = cconcatenate($str31$REMOVAL_SKSI_, new SubLObject[]{ format_nil.format_nil_a_no_copy(core_name_symbol), $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC });
        final SubLObject name = make_keyword(name_string);
        return name;
    }

    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_applicability(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != inference_macros.current_controlling_inference()) && (NIL == sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread))) {
            return NIL;
        }
        if (NIL == inference_worker_split.all_literals_connected_by_shared_varsP(contextualized_dnf_clause)) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject mt = NIL;
        SubLObject sense = $NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list42);
            this_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list42);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != mt) {
                    if (!this_mt.equal(mt)) {
                        return NIL;
                    }
                } else {
                    mt = this_mt;
                }
            } else {
                cdestructuring_bind_error(datum, $list42);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        sense = $POS;
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list42);
            this_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list42);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != mt) {
                    if (!this_mt.equal(mt)) {
                        return NIL;
                    }
                } else {
                    mt = this_mt;
                }
            } else {
                cdestructuring_bind_error(datum, $list42);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        SubLObject unknown_sentence_literals = NIL;
        SubLObject other_literals = NIL;
        SubLObject sense2 = $NEG;
        SubLObject index_var2 = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent2 = NIL;
        contextualized_asent2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = contextualized_asent2;
            SubLObject this_mt2 = NIL;
            SubLObject asent2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list42);
            this_mt2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list42);
            asent2 = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent2, $$unknownSentence)) {
                    unknown_sentence_literals = cons(asent2, unknown_sentence_literals);
                } else {
                    other_literals = cons(asent2, other_literals);
                }
            } else {
                cdestructuring_bind_error(datum2, $list42);
            }
            index_var2 = add(index_var2, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            contextualized_asent2 = cdolist_list_var2.first();
        } 
        sense2 = $POS;
        index_var2 = ZERO_INTEGER;
        cdolist_list_var2 = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent2 = NIL;
        contextualized_asent2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = contextualized_asent2;
            SubLObject this_mt2 = NIL;
            SubLObject asent2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list42);
            this_mt2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list42);
            asent2 = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent2, $$unknownSentence)) {
                    unknown_sentence_literals = cons(asent2, unknown_sentence_literals);
                } else {
                    other_literals = cons(asent2, other_literals);
                }
            } else {
                cdestructuring_bind_error(datum2, $list42);
            }
            index_var2 = add(index_var2, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            contextualized_asent2 = cdolist_list_var2.first();
        } 
        if (NIL == unknown_sentence_literals) {
            return NIL;
        }
        final SubLObject other_literals_free_vars = sentence_free_variables(make_conjunction(other_literals), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var3 = unknown_sentence_literals;
        SubLObject unknown_sentence_literal = NIL;
        unknown_sentence_literal = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            if (NIL != set_difference(sentence_free_variables(unknown_sentence_literal, UNPROVIDED, UNPROVIDED, UNPROVIDED), other_literals_free_vars, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            unknown_sentence_literal = cdolist_list_var3.first();
        } 
        final SubLObject _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.currentBinding(thread);
        try {
            sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind(NIL, thread);
            sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.bind(ONE_INTEGER, thread);
            if (NIL != sksi_conjunctive_removal_modules_applicability.removal_sksi_conjunction_pos_lits_applicability(contextualized_dnf_clause, sks_profile)) {
                SubLObject num = ZERO_INTEGER;
                cdolist_list_var3 = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject lit = NIL;
                lit = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    result = cons(num, result);
                    num = add(num, ONE_INTEGER);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    lit = cdolist_list_var3.first();
                } 
                result = Mapping.mapcar(NEW_POS_SUBCLAUSE_SPEC, list(result));
            }
        } finally {
            sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.rebind(_prev_bind_2, thread);
            sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        return $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$.getGlobalValue();
    }

    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_completeness(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        return $INCOMPLETE;
    }

    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_output_generate(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject non_unknown_sentence_query_lits = NIL;
        SubLObject unknown_sentence_asents_made_known_lits = NIL;
        SubLObject mt = NIL;
        SubLObject sense = $NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list42);
            this_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list42);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == mt) {
                    mt = this_mt;
                }
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$unknownSentence)) {
                    unknown_sentence_asents_made_known_lits = cons(cycl_utilities.sentence_arg1(asent, UNPROVIDED), unknown_sentence_asents_made_known_lits);
                } else {
                    non_unknown_sentence_query_lits = cons(asent, non_unknown_sentence_query_lits);
                }
            } else {
                cdestructuring_bind_error(datum, $list42);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        sense = $POS;
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list42);
            this_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list42);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == mt) {
                    mt = this_mt;
                }
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$unknownSentence)) {
                    unknown_sentence_asents_made_known_lits = cons(cycl_utilities.sentence_arg1(asent, UNPROVIDED), unknown_sentence_asents_made_known_lits);
                } else {
                    non_unknown_sentence_query_lits = cons(asent, non_unknown_sentence_query_lits);
                }
            } else {
                cdestructuring_bind_error(datum, $list42);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        final SubLObject non_unknown_sentence_query = make_conjunction(non_unknown_sentence_query_lits);
        final SubLObject non_unknown_sentence_query_properties = inference_trampolines.determine_sentence_recursive_query_properties(non_unknown_sentence_query, mt);
        SubLObject raw_results = NIL;
        final SubLObject _prev_bind_0 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
        try {
            inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject non_unknown_sentence_query_results = ask_utilities.inference_recursive_query_unique_bindings(non_unknown_sentence_query, mt, non_unknown_sentence_query_properties);
            final SubLObject non_unknown_sentence_query_halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (non_unknown_sentence_query_halt_reason == $ABORT) {
                inference_strategist.query_abort();
            }
            raw_results = non_unknown_sentence_query_results;
            if (NIL != raw_results) {
                SubLObject cdolist_list_var2 = unknown_sentence_asents_made_known_lits;
                SubLObject unknown_sentence_asents_made_known_lit = NIL;
                unknown_sentence_asents_made_known_lit = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    final SubLObject unknown_sentence_asents_made_known_query = make_conjunction(cons(unknown_sentence_asents_made_known_lit, non_unknown_sentence_query_lits));
                    final SubLObject unknown_sentence_asents_made_known_query_properties = inference_trampolines.determine_sentence_recursive_query_properties(unknown_sentence_asents_made_known_query, mt);
                    thread.resetMultipleValues();
                    final SubLObject unknown_sentence_asents_made_known_results = ask_utilities.inference_recursive_query_unique_bindings(unknown_sentence_asents_made_known_query, mt, unknown_sentence_asents_made_known_query_properties);
                    final SubLObject unknown_sentence_asents_made_known_halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (unknown_sentence_asents_made_known_halt_reason == $ABORT) {
                        inference_strategist.query_abort();
                    }
                    raw_results = set_difference(raw_results, unknown_sentence_asents_made_known_results, symbol_function($sym48$BINDINGS_EQUAL_), UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    unknown_sentence_asents_made_known_lit = cdolist_list_var2.first();
                } 
            }
        } finally {
            inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_0, thread);
        }
        SubLObject results = NIL;
        SubLObject cdolist_list_var3 = raw_results;
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            SubLObject supports = NIL;
            final SubLObject bound_clause = bindings.apply_bindings(v_bindings, contextualized_dnf_clause);
            SubLObject sense2 = $NEG;
            SubLObject index_var2 = ZERO_INTEGER;
            SubLObject cdolist_list_var_$4 = clauses.neg_lits(bound_clause);
            SubLObject contextualized_asent2 = NIL;
            contextualized_asent2 = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                SubLObject current2;
                final SubLObject datum2 = current2 = contextualized_asent2;
                SubLObject this_mt2 = NIL;
                SubLObject asent2 = NIL;
                destructuring_bind_must_consp(current2, datum2, $list42);
                this_mt2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list42);
                asent2 = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    supports = cons(list(arguments.make_hl_support($SKSI, asent2, mt, UNPROVIDED)), supports);
                } else {
                    cdestructuring_bind_error(datum2, $list42);
                }
                index_var2 = add(index_var2, ONE_INTEGER);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                contextualized_asent2 = cdolist_list_var_$4.first();
            } 
            sense2 = $POS;
            index_var2 = ZERO_INTEGER;
            SubLObject cdolist_list_var_$5 = clauses.pos_lits(bound_clause);
            contextualized_asent2 = NIL;
            contextualized_asent2 = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                SubLObject current2;
                final SubLObject datum2 = current2 = contextualized_asent2;
                SubLObject this_mt2 = NIL;
                SubLObject asent2 = NIL;
                destructuring_bind_must_consp(current2, datum2, $list42);
                this_mt2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list42);
                asent2 = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    supports = cons(list(arguments.make_hl_support($SKSI, asent2, mt, UNPROVIDED)), supports);
                } else {
                    cdestructuring_bind_error(datum2, $list42);
                }
                index_var2 = add(index_var2, ONE_INTEGER);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                contextualized_asent2 = cdolist_list_var_$5.first();
            } 
            results = cons(list(v_bindings, supports), results);
            cdolist_list_var3 = cdolist_list_var3.rest();
            v_bindings = cdolist_list_var3.first();
        } 
        return iteration.new_list_iterator(results);
    }

    public static SubLObject declare_sksi_conjunctive_removal_module_generation_file() {
        declareFunction(me, "note_sksi_conjunctive_removal_module", "NOTE-SKSI-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false);
        declareFunction(me, "un_note_sksi_conjunctive_removal_module", "UN-NOTE-SKSI-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false);
        declareFunction(me, "clear_sksi_conjunctive_removal_modules", "CLEAR-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "look_up_sksi_conjunctive_removal_modules", "LOOK-UP-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
        declareFunction(me, "sksi_conjunctive_removal_modules_count", "SKSI-CONJUNCTIVE-REMOVAL-MODULES-COUNT", 0, 0, false);
        declareFunction(me, "some_sksi_conjunctive_removal_module_registeredP", "SOME-SKSI-CONJUNCTIVE-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        declareMacro(me, "do_sksi_conjunctive_removal_modules_by_sks", "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES-BY-SKS");
        declareMacro(me, "do_sksi_conjunctive_removal_modules", "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES");
        declareFunction(me, "register_sksi_conjunctive_removal_modules_for_sks", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction(me, "register_sksi_conjunctive_removal_module_for_just_sks", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS", 1, 2, false);
        declareFunction(me, "deregister_sksi_conjunctive_removal_modules_for_sks", "DEREGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction(me, "deregister_sksi_conjunctive_removal_module_for_just_sks", "DEREGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS", 1, 1, false);
        declareFunction(me, "deregister_all_sksi_conjunctive_removal_modules", "DEREGISTER-ALL-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "sks_does_not_allow_conjunctive_removalP", "SKS-DOES-NOT-ALLOW-CONJUNCTIVE-REMOVAL?", 1, 0, false);
        declareFunction(me, "register_sksi_conjunctive_removal_module_for_just_sks_int", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS-INT", 2, 0, false);
        declareFunction(me, "determine_sksi_conjunctive_removal_module_name_internal", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME-INTERNAL", 1, 0, false);
        declareFunction(me, "determine_sksi_conjunctive_removal_module_name", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME", 1, 0, false);
        declareFunction(me, "register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-WITH-UNKNOWN-SENTENCE-MODULE-FOR-JUST-SKS-INT", 2, 0, false);
        declareFunction(me, "determine_sksi_conjunctive_removal_with_unknown_sentence_module_name", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-WITH-UNKNOWN-SENTENCE-MODULE-NAME", 1, 0, false);
        declareFunction(me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_applicability", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-APPLICABILITY", 2, 0, false);
        declareFunction(me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST", 2, 0, false);
        declareFunction(me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_completeness", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COMPLETENESS", 2, 0, false);
        declareFunction(me, "removal_sksi_conjunction_with_unknown_sentence_pos_lits_output_generate", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-OUTPUT-GENERATE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_conjunctive_removal_module_generation_file() {
        deflexical("*SKSI-CONJUNCTIVE-REMOVAL-MODULES*", SubLSystemTrampolineFile.maybeDefault($sksi_conjunctive_removal_modules$, $sksi_conjunctive_removal_modules$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST*", THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_sksi_conjunctive_removal_module_generation_file() {
        declare_defglobal($sksi_conjunctive_removal_modules$);
        memoization_state.note_memoized_function(DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME);
        note_funcall_helper_function($sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI);
        note_funcall_helper_function(REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST);
        note_funcall_helper_function($sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN);
        note_funcall_helper_function($sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_conjunctive_removal_module_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_conjunctive_removal_module_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_module_generation_file();
    }

    
}

/**
 * Total time: 258 ms
 */
