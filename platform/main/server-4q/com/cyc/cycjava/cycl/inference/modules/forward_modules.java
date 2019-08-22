package com.cyc.cycjava.cycl.inference.modules;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$unbound_rule_backchain_enabled$;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.default_forward_non_trigger_literal_litP;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class forward_modules extends SubLTranslatedFile {
    public static final SubLFile me = new forward_modules();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.forward_modules";

    public static final String myFingerPrint = "dd3a325d8a9a7a7e20b036b53ac8460ee5b0329bf7869144464dec69d553dc94";

    // defparameter
    // Definitions
    private static final SubLSymbol $forward_modules$ = makeSymbol("*FORWARD-MODULES*");

    // defparameter
    private static final SubLSymbol $forward_tactic_specs$ = makeSymbol("*FORWARD-TACTIC-SPECS*");

    // defparameter
    private static final SubLSymbol $prevent_forward_triggering_via_evaluatable_predicate_antecedent_literalsP$ = makeSymbol("*PREVENT-FORWARD-TRIGGERING-VIA-EVALUATABLE-PREDICATE-ANTECEDENT-LITERALS?*");















    // defvar
    public static final SubLSymbol $gaf_predicate_forward_inference_enabledP$ = makeSymbol("*GAF-PREDICATE-FORWARD-INFERENCE-ENABLED?*");



    public static final SubLList $list1 = list(list(makeSymbol("HL-MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list2 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLList $list6 = list(makeSymbol("DO-FORWARD-MODULES-LIST"));

    public static final SubLSymbol DO_FORWARD_MODULES_LIST = makeSymbol("DO-FORWARD-MODULES-LIST");

    public static final SubLSymbol DO_FORWARD_MODULES = makeSymbol("DO-FORWARD-MODULES");



    private static final SubLSymbol $sym10$TMS_ASSERTION_BEING_REMOVED_ = makeSymbol("TMS-ASSERTION-BEING-REMOVED?");

    private static final SubLSymbol FORWARD_TACTIC_SPEC_RULE = makeSymbol("FORWARD-TACTIC-SPEC-RULE");

    private static final SubLSymbol $sym12$FORWARD_TACTIC_SPEC_ = makeSymbol("FORWARD-TACTIC-SPEC<");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");



    private static final SubLSymbol $FORWARD_TACTIC_SPECS = makeKeyword("FORWARD-TACTIC-SPECS");









    private static final SubLSymbol $FORWARD_NORMAL_POS = makeKeyword("FORWARD-NORMAL-POS");

    private static final SubLList $list21 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NORMAL-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NORMAL-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NORMAL-POS-EXPAND"));

    private static final SubLSymbol $FORWARD_NORMAL_NEG = makeKeyword("FORWARD-NORMAL-NEG");

    private static final SubLList $list23 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NORMAL-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NORMAL-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NORMAL-NEG-EXPAND"));



    public static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-ISA-EXPAND") });

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol FORWARD_INFERENCE_ALL_GENLS = makeSymbol("FORWARD-INFERENCE-ALL-GENLS");

    private static final SubLSymbol $FORWARD_NOT_ISA = makeKeyword("FORWARD-NOT-ISA");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-ISA-EXPAND") });

    private static final SubLSymbol CACHED_ALL_SPECS = makeSymbol("CACHED-ALL-SPECS");

    private static final SubLSymbol $cached_all_specs_caching_state$ = makeSymbol("*CACHED-ALL-SPECS-CACHING-STATE*");



    private static final SubLSymbol CLEAR_CACHED_ALL_SPECS = makeSymbol("CLEAR-CACHED-ALL-SPECS");

    private static final SubLSymbol $FORWARD_QUOTED_ISA = makeKeyword("FORWARD-QUOTED-ISA");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-QUOTED-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-QUOTED-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-QUOTED-ISA-EXPAND") });

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLSymbol $FORWARD_NOT_QUOTED_ISA = makeKeyword("FORWARD-NOT-QUOTED-ISA");

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-QUOTED-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-QUOTED-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-QUOTED-ISA-EXPAND") });



    public static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genls")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLS-EXPAND") });

    private static final SubLSymbol $FORWARD_NOT_GENLS = makeKeyword("FORWARD-NOT-GENLS");

    public static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genls")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLS-EXPAND") });



    public static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlMt")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLMT-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLMT-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLMT-EXPAND") });

    private static final SubLSymbol CACHED_ALL_GENL_MTS = makeSymbol("CACHED-ALL-GENL-MTS");

    private static final SubLSymbol $cached_all_genl_mts_caching_state$ = makeSymbol("*CACHED-ALL-GENL-MTS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_ALL_GENL_MTS = makeSymbol("CLEAR-CACHED-ALL-GENL-MTS");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));



    private static final SubLSymbol $FORWARD_NOT_GENLMT = makeKeyword("FORWARD-NOT-GENLMT");

    public static final SubLList $list53 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlMt")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLMT-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLMT-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLMT-EXPAND") });

    private static final SubLSymbol CACHED_ALL_SPEC_MTS = makeSymbol("CACHED-ALL-SPEC-MTS");

    private static final SubLSymbol $cached_all_spec_mts_caching_state$ = makeSymbol("*CACHED-ALL-SPEC-MTS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_ALL_SPEC_MTS = makeSymbol("CLEAR-CACHED-ALL-SPEC-MTS");

    private static final SubLSymbol $FORWARD_SYMMETRIC_POS = makeKeyword("FORWARD-SYMMETRIC-POS");

    public static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-SYMMETRIC-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-SYMMETRIC-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-SYMMETRIC-POS-EXPAND") });



    private static final SubLList $list60 = list(reader_make_constant_shell(makeString("SymmetricBinaryPredicate")));

    private static final SubLSymbol $FORWARD_SYMMETRIC_NEG = makeKeyword("FORWARD-SYMMETRIC-NEG");

    private static final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-SYMMETRIC-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-SYMMETRIC-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-SYMMETRIC-NEG-EXPAND") });



    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-ASYMMETRIC-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-ASYMMETRIC-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-ASYMMETRIC-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-ASYMMETRIC-EXPAND") });

    public static final SubLList $list65 = list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLList $list66 = list(reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")));

    private static final SubLSymbol $FORWARD_COMMUTATIVE_POS = makeKeyword("FORWARD-COMMUTATIVE-POS");

    private static final SubLList $list68 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-COMMUTATIVE-POS-EXPAND") });

    public static final SubLList $list69 = list(reader_make_constant_shell(makeString("CommutativePredicate")));

    private static final SubLList $list70 = list(reader_make_constant_shell(makeString("PartiallyCommutativePredicate")));

    private static final SubLSymbol $FORWARD_COMMUTATIVE_NEG = makeKeyword("FORWARD-COMMUTATIVE-NEG");

    private static final SubLList $list72 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-COMMUTATIVE-NEG-EXPAND") });

    private static final SubLSymbol $FORWARD_GENLPREDS_GAF = makeKeyword("FORWARD-GENLPREDS-GAF");

    public static final SubLList $list74 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genlPreds")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLPREDS-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLPREDS-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLPREDS-GAF-EXPAND") });

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLSymbol CACHED_ALL_GENL_PREDS = makeSymbol("CACHED-ALL-GENL-PREDS");

    private static final SubLSymbol $cached_all_genl_preds_caching_state$ = makeSymbol("*CACHED-ALL-GENL-PREDS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_ALL_GENL_PREDS = makeSymbol("CLEAR-CACHED-ALL-GENL-PREDS");

    private static final SubLSymbol CACHED_ALL_GENL_INVERSES = makeSymbol("CACHED-ALL-GENL-INVERSES");

    private static final SubLSymbol $cached_all_genl_inverses_caching_state$ = makeSymbol("*CACHED-ALL-GENL-INVERSES-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_ALL_GENL_INVERSES = makeSymbol("CLEAR-CACHED-ALL-GENL-INVERSES");



    private static final SubLSymbol $FORWARD_NOT_GENLPREDS_GAF = makeKeyword("FORWARD-NOT-GENLPREDS-GAF");

    public static final SubLList $list85 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlPreds")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLPREDS-GAF-EXPAND") });

    private static final SubLSymbol $FORWARD_GENLPREDS_POS = makeKeyword("FORWARD-GENLPREDS-POS");

    public static final SubLList $list87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLPREDS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLPREDS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLPREDS-POS-EXPAND") });

    private static final SubLSymbol $FORWARD_GENLINVERSE_GAF = makeKeyword("FORWARD-GENLINVERSE-GAF");

    private static final SubLList $list89 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genlInverse")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLINVERSE-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLINVERSE-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLINVERSE-GAF-EXPAND") });

    private static final SubLSymbol $FORWARD_NOT_GENLINVERSE_GAF = makeKeyword("FORWARD-NOT-GENLINVERSE-GAF");

    private static final SubLList $list91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlInverse")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-EXPAND") });

    private static final SubLSymbol $FORWARD_GENLINVERSE_POS = makeKeyword("FORWARD-GENLINVERSE-POS");

    public static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLINVERSE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLINVERSE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLINVERSE-POS-EXPAND") });



    public static final SubLList $list95 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-NEGATIONPREDS-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NEGATIONPREDS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NEGATIONPREDS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NEGATIONPREDS-EXPAND") });

    private static final SubLSymbol CACHED_ALL_NEGATION_PREDS = makeSymbol("CACHED-ALL-NEGATION-PREDS");

    private static final SubLSymbol $cached_all_negation_preds_caching_state$ = makeSymbol("*CACHED-ALL-NEGATION-PREDS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_ALL_NEGATION_PREDS = makeSymbol("CLEAR-CACHED-ALL-NEGATION-PREDS");

    private static final SubLList $list99 = cons(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING"));



    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));



    private static final SubLList $list103 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-NEGATIONINVERSE-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NEGATIONINVERSE-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NEGATIONINVERSE-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NEGATIONINVERSE-EXPAND") });

    private static final SubLSymbol CACHED_ALL_NEGATION_INVERSES = makeSymbol("CACHED-ALL-NEGATION-INVERSES");

    private static final SubLSymbol $cached_all_negation_inverses_caching_state$ = makeSymbol("*CACHED-ALL-NEGATION-INVERSES-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_ALL_NEGATION_INVERSES = makeSymbol("CLEAR-CACHED-ALL-NEGATION-INVERSES");

    private static final SubLList $list107 = list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    private static final SubLSymbol $FORWARD_EVAL_POS = makeKeyword("FORWARD-EVAL-POS");

    private static final SubLList $list110 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("EXCLUSIVE"), makeSymbol("FORWARD-EVAL-EXCLUSIVE-POS"), makeKeyword("EXPAND"), makeSymbol("FORWARD-EVAL-EXPAND-POS"));

    private static final SubLList $list111 = cons(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?"))), makeKeyword("ANYTHING"));

    private static final SubLSymbol $FORWARD_EVAL_NEG = makeKeyword("FORWARD-EVAL-NEG");

    private static final SubLList $list113 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("EXCLUSIVE"), makeSymbol("FORWARD-EVAL-EXCLUSIVE-NEG"), makeKeyword("EXPAND"), makeSymbol("FORWARD-EVAL-EXPAND-NEG"));

    private static final SubLSymbol $FORWARD_TERM_OF_UNIT = makeKeyword("FORWARD-TERM-OF-UNIT");

    private static final SubLList $list115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-TERM-OF-UNIT-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-TERM-OF-UNIT-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-TERM-OF-UNIT-EXPAND") });

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLSymbol $FORWARD_NAT_FUNCTION = makeKeyword("FORWARD-NAT-FUNCTION");

    private static final SubLList $list118 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NAT-FUNCTION-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NAT-FUNCTION-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NAT-FUNCTION-EXPAND") });

    private static final SubLObject $$natFunction = reader_make_constant_shell(makeString("natFunction"));

    private static final SubLSymbol $FORWARD_GAF_PREDICATE = makeKeyword("FORWARD-GAF-PREDICATE");

    private static final SubLList $list121 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-GAF-PREDICATE-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GAF-PREDICATE-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GAF-PREDICATE-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GAF-PREDICATE-EXPAND") });

    private static final SubLObject $$gafPredicate = reader_make_constant_shell(makeString("gafPredicate"));





    private static final SubLSymbol $FORWARD_UNBOUND_PRED_POS = makeKeyword("FORWARD-UNBOUND-PRED-POS");

    private static final SubLList $list126 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-UNBOUND-PRED-POS-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-UNBOUND-PRED-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-UNBOUND-PRED-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-UNBOUND-PRED-POS-EXPAND") });

    private static final SubLSymbol $FORWARD_UNBOUND_PRED_NEG = makeKeyword("FORWARD-UNBOUND-PRED-NEG");

    private static final SubLList $list128 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-EXPAND") });

    private static final SubLSymbol $FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS = makeKeyword("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS");

    private static final SubLList $list130 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-EXPAND") });

    private static final SubLSymbol $FORWARD_IST_POS = makeKeyword("FORWARD-IST-POS");

    private static final SubLList $list132 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-IST-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-IST-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-IST-POS-EXPAND"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $FORWARD_IST_NEG = makeKeyword("FORWARD-IST-NEG");

    private static final SubLList $list135 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-IST-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-IST-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-IST-NEG-EXPAND"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static SubLObject forward_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($forward_modules$.getDynamicValue(thread));
    }

    public static SubLObject forward_module_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return length($forward_modules$.getDynamicValue(thread));
    }

    public static SubLObject forward_module_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_modules.hl_module_p(v_object)) && (NIL != member(v_object, $forward_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject forward_module(final SubLObject name, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $FORWARD, plist);
        if (NIL == member(item_var, $forward_modules$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $forward_modules$.setDynamicValue(cons(item_var, $forward_modules$.getDynamicValue(thread)), thread);
        }
        return hl_module;
    }

    public static SubLObject undeclare_forward_module(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            inference_modules.remove_hl_module(hl_module);
            $forward_modules$.setDynamicValue(delete(hl_module, $forward_modules$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject do_forward_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, $list6, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_forward_modules_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $forward_modules$.getDynamicValue(thread);
    }

    public static SubLObject forward_examine_asent_triggering_allowedP(final SubLObject examine_asent) {
        return makeBoolean((NIL == default_forward_non_trigger_literal_litP(examine_asent)) && ((NIL == atomic_sentenceP(examine_asent)) || (NIL == relation_evaluation.evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(examine_asent), UNPROVIDED))));
    }

    public static SubLObject forward_module_callback(final SubLObject trigger_asent, final SubLObject trigger_sense, final SubLObject examine_asent, SubLObject trigger_support, final SubLObject rule, SubLObject trigger_supports) {
        if (trigger_supports == UNPROVIDED) {
            trigger_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward.$force_query_supports_in_forward_inferenceP$.getDynamicValue(thread)) {
            if (NIL != forward.current_forward_inference_gaf()) {
                trigger_support = forward.current_forward_inference_gaf();
            }
            if (NIL != trigger_support) {
                trigger_support = arguments.make_hl_support($QUERY, arguments.support_sentence(trigger_support), arguments.support_mt(trigger_support), arguments.support_tv(trigger_support));
                trigger_supports = NIL;
            }
        }
        if (NIL != forward_examine_asent_triggering_allowedP(examine_asent)) {
            $forward_tactic_specs$.setDynamicValue(cons(list(trigger_asent, trigger_sense, examine_asent, trigger_support, rule, trigger_supports), $forward_tactic_specs$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject forward_tactic_specs(final SubLObject source_asent, final SubLObject source_sense, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != forward.forward_inference_allowed_rules()) {
            final SubLObject _prev_bind_0 = $forward_tactic_specs$.currentBinding(thread);
            try {
                $forward_tactic_specs$.bind(NIL, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(propagation_mt);
                final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject cdolist_list_var = forward_hl_modules(source_asent, source_sense);
                    SubLObject forward_hl_module = NIL;
                    forward_hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        forward_hl_module_apply(forward_hl_module, source_asent);
                        cdolist_list_var = cdolist_list_var.rest();
                        forward_hl_module = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
                }
                result = list_utilities.fast_delete_duplicates($forward_tactic_specs$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != tms.tms_any_assertion_being_removedP()) {
                    result = remove_if($sym10$TMS_ASSERTION_BEING_REMOVED_, result, FORWARD_TACTIC_SPEC_RULE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                $forward_tactic_specs$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var2 = wff.assertive_wff_rules();
        SubLObject assertive_wff_rule = NIL;
        assertive_wff_rule = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject possible_assertive_wff_rule_forward_tactic_spec = find(assertive_wff_rule, result, KBEQ, FORWARD_TACTIC_SPEC_RULE, UNPROVIDED, UNPROVIDED);
            if (NIL != possible_assertive_wff_rule_forward_tactic_spec) {
                result = list_utilities.nmove_to_front(possible_assertive_wff_rule_forward_tactic_spec, result, EQUAL);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertive_wff_rule = cdolist_list_var2.first();
        } 
        return result;
    }

    public static SubLObject forward_tactic_spec_rule(final SubLObject forward_tactic_spec) {
        return fifth(forward_tactic_spec);
    }

    public static SubLObject forward_tactic_specL(final SubLObject forward_tactic_spec_1, final SubLObject forward_tactic_spec_2) {
        final SubLObject forward_tactic_spec_1_rule = forward_tactic_spec_rule(forward_tactic_spec_1);
        final SubLObject forward_tactic_spec_1_assertive_wff_ruleP = wff.assertive_wff_ruleP(forward_tactic_spec_1_rule);
        final SubLObject forward_tactic_spec_2_rule = forward_tactic_spec_rule(forward_tactic_spec_2);
        final SubLObject forward_tactic_spec_2_assertive_wff_ruleP = wff.assertive_wff_ruleP(forward_tactic_spec_2_rule);
        if ((NIL != forward_tactic_spec_1_assertive_wff_ruleP) && (NIL == forward_tactic_spec_2_assertive_wff_ruleP)) {
            return T;
        }
        if ((NIL == forward_tactic_spec_1_assertive_wff_ruleP) && (NIL != forward_tactic_spec_2_assertive_wff_ruleP)) {
            return NIL;
        }
        return numL(assertion_handles.assertion_id(forward_tactic_spec_1_rule), assertion_handles.assertion_id(forward_tactic_spec_2_rule));
    }

    public static SubLObject forward_hl_modules(final SubLObject asent, final SubLObject sense) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject hl_modules = NIL;
        SubLObject supplanted_modules = NIL;
        SubLObject exclusive_foundP;
        SubLObject rest;
        SubLObject hl_module;
        SubLObject exclusive_func;
        SubLObject pcase_var;
        SubLObject supplants_info;
        SubLObject cdolist_list_var;
        SubLObject newly_supplanted_module_names;
        SubLObject supplanted_module_name;
        SubLObject supplanted_module;
        SubLObject required_func;
        for (exclusive_foundP = NIL, rest = NIL, rest = do_forward_modules_list(); (NIL == exclusive_foundP) && (NIL != rest); rest = rest.rest()) {
            hl_module = rest.first();
            if (((((NIL != inference_modules.hl_module_activeP(hl_module, NIL)) && ((NIL == supplanted_modules) || (NIL == member(hl_module, supplanted_modules, UNPROVIDED, UNPROVIDED)))) && (NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense))) && (NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, predicate))) && (NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent))) {
                exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                if ((NIL == exclusive_func) || (NIL != funcall(exclusive_func, asent))) {
                    if (NIL != exclusive_func) {
                        supplants_info = pcase_var = inference_modules.hl_module_supplants_info(hl_module);
                        if (pcase_var.eql($ALL)) {
                            hl_modules = NIL;
                            exclusive_foundP = T;
                        } else {
                            newly_supplanted_module_names = cdolist_list_var = supplants_info;
                            supplanted_module_name = NIL;
                            supplanted_module_name = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                supplanted_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                                if (NIL != supplanted_module) {
                                    supplanted_modules = cons(supplanted_module, supplanted_modules);
                                    hl_modules = list_utilities.delete_first(supplanted_module, hl_modules, symbol_function(EQL));
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                supplanted_module_name = cdolist_list_var.first();
                            } 
                        }
                    }
                    required_func = inference_modules.hl_module_required_func(hl_module);
                    if ((NIL == required_func) || (NIL != funcall(required_func, asent))) {
                        hl_modules = cons(hl_module, hl_modules);
                    }
                }
            }
        }
        return nreverse(hl_modules);
    }

    public static SubLObject forward_hl_module_apply(final SubLObject forward_hl_module, final SubLObject source_asent) {
        final SubLObject candidate_rules = forward_hl_module_rule_select(forward_hl_module, source_asent);
        final SubLObject rules = (NIL != candidate_rules) ? forward_hl_module_rule_filter(forward_hl_module, source_asent, candidate_rules) : NIL;
        return forward_hl_module_expand(forward_hl_module, source_asent, rules);
    }

    public static SubLObject forward_inference_rule_select_via_allowed_rulesP() {
        return makeBoolean((NIL == forward.forward_inference_all_rules_allowedP()) && forward.forward_inference_allowed_rules().isList());
    }

    public static SubLObject forward_hl_module_rule_select(final SubLObject forward_hl_module, final SubLObject source_asent) {
        if (NIL != forward_inference_rule_select_via_allowed_rulesP()) {
            return forward.forward_inference_allowed_rules();
        }
        final SubLObject rule_select_method = inference_modules.hl_module_rule_select_func(forward_hl_module);
        return rule_select_method.isFunctionSpec() ? funcall(rule_select_method, source_asent) : NIL;
    }

    public static SubLObject forward_hl_module_rule_filter(final SubLObject forward_hl_module, final SubLObject source_asent, SubLObject rules) {
        if (NIL != forward_inference_rule_select_via_allowed_rulesP()) {
            final SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func(forward_hl_module);
            if (rule_filter_method.isFunctionSpec()) {
                SubLObject filtered_rules = NIL;
                SubLObject cdolist_list_var = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != funcall(rule_filter_method, source_asent, rule)) {
                        filtered_rules = cons(rule, filtered_rules);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                } 
                rules = nreverse(filtered_rules);
            }
        }
        return rules;
    }

    public static SubLObject forward_hl_module_expand(final SubLObject forward_hl_module, final SubLObject source_asent, final SubLObject rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expand_function = inference_modules.hl_module_expand_func(forward_hl_module);
        if (expand_function.isFunctionSpec()) {
            final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
            final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
            final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
            final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
            }
            final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
            final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
            final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
            final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
            try {
                hl_macros.$forward_inference_metric_last_metric_type$.bind($FORWARD_TACTIC_SPECS, thread);
                hl_macros.$forward_inference_metric_last_metric$.bind(expand_function, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind($NO_RULE, thread);
                try {
                    SubLObject cdolist_list_var = rules;
                    SubLObject rule = NIL;
                    rule = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        funcall(expand_function, source_asent, rule);
                        cdolist_list_var = cdolist_list_var.rest();
                        rule = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        inference_metrics.increment_forward_inference_metrics($FORWARD_TACTIC_SPECS, expand_function, NIL, $NO_RULE, NIL);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject all_antecedent_predicate_forward_rules(final SubLObject pred) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, $NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, $NEG, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$4 = NIL;
                            final SubLObject token_var_$5 = NIL;
                            while (NIL == done_var_$4) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(rule));
                                if (NIL != valid_$6) {
                                    rules = cons(rule, rules);
                                }
                                done_var_$4 = makeBoolean(NIL == valid_$6);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        rules = list_utilities.fast_delete_duplicates(rules, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return rules;
    }

    public static SubLObject all_consequent_predicate_forward_rules(final SubLObject pred) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, $POS, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, $POS, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$7 = NIL;
                            final SubLObject token_var_$8 = NIL;
                            while (NIL == done_var_$7) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(rule));
                                if (NIL != valid_$9) {
                                    rules = cons(rule, rules);
                                }
                                done_var_$7 = makeBoolean(NIL == valid_$9);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        rules = list_utilities.fast_delete_duplicates(rules, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return rules;
    }

    public static SubLObject all_ist_predicate_forward_rules(final SubLObject pred) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED);
            SubLObject genl_pred = NIL;
            genl_pred = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                if (NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(genl_pred, NIL, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(genl_pred, NIL, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$11 = NIL;
                                final SubLObject token_var_$12 = NIL;
                                while (NIL == done_var_$11) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(rule));
                                    if (NIL != valid_$13) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$11 = makeBoolean(NIL == valid_$13);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                genl_pred = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        rules = list_utilities.fast_delete_duplicates(rules, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return rules;
    }

    public static SubLObject forward_normal_pos_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_normal_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_normal_pos_expand(final SubLObject asent, final SubLObject rule) {
        SubLObject cdolist_list_var = forward_normal_pos_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forward_module_callback(asent, $POS, examine_lit, NIL, rule, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_normal_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_normal_neg_rule_select(final SubLObject asent) {
        return all_consequent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_normal_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_expand_int(asent, rule, T);
    }

    public static SubLObject forward_normal_neg_expand(final SubLObject asent, final SubLObject rule) {
        SubLObject cdolist_list_var = forward_normal_neg_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forward_module_callback(asent, $NEG, examine_lit, NIL, rule, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_normal_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = forward_inference_all_genls(col);
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(genl, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$15 = NIL;
                                final SubLObject token_var_$16 = NIL;
                                while (NIL == done_var_$15) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                    final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(rule));
                                    if (NIL != valid_$17) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$15 = makeBoolean(NIL == valid_$17);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                direction = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_isa_expand_int(asent, rule, T);
    }

    public static SubLObject forward_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_isa_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                final SubLObject forward_asent = list($$isa, arg1, genl);
                final SubLObject more_supports = (genl.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLS, list($$genls, arg2, genl), UNPROVIDED, UNPROVIDED));
                forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_col)) && (NIL != forward_inference_genlP(source_col, rule_col))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_inference_genlP(final SubLObject source_col, final SubLObject rule_col) {
        return list_utilities.member_kbeqP(rule_col, forward_inference_all_genls(source_col));
    }

    public static SubLObject forward_inference_all_genls_internal(final SubLObject col) {
        return genls.all_genls(col, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject forward_inference_all_genls(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return forward_inference_all_genls_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORWARD_INFERENCE_ALL_GENLS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORWARD_INFERENCE_ALL_GENLS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FORWARD_INFERENCE_ALL_GENLS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(forward_inference_all_genls_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cached_all_specs() {
        final SubLObject cs = $cached_all_specs_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_specs(final SubLObject col) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_specs_caching_state$.getGlobalValue(), list(col), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_specs_internal(final SubLObject col) {
        return genls.all_specs(col, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_specs(final SubLObject col) {
        SubLObject caching_state = $cached_all_specs_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_SPECS, $cached_all_specs_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_CACHED_ALL_SPECS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_specs_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forward_not_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_specs(col);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(spec, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(spec, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$19 = NIL;
                                final SubLObject token_var_$20 = NIL;
                                while (NIL == done_var_$19) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(rule));
                                    if (NIL != valid_$21) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$19 = makeBoolean(NIL == valid_$21);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                direction = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_not_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_isa_expand_int(asent, rule, T);
    }

    public static SubLObject forward_not_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_not_isa_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                final SubLObject forward_asent = list($$isa, arg1, spec);
                final SubLObject more_supports = (spec.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLS, list($$genls, spec, arg2), UNPROVIDED, UNPROVIDED));
                forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_not_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_specs = cached_all_specs(source_col);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_col)) && (NIL != list_utilities.member_kbeqP(rule_col, all_specs))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_quoted_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = forward_inference_all_genls(col);
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$22 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$22.first();
            while (NIL != cdolist_list_var_$22) {
                if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(genl, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$23 = NIL;
                                final SubLObject token_var_$24 = NIL;
                                while (NIL == done_var_$23) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                    final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(rule));
                                    if (NIL != valid_$25) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$23 = makeBoolean(NIL == valid_$25);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                direction = cdolist_list_var_$22.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_quoted_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_quoted_isa_expand_int(asent, rule, T);
    }

    public static SubLObject forward_quoted_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_quoted_isa_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                final SubLObject forward_asent = list($$quotedIsa, arg1, genl);
                final SubLObject more_supports = (genl.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLS, list($$genls, arg2, genl), UNPROVIDED, UNPROVIDED));
                forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_quoted_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$quotedIsa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_col)) && (NIL != forward_inference_genlP(source_col, rule_col))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_not_quoted_isa_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_specs(col);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$26 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$26.first();
            while (NIL != cdolist_list_var_$26) {
                if (NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(spec, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(spec, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$27 = NIL;
                                final SubLObject token_var_$28 = NIL;
                                while (NIL == done_var_$27) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                    final SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(rule));
                                    if (NIL != valid_$29) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$27 = makeBoolean(NIL == valid_$29);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                direction = cdolist_list_var_$26.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_not_quoted_isa_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_quoted_isa_expand_int(asent, rule, T);
    }

    public static SubLObject forward_not_quoted_isa_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_not_quoted_isa_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                final SubLObject forward_asent = list($$quotedIsa, arg1, spec);
                final SubLObject more_supports = (spec.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLS, list($$genls, spec, arg2), UNPROVIDED, UNPROVIDED));
                forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_not_quoted_isa_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_specs = cached_all_specs(source_col);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$quotedIsa.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_col)) && (NIL != list_utilities.member_kbeqP(rule_col, all_specs))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_genls_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = forward_inference_all_genls(col);
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$30.first();
            while (NIL != cdolist_list_var_$30) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(genl, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(genl, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$31 = NIL;
                                final SubLObject token_var_$32 = NIL;
                                while (NIL == done_var_$31) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                    final SubLObject valid_$33 = makeBoolean(!token_var_$32.eql(rule));
                                    if (NIL != valid_$33) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$31 = makeBoolean(NIL == valid_$33);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                direction = cdolist_list_var_$30.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_genls_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genls_expand_int(asent, rule, T);
    }

    public static SubLObject forward_genls_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_genls_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                final SubLObject forward_asent = list($$genls, arg1, genl);
                final SubLObject more_supports = (genl.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLS, list($$genls, arg2, genl), UNPROVIDED, UNPROVIDED));
                forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_genls_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_col)) && (NIL != forward_inference_genlP(source_col, rule_col))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_not_genls_rule_select(final SubLObject asent) {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_specs(col);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$34 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(spec, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(spec, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$35 = NIL;
                                final SubLObject token_var_$36 = NIL;
                                while (NIL == done_var_$35) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                    final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(rule));
                                    if (NIL != valid_$37) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$35 = makeBoolean(NIL == valid_$37);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                direction = cdolist_list_var_$34.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_not_genls_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_genls_expand_int(asent, rule, T);
    }

    public static SubLObject forward_not_genls_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_genls_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject spec = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                final SubLObject forward_asent = list($$genls, arg1, spec);
                final SubLObject more_supports = (spec.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLS, list($$genls, spec, arg2), UNPROVIDED, UNPROVIDED));
                forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_not_genls_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_specs = cached_all_specs(source_col);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_col;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$genls.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_col)) && (NIL != list_utilities.member_kbeqP(rule_col, all_specs))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject clear_cached_all_genl_mts() {
        final SubLObject cs = $cached_all_genl_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_genl_mts(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_genl_mts_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_genl_mts_internal(final SubLObject mt) {
        return genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_genl_mts(final SubLObject mt) {
        SubLObject caching_state = $cached_all_genl_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_GENL_MTS, $cached_all_genl_mts_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_CACHED_ALL_GENL_MTS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_genl_mts_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forward_genlmt_rule_select(final SubLObject asent) {
        final SubLObject mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_genl_mts(mt);
        SubLObject genl_mt = NIL;
        genl_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$38 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$38.first();
            while (NIL != cdolist_list_var_$38) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, $NEG, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, $NEG, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$39 = NIL;
                                final SubLObject token_var_$40 = NIL;
                                while (NIL == done_var_$39) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                    final SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(rule));
                                    if (NIL != valid_$41) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$39 = makeBoolean(NIL == valid_$41);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                direction = cdolist_list_var_$38.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            genl_mt = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_genlmt_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlmt_expand_int(asent, rule, T);
    }

    public static SubLObject forward_genlmt_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlmt_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject genl_mt = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
            final SubLObject forward_asent = list($$genlMt, arg1, genl_mt);
            final SubLObject more_supports = (genl_mt.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLMT, list($$genlMt, arg2, genl_mt), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_genlmt_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_genl_mts = cached_all_genl_mts(source_mt);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_mt;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_mt = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_mt)) && (NIL != (NIL != forts.fort_p(rule_mt) ? list_utilities.member_kbeqP(rule_mt, all_genl_mts) : genl_mts.genl_mtP(source_mt, rule_mt, UNPROVIDED, UNPROVIDED)))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject clear_cached_all_spec_mts() {
        final SubLObject cs = $cached_all_spec_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_spec_mts(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_spec_mts_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_spec_mts_internal(final SubLObject mt) {
        return genl_mts.all_spec_mts(mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_spec_mts(final SubLObject mt) {
        SubLObject caching_state = $cached_all_spec_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_SPEC_MTS, $cached_all_spec_mts_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_CACHED_ALL_SPEC_MTS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_spec_mts_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forward_not_genlmt_rule_select(final SubLObject asent) {
        final SubLObject mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_spec_mts(mt);
        SubLObject spec_mt = NIL;
        spec_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$42 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            direction = cdolist_list_var_$42.first();
            while (NIL != cdolist_list_var_$42) {
                if (NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(spec_mt, $POS, direction)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(spec_mt, $POS, direction);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                SubLObject done_var_$43 = NIL;
                                final SubLObject token_var_$44 = NIL;
                                while (NIL == done_var_$43) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                    final SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(rule));
                                    if (NIL != valid_$45) {
                                        rules = cons(rule, rules);
                                    }
                                    done_var_$43 = makeBoolean(NIL == valid_$45);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                direction = cdolist_list_var_$42.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_mt = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_not_genlmt_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_not_genlmt_expand_int(asent, rule, T);
    }

    public static SubLObject forward_not_genlmt_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_not_genlmt_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject spec_mt = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
            final SubLObject forward_asent = list($$genlMt, spec_mt, arg1);
            final SubLObject more_supports = (spec_mt.eql(arg2)) ? NIL : list(arguments.make_hl_support($GENLMT, list($$genlMt, spec_mt, arg2), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_not_genlmt_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject source_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_spec_mts = cached_all_spec_mts(source_mt);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_mt;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if ($$genlMt.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_mt = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_mt)) && (NIL != (NIL != forts.fort_p(rule_mt) ? list_utilities.member_kbeqP(rule_mt, all_spec_mts) : genl_mts.spec_mtP(source_mt, rule_mt, UNPROVIDED)))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_symmetric_pos_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_symmetric_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_symmetric_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_symmetric_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal(asent);
        final SubLObject more_supports = list(arguments.make_hl_support($ISA, listS($$isa, pred, $list60), UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = forward_symmetric_pos_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_symmetric_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_symmetric_neg_rule_select(final SubLObject asent) {
        return all_consequent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_symmetric_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_symmetric_neg_expand_int(asent, rule, T);
    }

    public static SubLObject forward_symmetric_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal(asent);
        final SubLObject more_supports = list(arguments.make_hl_support($ISA, listS($$isa, pred, $list60), UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = forward_symmetric_neg_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_symmetric_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_asymmetric_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list65;
        return makeBoolean((NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) && (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern)));
    }

    public static SubLObject forward_asymmetric_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_asymmetric_rule_filter(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread)) || (NIL != list_utilities.lengthG(pragma_induction.rule_pos_lits(rule), ONE_INTEGER, UNPROVIDED))) {
            return forward_asymmetric_expand_int(asent, rule, T);
        }
        return NIL;
    }

    public static SubLObject forward_asymmetric_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject forward_asent = removal_modules_symmetry.symmetric_literal(asent);
        final SubLObject more_supports = list(arguments.make_hl_support($ISA, listS($$isa, pred, $list66), UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = forward_asymmetric_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_asymmetric_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_commutative_pos_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_commutative_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_commutative_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_commutative_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject more_supports = (NIL != inference_trampolines.inference_commutative_predicate_p(pred)) ? list(arguments.make_hl_support($ISA, listS($$isa, pred, $list69), UNPROVIDED, UNPROVIDED)) : list(arguments.make_hl_support($ISA, listS($$isa, pred, $list70), UNPROVIDED, UNPROVIDED));
        if (NIL != el_binary_formula_p(asent)) {
            final SubLObject forward_asent = removal_modules_symmetry.symmetric_asent(asent);
            SubLObject cdolist_list_var = forward_commutative_pos_expand_int(forward_asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject forward_asent2 = NIL;
            forward_asent2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!forward_asent2.equal(asent)) {
                    SubLObject cdolist_list_var_$46 = forward_commutative_pos_expand_int(forward_asent2, rule, UNPROVIDED);
                    SubLObject examine_lit2 = NIL;
                    examine_lit2 = cdolist_list_var_$46.first();
                    while (NIL != cdolist_list_var_$46) {
                        forward_module_callback(forward_asent2, $POS, examine_lit2, NIL, rule, more_supports);
                        cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                        examine_lit2 = cdolist_list_var_$46.first();
                    } 
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                forward_asent2 = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static SubLObject forward_commutative_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_commutative_neg_rule_select(final SubLObject asent) {
        return all_consequent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_commutative_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_commutative_neg_expand_int(asent, rule, T);
    }

    public static SubLObject forward_commutative_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject more_supports = (NIL != inference_trampolines.inference_commutative_predicate_p(pred)) ? list(arguments.make_hl_support($ISA, listS($$isa, pred, $list69), UNPROVIDED, UNPROVIDED)) : list(arguments.make_hl_support($ISA, listS($$isa, pred, $list70), UNPROVIDED, UNPROVIDED));
        if (NIL != el_binary_formula_p(asent)) {
            final SubLObject forward_asent = removal_modules_symmetry.symmetric_asent(asent);
            SubLObject cdolist_list_var = forward_commutative_neg_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var2 = cycl_utilities.formula_commutative_permutations(asent, UNPROVIDED);
            SubLObject forward_asent2 = NIL;
            forward_asent2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (!forward_asent2.equal(asent)) {
                    SubLObject cdolist_list_var_$47 = forward_commutative_neg_expand_int(asent, rule, UNPROVIDED);
                    SubLObject examine_lit2 = NIL;
                    examine_lit2 = cdolist_list_var_$47.first();
                    while (NIL != cdolist_list_var_$47) {
                        forward_module_callback(forward_asent2, $NEG, examine_lit2, NIL, rule, more_supports);
                        cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                        examine_lit2 = cdolist_list_var_$47.first();
                    } 
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                forward_asent2 = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static SubLObject forward_commutative_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = pred;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_genlpreds_gaf_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        final SubLObject genl_preds = remove(pred, cached_all_genl_preds(pred), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($$genlPreds, $NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($$genlPreds, $NEG, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$48 = NIL;
                            final SubLObject token_var_$49 = NIL;
                            while (NIL == done_var_$48) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$49);
                                final SubLObject valid_$50 = makeBoolean(!token_var_$49.eql(rule));
                                if (NIL != valid_$50) {
                                    SubLObject selectedP = NIL;
                                    final SubLObject predicate_var = $$genlPreds;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = NIL, rest = clauses.neg_lits(cnf_var); (NIL == selectedP) && (NIL != rest); rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                                            if (NIL != list_utilities.member_kbeqP(rule_pred, genl_preds)) {
                                                rules = cons(rule, rules);
                                                selectedP = T;
                                            }
                                        }
                                    }
                                }
                                done_var_$48 = makeBoolean(NIL == valid_$50);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        final SubLObject genl_inverses = cached_all_genl_inverses(pred);
        cdolist_list_var = backward_utilities.relevant_directions();
        direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($$genlInverse, $NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($$genlInverse, $NEG, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$49 = NIL;
                            final SubLObject token_var_$50 = NIL;
                            while (NIL == done_var_$49) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                final SubLObject valid_$51 = makeBoolean(!token_var_$50.eql(rule));
                                if (NIL != valid_$51) {
                                    SubLObject selectedP = NIL;
                                    final SubLObject predicate_var = $$genlInverse;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = NIL, rest = clauses.neg_lits(cnf_var); (NIL == selectedP) && (NIL != rest); rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                                            if (NIL != list_utilities.member_kbeqP(rule_pred, genl_inverses)) {
                                                rules = cons(rule, rules);
                                                selectedP = T;
                                            }
                                        }
                                    }
                                }
                                done_var_$49 = makeBoolean(NIL == valid_$51);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject clear_cached_all_genl_preds() {
        final SubLObject cs = $cached_all_genl_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_genl_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_genl_preds_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_genl_preds_internal(final SubLObject pred) {
        return genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_genl_preds(final SubLObject pred) {
        SubLObject caching_state = $cached_all_genl_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_GENL_PREDS, $cached_all_genl_preds_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_CACHED_ALL_GENL_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_genl_preds_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cached_all_genl_inverses() {
        final SubLObject cs = $cached_all_genl_inverses_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_genl_inverses(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_genl_inverses_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_genl_inverses_internal(final SubLObject pred) {
        return genl_predicates.all_genl_inverses(pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_genl_inverses(final SubLObject pred) {
        SubLObject caching_state = $cached_all_genl_inverses_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_GENL_INVERSES, $cached_all_genl_inverses_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_CACHED_ALL_GENL_INVERSES);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_genl_inverses_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forward_genlpreds_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlpreds_gaf_expand_int(asent, rule, T);
    }

    public static SubLObject forward_genlpreds_gaf_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlpreds_gaf_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject examine_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject genl_pred_or_inverse = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
            final SubLObject forward_asent = list(examine_pred, arg1, genl_pred_or_inverse);
            final SubLObject more_supports = list(arguments.make_hl_support($GENLPREDS, list(examine_pred, arg2, genl_pred_or_inverse), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_genlpreds_gaf_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_genl_preds = cached_all_genl_preds(pred);
        final SubLObject all_genl_inverses = cached_all_genl_inverses(pred);
        SubLObject examine_lits = NIL;
        SubLObject predicate_var = $$genlPreds;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_pred)) && (NIL != list_utilities.member_kbeqP(rule_pred, all_genl_preds))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        predicate_var = $$genlInverse;
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_pred)) && (NIL != list_utilities.member_kbeqP(rule_pred, all_genl_inverses))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_not_genlpreds_gaf_rule_select(final SubLObject asent) {
        return forward_normal_neg_rule_select(asent);
    }

    public static SubLObject forward_not_genlpreds_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_rule_filter(asent, rule);
    }

    public static SubLObject forward_not_genlpreds_gaf_expand(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_expand(asent, rule);
    }

    public static SubLObject forward_genlpreds_pos_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = remove(pred, cached_all_genl_preds(pred), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject genl_pred = NIL;
        genl_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == hl_supports.hl_predicate_p(genl_pred)) {
                SubLObject cdolist_list_var_$54 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$54.first();
                while (NIL != cdolist_list_var_$54) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(genl_pred, $NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(genl_pred, $NEG, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$55 = NIL;
                                    final SubLObject token_var_$56 = NIL;
                                    while (NIL == done_var_$55) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                        final SubLObject valid_$57 = makeBoolean(!token_var_$56.eql(rule));
                                        if (NIL != valid_$57) {
                                            rules = cons(rule, rules);
                                        }
                                        done_var_$55 = makeBoolean(NIL == valid_$57);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                    direction = cdolist_list_var_$54.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_genlpreds_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlpreds_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_genlpreds_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlpreds_pos_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = bq_cons(genl_pred, append(args, NIL));
            final SubLObject more_supports = list(arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, genl_pred), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_genlpreds_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject all_genl_preds = cached_all_genl_preds(pred);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if ((((NIL != variables.fully_bound_p(rule_pred)) && (!pred.eql(rule_pred))) && (NIL == hl_supports.hl_predicate_p(rule_pred))) && (NIL != list_utilities.member_kbeqP(rule_pred, all_genl_preds))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_genlinverse_gaf_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject rules = NIL;
        final SubLObject genl_preds = remove(pred, cached_all_genl_preds(pred), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($$genlInverse, $NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($$genlInverse, $NEG, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$58 = NIL;
                            final SubLObject token_var_$59 = NIL;
                            while (NIL == done_var_$58) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(rule));
                                if (NIL != valid_$60) {
                                    SubLObject selectedP = NIL;
                                    final SubLObject predicate_var = $$genlPreds;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = NIL, rest = clauses.neg_lits(cnf_var); (NIL == selectedP) && (NIL != rest); rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                                            if (NIL != list_utilities.member_kbeqP(rule_pred, genl_preds)) {
                                                rules = cons(rule, rules);
                                                selectedP = T;
                                            }
                                        }
                                    }
                                }
                                done_var_$58 = makeBoolean(NIL == valid_$60);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        final SubLObject genl_inverses = cached_all_genl_inverses(pred);
        cdolist_list_var = backward_utilities.relevant_directions();
        direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($$genlPreds, $NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($$genlPreds, $NEG, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$59 = NIL;
                            final SubLObject token_var_$60 = NIL;
                            while (NIL == done_var_$59) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$60);
                                final SubLObject valid_$61 = makeBoolean(!token_var_$60.eql(rule));
                                if (NIL != valid_$61) {
                                    SubLObject selectedP = NIL;
                                    final SubLObject predicate_var = $$genlInverse;
                                    final SubLObject assertion_var = rule;
                                    final SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                    SubLObject rest;
                                    SubLObject lit;
                                    SubLObject rule_pred;
                                    for (rest = NIL, rest = clauses.neg_lits(cnf_var); (NIL == selectedP) && (NIL != rest); rest = rest.rest()) {
                                        lit = rest.first();
                                        if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                                            rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                                            if (NIL != list_utilities.member_kbeqP(rule_pred, genl_inverses)) {
                                                rules = cons(rule, rules);
                                                selectedP = T;
                                            }
                                        }
                                    }
                                }
                                done_var_$59 = makeBoolean(NIL == valid_$61);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_genlinverse_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlinverse_gaf_expand_int(asent, rule, T);
    }

    public static SubLObject forward_genlinverse_gaf_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlinverse_gaf_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject examine_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject genl_pred_or_inverse = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
            final SubLObject forward_asent = list(examine_pred, arg1, genl_pred_or_inverse);
            final SubLObject more_supports = (examine_pred.eql($$genlInverse)) ? list(arguments.make_hl_support($GENLPREDS, list($$genlPreds, arg2, genl_pred_or_inverse), UNPROVIDED, UNPROVIDED)) : list(arguments.make_hl_support($GENLPREDS, list($$genlInverse, arg2, genl_pred_or_inverse), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_genlinverse_gaf_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject all_genl_preds = cached_all_genl_preds(pred);
        final SubLObject all_genl_inverses = cached_all_genl_inverses(pred);
        SubLObject examine_lits = NIL;
        SubLObject predicate_var = $$genlInverse;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_pred)) && (NIL != list_utilities.member_kbeqP(rule_pred, all_genl_preds))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        predicate_var = $$genlPreds;
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                if ((NIL != variables.fully_bound_p(rule_pred)) && (NIL != list_utilities.member_kbeqP(rule_pred, all_genl_inverses))) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_not_genlinverse_gaf_rule_select(final SubLObject asent) {
        return forward_normal_neg_rule_select(asent);
    }

    public static SubLObject forward_not_genlinverse_gaf_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_rule_filter(asent, rule);
    }

    public static SubLObject forward_not_genlinverse_gaf_expand(final SubLObject asent, final SubLObject rule) {
        return forward_normal_neg_expand(asent, rule);
    }

    public static SubLObject forward_genlinverse_pos_rule_select(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_genl_inverses(pred);
        SubLObject genl_inverse = NIL;
        genl_inverse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == hl_supports.hl_predicate_p(genl_inverse)) {
                SubLObject cdolist_list_var_$64 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$64.first();
                while (NIL != cdolist_list_var_$64) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(genl_inverse, $NEG, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(genl_inverse, $NEG, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$65 = NIL;
                                    final SubLObject token_var_$66 = NIL;
                                    while (NIL == done_var_$65) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                        final SubLObject valid_$67 = makeBoolean(!token_var_$66.eql(rule));
                                        if (NIL != valid_$67) {
                                            rules = cons(rule, rules);
                                        }
                                        done_var_$65 = makeBoolean(NIL == valid_$67);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                    direction = cdolist_list_var_$64.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_inverse = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_genlinverse_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_genlinverse_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_genlinverse_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_genlinverse_pos_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject genl_inverse = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = list(genl_inverse, arg2, arg1);
            final SubLObject more_supports = list(arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, genl_inverse), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_genlinverse_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject all_genl_inverses = cached_all_genl_inverses(pred);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (((NIL != variables.fully_bound_p(rule_pred)) && (NIL == hl_supports.hl_predicate_p(rule_pred))) && (NIL != list_utilities.member_kbeqP(rule_pred, all_genl_inverses))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject clear_cached_all_negation_preds() {
        final SubLObject cs = $cached_all_negation_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_negation_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_negation_preds_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_negation_preds_internal(final SubLObject pred) {
        return negation_predicate.all_negation_preds(pred, UNPROVIDED);
    }

    public static SubLObject cached_all_negation_preds(final SubLObject pred) {
        SubLObject caching_state = $cached_all_negation_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_NEGATION_PREDS, $cached_all_negation_preds_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_CACHED_ALL_NEGATION_PREDS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_negation_preds_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forward_negationpreds_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) {
            final SubLObject pattern = $list99;
            return formula_pattern_match.formula_matches_pattern(asent, pattern);
        }
        return NIL;
    }

    public static SubLObject forward_negationpreds_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_negation_preds(pred);
        SubLObject negation_pred = NIL;
        negation_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == hl_supports.hl_predicate_p(negation_pred)) {
                SubLObject cdolist_list_var_$68 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$68.first();
                while (NIL != cdolist_list_var_$68) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(negation_pred, $POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(negation_pred, $POS, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$69 = NIL;
                                    final SubLObject token_var_$70 = NIL;
                                    while (NIL == done_var_$69) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                        final SubLObject valid_$71 = makeBoolean(!token_var_$70.eql(rule));
                                        if ((NIL != valid_$71) && ((NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread)) || (NIL != list_utilities.lengthG(pragma_induction.rule_pos_lits(rule), ONE_INTEGER, UNPROVIDED)))) {
                                            rules = cons(rule, rules);
                                        }
                                        done_var_$69 = makeBoolean(NIL == valid_$71);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                    direction = cdolist_list_var_$68.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            negation_pred = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_negationpreds_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_negationpreds_expand_int(asent, rule, T);
    }

    public static SubLObject forward_negationpreds_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_negationpreds_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject negation_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = bq_cons(negation_pred, append(args, NIL));
            final SubLObject more_supports = list(arguments.make_hl_support($NEGATIONPREDS, list($$negationPreds, pred, negation_pred), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_negationpreds_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject negation_preds = cached_all_negation_preds(pred);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (((NIL != variables.fully_bound_p(rule_pred)) && (NIL == hl_supports.hl_predicate_p(rule_pred))) && (NIL != list_utilities.member_kbeqP(rule_pred, negation_preds))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject clear_cached_all_negation_inverses() {
        final SubLObject cs = $cached_all_negation_inverses_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_all_negation_inverses(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_negation_inverses_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_negation_inverses_internal(final SubLObject pred) {
        return negation_predicate.all_negation_inverses(pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_all_negation_inverses(final SubLObject pred) {
        SubLObject caching_state = $cached_all_negation_inverses_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ALL_NEGATION_INVERSES, $cached_all_negation_inverses_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_CACHED_ALL_NEGATION_INVERSES);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_all_negation_inverses_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forward_negationinverse_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)) {
            final SubLObject pattern = $list107;
            return formula_pattern_match.formula_matches_pattern(asent, pattern);
        }
        return NIL;
    }

    public static SubLObject forward_negationinverse_rule_select(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = cached_all_negation_inverses(pred);
        SubLObject negation_inverse = NIL;
        negation_inverse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == hl_supports.hl_predicate_p(negation_inverse)) {
                SubLObject cdolist_list_var_$72 = backward_utilities.relevant_directions();
                SubLObject direction = NIL;
                direction = cdolist_list_var_$72.first();
                while (NIL != cdolist_list_var_$72) {
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(negation_inverse, $POS, direction)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(negation_inverse, $POS, direction);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                                    SubLObject done_var_$73 = NIL;
                                    final SubLObject token_var_$74 = NIL;
                                    while (NIL == done_var_$73) {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$74);
                                        final SubLObject valid_$75 = makeBoolean(!token_var_$74.eql(rule));
                                        if ((NIL != valid_$75) && ((NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread)) || (NIL != list_utilities.lengthG(pragma_induction.rule_pos_lits(rule), ONE_INTEGER, UNPROVIDED)))) {
                                            rules = cons(rule, rules);
                                        }
                                        done_var_$73 = makeBoolean(NIL == valid_$75);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                    direction = cdolist_list_var_$72.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            negation_inverse = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_negationinverse_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_negationinverse_expand_int(asent, rule, T);
    }

    public static SubLObject forward_negationinverse_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var = forward_negationinverse_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject negation_inverse = cycl_utilities.atomic_sentence_predicate(examine_lit);
            final SubLObject forward_asent = list(negation_inverse, arg2, arg1);
            final SubLObject more_supports = list(arguments.make_hl_support($NEGATIONPREDS, list($$negationInverse, pred, negation_inverse), UNPROVIDED, UNPROVIDED));
            forward_module_callback(forward_asent, $NEG, examine_lit, NIL, rule, more_supports);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_negationinverse_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject all_negation_inverses = cached_all_negation_inverses(pred);
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
            if (((NIL != variables.fully_bound_p(rule_pred)) && (NIL == hl_supports.hl_predicate_p(rule_pred))) && (NIL != list_utilities.member_kbeqP(rule_pred, all_negation_inverses))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_eval_exclusive_pos(final SubLObject asent) {
        final SubLObject pattern = $list111;
        return formula_pattern_match.formula_matches_pattern(asent, pattern);
    }

    public static SubLObject forward_eval_expand_pos(final SubLObject asent, final SubLObject rule) {
        return NIL;
    }

    public static SubLObject forward_eval_exclusive_neg(final SubLObject asent) {
        final SubLObject pattern = $list111;
        return formula_pattern_match.formula_matches_pattern(asent, pattern);
    }

    public static SubLObject forward_eval_expand_neg(final SubLObject asent, final SubLObject rule) {
        return NIL;
    }

    public static SubLObject forward_term_of_unit_rule_select(final SubLObject asent) {
        final SubLObject function = cycl_utilities.nat_function(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(function, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(function, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$76 = NIL;
                            final SubLObject token_var_$77 = NIL;
                            while (NIL == done_var_$76) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
                                final SubLObject valid_$78 = makeBoolean(!token_var_$77.eql(rule));
                                if (NIL != valid_$78) {
                                    rules = cons(rule, rules);
                                }
                                done_var_$76 = makeBoolean(NIL == valid_$78);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_term_of_unit_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_term_of_unit_expand_int(asent, rule, T);
    }

    public static SubLObject forward_term_of_unit_expand(final SubLObject asent, final SubLObject rule) {
        SubLObject cdolist_list_var = forward_term_of_unit_expand_int(asent, rule, UNPROVIDED);
        SubLObject examine_lit = NIL;
        examine_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forward_module_callback(asent, $POS, examine_lit, NIL, rule, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            examine_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject forward_term_of_unit_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject function = cycl_utilities.nat_function(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = $$termOfUnit;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject rule_function;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                rule_function = cycl_utilities.nat_function(cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED));
                if (function.eql(rule_function)) {
                    examine_lits = cons(lit, examine_lits);
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_nat_function_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules($$natFunction);
    }

    public static SubLObject forward_nat_function_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_nat_function_expand_int(asent, rule, T);
    }

    public static SubLObject forward_nat_function_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject nart = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(formula);
        if (NIL != function) {
            final SubLObject more_supports = removal_modules_natfunction.additional_nat_function_supports();
            final SubLObject forward_asent = list($$natFunction, nart, function);
            SubLObject cdolist_list_var = forward_nat_function_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, $POS, examine_lit, NIL, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject forward_nat_function_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = $$natFunction;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_gaf_predicate_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $gaf_predicate_forward_inference_enabledP$.getDynamicValue(thread);
    }

    public static SubLObject forward_gaf_predicate_rule_select(final SubLObject asent) {
        return all_antecedent_predicate_forward_rules($$gafPredicate);
    }

    public static SubLObject forward_gaf_predicate_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_gaf_predicate_expand_int(asent, rule, T);
    }

    public static SubLObject forward_gaf_predicate_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (NIL != pred) {
            final SubLObject source_gaf = forward.current_forward_inference_gaf();
            final SubLObject source_gaf_mt = (NIL != source_gaf) ? arguments.support_mt(source_gaf) : NIL;
            final SubLObject trigger_mt = (NIL != source_gaf_mt) ? source_gaf_mt : mt_relevance_macros.$mt$.getDynamicValue(thread);
            final SubLObject forward_asent = make_binary_formula($$gafPredicate, asent, pred);
            final SubLObject trigger_support = arguments.make_hl_support($GAF, forward_asent, trigger_mt, $TRUE_MON);
            SubLObject cdolist_list_var = forward_gaf_predicate_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_module_callback(forward_asent, $POS, examine_lit, trigger_support, rule, NIL);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject forward_gaf_predicate_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        SubLObject examine_lits = NIL;
        final SubLObject predicate_var = $$gafPredicate;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_unbound_pred_pos_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $unbound_rule_backchain_enabled$.getDynamicValue(thread);
    }

    public static SubLObject forward_unbound_pred_pos_rule_select(final SubLObject asent) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator($NEG, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator($NEG, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$79 = NIL;
                            final SubLObject token_var_$80 = NIL;
                            while (NIL == done_var_$79) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$80);
                                final SubLObject valid_$81 = makeBoolean(!token_var_$80.eql(rule));
                                if (NIL != valid_$81) {
                                    rules = cons(rule, rules);
                                }
                                done_var_$79 = makeBoolean(NIL == valid_$81);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_unbound_pred_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_unbound_pred_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_unbound_pred_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_unbound_pred_pos_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_module_callback(asent, $POS, examine_lit, NIL, rule, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_unbound_pred_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_unbound_pred_neg_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $unbound_rule_backchain_enabled$.getDynamicValue(thread);
    }

    public static SubLObject forward_unbound_pred_neg_rule_select(final SubLObject asent) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator($POS, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator($POS, direction);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, direction);
                            SubLObject done_var_$82 = NIL;
                            final SubLObject token_var_$83 = NIL;
                            while (NIL == done_var_$82) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                final SubLObject valid_$84 = makeBoolean(!token_var_$83.eql(rule));
                                if (NIL != valid_$84) {
                                    rules = cons(rule, rules);
                                }
                                done_var_$82 = makeBoolean(NIL == valid_$84);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_unbound_pred_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_unbound_pred_neg_expand_int(asent, rule, T);
    }

    public static SubLObject forward_unbound_pred_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
        try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            SubLObject cdolist_list_var = forward_unbound_pred_neg_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                forward_module_callback(asent, $NEG, examine_lit, NIL, rule, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_unbound_pred_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        SubLObject examine_lits = NIL;
        final SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_predicate(lit))) {
                examine_lits = cons(lit, examine_lits);
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_assertive_wff_unbound_pred_pos_required(final SubLObject asent) {
        return wff_vars.wff_assertiveP();
    }

    public static SubLObject forward_assertive_wff_unbound_pred_pos_rule_select(final SubLObject asent) {
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$85 = wff.assertive_wff_rules();
            SubLObject rule = NIL;
            rule = cdolist_list_var_$85.first();
            while (NIL != cdolist_list_var_$85) {
                if (direction.eql(assertions_high.assertion_direction(rule))) {
                    rules = cons(rule, rules);
                }
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                rule = cdolist_list_var_$85.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return rules;
    }

    public static SubLObject forward_assertive_wff_unbound_pred_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_unbound_pred_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_assertive_wff_unbound_pred_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject trigger_gaf = forward.current_forward_inference_gaf();
        if ((NIL != trigger_gaf) && (NIL != wff.strictly_wff_in_all_spec_mtsP(asent, arguments.support_mt(trigger_gaf), UNPROVIDED))) {
            return NIL;
        }
        return forward_unbound_pred_pos_expand(asent, rule);
    }

    public static SubLObject forward_ist_pos_rule_select(final SubLObject asent) {
        return all_ist_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_ist_pos_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_ist_pos_expand_int(asent, rule, T);
    }

    public static SubLObject forward_ist_pos_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject trigger_assertion = forward.current_forward_inference_assertion();
        if (NIL != trigger_assertion) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject mt = arguments.support_mt(trigger_assertion);
            final SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject cdolist_list_var = forward_ist_pos_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED));
                final SubLObject forward_asent = bq_cons(genl_pred, append(args, NIL));
                final SubLObject more_supports = (NIL != kb_utilities.kbeq(pred, genl_pred)) ? NIL : list(arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, genl_pred), UNPROVIDED, UNPROVIDED));
                final SubLObject trigger_support = arguments.make_hl_support($QUERY, arguments.support_el_ist_sentence(trigger_assertion), $$BaseKB, UNPROVIDED);
                forward_module_callback(make_ist_sentence(mt, forward_asent), $POS, examine_lit, trigger_support, rule, more_supports);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject forward_ist_pos_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject sub_sentence;
        SubLObject sub_pred;
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (NIL != ist_sentence_p(lit, kb_indexing.spec_preds_of_ist_indexing_enabledP())) {
                sub_sentence = literal_arg2(lit, UNPROVIDED);
                if (NIL == el_negation_p(sub_sentence)) {
                    sub_pred = literal_predicate(sub_sentence, UNPROVIDED);
                    if ((NIL != forts.fort_p(sub_pred)) && (NIL != genl_predicates.genl_predP(pred, sub_pred, UNPROVIDED, UNPROVIDED))) {
                        examine_lits = cons(lit, examine_lits);
                    }
                }
            }
        }
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (NIL != ist_sentence_p(lit, kb_indexing.spec_preds_of_ist_indexing_enabledP())) {
                sub_sentence = literal_arg2(lit, UNPROVIDED);
                if (NIL != el_negation_p(sub_sentence)) {
                    sub_pred = literal_predicate(sub_sentence, UNPROVIDED);
                    if ((NIL != forts.fort_p(sub_pred)) && (NIL != genl_predicates.genl_predP(pred, sub_pred, UNPROVIDED, UNPROVIDED))) {
                        examine_lits = cons(lit, examine_lits);
                    }
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject forward_ist_neg_rule_select(final SubLObject asent) {
        return all_ist_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject forward_ist_neg_rule_filter(final SubLObject asent, final SubLObject rule) {
        return forward_ist_neg_expand_int(asent, rule, T);
    }

    public static SubLObject forward_ist_neg_expand(final SubLObject asent, final SubLObject rule) {
        final SubLObject trigger_assertion = forward.current_forward_inference_assertion();
        if (NIL != trigger_assertion) {
            final SubLObject mt = arguments.support_mt(trigger_assertion);
            SubLObject cdolist_list_var = forward_ist_neg_expand_int(asent, rule, UNPROVIDED);
            SubLObject examine_lit = NIL;
            examine_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject trigger_support = arguments.make_hl_support($QUERY, arguments.support_el_ist_sentence(trigger_assertion), $$BaseKB, UNPROVIDED);
                forward_module_callback(make_ist_sentence(mt, make_negation(asent)), $POS, examine_lit, trigger_support, rule, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                examine_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject forward_ist_neg_expand_int(final SubLObject asent, final SubLObject rule, SubLObject booleanP) {
        if (booleanP == UNPROVIDED) {
            booleanP = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject examine_lits = NIL;
        SubLObject predicate_var = $$ist;
        SubLObject cnf_var = assertions_high.assertion_cnf(rule);
        SubLObject rest;
        SubLObject lit;
        SubLObject sub_sentence;
        SubLObject sub_pred;
        for (rest = NIL, rest = clauses.pos_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                sub_sentence = literal_arg2(lit, UNPROVIDED);
                if (NIL == el_negation_p(sub_sentence)) {
                    sub_pred = literal_predicate(sub_sentence, UNPROVIDED);
                    if (pred.eql(sub_pred)) {
                        examine_lits = cons(lit, examine_lits);
                    }
                }
            }
        }
        predicate_var = $$ist;
        cnf_var = assertions_high.assertion_cnf(rule);
        for (rest = NIL, rest = clauses.neg_lits(cnf_var); ((NIL == booleanP) || (NIL == examine_lits)) && (NIL != rest); rest = rest.rest()) {
            lit = rest.first();
            if (predicate_var.eql(cycl_utilities.atomic_sentence_predicate(lit))) {
                sub_sentence = literal_arg2(lit, UNPROVIDED);
                if (NIL != el_negation_p(sub_sentence)) {
                    sub_pred = literal_predicate(sub_sentence, UNPROVIDED);
                    if (pred.eql(sub_pred)) {
                        examine_lits = cons(lit, examine_lits);
                    }
                }
            }
        }
        return NIL != booleanP ? list_utilities.sublisp_boolean(examine_lits) : examine_lits;
    }

    public static SubLObject declare_forward_modules_file() {
        declareFunction(me, "forward_modules", "FORWARD-MODULES", 0, 0, false);
        declareFunction(me, "forward_module_count", "FORWARD-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "forward_module_p", "FORWARD-MODULE-P", 1, 0, false);
        declareFunction(me, "forward_module", "FORWARD-MODULE", 2, 0, false);
        declareFunction(me, "undeclare_forward_module", "UNDECLARE-FORWARD-MODULE", 1, 0, false);
        declareMacro(me, "do_forward_modules", "DO-FORWARD-MODULES");
        declareFunction(me, "do_forward_modules_list", "DO-FORWARD-MODULES-LIST", 0, 0, false);
        declareFunction(me, "forward_examine_asent_triggering_allowedP", "FORWARD-EXAMINE-ASENT-TRIGGERING-ALLOWED?", 1, 0, false);
        declareFunction(me, "forward_module_callback", "FORWARD-MODULE-CALLBACK", 5, 1, false);
        declareFunction(me, "forward_tactic_specs", "FORWARD-TACTIC-SPECS", 3, 0, false);
        declareFunction(me, "forward_tactic_spec_rule", "FORWARD-TACTIC-SPEC-RULE", 1, 0, false);
        declareFunction(me, "forward_tactic_specL", "FORWARD-TACTIC-SPEC<", 2, 0, false);
        declareFunction(me, "forward_hl_modules", "FORWARD-HL-MODULES", 2, 0, false);
        declareFunction(me, "forward_hl_module_apply", "FORWARD-HL-MODULE-APPLY", 2, 0, false);
        declareFunction(me, "forward_inference_rule_select_via_allowed_rulesP", "FORWARD-INFERENCE-RULE-SELECT-VIA-ALLOWED-RULES?", 0, 0, false);
        declareFunction(me, "forward_hl_module_rule_select", "FORWARD-HL-MODULE-RULE-SELECT", 2, 0, false);
        declareFunction(me, "forward_hl_module_rule_filter", "FORWARD-HL-MODULE-RULE-FILTER", 3, 0, false);
        declareFunction(me, "forward_hl_module_expand", "FORWARD-HL-MODULE-EXPAND", 3, 0, false);
        declareFunction(me, "all_antecedent_predicate_forward_rules", "ALL-ANTECEDENT-PREDICATE-FORWARD-RULES", 1, 0, false);
        declareFunction(me, "all_consequent_predicate_forward_rules", "ALL-CONSEQUENT-PREDICATE-FORWARD-RULES", 1, 0, false);
        declareFunction(me, "all_ist_predicate_forward_rules", "ALL-IST-PREDICATE-FORWARD-RULES", 1, 0, false);
        declareFunction(me, "forward_normal_pos_rule_select", "FORWARD-NORMAL-POS-RULE-SELECT", 1, 0, false);
        new forward_modules.$forward_normal_pos_rule_select$UnaryFunction();
        declareFunction(me, "forward_normal_pos_rule_filter", "FORWARD-NORMAL-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_normal_pos_expand", "FORWARD-NORMAL-POS-EXPAND", 2, 0, false);
        new forward_modules.$forward_normal_pos_expand$BinaryFunction();
        declareFunction(me, "forward_normal_pos_expand_int", "FORWARD-NORMAL-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_normal_neg_rule_select", "FORWARD-NORMAL-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_normal_neg_rule_filter", "FORWARD-NORMAL-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_normal_neg_expand", "FORWARD-NORMAL-NEG-EXPAND", 2, 0, false);
        declareFunction(me, "forward_normal_neg_expand_int", "FORWARD-NORMAL-NEG-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_isa_rule_select", "FORWARD-ISA-RULE-SELECT", 1, 0, false);
        new forward_modules.$forward_isa_rule_select$UnaryFunction();
        declareFunction(me, "forward_isa_rule_filter", "FORWARD-ISA-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_isa_expand", "FORWARD-ISA-EXPAND", 2, 0, false);
        new forward_modules.$forward_isa_expand$BinaryFunction();
        declareFunction(me, "forward_isa_expand_int", "FORWARD-ISA-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_inference_genlP", "FORWARD-INFERENCE-GENL?", 2, 0, false);
        declareFunction(me, "forward_inference_all_genls_internal", "FORWARD-INFERENCE-ALL-GENLS-INTERNAL", 1, 0, false);
        declareFunction(me, "forward_inference_all_genls", "FORWARD-INFERENCE-ALL-GENLS", 1, 0, false);
        declareFunction(me, "clear_cached_all_specs", "CLEAR-CACHED-ALL-SPECS", 0, 0, false);
        declareFunction(me, "remove_cached_all_specs", "REMOVE-CACHED-ALL-SPECS", 1, 0, false);
        declareFunction(me, "cached_all_specs_internal", "CACHED-ALL-SPECS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_specs", "CACHED-ALL-SPECS", 1, 0, false);
        declareFunction(me, "forward_not_isa_rule_select", "FORWARD-NOT-ISA-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_not_isa_rule_filter", "FORWARD-NOT-ISA-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_not_isa_expand", "FORWARD-NOT-ISA-EXPAND", 2, 0, false);
        declareFunction(me, "forward_not_isa_expand_int", "FORWARD-NOT-ISA-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_quoted_isa_rule_select", "FORWARD-QUOTED-ISA-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_quoted_isa_rule_filter", "FORWARD-QUOTED-ISA-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_quoted_isa_expand", "FORWARD-QUOTED-ISA-EXPAND", 2, 0, false);
        declareFunction(me, "forward_quoted_isa_expand_int", "FORWARD-QUOTED-ISA-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_not_quoted_isa_rule_select", "FORWARD-NOT-QUOTED-ISA-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_not_quoted_isa_rule_filter", "FORWARD-NOT-QUOTED-ISA-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_not_quoted_isa_expand", "FORWARD-NOT-QUOTED-ISA-EXPAND", 2, 0, false);
        declareFunction(me, "forward_not_quoted_isa_expand_int", "FORWARD-NOT-QUOTED-ISA-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_genls_rule_select", "FORWARD-GENLS-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_genls_rule_filter", "FORWARD-GENLS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_genls_expand", "FORWARD-GENLS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genls_expand_int", "FORWARD-GENLS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_not_genls_rule_select", "FORWARD-NOT-GENLS-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_not_genls_rule_filter", "FORWARD-NOT-GENLS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_not_genls_expand", "FORWARD-NOT-GENLS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_not_genls_expand_int", "FORWARD-NOT-GENLS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "clear_cached_all_genl_mts", "CLEAR-CACHED-ALL-GENL-MTS", 0, 0, false);
        declareFunction(me, "remove_cached_all_genl_mts", "REMOVE-CACHED-ALL-GENL-MTS", 1, 0, false);
        declareFunction(me, "cached_all_genl_mts_internal", "CACHED-ALL-GENL-MTS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_genl_mts", "CACHED-ALL-GENL-MTS", 1, 0, false);
        declareFunction(me, "forward_genlmt_rule_select", "FORWARD-GENLMT-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_genlmt_rule_filter", "FORWARD-GENLMT-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_genlmt_expand", "FORWARD-GENLMT-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlmt_expand_int", "FORWARD-GENLMT-EXPAND-INT", 2, 1, false);
        declareFunction(me, "clear_cached_all_spec_mts", "CLEAR-CACHED-ALL-SPEC-MTS", 0, 0, false);
        declareFunction(me, "remove_cached_all_spec_mts", "REMOVE-CACHED-ALL-SPEC-MTS", 1, 0, false);
        declareFunction(me, "cached_all_spec_mts_internal", "CACHED-ALL-SPEC-MTS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_spec_mts", "CACHED-ALL-SPEC-MTS", 1, 0, false);
        declareFunction(me, "forward_not_genlmt_rule_select", "FORWARD-NOT-GENLMT-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_not_genlmt_rule_filter", "FORWARD-NOT-GENLMT-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_not_genlmt_expand", "FORWARD-NOT-GENLMT-EXPAND", 2, 0, false);
        declareFunction(me, "forward_not_genlmt_expand_int", "FORWARD-NOT-GENLMT-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_symmetric_pos_rule_select", "FORWARD-SYMMETRIC-POS-RULE-SELECT", 1, 0, false);
        new forward_modules.$forward_symmetric_pos_rule_select$UnaryFunction();
        declareFunction(me, "forward_symmetric_pos_rule_filter", "FORWARD-SYMMETRIC-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_symmetric_pos_expand", "FORWARD-SYMMETRIC-POS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_symmetric_pos_expand_int", "FORWARD-SYMMETRIC-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_symmetric_neg_rule_select", "FORWARD-SYMMETRIC-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_symmetric_neg_rule_filter", "FORWARD-SYMMETRIC-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_symmetric_neg_expand", "FORWARD-SYMMETRIC-NEG-EXPAND", 2, 0, false);
        declareFunction(me, "forward_symmetric_neg_expand_int", "FORWARD-SYMMETRIC-NEG-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_asymmetric_required", "FORWARD-ASYMMETRIC-REQUIRED", 1, 0, false);
        new forward_modules.$forward_asymmetric_required$UnaryFunction();
        declareFunction(me, "forward_asymmetric_rule_select", "FORWARD-ASYMMETRIC-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_asymmetric_rule_filter", "FORWARD-ASYMMETRIC-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_asymmetric_expand", "FORWARD-ASYMMETRIC-EXPAND", 2, 0, false);
        declareFunction(me, "forward_asymmetric_expand_int", "FORWARD-ASYMMETRIC-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_commutative_pos_rule_select", "FORWARD-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_commutative_pos_rule_filter", "FORWARD-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_commutative_pos_expand", "FORWARD-COMMUTATIVE-POS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_commutative_pos_expand_int", "FORWARD-COMMUTATIVE-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_commutative_neg_rule_select", "FORWARD-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_commutative_neg_rule_filter", "FORWARD-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_commutative_neg_expand", "FORWARD-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
        declareFunction(me, "forward_commutative_neg_expand_int", "FORWARD-COMMUTATIVE-NEG-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_genlpreds_gaf_rule_select", "FORWARD-GENLPREDS-GAF-RULE-SELECT", 1, 0, false);
        declareFunction(me, "clear_cached_all_genl_preds", "CLEAR-CACHED-ALL-GENL-PREDS", 0, 0, false);
        declareFunction(me, "remove_cached_all_genl_preds", "REMOVE-CACHED-ALL-GENL-PREDS", 1, 0, false);
        declareFunction(me, "cached_all_genl_preds_internal", "CACHED-ALL-GENL-PREDS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_genl_preds", "CACHED-ALL-GENL-PREDS", 1, 0, false);
        declareFunction(me, "clear_cached_all_genl_inverses", "CLEAR-CACHED-ALL-GENL-INVERSES", 0, 0, false);
        declareFunction(me, "remove_cached_all_genl_inverses", "REMOVE-CACHED-ALL-GENL-INVERSES", 1, 0, false);
        declareFunction(me, "cached_all_genl_inverses_internal", "CACHED-ALL-GENL-INVERSES-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_genl_inverses", "CACHED-ALL-GENL-INVERSES", 1, 0, false);
        declareFunction(me, "forward_genlpreds_gaf_rule_filter", "FORWARD-GENLPREDS-GAF-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_genlpreds_gaf_expand", "FORWARD-GENLPREDS-GAF-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlpreds_gaf_expand_int", "FORWARD-GENLPREDS-GAF-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_not_genlpreds_gaf_rule_select", "FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_not_genlpreds_gaf_rule_filter", "FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_not_genlpreds_gaf_expand", "FORWARD-NOT-GENLPREDS-GAF-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlpreds_pos_rule_select", "FORWARD-GENLPREDS-POS-RULE-SELECT", 1, 0, false);
        new forward_modules.$forward_genlpreds_pos_rule_select$UnaryFunction();
        declareFunction(me, "forward_genlpreds_pos_rule_filter", "FORWARD-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_genlpreds_pos_expand", "FORWARD-GENLPREDS-POS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlpreds_pos_expand_int", "FORWARD-GENLPREDS-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_genlinverse_gaf_rule_select", "FORWARD-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_genlinverse_gaf_rule_filter", "FORWARD-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_genlinverse_gaf_expand", "FORWARD-GENLINVERSE-GAF-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlinverse_gaf_expand_int", "FORWARD-GENLINVERSE-GAF-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_not_genlinverse_gaf_rule_select", "FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_not_genlinverse_gaf_rule_filter", "FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_not_genlinverse_gaf_expand", "FORWARD-NOT-GENLINVERSE-GAF-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlinverse_pos_rule_select", "FORWARD-GENLINVERSE-POS-RULE-SELECT", 1, 0, false);
        new forward_modules.$forward_genlinverse_pos_rule_select$UnaryFunction();
        declareFunction(me, "forward_genlinverse_pos_rule_filter", "FORWARD-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_genlinverse_pos_expand", "FORWARD-GENLINVERSE-POS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_genlinverse_pos_expand_int", "FORWARD-GENLINVERSE-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "clear_cached_all_negation_preds", "CLEAR-CACHED-ALL-NEGATION-PREDS", 0, 0, false);
        declareFunction(me, "remove_cached_all_negation_preds", "REMOVE-CACHED-ALL-NEGATION-PREDS", 1, 0, false);
        declareFunction(me, "cached_all_negation_preds_internal", "CACHED-ALL-NEGATION-PREDS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_negation_preds", "CACHED-ALL-NEGATION-PREDS", 1, 0, false);
        declareFunction(me, "forward_negationpreds_required", "FORWARD-NEGATIONPREDS-REQUIRED", 1, 0, false);
        new forward_modules.$forward_negationpreds_required$UnaryFunction();
        declareFunction(me, "forward_negationpreds_rule_select", "FORWARD-NEGATIONPREDS-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_negationpreds_rule_filter", "FORWARD-NEGATIONPREDS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_negationpreds_expand", "FORWARD-NEGATIONPREDS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_negationpreds_expand_int", "FORWARD-NEGATIONPREDS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "clear_cached_all_negation_inverses", "CLEAR-CACHED-ALL-NEGATION-INVERSES", 0, 0, false);
        declareFunction(me, "remove_cached_all_negation_inverses", "REMOVE-CACHED-ALL-NEGATION-INVERSES", 1, 0, false);
        declareFunction(me, "cached_all_negation_inverses_internal", "CACHED-ALL-NEGATION-INVERSES-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_all_negation_inverses", "CACHED-ALL-NEGATION-INVERSES", 1, 0, false);
        declareFunction(me, "forward_negationinverse_required", "FORWARD-NEGATIONINVERSE-REQUIRED", 1, 0, false);
        new forward_modules.$forward_negationinverse_required$UnaryFunction();
        declareFunction(me, "forward_negationinverse_rule_select", "FORWARD-NEGATIONINVERSE-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_negationinverse_rule_filter", "FORWARD-NEGATIONINVERSE-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_negationinverse_expand", "FORWARD-NEGATIONINVERSE-EXPAND", 2, 0, false);
        declareFunction(me, "forward_negationinverse_expand_int", "FORWARD-NEGATIONINVERSE-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_eval_exclusive_pos", "FORWARD-EVAL-EXCLUSIVE-POS", 1, 0, false);
        new forward_modules.$forward_eval_exclusive_pos$UnaryFunction();
        declareFunction(me, "forward_eval_expand_pos", "FORWARD-EVAL-EXPAND-POS", 2, 0, false);
        declareFunction(me, "forward_eval_exclusive_neg", "FORWARD-EVAL-EXCLUSIVE-NEG", 1, 0, false);
        declareFunction(me, "forward_eval_expand_neg", "FORWARD-EVAL-EXPAND-NEG", 2, 0, false);
        declareFunction(me, "forward_term_of_unit_rule_select", "FORWARD-TERM-OF-UNIT-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_term_of_unit_rule_filter", "FORWARD-TERM-OF-UNIT-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_term_of_unit_expand", "FORWARD-TERM-OF-UNIT-EXPAND", 2, 0, false);
        declareFunction(me, "forward_term_of_unit_expand_int", "FORWARD-TERM-OF-UNIT-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_nat_function_rule_select", "FORWARD-NAT-FUNCTION-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_nat_function_rule_filter", "FORWARD-NAT-FUNCTION-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_nat_function_expand", "FORWARD-NAT-FUNCTION-EXPAND", 2, 0, false);
        declareFunction(me, "forward_nat_function_expand_int", "FORWARD-NAT-FUNCTION-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_gaf_predicate_required", "FORWARD-GAF-PREDICATE-REQUIRED", 1, 0, false);
        declareFunction(me, "forward_gaf_predicate_rule_select", "FORWARD-GAF-PREDICATE-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_gaf_predicate_rule_filter", "FORWARD-GAF-PREDICATE-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_gaf_predicate_expand", "FORWARD-GAF-PREDICATE-EXPAND", 2, 0, false);
        declareFunction(me, "forward_gaf_predicate_expand_int", "FORWARD-GAF-PREDICATE-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_unbound_pred_pos_required", "FORWARD-UNBOUND-PRED-POS-REQUIRED", 1, 0, false);
        new forward_modules.$forward_unbound_pred_pos_required$UnaryFunction();
        declareFunction(me, "forward_unbound_pred_pos_rule_select", "FORWARD-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_unbound_pred_pos_rule_filter", "FORWARD-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_unbound_pred_pos_expand", "FORWARD-UNBOUND-PRED-POS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_unbound_pred_pos_expand_int", "FORWARD-UNBOUND-PRED-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_unbound_pred_neg_required", "FORWARD-UNBOUND-PRED-NEG-REQUIRED", 1, 0, false);
        declareFunction(me, "forward_unbound_pred_neg_rule_select", "FORWARD-UNBOUND-PRED-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_unbound_pred_neg_rule_filter", "FORWARD-UNBOUND-PRED-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_unbound_pred_neg_expand", "FORWARD-UNBOUND-PRED-NEG-EXPAND", 2, 0, false);
        declareFunction(me, "forward_unbound_pred_neg_expand_int", "FORWARD-UNBOUND-PRED-NEG-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_assertive_wff_unbound_pred_pos_required", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-REQUIRED", 1, 0, false);
        declareFunction(me, "forward_assertive_wff_unbound_pred_pos_rule_select", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_assertive_wff_unbound_pred_pos_rule_filter", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_assertive_wff_unbound_pred_pos_expand", "FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS-EXPAND", 2, 0, false);
        declareFunction(me, "forward_ist_pos_rule_select", "FORWARD-IST-POS-RULE-SELECT", 1, 0, false);
        new forward_modules.$forward_ist_pos_rule_select$UnaryFunction();
        declareFunction(me, "forward_ist_pos_rule_filter", "FORWARD-IST-POS-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_ist_pos_expand", "FORWARD-IST-POS-EXPAND", 2, 0, false);
        new forward_modules.$forward_ist_pos_expand$BinaryFunction();
        declareFunction(me, "forward_ist_pos_expand_int", "FORWARD-IST-POS-EXPAND-INT", 2, 1, false);
        declareFunction(me, "forward_ist_neg_rule_select", "FORWARD-IST-NEG-RULE-SELECT", 1, 0, false);
        declareFunction(me, "forward_ist_neg_rule_filter", "FORWARD-IST-NEG-RULE-FILTER", 2, 0, false);
        declareFunction(me, "forward_ist_neg_expand", "FORWARD-IST-NEG-EXPAND", 2, 0, false);
        declareFunction(me, "forward_ist_neg_expand_int", "FORWARD-IST-NEG-EXPAND-INT", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_forward_modules_file() {
        defparameter("*FORWARD-MODULES*", NIL);
        defparameter("*FORWARD-TACTIC-SPECS*", NIL);
        defparameter("*PREVENT-FORWARD-TRIGGERING-VIA-EVALUATABLE-PREDICATE-ANTECEDENT-LITERALS?*", T);
        deflexical("*CACHED-ALL-SPECS-CACHING-STATE*", NIL);
        deflexical("*CACHED-ALL-GENL-MTS-CACHING-STATE*", NIL);
        deflexical("*CACHED-ALL-SPEC-MTS-CACHING-STATE*", NIL);
        deflexical("*CACHED-ALL-GENL-PREDS-CACHING-STATE*", NIL);
        deflexical("*CACHED-ALL-GENL-INVERSES-CACHING-STATE*", NIL);
        deflexical("*CACHED-ALL-NEGATION-PREDS-CACHING-STATE*", NIL);
        deflexical("*CACHED-ALL-NEGATION-INVERSES-CACHING-STATE*", NIL);
        defvar("*GAF-PREDICATE-FORWARD-INFERENCE-ENABLED?*", NIL);
        return NIL;
    }

    public static SubLObject setup_forward_modules_file() {
        register_macro_helper(DO_FORWARD_MODULES_LIST, DO_FORWARD_MODULES);
        forward_module($FORWARD_NORMAL_POS, $list21);
        forward_module($FORWARD_NORMAL_NEG, $list23);
        forward_module($FORWARD_ISA, $list25);
        memoization_state.note_memoized_function(FORWARD_INFERENCE_ALL_GENLS);
        forward_module($FORWARD_NOT_ISA, $list31);
        memoization_state.note_globally_cached_function(CACHED_ALL_SPECS);
        forward_module($FORWARD_QUOTED_ISA, $list37);
        forward_module($FORWARD_NOT_QUOTED_ISA, $list40);
        forward_module($FORWARD_GENLS, $list42);
        forward_module($FORWARD_NOT_GENLS, $list44);
        forward_module($FORWARD_GENLMT, $list46);
        memoization_state.note_globally_cached_function(CACHED_ALL_GENL_MTS);
        forward_module($FORWARD_NOT_GENLMT, $list53);
        memoization_state.note_globally_cached_function(CACHED_ALL_SPEC_MTS);
        forward_module($FORWARD_SYMMETRIC_POS, $list58);
        forward_module($FORWARD_SYMMETRIC_NEG, $list62);
        forward_module($FORWARD_ASYMMETRIC, $list64);
        forward_module($FORWARD_COMMUTATIVE_POS, $list68);
        forward_module($FORWARD_COMMUTATIVE_NEG, $list72);
        forward_module($FORWARD_GENLPREDS_GAF, $list74);
        memoization_state.note_globally_cached_function(CACHED_ALL_GENL_PREDS);
        memoization_state.note_globally_cached_function(CACHED_ALL_GENL_INVERSES);
        forward_module($FORWARD_NOT_GENLPREDS_GAF, $list85);
        forward_module($FORWARD_GENLPREDS_POS, $list87);
        forward_module($FORWARD_GENLINVERSE_GAF, $list89);
        forward_module($FORWARD_NOT_GENLINVERSE_GAF, $list91);
        forward_module($FORWARD_GENLINVERSE_POS, $list93);
        forward_module($FORWARD_NEGATIONPREDS, $list95);
        memoization_state.note_globally_cached_function(CACHED_ALL_NEGATION_PREDS);
        forward_module($FORWARD_NEGATIONINVERSE, $list103);
        memoization_state.note_globally_cached_function(CACHED_ALL_NEGATION_INVERSES);
        forward_module($FORWARD_EVAL_POS, $list110);
        forward_module($FORWARD_EVAL_NEG, $list113);
        forward_module($FORWARD_TERM_OF_UNIT, $list115);
        forward_module($FORWARD_NAT_FUNCTION, $list118);
        forward_module($FORWARD_GAF_PREDICATE, $list121);
        forward_module($FORWARD_UNBOUND_PRED_POS, $list126);
        forward_module($FORWARD_UNBOUND_PRED_NEG, $list128);
        forward_module($FORWARD_ASSERTIVE_WFF_UNBOUND_PRED_POS, $list130);
        forward_module($FORWARD_IST_POS, $list132);
        forward_module($FORWARD_IST_NEG, $list135);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_forward_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_forward_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forward_modules_file();
    }

    

    public static final class $forward_normal_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $forward_normal_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-NORMAL-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_normal_pos_rule_select(arg1);
        }
    }

    public static final class $forward_normal_pos_expand$BinaryFunction extends BinaryFunction {
        public $forward_normal_pos_expand$BinaryFunction() {
            super(extractFunctionNamed("FORWARD-NORMAL-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return forward_normal_pos_expand(arg1, arg2);
        }
    }

    public static final class $forward_isa_rule_select$UnaryFunction extends UnaryFunction {
        public $forward_isa_rule_select$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-ISA-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_isa_rule_select(arg1);
        }
    }

    public static final class $forward_isa_expand$BinaryFunction extends BinaryFunction {
        public $forward_isa_expand$BinaryFunction() {
            super(extractFunctionNamed("FORWARD-ISA-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return forward_isa_expand(arg1, arg2);
        }
    }

    public static final class $forward_symmetric_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $forward_symmetric_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-SYMMETRIC-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_symmetric_pos_rule_select(arg1);
        }
    }

    public static final class $forward_asymmetric_required$UnaryFunction extends UnaryFunction {
        public $forward_asymmetric_required$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-ASYMMETRIC-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_asymmetric_required(arg1);
        }
    }

    public static final class $forward_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $forward_genlpreds_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-GENLPREDS-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_genlpreds_pos_rule_select(arg1);
        }
    }

    public static final class $forward_genlinverse_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $forward_genlinverse_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-GENLINVERSE-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_genlinverse_pos_rule_select(arg1);
        }
    }

    public static final class $forward_negationpreds_required$UnaryFunction extends UnaryFunction {
        public $forward_negationpreds_required$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-NEGATIONPREDS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_negationpreds_required(arg1);
        }
    }

    public static final class $forward_negationinverse_required$UnaryFunction extends UnaryFunction {
        public $forward_negationinverse_required$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-NEGATIONINVERSE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_negationinverse_required(arg1);
        }
    }

    public static final class $forward_eval_exclusive_pos$UnaryFunction extends UnaryFunction {
        public $forward_eval_exclusive_pos$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-EVAL-EXCLUSIVE-POS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_eval_exclusive_pos(arg1);
        }
    }

    public static final class $forward_unbound_pred_pos_required$UnaryFunction extends UnaryFunction {
        public $forward_unbound_pred_pos_required$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-UNBOUND-PRED-POS-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_unbound_pred_pos_required(arg1);
        }
    }

    public static final class $forward_ist_pos_rule_select$UnaryFunction extends UnaryFunction {
        public $forward_ist_pos_rule_select$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-IST-POS-RULE-SELECT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_ist_pos_rule_select(arg1);
        }
    }

    public static final class $forward_ist_pos_expand$BinaryFunction extends BinaryFunction {
        public $forward_ist_pos_expand$BinaryFunction() {
            super(extractFunctionNamed("FORWARD-IST-POS-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return forward_ist_pos_expand(arg1, arg2);
        }
    }
}

/**
 * Total time: 1238 ms
 */
