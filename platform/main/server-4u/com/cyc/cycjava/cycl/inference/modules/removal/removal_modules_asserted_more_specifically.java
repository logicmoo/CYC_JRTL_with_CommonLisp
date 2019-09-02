/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-ASSERTED-MORE-SPECIFICALLY
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-asserted-more-specifically.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_asserted_more_specifically extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_asserted_more_specifically();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_asserted_more_specifically_via_tva_supportP$ = makeSymbol("*USE-ASSERTED-MORE-SPECIFICALLY-VIA-TVA-SUPPORT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $assertion_under_consideration_for_asserted_more_specifically$ = makeSymbol("*ASSERTION-UNDER-CONSIDERATION-FOR-ASSERTED-MORE-SPECIFICALLY*");







    private static final SubLSymbol $sym4$_COL = makeSymbol("?COL");





    private static final SubLList $list7 = list(makeSymbol("?COL"));





    private static final SubLString $str11$Inconsistent_operators__s_and__s = makeString("Inconsistent operators ~s and ~s");

    static private final SubLList $list12 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));





    private static final SubLList $list15 = list(reader_make_constant_shell("genls"), TWO_INTEGER);







    static private final SubLList $list27 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLList $list28 = list(list(ZERO_INTEGER, makeKeyword("TVA")), reader_make_constant_shell("genlPreds"));

    static private final SubLList $list29 = cons(list(makeSymbol("ARGNUM"), makeSymbol("TVA-TYPE")), makeSymbol("TVA-PREDS"));

    private static final SubLList $list30 = list(reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"));

    private static final SubLSymbol NON_TVA_GAF_ASSERTION_P = makeSymbol("NON-TVA-GAF-ASSERTION-P");

    private static final SubLString $str35$More_than_one_assertion_in_justif = makeString("More than one assertion in justification of ~S");





    private static final SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("isa"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$isa #$genls #$Predicate)) \nfrom the asserted sentence in the KB (#isa #$genls #$VocabularyDefiningPredicate) ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG");

    private static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("isa"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$isa #$genls #$VocabularyDefiningPredicate))) ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("genls"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>)) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$Individual)) \nfrom the asserted sentence in the KB (#genls #$BinaryPredicate #$Predicate) ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG");

    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("genls"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>))) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$BinaryRelation))) ") });

    private static final SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS");

    private static final SubLList $list47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), cons(list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), reader_make_constant_shell("isa")), list(makeKeyword("NOT"), reader_make_constant_shell("genls"))), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (<pred> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), cons(list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), reader_make_constant_shell("isa")), list(makeKeyword("NOT"), reader_make_constant_shell("genls"))), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (<pred> . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("") });



    private static final SubLSymbol $REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("strongestAssertedSentence"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("strongestAssertedSentence"), list(makeKeyword("OR"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(reader_make_constant_shell("not"), cons(list($TEST, makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), $COST, makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$strongestAssertedSentence (<predicate> <anything>))"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST = makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST");

    private static final SubLList $list54 = list(makeSymbol("BINDINGS"), makeSymbol("GAF"));

    private static final SubLSymbol REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND = makeSymbol("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND");

    // Definitions
    public static final SubLObject removal_asserted_more_specifically_check_pos_internals_alt(SubLObject operator, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject more_specific_assertions = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_more_specific_asserted_assertions(operator, asent);
                SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject assertion = NIL;
                    SubLObject assertion_1 = NIL;
                    SubLObject supports = NIL;
                    SubLObject supports_2 = NIL;
                    for (assertion = more_specific_assertions, assertion_1 = assertion.first(), supports = more_supports, supports_2 = supports.first(); !((NIL == supports) && (NIL == assertion)); assertion = assertion.rest() , assertion_1 = assertion.first() , supports = supports.rest() , supports_2 = supports.first()) {
                        backward.removal_add_node(assertion_1, NIL, supports_2);
                    }
                }
            }
            return NIL;
        }
    }

    // Definitions
    public static SubLObject removal_asserted_more_specifically_check_pos_internals(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_specific_assertions = removal_more_specific_asserted_assertions(operator, asent);
        final SubLObject more_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject assertion = NIL;
        SubLObject assertion_$1 = NIL;
        SubLObject supports = NIL;
        SubLObject supports_$2 = NIL;
        assertion = more_specific_assertions;
        assertion_$1 = assertion.first();
        supports = more_supports;
        supports_$2 = supports.first();
        while ((NIL != supports) || (NIL != assertion)) {
            backward.removal_add_node(assertion_$1, NIL, supports_$2);
            assertion = assertion.rest();
            assertion_$1 = assertion.first();
            supports = supports.rest();
            supports_$2 = supports.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_asserted_more_specifically_check_neg_internals(SubLObject operator, SubLObject asent) {
        {
            SubLObject more_specific_assertions = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_more_specific_asserted_assertions(operator, asent);
            SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED);
            SubLObject support = list($$not, list($$thereExists, $sym2$_COL, list($$and, list($$assertedSentence, listS(operator, v_term, $list_alt5)), list($$different, $sym2$_COL, collection), list($$genls, $sym2$_COL, collection))));
            if (NIL == more_specific_assertions) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, support, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_asserted_more_specifically_check_neg_internals(final SubLObject operator, final SubLObject asent, SubLObject v_bindings, SubLObject more_supports) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (more_supports == UNPROVIDED) {
            more_supports = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject more_specific_assertions = removal_more_specific_asserted_assertions(operator, asent);
        final SubLObject yet_more_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        more_supports = append(more_supports, yet_more_supports);
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED);
        final SubLObject support = (NIL != transitive_via_genls_in_arg2P(operator)) ? list($$not, list($$thereExists, $sym4$_COL, list($$and, list($$assertedSentence, listS(operator, v_term, $list7)), list($$different, $sym4$_COL, collection), list($$genls, $sym4$_COL, collection)))) : asent;
        if (NIL == more_specific_assertions) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, support, UNPROVIDED, UNPROVIDED), v_bindings, more_supports);
        }
        return NIL;
    }

    public static final SubLObject removal_more_specific_asserted_assertions_alt(SubLObject operator, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (operator != cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))) {
                    Errors.error($str_alt9$Inconsistent_operators__s_and__s, operator, cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)));
                }
            }
            {
                SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertions(sentence);
            }
        }
    }

    public static SubLObject removal_more_specific_asserted_assertions(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!operator.eql(cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED))))) {
            Errors.error($str11$Inconsistent_operators__s_and__s, operator, cycl_utilities.sentence_truth_function(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)));
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject more_specific_assertions = NIL;
        SubLObject more_supports = NIL;
        thread.resetMultipleValues();
        final SubLObject more_specific_assertions_raw = more_specific_asserted_assertions(sentence);
        final SubLObject more_supports_raw = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject more_specific_assertion = NIL;
        SubLObject more_specific_assertion_$3 = NIL;
        SubLObject more_support = NIL;
        SubLObject more_support_$4 = NIL;
        more_specific_assertion = more_specific_assertions_raw;
        more_specific_assertion_$3 = more_specific_assertion.first();
        more_support = more_supports_raw;
        more_support_$4 = more_support.first();
        while ((NIL != more_support) || (NIL != more_specific_assertion)) {
            if (NIL == kb_utilities.kbeq(more_specific_assertion_$3, $assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread))) {
                more_specific_assertions = cons(more_specific_assertion_$3, more_specific_assertions);
                more_supports = cons(more_support_$4, more_supports);
            }
            more_specific_assertion = more_specific_assertion.rest();
            more_specific_assertion_$3 = more_specific_assertion.first();
            more_support = more_support.rest();
            more_support_$4 = more_support.first();
        } 
        return values(more_specific_assertions, more_supports);
    }

    /**
     *
     *
     * @return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.
     */
    @LispMethod(comment = "@return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.")
    public static final SubLObject more_specific_asserted_assertions_alt(SubLObject asent) {
        {
            SubLObject operator = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != list_utilities.member_eqP(operator, $list_alt10)) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertions_for_isa_genls(operator, asent);
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.transitive_via_genls_in_arg2P(operator)) {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertions_for_isa_genls(operator, asent);
                } else {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertions_for_other_pred(operator, asent);
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.
     */
    @LispMethod(comment = "@return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.")
    public static SubLObject more_specific_asserted_assertions(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != subl_promotions.memberP(operator, $list12, UNPROVIDED, UNPROVIDED)) {
            return more_specific_asserted_assertions_for_isa_genls(operator, asent);
        }
        if (NIL != transitive_via_genls_in_arg2P(operator)) {
            return more_specific_asserted_assertions_for_isa_genls(operator, asent);
        }
        if (((NIL != $use_asserted_more_specifically_via_tva_supportP$.getDynamicValue(thread)) && (NIL == kb_utilities.kbeq(operator, $$not))) && (NIL == isa.isa_in_any_mtP(operator, $$WFFConstraintPredicate))) {
            return more_specific_asserted_assertions_for_other_pred_via_tva(operator, asent);
        }
        return more_specific_asserted_assertions_for_other_pred(operator, asent);
    }

    public static final SubLObject transitive_via_genls_in_arg2P_alt(SubLObject pred) {
        return kb_mapping_utilities.tuple_holds(listS($$transitiveViaArg, pred, $list_alt12), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transitive_via_genls_in_arg2P(final SubLObject pred) {
        return kb_mapping_utilities.tuple_holds(listS($$transitiveViaArg, pred, $list15), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.
     * @unknown this function works for anything transitive via genls in arg2, not just #$isa and #$genls.
     */
    @LispMethod(comment = "@return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.\r\n@unknown this function works for anything transitive via genls in arg2, not just #$isa and #$genls.")
    public static final SubLObject more_specific_asserted_assertions_for_isa_genls_alt(SubLObject operator, SubLObject asent) {
        {
            SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject more_specific_assertions = NIL;
            SubLObject more_supports = NIL;
            SubLObject pred_var = operator;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
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
                                            SubLObject done_var_3 = NIL;
                                            SubLObject token_var_4 = NIL;
                                            while (NIL == done_var_3) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                    SubLObject valid_5 = makeBoolean(token_var_4 != assertion);
                                                    if (NIL != valid_5) {
                                                        {
                                                            SubLObject asserted_collection = assertions_high.gaf_arg2(assertion);
                                                            if (asserted_collection.equal(collection)) {
                                                                {
                                                                    SubLObject mt = assertions_high.assertion_mt(assertion);
                                                                    if (NIL != genl_mts.proper_genl_mtP(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertion_asent_mt(), mt, UNPROVIDED, UNPROVIDED)) {
                                                                        {
                                                                            SubLObject support = arguments.make_hl_support($GENLMT, list($$genlMt, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertion_asent_mt(), mt), UNPROVIDED, UNPROVIDED);
                                                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                            more_supports = cons(list(support), more_supports);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (NIL != genls.genlsP(asserted_collection, collection, UNPROVIDED, UNPROVIDED)) {
                                                                    {
                                                                        SubLObject support = arguments.make_hl_support($GENLS, list($$genls, asserted_collection, collection), UNPROVIDED, UNPROVIDED);
                                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                        more_supports = cons(list(support), more_supports);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var_3 = makeBoolean(NIL == valid_5);
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
            return more_specific_assertions;
        }
    }

    /**
     *
     *
     * @return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.
     * @unknown this function works for anything transitive via genls in arg2, not just #$isa and #$genls.
     */
    @LispMethod(comment = "@return listp; a list of asserted assertions in relevant mts which are more specific than ASENT.\r\n@unknown this function works for anything transitive via genls in arg2, not just #$isa and #$genls.")
    public static SubLObject more_specific_asserted_assertions_for_isa_genls(final SubLObject operator, final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject more_specific_assertions = NIL;
        SubLObject more_supports = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, operator)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, operator);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$5 = NIL;
                        final SubLObject token_var_$6 = NIL;
                        while (NIL == done_var_$5) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                            if (NIL != valid_$7) {
                                final SubLObject asserted_collection = assertions_high.gaf_arg2(assertion);
                                if (asserted_collection.equal(collection)) {
                                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                                    if (NIL != genl_mts.proper_genl_mtP(more_specific_asserted_assertion_asent_mt(), mt, UNPROVIDED, UNPROVIDED)) {
                                        final SubLObject support = arguments.make_hl_support($GENLMT, list($$genlMt, more_specific_asserted_assertion_asent_mt(), mt), UNPROVIDED, UNPROVIDED);
                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                        more_supports = cons(support, more_supports);
                                    } else
                                        if (NIL != within_assertive_wff_forward_inferenceP()) {
                                            SubLObject stronger_argumentP = NIL;
                                            if (NIL == stronger_argumentP) {
                                                SubLObject csome_list_var = assertions_high.assertion_arguments(assertion);
                                                SubLObject argument = NIL;
                                                argument = csome_list_var.first();
                                                while ((NIL == stronger_argumentP) && (NIL != csome_list_var)) {
                                                    if (NIL != arguments.asserted_argument_p(argument)) {
                                                        stronger_argumentP = T;
                                                    } else
                                                        if (NIL == wff.assertive_wff_deductionP(argument)) {
                                                            stronger_argumentP = T;
                                                        }

                                                    csome_list_var = csome_list_var.rest();
                                                    argument = csome_list_var.first();
                                                } 
                                            }
                                            if (NIL != stronger_argumentP) {
                                                more_specific_assertions = cons(assertion, more_specific_assertions);
                                            }
                                        }

                                } else
                                    if (NIL != genls.genlsP(asserted_collection, collection, UNPROVIDED, UNPROVIDED)) {
                                        final SubLObject support2 = arguments.make_hl_support($GENLS, list($$genls, asserted_collection, collection), UNPROVIDED, UNPROVIDED);
                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                        more_supports = cons(support2, more_supports);
                                    }

                            }
                            done_var_$5 = makeBoolean(NIL == valid_$7);
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
        return values(more_specific_assertions, more_supports);
    }

    public static final SubLObject more_specific_asserted_assertions_for_other_pred_alt(SubLObject operator, SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject rargs = reverse(args);
                SubLObject base_mt = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.more_specific_asserted_assertion_asent_mt();
                SubLObject more_specific_assertions = NIL;
                SubLObject more_supports = NIL;
                if (NIL != forts.fort_p(args.first())) {
                    {
                        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                        try {
                            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                            pred_relevance_macros.$pred$.bind(operator, thread);
                            {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), ONE_INTEGER, pred_var);
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
                                                                SubLObject done_var_6 = NIL;
                                                                SubLObject token_var_7 = NIL;
                                                                while (NIL == done_var_6) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                        SubLObject valid_8 = makeBoolean(token_var_7 != assertion);
                                                                        if (NIL != valid_8) {
                                                                            if (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? ((SubLObject) (equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs))) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                                                                {
                                                                                    SubLObject pred = assertions_high.gaf_arg0(assertion);
                                                                                    SubLObject mt = assertions_high.assertion_mt(assertion);
                                                                                    if (!pred.equal(operator)) {
                                                                                        {
                                                                                            SubLObject support = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? ((SubLObject) (arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, operator), UNPROVIDED, UNPROVIDED))) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, operator), UNPROVIDED, UNPROVIDED);
                                                                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                            more_supports = cons(list(support), more_supports);
                                                                                        }
                                                                                    }
                                                                                    if (NIL != genl_mts.proper_genl_mtP(base_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject support = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt), UNPROVIDED, UNPROVIDED);
                                                                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                            more_supports = cons(list(support), more_supports);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_6 = makeBoolean(NIL == valid_8);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
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
                        } finally {
                            pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != kb_gp_mapping.dgaigp_binaryP(operator)) {
                        {
                            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
                            try {
                                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                                pred_relevance_macros.$pred$.bind(operator, thread);
                                {
                                    SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), arity.binary_arg_swap(ONE_INTEGER), pred_var);
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
                                                                    SubLObject done_var_10 = NIL;
                                                                    SubLObject token_var_11 = NIL;
                                                                    while (NIL == done_var_10) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                                                            SubLObject valid_12 = makeBoolean(token_var_11 != assertion);
                                                                            if (NIL != valid_12) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_13 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                                                    try {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                                                        if (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? ((SubLObject) (equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs))) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                                                                            {
                                                                                                SubLObject pred = assertions_high.gaf_arg0(assertion);
                                                                                                SubLObject mt = assertions_high.assertion_mt(assertion);
                                                                                                if (!pred.equal(operator)) {
                                                                                                    {
                                                                                                        SubLObject support = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? ((SubLObject) (arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, operator), UNPROVIDED, UNPROVIDED))) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, operator), UNPROVIDED, UNPROVIDED);
                                                                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                                        more_supports = cons(list(support), more_supports);
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != genl_mts.proper_genl_mtP(base_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject support = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt), UNPROVIDED, UNPROVIDED);
                                                                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                                        more_supports = cons(list(support), more_supports);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_13, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_10 = makeBoolean(NIL == valid_12);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
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
                            } finally {
                                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = genl_predicates.all_spec_preds(operator, UNPROVIDED, UNPROVIDED);
                        SubLObject spec_pred = NIL;
                        for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                            {
                                SubLObject pred_var = spec_pred;
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
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_15 = NIL;
                                                                SubLObject token_var_16 = NIL;
                                                                while (NIL == done_var_15) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
                                                                        SubLObject valid_17 = makeBoolean(token_var_16 != assertion);
                                                                        if (NIL != valid_17) {
                                                                            if (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? ((SubLObject) (equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs))) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                                                                {
                                                                                    SubLObject pred = assertions_high.gaf_arg0(assertion);
                                                                                    SubLObject mt = assertions_high.assertion_mt(assertion);
                                                                                    if (!pred.equal(operator)) {
                                                                                        {
                                                                                            SubLObject support = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? ((SubLObject) (arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, operator), UNPROVIDED, UNPROVIDED))) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, operator), UNPROVIDED, UNPROVIDED);
                                                                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                            more_supports = cons(list(support), more_supports);
                                                                                        }
                                                                                    }
                                                                                    if (NIL != genl_mts.proper_genl_mtP(base_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject support = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt), UNPROVIDED, UNPROVIDED);
                                                                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                            more_supports = cons(list(support), more_supports);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_15 = makeBoolean(NIL == valid_17);
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
                    if (NIL != arity.binaryP(operator)) {
                        {
                            SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                            try {
                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject cdolist_list_var = genl_predicates.all_spec_inverses(operator, UNPROVIDED, UNPROVIDED);
                                    SubLObject spec_pred = NIL;
                                    for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                                        {
                                            SubLObject pred_var = spec_pred;
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
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                        {
                                                                            SubLObject done_var_18 = NIL;
                                                                            SubLObject token_var_19 = NIL;
                                                                            while (NIL == done_var_18) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                                    SubLObject valid_20 = makeBoolean(token_var_19 != assertion);
                                                                                    if (NIL != valid_20) {
                                                                                        if (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? ((SubLObject) (equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs))) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                                                                            {
                                                                                                SubLObject pred = assertions_high.gaf_arg0(assertion);
                                                                                                SubLObject mt = assertions_high.assertion_mt(assertion);
                                                                                                if (!pred.equal(operator)) {
                                                                                                    {
                                                                                                        SubLObject support = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? ((SubLObject) (arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, operator), UNPROVIDED, UNPROVIDED))) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, operator), UNPROVIDED, UNPROVIDED);
                                                                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                                        more_supports = cons(list(support), more_supports);
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != genl_mts.proper_genl_mtP(base_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject support = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt), UNPROVIDED, UNPROVIDED);
                                                                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                                                                        more_supports = cons(list(support), more_supports);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_18 = makeBoolean(NIL == valid_20);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
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
                            } finally {
                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(more_specific_assertions, more_supports);
            }
        }
    }

    public static SubLObject more_specific_asserted_assertions_for_other_pred(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        final SubLObject rargs = reverse(args);
        final SubLObject base_mt = more_specific_asserted_assertion_asent_mt();
        SubLObject more_specific_assertions = NIL;
        SubLObject more_supports = NIL;
        if (NIL != forts.fort_p(args.first())) {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(operator, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$8 = NIL;
                                final SubLObject token_var_$9 = NIL;
                                while (NIL == done_var_$8) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                    final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(assertion));
                                    if ((NIL != valid_$10) && (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args)))) {
                                        final SubLObject pred = assertions_high.gaf_arg0(assertion);
                                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                                        if (!pred.equal(operator)) {
                                            final SubLObject support = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred, operator), UNPROVIDED, UNPROVIDED) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred, operator), UNPROVIDED, UNPROVIDED);
                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                            more_supports = cons(support, more_supports);
                                        }
                                        if (NIL != genl_mts.proper_genl_mtP(base_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject support = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt), UNPROVIDED, UNPROVIDED);
                                            more_specific_assertions = cons(assertion, more_specific_assertions);
                                            more_supports = cons(support, more_supports);
                                        }
                                    }
                                    done_var_$8 = makeBoolean(NIL == valid_$10);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != kb_gp_mapping.dgaigp_binaryP(operator)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(operator, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(args.first(), arity.binary_arg_swap(ONE_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(args.first(), arity.binary_arg_swap(ONE_INTEGER), pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$9 = NIL;
                                    final SubLObject token_var_$10 = NIL;
                                    while (NIL == done_var_$9) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                        final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                                        if (NIL != valid_$11) {
                                            final SubLObject _prev_bind_0_$12 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), rargs) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion), UNPROVIDED), args))) {
                                                    final SubLObject pred2 = assertions_high.gaf_arg0(assertion);
                                                    final SubLObject mt2 = assertions_high.assertion_mt(assertion);
                                                    if (!pred2.equal(operator)) {
                                                        final SubLObject support2 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred2, operator), UNPROVIDED, UNPROVIDED) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred2, operator), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                        more_supports = cons(support2, more_supports);
                                                    }
                                                    if (NIL != genl_mts.proper_genl_mtP(base_mt, mt2, UNPROVIDED, UNPROVIDED)) {
                                                        final SubLObject support2 = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt2), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion, more_specific_assertions);
                                                        more_supports = cons(support2, more_supports);
                                                    }
                                                }
                                            } finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                        done_var_$9 = makeBoolean(NIL == valid_$11);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds(operator, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = spec_pred;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$10 = NIL;
                                    final SubLObject token_var_$11 = NIL;
                                    while (NIL == done_var_$10) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$11);
                                        final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion2));
                                        if ((NIL != valid_$12) && (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion2), UNPROVIDED), rargs) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion2), UNPROVIDED), args)))) {
                                            final SubLObject pred3 = assertions_high.gaf_arg0(assertion2);
                                            final SubLObject mt3 = assertions_high.assertion_mt(assertion2);
                                            if (!pred3.equal(operator)) {
                                                final SubLObject support3 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred3, operator), UNPROVIDED, UNPROVIDED) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred3, operator), UNPROVIDED, UNPROVIDED);
                                                more_specific_assertions = cons(assertion2, more_specific_assertions);
                                                more_supports = cons(support3, more_supports);
                                            }
                                            if (NIL != genl_mts.proper_genl_mtP(base_mt, mt3, UNPROVIDED, UNPROVIDED)) {
                                                final SubLObject support3 = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt3), UNPROVIDED, UNPROVIDED);
                                                more_specific_assertions = cons(assertion2, more_specific_assertions);
                                                more_supports = cons(support3, more_supports);
                                            }
                                        }
                                        done_var_$10 = makeBoolean(NIL == valid_$12);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_10, thread);
                        $is_noting_progressP$.rebind(_prev_bind_9, thread);
                        $progress_count$.rebind(_prev_bind_8, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_7, thread);
                        $progress_notification_count$.rebind(_prev_bind_6, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_5, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_4, thread);
                        $progress_start_time$.rebind(_prev_bind_3, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
            if (NIL != arity.binaryP(operator)) {
                final SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                try {
                    kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var2 = genl_predicates.all_spec_inverses(operator, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_pred2 = NIL;
                    spec_pred2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject pred_var2 = spec_pred2;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            final SubLObject str2 = NIL;
                            final SubLObject _prev_bind_0_$15 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_11 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_12 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_13 = $progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_14 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_15 = $progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_16 = $is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_17 = $silent_progressP$.currentBinding(thread);
                            try {
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                $progress_count$.bind(ZERO_INTEGER, thread);
                                $is_noting_progressP$.bind(T, thread);
                                $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                noting_progress_preamble(str2);
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
                                            final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$11 = NIL;
                                            final SubLObject token_var_$12 = NIL;
                                            while (NIL == done_var_$11) {
                                                final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$12);
                                                final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(assertion3));
                                                if ((NIL != valid_$13) && (NIL != (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread) ? equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion3), UNPROVIDED), rargs) : equal(cycl_utilities.formula_args(assertions_high.assertion_formula(assertion3), UNPROVIDED), args)))) {
                                                    final SubLObject pred4 = assertions_high.gaf_arg0(assertion3);
                                                    final SubLObject mt4 = assertions_high.assertion_mt(assertion3);
                                                    if (!pred4.equal(operator)) {
                                                        final SubLObject support4 = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arguments.make_hl_support($GENLPREDS, list($$genlInverse, pred4, operator), UNPROVIDED, UNPROVIDED) : arguments.make_hl_support($GENLPREDS, list($$genlPreds, pred4, operator), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion3, more_specific_assertions);
                                                        more_supports = cons(support4, more_supports);
                                                    }
                                                    if (NIL != genl_mts.proper_genl_mtP(base_mt, mt4, UNPROVIDED, UNPROVIDED)) {
                                                        final SubLObject support4 = arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, base_mt, mt4), UNPROVIDED, UNPROVIDED);
                                                        more_specific_assertions = cons(assertion3, more_specific_assertions);
                                                        more_supports = cons(support4, more_supports);
                                                    }
                                                }
                                                done_var_$11 = makeBoolean(NIL == valid_$13);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values4 = getValuesAsVector();
                                                if (NIL != final_index_iterator3) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                                }
                                                restoreValuesFromVector(_values4);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    }
                                    done_var3 = makeBoolean(NIL == valid3);
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_17, thread);
                                $is_noting_progressP$.rebind(_prev_bind_16, thread);
                                $progress_count$.rebind(_prev_bind_15, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_14, thread);
                                $progress_notification_count$.rebind(_prev_bind_13, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_12, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_11, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        spec_pred2 = cdolist_list_var2.first();
                    } 
                } finally {
                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return values(more_specific_assertions, more_supports);
    }

    static private final SubLSymbol $sym2$_COL = makeSymbol("?COL");

    static private final SubLList $list_alt5 = list(makeSymbol("?COL"));

    static private final SubLString $str_alt9$Inconsistent_operators__s_and__s = makeString("Inconsistent operators ~s and ~s");

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("genls"), TWO_INTEGER);

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("isa"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$isa #$genls #$Predicate)) \nfrom the asserted sentence in the KB (#isa #$genls #$VocabularyDefiningPredicate) ") });

    public static final SubLObject more_specific_asserted_assertion_asent_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject forward_inference_assertion = forward.current_forward_inference_assertion();
                return NIL != forward_inference_assertion ? ((SubLObject) (assertions_high.assertion_mt(forward_inference_assertion))) : mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
        }
    }

    public static SubLObject more_specific_asserted_assertion_asent_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != assertion_handles.assertion_p($assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread))) && (NIL != genl_mts.genl_mtP(mt_relevance_macros.$mt$.getDynamicValue(thread), assertions_high.assertion_mt($assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED))) {
            return assertions_high.assertion_mt($assertion_under_consideration_for_asserted_more_specifically$.getDynamicValue(thread));
        }
        if (NIL != assertion_handles.assertion_p(forward.current_forward_inference_assertion())) {
            return assertions_high.assertion_mt(forward.current_forward_inference_assertion());
        }
        return mt_relevance_macros.$mt$.getDynamicValue(thread);
    }

    public static SubLObject within_assertive_wff_forward_inferenceP() {
        return wff.assertive_wff_ruleP(forward.current_forward_inference_rule());
    }

    static private final SubLList $list_alt27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("isa"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$isa #$genls #$VocabularyDefiningPredicate))) ") });

    public static SubLObject more_specific_asserted_assertions_for_other_pred_via_tva(final SubLObject operator, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tva_pred_signature = tva_utilities.tva_pred_signature(operator);
        SubLObject more_specific_asents = NIL;
        SubLObject more_supports = NIL;
        SubLObject doneP = NIL;
        final SubLObject negatedP = cycl_utilities.negatedP(asent);
        final SubLObject truth = (NIL != negatedP) ? $FALSE : $TRUE;
        final SubLObject real_asent = (NIL != negatedP) ? cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED) : asent;
        if (NIL == backward.removal_ask_justifications(real_asent, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, $list27)) {
            return values(NIL, NIL);
        }
        if (NIL == mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl(asent, UNPROVIDED);
            SubLObject more_specific_assertion = NIL;
            more_specific_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == equals.equalsP(assertions_high.assertion_mt(more_specific_assertion), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    return values(list(more_specific_assertion), list(arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, mt_relevance_macros.$mt$.getDynamicValue(thread), assertions_high.assertion_mt(more_specific_assertion)), UNPROVIDED, UNPROVIDED)));
                }
                cdolist_list_var = cdolist_list_var.rest();
                more_specific_assertion = cdolist_list_var.first();
            } 
        }
        tva_pred_signature = cons($list28, tva_pred_signature);
        if (NIL == doneP) {
            SubLObject csome_list_var = tva_pred_signature;
            SubLObject tva_arg_position_preds_tuple = NIL;
            tva_arg_position_preds_tuple = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = tva_arg_position_preds_tuple;
                destructuring_bind_must_consp(current, datum, $list29);
                final SubLObject temp = current.rest();
                current = current.first();
                SubLObject argnum = NIL;
                SubLObject tva_type = NIL;
                destructuring_bind_must_consp(current, datum, $list29);
                argnum = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list29);
                tva_type = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject tva_preds;
                    current = tva_preds = temp;
                    final SubLObject v_term = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
                    if ((NIL == list_utilities.member_kbeqP(v_term, $list30)) && (NIL == doneP)) {
                        SubLObject csome_list_var_$26 = tva_preds;
                        SubLObject tva_pred = NIL;
                        tva_pred = csome_list_var_$26.first();
                        while ((NIL == doneP) && (NIL != csome_list_var_$26)) {
                            SubLObject more_specific_terms = NIL;
                            SubLObject more_specific_supports = NIL;
                            final SubLObject pcase_var = tva_type;
                            if (pcase_var.eql($TVA)) {
                                thread.resetMultipleValues();
                                final SubLObject more_specific_terms_$27 = ghl_search_methods.ghl_max_inferiors(v_term, tva_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject more_specific_supports_$28 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                more_specific_terms = more_specific_terms_$27;
                                more_specific_supports = more_specific_supports_$28;
                            } else
                                if (pcase_var.eql($TVAI)) {
                                    thread.resetMultipleValues();
                                    final SubLObject more_specific_terms_$28 = ghl_search_methods.ghl_min_superiors(v_term, tva_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject more_specific_supports_$29 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    more_specific_terms = more_specific_terms_$28;
                                    more_specific_supports = more_specific_supports_$29;
                                }

                            if (NIL == doneP) {
                                SubLObject more_specific_term = NIL;
                                SubLObject more_specific_term_$31 = NIL;
                                SubLObject more_specific_support = NIL;
                                SubLObject more_specific_support_$32 = NIL;
                                more_specific_term = more_specific_terms;
                                more_specific_term_$31 = more_specific_term.first();
                                more_specific_support = more_specific_supports;
                                more_specific_support_$32 = more_specific_support.first();
                                while ((NIL == doneP) && ((NIL != more_specific_support) || (NIL != more_specific_term))) {
                                    final SubLObject more_specific_asent = replace_formula_arg(argnum, more_specific_term_$31, asent);
                                    SubLObject tva_supports = backward.removal_ask_justifications(more_specific_asent, mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE, $list27).first();
                                    if (NIL != tva_supports) {
                                        if (((NIL != list_utilities.singletonP(tva_supports)) && (NIL != arguments.hl_support_p(tva_supports.first()))) && ($TVA == arguments.hl_support_module(tva_supports.first()))) {
                                            tva_supports = hl_supports.hl_justify(tva_supports.first());
                                        }
                                        final SubLObject tva_support_assertions = list_utilities.find_all_if(NON_TVA_GAF_ASSERTION_P, tva_supports, UNPROVIDED);
                                        if (NIL != list_utilities.singletonP(tva_support_assertions)) {
                                            more_specific_asents = cons(tva_support_assertions.first(), more_specific_asents);
                                        } else
                                            if (NIL == tva_support_assertions) {
                                                more_specific_asents = cons(arguments.make_hl_support($QUERY, more_specific_asent, UNPROVIDED, UNPROVIDED), more_specific_asents);
                                            } else {
                                                Errors.warn($str35$More_than_one_assertion_in_justif, more_specific_asent);
                                                more_specific_asents = cons(tva_support_assertions.first(), more_specific_asents);
                                            }

                                        SubLObject supports = tva_supports;
                                        if (NIL != arguments.support_p(more_specific_support_$32)) {
                                            supports = cons(more_specific_support_$32, supports);
                                        }
                                        final SubLObject tva_sentence = arguments.make_hl_support($QUERY, list(tva_type == $TVA ? $$transitiveViaArg : $$transitiveViaArgInverse, operator, tva_pred, argnum), UNPROVIDED, UNPROVIDED);
                                        supports = cons(tva_sentence, supports);
                                        more_supports = cons(supports, more_supports);
                                        doneP = T;
                                    }
                                    more_specific_term = more_specific_term.rest();
                                    more_specific_term_$31 = more_specific_term.first();
                                    more_specific_support = more_specific_support.rest();
                                    more_specific_support_$32 = more_specific_support.first();
                                } 
                            }
                            csome_list_var_$26 = csome_list_var_$26.rest();
                            tva_pred = csome_list_var_$26.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list29);
                }
                csome_list_var = csome_list_var.rest();
                tva_arg_position_preds_tuple = csome_list_var.first();
            } 
        }
        return values(more_specific_asents, more_supports);
    }

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("genls"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>)) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$Individual)) \nfrom the asserted sentence in the KB (#genls #$BinaryPredicate #$Predicate) ") });

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), list(reader_make_constant_shell("genls"), $FORT, $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>))) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$BinaryRelation))) ") });

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertedMoreSpecifically"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertedMoreSpecifically"), cons(list(makeKeyword("AND"), $FORT, list(makeKeyword("NOT"), reader_make_constant_shell("isa")), list(makeKeyword("NOT"), reader_make_constant_shell("genls"))), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (<pred> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("") });

    public static SubLObject non_tva_gaf_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL == list_utilities.member_kbeqP(assertions_high.gaf_predicate(assertion), tva_utilities.get_tva_predicates())));
    }

    public static final SubLObject removal_asserted_more_specifically_isa_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_asserted_more_specifically_check_pos_internals($$isa, asent);
    }

    public static SubLObject removal_asserted_more_specifically_isa_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals($$isa, asent);
    }

    public static final SubLObject removal_asserted_more_specifically_isa_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_asserted_more_specifically_check_neg_internals($$isa, asent);
    }

    public static SubLObject removal_asserted_more_specifically_isa_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals($$isa, asent, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_asserted_more_specifically_genls_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_asserted_more_specifically_check_pos_internals($$genls, asent);
    }

    public static SubLObject removal_asserted_more_specifically_genls_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals($$genls, asent);
    }

    public static final SubLObject removal_asserted_more_specifically_genls_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_asserted_more_specifically_check_neg_internals($$genls, asent);
    }

    public static SubLObject removal_asserted_more_specifically_genls_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals($$genls, asent, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_asserted_more_specifically_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_more_specifically.removal_asserted_more_specifically_check_pos_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)), asent);
    }

    public static SubLObject removal_asserted_more_specifically_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_pos_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)), asent);
    }

    public static SubLObject removal_asserted_more_specifically_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_asserted_more_specifically_check_neg_internals(cycl_utilities.atomic_sentence_predicate(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)), asent, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_strongest_asserted_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_modules_asserted_formula.removal_asserted_sentence_lookup_pos_cost(asent, UNPROVIDED);
    }

    public static SubLObject removal_strongest_asserted_sentence_lookup_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = removal_modules_asserted_formula.removal_asserted_sentence_lookup_iterator(asent);
        if (NIL != iterator) {
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject tuple = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject v_bindings = NIL;
                    SubLObject gaf = NIL;
                    destructuring_bind_must_consp(current, datum, $list54);
                    v_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list54);
                    gaf = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject _prev_bind_0 = $assertion_under_consideration_for_asserted_more_specifically$.currentBinding(thread);
                        try {
                            $assertion_under_consideration_for_asserted_more_specifically$.bind(gaf, thread);
                            final SubLObject bound_asent = bindings.subst_bindings(v_bindings, asent);
                            final SubLObject inner_asent = cycl_utilities.atomic_sentence_arg1(bound_asent, UNPROVIDED);
                            final SubLObject operator = cycl_utilities.atomic_sentence_predicate(inner_asent);
                            removal_asserted_more_specifically_check_neg_internals(operator, bound_asent, v_bindings, list(gaf));
                        } finally {
                            $assertion_under_consideration_for_asserted_more_specifically$.rebind(_prev_bind_0, thread);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list54);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_removal_modules_asserted_more_specifically_file_alt() {
        declareFunction("removal_asserted_more_specifically_check_pos_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-INTERNALS", 2, 0, false);
        declareFunction("removal_asserted_more_specifically_check_neg_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-INTERNALS", 2, 0, false);
        declareFunction("removal_more_specific_asserted_assertions", "REMOVAL-MORE-SPECIFIC-ASSERTED-ASSERTIONS", 2, 0, false);
        declareFunction("more_specific_asserted_assertions", "MORE-SPECIFIC-ASSERTED-ASSERTIONS", 1, 0, false);
        declareFunction("transitive_via_genls_in_arg2P", "TRANSITIVE-VIA-GENLS-IN-ARG2?", 1, 0, false);
        declareFunction("more_specific_asserted_assertions_for_isa_genls", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-ISA-GENLS", 2, 0, false);
        declareFunction("more_specific_asserted_assertions_for_other_pred", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED", 2, 0, false);
        declareFunction("more_specific_asserted_assertion_asent_mt", "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT", 0, 0, false);
        declareFunction("removal_asserted_more_specifically_isa_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_isa_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_genls_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_genls_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_removal_modules_asserted_more_specifically_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("removal_asserted_more_specifically_check_pos_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-INTERNALS", 2, 0, false);
            declareFunction("removal_asserted_more_specifically_check_neg_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-INTERNALS", 2, 2, false);
            declareFunction("removal_more_specific_asserted_assertions", "REMOVAL-MORE-SPECIFIC-ASSERTED-ASSERTIONS", 2, 0, false);
            declareFunction("more_specific_asserted_assertions", "MORE-SPECIFIC-ASSERTED-ASSERTIONS", 1, 0, false);
            declareFunction("transitive_via_genls_in_arg2P", "TRANSITIVE-VIA-GENLS-IN-ARG2?", 1, 0, false);
            declareFunction("more_specific_asserted_assertions_for_isa_genls", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-ISA-GENLS", 2, 0, false);
            declareFunction("more_specific_asserted_assertions_for_other_pred", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED", 2, 0, false);
            declareFunction("more_specific_asserted_assertion_asent_mt", "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT", 0, 0, false);
            declareFunction("within_assertive_wff_forward_inferenceP", "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?", 0, 0, false);
            declareFunction("more_specific_asserted_assertions_for_other_pred_via_tva", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED-VIA-TVA", 2, 0, false);
            declareFunction("non_tva_gaf_assertion_p", "NON-TVA-GAF-ASSERTION-P", 1, 0, false);
            declareFunction("removal_asserted_more_specifically_isa_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND", 1, 1, false);
            declareFunction("removal_asserted_more_specifically_isa_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND", 1, 1, false);
            declareFunction("removal_asserted_more_specifically_genls_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND", 1, 1, false);
            declareFunction("removal_asserted_more_specifically_genls_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND", 1, 1, false);
            declareFunction("removal_asserted_more_specifically_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND", 1, 1, false);
            declareFunction("removal_asserted_more_specifically_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND", 1, 1, false);
            declareFunction("removal_strongest_asserted_sentence_lookup_pos_cost", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
            declareFunction("removal_strongest_asserted_sentence_lookup_pos_expand", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("removal_asserted_more_specifically_check_neg_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-INTERNALS", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_asserted_more_specifically_file_Previous() {
        declareFunction("removal_asserted_more_specifically_check_pos_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-INTERNALS", 2, 0, false);
        declareFunction("removal_asserted_more_specifically_check_neg_internals", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-INTERNALS", 2, 2, false);
        declareFunction("removal_more_specific_asserted_assertions", "REMOVAL-MORE-SPECIFIC-ASSERTED-ASSERTIONS", 2, 0, false);
        declareFunction("more_specific_asserted_assertions", "MORE-SPECIFIC-ASSERTED-ASSERTIONS", 1, 0, false);
        declareFunction("transitive_via_genls_in_arg2P", "TRANSITIVE-VIA-GENLS-IN-ARG2?", 1, 0, false);
        declareFunction("more_specific_asserted_assertions_for_isa_genls", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-ISA-GENLS", 2, 0, false);
        declareFunction("more_specific_asserted_assertions_for_other_pred", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED", 2, 0, false);
        declareFunction("more_specific_asserted_assertion_asent_mt", "MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT", 0, 0, false);
        declareFunction("within_assertive_wff_forward_inferenceP", "WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?", 0, 0, false);
        declareFunction("more_specific_asserted_assertions_for_other_pred_via_tva", "MORE-SPECIFIC-ASSERTED-ASSERTIONS-FOR-OTHER-PRED-VIA-TVA", 2, 0, false);
        declareFunction("non_tva_gaf_assertion_p", "NON-TVA-GAF-ASSERTION-P", 1, 0, false);
        declareFunction("removal_asserted_more_specifically_isa_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_isa_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_genls_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_genls_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_check_pos_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_asserted_more_specifically_check_neg_expand", "REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_strongest_asserted_sentence_lookup_pos_cost", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_strongest_asserted_sentence_lookup_pos_expand", "REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_asserted_more_specifically_file() {
        defparameter("*USE-ASSERTED-MORE-SPECIFICALLY-VIA-TVA-SUPPORT?*", T);
        defparameter("*ASSERTION-UNDER-CONSIDERATION-FOR-ASSERTED-MORE-SPECIFICALLY*", NIL);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_asserted_more_specifically_file_alt() {
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS, $list_alt25);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG, $list_alt27);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS, $list_alt29);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG, $list_alt31);
        inference_modules.register_solely_specific_removal_module_predicate($$assertedMoreSpecifically);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS, $list_alt34);
        return NIL;
    }

    public static SubLObject setup_removal_modules_asserted_more_specifically_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$assertedMoreSpecifically);
            preference_modules.doomed_unless_all_args_bindable($BOTH, $$assertedMoreSpecifically);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS, $list39);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG, $list41);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS, $list43);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG, $list45);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS, $list47);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG, $list49);
            inference_modules.register_solely_specific_removal_module_predicate($$strongestAssertedSentence);
            inference_modules.inference_removal_module($REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS, $list52);
            note_funcall_helper_function(REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST);
            note_funcall_helper_function(REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS, $list_alt25);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG, $list_alt27);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS, $list_alt29);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG, $list_alt31);
            inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS, $list_alt34);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_asserted_more_specifically_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertedMoreSpecifically);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$assertedMoreSpecifically);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_POS, $list39);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_ISA_CHECK_NEG, $list41);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_POS, $list43);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_GENLS_CHECK_NEG, $list45);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_POS, $list47);
        inference_modules.inference_removal_module($REMOVAL_ASSERTED_MORE_SPECIFICALLY_CHECK_NEG, $list49);
        inference_modules.register_solely_specific_removal_module_predicate($$strongestAssertedSentence);
        inference_modules.inference_removal_module($REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS, $list52);
        note_funcall_helper_function(REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_COST);
        note_funcall_helper_function(REMOVAL_STRONGEST_ASSERTED_SENTENCE_LOOKUP_POS_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_asserted_more_specifically_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_asserted_more_specifically_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_asserted_more_specifically_file();
    }

    static {
    }
}

/**
 * Total time: 662 ms
 */
