/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cycl_grammar.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-ASSERTED-FORMULA
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-asserted-formula.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_asserted_formula extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_asserted_formula();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula";




    private static final SubLSymbol $ASSERTED_SENTENCE_VARIABLE = makeKeyword("ASSERTED-SENTENCE-VARIABLE");

    private static final SubLList $list2 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(QUOTE, list(reader_make_constant_shell("assertedSentence"), makeKeyword("VARIABLE"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1"));

    private static final SubLSymbol $sym4$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLSymbol $REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), $COST, makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$assertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedSentence (#$genls #$Predicate ?WHAT))\n    (#$assertedSentence (#$genls #$Predicate #$TruthFunction))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS = makeKeyword("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list(makeKeyword("OR"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P"))), list(reader_make_constant_shell("not"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P")))))), $COST, makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list($CALL, makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedSentence (?PRED #$Predicate ?WHAT))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG = makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG");

    static private final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), $COST, makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedSentence (#$genls #$Predicate #$Thing)))") });



    static private final SubLList $list17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(QUOTE, list(reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("VARIABLE"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1"));

    private static final SubLSymbol $REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS");

    static private final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), $COST, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list($CALL, makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$exactlyAssertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$exactlyAssertedSentence (#$genls #$Predicate ?WHAT))\n    (#$exactlyAssertedSentence (#$genls #$Predicate #$TruthFunction))") });

    private static final SubLSymbol $REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS = makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list(makeKeyword("OR"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P"))), list(reader_make_constant_shell("not"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P")))))), $COST, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list($CALL, makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$exactlyAssertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$exactlyAssertedSentence (?PRED #$Predicate ?WHAT))") });

    private static final SubLSymbol $REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG = makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), $COST, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$exactlyAssertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$exactlyAssertedSentence (#$genls #$Predicate #$Thing)))") });



    private static final SubLSymbol $REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE = makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-PRUNE");

    private static final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("assertedPredicateArg"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), $FORT)), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("assertedPredicateArg"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("assertedPredicateArg"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), $FORT)))), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("prune these cases :\n    (#$assertedPredicateArg <non-fort>  <whatever>   <whatever>)\n    (#$assertedPredicateArg <whatever> <non-integer> <whatever>)\n    (#$assertedPredicateArg <whatever>  <whatever>   <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg (#$YearFn 2002) 1 #$isa)\n    (#$assertedPredicateArg #$Predicate (#$PlusFn 1 1) #$genls)\n    (#$assertedPredicateArg #$Predicate 1 \"genls\")\n   ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK = makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK");

    static private final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, makeKeyword("INTEGER"), $FORT), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate 1 #$genls)") });

    private static final SubLSymbol $REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK = makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK");

    static private final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, makeKeyword("INTEGER"), $FORT), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedPredicateArg <fort> <integer> <fort>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedPredicateArg #$and 1 #$arity))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR = makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR");

    private static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, makeKeyword("INTEGER"), list(makeKeyword("NOT"), $FORT)), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <integer> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate 1 ?WHAT)") });

    private static final SubLSymbol $REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR = makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR");

    private static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, list(makeKeyword("NOT"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <non-integer> <whatever>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate ?ARG ?PRED)") });

    private static final SubLSymbol $REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED = makeKeyword("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), list(makeKeyword("NOT"), $FORT), makeKeyword("INTEGER"), $FORT), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <non-fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg ?X 1 #$expansion)") });



    public static final SubLSymbol $term_formulas_defining_mt$ = makeSymbol("*TERM-FORMULAS-DEFINING-MT*");



    private static final SubLSymbol CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");

    private static final SubLSymbol $REMOVAL_TERM_FORMULAS_CHECK_POS = makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-POS");

    private static final SubLList $list47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termFormulas"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termFormulas"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), $COST, makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-POS"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS"), makeKeyword("DOCUMENTATION"), makeString("(#$termFormulas <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termFormulas #$Predicate (#$genls #$Predicate #$TruthFunction))") });

    private static final SubLSymbol $REMOVAL_TERM_FORMULAS_CHECK_NEG = makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-NEG");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("termFormulas"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termFormulas"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), $COST, makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-NEG"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termFormulas <fully-bound> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termFormulas #$Predicate (#$genls #$Quantifier #$TruthFunction)))") });

    private static final SubLSymbol $REMOVAL_TERM_FORMULAS_UNIFY = makeKeyword("REMOVAL-TERM-FORMULAS-UNIFY");

    private static final SubLList $list51 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termFormulas"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termFormulas"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), $COST, makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termFormulas <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termFormulas ?TERM (#$genls #$Predicate #$TruthFunction))") });



    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS");

    static private final SubLList $list54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate #$TruthFunction)))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG");

    static private final SubLList $list56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedTermSentences #$Quantifier (#$genls #$Predicate #$TruthFunction)))\n    (#$not (#$assertedTermSentences #$Predicate  (#$genls #$TruthFunction #$Predicate)))\n    ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE");

    static private final SubLList $list58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), makeKeyword("NOT-FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <not fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences ?TERM (#$genls #$Predicate #$TruthFunction)))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY");

    static private final SubLList $list60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), $FORT, cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> (<predicate> . <not fully-bound>))\n    using only the KB GAF indexing and explicit assertions involving <predicate> and <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate ?GENL)))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC ?GENL))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC #$TruthFunction))\n    ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY");

    static private final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), $FORT, list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P")))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving the two FORTs"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (?PRED #$Predicate ?TERM))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$Collection))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$TruthFunction))\n    ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE");

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), $FORT, makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> <variable>)\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate ?SENTENCE))") });



    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE = makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE");

    static private final SubLList $list67 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSetSentences <fully-bound> <variable>)\n    using the overlap indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) ?SENTENCE))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS");

    static private final SubLList $list69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSetSentences <fully-bound> ([predicate] . [fully-bound]))\n    using only the KB GAF indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) (#$genls #$Dog #$Mammal))") });

    private static final SubLSymbol $REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG");

    private static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedTermSetSentences <fully-bound> ([predicate] . [fully-bound])))\n    using only the overlap indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedTermSetSentences (#$TheSet #$Predicate) (#$isa #$Collection #$Thing)))\n    (#$not (#$assertedTermSetSentences (#$TheSet #$Predicate #$arity) (#$arity #$Predicate 2))) ") });

    private static final SubLObject $const72$nearestAssertionSupportingSentenc = reader_make_constant_shell("nearestAssertionSupportingSentence");

    private static final SubLSymbol $REMOVAL_NEAREST_ASSERTION_SUPPORTING_SENTENCE = makeKeyword("REMOVAL-NEAREST-ASSERTION-SUPPORTING-SENTENCE");

    private static final SubLList $list74 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("nearestAssertionSupportingSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("nearestAssertionSupportingSentence"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-ASSERTION-SUPPORTING-SENTENCE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestAssertionSupportingSentence MT SENTENCE ASSERTION)"), makeKeyword("EXAMPLE"), makeString("") });



    private static final SubLList $list78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termAppearsInAssertion"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("termAppearsInAssertion"), list($TEST, makeSymbol("INDEXED-TERM-P")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("termAppearsInAssertion"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("ASSERTION-P")))), $COST, makeSymbol("REMOVAL-TERMAPPEARSINASSERTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERMAPPEARSINASSERTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termAppearsInAssertion TERM ASSERTION)"), makeKeyword("EXAMPLE"), makeString("(#$termAppearsInAssertion #$Dog ?ASSERTION)") });

    private static final SubLSymbol REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER = makeSymbol("REMOVAL-TERMAPPEARSINASSERTION-ASSERTION-TERMS-HELPER");



    // Definitions
    public static final SubLObject removal_asserted_sentence_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                if (NIL != variables.fully_bound_p(gaf_sentence)) {
                    return $hl_module_check_cost$.getDynamicValue(thread);
                } else {
                    {
                        SubLObject sub_literal = literal_atomic_sentence(gaf_sentence);
                        SubLObject sub_sense = literal_sense(gaf_sentence);
                        SubLObject cost = ZERO_INTEGER;
                        SubLObject source_formula_var = sub_literal;
                        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym1$HL_VAR_), T);
                        SubLObject permuted_asent = NIL;
                        for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                            cost = add(cost, inference_trampolines.inference_num_gaf_lookup_index(permuted_asent, sub_sense));
                        }
                        return cost;
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject removal_asserted_sentence_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != variables.fully_bound_p(gaf_sentence)) {
            return $hl_module_check_cost$.getDynamicValue(thread);
        }
        final SubLObject sub_literal = literal_atomic_sentence(gaf_sentence);
        final SubLObject sub_sense = literal_sense(gaf_sentence);
        SubLObject cost = ZERO_INTEGER;
        final SubLObject source_formula_var = sub_literal;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym4$HL_VAR_), T);
        SubLObject permuted_asent = NIL;
        permuted_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cost = add(cost, inference_trampolines.inference_num_gaf_lookup_index(permuted_asent, sub_sense));
            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        } 
        return cost;
    }

    public static final SubLObject removal_asserted_sentence_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_cost(asent);
    }

    public static SubLObject removal_asserted_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_sentence_cost(asent);
    }

    public static final SubLObject removal_asserted_sentence_lookup_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sub_asent = literal_atomic_sentence(sub_literal);
                SubLObject sub_sense = literal_sense(sub_literal);
                SubLObject source_formula_var = sub_asent;
                SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym1$HL_VAR_), T);
                SubLObject permuted_asent = NIL;
                for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, sub_sense);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_1 = NIL;
                                                                            SubLObject token_var_2 = NIL;
                                                                            while (NIL == done_var_1) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                                    if (NIL != valid_3) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_1 = makeBoolean(NIL == valid_3);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_4 = NIL;
                                                                            SubLObject token_var_5 = NIL;
                                                                            while (NIL == done_var_4) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                                    SubLObject valid_6 = makeBoolean(token_var_5 != assertion);
                                                                                    if (NIL != valid_6) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_4 = makeBoolean(NIL == valid_6);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_7 = NIL;
                                                                            SubLObject token_var_8 = NIL;
                                                                            while (NIL == done_var_7) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                                    SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                                    if (NIL != valid_9) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_7 = makeBoolean(NIL == valid_9);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_10 = NIL;
                                                                            SubLObject token_var_11 = NIL;
                                                                            while (NIL == done_var_10) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                                    SubLObject valid_12 = makeBoolean(token_var_11 != assertion);
                                                                                    if (NIL != valid_12) {
                                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != v_bindings) {
                                                                                                    result = cons(list(v_bindings, assertion), result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_10 = makeBoolean(NIL == valid_12);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_13 = NIL;
                                                                    SubLObject token_var_14 = NIL;
                                                                    while (NIL == done_var_13) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                            SubLObject valid_15 = makeBoolean(token_var_14 != assertion);
                                                                            if (NIL != valid_15) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != v_bindings) {
                                                                                            result = cons(list(v_bindings, assertion), result);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_13 = makeBoolean(NIL == valid_15);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var_16 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , assertion = cdolist_list_var_16.first()) {
                                            if ((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sub_sense)))) {
                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                        SubLObject gaf_asent = thread.secondMultipleValue();
                                                        SubLObject unify_justification = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings) {
                                                            result = cons(list(v_bindings, assertion), result);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_sentence_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sub_asent = literal_atomic_sentence(sub_literal);
        final SubLObject sub_sense = literal_sense(sub_literal);
        final SubLObject source_formula_var = sub_asent;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym4$HL_VAR_), T);
        SubLObject permuted_asent = NIL;
        permuted_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, sub_sense);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$1 = NIL;
                                        final SubLObject token_var_$2 = NIL;
                                        while (NIL == done_var_$1) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                            if ((NIL != valid_$3) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$1 = makeBoolean(NIL == valid_$3);
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
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$2 = NIL;
                                        final SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                            if ((NIL != valid_$4) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$2 = makeBoolean(NIL == valid_$4);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$3 = NIL;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                            if ((NIL != valid_$5) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                            if ((NIL != valid_$6) && (NIL != backward_utilities.direction_is_relevant(assertion))) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                final SubLObject gaf_asent = thread.secondMultipleValue();
                                                final SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings) {
                                                    result = cons(list(v_bindings, assertion), result);
                                                }
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                        SubLObject done_var_$5 = NIL;
                                        final SubLObject token_var_$6 = NIL;
                                        while (NIL == done_var_$5) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                            if ((NIL != valid_$7) && (NIL != backward_utilities.direction_is_relevant(assertion2))) {
                                                thread.resetMultipleValues();
                                                final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED);
                                                final SubLObject gaf_asent2 = thread.secondMultipleValue();
                                                final SubLObject unify_justification2 = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != v_bindings2) {
                                                    result = cons(list(v_bindings2, assertion2), result);
                                                }
                                            }
                                            done_var_$5 = makeBoolean(NIL == valid_$7);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_12, thread);
                            $is_noting_progressP$.rebind(_prev_bind_11, thread);
                            $progress_count$.rebind(_prev_bind_10, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            $progress_notification_count$.rebind(_prev_bind_8, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            $progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var_$17 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            if (((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED);
                                final SubLObject gaf_asent3 = thread.secondMultipleValue();
                                final SubLObject unify_justification3 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings3) {
                                    result = cons(list(v_bindings3, assertion3), result);
                                }
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            assertion3 = cdolist_list_var_$17.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        } 
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_sentence_unbound_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_exactly_asserted_sentence_cost(asent);
    }

    public static SubLObject removal_asserted_sentence_unbound_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_exactly_asserted_sentence_cost(asent);
    }

    public static final SubLObject removal_asserted_sentence_unbound_lookup_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sub_literal = literal_atomic_sentence(sentence);
                SubLObject sub_sense = literal_sense(sentence);
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_literal, sub_sense);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_17 = NIL;
                                                                    SubLObject token_var_18 = NIL;
                                                                    while (NIL == done_var_17) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                                            SubLObject valid_19 = makeBoolean(token_var_18 != assertion);
                                                                            if (NIL != valid_19) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_17 = makeBoolean(NIL == valid_19);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_20 = NIL;
                                                                    SubLObject token_var_21 = NIL;
                                                                    while (NIL == done_var_20) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_21);
                                                                            SubLObject valid_22 = makeBoolean(token_var_21 != assertion);
                                                                            if (NIL != valid_22) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_20 = makeBoolean(NIL == valid_22);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_23 = NIL;
                                                                    SubLObject token_var_24 = NIL;
                                                                    while (NIL == done_var_23) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_24);
                                                                            SubLObject valid_25 = makeBoolean(token_var_24 != assertion);
                                                                            if (NIL != valid_25) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_23 = makeBoolean(NIL == valid_25);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_26 = NIL;
                                                                    SubLObject token_var_27 = NIL;
                                                                    while (NIL == done_var_26) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_27);
                                                                            SubLObject valid_28 = makeBoolean(token_var_27 != assertion);
                                                                            if (NIL != valid_28) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_26 = makeBoolean(NIL == valid_28);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                        {
                                                            SubLObject done_var_29 = NIL;
                                                            SubLObject token_var_30 = NIL;
                                                            while (NIL == done_var_29) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_30);
                                                                    SubLObject valid_31 = makeBoolean(token_var_30 != assertion);
                                                                    if (NIL != valid_31) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                result = cons(assertion, result);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_29 = makeBoolean(NIL == valid_31);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sub_sense)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                result = cons(assertion, result);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_sentence_unbound_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sub_literal = literal_atomic_sentence(sentence);
        final SubLObject sub_sense = literal_sense(sentence);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_literal, sub_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$18 = NIL;
                                    final SubLObject token_var_$19 = NIL;
                                    while (NIL == done_var_$18) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
                                        if (((NIL != valid_$20) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$18 = makeBoolean(NIL == valid_$20);
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
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$19 = NIL;
                                    final SubLObject token_var_$20 = NIL;
                                    while (NIL == done_var_$19) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(assertion));
                                        if (((NIL != valid_$21) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$19 = makeBoolean(NIL == valid_$21);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$20 = NIL;
                                    final SubLObject token_var_$21 = NIL;
                                    while (NIL == done_var_$20) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                        final SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(assertion));
                                        if (((NIL != valid_$22) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$20 = makeBoolean(NIL == valid_$22);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$21 = NIL;
                                    final SubLObject token_var_$22 = NIL;
                                    while (NIL == done_var_$21) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                        final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion));
                                        if (((NIL != valid_$23) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$21 = makeBoolean(NIL == valid_$23);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$22 = NIL;
                                    final SubLObject token_var_$23 = NIL;
                                    while (NIL == done_var_$22) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$23);
                                        final SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(assertion2));
                                        if (((NIL != valid_$24) && (NIL != backward_utilities.direction_is_relevant(assertion2))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion2, result);
                                        }
                                        done_var_$22 = makeBoolean(NIL == valid_$24);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion3), UNPROVIDED, UNPROVIDED))) {
                            result = cons(assertion3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_sentence_lookup_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_cost(asent));
    }

    public static SubLObject removal_asserted_sentence_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_sentence_cost(asent));
    }

    public static final SubLObject removal_asserted_sentence_lookup_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_asent = literal_atomic_sentence(inference_literal);
                SubLObject inference_sense = literal_sense(inference_literal);
                SubLObject found = NIL;
                SubLObject source_formula_var = inference_asent;
                SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym1$HL_VAR_), T);
                SubLObject permuted_asent = NIL;
                for (permuted_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , permuted_asent = cdolist_list_var.first()) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, inference_sense);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_32 = found;
                                                                            SubLObject token_var_33 = NIL;
                                                                            while (NIL == done_var_32) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                                                                                    SubLObject valid_34 = makeBoolean(token_var_33 != assertion);
                                                                                    if (NIL != valid_34) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                                                                    }
                                                                                    done_var_32 = makeBoolean((NIL == valid_34) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_35 = found;
                                                                            SubLObject token_var_36 = NIL;
                                                                            while (NIL == done_var_35) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_36);
                                                                                    SubLObject valid_37 = makeBoolean(token_var_36 != assertion);
                                                                                    if (NIL != valid_37) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                                                                    }
                                                                                    done_var_35 = makeBoolean((NIL == valid_37) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_38 = found;
                                                                            SubLObject token_var_39 = NIL;
                                                                            while (NIL == done_var_38) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_39);
                                                                                    SubLObject valid_40 = makeBoolean(token_var_39 != assertion);
                                                                                    if (NIL != valid_40) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                                                                    }
                                                                                    done_var_38 = makeBoolean((NIL == valid_40) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                        {
                                                                            SubLObject done_var_41 = found;
                                                                            SubLObject token_var_42 = NIL;
                                                                            while (NIL == done_var_41) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_42);
                                                                                    SubLObject valid_43 = makeBoolean(token_var_42 != assertion);
                                                                                    if (NIL != valid_43) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                                                                    }
                                                                                    done_var_41 = makeBoolean((NIL == valid_43) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                {
                                                                    SubLObject done_var_44 = found;
                                                                    SubLObject token_var_45 = NIL;
                                                                    while (NIL == done_var_44) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_45);
                                                                            SubLObject valid_46 = makeBoolean(token_var_45 != assertion);
                                                                            if (NIL != valid_46) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                                                            }
                                                                            done_var_44 = makeBoolean((NIL == valid_46) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject rest = NIL;
                                        for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); !((NIL != found) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject assertion = rest.first();
                                                if ((NIL == enumeration_types.sense_truth(inference_sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(inference_sense)))) {
                                                    found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                    if (NIL == found) {
                        backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_sentence_lookup_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_asent = literal_atomic_sentence(inference_literal);
        final SubLObject inference_sense = literal_sense(inference_literal);
        SubLObject found = NIL;
        final SubLObject source_formula_var = inference_asent;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, symbol_function($sym4$HL_VAR_), T);
        SubLObject permuted_asent = NIL;
        permuted_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, inference_sense);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                        SubLObject done_var_$34 = found;
                                        final SubLObject token_var_$35 = NIL;
                                        while (NIL == done_var_$34) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                            final SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(assertion));
                                            if (NIL != valid_$36) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                            }
                                            done_var_$34 = makeBoolean((NIL == valid_$36) || (NIL != found));
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
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                        SubLObject done_var_$35 = found;
                                        final SubLObject token_var_$36 = NIL;
                                        while (NIL == done_var_$35) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                            final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(assertion));
                                            if (NIL != valid_$37) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                            }
                                            done_var_$35 = makeBoolean((NIL == valid_$37) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                        SubLObject done_var_$36 = found;
                                        final SubLObject token_var_$37 = NIL;
                                        while (NIL == done_var_$36) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                            final SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(assertion));
                                            if (NIL != valid_$38) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                            }
                                            done_var_$36 = makeBoolean((NIL == valid_$38) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                        SubLObject done_var_$37 = found;
                                        final SubLObject token_var_$38 = NIL;
                                        while (NIL == done_var_$37) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                                            final SubLObject valid_$39 = makeBoolean(!token_var_$38.eql(assertion));
                                            if (NIL != valid_$39) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, permuted_asent);
                                            }
                                            done_var_$37 = makeBoolean((NIL == valid_$39) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = found;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                        SubLObject done_var_$38 = found;
                                        final SubLObject token_var_$39 = NIL;
                                        while (NIL == done_var_$38) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$39);
                                            final SubLObject valid_$40 = makeBoolean(!token_var_$39.eql(assertion2));
                                            if (NIL != valid_$40) {
                                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion2, permuted_asent);
                                            }
                                            done_var_$38 = makeBoolean((NIL == valid_$40) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != found));
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_12, thread);
                            $is_noting_progressP$.rebind(_prev_bind_11, thread);
                            $progress_count$.rebind(_prev_bind_10, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            $progress_notification_count$.rebind(_prev_bind_8, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            $progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject rest;
                        SubLObject assertion3;
                        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == found) && (NIL != rest); rest = rest.rest()) {
                            assertion3 = rest.first();
                            if ((NIL == enumeration_types.sense_truth(inference_sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(inference_sense)))) {
                                found = removal_asserted_sentence_lookup_neg_expand_internal(assertion3, permuted_asent);
                            }
                        }
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


            if (NIL == found) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permuted_asent = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_asserted_sentence_lookup_neg_expand_internal_alt(SubLObject assertion, SubLObject inference_asent) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            {
                SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                return list_utilities.sublisp_boolean(unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, UNPROVIDED, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject removal_asserted_sentence_lookup_neg_expand_internal(final SubLObject assertion, final SubLObject inference_asent) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            return list_utilities.sublisp_boolean(unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject removal_exactly_asserted_sentence_cost_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                if (NIL != variables.fully_bound_p(gaf_sentence)) {
                    return $hl_module_check_cost$.getDynamicValue(thread);
                } else {
                    {
                        SubLObject sub_literal = literal_atomic_sentence(gaf_sentence);
                        SubLObject sub_sense = literal_sense(gaf_sentence);
                        return inference_trampolines.inference_num_gaf_lookup_index(sub_literal, sub_sense);
                    }
                }
            }
        }
    }

    public static SubLObject removal_exactly_asserted_sentence_cost(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != variables.fully_bound_p(gaf_sentence)) {
            return $hl_module_check_cost$.getDynamicValue(thread);
        }
        final SubLObject sub_literal = literal_atomic_sentence(gaf_sentence);
        final SubLObject sub_sense = literal_sense(gaf_sentence);
        return inference_trampolines.inference_num_gaf_lookup_index(sub_literal, sub_sense);
    }

    public static final SubLObject removal_exactly_asserted_sentence_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_exactly_asserted_sentence_cost(asent);
    }

    public static SubLObject removal_exactly_asserted_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_exactly_asserted_sentence_cost(asent);
    }

    public static final SubLObject removal_exactly_asserted_sentence_lookup_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sub_asent = literal_atomic_sentence(sub_literal);
                SubLObject sub_sense = literal_sense(sub_literal);
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_asent, sub_sense);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_47 = NIL;
                                                                    SubLObject token_var_48 = NIL;
                                                                    while (NIL == done_var_47) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_48);
                                                                            SubLObject valid_49 = makeBoolean(token_var_48 != assertion);
                                                                            if (NIL != valid_49) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_47 = makeBoolean(NIL == valid_49);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_50 = NIL;
                                                                    SubLObject token_var_51 = NIL;
                                                                    while (NIL == done_var_50) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_51);
                                                                            SubLObject valid_52 = makeBoolean(token_var_51 != assertion);
                                                                            if (NIL != valid_52) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_50 = makeBoolean(NIL == valid_52);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_53 = NIL;
                                                                    SubLObject token_var_54 = NIL;
                                                                    while (NIL == done_var_53) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_54);
                                                                            SubLObject valid_55 = makeBoolean(token_var_54 != assertion);
                                                                            if (NIL != valid_55) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_53 = makeBoolean(NIL == valid_55);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_56 = NIL;
                                                                    SubLObject token_var_57 = NIL;
                                                                    while (NIL == done_var_56) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_57);
                                                                            SubLObject valid_58 = makeBoolean(token_var_57 != assertion);
                                                                            if (NIL != valid_58) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_56 = makeBoolean(NIL == valid_58);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                        {
                                                            SubLObject done_var_59 = NIL;
                                                            SubLObject token_var_60 = NIL;
                                                            while (NIL == done_var_59) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_60);
                                                                    SubLObject valid_61 = makeBoolean(token_var_60 != assertion);
                                                                    if (NIL != valid_61) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            if (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                result = cons(assertion, result);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_59 = makeBoolean(NIL == valid_61);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sub_sense)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            if (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                result = cons(assertion, result);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_exactly_asserted_sentence_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sub_asent = literal_atomic_sentence(sub_literal);
        final SubLObject sub_sense = literal_sense(sub_literal);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_asent, sub_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$50 = NIL;
                                    final SubLObject token_var_$51 = NIL;
                                    while (NIL == done_var_$50) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                        final SubLObject valid_$52 = makeBoolean(!token_var_$51.eql(assertion));
                                        if (((NIL != valid_$52) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$50 = makeBoolean(NIL == valid_$52);
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
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$51 = NIL;
                                    final SubLObject token_var_$52 = NIL;
                                    while (NIL == done_var_$51) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                        final SubLObject valid_$53 = makeBoolean(!token_var_$52.eql(assertion));
                                        if (((NIL != valid_$53) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$51 = makeBoolean(NIL == valid_$53);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$52 = NIL;
                                    final SubLObject token_var_$53 = NIL;
                                    while (NIL == done_var_$52) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                        final SubLObject valid_$54 = makeBoolean(!token_var_$53.eql(assertion));
                                        if (((NIL != valid_$54) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$52 = makeBoolean(NIL == valid_$54);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$53 = NIL;
                                    final SubLObject token_var_$54 = NIL;
                                    while (NIL == done_var_$53) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$54);
                                        final SubLObject valid_$55 = makeBoolean(!token_var_$54.eql(assertion));
                                        if (((NIL != valid_$55) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$53 = makeBoolean(NIL == valid_$55);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$54 = NIL;
                                    final SubLObject token_var_$55 = NIL;
                                    while (NIL == done_var_$54) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$55);
                                        final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(assertion2));
                                        if (((NIL != valid_$56) && (NIL != backward_utilities.direction_is_relevant(assertion2))) && (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion2, result);
                                        }
                                        done_var_$54 = makeBoolean(NIL == valid_$56);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) && (NIL != unification_utilities.gaf_asent_unify(sub_asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED))) {
                            result = cons(assertion3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_exactly_asserted_sentence_unbound_lookup_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_exactly_asserted_sentence_cost(asent);
    }

    public static SubLObject removal_exactly_asserted_sentence_unbound_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_exactly_asserted_sentence_cost(asent);
    }

    public static final SubLObject removal_exactly_asserted_sentence_unbound_lookup_iterator_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sub_literal = literal_atomic_sentence(sentence);
                SubLObject sub_sense = literal_sense(sentence);
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_literal, sub_sense);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_62 = NIL;
                                                                    SubLObject token_var_63 = NIL;
                                                                    while (NIL == done_var_62) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_63);
                                                                            SubLObject valid_64 = makeBoolean(token_var_63 != assertion);
                                                                            if (NIL != valid_64) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_62 = makeBoolean(NIL == valid_64);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_65 = NIL;
                                                                    SubLObject token_var_66 = NIL;
                                                                    while (NIL == done_var_65) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_66);
                                                                            SubLObject valid_67 = makeBoolean(token_var_66 != assertion);
                                                                            if (NIL != valid_67) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_65 = makeBoolean(NIL == valid_67);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_68 = NIL;
                                                                    SubLObject token_var_69 = NIL;
                                                                    while (NIL == done_var_68) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_69);
                                                                            SubLObject valid_70 = makeBoolean(token_var_69 != assertion);
                                                                            if (NIL != valid_70) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_68 = makeBoolean(NIL == valid_70);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                                {
                                                                    SubLObject done_var_71 = NIL;
                                                                    SubLObject token_var_72 = NIL;
                                                                    while (NIL == done_var_71) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_72);
                                                                            SubLObject valid_73 = makeBoolean(token_var_72 != assertion);
                                                                            if (NIL != valid_73) {
                                                                                if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                                    if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                        result = cons(assertion, result);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_71 = makeBoolean(NIL == valid_73);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                                        {
                                                            SubLObject done_var_74 = NIL;
                                                            SubLObject token_var_75 = NIL;
                                                            while (NIL == done_var_74) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_75);
                                                                    SubLObject valid_76 = makeBoolean(token_var_75 != assertion);
                                                                    if (NIL != valid_76) {
                                                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                                                            if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                                                result = cons(assertion, result);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_74 = makeBoolean(NIL == valid_76);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sub_sense)))) {
                                        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            if (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                                result = cons(assertion, result);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL != result) {
                    return iteration.new_list_iterator(result);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_exactly_asserted_sentence_unbound_lookup_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sub_literal = literal_atomic_sentence(sentence);
        final SubLObject sub_sense = literal_sense(sentence);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sub_literal, sub_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$66 = NIL;
                                    final SubLObject token_var_$67 = NIL;
                                    while (NIL == done_var_$66) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                        final SubLObject valid_$68 = makeBoolean(!token_var_$67.eql(assertion));
                                        if (((NIL != valid_$68) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$66 = makeBoolean(NIL == valid_$68);
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
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$67 = NIL;
                                    final SubLObject token_var_$68 = NIL;
                                    while (NIL == done_var_$67) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                                        final SubLObject valid_$69 = makeBoolean(!token_var_$68.eql(assertion));
                                        if (((NIL != valid_$69) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$67 = makeBoolean(NIL == valid_$69);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$68 = NIL;
                                    final SubLObject token_var_$69 = NIL;
                                    while (NIL == done_var_$68) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$69);
                                        final SubLObject valid_$70 = makeBoolean(!token_var_$69.eql(assertion));
                                        if (((NIL != valid_$70) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$68 = makeBoolean(NIL == valid_$70);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$69 = NIL;
                                    final SubLObject token_var_$70 = NIL;
                                    while (NIL == done_var_$69) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                        final SubLObject valid_$71 = makeBoolean(!token_var_$70.eql(assertion));
                                        if (((NIL != valid_$71) && (NIL != backward_utilities.direction_is_relevant(assertion))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$69 = makeBoolean(NIL == valid_$71);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    SubLObject done_var_$70 = NIL;
                                    final SubLObject token_var_$71 = NIL;
                                    while (NIL == done_var_$70) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$71);
                                        final SubLObject valid_$72 = makeBoolean(!token_var_$71.eql(assertion2));
                                        if (((NIL != valid_$72) && (NIL != backward_utilities.direction_is_relevant(assertion2))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion2), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion2, result);
                                        }
                                        done_var_$70 = makeBoolean(NIL == valid_$72);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL == enumeration_types.sense_truth(sub_sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sub_sense)))) && (NIL != backward_utilities.direction_is_relevant(assertion3))) && (NIL != unification_utilities.gaf_asent_unify(sentence, assertions_high.gaf_el_formula(assertion3), UNPROVIDED, UNPROVIDED))) {
                            result = cons(assertion3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    public static final SubLObject removal_exactly_asserted_sentence_lookup_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_exactly_asserted_sentence_cost(asent));
    }

    public static SubLObject removal_exactly_asserted_sentence_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_exactly_asserted_sentence_cost(asent));
    }

    public static final SubLObject removal_exactly_asserted_sentence_lookup_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_asent = literal_atomic_sentence(inference_literal);
                SubLObject inference_sense = literal_sense(inference_literal);
                SubLObject found = NIL;
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(inference_asent, inference_sense);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                {
                                                                    SubLObject done_var_77 = found;
                                                                    SubLObject token_var_78 = NIL;
                                                                    while (NIL == done_var_77) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_78);
                                                                            SubLObject valid_79 = makeBoolean(token_var_78 != assertion);
                                                                            if (NIL != valid_79) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_77 = makeBoolean((NIL == valid_79) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                {
                                                                    SubLObject done_var_80 = found;
                                                                    SubLObject token_var_81 = NIL;
                                                                    while (NIL == done_var_80) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_81);
                                                                            SubLObject valid_82 = makeBoolean(token_var_81 != assertion);
                                                                            if (NIL != valid_82) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_80 = makeBoolean((NIL == valid_82) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                {
                                                                    SubLObject done_var_83 = found;
                                                                    SubLObject token_var_84 = NIL;
                                                                    while (NIL == done_var_83) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_84);
                                                                            SubLObject valid_85 = makeBoolean(token_var_84 != assertion);
                                                                            if (NIL != valid_85) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_83 = makeBoolean((NIL == valid_85) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                                {
                                                                    SubLObject done_var_86 = found;
                                                                    SubLObject token_var_87 = NIL;
                                                                    while (NIL == done_var_86) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_87);
                                                                            SubLObject valid_88 = makeBoolean(token_var_87 != assertion);
                                                                            if (NIL != valid_88) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                                                            }
                                                                            done_var_86 = makeBoolean((NIL == valid_88) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = found;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                                        {
                                                            SubLObject done_var_89 = found;
                                                            SubLObject token_var_90 = NIL;
                                                            while (NIL == done_var_89) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_90);
                                                                    SubLObject valid_91 = makeBoolean(token_var_90 != assertion);
                                                                    if (NIL != valid_91) {
                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                                                    }
                                                                    done_var_89 = makeBoolean((NIL == valid_91) || (NIL != found));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject rest = NIL;
                                for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); !((NIL != found) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject assertion = rest.first();
                                        if ((NIL == enumeration_types.sense_truth(inference_sense)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(inference_sense)))) {
                                            found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
                if (NIL == found) {
                    backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_exactly_asserted_sentence_lookup_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_asent = literal_atomic_sentence(inference_literal);
        final SubLObject inference_sense = literal_sense(inference_literal);
        SubLObject found = NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(inference_asent, inference_sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                    SubLObject done_var_$82 = found;
                                    final SubLObject token_var_$83 = NIL;
                                    while (NIL == done_var_$82) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                        final SubLObject valid_$84 = makeBoolean(!token_var_$83.eql(assertion));
                                        if (NIL != valid_$84) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                        done_var_$82 = makeBoolean((NIL == valid_$84) || (NIL != found));
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
                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                    SubLObject done_var_$83 = found;
                                    final SubLObject token_var_$84 = NIL;
                                    while (NIL == done_var_$83) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                        final SubLObject valid_$85 = makeBoolean(!token_var_$84.eql(assertion));
                                        if (NIL != valid_$85) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                        done_var_$83 = makeBoolean((NIL == valid_$85) || (NIL != found));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                    SubLObject done_var_$84 = found;
                                    final SubLObject token_var_$85 = NIL;
                                    while (NIL == done_var_$84) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$85);
                                        final SubLObject valid_$86 = makeBoolean(!token_var_$85.eql(assertion));
                                        if (NIL != valid_$86) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                        done_var_$84 = makeBoolean((NIL == valid_$86) || (NIL != found));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = found;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                    SubLObject done_var_$85 = found;
                                    final SubLObject token_var_$86 = NIL;
                                    while (NIL == done_var_$85) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                        final SubLObject valid_$87 = makeBoolean(!token_var_$86.eql(assertion));
                                        if (NIL != valid_$87) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion, asent);
                                        }
                                        done_var_$85 = makeBoolean((NIL == valid_$87) || (NIL != found));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = found;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(inference_sense), NIL);
                                    SubLObject done_var_$86 = found;
                                    final SubLObject token_var_$87 = NIL;
                                    while (NIL == done_var_$86) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$87);
                                        final SubLObject valid_$88 = makeBoolean(!token_var_$87.eql(assertion2));
                                        if (NIL != valid_$88) {
                                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion2, asent);
                                        }
                                        done_var_$86 = makeBoolean((NIL == valid_$88) || (NIL != found));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean((NIL == valid2) || (NIL != found));
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject rest;
                    SubLObject assertion3;
                    for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == found) && (NIL != rest); rest = rest.rest()) {
                        assertion3 = rest.first();
                        if ((NIL == enumeration_types.sense_truth(inference_sense)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(inference_sense)))) {
                            found = removal_asserted_sentence_lookup_neg_expand_internal(assertion3, asent);
                        }
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        if (NIL == found) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_predicate_arg_pos_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_predicate_arg_check_cost(asent);
    }

    public static SubLObject removal_asserted_predicate_arg_pos_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_predicate_arg_check_cost(asent);
    }

    public static final SubLObject removal_asserted_predicate_arg_pos_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_predicate_arg_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_asserted_predicate_arg_pos_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_asserted_predicate_arg_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_predicate_arg_check_cost_alt(SubLObject asent) {
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject predicate = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            return min(ONE_INTEGER, kb_indexing.num_gaf_arg_index(v_term, argnum, predicate, UNPROVIDED));
        }
    }

    public static SubLObject removal_asserted_predicate_arg_check_cost(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return min(ONE_INTEGER, kb_indexing.num_gaf_arg_index(v_term, argnum, predicate, UNPROVIDED));
    }

    public static final SubLObject removal_asserted_predicate_arg_check_alt(SubLObject asent) {
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject predicate = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            return plusp(kb_indexing.relevant_num_gaf_arg_index(v_term, argnum, predicate));
        }
    }

    public static SubLObject removal_asserted_predicate_arg_check(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return plusp(kb_indexing.relevant_num_gaf_arg_index(v_term, argnum, predicate));
    }

    public static final SubLObject removal_asserted_predicate_arg_neg_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_predicate_arg_check_cost(asent));
    }

    public static SubLObject removal_asserted_predicate_arg_neg_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_predicate_arg_check_cost(asent));
    }

    public static final SubLObject removal_asserted_predicate_arg_neg_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_predicate_arg_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_asserted_predicate_arg_neg_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == removal_asserted_predicate_arg_check(asent)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_predicate_term_arg_var_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return length(inference_trampolines.inference_key_gaf_arg_index(v_term, argnum, UNPROVIDED));
        }
    }

    public static SubLObject removal_asserted_predicate_term_arg_var_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return length(inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(v_term, argnum));
    }

    public static final SubLObject removal_asserted_predicate_term_arg_var_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject keys = inference_trampolines.inference_key_gaf_arg_index(v_term, argnum, UNPROVIDED);
                SubLObject cdolist_list_var = keys;
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg3, key, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                                SubLObject hl_support = arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support, v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_predicate_term_arg_var_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(v_term, argnum);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg3, key, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                final SubLObject hl_support = arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_asserted_predicate_term_var_var_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject argnums = inference_trampolines.inference_key_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = argnums;
            SubLObject argnum = NIL;
            for (argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum = cdolist_list_var.first()) {
                total = add(total, length(inference_trampolines.inference_key_gaf_arg_index(v_term, argnum, UNPROVIDED)));
            }
            return total;
        }
    }

    public static SubLObject removal_asserted_predicate_term_var_var_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return length(inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), UNPROVIDED));
    }

    public static final SubLObject removal_asserted_predicate_term_var_var_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject argnums = inference_trampolines.inference_key_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = argnums;
                SubLObject argnum = NIL;
                for (argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum = cdolist_list_var.first()) {
                    {
                        SubLObject preds = inference_trampolines.inference_key_gaf_arg_index(v_term, argnum, UNPROVIDED);
                        SubLObject cdolist_list_var_92 = preds;
                        SubLObject pred = NIL;
                        for (pred = cdolist_list_var_92.first(); NIL != cdolist_list_var_92; cdolist_list_var_92 = cdolist_list_var_92.rest() , pred = cdolist_list_var_92.first()) {
                            {
                                SubLObject support_formula = list($$assertedPredicateArg, v_term, argnum, pred);
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, support_formula, T, T);
                                    SubLObject gaf_asent = thread.secondMultipleValue();
                                    SubLObject unify_justification = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != v_bindings) {
                                        {
                                            SubLObject hl_support = arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED);
                                            backward.removal_add_node(hl_support, v_bindings, unify_justification);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_predicate_term_var_var_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject argnums = cdolist_list_var = inference_trampolines.inference_argnums_from_gafs_mentioning_term(v_term);
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$98;
            final SubLObject preds = cdolist_list_var_$98 = inference_trampolines.inference_preds_from_gafs_mentioning_term_at_index(v_term, argnum);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$98.first();
            while (NIL != cdolist_list_var_$98) {
                final SubLObject support_formula = list($$assertedPredicateArg, v_term, argnum, pred);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, support_formula, T, T);
                final SubLObject gaf_asent = thread.secondMultipleValue();
                final SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    final SubLObject hl_support = arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED);
                    backward.removal_add_node(hl_support, v_bindings, unify_justification);
                }
                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                pred = cdolist_list_var_$98.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_asserted_predicate_var_arg_pred_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject pred = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
            return kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        }
    }

    public static SubLObject removal_asserted_predicate_var_arg_pred_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
    }

    public static final SubLObject removal_asserted_predicate_var_arg_pred_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_refs(pred, argnum, $TRUE);
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg1, v_term, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                                SubLObject hl_support = arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support, v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_predicate_var_arg_pred_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_refs(pred, argnum, $TRUE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                final SubLObject hl_support = arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject make_term_formulas_support_alt(SubLObject support_formula) {
        return arguments.make_hl_support($OPAQUE, support_formula, $term_formulas_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_term_formulas_support(final SubLObject support_formula) {
        return arguments.make_hl_support($OPAQUE, support_formula, $term_formulas_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static final SubLObject inference_term_formulas_find_alt(SubLObject v_term, SubLObject formula) {
        SubLTrampolineFile.checkType(formula, CYCL_FORMULA_P);
        return cycl_utilities.expression_find(v_term, formula, T, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_term_formulas_find(final SubLObject v_term, final SubLObject formula) {
        assert NIL != cycl_grammar.cycl_formula_p(formula) : "! cycl_grammar.cycl_formula_p(formula) " + ("cycl_grammar.cycl_formula_p(formula) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(formula) ") + formula;
        return cycl_utilities.expression_find(v_term, formula, T, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject inference_term_formulas_gather_alt(SubLObject formula) {
        formula = czer_utilities.unwrap_quotes(formula);
        SubLTrampolineFile.checkType(formula, CYCL_FORMULA_P);
        return list_utilities.remove_if_not(FULLY_BOUND_P, list_utilities.remove_if_not($sym41$CLOSED_, cycl_utilities.expression_gather(formula, HL_TERM_P, T, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_term_formulas_gather(SubLObject formula) {
        formula = czer_utilities.unwrap_quotes(formula);
        assert NIL != cycl_grammar.cycl_formula_p(formula) : "! cycl_grammar.cycl_formula_p(formula) " + ("cycl_grammar.cycl_formula_p(formula) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(formula) ") + formula;
        final SubLObject candidates = list_utilities.fast_delete_duplicates(narts_high.nart_substitute(cycl_utilities.expression_gather(formula, HL_TERM_P, T, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != closedP(candidate, UNPROVIDED)) && (NIL != variables.fully_bound_p(candidate))) {
                result = cons(candidate, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject inference_term_formulas_count_alt(SubLObject formula) {
        return length(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_gather(formula));
    }

    public static SubLObject inference_term_formulas_count(final SubLObject formula) {
        return length(inference_term_formulas_gather(formula));
    }

    public static final SubLObject removal_term_formulas_check_cost_pos_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_term_formulas_check_cost(asent);
    }

    public static SubLObject removal_term_formulas_check_cost_pos(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_term_formulas_check_cost(asent);
    }

    public static final SubLObject removal_term_formulas_check_expand_pos_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_term_formulas_check(asent)) {
            backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.make_term_formulas_support(asent), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_term_formulas_check_expand_pos(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_term_formulas_check(asent)) {
            backward.removal_add_node(make_term_formulas_support(asent), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_term_formulas_check_alt(SubLObject asent) {
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            formula = czer_utilities.unwrap_quotes(formula);
            return makeBoolean((NIL != cycl_formula_p(formula)) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, formula)));
        }
    }

    public static SubLObject removal_term_formulas_check(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        formula = czer_utilities.unwrap_quotes(formula);
        return makeBoolean((NIL != cycl_grammar.cycl_formula_p(formula)) && (NIL != inference_term_formulas_find(v_term, formula)));
    }

    public static final SubLObject removal_term_formulas_check_cost_alt(SubLObject asent) {
        return NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_term_formulas_check(asent) ? ((SubLObject) ($cheap_hl_module_check_cost$.getGlobalValue())) : ZERO_INTEGER;
    }

    public static SubLObject removal_term_formulas_check_cost(final SubLObject asent) {
        return NIL != removal_term_formulas_check(asent) ? $cheap_hl_module_check_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    public static final SubLObject removal_term_formulas_check_cost_neg_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_term_formulas_check_cost(asent));
    }

    public static SubLObject removal_term_formulas_check_cost_neg(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_term_formulas_check_cost(asent));
    }

    public static final SubLObject removal_term_formulas_check_expand_neg_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_term_formulas_check(asent)) {
            backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.make_term_formulas_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_term_formulas_check_expand_neg(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL == removal_term_formulas_check(asent)) {
            backward.removal_add_node(make_term_formulas_support(cycl_utilities.negate(asent)), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_term_formulas_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_count(formula);
        }
    }

    public static SubLObject removal_term_formulas_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_term_formulas_count(formula);
    }

    public static final SubLObject removal_term_formulas_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject terms = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_gather(formula);
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg1, v_term, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                                backward.removal_add_node(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.make_term_formulas_support(support_formula), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_term_formulas_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = inference_term_formulas_gather(formula);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(make_term_formulas_support(support_formula), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_sentence_cost_alt(SubLObject sentence) {
        return inference_trampolines.inference_num_gaf_lookup_index(sentence, $POS);
    }

    public static SubLObject removal_asserted_term_sentences_sentence_cost(final SubLObject sentence) {
        return inference_trampolines.inference_num_gaf_lookup_index(sentence, $POS);
    }

    public static final SubLObject removal_asserted_term_sentences_term_index_cost_alt(SubLObject v_term, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (NIL == predicate) {
            return kb_indexing.relevant_num_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject term_index_cost = ZERO_INTEGER;
            SubLObject cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
            SubLObject term_key = NIL;
            for (term_key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_key = cdolist_list_var.first()) {
                term_index_cost = add(term_index_cost, kb_indexing.relevant_num_gaf_arg_index(v_term, term_key, predicate));
            }
            return term_index_cost;
        }
    }

    public static SubLObject removal_asserted_term_sentences_term_index_cost(final SubLObject v_term, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (NIL == predicate) {
            return kb_indexing.relevant_num_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
        }
        SubLObject term_index_cost = ZERO_INTEGER;
        SubLObject cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
        SubLObject term_key = NIL;
        term_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_index_cost = add(term_index_cost, kb_indexing.relevant_num_gaf_arg_index(v_term, term_key, predicate));
            cdolist_list_var = cdolist_list_var.rest();
            term_key = cdolist_list_var.first();
        } 
        return term_index_cost;
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_cost(asent);
    }

    public static SubLObject removal_asserted_term_sentences_gaf_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_term_sentences_gaf_check_cost(asent);
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, sentence)) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term_93 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_93, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_93, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_94 = NIL;
                                                                            SubLObject token_var_95 = NIL;
                                                                            while (NIL == done_var_94) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_95);
                                                                                    SubLObject valid_96 = makeBoolean(token_var_95 != assertion);
                                                                                    if (NIL != valid_96) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_94 = makeBoolean(NIL == valid_96);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_93, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_93, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_97 = NIL;
                                                                            SubLObject token_var_98 = NIL;
                                                                            while (NIL == done_var_97) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_98);
                                                                                    SubLObject valid_99 = makeBoolean(token_var_98 != assertion);
                                                                                    if (NIL != valid_99) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_97 = makeBoolean(NIL == valid_99);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_93, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_93, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_100 = NIL;
                                                                            SubLObject token_var_101 = NIL;
                                                                            while (NIL == done_var_100) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_101);
                                                                                    SubLObject valid_102 = makeBoolean(token_var_101 != assertion);
                                                                                    if (NIL != valid_102) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_100 = makeBoolean(NIL == valid_102);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_93, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_93, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_103 = NIL;
                                                                            SubLObject token_var_104 = NIL;
                                                                            while (NIL == done_var_103) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_104);
                                                                                    SubLObject valid_105 = makeBoolean(token_var_104 != assertion);
                                                                                    if (NIL != valid_105) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_103 = makeBoolean(NIL == valid_105);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_106 = NIL;
                                                                    SubLObject token_var_107 = NIL;
                                                                    while (NIL == done_var_106) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_107);
                                                                            SubLObject valid_108 = makeBoolean(token_var_107 != assertion);
                                                                            if (NIL != valid_108) {
                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                            }
                                                                            done_var_106 = makeBoolean(NIL == valid_108);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_gaf_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != inference_term_formulas_find(v_term, sentence)) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$99 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$100 = NIL;
                                        final SubLObject token_var_$101 = NIL;
                                        while (NIL == done_var_$100) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$101);
                                            final SubLObject valid_$102 = makeBoolean(!token_var_$101.eql(assertion));
                                            if (NIL != valid_$102) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$100 = makeBoolean(NIL == valid_$102);
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
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$101 = NIL;
                                        final SubLObject token_var_$102 = NIL;
                                        while (NIL == done_var_$101) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$102);
                                            final SubLObject valid_$103 = makeBoolean(!token_var_$102.eql(assertion));
                                            if (NIL != valid_$103) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$101 = makeBoolean(NIL == valid_$103);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$102 = NIL;
                                        final SubLObject token_var_$103 = NIL;
                                        while (NIL == done_var_$102) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$103);
                                            final SubLObject valid_$104 = makeBoolean(!token_var_$103.eql(assertion));
                                            if (NIL != valid_$104) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$102 = makeBoolean(NIL == valid_$104);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$99, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$99, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$103 = NIL;
                                        final SubLObject token_var_$104 = NIL;
                                        while (NIL == done_var_$103) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$104);
                                            final SubLObject valid_$105 = makeBoolean(!token_var_$104.eql(assertion));
                                            if (NIL != valid_$105) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$103 = makeBoolean(NIL == valid_$105);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$104 = NIL;
                                        final SubLObject token_var_$105 = NIL;
                                        while (NIL == done_var_$104) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$105);
                                            final SubLObject valid_$106 = makeBoolean(!token_var_$105.eql(assertion2));
                                            if (NIL != valid_$106) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion2, sentence);
                                            }
                                            done_var_$104 = makeBoolean(NIL == valid_$106);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_12, thread);
                            $is_noting_progressP$.rebind(_prev_bind_11, thread);
                            $progress_count$.rebind(_prev_bind_10, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            $progress_notification_count$.rebind(_prev_bind_8, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            $progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                                removal_modules_lookup.removal_lookup_expand_internal(assertion3, sentence);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion3 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_check_cost_alt(SubLObject asent) {
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, sentence) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_sentence_cost(sentence))) : ZERO_INTEGER;
        }
    }

    public static SubLObject removal_asserted_term_sentences_gaf_check_cost(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return NIL != inference_term_formulas_find(v_term, sentence) ? removal_asserted_term_sentences_sentence_cost(sentence) : ZERO_INTEGER;
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_cost(asent));
    }

    public static SubLObject removal_asserted_term_sentences_gaf_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_term_sentences_gaf_check_cost(asent));
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject inference_asent = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject found = NIL;
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, inference_asent)) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(inference_asent, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term_109 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_109, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_109, argnum, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_110 = found;
                                                                            SubLObject token_var_111 = NIL;
                                                                            while (NIL == done_var_110) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_111);
                                                                                    SubLObject valid_112 = makeBoolean(token_var_111 != assertion);
                                                                                    if (NIL != valid_112) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                                                                    }
                                                                                    done_var_110 = makeBoolean((NIL == valid_112) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_109, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_109, argnum, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_113 = found;
                                                                            SubLObject token_var_114 = NIL;
                                                                            while (NIL == done_var_113) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_114);
                                                                                    SubLObject valid_115 = makeBoolean(token_var_114 != assertion);
                                                                                    if (NIL != valid_115) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                                                                    }
                                                                                    done_var_113 = makeBoolean((NIL == valid_115) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_109, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_109, NIL, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_116 = found;
                                                                            SubLObject token_var_117 = NIL;
                                                                            while (NIL == done_var_116) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_117);
                                                                                    SubLObject valid_118 = makeBoolean(token_var_117 != assertion);
                                                                                    if (NIL != valid_118) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                                                                    }
                                                                                    done_var_116 = makeBoolean((NIL == valid_118) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_109, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_109, NIL, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_119 = found;
                                                                            SubLObject token_var_120 = NIL;
                                                                            while (NIL == done_var_119) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_120);
                                                                                    SubLObject valid_121 = makeBoolean(token_var_120 != assertion);
                                                                                    if (NIL != valid_121) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                                                                    }
                                                                                    done_var_119 = makeBoolean((NIL == valid_121) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_122 = found;
                                                                    SubLObject token_var_123 = NIL;
                                                                    while (NIL == done_var_122) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_123);
                                                                            SubLObject valid_124 = makeBoolean(token_var_123 != assertion);
                                                                            if (NIL != valid_124) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                                                            }
                                                                            done_var_122 = makeBoolean((NIL == valid_124) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject rest = NIL;
                                        for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); !((NIL != found) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject assertion = rest.first();
                                                if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                    found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
                if (NIL == found) {
                    backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_gaf_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inference_asent = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject found = NIL;
        if (NIL != inference_term_formulas_find(v_term, inference_asent)) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(inference_asent, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$116 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$117 = found;
                                        final SubLObject token_var_$118 = NIL;
                                        while (NIL == done_var_$117) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$118);
                                            final SubLObject valid_$119 = makeBoolean(!token_var_$118.eql(assertion));
                                            if (NIL != valid_$119) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                            }
                                            done_var_$117 = makeBoolean((NIL == valid_$119) || (NIL != found));
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
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$118 = found;
                                        final SubLObject token_var_$119 = NIL;
                                        while (NIL == done_var_$118) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$119);
                                            final SubLObject valid_$120 = makeBoolean(!token_var_$119.eql(assertion));
                                            if (NIL != valid_$120) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                            }
                                            done_var_$118 = makeBoolean((NIL == valid_$120) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$119 = found;
                                        final SubLObject token_var_$120 = NIL;
                                        while (NIL == done_var_$119) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                            final SubLObject valid_$121 = makeBoolean(!token_var_$120.eql(assertion));
                                            if (NIL != valid_$121) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                            }
                                            done_var_$119 = makeBoolean((NIL == valid_$121) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$116, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$116, NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$120 = found;
                                        final SubLObject token_var_$121 = NIL;
                                        while (NIL == done_var_$120) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$121);
                                            final SubLObject valid_$122 = makeBoolean(!token_var_$121.eql(assertion));
                                            if (NIL != valid_$122) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion, v_term, inference_asent);
                                            }
                                            done_var_$120 = makeBoolean((NIL == valid_$122) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = found;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$121 = found;
                                        final SubLObject token_var_$122 = NIL;
                                        while (NIL == done_var_$121) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$122);
                                            final SubLObject valid_$123 = makeBoolean(!token_var_$122.eql(assertion2));
                                            if (NIL != valid_$123) {
                                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion2, v_term, inference_asent);
                                            }
                                            done_var_$121 = makeBoolean((NIL == valid_$123) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$132 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != found));
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_12, thread);
                            $is_noting_progressP$.rebind(_prev_bind_11, thread);
                            $progress_count$.rebind(_prev_bind_10, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            $progress_notification_count$.rebind(_prev_bind_8, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            $progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject rest;
                        SubLObject assertion3;
                        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == found) && (NIL != rest); rest = rest.rest()) {
                            assertion3 = rest.first();
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                                found = removal_asserted_term_sentences_gaf_check_neg_expand_internal(assertion3, v_term, inference_asent);
                            }
                        }
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        }
        if (NIL == found) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_check_neg_expand_internal_alt(SubLObject assertion, SubLObject v_term, SubLObject inference_asent) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            {
                SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, gaf_formula)) && (NIL != unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static SubLObject removal_asserted_term_sentences_gaf_check_neg_expand_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject inference_asent) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            return makeBoolean((NIL != inference_term_formulas_find(v_term, gaf_formula)) && (NIL != unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_iterate_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject term_count = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_count(sentence);
            SubLObject sentence_cost = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_sentence_cost(sentence);
            return multiply(term_count, sentence_cost);
        }
    }

    public static SubLObject removal_asserted_term_sentences_gaf_iterate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject term_count = inference_term_formulas_count(sentence);
        final SubLObject sentence_cost = removal_asserted_term_sentences_sentence_cost(sentence);
        return multiply(term_count, sentence_cost);
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_iterate_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
                SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                SubLObject pcase_var = method;
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_125 = NIL;
                                                                    SubLObject token_var_126 = NIL;
                                                                    while (NIL == done_var_125) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_126);
                                                                            SubLObject valid_127 = makeBoolean(token_var_126 != assertion);
                                                                            if (NIL != valid_127) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                                                            }
                                                                            done_var_125 = makeBoolean(NIL == valid_127);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_128 = NIL;
                                                                    SubLObject token_var_129 = NIL;
                                                                    while (NIL == done_var_128) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_129);
                                                                            SubLObject valid_130 = makeBoolean(token_var_129 != assertion);
                                                                            if (NIL != valid_130) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                                                            }
                                                                            done_var_128 = makeBoolean(NIL == valid_130);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        } else {
                            if (NIL != predicate) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_131 = NIL;
                                                                    SubLObject token_var_132 = NIL;
                                                                    while (NIL == done_var_131) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_132);
                                                                            SubLObject valid_133 = makeBoolean(token_var_132 != assertion);
                                                                            if (NIL != valid_133) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                                                            }
                                                                            done_var_131 = makeBoolean(NIL == valid_133);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_134 = NIL;
                                                                    SubLObject token_var_135 = NIL;
                                                                    while (NIL == done_var_134) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_135);
                                                                            SubLObject valid_136 = makeBoolean(token_var_135 != assertion);
                                                                            if (NIL != valid_136) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                                                            }
                                                                            done_var_134 = makeBoolean(NIL == valid_136);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
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
                        }
                    }
                } else {
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        {
                            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                        {
                                                            SubLObject done_var_137 = NIL;
                                                            SubLObject token_var_138 = NIL;
                                                            while (NIL == done_var_137) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_138);
                                                                    SubLObject valid_139 = makeBoolean(token_var_138 != assertion);
                                                                    if (NIL != valid_139) {
                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                                                    }
                                                                    done_var_137 = makeBoolean(NIL == valid_139);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($OVERLAP)) {
                            {
                                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                    }
                                }
                            }
                        } else {
                            kb_mapping_macros.do_gli_method_error(l_index, method);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_gaf_iterate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$133 = NIL;
                                    final SubLObject token_var_$134 = NIL;
                                    while (NIL == done_var_$133) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$134);
                                        final SubLObject valid_$135 = makeBoolean(!token_var_$134.eql(assertion));
                                        if (NIL != valid_$135) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                        }
                                        done_var_$133 = makeBoolean(NIL == valid_$135);
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
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$134 = NIL;
                                    final SubLObject token_var_$135 = NIL;
                                    while (NIL == done_var_$134) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$135);
                                        final SubLObject valid_$136 = makeBoolean(!token_var_$135.eql(assertion));
                                        if (NIL != valid_$136) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                        }
                                        done_var_$134 = makeBoolean(NIL == valid_$136);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$135 = NIL;
                                    final SubLObject token_var_$136 = NIL;
                                    while (NIL == done_var_$135) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                        final SubLObject valid_$137 = makeBoolean(!token_var_$136.eql(assertion));
                                        if (NIL != valid_$137) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                        }
                                        done_var_$135 = makeBoolean(NIL == valid_$137);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$136 = NIL;
                                    final SubLObject token_var_$137 = NIL;
                                    while (NIL == done_var_$136) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$137);
                                        final SubLObject valid_$138 = makeBoolean(!token_var_$137.eql(assertion));
                                        if (NIL != valid_$138) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion, arg1, sentence);
                                        }
                                        done_var_$136 = makeBoolean(NIL == valid_$138);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$137 = NIL;
                                    final SubLObject token_var_$138 = NIL;
                                    while (NIL == done_var_$137) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$138);
                                        final SubLObject valid_$139 = makeBoolean(!token_var_$138.eql(assertion2));
                                        if (NIL != valid_$139) {
                                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion2, arg1, sentence);
                                        }
                                        done_var_$137 = makeBoolean(NIL == valid_$139);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$148 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                            removal_asserted_term_sentences_gaf_iterate_expand_internal(assertion3, arg1, sentence);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_gaf_iterate_expand_internal_alt(SubLObject assertion, SubLObject v_term, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                    if (NIL != unification_utilities.gaf_asent_unify(asent, gaf_formula, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject asent_terms = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_gather(gaf_formula);
                            SubLObject cdolist_list_var = asent_terms;
                            SubLObject asent_term = NIL;
                            for (asent_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent_term = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(v_term, asent_term, T, T);
                                    SubLObject unify_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != v_bindings) {
                                        backward.removal_add_node(assertion, v_bindings, unify_justification);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_gaf_iterate_expand_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (NIL != unification_utilities.gaf_asent_unify(asent, gaf_formula, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var;
                final SubLObject asent_terms = cdolist_list_var = inference_term_formulas_gather(gaf_formula);
                SubLObject asent_term = NIL;
                asent_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, asent_term, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        backward.removal_add_node(assertion, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    asent_term = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_arg_index_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject predicate = cycl_utilities.formula_operator(sentence);
            return min(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_term_index_cost(v_term, predicate), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_sentence_cost(sentence));
        }
    }

    public static SubLObject removal_asserted_term_sentences_arg_index_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        return min(removal_asserted_term_sentences_term_index_cost(v_term, predicate), removal_asserted_term_sentences_sentence_cost(sentence));
    }

    public static final SubLObject removal_asserted_term_sentences_arg_index_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject predicate = sentence.first();
                if (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_term_index_cost(v_term, predicate).numL(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_sentence_cost(sentence))) {
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, $GAF)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, $GAF);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                    if (NIL != valid) {
                                        {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                {
                                                    SubLObject done_var_140 = NIL;
                                                    SubLObject token_var_141 = NIL;
                                                    while (NIL == done_var_140) {
                                                        {
                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_141);
                                                            SubLObject valid_142 = makeBoolean(token_var_141 != assertion);
                                                            if (NIL != valid_142) {
                                                                if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                                    if (predicate == assertions_high.gaf_predicate(assertion)) {
                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                    }
                                                                }
                                                            }
                                                            done_var_140 = makeBoolean(NIL == valid_142);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    }
                } else {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term_143 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate_144 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate_144) {
                                        {
                                            SubLObject pred_var = predicate_144;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_143, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_143, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_145 = NIL;
                                                                            SubLObject token_var_146 = NIL;
                                                                            while (NIL == done_var_145) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_146);
                                                                                    SubLObject valid_147 = makeBoolean(token_var_146 != assertion);
                                                                                    if (NIL != valid_147) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_145 = makeBoolean(NIL == valid_147);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_143, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_143, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_148 = NIL;
                                                                            SubLObject token_var_149 = NIL;
                                                                            while (NIL == done_var_148) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_149);
                                                                                    SubLObject valid_150 = makeBoolean(token_var_149 != assertion);
                                                                                    if (NIL != valid_150) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_148 = makeBoolean(NIL == valid_150);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                } else {
                                    if (NIL != predicate_144) {
                                        {
                                            SubLObject pred_var = predicate_144;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_143, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_143, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_151 = NIL;
                                                                            SubLObject token_var_152 = NIL;
                                                                            while (NIL == done_var_151) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_152);
                                                                                    SubLObject valid_153 = makeBoolean(token_var_152 != assertion);
                                                                                    if (NIL != valid_153) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_151 = makeBoolean(NIL == valid_153);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_143, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_143, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_154 = NIL;
                                                                            SubLObject token_var_155 = NIL;
                                                                            while (NIL == done_var_154) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_155);
                                                                                    SubLObject valid_156 = makeBoolean(token_var_155 != assertion);
                                                                                    if (NIL != valid_156) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_154 = makeBoolean(NIL == valid_156);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_157 = NIL;
                                                                    SubLObject token_var_158 = NIL;
                                                                    while (NIL == done_var_157) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_158);
                                                                            SubLObject valid_159 = makeBoolean(token_var_158 != assertion);
                                                                            if (NIL != valid_159) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                            }
                                                                            done_var_157 = makeBoolean(NIL == valid_159);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_arg_index_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate = sentence.first();
        if (removal_asserted_term_sentences_term_index_cost(v_term, predicate).numL(removal_asserted_term_sentences_sentence_cost(sentence))) {
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, $GAF)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, $GAF);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$149 = NIL;
                            final SubLObject token_var_$150 = NIL;
                            while (NIL == done_var_$149) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$150);
                                final SubLObject valid_$151 = makeBoolean(!token_var_$150.eql(assertion));
                                if (((NIL != valid_$151) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) && predicate.eql(assertions_high.gaf_predicate(assertion))) {
                                    removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                }
                                done_var_$149 = makeBoolean(NIL == valid_$151);
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
        } else {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$152 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate_$153 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate_$153) {
                        final SubLObject pred_var = predicate_$153;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, argnum, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$150 = NIL;
                                        final SubLObject token_var_$151 = NIL;
                                        while (NIL == done_var_$150) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$151);
                                            final SubLObject valid_$152 = makeBoolean(!token_var_$151.eql(assertion2));
                                            if (NIL != valid_$152) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$150 = makeBoolean(NIL == valid_$152);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, argnum, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$151 = NIL;
                                        final SubLObject token_var_$152 = NIL;
                                        while (NIL == done_var_$151) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$152);
                                            final SubLObject valid_$153 = makeBoolean(!token_var_$152.eql(assertion2));
                                            if (NIL != valid_$153) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$151 = makeBoolean(NIL == valid_$153);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate_$153) {
                        final SubLObject pred_var = predicate_$153;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, NIL, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, NIL, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$152 = NIL;
                                        final SubLObject token_var_$153 = NIL;
                                        while (NIL == done_var_$152) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$153);
                                            final SubLObject valid_$154 = makeBoolean(!token_var_$153.eql(assertion2));
                                            if (NIL != valid_$154) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$152 = makeBoolean(NIL == valid_$154);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$152, NIL, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$152, NIL, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$153 = NIL;
                                        final SubLObject token_var_$154 = NIL;
                                        while (NIL == done_var_$153) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$154);
                                            final SubLObject valid_$155 = makeBoolean(!token_var_$154.eql(assertion2));
                                            if (NIL != valid_$155) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$153 = makeBoolean(NIL == valid_$155);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var3 = NIL;
                            final SubLObject token_var3 = NIL;
                            while (NIL == done_var3) {
                                final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                if (NIL != valid3) {
                                    note_progress();
                                    SubLObject final_index_iterator3 = NIL;
                                    try {
                                        final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$154 = NIL;
                                        final SubLObject token_var_$155 = NIL;
                                        while (NIL == done_var_$154) {
                                            final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$155);
                                            final SubLObject valid_$156 = makeBoolean(!token_var_$155.eql(assertion3));
                                            if (NIL != valid_$156) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion3, v_term, sentence);
                                            }
                                            done_var_$154 = makeBoolean(NIL == valid_$156);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$169 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values6 = getValuesAsVector();
                                            if (NIL != final_index_iterator3) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                            }
                                            restoreValuesFromVector(_values6);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
                                        }
                                    }
                                }
                                done_var3 = makeBoolean(NIL == valid3);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_13, thread);
                            $is_noting_progressP$.rebind(_prev_bind_12, thread);
                            $progress_count$.rebind(_prev_bind_11, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_10, thread);
                            $progress_notification_count$.rebind(_prev_bind_9, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_8, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_7, thread);
                            $progress_start_time$.rebind(_prev_bind_6, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion4 = NIL;
                        assertion4 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion4, enumeration_types.sense_truth($POS)))) {
                                removal_asserted_term_sentences_unify_expand_internal(assertion4, v_term, sentence);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion4 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_unify_expand_internal_alt(SubLObject assertion, SubLObject v_term, SubLObject inference_asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != backward_utilities.direction_is_relevant(assertion)) {
                {
                    SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, gaf_formula)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, T, T);
                            SubLObject gaf_asent = thread.secondMultipleValue();
                            SubLObject unify_justification = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                backward.removal_add_node(assertion, v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_unify_expand_internal(final SubLObject assertion, final SubLObject v_term, final SubLObject inference_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (NIL != inference_term_formulas_find(v_term, gaf_formula)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, T, T);
                final SubLObject gaf_asent = thread.secondMultipleValue();
                final SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    backward.removal_add_node(assertion, v_bindings, unify_justification);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_index_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return min(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_term_index_cost(v_term, UNPROVIDED), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_sentence_cost(sentence));
        }
    }

    public static SubLObject removal_asserted_term_sentences_index_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return min(removal_asserted_term_sentences_term_index_cost(v_term, UNPROVIDED), removal_asserted_term_sentences_sentence_cost(sentence));
    }

    public static final SubLObject removal_asserted_term_sentences_index_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_term_index_cost(v_term, UNPROVIDED).numL(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_sentence_cost(sentence))) {
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, $GAF)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, $GAF);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                    if (NIL != valid) {
                                        {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                {
                                                    SubLObject done_var_160 = NIL;
                                                    SubLObject token_var_161 = NIL;
                                                    while (NIL == done_var_160) {
                                                        {
                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_161);
                                                            SubLObject valid_162 = makeBoolean(token_var_161 != assertion);
                                                            if (NIL != valid_162) {
                                                                if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                                    com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                }
                                                            }
                                                            done_var_160 = makeBoolean(NIL == valid_162);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    }
                } else {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term_163 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_163, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_163, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_164 = NIL;
                                                                            SubLObject token_var_165 = NIL;
                                                                            while (NIL == done_var_164) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_165);
                                                                                    SubLObject valid_166 = makeBoolean(token_var_165 != assertion);
                                                                                    if (NIL != valid_166) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_164 = makeBoolean(NIL == valid_166);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_163, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_163, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_167 = NIL;
                                                                            SubLObject token_var_168 = NIL;
                                                                            while (NIL == done_var_167) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_168);
                                                                                    SubLObject valid_169 = makeBoolean(token_var_168 != assertion);
                                                                                    if (NIL != valid_169) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_167 = makeBoolean(NIL == valid_169);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_163, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_163, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_170 = NIL;
                                                                            SubLObject token_var_171 = NIL;
                                                                            while (NIL == done_var_170) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_171);
                                                                                    SubLObject valid_172 = makeBoolean(token_var_171 != assertion);
                                                                                    if (NIL != valid_172) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_170 = makeBoolean(NIL == valid_172);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_163, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_163, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_173 = NIL;
                                                                            SubLObject token_var_174 = NIL;
                                                                            while (NIL == done_var_173) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_174);
                                                                                    SubLObject valid_175 = makeBoolean(token_var_174 != assertion);
                                                                                    if (NIL != valid_175) {
                                                                                        com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                                    }
                                                                                    done_var_173 = makeBoolean(NIL == valid_175);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_176 = NIL;
                                                                    SubLObject token_var_177 = NIL;
                                                                    while (NIL == done_var_176) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_177);
                                                                            SubLObject valid_178 = makeBoolean(token_var_177 != assertion);
                                                                            if (NIL != valid_178) {
                                                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                                                            }
                                                                            done_var_176 = makeBoolean(NIL == valid_178);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_sentences_index_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (removal_asserted_term_sentences_term_index_cost(v_term, UNPROVIDED).numL(removal_asserted_term_sentences_sentence_cost(sentence))) {
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, $GAF)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, $GAF);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$170 = NIL;
                            final SubLObject token_var_$171 = NIL;
                            while (NIL == done_var_$170) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$171);
                                final SubLObject valid_$172 = makeBoolean(!token_var_$171.eql(assertion));
                                if ((NIL != valid_$172) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                                    removal_asserted_term_sentences_unify_expand_internal(assertion, v_term, sentence);
                                }
                                done_var_$170 = makeBoolean(NIL == valid_$172);
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
        } else {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term_$173 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, argnum, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$171 = NIL;
                                        final SubLObject token_var_$172 = NIL;
                                        while (NIL == done_var_$171) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$172);
                                            final SubLObject valid_$173 = makeBoolean(!token_var_$172.eql(assertion2));
                                            if (NIL != valid_$173) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$171 = makeBoolean(NIL == valid_$173);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, argnum, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, argnum, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$172 = NIL;
                                        final SubLObject token_var_$173 = NIL;
                                        while (NIL == done_var_$172) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$173);
                                            final SubLObject valid_$174 = makeBoolean(!token_var_$173.eql(assertion2));
                                            if (NIL != valid_$174) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$172 = makeBoolean(NIL == valid_$174);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, NIL, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, NIL, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$173 = NIL;
                                        final SubLObject token_var_$174 = NIL;
                                        while (NIL == done_var_$173) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$174);
                                            final SubLObject valid_$175 = makeBoolean(!token_var_$174.eql(assertion2));
                                            if (NIL != valid_$175) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$173 = makeBoolean(NIL == valid_$175);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$173, NIL, pred_var)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$173, NIL, pred_var);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$174 = NIL;
                                        final SubLObject token_var_$175 = NIL;
                                        while (NIL == done_var_$174) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$175);
                                            final SubLObject valid_$176 = makeBoolean(!token_var_$175.eql(assertion2));
                                            if (NIL != valid_$176) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion2, v_term, sentence);
                                            }
                                            done_var_$174 = makeBoolean(NIL == valid_$176);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var3 = NIL;
                            final SubLObject token_var3 = NIL;
                            while (NIL == done_var3) {
                                final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                if (NIL != valid3) {
                                    note_progress();
                                    SubLObject final_index_iterator3 = NIL;
                                    try {
                                        final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$175 = NIL;
                                        final SubLObject token_var_$176 = NIL;
                                        while (NIL == done_var_$175) {
                                            final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$176);
                                            final SubLObject valid_$177 = makeBoolean(!token_var_$176.eql(assertion3));
                                            if (NIL != valid_$177) {
                                                removal_asserted_term_sentences_unify_expand_internal(assertion3, v_term, sentence);
                                            }
                                            done_var_$175 = makeBoolean(NIL == valid_$177);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$189 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values6 = getValuesAsVector();
                                            if (NIL != final_index_iterator3) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                            }
                                            restoreValuesFromVector(_values6);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$189, thread);
                                        }
                                    }
                                }
                                done_var3 = makeBoolean(NIL == valid3);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_13, thread);
                            $is_noting_progressP$.rebind(_prev_bind_12, thread);
                            $progress_count$.rebind(_prev_bind_11, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_10, thread);
                            $progress_notification_count$.rebind(_prev_bind_9, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_8, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_7, thread);
                            $progress_start_time$.rebind(_prev_bind_6, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion4 = NIL;
                        assertion4 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion4, enumeration_types.sense_truth($POS)))) {
                                removal_asserted_term_sentences_unify_expand_internal(assertion4, v_term, sentence);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion4 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_sentences_index_variable_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_sentences_term_index_cost(v_term, UNPROVIDED);
        }
    }

    public static SubLObject removal_asserted_term_sentences_index_variable_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_asserted_term_sentences_term_index_cost(v_term, UNPROVIDED);
    }

    public static final SubLObject removal_asserted_term_sentences_index_variable_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, $GAF)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, $GAF);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        {
                                            SubLObject done_var_179 = NIL;
                                            SubLObject token_var_180 = NIL;
                                            while (NIL == done_var_179) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_180);
                                                    SubLObject valid_181 = makeBoolean(token_var_180 != assertion);
                                                    if (NIL != valid_181) {
                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, arg2);
                                                        }
                                                    }
                                                    done_var_179 = makeBoolean(NIL == valid_181);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_asserted_term_sentences_index_variable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, $GAF)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, $GAF);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$190 = NIL;
                        final SubLObject token_var_$191 = NIL;
                        while (NIL == done_var_$190) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$191);
                            final SubLObject valid_$192 = makeBoolean(!token_var_$191.eql(assertion));
                            if ((NIL != valid_$192) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                                removal_modules_lookup.removal_lookup_expand_internal(assertion, arg2);
                            }
                            done_var_$190 = makeBoolean(NIL == valid_$192);
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
        return NIL;
    }

    public static final SubLObject removal_asserted_term_set_sentences_terms_index_cost_alt(SubLObject terms) {
        return virtual_indexing.estimated_num_overlap_index(terms, UNPROVIDED);
    }

    public static SubLObject removal_asserted_term_set_sentences_terms_index_cost(final SubLObject terms) {
        return virtual_indexing.estimated_num_overlap_index(terms, UNPROVIDED);
    }

    public static final SubLObject removal_asserted_term_set_sentences_arg1_bound_asent_cost_alt(SubLObject asent) {
        {
            SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            return virtual_indexing.estimated_num_overlap_index(terms, UNPROVIDED);
        }
    }

    public static SubLObject removal_asserted_term_set_sentences_arg1_bound_asent_cost(final SubLObject asent) {
        final SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        return virtual_indexing.estimated_num_overlap_index(terms, UNPROVIDED);
    }

    public static final SubLObject removal_asserted_term_set_sentences_index_variable_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent);
    }

    public static SubLObject removal_asserted_term_set_sentences_index_variable_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent);
    }

    public static final SubLObject removal_asserted_term_set_sentences_index_variable_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject assertions = virtual_indexing.gather_overlap_index(terms, UNPROVIDED);
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != assertions_high.gaf_assertionP(assertion)) {
                    removal_modules_lookup.removal_lookup_expand_internal(assertion, arg2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_asserted_term_set_sentences_index_variable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject assertions = cdolist_list_var = virtual_indexing.gather_overlap_index(terms, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                removal_modules_lookup.removal_lookup_expand_internal(assertion, arg2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_asserted_term_set_sentences_gaf_check_pos_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent);
    }

    public static SubLObject removal_asserted_term_set_sentences_gaf_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent);
    }

    public static final SubLObject removal_asserted_term_set_sentences_gaf_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
                SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject missing = NIL;
                if (NIL == missing) {
                    {
                        SubLObject csome_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = csome_list_var.first(); !((NIL != missing) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, sentence)) {
                                missing = T;
                            }
                        }
                    }
                }
                if (NIL == missing) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_182 = NIL;
                                                                            SubLObject token_var_183 = NIL;
                                                                            while (NIL == done_var_182) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_183);
                                                                                    SubLObject valid_184 = makeBoolean(token_var_183 != assertion);
                                                                                    if (NIL != valid_184) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_182 = makeBoolean(NIL == valid_184);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_185 = NIL;
                                                                            SubLObject token_var_186 = NIL;
                                                                            while (NIL == done_var_185) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_186);
                                                                                    SubLObject valid_187 = makeBoolean(token_var_186 != assertion);
                                                                                    if (NIL != valid_187) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_185 = makeBoolean(NIL == valid_187);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_188 = NIL;
                                                                            SubLObject token_var_189 = NIL;
                                                                            while (NIL == done_var_188) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_189);
                                                                                    SubLObject valid_190 = makeBoolean(token_var_189 != assertion);
                                                                                    if (NIL != valid_190) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_188 = makeBoolean(NIL == valid_190);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_191 = NIL;
                                                                            SubLObject token_var_192 = NIL;
                                                                            while (NIL == done_var_191) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_192);
                                                                                    SubLObject valid_193 = makeBoolean(token_var_192 != assertion);
                                                                                    if (NIL != valid_193) {
                                                                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                                    }
                                                                                    done_var_191 = makeBoolean(NIL == valid_193);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
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
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_194 = NIL;
                                                                    SubLObject token_var_195 = NIL;
                                                                    while (NIL == done_var_194) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_195);
                                                                            SubLObject valid_196 = makeBoolean(token_var_195 != assertion);
                                                                            if (NIL != valid_196) {
                                                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                                                            }
                                                                            done_var_194 = makeBoolean(NIL == valid_196);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                                        SubLObject assertion = NIL;
                                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_set_sentences_gaf_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject missing = NIL;
        if (NIL == missing) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == missing) && (NIL != csome_list_var)) {
                if (NIL == inference_term_formulas_find(v_term, sentence)) {
                    missing = T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        if (NIL == missing) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$193 = NIL;
                                        final SubLObject token_var_$194 = NIL;
                                        while (NIL == done_var_$193) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$194);
                                            final SubLObject valid_$195 = makeBoolean(!token_var_$194.eql(assertion));
                                            if (NIL != valid_$195) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$193 = makeBoolean(NIL == valid_$195);
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
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$194 = NIL;
                                        final SubLObject token_var_$195 = NIL;
                                        while (NIL == done_var_$194) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$195);
                                            final SubLObject valid_$196 = makeBoolean(!token_var_$195.eql(assertion));
                                            if (NIL != valid_$196) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$194 = makeBoolean(NIL == valid_$196);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$195 = NIL;
                                        final SubLObject token_var_$196 = NIL;
                                        while (NIL == done_var_$195) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$196);
                                            final SubLObject valid_$197 = makeBoolean(!token_var_$196.eql(assertion));
                                            if (NIL != valid_$197) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$195 = makeBoolean(NIL == valid_$197);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$196 = NIL;
                                        final SubLObject token_var_$197 = NIL;
                                        while (NIL == done_var_$196) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$197);
                                            final SubLObject valid_$198 = makeBoolean(!token_var_$197.eql(assertion));
                                            if (NIL != valid_$198) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion, sentence);
                                            }
                                            done_var_$196 = makeBoolean(NIL == valid_$198);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$197 = NIL;
                                        final SubLObject token_var_$198 = NIL;
                                        while (NIL == done_var_$197) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$198);
                                            final SubLObject valid_$199 = makeBoolean(!token_var_$198.eql(assertion2));
                                            if (NIL != valid_$199) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion2, sentence);
                                            }
                                            done_var_$197 = makeBoolean(NIL == valid_$199);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$208 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_12, thread);
                            $is_noting_progressP$.rebind(_prev_bind_11, thread);
                            $progress_count$.rebind(_prev_bind_10, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            $progress_notification_count$.rebind(_prev_bind_8, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            $progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                                removal_modules_lookup.removal_lookup_expand_internal(assertion3, sentence);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion3 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_set_sentences_gaf_check_neg_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent));
    }

    public static SubLObject removal_asserted_term_set_sentences_gaf_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_asserted_term_set_sentences_arg1_bound_asent_cost(asent));
    }

    public static final SubLObject removal_asserted_term_set_sentences_gaf_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
                SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject missing = NIL;
                SubLObject found = NIL;
                if (NIL == missing) {
                    {
                        SubLObject csome_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = csome_list_var.first(); !((NIL != missing) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, sentence)) {
                                missing = T;
                            }
                        }
                    }
                }
                if (NIL == missing) {
                    {
                        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
                        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                                SubLObject argnum = thread.secondMultipleValue();
                                SubLObject predicate = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_197 = found;
                                                                            SubLObject token_var_198 = NIL;
                                                                            while (NIL == done_var_197) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_198);
                                                                                    SubLObject valid_199 = makeBoolean(token_var_198 != assertion);
                                                                                    if (NIL != valid_199) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                                                                    }
                                                                                    done_var_197 = makeBoolean((NIL == valid_199) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_200 = found;
                                                                            SubLObject token_var_201 = NIL;
                                                                            while (NIL == done_var_200) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_201);
                                                                                    SubLObject valid_202 = makeBoolean(token_var_201 != assertion);
                                                                                    if (NIL != valid_202) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                                                                    }
                                                                                    done_var_200 = makeBoolean((NIL == valid_202) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != predicate) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_203 = found;
                                                                            SubLObject token_var_204 = NIL;
                                                                            while (NIL == done_var_203) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_204);
                                                                                    SubLObject valid_205 = makeBoolean(token_var_204 != assertion);
                                                                                    if (NIL != valid_205) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                                                                    }
                                                                                    done_var_203 = makeBoolean((NIL == valid_205) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                                    SubLObject done_var = found;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                        {
                                                                            SubLObject done_var_206 = found;
                                                                            SubLObject token_var_207 = NIL;
                                                                            while (NIL == done_var_206) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_207);
                                                                                    SubLObject valid_208 = makeBoolean(token_var_207 != assertion);
                                                                                    if (NIL != valid_208) {
                                                                                        found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                                                                    }
                                                                                    done_var_206 = makeBoolean((NIL == valid_208) || (NIL != found));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                {
                                    SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = found;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                                                {
                                                                    SubLObject done_var_209 = found;
                                                                    SubLObject token_var_210 = NIL;
                                                                    while (NIL == done_var_209) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_210);
                                                                            SubLObject valid_211 = makeBoolean(token_var_210 != assertion);
                                                                            if (NIL != valid_211) {
                                                                                found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                                                            }
                                                                            done_var_209 = makeBoolean((NIL == valid_211) || (NIL != found));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != found));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($OVERLAP)) {
                                    {
                                        SubLObject rest = NIL;
                                        for (rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); !((NIL != found) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject assertion = rest.first();
                                                if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($POS)))) {
                                                    found = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }
                            }
                        }
                    }
                }
                if (NIL == found) {
                    backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_asserted_term_set_sentences_gaf_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject missing = NIL;
        SubLObject found = NIL;
        if (NIL == missing) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == missing) && (NIL != csome_list_var)) {
                if (NIL == inference_term_formulas_find(v_term, sentence)) {
                    missing = T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        if (NIL == missing) {
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(sentence, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$209 = found;
                                        final SubLObject token_var_$210 = NIL;
                                        while (NIL == done_var_$209) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$210);
                                            final SubLObject valid_$211 = makeBoolean(!token_var_$210.eql(assertion));
                                            if (NIL != valid_$211) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                            }
                                            done_var_$209 = makeBoolean((NIL == valid_$211) || (NIL != found));
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
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$210 = found;
                                        final SubLObject token_var_$211 = NIL;
                                        while (NIL == done_var_$210) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$211);
                                            final SubLObject valid_$212 = makeBoolean(!token_var_$211.eql(assertion));
                                            if (NIL != valid_$212) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                            }
                                            done_var_$210 = makeBoolean((NIL == valid_$212) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$211 = found;
                                        final SubLObject token_var_$212 = NIL;
                                        while (NIL == done_var_$211) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$212);
                                            final SubLObject valid_$213 = makeBoolean(!token_var_$212.eql(assertion));
                                            if (NIL != valid_$213) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                            }
                                            done_var_$211 = makeBoolean((NIL == valid_$213) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var);
                            SubLObject done_var = found;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$212 = found;
                                        final SubLObject token_var_$213 = NIL;
                                        while (NIL == done_var_$212) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$213);
                                            final SubLObject valid_$214 = makeBoolean(!token_var_$213.eql(assertion));
                                            if (NIL != valid_$214) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion, terms, asent);
                                            }
                                            done_var_$212 = makeBoolean((NIL == valid_$214) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found));
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = found;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$213 = found;
                                        final SubLObject token_var_$214 = NIL;
                                        while (NIL == done_var_$213) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$214);
                                            final SubLObject valid_$215 = makeBoolean(!token_var_$214.eql(assertion2));
                                            if (NIL != valid_$215) {
                                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion2, terms, asent);
                                            }
                                            done_var_$213 = makeBoolean((NIL == valid_$215) || (NIL != found));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$224 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$224, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != found));
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_12, thread);
                            $is_noting_progressP$.rebind(_prev_bind_11, thread);
                            $progress_count$.rebind(_prev_bind_10, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                            $progress_notification_count$.rebind(_prev_bind_8, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                            $progress_start_time$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject rest;
                        SubLObject assertion3;
                        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == found) && (NIL != rest); rest = rest.rest()) {
                            assertion3 = rest.first();
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                                found = removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(assertion3, terms, asent);
                            }
                        }
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        }
        if (NIL == found) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_asserted_term_set_sentences_gaf_check_neg_expand_internal_alt(SubLObject assertion, SubLObject terms, SubLObject inference_asent) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            {
                SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
                SubLObject missing = NIL;
                if (NIL == missing) {
                    {
                        SubLObject csome_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = csome_list_var.first(); !((NIL != missing) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula.inference_term_formulas_find(v_term, gaf_formula)) {
                                missing = T;
                            }
                        }
                    }
                }
                return makeBoolean((NIL == missing) && (NIL != unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static SubLObject removal_asserted_term_set_sentences_gaf_check_neg_expand_internal(final SubLObject assertion, final SubLObject terms, final SubLObject inference_asent) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            SubLObject missing = NIL;
            if (NIL == missing) {
                SubLObject csome_list_var = terms;
                SubLObject v_term = NIL;
                v_term = csome_list_var.first();
                while ((NIL == missing) && (NIL != csome_list_var)) {
                    if (NIL == inference_term_formulas_find(v_term, gaf_formula)) {
                        missing = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                } 
            }
            return makeBoolean((NIL == missing) && (NIL != unification_utilities.gaf_asent_unify(inference_asent, gaf_formula, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject removal_nearest_assertion_supporting_sentence_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject assertion = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject matching_assertions = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index(sentence, NIL, NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$225 = NIL;
                                        final SubLObject token_var_$226 = NIL;
                                        while (NIL == done_var_$225) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$226);
                                            final SubLObject valid_$227 = makeBoolean(!token_var_$226.eql(gaf));
                                            if ((NIL != valid_$227) && (NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf)))) {
                                                matching_assertions = cons(gaf, matching_assertions);
                                            }
                                            done_var_$225 = makeBoolean(NIL == valid_$227);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$228 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$226 = NIL;
                                        final SubLObject token_var_$227 = NIL;
                                        while (NIL == done_var_$226) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$227);
                                            final SubLObject valid_$228 = makeBoolean(!token_var_$227.eql(gaf));
                                            if ((NIL != valid_$228) && (NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf)))) {
                                                matching_assertions = cons(gaf, matching_assertions);
                                            }
                                            done_var_$226 = makeBoolean(NIL == valid_$228);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$229 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$229, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$227 = NIL;
                                        final SubLObject token_var_$228 = NIL;
                                        while (NIL == done_var_$227) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$228);
                                            final SubLObject valid_$229 = makeBoolean(!token_var_$228.eql(gaf));
                                            if ((NIL != valid_$229) && (NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf)))) {
                                                matching_assertions = cons(gaf, matching_assertions);
                                            }
                                            done_var_$227 = makeBoolean(NIL == valid_$229);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$230 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$228 = NIL;
                                        final SubLObject token_var_$229 = NIL;
                                        while (NIL == done_var_$228) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$229);
                                            final SubLObject valid_$230 = makeBoolean(!token_var_$229.eql(gaf));
                                            if ((NIL != valid_$230) && (NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf)))) {
                                                matching_assertions = cons(gaf, matching_assertions);
                                            }
                                            done_var_$228 = makeBoolean(NIL == valid_$230);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$231 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$231, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$232 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$242 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$243 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                        SubLObject done_var_$229 = NIL;
                                        final SubLObject token_var_$230 = NIL;
                                        while (NIL == done_var_$229) {
                                            final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$230);
                                            final SubLObject valid_$231 = makeBoolean(!token_var_$230.eql(gaf2));
                                            if ((NIL != valid_$231) && (NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf2)))) {
                                                matching_assertions = cons(gaf2, matching_assertions);
                                            }
                                            done_var_$229 = makeBoolean(NIL == valid_$231);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$233 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$233, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$243, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$242, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$232, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != unification.unify_possible(sentence, assertions_high.gaf_el_formula(gaf3))) {
                                matching_assertions = cons(gaf3, matching_assertions);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            gaf3 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        final SubLObject min_mts = genl_mts.min_mts(Mapping.mapcar(ASSERTION_MT, matching_assertions), UNPROVIDED);
        SubLObject min_matching_assertions = NIL;
        SubLObject cdolist_list_var2 = matching_assertions;
        SubLObject matching_assertion = NIL;
        matching_assertion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != list_utilities.member_kbeqP(assertions_high.assertion_mt(matching_assertion), min_mts)) {
                min_matching_assertions = cons(matching_assertion, min_matching_assertions);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            matching_assertion = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = min_matching_assertions;
        SubLObject min_matching_assertion = NIL;
        min_matching_assertion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != unification.unify_possible(assertion, min_matching_assertion)) {
                final SubLObject v_bindings = unification_utilities.term_unify(list(min_matching_assertion, assertions_high.gaf_el_formula(min_matching_assertion)), list(assertion, sentence), UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            min_matching_assertion = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject removal_termappearsinassertion_assertion_terms_helper_internal(final SubLObject assertion) {
        return cycl_utilities.expression_gather(assertions_high.assertion_cnf(assertion), INDEXED_TERM_P, T, symbol_function(EQL), symbol_function(IDENTITY), T);
    }

    public static SubLObject removal_termappearsinassertion_assertion_terms_helper(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_termappearsinassertion_assertion_terms_helper_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER, ONE_INTEGER, SIXTEEN_INTEGER, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(removal_termappearsinassertion_assertion_terms_helper_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject removal_termappearsinassertion_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject assertion_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cost = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            cost = (NIL != assertion_handles.assertion_p(assertion_arg)) ? length(removal_termappearsinassertion_assertion_terms_helper(assertion_arg)) : kb_indexing.num_index(term_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }

    public static SubLObject removal_termappearsinassertion_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject assertion_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != assertion_handles.assertion_p(assertion_arg)) {
                SubLObject cdolist_list_var = removal_termappearsinassertion_assertion_terms_helper(assertion_arg);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject v_bindings = unification_utilities.term_unify(v_term, term_arg, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), $$BaseKB, UNPROVIDED), v_bindings, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list(term_arg), UNPROVIDED);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject v_bindings = unification_utilities.term_unify(assertion, assertion_arg, UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), $$BaseKB, UNPROVIDED), v_bindings, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_asserted_formula_file() {
        declareFunction("removal_asserted_sentence_cost", "REMOVAL-ASSERTED-SENTENCE-COST", 1, 0, false);
        declareFunction("removal_asserted_sentence_lookup_pos_cost", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        new removal_modules_asserted_formula.$removal_asserted_sentence_lookup_pos_cost$UnaryFunction();
        new removal_modules_asserted_formula.$removal_asserted_sentence_lookup_pos_cost$BinaryFunction();
        declareFunction("removal_asserted_sentence_lookup_iterator", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR", 1, 0, false);
        new removal_modules_asserted_formula.$removal_asserted_sentence_lookup_iterator$UnaryFunction();
        declareFunction("removal_asserted_sentence_unbound_lookup_pos_cost", "REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_asserted_sentence_unbound_lookup_iterator", "REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction("removal_asserted_sentence_lookup_neg_cost", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_asserted_sentence_lookup_neg_expand", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_sentence_lookup_neg_expand_internal", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND-INTERNAL", 2, 0, false);
        declareFunction("removal_exactly_asserted_sentence_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-COST", 1, 0, false);
        declareFunction("removal_exactly_asserted_sentence_lookup_pos_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_exactly_asserted_sentence_lookup_iterator", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction("removal_exactly_asserted_sentence_unbound_lookup_pos_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_exactly_asserted_sentence_unbound_lookup_iterator", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction("removal_exactly_asserted_sentence_lookup_neg_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_exactly_asserted_sentence_lookup_neg_expand", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_predicate_arg_pos_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST", 1, 1, false);
        declareFunction("removal_asserted_predicate_arg_pos_check_expand", "REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_predicate_arg_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-CHECK-COST", 1, 0, false);
        declareFunction("removal_asserted_predicate_arg_check", "REMOVAL-ASSERTED-PREDICATE-ARG-CHECK", 1, 0, false);
        declareFunction("removal_asserted_predicate_arg_neg_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST", 1, 1, false);
        declareFunction("removal_asserted_predicate_arg_neg_check_expand", "REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_predicate_term_arg_var_cost", "REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST", 1, 1, false);
        declareFunction("removal_asserted_predicate_term_arg_var_expand", "REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_predicate_term_var_var_cost", "REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST", 1, 1, false);
        declareFunction("removal_asserted_predicate_term_var_var_expand", "REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_predicate_var_arg_pred_cost", "REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST", 1, 1, false);
        declareFunction("removal_asserted_predicate_var_arg_pred_expand", "REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND", 1, 1, false);
        declareFunction("make_term_formulas_support", "MAKE-TERM-FORMULAS-SUPPORT", 1, 0, false);
        declareFunction("inference_term_formulas_find", "INFERENCE-TERM-FORMULAS-FIND", 2, 0, false);
        declareFunction("inference_term_formulas_gather", "INFERENCE-TERM-FORMULAS-GATHER", 1, 0, false);
        declareFunction("inference_term_formulas_count", "INFERENCE-TERM-FORMULAS-COUNT", 1, 0, false);
        declareFunction("removal_term_formulas_check_cost_pos", "REMOVAL-TERM-FORMULAS-CHECK-COST-POS", 1, 1, false);
        declareFunction("removal_term_formulas_check_expand_pos", "REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS", 1, 1, false);
        declareFunction("removal_term_formulas_check", "REMOVAL-TERM-FORMULAS-CHECK", 1, 0, false);
        declareFunction("removal_term_formulas_check_cost", "REMOVAL-TERM-FORMULAS-CHECK-COST", 1, 0, false);
        declareFunction("removal_term_formulas_check_cost_neg", "REMOVAL-TERM-FORMULAS-CHECK-COST-NEG", 1, 1, false);
        declareFunction("removal_term_formulas_check_expand_neg", "REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG", 1, 1, false);
        declareFunction("removal_term_formulas_unify_cost", "REMOVAL-TERM-FORMULAS-UNIFY-COST", 1, 1, false);
        declareFunction("removal_term_formulas_unify_expand", "REMOVAL-TERM-FORMULAS-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_sentence_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-SENTENCE-COST", 1, 0, false);
        declareFunction("removal_asserted_term_sentences_term_index_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-TERM-INDEX-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_check_pos_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_check_pos_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_check_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-COST", 1, 0, false);
        declareFunction("removal_asserted_term_sentences_gaf_check_neg_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_check_neg_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_check_neg_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND-INTERNAL", 3, 0, false);
        declareFunction("removal_asserted_term_sentences_gaf_iterate_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_iterate_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_gaf_iterate_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND-INTERNAL", 3, 0, false);
        declareFunction("removal_asserted_term_sentences_arg_index_unify_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_arg_index_unify_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_unify_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-UNIFY-EXPAND-INTERNAL", 3, 0, false);
        declareFunction("removal_asserted_term_sentences_index_unify_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_index_unify_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_index_variable_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST", 1, 1, false);
        declareFunction("removal_asserted_term_sentences_index_variable_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_terms_index_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-TERMS-INDEX-COST", 1, 0, false);
        declareFunction("removal_asserted_term_set_sentences_arg1_bound_asent_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-ARG1-BOUND-ASENT-COST", 1, 0, false);
        declareFunction("removal_asserted_term_set_sentences_index_variable_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_index_variable_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_gaf_check_pos_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_gaf_check_pos_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_gaf_check_neg_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_gaf_check_neg_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_term_set_sentences_gaf_check_neg_expand_internal", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND-INTERNAL", 3, 0, false);
        declareFunction("removal_nearest_assertion_supporting_sentence_expand", "REMOVAL-NEAREST-ASSERTION-SUPPORTING-SENTENCE-EXPAND", 1, 1, false);
        declareFunction("removal_termappearsinassertion_assertion_terms_helper_internal", "REMOVAL-TERMAPPEARSINASSERTION-ASSERTION-TERMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction("removal_termappearsinassertion_assertion_terms_helper", "REMOVAL-TERMAPPEARSINASSERTION-ASSERTION-TERMS-HELPER", 1, 0, false);
        declareFunction("removal_termappearsinassertion_cost", "REMOVAL-TERMAPPEARSINASSERTION-COST", 1, 1, false);
        declareFunction("removal_termappearsinassertion_expand", "REMOVAL-TERMAPPEARSINASSERTION-EXPAND", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_asserted_formula_file_alt() {
        deflexical("*TERM-FORMULAS-DEFINING-MT*", NIL != boundp($term_formulas_defining_mt$) ? ((SubLObject) ($term_formulas_defining_mt$.getGlobalValue())) : $$BaseKB);
        return NIL;
    }

    public static SubLObject init_removal_modules_asserted_formula_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TERM-FORMULAS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($term_formulas_defining_mt$, $term_formulas_defining_mt$, $$BaseKB));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TERM-FORMULAS-DEFINING-MT*", NIL != boundp($term_formulas_defining_mt$) ? ((SubLObject) ($term_formulas_defining_mt$.getGlobalValue())) : $$BaseKB);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_asserted_formula_file_Previous() {
        deflexical("*TERM-FORMULAS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($term_formulas_defining_mt$, $term_formulas_defining_mt$, $$BaseKB));
        return NIL;
    }

    public static final SubLObject setup_removal_modules_asserted_formula_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertedSentence);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS, $list_alt7);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list_alt9);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG, $list_alt12);
        inference_modules.register_solely_specific_removal_module_predicate($$exactlyAssertedSentence);
        inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS, $list_alt15);
        inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list_alt17);
        inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG, $list_alt19);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedPredicateArg);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE, $list_alt22);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK, $list_alt25);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK, $list_alt27);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR, $list_alt29);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR, $list_alt31);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED, $list_alt34);
        inference_modules.register_solely_specific_removal_module_predicate($$termFormulas);
        declare_defglobal($term_formulas_defining_mt$);
        mt_vars.note_mt_var($term_formulas_defining_mt$, $$termFormulas);
        inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_POS, $list_alt44);
        inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_NEG, $list_alt46);
        inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_UNIFY, $list_alt48);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedTermSentences);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS, $list_alt52);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG, $list_alt54);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE, $list_alt56);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY, $list_alt58);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY, $list_alt60);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE, $list_alt62);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedTermSetSentences);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE, $list_alt65);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS, $list_alt67);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG, $list_alt69);
        return NIL;
    }

    public static SubLObject setup_removal_modules_asserted_formula_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$assertedSentence);
            preference_modules.inference_preference_module($ASSERTED_SENTENCE_VARIABLE, $list2);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedSentence);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS, $list10);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list12);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG, $list15);
            inference_modules.register_solely_specific_removal_module_predicate($$exactlyAssertedSentence);
            preference_modules.inference_preference_module($ASSERTED_SENTENCE_VARIABLE, $list17);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$exactlyAssertedSentence);
            inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS, $list19);
            inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list21);
            inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG, $list23);
            inference_modules.register_solely_specific_removal_module_predicate($$assertedPredicateArg);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedPredicateArg);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE, $list26);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK, $list29);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK, $list31);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR, $list33);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR, $list35);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED, $list38);
            inference_modules.register_solely_specific_removal_module_predicate($$termFormulas);
            preference_modules.doomed_unless_arg_bindable($POS, $$termFormulas, TWO_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$termFormulas);
            declare_defglobal($term_formulas_defining_mt$);
            mt_vars.note_mt_var($term_formulas_defining_mt$, $$termFormulas);
            inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_POS, $list47);
            inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_NEG, $list49);
            inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_UNIFY, $list51);
            inference_modules.register_solely_specific_removal_module_predicate($$assertedTermSentences);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$assertedTermSentences);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedTermSentences);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS, $list54);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG, $list56);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE, $list58);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY, $list60);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY, $list62);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE, $list64);
            inference_modules.register_solely_specific_removal_module_predicate($$assertedTermSetSentences);
            preference_modules.doomed_unless_arg_bindable($POS, $$assertedTermSetSentences, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedTermSetSentences);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE, $list67);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS, $list69);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG, $list71);
            inference_modules.register_solely_specific_removal_module_predicate($const72$nearestAssertionSupportingSentenc);
            preference_modules.doomed_unless_arg_bindable($POS, $const72$nearestAssertionSupportingSentenc, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_NEAREST_ASSERTION_SUPPORTING_SENTENCE, $list74);
            inference_modules.register_solely_specific_removal_module_predicate($$termAppearsInAssertion);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$termAppearsInAssertion);
            inference_modules.inference_removal_module($REMOVAL_TERMAPPEARSINASSERTION, $list78);
            memoization_state.note_memoized_function(REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS, $list_alt7);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list_alt9);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG, $list_alt12);
            inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS, $list_alt15);
            inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list_alt17);
            inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG, $list_alt19);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE, $list_alt22);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK, $list_alt25);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK, $list_alt27);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR, $list_alt29);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR, $list_alt31);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED, $list_alt34);
            inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_POS, $list_alt44);
            inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_NEG, $list_alt46);
            inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_UNIFY, $list_alt48);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS, $list_alt52);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG, $list_alt54);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE, $list_alt56);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY, $list_alt58);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY, $list_alt60);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE, $list_alt62);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE, $list_alt65);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS, $list_alt67);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG, $list_alt69);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_asserted_formula_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertedSentence);
        preference_modules.inference_preference_module($ASSERTED_SENTENCE_VARIABLE, $list2);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedSentence);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list12);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG, $list15);
        inference_modules.register_solely_specific_removal_module_predicate($$exactlyAssertedSentence);
        preference_modules.inference_preference_module($ASSERTED_SENTENCE_VARIABLE, $list17);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$exactlyAssertedSentence);
        inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS, $list19);
        inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG, $list23);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedPredicateArg);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedPredicateArg);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE, $list26);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK, $list29);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK, $list31);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR, $list33);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR, $list35);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED, $list38);
        inference_modules.register_solely_specific_removal_module_predicate($$termFormulas);
        preference_modules.doomed_unless_arg_bindable($POS, $$termFormulas, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$termFormulas);
        declare_defglobal($term_formulas_defining_mt$);
        mt_vars.note_mt_var($term_formulas_defining_mt$, $$termFormulas);
        inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_POS, $list47);
        inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_CHECK_NEG, $list49);
        inference_modules.inference_removal_module($REMOVAL_TERM_FORMULAS_UNIFY, $list51);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedTermSentences);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertedTermSentences);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedTermSentences);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS, $list54);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG, $list56);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE, $list58);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY, $list60);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY, $list62);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE, $list64);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedTermSetSentences);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertedTermSetSentences, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertedTermSetSentences);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE, $list67);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS, $list69);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG, $list71);
        inference_modules.register_solely_specific_removal_module_predicate($const72$nearestAssertionSupportingSentenc);
        preference_modules.doomed_unless_arg_bindable($POS, $const72$nearestAssertionSupportingSentenc, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ASSERTION_SUPPORTING_SENTENCE, $list74);
        inference_modules.register_solely_specific_removal_module_predicate($$termAppearsInAssertion);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$termAppearsInAssertion);
        inference_modules.inference_removal_module($REMOVAL_TERMAPPEARSINASSERTION, $list78);
        memoization_state.note_memoized_function(REMOVAL_TERMAPPEARSINASSERTION_ASSERTION_TERMS_HELPER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_asserted_formula_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_asserted_formula_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_asserted_formula_file();
    }

    static {
    }

    public static final class $removal_asserted_sentence_lookup_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_asserted_sentence_lookup_pos_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_asserted_sentence_lookup_pos_cost(arg1, removal_modules_asserted_formula.$removal_asserted_sentence_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_asserted_sentence_lookup_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_asserted_sentence_lookup_pos_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_asserted_sentence_lookup_pos_cost(arg1, arg2);
        }
    }

    public static final class $removal_asserted_sentence_lookup_iterator$UnaryFunction extends UnaryFunction {
        public $removal_asserted_sentence_lookup_iterator$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_asserted_sentence_lookup_iterator(arg1);
        }
    }

    static private final SubLSymbol $sym1$HL_VAR_ = makeSymbol("HL-VAR?");

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), $COST, makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list($BIND, makeSymbol("BINDINGS")), list($BIND, makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list($CALL, makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$assertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedSentence (#$genls #$Predicate ?WHAT))\n    (#$assertedSentence (#$genls #$Predicate #$TruthFunction))") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list(makeKeyword("OR"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P"))), list(reader_make_constant_shell("not"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P")))))), $COST, makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list($CALL, makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedSentence (?PRED #$Predicate ?WHAT))") });

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), $COST, makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedSentence (#$genls #$Predicate #$Thing)))") });

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), $COST, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list($CALL, makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$exactlyAssertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$exactlyAssertedSentence (#$genls #$Predicate ?WHAT))\n    (#$exactlyAssertedSentence (#$genls #$Predicate #$TruthFunction))") });

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list(makeKeyword("OR"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P"))), list(reader_make_constant_shell("not"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P")))))), $COST, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list($BIND, makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list($CALL, makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$exactlyAssertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$exactlyAssertedSentence (?PRED #$Predicate ?WHAT))") });

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("exactlyAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("exactlyAssertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), $COST, makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$exactlyAssertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$exactlyAssertedSentence (#$genls #$Predicate #$Thing)))") });

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("assertedPredicateArg"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), $FORT)), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("assertedPredicateArg"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("assertedPredicateArg"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), $FORT)))), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("prune these cases :\n    (#$assertedPredicateArg <non-fort>  <whatever>   <whatever>)\n    (#$assertedPredicateArg <whatever> <non-integer> <whatever>)\n    (#$assertedPredicateArg <whatever>  <whatever>   <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg (#$YearFn 2002) 1 #$isa)\n    (#$assertedPredicateArg #$Predicate (#$PlusFn 1 1) #$genls)\n    (#$assertedPredicateArg #$Predicate 1 \"genls\")\n   ") });

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, makeKeyword("INTEGER"), $FORT), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate 1 #$genls)") });

    static private final SubLList $list_alt27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, makeKeyword("INTEGER"), $FORT), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedPredicateArg <fort> <integer> <fort>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedPredicateArg #$and 1 #$arity))") });

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, makeKeyword("INTEGER"), list(makeKeyword("NOT"), $FORT)), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <integer> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate 1 ?WHAT)") });

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), $FORT, list(makeKeyword("NOT"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <non-integer> <whatever>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate ?ARG ?PRED)") });

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedPredicateArg"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedPredicateArg"), list(makeKeyword("NOT"), $FORT), makeKeyword("INTEGER"), $FORT), $COST, makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <non-fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg ?X 1 #$expansion)") });

    static private final SubLSymbol $sym41$CLOSED_ = makeSymbol("CLOSED?");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termFormulas"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termFormulas"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), $COST, makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-POS"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS"), makeKeyword("DOCUMENTATION"), makeString("(#$termFormulas <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termFormulas #$Predicate (#$genls #$Predicate #$TruthFunction))") });

    static private final SubLList $list_alt46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("termFormulas"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termFormulas"), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), $COST, makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-NEG"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termFormulas <fully-bound> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termFormulas #$Predicate (#$genls #$Quantifier #$TruthFunction)))") });

    static private final SubLList $list_alt48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termFormulas"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termFormulas"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), $COST, makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termFormulas <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termFormulas ?TERM (#$genls #$Predicate #$TruthFunction))") });

    static private final SubLList $list_alt52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate #$TruthFunction)))") });

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedTermSentences #$Quantifier (#$genls #$Predicate #$TruthFunction)))\n    (#$not (#$assertedTermSentences #$Predicate  (#$genls #$TruthFunction #$Predicate)))\n    ") });

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), makeKeyword("NOT-FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <not fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences ?TERM (#$genls #$Predicate #$TruthFunction)))") });

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), $FORT, cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> (<predicate> . <not fully-bound>))\n    using only the KB GAF indexing and explicit assertions involving <predicate> and <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate ?GENL)))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC ?GENL))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC #$TruthFunction))\n    ") });

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), $FORT, list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), $FORT), makeKeyword("ANYTHING")), list($TEST, makeSymbol("ASENT-HAS-FORT-ARG-P")))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving the two FORTs"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (?PRED #$Predicate ?TERM))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$Collection))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$TruthFunction))\n    ") });

    static private final SubLList $list_alt62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSentences"), $FORT, makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> <variable>)\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate ?SENTENCE))") });

    static private final SubLList $list_alt65 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSetSentences <fully-dound> <variable>)\n    using the overlap indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) ?SENTENCE))") });

    static private final SubLList $list_alt67 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSetSentences <fully-dound> ([predicate] . [fully-bound]))\n    using only the KB GAF indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) (#$genls #$Dog #$Mammal))") });

    static private final SubLList $list_alt69 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedTermSetSentences"), makeKeyword("FULLY-BOUND"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedTermSetSentences <fully-dound> ([predicate] . [fully-bound])))\n    using only the overlap indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedTermSetSentences (#$TheSet #$Predicate) (#$isa #$Collection #$Thing)))\n    (#$not (#$assertedTermSetSentences (#$TheSet #$Predicate #$arity) (#$arity #$Predicate 2))) ") });
}

/**
 * Total time: 4354 ms
 */
