package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$conflicts_from_invalid_deductions$;
import static com.cyc.cycjava.cycl.control_vars.$filter_deductions_for_trivially_derivable_gafs$;
import static com.cyc.cycjava.cycl.control_vars.$forward_inference_removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.control_vars.$ignore_non_definitional_conflictsP$;
import static com.cyc.cycjava.cycl.control_vars.$inference_answer_handler$;
import static com.cyc.cycjava.cycl.control_vars.$record_inconsistent_support_sets$;
import static com.cyc.cycjava.cycl.control_vars.$unbound_rule_backchain_enabled$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;
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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class prove extends SubLTranslatedFile {
    public static final SubLFile me = new prove();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.prove";

    public static final String myFingerPrint = "445b0f7679eb1df4ac234b6092bdf439aea9811f82e5e64699fd80fbb256771e";

    // defparameter
    // Definitions
    // Like @xref *inconsistent-support-sets* except threadsafe
    private static final SubLSymbol $conflicting_support_sets$ = makeSymbol("*CONFLICTING-SUPPORT-SETS*");

    // defparameter
    private static final SubLSymbol $something_asserted_within_hypothesize_termsP$ = makeSymbol("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*");

    // defparameter
    private static final SubLSymbol $fi_prove_new_cyc_query_trampoline_enabledP$ = makeSymbol("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*");

    // defparameter
    /**
     * Switch to control whether or not undirected forward propagation of hypothesis
     * mts is performed.
     */
    public static final SubLSymbol $proof_hypothesis_forward_propagation_enabled$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*");



    // defvar
    // Do we assume the type constraints of the consequent of a proof?
    public static final SubLSymbol $proof_assume_consequent_type_constraintsP$ = makeSymbol("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*");



    // defvar
    public static final SubLSymbol $proof_hypothesis_forward_absolute_time_cutoff$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*");

    // defvar
    public static final SubLSymbol $proof_hypothesis_forward_time_cutoff$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*");

    // defvar
    public static final SubLSymbol $proof_hypothesis_forward_removal_cost_cutoff$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*");

    // defvar
    public static final SubLSymbol $proof_hypothesis_forward_propagation_depth$ = makeSymbol("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*");

    // defparameter
    private static final SubLSymbol $hypothesize_spec_mt_sentence$ = makeSymbol("*HYPOTHESIZE-SPEC-MT-SENTENCE*");

    // defparameter
    private static final SubLSymbol $use_new_non_wff_conflict_supports_explain_methodP$ = makeSymbol("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*");

    // Internal Constants
    public static final SubLSymbol INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");

    public static final SubLString $$$HYP = makeString("HYP");



    public static final SubLSymbol FI_HYPOTHESIZE = makeSymbol("FI-HYPOTHESIZE");

    public static final SubLList $list4 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NAME-PREFIX"), makeString("HYP")), makeSymbol("TERM-IDS"));

    public static final SubLString $str5$Cyc_attempts_to_check_if_SENTENCE = makeString("Cyc attempts to check if SENTENCE is satisfiable in MT by \'hypothesizing\'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully \'hypothesized\'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.");

    public static final SubLList $list6 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));



    public static final SubLString $str8$Expected_a_cons__got__S = makeString("Expected a cons, got ~S");

    public static final SubLString $str9$Expected_a_string__got__S = makeString("Expected a string, got ~S");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLString $str11$ = makeString("");

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));



    public static final SubLSymbol CONFLICT_HANDLER = makeSymbol("CONFLICT-HANDLER");

    public static final SubLList $list16 = listS(makeSymbol("VARIABLE"), makeSymbol("NEW-TERM-NAME"), makeSymbol("ISA-CONSTRAINTS"));

    public static final SubLSymbol $sym17$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");

    private static final SubLObject $$CycLConstant = reader_make_constant_shell(makeString("CycLConstant"));

    public static final SubLList $list19 = cons(makeSymbol("VARIABLE2"), makeSymbol("GENL-CONSTRAINTS"));

    public static final SubLString $str20$Constraint_variable_mismatch_erro = makeString("Constraint variable mismatch error in hypothesis: ~a != ~a");

    public static final SubLList $list21 = cons(makeSymbol("VARIABLE3"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    public static final SubLSymbol $sym22$ANECT_ = makeSymbol("ANECT?");

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));



    private static final SubLString $str29$_A__A__A = makeString("~A-~A-~A");

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLList $list31 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"));

    private static final SubLObject $$hypotheticalTerm = reader_make_constant_shell(makeString("hypotheticalTerm"));

    public static final SubLList $list33 = cons(makeSymbol("VARIABLE"), makeSymbol("ISA-CONSTRAINTS"));

    private static final SubLObject $$CycLReifiableDenotationalTerm = reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm"));

    private static final SubLSymbol $sym35$_ = makeSymbol("<");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    private static final SubLString $$$Term = makeString("Term");

    private static final SubLList $list38 = cons(makeSymbol("VARIABLE"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    public static final SubLList $list39 = cons(makeSymbol("VARIABLE"), makeSymbol("GENL-CONSTRAINTS"));









    private static final SubLSymbol FI_PROVE = makeSymbol("FI-PROVE");

    private static final SubLList $list45 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    private static final SubLString $str46$Attempts_to_prove_SENTENCE_is_tru = makeString("Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY.");

    private static final SubLList $list47 = list(list(makeSymbol("NIL-OR"), list(makeSymbol("LIST"), makeSymbol("LISTP"))));

    public static final SubLList $list48 = list(makeSymbol("IST"), makeSymbol("IST-MT"), makeSymbol("IST-SENTENCE"));

    private static final SubLString $str49$Expected_an_integer__got__S = makeString("Expected an integer, got ~S");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLSymbol $kw51$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLSymbol $hypothesis_mt_table$ = makeSymbol("*HYPOTHESIS-MT-TABLE*");

    private static final SubLList $list57 = list(makeSymbol("HYPOTHESIS-MT"), makeSymbol("TERM-BINDINGS"));

    private static final SubLObject $$HypotheticalContext = reader_make_constant_shell(makeString("HypotheticalContext"));

    private static final SubLString $$$Hypothesis = makeString("Hypothesis");



    private static final SubLSymbol KILL_CACHED_HYPOTHESIS_MT = makeSymbol("KILL-CACHED-HYPOTHESIS-MT");

    private static final SubLList $list62 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol $proof_mt_table$ = makeSymbol("*PROOF-MT-TABLE*");

    private static final SubLString $$$Proof = makeString("Proof");

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLList $list66 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEC-MT"), reader_make_constant_shell(makeString("HypotheticalContext"))), list(reader_make_constant_shell(makeString("genlMt")), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(reader_make_constant_shell(makeString("termDependsOn")), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(reader_make_constant_shell(makeString("ephemeralTerm")), makeSymbol("?SPEC-MT")));



    private static final SubLSymbol $sym68$_SPEC_MT = makeSymbol("?SPEC-MT");

    private static final SubLObject $$highlyRelevantMt = reader_make_constant_shell(makeString("highlyRelevantMt"));

    private static final SubLString $str70$HYP_ = makeString("HYP-");

    private static final SubLSymbol HYPOTHETICAL_CONSTANT = makeSymbol("HYPOTHETICAL-CONSTANT");

    private static final SubLSymbol $sym72$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLSymbol HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");



    private static final SubLSymbol $sym75$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol CONVERT_TO_HL_SUPPORT = makeSymbol("CONVERT-TO-HL-SUPPORT");



    private static final SubLSymbol $sym78$EPHEMERAL_TERM_ = makeSymbol("EPHEMERAL-TERM?");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));



    private static final SubLList $list81 = list(makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("SENTENCE"));





    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));



    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));



    private static final SubLSymbol FI_PROVE_INT = makeSymbol("FI-PROVE-INT");













    private static final SubLList $list96 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer"))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell(makeString("implies")), reader_make_constant_shell(makeString("True")), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer")))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell(makeString("implies")), reader_make_constant_shell(makeString("False")), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer")))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer"))), reader_make_constant_shell(makeString("True"))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer"))), reader_make_constant_shell(makeString("False"))), reader_make_constant_shell(makeString("BaseKB"))), NIL, makeKeyword("CONTRADICTION")), list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and"))), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer")))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("EXHAUST-TOTAL")), list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("or"))), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer")))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer"))), list(reader_make_constant_shell(makeString("and")))), reader_make_constant_shell(makeString("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")), list(list(list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeInteger(212), reader_make_constant_shell(makeString("Integer"))), list(reader_make_constant_shell(makeString("or")))), reader_make_constant_shell(makeString("BaseKB"))), NIL, makeKeyword("CONTRADICTION")) });

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

    public static SubLObject fi_hypothesize(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        return fi.fi($HYPOTHESIZE, sentence, mt, name_prefix, term_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject hypothesize_terms_for_antecedent(final SubLObject antecedent, final SubLObject rules, final SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject free_vars) {
        return hypothesize_terms_int(antecedent, rules, mt, name_prefix, term_ids, NIL, T, free_vars);
    }

    public static SubLObject hypothesize_terms_for_consequent(final SubLObject consequent, final SubLObject mt, final SubLObject term_bindings, final SubLObject free_vars) {
        return nth_value_step_2(nth_value_step_1(FOUR_INTEGER), hypothesize_terms_int(consequent, NIL, mt, $str11$, NIL, term_bindings, NIL, free_vars));
    }

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

    public static SubLObject create_hypothesized_constant(final SubLObject name_prefix, final SubLObject start_name, final SubLObject external_id) {
        assert NIL != stringp(name_prefix) : "Types.stringp(name_prefix) " + "CommonSymbols.NIL != Types.stringp(name_prefix) " + name_prefix;
        assert NIL != stringp(start_name) : "Types.stringp(start_name) " + "CommonSymbols.NIL != Types.stringp(start_name) " + start_name;
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

    public static SubLObject suggest_string_from_fort_el_formula(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        if (NIL != nart_handles.nart_p(fort)) {
            return string_utilities.strcat(Mapping.mapcar(symbol_function(CONSTANT_NAME), list_utilities.delete_if_not(symbol_function(CONSTANT_P), list_utilities.flatten(forts.fort_el_formula(fort)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return NIL;
    }

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

    public static SubLObject new_prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, final SubLObject input_query_mt) {
        return prepare_for_proof(antecedent, consequent, input_query_mt, ZERO_INTEGER);
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

    public static SubLObject prepare_assumption_mt(final SubLObject input_query_mt) {
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return mt_vars.$theory_mt_root$.getGlobalValue();
        }
        if (NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(input_query_mt, $$Always_TimeInterval, $$TimePoint);
        }
        return input_query_mt;
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

    public static SubLObject prepare_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        if (hypothesis_sentence.eql($$True)) {
            return values(mt, NIL, NIL);
        }
        return find_or_create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
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

    public static SubLObject note_hypothesis_mt_term_bindings(final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        assert NIL != hlmt.hlmt_p(hypothesis_mt) : "hlmt.hlmt_p(hypothesis_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(hypothesis_mt) " + hypothesis_mt;
        return NIL;
    }

    public static SubLObject kill_cached_hypothesis_mt(final SubLObject hypothesis_mt) {
        return NIL;
    }

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

    public static SubLObject find_or_create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLObject proof_mt = find_proof_mt(consequent_sentence, hypothesis_mt);
        if (NIL != proof_mt) {
            return values(proof_mt, NIL);
        }
        return create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
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

    public static SubLObject hypothesize_spec_mt(final SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$HYP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
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
    }

    public static SubLObject hypothetical_constant(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str70$HYP_)));
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

    public static SubLObject flatten_explain_hl_why_not_wff(final SubLObject supports) {
        final SubLObject v_answer = flatten_explain_hl_why_not_wff_recursive(supports, NIL);
        return nreverse(v_answer);
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
    }

    public static SubLObject declare_prove_file() {
        declareFunction(me, "prove_justified", "PROVE-JUSTIFIED", 1, 5, false);
        declareFunction(me, "fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false);
        declareFunction(me, "fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false);
        declareFunction(me, "hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false);
        declareFunction(me, "hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false);
        declareFunction(me, "hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false);
        declareFunction(me, "hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false);
        declareFunction(me, "hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false);
        declareFunction(me, "hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false);
        declareFunction(me, "assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false);
        declareFunction(me, "assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false);
        declareFunction(me, "assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false);
        declareFunction(me, "create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false);
        declareFunction(me, "assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false);
        declareFunction(me, "hypothesize_dnf_equality_constraints", "HYPOTHESIZE-DNF-EQUALITY-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "antecedent_dnf_variables_isa_constraints", "ANTECEDENT-DNF-VARIABLES-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "antecedent_dnf_variables_quoted_isa_constraints", "ANTECEDENT-DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "antecedent_dnf_variables_genl_constraints", "ANTECEDENT-DNF-VARIABLES-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false);
        declareFunction(me, "fi_prove", "FI-PROVE", 2, 4, false);
        declareFunction(me, "fi_prove_int", "FI-PROVE-INT", 2, 4, false);
        declareFunction(me, "fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false);
        declareFunction(me, "prove_from", "PROVE-FROM", 3, 4, false);
        declareFunction(me, "prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false);
        declareFunction(me, "prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false);
        declareFunction(me, "new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false);
        declareFunction(me, "prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false);
        declareFunction(me, "prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false);
        declareFunction(me, "prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false);
        declareFunction(me, "prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction(me, "find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction(me, "find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false);
        declareFunction(me, "valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false);
        declareFunction(me, "create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction(me, "create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false);
        declareFunction(me, "note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false);
        declareFunction(me, "kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false);
        declareFunction(me, "prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false);
        declareFunction(me, "find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false);
        declareFunction(me, "find_proof_mt", "FIND-PROOF-MT", 2, 0, false);
        declareFunction(me, "create_proof_mt", "CREATE-PROOF-MT", 3, 0, false);
        declareFunction(me, "create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false);
        declareFunction(me, "forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false);
        declareFunction(me, "hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false);
        declareFunction(me, "hypothetical_constant", "HYPOTHETICAL-CONSTANT", 1, 0, false);
        declareFunction(me, "construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false);
        declareFunction(me, "flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false);
        declareFunction(me, "flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false);
        declareFunction(me, "convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false);
        declareFunction(me, "note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_prove_file() {
        defparameter("*CONFLICTING-SUPPORT-SETS*", NIL);
        defparameter("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", NIL);
        defparameter("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", NIL);
        defparameter("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", NIL);
        deflexical("*HYPOTHESIS-MT-TABLE*", SubLSystemTrampolineFile.maybeDefault($hypothesis_mt_table$, $hypothesis_mt_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER)));
        defvar("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", T);
        deflexical("*PROOF-MT-TABLE*", SubLSystemTrampolineFile.maybeDefault($proof_mt_table$, $proof_mt_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER)));
        defvar("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", $int$120);
        defvar("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", FIVE_INTEGER);
        defvar("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", TWENTY_INTEGER);
        defvar("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", ONE_INTEGER);
        defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list66);
        defparameter("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*", T);
        return NIL;
    }

    public static SubLObject setup_prove_file() {
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

    
}

/**
 * Total time: 380 ms
 */
