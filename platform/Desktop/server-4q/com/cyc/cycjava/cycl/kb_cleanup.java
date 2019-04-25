package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_cleanup extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_cleanup";
    public static final String myFingerPrint = "c9a0937bc7640aaea2c05955e8a01229a3f872ebab0a9d81212b70702fb1e19a";
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 17481L)
    private static SubLSymbol $forget_old_creation_second_months$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 29762L)
    private static SubLSymbol $functor_narts_in_kb_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 30196L)
    private static SubLSymbol $functions_to_skip_for_fcp_sweep$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 35665L)
    public static SubLSymbol $known_arityless_relations$;
    private static final SubLString $str0$Forgetting_;
    private static final SubLString $str1$_ephemeral_terms;
    private static final SubLString $str2$cdolist;
    private static final SubLObject $const3$ephemeralTerm;
    private static final SubLSymbol $kw4$TRUE;
    private static final SubLObject $const5$inProgressTerm;
    private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const7$EverythingPSC;
    private static final SubLSymbol $kw8$GAF;
    private static final SubLSymbol $sym9$FORT_P;
    private static final SubLObject $const10$SkolemFunction;
    private static final SubLString $str11$forgetting_useless_NARTs;
    private static final SubLString $str12$Gathering_useless_NARTs;
    private static final SubLSymbol $sym13$STRINGP;
    private static final SubLSymbol $kw14$SKIP;
    private static final SubLSymbol $kw15$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym16$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str17$Forgetting_NART__S__;
    private static final SubLString $str18$Forgetting_the_extent_of_;
    private static final SubLSymbol $sym19$GAF_ARG1;
    private static final SubLInteger $int20$32;
    private static final SubLString $str21$Iteration__A__Removed__A_deductio;
    private static final SubLString $str22$forget_syntactically_invalid_new_;
    private static final SubLString $str23$Total__Removed__A_deductions_and_;
    private static final SubLString $str24$Identifying_invalid_deductions;
    private static final SubLString $str25$Removing_invalid_deductions;
    private static final SubLString $str26$Identifying_invalid_kb_hl_support;
    private static final SubLString $str27$Removing_invalid_kb_hl_supports;
    private static final SubLString $str28$Invalid_Deductions;
    private static final SubLString $str29$Removing_or_rejustifying_;
    private static final SubLString $str30$_invalid_deductions;
    private static final SubLString $str31$__Bad_deduction__S___S__S;
    private static final SubLString $str32$Finding_invalid_deductions;
    private static final SubLSymbol $sym33$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str34$Deduction__A_is_is_such_bad_state;
    private static final SubLString $str35$There_were__A_deductions_that_cou;
    private static final SubLString $str36$Invalid_Deduction_Worker_;
    private static final SubLSymbol $sym37$IDENTIFY_INVALID_DEDUCTIONS_WORKER;
    private static final SubLString $str38$Finding_invalid_deductions_using_;
    private static final SubLString $str39$_workers_____;
    private static final SubLInteger $int40$100;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$DEDUCTION_IS_FORGETTABLE_;
    private static final SubLString $str43$__Removed_a_total_of__A_useless_K;
    private static final SubLString $str44$Pass_;
    private static final SubLString $str45$__Identifying_useless_KB_HL_suppo;
    private static final SubLString $str46$__Removing_useless_KB_HL_supports;
    private static final SubLString $str47$Failed_to_remove_HL_support__A___;
    private static final SubLString $str48$__Removed__A_useless_KB_HL_suppor;
    private static final SubLString $str49$Forgetting_old_creation_seconds;
    private static final SubLObject $const50$myCreationSecond;
    private static final SubLString $str51$Examining_creation_seconds;
    private static final SubLString $str52$Cleaning_KBS_assert_info;
    private static final SubLSymbol $kw53$UNCHANGED;
    private static final SubLSymbol $sym54$RELEVANT_MT_IS_EQ;
    private static final SubLObject $const55$termOfUnit;
    private static final SubLString $str56$Looking_for_duplicate_narts_with_;
    private static final SubLString $str57$__Duplicates_found___S;
    private static final SubLSymbol $sym58$NUM_INDEX;
    private static final SubLString $str59$Examining_;
    private static final SubLString $str60$_assertions_for_duplication;
    private static final SubLString $str61$Examining_all_assertions_for_dupl;
    private static final SubLString $str62$Examining_all_assertions_for_dupl;
    private static final SubLSymbol $sym63$CANONICALIZER_PROBLEM_;
    private static final SubLString $str64$could_not_find_an_obvious_keeper_;
    private static final SubLSymbol $sym65$ASSERTION_ID;
    private static final SubLString $str66$Blasting_approximately_;
    private static final SubLString $str67$_duplicate_assertions;
    private static final SubLString $str68$Could_not_kill__a;
    private static final SubLSymbol $kw69$RETURN_IDS;
    private static final SubLString $str70$_______assertion__A_proved_unnece;
    private static final SubLString $str71$Redoing_TMS_on_assertions_with_no;
    private static final SubLSymbol $kw72$SAME;
    private static final SubLObject $const73$InferencePSC;
    private static final SubLList $list74;
    private static final SubLString $str75$_S_____A__;
    private static final SubLObject $const76$InstanceNamedFn_Ternary;
    private static final SubLObject $const77$ProperSubcollectionNamedFn_Ternar;
    private static final SubLString $str78$_A_new_narts_added_between_KB__S_;
    private static final SubLString $str79$_A_narts_departed_between_KB__S_a;
    private static final SubLString $str80$____________________New_NARTs____;
    private static final SubLString $str81$_S__;
    private static final SubLString $str82$____________________Departed_NART;
    private static final SubLSymbol $sym83$FUNCTOR_NARTS_IN_KB;
    private static final SubLString $str84$KB_;
    private static final SubLString $str85$_;
    private static final SubLString $str86$_NARTS_txt;
    private static final SubLString $str87$Getting__A_narts_for_KB__S__;
    private static final SubLSymbol $kw88$INPUT;
    private static final SubLString $str89$Unable_to_open__S;
    private static final SubLSymbol $sym90$_FUNCTOR_NARTS_IN_KB_CACHING_STATE_;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$OUTPUT;
    private static final SubLString $str93$___functionCorrespondingPredicate;
    private static final SubLString $str94$Writing_KE_text___;
    private static final SubLObject $const95$UnaryFunction;
    private static final SubLString $str96$Gathering_functions___;
    private static final SubLObject $const97$functionCorrespondingPredicate_Ge;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$FCP_FUNC__;
    private static final SubLObject $const101$UniversalVocabularyMt;
    private static final SubLString $str102$____;
    private static final SubLString $str103$_constant__;
    private static final SubLString $str104$_;
    private static final SubLString $str105$_in_mt__UniversalVocabularyMt__is;
    private static final SubLString $str106$__arg2Isa__;
    private static final SubLString $str107$__arg2Format__singleEntryFormatIn;
    private static final SubLString $str108$__f___functionCorrespondingPredic;
    private static final SubLString $str109$_;
    private static final SubLString $str110$_2____;
    private static final SubLString $str111$Of;
    private static final SubLString $str112$blakePleaseRenameThis_ItsTheFunct;
    private static final SubLString $str113$Fn;
    private static final SubLString $str114$Fn_;
    private static final SubLObject $const115$UnitOfMeasureConcept;
    private static final SubLString $str116$versionOf;
    private static final SubLString $str117$____Blake__check_this_out_;
    private static final SubLString $str118$;
    private static final SubLString $str119$A_predicate_corresponding_to_the_;
    private static final SubLString $str120$____code____;
    private static final SubLString $str121$_X__;
    private static final SubLString $str122$_X____code__will_always_be_true_f;
    private static final SubLList $list123;
    private static final SubLString $str124$Looking_for_assertions_with_more_;
    private static final SubLSymbol $sym125$BELIEF_P;
    private static final SubLObject $const126$FixedArityRelation;
    private static final SubLObject $const127$isa;
    private static final SubLSymbol $kw128$BREADTH;
    private static final SubLSymbol $kw129$QUEUE;
    private static final SubLSymbol $kw130$STACK;
    private static final SubLSymbol $sym131$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw132$ERROR;
    private static final SubLString $str133$_A_is_not_a__A;
    private static final SubLSymbol $sym134$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw135$CERROR;
    private static final SubLString $str136$continue_anyway;
    private static final SubLSymbol $kw137$WARN;
    private static final SubLString $str138$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str139$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str140$attempting_to_bind_direction_link;
    private static final SubLList $list141;
    private static final SubLString $str142$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const143$genls;
    private static final SubLString $str144$Fixing_all_FORTs_with___genls_ass;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 808L)
    public static SubLObject forget_unneeded_knowledge(SubLObject verboseP) {
        if (verboseP == kb_cleanup.UNPROVIDED) {
            verboseP = (SubLObject)kb_cleanup.T;
        }
        forget_ephemeral_terms(verboseP);
        forget_ill_formed_skolems();
        forget_useless_skolems();
        forget_useless_narts();
        forget_old_creation_seconds();
        clean_assertion_assert_info();
        forget_invalid_deductions();
        forget_useless_kb_hl_supports(verboseP);
        bookkeeping_store.forget_invalid_bookkeeping_assertions();
        wff.forget_redundant_assertive_wff_deductions();
        after_adding_modules.forget_unused_instantiated_constants();
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 1756L)
    public static SubLObject forget_ephemeral_terms(SubLObject verboseP) {
        if (verboseP == kb_cleanup.UNPROVIDED) {
            verboseP = (SubLObject)kb_cleanup.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ephemeral_terms = (SubLObject)kb_cleanup.NIL;
        ephemeral_terms = all_ephemeral_terms();
        if (kb_cleanup.NIL != verboseP) {
            final SubLObject list_var = ephemeral_terms;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != Sequences.cconcatenate((SubLObject)kb_cleanup.$str0$Forgetting_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(ephemeral_terms)), kb_cleanup.$str1$_ephemeral_terms })) ? Sequences.cconcatenate((SubLObject)kb_cleanup.$str0$Forgetting_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(ephemeral_terms)), kb_cleanup.$str1$_ephemeral_terms }) : kb_cleanup.$str2$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = (SubLObject)kb_cleanup.NIL;
                    v_term = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        if (kb_cleanup.NIL != forts.valid_fortP(v_term)) {
                            forget_ephemeral_term(v_term);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            SubLObject cdolist_list_var = ephemeral_terms;
            SubLObject v_term2 = (SubLObject)kb_cleanup.NIL;
            v_term2 = cdolist_list_var.first();
            while (kb_cleanup.NIL != cdolist_list_var) {
                if (kb_cleanup.NIL != forts.valid_fortP(v_term2)) {
                    forget_ephemeral_term(v_term2);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term2 = cdolist_list_var.first();
            }
        }
        return Sequences.length(ephemeral_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 2827L)
    public static SubLObject ephemeral_term_count() {
        return Numbers.add(strictly_ephemeral_term_count(), naked_in_progress_term_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 3044L)
    public static SubLObject ephemeral_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL != forts.fort_p(v_object) && (kb_cleanup.NIL != strictly_ephemeral_termP(v_object) || kb_cleanup.NIL != naked_in_progress_termP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 3285L)
    public static SubLObject strictly_ephemeral_term_count() {
        return kb_indexing.num_predicate_extent_index(kb_cleanup.$const3$ephemeralTerm, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 3471L)
    public static SubLObject strictly_ephemeral_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL != forts.fort_p(v_object) && kb_cleanup.NIL != kb_mapping_utilities.fpred_value_in_any_mt(v_object, kb_cleanup.$const3$ephemeralTerm, (SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 3694L)
    public static SubLObject all_ephemeral_terms() {
        return list_utilities.fast_delete_duplicates(Sequences.cconcatenate(all_strictly_ephemeral_terms(), all_naked_in_progress_terms()), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 3952L)
    public static SubLObject all_strictly_ephemeral_terms() {
        return kb_mapping_utilities.pred_refs_in_any_mt(kb_cleanup.$const3$ephemeralTerm, (SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.$kw4$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 4129L)
    public static SubLObject naked_in_progress_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL != forts.fort_p(v_object) && kb_cleanup.NIL != kb_mapping_utilities.fpred_value_in_any_mt(v_object, kb_cleanup.$const5$inProgressTerm, (SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.UNPROVIDED) && kb_cleanup.NIL != nothing_said_about_in_progress_termP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 4476L)
    public static SubLObject nothing_said_about_in_progress_termP(final SubLObject v_term) {
        return Numbers.numE(kb_indexing.num_index(v_term), (SubLObject)kb_cleanup.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 4626L)
    public static SubLObject all_naked_in_progress_terms() {
        final SubLObject accumulator = accumulation.new_list_accumulator((SubLObject)kb_cleanup.UNPROVIDED);
        all_naked_in_progress_terms_internal(accumulator);
        return accumulation.accumulation_contents(accumulator, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 4882L)
    public static SubLObject naked_in_progress_term_count() {
        final SubLObject accumulator = accumulation.new_count_accumulator();
        all_naked_in_progress_terms_internal(accumulator);
        return accumulation.accumulation_contents(accumulator, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 5153L)
    public static SubLObject all_naked_in_progress_terms_internal(final SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_cleanup.$const7$EverythingPSC, thread);
            final SubLObject pred_var = kb_cleanup.$const5$inProgressTerm;
            if (kb_cleanup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)kb_cleanup.NIL;
                final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_cleanup.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_cleanup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_cleanup.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)kb_cleanup.NIL;
                    final SubLObject token_var = (SubLObject)kb_cleanup.NIL;
                    while (kb_cleanup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_cleanup.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)kb_cleanup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_cleanup.$kw8$GAF, (SubLObject)kb_cleanup.$kw4$TRUE, (SubLObject)kb_cleanup.NIL);
                                SubLObject done_var_$4 = (SubLObject)kb_cleanup.NIL;
                                final SubLObject token_var_$5 = (SubLObject)kb_cleanup.NIL;
                                while (kb_cleanup.NIL == done_var_$4) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                    if (kb_cleanup.NIL != valid_$6) {
                                        final SubLObject v_term = assertions_high.gaf_arg(assertion, (SubLObject)kb_cleanup.ONE_INTEGER);
                                        if (kb_cleanup.NIL != nothing_said_about_in_progress_termP(v_term)) {
                                            accumulation.accumulation_add(accumulator, v_term);
                                        }
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid_$6);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (kb_cleanup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 5551L)
    public static SubLObject forget_ephemeral_term(final SubLObject v_term) {
        assert kb_cleanup.NIL != forts.fort_p(v_term) : v_term;
        return cyc_kernel.cyc_kill(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 5652L)
    public static SubLObject forget_ill_formed_skolems() {
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject cdolist_list_var = isa.all_fort_instances(kb_cleanup.$const10$SkolemFunction, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        SubLObject skolem = (SubLObject)kb_cleanup.NIL;
        skolem = cdolist_list_var.first();
        while (kb_cleanup.NIL != cdolist_list_var) {
            if (kb_cleanup.NIL != skolems.skolem_ill_formedP(skolem)) {
                count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                cyc_kernel.cyc_kill(skolem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 6009L)
    public static SubLObject forget_useless_skolems() {
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject cdolist_list_var = isa.all_fort_instances(kb_cleanup.$const10$SkolemFunction, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        SubLObject skolem = (SubLObject)kb_cleanup.NIL;
        skolem = cdolist_list_var.first();
        while (kb_cleanup.NIL != cdolist_list_var) {
            if (kb_cleanup.NIL == skolems.skolem_defn_assertions_robust(skolem, (SubLObject)kb_cleanup.UNPROVIDED)) {
                count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                cyc_kernel.cyc_kill(skolem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 6416L)
    public static SubLObject forget_useless_narts() {
        return forget_narts(gather_useless_narts(), (SubLObject)kb_cleanup.$str11$forgetting_useless_NARTs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 6678L)
    public static SubLObject gather_useless_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_cleanup.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kb_cleanup.$str12$Gathering_useless_NARTs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        assert kb_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$8, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$10;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                            id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (kb_cleanup.NIL == id_index.id_index_tombstone_p(nart) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                if (kb_cleanup.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)kb_cleanup.$kw14$SKIP;
                                }
                                ignore_errors_tag = (SubLObject)kb_cleanup.NIL;
                                try {
                                    thread.throwStack.push(kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                                    _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_cleanup.$sym16$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (kb_cleanup.NIL != narts_high.useless_nartP(nart)) {
                                                v_answer = (SubLObject)ConsesLow.cons(nart, v_answer);
                                            }
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$10);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$10);
                        final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(nart2)) {
                                SubLObject ignore_errors_tag2 = (SubLObject)kb_cleanup.NIL;
                                try {
                                    thread.throwStack.push(kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_cleanup.$sym16$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (kb_cleanup.NIL != narts_high.useless_nartP(nart2)) {
                                                v_answer = (SubLObject)ConsesLow.cons(nart2, v_answer);
                                            }
                                        }
                                        catch (Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, (SubLObject)kb_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var2) {
                                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 6983L)
    public static SubLObject forget_narts(final SubLObject narts, final SubLObject progress_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)kb_cleanup.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _prev_bind_0_$15 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$16 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$17 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != progress_message) ? progress_message : kb_cleanup.$str2$cdolist), thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(narts), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = narts;
                            SubLObject nart = (SubLObject)kb_cleanup.NIL;
                            nart = csome_list_var.first();
                            while (kb_cleanup.NIL != csome_list_var) {
                                SubLObject ignore_errors_tag = (SubLObject)kb_cleanup.NIL;
                                try {
                                    thread.throwStack.push(kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$16 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_cleanup.$sym16$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (kb_cleanup.NIL != nart_handles.valid_nartP(nart, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str17$Forgetting_NART__S__, nart);
                                                cyc_kernel.cyc_kill(nart);
                                            }
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                nart = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_2_$17, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$16, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$15, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$14, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(narts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 7305L)
    public static SubLObject forget_function_extent(final SubLObject function) {
        final SubLObject message = Sequences.cconcatenate((SubLObject)kb_cleanup.$str18$Forgetting_the_extent_of_, format_nil.format_nil_s_no_copy(function));
        final SubLObject narts = Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_cleanup.$sym19$GAF_ARG1), kb_mapping.gather_function_extent_index(function));
        return forget_narts(narts, message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 7593L)
    public static SubLObject forget_invalid_deductions_and_kb_hl_supports_until_quiesced(SubLObject only_newP, SubLObject max_iteration_count, SubLObject verboseP) {
        if (only_newP == kb_cleanup.UNPROVIDED) {
            only_newP = (SubLObject)kb_cleanup.NIL;
        }
        if (max_iteration_count == kb_cleanup.UNPROVIDED) {
            max_iteration_count = (SubLObject)kb_cleanup.$int20$32;
        }
        if (verboseP == kb_cleanup.UNPROVIDED) {
            verboseP = (SubLObject)kb_cleanup.NIL;
        }
        SubLObject iteration_count = (SubLObject)kb_cleanup.ONE_INTEGER;
        SubLObject removed_deduction_count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject removed_kb_hl_support_count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        for (SubLObject doneP = (SubLObject)kb_cleanup.NIL; kb_cleanup.NIL == doneP; doneP = (SubLObject)kb_cleanup.T) {
            final SubLObject invalid_deduction_count = (kb_cleanup.NIL != only_newP) ? forget_syntactically_invalid_new_deductions() : forget_invalid_deductions();
            final SubLObject invalid_kb_hl_support_count = (kb_cleanup.NIL != only_newP) ? forget_syntactically_invalid_new_kb_hl_supports() : forget_useless_kb_hl_supports_impl(iteration_count, verboseP);
            PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str21$Iteration__A__Removed__A_deductio, new SubLObject[] { iteration_count, invalid_deduction_count, invalid_kb_hl_support_count });
            removed_deduction_count = Numbers.add(removed_deduction_count, invalid_deduction_count);
            removed_kb_hl_support_count = Numbers.add(removed_kb_hl_support_count, invalid_kb_hl_support_count);
            if (!invalid_deduction_count.isPositive() && !invalid_kb_hl_support_count.isPositive()) {
                doneP = (SubLObject)kb_cleanup.T;
            }
            iteration_count = Numbers.add(iteration_count, (SubLObject)kb_cleanup.ONE_INTEGER);
            if (iteration_count.numGE(max_iteration_count)) {
                Errors.warn((SubLObject)kb_cleanup.$str22$forget_syntactically_invalid_new_, max_iteration_count);
            }
        }
        PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str23$Total__Removed__A_deductions_and_, removed_deduction_count, removed_kb_hl_support_count);
        return Values.values(removed_deduction_count, removed_kb_hl_support_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 9041L)
    public static SubLObject forget_syntactically_invalid_new_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalid_deductions = (SubLObject)kb_cleanup.NIL;
        final SubLObject start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        final SubLObject table_var = deduction_handles.do_deductions_table();
        final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)kb_cleanup.$str24$Identifying_invalid_deductions);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject ded;
                for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_cleanup.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    ded = id_index.id_index_lookup(table_var, id, (SubLObject)kb_cleanup.UNPROVIDED);
                    if (kb_cleanup.NIL != ded) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                        if (kb_cleanup.NIL == deduction_handles.valid_deductionP(ded, (SubLObject)kb_cleanup.T)) {
                            invalid_deductions = (SubLObject)ConsesLow.cons(ded, invalid_deductions);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        invalid_deductions = Sequences.nreverse(invalid_deductions);
        if (kb_cleanup.NIL != invalid_deductions) {
            final SubLObject list_var = invalid_deductions;
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kb_cleanup.$str25$Removing_invalid_deductions, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ded2 = (SubLObject)kb_cleanup.NIL;
                    ded2 = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        SubLObject ignore_errors_tag = (SubLObject)kb_cleanup.NIL;
                        try {
                            thread.throwStack.push(kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$22 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_cleanup.$sym16$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    tms.tms_remove_deduction(ded2);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ded2 = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return Sequences.length(invalid_deductions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 9600L)
    public static SubLObject forget_syntactically_invalid_new_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalid_kb_hl_supports = (SubLObject)kb_cleanup.NIL;
        final SubLObject table_var = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject first_id_var = kb_hl_support_handles.new_kb_hl_support_id_threshold();
        final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), first_id_var);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)kb_cleanup.$str26$Identifying_invalid_kb_hl_support);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject kb_hl_support;
                for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_cleanup.NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    kb_hl_support = id_index.id_index_lookup(table_var, id, (SubLObject)kb_cleanup.UNPROVIDED);
                    if (kb_cleanup.NIL != kb_hl_support) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                        if (kb_cleanup.NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, (SubLObject)kb_cleanup.T)) {
                            invalid_kb_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support, invalid_kb_hl_supports);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        invalid_kb_hl_supports = Sequences.nreverse(invalid_kb_hl_supports);
        if (kb_cleanup.NIL != invalid_kb_hl_supports) {
            final SubLObject list_var = invalid_kb_hl_supports;
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kb_cleanup.$str27$Removing_invalid_kb_hl_supports, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject kb_hl_support2 = (SubLObject)kb_cleanup.NIL;
                    kb_hl_support2 = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        SubLObject ignore_errors_tag = (SubLObject)kb_cleanup.NIL;
                        try {
                            thread.throwStack.push(kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$25 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_cleanup.$sym16$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    kb_hl_supports_high.tms_remove_kb_hl_support(kb_hl_support2);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        kb_hl_support2 = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return Sequences.length(invalid_kb_hl_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 10259L)
    public static SubLObject forget_invalid_deductions() {
        final SubLObject bad_deductions = process_utilities.new_ipc_queue((SubLObject)kb_cleanup.$str28$Invalid_Deductions);
        if (kb_cleanup.NIL != builder_utilities.build_process_parallelism_permittedP()) {
            identify_invalid_deductions_n_way(bad_deductions, builder_utilities.build_process_worker_count());
        }
        else {
            identify_invalid_deductions_serial(bad_deductions);
        }
        return forget_invalid_deductions_serial(bad_deductions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 10891L)
    public static SubLObject forget_invalid_deductions_serial(final SubLObject invalid_deductions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject removed_deduction = (SubLObject)kb_cleanup.ZERO_INTEGER;
        if (!process_utilities.ipc_current_queue_size(invalid_deductions).isZero()) {
            final SubLObject bad_deductions = process_utilities.ipc_drain(invalid_deductions, (SubLObject)kb_cleanup.UNPROVIDED);
            final SubLObject msg = Sequences.cconcatenate((SubLObject)kb_cleanup.$str29$Removing_or_rejustifying_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(bad_deductions)), kb_cleanup.$str30$_invalid_deductions });
            final SubLObject list_var = bad_deductions;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != msg) ? msg : kb_cleanup.$str2$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject deduction = (SubLObject)kb_cleanup.NIL;
                    deduction = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        format_nil.force_format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str31$__Bad_deduction__S___S__S, deduction, deductions_high.deduction_supported_object(deduction), deductions_high.deduction_supports(deduction), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                        if (kb_cleanup.NIL != tms.tms_remove_deduction(deduction)) {
                            removed_deduction = Numbers.add(removed_deduction, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                        count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        deduction = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(count, removed_deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 11622L)
    public static SubLObject identify_invalid_deductions_serial(final SubLObject bad_deductions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject un_analyzable_deductions = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = (SubLObject)kb_cleanup.$str32$Finding_invalid_deductions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        assert kb_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$28 = idx;
                if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$28, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                    final SubLObject idx_$29 = idx_$28;
                    if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$29, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$29);
                        final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        SubLObject msg;
                        SubLObject _prev_bind_0_$30;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                            d_id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                            d_handle = Vectors.aref(vector_var, d_id);
                            if (kb_cleanup.NIL == id_index.id_index_tombstone_p(d_handle) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                if (kb_cleanup.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                    d_handle = (SubLObject)kb_cleanup.$kw14$SKIP;
                                }
                                deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                msg = (SubLObject)kb_cleanup.NIL;
                                try {
                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    _prev_bind_0_$30 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)kb_cleanup.$sym33$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (kb_cleanup.NIL != deduction_is_forgettableP(deduction)) {
                                                process_utilities.ipc_enqueue(deduction, bad_deductions, (SubLObject)kb_cleanup.UNPROVIDED);
                                            }
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$30, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (msg.isString()) {
                                    un_analyzable_deductions = Numbers.add(un_analyzable_deductions, (SubLObject)kb_cleanup.ONE_INTEGER);
                                    Errors.warn((SubLObject)kb_cleanup.$str34$Deduction__A_is_is_such_bad_state, deduction_handles.deduction_id(deduction), msg);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$30 = idx_$28;
                    if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$30) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$30);
                        SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$30);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$30);
                        final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                            if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                SubLObject msg2 = (SubLObject)kb_cleanup.NIL;
                                try {
                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$31 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)kb_cleanup.$sym33$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (kb_cleanup.NIL != deduction_is_forgettableP(deduction2)) {
                                                process_utilities.ipc_enqueue(deduction2, bad_deductions, (SubLObject)kb_cleanup.UNPROVIDED);
                                            }
                                        }
                                        catch (Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, (SubLObject)kb_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$31, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var2) {
                                    msg2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (msg2.isString()) {
                                    un_analyzable_deductions = Numbers.add(un_analyzable_deductions, (SubLObject)kb_cleanup.ONE_INTEGER);
                                    Errors.warn((SubLObject)kb_cleanup.$str34$Deduction__A_is_is_such_bad_state, deduction_handles.deduction_id(deduction2), msg2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            d_id2 = Numbers.add(d_id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (un_analyzable_deductions.isPositive()) {
            Errors.error((SubLObject)kb_cleanup.$str35$There_were__A_deductions_that_cou, un_analyzable_deductions);
        }
        return process_utilities.ipc_current_queue_size(bad_deductions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 12401L)
    public static SubLObject identify_invalid_deductions_n_way(final SubLObject bad_deductions, final SubLObject num_of_workers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject percentages = dictionary.new_dictionary((SubLObject)kb_cleanup.EQL, num_of_workers);
        SubLObject slice_id;
        SubLObject worker_name;
        SubLObject clicker;
        SubLObject worker;
        for (slice_id = (SubLObject)kb_cleanup.NIL, slice_id = (SubLObject)kb_cleanup.ZERO_INTEGER; slice_id.numL(num_of_workers); slice_id = Numbers.add(slice_id, (SubLObject)kb_cleanup.ONE_INTEGER)) {
            worker_name = Sequences.cconcatenate((SubLObject)kb_cleanup.$str36$Invalid_Deduction_Worker_, format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)kb_cleanup.ONE_INTEGER, slice_id)));
            clicker = Semaphores.new_semaphore(worker_name, (SubLObject)kb_cleanup.ZERO_INTEGER);
            worker = subl_promotions.make_process_with_args(worker_name, (SubLObject)kb_cleanup.$sym37$IDENTIFY_INVALID_DEDUCTIONS_WORKER, (SubLObject)ConsesLow.list(bad_deductions, slice_id, num_of_workers, clicker));
            map_utilities.map_put(percentages, worker, clicker);
        }
        final SubLObject progress = Sequences.cconcatenate((SubLObject)kb_cleanup.$str38$Finding_invalid_deductions_using_, new SubLObject[] { format_nil.format_nil_a_no_copy(num_of_workers), kb_cleanup.$str39$_workers_____ });
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(progress);
                SubLObject percent = (SubLObject)kb_cleanup.ZERO_INTEGER;
                utilities_macros.note_percent_progress((SubLObject)kb_cleanup.ZERO_INTEGER, (SubLObject)kb_cleanup.$int40$100);
                while (kb_cleanup.NIL == map_utilities.map_empty_p(percentages)) {
                    SubLObject stale_workers = (SubLObject)kb_cleanup.NIL;
                    final SubLObject iterator = map_utilities.new_map_iterator(percentages);
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)kb_cleanup.NIL; kb_cleanup.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (kb_cleanup.NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject worker2 = (SubLObject)kb_cleanup.NIL;
                            SubLObject clicker2 = (SubLObject)kb_cleanup.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_cleanup.$list41);
                            worker2 = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_cleanup.$list41);
                            clicker2 = current.first();
                            current = current.rest();
                            if (kb_cleanup.NIL == current) {
                                if (kb_cleanup.NIL != Threads.valid_process_p(worker2)) {
                                    Semaphores.semaphore_wait(clicker2);
                                }
                                else {
                                    stale_workers = (SubLObject)ConsesLow.cons(worker2, stale_workers);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_cleanup.$list41);
                            }
                        }
                    }
                    percent = Numbers.add(percent, (SubLObject)kb_cleanup.ONE_INTEGER);
                    utilities_macros.note_percent_progress(percent, (SubLObject)kb_cleanup.$int40$100);
                    SubLObject cdolist_list_var = stale_workers;
                    SubLObject stale_worker = (SubLObject)kb_cleanup.NIL;
                    stale_worker = cdolist_list_var.first();
                    while (kb_cleanup.NIL != cdolist_list_var) {
                        map_utilities.map_remove(percentages, stale_worker);
                        cdolist_list_var = cdolist_list_var.rest();
                        stale_worker = cdolist_list_var.first();
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return bad_deductions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 13788L)
    public static SubLObject identify_invalid_deductions_worker(final SubLObject bad_deductions, final SubLObject slice_id, final SubLObject num_of_slices, final SubLObject clicker) {
        final SubLObject deductions = deduction_handles.deduction_count();
        SubLObject current_percent = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject i;
        SubLObject deduction;
        SubLObject new_percent;
        for (i = (SubLObject)kb_cleanup.NIL, i = (SubLObject)kb_cleanup.ZERO_INTEGER; i.numL(deductions); i = Numbers.add(i, (SubLObject)kb_cleanup.ONE_INTEGER)) {
            if (slice_id.numE(Numbers.mod(i, num_of_slices))) {
                deduction = deduction_handles.find_deduction_by_id(i);
                if (kb_cleanup.NIL != deduction_handles.deduction_p(deduction) && kb_cleanup.NIL != deduction_is_forgettableP(deduction)) {
                    process_utilities.ipc_enqueue(deduction, bad_deductions, (SubLObject)kb_cleanup.UNPROVIDED);
                }
                new_percent = utilities_macros.compute_percent_progress(i, deductions);
                if (!current_percent.numE(new_percent)) {
                    Semaphores.semaphore_signal(clicker);
                    current_percent = new_percent;
                }
            }
        }
        Semaphores.semaphore_signal(clicker);
        return slice_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 14544L)
    public static SubLObject deduction_is_forgettableP(final SubLObject deduction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == deduction_handles.valid_deductionP(deduction, (SubLObject)kb_cleanup.T) || kb_cleanup.NIL != deduction_has_invalid_supportP(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 14712L)
    public static SubLObject deduction_has_invalid_supportP(final SubLObject deduction) {
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        SubLObject mal = (SubLObject)kb_cleanup.NIL;
        if (kb_cleanup.NIL == mal) {
            SubLObject csome_list_var;
            SubLObject support;
            for (csome_list_var = supports, support = (SubLObject)kb_cleanup.NIL, support = csome_list_var.first(); kb_cleanup.NIL == mal && kb_cleanup.NIL != csome_list_var; mal = arguments.ill_formed_hl_supportP(support), csome_list_var = csome_list_var.rest(), support = csome_list_var.first()) {}
        }
        return mal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 14932L)
    public static SubLObject new_invalid_deduction_iterator() {
        return iteration.new_filter_iterator(deduction_handles.new_deductions_iterator(), (SubLObject)kb_cleanup.$sym42$DEDUCTION_IS_FORGETTABLE_, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 15240L)
    public static SubLObject forget_useless_kb_hl_supports(SubLObject verboseP) {
        if (verboseP == kb_cleanup.UNPROVIDED) {
            verboseP = (SubLObject)kb_cleanup.NIL;
        }
        SubLObject pass = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject total_removed = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject removed;
        for (SubLObject doneP = (SubLObject)kb_cleanup.NIL; kb_cleanup.NIL == doneP; doneP = Numbers.zerop(removed)) {
            pass = Numbers.add(pass, (SubLObject)kb_cleanup.ONE_INTEGER);
            removed = forget_useless_kb_hl_supports_impl(pass, verboseP);
            total_removed = Numbers.add(total_removed, removed);
        }
        if (kb_cleanup.NIL != verboseP && total_removed.isPositive()) {
            PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str43$__Removed_a_total_of__A_useless_K, total_removed, pass);
        }
        return total_removed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 15783L)
    public static SubLObject forget_useless_kb_hl_supports_impl(final SubLObject pass, SubLObject verboseP) {
        if (verboseP == kb_cleanup.UNPROVIDED) {
            verboseP = (SubLObject)kb_cleanup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject map_msg = Sequences.cconcatenate((SubLObject)kb_cleanup.$str44$Pass_, new SubLObject[] { format_nil.format_nil_a_no_copy(pass), kb_cleanup.$str45$__Identifying_useless_KB_HL_suppo });
        final SubLObject reduce_msg = Sequences.cconcatenate((SubLObject)kb_cleanup.$str44$Pass_, new SubLObject[] { format_nil.format_nil_a_no_copy(pass), kb_cleanup.$str46$__Removing_useless_KB_HL_supports });
        SubLObject bad_hl_supports = (SubLObject)kb_cleanup.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = map_msg;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        assert kb_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$35 = idx;
                if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$35, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                    final SubLObject idx_$36 = idx_$35;
                    if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$36, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$36);
                        final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                            s_id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_cleanup.NIL == id_index.id_index_tombstone_p(s_handle) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                if (kb_cleanup.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_cleanup.$kw14$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                kb_hl_supports_high.eliminate_kb_hl_support_invalid_dependents(kb_hl_support, (SubLObject)kb_cleanup.UNPROVIDED);
                                if (kb_cleanup.NIL != kb_hl_supports_high.should_remove_kb_hl_supportP(kb_hl_support)) {
                                    bad_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support, bad_hl_supports);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$37 = idx_$35;
                    if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$37) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$37);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$37);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$37);
                        final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                kb_hl_supports_high.eliminate_kb_hl_support_invalid_dependents(kb_hl_support2, (SubLObject)kb_cleanup.UNPROVIDED);
                                if (kb_cleanup.NIL != kb_hl_supports_high.should_remove_kb_hl_supportP(kb_hl_support2)) {
                                    bad_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support2, bad_hl_supports);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject errmsg = (SubLObject)kb_cleanup.NIL;
        final SubLObject list_var = bad_hl_supports;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != reduce_msg) ? reduce_msg : kb_cleanup.$str2$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject hl_support = (SubLObject)kb_cleanup.NIL;
                hl_support = csome_list_var.first();
                while (kb_cleanup.NIL != csome_list_var) {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)kb_cleanup.$sym33$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (kb_cleanup.NIL != kb_hl_supports_high.possibly_remove_kb_hl_support(hl_support)) {
                                    count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        errmsg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (errmsg.isString() && kb_cleanup.NIL != verboseP) {
                        Errors.warn((SubLObject)kb_cleanup.$str47$Failed_to_remove_HL_support__A___, hl_support, errmsg);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    hl_support = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
        }
        if (kb_cleanup.NIL != verboseP && count.isPositive()) {
            PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str48$__Removed__A_useless_KB_HL_suppor, count, pass);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 16989L)
    public static SubLObject forget_old_creation_seconds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject old_creation_seconds = list_var = gather_old_creation_seconds();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)kb_cleanup.$str49$Forgetting_old_creation_seconds, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject old = (SubLObject)kb_cleanup.NIL;
                old = csome_list_var.first();
                while (kb_cleanup.NIL != csome_list_var) {
                    SubLObject ignore_errors_tag = (SubLObject)kb_cleanup.NIL;
                    try {
                        thread.throwStack.push(kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$41 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_cleanup.$sym16$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (kb_cleanup.NIL != assertions_high.valid_assertion(old, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                    tms.tms_remove_assertion(old);
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)kb_cleanup.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$41, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_cleanup.$kw15$IGNORE_ERRORS_TARGET);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    old = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(old_creation_seconds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 17657L)
    public static SubLObject forget_old_creation_second_date() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numeric_date_utilities.month_ago(numeric_date_utilities.get_universal_date((SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED), kb_cleanup.$forget_old_creation_second_months$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 17875L)
    public static SubLObject gather_old_creation_seconds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject forget_date = forget_old_creation_second_date();
        final SubLObject total = kb_indexing.num_predicate_extent_index(kb_cleanup.$const50$myCreationSecond, (SubLObject)kb_cleanup.UNPROVIDED);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject v_answer = (SubLObject)kb_cleanup.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)kb_cleanup.$str51$Examining_creation_seconds);
                final SubLObject _prev_bind_0_$43 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kb_cleanup.$const7$EverythingPSC, thread);
                    final SubLObject pred_var = kb_cleanup.$const50$myCreationSecond;
                    if (kb_cleanup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)kb_cleanup.NIL;
                        final SubLObject _prev_bind_0_$44 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$45 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$47 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$48 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_cleanup.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((kb_cleanup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_cleanup.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)kb_cleanup.NIL;
                            final SubLObject token_var = (SubLObject)kb_cleanup.NIL;
                            while (kb_cleanup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (kb_cleanup.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)kb_cleanup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_cleanup.$kw8$GAF, (SubLObject)kb_cleanup.NIL, (SubLObject)kb_cleanup.NIL);
                                        SubLObject done_var_$49 = (SubLObject)kb_cleanup.NIL;
                                        final SubLObject token_var_$50 = (SubLObject)kb_cleanup.NIL;
                                        while (kb_cleanup.NIL == done_var_$49) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                            final SubLObject valid_$51 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$50.eql(ass));
                                            if (kb_cleanup.NIL != valid_$51) {
                                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(sofar, total);
                                                final SubLObject v_term = assertions_high.gaf_arg1(ass);
                                                if (kb_cleanup.NIL != forts.fort_p(v_term)) {
                                                    final SubLObject creation_time = bookkeeping_store.creation_time(v_term, (SubLObject)kb_cleanup.UNPROVIDED);
                                                    if (kb_cleanup.NIL != creation_time && creation_time.numLE(forget_date)) {
                                                        v_answer = (SubLObject)ConsesLow.cons(ass, v_answer);
                                                    }
                                                }
                                            }
                                            done_var_$49 = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid_$51);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (kb_cleanup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$48, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$47, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$45, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$44, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$43, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        v_answer = Sequences.nreverse(v_answer);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 18610L)
    public static SubLObject clean_assertion_assert_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)kb_cleanup.$str52$Cleaning_KBS_assert_info;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
                assert kb_cleanup.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_0_$54 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$55 = idx;
                        if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$55, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                            final SubLObject idx_$56 = idx_$55;
                            if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$56, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$56);
                                final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion;
                                SubLObject asserted_by_value;
                                SubLObject asserted_why_value;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                                    a_id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                        if (kb_cleanup.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)kb_cleanup.$kw14$SKIP;
                                        }
                                        assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (kb_cleanup.NIL != assertions_high.asserted_assertionP(assertion)) {
                                            asserted_by_value = (SubLObject)((kb_cleanup.NIL != forts.invalid_fortP(assertions_high.asserted_by(assertion))) ? kb_cleanup.NIL : kb_cleanup.$kw53$UNCHANGED);
                                            asserted_why_value = (SubLObject)((kb_cleanup.NIL != forts.invalid_fortP(assertions_high.asserted_why(assertion))) ? kb_cleanup.NIL : kb_cleanup.$kw53$UNCHANGED);
                                            if (kb_cleanup.NIL == asserted_by_value || kb_cleanup.NIL == asserted_why_value) {
                                                if (kb_cleanup.NIL == asserted_by_value) {
                                                    count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                                                }
                                                if (kb_cleanup.NIL == asserted_why_value) {
                                                    count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                                                }
                                                assertions_high.timestamp_asserted_assertion(assertion, asserted_by_value, (SubLObject)kb_cleanup.$kw53$UNCHANGED, asserted_why_value, (SubLObject)kb_cleanup.$kw53$UNCHANGED);
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$57 = idx_$55;
                            if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$57) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$57);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$57);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$57);
                                final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (kb_cleanup.NIL != assertions_high.asserted_assertionP(assertion2)) {
                                            final SubLObject asserted_by_value2 = (SubLObject)((kb_cleanup.NIL != forts.invalid_fortP(assertions_high.asserted_by(assertion2))) ? kb_cleanup.NIL : kb_cleanup.$kw53$UNCHANGED);
                                            final SubLObject asserted_why_value2 = (SubLObject)((kb_cleanup.NIL != forts.invalid_fortP(assertions_high.asserted_why(assertion2))) ? kb_cleanup.NIL : kb_cleanup.$kw53$UNCHANGED);
                                            if (kb_cleanup.NIL == asserted_by_value2 || kb_cleanup.NIL == asserted_why_value2) {
                                                if (kb_cleanup.NIL == asserted_by_value2) {
                                                    count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                                                }
                                                if (kb_cleanup.NIL == asserted_why_value2) {
                                                    count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                                                }
                                                assertions_high.timestamp_asserted_assertion(assertion2, asserted_by_value2, (SubLObject)kb_cleanup.$kw53$UNCHANGED, asserted_why_value2, (SubLObject)kb_cleanup.$kw53$UNCHANGED);
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$54, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 19502L)
    public static SubLObject duplicate_nart_tuples(SubLObject via_tou_assertionsP) {
        if (via_tou_assertionsP == kb_cleanup.UNPROVIDED) {
            via_tou_assertionsP = (SubLObject)kb_cleanup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = (SubLObject)kb_cleanup.NIL;
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_cleanup.EQUAL), (SubLObject)kb_cleanup.UNPROVIDED);
        if (kb_cleanup.NIL != via_tou_assertionsP) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym54$RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                final SubLObject pred_var = kb_cleanup.$const55$termOfUnit;
                if (kb_cleanup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)kb_cleanup.NIL;
                    final SubLObject _prev_bind_0_$60 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$61 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                        utilities_macros.$progress_notification_count$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_cleanup.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((kb_cleanup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_cleanup.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)kb_cleanup.NIL;
                        final SubLObject token_var = (SubLObject)kb_cleanup.NIL;
                        while (kb_cleanup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_cleanup.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)kb_cleanup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_cleanup.$kw8$GAF, (SubLObject)kb_cleanup.$kw4$TRUE, (SubLObject)kb_cleanup.NIL);
                                    SubLObject done_var_$62 = (SubLObject)kb_cleanup.NIL;
                                    final SubLObject token_var_$63 = (SubLObject)kb_cleanup.NIL;
                                    while (kb_cleanup.NIL == done_var_$62) {
                                        final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                        final SubLObject valid_$64 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$63.eql(tou_ass));
                                        if (kb_cleanup.NIL != valid_$64) {
                                            final SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                            final SubLObject nart_hl_formula = assertions_high.gaf_arg2(tou_ass);
                                            if (kb_cleanup.NIL != nart_handles.nart_p(nart)) {
                                                dictionary_utilities.dictionary_push(dict, nart_hl_formula, nart);
                                            }
                                        }
                                        done_var_$62 = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid_$64);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kb_cleanup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid);
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
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$61, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$60, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = (SubLObject)kb_cleanup.$str56$Looking_for_duplicate_narts_with_;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
            assert kb_cleanup.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$66 = idx;
                    if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$66, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject idx_$67 = idx_$66;
                        if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$67, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$67);
                            final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                                id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                                nart2 = Vectors.aref(vector_var, id);
                                if (kb_cleanup.NIL == id_index.id_index_tombstone_p(nart2) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                    if (kb_cleanup.NIL != id_index.id_index_tombstone_p(nart2)) {
                                        nart2 = (SubLObject)kb_cleanup.$kw14$SKIP;
                                    }
                                    dictionary_utilities.dictionary_push(dict, narts_high.nart_hl_formula(nart2), nart2);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$68 = idx_$66;
                        if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$68) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$68);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$68);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$68);
                            final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject nart3 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(nart3)) {
                                    dictionary_utilities.dictionary_push(dict, narts_high.nart_hl_formula(nart3), nart3);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
            }
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject narts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_cleanup.NIL == list_utilities.singletonP(narts)) {
                Errors.warn((SubLObject)kb_cleanup.$str57$__Duplicates_found___S, narts);
                tuples = (SubLObject)ConsesLow.cons(Sequences.reverse(narts), tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 20551L)
    public static SubLObject duplicate_narts_to_kill() {
        SubLObject result = (SubLObject)kb_cleanup.NIL;
        SubLObject cdolist_list_var;
        final SubLObject tuples = cdolist_list_var = duplicate_nart_tuples((SubLObject)kb_cleanup.UNPROVIDED);
        SubLObject narts = (SubLObject)kb_cleanup.NIL;
        narts = cdolist_list_var.first();
        while (kb_cleanup.NIL != cdolist_list_var) {
            final SubLObject keep_nart = number_utilities.maximum(narts, (SubLObject)kb_cleanup.$sym58$NUM_INDEX);
            final SubLObject kill_narts = Sequences.remove(keep_nart, narts, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
            result = ConsesLow.nconc(kill_narts, result);
            cdolist_list_var = cdolist_list_var.rest();
            narts = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 20851L)
    public static SubLObject kill_duplicate_narts() {
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        SubLObject cdolist_list_var = duplicate_narts_to_kill();
        SubLObject nart = (SubLObject)kb_cleanup.NIL;
        nart = cdolist_list_var.first();
        while (kb_cleanup.NIL != cdolist_list_var) {
            if (kb_cleanup.NIL != nart_handles.valid_nartP(nart, (SubLObject)kb_cleanup.UNPROVIDED)) {
                cyc_kernel.cyc_kill(nart);
            }
            count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            nart = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 21045L)
    public static SubLObject duplicate_assertion_tuples(SubLObject ids) {
        if (ids == kb_cleanup.UNPROVIDED) {
            ids = (SubLObject)kb_cleanup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_cleanup.NIL != ids) {
            final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_cleanup.EQUAL), (SubLObject)kb_cleanup.UNPROVIDED);
            final SubLObject progress_message = Sequences.cconcatenate((SubLObject)kb_cleanup.$str59$Examining_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(ids)), kb_cleanup.$str60$_assertions_for_duplication });
            final SubLObject list_var = ids;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != progress_message) ? progress_message : kb_cleanup.$str2$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject id = (SubLObject)kb_cleanup.NIL;
                    id = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        consider_that_assertion_could_be_duplicate(assertion_handles.find_assertion_by_id(id), dict, (SubLObject)kb_cleanup.T);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        id = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
            return duplicate_tuples_from_dictionary(dict);
        }
        final SubLObject mt_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_cleanup.EQUAL), (SubLObject)kb_cleanup.UNPROVIDED);
        SubLObject tuples = (SubLObject)kb_cleanup.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_cleanup.$str61$Examining_all_assertions_for_dupl;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        assert kb_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$71 = idx;
                if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$71, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                    final SubLObject idx_$72 = idx_$71;
                    if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$72, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$72);
                        final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                            a_id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                if (kb_cleanup.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_cleanup.$kw14$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                group_assertion_by_mt(ass, mt_dict);
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$73 = idx_$71;
                    if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$73) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$73);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$73);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$73);
                        final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                group_assertion_by_mt(ass2, mt_dict);
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
        }
        SubLObject assertion_num = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject assertion_total = assertion_handles.assertion_count();
        final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)kb_cleanup.$str62$Examining_all_assertions_for_dupl);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_dict)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject assertions_in_an_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject dict_in_an_mt = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_cleanup.EQUAL), (SubLObject)kb_cleanup.UNPROVIDED);
                    SubLObject cdolist_list_var = assertions_in_an_mt;
                    SubLObject ass2 = (SubLObject)kb_cleanup.NIL;
                    ass2 = cdolist_list_var.first();
                    while (kb_cleanup.NIL != cdolist_list_var) {
                        consider_that_assertion_could_be_duplicate(ass2, dict_in_an_mt, (SubLObject)kb_cleanup.NIL);
                        assertion_num = Numbers.add(assertion_num, (SubLObject)kb_cleanup.ONE_INTEGER);
                        utilities_macros.note_percent_progress(assertion_num, assertion_total);
                        cdolist_list_var = cdolist_list_var.rest();
                        ass2 = cdolist_list_var.first();
                    }
                    tuples = ConsesLow.nconc(duplicate_tuples_from_dictionary(dict_in_an_mt), tuples);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            finally {
                final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 22425L)
    public static SubLObject group_assertion_by_mt(final SubLObject ass, final SubLObject mt_dict) {
        dictionary_utilities.dictionary_push(mt_dict, assertions_high.assertion_mt(ass), ass);
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 22542L)
    public static SubLObject consider_that_assertion_could_be_duplicate(final SubLObject ass, final SubLObject dict, final SubLObject consider_mtP) {
        if (kb_cleanup.NIL != assertion_handles.valid_assertionP(ass, (SubLObject)kb_cleanup.UNPROVIDED)) {
            final SubLObject key = (SubLObject)((kb_cleanup.NIL != consider_mtP) ? ConsesLow.cons(assertion_cnf_or_gaf_formula(ass), assertions_high.assertion_mt(ass)) : assertion_cnf_or_gaf_formula(ass));
            dictionary_utilities.dictionary_push(dict, key, ass);
        }
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 22883L)
    public static SubLObject assertion_cnf_or_gaf_formula(final SubLObject ass) {
        if (kb_cleanup.NIL != assertions_high.gaf_assertionP(ass)) {
            return assertions_high.gaf_el_formula(ass);
        }
        return assertions_high.assertion_cnf(ass);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 23032L)
    public static SubLObject duplicate_tuples_from_dictionary(final SubLObject dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = (SubLObject)kb_cleanup.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject assertions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_cleanup.NIL == list_utilities.singletonP(assertions)) {
                final SubLObject sorted_assertions = put_the_keeper_first(assertions);
                tuples = (SubLObject)ConsesLow.cons(sorted_assertions, tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 23326L)
    public static SubLObject put_the_keeper_first(final SubLObject assertions) {
        final SubLObject clean = Sequences.remove_if((SubLObject)kb_cleanup.$sym63$CANONICALIZER_PROBLEM_, assertions, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        if (kb_cleanup.NIL != clean) {
            return list_utilities.move_to_front(clean.first(), assertions, (SubLObject)kb_cleanup.UNPROVIDED);
        }
        Errors.warn((SubLObject)kb_cleanup.$str64$could_not_find_an_obvious_keeper_, Mapping.mapcar((SubLObject)kb_cleanup.$sym65$ASSERTION_ID, assertions));
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 23627L)
    public static SubLObject blast_duplicate_assertions(SubLObject ids) {
        if (ids == kb_cleanup.UNPROVIDED) {
            ids = (SubLObject)kb_cleanup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject tuples = duplicate_assertion_tuples(ids);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)kb_cleanup.$str66$Blasting_approximately_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(tuples)), kb_cleanup.$str67$_duplicate_assertions });
        final SubLObject list_var = tuples;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != progress_message) ? progress_message : kb_cleanup.$str2$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject tuple = (SubLObject)kb_cleanup.NIL;
                tuple = csome_list_var.first();
                while (kb_cleanup.NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject assertions_to_blast = cdolist_list_var = tuple.rest();
                    SubLObject kill_ass = (SubLObject)kb_cleanup.NIL;
                    kill_ass = cdolist_list_var.first();
                    while (kb_cleanup.NIL != cdolist_list_var) {
                        tms.tms_remove_assertion(kill_ass);
                        if (kb_cleanup.NIL != assertion_handles.valid_assertionP(kill_ass, (SubLObject)kb_cleanup.UNPROVIDED)) {
                            Errors.warn((SubLObject)kb_cleanup.$str68$Could_not_kill__a, assertion_handles.assertion_id(kill_ass));
                        }
                        else {
                            count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        kill_ass = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    tuple = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 24172L)
    public static SubLObject blast_duplicate_assertions_without_keepers(SubLObject ids) {
        if (ids == kb_cleanup.UNPROVIDED) {
            ids = (SubLObject)kb_cleanup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_cleanup.ZERO_INTEGER;
        final SubLObject tuples = duplicate_assertion_tuples(ids);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)kb_cleanup.$str66$Blasting_approximately_, new SubLObject[] { format_nil.format_nil_a_no_copy(Numbers.multiply((SubLObject)kb_cleanup.TWO_INTEGER, Sequences.length(tuples))), kb_cleanup.$str67$_duplicate_assertions });
        final SubLObject list_var = tuples;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((kb_cleanup.NIL != progress_message) ? progress_message : kb_cleanup.$str2$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject tuple = (SubLObject)kb_cleanup.NIL;
                tuple = csome_list_var.first();
                while (kb_cleanup.NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject assertions_to_blast = cdolist_list_var = tuple;
                    SubLObject kill_ass = (SubLObject)kb_cleanup.NIL;
                    kill_ass = cdolist_list_var.first();
                    while (kb_cleanup.NIL != cdolist_list_var) {
                        tms.tms_remove_assertion(kill_ass);
                        if (kb_cleanup.NIL != assertion_handles.valid_assertionP(kill_ass, (SubLObject)kb_cleanup.UNPROVIDED)) {
                            Errors.warn((SubLObject)kb_cleanup.$str68$Could_not_kill__a, assertion_handles.assertion_id(kill_ass));
                        }
                        else {
                            count = Numbers.add(count, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        kill_ass = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    tuple = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 24832L)
    public static SubLObject reconsider_assertions_with_no_arguments_verbose(SubLObject return_idsP) {
        if (return_idsP == kb_cleanup.UNPROVIDED) {
            return_idsP = (SubLObject)kb_cleanup.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject removed = cdolist_list_var = reconsider_assertions_with_no_arguments((SubLObject)kb_cleanup.$kw69$RETURN_IDS);
        SubLObject id = (SubLObject)kb_cleanup.NIL;
        id = cdolist_list_var.first();
        while (kb_cleanup.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str70$_______assertion__A_proved_unnece, id);
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        }
        return (kb_cleanup.NIL != return_idsP) ? removed : Sequences.length(removed);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 25319L)
    public static SubLObject reconsider_assertions_with_no_arguments(SubLObject return_idsP) {
        if (return_idsP == kb_cleanup.UNPROVIDED) {
            return_idsP = (SubLObject)kb_cleanup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ids = (SubLObject)kb_cleanup.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_cleanup.$str71$Redoing_TMS_on_assertions_with_no;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        assert kb_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$78 = idx;
                if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$78, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                    final SubLObject idx_$79 = idx_$78;
                    if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$79, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$79);
                        final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject id;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                            a_id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                if (kb_cleanup.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_cleanup.$kw14$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_cleanup.NIL == assertions_high.assertion_arguments(ass) && kb_cleanup.NIL != assertion_handles.valid_assertionP(ass, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                    id = assertion_handles.assertion_id(ass);
                                    tms.tms_reconsider_assertion(ass);
                                    if (kb_cleanup.NIL == assertion_handles.valid_assertionP(ass, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                        ids = (SubLObject)ConsesLow.cons(id, ids);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$80 = idx_$78;
                    if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$80) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$80);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$80);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$80);
                        final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_cleanup.NIL == assertions_high.assertion_arguments(ass2) && kb_cleanup.NIL != assertion_handles.valid_assertionP(ass2, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                    final SubLObject id2 = assertion_handles.assertion_id(ass2);
                                    tms.tms_reconsider_assertion(ass2);
                                    if (kb_cleanup.NIL == assertion_handles.valid_assertionP(ass2, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                        ids = (SubLObject)ConsesLow.cons(id2, ids);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (kb_cleanup.NIL != return_idsP) {
            return Sequences.nreverse(ids);
        }
        return Sequences.length(ids);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 26028L)
    public static SubLObject detect_multiples_via_lexicon(final SubLObject type, SubLObject default_dupe_type, SubLObject mt, SubLObject preds) {
        if (default_dupe_type == kb_cleanup.UNPROVIDED) {
            default_dupe_type = (SubLObject)kb_cleanup.$kw72$SAME;
        }
        if (mt == kb_cleanup.UNPROVIDED) {
            mt = kb_cleanup.$const73$InferencePSC;
        }
        if (preds == kb_cleanup.UNPROVIDED) {
            preds = (SubLObject)kb_cleanup.$list74;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_instances = (SubLObject)kb_cleanup.NIL;
        final SubLObject dupe_type = (default_dupe_type == kb_cleanup.$kw72$SAME) ? type : default_dupe_type;
        final SubLObject dups_dict = dictionary.new_dictionary((SubLObject)kb_cleanup.EQUALP, (SubLObject)kb_cleanup.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            v_instances = isa.all_fort_instances(type, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var = v_instances;
        final SubLObject _prev_bind_4 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)kb_cleanup.$str2$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject instance = (SubLObject)kb_cleanup.NIL;
                instance = csome_list_var.first();
                while (kb_cleanup.NIL != csome_list_var) {
                    SubLObject cdolist_list_var = pph_methods_lexicon.all_phrases_for_term(instance, preds, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                    SubLObject name = (SubLObject)kb_cleanup.NIL;
                    name = cdolist_list_var.first();
                    while (kb_cleanup.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$82;
                        final SubLObject other_denots = cdolist_list_var_$82 = Sequences.remove(instance, lexicon_accessors.typed_denots_of_string(name, dupe_type, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                        SubLObject other = (SubLObject)kb_cleanup.NIL;
                        other = cdolist_list_var_$82.first();
                        while (kb_cleanup.NIL != cdolist_list_var_$82) {
                            dictionary_utilities.dictionary_pushnew(dups_dict, name, instance, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(dups_dict, name, other, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                            cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                            other = cdolist_list_var_$82.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        name = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    instance = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_8, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_4, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dups_dict)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject denots = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format((SubLObject)kb_cleanup.T, (SubLObject)kb_cleanup.$str75$_S_____A__, string, denots);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return dictionary_utilities.dictionary_to_alist(dups_dict);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 28117L)
    public static SubLObject new_and_removed_infn_narts(final SubLObject old_kbnum, final SubLObject new_kbnum, SubLObject stream, SubLObject dir) {
        if (stream == kb_cleanup.UNPROVIDED) {
            stream = (SubLObject)kb_cleanup.T;
        }
        if (dir == kb_cleanup.UNPROVIDED) {
            dir = plot_generation.$infn_count_data_dir$.getGlobalValue();
        }
        return new_and_removed_narts(kb_cleanup.$const76$InstanceNamedFn_Ternary, old_kbnum, new_kbnum, stream, dir);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 28352L)
    public static SubLObject new_and_removed_psnfn_narts(final SubLObject old_kbnum, final SubLObject new_kbnum, SubLObject stream, SubLObject dir) {
        if (stream == kb_cleanup.UNPROVIDED) {
            stream = (SubLObject)kb_cleanup.T;
        }
        if (dir == kb_cleanup.UNPROVIDED) {
            dir = plot_generation.$infn_count_data_dir$.getGlobalValue();
        }
        return new_and_removed_narts(kb_cleanup.$const77$ProperSubcollectionNamedFn_Ternar, old_kbnum, new_kbnum, stream, dir);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 28569L)
    public static SubLObject new_and_removed_narts(final SubLObject functor, final SubLObject old_kbnum, final SubLObject new_kbnum, SubLObject stream, SubLObject dir) {
        if (stream == kb_cleanup.UNPROVIDED) {
            stream = (SubLObject)kb_cleanup.T;
        }
        if (dir == kb_cleanup.UNPROVIDED) {
            dir = plot_generation.$infn_count_data_dir$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject narts_in_old_kb = functor_narts_in_kb(functor, old_kbnum, dir);
        final SubLObject narts_in_new_kb = functor_narts_in_kb(functor, new_kbnum, dir);
        final SubLObject all_narts = set_utilities.set_union((SubLObject)ConsesLow.list(narts_in_old_kb, narts_in_new_kb), (SubLObject)kb_cleanup.EQUAL);
        final SubLObject common_narts = set_utilities.set_intersection((SubLObject)ConsesLow.list(narts_in_old_kb, narts_in_new_kb), (SubLObject)kb_cleanup.EQUAL);
        final SubLObject new_narts = set_utilities.set_minus(narts_in_new_kb, common_narts, (SubLObject)kb_cleanup.EQUAL);
        final SubLObject departed_narts = set_utilities.set_minus(all_narts, narts_in_new_kb, (SubLObject)kb_cleanup.EQUAL);
        PrintLow.format(stream, (SubLObject)kb_cleanup.$str78$_A_new_narts_added_between_KB__S_, new SubLObject[] { set.set_size(new_narts), old_kbnum, new_kbnum });
        PrintLow.format(stream, (SubLObject)kb_cleanup.$str79$_A_narts_departed_between_KB__S_a, new SubLObject[] { set.set_size(departed_narts), old_kbnum, new_kbnum });
        PrintLow.format(stream, (SubLObject)kb_cleanup.$str80$____________________New_NARTs____);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)kb_cleanup.NIL, thread);
            SubLObject set_contents_var = set.do_set_internal(new_narts);
            SubLObject basis_object;
            SubLObject state;
            SubLObject nart;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_cleanup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                nart = set_contents.do_set_contents_next(basis_object, state);
                if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                    PrintLow.format(stream, (SubLObject)kb_cleanup.$str81$_S__, nart);
                }
            }
            PrintLow.format(stream, (SubLObject)kb_cleanup.$str82$____________________Departed_NART);
            set_contents_var = set.do_set_internal(departed_narts);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_cleanup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                nart = set_contents.do_set_contents_next(basis_object, state);
                if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                    PrintLow.format(stream, (SubLObject)kb_cleanup.$str81$_S__, nart);
                }
            }
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(set.set_size(new_narts), set.set_size(departed_narts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 29762L)
    public static SubLObject clear_functor_narts_in_kb() {
        final SubLObject cs = kb_cleanup.$functor_narts_in_kb_caching_state$.getGlobalValue();
        if (kb_cleanup.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 29762L)
    public static SubLObject remove_functor_narts_in_kb(final SubLObject functor, final SubLObject kb_num, final SubLObject dir) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_cleanup.$functor_narts_in_kb_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(functor, kb_num, dir), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 29762L)
    public static SubLObject functor_narts_in_kb_internal(final SubLObject functor, final SubLObject kb_num, final SubLObject dir) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart_file = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(dir), new SubLObject[] { kb_cleanup.$str84$KB_, format_nil.format_nil_a_no_copy(kb_num), kb_cleanup.$str85$_, format_nil.format_nil_a_no_copy(kb_paths.fort_name(functor)), kb_cleanup.$str86$_NARTS_txt });
        final SubLObject narts = set.new_set((SubLObject)kb_cleanup.EQUAL, (SubLObject)kb_cleanup.UNPROVIDED);
        Errors.warn((SubLObject)kb_cleanup.$str87$Getting__A_narts_for_KB__S__, functor, kb_num);
        SubLObject stream = (SubLObject)kb_cleanup.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_cleanup.NIL, thread);
                stream = compatibility.open_text(nart_file, (SubLObject)kb_cleanup.$kw88$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_cleanup.$str89$Unable_to_open__S, nart_file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject line_value;
                for (line = (SubLObject)kb_cleanup.NIL, line = file_utilities.cdolines_get_next_line(infile); kb_cleanup.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    line_value = reader.read_from_string_ignoring_errors(line, (SubLObject)kb_cleanup.NIL, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                    if (kb_cleanup.NIL != cycl_grammar.cycl_nat_p(line_value)) {
                        set.set_add(line_value, narts);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_cleanup.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return narts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 29762L)
    public static SubLObject functor_narts_in_kb(final SubLObject functor, final SubLObject kb_num, final SubLObject dir) {
        SubLObject caching_state = kb_cleanup.$functor_narts_in_kb_caching_state$.getGlobalValue();
        if (kb_cleanup.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_cleanup.$sym83$FUNCTOR_NARTS_IN_KB, (SubLObject)kb_cleanup.$sym90$_FUNCTOR_NARTS_IN_KB_CACHING_STATE_, (SubLObject)kb_cleanup.NIL, (SubLObject)kb_cleanup.EQUAL, (SubLObject)kb_cleanup.THREE_INTEGER, (SubLObject)kb_cleanup.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(functor, kb_num, dir);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)kb_cleanup.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)kb_cleanup.NIL;
            collision = cdolist_list_var.first();
            while (kb_cleanup.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (functor.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (kb_num.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (kb_cleanup.NIL != cached_args && kb_cleanup.NIL == cached_args.rest() && dir.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(functor_narts_in_kb_internal(functor, kb_num, dir)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(functor, kb_num, dir));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 30429L)
    public static SubLObject fcp_sweep(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kb_cleanup.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)kb_cleanup.$kw92$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_cleanup.$str89$Unable_to_open__S, filename);
            }
            final SubLObject stream_$84 = stream;
            PrintLow.format(stream_$84, (SubLObject)kb_cleanup.$str93$___functionCorrespondingPredicate, numeric_date_utilities.timestring((SubLObject)kb_cleanup.UNPROVIDED));
            final SubLObject list_var;
            final SubLObject functions = list_var = functions_for_fcp_sweep();
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kb_cleanup.$str94$Writing_KE_text___, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject func = (SubLObject)kb_cleanup.NIL;
                    func = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        print_high.princ(ke_text_for_unary_function_fcp(func), stream_$84);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        func = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_cleanup.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 30810L)
    public static SubLObject functions_for_fcp_sweep() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_cleanup.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_cleanup.$const7$EverythingPSC, thread);
            final SubLObject list_var = isa.all_instances(kb_cleanup.$const95$UnaryFunction, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$87 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kb_cleanup.$str96$Gathering_functions___, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject func = (SubLObject)kb_cleanup.NIL;
                    func = csome_list_var.first();
                    while (kb_cleanup.NIL != csome_list_var) {
                        if (kb_cleanup.NIL != constant_handles.constant_p(func) && kb_cleanup.NIL == list_utilities.member_kbeqP(func, kb_cleanup.$functions_to_skip_for_fcp_sweep$.getGlobalValue()) && kb_cleanup.NIL == relation_evaluation.evaluatable_functionP(func) && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(func) && kb_cleanup.NIL == inference_trivial.new_cyc_trivial_query((SubLObject)ConsesLow.listS(kb_cleanup.$const97$functionCorrespondingPredicate_Ge, func, (SubLObject)kb_cleanup.$list98), kb_cleanup.$const73$InferencePSC, (SubLObject)kb_cleanup.$list99)) {
                            result = (SubLObject)ConsesLow.cons(func, result);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        func = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$87, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$86, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(result, (SubLObject)kb_cleanup.$sym100$FCP_FUNC__, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 31365L)
    public static SubLObject fcp_func_G(final SubLObject func1, final SubLObject func2) {
        final SubLObject num1 = kb_indexing.num_index(func1);
        final SubLObject num2 = kb_indexing.num_index(func2);
        if (num1.numG(num2)) {
            return (SubLObject)kb_cleanup.T;
        }
        if (num1.numL(num2)) {
            return (SubLObject)kb_cleanup.NIL;
        }
        return Strings.stringL(kb_paths.fort_name(func1), kb_paths.fort_name(func2), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 31612L)
    public static SubLObject ke_text_for_unary_function_fcp(final SubLObject func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_cleanup.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(kb_cleanup.$const101$UniversalVocabularyMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Sequences.cconcatenate((SubLObject)kb_cleanup.$str102$____, new SubLObject[] { format_nil.format_nil_a_no_copy(func), kb_cleanup.$str103$_constant__, format_nil.format_nil_a_no_copy(fcp_name(func)), kb_cleanup.$str104$_, format_nil.format_nil_a_no_copy(fcp_blake_note(func)), kb_cleanup.$str105$_in_mt__UniversalVocabularyMt__is, format_nil.format_nil_a_no_copy(fcp_arg1_isa(func)), kb_cleanup.$str106$__arg2Isa__, format_nil.format_nil_a_no_copy(fcp_arg2_isa(func)), kb_cleanup.$str107$__arg2Format__singleEntryFormatIn, format_nil.format_nil_s_no_copy(fcp_comment(func)), kb_cleanup.$str108$__f___functionCorrespondingPredic, format_nil.format_nil_a_no_copy(func), kb_cleanup.$str109$_, format_nil.format_nil_a_no_copy(fcp_name(func)), kb_cleanup.$str110$_2____ });
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 32200L)
    public static SubLObject fcp_name(final SubLObject func) {
        if (kb_cleanup.NIL == fcp_name_clashP(func)) {
            return fcp_name_int(func);
        }
        final SubLObject new_name = Sequences.cconcatenate(fcp_name_int(func), (SubLObject)kb_cleanup.$str111$Of);
        if (kb_cleanup.NIL != constants_high.find_constant(new_name) || kb_cleanup.NIL != constant_completion_high.constant_name_case_collision(new_name)) {
            return Sequences.cconcatenate((SubLObject)kb_cleanup.$str112$blakePleaseRenameThis_ItsTheFunct, constants_high.constant_name(func));
        }
        return new_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 32580L)
    public static SubLObject fcp_name_clashP(final SubLObject func) {
        final SubLObject proposed_name = fcp_name_int(func);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL != constants_high.find_constant(proposed_name) || kb_cleanup.NIL != constant_completion_high.constant_name_case_collision(proposed_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 32766L)
    public static SubLObject fcp_name_int(final SubLObject func) {
        if (kb_cleanup.NIL != string_utilities.ends_with(constants_high.constant_name(func), (SubLObject)kb_cleanup.$str113$Fn, (SubLObject)kb_cleanup.UNPROVIDED)) {
            return fcp_predify_function_name(constants_high.constant_name(func));
        }
        if (kb_cleanup.NIL != fcp_ends_with_fn_but_has_a_dashed_bit_at_the_endP(func)) {
            final SubLObject name = constants_high.constant_name(func);
            final SubLObject pos = string_utilities.search_last((SubLObject)kb_cleanup.$str114$Fn_, name, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
            final SubLObject dash_pos = Numbers.add(pos, (SubLObject)kb_cleanup.TWO_INTEGER);
            final SubLObject first_bit = string_utilities.substring(name, (SubLObject)kb_cleanup.ZERO_INTEGER, dash_pos);
            final SubLObject second_bit = string_utilities.substring(name, dash_pos, Sequences.length(name));
            return Sequences.cconcatenate(fcp_predify_function_name(first_bit), second_bit);
        }
        if (kb_cleanup.NIL != isa.isaP(func, kb_cleanup.$const115$UnitOfMeasureConcept, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED)) {
            return string_utilities.uncapitalize_first(Sequences.cconcatenate(constants_high.constant_name(func), (SubLObject)kb_cleanup.$str116$versionOf));
        }
        return Sequences.cconcatenate((SubLObject)kb_cleanup.$str112$blakePleaseRenameThis_ItsTheFunct, constants_high.constant_name(func));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 33477L)
    public static SubLObject fcp_blake_note(final SubLObject func) {
        if (kb_cleanup.NIL != fcp_name_clashP(func)) {
            return (SubLObject)kb_cleanup.$str117$____Blake__check_this_out_;
        }
        return (SubLObject)kb_cleanup.$str118$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 33606L)
    public static SubLObject fcp_predify_function_name(final SubLObject name) {
        return string_utilities.uncapitalize_first(string_utilities.substring(name, (SubLObject)kb_cleanup.ZERO_INTEGER, Numbers.subtract(Sequences.length(name), (SubLObject)kb_cleanup.TWO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 33725L)
    public static SubLObject fcp_ends_with_fn_but_has_a_dashed_bit_at_the_endP(final SubLObject func) {
        return string_utilities.substringP((SubLObject)kb_cleanup.$str114$Fn_, constants_high.constant_name(func), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 33850L)
    public static SubLObject fcp_arg1_isa(final SubLObject func) {
        return strip_outer_parens(string_utilities.str(fcp_arg1_isa_int(func)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 33947L)
    public static SubLObject fcp_arg2_isa(final SubLObject func) {
        return strip_outer_parens(string_utilities.str(fcp_result_isa_int(func)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 34046L)
    public static SubLObject fcp_comment(final SubLObject func) {
        return Sequences.cconcatenate((SubLObject)kb_cleanup.$str119$A_predicate_corresponding_to_the_, new SubLObject[] { format_nil.format_nil_a_no_copy(func), kb_cleanup.$str120$____code____, format_nil.format_nil_a_no_copy(fcp_name(func)), kb_cleanup.$str121$_X__, format_nil.format_nil_a_no_copy(func), kb_cleanup.$str122$_X____code__will_always_be_true_f });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 34350L)
    public static SubLObject fcp_arg1_isa_int(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1_isa = kb_accessors.arg1_isa(relation, (SubLObject)kb_cleanup.UNPROVIDED);
        if (kb_cleanup.NIL == arg1_isa) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(kb_cleanup.$const7$EverythingPSC, thread);
                arg1_isa = kb_accessors.arg1_isa(relation, (SubLObject)kb_cleanup.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (kb_cleanup.NIL == arg1_isa) {
            arg1_isa = (SubLObject)kb_cleanup.$list123;
        }
        return cycl_utilities.hl_to_el(genls.min_cols(arg1_isa, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 34619L)
    public static SubLObject fcp_result_isa_int(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_isa = kb_accessors.result_isa(relation, (SubLObject)kb_cleanup.UNPROVIDED);
        if (kb_cleanup.NIL == result_isa) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(kb_cleanup.$const7$EverythingPSC, thread);
                result_isa = kb_accessors.result_isa(relation, (SubLObject)kb_cleanup.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (kb_cleanup.NIL == result_isa) {
            result_isa = (SubLObject)kb_cleanup.$list123;
        }
        return cycl_utilities.hl_to_el(genls.min_cols(result_isa, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 34905L)
    public static SubLObject strip_outer_parens(final SubLObject string) {
        return string_utilities.substring(string, (SubLObject)kb_cleanup.ONE_INTEGER, Numbers.subtract(Sequences.length(string), (SubLObject)kb_cleanup.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 35018L)
    public static SubLObject something(final SubLObject func) {
        return (SubLObject)ConsesLow.list(func, fcp_name(func));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 35089L)
    public static SubLObject assertions_with_more_than_one_belief() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_cleanup.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_cleanup.$str124$Looking_for_assertions_with_more_;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
        assert kb_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$89 = idx;
                if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$89, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                    final SubLObject idx_$90 = idx_$89;
                    if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$90, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$90);
                        final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                            a_id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                if (kb_cleanup.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_cleanup.$kw14$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_cleanup.NIL != assertion_has_more_than_one_belief(ass)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$91 = idx_$89;
                    if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$91) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$91);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$91);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$91);
                        final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_cleanup.NIL != assertion_has_more_than_one_belief(ass2)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 35423L)
    public static SubLObject assertion_has_more_than_one_belief(final SubLObject assertion) {
        final SubLObject belief_count = Sequences.count_if((SubLObject)kb_cleanup.$sym125$BELIEF_P, assertions_high.assertion_arguments(assertion), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
        if (belief_count.numG((SubLObject)kb_cleanup.ONE_INTEGER)) {
            return belief_count;
        }
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 35865L)
    public static SubLObject fixed_arity_relations_without_arities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relations = (SubLObject)kb_cleanup.NIL;
        final SubLObject node_var = kb_cleanup.$const126$FixedArityRelation;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$93 = node_var;
                final SubLObject deck_type = (SubLObject)kb_cleanup.$kw130$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$94 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)kb_cleanup.NIL;
                        final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((kb_cleanup.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_cleanup.NIL != tv_var) ? kb_cleanup.$sym131$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (kb_cleanup.NIL != tv_var && kb_cleanup.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_cleanup.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)kb_cleanup.$kw132$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.$str133$_A_is_not_a__A, tv_var, (SubLObject)kb_cleanup.$sym134$SBHL_TRUE_TV_P, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_cleanup.$kw135$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)kb_cleanup.ONE_INTEGER, (SubLObject)kb_cleanup.$str136$continue_anyway, (SubLObject)kb_cleanup.$str133$_A_is_not_a__A, tv_var, (SubLObject)kb_cleanup.$sym134$SBHL_TRUE_TV_P, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_cleanup.$kw137$WARN)) {
                                    Errors.warn((SubLObject)kb_cleanup.$str133$_A_is_not_a__A, tv_var, (SubLObject)kb_cleanup.$sym134$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)kb_cleanup.$str138$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)kb_cleanup.$str136$continue_anyway, (SubLObject)kb_cleanup.$str133$_A_is_not_a__A, tv_var, (SubLObject)kb_cleanup.$sym134$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$97 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_cleanup.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa)), thread);
                                if (kb_cleanup.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_cleanup.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$97 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$98 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$101 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_cleanup.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$93, (SubLObject)kb_cleanup.UNPROVIDED);
                                        while (kb_cleanup.NIL != node_var_$93) {
                                            final SubLObject tt_node_var = node_var_$93;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa));
                                            SubLObject module_var = (SubLObject)kb_cleanup.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (kb_cleanup.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$98 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_cleanup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_cleanup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (kb_cleanup.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED));
                                                        if (kb_cleanup.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED));
                                                            if (kb_cleanup.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_cleanup.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$105;
                                                                            for (iteration_state_$105 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$105); iteration_state_$105 = dictionary_contents.do_dictionary_contents_next(iteration_state_$105)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$105);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_cleanup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (kb_cleanup.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject reln;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_cleanup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                reln = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state, reln) && kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kb_cleanup.NIL != forts.fort_p(reln) && !arity.arity(reln).isInteger() && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(reln)) {
                                                                                                        relations = (SubLObject)ConsesLow.cons(reln, relations);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject reln2 = (SubLObject)kb_cleanup.NIL;
                                                                                            reln2 = csome_list_var.first();
                                                                                            while (kb_cleanup.NIL != csome_list_var) {
                                                                                                if (kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kb_cleanup.NIL != forts.fort_p(reln2) && !arity.arity(reln2).isInteger() && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(reln2)) {
                                                                                                        relations = (SubLObject)ConsesLow.cons(reln2, relations);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                reln2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_cleanup.$str139$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$100, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$105);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$99, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_cleanup.FIVE_INTEGER, (SubLObject)kb_cleanup.$str140$attempting_to_bind_direction_link, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                                                        }
                                                        if (kb_cleanup.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)kb_cleanup.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (kb_cleanup.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)kb_cleanup.NIL;
                                                                SubLObject mt2 = (SubLObject)kb_cleanup.NIL;
                                                                SubLObject tv2 = (SubLObject)kb_cleanup.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_cleanup.$list141);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_cleanup.$list141);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_cleanup.$list141);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (kb_cleanup.NIL == current) {
                                                                    if (kb_cleanup.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$101 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (kb_cleanup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$102 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (kb_cleanup.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject reln;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_cleanup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            reln = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state, reln) && kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (kb_cleanup.NIL != forts.fort_p(reln) && !arity.arity(reln).isInteger() && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(reln)) {
                                                                                                    relations = (SubLObject)ConsesLow.cons(reln, relations);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$109 = sol;
                                                                                        SubLObject reln2 = (SubLObject)kb_cleanup.NIL;
                                                                                        reln2 = csome_list_var_$109.first();
                                                                                        while (kb_cleanup.NIL != csome_list_var_$109) {
                                                                                            if (kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (kb_cleanup.NIL != forts.fort_p(reln2) && !arity.arity(reln2).isInteger() && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(reln2)) {
                                                                                                    relations = (SubLObject)ConsesLow.cons(reln2, relations);
                                                                                                }
                                                                                            }
                                                                                            csome_list_var_$109 = csome_list_var_$109.rest();
                                                                                            reln2 = csome_list_var_$109.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)kb_cleanup.$str139$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$102, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$101, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_cleanup.$list141);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (kb_cleanup.NIL != obsolete.cnat_p(node, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$110;
                                                        final SubLObject new_list = cdolist_list_var_$110 = ((kb_cleanup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)kb_cleanup.NIL;
                                                        generating_fn = cdolist_list_var_$110.first();
                                                        while (kb_cleanup.NIL != cdolist_list_var_$110) {
                                                            final SubLObject _prev_bind_0_$103 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (kb_cleanup.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject reln3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_cleanup.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        reln3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state2, reln3) && kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(reln3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (kb_cleanup.NIL != forts.fort_p(reln3) && !arity.arity(reln3).isInteger() && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(reln3)) {
                                                                                relations = (SubLObject)ConsesLow.cons(reln3, relations);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject reln4 = (SubLObject)kb_cleanup.NIL;
                                                                    reln4 = csome_list_var3.first();
                                                                    while (kb_cleanup.NIL != csome_list_var3) {
                                                                        if (kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(reln4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (kb_cleanup.NIL != forts.fort_p(reln4) && !arity.arity(reln4).isInteger() && kb_cleanup.NIL == hl_prototypes.hl_prototypical_instanceP(reln4)) {
                                                                                relations = (SubLObject)ConsesLow.cons(reln4, relations);
                                                                            }
                                                                        }
                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                        reln4 = csome_list_var3.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_cleanup.$str139$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$103, thread);
                                                            }
                                                            cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                                                            generating_fn = cdolist_list_var_$110.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$99, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$98, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_cleanup.$const127$isa)));
                                            SubLObject module_var2 = (SubLObject)kb_cleanup.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (kb_cleanup.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$104 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$100 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_cleanup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_cleanup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$93);
                                                    if (kb_cleanup.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED));
                                                        if (kb_cleanup.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED));
                                                            if (kb_cleanup.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_cleanup.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$106;
                                                                            for (iteration_state_$106 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kb_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$106); iteration_state_$106 = dictionary_contents.do_dictionary_contents_next(iteration_state_$106)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$106);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_cleanup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (kb_cleanup.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kb_cleanup.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_cleanup.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)kb_cleanup.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (kb_cleanup.NIL != csome_list_var4) {
                                                                                                if (kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_cleanup.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_cleanup.$str139$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$106, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$106);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$105, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_cleanup.FIVE_INTEGER, (SubLObject)kb_cleanup.$str140$attempting_to_bind_direction_link, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (kb_cleanup.NIL != obsolete.cnat_p(node2, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$111;
                                                        final SubLObject new_list2 = cdolist_list_var_$111 = ((kb_cleanup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)kb_cleanup.NIL;
                                                        generating_fn2 = cdolist_list_var_$111.first();
                                                        while (kb_cleanup.NIL != cdolist_list_var_$111) {
                                                            final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (kb_cleanup.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kb_cleanup.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kb_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (kb_cleanup.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_cleanup.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)kb_cleanup.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (kb_cleanup.NIL != csome_list_var5) {
                                                                        if (kb_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_cleanup.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_cleanup.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_cleanup.$str139$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$107, thread);
                                                            }
                                                            cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                                                            generating_fn2 = cdolist_list_var_$111.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$100, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$104, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$93 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$101, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$98, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$97, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)kb_cleanup.TWO_INTEGER, (SubLObject)kb_cleanup.$str142$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_cleanup.UNPROVIDED)), (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$97, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$96, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$96, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$95, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$94, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(relations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 36260L)
    public static SubLObject fix_fixed_arity_relations_without_arities() {
        SubLObject cdolist_list_var = fixed_arity_relations_without_arities();
        SubLObject relation = (SubLObject)kb_cleanup.NIL;
        relation = cdolist_list_var.first();
        while (kb_cleanup.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$121 = kb_mapping_utilities.pred_value_gafs(relation, kb_cleanup.$const127$isa, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED);
            SubLObject a = (SubLObject)kb_cleanup.NIL;
            a = cdolist_list_var_$121.first();
            while (kb_cleanup.NIL != cdolist_list_var_$121) {
                if (kb_cleanup.NIL != genls.genlsP(assertions_high.gaf_arg2(a), kb_cleanup.$const126$FixedArityRelation, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED)) {
                    ke.ke_repropagate_assertion(a);
                }
                cdolist_list_var_$121 = cdolist_list_var_$121.rest();
                a = cdolist_list_var_$121.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            relation = cdolist_list_var.first();
        }
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 36725L)
    public static SubLObject tou_assertion_goodP(final SubLObject tou_assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.$kw4$TRUE == assertions_high.assertion_truth(tou_assertion) && kb_cleanup.NIL != nart_handles.nart_p(assertions_high.gaf_arg1(tou_assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 37022L)
    public static SubLObject fort_has_genls_assertion_but_is_not_a_collectionP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL != kb_mapping_utilities.fpred_value_in_any_mt(fort, kb_cleanup.$const143$genls, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED, (SubLObject)kb_cleanup.UNPROVIDED) && kb_cleanup.NIL == fort_types_interface.collectionP(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-cleanup.lisp", position = 37183L)
    public static SubLObject fix_forts_with_genls_but_not_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_cleanup.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_cleanup.$const7$EverythingPSC, thread);
            final SubLObject message = (SubLObject)kb_cleanup.$str144$Fixing_all_FORTs_with___genls_ass;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = (SubLObject)kb_cleanup.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$122 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$123 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = (SubLObject)kb_cleanup.NIL;
                    table_var = cdolist_list_var.first();
                    while (kb_cleanup.NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (kb_cleanup.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                            final SubLObject idx_$124 = idx;
                            if (kb_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$124, (SubLObject)kb_cleanup.$kw14$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$124);
                                final SubLObject backwardP_var = (SubLObject)kb_cleanup.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject pred_var;
                                SubLObject iterator_var;
                                SubLObject done_var;
                                SubLObject token_var;
                                SubLObject final_index_spec;
                                SubLObject valid;
                                SubLObject final_index_iterator;
                                SubLObject done_var_$125;
                                SubLObject token_var_$126;
                                SubLObject v_assert;
                                SubLObject valid_$127;
                                SubLObject _prev_bind_0_$123;
                                SubLObject _values;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_cleanup.NIL, v_iteration = (SubLObject)kb_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER)) {
                                    id = ((kb_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_cleanup.ONE_INTEGER) : v_iteration);
                                    fort = Vectors.aref(vector_var, id);
                                    if (kb_cleanup.NIL == id_index.id_index_tombstone_p(fort) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                        if (kb_cleanup.NIL != id_index.id_index_tombstone_p(fort)) {
                                            fort = (SubLObject)kb_cleanup.$kw14$SKIP;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        if (kb_cleanup.NIL != fort_has_genls_assertion_but_is_not_a_collectionP(fort)) {
                                            pred_var = kb_cleanup.$const143$genls;
                                            if (kb_cleanup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)kb_cleanup.ONE_INTEGER, pred_var)) {
                                                iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)kb_cleanup.ONE_INTEGER, pred_var);
                                                done_var = (SubLObject)kb_cleanup.NIL;
                                                token_var = (SubLObject)kb_cleanup.NIL;
                                                while (kb_cleanup.NIL == done_var) {
                                                    final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                    if (kb_cleanup.NIL != valid) {
                                                        final_index_iterator = (SubLObject)kb_cleanup.NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_cleanup.$kw8$GAF, (SubLObject)kb_cleanup.NIL, (SubLObject)kb_cleanup.NIL);
                                                            done_var_$125 = (SubLObject)kb_cleanup.NIL;
                                                            token_var_$126 = (SubLObject)kb_cleanup.NIL;
                                                            while (kb_cleanup.NIL == done_var_$125) {
                                                                v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$126);
                                                                valid_$127 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$126.eql(v_assert));
                                                                if (kb_cleanup.NIL != valid_$127 && kb_cleanup.NIL != assertions_high.asserted_assertionP(v_assert)) {
                                                                    ke.ke_repropagate_assertion_now(v_assert);
                                                                }
                                                                done_var_$125 = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid_$127);
                                                            }
                                                        }
                                                        finally {
                                                            _prev_bind_0_$123 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                                                                _values = Values.getValuesAsVector();
                                                                if (kb_cleanup.NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$125 = idx;
                            if (kb_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$125) || kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$125);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$125);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$125);
                                final SubLObject v_default = (SubLObject)((kb_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP)) ? kb_cleanup.NIL : kb_cleanup.$kw14$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (kb_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_cleanup.$kw14$SKIP) || kb_cleanup.NIL == id_index.id_index_tombstone_p(fort2)) {
                                        sofar = Numbers.add(sofar, (SubLObject)kb_cleanup.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        if (kb_cleanup.NIL != fort_has_genls_assertion_but_is_not_a_collectionP(fort2)) {
                                            final SubLObject pred_var2 = kb_cleanup.$const143$genls;
                                            if (kb_cleanup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort2, (SubLObject)kb_cleanup.ONE_INTEGER, pred_var2)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort2, (SubLObject)kb_cleanup.ONE_INTEGER, pred_var2);
                                                SubLObject done_var2 = (SubLObject)kb_cleanup.NIL;
                                                final SubLObject token_var2 = (SubLObject)kb_cleanup.NIL;
                                                while (kb_cleanup.NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (kb_cleanup.NIL != valid2) {
                                                        SubLObject final_index_iterator2 = (SubLObject)kb_cleanup.NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kb_cleanup.$kw8$GAF, (SubLObject)kb_cleanup.NIL, (SubLObject)kb_cleanup.NIL);
                                                            SubLObject done_var_$126 = (SubLObject)kb_cleanup.NIL;
                                                            final SubLObject token_var_$127 = (SubLObject)kb_cleanup.NIL;
                                                            while (kb_cleanup.NIL == done_var_$126) {
                                                                final SubLObject v_assert2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$127);
                                                                final SubLObject valid_$128 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$127.eql(v_assert2));
                                                                if (kb_cleanup.NIL != valid_$128 && kb_cleanup.NIL != assertions_high.asserted_assertionP(v_assert2)) {
                                                                    ke.ke_repropagate_assertion_now(v_assert2);
                                                                }
                                                                done_var_$126 = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid_$128);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                                if (kb_cleanup.NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                Values.restoreValuesFromVector(_values2);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_cleanup.NIL == valid2);
                                                }
                                            }
                                        }
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)kb_cleanup.ONE_INTEGER);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$125 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_cleanup.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$123, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$122, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_cleanup.NIL;
    }
    
    public static SubLObject declare_kb_cleanup_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_unneeded_knowledge", "FORGET-UNNEEDED-KNOWLEDGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_ephemeral_terms", "FORGET-EPHEMERAL-TERMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "ephemeral_term_count", "EPHEMERAL-TERM-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "ephemeral_termP", "EPHEMERAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "strictly_ephemeral_term_count", "STRICTLY-EPHEMERAL-TERM-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "strictly_ephemeral_termP", "STRICTLY-EPHEMERAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "all_ephemeral_terms", "ALL-EPHEMERAL-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "all_strictly_ephemeral_terms", "ALL-STRICTLY-EPHEMERAL-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "naked_in_progress_termP", "NAKED-IN-PROGRESS-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "nothing_said_about_in_progress_termP", "NOTHING-SAID-ABOUT-IN-PROGRESS-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "all_naked_in_progress_terms", "ALL-NAKED-IN-PROGRESS-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "naked_in_progress_term_count", "NAKED-IN-PROGRESS-TERM-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "all_naked_in_progress_terms_internal", "ALL-NAKED-IN-PROGRESS-TERMS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_ephemeral_term", "FORGET-EPHEMERAL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_ill_formed_skolems", "FORGET-ILL-FORMED-SKOLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_useless_skolems", "FORGET-USELESS-SKOLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_useless_narts", "FORGET-USELESS-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "gather_useless_narts", "GATHER-USELESS-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_narts", "FORGET-NARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_function_extent", "FORGET-FUNCTION-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_invalid_deductions_and_kb_hl_supports_until_quiesced", "FORGET-INVALID-DEDUCTIONS-AND-KB-HL-SUPPORTS-UNTIL-QUIESCED", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_syntactically_invalid_new_deductions", "FORGET-SYNTACTICALLY-INVALID-NEW-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_syntactically_invalid_new_kb_hl_supports", "FORGET-SYNTACTICALLY-INVALID-NEW-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_invalid_deductions", "FORGET-INVALID-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_invalid_deductions_serial", "FORGET-INVALID-DEDUCTIONS-SERIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "identify_invalid_deductions_serial", "IDENTIFY-INVALID-DEDUCTIONS-SERIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "identify_invalid_deductions_n_way", "IDENTIFY-INVALID-DEDUCTIONS-N-WAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "identify_invalid_deductions_worker", "IDENTIFY-INVALID-DEDUCTIONS-WORKER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "deduction_is_forgettableP", "DEDUCTION-IS-FORGETTABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "deduction_has_invalid_supportP", "DEDUCTION-HAS-INVALID-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "new_invalid_deduction_iterator", "NEW-INVALID-DEDUCTION-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_useless_kb_hl_supports", "FORGET-USELESS-KB-HL-SUPPORTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_useless_kb_hl_supports_impl", "FORGET-USELESS-KB-HL-SUPPORTS-IMPL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_old_creation_seconds", "FORGET-OLD-CREATION-SECONDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "forget_old_creation_second_date", "FORGET-OLD-CREATION-SECOND-DATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "gather_old_creation_seconds", "GATHER-OLD-CREATION-SECONDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "clean_assertion_assert_info", "CLEAN-ASSERTION-ASSERT-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "duplicate_nart_tuples", "DUPLICATE-NART-TUPLES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "duplicate_narts_to_kill", "DUPLICATE-NARTS-TO-KILL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "kill_duplicate_narts", "KILL-DUPLICATE-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "duplicate_assertion_tuples", "DUPLICATE-ASSERTION-TUPLES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "group_assertion_by_mt", "GROUP-ASSERTION-BY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "consider_that_assertion_could_be_duplicate", "CONSIDER-THAT-ASSERTION-COULD-BE-DUPLICATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "assertion_cnf_or_gaf_formula", "ASSERTION-CNF-OR-GAF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "duplicate_tuples_from_dictionary", "DUPLICATE-TUPLES-FROM-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "put_the_keeper_first", "PUT-THE-KEEPER-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "blast_duplicate_assertions", "BLAST-DUPLICATE-ASSERTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "blast_duplicate_assertions_without_keepers", "BLAST-DUPLICATE-ASSERTIONS-WITHOUT-KEEPERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "reconsider_assertions_with_no_arguments_verbose", "RECONSIDER-ASSERTIONS-WITH-NO-ARGUMENTS-VERBOSE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "reconsider_assertions_with_no_arguments", "RECONSIDER-ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "detect_multiples_via_lexicon", "DETECT-MULTIPLES-VIA-LEXICON", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "new_and_removed_infn_narts", "NEW-AND-REMOVED-INFN-NARTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "new_and_removed_psnfn_narts", "NEW-AND-REMOVED-PSNFN-NARTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "new_and_removed_narts", "NEW-AND-REMOVED-NARTS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "clear_functor_narts_in_kb", "CLEAR-FUNCTOR-NARTS-IN-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "remove_functor_narts_in_kb", "REMOVE-FUNCTOR-NARTS-IN-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "functor_narts_in_kb_internal", "FUNCTOR-NARTS-IN-KB-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "functor_narts_in_kb", "FUNCTOR-NARTS-IN-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_sweep", "FCP-SWEEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "functions_for_fcp_sweep", "FUNCTIONS-FOR-FCP-SWEEP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_func_G", "FCP-FUNC->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "ke_text_for_unary_function_fcp", "KE-TEXT-FOR-UNARY-FUNCTION-FCP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_name", "FCP-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_name_clashP", "FCP-NAME-CLASH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_name_int", "FCP-NAME-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_blake_note", "FCP-BLAKE-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_predify_function_name", "FCP-PREDIFY-FUNCTION-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_ends_with_fn_but_has_a_dashed_bit_at_the_endP", "FCP-ENDS-WITH-FN-BUT-HAS-A-DASHED-BIT-AT-THE-END?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_arg1_isa", "FCP-ARG1-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_arg2_isa", "FCP-ARG2-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_comment", "FCP-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_arg1_isa_int", "FCP-ARG1-ISA-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fcp_result_isa_int", "FCP-RESULT-ISA-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "strip_outer_parens", "STRIP-OUTER-PARENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "something", "SOMETHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "assertions_with_more_than_one_belief", "ASSERTIONS-WITH-MORE-THAN-ONE-BELIEF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "assertion_has_more_than_one_belief", "ASSERTION-HAS-MORE-THAN-ONE-BELIEF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fixed_arity_relations_without_arities", "FIXED-ARITY-RELATIONS-WITHOUT-ARITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fix_fixed_arity_relations_without_arities", "FIX-FIXED-ARITY-RELATIONS-WITHOUT-ARITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "tou_assertion_goodP", "TOU-ASSERTION-GOOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fort_has_genls_assertion_but_is_not_a_collectionP", "FORT-HAS-GENLS-ASSERTION-BUT-IS-NOT-A-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_cleanup", "fix_forts_with_genls_but_not_collections", "FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS", 0, 0, false);
        return (SubLObject)kb_cleanup.NIL;
    }
    
    public static SubLObject init_kb_cleanup_file() {
        kb_cleanup.$forget_old_creation_second_months$ = SubLFiles.defparameter("*FORGET-OLD-CREATION-SECOND-MONTHS*", (SubLObject)kb_cleanup.TWELVE_INTEGER);
        kb_cleanup.$functor_narts_in_kb_caching_state$ = SubLFiles.deflexical("*FUNCTOR-NARTS-IN-KB-CACHING-STATE*", (SubLObject)kb_cleanup.NIL);
        kb_cleanup.$functions_to_skip_for_fcp_sweep$ = SubLFiles.deflexical("*FUNCTIONS-TO-SKIP-FOR-FCP-SWEEP*", (SubLObject)kb_cleanup.$list91);
        kb_cleanup.$known_arityless_relations$ = SubLFiles.deflexical("*KNOWN-ARITYLESS-RELATIONS*", (SubLObject)kb_cleanup.NIL);
        return (SubLObject)kb_cleanup.NIL;
    }
    
    public static SubLObject setup_kb_cleanup_file() {
        memoization_state.note_globally_cached_function((SubLObject)kb_cleanup.$sym83$FUNCTOR_NARTS_IN_KB);
        return (SubLObject)kb_cleanup.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_cleanup_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_cleanup_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_cleanup_file();
    }
    
    static {
        me = (SubLFile)new kb_cleanup();
        kb_cleanup.$forget_old_creation_second_months$ = null;
        kb_cleanup.$functor_narts_in_kb_caching_state$ = null;
        kb_cleanup.$functions_to_skip_for_fcp_sweep$ = null;
        kb_cleanup.$known_arityless_relations$ = null;
        $str0$Forgetting_ = SubLObjectFactory.makeString("Forgetting ");
        $str1$_ephemeral_terms = SubLObjectFactory.makeString(" ephemeral terms");
        $str2$cdolist = SubLObjectFactory.makeString("cdolist");
        $const3$ephemeralTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ephemeralTerm"));
        $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const5$inProgressTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inProgressTerm"));
        $sym6$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const7$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw8$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym9$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const10$SkolemFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $str11$forgetting_useless_NARTs = SubLObjectFactory.makeString("forgetting useless NARTs");
        $str12$Gathering_useless_NARTs = SubLObjectFactory.makeString("Gathering useless NARTs");
        $sym13$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw14$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw15$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym16$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str17$Forgetting_NART__S__ = SubLObjectFactory.makeString("Forgetting NART ~S~%");
        $str18$Forgetting_the_extent_of_ = SubLObjectFactory.makeString("Forgetting the extent of ");
        $sym19$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $int20$32 = SubLObjectFactory.makeInteger(32);
        $str21$Iteration__A__Removed__A_deductio = SubLObjectFactory.makeString("Iteration ~A: Removed ~A deductions and ~A KB HL supports~%");
        $str22$forget_syntactically_invalid_new_ = SubLObjectFactory.makeString("forget-syntactically-invalid-new-kb-hl-supports hit max-iteration-count of ~A");
        $str23$Total__Removed__A_deductions_and_ = SubLObjectFactory.makeString("Total: Removed ~A deductions and ~A KB HL supports in ~A passes iteration-count~%");
        $str24$Identifying_invalid_deductions = SubLObjectFactory.makeString("Identifying invalid deductions");
        $str25$Removing_invalid_deductions = SubLObjectFactory.makeString("Removing invalid deductions");
        $str26$Identifying_invalid_kb_hl_support = SubLObjectFactory.makeString("Identifying invalid kb-hl-supports");
        $str27$Removing_invalid_kb_hl_supports = SubLObjectFactory.makeString("Removing invalid kb-hl-supports");
        $str28$Invalid_Deductions = SubLObjectFactory.makeString("Invalid Deductions");
        $str29$Removing_or_rejustifying_ = SubLObjectFactory.makeString("Removing or rejustifying ");
        $str30$_invalid_deductions = SubLObjectFactory.makeString(" invalid deductions");
        $str31$__Bad_deduction__S___S__S = SubLObjectFactory.makeString("~&Bad deduction ~S: ~S ~S");
        $str32$Finding_invalid_deductions = SubLObjectFactory.makeString("Finding invalid deductions");
        $sym33$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str34$Deduction__A_is_is_such_bad_state = SubLObjectFactory.makeString("Deduction ~A is is such bad state it cannot be analyzed: ~A~%");
        $str35$There_were__A_deductions_that_cou = SubLObjectFactory.makeString("There were ~A deductions that could not be analyzed ....");
        $str36$Invalid_Deduction_Worker_ = SubLObjectFactory.makeString("Invalid Deduction Worker ");
        $sym37$IDENTIFY_INVALID_DEDUCTIONS_WORKER = SubLObjectFactory.makeSymbol("IDENTIFY-INVALID-DEDUCTIONS-WORKER");
        $str38$Finding_invalid_deductions_using_ = SubLObjectFactory.makeString("Finding invalid deductions using ");
        $str39$_workers_____ = SubLObjectFactory.makeString(" workers ....");
        $int40$100 = SubLObjectFactory.makeInteger(100);
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKER"), (SubLObject)SubLObjectFactory.makeSymbol("CLICKER"));
        $sym42$DEDUCTION_IS_FORGETTABLE_ = SubLObjectFactory.makeSymbol("DEDUCTION-IS-FORGETTABLE?");
        $str43$__Removed_a_total_of__A_useless_K = SubLObjectFactory.makeString("~&Removed a total of ~A useless KB HL supports in ~A passes.~%");
        $str44$Pass_ = SubLObjectFactory.makeString("Pass ");
        $str45$__Identifying_useless_KB_HL_suppo = SubLObjectFactory.makeString(": Identifying useless KB HL supports");
        $str46$__Removing_useless_KB_HL_supports = SubLObjectFactory.makeString(": Removing useless KB HL supports");
        $str47$Failed_to_remove_HL_support__A___ = SubLObjectFactory.makeString("Failed to remove HL support ~A ....~%   ~A~%");
        $str48$__Removed__A_useless_KB_HL_suppor = SubLObjectFactory.makeString("~&Removed ~A useless KB HL supports during pass ~A.~%");
        $str49$Forgetting_old_creation_seconds = SubLObjectFactory.makeString("Forgetting old creation seconds");
        $const50$myCreationSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond"));
        $str51$Examining_creation_seconds = SubLObjectFactory.makeString("Examining creation seconds");
        $str52$Cleaning_KBS_assert_info = SubLObjectFactory.makeString("Cleaning KBS assert info");
        $kw53$UNCHANGED = SubLObjectFactory.makeKeyword("UNCHANGED");
        $sym54$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $const55$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $str56$Looking_for_duplicate_narts_with_ = SubLObjectFactory.makeString("Looking for duplicate narts with the same HL formula");
        $str57$__Duplicates_found___S = SubLObjectFactory.makeString("~&Duplicates found: ~S");
        $sym58$NUM_INDEX = SubLObjectFactory.makeSymbol("NUM-INDEX");
        $str59$Examining_ = SubLObjectFactory.makeString("Examining ");
        $str60$_assertions_for_duplication = SubLObjectFactory.makeString(" assertions for duplication");
        $str61$Examining_all_assertions_for_dupl = SubLObjectFactory.makeString("Examining all assertions for duplication (1/2 grouping)");
        $str62$Examining_all_assertions_for_dupl = SubLObjectFactory.makeString("Examining all assertions for duplication (2/2 considering)");
        $sym63$CANONICALIZER_PROBLEM_ = SubLObjectFactory.makeSymbol("CANONICALIZER-PROBLEM?");
        $str64$could_not_find_an_obvious_keeper_ = SubLObjectFactory.makeString("could not find an obvious keeper in ~a");
        $sym65$ASSERTION_ID = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $str66$Blasting_approximately_ = SubLObjectFactory.makeString("Blasting approximately ");
        $str67$_duplicate_assertions = SubLObjectFactory.makeString(" duplicate assertions");
        $str68$Could_not_kill__a = SubLObjectFactory.makeString("Could not kill ~a");
        $kw69$RETURN_IDS = SubLObjectFactory.makeKeyword("RETURN-IDS");
        $str70$_______assertion__A_proved_unnece = SubLObjectFactory.makeString("~& ... assertion ~A proved unnecessary.~%");
        $str71$Redoing_TMS_on_assertions_with_no = SubLObjectFactory.makeString("Redoing TMS on assertions with no arguments");
        $kw72$SAME = SubLObjectFactory.makeKeyword("SAME");
        $const73$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list74 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nicknames")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formerName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("alias")));
        $str75$_S_____A__ = SubLObjectFactory.makeString("~S -> ~A~%");
        $const76$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $const77$ProperSubcollectionNamedFn_Ternar = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperSubcollectionNamedFn-Ternary"));
        $str78$_A_new_narts_added_between_KB__S_ = SubLObjectFactory.makeString("~A new narts added between KB ~S and ~S ~%");
        $str79$_A_narts_departed_between_KB__S_a = SubLObjectFactory.makeString("~A narts departed between KB ~S and ~S ~%");
        $str80$____________________New_NARTs____ = SubLObjectFactory.makeString("====================New NARTs======================~%");
        $str81$_S__ = SubLObjectFactory.makeString("~S~%");
        $str82$____________________Departed_NART = SubLObjectFactory.makeString("====================Departed NARTs======================~%");
        $sym83$FUNCTOR_NARTS_IN_KB = SubLObjectFactory.makeSymbol("FUNCTOR-NARTS-IN-KB");
        $str84$KB_ = SubLObjectFactory.makeString("KB-");
        $str85$_ = SubLObjectFactory.makeString("-");
        $str86$_NARTS_txt = SubLObjectFactory.makeString("-NARTS.txt");
        $str87$Getting__A_narts_for_KB__S__ = SubLObjectFactory.makeString("Getting ~A narts for KB ~S~%");
        $kw88$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str89$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym90$_FUNCTOR_NARTS_IN_KB_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FUNCTOR-NARTS-IN-KB-CACHING-STATE*");
        $list91 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiQuote")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EscapeQuote")));
        $kw92$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str93$___functionCorrespondingPredicate = SubLObjectFactory.makeString(";; functionCorrespondingPredicate-Canonical sweep KE file, generated at ~a~%");
        $str94$Writing_KE_text___ = SubLObjectFactory.makeString("Writing KE text...");
        $const95$UnaryFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryFunction"));
        $str96$Gathering_functions___ = SubLObjectFactory.makeString("Gathering functions...");
        $const97$functionCorrespondingPredicate_Ge = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate-Generic"));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"));
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)kb_cleanup.ONE_INTEGER);
        $sym100$FCP_FUNC__ = SubLObjectFactory.makeSymbol("FCP-FUNC->");
        $const101$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str102$____ = SubLObjectFactory.makeString("\n;; ");
        $str103$_constant__ = SubLObjectFactory.makeString("\nconstant: ");
        $str104$_ = SubLObjectFactory.makeString(".");
        $str105$_in_mt__UniversalVocabularyMt__is = SubLObjectFactory.makeString("\nin mt: UniversalVocabularyMt.\nisa: StrictlyFunctionalSlot.\nquotedIsa: ProposedPublicConstant.\narg1Isa: ");
        $str106$__arg2Isa__ = SubLObjectFactory.makeString(".\narg2Isa: ");
        $str107$__arg2Format__singleEntryFormatIn = SubLObjectFactory.makeString(".\narg2Format: singleEntryFormatInArgs.\nstrictlyFunctionalInArgs: 2.\ncomment: ");
        $str108$__f___functionCorrespondingPredic = SubLObjectFactory.makeString(".\nf: (functionCorrespondingPredicate-Canonical ");
        $str109$_ = SubLObjectFactory.makeString(" ");
        $str110$_2____ = SubLObjectFactory.makeString(" 2).\n\n");
        $str111$Of = SubLObjectFactory.makeString("Of");
        $str112$blakePleaseRenameThis_ItsTheFunct = SubLObjectFactory.makeString("blakePleaseRenameThis-ItsTheFunctionCorrespondingPredicateFor");
        $str113$Fn = SubLObjectFactory.makeString("Fn");
        $str114$Fn_ = SubLObjectFactory.makeString("Fn-");
        $const115$UnitOfMeasureConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasureConcept"));
        $str116$versionOf = SubLObjectFactory.makeString("versionOf");
        $str117$____Blake__check_this_out_ = SubLObjectFactory.makeString(" ;; Blake, check this out.");
        $str118$ = SubLObjectFactory.makeString("");
        $str119$A_predicate_corresponding_to_the_ = SubLObjectFactory.makeString("A predicate corresponding to the function ");
        $str120$____code____ = SubLObjectFactory.makeString(".  <code>(#$");
        $str121$_X__ = SubLObjectFactory.makeString(" X (");
        $str122$_X____code__will_always_be_true_f = SubLObjectFactory.makeString(" X))</code> will always be true for <code>X</code> meeting the relevant arg constraints.");
        $list123 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $str124$Looking_for_assertions_with_more_ = SubLObjectFactory.makeString("Looking for assertions with more than one belief");
        $sym125$BELIEF_P = SubLObjectFactory.makeSymbol("BELIEF-P");
        $const126$FixedArityRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FixedArityRelation"));
        $const127$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw128$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw129$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw130$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym131$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw132$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str133$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym134$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw135$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str136$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw137$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str138$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str139$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str140$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str142$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const143$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str144$Fixing_all_FORTs_with___genls_ass = SubLObjectFactory.makeString("Fixing all FORTs with #$genls assertions are not known to be collections");
    }
}

/*

	Total time: 2920 ms
	
*/