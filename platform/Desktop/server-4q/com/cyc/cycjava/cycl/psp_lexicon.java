package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.psp_lexicon";
    public static final String myFingerPrint = "c89a6007b42c780987c7f46970e6010adf3bebd868f08a6a7afcf65d278933ef";
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 1826L)
    private static SubLSymbol $get_default_psp_lexicon_explicit_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 2641L)
    private static SubLSymbol $default_psp_lexicon_semantic_filter_preds$;
    private static final SubLSymbol $sym0$PSP_LEXICON;
    private static final SubLSymbol $sym1$TERM_LEXICON_P;
    private static final SubLSymbol $sym2$COPY;
    private static final SubLSymbol $sym3$GET_DEFAULT_PSP_LEXICON_EXPLICIT;
    private static final SubLSymbol $sym4$DEFAULT_BASE_MT;
    private static final SubLSymbol $sym5$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $sym6$INITIALIZE_EXCLUDED_PREDS;
    private static final SubLSymbol $sym7$_GET_DEFAULT_PSP_LEXICON_EXPLICIT_CACHING_STATE_;
    private static final SubLInteger $int8$64;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$IGNORE_CACHE;
    private static final SubLSymbol $sym11$ALLOW_PREDICATE;
    private static final SubLObject $const12$preferredNameString;
    private static final SubLSymbol $sym13$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const14$EverythingPSC;
    private static final SubLObject $const15$titleOfWork;
    private static final SubLSymbol $kw16$DEPTH;
    private static final SubLSymbol $kw17$STACK;
    private static final SubLSymbol $kw18$QUEUE;
    private static final SubLSymbol $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw20$ERROR;
    private static final SubLString $str21$_A_is_not_a__A;
    private static final SubLSymbol $sym22$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw23$CERROR;
    private static final SubLString $str24$continue_anyway;
    private static final SubLSymbol $kw25$WARN;
    private static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const27$genlPreds;
    private static final SubLString $str28$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str29$attempting_to_bind_direction_link;
    private static final SubLString $str30$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym31$TERM_LEXICON;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$SEMTRANS_LEXICON;
    private static final SubLSymbol $sym34$OBJECT;
    private static final SubLSymbol $sym35$INSTANCE_COUNT;
    private static final SubLSymbol $sym36$ABSTRACT_LEXICON;
    private static final SubLSymbol $sym37$DEFAULT_EXCLUDE_MTS;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$DEFAULT_EXCLUDE_PREDICATES;
    private static final SubLObject $const40$AllGeneralEnglishValidatedLexical;
    private static final SubLSymbol $sym41$DEFAULT_KB_SPEC;
    private static final SubLObject $const42$AbstractLexiconSpecification;
    private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_CLASS;
    private static final SubLSymbol $sym44$ISOLATED_P;
    private static final SubLSymbol $sym45$INSTANCE_NUMBER;
    private static final SubLSymbol $sym46$ALLOWED_MTS;
    private static final SubLSymbol $kw47$UNINITIALIZED;
    private static final SubLSymbol $sym48$EXCLUDED_MTS;
    private static final SubLSymbol $sym49$BASE_MT;
    private static final SubLSymbol $sym50$ROOT_MT;
    private static final SubLSymbol $sym51$EXCLUDED_PREDS;
    private static final SubLSymbol $sym52$EXCLUDED_POS_LIST;
    private static final SubLSymbol $sym53$TRIE;
    private static final SubLSymbol $sym54$CACHE;
    private static final SubLSymbol $sym55$IGNORE_CACHE_;
    private static final SubLSymbol $sym56$CASE_SENSITIVITY;
    private static final SubLSymbol $sym57$ALLOW_FABRICATION_;
    private static final SubLSymbol $sym58$LEARNED;
    private static final SubLSymbol $sym59$ACTIVE_LEARNERS;
    private static final SubLSymbol $sym60$ALLOW_STEMMING;
    private static final SubLSymbol $sym61$STOP_WORDS;
    private static final SubLSymbol $sym62$CONVERT_TO_EL_;
    private static final SubLSymbol $sym63$CONCEPT_FILTER_SPECS;
    private static final SubLSymbol $sym64$DEPENDENT_LEXICONS;
    private static final SubLSymbol $sym65$SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_INSTANCE;
    private static final SubLSymbol $sym66$INITIALIZE;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD;
    private static final SubLSymbol $sym70$PSP_LEXICON_INITIALIZE_METHOD;
    private static final SubLSymbol $sym71$EXCLUDE_POS;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLString $str74$Can_t_exclude__S_from_a_PSP_lexic;
    private static final SubLSymbol $sym75$PSP_LEXICON_EXCLUDE_POS_METHOD;
    private static final SubLSymbol $sym76$CREATE_LEX_ENTRIES;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD;
    private static final SubLSymbol $sym80$GET_SEMTRANS_LEXICON;
    private static final SubLSymbol $sym81$PSP_LEXICON_CREATE_LEX_ENTRIES_METHOD;
    private static final SubLSymbol $sym82$SET;
    private static final SubLSymbol $kw83$DENOT;
    private static final SubLSymbol $kw84$NO_DENOT;
    private static final SubLSymbol $sym85$GET;
    private static final SubLSymbol $kw86$TRIE_ENTRY;
    private static final SubLSymbol $kw87$WORD_UNIT;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD;
    private static final SubLSymbol $sym91$NOTE_DEPENDENT_LEXICON;
    private static final SubLSymbol $sym92$PSP_LEXICON_GET_SEMTRANS_LEXICON_METHOD;
    private static final SubLSymbol $sym93$GET_SEMTRANS_ENTRIES;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD;
    private static final SubLSymbol $sym98$PSP_LEXICON_GET_SEMTRANS_ENTRIES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 838L)
    public static SubLObject new_psp_lexicon() {
        return object.new_class_instance((SubLObject)psp_lexicon.$sym0$PSP_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 917L)
    public static SubLObject new_psp_lexicon_from_term_lexicon(final SubLObject lexicon) {
        assert psp_lexicon.NIL != term_lexicon.term_lexicon_p(lexicon) : lexicon;
        final SubLObject v_psp_lexicon = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)psp_lexicon.$sym2$COPY, new_psp_lexicon());
        return v_psp_lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 1228L)
    public static SubLObject get_default_psp_lexicon(SubLObject lexicon_lookup_mt, SubLObject case_sensitivity, SubLObject filter_preds) {
        if (lexicon_lookup_mt == psp_lexicon.UNPROVIDED) {
            lexicon_lookup_mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_lexicon.UNPROVIDED);
        }
        if (case_sensitivity == psp_lexicon.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (filter_preds == psp_lexicon.UNPROVIDED) {
            filter_preds = default_psp_filter_preds();
        }
        return get_default_psp_lexicon_explicit(lexicon_lookup_mt, case_sensitivity, filter_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 1826L)
    public static SubLObject clear_get_default_psp_lexicon_explicit() {
        final SubLObject cs = psp_lexicon.$get_default_psp_lexicon_explicit_caching_state$.getGlobalValue();
        if (psp_lexicon.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 1826L)
    public static SubLObject remove_get_default_psp_lexicon_explicit(SubLObject lexicon_lookup_mt, SubLObject case_sensitivity, SubLObject filter_preds) {
        if (lexicon_lookup_mt == psp_lexicon.UNPROVIDED) {
            lexicon_lookup_mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_lexicon.UNPROVIDED);
        }
        if (case_sensitivity == psp_lexicon.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (filter_preds == psp_lexicon.UNPROVIDED) {
            filter_preds = default_psp_filter_preds();
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_lexicon.$get_default_psp_lexicon_explicit_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(lexicon_lookup_mt, case_sensitivity, filter_preds), (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 1826L)
    public static SubLObject get_default_psp_lexicon_explicit_internal(final SubLObject lexicon_lookup_mt, final SubLObject case_sensitivity, final SubLObject filter_preds) {
        final SubLObject lexicon = make_default_psp_lexicon();
        instances.set_slot(lexicon, (SubLObject)psp_lexicon.$sym4$DEFAULT_BASE_MT, lexicon_lookup_mt);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)psp_lexicon.$sym5$SET_CASE_SENSITIVITY, case_sensitivity);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)psp_lexicon.$sym6$INITIALIZE_EXCLUDED_PREDS, filter_preds);
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 1826L)
    public static SubLObject get_default_psp_lexicon_explicit(SubLObject lexicon_lookup_mt, SubLObject case_sensitivity, SubLObject filter_preds) {
        if (lexicon_lookup_mt == psp_lexicon.UNPROVIDED) {
            lexicon_lookup_mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_lexicon.UNPROVIDED);
        }
        if (case_sensitivity == psp_lexicon.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (filter_preds == psp_lexicon.UNPROVIDED) {
            filter_preds = default_psp_filter_preds();
        }
        SubLObject caching_state = psp_lexicon.$get_default_psp_lexicon_explicit_caching_state$.getGlobalValue();
        if (psp_lexicon.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_lexicon.$sym3$GET_DEFAULT_PSP_LEXICON_EXPLICIT, (SubLObject)psp_lexicon.$sym7$_GET_DEFAULT_PSP_LEXICON_EXPLICIT_CACHING_STATE_, (SubLObject)psp_lexicon.$int8$64, (SubLObject)psp_lexicon.EQUAL, (SubLObject)psp_lexicon.THREE_INTEGER, (SubLObject)psp_lexicon.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lexicon_lookup_mt, case_sensitivity, filter_preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_lexicon.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_lexicon.NIL;
            collision = cdolist_list_var.first();
            while (psp_lexicon.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lexicon_lookup_mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (case_sensitivity.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (psp_lexicon.NIL != cached_args && psp_lexicon.NIL == cached_args.rest() && filter_preds.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_default_psp_lexicon_explicit_internal(lexicon_lookup_mt, case_sensitivity, filter_preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lexicon_lookup_mt, case_sensitivity, filter_preds));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 2758L)
    public static SubLObject default_psp_filter_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filter_preds = parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue(thread);
        final SubLObject iterator_var = parsing_utilities.npp_name_preds_to_exclude_iterator();
        SubLObject done_var = (SubLObject)psp_lexicon.NIL;
        final SubLObject token_var = (SubLObject)psp_lexicon.NIL;
        while (psp_lexicon.NIL == done_var) {
            final SubLObject pred = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(pred));
            if (psp_lexicon.NIL != valid) {
                final SubLObject item_var = pred;
                if (psp_lexicon.NIL == conses_high.member(item_var, filter_preds, Symbols.symbol_function((SubLObject)psp_lexicon.EQL), Symbols.symbol_function((SubLObject)psp_lexicon.IDENTITY))) {
                    filter_preds = (SubLObject)ConsesLow.cons(item_var, filter_preds);
                }
            }
            done_var = (SubLObject)SubLObjectFactory.makeBoolean(psp_lexicon.NIL == valid);
        }
        SubLObject cdolist_list_var = psp_lexicon.$default_psp_lexicon_semantic_filter_preds$.getDynamicValue(thread);
        SubLObject pred2 = (SubLObject)psp_lexicon.NIL;
        pred2 = cdolist_list_var.first();
        while (psp_lexicon.NIL != cdolist_list_var) {
            final SubLObject item_var = pred2;
            if (psp_lexicon.NIL == conses_high.member(item_var, filter_preds, Symbols.symbol_function((SubLObject)psp_lexicon.EQL), Symbols.symbol_function((SubLObject)psp_lexicon.IDENTITY))) {
                filter_preds = (SubLObject)ConsesLow.cons(item_var, filter_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred2 = cdolist_list_var.first();
        }
        return filter_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3093L)
    public static SubLObject make_default_psp_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon = new_psp_lexicon();
        methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)psp_lexicon.$sym10$IGNORE_CACHE);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)psp_lexicon.$sym11$ALLOW_PREDICATE, psp_lexicon.$const12$preferredNameString);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)psp_lexicon.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(psp_lexicon.$const14$EverythingPSC, thread);
            final SubLObject node_var = psp_lexicon.$const15$titleOfWork;
            final SubLObject deck_type = (SubLObject)psp_lexicon.$kw18$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)psp_lexicon.NIL;
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)psp_lexicon.NIL;
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((psp_lexicon.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((psp_lexicon.NIL != tv_var) ? psp_lexicon.$sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (psp_lexicon.NIL != tv_var && psp_lexicon.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && psp_lexicon.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)psp_lexicon.$kw20$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)psp_lexicon.ONE_INTEGER, (SubLObject)psp_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)psp_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)psp_lexicon.$kw23$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)psp_lexicon.ONE_INTEGER, (SubLObject)psp_lexicon.$str24$continue_anyway, (SubLObject)psp_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)psp_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)psp_lexicon.$kw25$WARN)) {
                                Errors.warn((SubLObject)psp_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)psp_lexicon.$sym22$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)psp_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)psp_lexicon.$str24$continue_anyway, (SubLObject)psp_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)psp_lexicon.$sym22$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(psp_lexicon.$const27$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(psp_lexicon.$const27$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(psp_lexicon.$const27$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)psp_lexicon.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(psp_lexicon.$const27$genlPreds), thread);
                            if (psp_lexicon.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || psp_lexicon.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(psp_lexicon.$const15$titleOfWork, sbhl_module_vars.get_sbhl_module((SubLObject)psp_lexicon.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(psp_lexicon.$const27$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)psp_lexicon.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)psp_lexicon.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(psp_lexicon.$const15$titleOfWork, sbhl_search_vars.genl_inverse_mode_p()); psp_lexicon.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$9 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject pred = node_var_$9;
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (psp_lexicon.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9)) {
                                                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)psp_lexicon.$sym11$ALLOW_PREDICATE, pred);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(psp_lexicon.$const27$genlPreds));
                                            SubLObject module_var = (SubLObject)psp_lexicon.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (psp_lexicon.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((psp_lexicon.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(psp_lexicon.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$9);
                                                    if (psp_lexicon.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)psp_lexicon.UNPROVIDED));
                                                        if (psp_lexicon.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)psp_lexicon.UNPROVIDED));
                                                            if (psp_lexicon.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); psp_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (psp_lexicon.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$14;
                                                                            for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); psp_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (psp_lexicon.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (psp_lexicon.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_lexicon.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (psp_lexicon.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && psp_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)psp_lexicon.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)psp_lexicon.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)psp_lexicon.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (psp_lexicon.NIL != csome_list_var) {
                                                                                                if (psp_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)psp_lexicon.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)psp_lexicon.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)psp_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)psp_lexicon.FIVE_INTEGER, (SubLObject)psp_lexicon.$str29$attempting_to_bind_direction_link, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (psp_lexicon.NIL != obsolete.cnat_p(node, (SubLObject)psp_lexicon.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$16;
                                                        final SubLObject new_list = cdolist_list_var_$16 = ((psp_lexicon.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)psp_lexicon.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)psp_lexicon.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)psp_lexicon.NIL;
                                                        generating_fn = cdolist_list_var_$16.first();
                                                        while (psp_lexicon.NIL != cdolist_list_var_$16) {
                                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (psp_lexicon.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)psp_lexicon.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); psp_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (psp_lexicon.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && psp_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)psp_lexicon.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)psp_lexicon.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)psp_lexicon.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (psp_lexicon.NIL != csome_list_var2) {
                                                                        if (psp_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)psp_lexicon.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)psp_lexicon.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)psp_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$9, thread);
                                                            }
                                                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                            generating_fn = cdolist_list_var_$16.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)psp_lexicon.TWO_INTEGER, (SubLObject)psp_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, psp_lexicon.$const15$titleOfWork, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)psp_lexicon.UNPROVIDED)), (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED, (SubLObject)psp_lexicon.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_lexicon.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3401L)
    public static SubLObject get_psp_lexicon_semtrans_lexicon(final SubLObject v_psp_lexicon) {
        final SubLObject v_class = (SubLObject)(v_psp_lexicon.isSymbol() ? classes.classes_retrieve_class(v_psp_lexicon) : ((psp_lexicon.NIL != subloop_structures.class_p(v_psp_lexicon)) ? v_psp_lexicon : ((psp_lexicon.NIL != subloop_structures.instance_p(v_psp_lexicon)) ? subloop_structures.instance_class(v_psp_lexicon) : psp_lexicon.NIL)));
        if (psp_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)psp_lexicon.$sym33$SEMTRANS_LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)psp_lexicon.FIVE_INTEGER);
        }
        return (SubLObject)psp_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3401L)
    public static SubLObject set_psp_lexicon_semtrans_lexicon(final SubLObject v_psp_lexicon, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_psp_lexicon.isSymbol() ? classes.classes_retrieve_class(v_psp_lexicon) : ((psp_lexicon.NIL != subloop_structures.class_p(v_psp_lexicon)) ? v_psp_lexicon : ((psp_lexicon.NIL != subloop_structures.instance_p(v_psp_lexicon)) ? subloop_structures.instance_class(v_psp_lexicon) : psp_lexicon.NIL)));
        if (psp_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)psp_lexicon.$sym33$SEMTRANS_LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)psp_lexicon.FIVE_INTEGER, value);
        }
        return (SubLObject)psp_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3401L)
    public static SubLObject subloop_reserved_initialize_psp_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym34$OBJECT, (SubLObject)psp_lexicon.$sym35$INSTANCE_COUNT, (SubLObject)psp_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym37$DEFAULT_EXCLUDE_MTS, (SubLObject)psp_lexicon.$list38);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym39$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym4$DEFAULT_BASE_MT, psp_lexicon.$const40$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym41$DEFAULT_KB_SPEC, psp_lexicon.$const42$AbstractLexiconSpecification);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym33$SEMTRANS_LEXICON, (SubLObject)psp_lexicon.NIL);
        return (SubLObject)psp_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3401L)
    public static SubLObject subloop_reserved_initialize_psp_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym34$OBJECT, (SubLObject)psp_lexicon.$sym44$ISOLATED_P, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym34$OBJECT, (SubLObject)psp_lexicon.$sym45$INSTANCE_NUMBER, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym46$ALLOWED_MTS, (SubLObject)psp_lexicon.$kw47$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym48$EXCLUDED_MTS, (SubLObject)psp_lexicon.$kw47$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym49$BASE_MT, (SubLObject)psp_lexicon.$kw47$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym50$ROOT_MT, (SubLObject)psp_lexicon.$kw47$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym51$EXCLUDED_PREDS, (SubLObject)psp_lexicon.$kw47$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym52$EXCLUDED_POS_LIST, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym53$TRIE, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym54$CACHE, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym55$IGNORE_CACHE_, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym56$CASE_SENSITIVITY, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym57$ALLOW_FABRICATION_, (SubLObject)psp_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym58$LEARNED, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym59$ACTIVE_LEARNERS, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym60$ALLOW_STEMMING, (SubLObject)psp_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym36$ABSTRACT_LEXICON, (SubLObject)psp_lexicon.$sym61$STOP_WORDS, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym31$TERM_LEXICON, (SubLObject)psp_lexicon.$sym62$CONVERT_TO_EL_, (SubLObject)psp_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym31$TERM_LEXICON, (SubLObject)psp_lexicon.$sym63$CONCEPT_FILTER_SPECS, (SubLObject)psp_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)psp_lexicon.$sym31$TERM_LEXICON, (SubLObject)psp_lexicon.$sym64$DEPENDENT_LEXICONS, (SubLObject)psp_lexicon.NIL);
        return (SubLObject)psp_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3401L)
    public static SubLObject psp_lexicon_p(final SubLObject v_psp_lexicon) {
        return classes.subloop_instanceof_class(v_psp_lexicon, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3611L)
    public static SubLObject psp_lexicon_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = (SubLObject)psp_lexicon.NIL;
        SubLObject excluded_pos_list = abstract_lexicon.get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push(psp_lexicon.$sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                term_lexicon.term_lexicon_initialize_method(self);
                excluded_pos_list = (SubLObject)psp_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)psp_lexicon.$sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)psp_lexicon.$sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3786L)
    public static SubLObject psp_lexicon_exclude_pos_method(final SubLObject self, final SubLObject pos) {
        Errors.error((SubLObject)psp_lexicon.$str74$Can_t_exclude__S_from_a_PSP_lexic, pos);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 3972L)
    public static SubLObject psp_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = (SubLObject)psp_lexicon.NIL;
        final SubLObject v_semtrans_lexicon = get_psp_lexicon_semtrans_lexicon(self);
        try {
            thread.throwStack.push(psp_lexicon.$sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                SubLObject lex_entries = term_lexicon.term_lexicon_create_lex_entries_method(self, string, nl_trie_entry);
                if (psp_lexicon.NIL != list_utilities.empty_list_p(lex_entries)) {
                    final SubLObject v_semtrans_lexicon_$19 = methods.funcall_instance_method_with_0_args(self, (SubLObject)psp_lexicon.$sym80$GET_SEMTRANS_LEXICON);
                    final SubLObject semtrans_entries = methods.funcall_instance_method_with_2_args(v_semtrans_lexicon_$19, (SubLObject)psp_lexicon.$sym76$CREATE_LEX_ENTRIES, string, nl_trie_entry);
                    if (psp_lexicon.NIL == list_utilities.empty_list_p(semtrans_entries)) {
                        lex_entries = psp_lex_entries_from_semtrans_lex_entries(semtrans_entries);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)psp_lexicon.$sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, lex_entries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_psp_lexicon_semtrans_lexicon(self, v_semtrans_lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)psp_lexicon.$sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 4844L)
    public static SubLObject psp_lex_entries_from_semtrans_lex_entries(final SubLObject semtrans_entries) {
        SubLObject cdolist_list_var = semtrans_entries;
        SubLObject semtrans_entry = (SubLObject)psp_lexicon.NIL;
        semtrans_entry = cdolist_list_var.first();
        while (psp_lexicon.NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_2_args(semtrans_entry, (SubLObject)psp_lexicon.$sym82$SET, (SubLObject)psp_lexicon.$kw83$DENOT, (SubLObject)psp_lexicon.$kw84$NO_DENOT);
            final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(semtrans_entry, (SubLObject)psp_lexicon.$sym85$GET, (SubLObject)psp_lexicon.$kw86$TRIE_ENTRY);
            final SubLObject wu = (SubLObject)((psp_lexicon.NIL != nl_trie.nl_trie_word_p(trie_entry, (SubLObject)psp_lexicon.UNPROVIDED)) ? nl_trie.nl_trie_word_word_unit(trie_entry, (SubLObject)psp_lexicon.NIL) : psp_lexicon.NIL);
            methods.funcall_instance_method_with_2_args(semtrans_entry, (SubLObject)psp_lexicon.$sym82$SET, (SubLObject)psp_lexicon.$kw87$WORD_UNIT, wu);
            cdolist_list_var = cdolist_list_var.rest();
            semtrans_entry = cdolist_list_var.first();
        }
        return semtrans_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 5236L)
    public static SubLObject psp_lexicon_get_semtrans_lexicon_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = (SubLObject)psp_lexicon.NIL;
        SubLObject v_semtrans_lexicon = get_psp_lexicon_semtrans_lexicon(self);
        try {
            thread.throwStack.push(psp_lexicon.$sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                if (psp_lexicon.NIL == semtrans_lexicon.semtrans_lexicon_p(v_semtrans_lexicon)) {
                    v_semtrans_lexicon = semtrans_lexicon.semtrans_lexicon_from_term_lexicon(self);
                    abstract_lexicon.set_abstract_lexicon_base_mt(v_semtrans_lexicon, abstract_lexicon.get_abstract_lexicon_base_mt(self));
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)psp_lexicon.$sym91$NOTE_DEPENDENT_LEXICON, v_semtrans_lexicon);
                }
                Dynamic.sublisp_throw((SubLObject)psp_lexicon.$sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, v_semtrans_lexicon);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_psp_lexicon_semtrans_lexicon(self, v_semtrans_lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)psp_lexicon.$sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-lexicon.lisp", position = 5679L)
    public static SubLObject psp_lexicon_get_semtrans_entries_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = (SubLObject)psp_lexicon.NIL;
        final SubLObject v_semtrans_lexicon = get_psp_lexicon_semtrans_lexicon(self);
        try {
            thread.throwStack.push(psp_lexicon.$sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                final SubLObject v_semtrans_lexicon_$20 = methods.funcall_instance_method_with_0_args(self, (SubLObject)psp_lexicon.$sym80$GET_SEMTRANS_LEXICON);
                Dynamic.sublisp_throw((SubLObject)psp_lexicon.$sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, methods.funcall_instance_method_with_1_args(v_semtrans_lexicon_$20, (SubLObject)psp_lexicon.$sym85$GET, string));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_psp_lexicon_semtrans_lexicon(self, v_semtrans_lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)psp_lexicon.$sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }
    
    public static SubLObject declare_psp_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "new_psp_lexicon", "NEW-PSP-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "new_psp_lexicon_from_term_lexicon", "NEW-PSP-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "get_default_psp_lexicon", "GET-DEFAULT-PSP-LEXICON", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "clear_get_default_psp_lexicon_explicit", "CLEAR-GET-DEFAULT-PSP-LEXICON-EXPLICIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "remove_get_default_psp_lexicon_explicit", "REMOVE-GET-DEFAULT-PSP-LEXICON-EXPLICIT", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "get_default_psp_lexicon_explicit_internal", "GET-DEFAULT-PSP-LEXICON-EXPLICIT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "get_default_psp_lexicon_explicit", "GET-DEFAULT-PSP-LEXICON-EXPLICIT", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "default_psp_filter_preds", "DEFAULT-PSP-FILTER-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "make_default_psp_lexicon", "MAKE-DEFAULT-PSP-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "get_psp_lexicon_semtrans_lexicon", "GET-PSP-LEXICON-SEMTRANS-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "set_psp_lexicon_semtrans_lexicon", "SET-PSP-LEXICON-SEMTRANS-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "subloop_reserved_initialize_psp_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "subloop_reserved_initialize_psp_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lexicon_p", "PSP-LEXICON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lexicon_initialize_method", "PSP-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lexicon_exclude_pos_method", "PSP-LEXICON-EXCLUDE-POS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lexicon_create_lex_entries_method", "PSP-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lex_entries_from_semtrans_lex_entries", "PSP-LEX-ENTRIES-FROM-SEMTRANS-LEX-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lexicon_get_semtrans_lexicon_method", "PSP-LEXICON-GET-SEMTRANS-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_lexicon", "psp_lexicon_get_semtrans_entries_method", "PSP-LEXICON-GET-SEMTRANS-ENTRIES-METHOD", 2, 0, false);
        return (SubLObject)psp_lexicon.NIL;
    }
    
    public static SubLObject init_psp_lexicon_file() {
        psp_lexicon.$get_default_psp_lexicon_explicit_caching_state$ = SubLFiles.deflexical("*GET-DEFAULT-PSP-LEXICON-EXPLICIT-CACHING-STATE*", (SubLObject)psp_lexicon.NIL);
        psp_lexicon.$default_psp_lexicon_semantic_filter_preds$ = SubLFiles.defparameter("*DEFAULT-PSP-LEXICON-SEMANTIC-FILTER-PREDS*", (SubLObject)psp_lexicon.$list9);
        return (SubLObject)psp_lexicon.NIL;
    }
    
    public static SubLObject setup_psp_lexicon_file() {
        memoization_state.note_globally_cached_function((SubLObject)psp_lexicon.$sym3$GET_DEFAULT_PSP_LEXICON_EXPLICIT);
        classes.subloop_new_class((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym31$TERM_LEXICON, (SubLObject)psp_lexicon.NIL, (SubLObject)psp_lexicon.NIL, (SubLObject)psp_lexicon.$list32);
        classes.class_set_implements_slot_listeners((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym43$SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym65$SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_INSTANCE);
        subloop_reserved_initialize_psp_lexicon_class((SubLObject)psp_lexicon.$sym0$PSP_LEXICON);
        methods.methods_incorporate_instance_method((SubLObject)psp_lexicon.$sym66$INITIALIZE, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$list67, (SubLObject)psp_lexicon.NIL, (SubLObject)psp_lexicon.$list68);
        methods.subloop_register_instance_method((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym66$INITIALIZE, (SubLObject)psp_lexicon.$sym70$PSP_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)psp_lexicon.$sym71$EXCLUDE_POS, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$list67, (SubLObject)psp_lexicon.$list72, (SubLObject)psp_lexicon.$list73);
        methods.subloop_register_instance_method((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym71$EXCLUDE_POS, (SubLObject)psp_lexicon.$sym75$PSP_LEXICON_EXCLUDE_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)psp_lexicon.$sym76$CREATE_LEX_ENTRIES, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$list67, (SubLObject)psp_lexicon.$list77, (SubLObject)psp_lexicon.$list78);
        methods.subloop_register_instance_method((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym76$CREATE_LEX_ENTRIES, (SubLObject)psp_lexicon.$sym81$PSP_LEXICON_CREATE_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)psp_lexicon.$sym80$GET_SEMTRANS_LEXICON, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$list88, (SubLObject)psp_lexicon.NIL, (SubLObject)psp_lexicon.$list89);
        methods.subloop_register_instance_method((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym80$GET_SEMTRANS_LEXICON, (SubLObject)psp_lexicon.$sym92$PSP_LEXICON_GET_SEMTRANS_LEXICON_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)psp_lexicon.$sym93$GET_SEMTRANS_ENTRIES, (SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$list94, (SubLObject)psp_lexicon.$list95, (SubLObject)psp_lexicon.$list96);
        methods.subloop_register_instance_method((SubLObject)psp_lexicon.$sym0$PSP_LEXICON, (SubLObject)psp_lexicon.$sym93$GET_SEMTRANS_ENTRIES, (SubLObject)psp_lexicon.$sym98$PSP_LEXICON_GET_SEMTRANS_ENTRIES_METHOD);
        return (SubLObject)psp_lexicon.NIL;
    }
    
    public void declareFunctions() {
        declare_psp_lexicon_file();
    }
    
    public void initializeVariables() {
        init_psp_lexicon_file();
    }
    
    public void runTopLevelForms() {
        setup_psp_lexicon_file();
    }
    
    static {
        me = (SubLFile)new psp_lexicon();
        psp_lexicon.$get_default_psp_lexicon_explicit_caching_state$ = null;
        psp_lexicon.$default_psp_lexicon_semantic_filter_preds$ = null;
        $sym0$PSP_LEXICON = SubLObjectFactory.makeSymbol("PSP-LEXICON");
        $sym1$TERM_LEXICON_P = SubLObjectFactory.makeSymbol("TERM-LEXICON-P");
        $sym2$COPY = SubLObjectFactory.makeSymbol("COPY");
        $sym3$GET_DEFAULT_PSP_LEXICON_EXPLICIT = SubLObjectFactory.makeSymbol("GET-DEFAULT-PSP-LEXICON-EXPLICIT");
        $sym4$DEFAULT_BASE_MT = SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT");
        $sym5$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $sym6$INITIALIZE_EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS");
        $sym7$_GET_DEFAULT_PSP_LEXICON_EXPLICIT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-DEFAULT-PSP-LEXICON-EXPLICIT-CACHING-STATE*");
        $int8$64 = SubLObjectFactory.makeInteger(64);
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")));
        $sym10$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
        $sym11$ALLOW_PREDICATE = SubLObjectFactory.makeSymbol("ALLOW-PREDICATE");
        $const12$preferredNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $sym13$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const14$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const15$titleOfWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork"));
        $kw16$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw17$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw18$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw20$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str21$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym22$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw23$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str24$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw25$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str26$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const27$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str28$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str29$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str30$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym31$TERM_LEXICON = SubLObjectFactory.makeSymbol("TERM-LEXICON");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMTRANS-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMTRANS-LEXICON"), (SubLObject)psp_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym33$SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON");
        $sym34$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym35$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym36$ABSTRACT_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON");
        $sym37$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $list38 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
        $sym39$DEFAULT_EXCLUDE_PREDICATES = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES");
        $const40$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
        $sym41$DEFAULT_KB_SPEC = SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC");
        $const42$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"));
        $sym43$SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-CLASS");
        $sym44$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym45$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym46$ALLOWED_MTS = SubLObjectFactory.makeSymbol("ALLOWED-MTS");
        $kw47$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym48$EXCLUDED_MTS = SubLObjectFactory.makeSymbol("EXCLUDED-MTS");
        $sym49$BASE_MT = SubLObjectFactory.makeSymbol("BASE-MT");
        $sym50$ROOT_MT = SubLObjectFactory.makeSymbol("ROOT-MT");
        $sym51$EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("EXCLUDED-PREDS");
        $sym52$EXCLUDED_POS_LIST = SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST");
        $sym53$TRIE = SubLObjectFactory.makeSymbol("TRIE");
        $sym54$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym55$IGNORE_CACHE_ = SubLObjectFactory.makeSymbol("IGNORE-CACHE?");
        $sym56$CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("CASE-SENSITIVITY");
        $sym57$ALLOW_FABRICATION_ = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?");
        $sym58$LEARNED = SubLObjectFactory.makeSymbol("LEARNED");
        $sym59$ACTIVE_LEARNERS = SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS");
        $sym60$ALLOW_STEMMING = SubLObjectFactory.makeSymbol("ALLOW-STEMMING");
        $sym61$STOP_WORDS = SubLObjectFactory.makeSymbol("STOP-WORDS");
        $sym62$CONVERT_TO_EL_ = SubLObjectFactory.makeSymbol("CONVERT-TO-EL?");
        $sym63$CONCEPT_FILTER_SPECS = SubLObjectFactory.makeSymbol("CONCEPT-FILTER-SPECS");
        $sym64$DEPENDENT_LEXICONS = SubLObjectFactory.makeSymbol("DEPENDENT-LEXICONS");
        $sym65$SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-INSTANCE");
        $sym66$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return lexicon-p; a newly created lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), (SubLObject)psp_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");
        $sym70$PSP_LEXICON_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("PSP-LEXICON-INITIALIZE-METHOD");
        $sym71$EXCLUDE_POS = SubLObjectFactory.makeSymbol("EXCLUDE-POS");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Overridden to disallow exclusion of speech parts."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Can't exclude ~S from a PSP lexicon."), (SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $str74$Can_t_exclude__S_from_a_PSP_lexic = SubLObjectFactory.makeString("Can't exclude ~S from a PSP lexicon.");
        $sym75$PSP_LEXICON_EXCLUDE_POS_METHOD = SubLObjectFactory.makeSymbol("PSP-LEXICON-EXCLUDE-POS-METHOD");
        $sym76$CREATE_LEX_ENTRIES = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMTRANS-LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-LEX-ENTRIES-FROM-SEMTRANS-LEX-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-ENTRIES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");
        $sym80$GET_SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("GET-SEMTRANS-LEXICON");
        $sym81$PSP_LEXICON_CREATE_LEX_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("PSP-LEXICON-CREATE-LEX-ENTRIES-METHOD");
        $sym82$SET = SubLObjectFactory.makeSymbol("SET");
        $kw83$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw84$NO_DENOT = SubLObjectFactory.makeKeyword("NO-DENOT");
        $sym85$GET = SubLObjectFactory.makeSymbol("GET");
        $kw86$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
        $kw87$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return SEMTRANS-LEXICON-P; the semtrans lexicon associated with this lexicon."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-P"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-FROM-TERM-LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ABSTRACT-LEXICON-BASE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ABSTRACT-LEXICON-BASE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOTE-DEPENDENT-LEXICON")), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON")));
        $sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");
        $sym91$NOTE_DEPENDENT_LEXICON = SubLObjectFactory.makeSymbol("NOTE-DEPENDENT-LEXICON");
        $sym92$PSP_LEXICON_GET_SEMTRANS_LEXICON_METHOD = SubLObjectFactory.makeSymbol("PSP-LEXICON-GET-SEMTRANS-LEXICON-METHOD");
        $sym93$GET_SEMTRANS_ENTRIES = SubLObjectFactory.makeSymbol("GET-SEMTRANS-ENTRIES");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return SEMTRANS-LEXICON-P; the semtrans lexicon associated with this lexicon."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMTRANS-LEXICON"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))));
        $sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");
        $sym98$PSP_LEXICON_GET_SEMTRANS_ENTRIES_METHOD = SubLObjectFactory.makeSymbol("PSP-LEXICON-GET-SEMTRANS-ENTRIES-METHOD");
    }
}

/*

	Total time: 458 ms
	
*/