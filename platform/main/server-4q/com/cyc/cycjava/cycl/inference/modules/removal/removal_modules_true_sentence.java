/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.bindings.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-TRUE-SENTENCE
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-true-sentence.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_true_sentence extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_true_sentence();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_known_sentence_check_cost$ = makeSymbol("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*");

    // defparameter
    /**
     * The additional expense of knownSentence indirection. Useful for breaking
     * ties.
     */
    @LispMethod(comment = "The additional expense of knownSentence indirection. Useful for breaking\r\nties.\ndefparameter\nThe additional expense of knownSentence indirection. Useful for breaking\nties.")
    public static final SubLSymbol $known_sentence_lookahead_cost$ = makeSymbol("*KNOWN-SENTENCE-LOOKAHEAD-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_check_sentence_check_cost$ = makeSymbol("*DEFAULT-CHECK-SENTENCE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_unknown_sentence_check_cost$ = makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_true_sentence_check_cost$ = makeSymbol("*DEFAULT-TRUE-SENTENCE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_sentence_justifications_max_justifications_count$ = makeSymbol("*REMOVAL-SENTENCE-JUSTIFICATIONS-MAX-JUSTIFICATIONS-COUNT*");





    private static final SubLSymbol $KNOWN_SENTENCE_POS_GAF = makeKeyword("KNOWN-SENTENCE-POS-GAF");

    static private final SubLList $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("PREFERENCE"), makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE"));

    static private final SubLList $list6 = list(reader_make_constant_shell("isa"), makeKeyword("VARIABLE"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("ADMITTING-DEFNS?")))));

    private static final SubLSymbol KNOWN_SENTENCE_POS_GAF_PREFERENCE = makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE");

    private static final SubLSymbol $REMOVAL_KNOWN_SENTENCE_CHECK = makeKeyword("REMOVAL-KNOWN-SENTENCE-CHECK");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol $REMOVAL_KNOWN_SENTENCE_POS_GAF = makeKeyword("REMOVAL-KNOWN-SENTENCE-POS-GAF");

    static private final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentence"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("knownSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")), makeKeyword("POS"))), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("knownSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("knownSentence"), list($CALL, makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence \n     (#$genls ?SPEC #$BinaryRelation))") });

    private static final SubLSymbol $REMOVAL_KNOWN_SENTENCE_NEG_GAF = makeKeyword("REMOVAL-KNOWN-SENTENCE-NEG-GAF");

    static private final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentence"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });



    private static final SubLSymbol $CHECK_SENTENCE_SIBLING = makeKeyword("CHECK-SENTENCE-SIBLING");

    private static final SubLList $list25 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($TEST, makeSymbol("CHECK-SENTENCE-SIBLING-REQUIRED")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list26 = list(makeSymbol("SIBLING-MT"), makeSymbol("SIBLING-ASENT"));

    private static final SubLSymbol CHECK_SENTENCE_SIBLING_REQUIRED = makeSymbol("CHECK-SENTENCE-SIBLING-REQUIRED");

    private static final SubLSymbol $REMOVAL_CHECK_SENTENCE_CHECK = makeKeyword("REMOVAL-CHECK-SENTENCE-CHECK");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("checkSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("checkSentence"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("SENTENCE"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CHECK-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("checkSentence"), list($BIND, makeSymbol("SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REMOVAL-CHECK-SENTENCE-CHECK-QUERY"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("QUERY"), makeKeyword("DOCUMENTATION"), makeString("(#$checkSentence <sentence>)\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$checkSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });

    private static final SubLSymbol REMOVAL_CHECK_SENTENCE_CHECK_QUERY = makeSymbol("REMOVAL-CHECK-SENTENCE-CHECK-QUERY");

    private static final SubLList $list32 = list(reader_make_constant_shell("negationPreds"), reader_make_constant_shell("knownSentence"), reader_make_constant_shell("unknownSentence"));

    private static final SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_CHECK = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK");

    static private final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });

    private static final SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK-NEG");

    static private final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$unknownSentence (<non-predicate> . <fully-bound>)))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$unknownSentence\n      (#$thereExists ?PRED\n       (?PRED #$Collection #$Predicate))))") });

    private static final SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_POS_GAF = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-POS-GAF");

    static private final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<predicate> . <fully-bound>))\n    by recursively querying sentence (<predicate> . <fully-bound>)\n    and succeeding if it fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$arg1Isa #$isa #$Microtheory))") });

    private static final SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_NEG_GAF = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF");

    static private final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if it fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$not (#$isa #$myCreator #$DefaultMonotonicPredicate)))") });



    private static final SubLObject $$Shallow_CycInferenceMode = reader_make_constant_shell("Shallow-CycInferenceMode");

    private static final SubLObject $$Minimal_CycInferenceMode = reader_make_constant_shell("Minimal-CycInferenceMode");

    private static final SubLObject $$Extended_CycInferenceMode = reader_make_constant_shell("Extended-CycInferenceMode");

    private static final SubLObject $$Maximal_CycInferenceMode = reader_make_constant_shell("Maximal-CycInferenceMode");

    private static final SubLSymbol $REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK = makeKeyword("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK");

    static private final SubLList $list53 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentenceWRTInferenceMode"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentenceWRTInferenceMode"), list($TEST, makeSymbol("INFERENCE-MODE-TERM-P")), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentenceWRTInferenceMode <inference-mode-term-p> <fully-bound>)\n    by recursively querying sentence <fully-bound> using the provided inference mode."), makeKeyword("EXAMPLE"), makeString("(#$unknownSentenceWRTInferenceMode #$Shallow-CycInferenceMode\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });





    private static final SubLSymbol $TRUE_SENTENCE_POS_GAF = makeKeyword("TRUE-SENTENCE-POS-GAF");

    private static final SubLList $list57 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("PREFERENCE"), makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE"));

    private static final SubLSymbol TRUE_SENTENCE_POS_GAF_PREFERENCE = makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE");

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_CHECK = makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK");

    private static final SubLList $list60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("trueSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))), list(reader_make_constant_shell("trueSentence"), reader_make_constant_shell("True"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRUE-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$thereExists ?COL\n      (#$disjointWith #$Collection ?COL)))") });

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_POS_GAF = makeKeyword("REMOVAL-TRUE-SENTENCE-POS-GAF");

    private static final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-TRUE-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("trueSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")), makeKeyword("POS"))), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("trueSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("trueSentence"), list($CALL, makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence \n     (#$isa #$Predicate ?WHAT))") });

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_NEG_GAF = makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-GAF");

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_NEG_FALSE = makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-FALSE");

    private static final SubLList $list66 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), reader_make_constant_shell("False")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), T, makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), list(QUOTE, list(reader_make_constant_shell("trueSentence"), reader_make_constant_shell("True")))), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence #$False)") });

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION = makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION");

    private static final SubLList $list68 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(reader_make_constant_shell("forAll"), list($TEST, makeSymbol("EL-VARIABLE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence \n      (#$not \n       (#$thereExists ?EATER \n        (#$thereExists ?EATING \n         (#$and \n          (#$isa ?EATING #$EatingEvent) \n          (#$consumedObject ?EATING ?EATER) \n          (#$doneBy ?EATING ?EATER)))))))") });

    private static final SubLSymbol REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED = makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED");

    private static final SubLSymbol SENTENCE_FREE_VARIABLES = makeSymbol("SENTENCE-FREE-VARIABLES");

    private static final SubLSymbol NEGATE = makeSymbol("NEGATE");





    private static final SubLList $list76 = list(makeKeyword("CONDITIONAL-SENTENCE?"), T);

    private static final SubLSymbol REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND = makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND");

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION = makeKeyword("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION");

    private static final SubLList $list79 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(reader_make_constant_shell("forAll"), list($TEST, makeSymbol("EL-VARIABLE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence\n      (#$forAll ?PRED\n       (#$implies\n        (#$memberOfList ?PRED\n         (#$TheList #$fieldsOfCompetence \n \t\t    #$primarySupervisor\n \t\t    (#$IsaPredFn #$ProjectManager)\n \t\t    (#$IsaPredFn #$OntologicalEngineer)\n \t\t    (#$IsaPredFn #$ComputerProgrammer) #$fieldsOfCompetence))\n        (#$thereExists ?CONSTRAINT\n \t (#$thereExists ?M\n          (#$argIsa ?PRED ?M ?CONSTRAINT)))))))") });



    private static final SubLSymbol REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED = makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED");

    private static final SubLSymbol REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND = makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND");

    private static final SubLSymbol $REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION = makeKeyword("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION");

    private static final SubLList $list84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(makeKeyword("AND"), list(reader_make_constant_shell("forAll"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("implies")), list($TEST, makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$trueSentence\n      (#$forAll ?N\n       (#$implies\n        (#$elementOf ?N (#$TheSet 0 1))\n        (#$evaluate ?N (#$TimesFn ?N ?N))))))") });

    private static final SubLSymbol $sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_ = makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?");

    private static final SubLSymbol REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND = makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND");

    private static final SubLSymbol $kw88$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLObject $$sentenceJustifications_Simple = reader_make_constant_shell("sentenceJustifications-Simple");

    private static final SubLSymbol $REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE = makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE");

    private static final SubLList $list91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("sentenceJustifications-Simple"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("sentenceJustifications-Simple"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$sentenceJustifications-Simple <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-Simple (#$genls #$Dog #$Animal) ?WHY))") });

    private static final SubLSymbol REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY = makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY");

    private static final SubLSymbol $kw98$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS = makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLObject $const105$sentenceJustifications_ProofViewS = reader_make_constant_shell("sentenceJustifications-ProofViewSummary");

    private static final SubLSymbol $REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY = makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY");

    private static final SubLList $list107 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("sentenceJustifications-ProofViewSummary"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("sentenceJustifications-ProofViewSummary"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$sentenceJustifications-ProofViewSummary <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-ProofViewSummary (#$genls #$Dog #$Animal) ?WHY))") });

    private static final SubLSymbol PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS = makeSymbol("PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS");



    private static final SubLSymbol $REMOVAL_TAUTOLOGY_JUSTIFICATION = makeKeyword("REMOVAL-TAUTOLOGY-JUSTIFICATION");

    private static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("tautologyJustification"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("tautologyJustification"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TAUTOLOGY-JUSTIFICATION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$tautologyJustification <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$tautologyJustification (#$genls #$Dog #$Animal) ?WHY))") });

    private static final SubLSymbol $kw112$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    private static final SubLList $list117 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentenceWithProofView"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentenceWithProofView"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentenceWithProofView <anything> <fully-bound-p> <anything>)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$knownSentenceWithProofView (#$genls #$Dog #$Animal) ?WHY))") });

    private static final SubLSymbol REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW = makeSymbol("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW");



    // Definitions
    public static final SubLObject removal_complete_asentP_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return inference_completeness_utilities.inference_complete_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
    }

    // Definitions
    public static SubLObject removal_complete_asentP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_completeness_utilities.inference_complete_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static final SubLObject make_truth_sentence_support_alt(SubLObject truth_predicate, SubLObject sentence) {
        if (truth_predicate == $$unknownSentence) {
            {
                SubLObject truth_sentence_formula = make_unary_formula(truth_predicate, sentence);
                SubLObject support = arguments.make_hl_support($OPAQUE, truth_sentence_formula, UNPROVIDED, UNPROVIDED);
                return support;
            }
        } else {
            return arguments.make_hl_support($QUERY, sentence, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject make_truth_sentence_support(final SubLObject truth_predicate, final SubLObject sentence) {
        if (truth_predicate.eql($$unknownSentence)) {
            final SubLObject truth_sentence_formula = make_unary_formula(truth_predicate, sentence);
            final SubLObject support = arguments.make_hl_support($OPAQUE, truth_sentence_formula, UNPROVIDED, UNPROVIDED);
            return support;
        }
        return arguments.make_hl_support($QUERY, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject make_truth_sentence_supports_alt(SubLObject truth_asent) {
        {
            SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(truth_asent, UNPROVIDED);
            return list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_known_sentence_support(gaf_sentence));
        }
    }

    public static SubLObject make_truth_sentence_supports(final SubLObject truth_asent) {
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(truth_asent, UNPROVIDED);
        return list(make_known_sentence_support(gaf_sentence));
    }

    public static final SubLObject known_sentence_literal_removal_cost_alt(SubLObject asent, SubLObject mt, SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = ZERO_INTEGER;
                if (NIL != ist_of_atomic_sentence_p(asent)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject asent_1 = czer_utilities.unwrap_if_ist_permissive(asent, mt);
                        SubLObject mt_2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        asent = asent_1;
                        mt = mt_2;
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            result = inference_utilities.literal_removal_cost(asent, sense, mt, removal_modules_abduction.abductive_modules_not_allowed_spec());
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject known_sentence_literal_removal_cost(SubLObject asent, SubLObject mt, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = ZERO_INTEGER;
        if (NIL != ist_of_atomic_sentence_p(asent)) {
            thread.resetMultipleValues();
            final SubLObject asent_$1 = czer_utilities.unwrap_if_ist_permissive(asent, mt);
            final SubLObject mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            asent = asent_$1;
            mt = mt_$2;
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = inference_utilities.literal_removal_cost(asent, sense, mt, removal_modules_abduction.abductive_modules_not_allowed_spec());
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @see removal-known-sentence-completeness
     */
    @LispMethod(comment = "@see removal-known-sentence-completeness")
    public static final SubLObject known_sentence_pos_gaf_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        {
            SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            if (NIL != formula_pattern_match.pattern_matches_formula($list_alt6, gaf_sentence)) {
                return $PREFERRED;
            }
            {
                SubLObject lookahead_preference_level = preference_modules.literal_preference_level_wrt_modules(gaf_sentence, $POS, bindable_vars, strategic_context);
                if (NIL != preference_modules.preference_level_L(lookahead_preference_level, $DISPREFERRED)) {
                    return lookahead_preference_level;
                } else {
                    return $PREFERRED;
                }
            }
        }
    }

    /**
     *
     *
     * @see removal-known-sentence-completeness
     */
    @LispMethod(comment = "@see removal-known-sentence-completeness")
    public static SubLObject known_sentence_pos_gaf_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != formula_pattern_match.pattern_matches_formula($list6, gaf_sentence)) {
            return $PREFERRED;
        }
        final SubLObject lookahead_preference_level = preference_modules.literal_preference_level_wrt_modules(gaf_sentence, $POS, bindable_vars, strategic_context);
        if (NIL != preference_modules.preference_level_L(lookahead_preference_level, $DISPREFERRED)) {
            return lookahead_preference_level;
        }
        return $PREFERRED;
    }

    public static final SubLObject make_known_sentence_support_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_truth_sentence_support($$knownSentence, sentence);
    }

    public static SubLObject make_known_sentence_support(final SubLObject sentence) {
        return make_truth_sentence_support($$knownSentence, sentence);
    }

    public static final SubLObject removal_known_sentence_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_check_query(sentence, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_known_sentence_support(sentence);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_known_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != removal_known_sentence_check_query(sentence, UNPROVIDED)) {
            final SubLObject hl_support = make_known_sentence_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_known_sentence_check_query_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    public static SubLObject removal_known_sentence_check_query(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    public static final SubLObject removal_known_sentence_pos_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject cost = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $POS);
                if (!cost.isZero()) {
                    cost = add(cost, $known_sentence_lookahead_cost$.getDynamicValue(thread));
                }
                if (NIL != variables.fully_bound_p(asent)) {
                    cost = min(cost, $default_known_sentence_check_cost$.getDynamicValue(thread));
                }
                return cost;
            }
        }
    }

    public static SubLObject removal_known_sentence_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cost = known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $POS);
        if (!cost.isZero()) {
            cost = add(cost, $known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        if (NIL != variables.fully_bound_p(asent)) {
            cost = min(cost, $default_known_sentence_check_cost$.getDynamicValue(thread));
        }
        return cost;
    }

    public static final SubLObject removal_known_sentence_pos_gaf_iterator_alt(SubLObject gaf_sentence) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED));
    }

    public static SubLObject removal_known_sentence_pos_gaf_iterator(final SubLObject gaf_sentence) {
        return iteration.new_list_iterator(removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED));
    }

    public static final SubLObject removal_known_sentence_completeness_alt(SubLObject gaf_sentence, SubLObject sense) {
        if (NIL != variables.fully_bound_p(gaf_sentence)) {
            return $COMPLETE;
        }
        if (NIL != formula_pattern_match.pattern_matches_formula($list_alt6, gaf_sentence)) {
            return $COMPLETE;
        }
        {
            SubLObject lookahead_completeness = inference_utilities.literal_removal_completeness(gaf_sentence, sense, UNPROVIDED);
            if (NIL != inference_datastructures_enumerated_types.completeness_L(lookahead_completeness, $INCOMPLETE)) {
                return lookahead_completeness;
            } else {
                return $COMPLETE;
            }
        }
    }

    public static SubLObject removal_known_sentence_completeness(final SubLObject gaf_sentence, final SubLObject sense) {
        if (NIL != variables.fully_bound_p(gaf_sentence)) {
            return $COMPLETE;
        }
        if (NIL != formula_pattern_match.pattern_matches_formula($list6, gaf_sentence)) {
            return $COMPLETE;
        }
        final SubLObject lookahead_completeness = inference_utilities.literal_removal_completeness(gaf_sentence, sense, UNPROVIDED);
        if (NIL != inference_datastructures_enumerated_types.completeness_L(lookahead_completeness, $INCOMPLETE)) {
            return lookahead_completeness;
        }
        return $COMPLETE;
    }

    public static final SubLObject removal_known_sentence_pos_gaf_query_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, $TRUE);
    }

    public static SubLObject removal_known_sentence_pos_gaf_query(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, $TRUE);
    }

    public static final SubLObject removal_known_sentence_neg_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
                SubLObject cost = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $NEG);
                if (!cost.isZero()) {
                    cost = add(cost, $known_sentence_lookahead_cost$.getDynamicValue(thread));
                }
                cost = min(cost, $default_known_sentence_check_cost$.getDynamicValue(thread));
                return cost;
            }
        }
    }

    public static SubLObject removal_known_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        SubLObject cost = known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $NEG);
        if (!cost.isZero()) {
            cost = add(cost, $known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        cost = min(cost, $default_known_sentence_check_cost$.getDynamicValue(thread));
        return cost;
    }

    public static final SubLObject removal_known_sentence_neg_gaf_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_known_sentence_support(negated_gaf_sentence);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_known_sentence_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        if (NIL != removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED)) {
            final SubLObject hl_support = make_known_sentence_support(negated_gaf_sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_known_sentence_neg_gaf_query_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, $FALSE);
    }

    public static SubLObject removal_known_sentence_neg_gaf_query(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, $FALSE);
    }

    public static SubLObject check_sentence_sibling_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_with_operator_p(asent, $$checkSentence)) {
            final SubLObject tactic = inference_worker.currently_considered_tactic();
            if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
                final SubLObject join_ordered_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
                final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
                final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                final SubLObject asent_wrt_supported = bindings.apply_bindings(focal_variable_map, asent);
                final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
                final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
                if (NIL != list_utilities.simple_tree_find($$checkSentence, supported_query)) {
                    SubLObject cdolist_list_var = supported_query;
                    SubLObject contextualized_clause = NIL;
                    contextualized_clause = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject sibling_sense = $NEG;
                        SubLObject index_var = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$3 = clauses.neg_lits(contextualized_clause);
                        SubLObject contextualized_asent = NIL;
                        contextualized_asent = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject sibling_mt = NIL;
                            SubLObject sibling_asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list26);
                            sibling_mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list26);
                            sibling_asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (((($POS == sibling_sense) && (NIL != el_formula_with_operator_p(sibling_asent, $$checkSentence))) && asent_wrt_supported.equal(cycl_utilities.el_formula_arg1(sibling_asent, UNPROVIDED))) && (NIL != hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), sibling_mt))) {
                                    return sibling_asent;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list26);
                            }
                            index_var = add(index_var, ONE_INTEGER);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            contextualized_asent = cdolist_list_var_$3.first();
                        } 
                        sibling_sense = $POS;
                        index_var = ZERO_INTEGER;
                        SubLObject cdolist_list_var_$4 = clauses.pos_lits(contextualized_clause);
                        contextualized_asent = NIL;
                        contextualized_asent = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject sibling_mt = NIL;
                            SubLObject sibling_asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list26);
                            sibling_mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list26);
                            sibling_asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (((($POS == sibling_sense) && (NIL != el_formula_with_operator_p(sibling_asent, $$checkSentence))) && asent_wrt_supported.equal(cycl_utilities.el_formula_arg1(sibling_asent, UNPROVIDED))) && (NIL != hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), sibling_mt))) {
                                    return sibling_asent;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list26);
                            }
                            index_var = add(index_var, ONE_INTEGER);
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            contextualized_asent = cdolist_list_var_$4.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        contextualized_clause = cdolist_list_var.first();
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_check_sentence_check_query(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    public static final SubLObject make_unknown_sentence_support_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_truth_sentence_support($$unknownSentence, sentence);
    }

    public static SubLObject make_unknown_sentence_support(final SubLObject sentence) {
        return make_truth_sentence_support($$unknownSentence, sentence);
    }

    public static final SubLObject removal_unknown_sentence_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_check_query(sentence, UNPROVIDED);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == results) && (NIL != validP)) {
                        {
                            SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_unknown_sentence_support(sentence);
                            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_unknown_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_known_sentence_check_query(sentence, UNPROVIDED);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (((sense == $POS) && (NIL == results)) && (NIL != validP)) {
            final SubLObject hl_support = make_unknown_sentence_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        if ((sense == $NEG) && (NIL != results)) {
            final SubLObject hl_support = arguments.make_hl_support($QUERY, make_unary_formula($$knownSentence, cycl_utilities.sentence_arg1(asent, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            final SubLObject negation_preds_support = arguments.make_hl_support($NEGATIONPREDS, $list32, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, NIL, list(negation_preds_support));
        }
        return NIL;
    }

    static private final SubLList $list_alt5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("PREFERENCE"), makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE"));

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("isa"), makeKeyword("VARIABLE"), list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), list($TEST, makeSymbol("ADMITTING-DEFNS?")))));

    public static final SubLObject removal_unknown_sentence_pos_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return min($default_unknown_sentence_check_cost$.getDynamicValue(thread), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_pos_gaf_cost(asent, UNPROVIDED));
        }
    }

    public static SubLObject removal_unknown_sentence_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return min($default_unknown_sentence_check_cost$.getDynamicValue(thread), removal_known_sentence_pos_gaf_cost(asent, UNPROVIDED));
    }

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });

    public static final SubLObject removal_unknown_sentence_pos_gaf_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == results) && (NIL != validP)) {
                        {
                            SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_unknown_sentence_support(gaf_sentence);
                            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_unknown_sentence_pos_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == results) && (NIL != validP)) {
            final SubLObject hl_support = make_unknown_sentence_support(gaf_sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_unknown_sentence_neg_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return min($default_unknown_sentence_check_cost$.getDynamicValue(thread), com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_neg_gaf_cost(asent, UNPROVIDED));
        }
    }

    public static SubLObject removal_unknown_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return min($default_unknown_sentence_check_cost$.getDynamicValue(thread), removal_known_sentence_neg_gaf_cost(asent, UNPROVIDED));
    }

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentence"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("knownSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")), makeKeyword("POS"))), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("knownSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("knownSentence"), list($CALL, makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence \n     (#$genls ?SPEC #$BinaryRelation))") });

    public static final SubLObject removal_unknown_sentence_neg_gaf_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
            if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_unknown_sentence_support(negated_gaf_sentence);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_unknown_sentence_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        if (NIL == removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED)) {
            final SubLObject hl_support = make_unknown_sentence_support(negated_gaf_sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject make_unknown_sentence_wrt_inference_mode_support(final SubLObject sentence) {
        return make_truth_sentence_support($$unknownSentenceWRTInferenceMode, sentence);
    }

    public static SubLObject removal_unknown_sentence_wrt_inference_mode_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (mode.eql($$Shallow_CycInferenceMode)) {
            return multiply(ONE_INTEGER, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        if (mode.eql($$Minimal_CycInferenceMode)) {
            return multiply(TEN_INTEGER, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        if (mode.eql($$Extended_CycInferenceMode)) {
            return multiply($int$100, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        return multiply($int$1000, $default_unknown_sentence_check_cost$.getDynamicValue(thread));
    }

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("knownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("knownSentence"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$knownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$knownSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });

    public static SubLObject removal_unknown_sentence_wrt_inference_mode_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = inference_trampolines.$recursive_query_override_properties$.currentBinding(thread);
        try {
            inference_trampolines.$recursive_query_override_properties$.bind(mode.eql($$Shallow_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($SHALLOW) : mode.eql($$Minimal_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($MINIMAL) : mode.eql($$Extended_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($EXTENDED) : mode.eql($$Maximal_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode($MAXIMAL) : NIL, thread);
            final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject results = removal_known_sentence_check_query(sentence, UNPROVIDED);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == results) && (NIL != validP)) {
                final SubLObject hl_support = make_unknown_sentence_support(sentence);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            inference_trampolines.$recursive_query_override_properties$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });

    public static SubLObject inference_mode_term_p(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, $$SpecifiedInferenceModeCluster);
    }

    public static final SubLObject true_sentence_pos_gaf_preference_alt(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.known_sentence_pos_gaf_preference(asent, bindable_vars, strategic_context);
    }

    public static SubLObject true_sentence_pos_gaf_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return known_sentence_pos_gaf_preference(asent, bindable_vars, strategic_context);
    }

    public static final SubLObject make_true_sentence_support_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_truth_sentence_support($$trueSentence, sentence);
    }

    public static SubLObject make_true_sentence_support(final SubLObject sentence) {
        return make_truth_sentence_support($$trueSentence, sentence);
    }

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (<predicate> . <fully-bound>))\n    by recursively querying sentence (<predicate> . <fully-bound>)\n    and succeeding if it fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$arg1Isa #$isa #$Microtheory))") });

    public static final SubLObject removal_true_sentence_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_true_sentence_check_query(sentence, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_true_sentence_support(sentence);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_true_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != removal_true_sentence_check_query(sentence, UNPROVIDED)) {
            final SubLObject hl_support = make_true_sentence_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_true_sentence_check_query_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_true_sentence_recursive_query(sentence, mt, ONE_INTEGER);
    }

    public static SubLObject removal_true_sentence_check_query(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_true_sentence_recursive_query(sentence, mt, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject removal_true_sentence_pos_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_pos_gaf_cost(asent, UNPROVIDED);
    }

    public static SubLObject removal_true_sentence_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_known_sentence_pos_gaf_cost(asent, UNPROVIDED);
    }

    static private final SubLList $list_alt28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("unknownSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("unknownSentence"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unknownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if it fails"), makeKeyword("EXAMPLE"), makeString("(#$unknownSentence\n     (#$not (#$isa #$myCreator #$DefaultMonotonicPredicate)))") });

    public static final SubLObject removal_true_sentence_pos_gaf_iterator_alt(SubLObject gaf_sentence) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED));
    }

    public static SubLObject removal_true_sentence_pos_gaf_iterator(final SubLObject gaf_sentence) {
        return iteration.new_list_iterator(removal_known_sentence_pos_gaf_query(gaf_sentence, UNPROVIDED));
    }

    public static final SubLObject removal_true_sentence_neg_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_neg_gaf_cost(asent, UNPROVIDED);
    }

    public static SubLObject removal_true_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_known_sentence_neg_gaf_cost(asent, UNPROVIDED);
    }

    public static final SubLObject removal_true_sentence_neg_gaf_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
            SubLObject results = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED);
            if (NIL != results) {
                {
                    SubLObject cdolist_list_var = results;
                    SubLObject v_bindings = NIL;
                    for (v_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_bindings = cdolist_list_var.first()) {
                        {
                            SubLObject substituted_gaf_sentence = subst_bindings(v_bindings, gaf_sentence);
                            SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.make_true_sentence_support(cycl_utilities.negate(substituted_gaf_sentence));
                            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_true_sentence_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, UNPROVIDED);
        final SubLObject results = removal_known_sentence_neg_gaf_query(gaf_sentence, UNPROVIDED);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                final SubLObject hl_support = make_true_sentence_support(cycl_utilities.negate(substituted_gaf_sentence));
                backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    static private final SubLList $list_alt31 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("PREFERENCE"), makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE"));

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("trueSentence"), list(makeKeyword("AND"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")))))), list(reader_make_constant_shell("trueSentence"), reader_make_constant_shell("True"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRUE-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$thereExists ?COL\n      (#$disjointWith #$Collection ?COL)))") });

    /**
     * Accepts sentences of the form
     * (#$trueSentence
     * (#$forAll <el-var>
     * (#$forAll <el-var>
     * ...
     * (#$or
     * <literal>
     * <literal>
     * ...))))
     */
    @LispMethod(comment = "Accepts sentences of the form\r\n(#$trueSentence\r\n(#$forAll <el-var>\r\n(#$forAll <el-var>\r\n...\r\n(#$or\r\n<literal>\r\n<literal>\r\n...))))\nAccepts sentences of the form\n(#$trueSentence\n(#$forAll <el-var>\n(#$forAll <el-var>\n...\n(#$or\n<literal>\n<literal>\n...))))")
    public static final SubLObject removal_true_sentence_universal_disjunction_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject truesentence = unmake_unary_formula(asent);
                SubLObject subsentence = thread.secondMultipleValue();
                thread.resetMultipleValues();
                while (NIL != el_universal_p(subsentence)) {
                    subsentence = quantified_sub_sentence(subsentence);
                } 
                subsentence = inference_czer.inference_el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt(), T);
                if (NIL == formula_with_sequence_varP(subsentence)) {
                    if ((NIL != el_disjunction_p(subsentence)) && (NIL == formula_with_sequence_varP(subsentence))) {
                        {
                            SubLObject disjunction = subsentence;
                            SubLObject literal_disjunct_count = ZERO_INTEGER;
                            SubLObject found_a_non_literalP = NIL;
                            SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
                            SubLObject rest = NIL;
                            for (rest = args; !((NIL != found_a_non_literalP) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject disjunct = rest.first();
                                    if (NIL != cycl_grammar.cycl_literal_p(disjunct)) {
                                        literal_disjunct_count = add(literal_disjunct_count, ONE_INTEGER);
                                    } else {
                                        found_a_non_literalP = T;
                                    }
                                }
                            }
                            if (NIL == found_a_non_literalP) {
                                if (literal_disjunct_count.numGE(TWO_INTEGER)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Accepts sentences of the form
     * (#$trueSentence
     * (#$forAll <el-var>
     * (#$forAll <el-var>
     * ...
     * (#$or
     * <literal>
     * <literal>
     * ...))))
     */
    @LispMethod(comment = "Accepts sentences of the form\r\n(#$trueSentence\r\n(#$forAll <el-var>\r\n(#$forAll <el-var>\r\n...\r\n(#$or\r\n<literal>\r\n<literal>\r\n...))))\nAccepts sentences of the form\n(#$trueSentence\n(#$forAll <el-var>\n(#$forAll <el-var>\n...\n(#$or\n<literal>\n<literal>\n...))))")
    public static SubLObject removal_true_sentence_universal_disjunction_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject truesentence = unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_universal_p(subsentence)) {
            subsentence = quantified_sub_sentence(subsentence);
        } 
        subsentence = inference_czer.inference_el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt(), T);
        if (((NIL == formula_with_sequence_varP(subsentence)) && (NIL != el_disjunction_p(subsentence))) && (NIL == formula_with_sequence_varP(subsentence))) {
            final SubLObject disjunction = subsentence;
            SubLObject literal_disjunct_count = ZERO_INTEGER;
            SubLObject found_a_non_literalP = NIL;
            final SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
            SubLObject rest;
            SubLObject disjunct;
            for (rest = NIL, rest = args; (NIL == found_a_non_literalP) && (NIL != rest); rest = rest.rest()) {
                disjunct = rest.first();
                if (NIL != cycl_grammar.cycl_literal_p(disjunct)) {
                    literal_disjunct_count = add(literal_disjunct_count, ONE_INTEGER);
                } else {
                    found_a_non_literalP = T;
                }
            }
            if ((NIL == found_a_non_literalP) && literal_disjunct_count.numGE(TWO_INTEGER)) {
                return T;
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-TRUE-SENTENCE-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("trueSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")), makeKeyword("POS"))), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("trueSentence"), list($BIND, makeSymbol("GAF-SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("trueSentence"), list($CALL, makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GAF-SENTENCE")))), makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence \n     (#$isa #$Predicate ?WHAT))") });

    public static final SubLObject removal_true_sentence_universal_disjunction_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject truesentence = unmake_unary_formula(asent);
                SubLObject subsentence = thread.secondMultipleValue();
                thread.resetMultipleValues();
                while (NIL != el_universal_p(subsentence)) {
                    subsentence = quantified_sub_sentence(subsentence);
                } 
                {
                    SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
                    SubLObject disjunction = clausifier.el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt());
                    SubLObject args = cycl_utilities.formula_args(disjunction, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject consequent_disjunct = NIL;
                    for (consequent_disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , consequent_disjunct = cdolist_list_var.first()) {
                        {
                            SubLObject antecedent_disjuncts = remove(consequent_disjunct, cycl_utilities.formula_args(disjunction, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject consequent_vars = sentence_free_variables(consequent_disjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject antecedent_vars = apply(symbol_function(APPEND), Mapping.mapcar(SENTENCE_FREE_VARIABLES, antecedent_disjuncts));
                            SubLObject vars_to_quantify = set_difference(consequent_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var_3 = vars_to_quantify;
                            SubLObject var = NIL;
                            for (var = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , var = cdolist_list_var_3.first()) {
                                consequent_disjunct = make_universal(var, consequent_disjunct);
                            }
                            {
                                SubLObject antecedent_negated_disjuncts = Mapping.mapcar(NEGATE, antecedent_disjuncts);
                                SubLObject recursive_sentence = list($$implies, bq_cons($$and, append(antecedent_negated_disjuncts, NIL)), consequent_disjunct);
                                thread.resetMultipleValues();
                                {
                                    SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, $list_alt50);
                                    SubLObject halt_reason = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason)) && (NIL != results)) {
                                        {
                                            SubLObject support = arguments.make_hl_support($QUERY, recursive_sentence, mt, UNPROVIDED);
                                            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject removal_true_sentence_universal_disjunction_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject truesentence = unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_universal_p(subsentence)) {
            subsentence = quantified_sub_sentence(subsentence);
        } 
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject disjunction = clausifier.el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt());
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(disjunction, $IGNORE);
        SubLObject consequent_disjunct = NIL;
        consequent_disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject antecedent_disjuncts = remove(consequent_disjunct, cycl_utilities.formula_args(disjunction, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject consequent_vars = sentence_free_variables(consequent_disjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject antecedent_vars = apply(symbol_function(APPEND), Mapping.mapcar(SENTENCE_FREE_VARIABLES, antecedent_disjuncts));
            SubLObject cdolist_list_var_$5;
            final SubLObject vars_to_quantify = cdolist_list_var_$5 = set_difference(consequent_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            var = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                consequent_disjunct = make_universal(var, consequent_disjunct);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                var = cdolist_list_var_$5.first();
            } 
            final SubLObject antecedent_negated_disjuncts = Mapping.mapcar(NEGATE, antecedent_disjuncts);
            final SubLObject recursive_sentence = list($$implies, bq_cons($$and, append(antecedent_negated_disjuncts, NIL)), consequent_disjunct);
            thread.resetMultipleValues();
            final SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, $list76);
            final SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason)) && (NIL != results)) {
                final SubLObject support = arguments.make_hl_support($QUERY, recursive_sentence, mt, UNPROVIDED);
                backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            consequent_disjunct = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")))), $COST, makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$trueSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), reader_make_constant_shell("False")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), T, makeKeyword("SUPPORT-PATTERN"), list($CALL, makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), list(QUOTE, list(reader_make_constant_shell("trueSentence"), reader_make_constant_shell("True")))), makeKeyword("DOCUMENTATION"), makeString("(#$trueSentence #$False)") });

    /**
     * Accepts sentences of the form
     * (#$trueSentence
     * (#$forAll <el-var>
     * (#$forAll <el-var2>
     * ...
     * (#$implies
     * (#$memberOfList <el-var> <el-list>)
     * <fully-bound>
     * ))))
     */
    @LispMethod(comment = "Accepts sentences of the form\r\n(#$trueSentence\r\n(#$forAll <el-var>\r\n(#$forAll <el-var2>\r\n...\r\n(#$implies\r\n(#$memberOfList <el-var> <el-list>)\r\n<fully-bound>\r\n))))\nAccepts sentences of the form\n(#$trueSentence\n(#$forAll <el-var>\n(#$forAll <el-var2>\n...\n(#$implies\n(#$memberOfList <el-var> <el-list>)\n<fully-bound>\n))))")
    public static final SubLObject removal_true_sentence_member_of_list_implication_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject truesentence = unmake_unary_formula(asent);
                SubLObject subsentence = thread.secondMultipleValue();
                thread.resetMultipleValues();
                while (NIL != el_universal_p(subsentence)) {
                    subsentence = quantified_sub_sentence(subsentence);
                } 
                if (NIL != el_implication_p(subsentence)) {
                    subsentence = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
                    if (((cycl_utilities.formula_arg0(subsentence) == $$memberOfList) && (NIL != cycl_grammar.el_variable_p(cycl_utilities.formula_arg1(subsentence, UNPROVIDED)))) && (NIL != el_list_p(cycl_utilities.formula_arg2(subsentence, UNPROVIDED)))) {
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Accepts sentences of the form
     * (#$trueSentence
     * (#$forAll <el-var>
     * (#$forAll <el-var2>
     * ...
     * (#$implies
     * (#$memberOfList <el-var> <el-list>)
     * <fully-bound>
     * ))))
     */
    @LispMethod(comment = "Accepts sentences of the form\r\n(#$trueSentence\r\n(#$forAll <el-var>\r\n(#$forAll <el-var2>\r\n...\r\n(#$implies\r\n(#$memberOfList <el-var> <el-list>)\r\n<fully-bound>\r\n))))\nAccepts sentences of the form\n(#$trueSentence\n(#$forAll <el-var>\n(#$forAll <el-var2>\n...\n(#$implies\n(#$memberOfList <el-var> <el-list>)\n<fully-bound>\n))))")
    public static SubLObject removal_true_sentence_member_of_list_implication_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject truesentence = unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_universal_p(subsentence)) {
            subsentence = quantified_sub_sentence(subsentence);
        } 
        if (NIL != el_implication_p(subsentence)) {
            subsentence = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
            if ((cycl_utilities.formula_arg0(subsentence).eql($$memberOfList) && (NIL != cycl_grammar.el_variable_p(cycl_utilities.formula_arg1(subsentence, UNPROVIDED)))) && (NIL != el_list_p(cycl_utilities.formula_arg2(subsentence, UNPROVIDED)))) {
                return T;
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(reader_make_constant_shell("forAll"), list($TEST, makeSymbol("EL-VARIABLE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence \n      (#$not \n       (#$thereExists ?EATER \n        (#$thereExists ?EATING \n         (#$and \n          (#$isa ?EATING #$EatingEvent) \n          (#$consumedObject ?EATING ?EATER) \n          (#$doneBy ?EATING ?EATER)))))))") });

    public static final SubLObject removal_true_sentence_member_of_list_implication_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
                SubLObject el_list = NIL;
                SubLObject el_var = NIL;
                SubLObject subquery = NIL;
                SubLObject recursive_sentences = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject truesentence = unmake_unary_formula(asent);
                    SubLObject subsentence = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    while (NIL != el_universal_p(subsentence)) {
                        subsentence = quantified_sub_sentence(subsentence);
                    } 
                    if (NIL != el_implication_p(subsentence)) {
                        subquery = cycl_utilities.formula_arg2(subsentence, UNPROVIDED);
                        subsentence = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
                        if (cycl_utilities.formula_arg0(subsentence) == $$memberOfList) {
                            el_var = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
                            el_list = cycl_utilities.formula_arg2(subsentence, UNPROVIDED);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = el_list_items(el_list);
                    SubLObject el_term = NIL;
                    for (el_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_term = cdolist_list_var.first()) {
                        {
                            SubLObject recursive_sentence = apply_bindings(removal_modules_distance_between.make_variable_bindings(list(el_var), list(el_term)), subquery);
                            thread.resetMultipleValues();
                            {
                                SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, UNPROVIDED);
                                SubLObject halt_reason = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason)) && (NIL != results)) {
                                    recursive_sentences = cons(recursive_sentence, recursive_sentences);
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
                backward.removal_add_node(arguments.make_hl_support($QUERY, make_conjunction(recursive_sentences), mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject removal_true_sentence_member_of_list_implication_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject el_list = NIL;
        SubLObject el_var = NIL;
        SubLObject subquery = NIL;
        SubLObject recursive_sentences = NIL;
        thread.resetMultipleValues();
        final SubLObject truesentence = unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL != el_universal_p(subsentence)) {
            subsentence = quantified_sub_sentence(subsentence);
        } 
        if (NIL != el_implication_p(subsentence)) {
            subquery = cycl_utilities.formula_arg2(subsentence, UNPROVIDED);
            subsentence = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
            if (cycl_utilities.formula_arg0(subsentence).eql($$memberOfList)) {
                el_var = cycl_utilities.formula_arg1(subsentence, UNPROVIDED);
                el_list = cycl_utilities.formula_arg2(subsentence, UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = el_list_items(el_list);
        SubLObject el_term = NIL;
        el_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject recursive_sentence = bindings.apply_bindings(bindings.make_variable_bindings(list(el_var), list(el_term)), subquery);
            thread.resetMultipleValues();
            final SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, UNPROVIDED);
            final SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason)) || (NIL == results)) {
                return NIL;
            }
            recursive_sentences = cons(recursive_sentence, recursive_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            el_term = cdolist_list_var.first();
        } 
        backward.removal_add_node(arguments.make_hl_support($QUERY, make_conjunction(recursive_sentences), mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    static private final SubLList $list_alt50 = list(makeKeyword("CONDITIONAL-SENTENCE?"), T);

    static private final SubLList $list_alt53 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(reader_make_constant_shell("forAll"), list($TEST, makeSymbol("EL-VARIABLE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence\n      (#$forAll ?PRED\n       (#$implies\n        (#$memberOfList ?PRED\n         (#$TheList #$fieldsOfCompetence \n \t\t    #$primarySupervisor\n \t\t    (#$IsaPredFn #$ProjectManager)\n \t\t    (#$IsaPredFn #$OntologicalEngineer)\n \t\t    (#$IsaPredFn #$ComputerProgrammer) #$fieldsOfCompetence))\n        (#$thereExists ?CONSTRAINT\n \t (#$thereExists ?M\n          (#$argIsa ?PRED ?M ?CONSTRAINT)))))))") });

    public static final SubLObject inference_enumerable_universal_implication_sentenceP_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject universal_el_vars = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.destructure_universal_implication(sentence);
                SubLObject antecedent = thread.secondMultipleValue();
                SubLObject consequent = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != antecedent) && (NIL != consequent)) {
                    {
                        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
                        antecedent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.possibly_canonicalize_sentence_wrt_universal_el_vars(antecedent, universal_el_vars);
                        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.inference_at_least_backchain_enumerable_sentenceP(antecedent, mt);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject inference_enumerable_universal_implication_sentenceP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject universal_el_vars = destructure_universal_implication(sentence);
        SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != antecedent) && (NIL != consequent)) {
            final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
            antecedent = possibly_canonicalize_sentence_wrt_universal_el_vars(antecedent, universal_el_vars);
            return inference_at_least_backchain_enumerable_sentenceP(antecedent, mt);
        }
        return NIL;
    }

    public static final SubLObject destructure_universal_implication_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject universal_el_vars = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.destructure_universal_implication_recursive(sentence, NIL);
                SubLObject antecedent = thread.secondMultipleValue();
                SubLObject consequent = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(nreverse(universal_el_vars), antecedent, consequent);
            }
        }
    }

    public static SubLObject destructure_universal_implication(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject universal_el_vars = destructure_universal_implication_recursive(sentence, NIL);
        final SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(nreverse(universal_el_vars), antecedent, consequent);
    }

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("trueSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("trueSentence"), list(makeKeyword("AND"), list(reader_make_constant_shell("forAll"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell("implies")), list($TEST, makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$ist #$UniversalVocabularyMt\n     (#$trueSentence\n      (#$forAll ?N\n       (#$implies\n        (#$elementOf ?N (#$TheSet 0 1))\n        (#$evaluate ?N (#$TimesFn ?N ?N))))))") });

    public static final SubLObject destructure_universal_implication_recursive_alt(SubLObject sentence, SubLObject universal_el_vars) {
        if (NIL != el_implication_p(sentence)) {
            {
                SubLObject antecedent = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                SubLObject consequent = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
                return values(universal_el_vars, antecedent, consequent);
            }
        } else {
            if (NIL != el_universal_p(sentence)) {
                {
                    SubLObject universal_el_var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                    SubLObject subsentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.destructure_universal_implication_recursive(subsentence, cons(universal_el_var, universal_el_vars));
                }
            } else {
                return values(NIL, NIL, NIL);
            }
        }
    }

    public static SubLObject destructure_universal_implication_recursive(final SubLObject sentence, final SubLObject universal_el_vars) {
        if (NIL != el_implication_p(sentence)) {
            final SubLObject antecedent = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            final SubLObject consequent = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            return values(universal_el_vars, antecedent, consequent);
        }
        if (NIL != el_universal_p(sentence)) {
            final SubLObject universal_el_var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            final SubLObject subsentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            return destructure_universal_implication_recursive(subsentence, cons(universal_el_var, universal_el_vars));
        }
        return values(NIL, NIL, NIL);
    }

    static private final SubLSymbol $sym59$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_ = makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?");

    public static final SubLObject removal_true_sentence_enumerable_universal_implication_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
                SubLObject universal_implication = cycl_utilities.formula_arg1(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject universal_el_vars = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.destructure_universal_implication(universal_implication);
                    SubLObject antecedent = thread.secondMultipleValue();
                    SubLObject consequent = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject antecedent_query_properties = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.determine_enumeration_query_properties(antecedent, mt);
                        SubLObject consequent_query_properties = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.determine_decision_query_properties(consequent, mt);
                        SubLObject enumeration_cases = ask_utilities.inference_recursive_query_unique_bindings(antecedent, mt, antecedent_query_properties);
                        SubLObject cdolist_list_var = enumeration_cases;
                        SubLObject case_bindings = NIL;
                        for (case_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , case_bindings = cdolist_list_var.first()) {
                            {
                                SubLObject case_consequent = apply_bindings(case_bindings, consequent);
                                if (NIL == ask_utilities.inference_recursive_query_unique_bindings(case_consequent, mt, consequent_query_properties)) {
                                    return NIL;
                                }
                            }
                        }
                        {
                            SubLObject support = arguments.make_hl_support($OPAQUE, asent, mt, $TRUE_DEF);
                            backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_true_sentence_enumerable_universal_implication_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject universal_implication = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject universal_el_vars = destructure_universal_implication(universal_implication);
        final SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject antecedent_query_properties = determine_enumeration_query_properties(antecedent, mt);
        final SubLObject consequent_query_properties = determine_decision_query_properties(consequent, mt);
        SubLObject cdolist_list_var;
        final SubLObject enumeration_cases = cdolist_list_var = ask_utilities.inference_recursive_query_unique_bindings(antecedent, mt, antecedent_query_properties);
        SubLObject case_bindings = NIL;
        case_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject case_consequent = bindings.apply_bindings(case_bindings, consequent);
            if (NIL == ask_utilities.inference_recursive_query_unique_bindings(case_consequent, mt, consequent_query_properties)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            case_bindings = cdolist_list_var.first();
        } 
        final SubLObject support = arguments.make_hl_support($OPAQUE, asent, mt, $TRUE_DEF);
        backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLSymbol $kw62$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    public static final SubLObject determine_enumeration_query_properties_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
            query_properties = putf(query_properties, $kw62$ALLOW_INDETERMINATE_RESULTS_, NIL);
            return query_properties;
        }
    }

    public static SubLObject determine_enumeration_query_properties(final SubLObject sentence, final SubLObject mt) {
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        query_properties = putf(query_properties, $kw88$ALLOW_INDETERMINATE_RESULTS_, NIL);
        return query_properties;
    }

    public static final SubLObject determine_decision_query_properties_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.determine_enumeration_query_properties(sentence, mt);
    }

    public static SubLObject determine_decision_query_properties(final SubLObject sentence, final SubLObject mt) {
        return determine_enumeration_query_properties(sentence, mt);
    }

    public static final SubLObject inference_at_least_backchain_enumerable_sentenceP_alt(SubLObject sentence, SubLObject mt) {
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.inference_at_least_backchain_enumerable_asentP(sentence, mt);
        }
        if ((NIL != el_conjunction_p(sentence)) && (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.inference_at_least_backchain_enumerable_conjunctionP(sentence, mt))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject inference_at_least_backchain_enumerable_sentenceP(final SubLObject sentence, final SubLObject mt) {
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return inference_at_least_backchain_enumerable_asentP(sentence, mt);
        }
        if ((NIL != el_conjunction_p(sentence)) && (NIL != inference_at_least_backchain_enumerable_conjunctionP(sentence, mt))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject inference_at_least_backchain_enumerable_asentP_alt(SubLObject asent, SubLObject mt) {
        return makeBoolean(($COMPLETE == inference_utilities.literal_removal_completeness(asent, $POS, mt)) || (NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(asent, mt)));
    }

    public static SubLObject inference_at_least_backchain_enumerable_asentP(final SubLObject asent, final SubLObject mt) {
        return makeBoolean(($COMPLETE == inference_utilities.literal_removal_completeness(asent, $POS, mt)) || (NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(asent, mt)));
    }

    public static final SubLObject inference_at_least_backchain_enumerable_conjunctionP_alt(SubLObject el_conjunction, SubLObject mt) {
        {
            SubLObject conjuncts = cycl_utilities.sentence_args(el_conjunction, UNPROVIDED);
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = NIL;
            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.inference_at_least_backchain_enumerable_sentenceP(conjunct, mt)) {
                    {
                        SubLObject other_conjuncts = remove(conjunct, conjuncts, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject bound_variables = variables.gather_hl_variables(conjunct);
                        SubLObject non_complete_witness = NIL;
                        if (NIL == non_complete_witness) {
                            {
                                SubLObject csome_list_var = other_conjuncts;
                                SubLObject other_conjunct = NIL;
                                for (other_conjunct = csome_list_var.first(); !((NIL != non_complete_witness) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , other_conjunct = csome_list_var.first()) {
                                    if (!((NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.inference_at_least_backchain_enumerable_sentenceP(other_conjunct, mt)) || (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.fully_bound_assuming_bindings_p(other_conjunct, bound_variables)))) {
                                        non_complete_witness = other_conjunct;
                                    }
                                }
                            }
                        }
                        if (NIL == non_complete_witness) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_at_least_backchain_enumerable_conjunctionP(final SubLObject el_conjunction, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject conjuncts = cdolist_list_var = cycl_utilities.sentence_args(el_conjunction, UNPROVIDED);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_at_least_backchain_enumerable_sentenceP(conjunct, mt)) {
                final SubLObject other_conjuncts = remove(conjunct, conjuncts, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject bound_variables = variables.gather_hl_variables(conjunct);
                SubLObject non_complete_witness = NIL;
                if (NIL == non_complete_witness) {
                    SubLObject csome_list_var = other_conjuncts;
                    SubLObject other_conjunct = NIL;
                    other_conjunct = csome_list_var.first();
                    while ((NIL == non_complete_witness) && (NIL != csome_list_var)) {
                        if ((NIL == inference_at_least_backchain_enumerable_sentenceP(other_conjunct, mt)) && (NIL == fully_bound_assuming_bindings_p(other_conjunct, bound_variables))) {
                            non_complete_witness = other_conjunct;
                        }
                        csome_list_var = csome_list_var.rest();
                        other_conjunct = csome_list_var.first();
                    } 
                }
                if (NIL == non_complete_witness) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject possibly_canonicalize_sentence_wrt_universal_el_vars_alt(SubLObject sentence, SubLObject universal_el_vars) {
        {
            SubLObject variable_map = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence.new_el_variable_to_non_base_hl_variable_map(universal_el_vars);
            if (NIL != variable_map) {
                sentence = apply_bindings(variable_map, sentence);
            }
        }
        return sentence;
    }

    public static SubLObject possibly_canonicalize_sentence_wrt_universal_el_vars(SubLObject sentence, final SubLObject universal_el_vars) {
        final SubLObject variable_map = new_el_variable_to_non_base_hl_variable_map(universal_el_vars);
        if (NIL != variable_map) {
            sentence = bindings.apply_bindings(variable_map, sentence);
        }
        return sentence;
    }

    public static final SubLObject new_el_variable_to_non_base_hl_variable_map_alt(SubLObject el_vars) {
        {
            SubLObject v_bindings = NIL;
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject index = NIL;
            for (list_var = el_vars, el_var = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , index = add(ONE_INTEGER, index)) {
                {
                    SubLObject hl_var = variables.get_variable(index);
                    v_bindings = add_variable_binding(el_var, hl_var, v_bindings);
                }
            }
            return unification.non_base_variable_transform(nreverse(v_bindings));
        }
    }

    public static SubLObject new_el_variable_to_non_base_hl_variable_map(final SubLObject el_vars) {
        SubLObject v_bindings = NIL;
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject index = NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject hl_var = variables.get_variable(index);
            v_bindings = bindings.add_variable_binding(el_var, hl_var, v_bindings);
        }
        return unification.non_base_variable_transform(nreverse(v_bindings));
    }

    public static final SubLObject fully_bound_assuming_bindings_p_alt(SubLObject formula, SubLObject bound_vars) {
        {
            SubLObject formula_vars = variables.gather_hl_variables(formula);
            return subsetp(formula_vars, bound_vars, symbol_function(EQ), UNPROVIDED);
        }
    }

    public static SubLObject fully_bound_assuming_bindings_p(final SubLObject formula, final SubLObject bound_vars) {
        final SubLObject formula_vars = variables.gather_hl_variables(formula);
        return subsetp(formula_vars, bound_vars, symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject removal_sentence_justifications_simple_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_sentence_justifications_recursive_query(query_sentence, UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject justification_sentences = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$6 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$6);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject original_supports;
                SubLObject supports;
                SubLObject support;
                SubLObject support_sentence;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    this_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(this_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(this_answer)) {
                            this_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = NIL;
                        this_justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            original_supports = inference_datastructures_inference.inference_answer_justification_supports(this_justification);
                            supports = copy_list(original_supports);
                            while (NIL != supports) {
                                support = supports.first();
                                supports = supports.rest();
                                support_sentence = (NIL != assertion_handles.assertion_p(support)) ? uncanonicalizer.assertion_el_formula(support) : arguments.support_sentence(support);
                                if ((NIL == assertion_handles.assertion_p(support)) && (NIL != czer_utilities.equals_elP(query_sentence, support_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    supports = append(arguments.support_justification(support), supports);
                                } else {
                                    justification_sentences = cons(support_sentence, justification_sentences);
                                }
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$7 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$7)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$7);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        this_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject original_supports2 = inference_datastructures_inference.inference_answer_justification_supports(this_justification2);
                            SubLObject supports2 = copy_list(original_supports2);
                            while (NIL != supports2) {
                                final SubLObject support2 = supports2.first();
                                supports2 = supports2.rest();
                                final SubLObject support_sentence2 = (NIL != assertion_handles.assertion_p(support2)) ? uncanonicalizer.assertion_el_formula(support2) : arguments.support_sentence(support2);
                                if ((NIL == assertion_handles.assertion_p(support2)) && (NIL != czer_utilities.equals_elP(query_sentence, support_sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    supports2 = append(arguments.support_justification(support2), supports2);
                                } else {
                                    justification_sentences = cons(support_sentence2, justification_sentences);
                                }
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL != justification_sentences) {
            final SubLObject answer_sentence = list($$sentenceJustifications_Simple, query_sentence, make_el_extensional_set(justification_sentences));
            final SubLObject v_bindings = unification.unify(asent, answer_sentence, T, UNPROVIDED);
            final SubLObject hl_support = arguments.make_hl_support($OPAQUE, answer_sentence, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_sentence_justifications_recursive_query_internal(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = inference_macros.current_controlling_inference();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        query_properties = putf(query_properties, $RESULT_UNIQUENESS, $PROOF);
        query_properties = putf(query_properties, $CONTINUABLE_, T);
        query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = putf(query_properties, $kw98$COMPUTE_ANSWER_JUSTIFICATIONS_, T);
        if (NIL != inference) {
            query_properties = putf(query_properties, $MAX_TIME, inference_utilities.inference_property_lookup(inference, $MAX_TIME, UNPROVIDED));
            query_properties = putf(query_properties, $MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, $MAX_TRANSFORMATION_DEPTH, UNPROVIDED));
            query_properties = putf(query_properties, $ALLOWED_RULES, inference_datastructures_inference.inference_allowed_rules_list(inference));
            query_properties = putf(query_properties, $ALLOWED_MODULES, inference_datastructures_inference.inference_allowed_modules(inference));
        } else {
            query_properties = inference_datastructures_enumerated_types.merge_query_properties(inference_utilities.current_query_properties(), query_properties);
        }
        SubLObject continue_count = ONE_INTEGER;
        thread.resetMultipleValues();
        SubLObject results = ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject recursive_inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        while ((continue_count.numL($removal_sentence_justifications_max_justifications_count$.getDynamicValue(thread)) && (NIL == removal_sentence_justifications_inference_has_good_proofP(recursive_inference))) && (NIL != inference_datastructures_inference.continuable_inference_p(recursive_inference))) {
            continue_count = add(continue_count, ONE_INTEGER);
            thread.resetMultipleValues();
            final SubLObject results_$8 = inference_kernel.continue_inference(recursive_inference, query_properties);
            final SubLObject halt_reason_$9 = thread.secondMultipleValue();
            final SubLObject inference_$10 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            results = results_$8;
            halt_reason = halt_reason_$9;
            inference = inference_$10;
        } 
        return values(results, halt_reason, recursive_inference);
    }

    public static SubLObject removal_sentence_justifications_recursive_query(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_sentence_justifications_recursive_query_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(removal_sentence_justifications_recursive_query_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject removal_sentence_justifications_inference_has_good_proofP(final SubLObject inference) {
        SubLObject good_proof_foundP = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$11 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$11, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$11);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject cdolist_list_var_$12;
                SubLObject this_proof;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    this_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(this_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(this_answer)) {
                            this_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = NIL;
                        this_justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$12 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
                            this_proof = NIL;
                            this_proof = cdolist_list_var_$12.first();
                            while (NIL != cdolist_list_var_$12) {
                                if (NIL == good_proof_foundP) {
                                    good_proof_foundP = list_utilities.sublisp_boolean(removal_sentence_justifications_get_proof_summary_items(this_proof, this_answer));
                                }
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                this_proof = cdolist_list_var_$12.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$12 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$12)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$12);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        this_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$13 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
                            SubLObject this_proof2 = NIL;
                            this_proof2 = cdolist_list_var_$13.first();
                            while (NIL != cdolist_list_var_$13) {
                                if (NIL == good_proof_foundP) {
                                    good_proof_foundP = list_utilities.sublisp_boolean(removal_sentence_justifications_get_proof_summary_items(this_proof2, this_answer2));
                                }
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                this_proof2 = cdolist_list_var_$13.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return good_proof_foundP;
    }

    public static SubLObject removal_sentence_justifications_get_proof_summary_items_internal(final SubLObject proof, final SubLObject v_answer) {
        return proof_view_summary.proof_view_get_proof_summary_items(proof_view.construct_inference_proof_view(proof, v_answer, UNPROVIDED));
    }

    public static SubLObject removal_sentence_justifications_get_proof_summary_items(final SubLObject proof, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_sentence_justifications_get_proof_summary_items_internal(proof, v_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, TWO_INTEGER, $int$1024, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, v_answer);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (proof.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_answer.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(removal_sentence_justifications_get_proof_summary_items_internal(proof, v_answer)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, v_answer));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject removal_sentence_justifications_proof_view_summary_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_sentence_justifications_recursive_query(query_sentence, UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject justification_sentences = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$15 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$15, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$15);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject cdolist_list_var_$16;
                SubLObject this_proof;
                SubLObject raw_items;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    this_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(this_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(this_answer)) {
                            this_answer = $SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = NIL;
                        this_justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$16 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
                            this_proof = NIL;
                            this_proof = cdolist_list_var_$16.first();
                            while (NIL != cdolist_list_var_$16) {
                                if (NIL == justification_sentences) {
                                    raw_items = removal_sentence_justifications_get_proof_summary_items(this_proof, this_answer);
                                    justification_sentences = Mapping.mapcar(PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, raw_items);
                                }
                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                this_proof = cdolist_list_var_$16.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$16 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$16)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$16);
                SubLObject id2 = NIL;
                SubLObject this_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        this_answer2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$17 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
                            SubLObject this_proof2 = NIL;
                            this_proof2 = cdolist_list_var_$17.first();
                            while (NIL != cdolist_list_var_$17) {
                                if (NIL == justification_sentences) {
                                    final SubLObject raw_items2 = removal_sentence_justifications_get_proof_summary_items(this_proof2, this_answer2);
                                    justification_sentences = Mapping.mapcar(PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, raw_items2);
                                }
                                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                this_proof2 = cdolist_list_var_$17.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL != justification_sentences) {
            final SubLObject answer_sentence = list($const105$sentenceJustifications_ProofViewS, query_sentence, make_el_list(justification_sentences, UNPROVIDED));
            final SubLObject v_bindings = unification.unify(asent, answer_sentence, T, UNPROVIDED);
            final SubLObject hl_support = arguments.make_hl_support($OPAQUE, answer_sentence, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_tautology_justification_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject unquoted_query_sentence = czer_main.unquote_quoted_term(query_sentence, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject justification_sentence = removal_tautology_justification_recursive_query(unquoted_query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
        thread.resetMultipleValues();
        if (NIL != justification_sentence) {
            final SubLObject answer_sentence = list($$tautologyJustification, query_sentence, justification_sentence);
            final SubLObject v_bindings = unification.unify(asent, answer_sentence, T, UNPROVIDED);
            final SubLObject hl_support = arguments.make_hl_support($QUERY, answer_sentence, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_tautology_justification_recursive_query(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        SubLObject result = NIL;
        query_properties = putf(query_properties, $kw112$CONDITIONAL_SENTENCE_, T);
        query_properties = putf(query_properties, $BROWSABLE_, T);
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject recursive_inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ($TAUTOLOGY == halt_reason) {
            final SubLObject inference_suspend_status = inference_datastructures_inference.inference_suspend_status(recursive_inference);
            result = quotify_cycl_term(variables.uncanonicalize_hl_vars(second(second(inference_suspend_status).first())));
        }
        if (NIL != inference_datastructures_inference.inference_p(recursive_inference)) {
            inference_datastructures_inference.destroy_inference(recursive_inference);
        }
        return result;
    }

    public static SubLObject removal_knownsentencewithproofview_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject query_pv_specification = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject query_pv = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject v_properties = list($BROWSABLE_, T);
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.inference_recursive_query_unique_bindings(query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), v_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$19 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$19);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject v_bindings;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$20;
                SubLObject proof;
                SubLObject raw_pv;
                SubLObject pv_bindings;
                SubLObject all_bindings;
                SubLObject answer_sentence;
                SubLObject hl_support;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        v_bindings = variables.canonicalize_default_el_vars(inference_datastructures_inference.inference_answer_bindings(v_answer));
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cdolist_list_var_$20 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                            proof = NIL;
                            proof = cdolist_list_var_$20.first();
                            while (NIL != cdolist_list_var_$20) {
                                raw_pv = removal_knownsentencewithproofview_get_cyc_proof_view(proof, v_answer, query_pv_specification);
                                pv_bindings = unification_utilities.term_unify(query_pv, raw_pv, UNPROVIDED, UNPROVIDED);
                                all_bindings = append(v_bindings, pv_bindings);
                                answer_sentence = bindings.apply_bindings(all_bindings, asent);
                                hl_support = arguments.make_hl_support($OPAQUE, answer_sentence, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support, all_bindings, UNPROVIDED);
                                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                proof = cdolist_list_var_$20.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$20 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$20)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$20);
                SubLObject id2 = NIL;
                SubLObject v_answer2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_answer2 = getEntryValue(cdohash_entry);
                        final SubLObject v_bindings2 = variables.canonicalize_default_el_vars(inference_datastructures_inference.inference_answer_bindings(v_answer2));
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = NIL;
                        justification2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$21 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                            SubLObject proof2 = NIL;
                            proof2 = cdolist_list_var_$21.first();
                            while (NIL != cdolist_list_var_$21) {
                                final SubLObject raw_pv2 = removal_knownsentencewithproofview_get_cyc_proof_view(proof2, v_answer2, query_pv_specification);
                                final SubLObject pv_bindings2 = unification_utilities.term_unify(query_pv, raw_pv2, UNPROVIDED, UNPROVIDED);
                                final SubLObject all_bindings2 = append(v_bindings2, pv_bindings2);
                                final SubLObject answer_sentence2 = bindings.apply_bindings(all_bindings2, asent);
                                final SubLObject hl_support2 = arguments.make_hl_support($OPAQUE, answer_sentence2, UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(hl_support2, all_bindings2, UNPROVIDED);
                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                proof2 = cdolist_list_var_$21.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_knownsentencewithproofview_get_cyc_proof_view_internal(final SubLObject proof, final SubLObject v_answer, final SubLObject pv_specification) {
        final SubLObject v_proof_view = proof_view.get_new_empty_proof_view(v_answer, proof);
        proof_view.proof_view_set_parameters_from_specification(v_proof_view, pv_specification);
        proof_view_populator.proof_view_populate(v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return make_unary_formula($$CycProofViewFn, proof_view.proof_view_get_id(v_proof_view));
    }

    public static SubLObject removal_knownsentencewithproofview_get_cyc_proof_view(final SubLObject proof, final SubLObject v_answer, final SubLObject pv_specification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_knownsentencewithproofview_get_cyc_proof_view_internal(proof, v_answer, pv_specification);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, THREE_INTEGER, $int$1024, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(proof, v_answer, pv_specification);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_answer.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && pv_specification.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(removal_knownsentencewithproofview_get_cyc_proof_view_internal(proof, v_answer, pv_specification)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, v_answer, pv_specification));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_removal_modules_true_sentence_file() {
        declareFunction("removal_complete_asentP", "REMOVAL-COMPLETE-ASENT?", 1, 0, false);
        declareFunction("make_truth_sentence_support", "MAKE-TRUTH-SENTENCE-SUPPORT", 2, 0, false);
        declareFunction("make_truth_sentence_supports", "MAKE-TRUTH-SENTENCE-SUPPORTS", 1, 0, false);
        declareFunction("known_sentence_literal_removal_cost", "KNOWN-SENTENCE-LITERAL-REMOVAL-COST", 3, 0, false);
        declareFunction("known_sentence_pos_gaf_preference", "KNOWN-SENTENCE-POS-GAF-PREFERENCE", 3, 0, false);
        declareFunction("make_known_sentence_support", "MAKE-KNOWN-SENTENCE-SUPPORT", 1, 0, false);
        declareFunction("removal_known_sentence_check_expand", "REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_known_sentence_check_query", "REMOVAL-KNOWN-SENTENCE-CHECK-QUERY", 1, 1, false);
        declareFunction("removal_known_sentence_pos_gaf_cost", "REMOVAL-KNOWN-SENTENCE-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_known_sentence_pos_gaf_iterator", "REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR", 1, 0, false);
        declareFunction("removal_known_sentence_completeness", "REMOVAL-KNOWN-SENTENCE-COMPLETENESS", 2, 0, false);
        declareFunction("removal_known_sentence_pos_gaf_query", "REMOVAL-KNOWN-SENTENCE-POS-GAF-QUERY", 1, 1, false);
        declareFunction("removal_known_sentence_neg_gaf_cost", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction("removal_known_sentence_neg_gaf_expand", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction("removal_known_sentence_neg_gaf_query", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-QUERY", 1, 1, false);
        declareFunction("check_sentence_sibling_required", "CHECK-SENTENCE-SIBLING-REQUIRED", 1, 0, false);
        declareFunction("removal_check_sentence_check_query", "REMOVAL-CHECK-SENTENCE-CHECK-QUERY", 1, 1, false);
        declareFunction("make_unknown_sentence_support", "MAKE-UNKNOWN-SENTENCE-SUPPORT", 1, 0, false);
        declareFunction("removal_unknown_sentence_check_expand", "REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_unknown_sentence_pos_gaf_cost", "REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_unknown_sentence_pos_gaf_expand", "REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND", 1, 1, false);
        declareFunction("removal_unknown_sentence_neg_gaf_cost", "REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction("removal_unknown_sentence_neg_gaf_expand", "REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction("make_unknown_sentence_wrt_inference_mode_support", "MAKE-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-SUPPORT", 1, 0, false);
        declareFunction("removal_unknown_sentence_wrt_inference_mode_check_cost", "REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-COST", 1, 1, false);
        declareFunction("removal_unknown_sentence_wrt_inference_mode_check_expand", "REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_mode_term_p", "INFERENCE-MODE-TERM-P", 1, 0, false);
        declareFunction("true_sentence_pos_gaf_preference", "TRUE-SENTENCE-POS-GAF-PREFERENCE", 3, 0, false);
        declareFunction("make_true_sentence_support", "MAKE-TRUE-SENTENCE-SUPPORT", 1, 0, false);
        declareFunction("removal_true_sentence_check_expand", "REMOVAL-TRUE-SENTENCE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_true_sentence_check_query", "REMOVAL-TRUE-SENTENCE-CHECK-QUERY", 1, 1, false);
        declareFunction("removal_true_sentence_pos_gaf_cost", "REMOVAL-TRUE-SENTENCE-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_true_sentence_pos_gaf_iterator", "REMOVAL-TRUE-SENTENCE-POS-GAF-ITERATOR", 1, 0, false);
        declareFunction("removal_true_sentence_neg_gaf_cost", "REMOVAL-TRUE-SENTENCE-NEG-GAF-COST", 1, 1, false);
        declareFunction("removal_true_sentence_neg_gaf_expand", "REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        declareFunction("removal_true_sentence_universal_disjunction_required", "REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED", 1, 1, false);
        declareFunction("removal_true_sentence_universal_disjunction_expand", "REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND", 1, 1, false);
        declareFunction("removal_true_sentence_member_of_list_implication_required", "REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED", 1, 1, false);
        declareFunction("removal_true_sentence_member_of_list_implication_expand", "REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND", 1, 1, false);
        declareFunction("inference_enumerable_universal_implication_sentenceP", "INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?", 1, 0, false);
        declareFunction("destructure_universal_implication", "DESTRUCTURE-UNIVERSAL-IMPLICATION", 1, 0, false);
        declareFunction("destructure_universal_implication_recursive", "DESTRUCTURE-UNIVERSAL-IMPLICATION-RECURSIVE", 2, 0, false);
        declareFunction("removal_true_sentence_enumerable_universal_implication_expand", "REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND", 1, 1, false);
        declareFunction("determine_enumeration_query_properties", "DETERMINE-ENUMERATION-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("determine_decision_query_properties", "DETERMINE-DECISION-QUERY-PROPERTIES", 2, 0, false);
        declareFunction("inference_at_least_backchain_enumerable_sentenceP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-SENTENCE?", 2, 0, false);
        declareFunction("inference_at_least_backchain_enumerable_asentP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-ASENT?", 2, 0, false);
        declareFunction("inference_at_least_backchain_enumerable_conjunctionP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-CONJUNCTION?", 2, 0, false);
        declareFunction("possibly_canonicalize_sentence_wrt_universal_el_vars", "POSSIBLY-CANONICALIZE-SENTENCE-WRT-UNIVERSAL-EL-VARS", 2, 0, false);
        declareFunction("new_el_variable_to_non_base_hl_variable_map", "NEW-EL-VARIABLE-TO-NON-BASE-HL-VARIABLE-MAP", 1, 0, false);
        declareFunction("fully_bound_assuming_bindings_p", "FULLY-BOUND-ASSUMING-BINDINGS-P", 2, 0, false);
        declareFunction("removal_sentence_justifications_simple_expand", "REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE-EXPAND", 1, 1, false);
        declareFunction("removal_sentence_justifications_recursive_query_internal", "REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY-INTERNAL", 1, 1, false);
        declareFunction("removal_sentence_justifications_recursive_query", "REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY", 1, 1, false);
        declareFunction("removal_sentence_justifications_inference_has_good_proofP", "REMOVAL-SENTENCE-JUSTIFICATIONS-INFERENCE-HAS-GOOD-PROOF?", 1, 0, false);
        declareFunction("removal_sentence_justifications_get_proof_summary_items_internal", "REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS-INTERNAL", 2, 0, false);
        declareFunction("removal_sentence_justifications_get_proof_summary_items", "REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS", 2, 0, false);
        declareFunction("removal_sentence_justifications_proof_view_summary_expand", "REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY-EXPAND", 1, 1, false);
        declareFunction("removal_tautology_justification_expand", "REMOVAL-TAUTOLOGY-JUSTIFICATION-EXPAND", 1, 1, false);
        declareFunction("removal_tautology_justification_recursive_query", "REMOVAL-TAUTOLOGY-JUSTIFICATION-RECURSIVE-QUERY", 2, 0, false);
        declareFunction("removal_knownsentencewithproofview_expand", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-EXPAND", 1, 1, false);
        declareFunction("removal_knownsentencewithproofview_get_cyc_proof_view_internal", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW-INTERNAL", 3, 0, false);
        declareFunction("removal_knownsentencewithproofview_get_cyc_proof_view", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_true_sentence_file() {
        defparameter("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        defparameter("*KNOWN-SENTENCE-LOOKAHEAD-COST*", $float$0_1);
        defparameter("*DEFAULT-CHECK-SENTENCE-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*", $default_known_sentence_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-TRUE-SENTENCE-CHECK-COST*", $default_known_sentence_check_cost$.getDynamicValue());
        defparameter("*REMOVAL-SENTENCE-JUSTIFICATIONS-MAX-JUSTIFICATIONS-COUNT*", TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_true_sentence_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$knownSentence);
        preference_modules.inference_preference_module($KNOWN_SENTENCE_POS_GAF, $list_alt5);
        note_funcall_helper_function(KNOWN_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_CHECK, $list_alt12);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_POS_GAF, $list_alt15);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_NEG_GAF, $list_alt21);
        inference_modules.register_solely_specific_removal_module_predicate($$unknownSentence);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK, $list_alt24);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_POS_GAF, $list_alt26);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_NEG_GAF, $list_alt28);
        inference_modules.register_solely_specific_removal_module_predicate($$trueSentence);
        preference_modules.inference_preference_module($TRUE_SENTENCE_POS_GAF, $list_alt31);
        note_funcall_helper_function(TRUE_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_CHECK, $list_alt34);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_POS_GAF, $list_alt36);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_GAF, $list_alt38);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_FALSE, $list_alt40);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION, $list_alt42);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION, $list_alt53);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION, $list_alt58);
        note_funcall_helper_function($sym59$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND);
        return NIL;
    }

    public static SubLObject setup_removal_modules_true_sentence_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$knownSentence);
            preference_modules.inference_preference_module($KNOWN_SENTENCE_POS_GAF, $list5);
            note_funcall_helper_function(KNOWN_SENTENCE_POS_GAF_PREFERENCE);
            inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_CHECK, $list12);
            inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_POS_GAF, $list15);
            inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_NEG_GAF, $list21);
            inference_modules.register_solely_specific_removal_module_predicate($$checkSentence);
            preference_modules.doomed_unless_all_args_bindable($POS, $$checkSentence);
            preference_modules.inference_preference_module($CHECK_SENTENCE_SIBLING, $list25);
            note_funcall_helper_function(CHECK_SENTENCE_SIBLING_REQUIRED);
            inference_modules.inference_removal_module($REMOVAL_CHECK_SENTENCE_CHECK, $list29);
            note_funcall_helper_function(REMOVAL_CHECK_SENTENCE_CHECK_QUERY);
            inference_modules.register_solely_specific_removal_module_predicate($$unknownSentence);
            preference_modules.doomed_unless_all_args_bindable($POS, $$unknownSentence);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK, $list34);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG, $list36);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_POS_GAF, $list38);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_NEG_GAF, $list40);
            inference_modules.register_solely_specific_removal_module_predicate($$unknownSentenceWRTInferenceMode);
            preference_modules.doomed_unless_all_args_bindable($POS, $$unknownSentenceWRTInferenceMode);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK, $list53);
            inference_modules.register_solely_specific_removal_module_predicate($$trueSentence);
            preference_modules.inference_preference_module($TRUE_SENTENCE_POS_GAF, $list57);
            note_funcall_helper_function(TRUE_SENTENCE_POS_GAF_PREFERENCE);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_CHECK, $list60);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_POS_GAF, $list62);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_GAF, $list64);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_FALSE, $list66);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION, $list68);
            note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED);
            note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION, $list79);
            note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED);
            note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION, $list84);
            note_funcall_helper_function($sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_);
            note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND);
            inference_modules.register_solely_specific_removal_module_predicate($$sentenceJustifications_Simple);
            preference_modules.doomed_unless_arg_bindable($POS, $$sentenceJustifications_Simple, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE, $list91);
            memoization_state.note_memoized_function(REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY);
            memoization_state.note_memoized_function(REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS);
            inference_modules.register_solely_specific_removal_module_predicate($const105$sentenceJustifications_ProofViewS);
            preference_modules.doomed_unless_arg_bindable($POS, $const105$sentenceJustifications_ProofViewS, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY, $list107);
            inference_modules.register_solely_specific_removal_module_predicate($$tautologyJustification);
            preference_modules.doomed_unless_arg_bindable($POS, $$tautologyJustification, ONE_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_TAUTOLOGY_JUSTIFICATION, $list111);
            inference_modules.register_solely_specific_removal_module_predicate($$knownSentenceWithProofView);
            preference_modules.doomed_unless_arg_bindable($POS, $$knownSentenceWithProofView, TWO_INTEGER);
            inference_modules.inference_removal_module($REMOVAL_KNOWNSENTENCEWITHPROOFVIEW, $list117);
            memoization_state.note_memoized_function(REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK, $list_alt24);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_POS_GAF, $list_alt26);
            inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_NEG_GAF, $list_alt28);
            preference_modules.inference_preference_module($TRUE_SENTENCE_POS_GAF, $list_alt31);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_CHECK, $list_alt34);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_POS_GAF, $list_alt36);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_GAF, $list_alt38);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_FALSE, $list_alt40);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION, $list_alt42);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION, $list_alt53);
            inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION, $list_alt58);
            note_funcall_helper_function($sym59$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_true_sentence_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$knownSentence);
        preference_modules.inference_preference_module($KNOWN_SENTENCE_POS_GAF, $list5);
        note_funcall_helper_function(KNOWN_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_CHECK, $list12);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_POS_GAF, $list15);
        inference_modules.inference_removal_module($REMOVAL_KNOWN_SENTENCE_NEG_GAF, $list21);
        inference_modules.register_solely_specific_removal_module_predicate($$checkSentence);
        preference_modules.doomed_unless_all_args_bindable($POS, $$checkSentence);
        preference_modules.inference_preference_module($CHECK_SENTENCE_SIBLING, $list25);
        note_funcall_helper_function(CHECK_SENTENCE_SIBLING_REQUIRED);
        inference_modules.inference_removal_module($REMOVAL_CHECK_SENTENCE_CHECK, $list29);
        note_funcall_helper_function(REMOVAL_CHECK_SENTENCE_CHECK_QUERY);
        inference_modules.register_solely_specific_removal_module_predicate($$unknownSentence);
        preference_modules.doomed_unless_all_args_bindable($POS, $$unknownSentence);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK, $list34);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG, $list36);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_POS_GAF, $list38);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_NEG_GAF, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$unknownSentenceWRTInferenceMode);
        preference_modules.doomed_unless_all_args_bindable($POS, $$unknownSentenceWRTInferenceMode);
        inference_modules.inference_removal_module($REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK, $list53);
        inference_modules.register_solely_specific_removal_module_predicate($$trueSentence);
        preference_modules.inference_preference_module($TRUE_SENTENCE_POS_GAF, $list57);
        note_funcall_helper_function(TRUE_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_CHECK, $list60);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_POS_GAF, $list62);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_GAF, $list64);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_NEG_FALSE, $list66);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION, $list68);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION, $list79);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION, $list84);
        note_funcall_helper_function($sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_);
        note_funcall_helper_function(REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND);
        inference_modules.register_solely_specific_removal_module_predicate($$sentenceJustifications_Simple);
        preference_modules.doomed_unless_arg_bindable($POS, $$sentenceJustifications_Simple, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE, $list91);
        memoization_state.note_memoized_function(REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY);
        memoization_state.note_memoized_function(REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS);
        inference_modules.register_solely_specific_removal_module_predicate($const105$sentenceJustifications_ProofViewS);
        preference_modules.doomed_unless_arg_bindable($POS, $const105$sentenceJustifications_ProofViewS, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY, $list107);
        inference_modules.register_solely_specific_removal_module_predicate($$tautologyJustification);
        preference_modules.doomed_unless_arg_bindable($POS, $$tautologyJustification, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TAUTOLOGY_JUSTIFICATION, $list111);
        inference_modules.register_solely_specific_removal_module_predicate($$knownSentenceWithProofView);
        preference_modules.doomed_unless_arg_bindable($POS, $$knownSentenceWithProofView, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_KNOWNSENTENCEWITHPROOFVIEW, $list117);
        memoization_state.note_memoized_function(REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_true_sentence_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_true_sentence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_true_sentence_file();
    }

    static {
    }
}

/**
 * Total time: 563 ms
 */
