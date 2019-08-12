/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.at_vars.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.hlmt.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.uncanonicalizer.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PROVE
 * source file: /cyc/top/cycl/inference/harness/prove.lisp
 * created:     2019/07/03 17:37:48
 */
public final class prove extends SubLTranslatedFile implements V12 {
    /**
     * Returns an alist mapping variables to the terms they are constrained to be equalSymbols to.
     */
    @LispMethod(comment = "Returns an alist mapping variables to the terms they are constrained to be equalSymbols to.")
    public static final SubLObject hypothesize_dnf_equal_symbols_constraints(SubLObject dnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject equal_symbols_alist = NIL;
                SubLObject equal_symbols_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject conflict_vars = NIL;
                SubLObject cdolist_list_var = clauses.pos_lits(dnf);
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$equalSymbols)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject equalsymbols = unmake_binary_formula(asent);
                            SubLObject arg1 = thread.secondMultipleValue();
                            SubLObject arg2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject open_term = NIL;
                                SubLObject closed_term = NIL;
                                if ((NIL != variables.not_fully_bound_p(arg1)) && (NIL != closedP(arg2, UNPROVIDED))) {
                                    open_term = arg1;
                                    closed_term = arg2;
                                } else {
                                    if ((NIL != variables.not_fully_bound_p(arg2)) && (NIL != closedP(arg1, UNPROVIDED))) {
                                        open_term = arg2;
                                        closed_term = arg1;
                                    }
                                }
                                if ((NIL != open_term) && (NIL != closed_term)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_bindings = unification.unify(open_term, closed_term, T, UNPROVIDED);
                                        SubLObject justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject cdolist_list_var_19 = new_bindings;
                                            SubLObject new_binding = NIL;
                                            for (new_binding = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , new_binding = cdolist_list_var_19.first()) {
                                                {
                                                    SubLObject datum = new_binding;
                                                    SubLObject current = datum;
                                                    SubLObject hl_var = NIL;
                                                    SubLObject binding = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt33);
                                                    hl_var = current.first();
                                                    current = current.rest();
                                                    binding = current;
                                                    {
                                                        SubLObject existing_binding = dictionary.dictionary_lookup(equal_symbols_dict, hl_var, UNPROVIDED);
                                                        if ((NIL != existing_binding) && (!binding.equal(existing_binding))) {
                                                            conflict_vars = cons(hl_var, conflict_vars);
                                                        } else {
                                                            dictionary.dictionary_enter(equal_symbols_dict, hl_var, binding);
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
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equal_symbols_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject open_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject closed_term = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == subl_promotions.memberP(open_term, conflict_vars, UNPROVIDED, UNPROVIDED)) {
                                equal_symbols_alist = cons(cons(open_term, closed_term), equal_symbols_alist);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return equal_symbols_alist;
            }
        }
    }

    static private final SubLString $str_alt11$ = makeString("");

    public static final SubLFile me = new prove();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.prove";


    // defparameter
    // Definitions
    // Like @xref *inconsistent-support-sets* except threadsafe
    /**
     * Like @xref *inconsistent-support-sets* except threadsafe
     */
    @LispMethod(comment = "Like @xref *inconsistent-support-sets* except threadsafe\ndefparameter")
    private static final SubLSymbol $conflicting_support_sets$ = makeSymbol("*CONFLICTING-SUPPORT-SETS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $something_asserted_within_hypothesize_termsP$ = makeSymbol("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $fi_prove_new_cyc_query_trampoline_enabledP$ = makeSymbol("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*");

    // defparameter
    /**
     * Switch to control whether or not undirected forward propagation of hypothesis
     * mts is performed.
     */
    @LispMethod(comment = "Switch to control whether or not undirected forward propagation of hypothesis\r\nmts is performed.\ndefparameter\nSwitch to control whether or not undirected forward propagation of hypothesis\nmts is performed.")
    public static final SubLSymbol $proof_hypothesis_forward_propagation_enabled$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*");

    // defvar
    // Do we assume the type constraints of the consequent of a proof?
    /**
     * Do we assume the type constraints of the consequent of a proof?
     */
    @LispMethod(comment = "Do we assume the type constraints of the consequent of a proof?\ndefvar")
    public static final SubLSymbol $proof_assume_consequent_type_constraintsP$ = makeSymbol("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $proof_hypothesis_forward_absolute_time_cutoff$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $proof_hypothesis_forward_time_cutoff$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $proof_hypothesis_forward_removal_cost_cutoff$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $proof_hypothesis_forward_propagation_depth$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $hypothesize_spec_mt_sentence$ = makeSymbol("*HYPOTHESIZE-SPEC-MT-SENTENCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_new_non_wff_conflict_supports_explain_methodP$ = makeSymbol("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");

    static private final SubLString $$$HYP = makeString("HYP");

    private static final SubLSymbol FI_HYPOTHESIZE = makeSymbol("FI-HYPOTHESIZE");

    static private final SubLList $list4 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NAME-PREFIX"), makeString("HYP")), makeSymbol("TERM-IDS"));

    static private final SubLString $str5$Cyc_attempts_to_check_if_SENTENCE = makeString("Cyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.");

    static private final SubLList $list6 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));

    static private final SubLString $str8$Expected_a_cons__got__S = makeString("Expected a cons, got ~S");

    static private final SubLString $str9$Expected_a_string__got__S = makeString("Expected a string, got ~S");



    static private final SubLString $str11$ = makeString("");





    private static final SubLSymbol CONFLICT_HANDLER = makeSymbol("CONFLICT-HANDLER");

    static private final SubLList $list16 = listS(makeSymbol("VARIABLE"), makeSymbol("NEW-TERM-NAME"), makeSymbol("ISA-CONSTRAINTS"));

    static private final SubLSymbol $sym17$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");



    static private final SubLList $list19 = cons(makeSymbol("VARIABLE2"), makeSymbol("GENL-CONSTRAINTS"));

    static private final SubLString $str20$Constraint_variable_mismatch_erro = makeString("Constraint variable mismatch error in hypothesis: ~a != ~a");

    static private final SubLList $list21 = cons(makeSymbol("VARIABLE3"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    static private final SubLSymbol $sym22$ANECT_ = makeSymbol("ANECT?");











    private static final SubLString $str29$_A__A__A = makeString("~A-~A-~A");



    private static final SubLList $list31 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"));



    static private final SubLList $list33 = cons(makeSymbol("VARIABLE"), makeSymbol("ISA-CONSTRAINTS"));



    private static final SubLSymbol $sym35$_ = makeSymbol("<");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    private static final SubLString $$$Term = makeString("Term");

    private static final SubLList $list38 = cons(makeSymbol("VARIABLE"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    static private final SubLList $list39 = cons(makeSymbol("VARIABLE"), makeSymbol("GENL-CONSTRAINTS"));

    private static final SubLSymbol FI_PROVE = makeSymbol("FI-PROVE");

    private static final SubLList $list45 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    private static final SubLString $str46$Attempts_to_prove_SENTENCE_is_tru = makeString("Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY.");

    private static final SubLList $list47 = list(list(makeSymbol("NIL-OR"), list(makeSymbol("LIST"), makeSymbol("LISTP"))));

    static private final SubLList $list48 = list(makeSymbol("IST"), makeSymbol("IST-MT"), makeSymbol("IST-SENTENCE"));

    private static final SubLString $str49$Expected_an_integer__got__S = makeString("Expected an integer, got ~S");



    private static final SubLSymbol $kw51$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");





    private static final SubLSymbol $hypothesis_mt_table$ = makeSymbol("*HYPOTHESIS-MT-TABLE*");

    private static final SubLList $list57 = list(makeSymbol("HYPOTHESIS-MT"), makeSymbol("TERM-BINDINGS"));



    private static final SubLString $$$Hypothesis = makeString("Hypothesis");

    private static final SubLSymbol KILL_CACHED_HYPOTHESIS_MT = makeSymbol("KILL-CACHED-HYPOTHESIS-MT");

    private static final SubLList $list62 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol $proof_mt_table$ = makeSymbol("*PROOF-MT-TABLE*");

    private static final SubLString $$$Proof = makeString("Proof");

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLList $list66 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?SPEC-MT"), reader_make_constant_shell("HypotheticalContext")), list(reader_make_constant_shell("genlMt"), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(reader_make_constant_shell("termDependsOn"), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(reader_make_constant_shell("ephemeralTerm"), makeSymbol("?SPEC-MT")));

    private static final SubLSymbol $sym68$_SPEC_MT = makeSymbol("?SPEC-MT");



    private static final SubLString $str70$HYP_ = makeString("HYP-");

    private static final SubLSymbol HYPOTHETICAL_CONSTANT = makeSymbol("HYPOTHETICAL-CONSTANT");

    private static final SubLSymbol $sym72$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLSymbol HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");

    private static final SubLSymbol $sym75$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol CONVERT_TO_HL_SUPPORT = makeSymbol("CONVERT-TO-HL-SUPPORT");

    private static final SubLSymbol $sym78$EPHEMERAL_TERM_ = makeSymbol("EPHEMERAL-TERM?");



    private static final SubLList $list81 = list(makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("SENTENCE"));







    private static final SubLSymbol FI_PROVE_INT = makeSymbol("FI-PROVE-INT");

    private static final SubLList $list96 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell("implies"), reader_make_constant_shell("True"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell("implies"), reader_make_constant_shell("False"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), reader_make_constant_shell("True")), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), reader_make_constant_shell("False")), reader_make_constant_shell("BaseKB")), NIL, makeKeyword("CONTRADICTION")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and")), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("or")), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), list(reader_make_constant_shell("and"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), list(reader_make_constant_shell("or"))), reader_make_constant_shell("BaseKB")), NIL, makeKeyword("CONTRADICTION")) });

    /**
     * Prove SENTENCE in MT.  Return bindings and HL supports for those bindings.
     */
    @LispMethod(comment = "Prove SENTENCE in MT.  Return bindings and HL supports for those bindings.")
    public static final SubLObject prove_justified_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject status = NIL;
                {
                    SubLObject _prev_bind_0 = $inference_answer_handler$.currentBinding(thread);
                    try {
                        $inference_answer_handler$.bind(INFERENCE_RETURN_BLISTS_AND_SUPPORTS, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject ask_results = com.cyc.cycjava.cycl.inference.harness.prove.fi_prove_int(sentence, mt, backchain, number, time, depth);
                            SubLObject ask_status = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            results = ask_results;
                            status = ask_status;
                        }
                    } finally {
                        $inference_answer_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(results, status);
            }
        }
    }

    /**
     * Prove SENTENCE in MT.  Return bindings and HL supports for those bindings.
     */
    @LispMethod(comment = "Prove SENTENCE in MT.  Return bindings and HL supports for those bindings.")
    public static SubLObject prove_justified(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject status = NIL;
        final SubLObject _prev_bind_0 = $inference_answer_handler$.currentBinding(thread);
        try {
            $inference_answer_handler$.bind(INFERENCE_RETURN_BLISTS_AND_SUPPORTS, thread);
            thread.resetMultipleValues();
            final SubLObject ask_results = fi_prove_int(sentence, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            results = ask_results;
            status = ask_status;
        } finally {
            $inference_answer_handler$.rebind(_prev_bind_0, thread);
        }
        return values(results, status);
    }

    /**
     * Cyc attempts to check if SENTENCE is satisfiable in MT by 'hypothesizing'
     * constants for the variables in SENTENCE, substituting them into SENTENCE,
     * and asserting the new sentence in MT.  If this would trigger a
     * contradiction, then NIL is returned.  Otherwise a binding list of variable /
     * constant pairs is returned, indicating the constants which were
     * successfully 'hypothesized'.  The form ((T . T)) is returned if no new terms
     * required creation for the assertion of SENTENCE.
     * NAME-PREFIX is a string which is used as a prefix for the name of each new
     * constant hypothesized.  TERM-IDS is a list of variable / id pairs indicating
     * that the specified id should be used when generating the constant for the variable
     * in SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new
     * constants.
     */
    @LispMethod(comment = "Cyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\r\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\r\nand asserting the new sentence in MT.  If this would trigger a\r\ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\r\nconstant pairs is returned, indicating the constants which were\r\nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\r\nrequired creation for the assertion of SENTENCE.\r\nNAME-PREFIX is a string which is used as a prefix for the name of each new\r\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\r\nthat the specified id should be used when generating the constant for the variable\r\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\r\nconstants.\nCyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a\ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were\nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.")
    public static final SubLObject fi_hypothesize_alt(SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        return fi.fi($HYPOTHESIZE, sentence, mt, name_prefix, term_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Cyc attempts to check if SENTENCE is satisfiable in MT by 'hypothesizing'
     * constants for the variables in SENTENCE, substituting them into SENTENCE,
     * and asserting the new sentence in MT.  If this would trigger a
     * contradiction, then NIL is returned.  Otherwise a binding list of variable /
     * constant pairs is returned, indicating the constants which were
     * successfully 'hypothesized'.  The form ((T . T)) is returned if no new terms
     * required creation for the assertion of SENTENCE.
     * NAME-PREFIX is a string which is used as a prefix for the name of each new
     * constant hypothesized.  TERM-IDS is a list of variable / id pairs indicating
     * that the specified id should be used when generating the constant for the variable
     * in SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new
     * constants.
     */
    @LispMethod(comment = "Cyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\r\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\r\nand asserting the new sentence in MT.  If this would trigger a\r\ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\r\nconstant pairs is returned, indicating the constants which were\r\nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\r\nrequired creation for the assertion of SENTENCE.\r\nNAME-PREFIX is a string which is used as a prefix for the name of each new\r\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\r\nthat the specified id should be used when generating the constant for the variable\r\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\r\nconstants.\nCyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a\ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were\nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.")
    public static SubLObject fi_hypothesize(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        return fi.fi($HYPOTHESIZE, sentence, mt, name_prefix, term_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fi_hypothesize_int_alt(SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            fi.reset_fi_error_state();
            if (!sentence.isCons()) {
                fi.signal_fi_error(list($ARG_ERROR, $str_alt8$Expected_a_cons__got__S, sentence));
                return NIL;
            }
            mt = fi.fi_convert_to_assert_hlmt(mt);
            if (NIL != fi.fi_error_signaledP()) {
                return NIL;
            }
            if (!name_prefix.isString()) {
                fi.signal_fi_error(list($ARG_ERROR, $str_alt9$Expected_a_string__got__S, name_prefix));
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject var_term_bindings = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms(sentence, mt, name_prefix, term_ids);
                SubLObject success = thread.secondMultipleValue();
                SubLObject failure_reasons = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == success) {
                    return values(NIL, failure_reasons);
                } else {
                    if (NIL == var_term_bindings) {
                        return values(bindings.unification_success_token(), NIL);
                    } else {
                        return values(var_term_bindings, NIL);
                    }
                }
            }
        }
    }

    public static SubLObject fi_hypothesize_int(final SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (!sentence.isCons()) {
            fi.signal_fi_error(list($ARG_ERROR, $str8$Expected_a_cons__got__S, sentence));
            return NIL;
        }
        mt = fi.fi_convert_to_assert_hlmt_if_wft(mt);
        if (NIL != fi.fi_error_signaledP()) {
            return NIL;
        }
        if (!name_prefix.isString()) {
            fi.signal_fi_error(list($ARG_ERROR, $str9$Expected_a_string__got__S, name_prefix));
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject var_term_bindings = hypothesize_terms(sentence, mt, name_prefix, term_ids);
        final SubLObject success = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == success) {
            return values(NIL, failure_reasons);
        }
        if (NIL == var_term_bindings) {
            return values(bindings.unification_success_token(), NIL);
        }
        return values(var_term_bindings, NIL);
    }

    /**
     * we get the free variables in SENTENCE from @xref canonicalize-hypothesis,
     * and we only return bindings for those, even though we create
     * hypothetical terms for scoped variables iff they're scoped by
     * an outer existential.
     */
    @LispMethod(comment = "we get the free variables in SENTENCE from @xref canonicalize-hypothesis,\r\nand we only return bindings for those, even though we create\r\nhypothetical terms for scoped variables iff they\'re scoped by\r\nan outer existential.\nwe get the free variables in SENTENCE from @xref canonicalize-hypothesis,\nand we only return bindings for those, even though we create\nhypothetical terms for scoped variables iff they\'re scoped by\nan outer existential.")
    public static final SubLObject hypothesize_terms_alt(SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject canonical_sentence = inference_czer.canonicalize_hypothesis(sentence, mt);
                SubLObject canonical_mt = thread.secondMultipleValue();
                SubLObject free_vars = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject literals = inference_czer.categorize_hypothesis_formulas(canonical_sentence);
                    SubLObject rules = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject literals_sentence = bq_cons($$and, append(literals, NIL));
                        thread.resetMultipleValues();
                        {
                            SubLObject ans = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms_for_antecedent(literals_sentence, rules, canonical_mt, name_prefix, term_ids, free_vars);
                            SubLObject terms = thread.secondMultipleValue();
                            SubLObject successP = thread.thirdMultipleValue();
                            SubLObject failure_reasons = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == successP) {
                                ans = NIL;
                                {
                                    SubLObject cdolist_list_var = terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                        fi.fi_kill_int(v_term);
                                    }
                                }
                            }
                            return values(ans, successP, failure_reasons);
                        }
                    }
                }
            }
        }
    }

    /**
     * we get the free variables in SENTENCE from @xref canonicalize-hypothesis,
     * and we only return bindings for those, even though we create
     * hypothetical terms for scoped variables iff they're scoped by
     * an outer existential.
     */
    @LispMethod(comment = "we get the free variables in SENTENCE from @xref canonicalize-hypothesis,\r\nand we only return bindings for those, even though we create\r\nhypothetical terms for scoped variables iff they\'re scoped by\r\nan outer existential.\nwe get the free variables in SENTENCE from @xref canonicalize-hypothesis,\nand we only return bindings for those, even though we create\nhypothetical terms for scoped variables iff they\'re scoped by\nan outer existential.")
    public static SubLObject hypothesize_terms(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canonical_sentence = inference_czer.canonicalize_hypothesis(sentence, mt);
        final SubLObject canonical_mt = thread.secondMultipleValue();
        final SubLObject free_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject literals = inference_czer.categorize_hypothesis_formulas(canonical_sentence);
        final SubLObject rules = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject literals_sentence = bq_cons($$and, append(literals, NIL));
        thread.resetMultipleValues();
        SubLObject ans = hypothesize_terms_for_antecedent(literals_sentence, rules, canonical_mt, name_prefix, term_ids, free_vars);
        final SubLObject terms = thread.secondMultipleValue();
        final SubLObject successP = thread.thirdMultipleValue();
        final SubLObject failure_reasons = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            ans = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fi.fi_kill_int(v_term);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return values(ans, successP, failure_reasons);
    }

    public static final SubLObject hypothesize_terms_for_antecedent_alt(SubLObject antecedent, SubLObject rules, SubLObject mt, SubLObject name_prefix, SubLObject term_ids, SubLObject free_vars) {
        return com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms_int(antecedent, rules, mt, name_prefix, term_ids, NIL, T, free_vars);
    }

    public static SubLObject hypothesize_terms_for_antecedent(final SubLObject antecedent, final SubLObject rules, final SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject free_vars) {
        return hypothesize_terms_int(antecedent, rules, mt, name_prefix, term_ids, NIL, T, free_vars);
    }

    public static final SubLObject hypothesize_terms_for_consequent_alt(SubLObject consequent, SubLObject mt, SubLObject term_bindings, SubLObject free_vars) {
        return nth_value_step_2(nth_value_step_1(FOUR_INTEGER), com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms_int(consequent, NIL, mt, $str_alt11$, NIL, term_bindings, NIL, free_vars));
    }

    public static SubLObject hypothesize_terms_for_consequent(final SubLObject consequent, final SubLObject mt, final SubLObject term_bindings, final SubLObject free_vars) {
        return nth_value_step_2(nth_value_step_1(FOUR_INTEGER), hypothesize_terms_int(consequent, NIL, mt, $str11$, NIL, term_bindings, NIL, free_vars));
    }

    /**
     * Hypothesize terms for the variables in SENTENCE, and also hypothesize RULES
     * which are assumed to be self-contained.  The names for the hypothesized terms
     * will start with NAME-PREFIX and have external ids determined by looking up the
     * variable in the alist TERM-IDS.
     * If TERM-BINDINGS is provided, no new terms are created.  Instead, the variables
     * are looked up in the alist TERM-BINDINGS and those values are used instead.
     * This is used to provide additional constraints based on the consequent of the
     * hypothetical query.
     * ASSERT-SENTENCE? controls whether to assert SENTENCE, with appropriate bindings
     * substituted.  This will be T for the antecedent and NIL for the consequent.
     * Only returns bindings for the variables in the list FREE-VARS, but will
     * still return the terms hypothesized for other variables even if they are not in FREE-VARS.
     */
    @LispMethod(comment = "Hypothesize terms for the variables in SENTENCE, and also hypothesize RULES\r\nwhich are assumed to be self-contained.  The names for the hypothesized terms\r\nwill start with NAME-PREFIX and have external ids determined by looking up the\r\nvariable in the alist TERM-IDS.\r\nIf TERM-BINDINGS is provided, no new terms are created.  Instead, the variables\r\nare looked up in the alist TERM-BINDINGS and those values are used instead.\r\nThis is used to provide additional constraints based on the consequent of the\r\nhypothetical query.\r\nASSERT-SENTENCE? controls whether to assert SENTENCE, with appropriate bindings\r\nsubstituted.  This will be T for the antecedent and NIL for the consequent.\r\nOnly returns bindings for the variables in the list FREE-VARS, but will\r\nstill return the terms hypothesized for other variables even if they are not in FREE-VARS.\nHypothesize terms for the variables in SENTENCE, and also hypothesize RULES\nwhich are assumed to be self-contained.  The names for the hypothesized terms\nwill start with NAME-PREFIX and have external ids determined by looking up the\nvariable in the alist TERM-IDS.\nIf TERM-BINDINGS is provided, no new terms are created.  Instead, the variables\nare looked up in the alist TERM-BINDINGS and those values are used instead.\nThis is used to provide additional constraints based on the consequent of the\nhypothetical query.\nASSERT-SENTENCE? controls whether to assert SENTENCE, with appropriate bindings\nsubstituted.  This will be T for the antecedent and NIL for the consequent.\nOnly returns bindings for the variables in the list FREE-VARS, but will\nstill return the terms hypothesized for other variables even if they are not in FREE-VARS.")
    public static final SubLObject hypothesize_terms_int_alt(SubLObject sentence, SubLObject rules, SubLObject mt, SubLObject name_prefix, SubLObject term_ids, SubLObject term_bindings, SubLObject assert_sentenceP, SubLObject free_vars) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_bindings = NIL;
                SubLObject terms = NIL;
                SubLObject successP = NIL;
                SubLObject something_assertedP = NIL;
                SubLObject failure_reasons = NIL;
                conflicts.clear_inconsistent_support_sets();
                {
                    SubLObject _prev_bind_0 = $conflicting_support_sets$.currentBinding(thread);
                    try {
                        $conflicting_support_sets$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject canon_versions = NIL;
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject canon_versions_2 = inference_czer.canonicalize_hypothetical_ask(sentence, mt);
                                            SubLObject mt_3 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            canon_versions = canon_versions_2;
                                            mt = mt_3;
                                        }
                                        if (NIL == canon_versions) {
                                            com.cyc.cycjava.cycl.inference.harness.prove.note_non_wff_conflict(sentence, mt, UNPROVIDED);
                                        } else {
                                            if (canon_versions == $$False) {
                                                com.cyc.cycjava.cycl.inference.harness.prove.note_non_wff_conflict(sentence, mt, UNPROVIDED);
                                            } else {
                                                if ((canon_versions == $$True) && (NIL == rules)) {
                                                    successP = T;
                                                } else {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject result_bindings_4 = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms_int_2(canon_versions, mt, rules, name_prefix, term_ids, term_bindings, assert_sentenceP, free_vars);
                                                        SubLObject terms_5 = thread.secondMultipleValue();
                                                        SubLObject successP_6 = thread.thirdMultipleValue();
                                                        SubLObject something_assertedP_7 = thread.fourthMultipleValue();
                                                        thread.resetMultipleValues();
                                                        result_bindings = result_bindings_4;
                                                        terms = terms_5;
                                                        successP = successP_6;
                                                        something_assertedP = something_assertedP_7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            failure_reasons = $conflicting_support_sets$.getDynamicValue(thread);
                        }
                    } finally {
                        $conflicting_support_sets$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result_bindings, terms, successP, failure_reasons, something_assertedP);
            }
        }
    }

    /**
     * Hypothesize terms for the variables in SENTENCE, and also hypothesize RULES
     * which are assumed to be self-contained.  The names for the hypothesized terms
     * will start with NAME-PREFIX and have external ids determined by looking up the
     * variable in the alist TERM-IDS.
     * If TERM-BINDINGS is provided, no new terms are created.  Instead, the variables
     * are looked up in the alist TERM-BINDINGS and those values are used instead.
     * This is used to provide additional constraints based on the consequent of the
     * hypothetical query.
     * ASSERT-SENTENCE? controls whether to assert SENTENCE, with appropriate bindings
     * substituted.  This will be T for the antecedent and NIL for the consequent.
     * Only returns bindings for the variables in the list FREE-VARS, but will
     * still return the terms hypothesized for other variables even if they are not in FREE-VARS.
     */
    @LispMethod(comment = "Hypothesize terms for the variables in SENTENCE, and also hypothesize RULES\r\nwhich are assumed to be self-contained.  The names for the hypothesized terms\r\nwill start with NAME-PREFIX and have external ids determined by looking up the\r\nvariable in the alist TERM-IDS.\r\nIf TERM-BINDINGS is provided, no new terms are created.  Instead, the variables\r\nare looked up in the alist TERM-BINDINGS and those values are used instead.\r\nThis is used to provide additional constraints based on the consequent of the\r\nhypothetical query.\r\nASSERT-SENTENCE? controls whether to assert SENTENCE, with appropriate bindings\r\nsubstituted.  This will be T for the antecedent and NIL for the consequent.\r\nOnly returns bindings for the variables in the list FREE-VARS, but will\r\nstill return the terms hypothesized for other variables even if they are not in FREE-VARS.\nHypothesize terms for the variables in SENTENCE, and also hypothesize RULES\nwhich are assumed to be self-contained.  The names for the hypothesized terms\nwill start with NAME-PREFIX and have external ids determined by looking up the\nvariable in the alist TERM-IDS.\nIf TERM-BINDINGS is provided, no new terms are created.  Instead, the variables\nare looked up in the alist TERM-BINDINGS and those values are used instead.\nThis is used to provide additional constraints based on the consequent of the\nhypothetical query.\nASSERT-SENTENCE? controls whether to assert SENTENCE, with appropriate bindings\nsubstituted.  This will be T for the antecedent and NIL for the consequent.\nOnly returns bindings for the variables in the list FREE-VARS, but will\nstill return the terms hypothesized for other variables even if they are not in FREE-VARS.")
    public static SubLObject hypothesize_terms_int(final SubLObject sentence, final SubLObject rules, SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings, final SubLObject assert_sentenceP, final SubLObject free_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = NIL;
        SubLObject terms = NIL;
        SubLObject successP = NIL;
        SubLObject something_assertedP = NIL;
        SubLObject failure_reasons = NIL;
        conflicts.clear_inconsistent_support_sets();
        final SubLObject _prev_bind_0 = $conflicting_support_sets$.currentBinding(thread);
        try {
            $conflicting_support_sets$.bind(NIL, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject canon_versions = NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$2 = inference_czer.canonicalize_hypothetical_ask(sentence, mt);
                final SubLObject mt_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$2;
                mt = mt_$3;
                if (NIL == canon_versions) {
                    note_non_wff_conflict(sentence, mt, UNPROVIDED);
                } else
                    if (canon_versions.eql($$False)) {
                        note_non_wff_conflict(sentence, mt, UNPROVIDED);
                    } else
                        if (canon_versions.eql($$True) && (NIL == rules)) {
                            successP = T;
                        } else {
                            thread.resetMultipleValues();
                            final SubLObject result_bindings_$4 = hypothesize_terms_int_2(canon_versions, mt, rules, name_prefix, term_ids, term_bindings, assert_sentenceP, free_vars);
                            final SubLObject terms_$5 = thread.secondMultipleValue();
                            final SubLObject successP_$6 = thread.thirdMultipleValue();
                            final SubLObject something_assertedP_$7 = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            result_bindings = result_bindings_$4;
                            terms = terms_$5;
                            successP = successP_$6;
                            something_assertedP = something_assertedP_$7;
                        }


            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
            failure_reasons = $conflicting_support_sets$.getDynamicValue(thread);
        } finally {
            $conflicting_support_sets$.rebind(_prev_bind_0, thread);
        }
        return values(result_bindings, terms, successP, failure_reasons, something_assertedP);
    }

    /**
     * Helper functions may note conflicts and abort as a side effect
     */
    @LispMethod(comment = "Helper functions may note conflicts and abort as a side effect")
    public static final SubLObject hypothesize_terms_int_2_alt(SubLObject canon_versions, SubLObject mt, SubLObject rules, SubLObject name_prefix, SubLObject term_ids, SubLObject term_bindings, SubLObject assert_sentenceP, SubLObject free_vars) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_bindings = NIL;
                SubLObject terms = NIL;
                SubLObject successP = NIL;
                SubLObject something_assertedP = NIL;
                SubLObject num_vars = ZERO_INTEGER;
                SubLObject term_variable_map = NIL;
                {
                    SubLObject _prev_bind_0 = $something_asserted_within_hypothesize_termsP$.currentBinding(thread);
                    try {
                        $something_asserted_within_hypothesize_termsP$.bind(NIL, thread);
                        try {
                            {
                                SubLObject _prev_bind_0_8 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(CONFLICT_HANDLER), thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_9 = $conflicts_from_invalid_deductions$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = Errors.$ignore_warnsP$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = wff_vars.$enforce_literal_wff_idiosyncrasiesP$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $record_inconsistent_support_sets$.currentBinding(thread);
                                            try {
                                                $conflicts_from_invalid_deductions$.bind(T, thread);
                                                Errors.$ignore_warnsP$.bind(T, thread);
                                                wff_vars.$enforce_literal_wff_idiosyncrasiesP$.bind(NIL, thread);
                                                $record_inconsistent_support_sets$.bind(T, thread);
                                                if (canon_versions != $$True) {
                                                    {
                                                        SubLObject canon_version = canon_versions.first();
                                                        SubLObject canon_var_map = second(canon_version);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject dnf = fi.fi_canonicalize(canon_version, UNPROVIDED, UNPROVIDED);
                                                            SubLObject v_variables = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            num_vars = length(v_variables);
                                                            {
                                                                SubLObject var_equal_symbols_constraints = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_dnf_equal_symbols_constraints(dnf, mt);
                                                                SubLObject var_isa_constraints = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_dnf_isa_constraints(dnf, mt);
                                                                if (length(var_isa_constraints).numE(num_vars)) {
                                                                    {
                                                                        SubLObject var_quoted_isa_constraints = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_dnf_quoted_isa_constraints(dnf, mt);
                                                                        if (length(var_quoted_isa_constraints).numE(num_vars)) {
                                                                            {
                                                                                SubLObject var_genl_constraints = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_dnf_genl_constraints(dnf, mt);
                                                                                if (length(var_genl_constraints).numE(num_vars)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject terms_10 = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms_for_variables(var_equal_symbols_constraints, var_isa_constraints, var_quoted_isa_constraints, var_genl_constraints, mt, canon_var_map, terms, name_prefix, term_ids, term_bindings);
                                                                                        SubLObject term_variable_map_11 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        terms = terms_10;
                                                                                        term_variable_map = term_variable_map_11;
                                                                                    }
                                                                                    if (NIL != assert_sentenceP) {
                                                                                        com.cyc.cycjava.cycl.inference.harness.prove.assert_hypothetical_term_content_gafs(dnf, mt, term_variable_map);
                                                                                        {
                                                                                            SubLObject i = NIL;
                                                                                            for (i = ZERO_INTEGER; i.numL(num_vars); i = add(i, ONE_INTEGER)) {
                                                                                                {
                                                                                                    SubLObject var = nth(i, v_variables);
                                                                                                    SubLObject v_term = assoc(variables.find_variable_by_id(i), term_variable_map, UNPROVIDED, UNPROVIDED).rest();
                                                                                                    if (NIL != subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)) {
                                                                                                        result_bindings = cons(cons(var, v_term), result_bindings);
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
                                                com.cyc.cycjava.cycl.inference.harness.prove.assert_hypothetical_term_rules(rules, mt, term_variable_map, result_bindings);
                                                result_bindings = nreverse(result_bindings);
                                                successP = T;
                                                something_assertedP = $something_asserted_within_hypothesize_termsP$.getDynamicValue(thread);
                                            } finally {
                                                $record_inconsistent_support_sets$.rebind(_prev_bind_3, thread);
                                                wff_vars.$enforce_literal_wff_idiosyncrasiesP$.rebind(_prev_bind_2, thread);
                                                Errors.$ignore_warnsP$.rebind(_prev_bind_1, thread);
                                                $conflicts_from_invalid_deductions$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            result_bindings = Errors.handleThrowable(ccatch_env_var, $CONFLICT);
                        }
                    } finally {
                        $something_asserted_within_hypothesize_termsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result_bindings, terms, successP, something_assertedP);
            }
        }
    }

    /**
     * Helper functions may note conflicts and abort as a side effect
     */
    @LispMethod(comment = "Helper functions may note conflicts and abort as a side effect")
    public static SubLObject hypothesize_terms_int_2(final SubLObject canon_versions, final SubLObject mt, final SubLObject rules, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings, final SubLObject assert_sentenceP, final SubLObject free_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = NIL;
        SubLObject terms = NIL;
        SubLObject successP = NIL;
        SubLObject something_assertedP = NIL;
        SubLObject num_vars = ZERO_INTEGER;
        SubLObject term_variable_map = NIL;
        final SubLObject _prev_bind_0 = $something_asserted_within_hypothesize_termsP$.currentBinding(thread);
        try {
            $something_asserted_within_hypothesize_termsP$.bind(NIL, thread);
            try {
                thread.throwStack.push($CONFLICT);
                final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(CONFLICT_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$9 = $conflicts_from_invalid_deductions$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = wff_vars.$enforce_literal_wff_idiosyncrasiesP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $record_inconsistent_support_sets$.currentBinding(thread);
                        try {
                            $conflicts_from_invalid_deductions$.bind(T, thread);
                            Errors.$ignore_warnsP$.bind(T, thread);
                            wff_vars.$enforce_literal_wff_idiosyncrasiesP$.bind(NIL, thread);
                            $record_inconsistent_support_sets$.bind(T, thread);
                            final SubLObject _prev_bind_0_$10 = $ignore_non_definitional_conflictsP$.currentBinding(thread);
                            try {
                                $ignore_non_definitional_conflictsP$.bind(T, thread);
                                if (!canon_versions.eql($$True)) {
                                    final SubLObject canon_version = canon_versions.first();
                                    final SubLObject canon_var_map = second(canon_version);
                                    thread.resetMultipleValues();
                                    final SubLObject dnf = fi.fi_canonicalize(canon_version, UNPROVIDED, UNPROVIDED);
                                    final SubLObject v_variables = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    num_vars = length(v_variables);
                                    final SubLObject var_equality_constraints = hypothesize_dnf_equality_constraints(dnf, mt);
                                    final SubLObject var_isa_constraints = hypothesize_dnf_isa_constraints(dnf, mt);
                                    if (length(var_isa_constraints).numE(num_vars)) {
                                        final SubLObject var_quoted_isa_constraints = hypothesize_dnf_quoted_isa_constraints(dnf, mt);
                                        if (length(var_quoted_isa_constraints).numE(num_vars)) {
                                            final SubLObject var_genl_constraints = hypothesize_dnf_genl_constraints(dnf, mt);
                                            if (length(var_genl_constraints).numE(num_vars)) {
                                                thread.resetMultipleValues();
                                                final SubLObject terms_$11 = hypothesize_terms_for_variables(var_equality_constraints, var_isa_constraints, var_quoted_isa_constraints, var_genl_constraints, mt, canon_var_map, terms, name_prefix, term_ids, term_bindings);
                                                final SubLObject term_variable_map_$12 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                terms = terms_$11;
                                                term_variable_map = term_variable_map_$12;
                                                if (NIL != assert_sentenceP) {
                                                    assert_hypothetical_term_content_gafs(dnf, mt, term_variable_map);
                                                    SubLObject i;
                                                    SubLObject var;
                                                    SubLObject v_term;
                                                    for (i = NIL, i = ZERO_INTEGER; i.numL(num_vars); i = add(i, ONE_INTEGER)) {
                                                        var = nth(i, v_variables);
                                                        v_term = assoc(variables.find_variable_by_id(i), term_variable_map, UNPROVIDED, UNPROVIDED).rest();
                                                        if (NIL != subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)) {
                                                            result_bindings = cons(cons(var, v_term), result_bindings);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $ignore_non_definitional_conflictsP$.rebind(_prev_bind_0_$10, thread);
                            }
                            assert_hypothetical_term_rules(rules, mt, term_variable_map, result_bindings);
                            result_bindings = nreverse(result_bindings);
                            successP = T;
                            something_assertedP = $something_asserted_within_hypothesize_termsP$.getDynamicValue(thread);
                        } finally {
                            $record_inconsistent_support_sets$.rebind(_prev_bind_4, thread);
                            wff_vars.$enforce_literal_wff_idiosyncrasiesP$.rebind(_prev_bind_3, thread);
                            Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
                            $conflicts_from_invalid_deductions$.rebind(_prev_bind_0_$9, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                result_bindings = Errors.handleThrowable(ccatch_env_var, $CONFLICT);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $something_asserted_within_hypothesize_termsP$.rebind(_prev_bind_0, thread);
        }
        return values(result_bindings, terms, successP, something_assertedP);
    }

    /**
     * hypothesize a term for each variable, and assert the assertions to satisfy VAR-ISA-CONSTRAINTS and VAR-GENL-CONSTRAINTS
     */
    @LispMethod(comment = "hypothesize a term for each variable, and assert the assertions to satisfy VAR-ISA-CONSTRAINTS and VAR-GENL-CONSTRAINTS")
    public static final SubLObject hypothesize_terms_for_variables_alt(SubLObject var_equal_symbols_constraints, SubLObject var_isa_constraints, SubLObject var_quoted_isa_constraints, SubLObject var_genl_constraints, SubLObject mt, SubLObject canon_var_map, SubLObject terms, SubLObject name_prefix, SubLObject term_ids, SubLObject term_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_variable_map = NIL;
                SubLObject var_isa_constraint = NIL;
                SubLObject var_isa_constraint_12 = NIL;
                SubLObject var_quoted_isa_constraint = NIL;
                SubLObject var_quoted_isa_constraint_13 = NIL;
                SubLObject var_genl_constraint = NIL;
                SubLObject var_genl_constraint_14 = NIL;
                for (var_isa_constraint = var_isa_constraints, var_isa_constraint_12 = var_isa_constraint.first(), var_quoted_isa_constraint = var_quoted_isa_constraints, var_quoted_isa_constraint_13 = var_quoted_isa_constraint.first(), var_genl_constraint = var_genl_constraints, var_genl_constraint_14 = var_genl_constraint.first(); !(((NIL == var_genl_constraint) && (NIL == var_quoted_isa_constraint)) && (NIL == var_isa_constraint)); var_isa_constraint = var_isa_constraint.rest() , var_isa_constraint_12 = var_isa_constraint.first() , var_quoted_isa_constraint = var_quoted_isa_constraint.rest() , var_quoted_isa_constraint_13 = var_quoted_isa_constraint.first() , var_genl_constraint = var_genl_constraint.rest() , var_genl_constraint_14 = var_genl_constraint.first()) {
                    {
                        SubLObject datum = var_isa_constraint_12;
                        SubLObject current = datum;
                        SubLObject variable = NIL;
                        SubLObject new_term_name = NIL;
                        SubLObject isa_constraints = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt16);
                        variable = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt16);
                        new_term_name = current.first();
                        current = current.rest();
                        isa_constraints = current;
                        {
                            SubLObject equal_symbol = list_utilities.alist_lookup(var_equal_symbols_constraints, variable, UNPROVIDED, UNPROVIDED);
                            if (NIL != equal_symbol) {
                                {
                                    SubLObject new_binding = bindings.make_variable_binding(variable, equal_symbol);
                                    term_variable_map = cons(new_binding, term_variable_map);
                                }
                            } else {
                                {
                                    SubLObject quoted_col_isa_constraints = list_utilities.remove_if_not($sym17$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL == disjoint_with.any_disjoint_withP(quoted_col_isa_constraints, $$CycLConstant, UNPROVIDED, UNPROVIDED)) {
                                        {
                                            SubLObject datum_15 = var_genl_constraint_14;
                                            SubLObject current_16 = datum_15;
                                            SubLObject variable2 = NIL;
                                            SubLObject genl_constraints = NIL;
                                            destructuring_bind_must_consp(current_16, datum_15, $list_alt19);
                                            variable2 = current_16.first();
                                            current_16 = current_16.rest();
                                            genl_constraints = current_16;
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (variable != variable2) {
                                                    Errors.error($str_alt20$Constraint_variable_mismatch_erro, variable, variable2);
                                                }
                                            }
                                            {
                                                SubLObject datum_17 = var_quoted_isa_constraint_13;
                                                SubLObject current_18 = datum_17;
                                                SubLObject variable3 = NIL;
                                                SubLObject quoted_isa_constraints = NIL;
                                                destructuring_bind_must_consp(current_18, datum_17, $list_alt21);
                                                variable3 = current_18.first();
                                                current_18 = current_18.rest();
                                                quoted_isa_constraints = current_18;
                                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                    if (variable != variable3) {
                                                        Errors.error($str_alt20$Constraint_variable_mismatch_erro, variable, variable3);
                                                    }
                                                }
                                                {
                                                    SubLObject current_el_variable = rassoc(variable, canon_var_map, UNPROVIDED, UNPROVIDED).first();
                                                    SubLObject new_term_id = assoc(current_el_variable, term_ids, UNPROVIDED, UNPROVIDED).rest();
                                                    SubLObject new_term = (NIL != term_bindings) ? ((SubLObject) (list_utilities.alist_lookup(term_bindings, current_el_variable, UNPROVIDED, UNPROVIDED))) : com.cyc.cycjava.cycl.inference.harness.prove.create_hypothesized_constant(name_prefix, new_term_name, new_term_id);
                                                    SubLObject newP = makeBoolean(NIL == term_bindings);
                                                    SubLObject new_binding = bindings.make_variable_binding(variable, new_term);
                                                    if (NIL != new_term) {
                                                        term_variable_map = cons(new_binding, term_variable_map);
                                                        terms = cons(new_term, terms);
                                                        {
                                                            SubLObject non_anect_isa_constraints = remove_if($sym22$ANECT_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            if (NIL != non_anect_isa_constraints) {
                                                                {
                                                                    SubLObject min_anects = at_utilities.union_min_anects(non_anect_isa_constraints, mt);
                                                                    isa_constraints = append(min_anects, isa_constraints);
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject non_anect_quoted_isa_constraints = remove_if($sym22$ANECT_, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            if (NIL != non_anect_quoted_isa_constraints) {
                                                                {
                                                                    SubLObject min_anects = at_utilities.union_min_anects(non_anect_quoted_isa_constraints, mt);
                                                                    quoted_isa_constraints = append(min_anects, quoted_isa_constraints);
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject non_anect_genl_constraints = remove_if($sym22$ANECT_, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            if (NIL != non_anect_genl_constraints) {
                                                                {
                                                                    SubLObject min_anects = at_utilities.union_min_anects(non_anect_genl_constraints, mt);
                                                                    genl_constraints = append(min_anects, genl_constraints);
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject isas_okP = com.cyc.cycjava.cycl.inference.harness.prove.assert_hypothetical_term_isa_constraints(new_term, new_binding, isa_constraints, mt);
                                                            if (NIL != newP) {
                                                                com.cyc.cycjava.cycl.inference.harness.prove.assert_that_term_is_hypothetical(new_term, mt);
                                                            }
                                                            if (NIL == isas_okP) {
                                                                conflicts.conflict_abort();
                                                            }
                                                        }
                                                        com.cyc.cycjava.cycl.inference.harness.prove.assert_hypothetical_term_quoted_isa_constraints(new_term, new_binding, quoted_isa_constraints, mt);
                                                        com.cyc.cycjava.cycl.inference.harness.prove.assert_hypothetical_term_genl_constraints(new_term, new_binding, genl_constraints, mt);
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
                terms = nreverse(terms);
                return values(terms, term_variable_map);
            }
        }
    }

    /**
     * hypothesize a term for each variable, and assert the assertions to satisfy VAR-ISA-CONSTRAINTS and VAR-GENL-CONSTRAINTS
     */
    @LispMethod(comment = "hypothesize a term for each variable, and assert the assertions to satisfy VAR-ISA-CONSTRAINTS and VAR-GENL-CONSTRAINTS")
    public static SubLObject hypothesize_terms_for_variables(final SubLObject var_equality_constraints, final SubLObject var_isa_constraints, final SubLObject var_quoted_isa_constraints, final SubLObject var_genl_constraints, final SubLObject mt, final SubLObject canon_var_map, SubLObject terms, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_variable_map = NIL;
        SubLObject var_isa_constraint = NIL;
        SubLObject var_isa_constraint_$13 = NIL;
        SubLObject var_quoted_isa_constraint = NIL;
        SubLObject var_quoted_isa_constraint_$14 = NIL;
        SubLObject var_genl_constraint = NIL;
        SubLObject var_genl_constraint_$15 = NIL;
        var_isa_constraint = var_isa_constraints;
        var_isa_constraint_$13 = var_isa_constraint.first();
        var_quoted_isa_constraint = var_quoted_isa_constraints;
        var_quoted_isa_constraint_$14 = var_quoted_isa_constraint.first();
        var_genl_constraint = var_genl_constraints;
        var_genl_constraint_$15 = var_genl_constraint.first();
        while (((NIL != var_genl_constraint) || (NIL != var_quoted_isa_constraint)) || (NIL != var_isa_constraint)) {
            SubLObject current;
            final SubLObject datum = current = var_isa_constraint_$13;
            SubLObject variable = NIL;
            SubLObject new_term_name = NIL;
            SubLObject isa_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            new_term_name = current.first();
            current = isa_constraints = current.rest();
            final SubLObject equal_symbol = list_utilities.alist_lookup(var_equality_constraints, variable, UNPROVIDED, UNPROVIDED);
            if (NIL != equal_symbol) {
                final SubLObject new_binding = bindings.make_variable_binding(variable, equal_symbol);
                term_variable_map = cons(new_binding, term_variable_map);
            } else {
                final SubLObject quoted_col_isa_constraints = list_utilities.remove_if_not($sym17$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == disjoint_with.any_disjoint_withP(quoted_col_isa_constraints, $$CycLConstant, UNPROVIDED, UNPROVIDED)) {
                    SubLObject current_$17;
                    final SubLObject datum_$16 = current_$17 = var_genl_constraint_$15;
                    SubLObject variable2 = NIL;
                    SubLObject genl_constraints = NIL;
                    destructuring_bind_must_consp(current_$17, datum_$16, $list19);
                    variable2 = current_$17.first();
                    current_$17 = genl_constraints = current_$17.rest();
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!variable.eql(variable2))) {
                        Errors.error($str20$Constraint_variable_mismatch_erro, variable, variable2);
                    }
                    SubLObject current_$18;
                    final SubLObject datum_$17 = current_$18 = var_quoted_isa_constraint_$14;
                    SubLObject variable3 = NIL;
                    SubLObject quoted_isa_constraints = NIL;
                    destructuring_bind_must_consp(current_$18, datum_$17, $list21);
                    variable3 = current_$18.first();
                    current_$18 = quoted_isa_constraints = current_$18.rest();
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!variable.eql(variable3))) {
                        Errors.error($str20$Constraint_variable_mismatch_erro, variable, variable3);
                    }
                    final SubLObject current_el_variable = rassoc(variable, canon_var_map, UNPROVIDED, UNPROVIDED).first();
                    final SubLObject new_term_id = assoc(current_el_variable, term_ids, UNPROVIDED, UNPROVIDED).rest();
                    final SubLObject new_term = (NIL != term_bindings) ? list_utilities.alist_lookup(term_bindings, current_el_variable, UNPROVIDED, UNPROVIDED) : create_hypothesized_constant(name_prefix, new_term_name, new_term_id);
                    final SubLObject newP = makeBoolean(NIL == term_bindings);
                    final SubLObject new_binding2 = bindings.make_variable_binding(variable, new_term);
                    if (NIL != new_term) {
                        term_variable_map = cons(new_binding2, term_variable_map);
                        terms = cons(new_term, terms);
                        final SubLObject non_anect_isa_constraints = remove_if($sym22$ANECT_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != non_anect_isa_constraints) {
                            final SubLObject min_anects = at_utilities.union_min_anects(non_anect_isa_constraints, mt);
                            isa_constraints = append(min_anects, isa_constraints);
                        }
                        final SubLObject non_anect_quoted_isa_constraints = remove_if($sym22$ANECT_, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != non_anect_quoted_isa_constraints) {
                            final SubLObject min_anects = at_utilities.union_min_anects(non_anect_quoted_isa_constraints, mt);
                            quoted_isa_constraints = append(min_anects, quoted_isa_constraints);
                        }
                        final SubLObject non_anect_genl_constraints = remove_if($sym22$ANECT_, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != non_anect_genl_constraints) {
                            final SubLObject min_anects = at_utilities.union_min_anects(non_anect_genl_constraints, mt);
                            genl_constraints = append(min_anects, genl_constraints);
                        }
                        final SubLObject isas_okP = assert_hypothetical_term_isa_constraints(new_term, new_binding2, isa_constraints, mt);
                        if (NIL != newP) {
                            assert_that_term_is_hypothetical(new_term, mt);
                        }
                        if (NIL == isas_okP) {
                            conflicts.conflict_abort();
                        }
                        assert_hypothetical_term_quoted_isa_constraints(new_term, new_binding2, quoted_isa_constraints, mt);
                        assert_hypothetical_term_genl_constraints(new_term, new_binding2, genl_constraints, mt);
                    }
                }
            }
            var_isa_constraint = var_isa_constraint.rest();
            var_isa_constraint_$13 = var_isa_constraint.first();
            var_quoted_isa_constraint = var_quoted_isa_constraint.rest();
            var_quoted_isa_constraint_$14 = var_quoted_isa_constraint.first();
            var_genl_constraint = var_genl_constraint.rest();
            var_genl_constraint_$15 = var_genl_constraint.first();
        } 
        terms = nreverse(terms);
        return values(terms, term_variable_map);
    }

    public static final SubLObject assert_within_hypothetical_alt(SubLObject sentence, SubLObject mt, SubLObject variable_map, SubLObject abort_on_failureP) {
        if (abort_on_failureP == UNPROVIDED) {
            abort_on_failureP = T;
        }
        fi.fi_assert_int(sentence, mt, UNPROVIDED, UNPROVIDED);
        if (NIL != fi.fi_error_signaledP()) {
            com.cyc.cycjava.cycl.inference.harness.prove.note_non_wff_conflict(sentence, mt, variable_map);
            if (NIL != abort_on_failureP) {
                conflicts.conflict_abort();
            }
            return NIL;
        }
        $something_asserted_within_hypothesize_termsP$.setDynamicValue(T);
        return T;
    }

    public static SubLObject assert_within_hypothetical(final SubLObject sentence, final SubLObject mt, final SubLObject variable_map, SubLObject abort_on_failureP) {
        if (abort_on_failureP == UNPROVIDED) {
            abort_on_failureP = T;
        }
        fi.fi_assert_int(sentence, mt, UNPROVIDED, UNPROVIDED);
        if (NIL == fi.fi_error_signaledP()) {
            $something_asserted_within_hypothesize_termsP$.setDynamicValue(T);
            return T;
        }
        note_non_wff_conflict(sentence, mt, variable_map);
        if (NIL != el_formula_with_operator_p(sentence, $$equalSymbols)) {
            return NIL;
        }
        if (NIL != abort_on_failureP) {
            conflicts.conflict_abort();
        }
        return NIL;
    }

    public static final SubLObject assert_hypothetical_term_isa_constraints_alt(SubLObject new_term, SubLObject new_binding, SubLObject isa_constraints, SubLObject mt) {
        {
            SubLObject cdolist_list_var = isa_constraints;
            SubLObject isa_constraint = NIL;
            for (isa_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_constraint = cdolist_list_var.first()) {
                if (NIL == isa.isaP(new_term, isa_constraint, mt, UNPROVIDED)) {
                    {
                        SubLObject isa_constraint_sentence = list($$isa, new_term, isa_constraint);
                        if (NIL != kb_accessors.anectP(isa_constraint)) {
                            mt = $$UniversalVocabularyMt;
                        }
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.assert_within_hypothetical(isa_constraint_sentence, mt, list(new_binding), NIL)) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject assert_hypothetical_term_isa_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject isa_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = NIL;
        isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject assert_mt = mt;
            if (NIL == isa.isaP(new_term, isa_constraint, mt, UNPROVIDED)) {
                final SubLObject isa_constraint_sentence = list($$isa, new_term, isa_constraint);
                if (NIL != kb_accessors.anectP(isa_constraint)) {
                    assert_mt = $$UniversalVocabularyMt;
                }
                if (NIL == assert_within_hypothetical(isa_constraint_sentence, assert_mt, list(new_binding), NIL)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject assert_hypothetical_term_quoted_isa_constraints_alt(SubLObject new_term, SubLObject new_binding, SubLObject quoted_isa_constraints, SubLObject mt) {
        {
            SubLObject cdolist_list_var = quoted_isa_constraints;
            SubLObject quoted_isa_constraint = NIL;
            for (quoted_isa_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quoted_isa_constraint = cdolist_list_var.first()) {
                if (NIL == at_defns.quoted_has_typeP(new_term, quoted_isa_constraint, mt)) {
                    {
                        SubLObject quoted_isa_constraint_sentence = list($$quotedIsa, new_term, quoted_isa_constraint);
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.assert_within_hypothetical(quoted_isa_constraint_sentence, mt, list(new_binding), UNPROVIDED)) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject assert_hypothetical_term_quoted_isa_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject quoted_isa_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = quoted_isa_constraints;
        SubLObject quoted_isa_constraint = NIL;
        quoted_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == at_defns.quoted_has_typeP(new_term, quoted_isa_constraint, mt)) {
                final SubLObject quoted_isa_constraint_sentence = list($$quotedIsa, new_term, quoted_isa_constraint);
                if (NIL == assert_within_hypothetical(quoted_isa_constraint_sentence, mt, list(new_binding), UNPROVIDED)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_isa_constraint = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject assert_hypothetical_term_genl_constraints_alt(SubLObject new_term, SubLObject new_binding, SubLObject genl_constraints, SubLObject mt) {
        {
            SubLObject cdolist_list_var = genl_constraints;
            SubLObject genl_constraint = NIL;
            for (genl_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_constraint = cdolist_list_var.first()) {
                if (NIL == genls.genlsP(new_term, genl_constraint, mt, UNPROVIDED)) {
                    {
                        SubLObject genl_constraint_sentence = list($$genls, new_term, genl_constraint);
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.assert_within_hypothetical(genl_constraint_sentence, mt, list(new_binding), UNPROVIDED)) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject assert_hypothetical_term_genl_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject genl_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = genl_constraints;
        SubLObject genl_constraint = NIL;
        genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == genls.genlsP(new_term, genl_constraint, mt, UNPROVIDED)) {
                final SubLObject genl_constraint_sentence = list($$genls, new_term, genl_constraint);
                if (NIL == assert_within_hypothetical(genl_constraint_sentence, mt, list(new_binding), UNPROVIDED)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject assert_hypothetical_term_content_gafs_alt(SubLObject dnf, SubLObject mt, SubLObject term_variable_map) {
        dnf = nsublis(term_variable_map, dnf, UNPROVIDED, UNPROVIDED);
        {
            SubLObject cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.pos_lits(dnf));
            SubLObject new_sentence = NIL;
            for (new_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_sentence = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.assert_within_hypothetical(new_sentence, mt, term_variable_map, UNPROVIDED)) {
                    return NIL;
                }
            }
        }
        {
            SubLObject cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.neg_lits(dnf));
            SubLObject neg_lit = NIL;
            for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                {
                    SubLObject new_sentence = cycl_utilities.negate(neg_lit);
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.assert_within_hypothetical(new_sentence, mt, term_variable_map, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject assert_hypothetical_term_content_gafs(SubLObject dnf, final SubLObject mt, final SubLObject term_variable_map) {
        dnf = nsublis(term_variable_map, dnf, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.pos_lits(dnf));
        SubLObject new_sentence = NIL;
        new_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == assert_within_hypothetical(new_sentence, mt, term_variable_map, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_sentence = cdolist_list_var.first();
        } 
        cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.neg_lits(dnf));
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_sentence2 = cycl_utilities.negate(neg_lit);
            if (NIL == assert_within_hypothetical(new_sentence2, mt, term_variable_map, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject assert_hypothetical_term_rules_alt(SubLObject rules, SubLObject mt, SubLObject term_variable_map, SubLObject v_bindings) {
        {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                {
                    SubLObject new_rule = rule;
                    if (NIL != v_bindings) {
                        new_rule = sublis(v_bindings, rule, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.assert_within_hypothetical(new_rule, mt, term_variable_map, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject assert_hypothetical_term_rules(final SubLObject rules, final SubLObject mt, final SubLObject term_variable_map, final SubLObject v_bindings) {
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_rule = rule;
            if (NIL != v_bindings) {
                new_rule = sublis(v_bindings, rule, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == assert_within_hypothetical(new_rule, mt, term_variable_map, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * Create a constant with a unique name generated from NAME-PREFIX and START-NAME.
     * EXTERNAL-ID, if provided, is the id to use.
     */
    @LispMethod(comment = "Create a constant with a unique name generated from NAME-PREFIX and START-NAME.\r\nEXTERNAL-ID, if provided, is the id to use.\nCreate a constant with a unique name generated from NAME-PREFIX and START-NAME.\nEXTERNAL-ID, if provided, is the id to use.")
    public static final SubLObject create_hypothesized_constant_alt(SubLObject name_prefix, SubLObject start_name, SubLObject external_id) {
        SubLTrampolineFile.checkType(name_prefix, STRINGP);
        SubLTrampolineFile.checkType(start_name, STRINGP);
        {
            SubLObject initial_name = constant_completion_high.uniquify_constant_name(start_name);
            SubLObject v_term = fi.fi_create_int(initial_name, external_id);
            if (NIL != constant_p(v_term)) {
                {
                    SubLObject term_id = constants_high.constant_internal_id(v_term);
                    SubLObject final_name = format(NIL, $str_alt28$_A__A__A, new SubLObject[]{ name_prefix, start_name, term_id });
                    final_name = constant_completion_high.uniquify_constant_name(final_name);
                    fi.fi_rename_int(v_term, final_name);
                    return v_term;
                }
            }
        }
        return NIL;
    }

    /**
     * Create a constant with a unique name generated from NAME-PREFIX and START-NAME.
     * EXTERNAL-ID, if provided, is the id to use.
     */
    @LispMethod(comment = "Create a constant with a unique name generated from NAME-PREFIX and START-NAME.\r\nEXTERNAL-ID, if provided, is the id to use.\nCreate a constant with a unique name generated from NAME-PREFIX and START-NAME.\nEXTERNAL-ID, if provided, is the id to use.")
    public static SubLObject create_hypothesized_constant(final SubLObject name_prefix, final SubLObject start_name, final SubLObject external_id) {
        assert NIL != stringp(name_prefix) : "! stringp(name_prefix) " + ("Types.stringp(name_prefix) " + "CommonSymbols.NIL != Types.stringp(name_prefix) ") + name_prefix;
        assert NIL != stringp(start_name) : "! stringp(start_name) " + ("Types.stringp(start_name) " + "CommonSymbols.NIL != Types.stringp(start_name) ") + start_name;
        final SubLObject initial_name = constant_completion_high.uniquify_constant_name(start_name, UNPROVIDED);
        final SubLObject v_term = fi.fi_create_int(initial_name, external_id);
        if (NIL != constant_p(v_term)) {
            final SubLObject term_id = constants_high.constant_internal_id(v_term);
            SubLObject final_name = format(NIL, $str29$_A__A__A, new SubLObject[]{ name_prefix, start_name, term_id });
            final_name = constant_completion_high.uniquify_constant_name(final_name, UNPROVIDED);
            fi.fi_rename_int(v_term, final_name);
            return v_term;
        }
        return NIL;
    }

    /**
     * Assert that the constant is a hypothetical term defined in MT.
     * To be called on a constant created via @xref create-hypothesized-constant.
     */
    @LispMethod(comment = "Assert that the constant is a hypothetical term defined in MT.\r\nTo be called on a constant created via @xref create-hypothesized-constant.\nAssert that the constant is a hypothetical term defined in MT.\nTo be called on a constant created via @xref create-hypothesized-constant.")
    public static final SubLObject assert_that_term_is_hypothetical_alt(SubLObject v_term, SubLObject mt) {
        cyc_kernel.cyc_assert_wff(list($$hypotheticalTerm, v_term), mt, $list_alt30);
        cyc_kernel.cyc_assert_wff(list($$definingMt, v_term, mt), mt_vars.$defining_mt_mt$.getGlobalValue(), $list_alt30);
        return v_term;
    }

    /**
     * Assert that the constant is a hypothetical term defined in MT.
     * To be called on a constant created via @xref create-hypothesized-constant.
     */
    @LispMethod(comment = "Assert that the constant is a hypothetical term defined in MT.\r\nTo be called on a constant created via @xref create-hypothesized-constant.\nAssert that the constant is a hypothetical term defined in MT.\nTo be called on a constant created via @xref create-hypothesized-constant.")
    public static SubLObject assert_that_term_is_hypothetical(final SubLObject v_term, final SubLObject mt) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        cyc_kernel.cyc_assert_wff(list($$definingMt, v_term, monad_mt), mt_vars.$defining_mt_mt$.getGlobalValue(), $list31);
        cyc_kernel.cyc_assert_wff(list($$hypotheticalTerm, v_term), mt, $list31);
        return v_term;
    }

    public static SubLObject hypothesize_dnf_equality_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject equality_alist = NIL;
        final SubLObject equality_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject conflict_vars = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(dnf);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var = simplifier.fold_equals_in_asent(asent, equality_dict, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    conflict_vars = cons(item, conflict_vars);
                }
            } else {
                SubLObject cdolist_list_var_$20 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$20.first();
                while (NIL != cdolist_list_var_$20) {
                    conflict_vars = cons(item2, conflict_vars);
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    item2 = cdolist_list_var_$20.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equality_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject open_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject closed_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == subl_promotions.memberP(open_term, conflict_vars, UNPROVIDED, UNPROVIDED)) {
                equality_alist = cons(cons(open_term, closed_term), equality_alist);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return equality_alist;
    }

    /**
     * Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)
     * where <collections> is a list of collections of which a hypothetical term to replace
     * <variable> must be an instance.
     */
    @LispMethod(comment = "Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)\r\nwhere <collections> is a list of collections of which a hypothetical term to replace\r\n<variable> must be an instance.\nReturns a list of lists, each of the form (<variable> <suggested name> . <collections>)\nwhere <collections> is a list of collections of which a hypothetical term to replace\n<variable> must be an instance.")
    public static final SubLObject hypothesize_dnf_isa_constraints_alt(SubLObject dnf, SubLObject mt) {
        {
            SubLObject variable_isa_constraints = at_var_types.dnf_variables_isa_constraints(dnf, mt, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = variable_isa_constraints;
            SubLObject variable_isa_constraint = NIL;
            for (variable_isa_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_isa_constraint = cdolist_list_var.first()) {
                {
                    SubLObject datum = variable_isa_constraint;
                    SubLObject current = datum;
                    SubLObject variable = NIL;
                    SubLObject isa_constraints = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    variable = current.first();
                    current = current.rest();
                    isa_constraints = current;
                    isa_constraints = delete($$CycLReifiableDenotationalTerm, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject most_specific = list_utilities.extremal(isa_constraints, symbol_function($sym36$_), symbol_function(SPEC_CARDINALITY));
                        SubLObject suggested_name = $$$Term;
                        if (NIL != forts.fort_p(most_specific)) {
                            suggested_name = com.cyc.cycjava.cycl.inference.harness.prove.suggest_string_from_fort_el_formula(most_specific);
                        }
                        ans = cons(listS(variable, suggested_name, append(isa_constraints, NIL)), ans);
                    }
                }
            }
            return nreverse(ans);
        }
    }

    /**
     * Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)
     * where <collections> is a list of collections of which a hypothetical term to replace
     * <variable> must be an instance.
     */
    @LispMethod(comment = "Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)\r\nwhere <collections> is a list of collections of which a hypothetical term to replace\r\n<variable> must be an instance.\nReturns a list of lists, each of the form (<variable> <suggested name> . <collections>)\nwhere <collections> is a list of collections of which a hypothetical term to replace\n<variable> must be an instance.")
    public static SubLObject hypothesize_dnf_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLObject variable_isa_constraints = antecedent_dnf_variables_isa_constraints(dnf, mt);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = variable_isa_constraints;
        SubLObject variable_isa_constraint = NIL;
        variable_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_isa_constraint;
            SubLObject variable = NIL;
            SubLObject isa_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            variable = current.first();
            current = isa_constraints = current.rest();
            isa_constraints = delete($$CycLReifiableDenotationalTerm, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject most_specific = list_utilities.extremal(isa_constraints, symbol_function($sym35$_), symbol_function(SPEC_CARDINALITY));
            SubLObject suggested_name = $$$Term;
            if (NIL != forts.fort_p(most_specific)) {
                suggested_name = suggest_string_from_fort_el_formula(most_specific);
            }
            ans = cons(listS(variable, suggested_name, append(isa_constraints, NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_isa_constraint = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    /**
     * Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)
     * where <collections> is a list of collections of which a hypothetical term to replace
     * <variable> must be an instance.
     */
    @LispMethod(comment = "Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)\r\nwhere <collections> is a list of collections of which a hypothetical term to replace\r\n<variable> must be an instance.\nReturns a list of lists, each of the form (<variable> <suggested name> . <collections>)\nwhere <collections> is a list of collections of which a hypothetical term to replace\n<variable> must be an instance.")
    public static final SubLObject hypothesize_dnf_quoted_isa_constraints_alt(SubLObject dnf, SubLObject mt) {
        {
            SubLObject variable_quoted_isa_constraints = at_var_types.dnf_variables_quoted_isa_constraints(dnf, mt, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = variable_quoted_isa_constraints;
            SubLObject variable_quoted_isa_constraint = NIL;
            for (variable_quoted_isa_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_quoted_isa_constraint = cdolist_list_var.first()) {
                {
                    SubLObject datum = variable_quoted_isa_constraint;
                    SubLObject current = datum;
                    SubLObject variable = NIL;
                    SubLObject quoted_isa_constraints = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    variable = current.first();
                    current = current.rest();
                    quoted_isa_constraints = current;
                    quoted_isa_constraints = delete($$CycLReifiableDenotationalTerm, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    ans = cons(bq_cons(variable, append(quoted_isa_constraints, NIL)), ans);
                }
            }
            return nreverse(ans);
        }
    }

    /**
     * Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)
     * where <collections> is a list of collections of which a hypothetical term to replace
     * <variable> must be an instance.
     */
    @LispMethod(comment = "Returns a list of lists, each of the form (<variable> <suggested name> . <collections>)\r\nwhere <collections> is a list of collections of which a hypothetical term to replace\r\n<variable> must be an instance.\nReturns a list of lists, each of the form (<variable> <suggested name> . <collections>)\nwhere <collections> is a list of collections of which a hypothetical term to replace\n<variable> must be an instance.")
    public static SubLObject hypothesize_dnf_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLObject variable_quoted_isa_constraints = antecedent_dnf_variables_quoted_isa_constraints(dnf, mt);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = variable_quoted_isa_constraints;
        SubLObject variable_quoted_isa_constraint = NIL;
        variable_quoted_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_quoted_isa_constraint;
            SubLObject variable = NIL;
            SubLObject quoted_isa_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            variable = current.first();
            current = quoted_isa_constraints = current.rest();
            quoted_isa_constraints = delete($$CycLReifiableDenotationalTerm, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = cons(bq_cons(variable, append(quoted_isa_constraints, NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_quoted_isa_constraint = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    /**
     * Returns a list of lists, each of the form (<variable> . <collections>)
     * where <collections> is a list of collections of which a hypothetical term to replace
     * <variable> must be a spec.  Assumed to be parallel to the result of
     *
     * @unknown hypothesize-dnf-isa-constraints.
     */
    @LispMethod(comment = "Returns a list of lists, each of the form (<variable> . <collections>)\r\nwhere <collections> is a list of collections of which a hypothetical term to replace\r\n<variable> must be a spec.  Assumed to be parallel to the result of\r\n\r\n@unknown hypothesize-dnf-isa-constraints.\nReturns a list of lists, each of the form (<variable> . <collections>)\nwhere <collections> is a list of collections of which a hypothetical term to replace\n<variable> must be a spec.  Assumed to be parallel to the result of")
    public static final SubLObject hypothesize_dnf_genl_constraints_alt(SubLObject dnf, SubLObject mt) {
        {
            SubLObject variable_genl_constraints = at_var_types.dnf_variables_genl_constraints(dnf, mt, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = variable_genl_constraints;
            SubLObject variable_genl_constraint = NIL;
            for (variable_genl_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_genl_constraint = cdolist_list_var.first()) {
                {
                    SubLObject datum = variable_genl_constraint;
                    SubLObject current = datum;
                    SubLObject variable = NIL;
                    SubLObject genl_constraints = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    variable = current.first();
                    current = current.rest();
                    genl_constraints = current;
                    genl_constraints = delete($$CycLReifiableDenotationalTerm, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    ans = cons(bq_cons(variable, append(genl_constraints, NIL)), ans);
                }
            }
            return nreverse(ans);
        }
    }

    /**
     * Returns a list of lists, each of the form (<variable> . <collections>)
     * where <collections> is a list of collections of which a hypothetical term to replace
     * <variable> must be a spec.  Assumed to be parallel to the result of
     *
     * @unknown hypothesize-dnf-isa-constraints.
     */
    @LispMethod(comment = "Returns a list of lists, each of the form (<variable> . <collections>)\r\nwhere <collections> is a list of collections of which a hypothetical term to replace\r\n<variable> must be a spec.  Assumed to be parallel to the result of\r\n\r\n@unknown hypothesize-dnf-isa-constraints.\nReturns a list of lists, each of the form (<variable> . <collections>)\nwhere <collections> is a list of collections of which a hypothetical term to replace\n<variable> must be a spec.  Assumed to be parallel to the result of")
    public static SubLObject hypothesize_dnf_genl_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLObject variable_genl_constraints = antecedent_dnf_variables_genl_constraints(dnf, mt);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = variable_genl_constraints;
        SubLObject variable_genl_constraint = NIL;
        variable_genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_genl_constraint;
            SubLObject variable = NIL;
            SubLObject genl_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            variable = current.first();
            current = genl_constraints = current.rest();
            genl_constraints = delete($$CycLReifiableDenotationalTerm, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = cons(bq_cons(variable, append(genl_constraints, NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_genl_constraint = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject antecedent_dnf_variables_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            result = at_var_types.dnf_variables_isa_constraints(dnf, mt, UNPROVIDED);
        } finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject antecedent_dnf_variables_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            result = at_var_types.dnf_variables_quoted_isa_constraints(dnf, mt, UNPROVIDED);
        } finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject antecedent_dnf_variables_genl_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            result = at_var_types.dnf_variables_genl_constraints(dnf, mt, UNPROVIDED);
        } finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Return a string based on the named forts in FORT's el-formula.
     */
    @LispMethod(comment = "Return a string based on the named forts in FORT\'s el-formula.")
    public static final SubLObject suggest_string_from_fort_el_formula_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL != nart_handles.nart_p(fort)) {
            return string_utilities.strcat(Mapping.mapcar(symbol_function(CONSTANT_NAME), list_utilities.delete_if_not(symbol_function(CONSTANT_P), list_utilities.flatten(forts.fort_el_formula(fort)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        } else {
            if (NIL != constant_p(fort)) {
                return constants_high.constant_name(fort);
            }
        }
        return NIL;
    }

    /**
     * Return a string based on the named forts in FORT's el-formula.
     */
    @LispMethod(comment = "Return a string based on the named forts in FORT\'s el-formula.")
    public static SubLObject suggest_string_from_fort_el_formula(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if (NIL != nart_handles.nart_p(fort)) {
            return string_utilities.strcat(Mapping.mapcar(symbol_function(CONSTANT_NAME), list_utilities.delete_if_not(symbol_function(CONSTANT_P), list_utilities.flatten(forts.fort_el_formula(fort)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return NIL;
    }

    /**
     * Attempts to prove SENTENCE is true in MT under the given resource constraints.
     * BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.
     * SENTENCE is interpreted as follows:
     * If SENTENCE is of the form (#$implies [antecedant] [consequent]) then
     * (1) free variables in [antecedant] are assumed to be universally quantified
     * (2) remaining variables in [consequent] are assumed to be existentially quantified.
     * Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.
     * It returns NIL or a list of arguments as described for FI-JUSTIFY.
     */
    @LispMethod(comment = "Attempts to prove SENTENCE is true in MT under the given resource constraints.\r\nBACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\r\nSENTENCE is interpreted as follows:\r\nIf SENTENCE is of the form (#$implies [antecedant] [consequent]) then\r\n(1) free variables in [antecedant] are assumed to be universally quantified\r\n(2) remaining variables in [consequent] are assumed to be existentially quantified.\r\nOtherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\r\nIt returns NIL or a list of arguments as described for FI-JUSTIFY.\nAttempts to prove SENTENCE is true in MT under the given resource constraints.\nBACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\nSENTENCE is interpreted as follows:\nIf SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n(1) free variables in [antecedant] are assumed to be universally quantified\n(2) remaining variables in [consequent] are assumed to be existentially quantified.\nOtherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\nIt returns NIL or a list of arguments as described for FI-JUSTIFY.")
    public static final SubLObject fi_prove_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return fi.fi($PROVE, sentence, mt, backchain, number, time, depth, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Attempts to prove SENTENCE is true in MT under the given resource constraints.
     * BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.
     * SENTENCE is interpreted as follows:
     * If SENTENCE is of the form (#$implies [antecedant] [consequent]) then
     * (1) free variables in [antecedant] are assumed to be universally quantified
     * (2) remaining variables in [consequent] are assumed to be existentially quantified.
     * Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.
     * It returns NIL or a list of arguments as described for FI-JUSTIFY.
     */
    @LispMethod(comment = "Attempts to prove SENTENCE is true in MT under the given resource constraints.\r\nBACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\r\nSENTENCE is interpreted as follows:\r\nIf SENTENCE is of the form (#$implies [antecedant] [consequent]) then\r\n(1) free variables in [antecedant] are assumed to be universally quantified\r\n(2) remaining variables in [consequent] are assumed to be existentially quantified.\r\nOtherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\r\nIt returns NIL or a list of arguments as described for FI-JUSTIFY.\nAttempts to prove SENTENCE is true in MT under the given resource constraints.\nBACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\nSENTENCE is interpreted as follows:\nIf SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n(1) free variables in [antecedant] are assumed to be universally quantified\n(2) remaining variables in [consequent] are assumed to be existentially quantified.\nOtherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\nIt returns NIL or a list of arguments as described for FI-JUSTIFY.")
    public static SubLObject fi_prove(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return fi.fi($PROVE, sentence, mt, backchain, number, time, depth, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fi_prove_int_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            fi.reset_fi_error_state();
            if (!sentence.isCons()) {
                fi.signal_fi_error(list($ARG_ERROR, $str_alt8$Expected_a_cons__got__S, sentence));
                return NIL;
            }
            if (NIL != fi.fi_ask_ist_query_p(sentence)) {
                {
                    SubLObject datum = sentence;
                    SubLObject current = datum;
                    SubLObject ist = NIL;
                    SubLObject ist_mt = NIL;
                    SubLObject ist_sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    ist = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    ist_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt49);
                    ist_sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return com.cyc.cycjava.cycl.inference.harness.prove.fi_prove_int(ist_sentence, ist_mt, backchain, number, time, depth);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt49);
                    }
                }
            } else {
                mt = fi.fi_convert_to_fort(mt);
                if (NIL != fi.fi_error_signaledP()) {
                    return NIL;
                }
                if (!(((NIL == backchain) || (backchain == T)) || backchain.isInteger())) {
                    fi.signal_fi_error(list($ARG_ERROR, $str_alt50$Expected_an_integer__got__S, backchain));
                    return NIL;
                }
                if (!((NIL == number) || number.isInteger())) {
                    fi.signal_fi_error(list($ARG_ERROR, $str_alt50$Expected_an_integer__got__S, number));
                    return NIL;
                }
                if (!((NIL == time) || time.isInteger())) {
                    fi.signal_fi_error(list($ARG_ERROR, $str_alt50$Expected_an_integer__got__S, time));
                    return NIL;
                }
                if (!((NIL == depth) || depth.isInteger())) {
                    fi.signal_fi_error(list($ARG_ERROR, $str_alt50$Expected_an_integer__got__S, depth));
                    return NIL;
                }
                if (NIL != $fi_prove_new_cyc_query_trampoline_enabledP$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_answer = com.cyc.cycjava.cycl.inference.harness.prove.fi_prove_int_new_cyc_query_trampoline(sentence, mt, backchain, number, time, depth);
                        SubLObject reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return values(v_answer, reason);
                    }
                }
                if (sentence.isCons() && (sentence.first() == $$implies)) {
                    return com.cyc.cycjava.cycl.inference.harness.prove.prove_from(second(sentence), third(sentence), mt, backchain, number, time, depth);
                } else {
                    return com.cyc.cycjava.cycl.inference.harness.prove.prove_from($$True, sentence, mt, backchain, number, time, depth);
                }
            }
            return NIL;
        }
    }

    public static SubLObject fi_prove_int(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (!sentence.isCons()) {
            fi.signal_fi_error(list($ARG_ERROR, $str8$Expected_a_cons__got__S, sentence));
            return NIL;
        }
        if (NIL != fi.fi_ask_ist_query_p(sentence)) {
            SubLObject ist = NIL;
            SubLObject ist_mt = NIL;
            SubLObject ist_sentence = NIL;
            destructuring_bind_must_consp(sentence, sentence, $list48);
            ist = sentence.first();
            SubLObject current = sentence.rest();
            destructuring_bind_must_consp(current, sentence, $list48);
            ist_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, sentence, $list48);
            ist_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return fi_prove_int(ist_sentence, ist_mt, backchain, number, time, depth);
            }
            cdestructuring_bind_error(sentence, $list48);
            return NIL;
        } else {
            mt = fi.fi_convert_to_fort(mt);
            if (NIL != fi.fi_error_signaledP()) {
                return NIL;
            }
            if (((NIL != backchain) && (backchain != T)) && (!backchain.isInteger())) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, backchain));
                return NIL;
            }
            if ((NIL != number) && (!number.isInteger())) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, number));
                return NIL;
            }
            if ((NIL != time) && (!time.isInteger())) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, time));
                return NIL;
            }
            if ((NIL != depth) && (!depth.isInteger())) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, depth));
                return NIL;
            }
            if (NIL != $fi_prove_new_cyc_query_trampoline_enabledP$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                final SubLObject v_answer = fi_prove_int_new_cyc_query_trampoline(sentence, mt, backchain, number, time, depth);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(v_answer, reason);
            }
            if (sentence.isCons() && sentence.first().eql($$implies)) {
                return prove_from(second(sentence), third(sentence), mt, backchain, number, time, depth);
            }
            return prove_from($$True, sentence, mt, backchain, number, time, depth);
        }
    }

    public static final SubLObject fi_prove_int_new_cyc_query_trampoline_alt(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
            query_properties = copy_list(query_properties);
            if (NIL != el_implication_p(sentence)) {
                query_properties = putf(query_properties, $kw52$CONDITIONAL_SENTENCE_, T);
            }
            return inference_kernel.new_cyc_query(sentence, mt, query_properties);
        }
    }

    public static SubLObject fi_prove_int_new_cyc_query_trampoline(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        query_properties = copy_list(query_properties);
        if (NIL != el_implication_p(sentence)) {
            query_properties = putf(query_properties, $kw51$CONDITIONAL_SENTENCE_, T);
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static final SubLObject prove_from_alt(SubLObject antecedant, SubLObject consequent, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject forward_time = com.cyc.cycjava.cycl.inference.harness.prove.prove_from_forward_time(time);
                SubLObject backward_time = com.cyc.cycjava.cycl.inference.harness.prove.prove_from_backward_time(time);
                thread.resetMultipleValues();
                {
                    SubLObject proof_sentence = com.cyc.cycjava.cycl.inference.harness.prove.prepare_for_proof(antecedant, consequent, mt, forward_time);
                    SubLObject proof_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (!((NIL != proof_sentence) && (NIL != proof_mt))) {
                        {
                            SubLObject v_answer = cyc_kernel.closed_query_success_token();
                            SubLObject reason = $TAUTOLOGY;
                            return values(v_answer, reason);
                        }
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject v_answer = fi.fi_ask_int(proof_sentence, proof_mt, backchain, number, backward_time, depth);
                        SubLObject reason = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return values(v_answer, reason);
                    }
                }
            }
        }
    }

    public static SubLObject prove_from(final SubLObject antecedant, final SubLObject consequent, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject forward_time = prove_from_forward_time(time);
        final SubLObject backward_time = prove_from_backward_time(time);
        thread.resetMultipleValues();
        final SubLObject proof_sentence = prepare_for_proof(antecedant, consequent, mt, forward_time);
        final SubLObject proof_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == proof_sentence) || (NIL == proof_mt)) {
            final SubLObject v_answer = cyc_kernel.closed_query_success_token();
            final SubLObject reason = $TAUTOLOGY;
            return values(v_answer, reason);
        }
        thread.resetMultipleValues();
        final SubLObject v_answer = fi.fi_ask_int(proof_sentence, proof_mt, backchain, number, backward_time, depth);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(v_answer, reason);
    }

    /**
     * Return the amount of time to spend on the proof forward propagating.
     */
    @LispMethod(comment = "Return the amount of time to spend on the proof forward propagating.")
    public static final SubLObject prove_from_forward_time_alt(SubLObject total_time_cutoff) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
                return ZERO_INTEGER;
            } else {
                if (NIL == total_time_cutoff) {
                    return NIL;
                } else {
                    return integerDivide(total_time_cutoff, TWO_INTEGER);
                }
            }
        }
    }

    /**
     * Return the amount of time to spend on the proof forward propagating.
     */
    @LispMethod(comment = "Return the amount of time to spend on the proof forward propagating.")
    public static SubLObject prove_from_forward_time(final SubLObject total_time_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        if (NIL == total_time_cutoff) {
            return NIL;
        }
        return integerDivide(total_time_cutoff, TWO_INTEGER);
    }

    /**
     * Return the amount of time to spend on the proof forward propagating.
     */
    @LispMethod(comment = "Return the amount of time to spend on the proof forward propagating.")
    public static final SubLObject prove_from_backward_time_alt(SubLObject total_time_cutoff) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
                return total_time_cutoff;
            } else {
                if (NIL == total_time_cutoff) {
                    return NIL;
                } else {
                    return integerDivide(total_time_cutoff, TWO_INTEGER);
                }
            }
        }
    }

    /**
     * Return the amount of time to spend on the proof forward propagating.
     */
    @LispMethod(comment = "Return the amount of time to spend on the proof forward propagating.")
    public static SubLObject prove_from_backward_time(final SubLObject total_time_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
            return total_time_cutoff;
        }
        if (NIL == total_time_cutoff) {
            return NIL;
        }
        return integerDivide(total_time_cutoff, TWO_INTEGER);
    }

    public static final SubLObject new_prepare_for_proof_alt(SubLObject antecedent, SubLObject consequent, SubLObject input_query_mt) {
        return com.cyc.cycjava.cycl.inference.harness.prove.prepare_for_proof(antecedent, consequent, input_query_mt, ZERO_INTEGER);
    }

    public static SubLObject new_prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, final SubLObject input_query_mt) {
        return prepare_for_proof(antecedent, consequent, input_query_mt, ZERO_INTEGER);
    }

    public static final SubLObject prepare_for_proof_alt(SubLObject antecedent, SubLObject consequent, SubLObject input_query_mt, SubLObject forward_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            input_query_mt = hlmt_czer.canonicalize_hlmt(input_query_mt);
            {
                SubLObject assumption_mt = com.cyc.cycjava.cycl.inference.harness.prove.prepare_assumption_mt(input_query_mt);
                thread.resetMultipleValues();
                {
                    SubLObject hypothesis_mt = com.cyc.cycjava.cycl.inference.harness.prove.prepare_hypothesis_mt(antecedent, assumption_mt, forward_time);
                    SubLObject term_bindings = thread.secondMultipleValue();
                    SubLObject failure_reasons = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != failure_reasons) {
                        return values(NIL, NIL, NIL, failure_reasons);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject proof_mt = com.cyc.cycjava.cycl.inference.harness.prove.prepare_proof_mt(consequent, hypothesis_mt, term_bindings);
                        SubLObject failure_reasons_20 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != failure_reasons_20) {
                            return values(NIL, NIL, NIL, failure_reasons_20);
                        }
                        {
                            SubLObject query_sentence = bindings.apply_bindings(term_bindings, consequent);
                            SubLObject query_mt = com.cyc.cycjava.cycl.inference.harness.prove.prepare_query_mt(input_query_mt, proof_mt);
                            return values(query_sentence, query_mt, term_bindings, NIL);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, SubLObject input_query_mt, final SubLObject forward_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        input_query_mt = hlmt_czer.canonicalize_hlmt(input_query_mt);
        final SubLObject assumption_mt = prepare_assumption_mt(input_query_mt);
        thread.resetMultipleValues();
        final SubLObject hypothesis_mt = prepare_hypothesis_mt(antecedent, assumption_mt, forward_time);
        final SubLObject term_bindings = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != failure_reasons) {
            return values(NIL, NIL, NIL, failure_reasons);
        }
        thread.resetMultipleValues();
        final SubLObject proof_mt = prepare_proof_mt(consequent, hypothesis_mt, term_bindings);
        final SubLObject failure_reasons_$21 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != failure_reasons_$21) {
            return values(NIL, NIL, NIL, failure_reasons_$21);
        }
        final SubLObject query_sentence = bindings.apply_bindings(term_bindings, consequent);
        final SubLObject query_mt = prepare_query_mt(input_query_mt, proof_mt);
        return values(query_sentence, query_mt, term_bindings, NIL);
    }

    public static final SubLObject prepare_assumption_mt_alt(SubLObject input_query_mt) {
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return mt_vars.$theory_mt_root$.getGlobalValue();
        } else {
            if (NIL != anytime_psc_hlmtP(input_query_mt)) {
                return replace_time_dimension(input_query_mt, $$Always_TimeInterval, $$TimePoint);
            } else {
                return input_query_mt;
            }
        }
    }

    public static SubLObject prepare_assumption_mt(final SubLObject input_query_mt) {
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return mt_vars.$theory_mt_root$.getGlobalValue();
        }
        if (NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(input_query_mt, $$Always_TimeInterval, $$TimePoint);
        }
        return input_query_mt;
    }

    public static final SubLObject prepare_query_mt_alt(SubLObject input_query_mt, SubLObject proof_mt) {
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return input_query_mt;
        } else {
            if (NIL != anytime_psc_hlmtP(input_query_mt)) {
                return replace_time_dimension(proof_mt, $$AnytimePSC, UNPROVIDED);
            } else {
                return proof_mt;
            }
        }
    }

    public static SubLObject prepare_query_mt(final SubLObject input_query_mt, final SubLObject proof_mt) {
        if (NIL == proof_mt) {
            return proof_mt;
        }
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return input_query_mt;
        }
        if (NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(proof_mt, $$AnytimePSC, UNPROVIDED);
        }
        return proof_mt;
    }

    /**
     * Prepare a hypothesis mt which assumes HYPOTHESIS-SENTENCE under the assumptions of MT.
     * FORWARD-TIME is the amount of time to spend forward-propagationg the hypothesis mt.
     *
     * @return 0 hlmt-p ; hypothesis-mt (which may be identical to MT)
     * @return 1 bindings-p ; term-bindings matching free variables
    in HYPOTHESIS-SENTENCE and hypothesized terms for those variables
     * @return 2 nil or non-nil ; optional failure reasons, if the hypothesis mt could not be hypothesized.
     */
    @LispMethod(comment = "Prepare a hypothesis mt which assumes HYPOTHESIS-SENTENCE under the assumptions of MT.\r\nFORWARD-TIME is the amount of time to spend forward-propagationg the hypothesis mt.\r\n\r\n@return 0 hlmt-p ; hypothesis-mt (which may be identical to MT)\r\n@return 1 bindings-p ; term-bindings matching free variables\r\nin HYPOTHESIS-SENTENCE and hypothesized terms for those variables\r\n@return 2 nil or non-nil ; optional failure reasons, if the hypothesis mt could not be hypothesized.\nPrepare a hypothesis mt which assumes HYPOTHESIS-SENTENCE under the assumptions of MT.\nFORWARD-TIME is the amount of time to spend forward-propagationg the hypothesis mt.")
    public static final SubLObject prepare_hypothesis_mt_alt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        if (hypothesis_sentence == $$True) {
            return values(mt, NIL, NIL);
        }
        return com.cyc.cycjava.cycl.inference.harness.prove.find_or_create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
    }

    /**
     * Prepare a hypothesis mt which assumes HYPOTHESIS-SENTENCE under the assumptions of MT.
     * FORWARD-TIME is the amount of time to spend forward-propagationg the hypothesis mt.
     *
     * @return 0 hlmt-p ; hypothesis-mt (which may be identical to MT)
     * @return 1 bindings-p ; term-bindings matching free variables
    in HYPOTHESIS-SENTENCE and hypothesized terms for those variables
     * @return 2 nil or non-nil ; optional failure reasons, if the hypothesis mt could not be hypothesized.
     */
    @LispMethod(comment = "Prepare a hypothesis mt which assumes HYPOTHESIS-SENTENCE under the assumptions of MT.\r\nFORWARD-TIME is the amount of time to spend forward-propagationg the hypothesis mt.\r\n\r\n@return 0 hlmt-p ; hypothesis-mt (which may be identical to MT)\r\n@return 1 bindings-p ; term-bindings matching free variables\r\nin HYPOTHESIS-SENTENCE and hypothesized terms for those variables\r\n@return 2 nil or non-nil ; optional failure reasons, if the hypothesis mt could not be hypothesized.\nPrepare a hypothesis mt which assumes HYPOTHESIS-SENTENCE under the assumptions of MT.\nFORWARD-TIME is the amount of time to spend forward-propagationg the hypothesis mt.")
    public static SubLObject prepare_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        if (hypothesis_sentence.eql($$True)) {
            return values(mt, NIL, NIL);
        }
        return find_or_create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
    }

    public static final SubLObject find_or_create_hypothesis_mt_alt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject hypothesis_mt = com.cyc.cycjava.cycl.inference.harness.prove.find_hypothesis_mt(hypothesis_sentence, mt);
                SubLObject term_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != hypothesis_mt) {
                    return values(hypothesis_mt, term_bindings, NIL);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject hypothesis_mt = com.cyc.cycjava.cycl.inference.harness.prove.create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
                SubLObject term_bindings = thread.secondMultipleValue();
                SubLObject failure_reasons = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != failure_reasons) {
                    return values(NIL, NIL, failure_reasons);
                } else {
                    return values(hypothesis_mt, term_bindings, NIL);
                }
            }
        }
    }

    public static SubLObject find_or_create_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hypothesis_mt = find_hypothesis_mt(hypothesis_sentence, mt);
        SubLObject term_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != hypothesis_mt) {
            return values(hypothesis_mt, term_bindings, NIL);
        }
        thread.resetMultipleValues();
        hypothesis_mt = create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
        term_bindings = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != failure_reasons) {
            return values(NIL, NIL, failure_reasons);
        }
        return values(hypothesis_mt, term_bindings, NIL);
    }

    public static final SubLObject find_hypothesis_mt_alt(SubLObject hypothesis_sentence, SubLObject mt) {
        {
            SubLObject ist_sentence = make_ist_sentence(mt, hypothesis_sentence);
            SubLObject hypothesis_info = dictionary.dictionary_lookup($hypothesis_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED);
            if (NIL == hypothesis_info) {
                return values(NIL, NIL);
            }
            {
                SubLObject datum = hypothesis_info;
                SubLObject current = datum;
                SubLObject hypothesis_mt = NIL;
                SubLObject term_bindings = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt58);
                hypothesis_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt58);
                term_bindings = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.prove.valid_hypothesis_mt_infoP(hypothesis_mt, term_bindings)) {
                        dictionary.dictionary_remove($hypothesis_mt_table$.getGlobalValue(), ist_sentence);
                        return values(NIL, NIL);
                    }
                    return values(hypothesis_mt, term_bindings);
                } else {
                    cdestructuring_bind_error(datum, $list_alt58);
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt) {
        final SubLObject ist_sentence = make_ist_sentence(mt, hypothesis_sentence);
        final SubLObject hypothesis_info = dictionary.dictionary_lookup($hypothesis_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED);
        if (NIL == hypothesis_info) {
            return values(NIL, NIL);
        }
        SubLObject current;
        final SubLObject datum = current = hypothesis_info;
        SubLObject hypothesis_mt = NIL;
        SubLObject term_bindings = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        hypothesis_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        term_bindings = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list57);
            return NIL;
        }
        if (NIL == valid_hypothesis_mt_infoP(hypothesis_mt, term_bindings)) {
            dictionary.dictionary_remove($hypothesis_mt_table$.getGlobalValue(), ist_sentence);
            return values(NIL, NIL);
        }
        return values(hypothesis_mt, term_bindings);
    }

    public static final SubLObject valid_hypothesis_mt_infoP_alt(SubLObject hypothesis_mt, SubLObject term_bindings) {
        if (NIL == valid_constantP(hypothesis_mt, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == isa.isaP(hypothesis_mt, $$HypotheticalContext, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = term_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject hypothesized_term_constant = bindings.variable_binding_value(binding);
                    if (NIL == valid_constantP(hypothesized_term_constant, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject valid_hypothesis_mt_infoP(final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        if (NIL == hlmt.valid_hlmtP(hypothesis_mt, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == isa.isaP(hlmt.hlmt_monad_mt(hypothesis_mt), $$HypotheticalContext, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var = term_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hypothesized_term_constant = bindings.variable_binding_value(binding);
            if (NIL == valid_constantP(hypothesized_term_constant, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject create_hypothesis_mt_alt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject hypothesis_mt = com.cyc.cycjava.cycl.inference.harness.prove.create_hypothesis_mt_int(hypothesis_sentence, mt, forward_time);
                SubLObject term_bindings = thread.secondMultipleValue();
                SubLObject failure_reasons = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != hypothesis_mt) {
                    {
                        SubLObject ist_sentence = make_ist_sentence(mt, hypothesis_sentence);
                        SubLObject hypothesis_info = list(hypothesis_mt, term_bindings);
                        dictionary.dictionary_enter($hypothesis_mt_table$.getGlobalValue(), ist_sentence, hypothesis_info);
                    }
                }
                return values(hypothesis_mt, term_bindings, failure_reasons);
            }
        }
    }

    public static SubLObject create_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hypothesis_mt = create_hypothesis_mt_int(hypothesis_sentence, mt, forward_time);
        final SubLObject term_bindings = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != hypothesis_mt) {
            final SubLObject ist_sentence = make_ist_sentence(mt, hypothesis_sentence);
            final SubLObject hypothesis_info = list(hypothesis_mt, term_bindings);
            dictionary.dictionary_enter($hypothesis_mt_table$.getGlobalValue(), ist_sentence, hypothesis_info);
        }
        return values(hypothesis_mt, term_bindings, failure_reasons);
    }

    public static final SubLObject create_hypothesis_mt_int_alt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hypothesis_mt = NIL;
                SubLObject term_bindings = NIL;
                SubLObject failedP = NIL;
                SubLObject failure_reasons = NIL;
                hypothesis_mt = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_spec_mt(mt, $$$Hypothesis);
                if (NIL != hypothesis_mt) {
                    {
                        SubLObject hypothesis_monad_mt = hlmt_monad_mt(hypothesis_mt);
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject term_bindings_21 = com.cyc.cycjava.cycl.inference.harness.prove.fi_hypothesize_int(hypothesis_sentence, hypothesis_mt, UNPROVIDED, UNPROVIDED);
                                SubLObject failure_reasons_22 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                term_bindings = term_bindings_21;
                                failure_reasons = failure_reasons_22;
                            }
                            if (NIL != term_bindings) {
                                if (NIL != bindings.unification_success_token_p(term_bindings)) {
                                    term_bindings = NIL;
                                }
                                com.cyc.cycjava.cycl.inference.harness.prove.note_hypothesis_mt_term_bindings(hypothesis_mt, term_bindings);
                            } else {
                                failedP = T;
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != failedP) {
                                        fi.fi_kill_int(hypothesis_monad_mt);
                                        hypothesis_mt = NIL;
                                        term_bindings = NIL;
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    failedP = T;
                }
                if (NIL == failedP) {
                    if (NIL != $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
                        com.cyc.cycjava.cycl.inference.harness.prove.forward_propagate_proof_hypothesis_mt(hypothesis_mt, forward_time);
                    }
                    return values(hypothesis_mt, term_bindings, NIL);
                }
                return values(NIL, NIL, failure_reasons);
            }
        }
    }

    public static SubLObject create_hypothesis_mt_int(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothesis_mt = NIL;
        SubLObject term_bindings = NIL;
        SubLObject failedP = NIL;
        SubLObject failure_reasons = NIL;
        hypothesis_mt = hypothesize_spec_mt(mt, $$$Hypothesis);
        if (NIL != hypothesis_mt) {
            final SubLObject hypothesis_monad_mt = hlmt.hlmt_monad_mt(hypothesis_mt);
            try {
                thread.resetMultipleValues();
                final SubLObject term_bindings_$22 = fi_hypothesize_int(hypothesis_sentence, hypothesis_mt, UNPROVIDED, UNPROVIDED);
                final SubLObject failure_reasons_$23 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                term_bindings = term_bindings_$22;
                failure_reasons = failure_reasons_$23;
                if (NIL != term_bindings) {
                    if (NIL != bindings.unification_success_token_p(term_bindings)) {
                        term_bindings = NIL;
                    }
                    note_hypothesis_mt_term_bindings(hypothesis_mt, term_bindings);
                } else {
                    failedP = T;
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != failedP) {
                        fi.fi_kill_int(hypothesis_monad_mt);
                        hypothesis_mt = NIL;
                        term_bindings = NIL;
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            failedP = T;
        }
        if (NIL == failedP) {
            if (NIL != $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
                forward_propagate_proof_hypothesis_mt(hypothesis_mt, forward_time);
            }
            return values(hypothesis_mt, term_bindings, NIL);
        }
        return values(NIL, NIL, failure_reasons);
    }

    /**
     * This used to assert #$hypotheticalTerm and #$definingMt, but those are now
     * asserted at constant creation time, because the hypothesization of terms
     * sometimes returns previously existing terms rather than newly created
     * hypothetical terms, so we don't want to state that those are ephemeral.
     */
    @LispMethod(comment = "This used to assert #$hypotheticalTerm and #$definingMt, but those are now\r\nasserted at constant creation time, because the hypothesization of terms\r\nsometimes returns previously existing terms rather than newly created\r\nhypothetical terms, so we don\'t want to state that those are ephemeral.\nThis used to assert #$hypotheticalTerm and #$definingMt, but those are now\nasserted at constant creation time, because the hypothesization of terms\nsometimes returns previously existing terms rather than newly created\nhypothetical terms, so we don\'t want to state that those are ephemeral.")
    public static final SubLObject note_hypothesis_mt_term_bindings_alt(SubLObject hypothesis_mt, SubLObject term_bindings) {
        SubLTrampolineFile.checkType(hypothesis_mt, HLMT_P);
        return NIL;
    }

    /**
     * This used to assert #$hypotheticalTerm and #$definingMt, but those are now
     * asserted at constant creation time, because the hypothesization of terms
     * sometimes returns previously existing terms rather than newly created
     * hypothetical terms, so we don't want to state that those are ephemeral.
     */
    @LispMethod(comment = "This used to assert #$hypotheticalTerm and #$definingMt, but those are now\r\nasserted at constant creation time, because the hypothesization of terms\r\nsometimes returns previously existing terms rather than newly created\r\nhypothetical terms, so we don\'t want to state that those are ephemeral.\nThis used to assert #$hypotheticalTerm and #$definingMt, but those are now\nasserted at constant creation time, because the hypothesization of terms\nsometimes returns previously existing terms rather than newly created\nhypothetical terms, so we don\'t want to state that those are ephemeral.")
    public static SubLObject note_hypothesis_mt_term_bindings(final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        assert NIL != hlmt.hlmt_p(hypothesis_mt) : "! hlmt.hlmt_p(hypothesis_mt) " + ("hlmt.hlmt_p(hypothesis_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(hypothesis_mt) ") + hypothesis_mt;
        return NIL;
    }/**
     * This used to assert #$hypotheticalTerm and #$definingMt, but those are now
     * asserted at constant creation time, because the hypothesization of terms
     * sometimes returns previously existing terms rather than newly created
     * hypothetical terms, so we don't want to state that those are ephemeral.
     */


    /**
     * no longer needed due to lazy clearing in find-hypothesis-mt
     */
    @LispMethod(comment = "no longer needed due to lazy clearing in find-hypothesis-mt")
    public static final SubLObject kill_cached_hypothesis_mt_alt(SubLObject hypothesis_mt) {
        return NIL;
    }

    /**
     * no longer needed due to lazy clearing in find-hypothesis-mt
     */
    @LispMethod(comment = "no longer needed due to lazy clearing in find-hypothesis-mt")
    public static SubLObject kill_cached_hypothesis_mt(final SubLObject hypothesis_mt) {
        return NIL;
    }/**
     * no longer needed due to lazy clearing in find-hypothesis-mt
     */


    /**
     *
     *
     * @return 0 hlmt-p ; proof mt to use
     * @return 1 nil or non-nil ; failure reasons
     */
    @LispMethod(comment = "@return 0 hlmt-p ; proof mt to use\r\n@return 1 nil or non-nil ; failure reasons")
    public static final SubLObject prepare_proof_mt_alt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $proof_assume_consequent_type_constraintsP$.getDynamicValue(thread)) {
                return values(hypothesis_mt, NIL);
            }
            {
                SubLObject consequent_mentions_antecedent_variableP = NIL;
                SubLObject rest = NIL;
                for (rest = term_bindings; !((NIL != consequent_mentions_antecedent_variableP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject term_binding = rest.first();
                        SubLObject datum = term_binding;
                        SubLObject current = datum;
                        SubLObject variable = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt63);
                        variable = current.first();
                        current = current.rest();
                        value = current;
                        consequent_mentions_antecedent_variableP = cycl_utilities.expression_find(variable, consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                if (NIL == consequent_mentions_antecedent_variableP) {
                    return values(hypothesis_mt, NIL);
                }
            }
            return com.cyc.cycjava.cycl.inference.harness.prove.find_or_create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
        }
    }

    /**
     *
     *
     * @return 0 hlmt-p ; proof mt to use
     * @return 1 nil or non-nil ; failure reasons
     */
    @LispMethod(comment = "@return 0 hlmt-p ; proof mt to use\r\n@return 1 nil or non-nil ; failure reasons")
    public static SubLObject prepare_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $proof_assume_consequent_type_constraintsP$.getDynamicValue(thread)) {
            return values(hypothesis_mt, NIL);
        }
        SubLObject consequent_mentions_antecedent_variableP;
        SubLObject rest;
        SubLObject term_binding;
        SubLObject current;
        SubLObject datum;
        SubLObject variable;
        SubLObject value;
        for (consequent_mentions_antecedent_variableP = NIL, rest = NIL, rest = term_bindings; (NIL == consequent_mentions_antecedent_variableP) && (NIL != rest); consequent_mentions_antecedent_variableP = cycl_utilities.expression_find(variable, consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) , rest = rest.rest()) {
            term_binding = rest.first();
            datum = current = term_binding;
            variable = NIL;
            value = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            variable = current.first();
            current = value = current.rest();
        }
        if (NIL == consequent_mentions_antecedent_variableP) {
            return values(hypothesis_mt, NIL);
        }
        return find_or_create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
    }

    public static final SubLObject find_or_create_proof_mt_alt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        {
            SubLObject proof_mt = com.cyc.cycjava.cycl.inference.harness.prove.find_proof_mt(consequent_sentence, hypothesis_mt);
            if (NIL != proof_mt) {
                return values(proof_mt, NIL);
            } else {
                return com.cyc.cycjava.cycl.inference.harness.prove.create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
            }
        }
    }

    public static SubLObject find_or_create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLObject proof_mt = find_proof_mt(consequent_sentence, hypothesis_mt);
        if (NIL != proof_mt) {
            return values(proof_mt, NIL);
        }
        return create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
    }

    public static final SubLObject find_proof_mt_alt(SubLObject consequent_sentence, SubLObject hypothesis_mt) {
        {
            SubLObject ist_sentence = make_ist_sentence(hypothesis_mt, consequent_sentence);
            SubLObject proof_mt = dictionary.dictionary_lookup($proof_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED);
            if (NIL != proof_mt) {
                if (NIL == valid_hlmt_p(proof_mt, UNPROVIDED)) {
                    dictionary.dictionary_remove($proof_mt_table$.getGlobalValue(), ist_sentence);
                    proof_mt = NIL;
                }
            }
            return proof_mt;
        }
    }

    public static SubLObject find_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt) {
        final SubLObject ist_sentence = make_ist_sentence(hypothesis_mt, consequent_sentence);
        SubLObject proof_mt = dictionary.dictionary_lookup($proof_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED);
        if ((NIL != proof_mt) && (NIL == hlmt.valid_hlmt_p(proof_mt, UNPROVIDED))) {
            dictionary.dictionary_remove($proof_mt_table$.getGlobalValue(), ist_sentence);
            proof_mt = NIL;
        }
        return proof_mt;
    }

    public static final SubLObject create_proof_mt_alt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject proof_mt = com.cyc.cycjava.cycl.inference.harness.prove.create_proof_mt_int(consequent_sentence, hypothesis_mt, term_bindings);
                SubLObject failure_reasons = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != proof_mt) {
                    {
                        SubLObject ist_sentence = make_ist_sentence(hypothesis_mt, consequent_sentence);
                        dictionary.dictionary_enter($proof_mt_table$.getGlobalValue(), ist_sentence, proof_mt);
                    }
                }
                return values(proof_mt, failure_reasons);
            }
        }
    }

    public static SubLObject create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof_mt = create_proof_mt_int(consequent_sentence, hypothesis_mt, term_bindings);
        final SubLObject failure_reasons = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != proof_mt) {
            final SubLObject ist_sentence = make_ist_sentence(hypothesis_mt, consequent_sentence);
            dictionary.dictionary_enter($proof_mt_table$.getGlobalValue(), ist_sentence, proof_mt);
        }
        return values(proof_mt, failure_reasons);
    }

    public static final SubLObject create_proof_mt_int_alt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject proof_mt = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_spec_mt(hypothesis_mt, $$$Proof);
                SubLObject failure_reasons = NIL;
                if (NIL == proof_mt) {
                    return values(NIL, NIL);
                }
                {
                    SubLObject proof_monad_mt = hlmt_monad_mt(proof_mt);
                    SubLObject something_assertedP = NIL;
                    SubLObject free_vars = sentence_free_variables(consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = $at_include_isa_literal_constraints$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $at_include_genl_literal_constraints$.currentBinding(thread);
                        try {
                            $at_include_isa_literal_constraints$.bind(NIL, thread);
                            $at_include_genl_literal_constraints$.bind(NIL, thread);
                            something_assertedP = com.cyc.cycjava.cycl.inference.harness.prove.hypothesize_terms_for_consequent(consequent_sentence, proof_mt, term_bindings, free_vars);
                        } finally {
                            $at_include_genl_literal_constraints$.rebind(_prev_bind_1, thread);
                            $at_include_isa_literal_constraints$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == something_assertedP) {
                        fi.fi_kill_int(proof_monad_mt);
                        proof_mt = hypothesis_mt;
                    }
                }
                return values(proof_mt, failure_reasons);
            }
        }
    }

    public static SubLObject create_proof_mt_int(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_mt = hypothesize_spec_mt(hypothesis_mt, $$$Proof);
        final SubLObject failure_reasons = NIL;
        if (NIL == proof_mt) {
            return values(NIL, NIL);
        }
        final SubLObject proof_monad_mt = hlmt.hlmt_monad_mt(proof_mt);
        SubLObject something_assertedP = NIL;
        final SubLObject free_vars = sentence_free_variables(consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = at_vars.$at_include_isa_literal_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_include_genl_literal_constraints$.currentBinding(thread);
        try {
            at_vars.$at_include_isa_literal_constraints$.bind(NIL, thread);
            at_vars.$at_include_genl_literal_constraints$.bind(NIL, thread);
            something_assertedP = hypothesize_terms_for_consequent(consequent_sentence, proof_mt, term_bindings, free_vars);
        } finally {
            at_vars.$at_include_genl_literal_constraints$.rebind(_prev_bind_2, thread);
            at_vars.$at_include_isa_literal_constraints$.rebind(_prev_bind_0, thread);
        }
        if (NIL == something_assertedP) {
            fi.fi_kill_int(proof_monad_mt);
            proof_mt = hypothesis_mt;
        }
        return values(proof_mt, failure_reasons);
    }

    public static final SubLObject forward_propagate_proof_hypothesis_mt_alt(SubLObject hypothesis_mt, SubLObject forward_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(forward_time.isInteger() && forward_time.numLE(ZERO_INTEGER))) {
                if (NIL == forward_time) {
                    forward_time = $proof_hypothesis_forward_absolute_time_cutoff$.getDynamicValue(thread);
                }
                {
                    SubLObject _prev_bind_0 = $unbound_rule_backchain_enabled$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $forward_inference_removal_cost_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_time_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $filter_deductions_for_trivially_derivable_gafs$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kb_control_vars.$forward_propagate_from_negations$.currentBinding(thread);
                    SubLObject _prev_bind_5 = kb_control_vars.$forward_propagate_to_negations$.currentBinding(thread);
                    try {
                        $unbound_rule_backchain_enabled$.bind(T, thread);
                        $forward_inference_removal_cost_cutoff$.bind($proof_hypothesis_forward_removal_cost_cutoff$.getDynamicValue(thread), thread);
                        kb_control_vars.$forward_inference_time_cutoff$.bind($proof_hypothesis_forward_time_cutoff$.getDynamicValue(thread), thread);
                        $filter_deductions_for_trivially_derivable_gafs$.bind(T, thread);
                        kb_control_vars.$forward_propagate_from_negations$.bind(NIL, thread);
                        kb_control_vars.$forward_propagate_to_negations$.bind(NIL, thread);
                        forward_propagate_assertions.forward_propagate_mt(hypothesis_mt, hypothesis_mt, NIL, forward_time, $proof_hypothesis_forward_propagation_depth$.getDynamicValue(thread));
                    } finally {
                        kb_control_vars.$forward_propagate_to_negations$.rebind(_prev_bind_5, thread);
                        kb_control_vars.$forward_propagate_from_negations$.rebind(_prev_bind_4, thread);
                        $filter_deductions_for_trivially_derivable_gafs$.rebind(_prev_bind_3, thread);
                        kb_control_vars.$forward_inference_time_cutoff$.rebind(_prev_bind_2, thread);
                        $forward_inference_removal_cost_cutoff$.rebind(_prev_bind_1, thread);
                        $unbound_rule_backchain_enabled$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject forward_propagate_proof_hypothesis_mt(final SubLObject hypothesis_mt, SubLObject forward_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!forward_time.isInteger()) || (!forward_time.numLE(ZERO_INTEGER))) {
            if (NIL == forward_time) {
                forward_time = $proof_hypothesis_forward_absolute_time_cutoff$.getDynamicValue(thread);
            }
            final SubLObject _prev_bind_0 = $unbound_rule_backchain_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $forward_inference_removal_cost_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_3 = kb_control_vars.$forward_inference_time_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $filter_deductions_for_trivially_derivable_gafs$.currentBinding(thread);
            final SubLObject _prev_bind_5 = kb_control_vars.$forward_propagate_from_negations$.currentBinding(thread);
            final SubLObject _prev_bind_6 = kb_control_vars.$forward_propagate_to_negations$.currentBinding(thread);
            try {
                $unbound_rule_backchain_enabled$.bind(T, thread);
                $forward_inference_removal_cost_cutoff$.bind($proof_hypothesis_forward_removal_cost_cutoff$.getDynamicValue(thread), thread);
                kb_control_vars.$forward_inference_time_cutoff$.bind($proof_hypothesis_forward_time_cutoff$.getDynamicValue(thread), thread);
                $filter_deductions_for_trivially_derivable_gafs$.bind(T, thread);
                kb_control_vars.$forward_propagate_from_negations$.bind(NIL, thread);
                kb_control_vars.$forward_propagate_to_negations$.bind(NIL, thread);
                forward_propagate_assertions.forward_propagate_mt(hypothesis_mt, hypothesis_mt, NIL, forward_time, $proof_hypothesis_forward_propagation_depth$.getDynamicValue(thread));
            } finally {
                kb_control_vars.$forward_propagate_to_negations$.rebind(_prev_bind_6, thread);
                kb_control_vars.$forward_propagate_from_negations$.rebind(_prev_bind_5, thread);
                $filter_deductions_for_trivially_derivable_gafs$.rebind(_prev_bind_4, thread);
                kb_control_vars.$forward_inference_time_cutoff$.rebind(_prev_bind_3, thread);
                $forward_inference_removal_cost_cutoff$.rebind(_prev_bind_2, thread);
                $unbound_rule_backchain_enabled$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Hypothesize and return a new microtheory which is a spec of MT.
     */
    @LispMethod(comment = "Hypothesize and return a new microtheory which is a spec of MT.")
    public static final SubLObject hypothesize_spec_mt_alt(SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject monad_mt = hlmt_monad_mt(mt);
                SubLObject sentence = subst(monad_mt, $MT, $hypothesize_spec_mt_sentence$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject hyp_mt = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                        {
                            SubLObject v_bindings = com.cyc.cycjava.cycl.inference.harness.prove.fi_hypothesize_int(sentence, mt_vars.$mt_mt$.getGlobalValue(), name_prefix, UNPROVIDED);
                            if (NIL != v_bindings) {
                                hyp_mt = bindings.apply_bindings(v_bindings, $sym69$_SPEC_MT);
                                if (NIL != hyp_mt) {
                                    cyc_kernel.cyc_assert_wff(list($$highlyRelevantMt, hyp_mt), hyp_mt, UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return replace_monad_dimension(mt, hyp_mt);
            }
        }
    }

    @LispMethod(comment = "Hypothesize and return a new microtheory which is a spec of MT.")
    public static SubLObject hypothesize_spec_mt(final SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        final SubLObject sentence = subst(monad_mt, $MT, $hypothesize_spec_mt_sentence$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        SubLObject hyp_mt = NIL;
        SubLObject hyp_hlmt = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            final SubLObject v_bindings = fi_hypothesize_int(sentence, mt_vars.$mt_mt$.getGlobalValue(), name_prefix, UNPROVIDED);
            if (NIL != v_bindings) {
                hyp_mt = bindings.apply_bindings(v_bindings, $sym68$_SPEC_MT);
                if (NIL != hyp_mt) {
                    hyp_hlmt = hlmt.replace_monad_dimension(mt, hyp_mt);
                    cyc_kernel.cyc_assert_wff(list($$highlyRelevantMt, hyp_hlmt), hyp_hlmt, UNPROVIDED);
                }
            }
        } finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return hyp_hlmt;
    }/**
     * Hypothesize and return a new microtheory which is a spec of MT.
     */


    public static SubLObject hypothetical_constant(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str70$HYP_)));
    }

    public static final SubLObject construct_non_wff_conflict_supports_alt(SubLObject sentence, SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == UNPROVIDED) {
            generic_var_map = NIL;
        }
        {
            SubLObject supports = com.cyc.cycjava.cycl.inference.harness.prove.flatten_explain_hl_why_not_wff(wff.hl_explain_why_not_wff(sentence, mt, UNPROVIDED));
            if (!supports.isList()) {
                supports = NIL;
            }
            if (supports.isCons()) {
                if (supports.first() == $$and) {
                    supports = supports.rest();
                }
            }
            if (NIL != supports) {
                supports = delete(NIL, Mapping.mapcar(symbol_function(CONVERT_TO_HL_SUPPORT), supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == supports) {
                supports = list(arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED));
            }
            return supports;
        }
    }

    public static SubLObject construct_non_wff_conflict_supports(final SubLObject sentence, final SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == UNPROVIDED) {
            generic_var_map = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_non_wff_conflict_supports_explain_methodP$.getDynamicValue(thread)) {
            final SubLObject hyp_terms = cycl_utilities.expression_gather(sentence, HYPOTHETICAL_CONSTANT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject hyp_assertions = NIL;
            SubLObject cdolist_list_var = hyp_terms;
            SubLObject hyp_term = NIL;
            hyp_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$24 = list_utilities.remove_if_not($sym72$ASSERTED_ASSERTION_, virtual_indexing.assertions_mentioning_terms(list(hyp_term), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject hyp_ass = NIL;
                hyp_ass = cdolist_list_var_$24.first();
                while (NIL != cdolist_list_var_$24) {
                    final SubLObject item_var = hyp_ass;
                    if (NIL == member(item_var, hyp_assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                        hyp_assertions = cons(item_var, hyp_assertions);
                    }
                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                    hyp_ass = cdolist_list_var_$24.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                hyp_term = cdolist_list_var.first();
            } 
            SubLObject result = NIL;
            SubLObject cdolist_list_var2 = hyp_assertions;
            SubLObject hyp_ass2 = NIL;
            hyp_ass2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject el_formula = bindings.apply_bindings_backwards(generic_var_map, uncanonicalizer.assertion_el_formula(hyp_ass2));
                if ((NIL == cycl_utilities.expression_find_if(HYPOTHETICAL_TERM_P, el_formula, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find($$hypotheticalTerm, el_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    result = cons(el_formula, result);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                hyp_ass2 = cdolist_list_var2.first();
            } 
            result = make_conjunction(result);
            result = make_implication(result, bindings.apply_bindings_backwards(generic_var_map, make_negation(sentence)));
            result = arguments.make_hl_support($QUERY, result, Sort.sort(genl_mts.asserted_genl_mts(mt, UNPROVIDED), $sym75$GENERALITY_ESTIMATE_, UNPROVIDED).first(), UNPROVIDED);
            return list(result);
        }
        SubLObject supports = flatten_explain_hl_why_not_wff(wff.hl_explain_why_not_wff(sentence, mt, UNPROVIDED));
        if (!supports.isList()) {
            supports = NIL;
        }
        if (supports.isCons() && supports.first().eql($$and)) {
            supports = supports.rest();
        }
        if (NIL != supports) {
            supports = delete(NIL, Mapping.mapcar(symbol_function(CONVERT_TO_HL_SUPPORT), supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == supports) {
            supports = list(arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED));
        }
        return supports;
    }

    public static final SubLObject flatten_explain_hl_why_not_wff_alt(SubLObject supports) {
        {
            SubLObject v_answer = com.cyc.cycjava.cycl.inference.harness.prove.flatten_explain_hl_why_not_wff_recursive(supports, NIL);
            return nreverse(v_answer);
        }
    }

    public static SubLObject flatten_explain_hl_why_not_wff(final SubLObject supports) {
        final SubLObject v_answer = flatten_explain_hl_why_not_wff_recursive(supports, NIL);
        return nreverse(v_answer);
    }

    public static final SubLObject flatten_explain_hl_why_not_wff_recursive_alt(SubLObject sentence, SubLObject accumulator) {
        if (NIL != assertion_handles.assertion_p(sentence)) {
            {
                SubLObject el_formula = assertion_el_formula(sentence);
                if (NIL != list_utilities.tree_find_if($sym73$EPHEMERAL_TERM_, el_formula, UNPROVIDED)) {
                    accumulator = cons(list($$ist, assertions_high.assertion_mt(sentence), el_formula), accumulator);
                } else {
                    accumulator = cons(sentence, accumulator);
                }
            }
        } else {
            if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                if (NIL != ist_sentence_p(sentence)) {
                    accumulator = cons(sentence, accumulator);
                } else {
                    {
                        SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
                        SubLObject cdolist_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            accumulator = com.cyc.cycjava.cycl.inference.harness.prove.flatten_explain_hl_why_not_wff_recursive(v_term, accumulator);
                        }
                    }
                }
            }
        }
        return accumulator;
    }

    public static SubLObject flatten_explain_hl_why_not_wff_recursive(final SubLObject sentence, SubLObject accumulator) {
        if (NIL != assertion_handles.assertion_p(sentence)) {
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(sentence);
            if (NIL != list_utilities.tree_find_if($sym78$EPHEMERAL_TERM_, el_formula, UNPROVIDED)) {
                accumulator = cons(list($$ist, assertions_high.assertion_mt(sentence), el_formula), accumulator);
            } else {
                accumulator = cons(sentence, accumulator);
            }
        } else
            if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
                    accumulator = cons(sentence, accumulator);
                } else {
                    SubLObject cdolist_list_var;
                    final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(sentence, $IGNORE);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        accumulator = flatten_explain_hl_why_not_wff_recursive(v_term, accumulator);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                }
            }

        return accumulator;
    }

    public static final SubLObject convert_to_hl_support_alt(SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return v_object;
        } else {
            if (NIL != arguments.support_p(v_object)) {
                return v_object;
            } else {
                if (NIL == el_formula_p(v_object)) {
                    return NIL;
                } else {
                    if (NIL != ist_sentence_p(v_object)) {
                        {
                            SubLObject datum = cycl_utilities.formula_args(v_object, UNPROVIDED);
                            SubLObject current = datum;
                            SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt76);
                            current = current.rest();
                            {
                                SubLObject sentence = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt76);
                                current = current.rest();
                                if (NIL == current) {
                                    return com.cyc.cycjava.cycl.inference.harness.prove.convert_ist_formula_to_hl_support(sentence, mt);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt76);
                                }
                            }
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject convert_to_hl_support(final SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return v_object;
        }
        if (NIL != arguments.support_p(v_object)) {
            return v_object;
        }
        if (NIL == el_formula_p(v_object)) {
            return NIL;
        }
        if (NIL == ist_sentence_p(v_object, UNPROVIDED)) {
            return NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(v_object, UNPROVIDED);
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list81);
        current = current.rest();
        final SubLObject sentence = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list81);
        current = current.rest();
        if (NIL == current) {
            return convert_ist_formula_to_hl_support(sentence, mt);
        }
        cdestructuring_bind_error(datum, $list81);
        return NIL;
    }

    public static final SubLObject convert_ist_formula_to_hl_support_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject pcase_var = literal_predicate(sentence, UNPROVIDED);
            if (pcase_var.eql($$isa)) {
                return arguments.make_hl_support($ISA, sentence, mt, UNPROVIDED);
            } else {
                if (pcase_var.eql($$genls)) {
                    return arguments.make_hl_support($GENLS, sentence, mt, UNPROVIDED);
                } else {
                    if (pcase_var.eql($$genlPreds) || pcase_var.eql($$genlInverse)) {
                        return arguments.make_hl_support($GENLPREDS, sentence, mt, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($$evaluate)) {
                            return arguments.make_hl_support($EVAL, sentence, mt, UNPROVIDED);
                        } else {
                            return arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject convert_ist_formula_to_hl_support(final SubLObject sentence, final SubLObject mt) {
        final SubLObject pcase_var = literal_predicate(sentence, UNPROVIDED);
        if (pcase_var.eql($$isa)) {
            return arguments.make_hl_support($ISA, sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($$genls)) {
            return arguments.make_hl_support($GENLS, sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($$genlPreds) || pcase_var.eql($$genlInverse)) {
            return arguments.make_hl_support($GENLPREDS, sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($$evaluate)) {
            return arguments.make_hl_support($EVAL, sentence, mt, UNPROVIDED);
        }
        return arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED);
    }

    /**
     * Assumes *conflicting-support-sets* is bound
     */
    @LispMethod(comment = "Assumes *conflicting-support-sets* is bound")
    public static final SubLObject note_non_wff_conflict_alt(SubLObject sentence, SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == UNPROVIDED) {
            generic_var_map = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $record_inconsistent_support_sets$.getDynamicValue(thread)) {
                {
                    SubLObject supports = com.cyc.cycjava.cycl.inference.harness.prove.construct_non_wff_conflict_supports(sentence, mt, generic_var_map);
                    conflicts.add_inconsistent_support_set(supports);
                    $conflicting_support_sets$.setDynamicValue(cons(supports, $conflicting_support_sets$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Assumes *conflicting-support-sets* is bound")
    public static SubLObject note_non_wff_conflict(final SubLObject sentence, final SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == UNPROVIDED) {
            generic_var_map = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $record_inconsistent_support_sets$.getDynamicValue(thread)) {
            final SubLObject supports = construct_non_wff_conflict_supports(sentence, mt, generic_var_map);
            conflicts.add_inconsistent_support_set(supports);
            $conflicting_support_sets$.setDynamicValue(cons(supports, $conflicting_support_sets$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }/**
     * Assumes *conflicting-support-sets* is bound
     */


    public static final SubLObject declare_prove_file_alt() {
        declareFunction("prove_justified", "PROVE-JUSTIFIED", 1, 5, false);
        declareFunction("fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false);
        declareFunction("fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false);
        declareFunction("hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false);
        declareFunction("hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false);
        declareFunction("hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false);
        declareFunction("hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false);
        declareFunction("hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false);
        declareFunction("hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false);
        declareFunction("assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false);
        declareFunction("assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false);
        declareFunction("assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false);
        declareFunction("create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false);
        declareFunction("assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false);
        declareFunction("hypothesize_dnf_equal_symbols_constraints", "HYPOTHESIZE-DNF-EQUAL-SYMBOLS-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction("suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false);
        declareFunction("fi_prove", "FI-PROVE", 2, 4, false);
        declareFunction("fi_prove_int", "FI-PROVE-INT", 2, 4, false);
        declareFunction("fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false);
        declareFunction("prove_from", "PROVE-FROM", 3, 4, false);
        declareFunction("prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false);
        declareFunction("prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false);
        declareFunction("new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false);
        declareFunction("prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false);
        declareFunction("prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false);
        declareFunction("prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false);
        declareFunction("prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false);
        declareFunction("valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false);
        declareFunction("create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false);
        declareFunction("note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false);
        declareFunction("kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false);
        declareFunction("prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false);
        declareFunction("find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false);
        declareFunction("find_proof_mt", "FIND-PROOF-MT", 2, 0, false);
        declareFunction("create_proof_mt", "CREATE-PROOF-MT", 3, 0, false);
        declareFunction("create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false);
        declareFunction("forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false);
        declareFunction("hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false);
        declareFunction("construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false);
        declareFunction("flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false);
        declareFunction("flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false);
        declareFunction("convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false);
        declareFunction("convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false);
        declareFunction("note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false);
        return NIL;
    }

    public static SubLObject declare_prove_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("prove_justified", "PROVE-JUSTIFIED", 1, 5, false);
            declareFunction("fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false);
            declareFunction("fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false);
            declareFunction("hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false);
            declareFunction("hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false);
            declareFunction("hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false);
            declareFunction("hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false);
            declareFunction("hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false);
            declareFunction("hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false);
            declareFunction("assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false);
            declareFunction("assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false);
            declareFunction("assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false);
            declareFunction("assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false);
            declareFunction("assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false);
            declareFunction("assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false);
            declareFunction("create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false);
            declareFunction("assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false);
            declareFunction("hypothesize_dnf_equality_constraints", "HYPOTHESIZE-DNF-EQUALITY-CONSTRAINTS", 2, 0, false);
            declareFunction("hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false);
            declareFunction("hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
            declareFunction("hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false);
            declareFunction("antecedent_dnf_variables_isa_constraints", "ANTECEDENT-DNF-VARIABLES-ISA-CONSTRAINTS", 2, 0, false);
            declareFunction("antecedent_dnf_variables_quoted_isa_constraints", "ANTECEDENT-DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
            declareFunction("antecedent_dnf_variables_genl_constraints", "ANTECEDENT-DNF-VARIABLES-GENL-CONSTRAINTS", 2, 0, false);
            declareFunction("suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false);
            declareFunction("fi_prove", "FI-PROVE", 2, 4, false);
            declareFunction("fi_prove_int", "FI-PROVE-INT", 2, 4, false);
            declareFunction("fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false);
            declareFunction("prove_from", "PROVE-FROM", 3, 4, false);
            declareFunction("prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false);
            declareFunction("prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false);
            declareFunction("new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false);
            declareFunction("prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false);
            declareFunction("prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false);
            declareFunction("prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false);
            declareFunction("prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false);
            declareFunction("find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false);
            declareFunction("find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false);
            declareFunction("valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false);
            declareFunction("create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false);
            declareFunction("create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false);
            declareFunction("note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false);
            declareFunction("kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false);
            declareFunction("prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false);
            declareFunction("find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false);
            declareFunction("find_proof_mt", "FIND-PROOF-MT", 2, 0, false);
            declareFunction("create_proof_mt", "CREATE-PROOF-MT", 3, 0, false);
            declareFunction("create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false);
            declareFunction("forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false);
            declareFunction("hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false);
            declareFunction("hypothetical_constant", "HYPOTHETICAL-CONSTANT", 1, 0, false);
            declareFunction("construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false);
            declareFunction("flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false);
            declareFunction("flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false);
            declareFunction("convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false);
            declareFunction("convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false);
            declareFunction("note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("hypothesize_dnf_equal_symbols_constraints", "HYPOTHESIZE-DNF-EQUAL-SYMBOLS-CONSTRAINTS", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_prove_file_Previous() {
        declareFunction("prove_justified", "PROVE-JUSTIFIED", 1, 5, false);
        declareFunction("fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false);
        declareFunction("fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false);
        declareFunction("hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false);
        declareFunction("hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false);
        declareFunction("hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false);
        declareFunction("hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false);
        declareFunction("hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false);
        declareFunction("hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false);
        declareFunction("assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false);
        declareFunction("assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false);
        declareFunction("assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false);
        declareFunction("create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false);
        declareFunction("assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false);
        declareFunction("hypothesize_dnf_equality_constraints", "HYPOTHESIZE-DNF-EQUALITY-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction("antecedent_dnf_variables_isa_constraints", "ANTECEDENT-DNF-VARIABLES-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("antecedent_dnf_variables_quoted_isa_constraints", "ANTECEDENT-DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("antecedent_dnf_variables_genl_constraints", "ANTECEDENT-DNF-VARIABLES-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction("suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false);
        declareFunction("fi_prove", "FI-PROVE", 2, 4, false);
        declareFunction("fi_prove_int", "FI-PROVE-INT", 2, 4, false);
        declareFunction("fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false);
        declareFunction("prove_from", "PROVE-FROM", 3, 4, false);
        declareFunction("prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false);
        declareFunction("prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false);
        declareFunction("new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false);
        declareFunction("prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false);
        declareFunction("prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false);
        declareFunction("prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false);
        declareFunction("prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false);
        declareFunction("valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false);
        declareFunction("create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false);
        declareFunction("note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false);
        declareFunction("kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false);
        declareFunction("prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false);
        declareFunction("find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false);
        declareFunction("find_proof_mt", "FIND-PROOF-MT", 2, 0, false);
        declareFunction("create_proof_mt", "CREATE-PROOF-MT", 3, 0, false);
        declareFunction("create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false);
        declareFunction("forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false);
        declareFunction("hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false);
        declareFunction("hypothetical_constant", "HYPOTHETICAL-CONSTANT", 1, 0, false);
        declareFunction("construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false);
        declareFunction("flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false);
        declareFunction("flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false);
        declareFunction("convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false);
        declareFunction("convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false);
        declareFunction("note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_prove_file_alt() {
        defparameter("*CONFLICTING-SUPPORT-SETS*", NIL);
        defparameter("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", NIL);
        defparameter("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", NIL);
        defparameter("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", NIL);
        deflexical("*HYPOTHESIS-MT-TABLE*", NIL != boundp($hypothesis_mt_table$) ? ((SubLObject) ($hypothesis_mt_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER));
        defvar("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", T);
        deflexical("*PROOF-MT-TABLE*", NIL != boundp($proof_mt_table$) ? ((SubLObject) ($proof_mt_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER));
        defvar("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", $int$120);
        defvar("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", FIVE_INTEGER);
        defvar("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", TWENTY_INTEGER);
        defvar("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", ONE_INTEGER);
        defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list_alt67);
        return NIL;
    }

    public static SubLObject init_prove_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CONFLICTING-SUPPORT-SETS*", NIL);
            defparameter("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", NIL);
            defparameter("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", NIL);
            defparameter("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", NIL);
            deflexical("*HYPOTHESIS-MT-TABLE*", SubLTrampolineFile.maybeDefault($hypothesis_mt_table$, $hypothesis_mt_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER)));
            defvar("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", T);
            deflexical("*PROOF-MT-TABLE*", SubLTrampolineFile.maybeDefault($proof_mt_table$, $proof_mt_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER)));
            defvar("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", $int$120);
            defvar("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", FIVE_INTEGER);
            defvar("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", TWENTY_INTEGER);
            defvar("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", ONE_INTEGER);
            defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list66);
            defparameter("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*", T);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*HYPOTHESIS-MT-TABLE*", NIL != boundp($hypothesis_mt_table$) ? ((SubLObject) ($hypothesis_mt_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER));
            deflexical("*PROOF-MT-TABLE*", NIL != boundp($proof_mt_table$) ? ((SubLObject) ($proof_mt_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER));
            defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list_alt67);
        }
        return NIL;
    }

    public static SubLObject init_prove_file_Previous() {
        defparameter("*CONFLICTING-SUPPORT-SETS*", NIL);
        defparameter("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", NIL);
        defparameter("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", NIL);
        defparameter("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", NIL);
        deflexical("*HYPOTHESIS-MT-TABLE*", SubLTrampolineFile.maybeDefault($hypothesis_mt_table$, $hypothesis_mt_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER)));
        defvar("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", T);
        deflexical("*PROOF-MT-TABLE*", SubLTrampolineFile.maybeDefault($proof_mt_table$, $proof_mt_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER)));
        defvar("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", $int$120);
        defvar("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", FIVE_INTEGER);
        defvar("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", TWENTY_INTEGER);
        defvar("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", ONE_INTEGER);
        defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list66);
        defparameter("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*", T);
        return NIL;
    }

    public static final SubLObject setup_prove_file_alt() {
        register_cyc_api_function(FI_HYPOTHESIZE, $list_alt4, $str_alt5$Cyc_attempts_to_check_if_SENTENCE, NIL, $list_alt6);
        register_cyc_api_function(FI_PROVE, $list_alt46, $str_alt47$Attempts_to_prove_SENTENCE_is_tru, NIL, $list_alt48);
        declare_defglobal($hypothesis_mt_table$);
        define_obsolete_register(KILL_CACHED_HYPOTHESIS_MT, NIL);
        declare_defglobal($proof_mt_table$);
        define_test_case_table_int(FI_PROVE_INT, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt92);
        return NIL;
    }

    public static SubLObject setup_prove_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(FI_HYPOTHESIZE, $list4, $str5$Cyc_attempts_to_check_if_SENTENCE, NIL, $list6);
            register_cyc_api_function(FI_PROVE, $list45, $str46$Attempts_to_prove_SENTENCE_is_tru, NIL, $list47);
            declare_defglobal($hypothesis_mt_table$);
            define_obsolete_register(KILL_CACHED_HYPOTHESIS_MT, NIL);
            declare_defglobal($proof_mt_table$);
            define_test_case_table_int(FI_PROVE_INT, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list96);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(FI_PROVE, $list_alt46, $str_alt47$Attempts_to_prove_SENTENCE_is_tru, NIL, $list_alt48);
            define_test_case_table_int(FI_PROVE_INT, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt92);
        }
        return NIL;
    }

    public static SubLObject setup_prove_file_Previous() {
        register_cyc_api_function(FI_HYPOTHESIZE, $list4, $str5$Cyc_attempts_to_check_if_SENTENCE, NIL, $list6);
        register_cyc_api_function(FI_PROVE, $list45, $str46$Attempts_to_prove_SENTENCE_is_tru, NIL, $list47);
        declare_defglobal($hypothesis_mt_table$);
        define_obsolete_register(KILL_CACHED_HYPOTHESIS_MT, NIL);
        declare_defglobal($proof_mt_table$);
        define_test_case_table_int(FI_PROVE_INT, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list96);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_prove_file();
    }

    @Override
    public void initializeVariables() {
        init_prove_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_prove_file();
    }

    static {
    }

    static private final SubLList $list_alt4 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NAME-PREFIX"), makeString("HYP")), makeSymbol("TERM-IDS"));

    static private final SubLString $str_alt5$Cyc_attempts_to_check_if_SENTENCE = makeString("Cyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.");

    static private final SubLList $list_alt6 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));

    static private final SubLString $str_alt8$Expected_a_cons__got__S = makeString("Expected a cons, got ~S");

    static private final SubLString $str_alt9$Expected_a_string__got__S = makeString("Expected a string, got ~S");

    static private final SubLList $list_alt16 = listS(makeSymbol("VARIABLE"), makeSymbol("NEW-TERM-NAME"), makeSymbol("ISA-CONSTRAINTS"));

    static private final SubLList $list_alt19 = cons(makeSymbol("VARIABLE2"), makeSymbol("GENL-CONSTRAINTS"));

    static private final SubLString $str_alt20$Constraint_variable_mismatch_erro = makeString("Constraint variable mismatch error in hypothesis: ~a != ~a");

    static private final SubLList $list_alt21 = cons(makeSymbol("VARIABLE3"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    static private final SubLString $str_alt28$_A__A__A = makeString("~A-~A-~A");

    static private final SubLList $list_alt30 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"));

    static private final SubLList $list_alt33 = cons(makeSymbol("HL-VAR"), makeSymbol("BINDING"));

    static private final SubLList $list_alt34 = cons(makeSymbol("VARIABLE"), makeSymbol("ISA-CONSTRAINTS"));

    static private final SubLSymbol $sym36$_ = makeSymbol("<");

    static private final SubLList $list_alt39 = cons(makeSymbol("VARIABLE"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    static private final SubLList $list_alt40 = cons(makeSymbol("VARIABLE"), makeSymbol("GENL-CONSTRAINTS"));

    static private final SubLList $list_alt46 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str_alt47$Attempts_to_prove_SENTENCE_is_tru = makeString("Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY.");

    static private final SubLList $list_alt48 = list(list(makeSymbol("NIL-OR"), list(makeSymbol("LIST"), makeSymbol("LISTP"))));

    static private final SubLList $list_alt49 = list(makeSymbol("IST"), makeSymbol("IST-MT"), makeSymbol("IST-SENTENCE"));

    static private final SubLString $str_alt50$Expected_an_integer__got__S = makeString("Expected an integer, got ~S");

    public static final SubLSymbol $kw52$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    static private final SubLList $list_alt58 = list(makeSymbol("HYPOTHESIS-MT"), makeSymbol("TERM-BINDINGS"));

    static private final SubLList $list_alt63 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt67 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?SPEC-MT"), reader_make_constant_shell("HypotheticalContext")), list(reader_make_constant_shell("genlMt"), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(reader_make_constant_shell("termDependsOn"), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(reader_make_constant_shell("ephemeralTerm"), makeSymbol("?SPEC-MT")));

    static private final SubLSymbol $sym69$_SPEC_MT = makeSymbol("?SPEC-MT");

    static private final SubLSymbol $sym73$EPHEMERAL_TERM_ = makeSymbol("EPHEMERAL-TERM?");

    static private final SubLList $list_alt76 = list(makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("SENTENCE"));

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt92 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell("implies"), reader_make_constant_shell("True"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell("implies"), reader_make_constant_shell("False"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), reader_make_constant_shell("True")), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), reader_make_constant_shell("False")), reader_make_constant_shell("BaseKB")), NIL, makeKeyword("CONTRADICTION")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and")), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("or")), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), list(reader_make_constant_shell("and"))), reader_make_constant_shell("BaseKB")), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("isa"), makeInteger(212), reader_make_constant_shell("Integer")), list(reader_make_constant_shell("or"))), reader_make_constant_shell("BaseKB")), NIL, makeKeyword("CONTRADICTION")) });
}

/**
 * Total time: 380 ms
 */
