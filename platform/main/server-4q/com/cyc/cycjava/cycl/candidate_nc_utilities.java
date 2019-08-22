package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_candidate_noun_compounds;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class candidate_nc_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new candidate_nc_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.candidate_nc_utilities";

    public static final String myFingerPrint = "523c5e8d73556e4b484b9928d4ac4cc42e790febfd8baf818a4cbc67abc3f26f";

    // defparameter
    public static final SubLSymbol $cnc_test_size$ = makeSymbol("*CNC-TEST-SIZE*");

    // defparameter
    public static final SubLSymbol $cnc_fast_test_size$ = makeSymbol("*CNC-FAST-TEST-SIZE*");

    // defparameter
    public static final SubLSymbol $cnc_query_mt$ = makeSymbol("*CNC-QUERY-MT*");

    // defparameter
    public static final SubLSymbol $cnc_paraphrase_mt$ = makeSymbol("*CNC-PARAPHRASE-MT*");

    // defvar
    public static final SubLSymbol $cnc_running_query_total$ = makeSymbol("*CNC-RUNNING-QUERY-TOTAL*");

    // defparameter
    public static final SubLSymbol $cnc_default_search_engine$ = makeSymbol("*CNC-DEFAULT-SEARCH-ENGINE*");

    // defparameter
    public static final SubLSymbol $cnc_max_string_search_attempts$ = makeSymbol("*CNC-MAX-STRING-SEARCH-ATTEMPTS*");

    // defparameter
    public static final SubLSymbol $cnc_compound_threshold$ = makeSymbol("*CNC-COMPOUND-THRESHOLD*");

    // defparameter
    public static final SubLSymbol $cnc_component_threshold$ = makeSymbol("*CNC-COMPONENT-THRESHOLD*");

    // defparameter
    public static final SubLSymbol $cnc_string_hits_table$ = makeSymbol("*CNC-STRING-HITS-TABLE*");

    // defparameter
    public static final SubLSymbol $scored_ncr_table$ = makeSymbol("*SCORED-NCR-TABLE*");

    // defparameter
    public static final SubLSymbol $unscored_ncr_table$ = makeSymbol("*UNSCORED-NCR-TABLE*");

    // defparameter
    public static final SubLSymbol $use_cnc_iteratorP$ = makeSymbol("*USE-CNC-ITERATOR?*");

    // defparameter
    public static final SubLSymbol $cnc_remove_duplicatesP$ = makeSymbol("*CNC-REMOVE-DUPLICATES?*");

    // deflexical
    private static final SubLSymbol $nc_rule_constraint_predicate_map$ = makeSymbol("*NC-RULE-CONSTRAINT-PREDICATE-MAP*");



    // deflexical
    private static final SubLSymbol $popcorn_timer_pool$ = makeSymbol("*POPCORN-TIMER-POOL*");

    // deflexical
    private static final SubLSymbol $popcorn_timer_pool_lock$ = makeSymbol("*POPCORN-TIMER-POOL-LOCK*");

    // defparameter
    // Look at this many latest attempts.
    private static final SubLSymbol $cnc_popcorn_window$ = makeSymbol("*CNC-POPCORN-WINDOW*");

    // defparameter
    // Stop if we have fewer than this many hits in the window
    private static final SubLSymbol $cnc_popcorn_minimum$ = makeSymbol("*CNC-POPCORN-MINIMUM*");

    // defconstant
    public static final SubLSymbol $dtp_candidate_nc_popcorn_timer$ = makeSymbol("*DTP-CANDIDATE-NC-POPCORN-TIMER*");

    // defconstant
    public static final SubLSymbol $dtp_candidate_nc_iterator_state$ = makeSymbol("*DTP-CANDIDATE-NC-ITERATOR-STATE*");

    // defparameter
    private static final SubLSymbol $cnc_rule_fort$ = makeSymbol("*CNC-RULE-FORT*");

    // defconstant
    public static final SubLSymbol $dtp_candidate_nc_sub_iterator_state$ = makeSymbol("*DTP-CANDIDATE-NC-SUB-ITERATOR-STATE*");

    // defparameter
    /**
     * Give up after this many tries to come up with something that meets the
     * constraints.
     */
    private static final SubLSymbol $cnc_max_tries$ = makeSymbol("*CNC-MAX-TRIES*");

    // defparameter
    private static final SubLSymbol $cnc_pph_demerit_cutoff$ = makeSymbol("*CNC-PPH-DEMERIT-CUTOFF*");

    // defparameter
    private static final SubLSymbol $cnc_max_string_length$ = makeSymbol("*CNC-MAX-STRING-LENGTH*");

    // defparameter
    private static final SubLSymbol $store_w_method_test_keyP$ = makeSymbol("*STORE-W-METHOD-TEST-KEY?*");

    // defparameter
    private static final SubLSymbol $cnc_method_test_keyword$ = makeSymbol("*CNC-METHOD-TEST-KEYWORD*");

    // defparameter
    public static final SubLSymbol $cnc_search_string_hits_bkup_file_prefix$ = makeSymbol("*CNC-SEARCH-STRING-HITS-BKUP-FILE-PREFIX*");

    // defparameter
    public static final SubLSymbol $scored_ncr_bkup_file_prefix$ = makeSymbol("*SCORED-NCR-BKUP-FILE-PREFIX*");

    // defparameter
    public static final SubLSymbol $unscored_ncr_bkup_file_prefix$ = makeSymbol("*UNSCORED-NCR-BKUP-FILE-PREFIX*");

    // defparameter
    public static final SubLSymbol $cnc_bkup_pairs$ = makeSymbol("*CNC-BKUP-PAIRS*");

    // defparameter
    public static final SubLSymbol $create_cnc_testP$ = makeSymbol("*CREATE-CNC-TEST?*");



    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));

    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));





    public static final SubLString $str6$_cyc_top_data_nl_cnc_tests_fht_da = makeString("/cyc/top/data/nl/cnc-tests/fht-data/cnc-string-hits-data-master.fht");

    public static final SubLString $str7$_cyc_top_data_nl_cnc_tests_fht_da = makeString("/cyc/top/data/nl/cnc-tests/fht-data/scored-cnc-test-data-master.fht");

    public static final SubLString $str8$_cyc_top_data_nl_cnc_tests_fht_da = makeString("/cyc/top/data/nl/cnc-tests/fht-data/unscored-cnc-test-data-master.fht");

    private static final SubLObject $$TheNCHead = reader_make_constant_shell(makeString("TheNCHead"));

    private static final SubLObject $$TheNCModifier = reader_make_constant_shell(makeString("TheNCModifier"));

















    private static final SubLObject $$wordForms = reader_make_constant_shell(makeString("wordForms"));

    public static final SubLList $list20 = list(makeSymbol("?PRED"), makeSymbol("?STRING"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static final SubLList $list22 = list(list(reader_make_constant_shell(makeString("termPhrases")), makeSymbol("?DENOT"), makeSymbol("?PRED"), makeSymbol("?STRING")));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    public static final SubLSymbol $sym24$_DENOT = makeSymbol("?DENOT");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$FirstOrderCollection = reader_make_constant_shell(makeString("FirstOrderCollection"));

    public static final SubLList $list27 = list(list(reader_make_constant_shell(makeString("termPhrases")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("CharacterString")), makeSymbol("?STRING")));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$termPhrases = reader_make_constant_shell(makeString("termPhrases"));

    public static final SubLList $list30 = list(makeSymbol("?STRING"));

    public static final SubLList $list31 = list(list(reader_make_constant_shell(makeString("denotation")), makeSymbol("?WORD"), makeSymbol("?POS"), makeSymbol("?NUM"), makeSymbol("?DENOT")));

    public static final SubLString $str32$___The_modifier_is_underconstrain = makeString("~% The modifier is underconstrained: added open #$denotation constraint on ~S.");

    public static final SubLList $list33 = list(list(reader_make_constant_shell(makeString("termPhrases")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("nonPlural-Generic")), makeSymbol("?STRING")));

    public static final SubLString $str34$___The_modifier_is_underconstrain = makeString("~% The modifier is underconstrained:  added #$nonPlural-Generic constraint on ~S.");

    public static final SubLList $list35 = list(list(reader_make_constant_shell(makeString("termPhrases")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("Noun")), makeSymbol("?STRING")));

    public static final SubLString $str36$___The_head_is_underconstrained__ = makeString("~% The head is underconstrained:  added #$Noun constraint on ~S.");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    public static final SubLString $str38$___Added___nonPlural_Generic_cons = makeString("~% Added #$nonPlural-Generic constraint on ~S.");

    public static final SubLString $str39$___The_query_for__S_is___S__ = makeString("~% The query for ~S is: ~S~%");

    public static final SubLList $list40 = list(cons(makeKeyword("PRED"), reader_make_constant_shell(makeString("posPredConstraintForNCR"))), cons(makeKeyword("POS"), reader_make_constant_shell(makeString("posConstraintForNCR"))), cons(makeKeyword("WU"), reader_make_constant_shell(makeString("wordUnitConstraintForNCR"))), cons(makeKeyword("ISA"), reader_make_constant_shell(makeString("isaConstraintForNCR"))), cons(makeKeyword("GENL"), reader_make_constant_shell(makeString("genlsConstraintForNCR"))), cons(makeKeyword("EQL"), reader_make_constant_shell(makeString("equalsConstraintForNCR"))));

    public static final SubLSymbol $sym41$_CONSTRAINT = makeSymbol("?CONSTRAINT");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLSymbol RUN_CNC_QUERY = makeSymbol("RUN-CNC-QUERY");

    public static final SubLList $list44 = cons(makeSymbol("?STRING"), makeSymbol("?DENOT"));

    public static final SubLSymbol $run_cnc_query_caching_state$ = makeSymbol("*RUN-CNC-QUERY-CACHING-STATE*");





    private static final SubLString $str48$___These_candidate_NCs_were_rejec = makeString("~% These candidate NCs were rejected: ~S.");

    private static final SubLList $list49 = cons(makeSymbol("MOD-STRING"), makeSymbol("MOD-DENOT"));

    public static final SubLList $list50 = cons(makeSymbol("HEAD-STRING"), makeSymbol("HEAD-DENOT"));

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLString $str53$Popcorn_timer_minimum_must_be_les = makeString("Popcorn timer minimum must be less than the window.");

    private static final SubLString $$$Popcorn_Timer_Pool_Lock = makeString("Popcorn Timer Pool Lock");



    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol CANDIDATE_NC_POPCORN_TIMER = makeSymbol("CANDIDATE-NC-POPCORN-TIMER");

    private static final SubLSymbol CANDIDATE_NC_POPCORN_TIMER_P = makeSymbol("CANDIDATE-NC-POPCORN-TIMER-P");

    private static final SubLList $list59 = list(makeSymbol("WINDOW"), makeSymbol("MINIMUM"), makeSymbol("INDEX"), makeSymbol("RECENT-FAILURE-COUNT"), makeSymbol("HISTORY"));

    public static final SubLList $list60 = list(makeKeyword("WINDOW"), makeKeyword("MINIMUM"), makeKeyword("INDEX"), makeKeyword("RECENT-FAILURE-COUNT"), makeKeyword("HISTORY"));

    public static final SubLList $list61 = list(makeSymbol("CNC-POPCORN-TIMER-WINDOW"), makeSymbol("CNC-POPCORN-TIMER-MINIMUM"), makeSymbol("CNC-POPCORN-TIMER-INDEX"), makeSymbol("CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT"), makeSymbol("CNC-POPCORN-TIMER-HISTORY"));

    public static final SubLList $list62 = list(makeSymbol("_CSETF-CNC-POPCORN-TIMER-WINDOW"), makeSymbol("_CSETF-CNC-POPCORN-TIMER-MINIMUM"), makeSymbol("_CSETF-CNC-POPCORN-TIMER-INDEX"), makeSymbol("_CSETF-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT"), makeSymbol("_CSETF-CNC-POPCORN-TIMER-HISTORY"));

    private static final SubLSymbol PRINT_CNC_POPCORN_TIMER = makeSymbol("PRINT-CNC-POPCORN-TIMER");

    private static final SubLSymbol CANDIDATE_NC_POPCORN_TIMER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CANDIDATE-NC-POPCORN-TIMER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list65 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CANDIDATE-NC-POPCORN-TIMER-P"));

    public static final SubLSymbol CNC_POPCORN_TIMER_WINDOW = makeSymbol("CNC-POPCORN-TIMER-WINDOW");

    public static final SubLSymbol _CSETF_CNC_POPCORN_TIMER_WINDOW = makeSymbol("_CSETF-CNC-POPCORN-TIMER-WINDOW");

    public static final SubLSymbol CNC_POPCORN_TIMER_MINIMUM = makeSymbol("CNC-POPCORN-TIMER-MINIMUM");

    public static final SubLSymbol _CSETF_CNC_POPCORN_TIMER_MINIMUM = makeSymbol("_CSETF-CNC-POPCORN-TIMER-MINIMUM");

    public static final SubLSymbol CNC_POPCORN_TIMER_INDEX = makeSymbol("CNC-POPCORN-TIMER-INDEX");

    public static final SubLSymbol _CSETF_CNC_POPCORN_TIMER_INDEX = makeSymbol("_CSETF-CNC-POPCORN-TIMER-INDEX");

    public static final SubLSymbol CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT = makeSymbol("CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT");

    public static final SubLSymbol _CSETF_CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT = makeSymbol("_CSETF-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT");

    public static final SubLSymbol CNC_POPCORN_TIMER_HISTORY = makeSymbol("CNC-POPCORN-TIMER-HISTORY");

    public static final SubLSymbol _CSETF_CNC_POPCORN_TIMER_HISTORY = makeSymbol("_CSETF-CNC-POPCORN-TIMER-HISTORY");







    private static final SubLSymbol $RECENT_FAILURE_COUNT = makeKeyword("RECENT-FAILURE-COUNT");



    public static final SubLString $str81$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CANDIDATE_NC_POPCORN_TIMER = makeSymbol("MAKE-CANDIDATE-NC-POPCORN-TIMER");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_POPCORN_TIMER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-POPCORN-TIMER-METHOD");

    private static final SubLString $str87$_CNC_POPCORN_TIMER__S_of__S_ = makeString("<CNC-POPCORN-TIMER ~S of ~S>");

    private static final SubLSymbol CANDIDATE_NC_ITERATOR_STATE = makeSymbol("CANDIDATE-NC-ITERATOR-STATE");

    private static final SubLSymbol CANDIDATE_NC_ITERATOR_STATE_P = makeSymbol("CANDIDATE-NC-ITERATOR-STATE-P");

    private static final SubLList $list90 = list(makeSymbol("RULE-FORT"), makeSymbol("MOD-ITERATOR"), makeSymbol("HEAD-ITERATOR"), makeSymbol("MT"), makeSymbol("DONE?"));

    private static final SubLList $list91 = list(makeKeyword("RULE-FORT"), makeKeyword("MOD-ITERATOR"), makeKeyword("HEAD-ITERATOR"), makeKeyword("MT"), makeKeyword("DONE?"));

    private static final SubLList $list92 = list(makeSymbol("CNC-STATE-RULE-FORT"), makeSymbol("CNC-STATE-MOD-ITERATOR"), makeSymbol("CNC-STATE-HEAD-ITERATOR"), makeSymbol("CNC-STATE-MT"), makeSymbol("CNC-STATE-DONE?"));

    private static final SubLList $list93 = list(makeSymbol("_CSETF-CNC-STATE-RULE-FORT"), makeSymbol("_CSETF-CNC-STATE-MOD-ITERATOR"), makeSymbol("_CSETF-CNC-STATE-HEAD-ITERATOR"), makeSymbol("_CSETF-CNC-STATE-MT"), makeSymbol("_CSETF-CNC-STATE-DONE?"));

    private static final SubLSymbol PRINT_CNC_STATE = makeSymbol("PRINT-CNC-STATE");

    private static final SubLSymbol CANDIDATE_NC_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CANDIDATE-NC-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list96 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CANDIDATE-NC-ITERATOR-STATE-P"));

    private static final SubLSymbol CNC_STATE_RULE_FORT = makeSymbol("CNC-STATE-RULE-FORT");

    private static final SubLSymbol _CSETF_CNC_STATE_RULE_FORT = makeSymbol("_CSETF-CNC-STATE-RULE-FORT");

    private static final SubLSymbol CNC_STATE_MOD_ITERATOR = makeSymbol("CNC-STATE-MOD-ITERATOR");

    private static final SubLSymbol _CSETF_CNC_STATE_MOD_ITERATOR = makeSymbol("_CSETF-CNC-STATE-MOD-ITERATOR");

    private static final SubLSymbol CNC_STATE_HEAD_ITERATOR = makeSymbol("CNC-STATE-HEAD-ITERATOR");

    private static final SubLSymbol _CSETF_CNC_STATE_HEAD_ITERATOR = makeSymbol("_CSETF-CNC-STATE-HEAD-ITERATOR");

    private static final SubLSymbol CNC_STATE_MT = makeSymbol("CNC-STATE-MT");

    private static final SubLSymbol _CSETF_CNC_STATE_MT = makeSymbol("_CSETF-CNC-STATE-MT");

    private static final SubLSymbol $sym105$CNC_STATE_DONE_ = makeSymbol("CNC-STATE-DONE?");

    private static final SubLSymbol $sym106$_CSETF_CNC_STATE_DONE_ = makeSymbol("_CSETF-CNC-STATE-DONE?");











    private static final SubLSymbol MAKE_CANDIDATE_NC_ITERATOR_STATE = makeSymbol("MAKE-CANDIDATE-NC-ITERATOR-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-ITERATOR-STATE-METHOD");

    private static final SubLString $str114$_CNC_STATE__S_ = makeString("<CNC-STATE ~S>");

    private static final SubLObject $$ncRuleConstraint = reader_make_constant_shell(makeString("ncRuleConstraint"));

    private static final SubLSymbol $sym116$CANDIDATE_NC_ITERATOR_DONE_ = makeSymbol("CANDIDATE-NC-ITERATOR-DONE?");

    private static final SubLSymbol CANDIDATE_NC_ITERATOR_NEXT = makeSymbol("CANDIDATE-NC-ITERATOR-NEXT");

    private static final SubLSymbol CANDIDATE_NC_SUB_ITERATOR_STATE = makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE");

    private static final SubLSymbol CANDIDATE_NC_SUB_ITERATOR_STATE_P = makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE-P");

    private static final SubLList $list120 = list(new SubLObject[]{ makeSymbol("WU-CONSTRAINTS"), makeSymbol("EQUALS-CONSTRAINTS"), makeSymbol("GENLS-CONSTRAINTS"), makeSymbol("ISA-CONSTRAINTS"), makeSymbol("POS-CONSTRAINTS"), makeSymbol("POS-PRED-CONSTRAINTS"), makeSymbol("MT"), makeSymbol("PLIST"), makeSymbol("DONE?") });

    private static final SubLList $list121 = list(new SubLObject[]{ makeKeyword("WU-CONSTRAINTS"), makeKeyword("EQUALS-CONSTRAINTS"), makeKeyword("GENLS-CONSTRAINTS"), makeKeyword("ISA-CONSTRAINTS"), makeKeyword("POS-CONSTRAINTS"), makeKeyword("POS-PRED-CONSTRAINTS"), makeKeyword("MT"), makeKeyword("PLIST"), makeKeyword("DONE?") });

    private static final SubLList $list122 = list(new SubLObject[]{ makeSymbol("CNC-SUBSTATE-WU-CONSTRAINTS"), makeSymbol("CNC-SUBSTATE-EQUALS-CONSTRAINTS"), makeSymbol("CNC-SUBSTATE-GENLS-CONSTRAINTS"), makeSymbol("CNC-SUBSTATE-ISA-CONSTRAINTS"), makeSymbol("CNC-SUBSTATE-POS-CONSTRAINTS"), makeSymbol("CNC-SUBSTATE-POS-PRED-CONSTRAINTS"), makeSymbol("CNC-SUBSTATE-MT"), makeSymbol("CNC-SUBSTATE-PLIST"), makeSymbol("CNC-SUBSTATE-DONE?") });

    private static final SubLList $list123 = list(new SubLObject[]{ makeSymbol("_CSETF-CNC-SUBSTATE-WU-CONSTRAINTS"), makeSymbol("_CSETF-CNC-SUBSTATE-EQUALS-CONSTRAINTS"), makeSymbol("_CSETF-CNC-SUBSTATE-GENLS-CONSTRAINTS"), makeSymbol("_CSETF-CNC-SUBSTATE-ISA-CONSTRAINTS"), makeSymbol("_CSETF-CNC-SUBSTATE-POS-CONSTRAINTS"), makeSymbol("_CSETF-CNC-SUBSTATE-POS-PRED-CONSTRAINTS"), makeSymbol("_CSETF-CNC-SUBSTATE-MT"), makeSymbol("_CSETF-CNC-SUBSTATE-PLIST"), makeSymbol("_CSETF-CNC-SUBSTATE-DONE?") });

    private static final SubLSymbol PRINT_CNC_SUBSTATE = makeSymbol("PRINT-CNC-SUBSTATE");

    private static final SubLSymbol CANDIDATE_NC_SUB_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list126 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CANDIDATE-NC-SUB-ITERATOR-STATE-P"));

    private static final SubLSymbol CNC_SUBSTATE_WU_CONSTRAINTS = makeSymbol("CNC-SUBSTATE-WU-CONSTRAINTS");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_WU_CONSTRAINTS = makeSymbol("_CSETF-CNC-SUBSTATE-WU-CONSTRAINTS");

    private static final SubLSymbol CNC_SUBSTATE_EQUALS_CONSTRAINTS = makeSymbol("CNC-SUBSTATE-EQUALS-CONSTRAINTS");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_EQUALS_CONSTRAINTS = makeSymbol("_CSETF-CNC-SUBSTATE-EQUALS-CONSTRAINTS");

    private static final SubLSymbol CNC_SUBSTATE_GENLS_CONSTRAINTS = makeSymbol("CNC-SUBSTATE-GENLS-CONSTRAINTS");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_GENLS_CONSTRAINTS = makeSymbol("_CSETF-CNC-SUBSTATE-GENLS-CONSTRAINTS");

    private static final SubLSymbol CNC_SUBSTATE_ISA_CONSTRAINTS = makeSymbol("CNC-SUBSTATE-ISA-CONSTRAINTS");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_ISA_CONSTRAINTS = makeSymbol("_CSETF-CNC-SUBSTATE-ISA-CONSTRAINTS");

    private static final SubLSymbol CNC_SUBSTATE_POS_CONSTRAINTS = makeSymbol("CNC-SUBSTATE-POS-CONSTRAINTS");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_POS_CONSTRAINTS = makeSymbol("_CSETF-CNC-SUBSTATE-POS-CONSTRAINTS");

    private static final SubLSymbol CNC_SUBSTATE_POS_PRED_CONSTRAINTS = makeSymbol("CNC-SUBSTATE-POS-PRED-CONSTRAINTS");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_POS_PRED_CONSTRAINTS = makeSymbol("_CSETF-CNC-SUBSTATE-POS-PRED-CONSTRAINTS");

    private static final SubLSymbol CNC_SUBSTATE_MT = makeSymbol("CNC-SUBSTATE-MT");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_MT = makeSymbol("_CSETF-CNC-SUBSTATE-MT");

    private static final SubLSymbol CNC_SUBSTATE_PLIST = makeSymbol("CNC-SUBSTATE-PLIST");

    private static final SubLSymbol _CSETF_CNC_SUBSTATE_PLIST = makeSymbol("_CSETF-CNC-SUBSTATE-PLIST");

    private static final SubLSymbol $sym143$CNC_SUBSTATE_DONE_ = makeSymbol("CNC-SUBSTATE-DONE?");

    private static final SubLSymbol $sym144$_CSETF_CNC_SUBSTATE_DONE_ = makeSymbol("_CSETF-CNC-SUBSTATE-DONE?");











    private static final SubLSymbol $POS_PRED_CONSTRAINTS = makeKeyword("POS-PRED-CONSTRAINTS");



    private static final SubLSymbol MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE = makeSymbol("MAKE-CANDIDATE-NC-SUB-ITERATOR-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_SUB_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-SUB-ITERATOR-STATE-METHOD");

    private static final SubLString $str154$_CNC_SUBSTATE_ = makeString("<CNC-SUBSTATE>");

    private static final SubLSymbol $sym155$CNC_MOD_ITERATOR_DONE_ = makeSymbol("CNC-MOD-ITERATOR-DONE?");

    private static final SubLSymbol CNC_MOD_ITERATOR_NEXT = makeSymbol("CNC-MOD-ITERATOR-NEXT");

    private static final SubLSymbol $sym157$CNC_HEAD_ITERATOR_DONE_ = makeSymbol("CNC-HEAD-ITERATOR-DONE?");

    private static final SubLSymbol CNC_HEAD_ITERATOR_NEXT = makeSymbol("CNC-HEAD-ITERATOR-NEXT");

    private static final SubLString $str159$Don_t_know_how_to_get__S_pair_fro = makeString("Don't know how to get ~S pair from ~S yet.");

    private static final SubLString $str160$_CNC_RULE_FORT__is_a_non_FORT___S = makeString("*CNC-RULE-FORT* is a non-FORT: ~S");



    private static final SubLList $list162 = list(new SubLObject[]{ reader_make_constant_shell(makeString("singular-Masculine")), reader_make_constant_shell(makeString("singular-Neuter")), reader_make_constant_shell(makeString("singular-Feminine")), reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("gerund-Singular")), reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("agentive-Mass")), reader_make_constant_shell(makeString("gerund")) });



    private static final SubLString $str164$More_than_one_equals_constraint__ = makeString("More than one equals constraint!~% ~S");

    private static final SubLString $str165$Couldn_t_find_string_for__S_match = makeString("Couldn't find string for ~S matching ~S and ~S");



    private static final SubLSymbol $CHEAPEST_CONSTRAINT_MATCHES = makeKeyword("CHEAPEST-CONSTRAINT-MATCHES");

    private static final SubLString $str168$_S_tries___ = makeString("~S tries...");

    private static final SubLString $str169$Couldn_t_find_a_string_denot_pair = makeString("Couldn't find a string-denot pair for ~S after ~S tries.");



    private static final SubLList $list171 = list(reader_make_constant_shell(makeString("nonPlural-Generic")), reader_make_constant_shell(makeString("nameString")));

    private static final SubLList $list172 = list(reader_make_constant_shell(makeString("nounStrings")));

    private static final SubLList $list173 = list(makeSymbol("NL-GENERATION-CACHE-METHOD"));



    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLList $list177 = list(makeString(" "));

    private static final SubLObject $$NounCompoundRule = reader_make_constant_shell(makeString("NounCompoundRule"));

    private static final SubLString $str179$_S__ = makeString("~S~%");

    private static final SubLString $str180$Started_scoring__S_at__S_____ = makeString("Started scoring ~S at ~S...~%");





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol YAHOO_COUNT = makeSymbol("YAHOO-COUNT");





    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLSymbol CNC_GET_ENGINE = makeSymbol("CNC-GET-ENGINE");





    private static final SubLSymbol $sym192$STRING_HITS_KNOWN_ = makeSymbol("STRING-HITS-KNOWN?");







    private static final SubLString $str196$Searched__A_for___S___Number_of_h = makeString("Searched ~A for: ~S~% Number of hits: ~S~%  Running query total is: ~S~%");

    private static final SubLString $str197$_cyc_top_data_nl_cnc_tests_bkup_f = makeString("/cyc/top/data/nl/cnc-tests/bkup-files/bkup-for-cnc-string-hits-data-");

    private static final SubLString $str198$_cyc_top_data_nl_cnc_tests_bkup_f = makeString("/cyc/top/data/nl/cnc-tests/bkup-files/bkup-for-scored-cnc-test-data-");

    private static final SubLString $str199$_cyc_top_data_nl_cnc_tests_bkup_f = makeString("/cyc/top/data/nl/cnc-tests/bkup-files/bkup-for-unscored-cnc-test-data-");

    private static final SubLString $str200$_lisp = makeString(".lisp");



    private static final SubLString $str202$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str203$_S = makeString("~S");

    private static final SubLSymbol $sym204$_ = makeSymbol("+");

    public static SubLObject cnc_paraphrase_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cnc_paraphrase_mt$.getDynamicValue(thread);
    }

    public static SubLObject generate_cnc_test_strings(final SubLObject rule, SubLObject number, SubLObject mt, SubLObject remove_duplicatesP) {
        if (number == UNPROVIDED) {
            number = $cnc_test_size$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $cnc_query_mt$.getDynamicValue();
        }
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = $cnc_remove_duplicatesP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject compound_list = (NIL != $use_cnc_iteratorP$.getDynamicValue(thread)) ? generate_cnc_test_strings_from_iterator(czer_main.canonicalize_term(rule, UNPROVIDED), number, mt, remove_duplicatesP) : generate_cnc_test_strings_via_query(czer_main.canonicalize_term(rule, UNPROVIDED), number, mt, remove_duplicatesP);
        if (NIL != compound_list) {
            compound_list = filter_cnc_semantics(czer_main.canonicalize_term(rule, UNPROVIDED), compound_list);
        }
        return compound_list;
    }

    public static SubLObject generate_cnc_test_strings_via_query(final SubLObject rule, final SubLObject number, final SubLObject mt, final SubLObject remove_duplicatesP) {
        SubLObject compound_list = NIL;
        final SubLObject headword_results = cnc_string_denot_pairs(rule, $$TheNCHead, mt);
        final SubLObject modifier_results = cnc_string_denot_pairs(rule, $$TheNCModifier, mt);
        final SubLObject selected_headwords = get_random_n(number, headword_results);
        final SubLObject selected_modifiers = get_random_n(number, modifier_results);
        if ((NIL != selected_headwords) && (NIL != selected_modifiers)) {
            compound_list = combine_cnc_modifier_head_lists(selected_modifiers, selected_headwords, remove_duplicatesP);
        }
        return compound_list;
    }

    public static SubLObject generate_cnc_test_strings_from_iterator(final SubLObject rule, final SubLObject number, final SubLObject mt, final SubLObject remove_duplicatesP) {
        SubLObject compound_list = NIL;
        final SubLObject cnc_it = new_candidate_nc_iterator(rule, mt);
        final SubLObject popcorn_timer = new_cnc_popcorn_timer(UNPROVIDED, UNPROVIDED);
        while (((NIL == iteration.iteration_done(cnc_it)) && (NIL == list_utilities.lengthGE(compound_list, number, UNPROVIDED))) && (NIL == cnc_popcorn_poppedP(popcorn_timer))) {
            final SubLObject next = iteration.iteration_next(cnc_it);
            final SubLObject failP = makeBoolean((NIL == remove_duplicatesP) || (NIL != member(next, compound_list, symbol_function(EQUAL), UNPROVIDED)));
            if (NIL != failP) {
                cnc_popcorn_note_failure(popcorn_timer);
            } else {
                if (!next.isCons()) {
                    continue;
                }
                compound_list = cons(next, compound_list);
                cnc_popcorn_note_success(popcorn_timer);
            }
        } 
        free_popcorn_timer(popcorn_timer);
        return compound_list;
    }

    public static SubLObject cnc_string_denot_pairs(final SubLObject rule, final SubLObject v_term, final SubLObject mt) {
        final SubLObject query_properties = list($PRODUCTIVITY_LIMIT, $POSITIVE_INFINITY);
        final SubLObject query_sentence = construct_cnc_query(rule, v_term);
        return run_cnc_query(query_sentence, mt, query_properties);
    }

    public static SubLObject construct_cnc_query(final SubLObject rule, final SubLObject v_term) {
        final SubLObject wu_constraints = nc_rule_term_constraints_of_type(rule, v_term, $WU);
        final SubLObject equals_constraints = nc_rule_term_constraints_of_type(rule, v_term, $EQL);
        final SubLObject genls_constraints = nc_rule_term_constraints_of_type(rule, v_term, $GENL);
        final SubLObject isa_constraints = nc_rule_term_constraints_of_type(rule, v_term, $ISA);
        final SubLObject pos_constraints = nc_rule_term_constraints_of_type(rule, v_term, $POS);
        final SubLObject pos_pred_constraints = nc_rule_term_constraints_of_type(rule, v_term, $PRED);
        SubLObject query_conjuncts = NIL;
        SubLObject cdolist_list_var = wu_constraints;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_conjuncts = cons(listS($$wordForms, word, $list20), query_conjuncts);
            query_conjuncts = cons(listS($$ist, cnc_paraphrase_mt(), $list22), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        cdolist_list_var = equals_constraints;
        SubLObject v_equals = NIL;
        v_equals = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_conjuncts = cons(list($$equals, $sym24$_DENOT, v_equals), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            v_equals = cdolist_list_var.first();
        } 
        cdolist_list_var = genls_constraints;
        SubLObject v_genls = NIL;
        v_genls = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_conjuncts = cons(list($$genls, $sym24$_DENOT, v_genls), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            v_genls = cdolist_list_var.first();
        } 
        cdolist_list_var = isa_constraints;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isaP(v_isa, $$FirstOrderCollection, UNPROVIDED, UNPROVIDED)) {
                query_conjuncts = cons(listS($$ist, cnc_paraphrase_mt(), $list27), query_conjuncts);
            }
            query_conjuncts = cons(list($$isa, $sym24$_DENOT, v_isa), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = pos_constraints;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_conjuncts = cons(list($$ist, cnc_paraphrase_mt(), listS($$termPhrases, $sym24$_DENOT, pos, $list30)), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        cdolist_list_var = pos_pred_constraints;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_conjuncts = cons(list($$ist, cnc_paraphrase_mt(), listS($$termPhrases, $sym24$_DENOT, pred, $list30)), query_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        if ((((NIL == isa_constraints) && (NIL == genls_constraints)) && (NIL == equals_constraints)) && v_term.equal($$TheNCModifier)) {
            query_conjuncts = cons(listS($$ist, cnc_paraphrase_mt(), $list31), query_conjuncts);
            Errors.warn($str32$___The_modifier_is_underconstrain, v_term);
        }
        if ((NIL == pos_constraints) && (NIL == pos_pred_constraints)) {
            if (v_term.equal($$TheNCModifier)) {
                query_conjuncts = cons(listS($$ist, cnc_paraphrase_mt(), $list33), query_conjuncts);
                Errors.warn($str34$___The_modifier_is_underconstrain, v_term);
            }
            if (v_term.equal($$TheNCHead)) {
                query_conjuncts = cons(listS($$ist, cnc_paraphrase_mt(), $list35), query_conjuncts);
                Errors.warn($str36$___The_head_is_underconstrained__, v_term);
            }
        }
        if ((v_term.equal($$TheNCModifier) && (NIL != lexicon_accessors.genl_posP(pos_constraints.first(), $$Noun, UNPROVIDED))) && (NIL == pos_pred_constraints)) {
            query_conjuncts = cons(listS($$ist, cnc_paraphrase_mt(), $list33), query_conjuncts);
            Errors.warn($str38$___Added___nonPlural_Generic_cons, v_term);
        }
        final SubLObject query = simplifier.conjoin(query_conjuncts, UNPROVIDED);
        Errors.warn($str39$___The_query_for__S_is___S__, v_term, query);
        return query;
    }

    public static SubLObject nc_rule_term_constraints_of_type(final SubLObject rule, final SubLObject v_term, final SubLObject type) {
        final SubLObject pred = list_utilities.alist_lookup_without_values($nc_rule_constraint_predicate_map$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED);
        final SubLObject var = $sym41$_CONSTRAINT;
        final SubLObject query_sentence = (NIL != pred) ? make_ternary_formula(pred, rule, v_term, var) : NIL;
        final SubLObject query_mt = $$InferencePSC;
        return NIL != query_sentence ? ask_utilities.query_variable(var, query_sentence, query_mt, UNPROVIDED) : NIL;
    }

    public static SubLObject clear_run_cnc_query() {
        final SubLObject cs = $run_cnc_query_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_run_cnc_query(final SubLObject query, final SubLObject mt, final SubLObject query_properties) {
        return memoization_state.caching_state_remove_function_results_with_args($run_cnc_query_caching_state$.getGlobalValue(), list(query, mt, query_properties), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_cnc_query_internal(final SubLObject query, final SubLObject mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.query_template($list44, query, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_answer = results;
        return v_answer;
    }

    public static SubLObject run_cnc_query(final SubLObject query, final SubLObject mt, final SubLObject query_properties) {
        SubLObject caching_state = $run_cnc_query_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RUN_CNC_QUERY, $run_cnc_query_caching_state$, NIL, EQUALP, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(query, mt, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(run_cnc_query_internal(query, mt, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query, mt, query_properties));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject filter_cnc_semantics(final SubLObject rule, final SubLObject candidate_list) {
        SubLObject new_list = NIL;
        SubLObject rejected = NIL;
        SubLObject cdolist_list_var = candidate_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject template = noun_compound_parser.rbp_rule_cycl_semx(rule, UNPROVIDED);
            final SubLObject modifier = fourth(item);
            final SubLObject head = fifth(item);
            if (NIL != rbp_wff.rbp_wf_template_argsP(template, list(bq_cons($MODIFIER, modifier), bq_cons($HEAD, head)), TWO_INTEGER)) {
                new_list = cons(item, new_list);
            } else {
                rejected = cons(item, rejected);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL != rejected) {
            Errors.warn($str48$___These_candidate_NCs_were_rejec, rejected);
        }
        return new_list;
    }

    public static SubLObject combine_cnc_modifier_head_lists(SubLObject mod_list, SubLObject head_list, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = T;
        }
        SubLObject combined_list = NIL;
        while ((NIL == list_utilities.empty_list_p(mod_list)) && (NIL == list_utilities.empty_list_p(head_list))) {
            final SubLObject mod_pair = mod_list.first();
            final SubLObject head_pair = head_list.first();
            final SubLObject result = combine_cnc_pairs(mod_pair, head_pair);
            combined_list = cons(result, combined_list);
            mod_list = mod_list.rest();
            head_list = head_list.rest();
        } 
        if (NIL != remove_duplicatesP) {
            return remove_duplicates(combined_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return combined_list;
    }

    public static SubLObject combine_cnc_pairs(final SubLObject mod_pair, final SubLObject head_pair) {
        SubLObject mod_string = NIL;
        SubLObject mod_denot = NIL;
        destructuring_bind_must_consp(mod_pair, mod_pair, $list49);
        mod_string = mod_pair.first();
        final SubLObject current = mod_denot = mod_pair.rest();
        SubLObject head_string = NIL;
        SubLObject head_denot = NIL;
        destructuring_bind_must_consp(head_pair, head_pair, $list50);
        head_string = head_pair.first();
        final SubLObject current_$2 = head_denot = head_pair.rest();
        final SubLObject compound_string = cconcatenate(mod_string, new SubLObject[]{ $$$_, head_string });
        return list(compound_string, mod_string, head_string, mod_denot, head_denot);
    }

    public static SubLObject get_random_n(final SubLObject number, final SubLObject list) {
        final SubLObject length = length(list);
        SubLObject new_list = list;
        if (!length.numGE(number)) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = number_utilities.f_1_(ceiling(divide(number, length), UNPROVIDED)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                new_list = append(list, new_list);
            }
        }
        return list_utilities.random_n(number, new_list);
    }

    public static SubLObject new_cnc_popcorn_timer(SubLObject window, SubLObject minimum) {
        if (window == UNPROVIDED) {
            window = cnc_popcorn_window();
        }
        if (minimum == UNPROVIDED) {
            minimum = cnc_popcorn_minimum();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(window) : "subl_promotions.positive_integer_p(window) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(window) " + window;
        assert NIL != subl_promotions.positive_integer_p(minimum) : "subl_promotions.positive_integer_p(minimum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(minimum) " + minimum;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!minimum.numL(window))) {
            Errors.error($str53$Popcorn_timer_minimum_must_be_les);
        }
        return find_or_create_cnc_popcorn_timer(window, minimum);
    }

    public static SubLObject cnc_popcorn_note_success(final SubLObject popcorn_timer) {
        cnc_popcorn_note_new_result(popcorn_timer, T);
        return popcorn_timer;
    }

    public static SubLObject cnc_popcorn_note_failure(final SubLObject popcorn_timer) {
        cnc_popcorn_note_new_result(popcorn_timer, NIL);
        return popcorn_timer;
    }

    public static SubLObject cnc_popcorn_poppedP(final SubLObject popcorn_timer) {
        final SubLObject minimum = get_cnc_popcorn_timer_minimum(popcorn_timer);
        final SubLObject window = get_cnc_popcorn_timer_window(popcorn_timer);
        final SubLObject recent_failure_count = get_cnc_popcorn_timer_recent_failure_count(popcorn_timer);
        return numG(recent_failure_count, subtract(window, minimum));
    }

    public static SubLObject free_popcorn_timer(final SubLObject popcorn_timer) {
        dictionary_utilities.dictionary_pushnew($popcorn_timer_pool$.getGlobalValue(), get_cnc_popcorn_timer_window(popcorn_timer), popcorn_timer, UNPROVIDED, UNPROVIDED);
        return $FREE;
    }

    public static SubLObject popcorn_timer_from_pool(final SubLObject window) {
        SubLObject popcorn_timer = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($popcorn_timer_pool_lock$.getGlobalValue());
            final SubLObject existing = dictionary.dictionary_lookup_without_values($popcorn_timer_pool$.getGlobalValue(), window, UNPROVIDED);
            if (NIL != existing) {
                popcorn_timer = existing.first();
                dictionary.dictionary_enter($popcorn_timer_pool$.getGlobalValue(), window, existing.rest());
            }
        } finally {
            if (NIL != release) {
                release_lock($popcorn_timer_pool_lock$.getGlobalValue());
            }
        }
        if (NIL != popcorn_timer) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(window); i = add(i, ONE_INTEGER)) {
                set_aref(cnc_popcorn_timer_history(popcorn_timer), i, NIL);
            }
        }
        return popcorn_timer;
    }

    public static SubLObject cnc_popcorn_window() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cnc_popcorn_window$.getDynamicValue(thread);
    }

    public static SubLObject cnc_popcorn_minimum() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cnc_popcorn_minimum$.getDynamicValue(thread);
    }

    public static SubLObject candidate_nc_popcorn_timer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cnc_popcorn_timer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject candidate_nc_popcorn_timer_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$candidate_nc_popcorn_timer_native.class ? T : NIL;
    }

    public static SubLObject cnc_popcorn_timer_window(final SubLObject v_object) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cnc_popcorn_timer_minimum(final SubLObject v_object) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cnc_popcorn_timer_index(final SubLObject v_object) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject cnc_popcorn_timer_recent_failure_count(final SubLObject v_object) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject cnc_popcorn_timer_history(final SubLObject v_object) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_cnc_popcorn_timer_window(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cnc_popcorn_timer_minimum(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cnc_popcorn_timer_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cnc_popcorn_timer_recent_failure_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cnc_popcorn_timer_history(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_popcorn_timer_p(v_object) : "candidate_nc_utilities.candidate_nc_popcorn_timer_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_candidate_nc_popcorn_timer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $candidate_nc_popcorn_timer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($WINDOW)) {
                _csetf_cnc_popcorn_timer_window(v_new, current_value);
            } else
                if (pcase_var.eql($MINIMUM)) {
                    _csetf_cnc_popcorn_timer_minimum(v_new, current_value);
                } else
                    if (pcase_var.eql($INDEX)) {
                        _csetf_cnc_popcorn_timer_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($RECENT_FAILURE_COUNT)) {
                            _csetf_cnc_popcorn_timer_recent_failure_count(v_new, current_value);
                        } else
                            if (pcase_var.eql($HISTORY)) {
                                _csetf_cnc_popcorn_timer_history(v_new, current_value);
                            } else {
                                Errors.error($str81$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_candidate_nc_popcorn_timer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CANDIDATE_NC_POPCORN_TIMER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $WINDOW, cnc_popcorn_timer_window(obj));
        funcall(visitor_fn, obj, $SLOT, $MINIMUM, cnc_popcorn_timer_minimum(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, cnc_popcorn_timer_index(obj));
        funcall(visitor_fn, obj, $SLOT, $RECENT_FAILURE_COUNT, cnc_popcorn_timer_recent_failure_count(obj));
        funcall(visitor_fn, obj, $SLOT, $HISTORY, cnc_popcorn_timer_history(obj));
        funcall(visitor_fn, obj, $END, MAKE_CANDIDATE_NC_POPCORN_TIMER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_candidate_nc_popcorn_timer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_candidate_nc_popcorn_timer(obj, visitor_fn);
    }

    public static SubLObject print_cnc_popcorn_timer(final SubLObject timer, final SubLObject stream, final SubLObject depth) {
        format(stream, $str87$_CNC_POPCORN_TIMER__S_of__S_, cnc_popcorn_timer_minimum(timer), cnc_popcorn_timer_window(timer));
        return NIL;
    }

    public static SubLObject get_cnc_popcorn_timer_window(final SubLObject timer) {
        return cnc_popcorn_timer_window(timer);
    }

    public static SubLObject get_cnc_popcorn_timer_minimum(final SubLObject timer) {
        return cnc_popcorn_timer_minimum(timer);
    }

    public static SubLObject get_cnc_popcorn_timer_recent_failure_count(final SubLObject timer) {
        return cnc_popcorn_timer_recent_failure_count(timer);
    }

    public static SubLObject find_or_create_cnc_popcorn_timer(final SubLObject window, final SubLObject minimum) {
        final SubLObject resourced_timer = popcorn_timer_from_pool(window);
        final SubLObject timer = (NIL != resourced_timer) ? resourced_timer : make_candidate_nc_popcorn_timer(UNPROVIDED);
        _csetf_cnc_popcorn_timer_window(timer, window);
        _csetf_cnc_popcorn_timer_minimum(timer, minimum);
        _csetf_cnc_popcorn_timer_index(timer, ZERO_INTEGER);
        _csetf_cnc_popcorn_timer_recent_failure_count(timer, ZERO_INTEGER);
        if (NIL == resourced_timer) {
            _csetf_cnc_popcorn_timer_history(timer, make_vector(window, UNPROVIDED));
        }
        return timer;
    }

    public static SubLObject cnc_popcorn_note_new_result(final SubLObject popcorn_timer, final SubLObject successP) {
        final SubLObject index = cnc_popcorn_timer_index(popcorn_timer);
        final SubLObject history = cnc_popcorn_timer_history(popcorn_timer);
        final SubLObject old_value = aref(history, index);
        final SubLObject new_value = (NIL != successP) ? ONE_INTEGER : ZERO_INTEGER;
        set_aref(history, index, new_value);
        _csetf_cnc_popcorn_timer_index(popcorn_timer, index.isPositive() ? number_utilities.f_1_(index) : number_utilities.f_1_(length(history)));
        if (ZERO_INTEGER.eql(old_value)) {
            _csetf_cnc_popcorn_timer_recent_failure_count(popcorn_timer, subtract(cnc_popcorn_timer_recent_failure_count(popcorn_timer), ONE_INTEGER));
        }
        if (ZERO_INTEGER.eql(new_value)) {
            _csetf_cnc_popcorn_timer_recent_failure_count(popcorn_timer, add(cnc_popcorn_timer_recent_failure_count(popcorn_timer), ONE_INTEGER));
        }
        return popcorn_timer;
    }

    public static SubLObject candidate_nc_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cnc_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject candidate_nc_iterator_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$candidate_nc_iterator_state_native.class ? T : NIL;
    }

    public static SubLObject cnc_state_rule_fort(final SubLObject v_object) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cnc_state_mod_iterator(final SubLObject v_object) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cnc_state_head_iterator(final SubLObject v_object) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject cnc_state_mt(final SubLObject v_object) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject cnc_state_doneP(final SubLObject v_object) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_cnc_state_rule_fort(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cnc_state_mod_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cnc_state_head_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cnc_state_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cnc_state_doneP(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_candidate_nc_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $candidate_nc_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RULE_FORT)) {
                _csetf_cnc_state_rule_fort(v_new, current_value);
            } else
                if (pcase_var.eql($MOD_ITERATOR)) {
                    _csetf_cnc_state_mod_iterator(v_new, current_value);
                } else
                    if (pcase_var.eql($HEAD_ITERATOR)) {
                        _csetf_cnc_state_head_iterator(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_cnc_state_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($DONE_)) {
                                _csetf_cnc_state_doneP(v_new, current_value);
                            } else {
                                Errors.error($str81$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_candidate_nc_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CANDIDATE_NC_ITERATOR_STATE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RULE_FORT, cnc_state_rule_fort(obj));
        funcall(visitor_fn, obj, $SLOT, $MOD_ITERATOR, cnc_state_mod_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $HEAD_ITERATOR, cnc_state_head_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, cnc_state_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_, cnc_state_doneP(obj));
        funcall(visitor_fn, obj, $END, MAKE_CANDIDATE_NC_ITERATOR_STATE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_candidate_nc_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_candidate_nc_iterator_state(obj, visitor_fn);
    }

    public static SubLObject print_cnc_state(final SubLObject state, final SubLObject stream, final SubLObject depth) {
        format(stream, $str114$_CNC_STATE__S_, cnc_state_rule_fort(state));
        return NIL;
    }

    public static SubLObject new_candidate_nc_iterator(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $cnc_query_mt$.getDynamicValue();
        }
        final SubLObject mod_iterator = new_cnc_mod_iterator(rule, mt);
        final SubLObject head_iterator = new_cnc_head_iterator(rule, mt);
        final SubLObject cnc_state = make_candidate_nc_iterator_state(list(new SubLObject[]{ $RULE_FORT, rule, $MOD_ITERATOR, mod_iterator, $HEAD_ITERATOR, head_iterator, $MT, mt, $DONE_, makeBoolean(NIL == kb_mapping_utilities.some_pred_value_in_relevant_mts(rule, $$ncRuleConstraint, mt, UNPROVIDED, UNPROVIDED)) }));
        return iteration.new_iterator(cnc_state, $sym116$CANDIDATE_NC_ITERATOR_DONE_, CANDIDATE_NC_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject candidate_nc_iterator_doneP(final SubLObject state) {
        return makeBoolean(((NIL != iteration.iteration_done(cnc_state_mod_iterator(state))) || (NIL != iteration.iteration_done(cnc_state_head_iterator(state)))) || (NIL != cnc_state_doneP(state)));
    }

    public static SubLObject candidate_nc_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mod_pair = NIL;
        SubLObject head_pair = NIL;
        final SubLObject _prev_bind_0 = $cnc_rule_fort$.currentBinding(thread);
        try {
            $cnc_rule_fort$.bind(cnc_state_rule_fort(state), thread);
            mod_pair = iteration.iteration_next_without_values(cnc_state_mod_iterator(state), UNPROVIDED);
            head_pair = iteration.iteration_next_without_values(cnc_state_head_iterator(state), UNPROVIDED);
        } finally {
            $cnc_rule_fort$.rebind(_prev_bind_0, thread);
        }
        return values((NIL != mod_pair) && (NIL != head_pair) ? combine_cnc_pairs(mod_pair, head_pair) : NIL, state);
    }

    public static SubLObject candidate_nc_sub_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cnc_substate(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject candidate_nc_sub_iterator_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$candidate_nc_sub_iterator_state_native.class ? T : NIL;
    }

    public static SubLObject cnc_substate_wu_constraints(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cnc_substate_equals_constraints(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cnc_substate_genls_constraints(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject cnc_substate_isa_constraints(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject cnc_substate_pos_constraints(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject cnc_substate_pos_pred_constraints(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject cnc_substate_mt(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject cnc_substate_plist(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject cnc_substate_doneP(final SubLObject v_object) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_cnc_substate_wu_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cnc_substate_equals_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cnc_substate_genls_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cnc_substate_isa_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cnc_substate_pos_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_cnc_substate_pos_pred_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_cnc_substate_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_cnc_substate_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_cnc_substate_doneP(final SubLObject v_object, final SubLObject value) {
        assert NIL != candidate_nc_sub_iterator_state_p(v_object) : "candidate_nc_utilities.candidate_nc_sub_iterator_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_candidate_nc_sub_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $candidate_nc_sub_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($WU_CONSTRAINTS)) {
                _csetf_cnc_substate_wu_constraints(v_new, current_value);
            } else
                if (pcase_var.eql($EQUALS_CONSTRAINTS)) {
                    _csetf_cnc_substate_equals_constraints(v_new, current_value);
                } else
                    if (pcase_var.eql($GENLS_CONSTRAINTS)) {
                        _csetf_cnc_substate_genls_constraints(v_new, current_value);
                    } else
                        if (pcase_var.eql($ISA_CONSTRAINTS)) {
                            _csetf_cnc_substate_isa_constraints(v_new, current_value);
                        } else
                            if (pcase_var.eql($POS_CONSTRAINTS)) {
                                _csetf_cnc_substate_pos_constraints(v_new, current_value);
                            } else
                                if (pcase_var.eql($POS_PRED_CONSTRAINTS)) {
                                    _csetf_cnc_substate_pos_pred_constraints(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MT)) {
                                        _csetf_cnc_substate_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PLIST)) {
                                            _csetf_cnc_substate_plist(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($DONE_)) {
                                                _csetf_cnc_substate_doneP(v_new, current_value);
                                            } else {
                                                Errors.error($str81$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_candidate_nc_sub_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $WU_CONSTRAINTS, cnc_substate_wu_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $EQUALS_CONSTRAINTS, cnc_substate_equals_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $GENLS_CONSTRAINTS, cnc_substate_genls_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $ISA_CONSTRAINTS, cnc_substate_isa_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $POS_CONSTRAINTS, cnc_substate_pos_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $POS_PRED_CONSTRAINTS, cnc_substate_pos_pred_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, cnc_substate_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, cnc_substate_plist(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_, cnc_substate_doneP(obj));
        funcall(visitor_fn, obj, $END, MAKE_CANDIDATE_NC_SUB_ITERATOR_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_candidate_nc_sub_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_candidate_nc_sub_iterator_state(obj, visitor_fn);
    }

    public static SubLObject print_cnc_substate(final SubLObject state, final SubLObject stream, final SubLObject depth) {
        format(stream, $str154$_CNC_SUBSTATE_);
        return NIL;
    }

    public static SubLObject cnc_substate_plist_enter(final SubLObject state, final SubLObject key, final SubLObject value) {
        _csetf_cnc_substate_plist(state, putf(cnc_substate_plist(state), key, value));
        return cnc_substate_plist(state);
    }

    public static SubLObject cnc_substate_plist_lookup(final SubLObject state, final SubLObject key, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        return getf(cnc_substate_plist(state), key, default_value);
    }

    public static SubLObject new_cnc_mod_iterator(final SubLObject rule, final SubLObject mt) {
        final SubLObject state = make_candidate_nc_sub_iterator_state(cnc_sub_iterator_slot_values(rule, $$TheNCModifier, mt));
        return iteration.new_iterator(state, $sym155$CNC_MOD_ITERATOR_DONE_, CNC_MOD_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject cnc_mod_iterator_doneP(final SubLObject state) {
        return cnc_substate_doneP(state);
    }

    public static SubLObject cnc_mod_iterator_next(final SubLObject state) {
        final SubLObject mod_pair = cnc_random_mod_pair_from_state(state);
        return values(mod_pair, state);
    }

    public static SubLObject cnc_random_mod_pair_from_state(final SubLObject state) {
        return cnc_random_pair_from_state(state, $MODIFIER);
    }

    public static SubLObject cnc_sub_iterator_slot_values(final SubLObject rule, final SubLObject v_term, final SubLObject mt) {
        return list(new SubLObject[]{ $WU_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, $WU), $EQUALS_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, $EQL), $GENLS_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, $GENL), $ISA_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, $ISA), $POS_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, $POS), $POS_PRED_CONSTRAINTS, nc_rule_term_constraints_of_type(rule, v_term, $PRED), $MT, mt });
    }

    public static SubLObject new_cnc_head_iterator(final SubLObject rule, final SubLObject mt) {
        final SubLObject state = make_candidate_nc_sub_iterator_state(cnc_sub_iterator_slot_values(rule, $$TheNCHead, mt));
        return iteration.new_iterator(state, $sym157$CNC_HEAD_ITERATOR_DONE_, CNC_HEAD_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject cnc_head_iterator_doneP(final SubLObject state) {
        return cnc_substate_doneP(state);
    }

    public static SubLObject cnc_head_iterator_next(final SubLObject state) {
        final SubLObject head_pair = cnc_random_head_pair_from_state(state);
        return values(head_pair, state);
    }

    public static SubLObject cnc_random_head_pair_from_state(final SubLObject state) {
        return cnc_random_pair_from_state(state, $HEAD);
    }

    public static SubLObject cnc_random_pair_from_state(final SubLObject state, final SubLObject head_or_modifier) {
        if (NIL != cnc_substate_wu_constraints(state)) {
            return cnc_random_pair_from_wu_constraints(state, head_or_modifier);
        }
        if (NIL != cnc_substate_equals_constraints(state)) {
            return cnc_random_pair_from_equals_constraints(state, head_or_modifier);
        }
        if ((NIL != cnc_substate_isa_constraints(state)) || (NIL != cnc_substate_genls_constraints(state))) {
            return cnc_random_pair_from_isaXgenls_constraints(state, head_or_modifier);
        }
        Errors.warn($str159$Don_t_know_how_to_get__S_pair_fro, head_or_modifier, state);
        _csetf_cnc_substate_doneP(state, T);
        return NIL;
    }

    public static SubLObject cnc_random_pair_via_query(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p($cnc_rule_fort$.getDynamicValue(thread)))) {
            Errors.error($str160$_CNC_RULE_FORT__is_a_non_FORT___S, $cnc_rule_fort$.getDynamicValue(thread));
        }
        final SubLObject pairs = get_cnc_substate_query_pairs(state, head_or_modifier);
        return list_utilities.random_element(pairs);
    }

    public static SubLObject get_cnc_substate_query_pairs(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = list_utilities.alist_lookup_without_values(cnc_substate_plist_lookup(state, $QUERY_PAIRS, NIL), head_or_modifier, UNPROVIDED, UNPROVIDED);
        if (NIL == ans) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == forts.fort_p($cnc_rule_fort$.getDynamicValue(thread)))) {
                Errors.error($str160$_CNC_RULE_FORT__is_a_non_FORT___S, $cnc_rule_fort$.getDynamicValue(thread));
            }
            final SubLObject v_term = (head_or_modifier == $HEAD) ? $$TheNCHead : $$TheNCModifier;
            ans = cnc_string_denot_pairs($cnc_rule_fort$.getDynamicValue(thread), v_term, cnc_substate_mt(state));
            cnc_substate_plist_enter(state, $QUERY_PAIRS, list_utilities.alist_enter(cnc_substate_plist_lookup(state, $QUERY_PAIRS, NIL), head_or_modifier, ans, UNPROVIDED));
        }
        return ans;
    }

    public static SubLObject cnc_random_pair_from_wu_constraints(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((((NIL != list_utilities.lengthG(cnc_substate_wu_constraints(state), ONE_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthG(cnc_substate_pos_constraints(state), ONE_INTEGER, UNPROVIDED))) || (NIL != list_utilities.lengthG(cnc_substate_pos_pred_constraints(state), ZERO_INTEGER, UNPROVIDED))) || (NIL != list_utilities.lengthG(cnc_substate_isa_constraints(state), ZERO_INTEGER, UNPROVIDED))) || (NIL != list_utilities.lengthG(cnc_substate_genls_constraints(state), ZERO_INTEGER, UNPROVIDED))) || (NIL != list_utilities.lengthG(cnc_substate_equals_constraints(state), ZERO_INTEGER, UNPROVIDED))) {
            Errors.warn($str159$Don_t_know_how_to_get__S_pair_fro, head_or_modifier, state);
            return cnc_random_pair_via_query(state, head_or_modifier);
        }
        final SubLObject wu = cnc_substate_wu_constraints(state).first();
        final SubLObject pos = cnc_substate_pos_constraints(state).first();
        SubLObject strings = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(cnc_substate_mt(state), thread);
            strings = (NIL != pos) ? lexicon_accessors.get_strings_of_type(wu, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED) : lexicon_cache.strings_of_word_unit(wu, $list162, UNPROVIDED, UNPROVIDED);
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return cons(list_utilities.random_element(strings), $NO_DENOT);
    }

    public static SubLObject cnc_random_pair_from_equals_constraints(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthLE(cnc_substate_equals_constraints(state), ONE_INTEGER, UNPROVIDED))) {
            Errors.error($str164$More_than_one_equals_constraint__, cnc_substate_equals_constraints(state));
        }
        final SubLObject v_term = cnc_substate_equals_constraints(state).first();
        final SubLObject pos_pred_constraints = cnc_substate_pos_pred_constraints(state);
        final SubLObject pos_constraints = cnc_substate_pos_constraints(state);
        final SubLObject pair = cnc_random_pair_from_match(v_term, pos_pred_constraints, pos_constraints, head_or_modifier);
        if (NIL == pair) {
            Errors.warn($str165$Couldn_t_find_string_for__S_match, v_term, pos_pred_constraints, pos_pred_constraints);
            _csetf_cnc_substate_doneP(state, T);
        }
        return pair;
    }

    public static SubLObject get_cnc_substate_cheapest_isaXgenls_constraint(final SubLObject state) {
        SubLObject ans = cnc_substate_plist_lookup(state, $CHEAPEST_CONSTRAINT, NIL);
        if (NIL == ans) {
            ans = cnc_cheapest_isaXgenls_constraint(cnc_substate_isa_constraints(state), cnc_substate_genls_constraints(state));
            cnc_substate_plist_enter(state, $CHEAPEST_CONSTRAINT, ans);
        }
        return ans;
    }

    public static SubLObject get_cnc_substate_cheapest_isaXgenls_constraint_matches(final SubLObject state) {
        final SubLObject cheapest_constraint = get_cnc_substate_cheapest_isaXgenls_constraint(state);
        final SubLObject constraint_type = cheapest_constraint.first();
        final SubLObject constraint_col = cheapest_constraint.rest();
        SubLObject ans = cnc_substate_plist_lookup(state, $CHEAPEST_CONSTRAINT_MATCHES, NIL);
        if (NIL == ans) {
            final SubLObject mt = cnc_substate_mt(state);
            ans = (constraint_type == $ISA) ? isa.all_fort_instances(constraint_col, mt, UNPROVIDED) : genls.all_specs(constraint_col, mt, UNPROVIDED);
            note_cnc_substate_cheapest_isaXgenls_constraint_matches(state, ans);
        }
        return ans;
    }

    public static SubLObject note_cnc_substate_cheapest_isaXgenls_constraint_matches(final SubLObject state, final SubLObject matches) {
        cnc_substate_plist_enter(state, $CHEAPEST_CONSTRAINT_MATCHES, matches);
        return state;
    }

    public static SubLObject remove_cnc_substate_cheapest_isaXgenls_constraint_match(final SubLObject state, final SubLObject match) {
        final SubLObject matches = cnc_substate_plist_lookup(state, $CHEAPEST_CONSTRAINT_MATCHES, NIL);
        note_cnc_substate_cheapest_isaXgenls_constraint_matches(state, delete(match, matches, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return state;
    }

    public static SubLObject cnc_random_pair_from_isaXgenls_constraints(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cheapest_constraint = get_cnc_substate_cheapest_isaXgenls_constraint(state);
        SubLObject v_tries;
        SubLObject random_pair;
        for (v_tries = ZERO_INTEGER, random_pair = NIL; (!random_pair.isCons()) && (!v_tries.numGE($cnc_max_tries$.getDynamicValue(thread))); v_tries = add(v_tries, ONE_INTEGER)) {
            random_pair = cnc_random_pair_from_isaXgenls_constraints_internal(state, head_or_modifier);
            if (v_tries.numGE(TEN_INTEGER) && mod(v_tries, FIVE_INTEGER).isZero()) {
                Errors.warn($str168$_S_tries___, v_tries);
            }
        }
        if (!random_pair.isCons()) {
            Errors.warn($str169$Couldn_t_find_a_string_denot_pair, cheapest_constraint, v_tries);
            _csetf_cnc_substate_doneP(state, T);
        }
        return random_pair;
    }

    public static SubLObject cnc_random_pair_from_isaXgenls_constraints_internal(final SubLObject state, final SubLObject head_or_modifier) {
        final SubLObject cheapest_constraint = get_cnc_substate_cheapest_isaXgenls_constraint(state);
        final SubLObject mt = cnc_substate_mt(state);
        final SubLObject matches = get_cnc_substate_cheapest_isaXgenls_constraint_matches(state);
        SubLObject random_pair = NIL;
        if (NIL != list_utilities.non_empty_list_p(matches)) {
            final SubLObject v_term = list_utilities.random_element(matches);
            final SubLObject badP = list_utilities.sublisp_boolean(cnc_random_match_constraint_failure(v_term, cheapest_constraint, cnc_substate_genls_constraints(state), cnc_substate_isa_constraints(state), mt));
            if (NIL == badP) {
                final SubLObject pos_pred_constraints = cnc_substate_pos_pred_constraints(state);
                final SubLObject pos_constraints = cnc_substate_pos_constraints(state);
                random_pair = cnc_random_pair_from_match(v_term, pos_pred_constraints, pos_constraints, head_or_modifier);
            }
            if (NIL == random_pair) {
                remove_cnc_substate_cheapest_isaXgenls_constraint_match(state, v_term);
            }
        }
        return random_pair;
    }

    public static SubLObject cnc_random_match_constraint_failure(final SubLObject v_term, final SubLObject cheapest_constraint, final SubLObject genls_constraints, final SubLObject isa_constraints, final SubLObject mt) {
        SubLObject failed_constraint = NIL;
        final SubLObject constraint_type = cheapest_constraint.first();
        final SubLObject constraint_col = cheapest_constraint.rest();
        if (NIL == failed_constraint) {
            SubLObject csome_list_var = genls_constraints;
            SubLObject genls_constraint = NIL;
            genls_constraint = csome_list_var.first();
            while ((NIL == failed_constraint) && (NIL != csome_list_var)) {
                if ((constraint_type != $GENLS) || (!constraint_col.equal(genls_constraint))) {
                    if (NIL == genls.genlP(v_term, genls_constraint, mt, UNPROVIDED)) {
                        failed_constraint = genls_constraint;
                    }
                }
                csome_list_var = csome_list_var.rest();
                genls_constraint = csome_list_var.first();
            } 
        }
        if (NIL == failed_constraint) {
            SubLObject csome_list_var = isa_constraints;
            SubLObject isa_constraint = NIL;
            isa_constraint = csome_list_var.first();
            while ((NIL == failed_constraint) && (NIL != csome_list_var)) {
                if ((constraint_type != $ISA) || (!constraint_col.equal(isa_constraint))) {
                    if (NIL == isa.isaP(v_term, isa_constraint, mt, UNPROVIDED)) {
                        failed_constraint = isa_constraint;
                    }
                }
                csome_list_var = csome_list_var.rest();
                isa_constraint = csome_list_var.first();
            } 
        }
        return failed_constraint;
    }

    public static SubLObject cnc_random_pair_from_match(final SubLObject v_term, SubLObject pos_pred_constraints, final SubLObject pos_constraints, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject random_pair = NIL;
        SubLObject nl_preds = NIL;
        if ((NIL == forts.fort_p(v_term)) || (NIL == lexification_utilities.unlexifiedP(v_term, NIL))) {
            SubLObject cdolist_list_var = pos_constraints;
            SubLObject pos = NIL;
            pos = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = lexicon_accessors.max_preds_of_pos(pos);
                SubLObject pred = NIL;
                pred = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    pos_pred_constraints = cons(pred, pos_pred_constraints);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    pred = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                pos = cdolist_list_var.first();
            } 
            if (NIL != pos_pred_constraints) {
                nl_preds = list(pph_utilities.pph_unify_speech_part_preds(pos_pred_constraints));
            } else
                if (head_or_modifier == $MODIFIER) {
                    nl_preds = $list171;
                } else {
                    nl_preds = $list172;
                }

            final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_language_mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_vars.$allow_pph_language_mt_broadeningP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = pph_vars.$pph_ceteris_paribus_choice_method$.currentBinding(thread);
            try {
                pph_vars.$pph_demerit_cutoff$.bind($cnc_pph_demerit_cutoff$.getDynamicValue(thread), thread);
                pph_vars.$select_string_methods_to_omit$.bind($list173, thread);
                pph_vars.$pph_language_mt$.bind(cnc_paraphrase_mt(), thread);
                pph_vars.$allow_pph_language_mt_broadeningP$.bind(NIL, thread);
                pph_vars.$pph_ceteris_paribus_choice_method$.bind($RANDOM, thread);
                thread.resetMultipleValues();
                final SubLObject string = pph_main.generate_phrase(v_term, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject gen_agr_pred = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != cnc_string_okP(string, head_or_modifier)) && (NIL != cnc_agr_pred_okP(gen_agr_pred, nl_preds))) {
                    random_pair = cons(string, v_term);
                }
            } finally {
                pph_vars.$pph_ceteris_paribus_choice_method$.rebind(_prev_bind_5, thread);
                pph_vars.$allow_pph_language_mt_broadeningP$.rebind(_prev_bind_4, thread);
                pph_vars.$pph_language_mt$.rebind(_prev_bind_3, thread);
                pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
            }
        }
        return random_pair;
    }

    public static SubLObject cnc_agr_pred_okP(final SubLObject gen_agr_pred, final SubLObject nl_preds) {
        SubLObject okP = NIL;
        if ((NIL != forts.fort_p(gen_agr_pred)) && (NIL == okP)) {
            SubLObject csome_list_var;
            SubLObject nl_pred;
            for (csome_list_var = nl_preds, nl_pred = NIL, nl_pred = csome_list_var.first(); (NIL == okP) && (NIL != csome_list_var); okP = (NIL != lexicon_accessors.speech_part_predP(gen_agr_pred, UNPROVIDED)) ? lexicon_accessors.genl_pos_predP(gen_agr_pred, nl_pred, UNPROVIDED) : genl_predicates.genl_predicate_in_any_mtP(gen_agr_pred, nl_pred) , csome_list_var = csome_list_var.rest() , nl_pred = csome_list_var.first()) {
            }
        }
        return okP;
    }

    public static SubLObject cnc_string_okP(final SubLObject string_or_nil, final SubLObject head_or_modifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((string_or_nil.isString() && (NIL != list_utilities.lengthL(string_or_nil, $cnc_max_string_length$.getDynamicValue(thread), UNPROVIDED))) && (NIL == lexicon_accessors.contains_closed_lexical_class_wordP(string_or_nil))) && ((head_or_modifier != $HEAD) || (NIL == contains_adjective_only_wordP(string_or_nil))));
    }

    public static SubLObject contains_adjective_only_wordP(final SubLObject string) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = string_utilities.string_tokenize(string, $list177, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject word = NIL;
            word = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                SubLObject non_adjectiveP = NIL;
                final SubLObject poses = lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == non_adjectiveP) {
                    SubLObject csome_list_var_$4 = poses;
                    SubLObject pos = NIL;
                    pos = csome_list_var_$4.first();
                    while ((NIL == non_adjectiveP) && (NIL != csome_list_var_$4)) {
                        if (NIL == lexicon_accessors.genl_posP(pos, $$Adjective, UNPROVIDED)) {
                            non_adjectiveP = T;
                        }
                        csome_list_var_$4 = csome_list_var_$4.rest();
                        pos = csome_list_var_$4.first();
                    } 
                }
                if ((NIL == non_adjectiveP) && (NIL == list_utilities.empty_list_p(poses))) {
                    foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject cnc_cheapest_isaXgenls_constraint(final SubLObject isa_constraints, final SubLObject genls_constraints) {
        SubLObject cheapest_constraint = NIL;
        SubLObject cheapest_constraint_cardinality_estimate = NIL;
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = NIL;
        isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cheapest_constraint) {
                cheapest_constraint = cons($ISA, isa_constraint);
            } else {
                if (NIL == cheapest_constraint_cardinality_estimate) {
                    cheapest_constraint_cardinality_estimate = cardinality_estimates.instance_cardinality(cheapest_constraint.rest());
                }
                final SubLObject cardinality_estimate = cardinality_estimates.instance_cardinality(isa_constraint);
                if ((NIL == cheapest_constraint_cardinality_estimate) || cardinality_estimate.numL(cheapest_constraint_cardinality_estimate)) {
                    cheapest_constraint = cons($ISA, isa_constraint);
                    cheapest_constraint_cardinality_estimate = cardinality_estimate;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        } 
        cdolist_list_var = genls_constraints;
        SubLObject genls_constraint = NIL;
        genls_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cheapest_constraint) {
                cheapest_constraint = cons($GENLS, genls_constraint);
            } else {
                if (NIL == cheapest_constraint_cardinality_estimate) {
                    cheapest_constraint_cardinality_estimate = (cheapest_constraint.first() == $ISA) ? cardinality_estimates.instance_cardinality(cheapest_constraint.rest()) : cardinality_estimates.spec_cardinality(cheapest_constraint.rest());
                }
                final SubLObject cardinality_estimate = cardinality_estimates.spec_cardinality(genls_constraint);
                if ((NIL == cheapest_constraint_cardinality_estimate) || cardinality_estimate.numL(cheapest_constraint_cardinality_estimate)) {
                    cheapest_constraint = cons($GENLS, genls_constraint);
                    cheapest_constraint_cardinality_estimate = cardinality_estimate;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genls_constraint = cdolist_list_var.first();
        } 
        return cheapest_constraint;
    }

    public static SubLObject generate_and_eval_cnc_test_for_rule(final SubLObject rule_cycl, SubLObject engine, SubLObject number, SubLObject mt, SubLObject rule_fht_name, SubLObject string_fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (number == UNPROVIDED) {
            number = $cnc_test_size$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $cnc_query_mt$.getDynamicValue();
        }
        if (rule_fht_name == UNPROVIDED) {
            rule_fht_name = $scored_ncr_table$.getDynamicValue();
        }
        if (string_fht_name == UNPROVIDED) {
            string_fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject candidates = generate_cnc_test_strings(rule_cycl, number, mt, UNPROVIDED);
        final SubLObject time = get_universal_time();
        final SubLObject cnc_test = list(time, candidates);
        return score_and_store_cnc_test_data_for_ncr(rule_cycl, cnc_test, engine, rule_fht_name, string_fht_name);
    }

    public static SubLObject test_untested_ncr_rules(final SubLObject number, final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules_to_score;
        SubLObject rule;
        for (rules_to_score = NIL; !length(rules_to_score).numGE(number); rules_to_score = cons(rule, rules_to_score)) {
            rule = cycl_utilities.hl_to_el(isa.random_instantiation($$NounCompoundRule, UNPROVIDED));
            if (NIL == cnc_get_from_fht(list(rule, $YAHOO), $scored_ncr_table$.getDynamicValue(thread))) {
            }
        }
        Errors.warn($str179$_S__, rules_to_score);
        SubLObject cdolist_list_var = rules_to_score;
        SubLObject rule2 = NIL;
        rule2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generate_and_eval_cnc_test_for_rule(cycl_utilities.hl_to_el(rule2), $YAHOO, size, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule2 = cdolist_list_var.first();
        } 
        return rules_to_score;
    }

    public static SubLObject test_untested_ncrs_w_running_query_limit(final SubLObject query_limit, final SubLObject test_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules_scored = NIL;
        while (!$cnc_running_query_total$.getDynamicValue(thread).numGE(query_limit)) {
            final SubLObject rule = cycl_utilities.hl_to_el(isa.random_instantiation($$NounCompoundRule, UNPROVIDED));
            if (NIL == cnc_get_from_fht(list(rule, $YAHOO), $scored_ncr_table$.getDynamicValue(thread))) {
                Errors.warn($str180$Started_scoring__S_at__S_____, rule, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
                generate_and_eval_cnc_test_for_rule(rule, $YAHOO, test_size, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                rules_scored = cons(rule, rules_scored);
            }
        } 
        return rules_scored;
    }

    public static SubLObject generate_and_store_cnc_tests_for_untested_rules(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules_to_score;
        SubLObject rule;
        for (rules_to_score = NIL; !length(rules_to_score).numGE(number); rules_to_score = cons(rule, rules_to_score)) {
            rule = cycl_utilities.hl_to_el(isa.random_instantiation($$NounCompoundRule, UNPROVIDED));
            if (NIL == cnc_get_from_fht(rule, $unscored_ncr_table$.getDynamicValue(thread))) {
            }
        }
        SubLObject cdolist_list_var = rules_to_score;
        SubLObject rule2 = NIL;
        rule2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            generate_and_store_cnc_test_for_rule(rule2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule2 = cdolist_list_var.first();
        } 
        return rules_to_score;
    }

    public static SubLObject generate_and_store_cnc_test_for_rule(final SubLObject rule_cycl, SubLObject number, SubLObject mt, SubLObject fht_name) {
        if (number == UNPROVIDED) {
            number = $cnc_test_size$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $cnc_query_mt$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $unscored_ncr_table$.getDynamicValue();
        }
        final SubLObject old_store = cnc_get_from_fht(rule_cycl, fht_name);
        final SubLObject new_candidates = generate_cnc_test_strings(rule_cycl, number, mt, UNPROVIDED);
        final SubLObject time = get_universal_time();
        final SubLObject new_cnc_test = list(time, new_candidates);
        final SubLObject new_stored_value = list($TEST, new_cnc_test, $RUN_AGAINST);
        final SubLObject new_store = cons(new_stored_value, old_store);
        cnc_put_to_fht(rule_cycl, fht_name, new_store);
        return new_store;
    }

    public static SubLObject batch_process_unfamiliar_strings(final SubLObject size, final SubLObject mp_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unfamiliar_strings = find_unfamiliar_strings_from_unscored_cnc_tests($YAHOO, UNPROVIDED);
        final SubLObject batch_count = length(mp_pairs);
        SubLObject relevant_strings = list_utilities.first_n(multiply(size, batch_count), unfamiliar_strings);
        SubLObject cdolist_list_var = mp_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject batch = list_utilities.first_n(size, relevant_strings);
            final SubLObject machine = pair.first();
            final SubLObject port = second(pair);
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        SubLObject cdolist_list_var_$5 = batch;
                        SubLObject string = NIL;
                        string = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            final SubLObject hit_count = api_kernel.cyc_api_remote_eval(list(YAHOO_COUNT, string_utilities.quote_string(string, UNPROVIDED)), machine, port, UNPROVIDED);
                            if (hit_count.isNumber()) {
                                relevant_strings = remove(string, relevant_strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                $cnc_running_query_total$.setDynamicValue(add($cnc_running_query_total$.getDynamicValue(thread), ONE_INTEGER), thread);
                                cnc_put_to_fht(list(string, $YAHOO), $cnc_string_hits_table$.getDynamicValue(thread), list($HIT_COUNT, hit_count, $TIMESTAMP, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED)));
                            }
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            string = cdolist_list_var_$5.first();
                        } 
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return length(unfamiliar_strings);
    }

    public static SubLObject lookup_and_store_scores_for_unscored_cnc_tests(final SubLObject engine) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject update_pairs = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only($unscored_ncr_table$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    final SubLObject rule = the_key;
                    final SubLObject stored_tests = the_value;
                    SubLObject new_stored_tests = NIL;
                    SubLObject cdolist_list_var = stored_tests;
                    SubLObject stored_test = NIL;
                    stored_test = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject test_data = second(getf(stored_test, $TEST, UNPROVIDED));
                        final SubLObject test_date = getf(stored_test, $TEST, UNPROVIDED).first();
                        final SubLObject run_against = getf(stored_test, $RUN_AGAINST, UNPROVIDED);
                        SubLObject scored_data = NIL;
                        if (NIL == subl_promotions.memberP(engine, run_against, EQUAL, CNC_GET_ENGINE)) {
                            scored_data = score_cnc_test_data(test_data, engine, UNPROVIDED);
                            stored_test = list($TEST, list(test_date, test_data), $RUN_AGAINST, list(list($ENGINE, $YAHOO, $TIMESTAMP, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED))));
                            update_scored_ncr_table(rule, engine, scored_data, test_date);
                        }
                        new_stored_tests = cons(stored_test, new_stored_tests);
                        cdolist_list_var = cdolist_list_var.rest();
                        stored_test = cdolist_list_var.first();
                    } 
                    update_pairs = cons(list(rule, new_stored_tests), update_pairs);
                }
                continuation = next;
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        update_unscored_ncr_table(update_pairs);
        return T;
    }

    public static SubLObject update_unscored_ncr_table(final SubLObject update_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = update_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cnc_put_to_fht(pair.first(), $unscored_ncr_table$.getDynamicValue(thread), second(pair));
            Errors.sublisp_break(UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject update_scored_ncr_table(final SubLObject rule, final SubLObject engine, final SubLObject scored_data, final SubLObject test_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = list(rule, engine);
        final SubLObject new_test = list(test_date, scored_data);
        final SubLObject stored_tests = cnc_get_from_fht(key, $scored_ncr_table$.getDynamicValue(thread));
        final SubLObject new_value = cons(new_test, stored_tests);
        cnc_put_to_fht(key, $scored_ncr_table$.getDynamicValue(thread), new_value);
        return T;
    }

    public static SubLObject find_unfamiliar_strings_from_unscored_cnc_tests(final SubLObject engine, SubLObject string_table) {
        if (string_table == UNPROVIDED) {
            string_table = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_list = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only($unscored_ncr_table$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL);
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, NIL);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    final SubLObject key = the_key;
                    SubLObject cdolist_list_var;
                    final SubLObject value = cdolist_list_var = the_value;
                    SubLObject stored_test = NIL;
                    stored_test = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject test_data = second(getf(stored_test, $TEST, UNPROVIDED));
                        final SubLObject run_against = getf(stored_test, $RUN_AGAINST, UNPROVIDED);
                        if (NIL == subl_promotions.memberP(engine, run_against, EQUAL, CNC_GET_ENGINE)) {
                            final SubLObject unfamiliar_strings = get_unfamiliar_strings_from_cnc_data(test_data, engine, string_table);
                            result_list = append(unfamiliar_strings, result_list);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        stored_test = cdolist_list_var.first();
                    } 
                }
                continuation = next;
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(result_list, engine);
    }

    public static SubLObject cnc_get_engine(final SubLObject p_list) {
        return getf(p_list, $ENGINE, UNPROVIDED);
    }

    public static SubLObject score_and_store_cnc_test_data_for_ncr(final SubLObject rule_cycl, final SubLObject unscored_cnc_test, SubLObject engine, SubLObject rule_fht_name, SubLObject string_fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (rule_fht_name == UNPROVIDED) {
            rule_fht_name = $scored_ncr_table$.getDynamicValue();
        }
        if (string_fht_name == UNPROVIDED) {
            string_fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = (NIL != $store_w_method_test_keyP$.getDynamicValue(thread)) ? list(rule_cycl, $cnc_method_test_keyword$.getDynamicValue(thread)) : list(rule_cycl, engine);
        final SubLObject old_store = cnc_get_from_fht(key, rule_fht_name);
        final SubLObject date = unscored_cnc_test.first();
        final SubLObject unscored_data = second(unscored_cnc_test);
        final SubLObject scored_data = score_unscored_cnc_data(unscored_data, engine, string_fht_name);
        final SubLObject scored_cnc_test = list(date, scored_data);
        final SubLObject new_store = cons(scored_cnc_test, old_store);
        cnc_put_to_fht(key, rule_fht_name, new_store);
        return new_store;
    }

    public static SubLObject score_unscored_cnc_data(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        SubLObject scored_results = NIL;
        SubLObject cdolist_list_var = cnc_data;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_tuple = score_cnc_test_tuple(tuple, engine, fht_name);
            scored_results = cons(new_tuple, scored_results);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return scored_results;
    }

    public static SubLObject score_unscored_cnc_data2(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject unfamiliar_strings = get_unfamiliar_strings_from_cnc_data(cnc_data, engine, fht_name);
        SubLObject scored_results = NIL;
        cnc_query_and_store_search_string_hits(unfamiliar_strings, engine, fht_name);
        scored_results = score_cnc_test_data(cnc_data, engine, fht_name);
        return scored_results;
    }

    public static SubLObject cnc_query_and_store_search_string_hits(final SubLObject unfamiliar_strings, final SubLObject engine, final SubLObject fht_name) {
        SubLObject cdolist_list_var;
        final SubLObject string_hit_pairs = cdolist_list_var = cnc_get_string_hit_pairs(unfamiliar_strings, engine);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = pair.first();
            final SubLObject hit_count = second(pair);
            final SubLObject key = list(string, engine);
            final SubLObject value = list($HIT_COUNT, hit_count, $TIMESTAMP, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
            cnc_put_to_fht(key, fht_name, value);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return string_hit_pairs;
    }

    public static SubLObject cnc_get_string_hit_pairs(final SubLObject unfamiliar_strings, final SubLObject engine) {
        SubLObject result_pairs = NIL;
        SubLObject cdolist_list_var = unfamiliar_strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hit_count = cnc_query_for_search_string_hits(Strings.string(engine), UNPROVIDED);
            result_pairs = cons(list(string, hit_count), result_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return result_pairs;
    }

    public static SubLObject score_cnc_test_data(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        SubLObject scored_data = NIL;
        SubLObject cdolist_list_var = cnc_data;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_tuple = score_cnc_test_tuple2(tuple, engine, fht_name);
            if (NIL != new_tuple) {
                scored_data = cons(new_tuple, scored_data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return scored_data;
    }

    public static SubLObject get_unfamiliar_strings_from_cnc_data(final SubLObject cnc_data, SubLObject engine, SubLObject fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject search_strings = NIL;
        final SubLObject _prev_bind_0 = $cnc_default_search_engine$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cnc_string_hits_table$.currentBinding(thread);
        try {
            $cnc_default_search_engine$.bind(engine, thread);
            $cnc_string_hits_table$.bind(fht_name, thread);
            SubLObject cdolist_list_var = cnc_data;
            SubLObject tuple = NIL;
            tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                search_strings = cons(tuple.first(), cons(second(tuple), cons(third(tuple), search_strings)));
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            } 
        } finally {
            $cnc_string_hits_table$.rebind(_prev_bind_2, thread);
            $cnc_default_search_engine$.rebind(_prev_bind_0, thread);
        }
        return remove_if($sym192$STRING_HITS_KNOWN_, remove_duplicates(search_strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject string_hits_knownP(final SubLObject search_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject engine = $cnc_default_search_engine$.getDynamicValue(thread);
        final SubLObject key = list(search_string, engine);
        final SubLObject hits = getf(cnc_get_from_fht(key, $cnc_string_hits_table$.getDynamicValue(thread)), $HIT_COUNT, UNPROVIDED);
        return hits.isNumber() ? T : NIL;
    }

    public static SubLObject score_cnc_test_tuple(final SubLObject tuple, SubLObject engine, SubLObject fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject compound_string = tuple.first();
        final SubLObject modifier_string = second(tuple);
        final SubLObject head_string = third(tuple);
        SubLObject compound_hits = NIL;
        SubLObject modifier_hits = NIL;
        SubLObject head_hits = NIL;
        SubLObject new_tuple = NIL;
        if (((NIL != string_utilities.non_empty_string_p(compound_string)) && (NIL != string_utilities.non_empty_string_p(modifier_string))) && (NIL != string_utilities.non_empty_string_p(head_string))) {
            modifier_hits = cnc_find_search_string_hits(modifier_string, engine, fht_name);
            head_hits = cnc_find_search_string_hits(head_string, engine, fht_name);
            if (ZERO_INTEGER.equal(modifier_hits) || ZERO_INTEGER.equal(head_hits)) {
                compound_hits = ZERO_INTEGER;
            } else {
                compound_hits = cnc_find_search_string_hits(compound_string, engine, fht_name);
            }
        }
        new_tuple = list_utilities.adjoin_to_end(list(compound_hits, modifier_hits, head_hits), tuple, UNPROVIDED);
        return new_tuple;
    }

    public static SubLObject score_cnc_test_tuple2(final SubLObject tuple, SubLObject engine, SubLObject fht_name) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        if (fht_name == UNPROVIDED) {
            fht_name = $cnc_string_hits_table$.getDynamicValue();
        }
        final SubLObject compound_string = tuple.first();
        final SubLObject modifier_string = second(tuple);
        final SubLObject head_string = third(tuple);
        final SubLObject compound_hits = cnc_lookup_search_string_hits(compound_string, fht_name, engine);
        final SubLObject modifier_hits = cnc_lookup_search_string_hits(modifier_string, fht_name, engine);
        final SubLObject head_hits = cnc_lookup_search_string_hits(head_string, fht_name, engine);
        SubLObject new_tuple = NIL;
        if ((compound_hits.isNumber() && modifier_hits.isNumber()) && head_hits.isNumber()) {
            new_tuple = list_utilities.adjoin_to_end(list(compound_hits, modifier_hits, head_hits), tuple, UNPROVIDED);
        }
        return new_tuple;
    }

    public static SubLObject initialize_running_query_counter(SubLObject backup_tablesP) {
        if (backup_tablesP == UNPROVIDED) {
            backup_tablesP = NIL;
        }
        $cnc_running_query_total$.setDynamicValue(ZERO_INTEGER);
        if (NIL != backup_tablesP) {
            backup_cnc_tables();
        }
        return T;
    }

    public static SubLObject cnc_lookup_search_string_hits(final SubLObject string, final SubLObject fht_name, SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        final SubLObject key = list(string, engine);
        final SubLObject hits = getf(cnc_get_from_fht(key, fht_name), $HIT_COUNT, UNPROVIDED);
        return hits;
    }

    public static SubLObject cnc_query_for_search_string_hits(final SubLObject string, SubLObject engine) {
        if (engine == UNPROVIDED) {
            engine = $cnc_default_search_engine$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hit_count = NIL;
        final SubLObject max_attempts = $cnc_max_string_search_attempts$.getDynamicValue(thread);
        SubLObject attempt_count = ZERO_INTEGER;
        SubLObject search_fn = NULL;
        if (engine.eql($GOOGLE)) {
            search_fn = GOOGLE_COUNT;
        }
        if (engine.eql($YAHOO)) {
            search_fn = YAHOO_COUNT;
        }
        while ((!hit_count.isNumber()) && (!attempt_count.equal(max_attempts))) {
            attempt_count = add(attempt_count, ONE_INTEGER);
            $cnc_running_query_total$.setDynamicValue(add($cnc_running_query_total$.getDynamicValue(thread), ONE_INTEGER), thread);
            hit_count = apply_search_fn(search_fn, string);
            Errors.warn($str196$Searched__A_for___S___Number_of_h, new SubLObject[]{ engine, string, hit_count, $cnc_running_query_total$.getDynamicValue(thread) });
        } 
        return hit_count;
    }

    public static SubLObject apply_search_fn(final SubLObject search_fn, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = apply(search_fn, list(string_utilities.quote_string(string, UNPROVIDED)));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static SubLObject cnc_find_search_string_hits(final SubLObject string, final SubLObject engine, final SubLObject fht_name) {
        SubLObject hit_count = cnc_lookup_search_string_hits(string, fht_name, engine);
        if (hit_count.isNumber()) {
            return hit_count;
        }
        if (!hit_count.isNumber()) {
            hit_count = cnc_query_for_search_string_hits(string, engine);
            if (hit_count.isNumber()) {
                final SubLObject key = list(string, engine);
                final SubLObject value = list($HIT_COUNT, hit_count, $TIMESTAMP, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
                cnc_put_to_fht(key, fht_name, value);
            }
        }
        return hit_count;
    }

    public static SubLObject backup_cnc_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date_suffix = cconcatenate(numeric_date_utilities.universal_timestring(UNPROVIDED), $str200$_lisp);
        final SubLObject pairs = $cnc_bkup_pairs$.getDynamicValue(thread);
        SubLObject new_files = NIL;
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bkup_file_name = cconcatenate(pair.first(), date_suffix);
            final SubLObject fht_name = second(pair);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(bkup_file_name, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str202$Unable_to_open__S, bkup_file_name);
                }
                final SubLObject stream_$6 = stream;
                SubLObject fht = NIL;
                try {
                    fht = file_hash_table.open_file_hash_table_read_only(fht_name, EQUAL, $IMAGE_INDEPENDENT_CFASL);
                    final SubLObject alist = file_hash_table.file_hash_table_to_alist(fht);
                    format(stream_$6, $str203$_S, alist);
                    new_files = cons(bkup_file_name, new_files);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != file_hash_table.file_hash_table_p(fht)) {
                            file_hash_table.finalize_file_hash_table(fht);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return new_files;
    }

    public static SubLObject cnc_get_from_fht(final SubLObject value, final SubLObject table_name) {
        SubLObject ans = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(table_name, EQUAL, $IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.get_file_hash_table(value, fht, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    public static SubLObject cnc_put_to_fht(final SubLObject value, final SubLObject table_name, final SubLObject key) {
        SubLObject ans = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table(table_name, EQUAL, $IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.put_file_hash_table(value, fht, key);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    public static SubLObject cnc_remove_from_fht(final SubLObject value, final SubLObject table_name) {
        SubLObject ans = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table(table_name, EQUAL, $IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.remove_file_hash_table(value, fht);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    public static SubLObject cnc_print_fht_contents(final SubLObject fht_name) {
        SubLObject ans = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(fht_name, EQUAL, $IMAGE_INDEPENDENT_CFASL);
            ans = file_hash_table.print_file_hash_table_contents(fht);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }

    public static SubLObject default_aggregate_cnc_score_wrt_yahoo_old(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = second(removal_modules_candidate_noun_compounds.evaluate_aggregate_cnc_results_w_thresholds(rule, $cnc_compound_threshold$.getDynamicValue(thread), $cnc_component_threshold$.getDynamicValue(thread), $YAHOO));
        if (!result.isNumber()) {
            result = ZERO_INTEGER;
        }
        return result;
    }

    public static SubLObject default_aggregate_cnc_score_wrt_yahoo(final SubLObject rule, SubLObject create_newP) {
        if (create_newP == UNPROVIDED) {
            create_newP = $create_cnc_testP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_cycl = cycl_utilities.hl_to_el(rule);
        SubLObject result = second(removal_modules_candidate_noun_compounds.evaluate_aggregate_cnc_results_w_thresholds(rule_cycl, $cnc_compound_threshold$.getDynamicValue(thread), $cnc_component_threshold$.getDynamicValue(thread), $YAHOO));
        if ((!result.isNumber()) && (NIL != create_newP)) {
            generate_fast_cnc_test_for_rule(rule_cycl);
            result = second(removal_modules_candidate_noun_compounds.evaluate_aggregate_cnc_results_w_thresholds(rule_cycl, $cnc_compound_threshold$.getDynamicValue(thread), $cnc_component_threshold$.getDynamicValue(thread), $YAHOO));
        }
        if (!result.isNumber()) {
            result = ZERO_INTEGER;
        }
        return result;
    }

    public static SubLObject generate_fast_cnc_test_for_rule(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $use_cnc_iteratorP$.getDynamicValue(thread)) {
            $use_cnc_iteratorP$.setDynamicValue(T, thread);
        }
        generate_and_eval_cnc_test_for_rule(rule_cycl, $YAHOO, $cnc_fast_test_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return T;
    }

    public static SubLObject filter_cnc_results_w_component_threshold(final SubLObject cnc_test, SubLObject component_threshold) {
        if (component_threshold == UNPROVIDED) {
            component_threshold = $cnc_component_threshold$.getDynamicValue();
        }
        final SubLObject date = cnc_test.first();
        final SubLObject data_list = second(cnc_test);
        SubLObject passed_component_threshold = NIL;
        SubLObject cdolist_list_var = data_list;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hit_numbers = last(tuple, UNPROVIDED).first();
            final SubLObject compound_hits = hit_numbers.first();
            final SubLObject modifier_hits = second(hit_numbers);
            final SubLObject head_hits = third(hit_numbers);
            if ((((compound_hits.isNumber() && modifier_hits.isNumber()) && head_hits.isNumber()) && component_threshold.numLE(modifier_hits)) && component_threshold.numLE(head_hits)) {
                passed_component_threshold = cons(tuple, passed_component_threshold);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return list(date, passed_component_threshold);
    }

    public static SubLObject filter_cnc_results_w_compound_threshold(final SubLObject cnc_test, SubLObject compound_threshold) {
        if (compound_threshold == UNPROVIDED) {
            compound_threshold = $cnc_compound_threshold$.getDynamicValue();
        }
        final SubLObject date = cnc_test.first();
        final SubLObject data_list = second(cnc_test);
        SubLObject passed_compound_threshold = NIL;
        SubLObject cdolist_list_var = data_list;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hit_numbers = last(tuple, UNPROVIDED).first();
            final SubLObject compound_hits = hit_numbers.first();
            final SubLObject modifier_hits = second(hit_numbers);
            final SubLObject head_hits = third(hit_numbers);
            if (((compound_hits.isNumber() && modifier_hits.isNumber()) && head_hits.isNumber()) && compound_threshold.numLE(compound_hits)) {
                passed_compound_threshold = cons(tuple, passed_compound_threshold);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return list(date, passed_compound_threshold);
    }

    public static SubLObject evaluate_cnc_results_w_thresholds(final SubLObject cnc_test, SubLObject compound_threshold, SubLObject component_threshold) {
        if (compound_threshold == UNPROVIDED) {
            compound_threshold = $cnc_compound_threshold$.getDynamicValue();
        }
        if (component_threshold == UNPROVIDED) {
            component_threshold = $cnc_component_threshold$.getDynamicValue();
        }
        final SubLObject date = cnc_test.first();
        final SubLObject data_list = second(cnc_test);
        final SubLObject total_cases = length(data_list);
        final SubLObject passed_component_threshold = filter_cnc_results_w_component_threshold(cnc_test, component_threshold);
        final SubLObject considered_count = length(second(passed_component_threshold));
        final SubLObject passed_compound_threshold = filter_cnc_results_w_compound_threshold(passed_component_threshold, compound_threshold);
        final SubLObject success_count = length(second(passed_compound_threshold));
        SubLObject success_ratio = NIL;
        SubLObject total_hits = NIL;
        SubLObject total_hits_sum = NIL;
        if (considered_count.numG(ZERO_INTEGER) && success_count.numG(ZERO_INTEGER)) {
            success_ratio = divide(success_count, considered_count);
        }
        SubLObject cdolist_list_var = data_list;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject scores = last(tuple, UNPROVIDED).first();
            final SubLObject compound_hits = scores.first();
            if (compound_hits.isNumber()) {
                total_hits = cons(compound_hits, total_hits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        total_hits_sum = apply($sym204$_, total_hits);
        return list(date, success_ratio, success_count, considered_count, total_cases, total_hits_sum, passed_compound_threshold);
    }

    public static SubLObject declare_candidate_nc_utilities_file() {
        declareFunction(me, "cnc_paraphrase_mt", "CNC-PARAPHRASE-MT", 0, 0, false);
        declareFunction(me, "generate_cnc_test_strings", "GENERATE-CNC-TEST-STRINGS", 1, 3, false);
        declareFunction(me, "generate_cnc_test_strings_via_query", "GENERATE-CNC-TEST-STRINGS-VIA-QUERY", 4, 0, false);
        declareFunction(me, "generate_cnc_test_strings_from_iterator", "GENERATE-CNC-TEST-STRINGS-FROM-ITERATOR", 4, 0, false);
        declareFunction(me, "cnc_string_denot_pairs", "CNC-STRING-DENOT-PAIRS", 3, 0, false);
        declareFunction(me, "construct_cnc_query", "CONSTRUCT-CNC-QUERY", 2, 0, false);
        declareFunction(me, "nc_rule_term_constraints_of_type", "NC-RULE-TERM-CONSTRAINTS-OF-TYPE", 3, 0, false);
        declareFunction(me, "clear_run_cnc_query", "CLEAR-RUN-CNC-QUERY", 0, 0, false);
        declareFunction(me, "remove_run_cnc_query", "REMOVE-RUN-CNC-QUERY", 3, 0, false);
        declareFunction(me, "run_cnc_query_internal", "RUN-CNC-QUERY-INTERNAL", 3, 0, false);
        declareFunction(me, "run_cnc_query", "RUN-CNC-QUERY", 3, 0, false);
        declareFunction(me, "filter_cnc_semantics", "FILTER-CNC-SEMANTICS", 2, 0, false);
        declareFunction(me, "combine_cnc_modifier_head_lists", "COMBINE-CNC-MODIFIER-HEAD-LISTS", 2, 1, false);
        declareFunction(me, "combine_cnc_pairs", "COMBINE-CNC-PAIRS", 2, 0, false);
        declareFunction(me, "get_random_n", "GET-RANDOM-N", 2, 0, false);
        declareFunction(me, "new_cnc_popcorn_timer", "NEW-CNC-POPCORN-TIMER", 0, 2, false);
        declareFunction(me, "cnc_popcorn_note_success", "CNC-POPCORN-NOTE-SUCCESS", 1, 0, false);
        declareFunction(me, "cnc_popcorn_note_failure", "CNC-POPCORN-NOTE-FAILURE", 1, 0, false);
        declareFunction(me, "cnc_popcorn_poppedP", "CNC-POPCORN-POPPED?", 1, 0, false);
        declareFunction(me, "free_popcorn_timer", "FREE-POPCORN-TIMER", 1, 0, false);
        declareFunction(me, "popcorn_timer_from_pool", "POPCORN-TIMER-FROM-POOL", 1, 0, false);
        declareFunction(me, "cnc_popcorn_window", "CNC-POPCORN-WINDOW", 0, 0, false);
        declareFunction(me, "cnc_popcorn_minimum", "CNC-POPCORN-MINIMUM", 0, 0, false);
        declareFunction(me, "candidate_nc_popcorn_timer_print_function_trampoline", "CANDIDATE-NC-POPCORN-TIMER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "candidate_nc_popcorn_timer_p", "CANDIDATE-NC-POPCORN-TIMER-P", 1, 0, false);
        new candidate_nc_utilities.$candidate_nc_popcorn_timer_p$UnaryFunction();
        declareFunction(me, "cnc_popcorn_timer_window", "CNC-POPCORN-TIMER-WINDOW", 1, 0, false);
        declareFunction(me, "cnc_popcorn_timer_minimum", "CNC-POPCORN-TIMER-MINIMUM", 1, 0, false);
        declareFunction(me, "cnc_popcorn_timer_index", "CNC-POPCORN-TIMER-INDEX", 1, 0, false);
        declareFunction(me, "cnc_popcorn_timer_recent_failure_count", "CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT", 1, 0, false);
        declareFunction(me, "cnc_popcorn_timer_history", "CNC-POPCORN-TIMER-HISTORY", 1, 0, false);
        declareFunction(me, "_csetf_cnc_popcorn_timer_window", "_CSETF-CNC-POPCORN-TIMER-WINDOW", 2, 0, false);
        declareFunction(me, "_csetf_cnc_popcorn_timer_minimum", "_CSETF-CNC-POPCORN-TIMER-MINIMUM", 2, 0, false);
        declareFunction(me, "_csetf_cnc_popcorn_timer_index", "_CSETF-CNC-POPCORN-TIMER-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_cnc_popcorn_timer_recent_failure_count", "_CSETF-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_cnc_popcorn_timer_history", "_CSETF-CNC-POPCORN-TIMER-HISTORY", 2, 0, false);
        declareFunction(me, "make_candidate_nc_popcorn_timer", "MAKE-CANDIDATE-NC-POPCORN-TIMER", 0, 1, false);
        declareFunction(me, "visit_defstruct_candidate_nc_popcorn_timer", "VISIT-DEFSTRUCT-CANDIDATE-NC-POPCORN-TIMER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_candidate_nc_popcorn_timer_method", "VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-POPCORN-TIMER-METHOD", 2, 0, false);
        declareFunction(me, "print_cnc_popcorn_timer", "PRINT-CNC-POPCORN-TIMER", 3, 0, false);
        declareFunction(me, "get_cnc_popcorn_timer_window", "GET-CNC-POPCORN-TIMER-WINDOW", 1, 0, false);
        declareFunction(me, "get_cnc_popcorn_timer_minimum", "GET-CNC-POPCORN-TIMER-MINIMUM", 1, 0, false);
        declareFunction(me, "get_cnc_popcorn_timer_recent_failure_count", "GET-CNC-POPCORN-TIMER-RECENT-FAILURE-COUNT", 1, 0, false);
        declareFunction(me, "find_or_create_cnc_popcorn_timer", "FIND-OR-CREATE-CNC-POPCORN-TIMER", 2, 0, false);
        declareFunction(me, "cnc_popcorn_note_new_result", "CNC-POPCORN-NOTE-NEW-RESULT", 2, 0, false);
        declareFunction(me, "candidate_nc_iterator_state_print_function_trampoline", "CANDIDATE-NC-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "candidate_nc_iterator_state_p", "CANDIDATE-NC-ITERATOR-STATE-P", 1, 0, false);
        new candidate_nc_utilities.$candidate_nc_iterator_state_p$UnaryFunction();
        declareFunction(me, "cnc_state_rule_fort", "CNC-STATE-RULE-FORT", 1, 0, false);
        declareFunction(me, "cnc_state_mod_iterator", "CNC-STATE-MOD-ITERATOR", 1, 0, false);
        declareFunction(me, "cnc_state_head_iterator", "CNC-STATE-HEAD-ITERATOR", 1, 0, false);
        declareFunction(me, "cnc_state_mt", "CNC-STATE-MT", 1, 0, false);
        declareFunction(me, "cnc_state_doneP", "CNC-STATE-DONE?", 1, 0, false);
        declareFunction(me, "_csetf_cnc_state_rule_fort", "_CSETF-CNC-STATE-RULE-FORT", 2, 0, false);
        declareFunction(me, "_csetf_cnc_state_mod_iterator", "_CSETF-CNC-STATE-MOD-ITERATOR", 2, 0, false);
        declareFunction(me, "_csetf_cnc_state_head_iterator", "_CSETF-CNC-STATE-HEAD-ITERATOR", 2, 0, false);
        declareFunction(me, "_csetf_cnc_state_mt", "_CSETF-CNC-STATE-MT", 2, 0, false);
        declareFunction(me, "_csetf_cnc_state_doneP", "_CSETF-CNC-STATE-DONE?", 2, 0, false);
        declareFunction(me, "make_candidate_nc_iterator_state", "MAKE-CANDIDATE-NC-ITERATOR-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_candidate_nc_iterator_state", "VISIT-DEFSTRUCT-CANDIDATE-NC-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_candidate_nc_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction(me, "print_cnc_state", "PRINT-CNC-STATE", 3, 0, false);
        declareFunction(me, "new_candidate_nc_iterator", "NEW-CANDIDATE-NC-ITERATOR", 1, 1, false);
        declareFunction(me, "candidate_nc_iterator_doneP", "CANDIDATE-NC-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "candidate_nc_iterator_next", "CANDIDATE-NC-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "candidate_nc_sub_iterator_state_print_function_trampoline", "CANDIDATE-NC-SUB-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "candidate_nc_sub_iterator_state_p", "CANDIDATE-NC-SUB-ITERATOR-STATE-P", 1, 0, false);
        new candidate_nc_utilities.$candidate_nc_sub_iterator_state_p$UnaryFunction();
        declareFunction(me, "cnc_substate_wu_constraints", "CNC-SUBSTATE-WU-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "cnc_substate_equals_constraints", "CNC-SUBSTATE-EQUALS-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "cnc_substate_genls_constraints", "CNC-SUBSTATE-GENLS-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "cnc_substate_isa_constraints", "CNC-SUBSTATE-ISA-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "cnc_substate_pos_constraints", "CNC-SUBSTATE-POS-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "cnc_substate_pos_pred_constraints", "CNC-SUBSTATE-POS-PRED-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "cnc_substate_mt", "CNC-SUBSTATE-MT", 1, 0, false);
        declareFunction(me, "cnc_substate_plist", "CNC-SUBSTATE-PLIST", 1, 0, false);
        declareFunction(me, "cnc_substate_doneP", "CNC-SUBSTATE-DONE?", 1, 0, false);
        declareFunction(me, "_csetf_cnc_substate_wu_constraints", "_CSETF-CNC-SUBSTATE-WU-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_equals_constraints", "_CSETF-CNC-SUBSTATE-EQUALS-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_genls_constraints", "_CSETF-CNC-SUBSTATE-GENLS-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_isa_constraints", "_CSETF-CNC-SUBSTATE-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_pos_constraints", "_CSETF-CNC-SUBSTATE-POS-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_pos_pred_constraints", "_CSETF-CNC-SUBSTATE-POS-PRED-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_mt", "_CSETF-CNC-SUBSTATE-MT", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_plist", "_CSETF-CNC-SUBSTATE-PLIST", 2, 0, false);
        declareFunction(me, "_csetf_cnc_substate_doneP", "_CSETF-CNC-SUBSTATE-DONE?", 2, 0, false);
        declareFunction(me, "make_candidate_nc_sub_iterator_state", "MAKE-CANDIDATE-NC-SUB-ITERATOR-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_candidate_nc_sub_iterator_state", "VISIT-DEFSTRUCT-CANDIDATE-NC-SUB-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_candidate_nc_sub_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-CANDIDATE-NC-SUB-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction(me, "print_cnc_substate", "PRINT-CNC-SUBSTATE", 3, 0, false);
        declareFunction(me, "cnc_substate_plist_enter", "CNC-SUBSTATE-PLIST-ENTER", 3, 0, false);
        declareFunction(me, "cnc_substate_plist_lookup", "CNC-SUBSTATE-PLIST-LOOKUP", 2, 1, false);
        declareFunction(me, "new_cnc_mod_iterator", "NEW-CNC-MOD-ITERATOR", 2, 0, false);
        declareFunction(me, "cnc_mod_iterator_doneP", "CNC-MOD-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "cnc_mod_iterator_next", "CNC-MOD-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "cnc_random_mod_pair_from_state", "CNC-RANDOM-MOD-PAIR-FROM-STATE", 1, 0, false);
        declareFunction(me, "cnc_sub_iterator_slot_values", "CNC-SUB-ITERATOR-SLOT-VALUES", 3, 0, false);
        declareFunction(me, "new_cnc_head_iterator", "NEW-CNC-HEAD-ITERATOR", 2, 0, false);
        declareFunction(me, "cnc_head_iterator_doneP", "CNC-HEAD-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "cnc_head_iterator_next", "CNC-HEAD-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "cnc_random_head_pair_from_state", "CNC-RANDOM-HEAD-PAIR-FROM-STATE", 1, 0, false);
        declareFunction(me, "cnc_random_pair_from_state", "CNC-RANDOM-PAIR-FROM-STATE", 2, 0, false);
        declareFunction(me, "cnc_random_pair_via_query", "CNC-RANDOM-PAIR-VIA-QUERY", 2, 0, false);
        declareFunction(me, "get_cnc_substate_query_pairs", "GET-CNC-SUBSTATE-QUERY-PAIRS", 2, 0, false);
        declareFunction(me, "cnc_random_pair_from_wu_constraints", "CNC-RANDOM-PAIR-FROM-WU-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "cnc_random_pair_from_equals_constraints", "CNC-RANDOM-PAIR-FROM-EQUALS-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "get_cnc_substate_cheapest_isaXgenls_constraint", "GET-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT", 1, 0, false);
        declareFunction(me, "get_cnc_substate_cheapest_isaXgenls_constraint_matches", "GET-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT-MATCHES", 1, 0, false);
        declareFunction(me, "note_cnc_substate_cheapest_isaXgenls_constraint_matches", "NOTE-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT-MATCHES", 2, 0, false);
        declareFunction(me, "remove_cnc_substate_cheapest_isaXgenls_constraint_match", "REMOVE-CNC-SUBSTATE-CHEAPEST-ISA/GENLS-CONSTRAINT-MATCH", 2, 0, false);
        declareFunction(me, "cnc_random_pair_from_isaXgenls_constraints", "CNC-RANDOM-PAIR-FROM-ISA/GENLS-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "cnc_random_pair_from_isaXgenls_constraints_internal", "CNC-RANDOM-PAIR-FROM-ISA/GENLS-CONSTRAINTS-INTERNAL", 2, 0, false);
        declareFunction(me, "cnc_random_match_constraint_failure", "CNC-RANDOM-MATCH-CONSTRAINT-FAILURE", 5, 0, false);
        declareFunction(me, "cnc_random_pair_from_match", "CNC-RANDOM-PAIR-FROM-MATCH", 4, 0, false);
        declareFunction(me, "cnc_agr_pred_okP", "CNC-AGR-PRED-OK?", 2, 0, false);
        declareFunction(me, "cnc_string_okP", "CNC-STRING-OK?", 2, 0, false);
        declareFunction(me, "contains_adjective_only_wordP", "CONTAINS-ADJECTIVE-ONLY-WORD?", 1, 0, false);
        declareFunction(me, "cnc_cheapest_isaXgenls_constraint", "CNC-CHEAPEST-ISA/GENLS-CONSTRAINT", 2, 0, false);
        declareFunction(me, "generate_and_eval_cnc_test_for_rule", "GENERATE-AND-EVAL-CNC-TEST-FOR-RULE", 1, 5, false);
        declareFunction(me, "test_untested_ncr_rules", "TEST-UNTESTED-NCR-RULES", 2, 0, false);
        declareFunction(me, "test_untested_ncrs_w_running_query_limit", "TEST-UNTESTED-NCRS-W-RUNNING-QUERY-LIMIT", 2, 0, false);
        declareFunction(me, "generate_and_store_cnc_tests_for_untested_rules", "GENERATE-AND-STORE-CNC-TESTS-FOR-UNTESTED-RULES", 1, 0, false);
        declareFunction(me, "generate_and_store_cnc_test_for_rule", "GENERATE-AND-STORE-CNC-TEST-FOR-RULE", 1, 3, false);
        declareFunction(me, "batch_process_unfamiliar_strings", "BATCH-PROCESS-UNFAMILIAR-STRINGS", 2, 0, false);
        declareFunction(me, "lookup_and_store_scores_for_unscored_cnc_tests", "LOOKUP-AND-STORE-SCORES-FOR-UNSCORED-CNC-TESTS", 1, 0, false);
        declareFunction(me, "update_unscored_ncr_table", "UPDATE-UNSCORED-NCR-TABLE", 1, 0, false);
        declareFunction(me, "update_scored_ncr_table", "UPDATE-SCORED-NCR-TABLE", 4, 0, false);
        declareFunction(me, "find_unfamiliar_strings_from_unscored_cnc_tests", "FIND-UNFAMILIAR-STRINGS-FROM-UNSCORED-CNC-TESTS", 1, 1, false);
        declareFunction(me, "cnc_get_engine", "CNC-GET-ENGINE", 1, 0, false);
        declareFunction(me, "score_and_store_cnc_test_data_for_ncr", "SCORE-AND-STORE-CNC-TEST-DATA-FOR-NCR", 2, 3, false);
        declareFunction(me, "score_unscored_cnc_data", "SCORE-UNSCORED-CNC-DATA", 1, 2, false);
        declareFunction(me, "score_unscored_cnc_data2", "SCORE-UNSCORED-CNC-DATA2", 1, 2, false);
        declareFunction(me, "cnc_query_and_store_search_string_hits", "CNC-QUERY-AND-STORE-SEARCH-STRING-HITS", 3, 0, false);
        declareFunction(me, "cnc_get_string_hit_pairs", "CNC-GET-STRING-HIT-PAIRS", 2, 0, false);
        declareFunction(me, "score_cnc_test_data", "SCORE-CNC-TEST-DATA", 1, 2, false);
        declareFunction(me, "get_unfamiliar_strings_from_cnc_data", "GET-UNFAMILIAR-STRINGS-FROM-CNC-DATA", 1, 2, false);
        declareFunction(me, "string_hits_knownP", "STRING-HITS-KNOWN?", 1, 0, false);
        declareFunction(me, "score_cnc_test_tuple", "SCORE-CNC-TEST-TUPLE", 1, 2, false);
        declareFunction(me, "score_cnc_test_tuple2", "SCORE-CNC-TEST-TUPLE2", 1, 2, false);
        declareFunction(me, "initialize_running_query_counter", "INITIALIZE-RUNNING-QUERY-COUNTER", 0, 1, false);
        declareFunction(me, "cnc_lookup_search_string_hits", "CNC-LOOKUP-SEARCH-STRING-HITS", 2, 1, false);
        declareFunction(me, "cnc_query_for_search_string_hits", "CNC-QUERY-FOR-SEARCH-STRING-HITS", 1, 1, false);
        declareFunction(me, "apply_search_fn", "APPLY-SEARCH-FN", 2, 0, false);
        declareFunction(me, "cnc_find_search_string_hits", "CNC-FIND-SEARCH-STRING-HITS", 3, 0, false);
        declareFunction(me, "backup_cnc_tables", "BACKUP-CNC-TABLES", 0, 0, false);
        declareFunction(me, "cnc_get_from_fht", "CNC-GET-FROM-FHT", 2, 0, false);
        declareFunction(me, "cnc_put_to_fht", "CNC-PUT-TO-FHT", 3, 0, false);
        declareFunction(me, "cnc_remove_from_fht", "CNC-REMOVE-FROM-FHT", 2, 0, false);
        declareFunction(me, "cnc_print_fht_contents", "CNC-PRINT-FHT-CONTENTS", 1, 0, false);
        declareFunction(me, "default_aggregate_cnc_score_wrt_yahoo_old", "DEFAULT-AGGREGATE-CNC-SCORE-WRT-YAHOO-OLD", 1, 0, false);
        declareFunction(me, "default_aggregate_cnc_score_wrt_yahoo", "DEFAULT-AGGREGATE-CNC-SCORE-WRT-YAHOO", 1, 1, false);
        declareFunction(me, "generate_fast_cnc_test_for_rule", "GENERATE-FAST-CNC-TEST-FOR-RULE", 1, 0, false);
        declareFunction(me, "filter_cnc_results_w_component_threshold", "FILTER-CNC-RESULTS-W-COMPONENT-THRESHOLD", 1, 1, false);
        declareFunction(me, "filter_cnc_results_w_compound_threshold", "FILTER-CNC-RESULTS-W-COMPOUND-THRESHOLD", 1, 1, false);
        declareFunction(me, "evaluate_cnc_results_w_thresholds", "EVALUATE-CNC-RESULTS-W-THRESHOLDS", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_candidate_nc_utilities_file() {
        defparameter("*CNC-TEST-SIZE*", $int$1000);
        defparameter("*CNC-FAST-TEST-SIZE*", $int$300);
        defparameter("*CNC-QUERY-MT*", $$GeneralEnglishMt);
        defparameter("*CNC-PARAPHRASE-MT*", $$EnglishParaphraseMt);
        defvar("*CNC-RUNNING-QUERY-TOTAL*", ZERO_INTEGER);
        defparameter("*CNC-DEFAULT-SEARCH-ENGINE*", $YAHOO);
        defparameter("*CNC-MAX-STRING-SEARCH-ATTEMPTS*", TEN_INTEGER);
        defparameter("*CNC-COMPOUND-THRESHOLD*", ONE_INTEGER);
        defparameter("*CNC-COMPONENT-THRESHOLD*", $int$100);
        defparameter("*CNC-STRING-HITS-TABLE*", $str6$_cyc_top_data_nl_cnc_tests_fht_da);
        defparameter("*SCORED-NCR-TABLE*", $str7$_cyc_top_data_nl_cnc_tests_fht_da);
        defparameter("*UNSCORED-NCR-TABLE*", $str8$_cyc_top_data_nl_cnc_tests_fht_da);
        defparameter("*USE-CNC-ITERATOR?*", T);
        defparameter("*CNC-REMOVE-DUPLICATES?*", T);
        deflexical("*NC-RULE-CONSTRAINT-PREDICATE-MAP*", $list40);
        deflexical("*RUN-CNC-QUERY-CACHING-STATE*", NIL);
        deflexical("*POPCORN-TIMER-POOL*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*POPCORN-TIMER-POOL-LOCK*", make_lock($$$Popcorn_Timer_Pool_Lock));
        defparameter("*CNC-POPCORN-WINDOW*", $int$50);
        defparameter("*CNC-POPCORN-MINIMUM*", ONE_INTEGER);
        defconstant("*DTP-CANDIDATE-NC-POPCORN-TIMER*", CANDIDATE_NC_POPCORN_TIMER);
        defconstant("*DTP-CANDIDATE-NC-ITERATOR-STATE*", CANDIDATE_NC_ITERATOR_STATE);
        defparameter("*CNC-RULE-FORT*", NIL);
        defconstant("*DTP-CANDIDATE-NC-SUB-ITERATOR-STATE*", CANDIDATE_NC_SUB_ITERATOR_STATE);
        defparameter("*CNC-MAX-TRIES*", $int$300);
        defparameter("*CNC-PPH-DEMERIT-CUTOFF*", ONE_INTEGER);
        defparameter("*CNC-MAX-STRING-LENGTH*", $int$30);
        defparameter("*STORE-W-METHOD-TEST-KEY?*", NIL);
        defparameter("*CNC-METHOD-TEST-KEYWORD*", $ITERATOR_TEST5);
        defparameter("*CNC-SEARCH-STRING-HITS-BKUP-FILE-PREFIX*", $str197$_cyc_top_data_nl_cnc_tests_bkup_f);
        defparameter("*SCORED-NCR-BKUP-FILE-PREFIX*", $str198$_cyc_top_data_nl_cnc_tests_bkup_f);
        defparameter("*UNSCORED-NCR-BKUP-FILE-PREFIX*", $str199$_cyc_top_data_nl_cnc_tests_bkup_f);
        defparameter("*CNC-BKUP-PAIRS*", list(list($cnc_search_string_hits_bkup_file_prefix$.getDynamicValue(), $cnc_string_hits_table$.getDynamicValue()), list($scored_ncr_bkup_file_prefix$.getDynamicValue(), $scored_ncr_table$.getDynamicValue()), list($unscored_ncr_bkup_file_prefix$.getDynamicValue(), $unscored_ncr_table$.getDynamicValue())));
        defparameter("*CREATE-CNC-TEST?*", T);
        return NIL;
    }

    public static SubLObject setup_candidate_nc_utilities_file() {
        memoization_state.note_globally_cached_function(RUN_CNC_QUERY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_candidate_nc_popcorn_timer$.getGlobalValue(), symbol_function(CANDIDATE_NC_POPCORN_TIMER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list65);
        def_csetf(CNC_POPCORN_TIMER_WINDOW, _CSETF_CNC_POPCORN_TIMER_WINDOW);
        def_csetf(CNC_POPCORN_TIMER_MINIMUM, _CSETF_CNC_POPCORN_TIMER_MINIMUM);
        def_csetf(CNC_POPCORN_TIMER_INDEX, _CSETF_CNC_POPCORN_TIMER_INDEX);
        def_csetf(CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT, _CSETF_CNC_POPCORN_TIMER_RECENT_FAILURE_COUNT);
        def_csetf(CNC_POPCORN_TIMER_HISTORY, _CSETF_CNC_POPCORN_TIMER_HISTORY);
        identity(CANDIDATE_NC_POPCORN_TIMER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_candidate_nc_popcorn_timer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_POPCORN_TIMER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_candidate_nc_iterator_state$.getGlobalValue(), symbol_function(CANDIDATE_NC_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list96);
        def_csetf(CNC_STATE_RULE_FORT, _CSETF_CNC_STATE_RULE_FORT);
        def_csetf(CNC_STATE_MOD_ITERATOR, _CSETF_CNC_STATE_MOD_ITERATOR);
        def_csetf(CNC_STATE_HEAD_ITERATOR, _CSETF_CNC_STATE_HEAD_ITERATOR);
        def_csetf(CNC_STATE_MT, _CSETF_CNC_STATE_MT);
        def_csetf($sym105$CNC_STATE_DONE_, $sym106$_CSETF_CNC_STATE_DONE_);
        identity(CANDIDATE_NC_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_candidate_nc_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_ITERATOR_STATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_candidate_nc_sub_iterator_state$.getGlobalValue(), symbol_function(CANDIDATE_NC_SUB_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list126);
        def_csetf(CNC_SUBSTATE_WU_CONSTRAINTS, _CSETF_CNC_SUBSTATE_WU_CONSTRAINTS);
        def_csetf(CNC_SUBSTATE_EQUALS_CONSTRAINTS, _CSETF_CNC_SUBSTATE_EQUALS_CONSTRAINTS);
        def_csetf(CNC_SUBSTATE_GENLS_CONSTRAINTS, _CSETF_CNC_SUBSTATE_GENLS_CONSTRAINTS);
        def_csetf(CNC_SUBSTATE_ISA_CONSTRAINTS, _CSETF_CNC_SUBSTATE_ISA_CONSTRAINTS);
        def_csetf(CNC_SUBSTATE_POS_CONSTRAINTS, _CSETF_CNC_SUBSTATE_POS_CONSTRAINTS);
        def_csetf(CNC_SUBSTATE_POS_PRED_CONSTRAINTS, _CSETF_CNC_SUBSTATE_POS_PRED_CONSTRAINTS);
        def_csetf(CNC_SUBSTATE_MT, _CSETF_CNC_SUBSTATE_MT);
        def_csetf(CNC_SUBSTATE_PLIST, _CSETF_CNC_SUBSTATE_PLIST);
        def_csetf($sym143$CNC_SUBSTATE_DONE_, $sym144$_CSETF_CNC_SUBSTATE_DONE_);
        identity(CANDIDATE_NC_SUB_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_candidate_nc_sub_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CANDIDATE_NC_SUB_ITERATOR_STATE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_candidate_nc_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_candidate_nc_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_candidate_nc_utilities_file();
    }

    

    public static final class $candidate_nc_popcorn_timer_native extends SubLStructNative {
        public SubLObject $window;

        public SubLObject $minimum;

        public SubLObject $index;

        public SubLObject $recent_failure_count;

        public SubLObject $history;

        private static final SubLStructDeclNative structDecl;

        private $candidate_nc_popcorn_timer_native() {
            this.$window = Lisp.NIL;
            this.$minimum = Lisp.NIL;
            this.$index = Lisp.NIL;
            this.$recent_failure_count = Lisp.NIL;
            this.$history = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$window;
        }

        @Override
        public SubLObject getField3() {
            return this.$minimum;
        }

        @Override
        public SubLObject getField4() {
            return this.$index;
        }

        @Override
        public SubLObject getField5() {
            return this.$recent_failure_count;
        }

        @Override
        public SubLObject getField6() {
            return this.$history;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$window = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$minimum = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$index = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$recent_failure_count = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$history = value;
        }

        static {
            structDecl = makeStructDeclNative($candidate_nc_popcorn_timer_native.class, CANDIDATE_NC_POPCORN_TIMER, CANDIDATE_NC_POPCORN_TIMER_P, $list59, $list60, new String[]{ "$window", "$minimum", "$index", "$recent_failure_count", "$history" }, $list61, $list62, PRINT_CNC_POPCORN_TIMER);
        }
    }

    public static final class $candidate_nc_popcorn_timer_p$UnaryFunction extends UnaryFunction {
        public $candidate_nc_popcorn_timer_p$UnaryFunction() {
            super(extractFunctionNamed("CANDIDATE-NC-POPCORN-TIMER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return candidate_nc_popcorn_timer_p(arg1);
        }
    }

    public static final class $candidate_nc_iterator_state_native extends SubLStructNative {
        public SubLObject $rule_fort;

        public SubLObject $mod_iterator;

        public SubLObject $head_iterator;

        public SubLObject $mt;

        public SubLObject $doneP;

        private static final SubLStructDeclNative structDecl;

        private $candidate_nc_iterator_state_native() {
            this.$rule_fort = Lisp.NIL;
            this.$mod_iterator = Lisp.NIL;
            this.$head_iterator = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$doneP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$rule_fort;
        }

        @Override
        public SubLObject getField3() {
            return this.$mod_iterator;
        }

        @Override
        public SubLObject getField4() {
            return this.$head_iterator;
        }

        @Override
        public SubLObject getField5() {
            return this.$mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$doneP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$rule_fort = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$mod_iterator = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$head_iterator = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$doneP = value;
        }

        static {
            structDecl = makeStructDeclNative($candidate_nc_iterator_state_native.class, CANDIDATE_NC_ITERATOR_STATE, CANDIDATE_NC_ITERATOR_STATE_P, $list90, $list91, new String[]{ "$rule_fort", "$mod_iterator", "$head_iterator", "$mt", "$doneP" }, $list92, $list93, PRINT_CNC_STATE);
        }
    }

    public static final class $candidate_nc_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $candidate_nc_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("CANDIDATE-NC-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return candidate_nc_iterator_state_p(arg1);
        }
    }

    public static final class $candidate_nc_sub_iterator_state_native extends SubLStructNative {
        public SubLObject $wu_constraints;

        public SubLObject $equals_constraints;

        public SubLObject $genls_constraints;

        public SubLObject $isa_constraints;

        public SubLObject $pos_constraints;

        public SubLObject $pos_pred_constraints;

        public SubLObject $mt;

        public SubLObject $plist;

        public SubLObject $doneP;

        private static final SubLStructDeclNative structDecl;

        private $candidate_nc_sub_iterator_state_native() {
            this.$wu_constraints = Lisp.NIL;
            this.$equals_constraints = Lisp.NIL;
            this.$genls_constraints = Lisp.NIL;
            this.$isa_constraints = Lisp.NIL;
            this.$pos_constraints = Lisp.NIL;
            this.$pos_pred_constraints = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$plist = Lisp.NIL;
            this.$doneP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$wu_constraints;
        }

        @Override
        public SubLObject getField3() {
            return this.$equals_constraints;
        }

        @Override
        public SubLObject getField4() {
            return this.$genls_constraints;
        }

        @Override
        public SubLObject getField5() {
            return this.$isa_constraints;
        }

        @Override
        public SubLObject getField6() {
            return this.$pos_constraints;
        }

        @Override
        public SubLObject getField7() {
            return this.$pos_pred_constraints;
        }

        @Override
        public SubLObject getField8() {
            return this.$mt;
        }

        @Override
        public SubLObject getField9() {
            return this.$plist;
        }

        @Override
        public SubLObject getField10() {
            return this.$doneP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$wu_constraints = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$equals_constraints = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$genls_constraints = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$isa_constraints = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$pos_constraints = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$pos_pred_constraints = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$doneP = value;
        }

        static {
            structDecl = makeStructDeclNative($candidate_nc_sub_iterator_state_native.class, CANDIDATE_NC_SUB_ITERATOR_STATE, CANDIDATE_NC_SUB_ITERATOR_STATE_P, $list120, $list121, new String[]{ "$wu_constraints", "$equals_constraints", "$genls_constraints", "$isa_constraints", "$pos_constraints", "$pos_pred_constraints", "$mt", "$plist", "$doneP" }, $list122, $list123, PRINT_CNC_SUBSTATE);
        }
    }

    public static final class $candidate_nc_sub_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $candidate_nc_sub_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("CANDIDATE-NC-SUB-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return candidate_nc_sub_iterator_state_p(arg1);
        }
    }
}

/**
 * Total time: 733 ms
 */
