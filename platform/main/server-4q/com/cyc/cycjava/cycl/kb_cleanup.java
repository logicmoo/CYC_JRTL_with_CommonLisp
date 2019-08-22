package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_cleanup extends SubLTranslatedFile {
    public static final SubLFile me = new kb_cleanup();

    public static final String myName = "com.cyc.cycjava.cycl.kb_cleanup";

    public static final String myFingerPrint = "c9a0937bc7640aaea2c05955e8a01229a3f872ebab0a9d81212b70702fb1e19a";

    // defparameter
    /**
     * The number of months after which #$myCreationSecond assertions are deemed
     * forgettable.
     */
    private static final SubLSymbol $forget_old_creation_second_months$ = makeSymbol("*FORGET-OLD-CREATION-SECOND-MONTHS*");



    // deflexical
    private static final SubLSymbol $functions_to_skip_for_fcp_sweep$ = makeSymbol("*FUNCTIONS-TO-SKIP-FOR-FCP-SWEEP*");

    // deflexical
    public static final SubLSymbol $known_arityless_relations$ = makeSymbol("*KNOWN-ARITYLESS-RELATIONS*");

    private static final SubLString $$$Forgetting_ = makeString("Forgetting ");

    private static final SubLString $$$_ephemeral_terms = makeString(" ephemeral terms");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLObject $$ephemeralTerm = reader_make_constant_shell(makeString("ephemeralTerm"));



    private static final SubLObject $$inProgressTerm = reader_make_constant_shell(makeString("inProgressTerm"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    private static final SubLObject $$SkolemFunction = reader_make_constant_shell(makeString("SkolemFunction"));

    private static final SubLString $$$forgetting_useless_NARTs = makeString("forgetting useless NARTs");

    private static final SubLString $$$Gathering_useless_NARTs = makeString("Gathering useless NARTs");





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str17$Forgetting_NART__S__ = makeString("Forgetting NART ~S~%");

    private static final SubLString $$$Forgetting_the_extent_of_ = makeString("Forgetting the extent of ");





    private static final SubLString $str21$Iteration__A__Removed__A_deductio = makeString("Iteration ~A: Removed ~A deductions and ~A KB HL supports~%");

    private static final SubLString $str22$forget_syntactically_invalid_new_ = makeString("forget-syntactically-invalid-new-kb-hl-supports hit max-iteration-count of ~A");

    private static final SubLString $str23$Total__Removed__A_deductions_and_ = makeString("Total: Removed ~A deductions and ~A KB HL supports in ~A passes iteration-count~%");

    private static final SubLString $$$Identifying_invalid_deductions = makeString("Identifying invalid deductions");

    private static final SubLString $$$Removing_invalid_deductions = makeString("Removing invalid deductions");

    private static final SubLString $str26$Identifying_invalid_kb_hl_support = makeString("Identifying invalid kb-hl-supports");

    private static final SubLString $str27$Removing_invalid_kb_hl_supports = makeString("Removing invalid kb-hl-supports");

    private static final SubLString $$$Invalid_Deductions = makeString("Invalid Deductions");

    private static final SubLString $$$Removing_or_rejustifying_ = makeString("Removing or rejustifying ");

    private static final SubLString $$$_invalid_deductions = makeString(" invalid deductions");

    private static final SubLString $str31$__Bad_deduction__S___S__S = makeString("~&Bad deduction ~S: ~S ~S");

    private static final SubLString $$$Finding_invalid_deductions = makeString("Finding invalid deductions");



    private static final SubLString $str34$Deduction__A_is_is_such_bad_state = makeString("Deduction ~A is is such bad state it cannot be analyzed: ~A~%");

    private static final SubLString $str35$There_were__A_deductions_that_cou = makeString("There were ~A deductions that could not be analyzed ....");

    private static final SubLString $$$Invalid_Deduction_Worker_ = makeString("Invalid Deduction Worker ");

    private static final SubLSymbol IDENTIFY_INVALID_DEDUCTIONS_WORKER = makeSymbol("IDENTIFY-INVALID-DEDUCTIONS-WORKER");

    private static final SubLString $$$Finding_invalid_deductions_using_ = makeString("Finding invalid deductions using ");

    private static final SubLString $str39$_workers_____ = makeString(" workers ....");



    private static final SubLList $list41 = list(makeSymbol("WORKER"), makeSymbol("CLICKER"));

    private static final SubLSymbol $sym42$DEDUCTION_IS_FORGETTABLE_ = makeSymbol("DEDUCTION-IS-FORGETTABLE?");

    private static final SubLString $str43$__Removed_a_total_of__A_useless_K = makeString("~&Removed a total of ~A useless KB HL supports in ~A passes.~%");

    private static final SubLString $$$Pass_ = makeString("Pass ");

    private static final SubLString $str45$__Identifying_useless_KB_HL_suppo = makeString(": Identifying useless KB HL supports");

    private static final SubLString $str46$__Removing_useless_KB_HL_supports = makeString(": Removing useless KB HL supports");

    private static final SubLString $str47$Failed_to_remove_HL_support__A___ = makeString("Failed to remove HL support ~A ....~%   ~A~%");

    private static final SubLString $str48$__Removed__A_useless_KB_HL_suppor = makeString("~&Removed ~A useless KB HL supports during pass ~A.~%");

    private static final SubLString $$$Forgetting_old_creation_seconds = makeString("Forgetting old creation seconds");

    private static final SubLObject $$myCreationSecond = reader_make_constant_shell(makeString("myCreationSecond"));

    private static final SubLString $$$Examining_creation_seconds = makeString("Examining creation seconds");

    private static final SubLString $$$Cleaning_KBS_assert_info = makeString("Cleaning KBS assert info");





    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLString $str56$Looking_for_duplicate_narts_with_ = makeString("Looking for duplicate narts with the same HL formula");

    private static final SubLString $str57$__Duplicates_found___S = makeString("~&Duplicates found: ~S");



    private static final SubLString $$$Examining_ = makeString("Examining ");

    private static final SubLString $$$_assertions_for_duplication = makeString(" assertions for duplication");

    private static final SubLString $str61$Examining_all_assertions_for_dupl = makeString("Examining all assertions for duplication (1/2 grouping)");

    private static final SubLString $str62$Examining_all_assertions_for_dupl = makeString("Examining all assertions for duplication (2/2 considering)");

    private static final SubLSymbol $sym63$CANONICALIZER_PROBLEM_ = makeSymbol("CANONICALIZER-PROBLEM?");

    private static final SubLString $str64$could_not_find_an_obvious_keeper_ = makeString("could not find an obvious keeper in ~a");



    private static final SubLString $$$Blasting_approximately_ = makeString("Blasting approximately ");

    private static final SubLString $$$_duplicate_assertions = makeString(" duplicate assertions");

    private static final SubLString $str68$Could_not_kill__a = makeString("Could not kill ~a");



    private static final SubLString $str70$_______assertion__A_proved_unnece = makeString("~& ... assertion ~A proved unnecessary.~%");

    private static final SubLString $str71$Redoing_TMS_on_assertions_with_no = makeString("Redoing TMS on assertions with no arguments");



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list74 = list(reader_make_constant_shell(makeString("nicknames")), reader_make_constant_shell(makeString("formerName")), reader_make_constant_shell(makeString("preferredNameString")), reader_make_constant_shell(makeString("nameString")), reader_make_constant_shell(makeString("alias")));

    private static final SubLString $str75$_S_____A__ = makeString("~S -> ~A~%");

    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

    private static final SubLObject $const77$ProperSubcollectionNamedFn_Ternar = reader_make_constant_shell(makeString("ProperSubcollectionNamedFn-Ternary"));

    private static final SubLString $str78$_A_new_narts_added_between_KB__S_ = makeString("~A new narts added between KB ~S and ~S ~%");

    private static final SubLString $str79$_A_narts_departed_between_KB__S_a = makeString("~A narts departed between KB ~S and ~S ~%");

    private static final SubLString $str80$____________________New_NARTs____ = makeString("====================New NARTs======================~%");

    private static final SubLString $str81$_S__ = makeString("~S~%");

    private static final SubLString $str82$____________________Departed_NART = makeString("====================Departed NARTs======================~%");

    private static final SubLSymbol FUNCTOR_NARTS_IN_KB = makeSymbol("FUNCTOR-NARTS-IN-KB");

    private static final SubLString $str84$KB_ = makeString("KB-");

    private static final SubLString $str85$_ = makeString("-");

    private static final SubLString $str86$_NARTS_txt = makeString("-NARTS.txt");

    private static final SubLString $str87$Getting__A_narts_for_KB__S__ = makeString("Getting ~A narts for KB ~S~%");



    private static final SubLString $str89$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $functor_narts_in_kb_caching_state$ = makeSymbol("*FUNCTOR-NARTS-IN-KB-CACHING-STATE*");

    public static final SubLList $list91 = list(reader_make_constant_shell(makeString("Quote")), reader_make_constant_shell(makeString("SubLQuoteFn")), reader_make_constant_shell(makeString("QuasiQuote")), reader_make_constant_shell(makeString("EscapeQuote")));



    private static final SubLString $str93$___functionCorrespondingPredicate = makeString(";; functionCorrespondingPredicate-Canonical sweep KE file, generated at ~a~%");

    private static final SubLString $str94$Writing_KE_text___ = makeString("Writing KE text...");

    private static final SubLObject $$UnaryFunction = reader_make_constant_shell(makeString("UnaryFunction"));

    private static final SubLString $str96$Gathering_functions___ = makeString("Gathering functions...");

    private static final SubLObject $const97$functionCorrespondingPredicate_Ge = reader_make_constant_shell(makeString("functionCorrespondingPredicate-Generic"));

    private static final SubLList $list98 = list(makeSymbol("?PRED"), makeSymbol("?ARGNUM"));

    private static final SubLList $list99 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $sym100$FCP_FUNC__ = makeSymbol("FCP-FUNC->");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLString $str102$____ = makeString("\n;; ");

    private static final SubLString $str103$_constant__ = makeString("\nconstant: ");

    private static final SubLString $str104$_ = makeString(".");

    private static final SubLString $str105$_in_mt__UniversalVocabularyMt__is = makeString("\nin mt: UniversalVocabularyMt.\nisa: StrictlyFunctionalSlot.\nquotedIsa: ProposedPublicConstant.\narg1Isa: ");

    private static final SubLString $str106$__arg2Isa__ = makeString(".\narg2Isa: ");

    private static final SubLString $str107$__arg2Format__singleEntryFormatIn = makeString(".\narg2Format: singleEntryFormatInArgs.\nstrictlyFunctionalInArgs: 2.\ncomment: ");

    private static final SubLString $str108$__f___functionCorrespondingPredic = makeString(".\nf: (functionCorrespondingPredicate-Canonical ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str110$_2____ = makeString(" 2).\n\n");

    private static final SubLString $$$Of = makeString("Of");

    private static final SubLString $str112$blakePleaseRenameThis_ItsTheFunct = makeString("blakePleaseRenameThis-ItsTheFunctionCorrespondingPredicateFor");

    private static final SubLString $$$Fn = makeString("Fn");

    private static final SubLString $str114$Fn_ = makeString("Fn-");

    private static final SubLObject $$UnitOfMeasureConcept = reader_make_constant_shell(makeString("UnitOfMeasureConcept"));

    private static final SubLString $$$versionOf = makeString("versionOf");

    private static final SubLString $str117$____Blake__check_this_out_ = makeString(" ;; Blake, check this out.");

    private static final SubLString $str118$ = makeString("");

    private static final SubLString $str119$A_predicate_corresponding_to_the_ = makeString("A predicate corresponding to the function ");

    private static final SubLString $str120$____code____ = makeString(".  <code>(#$");

    private static final SubLString $str121$_X__ = makeString(" X (");

    private static final SubLString $str122$_X____code__will_always_be_true_f = makeString(" X))</code> will always be true for <code>X</code> meeting the relevant arg constraints.");

    private static final SubLList $list123 = list(reader_make_constant_shell(makeString("Thing")));

    private static final SubLString $str124$Looking_for_assertions_with_more_ = makeString("Looking for assertions with more than one belief");

    private static final SubLSymbol BELIEF_P = makeSymbol("BELIEF-P");

    private static final SubLObject $$FixedArityRelation = reader_make_constant_shell(makeString("FixedArityRelation"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));











    private static final SubLString $str133$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str138$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str139$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str140$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list141 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str142$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str144$Fixing_all_FORTs_with___genls_ass = makeString("Fixing all FORTs with #$genls assertions are not known to be collections");

    public static SubLObject forget_unneeded_knowledge(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
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
        return NIL;
    }

    public static SubLObject forget_ephemeral_terms(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ephemeral_terms = NIL;
        ephemeral_terms = all_ephemeral_terms();
        if (NIL != verboseP) {
            final SubLObject list_var = ephemeral_terms;
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != cconcatenate($$$Forgetting_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(ephemeral_terms)), $$$_ephemeral_terms }) ? cconcatenate($$$Forgetting_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(ephemeral_terms)), $$$_ephemeral_terms }) : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != forts.valid_fortP(v_term)) {
                            forget_ephemeral_term(v_term);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        } else {
            SubLObject cdolist_list_var = ephemeral_terms;
            SubLObject v_term2 = NIL;
            v_term2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != forts.valid_fortP(v_term2)) {
                    forget_ephemeral_term(v_term2);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term2 = cdolist_list_var.first();
            } 
        }
        return length(ephemeral_terms);
    }

    public static SubLObject ephemeral_term_count() {
        return add(strictly_ephemeral_term_count(), naked_in_progress_term_count());
    }

    public static SubLObject ephemeral_termP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && ((NIL != strictly_ephemeral_termP(v_object)) || (NIL != naked_in_progress_termP(v_object))));
    }

    public static SubLObject strictly_ephemeral_term_count() {
        return kb_indexing.num_predicate_extent_index($$ephemeralTerm, UNPROVIDED);
    }

    public static SubLObject strictly_ephemeral_termP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != kb_mapping_utilities.fpred_value_in_any_mt(v_object, $$ephemeralTerm, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject all_ephemeral_terms() {
        return list_utilities.fast_delete_duplicates(cconcatenate(all_strictly_ephemeral_terms(), all_naked_in_progress_terms()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_strictly_ephemeral_terms() {
        return kb_mapping_utilities.pred_refs_in_any_mt($$ephemeralTerm, ONE_INTEGER, $TRUE);
    }

    public static SubLObject naked_in_progress_termP(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != kb_mapping_utilities.fpred_value_in_any_mt(v_object, $$inProgressTerm, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) && (NIL != nothing_said_about_in_progress_termP(v_object)));
    }

    public static SubLObject nothing_said_about_in_progress_termP(final SubLObject v_term) {
        return numE(kb_indexing.num_index(v_term), ONE_INTEGER);
    }

    public static SubLObject all_naked_in_progress_terms() {
        final SubLObject accumulator = accumulation.new_list_accumulator(UNPROVIDED);
        all_naked_in_progress_terms_internal(accumulator);
        return accumulation.accumulation_contents(accumulator, UNPROVIDED);
    }

    public static SubLObject naked_in_progress_term_count() {
        final SubLObject accumulator = accumulation.new_count_accumulator();
        all_naked_in_progress_terms_internal(accumulator);
        return accumulation.accumulation_contents(accumulator, UNPROVIDED);
    }

    public static SubLObject all_naked_in_progress_terms_internal(final SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$inProgressTerm;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$4 = NIL;
                                final SubLObject token_var_$5 = NIL;
                                while (NIL == done_var_$4) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                    if (NIL != valid_$6) {
                                        final SubLObject v_term = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                        if (NIL != nothing_said_about_in_progress_termP(v_term)) {
                                            accumulation.accumulation_add(accumulator, v_term);
                                        }
                                    }
                                    done_var_$4 = makeBoolean(NIL == valid_$6);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return accumulator;
    }

    public static SubLObject forget_ephemeral_term(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        return cyc_kernel.cyc_kill(v_term);
    }

    public static SubLObject forget_ill_formed_skolems() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = isa.all_fort_instances($$SkolemFunction, UNPROVIDED, UNPROVIDED);
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != skolems.skolem_ill_formedP(skolem)) {
                count = add(count, ONE_INTEGER);
                cyc_kernel.cyc_kill(skolem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject forget_useless_skolems() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = isa.all_fort_instances($$SkolemFunction, UNPROVIDED, UNPROVIDED);
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == skolems.skolem_defn_assertions_robust(skolem, UNPROVIDED)) {
                count = add(count, ONE_INTEGER);
                cyc_kernel.cyc_kill(skolem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject forget_useless_narts() {
        return forget_narts(gather_useless_narts(), $$$forgetting_useless_NARTs);
    }

    public static SubLObject gather_useless_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$Gathering_useless_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (NIL == id_index_objects_empty_p(idx_$8, $SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$10;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (NIL != narts_high.useless_nartP(nart)) {
                                                v_answer = cons(nart, v_answer);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$10);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index_next_id(idx_$10);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                SubLObject ignore_errors_tag2 = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (NIL != narts_high.useless_nartP(nart2)) {
                                                v_answer = cons(nart2, v_answer);
                                            }
                                        } catch (final Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } catch (final Throwable ccatch_env_var2) {
                                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(v_answer);
    }

    public static SubLObject forget_narts(final SubLObject narts, final SubLObject progress_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject _prev_bind_0_$15 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$16 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$17 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != progress_message ? progress_message : $$$cdolist, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(narts), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = narts;
                            SubLObject nart = NIL;
                            nart = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$16 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) {
                                                format(T, $str17$Forgetting_NART__S__, nart);
                                                cyc_kernel.cyc_kill(nart);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$16, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                nart = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_2_$17, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$16, thread);
                        $progress_note$.rebind(_prev_bind_0_$15, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$14, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return length(narts);
    }

    public static SubLObject forget_function_extent(final SubLObject function) {
        final SubLObject message = cconcatenate($$$Forgetting_the_extent_of_, format_nil.format_nil_s_no_copy(function));
        final SubLObject narts = Mapping.mapcar(symbol_function(GAF_ARG1), kb_mapping.gather_function_extent_index(function));
        return forget_narts(narts, message);
    }

    public static SubLObject forget_invalid_deductions_and_kb_hl_supports_until_quiesced(SubLObject only_newP, SubLObject max_iteration_count, SubLObject verboseP) {
        if (only_newP == UNPROVIDED) {
            only_newP = NIL;
        }
        if (max_iteration_count == UNPROVIDED) {
            max_iteration_count = $int$32;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLObject iteration_count = ONE_INTEGER;
        SubLObject removed_deduction_count = ZERO_INTEGER;
        SubLObject removed_kb_hl_support_count = ZERO_INTEGER;
        for (SubLObject doneP = NIL; NIL == doneP; doneP = T) {
            final SubLObject invalid_deduction_count = (NIL != only_newP) ? forget_syntactically_invalid_new_deductions() : forget_invalid_deductions();
            final SubLObject invalid_kb_hl_support_count = (NIL != only_newP) ? forget_syntactically_invalid_new_kb_hl_supports() : forget_useless_kb_hl_supports_impl(iteration_count, verboseP);
            format(T, $str21$Iteration__A__Removed__A_deductio, new SubLObject[]{ iteration_count, invalid_deduction_count, invalid_kb_hl_support_count });
            removed_deduction_count = add(removed_deduction_count, invalid_deduction_count);
            removed_kb_hl_support_count = add(removed_kb_hl_support_count, invalid_kb_hl_support_count);
            if ((!invalid_deduction_count.isPositive()) && (!invalid_kb_hl_support_count.isPositive())) {
                doneP = T;
            }
            iteration_count = add(iteration_count, ONE_INTEGER);
            if (iteration_count.numGE(max_iteration_count)) {
                Errors.warn($str22$forget_syntactically_invalid_new_, max_iteration_count);
            }
        }
        format(T, $str23$Total__Removed__A_deductions_and_, removed_deduction_count, removed_kb_hl_support_count);
        return values(removed_deduction_count, removed_kb_hl_support_count);
    }

    public static SubLObject forget_syntactically_invalid_new_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalid_deductions = NIL;
        final SubLObject start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        final SubLObject table_var = deduction_handles.do_deductions_table();
        final SubLObject total = subtract(id_index_next_id(table_var), start);
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$Identifying_invalid_deductions);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject ded;
                for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    ded = id_index_lookup(table_var, id, UNPROVIDED);
                    if (NIL != ded) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        if (NIL == deduction_handles.valid_deductionP(ded, T)) {
                            invalid_deductions = cons(ded, invalid_deductions);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        invalid_deductions = nreverse(invalid_deductions);
        if (NIL != invalid_deductions) {
            final SubLObject list_var = invalid_deductions;
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Removing_invalid_deductions, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ded2 = NIL;
                    ded2 = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$22 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    tms.tms_remove_deduction(ded2);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$22, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ded2 = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return length(invalid_deductions);
    }

    public static SubLObject forget_syntactically_invalid_new_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalid_kb_hl_supports = NIL;
        final SubLObject table_var = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject first_id_var = kb_hl_support_handles.new_kb_hl_support_id_threshold();
        final SubLObject total = subtract(id_index_next_id(table_var), first_id_var);
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str26$Identifying_invalid_kb_hl_support);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject kb_hl_support;
                for (end = end_var = id_index_next_id(table_var), id = NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    kb_hl_support = id_index_lookup(table_var, id, UNPROVIDED);
                    if (NIL != kb_hl_support) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        if (NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, T)) {
                            invalid_kb_hl_supports = cons(kb_hl_support, invalid_kb_hl_supports);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        invalid_kb_hl_supports = nreverse(invalid_kb_hl_supports);
        if (NIL != invalid_kb_hl_supports) {
            final SubLObject list_var = invalid_kb_hl_supports;
            final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str27$Removing_invalid_kb_hl_supports, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject kb_hl_support2 = NIL;
                    kb_hl_support2 = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$25 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    kb_hl_supports_high.tms_remove_kb_hl_support(kb_hl_support2);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$25, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        kb_hl_support2 = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                $progress_sofar$.rebind(_prev_bind_8, thread);
                $progress_total$.rebind(_prev_bind_7, thread);
                $progress_start_time$.rebind(_prev_bind_6, thread);
                $progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return length(invalid_kb_hl_supports);
    }

    public static SubLObject forget_invalid_deductions() {
        final SubLObject bad_deductions = process_utilities.new_ipc_queue($$$Invalid_Deductions);
        if (NIL != builder_utilities.build_process_parallelism_permittedP()) {
            identify_invalid_deductions_n_way(bad_deductions, builder_utilities.build_process_worker_count());
        } else {
            identify_invalid_deductions_serial(bad_deductions);
        }
        return forget_invalid_deductions_serial(bad_deductions);
    }

    public static SubLObject forget_invalid_deductions_serial(final SubLObject invalid_deductions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject removed_deduction = ZERO_INTEGER;
        if (!process_utilities.ipc_current_queue_size(invalid_deductions).isZero()) {
            final SubLObject bad_deductions = process_utilities.ipc_drain(invalid_deductions, UNPROVIDED);
            final SubLObject msg = cconcatenate($$$Removing_or_rejustifying_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(bad_deductions)), $$$_invalid_deductions });
            final SubLObject list_var = bad_deductions;
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject deduction = NIL;
                    deduction = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        format_nil.force_format(T, $str31$__Bad_deduction__S___S__S, deduction, deductions_high.deduction_supported_object(deduction), deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != tms.tms_remove_deduction(deduction)) {
                            removed_deduction = add(removed_deduction, ONE_INTEGER);
                        }
                        count = add(count, ONE_INTEGER);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        deduction = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        return values(count, removed_deduction);
    }

    public static SubLObject identify_invalid_deductions_serial(final SubLObject bad_deductions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject un_analyzable_deductions = ZERO_INTEGER;
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = $$$Finding_invalid_deductions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$28 = idx;
                if (NIL == id_index_objects_empty_p(idx_$28, $SKIP)) {
                    final SubLObject idx_$29 = idx_$28;
                    if (NIL == id_index_dense_objects_empty_p(idx_$29, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$29);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        SubLObject msg;
                        SubLObject _prev_bind_0_$30;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            d_handle = aref(vector_var, d_id);
                            if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(d_handle)) {
                                    d_handle = $SKIP;
                                }
                                deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                msg = NIL;
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    _prev_bind_0_$30 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (NIL != deduction_is_forgettableP(deduction)) {
                                                process_utilities.ipc_enqueue(deduction, bad_deductions, UNPROVIDED);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$30, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (msg.isString()) {
                                    un_analyzable_deductions = add(un_analyzable_deductions, ONE_INTEGER);
                                    Errors.warn($str34$Deduction__A_is_is_such_bad_state, deduction_handles.deduction_id(deduction), msg);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$30 = idx_$28;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$30)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$30);
                        SubLObject d_id2 = id_index_sparse_id_threshold(idx_$30);
                        final SubLObject end_id = id_index_next_id(idx_$30);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                SubLObject msg2 = NIL;
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$31 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (NIL != deduction_is_forgettableP(deduction2)) {
                                                process_utilities.ipc_enqueue(deduction2, bad_deductions, UNPROVIDED);
                                            }
                                        } catch (final Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$31, thread);
                                    }
                                } catch (final Throwable ccatch_env_var2) {
                                    msg2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (msg2.isString()) {
                                    un_analyzable_deductions = add(un_analyzable_deductions, ONE_INTEGER);
                                    Errors.warn($str34$Deduction__A_is_is_such_bad_state, deduction_handles.deduction_id(deduction2), msg2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            d_id2 = add(d_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (un_analyzable_deductions.isPositive()) {
            Errors.error($str35$There_were__A_deductions_that_cou, un_analyzable_deductions);
        }
        return process_utilities.ipc_current_queue_size(bad_deductions);
    }

    public static SubLObject identify_invalid_deductions_n_way(final SubLObject bad_deductions, final SubLObject num_of_workers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject percentages = dictionary.new_dictionary(EQL, num_of_workers);
        SubLObject slice_id;
        SubLObject worker_name;
        SubLObject clicker;
        SubLObject worker;
        for (slice_id = NIL, slice_id = ZERO_INTEGER; slice_id.numL(num_of_workers); slice_id = add(slice_id, ONE_INTEGER)) {
            worker_name = cconcatenate($$$Invalid_Deduction_Worker_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, slice_id)));
            clicker = Semaphores.new_semaphore(worker_name, ZERO_INTEGER);
            worker = subl_promotions.make_process_with_args(worker_name, IDENTIFY_INVALID_DEDUCTIONS_WORKER, list(bad_deductions, slice_id, num_of_workers, clicker));
            map_utilities.map_put(percentages, worker, clicker);
        }
        final SubLObject progress = cconcatenate($$$Finding_invalid_deductions_using_, new SubLObject[]{ format_nil.format_nil_a_no_copy(num_of_workers), $str39$_workers_____ });
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(progress);
                SubLObject percent = ZERO_INTEGER;
                note_percent_progress(ZERO_INTEGER, $int$100);
                while (NIL == map_utilities.map_empty_p(percentages)) {
                    SubLObject stale_workers = NIL;
                    final SubLObject iterator = map_utilities.new_map_iterator(percentages);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject worker2 = NIL;
                            SubLObject clicker2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list41);
                            worker2 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list41);
                            clicker2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != valid_process_p(worker2)) {
                                    Semaphores.semaphore_wait(clicker2);
                                } else {
                                    stale_workers = cons(worker2, stale_workers);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list41);
                            }
                        }
                    }
                    percent = add(percent, ONE_INTEGER);
                    note_percent_progress(percent, $int$100);
                    SubLObject cdolist_list_var = stale_workers;
                    SubLObject stale_worker = NIL;
                    stale_worker = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        map_utilities.map_remove(percentages, stale_worker);
                        cdolist_list_var = cdolist_list_var.rest();
                        stale_worker = cdolist_list_var.first();
                    } 
                } 
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return bad_deductions;
    }

    public static SubLObject identify_invalid_deductions_worker(final SubLObject bad_deductions, final SubLObject slice_id, final SubLObject num_of_slices, final SubLObject clicker) {
        final SubLObject deductions = deduction_handles.deduction_count();
        SubLObject current_percent = ZERO_INTEGER;
        SubLObject i;
        SubLObject deduction;
        SubLObject new_percent;
        for (i = NIL, i = ZERO_INTEGER; i.numL(deductions); i = add(i, ONE_INTEGER)) {
            if (slice_id.numE(mod(i, num_of_slices))) {
                deduction = deduction_handles.find_deduction_by_id(i);
                if ((NIL != deduction_handles.deduction_p(deduction)) && (NIL != deduction_is_forgettableP(deduction))) {
                    process_utilities.ipc_enqueue(deduction, bad_deductions, UNPROVIDED);
                }
                new_percent = compute_percent_progress(i, deductions);
                if (!current_percent.numE(new_percent)) {
                    Semaphores.semaphore_signal(clicker);
                    current_percent = new_percent;
                }
            }
        }
        Semaphores.semaphore_signal(clicker);
        return slice_id;
    }

    public static SubLObject deduction_is_forgettableP(final SubLObject deduction) {
        return makeBoolean((NIL == deduction_handles.valid_deductionP(deduction, T)) || (NIL != deduction_has_invalid_supportP(deduction)));
    }

    public static SubLObject deduction_has_invalid_supportP(final SubLObject deduction) {
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        SubLObject mal = NIL;
        if (NIL == mal) {
            SubLObject csome_list_var;
            SubLObject support;
            for (csome_list_var = supports, support = NIL, support = csome_list_var.first(); (NIL == mal) && (NIL != csome_list_var); mal = arguments.ill_formed_hl_supportP(support) , csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
            }
        }
        return mal;
    }

    public static SubLObject new_invalid_deduction_iterator() {
        return iteration.new_filter_iterator(deduction_handles.new_deductions_iterator(), $sym42$DEDUCTION_IS_FORGETTABLE_, UNPROVIDED);
    }

    public static SubLObject forget_useless_kb_hl_supports(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLObject pass = ZERO_INTEGER;
        SubLObject total_removed = ZERO_INTEGER;
        SubLObject removed;
        for (SubLObject doneP = NIL; NIL == doneP; doneP = zerop(removed)) {
            pass = add(pass, ONE_INTEGER);
            removed = forget_useless_kb_hl_supports_impl(pass, verboseP);
            total_removed = add(total_removed, removed);
        }
        if ((NIL != verboseP) && total_removed.isPositive()) {
            format(T, $str43$__Removed_a_total_of__A_useless_K, total_removed, pass);
        }
        return total_removed;
    }

    public static SubLObject forget_useless_kb_hl_supports_impl(final SubLObject pass, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject map_msg = cconcatenate($$$Pass_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass), $str45$__Identifying_useless_KB_HL_suppo });
        final SubLObject reduce_msg = cconcatenate($$$Pass_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass), $str46$__Removing_useless_KB_HL_supports });
        SubLObject bad_hl_supports = NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = map_msg;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$35 = idx;
                if (NIL == id_index_objects_empty_p(idx_$35, $SKIP)) {
                    final SubLObject idx_$36 = idx_$35;
                    if (NIL == id_index_dense_objects_empty_p(idx_$36, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$36);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            s_handle = aref(vector_var, s_id);
                            if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(s_handle)) {
                                    s_handle = $SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                kb_hl_supports_high.eliminate_kb_hl_support_invalid_dependents(kb_hl_support, UNPROVIDED);
                                if (NIL != kb_hl_supports_high.should_remove_kb_hl_supportP(kb_hl_support)) {
                                    bad_hl_supports = cons(kb_hl_support, bad_hl_supports);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$37 = idx_$35;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$37)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$37);
                        SubLObject s_id2 = id_index_sparse_id_threshold(idx_$37);
                        final SubLObject end_id = id_index_next_id(idx_$37);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                kb_hl_supports_high.eliminate_kb_hl_support_invalid_dependents(kb_hl_support2, UNPROVIDED);
                                if (NIL != kb_hl_supports_high.should_remove_kb_hl_supportP(kb_hl_support2)) {
                                    bad_hl_supports = cons(kb_hl_support2, bad_hl_supports);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            s_id2 = add(s_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject errmsg = NIL;
        final SubLObject list_var = bad_hl_supports;
        final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != reduce_msg ? reduce_msg : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject hl_support = NIL;
                hl_support = csome_list_var.first();
                while (NIL != csome_list_var) {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL != kb_hl_supports_high.possibly_remove_kb_hl_support(hl_support)) {
                                    count = add(count, ONE_INTEGER);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$39, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        errmsg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (errmsg.isString() && (NIL != verboseP)) {
                        Errors.warn($str47$Failed_to_remove_HL_support__A___, hl_support, errmsg);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    hl_support = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_12, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            $last_percent_progress_index$.rebind(_prev_bind_9, thread);
            $progress_sofar$.rebind(_prev_bind_8, thread);
            $progress_total$.rebind(_prev_bind_7, thread);
            $progress_start_time$.rebind(_prev_bind_6, thread);
            $progress_note$.rebind(_prev_bind_5, thread);
        }
        if ((NIL != verboseP) && count.isPositive()) {
            format(T, $str48$__Removed__A_useless_KB_HL_suppor, count, pass);
        }
        return count;
    }

    public static SubLObject forget_old_creation_seconds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject old_creation_seconds = list_var = gather_old_creation_seconds();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Forgetting_old_creation_seconds, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject old = NIL;
                old = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$41 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (NIL != assertions_high.valid_assertion(old, UNPROVIDED)) {
                                    tms.tms_remove_assertion(old);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$41, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    } finally {
                        thread.throwStack.pop();
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    old = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return length(old_creation_seconds);
    }

    public static SubLObject forget_old_creation_second_date() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numeric_date_utilities.month_ago(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), $forget_old_creation_second_months$.getDynamicValue(thread));
    }

    public static SubLObject gather_old_creation_seconds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject forget_date = forget_old_creation_second_date();
        final SubLObject total = kb_indexing.num_predicate_extent_index($$myCreationSecond, UNPROVIDED);
        SubLObject sofar = ZERO_INTEGER;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$Examining_creation_seconds);
                final SubLObject _prev_bind_0_$43 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject pred_var = $$myCreationSecond;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$44 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$45 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$47 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$48 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$49 = NIL;
                                        final SubLObject token_var_$50 = NIL;
                                        while (NIL == done_var_$49) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                            final SubLObject valid_$51 = makeBoolean(!token_var_$50.eql(ass));
                                            if (NIL != valid_$51) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                final SubLObject v_term = assertions_high.gaf_arg1(ass);
                                                if (NIL != forts.fort_p(v_term)) {
                                                    final SubLObject creation_time = bookkeeping_store.creation_time(v_term, UNPROVIDED);
                                                    if ((NIL != creation_time) && creation_time.numLE(forget_date)) {
                                                        v_answer = cons(ass, v_answer);
                                                    }
                                                }
                                            }
                                            done_var_$49 = makeBoolean(NIL == valid_$51);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_3_$48, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$47, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$45, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$44, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$43, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        v_answer = nreverse(v_answer);
        return v_answer;
    }

    public static SubLObject clean_assertion_assert_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $$$Cleaning_KBS_assert_info;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_0_$54 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$55 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$55, $SKIP)) {
                            final SubLObject idx_$56 = idx_$55;
                            if (NIL == id_index_dense_objects_empty_p(idx_$56, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$56);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion;
                                SubLObject asserted_by_value;
                                SubLObject asserted_why_value;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                            asserted_by_value = (NIL != forts.invalid_fortP(assertions_high.asserted_by(assertion))) ? NIL : $UNCHANGED;
                                            asserted_why_value = (NIL != forts.invalid_fortP(assertions_high.asserted_why(assertion))) ? NIL : $UNCHANGED;
                                            if ((NIL == asserted_by_value) || (NIL == asserted_why_value)) {
                                                if (NIL == asserted_by_value) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                                if (NIL == asserted_why_value) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                                assertions_high.timestamp_asserted_assertion(assertion, asserted_by_value, $UNCHANGED, asserted_why_value, $UNCHANGED);
                                            }
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$57 = idx_$55;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$57)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$57);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$57);
                                final SubLObject end_id = id_index_next_id(idx_$57);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (NIL != assertions_high.asserted_assertionP(assertion2)) {
                                            final SubLObject asserted_by_value2 = (NIL != forts.invalid_fortP(assertions_high.asserted_by(assertion2))) ? NIL : $UNCHANGED;
                                            final SubLObject asserted_why_value2 = (NIL != forts.invalid_fortP(assertions_high.asserted_why(assertion2))) ? NIL : $UNCHANGED;
                                            if ((NIL == asserted_by_value2) || (NIL == asserted_why_value2)) {
                                                if (NIL == asserted_by_value2) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                                if (NIL == asserted_why_value2) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                                assertions_high.timestamp_asserted_assertion(assertion2, asserted_by_value2, $UNCHANGED, asserted_why_value2, $UNCHANGED);
                                            }
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject duplicate_nart_tuples(SubLObject via_tou_assertionsP) {
        if (via_tou_assertionsP == UNPROVIDED) {
            via_tou_assertionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        if (NIL != via_tou_assertionsP) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                final SubLObject pred_var = $$termOfUnit;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$60 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$61 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$62 = NIL;
                                    final SubLObject token_var_$63 = NIL;
                                    while (NIL == done_var_$62) {
                                        final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                        final SubLObject valid_$64 = makeBoolean(!token_var_$63.eql(tou_ass));
                                        if (NIL != valid_$64) {
                                            final SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                            final SubLObject nart_hl_formula = assertions_high.gaf_arg2(tou_ass);
                                            if (NIL != nart_handles.nart_p(nart)) {
                                                dictionary_utilities.dictionary_push(dict, nart_hl_formula, nart);
                                            }
                                        }
                                        done_var_$62 = makeBoolean(NIL == valid_$64);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$61, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$60, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = $str56$Looking_for_duplicate_narts_with_;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$66 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$66, $SKIP)) {
                        final SubLObject idx_$67 = idx_$66;
                        if (NIL == id_index_dense_objects_empty_p(idx_$67, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$67);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart2 = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(nart2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart2)) {
                                        nart2 = $SKIP;
                                    }
                                    dictionary_utilities.dictionary_push(dict, narts_high.nart_hl_formula(nart2), nart2);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$68 = idx_$66;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$68)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$68);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$68);
                            final SubLObject end_id = id_index_next_id(idx_$68);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject nart3 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart3))) {
                                    dictionary_utilities.dictionary_push(dict, narts_high.nart_hl_formula(nart3), nart3);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
            }
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject narts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == list_utilities.singletonP(narts)) {
                Errors.warn($str57$__Duplicates_found___S, narts);
                tuples = cons(reverse(narts), tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nreverse(tuples);
    }

    public static SubLObject duplicate_narts_to_kill() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        final SubLObject tuples = cdolist_list_var = duplicate_nart_tuples(UNPROVIDED);
        SubLObject narts = NIL;
        narts = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject keep_nart = number_utilities.maximum(narts, NUM_INDEX);
            final SubLObject kill_narts = remove(keep_nart, narts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = nconc(kill_narts, result);
            cdolist_list_var = cdolist_list_var.rest();
            narts = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject kill_duplicate_narts() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = duplicate_narts_to_kill();
        SubLObject nart = NIL;
        nart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) {
                cyc_kernel.cyc_kill(nart);
            }
            count = add(count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            nart = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject duplicate_assertion_tuples(SubLObject ids) {
        if (ids == UNPROVIDED) {
            ids = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ids) {
            final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject progress_message = cconcatenate($$$Examining_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(ids)), $$$_assertions_for_duplication });
            final SubLObject list_var = ids;
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message ? progress_message : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject id = NIL;
                    id = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        consider_that_assertion_could_be_duplicate(assertion_handles.find_assertion_by_id(id), dict, T);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        id = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            return duplicate_tuples_from_dictionary(dict);
        }
        final SubLObject mt_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject tuples = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str61$Examining_all_assertions_for_dupl;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$71 = idx;
                if (NIL == id_index_objects_empty_p(idx_$71, $SKIP)) {
                    final SubLObject idx_$72 = idx_$71;
                    if (NIL == id_index_dense_objects_empty_p(idx_$72, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$72);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                group_assertion_by_mt(ass, mt_dict);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$73 = idx_$71;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$73)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$73);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$73);
                        final SubLObject end_id = id_index_next_id(idx_$73);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                group_assertion_by_mt(ass2, mt_dict);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_12, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            $last_percent_progress_index$.rebind(_prev_bind_9, thread);
        }
        SubLObject assertion_num = ZERO_INTEGER;
        final SubLObject assertion_total = assertion_handles.assertion_count();
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str62$Examining_all_assertions_for_dupl);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject assertions_in_an_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject dict_in_an_mt = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    SubLObject cdolist_list_var = assertions_in_an_mt;
                    SubLObject ass2 = NIL;
                    ass2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        consider_that_assertion_could_be_duplicate(ass2, dict_in_an_mt, NIL);
                        assertion_num = add(assertion_num, ONE_INTEGER);
                        note_percent_progress(assertion_num, assertion_total);
                        cdolist_list_var = cdolist_list_var.rest();
                        ass2 = cdolist_list_var.first();
                    } 
                    tuples = nconc(duplicate_tuples_from_dictionary(dict_in_an_mt), tuples);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
        }
        return nreverse(tuples);
    }

    public static SubLObject group_assertion_by_mt(final SubLObject ass, final SubLObject mt_dict) {
        dictionary_utilities.dictionary_push(mt_dict, assertions_high.assertion_mt(ass), ass);
        return NIL;
    }

    public static SubLObject consider_that_assertion_could_be_duplicate(final SubLObject ass, final SubLObject dict, final SubLObject consider_mtP) {
        if (NIL != assertion_handles.valid_assertionP(ass, UNPROVIDED)) {
            final SubLObject key = (NIL != consider_mtP) ? cons(assertion_cnf_or_gaf_formula(ass), assertions_high.assertion_mt(ass)) : assertion_cnf_or_gaf_formula(ass);
            dictionary_utilities.dictionary_push(dict, key, ass);
        }
        return NIL;
    }

    public static SubLObject assertion_cnf_or_gaf_formula(final SubLObject ass) {
        if (NIL != assertions_high.gaf_assertionP(ass)) {
            return assertions_high.gaf_el_formula(ass);
        }
        return assertions_high.assertion_cnf(ass);
    }

    public static SubLObject duplicate_tuples_from_dictionary(final SubLObject dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject assertions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == list_utilities.singletonP(assertions)) {
                final SubLObject sorted_assertions = put_the_keeper_first(assertions);
                tuples = cons(sorted_assertions, tuples);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nreverse(tuples);
    }

    public static SubLObject put_the_keeper_first(final SubLObject assertions) {
        final SubLObject clean = remove_if($sym63$CANONICALIZER_PROBLEM_, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != clean) {
            return list_utilities.move_to_front(clean.first(), assertions, UNPROVIDED);
        }
        Errors.warn($str64$could_not_find_an_obvious_keeper_, Mapping.mapcar(ASSERTION_ID, assertions));
        return assertions;
    }

    public static SubLObject blast_duplicate_assertions(SubLObject ids) {
        if (ids == UNPROVIDED) {
            ids = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject tuples = duplicate_assertion_tuples(ids);
        final SubLObject progress_message = cconcatenate($$$Blasting_approximately_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(tuples)), $$$_duplicate_assertions });
        final SubLObject list_var = tuples;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != progress_message ? progress_message : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject tuple = NIL;
                tuple = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject assertions_to_blast = cdolist_list_var = tuple.rest();
                    SubLObject kill_ass = NIL;
                    kill_ass = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        tms.tms_remove_assertion(kill_ass);
                        if (NIL != assertion_handles.valid_assertionP(kill_ass, UNPROVIDED)) {
                            Errors.warn($str68$Could_not_kill__a, assertion_handles.assertion_id(kill_ass));
                        } else {
                            count = add(count, ONE_INTEGER);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        kill_ass = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    tuple = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject blast_duplicate_assertions_without_keepers(SubLObject ids) {
        if (ids == UNPROVIDED) {
            ids = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject tuples = duplicate_assertion_tuples(ids);
        final SubLObject progress_message = cconcatenate($$$Blasting_approximately_, new SubLObject[]{ format_nil.format_nil_a_no_copy(multiply(TWO_INTEGER, length(tuples))), $$$_duplicate_assertions });
        final SubLObject list_var = tuples;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != progress_message ? progress_message : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject tuple = NIL;
                tuple = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject assertions_to_blast = cdolist_list_var = tuple;
                    SubLObject kill_ass = NIL;
                    kill_ass = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        tms.tms_remove_assertion(kill_ass);
                        if (NIL != assertion_handles.valid_assertionP(kill_ass, UNPROVIDED)) {
                            Errors.warn($str68$Could_not_kill__a, assertion_handles.assertion_id(kill_ass));
                        } else {
                            count = add(count, ONE_INTEGER);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        kill_ass = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    tuple = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject reconsider_assertions_with_no_arguments_verbose(SubLObject return_idsP) {
        if (return_idsP == UNPROVIDED) {
            return_idsP = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject removed = cdolist_list_var = reconsider_assertions_with_no_arguments($RETURN_IDS);
        SubLObject id = NIL;
        id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str70$_______assertion__A_proved_unnece, id);
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        } 
        return NIL != return_idsP ? removed : length(removed);
    }

    public static SubLObject reconsider_assertions_with_no_arguments(SubLObject return_idsP) {
        if (return_idsP == UNPROVIDED) {
            return_idsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ids = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str71$Redoing_TMS_on_assertions_with_no;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$78 = idx;
                if (NIL == id_index_objects_empty_p(idx_$78, $SKIP)) {
                    final SubLObject idx_$79 = idx_$78;
                    if (NIL == id_index_dense_objects_empty_p(idx_$79, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$79);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject id;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if ((NIL == assertions_high.assertion_arguments(ass)) && (NIL != assertion_handles.valid_assertionP(ass, UNPROVIDED))) {
                                    id = assertion_handles.assertion_id(ass);
                                    tms.tms_reconsider_assertion(ass);
                                    if (NIL == assertion_handles.valid_assertionP(ass, UNPROVIDED)) {
                                        ids = cons(id, ids);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$80 = idx_$78;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$80)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$80);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$80);
                        final SubLObject end_id = id_index_next_id(idx_$80);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if ((NIL == assertions_high.assertion_arguments(ass2)) && (NIL != assertion_handles.valid_assertionP(ass2, UNPROVIDED))) {
                                    final SubLObject id2 = assertion_handles.assertion_id(ass2);
                                    tms.tms_reconsider_assertion(ass2);
                                    if (NIL == assertion_handles.valid_assertionP(ass2, UNPROVIDED)) {
                                        ids = cons(id2, ids);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (NIL != return_idsP) {
            return nreverse(ids);
        }
        return length(ids);
    }

    public static SubLObject detect_multiples_via_lexicon(final SubLObject type, SubLObject default_dupe_type, SubLObject mt, SubLObject preds) {
        if (default_dupe_type == UNPROVIDED) {
            default_dupe_type = $SAME;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (preds == UNPROVIDED) {
            preds = $list74;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_instances = NIL;
        final SubLObject dupe_type = (default_dupe_type == $SAME) ? type : default_dupe_type;
        final SubLObject dups_dict = dictionary.new_dictionary(EQUALP, UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            v_instances = isa.all_fort_instances(type, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var = v_instances;
        final SubLObject _prev_bind_4 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject instance = NIL;
                instance = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var = pph_methods_lexicon.all_phrases_for_term(instance, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject name = NIL;
                    name = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$82;
                        final SubLObject other_denots = cdolist_list_var_$82 = remove(instance, lexicon_accessors.typed_denots_of_string(name, dupe_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject other = NIL;
                        other = cdolist_list_var_$82.first();
                        while (NIL != cdolist_list_var_$82) {
                            dictionary_utilities.dictionary_pushnew(dups_dict, name, instance, UNPROVIDED, UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(dups_dict, name, other, UNPROVIDED, UNPROVIDED);
                            cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                            other = cdolist_list_var_$82.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        name = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    instance = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_11, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
            $last_percent_progress_index$.rebind(_prev_bind_8, thread);
            $progress_sofar$.rebind(_prev_bind_7, thread);
            $progress_total$.rebind(_prev_bind_6, thread);
            $progress_start_time$.rebind(_prev_bind_5, thread);
            $progress_note$.rebind(_prev_bind_4, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dups_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject denots = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(T, $str75$_S_____A__, string, denots);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return dictionary_utilities.dictionary_to_alist(dups_dict);
    }

    public static SubLObject new_and_removed_infn_narts(final SubLObject old_kbnum, final SubLObject new_kbnum, SubLObject stream, SubLObject dir) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (dir == UNPROVIDED) {
            dir = plot_generation.$infn_count_data_dir$.getGlobalValue();
        }
        return new_and_removed_narts($$InstanceNamedFn_Ternary, old_kbnum, new_kbnum, stream, dir);
    }

    public static SubLObject new_and_removed_psnfn_narts(final SubLObject old_kbnum, final SubLObject new_kbnum, SubLObject stream, SubLObject dir) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (dir == UNPROVIDED) {
            dir = plot_generation.$infn_count_data_dir$.getGlobalValue();
        }
        return new_and_removed_narts($const77$ProperSubcollectionNamedFn_Ternar, old_kbnum, new_kbnum, stream, dir);
    }

    public static SubLObject new_and_removed_narts(final SubLObject functor, final SubLObject old_kbnum, final SubLObject new_kbnum, SubLObject stream, SubLObject dir) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (dir == UNPROVIDED) {
            dir = plot_generation.$infn_count_data_dir$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject narts_in_old_kb = functor_narts_in_kb(functor, old_kbnum, dir);
        final SubLObject narts_in_new_kb = functor_narts_in_kb(functor, new_kbnum, dir);
        final SubLObject all_narts = set_utilities.set_union(list(narts_in_old_kb, narts_in_new_kb), EQUAL);
        final SubLObject common_narts = set_utilities.set_intersection(list(narts_in_old_kb, narts_in_new_kb), EQUAL);
        final SubLObject new_narts = set_utilities.set_minus(narts_in_new_kb, common_narts, EQUAL);
        final SubLObject departed_narts = set_utilities.set_minus(all_narts, narts_in_new_kb, EQUAL);
        format(stream, $str78$_A_new_narts_added_between_KB__S_, new SubLObject[]{ set.set_size(new_narts), old_kbnum, new_kbnum });
        format(stream, $str79$_A_narts_departed_between_KB__S_a, new SubLObject[]{ set.set_size(departed_narts), old_kbnum, new_kbnum });
        format(stream, $str80$____________________New_NARTs____);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            SubLObject set_contents_var = set.do_set_internal(new_narts);
            SubLObject basis_object;
            SubLObject state;
            SubLObject nart;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                nart = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                    format(stream, $str81$_S__, nart);
                }
            }
            format(stream, $str82$____________________Departed_NART);
            set_contents_var = set.do_set_internal(departed_narts);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                nart = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                    format(stream, $str81$_S__, nart);
                }
            }
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return list(set.set_size(new_narts), set.set_size(departed_narts));
    }

    public static SubLObject clear_functor_narts_in_kb() {
        final SubLObject cs = $functor_narts_in_kb_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_functor_narts_in_kb(final SubLObject functor, final SubLObject kb_num, final SubLObject dir) {
        return memoization_state.caching_state_remove_function_results_with_args($functor_narts_in_kb_caching_state$.getGlobalValue(), list(functor, kb_num, dir), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject functor_narts_in_kb_internal(final SubLObject functor, final SubLObject kb_num, final SubLObject dir) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart_file = cconcatenate(format_nil.format_nil_a_no_copy(dir), new SubLObject[]{ $str84$KB_, format_nil.format_nil_a_no_copy(kb_num), $str85$_, format_nil.format_nil_a_no_copy(kb_paths.fort_name(functor)), $str86$_NARTS_txt });
        final SubLObject narts = set.new_set(EQUAL, UNPROVIDED);
        Errors.warn($str87$Getting__A_narts_for_KB__S__, functor, kb_num);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(nart_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str89$Unable_to_open__S, nart_file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject line_value;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    line_value = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != cycl_grammar.cycl_nat_p(line_value)) {
                        set.set_add(line_value, narts);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return narts;
    }

    public static SubLObject functor_narts_in_kb(final SubLObject functor, final SubLObject kb_num, final SubLObject dir) {
        SubLObject caching_state = $functor_narts_in_kb_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FUNCTOR_NARTS_IN_KB, $functor_narts_in_kb_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(functor, kb_num, dir);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (functor.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (kb_num.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && dir.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(functor_narts_in_kb_internal(functor, kb_num, dir)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(functor, kb_num, dir));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject fcp_sweep(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str89$Unable_to_open__S, filename);
            }
            final SubLObject stream_$84 = stream;
            format(stream_$84, $str93$___functionCorrespondingPredicate, numeric_date_utilities.timestring(UNPROVIDED));
            final SubLObject list_var;
            final SubLObject functions = list_var = functions_for_fcp_sweep();
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str94$Writing_KE_text___, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject func = NIL;
                    func = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        princ(ke_text_for_unary_function_fcp(func), stream_$84);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        func = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return filename;
    }

    public static SubLObject functions_for_fcp_sweep() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject list_var = isa.all_instances($$UnaryFunction, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$87 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str96$Gathering_functions___, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject func = NIL;
                    func = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (((((NIL != constant_p(func)) && (NIL == list_utilities.member_kbeqP(func, $functions_to_skip_for_fcp_sweep$.getGlobalValue()))) && (NIL == relation_evaluation.evaluatable_functionP(func))) && (NIL == hl_prototypes.hl_prototypical_instanceP(func))) && (NIL == inference_trivial.new_cyc_trivial_query(listS($const97$functionCorrespondingPredicate_Ge, func, $list98), $$InferencePSC, $list99))) {
                            result = cons(func, result);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        func = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$87, thread);
                $progress_note$.rebind(_prev_bind_0_$86, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(result, $sym100$FCP_FUNC__, UNPROVIDED);
    }

    public static SubLObject fcp_func_G(final SubLObject func1, final SubLObject func2) {
        final SubLObject num1 = kb_indexing.num_index(func1);
        final SubLObject num2 = kb_indexing.num_index(func2);
        if (num1.numG(num2)) {
            return T;
        }
        if (num1.numL(num2)) {
            return NIL;
        }
        return Strings.stringL(kb_paths.fort_name(func1), kb_paths.fort_name(func2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ke_text_for_unary_function_fcp(final SubLObject func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$UniversalVocabularyMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = cconcatenate($str102$____, new SubLObject[]{ format_nil.format_nil_a_no_copy(func), $str103$_constant__, format_nil.format_nil_a_no_copy(fcp_name(func)), $str104$_, format_nil.format_nil_a_no_copy(fcp_blake_note(func)), $str105$_in_mt__UniversalVocabularyMt__is, format_nil.format_nil_a_no_copy(fcp_arg1_isa(func)), $str106$__arg2Isa__, format_nil.format_nil_a_no_copy(fcp_arg2_isa(func)), $str107$__arg2Format__singleEntryFormatIn, format_nil.format_nil_s_no_copy(fcp_comment(func)), $str108$__f___functionCorrespondingPredic, format_nil.format_nil_a_no_copy(func), $$$_, format_nil.format_nil_a_no_copy(fcp_name(func)), $str110$_2____ });
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject fcp_name(final SubLObject func) {
        if (NIL == fcp_name_clashP(func)) {
            return fcp_name_int(func);
        }
        final SubLObject new_name = cconcatenate(fcp_name_int(func), $$$Of);
        if ((NIL != constants_high.find_constant(new_name)) || (NIL != constant_completion_high.constant_name_case_collision(new_name))) {
            return cconcatenate($str112$blakePleaseRenameThis_ItsTheFunct, constants_high.constant_name(func));
        }
        return new_name;
    }

    public static SubLObject fcp_name_clashP(final SubLObject func) {
        final SubLObject proposed_name = fcp_name_int(func);
        return makeBoolean((NIL != constants_high.find_constant(proposed_name)) || (NIL != constant_completion_high.constant_name_case_collision(proposed_name)));
    }

    public static SubLObject fcp_name_int(final SubLObject func) {
        if (NIL != string_utilities.ends_with(constants_high.constant_name(func), $$$Fn, UNPROVIDED)) {
            return fcp_predify_function_name(constants_high.constant_name(func));
        }
        if (NIL != fcp_ends_with_fn_but_has_a_dashed_bit_at_the_endP(func)) {
            final SubLObject name = constants_high.constant_name(func);
            final SubLObject pos = string_utilities.search_last($str114$Fn_, name, UNPROVIDED, UNPROVIDED);
            final SubLObject dash_pos = add(pos, TWO_INTEGER);
            final SubLObject first_bit = string_utilities.substring(name, ZERO_INTEGER, dash_pos);
            final SubLObject second_bit = string_utilities.substring(name, dash_pos, length(name));
            return cconcatenate(fcp_predify_function_name(first_bit), second_bit);
        }
        if (NIL != isa.isaP(func, $$UnitOfMeasureConcept, UNPROVIDED, UNPROVIDED)) {
            return string_utilities.uncapitalize_first(cconcatenate(constants_high.constant_name(func), $$$versionOf));
        }
        return cconcatenate($str112$blakePleaseRenameThis_ItsTheFunct, constants_high.constant_name(func));
    }

    public static SubLObject fcp_blake_note(final SubLObject func) {
        if (NIL != fcp_name_clashP(func)) {
            return $str117$____Blake__check_this_out_;
        }
        return $str118$;
    }

    public static SubLObject fcp_predify_function_name(final SubLObject name) {
        return string_utilities.uncapitalize_first(string_utilities.substring(name, ZERO_INTEGER, subtract(length(name), TWO_INTEGER)));
    }

    public static SubLObject fcp_ends_with_fn_but_has_a_dashed_bit_at_the_endP(final SubLObject func) {
        return string_utilities.substringP($str114$Fn_, constants_high.constant_name(func), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fcp_arg1_isa(final SubLObject func) {
        return strip_outer_parens(string_utilities.str(fcp_arg1_isa_int(func)));
    }

    public static SubLObject fcp_arg2_isa(final SubLObject func) {
        return strip_outer_parens(string_utilities.str(fcp_result_isa_int(func)));
    }

    public static SubLObject fcp_comment(final SubLObject func) {
        return cconcatenate($str119$A_predicate_corresponding_to_the_, new SubLObject[]{ format_nil.format_nil_a_no_copy(func), $str120$____code____, format_nil.format_nil_a_no_copy(fcp_name(func)), $str121$_X__, format_nil.format_nil_a_no_copy(func), $str122$_X____code__will_always_be_true_f });
    }

    public static SubLObject fcp_arg1_isa_int(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1_isa = kb_accessors.arg1_isa(relation, UNPROVIDED);
        if (NIL == arg1_isa) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                arg1_isa = kb_accessors.arg1_isa(relation, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == arg1_isa) {
            arg1_isa = $list123;
        }
        return cycl_utilities.hl_to_el(genls.min_cols(arg1_isa, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject fcp_result_isa_int(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_isa = kb_accessors.result_isa(relation, UNPROVIDED);
        if (NIL == result_isa) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                result_isa = kb_accessors.result_isa(relation, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == result_isa) {
            result_isa = $list123;
        }
        return cycl_utilities.hl_to_el(genls.min_cols(result_isa, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject strip_outer_parens(final SubLObject string) {
        return string_utilities.substring(string, ONE_INTEGER, subtract(length(string), ONE_INTEGER));
    }

    public static SubLObject something(final SubLObject func) {
        return list(func, fcp_name(func));
    }

    public static SubLObject assertions_with_more_than_one_belief() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str124$Looking_for_assertions_with_more_;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$89 = idx;
                if (NIL == id_index_objects_empty_p(idx_$89, $SKIP)) {
                    final SubLObject idx_$90 = idx_$89;
                    if (NIL == id_index_dense_objects_empty_p(idx_$90, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$90);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_has_more_than_one_belief(ass)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$91 = idx_$89;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$91)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$91);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$91);
                        final SubLObject end_id = id_index_next_id(idx_$91);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_has_more_than_one_belief(ass2)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject assertion_has_more_than_one_belief(final SubLObject assertion) {
        final SubLObject belief_count = count_if(BELIEF_P, assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (belief_count.numG(ONE_INTEGER)) {
            return belief_count;
        }
        return NIL;
    }

    public static SubLObject fixed_arity_relations_without_arities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relations = NIL;
        final SubLObject node_var = $$FixedArityRelation;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$93 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$94 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str133$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str133$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str133$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str138$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str133$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$97 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$97 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$98 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$101 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$93, UNPROVIDED);
                                        while (NIL != node_var_$93) {
                                            final SubLObject tt_node_var = node_var_$93;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$98 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$105;
                                                                            for (iteration_state_$105 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$105); iteration_state_$105 = dictionary_contents.do_dictionary_contents_next(iteration_state_$105)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$105);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject reln;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                reln = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, reln)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (((NIL != forts.fort_p(reln)) && (!arity.arity(reln).isInteger())) && (NIL == hl_prototypes.hl_prototypical_instanceP(reln))) {
                                                                                                        relations = cons(reln, relations);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject reln2 = NIL;
                                                                                                reln2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (((NIL != forts.fort_p(reln2)) && (!arity.arity(reln2).isInteger())) && (NIL == hl_prototypes.hl_prototypical_instanceP(reln2))) {
                                                                                                            relations = cons(reln2, relations);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    reln2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str139$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$100, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$105);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$99, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str140$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list141);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list141);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list141);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$101 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$102 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject reln;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            reln = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, reln)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (((NIL != forts.fort_p(reln)) && (!arity.arity(reln).isInteger())) && (NIL == hl_prototypes.hl_prototypical_instanceP(reln))) {
                                                                                                    relations = cons(reln, relations);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$109 = sol;
                                                                                            SubLObject reln2 = NIL;
                                                                                            reln2 = csome_list_var_$109.first();
                                                                                            while (NIL != csome_list_var_$109) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (((NIL != forts.fort_p(reln2)) && (!arity.arity(reln2).isInteger())) && (NIL == hl_prototypes.hl_prototypical_instanceP(reln2))) {
                                                                                                        relations = cons(reln2, relations);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$109 = csome_list_var_$109.rest();
                                                                                                reln2 = csome_list_var_$109.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str139$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$102, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$101, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list141);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$110;
                                                            final SubLObject new_list = cdolist_list_var_$110 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$110.first();
                                                            while (NIL != cdolist_list_var_$110) {
                                                                final SubLObject _prev_bind_0_$103 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject reln3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            reln3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, reln3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(reln3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (((NIL != forts.fort_p(reln3)) && (!arity.arity(reln3).isInteger())) && (NIL == hl_prototypes.hl_prototypical_instanceP(reln3))) {
                                                                                    relations = cons(reln3, relations);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject reln4 = NIL;
                                                                            reln4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (((NIL != forts.fort_p(reln4)) && (!arity.arity(reln4).isInteger())) && (NIL == hl_prototypes.hl_prototypical_instanceP(reln4))) {
                                                                                        relations = cons(reln4, relations);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                reln4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str139$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$103, thread);
                                                                }
                                                                cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                                                                generating_fn = cdolist_list_var_$110.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$99, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$98, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$104 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$100 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$93);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$106;
                                                                            for (iteration_state_$106 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$106); iteration_state_$106 = dictionary_contents.do_dictionary_contents_next(iteration_state_$106)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$106);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str139$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$106, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$106);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$105, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str140$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$111;
                                                            final SubLObject new_list2 = cdolist_list_var_$111 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$111.first();
                                                            while (NIL != cdolist_list_var_$111) {
                                                                final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str139$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$107, thread);
                                                                }
                                                                cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                                                                generating_fn2 = cdolist_list_var_$111.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$100, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$104, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$93 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$101, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$98, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$97, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str142$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$97, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$96, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$96, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$95, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$108 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$94, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(relations);
    }

    public static SubLObject fix_fixed_arity_relations_without_arities() {
        SubLObject cdolist_list_var = fixed_arity_relations_without_arities();
        SubLObject relation = NIL;
        relation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$121 = kb_mapping_utilities.pred_value_gafs(relation, $$isa, UNPROVIDED, UNPROVIDED);
            SubLObject a = NIL;
            a = cdolist_list_var_$121.first();
            while (NIL != cdolist_list_var_$121) {
                if (NIL != genls.genlsP(assertions_high.gaf_arg2(a), $$FixedArityRelation, UNPROVIDED, UNPROVIDED)) {
                    ke.ke_repropagate_assertion(a);
                }
                cdolist_list_var_$121 = cdolist_list_var_$121.rest();
                a = cdolist_list_var_$121.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            relation = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject tou_assertion_goodP(final SubLObject tou_assertion) {
        return makeBoolean(($TRUE == assertions_high.assertion_truth(tou_assertion)) && (NIL != nart_handles.nart_p(assertions_high.gaf_arg1(tou_assertion))));
    }

    public static SubLObject fort_has_genls_assertion_but_is_not_a_collectionP(final SubLObject fort) {
        return makeBoolean((NIL != kb_mapping_utilities.fpred_value_in_any_mt(fort, $$genls, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == fort_types_interface.collectionP(fort)));
    }

    public static SubLObject fix_forts_with_genls_but_not_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message = $str144$Fixing_all_FORTs_with___genls_ass;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$122 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$123 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$124 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$124, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$124);
                                final SubLObject backwardP_var = NIL;
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
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        if (NIL != fort_has_genls_assertion_but_is_not_a_collectionP(fort)) {
                                            pred_var = $$genls;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, ONE_INTEGER, pred_var)) {
                                                iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, ONE_INTEGER, pred_var);
                                                done_var = NIL;
                                                token_var = NIL;
                                                while (NIL == done_var) {
                                                    final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                            done_var_$125 = NIL;
                                                            token_var_$126 = NIL;
                                                            while (NIL == done_var_$125) {
                                                                v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$126);
                                                                valid_$127 = makeBoolean(!token_var_$126.eql(v_assert));
                                                                if ((NIL != valid_$127) && (NIL != assertions_high.asserted_assertionP(v_assert))) {
                                                                    ke.ke_repropagate_assertion_now(v_assert);
                                                                }
                                                                done_var_$125 = makeBoolean(NIL == valid_$127);
                                                            } 
                                                        } finally {
                                                            _prev_bind_0_$123 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$125 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$125)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$125);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$125);
                                final SubLObject end_id = id_index_next_id(idx_$125);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        if (NIL != fort_has_genls_assertion_but_is_not_a_collectionP(fort2)) {
                                            final SubLObject pred_var2 = $$genls;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort2, ONE_INTEGER, pred_var2)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort2, ONE_INTEGER, pred_var2);
                                                SubLObject done_var2 = NIL;
                                                final SubLObject token_var2 = NIL;
                                                while (NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (NIL != valid2) {
                                                        SubLObject final_index_iterator2 = NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                                            SubLObject done_var_$126 = NIL;
                                                            final SubLObject token_var_$127 = NIL;
                                                            while (NIL == done_var_$126) {
                                                                final SubLObject v_assert2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$127);
                                                                final SubLObject valid_$128 = makeBoolean(!token_var_$127.eql(v_assert2));
                                                                if ((NIL != valid_$128) && (NIL != assertions_high.asserted_assertionP(v_assert2))) {
                                                                    ke.ke_repropagate_assertion_now(v_assert2);
                                                                }
                                                                done_var_$126 = makeBoolean(NIL == valid_$128);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                if (NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = makeBoolean(NIL == valid2);
                                                } 
                                            }
                                        }
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$125 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$123, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$122, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_kb_cleanup_file() {
        declareFunction(me, "forget_unneeded_knowledge", "FORGET-UNNEEDED-KNOWLEDGE", 0, 1, false);
        declareFunction(me, "forget_ephemeral_terms", "FORGET-EPHEMERAL-TERMS", 0, 1, false);
        declareFunction(me, "ephemeral_term_count", "EPHEMERAL-TERM-COUNT", 0, 0, false);
        declareFunction(me, "ephemeral_termP", "EPHEMERAL-TERM?", 1, 0, false);
        declareFunction(me, "strictly_ephemeral_term_count", "STRICTLY-EPHEMERAL-TERM-COUNT", 0, 0, false);
        declareFunction(me, "strictly_ephemeral_termP", "STRICTLY-EPHEMERAL-TERM?", 1, 0, false);
        declareFunction(me, "all_ephemeral_terms", "ALL-EPHEMERAL-TERMS", 0, 0, false);
        declareFunction(me, "all_strictly_ephemeral_terms", "ALL-STRICTLY-EPHEMERAL-TERMS", 0, 0, false);
        declareFunction(me, "naked_in_progress_termP", "NAKED-IN-PROGRESS-TERM?", 1, 0, false);
        declareFunction(me, "nothing_said_about_in_progress_termP", "NOTHING-SAID-ABOUT-IN-PROGRESS-TERM?", 1, 0, false);
        declareFunction(me, "all_naked_in_progress_terms", "ALL-NAKED-IN-PROGRESS-TERMS", 0, 0, false);
        declareFunction(me, "naked_in_progress_term_count", "NAKED-IN-PROGRESS-TERM-COUNT", 0, 0, false);
        declareFunction(me, "all_naked_in_progress_terms_internal", "ALL-NAKED-IN-PROGRESS-TERMS-INTERNAL", 1, 0, false);
        declareFunction(me, "forget_ephemeral_term", "FORGET-EPHEMERAL-TERM", 1, 0, false);
        declareFunction(me, "forget_ill_formed_skolems", "FORGET-ILL-FORMED-SKOLEMS", 0, 0, false);
        declareFunction(me, "forget_useless_skolems", "FORGET-USELESS-SKOLEMS", 0, 0, false);
        declareFunction(me, "forget_useless_narts", "FORGET-USELESS-NARTS", 0, 0, false);
        declareFunction(me, "gather_useless_narts", "GATHER-USELESS-NARTS", 0, 0, false);
        declareFunction(me, "forget_narts", "FORGET-NARTS", 2, 0, false);
        declareFunction(me, "forget_function_extent", "FORGET-FUNCTION-EXTENT", 1, 0, false);
        declareFunction(me, "forget_invalid_deductions_and_kb_hl_supports_until_quiesced", "FORGET-INVALID-DEDUCTIONS-AND-KB-HL-SUPPORTS-UNTIL-QUIESCED", 0, 3, false);
        declareFunction(me, "forget_syntactically_invalid_new_deductions", "FORGET-SYNTACTICALLY-INVALID-NEW-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "forget_syntactically_invalid_new_kb_hl_supports", "FORGET-SYNTACTICALLY-INVALID-NEW-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction(me, "forget_invalid_deductions", "FORGET-INVALID-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "forget_invalid_deductions_serial", "FORGET-INVALID-DEDUCTIONS-SERIAL", 1, 0, false);
        declareFunction(me, "identify_invalid_deductions_serial", "IDENTIFY-INVALID-DEDUCTIONS-SERIAL", 1, 0, false);
        declareFunction(me, "identify_invalid_deductions_n_way", "IDENTIFY-INVALID-DEDUCTIONS-N-WAY", 2, 0, false);
        declareFunction(me, "identify_invalid_deductions_worker", "IDENTIFY-INVALID-DEDUCTIONS-WORKER", 4, 0, false);
        declareFunction(me, "deduction_is_forgettableP", "DEDUCTION-IS-FORGETTABLE?", 1, 0, false);
        declareFunction(me, "deduction_has_invalid_supportP", "DEDUCTION-HAS-INVALID-SUPPORT?", 1, 0, false);
        declareFunction(me, "new_invalid_deduction_iterator", "NEW-INVALID-DEDUCTION-ITERATOR", 0, 0, false);
        declareFunction(me, "forget_useless_kb_hl_supports", "FORGET-USELESS-KB-HL-SUPPORTS", 0, 1, false);
        declareFunction(me, "forget_useless_kb_hl_supports_impl", "FORGET-USELESS-KB-HL-SUPPORTS-IMPL", 1, 1, false);
        declareFunction(me, "forget_old_creation_seconds", "FORGET-OLD-CREATION-SECONDS", 0, 0, false);
        declareFunction(me, "forget_old_creation_second_date", "FORGET-OLD-CREATION-SECOND-DATE", 0, 0, false);
        declareFunction(me, "gather_old_creation_seconds", "GATHER-OLD-CREATION-SECONDS", 0, 0, false);
        declareFunction(me, "clean_assertion_assert_info", "CLEAN-ASSERTION-ASSERT-INFO", 0, 0, false);
        declareFunction(me, "duplicate_nart_tuples", "DUPLICATE-NART-TUPLES", 0, 1, false);
        declareFunction(me, "duplicate_narts_to_kill", "DUPLICATE-NARTS-TO-KILL", 0, 0, false);
        declareFunction(me, "kill_duplicate_narts", "KILL-DUPLICATE-NARTS", 0, 0, false);
        declareFunction(me, "duplicate_assertion_tuples", "DUPLICATE-ASSERTION-TUPLES", 0, 1, false);
        declareFunction(me, "group_assertion_by_mt", "GROUP-ASSERTION-BY-MT", 2, 0, false);
        declareFunction(me, "consider_that_assertion_could_be_duplicate", "CONSIDER-THAT-ASSERTION-COULD-BE-DUPLICATE", 3, 0, false);
        declareFunction(me, "assertion_cnf_or_gaf_formula", "ASSERTION-CNF-OR-GAF-FORMULA", 1, 0, false);
        declareFunction(me, "duplicate_tuples_from_dictionary", "DUPLICATE-TUPLES-FROM-DICTIONARY", 1, 0, false);
        declareFunction(me, "put_the_keeper_first", "PUT-THE-KEEPER-FIRST", 1, 0, false);
        declareFunction(me, "blast_duplicate_assertions", "BLAST-DUPLICATE-ASSERTIONS", 0, 1, false);
        declareFunction(me, "blast_duplicate_assertions_without_keepers", "BLAST-DUPLICATE-ASSERTIONS-WITHOUT-KEEPERS", 0, 1, false);
        declareFunction(me, "reconsider_assertions_with_no_arguments_verbose", "RECONSIDER-ASSERTIONS-WITH-NO-ARGUMENTS-VERBOSE", 0, 1, false);
        declareFunction(me, "reconsider_assertions_with_no_arguments", "RECONSIDER-ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
        declareFunction(me, "detect_multiples_via_lexicon", "DETECT-MULTIPLES-VIA-LEXICON", 1, 3, false);
        declareFunction(me, "new_and_removed_infn_narts", "NEW-AND-REMOVED-INFN-NARTS", 2, 2, false);
        declareFunction(me, "new_and_removed_psnfn_narts", "NEW-AND-REMOVED-PSNFN-NARTS", 2, 2, false);
        declareFunction(me, "new_and_removed_narts", "NEW-AND-REMOVED-NARTS", 3, 2, false);
        declareFunction(me, "clear_functor_narts_in_kb", "CLEAR-FUNCTOR-NARTS-IN-KB", 0, 0, false);
        declareFunction(me, "remove_functor_narts_in_kb", "REMOVE-FUNCTOR-NARTS-IN-KB", 3, 0, false);
        declareFunction(me, "functor_narts_in_kb_internal", "FUNCTOR-NARTS-IN-KB-INTERNAL", 3, 0, false);
        declareFunction(me, "functor_narts_in_kb", "FUNCTOR-NARTS-IN-KB", 3, 0, false);
        declareFunction(me, "fcp_sweep", "FCP-SWEEP", 1, 0, false);
        declareFunction(me, "functions_for_fcp_sweep", "FUNCTIONS-FOR-FCP-SWEEP", 0, 0, false);
        declareFunction(me, "fcp_func_G", "FCP-FUNC->", 2, 0, false);
        declareFunction(me, "ke_text_for_unary_function_fcp", "KE-TEXT-FOR-UNARY-FUNCTION-FCP", 1, 0, false);
        declareFunction(me, "fcp_name", "FCP-NAME", 1, 0, false);
        declareFunction(me, "fcp_name_clashP", "FCP-NAME-CLASH?", 1, 0, false);
        declareFunction(me, "fcp_name_int", "FCP-NAME-INT", 1, 0, false);
        declareFunction(me, "fcp_blake_note", "FCP-BLAKE-NOTE", 1, 0, false);
        declareFunction(me, "fcp_predify_function_name", "FCP-PREDIFY-FUNCTION-NAME", 1, 0, false);
        declareFunction(me, "fcp_ends_with_fn_but_has_a_dashed_bit_at_the_endP", "FCP-ENDS-WITH-FN-BUT-HAS-A-DASHED-BIT-AT-THE-END?", 1, 0, false);
        declareFunction(me, "fcp_arg1_isa", "FCP-ARG1-ISA", 1, 0, false);
        declareFunction(me, "fcp_arg2_isa", "FCP-ARG2-ISA", 1, 0, false);
        declareFunction(me, "fcp_comment", "FCP-COMMENT", 1, 0, false);
        declareFunction(me, "fcp_arg1_isa_int", "FCP-ARG1-ISA-INT", 1, 0, false);
        declareFunction(me, "fcp_result_isa_int", "FCP-RESULT-ISA-INT", 1, 0, false);
        declareFunction(me, "strip_outer_parens", "STRIP-OUTER-PARENS", 1, 0, false);
        declareFunction(me, "something", "SOMETHING", 1, 0, false);
        declareFunction(me, "assertions_with_more_than_one_belief", "ASSERTIONS-WITH-MORE-THAN-ONE-BELIEF", 0, 0, false);
        declareFunction(me, "assertion_has_more_than_one_belief", "ASSERTION-HAS-MORE-THAN-ONE-BELIEF", 1, 0, false);
        declareFunction(me, "fixed_arity_relations_without_arities", "FIXED-ARITY-RELATIONS-WITHOUT-ARITIES", 0, 0, false);
        declareFunction(me, "fix_fixed_arity_relations_without_arities", "FIX-FIXED-ARITY-RELATIONS-WITHOUT-ARITIES", 0, 0, false);
        declareFunction(me, "tou_assertion_goodP", "TOU-ASSERTION-GOOD?", 1, 0, false);
        declareFunction(me, "fort_has_genls_assertion_but_is_not_a_collectionP", "FORT-HAS-GENLS-ASSERTION-BUT-IS-NOT-A-COLLECTION?", 1, 0, false);
        declareFunction(me, "fix_forts_with_genls_but_not_collections", "FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_cleanup_file() {
        defparameter("*FORGET-OLD-CREATION-SECOND-MONTHS*", TWELVE_INTEGER);
        deflexical("*FUNCTOR-NARTS-IN-KB-CACHING-STATE*", NIL);
        deflexical("*FUNCTIONS-TO-SKIP-FOR-FCP-SWEEP*", $list91);
        deflexical("*KNOWN-ARITYLESS-RELATIONS*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_cleanup_file() {
        memoization_state.note_globally_cached_function(FUNCTOR_NARTS_IN_KB);
        return NIL;
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

    
}

/**
 * Total time: 2920 ms
 */
