package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_question";
    public static final String myFingerPrint = "612319823b5391d2774965b6765ae0d621d545d66b8adb36c91bf9a77afb0ec3";
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 3208L)
    private static SubLSymbol $pph_default_question_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10163L)
    private static SubLSymbol $past_tense_formP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 13419L)
    public static SubLSymbol $pph_use_gtqsP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 15664L)
    private static SubLSymbol $gen_template_query_sentence_index$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 15740L)
    private static SubLSymbol $gen_template_query_sentence_index_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 27369L)
    private static SubLSymbol $pph_unify_try_arg_permutationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 27476L)
    private static SubLSymbol $pph_unify_recursion_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 27528L)
    private static SubLSymbol $pph_unify_recursion_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 30974L)
    private static SubLSymbol $pph_arglist_permutations_max_arity$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73232L)
    private static SubLSymbol $modal_strings_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73421L)
    private static SubLSymbol $modal_words_caching_state$;
    private static final SubLSymbol $kw0$TEXT;
    private static final SubLSymbol $kw1$ANY;
    private static final SubLSymbol $sym2$VALID_EXTERNAL_PPH_NL_PREDS_;
    private static final SubLSymbol $kw3$DEFAULT;
    private static final SubLSymbol $kw4$INTERROGATIVE;
    private static final SubLSymbol $kw5$NEW;
    private static final SubLSymbol $sym6$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str7$___Top_level_CycL___S;
    private static final SubLSymbol $sym8$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P;
    private static final SubLSymbol $sym9$NART_P;
    private static final SubLSymbol $sym10$NART_EL_FORMULA;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$PPH_QUESTION_CLAUSE_MEMOIZED;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$UNSPECIFIED;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$GENERATE_QUESTION_FROM_QUERY_TEMPLATE;
    private static final SubLString $str17$__Entering_PPH_POSSIBLY_BINDING_V;
    private static final SubLString $str18$Failed_to_paraphrase__givens____S;
    private static final SubLString $str19$__Leaving_PPH_POSSIBLY_BINDING_VA;
    private static final SubLString $str20$______and__pph_var_types__are_now;
    private static final SubLObject $const21$tensed;
    private static final SubLSymbol $sym22$_EXIT;
    private static final SubLSymbol $kw23$ARG1;
    private static final SubLSymbol $kw24$ARG2;
    private static final SubLSymbol $kw25$EXISTENTIAL;
    private static final SubLString $str26$if;
    private static final SubLList $list27;
    private static final SubLObject $const28$implies;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$PAST_TENSE_FORM_;
    private static final SubLObject $const31$pastTense_Generic;
    private static final SubLSymbol $sym32$_PAST_TENSE_FORM__CACHING_STATE_;
    private static final SubLSymbol $kw33$IGNORE;
    private static final SubLObject $const34$genQuestion;
    private static final SubLSymbol $kw35$GAF;
    private static final SubLSymbol $kw36$TRUE;
    private static final SubLString $str37$__Trying____S;
    private static final SubLString $str38$_PPH_error_level_;
    private static final SubLString $str39$__;
    private static final SubLString $str40$Done__S_alternatives_of__S;
    private static final SubLSymbol $kw41$UNINITIALIZED;
    private static final SubLString $str42$genTemplate_QuerySentence_index;
    private static final SubLSymbol $sym43$ADD_GEN_TEMPLATE_QUERY_SENTENCE;
    private static final SubLSymbol $sym44$REMOVE_GEN_TEMPLATE_QUERY_SENTENCE;
    private static final SubLSymbol $sym45$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const46$EverythingPSC;
    private static final SubLObject $const47$genTemplate_QuerySentence;
    private static final SubLSymbol $sym48$INDEXED_TERM_P;
    private static final SubLSymbol $sym49$PPH_VISIBLE_LEXICAL_ASSERTION_;
    private static final SubLSymbol $sym50$CAR;
    private static final SubLSymbol $sym51$_;
    private static final SubLSymbol $sym52$GTQS_ASSERTION_CONSTANT_COUNT;
    private static final SubLSymbol $sym53$CONSTANT_P;
    private static final SubLSymbol $sym54$GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE;
    private static final SubLString $str55$unexpected_result_from__UNIFY__S_;
    private static final SubLSymbol $sym56$PPH_ARG_POSITION_SPECIFIER_;
    private static final SubLList $list57;
    private static final SubLString $str58$Failed_to_match__S_to_var_in_sent;
    private static final SubLString $str59$Failed_to_match__S_to_var_in_temp;
    private static final SubLString $str60$Couldn_t_get_arg_position_for__S_;
    private static final SubLString $str61$_S_doesn_t_match__S_of__S;
    private static final SubLSymbol $sym62$KEYWORDP;
    private static final SubLSymbol $sym63$EL_VAR_;
    private static final SubLSymbol $sym64$EL_VAR_NAME;
    private static final SubLSymbol $sym65$EL_VAR_NAME_;
    private static final SubLSymbol $sym66$MAKE_EL_VAR;
    private static final SubLSymbol $sym67$PPH_UNIFY_POSSIBLE_FORMULA;
    private static final SubLSymbol $sym68$PPH_UNIFY_POSSIBLE_ARGS;
    private static final SubLInteger $int69$40;
    private static final SubLString $str70$Exceeded_PPH_unify_recursion_dept;
    private static final SubLSymbol $sym71$PPH_UNIFY_FORMULA_TEMPLATE;
    private static final SubLSymbol $sym72$PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED;
    private static final SubLString $str73$Not_in_unify_multiple_mode_;
    private static final SubLString $str74$Couldn_t_unify____S____S______giv;
    private static final SubLString $str75$Found_multiple_bindings_for____S_;
    private static final SubLSymbol $sym76$PPH_UNIFY_ARGS_MEMOIZED;
    private static final SubLString $str77$Skipping_permutations_for_templat;
    private static final SubLString $str78$Lost_assumed_bindings________S__;
    private static final SubLString $str79$__GTQS_Bindings___S___Map___S;
    private static final SubLList $list80;
    private static final SubLString $str81$GTQS__Couldn_t_find__S_in____S__;
    private static final SubLString $str82$__GTQS__Replacing__S_with__S__S__;
    private static final SubLString $str83$GTQS__Couldn_t_replace__S_for__S_;
    private static final SubLObject $const84$Thing;
    private static final SubLObject $const85$InstanceNamedFn_Ternary;
    private static final SubLString $str86$example;
    private static final SubLInteger $int87$30;
    private static final SubLString $str88$Checking___genTemplate_QuerySente;
    private static final SubLString $str89$__Matched__S_of__S___genTemplate_;
    private static final SubLString $str90$Timed_out_after__S_seconds_on____;
    private static final SubLString $str91$Didn_t_find_gtqs_in_matches_____S;
    private static final SubLSymbol $sym92$PPH_QUERY_VAR_P;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$BLANKS;
    private static final SubLSymbol $kw95$VARS;
    private static final SubLSymbol $sym96$ALIST_P;
    private static final SubLObject $const97$not;
    private static final SubLString $str98$was_;
    private static final SubLString $str99$is_;
    private static final SubLString $str100$it_;
    private static final SubLString $str101$that;
    private static final SubLString $str102$true;
    private static final SubLString $str103$FALSE;
    private static final SubLString $str104$false;
    private static final SubLString $str105$were;
    private static final SubLString $str106$are;
    private static final SubLString $str107$_there_such_that;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$AND;
    private static final SubLString $str110$what_values_of;
    private static final SubLString $str111$__Setting_arg_position_of__S_to__;
    private static final SubLSymbol $sym112$PPH_VAR_REGISTERED_AS_DEFAULT_;
    private static final SubLSymbol $sym113$PPH_EXCEPTIONAL_VAR_P;
    private static final SubLSymbol $kw114$ERROR;
    private static final SubLObject $const115$WHWord;
    private static final SubLObject $const116$AuxVerb;
    private static final SubLSymbol $sym117$QUESTION_ROP_FORMULA_;
    private static final SubLObject $const118$TheResultOfParsing;
    private static final SubLObject $const119$nounStrings;
    private static final SubLObject $const120$Determiner;
    private static final SubLSymbol $sym121$TRUE;
    private static final SubLObject $const122$Integer;
    private static final SubLSymbol $sym123$PPH_SPEC_;
    private static final SubLString $str124$___S_determined_to_be_a_number_va;
    private static final SubLString $str125$No_number_vars_in__S__;
    private static final SubLString $str126$__Trying_to_generate__S_using_sub;
    private static final SubLString $str127$__Made_question_template__S;
    private static final SubLString $str128$_X_such_that;
    private static final SubLString $str129$in_generate_phrase_with_subj_aux_;
    private static final SubLString $str130$__Not_subject_head_verb_initial__;
    private static final SubLSymbol $sym131$PPH_TENSE_PRED_;
    private static final SubLObject $const132$Verb;
    private static final SubLString $str133$__Couldn_t_find_question_subphras;
    private static final SubLString $str134$__Subject_dtr_of__S_is_a_wh_phras;
    private static final SubLString $str135$___S_has_no_head_verb__MAKE_QUEST;
    private static final SubLString $str136$__Head_dtr__S_is_a_copula__placin;
    private static final SubLString $str137$__Head_dtr__S_is_an_auxiliary__pl;
    private static final SubLString $str138$___S_may_be_a_modal_verb__MAKE_QU;
    private static final SubLString $str139$__Adding_do_support_to_template__;
    private static final SubLString $str140$Fronting__S;
    private static final SubLObject $const141$Have_TheWord;
    private static final SubLObject $const142$pastPerfect_Generic;
    private static final SubLObject $const143$presentTense_Generic;
    private static final SubLString $str144$De_perfectiving_agr_from__S_to__S;
    private static final SubLSymbol $kw145$POS_PRED;
    private static final SubLObject $const146$perfect;
    private static final SubLSymbol $kw147$TEMPORAL_LOCATION;
    private static final SubLSymbol $kw148$FALSE;
    private static final SubLSymbol $sym149$ROP_FORMULA_;
    private static final SubLString $str150$Found_question_phrase___S;
    private static final SubLSymbol $kw151$NOT_FOUND;
    private static final SubLSymbol $sym152$INTEGERP;
    private static final SubLObject $const153$Agent_Generic;
    private static final SubLObject $const154$Person;
    private static final SubLString $str155$in_STRING_FOR_VAR_IN_QUESTION_PHR;
    private static final SubLString $str156$pph_var_type_for__S___S__;
    private static final SubLString $str157$how_many;
    private static final SubLObject $const158$nonPlural_Generic;
    private static final SubLObject $const159$nonSingular_Generic;
    private static final SubLSymbol $kw160$WHAT;
    private static final SubLObject $const161$NounPhrase;
    private static final SubLString $str162$what;
    private static final SubLSymbol $kw163$ACCUSATIVE;
    private static final SubLString $str164$whom;
    private static final SubLString $str165$who;
    private static final SubLString $str166$_or_what;
    private static final SubLString $str167$when;
    private static final SubLObject $const168$isa;
    private static final SubLSymbol $kw169$ANYTHING;
    private static final SubLSymbol $kw170$BREADTH;
    private static final SubLSymbol $kw171$QUEUE;
    private static final SubLSymbol $kw172$STACK;
    private static final SubLObject $const173$True_JustificationTruth;
    private static final SubLSymbol $sym174$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLString $str175$_A_is_not_a__A;
    private static final SubLSymbol $sym176$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw177$CERROR;
    private static final SubLString $str178$continue_anyway;
    private static final SubLSymbol $kw179$WARN;
    private static final SubLString $str180$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const181$genls;
    private static final SubLObject $const182$FacetingCollectionType;
    private static final SubLObject $const183$DisjointCollectionType;
    private static final SubLString $str184$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str185$attempting_to_bind_direction_link;
    private static final SubLString $str186$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym187$MODAL_STRINGS;
    private static final SubLObject $const188$Modal;
    private static final SubLObject $const189$partOfSpeech;
    private static final SubLSymbol $sym190$_MODAL_STRINGS_CACHING_STATE_;
    private static final SubLSymbol $sym191$MODAL_WORDS;
    private static final SubLSymbol $sym192$_MODAL_WORDS_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 1053L)
    public static SubLObject generate_question(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject nl_preds) {
        if (language_mt == pph_question.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_question.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_question.UNPROVIDED) {
            mode = (SubLObject)pph_question.$kw0$TEXT;
        }
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = (SubLObject)pph_question.$kw1$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_question.NIL != pph_utilities.valid_external_pph_nl_predsP(nl_preds) : nl_preds;
        if (pph_question.$kw3$DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(formula, (SubLObject)pph_question.$kw4$INTERROGATIVE, language_mt, domain_mt);
        }
        SubLObject string = (SubLObject)pph_question.NIL;
        SubLObject pred = (SubLObject)pph_question.NIL;
        SubLObject just = (SubLObject)pph_question.NIL;
        SubLObject olist = (SubLObject)pph_question.NIL;
        SubLObject demerits = (SubLObject)pph_question.NIL;
        SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)), thread);
            pph_vars.$paraphrase_mode$.bind(mode, thread);
            SubLObject error_message = (SubLObject)pph_question.NIL;
            final SubLObject _prev_bind_0_$1 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                pph_macros.herald_new_discourse_context();
                try {
                    pph_drs.pph_ensure_discourse_participant_rms();
                    final SubLObject _prev_bind_0_$2 = Errors.$continue_cerrorP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                    try {
                        Errors.$continue_cerrorP$.bind((SubLObject)pph_question.NIL, thread);
                        pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_question.T, thread);
                        if (pph_question.NIL != pph_error.pph_break_on_errorP()) {
                            final SubLObject _prev_bind_0_$3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                            try {
                                pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_question.NIL, thread);
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$4 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    final SubLObject reuseP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$5 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            final SubLObject new_or_reused = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$6 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding(thread);
                                                try {
                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                    try {
                                                        final SubLObject _prev_bind_0_$8 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_cycls$.bind((SubLObject)ConsesLow.cons(pph_standardize_query_sentence(formula), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                            thread.resetMultipleValues();
                                                            final SubLObject string_$10 = pph_question_clause(formula, pph_utilities.pph_filter_preds(nl_preds, pph_default_question_preds(), (SubLObject)pph_question.UNPROVIDED));
                                                            final SubLObject pred_$11 = thread.secondMultipleValue();
                                                            final SubLObject just_$12 = thread.thirdMultipleValue();
                                                            final SubLObject olist_$13 = thread.fourthMultipleValue();
                                                            final SubLObject demerits_$14 = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            string = string_$10;
                                                            pred = pred_$11;
                                                            just = just_$12;
                                                            olist = olist_$13;
                                                            demerits = demerits_$14;
                                                            if (pph_question.NIL != pph_string.pph_string_p(string)) {
                                                                olist = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, (SubLObject)pph_question.$kw4$INTERROGATIVE);
                                                                string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_question.T);
                                                            }
                                                        }
                                                        finally {
                                                            pph_vars.$pph_cycls$.rebind(_prev_bind_0_$8, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                            finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$6, thread);
                                            }
                                            if (new_or_reused == pph_question.$kw5$NEW && pph_question.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                            }
                                        }
                                        finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (pph_question.NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                }
                                finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        else {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)pph_question.$sym6$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$12 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                        try {
                                            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_question.NIL, thread);
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$13 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                final SubLObject reuseP2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                try {
                                                    thread.resetMultipleValues();
                                                    final SubLObject _prev_bind_0_$14 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                        final SubLObject new_or_reused2 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        final SubLObject _prev_bind_0_$15 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                            final SubLObject local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            final SubLObject _prev_bind_0_$16 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state2, thread);
                                                                final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                                                try {
                                                                    final SubLObject _prev_bind_0_$17 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$pph_cycls$.bind((SubLObject)ConsesLow.cons(pph_standardize_query_sentence(formula), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject string_$11 = pph_question_clause(formula, pph_utilities.pph_filter_preds(nl_preds, pph_default_question_preds(), (SubLObject)pph_question.UNPROVIDED));
                                                                        final SubLObject pred_$12 = thread.secondMultipleValue();
                                                                        final SubLObject just_$13 = thread.thirdMultipleValue();
                                                                        final SubLObject olist_$14 = thread.fourthMultipleValue();
                                                                        final SubLObject demerits_$15 = thread.fifthMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        string = string_$11;
                                                                        pred = pred_$12;
                                                                        just = just_$13;
                                                                        olist = olist_$14;
                                                                        demerits = demerits_$15;
                                                                        if (pph_question.NIL != pph_string.pph_string_p(string)) {
                                                                            olist = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, (SubLObject)pph_question.$kw4$INTERROGATIVE);
                                                                            string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_question.T);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        pph_vars.$pph_cycls$.rebind(_prev_bind_0_$17, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                                                        final SubLObject _values3 = Values.getValuesAsVector();
                                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                                        Values.restoreValuesFromVector(_values3);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                        }
                                                        finally {
                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        if (new_or_reused2 == pph_question.$kw5$NEW && pph_question.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                        }
                                                    }
                                                    finally {
                                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                                        final SubLObject _values4 = Values.getValuesAsVector();
                                                        if (pph_question.NIL == reuseP2) {
                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                        }
                                                        Values.restoreValuesFromVector(_values4);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                        finally {
                                            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)pph_question.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (error_message.isString() && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                                Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_question.$str7$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                            }
                        }
                    }
                    finally {
                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$3, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        pph_macros.herald_end_of_discourse_context();
                        pph_macros.clear_pph_discourse_context();
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            }
            finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && pph_question.NIL == Sequences.find_if((SubLObject)pph_question.$sym8$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, just, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED)), thread);
            olist = pph_main.pph_sanitize_output_list(olist, formula);
        }
        finally {
            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
        }
        return Values.values(pph_string.pph_string_if_non_null_to_output_format(string, mode), pred, just, olist, demerits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 2946L)
    public static SubLObject pph_standardize_query_sentence(final SubLObject query_sentence) {
        return cycl_utilities.expression_transform(query_sentence, (SubLObject)pph_question.$sym9$NART_P, (SubLObject)pph_question.$sym10$NART_EL_FORMULA, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 3083L)
    public static SubLObject pph_standardize_query_term(final SubLObject query_term) {
        return cycl_utilities.expression_transform(query_term, (SubLObject)pph_question.$sym9$NART_P, (SubLObject)pph_question.$sym10$NART_EL_FORMULA, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 3271L)
    public static SubLObject pph_default_question_preds() {
        return conses_high.copy_list(pph_question.$pph_default_question_preds$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 3370L)
    public static SubLObject pph_question_clause(final SubLObject formula, final SubLObject nl_preds) {
        return pph_question_clause_memoized(formula, nl_preds, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 3597L)
    public static SubLObject pph_question_clause_memoized_internal(final SubLObject formula, final SubLObject nl_preds, SubLObject blanksP, SubLObject demerit_cutoff, SubLObject v_pph_sentence) {
        if (blanksP == pph_question.UNPROVIDED) {
            blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        if (demerit_cutoff == pph_question.UNPROVIDED) {
            demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
        }
        if (v_pph_sentence == pph_question.UNPROVIDED) {
            v_pph_sentence = pph_vars.$pph_sentence$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_sentence$.currentBinding(thread);
        try {
            pph_vars.$pph_sentence$.bind(v_pph_sentence, thread);
            SubLObject ordered_gen_fun_list = (SubLObject)pph_question.$list13;
            SubLObject successful_fn = (SubLObject)pph_question.NIL;
            final SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
            SubLObject string = (SubLObject)pph_question.NIL;
            SubLObject pred = (SubLObject)pph_question.NIL;
            SubLObject just = (SubLObject)pph_question.NIL;
            SubLObject olist = (SubLObject)pph_question.NIL;
            SubLObject demerits = (SubLObject)pph_question.NIL;
            final SubLObject _prev_bind_0_$32 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            try {
                pph_vars.$pph_demerit_cutoff$.bind(demerit_cutoff, thread);
                final SubLObject arg0 = cycl_utilities.formula_arg0(formula);
                final SubLObject _prev_bind_0_$33 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                try {
                    pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_macros.$destroy_new_pph_phrasesP$.getDynamicValue(thread) || pph_question.NIL != misc_utilities.uninitialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))), thread);
                    pph_vars.$pph_current_arg0$.bind((SubLObject)((pph_question.NIL != pph_macros.pph_ok_arg0_for_linkingP(arg0)) ? arg0 : pph_question.$kw14$UNSPECIFIED), thread);
                    final SubLObject matrix_new_pph_phrases = pph_macros.$new_pph_phrases$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$34 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$35 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                    try {
                        pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                        pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                        SubLObject destroy_new_phrasesP = (SubLObject)pph_question.NIL;
                        try {
                            if (pph_question.NIL != blanksP) {
                                ordered_gen_fun_list = (SubLObject)pph_question.$list15;
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject string_$36 = generate_question_from_query_template(formula, nl_preds, arg_position_map);
                                final SubLObject pred_$37 = thread.secondMultipleValue();
                                final SubLObject just_$38 = thread.thirdMultipleValue();
                                final SubLObject olist_$39 = thread.fourthMultipleValue();
                                final SubLObject demerits_$40 = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                string = string_$36;
                                pred = pred_$37;
                                just = just_$38;
                                olist = olist_$39;
                                demerits = demerits_$40;
                            }
                            if (pph_question.NIL != pph_string.pph_string_p(string)) {
                                successful_fn = (SubLObject)pph_question.$sym16$GENERATE_QUESTION_FROM_QUERY_TEMPLATE;
                            }
                            else if (pph_question.NIL == el_utilities.el_formula_p(formula)) {
                                thread.resetMultipleValues();
                                final SubLObject string_$37 = generate_question_non_propositional(formula, nl_preds);
                                final SubLObject pred_$38 = thread.secondMultipleValue();
                                final SubLObject just_$39 = thread.thirdMultipleValue();
                                final SubLObject olist_$40 = thread.fourthMultipleValue();
                                final SubLObject demerits_$41 = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                string = string_$37;
                                pred = pred_$38;
                                just = just_$39;
                                olist = olist_$40;
                                demerits = demerits_$41;
                            }
                            else {
                                final SubLObject _prev_bind_0_$35 = pph_vars.$pph_var_types$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_var_types$.bind((pph_question.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED), thread);
                                    final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                                    final SubLObject _prev_bind_0_$36 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$36 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                    try {
                                        pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                        pph_vars.$pph_noted_var_types$.bind((pph_question.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_question.EQL), (SubLObject)pph_question.SIXTEEN_INTEGER), thread);
                                        pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                        if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                                            format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str17$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                        }
                                        try {
                                            pph_variable_handling.pph_register_query_vars(formula);
                                            final SubLObject _prev_bind_0_$37 = pph_vars.$generation_level$.currentBinding(thread);
                                            try {
                                                pph_vars.$generation_level$.bind(number_utilities.f_1X(pph_vars.current_generation_level()), thread);
                                                SubLObject hyp_string = (SubLObject)pph_question.NIL;
                                                SubLObject hyp_pred = (SubLObject)pph_question.NIL;
                                                SubLObject hyp_just = (SubLObject)pph_question.NIL;
                                                SubLObject hyp_olist = (SubLObject)pph_question.NIL;
                                                SubLObject abortP = (SubLObject)pph_question.NIL;
                                                thread.resetMultipleValues();
                                                final SubLObject query_formula = pph_remove_hypothetical(formula, arg_position_map);
                                                SubLObject query_map = thread.secondMultipleValue();
                                                final SubLObject hypothetical = thread.thirdMultipleValue();
                                                final SubLObject hypothetical_map = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                if (pph_question.NIL != el_utilities.el_formula_p(hypothetical)) {
                                                    pph_question_register_hypothetical_vars(hypothetical);
                                                    final SubLObject _prev_bind_0_$38 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
                                                    try {
                                                        pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)((pph_question.NIL != pph_vars.$pph_handle_hypotheticalsP$.getDynamicValue(thread)) ? pph_question.NIL : pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)), thread);
                                                        thread.resetMultipleValues();
                                                        final SubLObject hyp_string_$51 = pph_question_declarative_string(hypothetical, (SubLObject)pph_question.$kw1$ANY, hypothetical_map, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                                        final SubLObject hyp_pred_$52 = thread.secondMultipleValue();
                                                        final SubLObject hyp_just_$53 = thread.thirdMultipleValue();
                                                        final SubLObject hyp_olist_$54 = thread.fourthMultipleValue();
                                                        thread.resetMultipleValues();
                                                        hyp_string = hyp_string_$51;
                                                        hyp_pred = hyp_pred_$52;
                                                        hyp_just = hyp_just_$53;
                                                        hyp_olist = hyp_olist_$54;
                                                        if (pph_question.NIL == hyp_string) {
                                                            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                                                                Errors.warn((SubLObject)pph_question.$str18$Failed_to_paraphrase__givens____S, hypothetical);
                                                                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                            }
                                                            abortP = (SubLObject)pph_question.T;
                                                        }
                                                    }
                                                    finally {
                                                        pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_0_$38, thread);
                                                    }
                                                }
                                                if (pph_question.NIL == abortP) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject rephrased_formula = pph_utilities.pph_rephrase_cycl(query_formula);
                                                    final SubLObject rephrase_template = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    query_map = pph_utilities.pph_figure_new_arg_position_map(query_map, rephrase_template);
                                                    if (pph_question.NIL == string) {
                                                        SubLObject csome_list_var = ordered_gen_fun_list;
                                                        SubLObject function = (SubLObject)pph_question.NIL;
                                                        function = csome_list_var.first();
                                                        while (pph_question.NIL == string && pph_question.NIL != csome_list_var) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject string_$38 = Functions.funcall(function, rephrased_formula, nl_preds, query_map);
                                                            final SubLObject pred_$39 = thread.secondMultipleValue();
                                                            final SubLObject just_$40 = thread.thirdMultipleValue();
                                                            final SubLObject olist_$41 = thread.fourthMultipleValue();
                                                            final SubLObject demerits_$42 = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            string = string_$38;
                                                            pred = pred_$39;
                                                            just = just_$40;
                                                            olist = olist_$41;
                                                            demerits = demerits_$42;
                                                            if (pph_question.NIL != pph_string.pph_string_p(string)) {
                                                                successful_fn = function;
                                                                thread.resetMultipleValues();
                                                                final SubLObject string_$39 = pph_add_hypothetical_paraphrase(string, pred, just, olist, demerits, hyp_just, hyp_olist);
                                                                final SubLObject pred_$40 = thread.secondMultipleValue();
                                                                final SubLObject just_$41 = thread.thirdMultipleValue();
                                                                final SubLObject olist_$42 = thread.fourthMultipleValue();
                                                                final SubLObject demerits_$43 = thread.fifthMultipleValue();
                                                                thread.resetMultipleValues();
                                                                string = string_$39;
                                                                pred = pred_$40;
                                                                just = just_$41;
                                                                olist = olist_$42;
                                                                demerits = demerits_$43;
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            function = csome_list_var.first();
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                pph_vars.$generation_level$.rebind(_prev_bind_0_$37, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                                                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str19$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                                }
                                                pph_macros.pph_handle_local_vars(local_vars);
                                                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                                                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str20$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                                        pph_vars.$pph_noted_var_types$.rebind(_prev_bind_1_$36, thread);
                                        pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                                finally {
                                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$35, thread);
                                }
                            }
                            if (pph_question.NIL != successful_fn) {
                                just = (SubLObject)ConsesLow.cons(pph_phrase.pph_code_justification(successful_fn, (SubLObject)pph_question.UNPROVIDED), just);
                                if (pph_question.NIL == pred) {
                                    pred = pph_question.$const21$tensed;
                                }
                                if (pph_question.NIL == olist) {
                                    olist = (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item(string, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
                                }
                            }
                            destroy_new_phrasesP = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != misc_utilities.uninitialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread)) || pph_question.NIL == successful_fn);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (pph_question.NIL != destroy_new_phrasesP) {
                                    pph_macros.destroy_new_pph_phrases();
                                }
                                else {
                                    SubLObject cdolist_list_var = stacks.do_stack_elements_stack_elements(pph_macros.$new_pph_phrases$.getDynamicValue(thread));
                                    SubLObject phrase = (SubLObject)pph_question.NIL;
                                    phrase = cdolist_list_var.first();
                                    while (pph_question.NIL != cdolist_list_var) {
                                        stacks.stack_push(phrase, matrix_new_pph_phrases);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        phrase = cdolist_list_var.first();
                                    }
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                    }
                    finally {
                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_1_$35, thread);
                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_0_$34, thread);
                    }
                }
                finally {
                    pph_vars.$pph_current_arg0$.rebind(_prev_bind_2, thread);
                    pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_0_$33, thread);
                }
            }
            finally {
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$32, thread);
            }
            return Values.values(string, pred, just, olist, demerits);
        }
        finally {
            pph_vars.$pph_sentence$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 3597L)
    public static SubLObject pph_question_clause_memoized(final SubLObject formula, final SubLObject nl_preds, SubLObject blanksP, SubLObject demerit_cutoff, SubLObject v_pph_sentence) {
        if (blanksP == pph_question.UNPROVIDED) {
            blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        if (demerit_cutoff == pph_question.UNPROVIDED) {
            demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
        }
        if (v_pph_sentence == pph_question.UNPROVIDED) {
            v_pph_sentence = pph_vars.$pph_sentence$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == v_memoization_state) {
            return pph_question_clause_memoized_internal(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_question.$sym12$PPH_QUESTION_CLAUSE_MEMOIZED, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_question.$sym12$PPH_QUESTION_CLAUSE_MEMOIZED, (SubLObject)pph_question.FIVE_INTEGER, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQUAL, (SubLObject)pph_question.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_question.$sym12$PPH_QUESTION_CLAUSE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_question.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_question.NIL;
            collision = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_preds.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (blanksP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (demerit_cutoff.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (pph_question.NIL != cached_args && pph_question.NIL == cached_args.rest() && v_pph_sentence.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_question_clause_memoized_internal(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 7613L)
    public static SubLObject pph_remove_hypothetical(final SubLObject formula, SubLObject arg_position_map) {
        if (arg_position_map == pph_question.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (pph_question.NIL != pph_hypothesize_antecedent_varsP(formula)) {
            final SubLObject hypothetical_template = (SubLObject)pph_question.$kw23$ARG1;
            final SubLObject hypothetical_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, hypothetical_template);
            final SubLObject hypothetical = pph_utilities.pph_apply_template(hypothetical_template, formula);
            final SubLObject query_template = (SubLObject)pph_question.$kw24$ARG2;
            final SubLObject query_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, query_template);
            final SubLObject query = pph_utilities.pph_apply_template(query_template, formula);
            return Values.values(query, query_map, hypothetical, hypothetical_map);
        }
        return Values.values(formula, arg_position_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 8273L)
    public static SubLObject pph_hypothesize_antecedent_varsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_vars.$pph_query_antecedents_are_hypothesizedP$.getDynamicValue(thread) && pph_question.NIL != el_utilities.el_implication_p(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 8423L)
    public static SubLObject pph_question_register_hypothetical_vars(final SubLObject hypothetical) {
        SubLObject vars = (SubLObject)pph_question.NIL;
        SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(hypothetical);
        SubLObject var = (SubLObject)pph_question.NIL;
        var = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            pph_variable_handling.pph_register_var_quantifier(var, (SubLObject)pph_question.$kw25$EXISTENTIAL);
            vars = (SubLObject)ConsesLow.cons(var, vars);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 8664L)
    public static SubLObject pph_add_hypothetical_paraphrase(SubLObject string, final SubLObject pred, SubLObject just, SubLObject olist, final SubLObject demerits, final SubLObject hyp_just, SubLObject hyp_olist) {
        if (pph_question.NIL != hyp_olist) {
            final SubLObject implies_item = pph_data_structures.new_pph_phrase_output_item((SubLObject)pph_question.$str26$if, (SubLObject)pph_question.$list27, pph_question.$const28$implies, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(implies_item, pph_question.$const28$implies);
            hyp_olist = (SubLObject)ConsesLow.cons(implies_item, hyp_olist);
            hyp_olist = pph_methods_formulas.pph_phrase_output_list_add_comma(hyp_olist);
            olist = ConsesLow.append(hyp_olist, olist);
            just = ConsesLow.append(hyp_just, just);
            string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_question.T);
        }
        return Values.values(string, pred, just, olist, demerits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 9235L)
    public static SubLObject generate_question_non_propositional(final SubLObject v_object, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject string = pph_question_declarative_string(v_object, nl_preds, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject just = thread.thirdMultipleValue();
        final SubLObject olist = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(string, pred, just, olist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 9530L)
    public static SubLObject question_paraphrase_availableP(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject nl_preds) {
        if (language_mt == pph_question.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_question.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = (SubLObject)pph_question.$kw1$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ordered_gen_fun_list = (SubLObject)pph_question.$list29;
        final SubLObject rephrased_formula = pph_utilities.pph_rephrase_cycl(formula);
        SubLObject ans = (SubLObject)pph_question.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            if (pph_question.NIL == ans) {
                SubLObject csome_list_var;
                SubLObject function;
                for (csome_list_var = ordered_gen_fun_list, function = (SubLObject)pph_question.NIL, function = csome_list_var.first(); pph_question.NIL == ans && pph_question.NIL != csome_list_var; ans = list_utilities.sublisp_boolean(Functions.funcall(function, rephrased_formula, nl_preds)), csome_list_var = csome_list_var.rest(), function = csome_list_var.first()) {}
            }
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10163L)
    public static SubLObject clear_past_tense_formP() {
        final SubLObject cs = pph_question.$past_tense_formP_caching_state$.getGlobalValue();
        if (pph_question.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10163L)
    public static SubLObject remove_past_tense_formP(final SubLObject pred, SubLObject mt) {
        if (mt == pph_question.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(pph_question.$past_tense_formP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, mt), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10163L)
    public static SubLObject past_tense_formP_internal(final SubLObject pred, final SubLObject mt) {
        return pph_utilities.pph_genl_predicateP(pred, pph_question.$const31$pastTense_Generic, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10163L)
    public static SubLObject past_tense_formP(final SubLObject pred, SubLObject mt) {
        if (mt == pph_question.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = pph_question.$past_tense_formP_caching_state$.getGlobalValue();
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_question.$sym30$PAST_TENSE_FORM_, (SubLObject)pph_question.$sym32$_PAST_TENSE_FORM__CACHING_STATE_, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQ, (SubLObject)pph_question.TWO_INTEGER, (SubLObject)pph_question.SIXTEEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_question.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_question.NIL;
            collision = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_question.NIL != cached_args && pph_question.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(past_tense_formP_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10373L)
    public static SubLObject prefer_past_tense_formP(final SubLObject preds) {
        if (preds == pph_question.$kw1$ANY) {
            return (SubLObject)pph_question.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != preds && pph_question.NIL == list_utilities.find_if_not((SubLObject)pph_question.$sym30$PAST_TENSE_FORM_, preds, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 10584L)
    public static SubLObject generate_question_from_genquestion(final SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == pph_question.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)pph_question.NIL;
        SubLObject agr_pred = (SubLObject)pph_question.NIL;
        SubLObject justification = (SubLObject)pph_question.NIL;
        SubLObject olist = (SubLObject)pph_question.NIL;
        final SubLObject demerits = (SubLObject)pph_question.TWO_INTEGER;
        if (pph_question.NIL != el_utilities.el_formula_p(formula) && pph_question.NIL == prefer_past_tense_formP(nl_preds)) {
            final SubLObject pred = cycl_utilities.formula_operator(formula);
            final SubLObject q_arg = pph_question_arg(formula);
            final SubLObject format_formula = get_genquestion_formula(pred, q_arg);
            if (pph_question.NIL != format_formula) {
                thread.resetMultipleValues();
                final SubLObject format_string = pph_methods_formulas.get_genformat_string_and_list_from_formula(format_formula);
                final SubLObject arg_order_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                olist = pph_methods_formulas.generate_atomic_formula_from_format_string_and_arg_order_list(formula, format_string, arg_order_list, arg_position_map, (SubLObject)pph_question.UNPROVIDED);
                agr_pred = pph_question.$const21$tensed;
                justification = (SubLObject)pph_question.NIL;
                string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_question.T);
            }
        }
        return Values.values(string, agr_pred, justification, olist, demerits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 11889L)
    public static SubLObject pph_question_arg(final SubLObject formula) {
        SubLObject q_arg = (SubLObject)pph_question.NIL;
        SubLObject arg_num = (SubLObject)pph_question.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_question.$kw33$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)pph_question.NIL, rest = args; pph_question.NIL == q_arg && pph_question.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            arg_num = Numbers.add(arg_num, (SubLObject)pph_question.ONE_INTEGER);
            if (pph_question.NIL != cycl_variables.el_variable_or_keyword_p(arg) && pph_question.NIL != pph_variable_handling.pph_query_var_p(arg)) {
                q_arg = arg_num;
            }
        }
        return q_arg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 12139L)
    public static SubLObject get_genquestion_formula(final SubLObject relation, final SubLObject q_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gen_q_formula = (SubLObject)pph_question.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = pph_question.$const34$genQuestion;
            if (pph_question.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)pph_question.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)pph_question.NIL, pred_var);
                SubLObject done_var = gen_q_formula;
                final SubLObject token_var = (SubLObject)pph_question.NIL;
                while (pph_question.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (pph_question.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)pph_question.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_question.$kw35$GAF, (SubLObject)pph_question.$kw36$TRUE, (SubLObject)pph_question.NIL);
                            SubLObject done_var_$67 = gen_q_formula;
                            final SubLObject token_var_$68 = (SubLObject)pph_question.NIL;
                            while (pph_question.NIL == done_var_$67) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                                final SubLObject valid_$69 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$68.eql(as));
                                if (pph_question.NIL != valid_$69 && assertions_high.gaf_arg2(as).eql(q_arg)) {
                                    gen_q_formula = assertions_high.gaf_formula(as);
                                }
                                done_var_$67 = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == valid_$69 || pph_question.NIL != gen_q_formula);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (pph_question.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == valid || pph_question.NIL != gen_q_formula);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gen_q_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 13081L)
    public static SubLObject get_genq_bindings(final SubLObject v_bindings) {
        final SubLObject tuple = (SubLObject)ConsesLow.list(bindings.variable_lookup(variables.get_variable((SubLObject)pph_question.ZERO_INTEGER), v_bindings), bindings.variable_lookup(variables.get_variable((SubLObject)pph_question.ONE_INTEGER), v_bindings));
        return (SubLObject)((pph_question.NIL != tuple.first()) ? tuple : pph_question.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 13286L)
    public static SubLObject pph_blank_count(final SubLObject string) {
        return Sequences.length(string_utilities.search_all(pph_vars.$pph_blank_string$.getGlobalValue(), string, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 13512L)
    public static SubLObject generate_question_from_query_template(final SubLObject query_sentence, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == pph_question.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)pph_question.NIL;
        SubLObject agr_pred = (SubLObject)pph_question.NIL;
        SubLObject justification = (SubLObject)pph_question.NIL;
        SubLObject olist = (SubLObject)pph_question.NIL;
        SubLObject doneP = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != pph_question.$pph_use_gtqsP$.getDynamicValue(thread) && pph_question.NIL == doneP) {
            SubLObject csome_list_var = gtqs_assertions_for_query_sentence(query_sentence, nl_preds);
            SubLObject gtqs_as = (SubLObject)pph_question.NIL;
            gtqs_as = csome_list_var.first();
            while (pph_question.NIL == doneP && pph_question.NIL != csome_list_var) {
                SubLObject error_message = (SubLObject)pph_question.NIL;
                final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)pph_question.NIL, thread);
                    pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_question.T, thread);
                    if (pph_question.NIL != pph_error.pph_break_on_errorP()) {
                        final SubLObject _prev_bind_0_$71 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                        try {
                            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(el_utilities.atomic_sentenceP(query_sentence), thread);
                            final SubLObject phrase = pph_phrase_for_query_sentence_from_gtqs_as(gtqs_as, query_sentence, arg_position_map);
                            if (pph_question.NIL != pph_phrase_ok_for_gtqsP(phrase, query_sentence)) {
                                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str37$__Trying____S, gtqs_as, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                }
                                pph_main.pph_phrase_generate(phrase, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                if (pph_question.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                    pph_phrase.pph_phrase_add_justification(phrase, gtqs_as);
                                    string = pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_question.T);
                                    agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                                    justification = pph_phrase.pph_phrase_justification(phrase);
                                    olist = pph_phrase.pph_phrase_output_list(phrase);
                                    if (pph_question.NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                        doneP = (SubLObject)pph_question.T;
                                    }
                                    if (pph_question.NIL != misc_utilities.initialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) {
                                        pph_sentence.pph_sentence_add_alternative(phrase);
                                        final SubLObject queue = queues.create_queue((SubLObject)pph_question.UNPROVIDED);
                                        SubLObject done_count = (SubLObject)pph_question.ZERO_INTEGER;
                                        queues.enqueue(phrase, queue);
                                        while (pph_question.NIL == queues.queue_empty_p(queue)) {
                                            final SubLObject ignore_me = queues.dequeue(queue);
                                            SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                                            SubLObject alternative = (SubLObject)pph_question.NIL;
                                            alternative = cdolist_list_var.first();
                                            while (pph_question.NIL != cdolist_list_var) {
                                                pph_sentence.pph_sentence_add_alternative(alternative);
                                                done_count = Numbers.add(done_count, (SubLObject)pph_question.ONE_INTEGER);
                                                if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                                                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str40$Done__S_alternatives_of__S) });
                                                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(done_count, phrase));
                                                }
                                                queues.enqueue(alternative, queue);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                alternative = cdolist_list_var.first();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0_$71, thread);
                        }
                    }
                    else {
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$72 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)pph_question.$sym6$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    final SubLObject _prev_bind_0_$73 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(el_utilities.atomic_sentenceP(query_sentence), thread);
                                        final SubLObject phrase2 = pph_phrase_for_query_sentence_from_gtqs_as(gtqs_as, query_sentence, arg_position_map);
                                        if (pph_question.NIL != pph_phrase_ok_for_gtqsP(phrase2, query_sentence)) {
                                            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                                                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str37$__Trying____S, gtqs_as, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                            }
                                            pph_main.pph_phrase_generate(phrase2, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                            if (pph_question.NIL != pph_phrase.pph_phrase_doneP(phrase2)) {
                                                pph_phrase.pph_phrase_add_justification(phrase2, gtqs_as);
                                                string = pph_phrase.pph_phrase_string(phrase2, (SubLObject)pph_question.T);
                                                agr_pred = pph_phrase.pph_phrase_agr_pred(phrase2);
                                                justification = pph_phrase.pph_phrase_justification(phrase2);
                                                olist = pph_phrase.pph_phrase_output_list(phrase2);
                                                if (pph_question.NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                                    doneP = (SubLObject)pph_question.T;
                                                }
                                                if (pph_question.NIL != misc_utilities.initialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) {
                                                    pph_sentence.pph_sentence_add_alternative(phrase2);
                                                    final SubLObject queue2 = queues.create_queue((SubLObject)pph_question.UNPROVIDED);
                                                    SubLObject done_count2 = (SubLObject)pph_question.ZERO_INTEGER;
                                                    queues.enqueue(phrase2, queue2);
                                                    while (pph_question.NIL == queues.queue_empty_p(queue2)) {
                                                        final SubLObject ignore_me2 = queues.dequeue(queue2);
                                                        SubLObject cdolist_list_var2 = pph_phrase.pph_phrase_local_alternatives(ignore_me2);
                                                        SubLObject alternative2 = (SubLObject)pph_question.NIL;
                                                        alternative2 = cdolist_list_var2.first();
                                                        while (pph_question.NIL != cdolist_list_var2) {
                                                            pph_sentence.pph_sentence_add_alternative(alternative2);
                                                            done_count2 = Numbers.add(done_count2, (SubLObject)pph_question.ONE_INTEGER);
                                                            if (done_count2.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                                                                final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str40$Done__S_alternatives_of__S) });
                                                                pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(done_count2, phrase2));
                                                            }
                                                            queues.enqueue(alternative2, queue2);
                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                            alternative2 = cdolist_list_var2.first();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0_$73, thread);
                                    }
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)pph_question.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (error_message.isString() && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_question.$str7$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                        }
                    }
                }
                finally {
                    pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                }
                if (pph_question.NIL != error_message) {
                    Errors.warn(error_message);
                }
                csome_list_var = csome_list_var.rest();
                gtqs_as = csome_list_var.first();
            }
        }
        return Values.values(string, agr_pred, justification, olist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 15360L)
    public static SubLObject pph_phrase_ok_for_gtqsP(final SubLObject phrase, final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_question.UNPROVIDED) && pph_question.NIL != pph_templates.pph_phrase_references_precise_argsP(phrase, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 15853L)
    public static SubLObject clear_gen_template_query_sentence_index() {
        if (pph_question.NIL != dictionary.dictionary_p(pph_question.$gen_template_query_sentence_index$.getGlobalValue())) {
            dictionary.clear_dictionary(pph_question.$gen_template_query_sentence_index$.getGlobalValue());
        }
        pph_question.$gen_template_query_sentence_index$.setGlobalValue((SubLObject)pph_question.$kw41$UNINITIALIZED);
        return pph_question.$gen_template_query_sentence_index$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 16141L)
    public static SubLObject add_gen_template_query_sentence(final SubLObject argument, final SubLObject assertion) {
        return clear_gen_template_query_sentence_index();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 16298L)
    public static SubLObject remove_gen_template_query_sentence(final SubLObject argument, final SubLObject assertion) {
        return clear_gen_template_query_sentence_index();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 16459L)
    public static SubLObject initialize_gen_template_query_sentence_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)pph_question.ZERO_INTEGER;
        SubLObject release = (SubLObject)pph_question.NIL;
        try {
            release = Locks.seize_lock(pph_question.$gen_template_query_sentence_index_lock$.getGlobalValue());
            if (pph_question.NIL != dictionary.dictionary_p(pph_question.$gen_template_query_sentence_index$.getGlobalValue())) {
                dictionary.clear_dictionary(pph_question.$gen_template_query_sentence_index$.getGlobalValue());
            }
            else {
                pph_question.$gen_template_query_sentence_index$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_question.EQL), (SubLObject)pph_question.UNPROVIDED));
            }
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_question.$sym45$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(pph_question.$const46$EverythingPSC, thread);
                final SubLObject pred_var = pph_question.$const47$genTemplate_QuerySentence;
                if (pph_question.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)pph_question.NIL;
                    final SubLObject _prev_bind_0_$74 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$75 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)pph_question.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((pph_question.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : pph_question.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)pph_question.NIL;
                        final SubLObject token_var = (SubLObject)pph_question.NIL;
                        while (pph_question.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (pph_question.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)pph_question.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_question.$kw35$GAF, (SubLObject)pph_question.NIL, (SubLObject)pph_question.NIL);
                                    SubLObject done_var_$76 = (SubLObject)pph_question.NIL;
                                    final SubLObject token_var_$77 = (SubLObject)pph_question.NIL;
                                    while (pph_question.NIL == done_var_$76) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
                                        final SubLObject valid_$78 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$77.eql(as));
                                        if (pph_question.NIL != valid_$78) {
                                            count = Numbers.add(count, (SubLObject)pph_question.ONE_INTEGER);
                                            SubLObject cdolist_list_var = cycl_utilities.expression_gather(assertions_high.gaf_arg1(as), Symbols.symbol_function((SubLObject)pph_question.$sym48$INDEXED_TERM_P), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                            SubLObject v_term = (SubLObject)pph_question.NIL;
                                            v_term = cdolist_list_var.first();
                                            while (pph_question.NIL != cdolist_list_var) {
                                                dictionary_utilities.dictionary_push(pph_question.$gen_template_query_sentence_index$.getGlobalValue(), v_term, as);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                v_term = cdolist_list_var.first();
                                            }
                                        }
                                        done_var_$76 = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == valid_$78);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (pph_question.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$75, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$74, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            final SubLObject threshold = Numbers.integerDivide(count, (SubLObject)pph_question.THREE_INTEGER);
            SubLObject common_keys = (SubLObject)pph_question.NIL;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_question.$gen_template_query_sentence_index$.getGlobalValue())); pph_question.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_term2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject assertions = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_question.NIL != list_utilities.lengthG(assertions, threshold, (SubLObject)pph_question.UNPROVIDED)) {
                    common_keys = (SubLObject)ConsesLow.cons(v_term2, common_keys);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            SubLObject cdolist_list_var2 = common_keys;
            SubLObject v_term3 = (SubLObject)pph_question.NIL;
            v_term3 = cdolist_list_var2.first();
            while (pph_question.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$80 = dictionary.dictionary_lookup_without_values(pph_question.$gen_template_query_sentence_index$.getGlobalValue(), v_term3, (SubLObject)pph_question.UNPROVIDED);
                SubLObject as2 = (SubLObject)pph_question.NIL;
                as2 = cdolist_list_var_$80.first();
                while (pph_question.NIL != cdolist_list_var_$80) {
                    if (pph_question.NIL == list_utilities.singletonP(cycl_utilities.expression_gather(assertions_high.gaf_arg1(as2), Symbols.symbol_function((SubLObject)pph_question.$sym48$INDEXED_TERM_P), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED))) {
                        dictionary_utilities.dictionary_remove_from_value(pph_question.$gen_template_query_sentence_index$.getGlobalValue(), v_term3, as2, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                    }
                    cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                    as2 = cdolist_list_var_$80.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term3 = cdolist_list_var2.first();
            }
        }
        finally {
            if (pph_question.NIL != release) {
                Locks.release_lock(pph_question.$gen_template_query_sentence_index_lock$.getGlobalValue());
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 17586L)
    public static SubLObject gen_template_query_sentence_lookup(final SubLObject v_term) {
        SubLObject initializedP = (SubLObject)pph_question.NIL;
        SubLObject release = (SubLObject)pph_question.NIL;
        try {
            release = Locks.seize_lock(pph_question.$gen_template_query_sentence_index_lock$.getGlobalValue());
            initializedP = dictionary.dictionary_p(pph_question.$gen_template_query_sentence_index$.getGlobalValue());
        }
        finally {
            if (pph_question.NIL != release) {
                Locks.release_lock(pph_question.$gen_template_query_sentence_index_lock$.getGlobalValue());
            }
        }
        if (pph_question.NIL == initializedP) {
            initialize_gen_template_query_sentence_index();
        }
        SubLObject gtqs_assertions = (SubLObject)pph_question.NIL;
        release = (SubLObject)pph_question.NIL;
        try {
            release = Locks.seize_lock(pph_question.$gen_template_query_sentence_index_lock$.getGlobalValue());
            gtqs_assertions = dictionary.dictionary_lookup(pph_question.$gen_template_query_sentence_index$.getGlobalValue(), v_term, (SubLObject)pph_question.UNPROVIDED);
        }
        finally {
            if (pph_question.NIL != release) {
                Locks.release_lock(pph_question.$gen_template_query_sentence_index_lock$.getGlobalValue());
            }
        }
        return list_utilities.remove_if_not((SubLObject)pph_question.$sym49$PPH_VISIBLE_LEXICAL_ASSERTION_, gtqs_assertions, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 18242L)
    public static SubLObject pph_visible_lexical_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)pph_question.UNPROVIDED) && pph_question.NIL != pph_utilities.pph_genl_mtP(pph_vars.$pph_language_mt$.getDynamicValue(thread), assertions_high.assertion_mt(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 18411L)
    public static SubLObject gen_template_query_sentence_candidates(final SubLObject query_sentence) {
        final SubLObject counts = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_question.EQ), (SubLObject)pph_question.TWENTY_INTEGER);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(query_sentence, (SubLObject)pph_question.$sym48$INDEXED_TERM_P, (SubLObject)pph_question.T, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        SubLObject v_term = (SubLObject)pph_question.NIL;
        v_term = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$81 = gen_template_query_sentence_lookup(v_term);
            SubLObject gtqs_as = (SubLObject)pph_question.NIL;
            gtqs_as = cdolist_list_var_$81.first();
            while (pph_question.NIL != cdolist_list_var_$81) {
                dictionary_utilities.dictionary_increment(counts, gtqs_as, (SubLObject)pph_question.UNPROVIDED);
                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                gtqs_as = cdolist_list_var_$81.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)pph_question.$sym50$CAR), dictionary_utilities.sort_dictionary_by_values(counts, Symbols.symbol_function((SubLObject)pph_question.$sym51$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 18895L)
    public static SubLObject gtqs_assertions_for_query_sentence(final SubLObject query_sentence, final SubLObject nl_preds) {
        SubLObject ans = (SubLObject)pph_question.NIL;
        SubLObject cdolist_list_var = gen_template_query_sentence_candidates(query_sentence);
        SubLObject gtqs_as = (SubLObject)pph_question.NIL;
        gtqs_as = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            if (pph_question.NIL != gtqs_assertion_matches_query_sentenceP(gtqs_as, query_sentence, nl_preds)) {
                ans = (SubLObject)ConsesLow.cons(gtqs_as, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gtqs_as = cdolist_list_var.first();
        }
        return Sort.stable_sort(pph_utilities.pph_sort_assertions(ans, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED), Symbols.symbol_function((SubLObject)pph_question.$sym51$_), (SubLObject)pph_question.$sym52$GTQS_ASSERTION_CONSTANT_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 19382L)
    public static SubLObject gtqs_assertion_constant_count(final SubLObject gtqs_as) {
        final SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
        return Sequences.length(cycl_utilities.expression_gather(query_sentence_template, (SubLObject)pph_question.$sym53$CONSTANT_P, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 19571L)
    public static SubLObject gtqs_assertion_matches_query_sentenceP(final SubLObject gtqs_as, final SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = (SubLObject)pph_question.$kw1$ANY;
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)pph_question.ONE_INTEGER), gtqs_assertion_bindings_for_query_sentence(gtqs_as, pph_standardize_query_sentence(query_sentence), nl_preds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 19834L)
    public static SubLObject gtqs_assertion_bindings_for_query_sentence_internal(final SubLObject gtqs_as, final SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = (SubLObject)pph_question.$kw1$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
        thread.resetMultipleValues();
        final SubLObject query_sentence_template_wX_hl_vars = hlify_gtqs_template_variables(query_sentence_template);
        final SubLObject hl_var_to_el_var_or_keyword_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject unification_result = pph_question_template_unify(query_sentence_template_wX_hl_vars, query_sentence);
        if (pph_question.NIL == unification_result) {
            return Values.values((SubLObject)pph_question.NIL, (SubLObject)pph_question.NIL);
        }
        if (pph_question.NIL != bindings.unification_success_token_p(unification_result)) {
            return Values.values((SubLObject)pph_question.NIL, (SubLObject)pph_question.T);
        }
        if (pph_question.NIL != bindings.bindings_p(unification_result)) {
            return gtqs_bindings_from_unification_bindings(unification_result, hl_var_to_el_var_or_keyword_bindings, gtqs_as, query_sentence);
        }
        if (pph_question.NIL != set.set_p(unification_result)) {
            final SubLObject set_contents_var = set.do_set_internal(unification_result);
            SubLObject basis_object;
            SubLObject state;
            SubLObject one_result;
            SubLObject v_bindings;
            SubLObject successP;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_question.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_question.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                one_result = set_contents.do_set_contents_next(basis_object, state);
                if (pph_question.NIL != set_contents.do_set_contents_element_validP(state, one_result)) {
                    thread.resetMultipleValues();
                    v_bindings = gtqs_bindings_from_unification_bindings(one_result, hl_var_to_el_var_or_keyword_bindings, gtqs_as, query_sentence);
                    successP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_question.NIL != successP) {
                        return Values.values(v_bindings, successP);
                    }
                }
            }
            return Values.values((SubLObject)pph_question.NIL, (SubLObject)pph_question.NIL);
        }
        Errors.error((SubLObject)pph_question.$str55$unexpected_result_from__UNIFY__S_, query_sentence_template_wX_hl_vars, query_sentence, unification_result);
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 19834L)
    public static SubLObject gtqs_assertion_bindings_for_query_sentence(final SubLObject gtqs_as, final SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = (SubLObject)pph_question.$kw1$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == v_memoization_state) {
            return gtqs_assertion_bindings_for_query_sentence_internal(gtqs_as, query_sentence, nl_preds);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_question.$sym54$GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_question.$sym54$GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, (SubLObject)pph_question.THREE_INTEGER, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQUAL, (SubLObject)pph_question.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_question.$sym54$GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(gtqs_as, query_sentence, nl_preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_question.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_question.NIL;
            collision = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (gtqs_as.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_question.NIL != cached_args && pph_question.NIL == cached_args.rest() && nl_preds.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gtqs_assertion_bindings_for_query_sentence_internal(gtqs_as, query_sentence, nl_preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(gtqs_as, query_sentence, nl_preds));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 21354L)
    public static SubLObject hlify_gtqs_template_variables(final SubLObject query_sentence_template) {
        final SubLObject keywords = pph_query_sentence_template_keywords(query_sentence_template);
        final SubLObject el_vars = pph_query_sentence_template_vars(query_sentence_template);
        SubLObject query_sentence_template_wX_hl_vars = el_utilities.copy_expression(query_sentence_template);
        SubLObject hl_var_to_el_var_or_keyword_bindings = (SubLObject)pph_question.NIL;
        SubLObject list_var = (SubLObject)pph_question.NIL;
        SubLObject el_var_or_keyword = (SubLObject)pph_question.NIL;
        SubLObject hl_var_num = (SubLObject)pph_question.NIL;
        list_var = ConsesLow.append(keywords, el_vars);
        el_var_or_keyword = list_var.first();
        for (hl_var_num = (SubLObject)pph_question.ZERO_INTEGER; pph_question.NIL != list_var; list_var = list_var.rest(), el_var_or_keyword = list_var.first(), hl_var_num = Numbers.add((SubLObject)pph_question.ONE_INTEGER, hl_var_num)) {
            final SubLObject hl_var = variables.get_variable(hl_var_num);
            query_sentence_template_wX_hl_vars = cycl_utilities.expression_subst(hl_var, el_var_or_keyword, query_sentence_template_wX_hl_vars, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            hl_var_to_el_var_or_keyword_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(hl_var, el_var_or_keyword), hl_var_to_el_var_or_keyword_bindings);
        }
        return Values.values(query_sentence_template_wX_hl_vars, hl_var_to_el_var_or_keyword_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 22156L)
    public static SubLObject non_hypothesized_el_varP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != cycl_variables.el_varP(obj) && pph_question.NIL == subl_promotions.memberP(obj, pph_variable_handling.$pph_hypothesized_vars$.getDynamicValue(thread), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 22285L)
    public static SubLObject gtqs_bindings_from_unification_bindings(SubLObject unification_result, final SubLObject hl_var_to_el_var_or_keyword_bindings, final SubLObject gtqs_as, final SubLObject query_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        unification_result = pph_unhide_el_vars(unification_result);
        final SubLObject phrase_naut = assertions_high.gaf_arg2(gtqs_as);
        final SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
        SubLObject query_sentence_template_terms_to_query_sentence_terms = bindings.apply_bindings(hl_var_to_el_var_or_keyword_bindings, unification_result);
        final SubLObject arg_position_specifiers = cycl_utilities.expression_gather(phrase_naut, (SubLObject)pph_question.$sym56$PPH_ARG_POSITION_SPECIFIER_, (SubLObject)pph_question.NIL, Symbols.symbol_function((SubLObject)pph_question.EQUAL), Symbols.symbol_function((SubLObject)pph_question.IDENTITY), (SubLObject)pph_question.NIL);
        SubLObject cdolist_list_var = query_sentence_template_terms_to_query_sentence_terms;
        SubLObject cons = (SubLObject)pph_question.NIL;
        cons = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject template_term = (SubLObject)pph_question.NIL;
            SubLObject sentence_term = (SubLObject)pph_question.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_question.$list57);
            template_term = current.first();
            current = (sentence_term = current.rest());
            if (pph_question.NIL != non_hypothesized_el_varP(template_term) && pph_question.NIL == non_hypothesized_el_varP(sentence_term)) {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_question.$str58$Failed_to_match__S_to_var_in_sent, template_term, sentence_term);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return Values.values((SubLObject)pph_question.NIL, (SubLObject)pph_question.NIL);
            }
            if (pph_question.NIL != non_hypothesized_el_varP(sentence_term) && pph_question.NIL == non_hypothesized_el_varP(template_term)) {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_question.$str59$Failed_to_match__S_to_var_in_temp, sentence_term, template_term);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return Values.values((SubLObject)pph_question.NIL, (SubLObject)pph_question.NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        cdolist_list_var = arg_position_specifiers;
        SubLObject arg_position_specifier = (SubLObject)pph_question.NIL;
        arg_position_specifier = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            final SubLObject specified_arg = pph_utilities.pph_apply_template(arg_position_specifier, query_sentence);
            if (pph_question.NIL != gtqs_specified_arg_matchesP(specified_arg, arg_position_specifier, query_sentence_template, query_sentence_template_terms_to_query_sentence_terms)) {
                query_sentence_template_terms_to_query_sentence_terms = list_utilities.alist_enter(query_sentence_template_terms_to_query_sentence_terms, arg_position_specifier, specified_arg, (SubLObject)pph_question.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_position_specifier = cdolist_list_var.first();
        }
        SubLObject query_sentence_template_terms_to_arg_positions = (SubLObject)pph_question.NIL;
        final SubLObject standardized_query_sentence = pph_standardize_query_sentence(query_sentence);
        SubLObject failP;
        SubLObject rest;
        SubLObject cons2;
        SubLObject current2;
        SubLObject datum2;
        SubLObject template_term2;
        SubLObject sentence_term2;
        SubLObject arg_position;
        for (failP = (SubLObject)pph_question.NIL, rest = (SubLObject)pph_question.NIL, rest = query_sentence_template_terms_to_query_sentence_terms; pph_question.NIL == failP && pph_question.NIL != rest; rest = rest.rest()) {
            cons2 = rest.first();
            datum2 = (current2 = cons2);
            template_term2 = (SubLObject)pph_question.NIL;
            sentence_term2 = (SubLObject)pph_question.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_question.$list57);
            template_term2 = current2.first();
            current2 = (sentence_term2 = current2.rest());
            arg_position = gtqs_one_arg_position(sentence_term2, standardized_query_sentence);
            if (pph_question.NIL == pph_utilities.pph_known_arg_position_p(arg_position)) {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_question.$str60$Couldn_t_get_arg_position_for__S_, sentence_term2, query_sentence);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                failP = (SubLObject)pph_question.T;
            }
            if (pph_question.NIL != pph_utilities.pph_known_arg_position_p(arg_position)) {
                query_sentence_template_terms_to_arg_positions = list_utilities.alist_enter(query_sentence_template_terms_to_arg_positions, template_term2, arg_position, (SubLObject)pph_question.UNPROVIDED);
            }
        }
        return Values.values(query_sentence_template_terms_to_arg_positions, (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == failP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 24935L)
    public static SubLObject gtqs_one_arg_position(final SubLObject sentence_term, final SubLObject query_sentence) {
        final SubLObject arg_positions = cycl_utilities.arg_positions_bfs(pph_standardize_query_term(sentence_term), query_sentence, Symbols.symbol_function((SubLObject)pph_question.EQUAL));
        return (pph_question.NIL != arg_positions) ? arg_positions.first() : pph_utilities.pph_unknown_arg_position();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 25220L)
    public static SubLObject gtqs_specified_arg_matchesP(final SubLObject specified_arg, final SubLObject arg_position_specifier, final SubLObject query_sentence_template, final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject specified_template_term = pph_utilities.pph_apply_template(arg_position_specifier, query_sentence_template);
        if (specified_template_term.equal(specified_arg)) {
            return (SubLObject)pph_question.T;
        }
        if (specified_arg.equal(list_utilities.alist_lookup(map, specified_template_term, Symbols.symbol_function((SubLObject)pph_question.EQUAL), (SubLObject)pph_question.UNPROVIDED))) {
            return (SubLObject)pph_question.T;
        }
        if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_question.$str61$_S_doesn_t_match__S_of__S, specified_arg, arg_position_specifier, query_sentence_template);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 25761L)
    public static SubLObject pph_query_sentence_template_keywords(final SubLObject query_sentence_template) {
        return cycl_utilities.expression_gather(query_sentence_template, Symbols.symbol_function((SubLObject)pph_question.$sym62$KEYWORDP), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 25905L)
    public static SubLObject pph_query_sentence_template_vars(final SubLObject query_sentence_template) {
        return cycl_utilities.expression_gather(query_sentence_template, (SubLObject)pph_question.$sym63$EL_VAR_, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 26043L)
    public static SubLObject pph_question_template_unify(final SubLObject template, final SubLObject query_sentence) {
        final SubLObject query_sentence_sans_el_vars = pph_hide_el_vars(query_sentence);
        final SubLObject unification_result = pph_unify_gtqs(template, query_sentence_sans_el_vars);
        return unification_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 26389L)
    public static SubLObject pph_hide_el_vars(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, (SubLObject)pph_question.$sym63$EL_VAR_, (SubLObject)pph_question.$sym64$EL_VAR_NAME, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 26501L)
    public static SubLObject pph_unhide_el_vars(final SubLObject expression) {
        return transform_list_utilities.transform(expression, (SubLObject)pph_question.$sym65$EL_VAR_NAME_, (SubLObject)pph_question.$sym66$MAKE_EL_VAR, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 26609L)
    public static SubLObject pph_unify_possible_formula(final SubLObject formula1, final SubLObject formula2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != unification.unify_possible(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2)) && pph_question.NIL != pph_unify_possible_args(cycl_utilities.formula_args(formula1, (SubLObject)pph_question.UNPROVIDED), cycl_utilities.formula_args(formula2, (SubLObject)pph_question.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 26934L)
    public static SubLObject pph_unify_possible_args(final SubLObject args1, final SubLObject args2) {
        if (args1.isAtom()) {
            return unification.unify_possible(args1, args2);
        }
        if (pph_question.NIL != list_utilities.dotted_list_p(args1)) {
            return unification.unify_possible(args1, args2);
        }
        if (args1.isList() && args2.isList() && pph_question.NIL != list_utilities.same_length_p(args1, args2)) {
            return (SubLObject)pph_question.T;
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 27581L)
    public static SubLObject pph_unify_check_recursion_depth() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_question.$pph_unify_recursion_depth$.getDynamicValue(thread).numG(pph_question.$pph_unify_recursion_limit$.getGlobalValue())) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str70$Exceeded_PPH_unify_recursion_dept) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_question.$pph_unify_recursion_limit$.getGlobalValue()));
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 27816L)
    public static SubLObject pph_commutative_functor_p(final SubLObject functor) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != forts.fort_p(functor) && pph_question.NIL != fort_types_interface.commutative_relation_p(functor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 27941L)
    public static SubLObject pph_unify_gtqs(final SubLObject template, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)pph_question.NIL;
        SubLObject result_bindings = (SubLObject)pph_question.NIL;
        final SubLObject _prev_bind_0 = unification.$unify_cons_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = unification.$unify_possible_cons_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = unification.$unify_multipleP$.currentBinding(thread);
        try {
            unification.$unify_cons_function$.bind(Symbols.symbol_function((SubLObject)pph_question.$sym71$PPH_UNIFY_FORMULA_TEMPLATE), thread);
            unification.$unify_possible_cons_function$.bind(Symbols.symbol_function((SubLObject)pph_question.$sym67$PPH_UNIFY_POSSIBLE_FORMULA), thread);
            unification.$unify_multipleP$.bind((SubLObject)pph_question.T, thread);
            thread.resetMultipleValues();
            final SubLObject result = unification.unify(template, formula, (SubLObject)pph_question.T, (SubLObject)pph_question.UNPROVIDED);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_question.NIL != result) {
                result_bindings = (SubLObject)((pph_question.NIL != bindings.unification_success_token_p(result)) ? pph_question.NIL : result);
                successP = (SubLObject)pph_question.T;
            }
        }
        finally {
            unification.$unify_multipleP$.rebind(_prev_bind_3, thread);
            unification.$unify_possible_cons_function$.rebind(_prev_bind_2, thread);
            unification.$unify_cons_function$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_bindings, successP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 28500L)
    public static SubLObject pph_unify_formula_template(final SubLObject template, final SubLObject formula, SubLObject v_bindings) {
        if (v_bindings == pph_question.UNPROVIDED) {
            v_bindings = (SubLObject)pph_question.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_bindings = (SubLObject)pph_question.NIL;
        pph_unify_check_recursion_depth();
        final SubLObject _prev_bind_0 = pph_question.$pph_unify_recursion_depth$.currentBinding(thread);
        try {
            pph_question.$pph_unify_recursion_depth$.bind(number_utilities.f_1X(pph_question.$pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
            new_bindings = pph_unify_formula_template_memoized(template, formula, v_bindings);
        }
        finally {
            pph_question.$pph_unify_recursion_depth$.rebind(_prev_bind_0, thread);
        }
        return (pph_question.NIL != new_bindings) ? new_bindings : unification.unify_failure(template, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 29014L)
    public static SubLObject pph_unify_formula_template_memoized_internal(final SubLObject template, final SubLObject formula, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_question.NIL == unification.$unify_multipleP$.getDynamicValue(thread)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str73$Not_in_unify_multiple_mode_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_question.EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject new_bindings = (SubLObject)pph_question.NIL;
        final SubLObject template_functor = cycl_utilities.formula_arg0(template);
        final SubLObject formula_functor = cycl_utilities.formula_arg0(formula);
        final SubLObject functor_result = unification.unify_assuming_bindings(template_functor, formula_functor, (SubLObject)pph_question.T, v_bindings, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject functor_bindings = unification_bindings_from_result(functor_result);
        final SubLObject traceP = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != list_utilities.sublisp_boolean(functor_result)) {
            final SubLObject template_args = cycl_utilities.formula_args(template, (SubLObject)pph_question.UNPROVIDED);
            final SubLObject formula_args = cycl_utilities.formula_args(formula, (SubLObject)pph_question.UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_question.$pph_unify_try_arg_permutationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = unification.$unify_possible_cons_function$.currentBinding(thread);
            try {
                pph_question.$pph_unify_try_arg_permutationsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(template_args.isList() && formula_args.isList() && (pph_question.NIL != pph_commutative_functor_p(template_functor) || pph_question.NIL != pph_commutative_functor_p(formula_functor))), thread);
                unification.$unify_possible_cons_function$.bind(Symbols.symbol_function((SubLObject)pph_question.$sym67$PPH_UNIFY_POSSIBLE_FORMULA), thread);
                new_bindings = pph_unify_args(template_args, formula_args, functor_bindings);
            }
            finally {
                unification.$unify_possible_cons_function$.rebind(_prev_bind_2, thread);
                pph_question.$pph_unify_try_arg_permutationsP$.rebind(_prev_bind_0, thread);
            }
        }
        if (pph_question.NIL != traceP) {
            if (pph_question.NIL == new_bindings) {
                Errors.warn((SubLObject)pph_question.$str74$Couldn_t_unify____S____S______giv, template, formula, v_bindings);
            }
            if (pph_question.NIL != set.set_p(new_bindings)) {
                Errors.warn((SubLObject)pph_question.$str75$Found_multiple_bindings_for____S_, new SubLObject[] { template, formula, v_bindings, set.set_element_list(new_bindings) });
            }
        }
        return new_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 29014L)
    public static SubLObject pph_unify_formula_template_memoized(final SubLObject template, final SubLObject formula, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == v_memoization_state) {
            return pph_unify_formula_template_memoized_internal(template, formula, v_bindings);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_question.$sym72$PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_question.$sym72$PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, (SubLObject)pph_question.THREE_INTEGER, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQUAL, (SubLObject)pph_question.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_question.$sym72$PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, formula, v_bindings);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_question.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_question.NIL;
            collision = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_question.NIL != cached_args && pph_question.NIL == cached_args.rest() && v_bindings.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_unify_formula_template_memoized_internal(template, formula, v_bindings)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(template, formula, v_bindings));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 30515L)
    public static SubLObject unification_bindings_from_result(final SubLObject unification_result) {
        return (SubLObject)((pph_question.NIL != bindings.unification_success_token_p(unification_result)) ? pph_question.NIL : unification_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 30675L)
    public static SubLObject pph_unify_args(final SubLObject template_args, final SubLObject formula_args, final SubLObject functor_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_unify_check_recursion_depth();
        return pph_unify_args_memoized(template_args, formula_args, functor_bindings, pph_question.$pph_unify_try_arg_permutationsP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 31107L)
    public static SubLObject pph_unify_args_memoized_internal(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings, final SubLObject try_permutationsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unification_result = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == template_args) {
            unification_result = unification.unify_assuming_bindings(template_args, formula_args, (SubLObject)pph_question.T, assumed_bindings, (SubLObject)pph_question.UNPROVIDED);
        }
        else if (pph_question.NIL != try_permutationsP && pph_question.NIL != list_utilities.lengthLE(template_args, pph_question.$pph_arglist_permutations_max_arity$.getGlobalValue(), (SubLObject)pph_question.UNPROVIDED)) {
            unification_result = pph_unify_args_permutations(template_args, formula_args, assumed_bindings);
        }
        else {
            if (pph_question.NIL != try_permutationsP) {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_question.$str77$Skipping_permutations_for_templat, Sequences.length(template_args), template_args, formula_args);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return pph_unify_args_memoized(template_args, formula_args, assumed_bindings, (SubLObject)pph_question.NIL);
            }
            unification_result = pph_unify_ordered_args(template_args, formula_args, assumed_bindings);
        }
        return unification_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 31107L)
    public static SubLObject pph_unify_args_memoized(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings, final SubLObject try_permutationsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == v_memoization_state) {
            return pph_unify_args_memoized_internal(template_args, formula_args, assumed_bindings, try_permutationsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_question.$sym76$PPH_UNIFY_ARGS_MEMOIZED, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_question.$sym76$PPH_UNIFY_ARGS_MEMOIZED, (SubLObject)pph_question.FOUR_INTEGER, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQUAL, (SubLObject)pph_question.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_question.$sym76$PPH_UNIFY_ARGS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(template_args, formula_args, assumed_bindings, try_permutationsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_question.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_question.NIL;
            collision = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (template_args.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula_args.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (assumed_bindings.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pph_question.NIL != cached_args && pph_question.NIL == cached_args.rest() && try_permutationsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_unify_args_memoized_internal(template_args, formula_args, assumed_bindings, try_permutationsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(template_args, formula_args, assumed_bindings, try_permutationsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 32038L)
    public static SubLObject pph_unify_ordered_args(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_unify_check_recursion_depth();
        final SubLObject arg1_result = unification.unify_assuming_bindings(template_args.first(), formula_args.first(), (SubLObject)pph_question.T, assumed_bindings, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject arg1_bindings = (pph_question.NIL != bindings.unification_success_token_p(arg1_result)) ? assumed_bindings : arg1_result;
        SubLObject v_bindings = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != assumed_bindings && pph_question.NIL != bindings.unification_success_token_p(arg1_result)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str78$Lost_assumed_bindings________S__) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list((pph_question.NIL != set.set_p(assumed_bindings)) ? set.set_element_list(assumed_bindings) : assumed_bindings));
        }
        if (pph_question.NIL != list_utilities.sublisp_boolean(arg1_result)) {
            final SubLObject _prev_bind_0 = pph_question.$pph_unify_try_arg_permutationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_question.$pph_unify_recursion_depth$.currentBinding(thread);
            try {
                pph_question.$pph_unify_try_arg_permutationsP$.bind((SubLObject)pph_question.NIL, thread);
                pph_question.$pph_unify_recursion_depth$.bind(number_utilities.f_1X(pph_question.$pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
                v_bindings = pph_unify_args(template_args.rest(), formula_args.rest(), arg1_bindings);
            }
            finally {
                pph_question.$pph_unify_recursion_depth$.rebind(_prev_bind_2, thread);
                pph_question.$pph_unify_try_arg_permutationsP$.rebind(_prev_bind_0, thread);
            }
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 33031L)
    public static SubLObject pph_unify_args_permutations(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_unify_check_recursion_depth();
        SubLObject v_bindings = (SubLObject)pph_question.NIL;
        final SubLObject permutations = pph_arglist_permutations(template_args);
        SubLObject tried_count = (SubLObject)pph_question.ZERO_INTEGER;
        SubLObject impossible_count = (SubLObject)pph_question.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = pph_question.$pph_unify_recursion_depth$.currentBinding(thread);
        try {
            pph_question.$pph_unify_recursion_depth$.bind(number_utilities.f_1X(pph_question.$pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
            SubLObject cdolist_list_var = permutations;
            SubLObject template_arg_permutation = (SubLObject)pph_question.NIL;
            template_arg_permutation = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                final SubLObject possibleP = unification.unify_possible(template_arg_permutation, formula_args);
                final SubLObject this_bindings = (SubLObject)((pph_question.NIL != possibleP) ? pph_unify_ordered_args(template_arg_permutation, formula_args, assumed_bindings) : pph_question.NIL);
                if (pph_question.NIL == possibleP) {
                    impossible_count = Numbers.add(impossible_count, (SubLObject)pph_question.ONE_INTEGER);
                }
                else if (pph_question.NIL != this_bindings) {
                    if (pph_question.NIL == v_bindings) {
                        v_bindings = this_bindings;
                    }
                    else if (pph_question.NIL != set.set_p(v_bindings)) {
                        set.set_add(this_bindings, v_bindings);
                    }
                    else {
                        v_bindings = set_utilities.new_singleton_set(v_bindings, Symbols.symbol_function((SubLObject)pph_question.EQUAL));
                        set.set_add(this_bindings, v_bindings);
                    }
                }
                tried_count = Numbers.add(tried_count, (SubLObject)pph_question.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                template_arg_permutation = cdolist_list_var.first();
            }
        }
        finally {
            pph_question.$pph_unify_recursion_depth$.rebind(_prev_bind_0, thread);
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 34274L)
    public static SubLObject pph_arglist_permutations(final SubLObject arglist) {
        final SubLObject argnum_list = list_utilities.num_list(Sequences.length(arglist), (SubLObject)pph_question.UNPROVIDED);
        final SubLObject argnum_permutations = list_utilities.permute_list(argnum_list, (SubLObject)pph_question.NIL);
        SubLObject arglist_permutations = (SubLObject)pph_question.NIL;
        SubLObject cdolist_list_var = argnum_permutations;
        SubLObject argnum_permutation = (SubLObject)pph_question.NIL;
        argnum_permutation = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            SubLObject this_arglist_perm = (SubLObject)pph_question.NIL;
            SubLObject cdolist_list_var_$82 = argnum_permutation;
            SubLObject argnum = (SubLObject)pph_question.NIL;
            argnum = cdolist_list_var_$82.first();
            while (pph_question.NIL != cdolist_list_var_$82) {
                this_arglist_perm = (SubLObject)ConsesLow.cons(ConsesLow.nth(argnum, arglist), this_arglist_perm);
                cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                argnum = cdolist_list_var_$82.first();
            }
            arglist_permutations = (SubLObject)ConsesLow.cons(this_arglist_perm, arglist_permutations);
            cdolist_list_var = cdolist_list_var.rest();
            argnum_permutation = cdolist_list_var.first();
        }
        return arglist_permutations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 34770L)
    public static SubLObject pph_phrase_for_query_sentence_from_gtqs_as(final SubLObject gtqs_as, final SubLObject query_sentence, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase_naut = assertions_high.gaf_arg2(gtqs_as);
        SubLObject v_pph_phrase = (SubLObject)pph_question.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_resolve_bindings_phrasesP$.currentBinding(thread);
        try {
            pph_vars.$pph_keep_generic_argsP$.bind((SubLObject)pph_question.NIL, thread);
            pph_vars.$pph_resolve_bindings_phrasesP$.bind((SubLObject)pph_question.NIL, thread);
            v_pph_phrase = pph_templates.pph_phrasify_phrase_naut(phrase_naut, pph_utilities.pph_new_empty_map());
        }
        finally {
            pph_vars.$pph_resolve_bindings_phrasesP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject query_sentence_template_terms_to_query_sentence_terms = gtqs_assertion_bindings_for_query_sentence(gtqs_as, query_sentence, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL == query_sentence_template_terms_to_query_sentence_terms) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str79$__GTQS_Bindings___S___Map___S, query_sentence_template_terms_to_query_sentence_terms, arg_position_map, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        }
        replace_gtqs_template_terms(query_sentence, v_pph_phrase, query_sentence_template_terms_to_query_sentence_terms, arg_position_map);
        pph_phrase.pph_phrase_try_to_resolve_binding_phrases(v_pph_phrase, (SubLObject)pph_question.UNPROVIDED);
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 35682L)
    public static SubLObject replace_gtqs_template_terms(final SubLObject query_sentence, final SubLObject v_pph_phrase, final SubLObject query_sentence_template_terms_to_query_sentence_terms, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject standardized_query_sentence = pph_standardize_query_sentence(query_sentence);
        SubLObject cdolist_list_var = query_sentence_template_terms_to_query_sentence_terms;
        SubLObject cons = (SubLObject)pph_question.NIL;
        cons = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject template_term = (SubLObject)pph_question.NIL;
            SubLObject local_arg_position = (SubLObject)pph_question.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_question.$list80);
            template_term = current.first();
            current = (local_arg_position = current.rest());
            thread.resetMultipleValues();
            final SubLObject sentence_term = pph_utilities.pph_dereference_arg_position(standardized_query_sentence, local_arg_position);
            final SubLObject problemP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_question.NIL != problemP) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str81$GTQS__Couldn_t_find__S_in____S__) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(local_arg_position, query_sentence));
            }
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str82$__GTQS__Replacing__S_with__S__S__, template_term, sentence_term, pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            if (!template_term.equal(sentence_term)) {
                final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
                SubLObject replacedP = pph_phrase.pph_phrase_cycl_subst(sentence_term, template_term, v_pph_phrase, Symbols.symbol_function((SubLObject)pph_question.EQUAL), global_arg_position);
                if (pph_question.NIL != pph_phrase.pph_variable_binding_phrase_p(v_pph_phrase) && pph_question.NIL != pph_phrase.pph_variable_binding_phrase_phrase_naut_subst(v_pph_phrase, template_term, sentence_term)) {
                    replacedP = (SubLObject)pph_question.T;
                }
                if (pph_question.NIL == replacedP && pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER) && pph_question.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_question.$str83$GTQS__Couldn_t_replace__S_for__S_, sentence_term, template_term, v_pph_phrase);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 37033L)
    public static SubLObject dummy_query_sentence_for_gtqs_assertion(final SubLObject gtqs_as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentence = el_utilities.copy_expression(assertions_high.gaf_arg1(gtqs_as));
        SubLObject cdolist_list_var;
        final SubLObject keywords = cdolist_list_var = pph_query_sentence_template_keywords(query_sentence);
        SubLObject keyword = (SubLObject)pph_question.NIL;
        keyword = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            final SubLObject constraint_col = pph_variable_handling.pph_variable_isa_constraints(keyword, query_sentence, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED).first();
            final SubLObject col = (pph_question.NIL != constraint_col) ? constraint_col : pph_question.$const84$Thing;
            final SubLObject instance = el_utilities.make_ternary_formula(pph_question.$const85$InstanceNamedFn_Ternary, (SubLObject)pph_question.$str86$example, col, Guids.guid_to_string(Guids.new_guid()));
            query_sentence = cycl_utilities.expression_subst(instance, keyword, query_sentence, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        }
        return narts_high.nart_expand(czer_main.canonicalize_term(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 37731L)
    public static SubLObject verify_all_gtqs_assertions(SubLObject cutoff) {
        if (cutoff == pph_question.UNPROVIDED) {
            cutoff = (SubLObject)pph_question.$int87$30;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_question.$sym45$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_question.$const46$EverythingPSC, thread);
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_question.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$83 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$84 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$85 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$86 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject total = kb_indexing.num_predicate_extent_index(pph_question.$const47$genTemplate_QuerySentence, (SubLObject)pph_question.UNPROVIDED);
                                    SubLObject sofar = (SubLObject)pph_question.ZERO_INTEGER;
                                    SubLObject matched = (SubLObject)pph_question.ZERO_INTEGER;
                                    SubLObject time = (SubLObject)pph_question.NIL;
                                    final SubLObject time_var = Time.get_internal_real_time();
                                    final SubLObject _prev_bind_0_$87 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$88 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$89 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)pph_question.NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)pph_question.T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                        try {
                                            utilities_macros.noting_percent_progress_preamble((SubLObject)pph_question.$str88$Checking___genTemplate_QuerySente);
                                            final SubLObject pred_var = pph_question.$const47$genTemplate_QuerySentence;
                                            if (pph_question.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                final SubLObject str = (SubLObject)pph_question.NIL;
                                                final SubLObject _prev_bind_0_$88 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$89 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$90 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                                final SubLObject _prev_bind_3_$93 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                                                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                try {
                                                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                                    utilities_macros.$progress_notification_count$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                                                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                                                    utilities_macros.$progress_count$.bind((SubLObject)pph_question.ZERO_INTEGER, thread);
                                                    utilities_macros.$is_noting_progressP$.bind((SubLObject)pph_question.T, thread);
                                                    utilities_macros.$silent_progressP$.bind((SubLObject)((pph_question.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : pph_question.T), thread);
                                                    utilities_macros.noting_progress_preamble(str);
                                                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                    SubLObject done_var = (SubLObject)pph_question.NIL;
                                                    final SubLObject token_var = (SubLObject)pph_question.NIL;
                                                    while (pph_question.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (pph_question.NIL != valid) {
                                                            utilities_macros.note_progress();
                                                            SubLObject final_index_iterator = (SubLObject)pph_question.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_question.$kw35$GAF, (SubLObject)pph_question.NIL, (SubLObject)pph_question.NIL);
                                                                SubLObject done_var_$94 = (SubLObject)pph_question.NIL;
                                                                final SubLObject token_var_$95 = (SubLObject)pph_question.NIL;
                                                                while (pph_question.NIL == done_var_$94) {
                                                                    final SubLObject gtqs_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$95);
                                                                    final SubLObject valid_$96 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$95.eql(gtqs_as));
                                                                    if (pph_question.NIL != valid_$96) {
                                                                        final SubLObject okP = verify_one_gtqs_assertion(gtqs_as, cutoff);
                                                                        sofar = Numbers.add(sofar, (SubLObject)pph_question.ONE_INTEGER);
                                                                        if (pph_question.NIL != okP) {
                                                                            matched = Numbers.add(matched, (SubLObject)pph_question.ONE_INTEGER);
                                                                        }
                                                                        utilities_macros.note_percent_progress(sofar, total);
                                                                    }
                                                                    done_var_$94 = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == valid_$96);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (pph_question.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == valid);
                                                    }
                                                    utilities_macros.noting_progress_postamble();
                                                }
                                                finally {
                                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$93, thread);
                                                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$90, thread);
                                                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$89, thread);
                                                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$88, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                utilities_macros.noting_percent_progress_postamble();
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$89, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$88, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$87, thread);
                                    }
                                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    PrintLow.format((SubLObject)pph_question.T, (SubLObject)pph_question.$str89$__Matched__S_of__S___genTemplate_, new SubLObject[] { matched, total, time });
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$86, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$85, thread);
                        }
                        if (new_or_reused == pph_question.$kw5$NEW && pph_question.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$84, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        if (pph_question.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$83, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 38416L)
    public static SubLObject verify_one_gtqs_assertion(final SubLObject gtqs_as, final SubLObject cutoff) {
        final SubLObject query_sentence = dummy_query_sentence_for_gtqs_assertion(gtqs_as);
        return verify_one_gtqs_assertion_with_query_sentence(gtqs_as, cutoff, query_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 38643L)
    public static SubLObject verify_one_gtqs_assertion_with_query_sentence(final SubLObject gtqs_as, final SubLObject cutoff, final SubLObject query_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)pph_question.NIL;
        SubLObject found_assertions = (SubLObject)pph_question.NIL;
        SubLObject timed_outP = (SubLObject)pph_question.NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)pph_question.T, thread);
                SubLObject timer = (SubLObject)pph_question.NIL;
                try {
                    final SubLObject _prev_bind_0_$101 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)pph_question.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(cutoff, tag);
                        found_assertions = gtqs_assertions_for_query_sentence(query_sentence, (SubLObject)pph_question.$kw1$ANY);
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$101, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (pph_question.NIL != timed_outP) {
            Errors.warn((SubLObject)pph_question.$str90$Timed_out_after__S_seconds_on____, cutoff, gtqs_as);
        }
        else if (pph_question.NIL == subl_promotions.memberP(gtqs_as, found_assertions, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED)) {
            Errors.warn((SubLObject)pph_question.$str91$Didn_t_find_gtqs_in_matches_____S, gtqs_as);
        }
        else {
            okP = (SubLObject)pph_question.T;
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 39163L)
    public static SubLObject generate_question_bf(SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map, SubLObject type) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == pph_question.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (type == pph_question.UNPROVIDED) {
            type = (SubLObject)pph_question.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_vars = pph_utilities.pph_sort_variables(list_utilities.remove_if_not((SubLObject)pph_question.$sym92$PPH_QUERY_VAR_P, pph_variable_handling.pph_formula_free_variables(formula, (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
        SubLObject negationP = (SubLObject)pph_question.NIL;
        SubLObject not_arg_position = pph_utilities.pph_unknown_arg_position();
        SubLObject duplicate_varsP = (SubLObject)pph_question.NIL;
        final SubLObject pastP = prefer_past_tense_formP(nl_preds);
        SubLObject string = (SubLObject)pph_question.NIL;
        SubLObject pred = (SubLObject)pph_question.NIL;
        SubLObject just = (SubLObject)pph_question.NIL;
        SubLObject olist = (SubLObject)pph_question.NIL;
        SubLObject demerits = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == duplicate_varsP) {
            SubLObject csome_list_var;
            SubLObject var;
            for (csome_list_var = query_vars, var = (SubLObject)pph_question.NIL, var = csome_list_var.first(); pph_question.NIL == duplicate_varsP && pph_question.NIL != csome_list_var; duplicate_varsP = list_utilities.tree_countG(var, formula, (SubLObject)pph_question.ONE_INTEGER, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED), csome_list_var = csome_list_var.rest(), var = csome_list_var.first()) {}
        }
        if (pph_question.NIL == subl_promotions.memberP(type, (SubLObject)pph_question.$list93, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED)) {
            type = (SubLObject)((pph_question.NIL != pph_vars.$pph_blanks_for_varsP$.getDynamicValue(thread)) ? pph_question.$kw94$BLANKS : pph_question.$kw95$VARS);
        }
        if (pph_question.NIL == query_vars && type == pph_question.$kw95$VARS) {
            while (pph_question.NIL != el_utilities.el_negation_p(formula)) {
                formula = cycl_utilities.formula_arg1(formula, (SubLObject)pph_question.UNPROVIDED);
                not_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_question.$list27, arg_position_map);
                arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_question.$kw23$ARG1);
                negationP = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == negationP);
            }
        }
        if (type == pph_question.$kw94$BLANKS) {
            SubLObject map = (SubLObject)pph_question.NIL;
            SubLObject cdolist_list_var = obsolete.formula_variables(formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            SubLObject var2 = (SubLObject)pph_question.NIL;
            var2 = cdolist_list_var.first();
            while (pph_question.NIL != cdolist_list_var) {
                map = list_utilities.alist_enter(map, var2, pph_vars.$pph_blank_string$.getGlobalValue(), (SubLObject)pph_question.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            }
            enforceType(map, pph_question.$sym96$ALIST_P);
            final SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
            try {
                pph_vars.$pph_term_paraphrase_map$.bind(map, thread);
                thread.resetMultipleValues();
                final SubLObject string_$103 = pph_main.generate_text(formula, nl_preds, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread), (SubLObject)pph_question.UNPROVIDED);
                final SubLObject pred_$104 = thread.secondMultipleValue();
                final SubLObject just_$105 = thread.thirdMultipleValue();
                final SubLObject olist_$106 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                string = string_$103;
                pred = pred_$104;
                just = just_$105;
                olist = olist_$106;
                if (pph_question.NIL != cycl_string.cycl_string_p(string)) {
                    string = pph_string.pph_string_from_cycl_string(string);
                }
            }
            finally {
                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pph_question.NIL != question_rop_formulaP(formula)) {
            final SubLObject _prev_bind_2 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_wh_for_query_varsP$.bind((SubLObject)pph_question.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject string_$104 = pph_question_declarative_string(formula, nl_preds, arg_position_map, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                final SubLObject pred_$105 = thread.secondMultipleValue();
                final SubLObject just_$106 = thread.thirdMultipleValue();
                final SubLObject olist_$107 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                string = string_$104;
                pred = pred_$105;
                just = just_$106;
                olist = olist_$107;
            }
            finally {
                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_2, thread);
            }
        }
        else if (pph_question.NIL == query_vars) {
            final SubLObject _prev_bind_2 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_wh_for_query_varsP$.bind((SubLObject)pph_question.NIL, thread);
                final SubLObject preambles = pph_brute_force_yes_no_preamble_strings(negationP, pastP);
                final SubLObject preamble_items = new_pph_phrase_filler_items(preambles);
                if (pph_question.NIL != negationP) {
                    pph_data_structures.pph_phrase_output_item_set_cycl(preamble_items.first(), pph_question.$const97$not);
                    pph_data_structures.pph_phrase_output_item_set_arg_position(preamble_items.first(), not_arg_position);
                    pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(preamble_items.first(), pph_question.$const97$not);
                }
                thread.resetMultipleValues();
                final SubLObject declarative_paraphrase = pph_question_declarative_string(formula, nl_preds, arg_position_map, (SubLObject)pph_question.T, query_vars);
                final SubLObject declarative_pred = thread.secondMultipleValue();
                final SubLObject declarative_just = thread.thirdMultipleValue();
                final SubLObject declarative_olist = thread.fourthMultipleValue();
                final SubLObject declarative_demerits = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                if (pph_question.NIL != declarative_paraphrase) {
                    pred = declarative_pred;
                    olist = declarative_olist;
                    just = declarative_just;
                    demerits = declarative_demerits;
                }
                if (pph_question.NIL != list_utilities.non_empty_list_p(olist)) {
                    SubLObject cdolist_list_var2 = Sequences.reverse(preamble_items);
                    SubLObject item = (SubLObject)pph_question.NIL;
                    item = cdolist_list_var2.first();
                    while (pph_question.NIL != cdolist_list_var2) {
                        olist = (SubLObject)ConsesLow.cons(item, olist);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        item = cdolist_list_var2.first();
                    }
                    string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_question.T);
                }
            }
            finally {
                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_2, thread);
            }
        }
        else {
            SubLObject cdolist_list_var3 = query_vars;
            SubLObject query_var = (SubLObject)pph_question.NIL;
            query_var = cdolist_list_var3.first();
            while (pph_question.NIL != cdolist_list_var3) {
                pph_methods_formulas.maybe_register_var_by_arg_constraints(query_var, formula);
                cdolist_list_var3 = cdolist_list_var3.rest();
                query_var = cdolist_list_var3.first();
            }
            final SubLObject remove_var_typing_clausesP;
            final SubLObject lexify_varsP = remove_var_typing_clausesP = pph_brute_force_wh_lexify_query_varsP(query_vars, formula);
            final SubLObject preamble_olist = pph_brute_force_wh_preamble_olist(query_vars, pastP, formula, arg_position_map, lexify_varsP);
            thread.resetMultipleValues();
            final SubLObject declarative_paraphrase = pph_question_declarative_string(formula, nl_preds, arg_position_map, remove_var_typing_clausesP, query_vars);
            final SubLObject declarative_pred = thread.secondMultipleValue();
            final SubLObject declarative_just = thread.thirdMultipleValue();
            final SubLObject declarative_olist = thread.fourthMultipleValue();
            final SubLObject declarative_demerits = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            if (pph_question.NIL != pph_string.pph_string_p(declarative_paraphrase)) {
                pred = declarative_pred;
                just = declarative_just;
                olist = ConsesLow.nconc(preamble_olist, declarative_olist);
                string = pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_question.T);
                demerits = declarative_demerits;
            }
        }
        return Values.values(string, pred, just, olist, demerits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 43418L)
    public static SubLObject pph_brute_force_yes_no_preamble_strings(SubLObject negationP, SubLObject pastP) {
        if (negationP == pph_question.UNPROVIDED) {
            negationP = (SubLObject)pph_question.NIL;
        }
        if (pastP == pph_question.UNPROVIDED) {
            pastP = (SubLObject)pph_question.NIL;
        }
        final SubLObject aux = (SubLObject)((pph_question.NIL != pastP) ? pph_question.$str98$was_ : pph_question.$str99$is_);
        final SubLObject true_or_false_string = pph_brute_force_true_or_false_string(negationP);
        final SubLObject preamble = Sequences.cconcatenate(aux, Sequences.cconcatenate((SubLObject)pph_question.$str100$it_, format_nil.format_nil_a_no_copy(true_or_false_string)));
        return (SubLObject)ConsesLow.list(preamble, (SubLObject)pph_question.$str101$that);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 43739L)
    public static SubLObject pph_brute_force_true_or_false_string(final SubLObject negationP) {
        return (SubLObject)((pph_question.NIL != negationP) ? pph_brute_force_false_string() : pph_question.$str102$true);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 43878L)
    public static SubLObject pph_brute_force_false_string() {
        return (SubLObject)((pph_question.NIL != pph_brute_force_capitalize_false_string_p()) ? pph_question.$str103$FALSE : pph_question.$str104$false);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 44012L)
    public static SubLObject pph_brute_force_capitalize_false_string_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(pph_vars.$pph_capitalize_false_stringP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 44205L)
    public static SubLObject pph_brute_force_wh_preamble_olist(final SubLObject unscoped_vars, final SubLObject pastP, final SubLObject formula, final SubLObject arg_position_map, final SubLObject lexify_varsP) {
        final SubLObject preamble_1_olist = pph_brute_force_wh_phrase_olist(unscoped_vars, formula, arg_position_map, lexify_varsP);
        final SubLObject preamble_2 = Sequences.cconcatenate((SubLObject)((pph_question.NIL != pastP) ? pph_question.$str105$were : pph_question.$str106$are), (SubLObject)pph_question.$str107$_there_such_that);
        final SubLObject preamble_2_olist = (SubLObject)ConsesLow.list(new_pph_phrase_filler_item(preamble_2));
        return ConsesLow.nconc(preamble_1_olist, preamble_2_olist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 44657L)
    public static SubLObject pph_brute_force_wh_phrase_olist(final SubLObject query_vars, final SubLObject formula, final SubLObject arg_position_map, final SubLObject lexify_varsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != lexify_varsP) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_wh_for_query_varsP$.bind((SubLObject)pph_question.T, thread);
                final SubLObject raw_olist = pph_methods_formulas.generate_juncts_output_list(query_vars, (SubLObject)pph_question.$list108, (SubLObject)pph_question.$kw109$AND, (SubLObject)pph_question.UNPROVIDED);
                olist = pph_brute_force_olist_set_arg_positions(raw_olist, formula, arg_position_map);
            }
            finally {
                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_wh_for_query_varsP$.bind((SubLObject)pph_question.NIL, thread);
                pph_vars.$pph_quantify_varsP$.bind((SubLObject)pph_question.NIL, thread);
                final SubLObject preamble_1a = (SubLObject)pph_question.$str110$what_values_of;
                final SubLObject preamble_1b_olist = pph_methods_formulas.generate_juncts_output_list(query_vars, (SubLObject)pph_question.NIL, (SubLObject)pph_question.$kw109$AND, (SubLObject)pph_question.UNPROVIDED);
                olist = pph_brute_force_olist_set_arg_positions(preamble_1b_olist, formula, arg_position_map);
                olist = (SubLObject)ConsesLow.cons(new_pph_phrase_filler_item(preamble_1a), olist);
            }
            finally {
                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
            }
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 45476L)
    public static SubLObject new_pph_phrase_filler_item(final SubLObject string) {
        return pph_data_structures.new_pph_phrase_output_item(string, pph_utilities.pph_unknown_arg_position(), pph_phrase.pph_empty_cycl(), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 45738L)
    public static SubLObject new_pph_phrase_filler_items(final SubLObject strings) {
        SubLObject ans = (SubLObject)pph_question.NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject str = (SubLObject)pph_question.NIL;
        str = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            ans = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase_output_item(str, pph_utilities.pph_unknown_arg_position(), pph_phrase.pph_empty_cycl(), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED), ans);
            cdolist_list_var = cdolist_list_var.rest();
            str = cdolist_list_var.first();
        }
        return Sequences.reverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 46082L)
    public static SubLObject pph_brute_force_olist_set_arg_positions(final SubLObject raw_olist, final SubLObject formula, final SubLObject arg_position_map) {
        SubLObject olist = (SubLObject)pph_question.NIL;
        SubLObject cdolist_list_var = Sequences.nreverse(raw_olist);
        SubLObject item = (SubLObject)pph_question.NIL;
        item = cdolist_list_var.first();
        while (pph_question.NIL != cdolist_list_var) {
            final SubLObject cycl = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject arg_positions = cycl_utilities.arg_positions_dfs(cycl, formula, (SubLObject)pph_question.UNPROVIDED);
            final SubLObject local_arg_position = (pph_question.NIL != arg_positions) ? arg_positions.first() : pph_utilities.pph_unknown_arg_position();
            final SubLObject old_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
            final SubLObject new_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
            if (!new_arg_position.equal(old_arg_position)) {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str111$__Setting_arg_position_of__S_to__, cycl, new_arg_position, old_arg_position, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                }
                pph_data_structures.pph_phrase_output_item_set_arg_position(item, new_arg_position);
            }
            olist = (SubLObject)ConsesLow.cons(item, olist);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 46969L)
    public static SubLObject pph_brute_force_wh_lexify_query_varsP(final SubLObject query_vars, final SubLObject query_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max = (SubLObject)pph_question.ONE_INTEGER;
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == Types.sublisp_true() && pph_question.NIL == list_utilities.lengthG(query_vars, max, (SubLObject)pph_question.UNPROVIDED) && pph_question.NIL == pph_vars.pph_maximize_linksP() && pph_question.NIL != pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread) && pph_question.NIL == el_utilities.el_existential_p(query_formula) && pph_question.NIL == Sequences.find_if((SubLObject)pph_question.$sym112$PPH_VAR_REGISTERED_AS_DEFAULT_, query_vars, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED) && pph_question.NIL == Sequences.find_if((SubLObject)pph_question.$sym113$PPH_EXCEPTIONAL_VAR_P, query_vars, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 47385L)
    public static SubLObject pph_question_declarative_string(SubLObject query_formula, final SubLObject nl_preds, SubLObject arg_position_map, SubLObject remove_redundant_var_typing_clausesP, SubLObject query_vars) {
        if (arg_position_map == pph_question.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (remove_redundant_var_typing_clausesP == pph_question.UNPROVIDED) {
            remove_redundant_var_typing_clausesP = (SubLObject)pph_question.NIL;
        }
        if (query_vars == pph_question.UNPROVIDED) {
            query_vars = (SubLObject)pph_question.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)pph_question.NIL;
        SubLObject agr_pred = (SubLObject)pph_question.NIL;
        SubLObject justification = (SubLObject)pph_question.NIL;
        SubLObject olist = (SubLObject)pph_question.NIL;
        SubLObject demerits = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != remove_redundant_var_typing_clausesP) {
            final SubLObject template = pph_remove_redundant_query_var_typing_clauses(query_formula, query_vars, arg_position_map);
            if (pph_question.NIL == pph_utilities.pph_identity_template_p(template)) {
                query_formula = pph_utilities.pph_apply_template(template, query_formula);
                arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, template);
            }
        }
        final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(query_formula, arg_position_map, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL != pph_utilities.pph_nl_pred_listP(nl_preds)) {
            pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, (SubLObject)pph_question.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding(thread);
        try {
            pph_vars.$pph_hide_explicit_universalsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_vars.$pph_hide_explicit_universalsP$.getDynamicValue(thread) && pph_question.NIL == pph_vars.pph_maximize_linksP()), thread);
            final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
            try {
                pph_main.pph_phrase_generate(phrase, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, (SubLObject)pph_question.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                }
            }
        }
        finally {
            pph_vars.$pph_hide_explicit_universalsP$.rebind(_prev_bind_0, thread);
        }
        if (pph_question.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            string = pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_question.UNPROVIDED);
            agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            justification = pph_phrase.pph_phrase_justification(phrase);
            olist = pph_phrase.pph_phrase_output_list(phrase);
            demerits = pph_phrase.pph_phrase_demerits(phrase);
        }
        return Values.values(string, agr_pred, justification, olist, demerits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 48885L)
    public static SubLObject pph_remove_redundant_query_var_typing_clauses(final SubLObject query_formula, final SubLObject query_vars, final SubLObject arg_position_map) {
        final SubLObject template = pph_methods_formulas.remove_var_typing_clauses(query_formula, query_vars, arg_position_map, (SubLObject)pph_question.UNPROVIDED);
        return (pph_question.$kw114$ERROR == template) ? pph_utilities.pph_identity_template() : template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 49155L)
    public static SubLObject question_rop_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_question.NIL == el_utilities.el_formula_p(formula)) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != rop_formulaP(formula)) {
            final SubLObject string = cycl_utilities.formula_arg1(formula, (SubLObject)pph_question.UNPROVIDED);
            SubLObject ans = (SubLObject)pph_question.NIL;
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                final SubLObject _prev_bind_0_$112 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        if (pph_question.NIL == ans) {
                            SubLObject csome_list_var;
                            SubLObject word;
                            for (csome_list_var = string_utilities.string_tokenize(string, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED), word = (SubLObject)pph_question.NIL, word = csome_list_var.first(); pph_question.NIL == ans && pph_question.NIL != csome_list_var; ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != lexicon_accessors.closed_lexical_class_string_case_insensitiveP(word, (SubLObject)pph_question.UNPROVIDED) && (pph_question.NIL != lexicon_accessors.string_is_posP(word, pph_question.$const115$WHWord, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED) || pph_question.NIL != lexicon_accessors.string_is_posP(word, pph_question.$const116$AuxVerb, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED))), csome_list_var = csome_list_var.rest(), word = csome_list_var.first()) {}
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$112, thread);
                }
            }
            finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        if (pph_question.NIL != el_utilities.formula_with_sequence_termP(formula)) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != term.nautP(formula, (SubLObject)pph_question.UNPROVIDED)) {
            return Sequences.find_if((SubLObject)pph_question.$sym117$QUESTION_ROP_FORMULA_, cycl_utilities.formula_args(formula, (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 50041L)
    public static SubLObject rop_formulaP(final SubLObject obj) {
        return el_utilities.el_formula_with_operator_p(obj, pph_question.$const118$TheResultOfParsing);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 50140L)
    public static SubLObject question_var_npP(final SubLObject phrase) {
        if (pph_question.NIL == pph_phrase_maybe_npP(phrase)) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED))) {
            return pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED));
        }
        if (pph_question.NIL != el_var_det_nbarP(phrase)) {
            return (SubLObject)pph_question.T;
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 50531L)
    public static SubLObject pph_phrase_maybe_npP(final SubLObject phrase) {
        if (pph_question.NIL != pph_utilities.pph_npP(pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_question.T))) {
            return (SubLObject)pph_question.T;
        }
        if (pph_question.NIL == pph_phrase.pph_phrase_category_unknown_p(phrase)) {
            return (SubLObject)pph_question.NIL;
        }
        final SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
        if (pph_question.NIL != agr_pred && (pph_question.NIL != pph_utilities.pph_genl_pos_predP(pph_question.$const119$nounStrings, agr_pred, (SubLObject)pph_question.UNPROVIDED) || pph_question.NIL != pph_utilities.pph_genl_pos_predP(agr_pred, pph_question.$const119$nounStrings, (SubLObject)pph_question.UNPROVIDED))) {
            return (SubLObject)pph_question.T;
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 50902L)
    public static SubLObject el_var_det_nbarP(final SubLObject phrase) {
        if (pph_question.NIL == list_utilities.lengthE(pph_phrase.pph_phrase_dtrs(phrase), (SubLObject)pph_question.TWO_INTEGER, (SubLObject)pph_question.UNPROVIDED)) {
            return (SubLObject)pph_question.NIL;
        }
        final SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_question.ZERO_INTEGER);
        final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_question.ONE_INTEGER);
        if (pph_question.NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(nbar_dtr, (SubLObject)pph_question.UNPROVIDED)) && pph_question.NIL != pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(nbar_dtr, (SubLObject)pph_question.UNPROVIDED)) && (pph_question.NIL != pph_phrase.pph_phrase_definite_articleP(det_dtr) || pph_question.NIL != pph_phrase.pph_phrase_indefinite_articleP(det_dtr)) && pph_question.NIL != pph_utilities.pph_nbarP(pph_phrase.pph_phrase_category(nbar_dtr, (SubLObject)pph_question.UNPROVIDED))) {
            return (SubLObject)pph_question.T;
        }
        if (pph_question.NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(det_dtr, (SubLObject)pph_question.UNPROVIDED)) && pph_question.NIL != pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(det_dtr, (SubLObject)pph_question.UNPROVIDED)) && pph_question.NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(det_dtr, (SubLObject)pph_question.UNPROVIDED), pph_question.$const120$Determiner, (SubLObject)pph_question.UNPROVIDED)) {
            return (SubLObject)pph_question.T;
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 51668L)
    public static SubLObject el_var_np_var(final SubLObject phrase) {
        if (pph_question.NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED))) {
            return pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED);
        }
        SubLObject dtr_num = (SubLObject)pph_question.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_question.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject ans;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_question.NIL, v_iteration = (SubLObject)pph_question.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_question.ONE_INTEGER)) {
                element_num = ((pph_question.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_question.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (!dtr_num.numG((SubLObject)pph_question.ONE_INTEGER)) {
                    ans = pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_question.UNPROVIDED);
                    if (pph_question.NIL != cycl_variables.el_varP(ans)) {
                        return ans;
                    }
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_question.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 51972L)
    public static SubLObject number_varP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)pph_question.T, (SubLObject)pph_question.T, Symbols.symbol_function((SubLObject)pph_question.$sym121$TRUE));
        return list_utilities.sublisp_boolean(Sequences.find(pph_question.$const122$Integer, constraints, (SubLObject)pph_question.$sym123$PPH_SPEC_, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 52349L)
    public static SubLObject no_number_varsP(final SubLObject vars, final SubLObject formula) {
        SubLObject numP = (SubLObject)pph_question.NIL;
        if (pph_question.NIL == numP) {
            SubLObject csome_list_var = vars;
            SubLObject var = (SubLObject)pph_question.NIL;
            var = csome_list_var.first();
            while (pph_question.NIL == numP && pph_question.NIL != csome_list_var) {
                if (pph_question.NIL != number_varP(var, formula)) {
                    if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str124$___S_determined_to_be_a_number_va, var, formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                    }
                    numP = (SubLObject)pph_question.T;
                }
                csome_list_var = csome_list_var.rest();
                var = csome_list_var.first();
            }
        }
        if (pph_question.NIL == numP && pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str125$No_number_vars_in__S__, formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL == numP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 52739L)
    public static SubLObject formula_ok_for_subj_aux_inversionP(final SubLObject formula) {
        final SubLObject conservative_with_varsP = (SubLObject)pph_question.T;
        final SubLObject vars = obsolete.formula_variables(formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject query_varsP = Sequences.find_if((SubLObject)pph_question.$sym92$PPH_QUERY_VAR_P, vars, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL == pph_utilities.pph_english_contextP((SubLObject)pph_question.UNPROVIDED)) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != pph_vars.pph_maximize_linksP() && pph_question.NIL != query_varsP) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != conservative_with_varsP && pph_question.NIL != list_utilities.lengthGE(vars, (SubLObject)pph_question.THREE_INTEGER, (SubLObject)pph_question.UNPROVIDED)) {
            return (SubLObject)pph_question.NIL;
        }
        return (SubLObject)pph_question.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 53154L)
    public static SubLObject rmp_formula_to_intermediate_cycl(final SubLObject formula) {
        final SubLObject op = cycl_utilities.formula_operator(formula);
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject wide_scope_arg = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != op_ok_for_i_cyclP(op)) {
            wide_scope_arg = pph_methods_formulas.wide_scope_arg_in_pred(op);
            template = pph_methods_formulas.intermediate_cycl_template_for_rmp_formula(formula);
        }
        return Values.values(template, wide_scope_arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 53744L)
    public static SubLObject op_ok_for_i_cyclP(final SubLObject op) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != kb_indexing_datastructures.indexed_term_p(op) && pph_question.NIL != pph_methods_formulas.quant_over_arg_tuples(op));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 53955L)
    public static SubLObject remove_var_typing_clauses_from_question_phrase(final SubLObject phrase) {
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        if (pph_question.NIL != formula && pph_question.NIL == pph_utilities.pph_var_typing_clauseP(formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED)) {
            final SubLObject template = pph_methods_formulas.remove_var_typing_clauses(formula, (SubLObject)pph_question.NIL, map, (SubLObject)pph_question.UNPROVIDED);
            if (pph_question.NIL != pph_utilities.pph_cycl_template_p(template) && pph_question.NIL == pph_utilities.pph_identity_template_p(template)) {
                pph_phrase.pph_phrase_reset_cycl(phrase, template);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 54411L)
    public static SubLObject generate_with_subj_aux_inversion(final SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == pph_question.UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == pph_question.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_question.NIL == formula_ok_for_subj_aux_inversionP(formula)) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str126$__Trying_to_generate__S_using_sub, formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        }
        final SubLObject phrase = (pph_question.NIL != pph_types.pph_phrase_nautP(formula)) ? pph_templates.pph_phrasify_phrase_naut(formula, arg_position_map) : pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(formula, arg_position_map, (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        SubLObject string = (SubLObject)pph_question.NIL;
        SubLObject result_agr_pred = (SubLObject)pph_question.NIL;
        SubLObject justification = (SubLObject)pph_question.NIL;
        SubLObject output_list = (SubLObject)pph_question.NIL;
        SubLObject demerits = (SubLObject)pph_question.NIL;
        generate_phrase_with_subj_aux_inversion(phrase, formula, nl_preds, arg_position_map, (SubLObject)pph_question.UNPROVIDED);
        if (pph_question.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            string = pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_question.UNPROVIDED);
            result_agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            justification = pph_phrase.pph_phrase_justification(phrase);
            output_list = pph_phrase.pph_phrase_output_list(phrase);
            demerits = pph_phrase.pph_phrase_demerits(phrase);
            if (pph_question.NIL != misc_utilities.initialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) {
                final SubLObject queue = queues.create_queue((SubLObject)pph_question.UNPROVIDED);
                SubLObject done_count = (SubLObject)pph_question.ZERO_INTEGER;
                queues.enqueue(phrase, queue);
                while (pph_question.NIL == queues.queue_empty_p(queue)) {
                    final SubLObject ignore_me = queues.dequeue(queue);
                    SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                    SubLObject alternative = (SubLObject)pph_question.NIL;
                    alternative = cdolist_list_var.first();
                    while (pph_question.NIL != cdolist_list_var) {
                        pph_sentence.pph_sentence_add_alternative(alternative);
                        done_count = Numbers.add(done_count, (SubLObject)pph_question.ONE_INTEGER);
                        if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_question.$str38$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_question.ONE_INTEGER), pph_question.$str39$__, format_nil.format_nil_a_no_copy((SubLObject)pph_question.$str40$Done__S_alternatives_of__S) });
                            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(done_count, phrase));
                        }
                        queues.enqueue(alternative, queue);
                        cdolist_list_var = cdolist_list_var.rest();
                        alternative = cdolist_list_var.first();
                    }
                }
            }
        }
        return Values.values(string, result_agr_pred, justification, output_list, demerits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 55806L)
    public static SubLObject generate_phrase_with_subj_aux_inversion(final SubLObject phrase, final SubLObject formula, SubLObject nl_preds, final SubLObject arg_position_map, SubLObject reformulateP) {
        if (reformulateP == pph_question.UNPROVIDED) {
            reformulateP = (SubLObject)pph_question.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject orig_phrase = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
        try {
            pph_vars.$pph_var_types$.bind((pph_question.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED), thread);
            final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
            final SubLObject _prev_bind_0_$114 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
            try {
                pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                pph_vars.$pph_noted_var_types$.bind((pph_question.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_question.EQL), (SubLObject)pph_question.SIXTEEN_INTEGER), thread);
                pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str17$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                }
                try {
                    final SubLObject _prev_bind_0_$115 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                    try {
                        pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                        pph_macros.herald_new_discourse_context();
                        try {
                            pph_drs.pph_ensure_discourse_participant_rms();
                            if (pph_question.NIL != el_utilities.el_existential_p(formula)) {
                                final SubLObject template = pph_methods_formulas.pph_reformulate_existential_with_thecollectionof(formula, (SubLObject)pph_question.UNPROVIDED);
                                if (pph_question.NIL == pph_utilities.pph_impossible_template_p(template)) {
                                    pph_phrase.pph_phrase_reset_cycl(phrase, template);
                                }
                                thread.resetMultipleValues();
                                final SubLObject new_template = pph_methods_formulas.remove_var_typing_clauses_from_existential(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED), arg_position_map);
                                final SubLObject new_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                pph_phrase.pph_phrase_reset_cycl(phrase, new_template);
                                if (pph_question.NIL != new_justification) {
                                    pph_phrase.pph_phrase_add_justification(phrase, new_justification);
                                }
                            }
                            thread.resetMultipleValues();
                            final SubLObject template = rmp_formula_to_intermediate_cycl(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED));
                            final SubLObject wide_scope_arg = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (pph_question.NIL == pph_utilities.pph_identity_template_p(template)) {
                                pph_phrase.pph_phrase_reset_cycl(phrase, template);
                            }
                            final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
                            try {
                                nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_question.UNPROVIDED);
                                if (pph_question.NIL != reformulateP) {
                                    SubLObject cdolist_list_var = obsolete.formula_free_variables(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                    SubLObject var = (SubLObject)pph_question.NIL;
                                    var = cdolist_list_var.first();
                                    while (pph_question.NIL != cdolist_list_var) {
                                        final SubLObject var_path = pph_utilities.pph_template_for_cycl_variable(var, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED));
                                        final SubLObject new_template2 = pph_methods_formulas.pph_reformulate_conjunction_with_thecollectionof(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED), var, pph_utilities.pph_identity_template(), pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED), var_path, (SubLObject)pph_question.NIL);
                                        if (pph_question.NIL == list_utilities.tree_find(new_template2, (SubLObject)pph_question.$kw114$ERROR, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED) && pph_question.NIL == pph_utilities.pph_impossible_template_p(new_template2) && pph_question.NIL == pph_utilities.pph_identity_template_p(new_template2)) {
                                            pph_phrase.pph_phrase_reset_cycl(phrase, new_template2);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        var = cdolist_list_var.first();
                                    }
                                }
                                remove_var_typing_clauses_from_question_phrase(phrase);
                                final SubLObject new_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED);
                                final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
                                final SubLObject query_vars = cycl_utilities.expression_gather(new_cycl, (SubLObject)pph_question.$sym92$PPH_QUERY_VAR_P, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                final SubLObject _prev_bind_0_$116 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_use_wh_for_query_varsP$.bind((SubLObject)pph_question.T, thread);
                                    SubLObject doneP = (SubLObject)pph_question.NIL;
                                    final SubLObject generator = pph_data_structures.get_pph_phrase_template_generator(new_cycl, wide_scope_arg, cycl_utilities.formula_arg0(new_cycl), nl_preds, (SubLObject)pph_question.NIL, (SubLObject)pph_question.UNPROVIDED);
                                    while (pph_question.NIL == doneP && pph_question.NIL == pph_data_structures.pph_phrase_template_generator_done_p(generator)) {
                                        thread.resetMultipleValues();
                                        final SubLObject phrase_template = pph_templates.pph_phrase_template_generator_next(generator);
                                        final SubLObject ignore_me = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (pph_question.NIL != pph_phrase.pph_phrase_p(phrase_template, (SubLObject)pph_question.UNPROVIDED)) {
                                            if (pph_question.NIL != pph_phrase.pph_conditional_phrase_p(phrase_template)) {
                                                pph_phrase_resolution.pph_phrase_resolve_condition(phrase_template, formula, (SubLObject)pph_question.NIL);
                                            }
                                            final SubLObject _prev_bind_0_$117 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_current_arg0$.bind((SubLObject)((pph_question.NIL != pph_macros.pph_ok_arg0_for_linkingP(cycl_utilities.formula_arg0(formula))) ? cycl_utilities.formula_arg0(formula) : pph_question.$kw14$UNSPECIFIED), thread);
                                                pph_templates.pph_template_phrase_set_cycl(phrase_template, new_cycl, map, (SubLObject)pph_question.UNPROVIDED);
                                            }
                                            finally {
                                                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            final SubLObject clause = find_head_clause(phrase_template);
                                            if (pph_question.NIL == make_question_template(clause, query_vars, nl_preds, pph_phrase.pph_phrase_cycl(phrase_template, (SubLObject)pph_question.UNPROVIDED))) {
                                                continue;
                                            }
                                            final SubLObject question_template = phrase_template;
                                            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                                                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str127$__Made_question_template__S, question_template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                            }
                                            if (pph_question.NIL != pph_utilities.pph_nl_pred_listP(nl_preds)) {
                                                pph_phrase.pph_phrase_add_agr_preds(question_template, nl_preds, (SubLObject)pph_question.UNPROVIDED);
                                            }
                                            pph_main.pph_phrase_generate(question_template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                            if (pph_question.NIL != pph_phrase.pph_phrase_doneP(question_template) && pph_question.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                                pph_phrase.pph_phrase_copy(question_template, phrase, (SubLObject)pph_question.UNPROVIDED);
                                                if (pph_question.NIL != pph_vars.pph_generate_alternative_phrasesP()) {
                                                    continue;
                                                }
                                                doneP = (SubLObject)pph_question.T;
                                            }
                                            else {
                                                if (pph_question.NIL == pph_phrase.pph_phrase_doneP(question_template)) {
                                                    continue;
                                                }
                                                pph_phrase.pph_phrase_add_alternative(phrase, question_template);
                                            }
                                        }
                                    }
                                    pph_data_structures.free_pph_phrase_template_generator(generator);
                                }
                                finally {
                                    pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0_$116, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, (SubLObject)pph_question.UNPROVIDED);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                pph_macros.herald_end_of_discourse_context();
                                pph_macros.clear_pph_discourse_context();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                            }
                        }
                    }
                    finally {
                        pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$115, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                        if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str19$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                        }
                        pph_macros.pph_handle_local_vars(local_vars);
                        if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str20$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                    }
                }
            }
            finally {
                pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$114, thread);
            }
        }
        finally {
            pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
        }
        if (pph_question.NIL != pph_phrase.pph_phrase_doneP(phrase) && pph_question.NIL != string_utilities.substringP((SubLObject)pph_question.$str128$_X_such_that, pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED)) {
            PrintLow.format((SubLObject)pph_question.T, (SubLObject)pph_question.$str129$in_generate_phrase_with_subj_aux_, pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_question.UNPROVIDED));
            generate_phrase_with_subj_aux_inversion(orig_phrase, formula, arg_position_map, (SubLObject)pph_question.NIL, (SubLObject)pph_question.UNPROVIDED);
            pph_phrase.pph_phrase_copy(orig_phrase, phrase, (SubLObject)pph_question.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 59563L)
    public static SubLObject find_head_clause(final SubLObject phrase_template) {
        SubLObject head_clause;
        for (head_clause = phrase_template; pph_question.NIL != pph_phrase.pph_phrase_has_dtrsP(head_clause) && pph_question.NIL != pph_phrase.pph_phrase_head_dtr_num(head_clause) && pph_question.NIL != pph_phrase.pph_phrase_sP(pph_phrase.pph_phrase_head_dtr(head_clause)); head_clause = pph_phrase.pph_phrase_head_dtr(head_clause)) {}
        return head_clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 59889L)
    public static SubLObject make_question_template(final SubLObject template, final SubLObject query_vars, SubLObject matrix_agr, SubLObject template_cycl) {
        if (matrix_agr == pph_question.UNPROVIDED) {
            matrix_agr = (SubLObject)pph_question.NIL;
        }
        if (template_cycl == pph_question.UNPROVIDED) {
            template_cycl = pph_phrase.pph_phrase_cycl(template, (SubLObject)pph_question.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_question.NIL == pph_phrase.pph_phrase_p(template, (SubLObject)pph_question.UNPROVIDED) || pph_question.NIL == pph_phrase_subject_head_verb_initialP(template)) {
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str130$__Not_subject_head_verb_initial__, template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != pph_utilities.pph_nl_pred_listP(matrix_agr)) {
            final SubLObject dtr = pph_phrase.pph_phrase_head_dtr(template);
            final SubLObject dtr_agr_preds = pph_phrase.pph_phrase_agr_preds(dtr, (SubLObject)pph_question.UNPROVIDED);
            final SubLObject dtr_tense_preds = (SubLObject)(dtr_agr_preds.isList() ? list_utilities.find_all_if((SubLObject)pph_question.$sym131$PPH_TENSE_PRED_, dtr_agr_preds, (SubLObject)pph_question.UNPROVIDED) : pph_question.NIL);
            if (pph_question.NIL != pph_utilities.pph_genlP(pph_phrase.pph_phrase_category(dtr, (SubLObject)pph_question.UNPROVIDED), pph_question.$const132$Verb, (SubLObject)pph_question.UNPROVIDED)) {
                pph_phrase.pph_phrase_set_agr_preds(dtr, pph_utilities.pph_filter_preds(matrix_agr, (SubLObject)((pph_question.NIL != dtr_tense_preds) ? dtr_tense_preds : pph_question.$kw1$ANY), (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED);
            }
        }
        thread.resetMultipleValues();
        SubLObject question_subphrase_path = find_question_subphrase(template);
        final SubLObject question_subphrase = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject head_verb = pph_phrase.pph_phrase_head_dtr(template);
        SubLObject head_verb_path = (SubLObject)ConsesLow.list(pph_phrase.pph_phrase_head_dtr_num(template));
        SubLObject structure_changedP = (SubLObject)pph_question.NIL;
        while (pph_question.NIL != pph_phrase.pph_phrase_p(head_verb, (SubLObject)pph_question.UNPROVIDED) && pph_question.NIL != pph_phrase.pph_phrase_has_dtrsP(head_verb) && pph_question.NIL != pph_phrase.pph_phrase_head_dtr_num(head_verb)) {
            head_verb_path = list_utilities.snoc(pph_phrase.pph_phrase_head_dtr_num(head_verb), head_verb_path);
            head_verb = pph_phrase.pph_phrase_head_dtr(head_verb);
        }
        if (pph_question.NIL != query_vars && pph_question.NIL == pph_subphrase_path_p(question_subphrase_path)) {
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str133$__Couldn_t_find_question_subphras, template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            return (SubLObject)pph_question.NIL;
        }
        if (question_subphrase.eql(pph_phrase.pph_phrase_subject_dtr(template))) {
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str134$__Subject_dtr_of__S_is_a_wh_phras, template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            string_for_var_in_question_phrase(question_subphrase, template_cycl);
            return template;
        }
        if (pph_question.NIL == head_verb) {
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.THREE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str135$___S_has_no_head_verb__MAKE_QUEST, template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != pph_phrase.pph_copula_phraseP(head_verb)) {
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str136$__Head_dtr__S_is_a_copula__placin, head_verb, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            if (pph_question.NIL != pph_phrase.pph_phrase_p(question_subphrase, (SubLObject)pph_question.UNPROVIDED)) {
                string_for_var_in_question_phrase(question_subphrase, template_cycl);
            }
            pph_phrase.pph_phrase_front_subphrase(head_verb_path, head_verb, template);
            structure_changedP = (SubLObject)pph_question.T;
        }
        else if (pph_question.NIL != pph_phrase.pph_aux_verb_phraseP(head_verb)) {
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str137$__Head_dtr__S_is_an_auxiliary__pl, head_verb, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            if (pph_question.NIL != pph_phrase.pph_phrase_p(question_subphrase, (SubLObject)pph_question.UNPROVIDED)) {
                string_for_var_in_question_phrase(question_subphrase, template_cycl);
            }
            pph_phrase.pph_phrase_front_subphrase(head_verb_path, head_verb, template);
            structure_changedP = (SubLObject)pph_question.T;
        }
        else {
            if (pph_question.NIL != pph_phrase.possibly_modal_verb_phraseP(head_verb)) {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str138$___S_may_be_a_modal_verb__MAKE_QU, head_verb, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                }
                return (SubLObject)pph_question.NIL;
            }
            if (pph_question.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_question.UNPROVIDED) && (pph_question.NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(template), lexicon_cache.perfect_aspect_pred(), (SubLObject)pph_question.UNPROVIDED) || pph_question.NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(head_verb), lexicon_cache.perfect_aspect_pred(), (SubLObject)pph_question.UNPROVIDED))) {
                final SubLObject have_dtr_num = make_multi_word_perfect_verb(template);
                pph_phrase.pph_phrase_front_subphrase((SubLObject)ConsesLow.list(have_dtr_num), pph_phrase.pph_phrase_nth_dtr(template, have_dtr_num), template);
                structure_changedP = (SubLObject)pph_question.T;
            }
            else {
                if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str139$__Adding_do_support_to_template__, template, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                }
                if (pph_question.NIL != pph_phrase.pph_phrase_p(question_subphrase, (SubLObject)pph_question.UNPROVIDED)) {
                    string_for_var_in_question_phrase(question_subphrase, template_cycl);
                }
                pph_phrase_add_do_supportXinvert(template);
                structure_changedP = (SubLObject)pph_question.T;
            }
        }
        if (pph_question.NIL != pph_subphrase_path_p(question_subphrase_path)) {
            if (pph_question.NIL != structure_changedP) {
                question_subphrase_path = pph_phrase.pph_phrase_find_nested_dtr_path(template, question_subphrase, (SubLObject)pph_question.UNPROVIDED);
            }
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str140$Fronting__S, question_subphrase, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            pph_phrase.pph_phrase_front_subphrase(question_subphrase_path, question_subphrase, template);
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 63974L)
    public static SubLObject pph_phrase_add_do_supportXinvert(final SubLObject phrase) {
        pph_utilities.pph_phrase_add_do_support(phrase);
        pph_phrase.pph_phrase_front_head_dtr(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 64221L)
    public static SubLObject make_multi_word_perfect_verb(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num(phrase);
        final SubLObject head_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, head_dtr_num);
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind((SubLObject)pph_question.T, thread);
            final SubLObject have_dtr = pph_phrase.pph_phrase_copy(head_dtr, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            pph_phrase.pph_phrase_set_wu(have_dtr, pph_question.$const141$Have_TheWord);
            final SubLObject old_head_agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            final SubLObject new_agr_pred = (pph_question.NIL != pph_utilities.pph_genl_pos_predP(old_head_agr_pred, pph_question.$const142$pastPerfect_Generic, (SubLObject)pph_question.UNPROVIDED)) ? pph_question.$const31$pastTense_Generic : pph_question.$const143$presentTense_Generic;
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str144$De_perfectiving_agr_from__S_to__S, old_head_agr_pred, new_agr_pred, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_agr_pred(have_dtr, new_agr_pred, (SubLObject)pph_question.UNPROVIDED);
            pph_phrase.pph_phrase_set_head_dtr_num(phrase, (SubLObject)pph_question.NIL);
            pph_phrase.pph_phrase_set_agr(head_dtr, pph_data_structures.new_pph_phrase_agr(pph_utilities.new_pph_agr_constraint((SubLObject)pph_question.$kw145$POS_PRED, pph_question.$const146$perfect), (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED);
            pph_phrase.pph_phrase_insert_dtr(phrase, have_dtr, head_dtr_num);
            return head_dtr_num;
        }
        finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 65164L)
    public static SubLObject question_phraseP(final SubLObject phrase, final SubLObject matrix_cycl, final SubLObject matrix_phrase) {
        if (pph_question.NIL != pph_temporal_location_var_phraseP(phrase)) {
            return (SubLObject)pph_question.T;
        }
        if (pph_question.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, matrix_cycl, matrix_phrase);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != question_rop_formulaP(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED)) || pph_question.NIL != question_var_npP(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 65549L)
    public static SubLObject pph_temporal_location_var_phraseP(final SubLObject phrase) {
        if (pph_question.$kw36$TRUE == pph_data_structures.pph_phrase_info_lookup(phrase, (SubLObject)pph_question.$kw147$TEMPORAL_LOCATION, (SubLObject)pph_question.$kw148$FALSE) && pph_question.NIL == pph_phrase.pph_phrase_cycl_find_if(phrase, (SubLObject)pph_question.$sym149$ROP_FORMULA_) && pph_question.NIL != pph_phrase.pph_phrase_cycl_find_if(phrase, (SubLObject)pph_question.$sym63$EL_VAR_)) {
            return (SubLObject)pph_question.T;
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 65832L)
    public static SubLObject find_question_subphrase(final SubLObject phrase) {
        return find_question_subphrase_int(phrase, (SubLObject)pph_question.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 66016L)
    public static SubLObject find_question_subphrase_int(final SubLObject phrase, final SubLObject current_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_question.UNPROVIDED);
        SubLObject dtr_num = (SubLObject)pph_question.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_question.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_path;
            SubLObject nested_path;
            SubLObject nested_subphrase;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_question.NIL, v_iteration = (SubLObject)pph_question.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_question.ONE_INTEGER)) {
                element_num = ((pph_question.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_question.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                dtr_path = list_utilities.snoc(dtr_num, current_path);
                if (pph_question.NIL != question_phraseP(dtr, cycl, phrase)) {
                    if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str150$Found_question_phrase___S, dtr, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                    }
                    return Values.values(dtr_path, dtr);
                }
                if (pph_question.NIL != pph_phrase.pph_phrase_ppP(dtr) || pph_question.NIL != pph_phrase.pph_phrase_sP(dtr) || pph_question.NIL != pph_phrase.pph_phrase_category_unknown_p(dtr)) {
                    thread.resetMultipleValues();
                    nested_path = find_question_subphrase_int(dtr, dtr_path);
                    nested_subphrase = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_question.NIL != pph_subphrase_path_p(nested_path)) {
                        return Values.values(nested_path, nested_subphrase);
                    }
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_question.ONE_INTEGER);
            }
        }
        return Values.values((SubLObject)pph_question.$kw151$NOT_FOUND, (SubLObject)pph_question.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 66724L)
    public static SubLObject pph_subphrase_path_p(final SubLObject v_object) {
        return pph_utilities.pph_list_ofP(Symbols.symbol_function((SubLObject)pph_question.$sym152$INTEGERP), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 66815L)
    public static SubLObject pph_use_who_for_var_in_formulaP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_var_type = pph_variable_handling.pph_var_type(var);
        pph_methods_formulas.maybe_register_var_by_arg_constraints(var, formula);
        final SubLObject cols = (SubLObject)ConsesLow.cons(pph_variable_handling.pph_var_type(var), pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)pph_question.T, (SubLObject)pph_question.T, (SubLObject)pph_question.UNPROVIDED));
        SubLObject use_whoP = (SubLObject)pph_question.NIL;
        SubLObject include_non_personsP = (SubLObject)pph_question.NIL;
        SubLObject doneP = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != pph_utilities.pph_genlP(pph_variable_handling.pph_var_type(var), pph_question.$const153$Agent_Generic, (SubLObject)pph_question.UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (pph_question.NIL == doneP) {
                    SubLObject csome_list_var = cols;
                    SubLObject col = (SubLObject)pph_question.NIL;
                    col = csome_list_var.first();
                    while (pph_question.NIL == doneP && pph_question.NIL != csome_list_var) {
                        if (pph_question.NIL == pph_utilities.pph_genlP(pph_question.$const154$Person, col, (SubLObject)pph_question.UNPROVIDED)) {
                            use_whoP = (SubLObject)pph_question.NIL;
                            doneP = (SubLObject)pph_question.T;
                        }
                        else if (pph_question.NIL != pph_utilities.pph_genlP(col, pph_question.$const154$Person, (SubLObject)pph_question.UNPROVIDED)) {
                            use_whoP = (SubLObject)pph_question.T;
                        }
                        else {
                            use_whoP = (SubLObject)pph_question.T;
                            include_non_personsP = (SubLObject)pph_question.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        pph_variable_handling.pph_update_var_type(var, old_var_type);
        return Values.values(use_whoP, include_non_personsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 67696L)
    public static SubLObject pph_use_when_for_phraseP(final SubLObject phrase) {
        return pph_temporal_location_var_phraseP(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 67895L)
    public static SubLObject string_for_var_in_question_phrase(final SubLObject phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = (SubLObject)pph_question.NIL;
        final SubLObject pred = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != question_var_npP(phrase)) {
            final SubLObject var = el_var_np_var(phrase);
            final SubLObject explicitly_arg_type_query_varsP = (SubLObject)pph_question.NIL;
            if (pph_question.NIL != explicitly_arg_type_query_varsP) {
                pph_methods_formulas.maybe_register_var_by_arg_constraints(var, formula);
            }
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str155$in_STRING_FOR_VAR_IN_QUESTION_PHR, var, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            if (pph_question.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_question.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_question.T, (SubLObject)pph_question.$str156$pph_var_type_for__S___S__, var, pph_variable_handling.pph_var_type(var), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
            }
            thread.resetMultipleValues();
            final SubLObject use_whoP = pph_use_who_for_var_in_formulaP(var, formula);
            final SubLObject include_non_personsP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_question.NIL != use_whoP) {
                pph_phrase_set_who_or_whom(phrase, include_non_personsP);
                olist = pph_phrase.pph_phrase_output_list(phrase);
            }
            else {
                if (pph_question.NIL != number_varP(var, formula) && pph_question.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                    final SubLObject number_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_question.ZERO_INTEGER);
                    pph_phrase.pph_phrase_set_string(number_dtr, (SubLObject)pph_question.$str157$how_many);
                    return phrase;
                }
                if (pph_question.NIL != pph_methods.pph_var_ok_for_lexifyingP(var, (SubLObject)pph_question.NIL) && pph_question.NIL == pph_variable_handling.pph_var_registered_as_defaultP(var)) {
                    final SubLObject single_valueP = pph_single_entry_varP(var, formula);
                    final SubLObject phrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                    final SubLObject agr_pred = (pph_question.NIL != phrase_pred && (pph_question.NIL != pph_utilities.pph_genl_pos_predP(phrase_pred, pph_question.$const158$nonPlural_Generic, (SubLObject)pph_question.UNPROVIDED) || pph_question.NIL != pph_utilities.pph_genl_pos_predP(phrase_pred, pph_question.$const159$nonSingular_Generic, (SubLObject)pph_question.UNPROVIDED))) ? phrase_pred : ((pph_question.NIL != single_valueP) ? pph_question.$const158$nonPlural_Generic : pph_question.$const159$nonSingular_Generic);
                    pph_phrase.pph_phrase_copy(pph_methods.pph_lexify_var(var, (SubLObject)pph_question.$kw160$WHAT, pph_question.$const161$NounPhrase, agr_pred, pph_phrase.pph_phrase_arg_position_map(phrase), (SubLObject)pph_question.UNPROVIDED), phrase, (SubLObject)pph_question.UNPROVIDED);
                }
                else {
                    pph_phrase.pph_phrase_set_string(phrase, (SubLObject)pph_question.$str162$what);
                    olist = pph_phrase.pph_phrase_output_list(phrase);
                }
            }
            if (pph_question.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_question.UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
            pph_phrase.pph_phrase_set_agr_pred_unless_nil(phrase, pred);
        }
        else if (pph_question.NIL != pph_use_when_for_phraseP(phrase)) {
            pph_phrase.pph_phrase_copy(pph_new_when_phrase_from_phrase(phrase), phrase, (SubLObject)pph_question.UNPROVIDED);
            olist = pph_phrase.pph_phrase_output_list(phrase);
        }
        return Values.values(olist, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 69985L)
    public static SubLObject pph_use_whomP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(pph_vars.$pph_use_whomP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 70197L)
    public static SubLObject pph_use_whom_for_phraseP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_use_whomP() && pph_question.$kw163$ACCUSATIVE == pph_phrase.pph_phrase_case(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 70383L)
    public static SubLObject pph_phrase_set_who_or_whom(final SubLObject phrase, SubLObject include_non_personsP) {
        if (include_non_personsP == pph_question.UNPROVIDED) {
            include_non_personsP = (SubLObject)pph_question.NIL;
        }
        SubLObject who_string = (SubLObject)((pph_question.NIL != pph_use_whom_for_phraseP(phrase)) ? pph_question.$str164$whom : pph_question.$str165$who);
        if (pph_question.NIL != include_non_personsP) {
            who_string = Sequences.cconcatenate(who_string, (SubLObject)pph_question.$str166$_or_what);
        }
        pph_phrase.pph_phrase_set_string(phrase, who_string);
        return pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 70783L)
    public static SubLObject pph_new_when_phrase_from_phrase(final SubLObject phrase) {
        final SubLObject var_dtr = pph_find_temporal_location_var_dtr(phrase);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(var_dtr);
        final SubLObject var = pph_phrase.pph_phrase_cycl(var_dtr, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject new_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(var, map, (SubLObject)pph_question.UNPROVIDED), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        pph_phrase.pph_phrase_set_string(new_phrase, (SubLObject)pph_question.$str167$when);
        return new_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 71186L)
    public static SubLObject pph_find_temporal_location_var_dtr(final SubLObject phrase) {
        if (pph_question.NIL != pph_temporal_location_var_phraseP(phrase)) {
            SubLObject dtr_num = (SubLObject)pph_question.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)pph_question.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject grand_dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_question.NIL, v_iteration = (SubLObject)pph_question.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_question.ONE_INTEGER)) {
                    element_num = ((pph_question.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_question.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_question.NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_question.UNPROVIDED))) {
                        return dtr;
                    }
                    if (pph_question.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                        grand_dtr = pph_find_temporal_location_var_dtr(dtr);
                        if (pph_question.NIL != grand_dtr) {
                            return grand_dtr;
                        }
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_question.ONE_INTEGER);
                }
            }
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 71720L)
    public static SubLObject pph_single_entry_varP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_position = Sequences.position(var, formula, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        final SubLObject single_entryP = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != kb_accessors.arg_n_single_entry_formatP(pred, var_position, pph_vars.$pph_domain_mt$.getDynamicValue(thread)) || pph_question.NIL != pph_disjoint_meta_isa_formulaP(var, formula));
        return single_entryP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 72085L)
    public static SubLObject pph_disjoint_meta_isa_formulaP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_question.NIL;
        if (pph_question.NIL != formula_pattern_match.formula_matches_pattern(formula, (SubLObject)ConsesLow.list(pph_question.$const168$isa, (SubLObject)pph_question.$kw169$ANYTHING, var))) {
            final SubLObject var_type = pph_variable_handling.pph_var_type(var);
            if (pph_question.NIL != cycl_utilities.reified_term_p(var_type) && pph_question.NIL == ans) {
                SubLObject node_var = var_type;
                final SubLObject deck_type = (SubLObject)pph_question.$kw172$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$121 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = pph_question.$const173$True_JustificationTruth;
                            final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$123 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((pph_question.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_question.NIL != tv_var) ? pph_question.$sym174$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (pph_question.NIL != tv_var && pph_question.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_question.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)pph_question.$kw114$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)pph_question.ONE_INTEGER, (SubLObject)pph_question.$str175$_A_is_not_a__A, tv_var, (SubLObject)pph_question.$sym176$SBHL_TRUE_TV_P, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_question.$kw177$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)pph_question.ONE_INTEGER, (SubLObject)pph_question.$str178$continue_anyway, (SubLObject)pph_question.$str175$_A_is_not_a__A, tv_var, (SubLObject)pph_question.$sym176$SBHL_TRUE_TV_P, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_question.$kw179$WARN)) {
                                        Errors.warn((SubLObject)pph_question.$str175$_A_is_not_a__A, tv_var, (SubLObject)pph_question.$sym176$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)pph_question.$str180$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)pph_question.$str178$continue_anyway, (SubLObject)pph_question.$str175$_A_is_not_a__A, tv_var, (SubLObject)pph_question.$sym176$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$124 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$126 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pph_question.$const181$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pph_question.$const181$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pph_question.$const181$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_question.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_question.$const181$genls), thread);
                                    if (pph_question.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_question.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(var_type, sbhl_module_vars.get_sbhl_module((SubLObject)pph_question.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$124 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$125 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$127 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(pph_question.$const181$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_question.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)pph_question.UNPROVIDED);
                                            while (pph_question.NIL != node_var && pph_question.NIL == ans) {
                                                final SubLObject genl = node_var;
                                                ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_question.NIL != pph_utilities.pph_isaP(genl, pph_question.$const182$FacetingCollectionType, (SubLObject)pph_question.UNPROVIDED) || pph_question.NIL != pph_utilities.pph_isaP(genl, pph_question.$const183$DisjointCollectionType, (SubLObject)pph_question.UNPROVIDED));
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_question.$const181$genls));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$125;
                                                SubLObject _prev_bind_1_$126;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$126;
                                                SubLObject iteration_state_$133;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$127;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$135;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$128;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)pph_question.NIL, rest = accessible_modules; pph_question.NIL == ans && pph_question.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$125 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$126 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_question.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_question.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var);
                                                        if (pph_question.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_question.UNPROVIDED));
                                                            if (pph_question.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_question.UNPROVIDED));
                                                                if (pph_question.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_question.NIL == ans && pph_question.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_question.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$126 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$133 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_question.NIL == ans && pph_question.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$133); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next(iteration_state_$133)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$133);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_question.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (pph_question.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_question.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_question.NIL == ans && pph_question.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (pph_question.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && pph_question.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_question.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_question.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (pph_question.NIL == ans) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)pph_question.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (pph_question.NIL == ans && pph_question.NIL != csome_list_var) {
                                                                                                        if (pph_question.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_question.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_question.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_question.$str184$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$127, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$133);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$126, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_question.FIVE_INTEGER, (SubLObject)pph_question.$str185$attempting_to_bind_direction_link, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_question.NIL != obsolete.cnat_p(node, (SubLObject)pph_question.UNPROVIDED)) {
                                                            new_list = ((pph_question.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_question.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_question.UNPROVIDED)));
                                                            for (rest_$135 = (SubLObject)pph_question.NIL, rest_$135 = new_list; pph_question.NIL == ans && pph_question.NIL != rest_$135; rest_$135 = rest_$135.rest()) {
                                                                generating_fn = rest_$135.first();
                                                                _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (pph_question.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_question.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_question.NIL == ans && pph_question.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (pph_question.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && pph_question.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_question.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_question.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (pph_question.NIL == ans) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)pph_question.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (pph_question.NIL == ans && pph_question.NIL != csome_list_var2) {
                                                                                if (pph_question.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_question.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_question.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_question.$str184$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$128, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$126, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$125, thread);
                                                    }
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$127, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$125, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$124, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)pph_question.TWO_INTEGER, (SubLObject)pph_question.$str186$Node__a_does_not_pass_sbhl_type_t, var_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_question.UNPROVIDED)), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$126, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$124, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$123, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$123, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$122, thread);
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$121, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_question.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 72699L)
    public static SubLObject pph_phrase_subject_head_verb_initialP(final SubLObject phrase) {
        if (pph_phrase.pph_phrase_dtr_count(phrase).numG((SubLObject)pph_question.ONE_INTEGER) && pph_phrase.pph_phrase_head_dtr_num(phrase).eql((SubLObject)pph_question.ONE_INTEGER) && pph_question.NIL != pph_phrase.pph_phrase_head_verbP(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_question.ONE_INTEGER))) {
            return (SubLObject)pph_question.T;
        }
        if (pph_question.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_question.NIL;
        }
        if (pph_question.NIL != pph_phrase_subject_head_verb_initialP(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_question.ZERO_INTEGER))) {
            return (SubLObject)pph_question.T;
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73232L)
    public static SubLObject clear_modal_strings() {
        final SubLObject cs = pph_question.$modal_strings_caching_state$.getGlobalValue();
        if (pph_question.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73232L)
    public static SubLObject remove_modal_strings() {
        return memoization_state.caching_state_remove_function_results_with_args(pph_question.$modal_strings_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pph_question.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73232L)
    public static SubLObject modal_strings_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = (SubLObject)pph_question.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            strings = kb_mapping_utilities.pred_values(pph_question.$const188$Modal, pph_question.$const189$partOfSpeech, (SubLObject)pph_question.TWO_INTEGER, (SubLObject)pph_question.THREE_INTEGER, (SubLObject)pph_question.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73232L)
    public static SubLObject modal_strings() {
        SubLObject caching_state = pph_question.$modal_strings_caching_state$.getGlobalValue();
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_question.$sym187$MODAL_STRINGS, (SubLObject)pph_question.$sym190$_MODAL_STRINGS_CACHING_STATE_, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQL, (SubLObject)pph_question.ZERO_INTEGER, (SubLObject)pph_question.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)pph_question.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(modal_strings_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)pph_question.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73421L)
    public static SubLObject clear_modal_words() {
        final SubLObject cs = pph_question.$modal_words_caching_state$.getGlobalValue();
        if (pph_question.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73421L)
    public static SubLObject remove_modal_words() {
        return memoization_state.caching_state_remove_function_results_with_args(pph_question.$modal_words_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pph_question.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)pph_question.UNPROVIDED, (SubLObject)pph_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73421L)
    public static SubLObject modal_words_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject words = (SubLObject)pph_question.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            words = kb_mapping_utilities.pred_values(pph_question.$const188$Modal, pph_question.$const189$partOfSpeech, (SubLObject)pph_question.TWO_INTEGER, (SubLObject)pph_question.ONE_INTEGER, (SubLObject)pph_question.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-question.lisp", position = 73421L)
    public static SubLObject modal_words() {
        SubLObject caching_state = pph_question.$modal_words_caching_state$.getGlobalValue();
        if (pph_question.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_question.$sym191$MODAL_WORDS, (SubLObject)pph_question.$sym192$_MODAL_WORDS_CACHING_STATE_, (SubLObject)pph_question.NIL, (SubLObject)pph_question.EQL, (SubLObject)pph_question.ZERO_INTEGER, (SubLObject)pph_question.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)pph_question.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(modal_words_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)pph_question.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_pph_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_question", "GENERATE-QUESTION", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_standardize_query_sentence", "PPH-STANDARDIZE-QUERY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_standardize_query_term", "PPH-STANDARDIZE-QUERY-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_default_question_preds", "PPH-DEFAULT-QUESTION-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_clause", "PPH-QUESTION-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_clause_memoized_internal", "PPH-QUESTION-CLAUSE-MEMOIZED-INTERNAL", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_clause_memoized", "PPH-QUESTION-CLAUSE-MEMOIZED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_remove_hypothetical", "PPH-REMOVE-HYPOTHETICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_hypothesize_antecedent_varsP", "PPH-HYPOTHESIZE-ANTECEDENT-VARS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_register_hypothetical_vars", "PPH-QUESTION-REGISTER-HYPOTHETICAL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_add_hypothetical_paraphrase", "PPH-ADD-HYPOTHETICAL-PARAPHRASE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_question_non_propositional", "GENERATE-QUESTION-NON-PROPOSITIONAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "question_paraphrase_availableP", "QUESTION-PARAPHRASE-AVAILABLE?", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "clear_past_tense_formP", "CLEAR-PAST-TENSE-FORM?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "remove_past_tense_formP", "REMOVE-PAST-TENSE-FORM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "past_tense_formP_internal", "PAST-TENSE-FORM?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "past_tense_formP", "PAST-TENSE-FORM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "prefer_past_tense_formP", "PREFER-PAST-TENSE-FORM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_question_from_genquestion", "GENERATE-QUESTION-FROM-GENQUESTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_arg", "PPH-QUESTION-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "get_genquestion_formula", "GET-GENQUESTION-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "get_genq_bindings", "GET-GENQ-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_blank_count", "PPH-BLANK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_question_from_query_template", "GENERATE-QUESTION-FROM-QUERY-TEMPLATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_phrase_ok_for_gtqsP", "PPH-PHRASE-OK-FOR-GTQS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "clear_gen_template_query_sentence_index", "CLEAR-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "add_gen_template_query_sentence", "ADD-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "remove_gen_template_query_sentence", "REMOVE-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "initialize_gen_template_query_sentence_index", "INITIALIZE-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gen_template_query_sentence_lookup", "GEN-TEMPLATE-QUERY-SENTENCE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_visible_lexical_assertionP", "PPH-VISIBLE-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gen_template_query_sentence_candidates", "GEN-TEMPLATE-QUERY-SENTENCE-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_assertions_for_query_sentence", "GTQS-ASSERTIONS-FOR-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_assertion_constant_count", "GTQS-ASSERTION-CONSTANT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_assertion_matches_query_sentenceP", "GTQS-ASSERTION-MATCHES-QUERY-SENTENCE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_assertion_bindings_for_query_sentence_internal", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_assertion_bindings_for_query_sentence", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "hlify_gtqs_template_variables", "HLIFY-GTQS-TEMPLATE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "non_hypothesized_el_varP", "NON-HYPOTHESIZED-EL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_bindings_from_unification_bindings", "GTQS-BINDINGS-FROM-UNIFICATION-BINDINGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_one_arg_position", "GTQS-ONE-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "gtqs_specified_arg_matchesP", "GTQS-SPECIFIED-ARG-MATCHES?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_query_sentence_template_keywords", "PPH-QUERY-SENTENCE-TEMPLATE-KEYWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_query_sentence_template_vars", "PPH-QUERY-SENTENCE-TEMPLATE-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_template_unify", "PPH-QUESTION-TEMPLATE-UNIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_hide_el_vars", "PPH-HIDE-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unhide_el_vars", "PPH-UNHIDE-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_possible_formula", "PPH-UNIFY-POSSIBLE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_possible_args", "PPH-UNIFY-POSSIBLE-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_check_recursion_depth", "PPH-UNIFY-CHECK-RECURSION-DEPTH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_commutative_functor_p", "PPH-COMMUTATIVE-FUNCTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_gtqs", "PPH-UNIFY-GTQS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_formula_template", "PPH-UNIFY-FORMULA-TEMPLATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_formula_template_memoized_internal", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_formula_template_memoized", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "unification_bindings_from_result", "UNIFICATION-BINDINGS-FROM-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_args", "PPH-UNIFY-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_args_memoized_internal", "PPH-UNIFY-ARGS-MEMOIZED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_args_memoized", "PPH-UNIFY-ARGS-MEMOIZED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_ordered_args", "PPH-UNIFY-ORDERED-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_unify_args_permutations", "PPH-UNIFY-ARGS-PERMUTATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_arglist_permutations", "PPH-ARGLIST-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_phrase_for_query_sentence_from_gtqs_as", "PPH-PHRASE-FOR-QUERY-SENTENCE-FROM-GTQS-AS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "replace_gtqs_template_terms", "REPLACE-GTQS-TEMPLATE-TERMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "dummy_query_sentence_for_gtqs_assertion", "DUMMY-QUERY-SENTENCE-FOR-GTQS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "verify_all_gtqs_assertions", "VERIFY-ALL-GTQS-ASSERTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "verify_one_gtqs_assertion", "VERIFY-ONE-GTQS-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "verify_one_gtqs_assertion_with_query_sentence", "VERIFY-ONE-GTQS-ASSERTION-WITH-QUERY-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_question_bf", "GENERATE-QUESTION-BF", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_yes_no_preamble_strings", "PPH-BRUTE-FORCE-YES-NO-PREAMBLE-STRINGS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_true_or_false_string", "PPH-BRUTE-FORCE-TRUE-OR-FALSE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_false_string", "PPH-BRUTE-FORCE-FALSE-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_capitalize_false_string_p", "PPH-BRUTE-FORCE-CAPITALIZE-FALSE-STRING-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_wh_preamble_olist", "PPH-BRUTE-FORCE-WH-PREAMBLE-OLIST", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_wh_phrase_olist", "PPH-BRUTE-FORCE-WH-PHRASE-OLIST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "new_pph_phrase_filler_item", "NEW-PPH-PHRASE-FILLER-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "new_pph_phrase_filler_items", "NEW-PPH-PHRASE-FILLER-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_olist_set_arg_positions", "PPH-BRUTE-FORCE-OLIST-SET-ARG-POSITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_brute_force_wh_lexify_query_varsP", "PPH-BRUTE-FORCE-WH-LEXIFY-QUERY-VARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_question_declarative_string", "PPH-QUESTION-DECLARATIVE-STRING", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_remove_redundant_query_var_typing_clauses", "PPH-REMOVE-REDUNDANT-QUERY-VAR-TYPING-CLAUSES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "question_rop_formulaP", "QUESTION-ROP-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "rop_formulaP", "ROP-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "question_var_npP", "QUESTION-VAR-NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_phrase_maybe_npP", "PPH-PHRASE-MAYBE-NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "el_var_det_nbarP", "EL-VAR-DET-NBAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "el_var_np_var", "EL-VAR-NP-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "number_varP", "NUMBER-VAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "no_number_varsP", "NO-NUMBER-VARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "formula_ok_for_subj_aux_inversionP", "FORMULA-OK-FOR-SUBJ-AUX-INVERSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "rmp_formula_to_intermediate_cycl", "RMP-FORMULA-TO-INTERMEDIATE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "op_ok_for_i_cyclP", "OP-OK-FOR-I-CYCL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "remove_var_typing_clauses_from_question_phrase", "REMOVE-VAR-TYPING-CLAUSES-FROM-QUESTION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_with_subj_aux_inversion", "GENERATE-WITH-SUBJ-AUX-INVERSION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "generate_phrase_with_subj_aux_inversion", "GENERATE-PHRASE-WITH-SUBJ-AUX-INVERSION", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "find_head_clause", "FIND-HEAD-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "make_question_template", "MAKE-QUESTION-TEMPLATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_phrase_add_do_supportXinvert", "PPH-PHRASE-ADD-DO-SUPPORT&INVERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "make_multi_word_perfect_verb", "MAKE-MULTI-WORD-PERFECT-VERB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "question_phraseP", "QUESTION-PHRASE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_temporal_location_var_phraseP", "PPH-TEMPORAL-LOCATION-VAR-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "find_question_subphrase", "FIND-QUESTION-SUBPHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "find_question_subphrase_int", "FIND-QUESTION-SUBPHRASE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_subphrase_path_p", "PPH-SUBPHRASE-PATH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_use_who_for_var_in_formulaP", "PPH-USE-WHO-FOR-VAR-IN-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_use_when_for_phraseP", "PPH-USE-WHEN-FOR-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "string_for_var_in_question_phrase", "STRING-FOR-VAR-IN-QUESTION-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_use_whomP", "PPH-USE-WHOM?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_use_whom_for_phraseP", "PPH-USE-WHOM-FOR-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_phrase_set_who_or_whom", "PPH-PHRASE-SET-WHO-OR-WHOM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_new_when_phrase_from_phrase", "PPH-NEW-WHEN-PHRASE-FROM-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_find_temporal_location_var_dtr", "PPH-FIND-TEMPORAL-LOCATION-VAR-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_single_entry_varP", "PPH-SINGLE-ENTRY-VAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_disjoint_meta_isa_formulaP", "PPH-DISJOINT-META-ISA-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "pph_phrase_subject_head_verb_initialP", "PPH-PHRASE-SUBJECT-HEAD-VERB-INITIAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "clear_modal_strings", "CLEAR-MODAL-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "remove_modal_strings", "REMOVE-MODAL-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "modal_strings_internal", "MODAL-STRINGS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "modal_strings", "MODAL-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "clear_modal_words", "CLEAR-MODAL-WORDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "remove_modal_words", "REMOVE-MODAL-WORDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "modal_words_internal", "MODAL-WORDS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_question", "modal_words", "MODAL-WORDS", 0, 0, false);
        return (SubLObject)pph_question.NIL;
    }
    
    public static SubLObject init_pph_question_file() {
        pph_question.$pph_default_question_preds$ = SubLFiles.deflexical("*PPH-DEFAULT-QUESTION-PREDS*", (SubLObject)pph_question.$list11);
        pph_question.$past_tense_formP_caching_state$ = SubLFiles.deflexical("*PAST-TENSE-FORM?-CACHING-STATE*", (SubLObject)pph_question.NIL);
        pph_question.$pph_use_gtqsP$ = SubLFiles.defparameter("*PPH-USE-GTQS?*", (SubLObject)pph_question.T);
        pph_question.$gen_template_query_sentence_index$ = SubLFiles.deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX*", (SubLObject)pph_question.$kw41$UNINITIALIZED);
        pph_question.$gen_template_query_sentence_index_lock$ = SubLFiles.deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX-LOCK*", Locks.make_lock((SubLObject)pph_question.$str42$genTemplate_QuerySentence_index));
        pph_question.$pph_unify_try_arg_permutationsP$ = SubLFiles.defparameter("*PPH-UNIFY-TRY-ARG-PERMUTATIONS?*", (SubLObject)pph_question.NIL);
        pph_question.$pph_unify_recursion_limit$ = SubLFiles.deflexical("*PPH-UNIFY-RECURSION-LIMIT*", (SubLObject)pph_question.$int69$40);
        pph_question.$pph_unify_recursion_depth$ = SubLFiles.defparameter("*PPH-UNIFY-RECURSION-DEPTH*", (SubLObject)pph_question.ZERO_INTEGER);
        pph_question.$pph_arglist_permutations_max_arity$ = SubLFiles.deflexical("*PPH-ARGLIST-PERMUTATIONS-MAX-ARITY*", (SubLObject)pph_question.SEVEN_INTEGER);
        pph_question.$modal_strings_caching_state$ = SubLFiles.deflexical("*MODAL-STRINGS-CACHING-STATE*", (SubLObject)pph_question.NIL);
        pph_question.$modal_words_caching_state$ = SubLFiles.deflexical("*MODAL-WORDS-CACHING-STATE*", (SubLObject)pph_question.NIL);
        return (SubLObject)pph_question.NIL;
    }
    
    public static SubLObject setup_pph_question_file() {
        memoization_state.note_memoized_function((SubLObject)pph_question.$sym12$PPH_QUESTION_CLAUSE_MEMOIZED);
        memoization_state.note_globally_cached_function((SubLObject)pph_question.$sym30$PAST_TENSE_FORM_);
        utilities_macros.register_kb_function((SubLObject)pph_question.$sym43$ADD_GEN_TEMPLATE_QUERY_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)pph_question.$sym44$REMOVE_GEN_TEMPLATE_QUERY_SENTENCE);
        memoization_state.note_memoized_function((SubLObject)pph_question.$sym54$GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_question.$sym67$PPH_UNIFY_POSSIBLE_FORMULA);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_question.$sym68$PPH_UNIFY_POSSIBLE_ARGS);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_question.$sym71$PPH_UNIFY_FORMULA_TEMPLATE);
        memoization_state.note_memoized_function((SubLObject)pph_question.$sym72$PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)pph_question.$sym76$PPH_UNIFY_ARGS_MEMOIZED);
        memoization_state.note_globally_cached_function((SubLObject)pph_question.$sym187$MODAL_STRINGS);
        memoization_state.note_globally_cached_function((SubLObject)pph_question.$sym191$MODAL_WORDS);
        return (SubLObject)pph_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_question_file();
    }
    
    static {
        me = (SubLFile)new pph_question();
        pph_question.$pph_default_question_preds$ = null;
        pph_question.$past_tense_formP_caching_state$ = null;
        pph_question.$pph_use_gtqsP$ = null;
        pph_question.$gen_template_query_sentence_index$ = null;
        pph_question.$gen_template_query_sentence_index_lock$ = null;
        pph_question.$pph_unify_try_arg_permutationsP$ = null;
        pph_question.$pph_unify_recursion_limit$ = null;
        pph_question.$pph_unify_recursion_depth$ = null;
        pph_question.$pph_arglist_permutations_max_arity$ = null;
        pph_question.$modal_strings_caching_state$ = null;
        pph_question.$modal_words_caching_state$ = null;
        $kw0$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw1$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym2$VALID_EXTERNAL_PPH_NL_PREDS_ = SubLObjectFactory.makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?");
        $kw3$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw4$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $kw5$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym6$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str7$___Top_level_CycL___S = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $sym8$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P");
        $sym9$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym10$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed")));
        $sym12$PPH_QUESTION_CLAUSE_MEMOIZED = SubLObjectFactory.makeSymbol("PPH-QUESTION-CLAUSE-MEMOIZED");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION-FROM-GENQUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-WITH-SUBJ-AUX-INVERSION"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION-BF"));
        $kw14$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION-BF"));
        $sym16$GENERATE_QUESTION_FROM_QUERY_TEMPLATE = SubLObjectFactory.makeSymbol("GENERATE-QUESTION-FROM-QUERY-TEMPLATE");
        $str17$__Entering_PPH_POSSIBLY_BINDING_V = SubLObjectFactory.makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");
        $str18$Failed_to_paraphrase__givens____S = SubLObjectFactory.makeString("Failed to paraphrase 'givens': ~S");
        $str19$__Leaving_PPH_POSSIBLY_BINDING_VA = SubLObjectFactory.makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");
        $str20$______and__pph_var_types__are_now = SubLObjectFactory.makeString("~&... and *pph-var-types* are now ~S~%");
        $const21$tensed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"));
        $sym22$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw23$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $kw24$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $kw25$EXISTENTIAL = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $str26$if = SubLObjectFactory.makeString("if");
        $list27 = ConsesLow.list((SubLObject)pph_question.ZERO_INTEGER);
        $const28$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION-FROM-GENQUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-WITH-SUBJ-AUX-INVERSION"));
        $sym30$PAST_TENSE_FORM_ = SubLObjectFactory.makeSymbol("PAST-TENSE-FORM?");
        $const31$pastTense_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastTense-Generic"));
        $sym32$_PAST_TENSE_FORM__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PAST-TENSE-FORM?-CACHING-STATE*");
        $kw33$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const34$genQuestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genQuestion"));
        $kw35$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw36$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str37$__Trying____S = SubLObjectFactory.makeString("~&Trying~% ~S");
        $str38$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str39$__ = SubLObjectFactory.makeString(") ");
        $str40$Done__S_alternatives_of__S = SubLObjectFactory.makeString("Done ~S alternatives of ~S");
        $kw41$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str42$genTemplate_QuerySentence_index = SubLObjectFactory.makeString("genTemplate-QuerySentence index");
        $sym43$ADD_GEN_TEMPLATE_QUERY_SENTENCE = SubLObjectFactory.makeSymbol("ADD-GEN-TEMPLATE-QUERY-SENTENCE");
        $sym44$REMOVE_GEN_TEMPLATE_QUERY_SENTENCE = SubLObjectFactory.makeSymbol("REMOVE-GEN-TEMPLATE-QUERY-SENTENCE");
        $sym45$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const46$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const47$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $sym48$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym49$PPH_VISIBLE_LEXICAL_ASSERTION_ = SubLObjectFactory.makeSymbol("PPH-VISIBLE-LEXICAL-ASSERTION?");
        $sym50$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym51$_ = SubLObjectFactory.makeSymbol(">");
        $sym52$GTQS_ASSERTION_CONSTANT_COUNT = SubLObjectFactory.makeSymbol("GTQS-ASSERTION-CONSTANT-COUNT");
        $sym53$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym54$GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE = SubLObjectFactory.makeSymbol("GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE");
        $str55$unexpected_result_from__UNIFY__S_ = SubLObjectFactory.makeString("unexpected result from (UNIFY ~S ~S):~% ~S~%");
        $sym56$PPH_ARG_POSITION_SPECIFIER_ = SubLObjectFactory.makeSymbol("PPH-ARG-POSITION-SPECIFIER?");
        $list57 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-TERM"));
        $str58$Failed_to_match__S_to_var_in_sent = SubLObjectFactory.makeString("Failed to match ~S to var in sentence. Got ~S~%");
        $str59$Failed_to_match__S_to_var_in_temp = SubLObjectFactory.makeString("Failed to match ~S to var in template Got ~S~%");
        $str60$Couldn_t_get_arg_position_for__S_ = SubLObjectFactory.makeString("Couldn't get arg position for ~S in ~S");
        $str61$_S_doesn_t_match__S_of__S = SubLObjectFactory.makeString("~S doesn't match ~S of ~S");
        $sym62$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym63$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym64$EL_VAR_NAME = SubLObjectFactory.makeSymbol("EL-VAR-NAME");
        $sym65$EL_VAR_NAME_ = SubLObjectFactory.makeSymbol("EL-VAR-NAME?");
        $sym66$MAKE_EL_VAR = SubLObjectFactory.makeSymbol("MAKE-EL-VAR");
        $sym67$PPH_UNIFY_POSSIBLE_FORMULA = SubLObjectFactory.makeSymbol("PPH-UNIFY-POSSIBLE-FORMULA");
        $sym68$PPH_UNIFY_POSSIBLE_ARGS = SubLObjectFactory.makeSymbol("PPH-UNIFY-POSSIBLE-ARGS");
        $int69$40 = SubLObjectFactory.makeInteger(40);
        $str70$Exceeded_PPH_unify_recursion_dept = SubLObjectFactory.makeString("Exceeded PPH unify recursion depth of ~S.~%");
        $sym71$PPH_UNIFY_FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("PPH-UNIFY-FORMULA-TEMPLATE");
        $sym72$PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED = SubLObjectFactory.makeSymbol("PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED");
        $str73$Not_in_unify_multiple_mode_ = SubLObjectFactory.makeString("Not in unify-multiple mode.");
        $str74$Couldn_t_unify____S____S______giv = SubLObjectFactory.makeString("Couldn't unify~% ~S~% ~S~% ...given ~S~%");
        $str75$Found_multiple_bindings_for____S_ = SubLObjectFactory.makeString("Found multiple bindings for~% ~S~% ~S ...given ~S~% ~S~%");
        $sym76$PPH_UNIFY_ARGS_MEMOIZED = SubLObjectFactory.makeSymbol("PPH-UNIFY-ARGS-MEMOIZED");
        $str77$Skipping_permutations_for_templat = SubLObjectFactory.makeString("Skipping permutations for template of length ~D ~% ~S~% ~S");
        $str78$Lost_assumed_bindings________S__ = SubLObjectFactory.makeString("Lost assumed bindings(?).~% ~S~%");
        $str79$__GTQS_Bindings___S___Map___S = SubLObjectFactory.makeString("~%GTQS Bindings: ~S~% Map: ~S");
        $list80 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ARG-POSITION"));
        $str81$GTQS__Couldn_t_find__S_in____S__ = SubLObjectFactory.makeString("GTQS: Couldn't find ~S in~% ~S~%");
        $str82$__GTQS__Replacing__S_with__S__S__ = SubLObjectFactory.makeString("~&GTQS: Replacing ~S with ~S ~S~%");
        $str83$GTQS__Couldn_t_replace__S_for__S_ = SubLObjectFactory.makeString("GTQS: Couldn't replace ~S for ~S in ~S");
        $const84$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const85$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $str86$example = SubLObjectFactory.makeString("example");
        $int87$30 = SubLObjectFactory.makeInteger(30);
        $str88$Checking___genTemplate_QuerySente = SubLObjectFactory.makeString("Checking #$genTemplate-QuerySentence assertions...");
        $str89$__Matched__S_of__S___genTemplate_ = SubLObjectFactory.makeString("~&Matched ~S of ~S #$genTemplate-QuerySentence assertions.~% Time: ~S seconds.~%");
        $str90$Timed_out_after__S_seconds_on____ = SubLObjectFactory.makeString("Timed out after ~S seconds on~% ~S");
        $str91$Didn_t_find_gtqs_in_matches_____S = SubLObjectFactory.makeString("Didn't find gtqs in matches:~% ~S~%");
        $sym92$PPH_QUERY_VAR_P = SubLObjectFactory.makeSymbol("PPH-QUERY-VAR-P");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLANKS"), (SubLObject)SubLObjectFactory.makeKeyword("VARS"));
        $kw94$BLANKS = SubLObjectFactory.makeKeyword("BLANKS");
        $kw95$VARS = SubLObjectFactory.makeKeyword("VARS");
        $sym96$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $const97$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $str98$was_ = SubLObjectFactory.makeString("was ");
        $str99$is_ = SubLObjectFactory.makeString("is ");
        $str100$it_ = SubLObjectFactory.makeString("it ");
        $str101$that = SubLObjectFactory.makeString("that");
        $str102$true = SubLObjectFactory.makeString("true");
        $str103$FALSE = SubLObjectFactory.makeString("FALSE");
        $str104$false = SubLObjectFactory.makeString("false");
        $str105$were = SubLObjectFactory.makeString("were");
        $str106$are = SubLObjectFactory.makeString("are");
        $str107$_there_such_that = SubLObjectFactory.makeString(" there such that");
        $list108 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $kw109$AND = SubLObjectFactory.makeKeyword("AND");
        $str110$what_values_of = SubLObjectFactory.makeString("what values of");
        $str111$__Setting_arg_position_of__S_to__ = SubLObjectFactory.makeString("~&Setting arg-position of ~S to ~S from ~S.~%");
        $sym112$PPH_VAR_REGISTERED_AS_DEFAULT_ = SubLObjectFactory.makeSymbol("PPH-VAR-REGISTERED-AS-DEFAULT?");
        $sym113$PPH_EXCEPTIONAL_VAR_P = SubLObjectFactory.makeSymbol("PPH-EXCEPTIONAL-VAR-P");
        $kw114$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $const115$WHWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHWord"));
        $const116$AuxVerb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AuxVerb"));
        $sym117$QUESTION_ROP_FORMULA_ = SubLObjectFactory.makeSymbol("QUESTION-ROP-FORMULA?");
        $const118$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $const119$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $const120$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $sym121$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $const122$Integer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"));
        $sym123$PPH_SPEC_ = SubLObjectFactory.makeSymbol("PPH-SPEC?");
        $str124$___S_determined_to_be_a_number_va = SubLObjectFactory.makeString("~&~S determined to be a number var in ~S~%");
        $str125$No_number_vars_in__S__ = SubLObjectFactory.makeString("No number vars in ~S~%");
        $str126$__Trying_to_generate__S_using_sub = SubLObjectFactory.makeString("~&Trying to generate ~S using subject-auxiliary inversion.~%");
        $str127$__Made_question_template__S = SubLObjectFactory.makeString("~&Made question template ~S");
        $str128$_X_such_that = SubLObjectFactory.makeString("?X such that");
        $str129$in_generate_phrase_with_subj_aux_ = SubLObjectFactory.makeString("in generate-phrase-with-subj-aux-inversion string is ~S; trying again~%");
        $str130$__Not_subject_head_verb_initial__ = SubLObjectFactory.makeString("~&Not subject-head-verb-initial:~% ~S");
        $sym131$PPH_TENSE_PRED_ = SubLObjectFactory.makeSymbol("PPH-TENSE-PRED?");
        $const132$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $str133$__Couldn_t_find_question_subphras = SubLObjectFactory.makeString("~&Couldn't find question subphrase:~% ~S");
        $str134$__Subject_dtr_of__S_is_a_wh_phras = SubLObjectFactory.makeString("~&Subject dtr of ~S is a wh-phrase; returning template as is.~%");
        $str135$___S_has_no_head_verb__MAKE_QUEST = SubLObjectFactory.makeString("~&~S has no head verb; MAKE-QUESTION-TEMPLATE returning NIL.~%");
        $str136$__Head_dtr__S_is_a_copula__placin = SubLObjectFactory.makeString("~&Head dtr ~S is a copula; placing it in front of the subject.~%");
        $str137$__Head_dtr__S_is_an_auxiliary__pl = SubLObjectFactory.makeString("~&Head dtr ~S is an auxiliary; placing it in front of the subject.~%");
        $str138$___S_may_be_a_modal_verb__MAKE_QU = SubLObjectFactory.makeString("~&~S may be a modal verb; MAKE-QUESTION-TEMPLATE returning NIL~%");
        $str139$__Adding_do_support_to_template__ = SubLObjectFactory.makeString("~&Adding do support to template ~S");
        $str140$Fronting__S = SubLObjectFactory.makeString("Fronting ~S");
        $const141$Have_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Have-TheWord"));
        $const142$pastPerfect_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastPerfect-Generic"));
        $const143$presentTense_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentTense-Generic"));
        $str144$De_perfectiving_agr_from__S_to__S = SubLObjectFactory.makeString("De-perfectiving agr from ~S to ~S");
        $kw145$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $const146$perfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect"));
        $kw147$TEMPORAL_LOCATION = SubLObjectFactory.makeKeyword("TEMPORAL-LOCATION");
        $kw148$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym149$ROP_FORMULA_ = SubLObjectFactory.makeSymbol("ROP-FORMULA?");
        $str150$Found_question_phrase___S = SubLObjectFactory.makeString("Found question phrase: ~S");
        $kw151$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym152$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $const153$Agent_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $const154$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $str155$in_STRING_FOR_VAR_IN_QUESTION_PHR = SubLObjectFactory.makeString("in STRING-FOR-VAR-IN-QUESTION-PHRASE: var is ~S~%");
        $str156$pph_var_type_for__S___S__ = SubLObjectFactory.makeString("pph-var-type for ~S: ~S~%");
        $str157$how_many = SubLObjectFactory.makeString("how many");
        $const158$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $const159$nonSingular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $kw160$WHAT = SubLObjectFactory.makeKeyword("WHAT");
        $const161$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $str162$what = SubLObjectFactory.makeString("what");
        $kw163$ACCUSATIVE = SubLObjectFactory.makeKeyword("ACCUSATIVE");
        $str164$whom = SubLObjectFactory.makeString("whom");
        $str165$who = SubLObjectFactory.makeString("who");
        $str166$_or_what = SubLObjectFactory.makeString(" or what");
        $str167$when = SubLObjectFactory.makeString("when");
        $const168$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw169$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw170$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw171$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw172$STACK = SubLObjectFactory.makeKeyword("STACK");
        $const173$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym174$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $str175$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym176$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw177$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str178$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw179$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str180$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const181$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const182$FacetingCollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FacetingCollectionType"));
        $const183$DisjointCollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DisjointCollectionType"));
        $str184$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str185$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str186$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym187$MODAL_STRINGS = SubLObjectFactory.makeSymbol("MODAL-STRINGS");
        $const188$Modal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Modal"));
        $const189$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $sym190$_MODAL_STRINGS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MODAL-STRINGS-CACHING-STATE*");
        $sym191$MODAL_WORDS = SubLObjectFactory.makeSymbol("MODAL-WORDS");
        $sym192$_MODAL_WORDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MODAL-WORDS-CACHING-STATE*");
    }
}

/*

	Total time: 2379 ms
	
*/